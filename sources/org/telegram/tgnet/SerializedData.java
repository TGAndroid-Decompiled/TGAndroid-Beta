package org.telegram.tgnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class SerializedData extends AbstractSerializedData {
    private DataInputStream in;
    private ByteArrayInputStream inbuf;
    protected boolean isOut;
    private boolean justCalc;
    private int len;
    private DataOutputStream out;
    private ByteArrayOutputStream outbuf;

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

    private void writeInt32(int i, DataOutputStream dataOutputStream) {
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                dataOutputStream.write(i >> (i2 << 3));
            } catch (Exception e) {
                if (w01.a) {
                    fa4.d("write int32 error");
                    fa4.g(e, true);
                    return;
                }
                return;
            }
        }
    }

    private void writeInt64(long j, DataOutputStream dataOutputStream) {
        for (int i = 0; i < 8; i++) {
            try {
                dataOutputStream.write((int) (j >> (i << 3)));
            } catch (Exception e) {
                if (w01.a) {
                    fa4.d("write int64 error");
                    fa4.g(e, true);
                    return;
                }
                return;
            }
        }
    }

    public void cleanup() {
        try {
            ByteArrayInputStream byteArrayInputStream = this.inbuf;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                this.inbuf = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            DataInputStream dataInputStream = this.in;
            if (dataInputStream != null) {
                dataInputStream.close();
                this.in = null;
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = this.outbuf;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
                this.outbuf = null;
            }
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        try {
            DataOutputStream dataOutputStream = this.out;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.out = null;
            }
        } catch (Exception e4) {
            fa4.g(e4, true);
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
    public boolean readBool(boolean z) {
        int readInt32 = readInt32(z);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 != -1132882121) {
            if (!z) {
                if (w01.a) {
                    fa4.d("Not bool value!");
                }
            } else {
                wn4.j("Not bool value!");
                return false;
            }
        }
        return false;
    }

    @Override
    public byte readByte(boolean z) {
        try {
            byte readByte = this.in.readByte();
            this.len++;
            return readByte;
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read byte error");
                    fa4.g(e, true);
                    return (byte) 0;
                }
                return (byte) 0;
            }
            fyb.j("read byte error", e);
            return (byte) 0;
        }
    }

    @Override
    public byte[] readByteArray(boolean z) {
        int i;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i = 4;
            } else {
                i = 1;
            }
            if (read <= remaining() && read >= 0) {
                byte[] bArr = new byte[read];
                this.in.read(bArr);
                this.len++;
                while ((read + i) % 4 != 0) {
                    this.in.read();
                    this.len++;
                    i++;
                }
                return bArr;
            }
            throw new RuntimeException("byte array size too big");
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read byte array error");
                    fa4.g(e, true);
                    return null;
                }
                return null;
            }
            fyb.j("read byte array error", e);
            return null;
        }
    }

    @Override
    public NativeByteBuffer readByteBuffer(boolean z) {
        return null;
    }

    @Override
    public void readBytes(byte[] bArr, boolean z) {
        try {
            this.in.read(bArr);
            this.len += bArr.length;
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read bytes error");
                    fa4.g(e, true);
                    return;
                }
                return;
            }
            fyb.j("read bytes error", e);
        }
    }

    @Override
    public byte[] readData(int i, boolean z) {
        byte[] bArr = new byte[i];
        readBytes(bArr, z);
        return bArr;
    }

    @Override
    public double readDouble(boolean z) {
        try {
            return Double.longBitsToDouble(readInt64(z));
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read double error");
                    fa4.g(e, true);
                    return 0.0d;
                }
                return 0.0d;
            }
            fyb.j("read double error", e);
            return 0.0d;
        }
    }

    @Override
    public float readFloat(boolean z) {
        try {
            return Float.intBitsToFloat(readInt32(z));
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read float error");
                    fa4.g(e, true);
                    return 0.0f;
                }
                return 0.0f;
            }
            fyb.j("read float error", e);
            return 0.0f;
        }
    }

    @Override
    public int readInt32(boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                i |= this.in.read() << (i2 << 3);
                this.len++;
            } catch (Exception e) {
                if (!z) {
                    if (w01.a) {
                        fa4.d("read int32 error");
                        fa4.g(e, true);
                    }
                    return 0;
                }
                fyb.j("read int32 error", e);
                return 0;
            }
        }
        return i;
    }

    @Override
    public long readInt64(boolean z) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            try {
                j |= this.in.read() << (i << 3);
                this.len++;
            } catch (Exception e) {
                if (!z) {
                    if (w01.a) {
                        fa4.d("read int64 error");
                        fa4.g(e, true);
                    }
                    return 0L;
                }
                fyb.j("read int64 error", e);
                return 0L;
            }
        }
        return j;
    }

    @Override
    public String readString(boolean z) {
        int i;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i = 4;
            } else {
                i = 1;
            }
            if (read <= remaining() && read >= 0) {
                byte[] bArr = new byte[read];
                this.in.read(bArr);
                this.len++;
                while ((read + i) % 4 != 0) {
                    this.in.read();
                    this.len++;
                    i++;
                }
                return new String(bArr, "UTF-8");
            }
            throw new RuntimeException("string size too big");
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read string error");
                    fa4.g(e, true);
                    return null;
                }
                return null;
            }
            fyb.j("read string error", e);
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
    public void skip(int i) {
        if (i != 0) {
            if (!this.justCalc) {
                DataInputStream dataInputStream = this.in;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.skipBytes(i);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            }
            this.len += i;
        }
    }

    public byte[] toByteArray() {
        return this.outbuf.toByteArray();
    }

    @Override
    public void writeBool(boolean z) {
        if (!this.justCalc) {
            if (z) {
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
    public void writeByte(int i) {
        try {
            if (!this.justCalc) {
                this.out.writeByte((byte) i);
            } else {
                this.len++;
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte error");
                fa4.g(e, true);
            }
        }
    }

    @Override
    public void writeByteArray(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            boolean z = this.justCalc;
            if (length <= 253) {
                if (!z) {
                    this.out.write(bArr.length);
                } else {
                    this.len++;
                }
            } else if (!z) {
                this.out.write(254);
                this.out.write(bArr.length);
                this.out.write(bArr.length >> 8);
                this.out.write(bArr.length >> 16);
            } else {
                this.len += 4;
            }
            if (!this.justCalc) {
                this.out.write(bArr);
            } else {
                this.len += bArr.length;
            }
            if (bArr.length <= 253) {
                i = 1;
            } else {
                i = 4;
            }
            while ((bArr.length + i) % 4 != 0) {
                if (!this.justCalc) {
                    this.out.write(0);
                } else {
                    this.len++;
                }
                i++;
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte array error");
                fa4.g(e, true);
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
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write raw error");
                fa4.g(e, true);
            }
        }
    }

    @Override
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write double error");
                fa4.g(e, true);
            }
        }
    }

    @Override
    public void writeFloat(float f) {
        try {
            writeInt32(Float.floatToIntBits(f));
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write float error");
                fa4.g(e, true);
            }
        }
    }

    @Override
    public void writeString(String str) {
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write string error");
                fa4.g(e, true);
            }
        }
    }

    @Override
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
    }

    @Override
    public void writeInt32(int i) {
        if (!this.justCalc) {
            writeInt32(i, this.out);
        } else {
            this.len += 4;
        }
    }

    @Override
    public void writeInt64(long j) {
        if (!this.justCalc) {
            writeInt64(j, this.out);
        } else {
            this.len += 8;
        }
    }

    @Override
    public void writeByte(byte b) {
        try {
            if (!this.justCalc) {
                this.out.writeByte(b);
            } else {
                this.len++;
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte error");
                fa4.g(e, true);
            }
        }
    }

    @Override
    public void writeBytes(byte[] bArr, int i, int i2) {
        try {
            if (!this.justCalc) {
                this.out.write(bArr, i, i2);
            } else {
                this.len += i2;
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write bytes error");
                fa4.g(e, true);
            }
        }
    }

    public SerializedData(boolean z) {
        this.isOut = true;
        this.justCalc = false;
        if (!z) {
            this.outbuf = new ByteArrayOutputStream();
            this.out = new DataOutputStream(this.outbuf);
        }
        this.justCalc = z;
        this.len = 0;
    }

    public SerializedData(int i) {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream(i);
        this.out = new DataOutputStream(this.outbuf);
    }

    public SerializedData(byte[] bArr) {
        this.justCalc = false;
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
        this.len = 0;
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

    public SerializedData() {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream();
        this.out = new DataOutputStream(this.outbuf);
    }

    @Override
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            boolean z = this.justCalc;
            if (i2 <= 253) {
                if (z) {
                    this.len++;
                } else {
                    this.out.write(i2);
                }
            } else if (z) {
                this.len += 4;
            } else {
                this.out.write(254);
                this.out.write(i2);
                this.out.write(i2 >> 8);
                this.out.write(i2 >> 16);
            }
            if (this.justCalc) {
                this.len += i2;
            } else {
                this.out.write(bArr, i, i2);
            }
            for (int i3 = i2 <= 253 ? 1 : 4; (i2 + i3) % 4 != 0; i3++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
                }
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte array error");
                fa4.g(e, true);
            }
        }
    }
}
