package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ye extends TLObject {
    public Matrix B;
    public boolean C;
    public float f26635a;
    public float f26636b;
    public float d;
    public int f26640i;
    public int f26641j;
    public int f26642k;
    public boolean f26643l;
    public float f26644m;
    public float f26645o;
    public Matrix f26646r;
    public int f26647s;
    public int f26648t;
    public boolean f26649u;
    public float v;
    public int f26650z;
    public float f26637c = 1.0f;
    public float f26638e = 1.0f;
    public float f26639f = 1.0f;

    public final ye clone() {
        ye yeVar = new ye();
        yeVar.f26635a = this.f26635a;
        yeVar.f26636b = this.f26636b;
        yeVar.f26637c = this.f26637c;
        yeVar.d = this.d;
        yeVar.f26638e = this.f26638e;
        yeVar.f26639f = this.f26639f;
        yeVar.f26640i = this.f26640i;
        yeVar.f26641j = this.f26641j;
        yeVar.f26642k = this.f26642k;
        yeVar.f26643l = this.f26643l;
        yeVar.f26644m = this.f26644m;
        yeVar.f26645o = this.f26645o;
        yeVar.f26646r = this.f26646r;
        yeVar.f26647s = this.f26647s;
        yeVar.f26648t = this.f26648t;
        yeVar.f26649u = this.f26649u;
        yeVar.v = this.v;
        yeVar.f26650z = this.f26650z;
        yeVar.C = this.C;
        yeVar.B = this.B;
        return yeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f26646r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f26638e == 1.0f && this.f26639f == 1.0f && this.f26637c == 1.0f && this.d == 0.0f && this.f26640i == 0 && this.f26641j == 0 && this.f26642k == 0 && !this.f26643l && this.f26644m == 0.0f && this.f26645o == 0.0f && this.f26647s == 0 && this.f26648t == 0 && !this.f26649u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f26635a = inputSerializedData.readFloat(z9);
        this.f26636b = inputSerializedData.readFloat(z9);
        this.f26637c = inputSerializedData.readFloat(z9);
        this.d = inputSerializedData.readFloat(z9);
        this.f26638e = inputSerializedData.readFloat(z9);
        this.f26639f = inputSerializedData.readFloat(z9);
        this.f26640i = inputSerializedData.readInt32(z9);
        this.f26641j = inputSerializedData.readInt32(z9);
        this.f26642k = inputSerializedData.readInt32(z9);
        this.f26643l = inputSerializedData.readBool(z9);
        this.f26644m = inputSerializedData.readFloat(z9);
        this.f26645o = inputSerializedData.readFloat(z9);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z9);
        }
        Matrix matrix = new Matrix();
        this.f26646r = matrix;
        matrix.setValues(fArr);
        this.f26647s = inputSerializedData.readInt32(z9);
        this.f26648t = inputSerializedData.readInt32(z9);
        this.f26649u = inputSerializedData.readBool(z9);
        this.v = inputSerializedData.readFloat(z9);
        if (inputSerializedData.readInt32(z9) == 178403937) {
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = inputSerializedData.readFloat(z9);
            }
            Matrix matrix2 = new Matrix();
            this.B = matrix2;
            matrix2.setValues(fArr);
        }
        this.C = inputSerializedData.readBool(z9);
        this.f26650z = inputSerializedData.readInt32(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f26635a);
        outputSerializedData.writeFloat(this.f26636b);
        outputSerializedData.writeFloat(this.f26637c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f26638e);
        outputSerializedData.writeFloat(this.f26639f);
        outputSerializedData.writeInt32(this.f26640i);
        outputSerializedData.writeInt32(this.f26641j);
        outputSerializedData.writeInt32(this.f26642k);
        outputSerializedData.writeBool(this.f26643l);
        outputSerializedData.writeFloat(this.f26644m);
        outputSerializedData.writeFloat(this.f26645o);
        float[] fArr = new float[9];
        Matrix matrix = this.f26646r;
        if (matrix != null) {
            matrix.getValues(fArr);
        } else {
            for (int i7 = 0; i7 < 9; i7++) {
                fArr[i7] = 0.0f;
            }
        }
        for (int i10 = 0; i10 < 9; i10++) {
            outputSerializedData.writeFloat(fArr[i10]);
        }
        outputSerializedData.writeInt32(this.f26647s);
        outputSerializedData.writeInt32(this.f26648t);
        outputSerializedData.writeBool(this.f26649u);
        outputSerializedData.writeFloat(this.v);
        if (this.B == null) {
            outputSerializedData.writeInt32(1450380236);
        } else {
            outputSerializedData.writeInt32(178403937);
            this.B.getValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                outputSerializedData.writeFloat(fArr[i11]);
            }
        }
        outputSerializedData.writeBool(this.C);
        outputSerializedData.writeInt32(this.f26650z);
    }
}
