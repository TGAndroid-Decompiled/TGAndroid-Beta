package org.telegram.tgnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
        if (this.justCalc) {
            return this.len;
        }
        return this.isOut ? this.outbuf.size() : this.inbuf.available();
    }

    @Override
    public boolean readBool(boolean z10) {
        int int32 = readInt32(z10);
        if (int32 == -1720552011) {
            return true;
        }
        if (int32 == -1132882121) {
            return false;
        }
        if (z10) {
            throw new RuntimeException("Not bool value!");
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("Not bool value!");
        }
        return false;
    }

    @Override
    public byte readByte(boolean z10) {
        try {
            byte b10 = this.in.readByte();
            this.len++;
            return b10;
        } catch (Exception e9) {
            if (z10) {
                throw new RuntimeException("read byte error", e9);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return (byte) 0;
            }
            FileLog.e("read byte error");
            FileLog.e(e9);
            return (byte) 0;
        }
    }

    @Override
    public byte[] readByteArray(boolean z10) {
        int i10;
        try {
            int i11 = this.in.read();
            this.len++;
            if (i11 >= 254) {
                i11 = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (i11 > remaining() || i11 < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[i11];
            this.in.read(bArr);
            this.len++;
            while ((i11 + i10) % 4 != 0) {
                this.in.read();
                this.len++;
                i10++;
            }
            return bArr;
        } catch (Exception e9) {
            if (z10) {
                throw new RuntimeException("read byte array error", e9);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return null;
            }
            FileLog.e("read byte array error");
            FileLog.e(e9);
            return null;
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
        } catch (Exception e9) {
            if (z10) {
                throw new RuntimeException("read bytes error", e9);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("read bytes error");
                FileLog.e(e9);
            }
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
        } catch (Exception e9) {
            if (z10) {
                throw new RuntimeException("read double error", e9);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return 0.0d;
            }
            FileLog.e("read double error");
            FileLog.e(e9);
            return 0.0d;
        }
    }

    @Override
    public float readFloat(boolean z10) {
        try {
            return Float.intBitsToFloat(readInt32(z10));
        } catch (Exception e9) {
            if (z10) {
                throw new RuntimeException("read float error", e9);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return 0.0f;
            }
            FileLog.e("read float error");
            FileLog.e(e9);
            return 0.0f;
        }
    }

    @Override
    public int readInt32(boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            try {
                i10 |= this.in.read() << (i11 * 8);
                this.len++;
            } catch (Exception e9) {
                if (z10) {
                    throw new RuntimeException("read int32 error", e9);
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read int32 error");
                    FileLog.e(e9);
                }
                return 0;
            }
        }
        return i10;
    }

    @Override
    public long readInt64(boolean z10) {
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            try {
                j10 |= ((long) this.in.read()) << (i10 * 8);
                this.len++;
            } catch (Exception e9) {
                if (z10) {
                    throw new RuntimeException("read int64 error", e9);
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read int64 error");
                    FileLog.e(e9);
                }
                return 0L;
            }
        }
        return j10;
    }

    @Override
    public String readString(boolean z10) {
        int i10;
        try {
            int i11 = this.in.read();
            this.len++;
            if (i11 >= 254) {
                i11 = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (i11 > remaining() || i11 < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[i11];
            this.in.read(bArr);
            this.len++;
            while ((i11 + i10) % 4 != 0) {
                this.in.read();
                this.len++;
                i10++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e9) {
            if (z10) {
                throw new RuntimeException("read string error", e9);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return null;
            }
            FileLog.e("read string error");
            FileLog.e(e9);
            return null;
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
        if (i10 == 0) {
            return;
        }
        if (this.justCalc) {
            this.len += i10;
            return;
        }
        DataInputStream dataInputStream = this.in;
        if (dataInputStream != null) {
            try {
                dataInputStream.skipBytes(i10);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public byte[] toByteArray() {
        return this.outbuf.toByteArray();
    }

    @Override
    public void writeBool(boolean z10) {
        if (this.justCalc) {
            this.len += 4;
        } else if (z10) {
            writeInt32(-1720552011);
        } else {
            writeInt32(-1132882121);
        }
    }

    @Override
    public void writeByte(int i10) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.out.writeByte((byte) i10);
            }
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte error");
                FileLog.e(e9);
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
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e9);
            }
        }
    }

    @Override
    public void writeBytes(byte[] bArr) {
        try {
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.out.write(bArr);
            }
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
                FileLog.e(e9);
            }
        }
    }

    @Override
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write double error");
                FileLog.e(e9);
            }
        }
    }

    @Override
    public void writeFloat(float f10) {
        try {
            writeInt32(Float.floatToIntBits(f10));
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write float error");
                FileLog.e(e9);
            }
        }
    }

    @Override
    public void writeInt32(int i10) {
        if (this.justCalc) {
            this.len += 4;
        } else {
            writeInt32(i10, this.out);
        }
    }

    @Override
    public void writeInt64(long j10) {
        if (this.justCalc) {
            this.len += 8;
        } else {
            writeInt64(j10, this.out);
        }
    }

    @Override
    public void writeString(String str) {
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write string error");
                FileLog.e(e9);
            }
        }
    }

    private void writeInt32(int i10, DataOutputStream dataOutputStream) {
        for (int i11 = 0; i11 < 4; i11++) {
            try {
                dataOutputStream.write(i10 >> (i11 * 8));
            } catch (Exception e9) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("write int32 error");
                    FileLog.e(e9);
                    return;
                }
                return;
            }
        }
    }

    private void writeInt64(long j10, DataOutputStream dataOutputStream) {
        for (int i10 = 0; i10 < 8; i10++) {
            try {
                dataOutputStream.write((int) (j10 >> (i10 * 8)));
            } catch (Exception e9) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("write int64 error");
                    FileLog.e(e9);
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
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte error");
                FileLog.e(e9);
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
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write bytes error");
                FileLog.e(e9);
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
                if (!this.justCalc) {
                    this.out.write(i11);
                } else {
                    this.len++;
                }
            } else if (!this.justCalc) {
                this.out.write(254);
                this.out.write(i11);
                this.out.write(i11 >> 8);
                this.out.write(i11 >> 16);
            } else {
                this.len += 4;
            }
            if (!this.justCalc) {
                this.out.write(bArr, i10, i11);
            } else {
                this.len += i11;
            }
            for (int i12 = i11 <= 253 ? 1 : 4; (i11 + i12) % 4 != 0; i12++) {
                if (!this.justCalc) {
                    this.out.write(0);
                } else {
                    this.len++;
                }
            }
        } catch (Exception e9) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e9);
            }
        }
    }

    public SerializedData(InputStream inputStream) throws IOException {
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

    public SerializedData(File file) throws IOException {
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
