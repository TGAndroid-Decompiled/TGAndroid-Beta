package org.telegram.tgnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public class SerializedData extends AbstractSerializedData {
    private DataInputStream in;
    private ByteArrayInputStream inbuf;
    protected boolean isOut;
    private boolean justCalc;
    private int len;
    private DataOutputStream out;
    private ByteArrayOutputStream outbuf;

    public SerializedData() {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream();
        this.out = new DataOutputStream(this.outbuf);
    }

    public void cleanup() {
        try {
            ByteArrayInputStream byteArrayInputStream = this.inbuf;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                this.inbuf = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            DataInputStream dataInputStream = this.in;
            if (dataInputStream != null) {
                dataInputStream.close();
                this.in = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = this.outbuf;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
                this.outbuf = null;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            DataOutputStream dataOutputStream = this.out;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.out = null;
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
    }

    @Override
    public int getPosition() {
        return this.len;
    }

    @Override
    public int length() {
        if (!this.justCalc) {
            if (this.isOut) {
                return this.outbuf.size();
            }
            return this.inbuf.available();
        }
        return this.len;
    }

    @Override
    public boolean readBool(boolean z10) {
        int readInt32 = readInt32(z10);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 == -1132882121) {
            return false;
        }
        if (!z10) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Not bool value!");
            }
            return false;
        }
        throw new RuntimeException("Not bool value!");
    }

    @Override
    public byte readByte(boolean z10) {
        try {
            byte readByte = this.in.readByte();
            this.len++;
            return readByte;
        } catch (Exception e7) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read byte error");
                    FileLog.e(e7);
                    return (byte) 0;
                }
                return (byte) 0;
            }
            throw new RuntimeException("read byte error", e7);
        }
    }

    @Override
    public byte[] readByteArray(boolean z10) {
        int i10;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (read <= remaining() && read >= 0) {
                byte[] bArr = new byte[read];
                this.in.read(bArr);
                this.len++;
                while ((read + i10) % 4 != 0) {
                    this.in.read();
                    this.len++;
                    i10++;
                }
                return bArr;
            }
            throw new RuntimeException("byte array size too big");
        } catch (Exception e7) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read byte array error");
                    FileLog.e(e7);
                    return null;
                }
                return null;
            }
            throw new RuntimeException("read byte array error", e7);
        }
    }

    @Override
    public NativeByteBuffer readByteBuffer(boolean z10) {
        return null;
    }

    @Override
    public void readBytes(byte[] bArr, boolean z10) {
        try {
            this.in.read(bArr);
            this.len += bArr.length;
        } catch (Exception e7) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read bytes error");
                    FileLog.e(e7);
                    return;
                }
                return;
            }
            throw new RuntimeException("read bytes error", e7);
        }
    }

    @Override
    public byte[] readData(int i10, boolean z10) {
        byte[] bArr = new byte[i10];
        readBytes(bArr, z10);
        return bArr;
    }

    @Override
    public double readDouble(boolean z10) {
        try {
            return Double.longBitsToDouble(readInt64(z10));
        } catch (Exception e7) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read double error");
                    FileLog.e(e7);
                    return 0.0d;
                }
                return 0.0d;
            }
            throw new RuntimeException("read double error", e7);
        }
    }

    @Override
    public float readFloat(boolean z10) {
        try {
            return Float.intBitsToFloat(readInt32(z10));
        } catch (Exception e7) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read float error");
                    FileLog.e(e7);
                    return 0.0f;
                }
                return 0.0f;
            }
            throw new RuntimeException("read float error", e7);
        }
    }

    @Override
    public int readInt32(boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            try {
                i10 |= this.in.read() << (i11 * 8);
                this.len++;
            } catch (Exception e7) {
                if (!z10) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("read int32 error");
                        FileLog.e(e7);
                    }
                    return 0;
                }
                throw new RuntimeException("read int32 error", e7);
            }
        }
        return i10;
    }

    @Override
    public long readInt64(boolean z10) {
        long j3 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            try {
                j3 |= this.in.read() << (i10 * 8);
                this.len++;
            } catch (Exception e7) {
                if (!z10) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("read int64 error");
                        FileLog.e(e7);
                    }
                    return 0L;
                }
                throw new RuntimeException("read int64 error", e7);
            }
        }
        return j3;
    }

    @Override
    public String readString(boolean z10) {
        int i10;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (read <= remaining() && read >= 0) {
                byte[] bArr = new byte[read];
                this.in.read(bArr);
                this.len++;
                while ((read + i10) % 4 != 0) {
                    this.in.read();
                    this.len++;
                    i10++;
                }
                return new String(bArr, "UTF-8");
            }
            throw new RuntimeException("string size too big");
        } catch (Exception e7) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read string error");
                    FileLog.e(e7);
                    return null;
                }
                return null;
            }
            throw new RuntimeException("read string error", e7);
        }
    }

    @Override
    public int remaining() {
        try {
            return this.in.available();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    public void set(byte[] bArr) {
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
    }

    @Override
    public void skip(int i10) {
        if (i10 != 0) {
            if (!this.justCalc) {
                DataInputStream dataInputStream = this.in;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.skipBytes(i10);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            }
            this.len += i10;
        }
    }

    public byte[] toByteArray() {
        return this.outbuf.toByteArray();
    }

    @Override
    public void writeBool(boolean z10) {
        if (!this.justCalc) {
            if (z10) {
                writeInt32(-1720552011);
                return;
            } else {
                writeInt32(-1132882121);
                return;
            }
        }
        this.len += 4;
    }

    @Override
    public void writeByte(int i10) {
        try {
            if (!this.justCalc) {
                this.out.writeByte((byte) i10);
            } else {
                this.len++;
            }
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte error");
                FileLog.e(e7);
            }
        }
    }

    @Override
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr.length <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(bArr.length);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.out.write(254);
                this.out.write(bArr.length);
                this.out.write(bArr.length >> 8);
                this.out.write(bArr.length >> 16);
            }
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.out.write(bArr);
            }
            for (int i10 = bArr.length <= 253 ? 1 : 4; (bArr.length + i10) % 4 != 0; i10++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
                }
            }
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e7);
            }
        }
    }

    @Override
    public void writeBytes(byte[] bArr) {
        try {
            if (!this.justCalc) {
                this.out.write(bArr);
            } else {
                this.len += bArr.length;
            }
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
                FileLog.e(e7);
            }
        }
    }

    @Override
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write double error");
                FileLog.e(e7);
            }
        }
    }

    @Override
    public void writeFloat(float f7) {
        try {
            writeInt32(Float.floatToIntBits(f7));
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write float error");
                FileLog.e(e7);
            }
        }
    }

    @Override
    public void writeInt32(int i10) {
        if (!this.justCalc) {
            writeInt32(i10, this.out);
        } else {
            this.len += 4;
        }
    }

    @Override
    public void writeInt64(long j3) {
        if (!this.justCalc) {
            writeInt64(j3, this.out);
        } else {
            this.len += 8;
        }
    }

    @Override
    public void writeString(String str) {
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write string error");
                FileLog.e(e7);
            }
        }
    }

    private void writeInt32(int i10, DataOutputStream dataOutputStream) {
        for (int i11 = 0; i11 < 4; i11++) {
            try {
                dataOutputStream.write(i10 >> (i11 * 8));
            } catch (Exception e7) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("write int32 error");
                    FileLog.e(e7);
                    return;
                }
                return;
            }
        }
    }

    private void writeInt64(long j3, DataOutputStream dataOutputStream) {
        for (int i10 = 0; i10 < 8; i10++) {
            try {
                dataOutputStream.write((int) (j3 >> (i10 * 8)));
            } catch (Exception e7) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("write int64 error");
                    FileLog.e(e7);
                    return;
                }
                return;
            }
        }
    }

    public SerializedData(boolean z10) {
        this.isOut = true;
        this.justCalc = false;
        if (!z10) {
            this.outbuf = new ByteArrayOutputStream();
            this.out = new DataOutputStream(this.outbuf);
        }
        this.justCalc = z10;
        this.len = 0;
    }

    @Override
    public void writeByte(byte b10) {
        try {
            if (!this.justCalc) {
                this.out.writeByte(b10);
            } else {
                this.len++;
            }
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte error");
                FileLog.e(e7);
            }
        }
    }

    @Override
    public void writeBytes(byte[] bArr, int i10, int i11) {
        try {
            if (!this.justCalc) {
                this.out.write(bArr, i10, i11);
            } else {
                this.len += i11;
            }
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write bytes error");
                FileLog.e(e7);
            }
        }
    }

    public SerializedData(int i10) {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream(i10);
        this.out = new DataOutputStream(this.outbuf);
    }

    public SerializedData(byte[] bArr) {
        this.justCalc = false;
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
        this.len = 0;
    }

    @Override
    public void writeByteArray(byte[] bArr, int i10, int i11) {
        try {
            if (i11 <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(i11);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.out.write(254);
                this.out.write(i11);
                this.out.write(i11 >> 8);
                this.out.write(i11 >> 16);
            }
            if (this.justCalc) {
                this.len += i11;
            } else {
                this.out.write(bArr, i10, i11);
            }
            for (int i12 = i11 <= 253 ? 1 : 4; (i11 + i12) % 4 != 0; i12++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
                }
            }
        } catch (Exception e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e7);
            }
        }
    }

    public SerializedData(InputStream inputStream) {
        this.isOut = true;
        this.justCalc = false;
        byte[] bArr = new byte[inputStream.available()];
        new DataInputStream(inputStream).readFully(bArr);
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
    }

    @Override
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
    }

    public SerializedData(File file) {
        this.isOut = true;
        this.justCalc = false;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[(int) file.length()];
        new DataInputStream(fileInputStream).readFully(bArr);
        fileInputStream.close();
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
    }
}
