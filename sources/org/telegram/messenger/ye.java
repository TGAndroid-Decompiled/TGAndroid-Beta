package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ye extends TLObject {
    public Matrix B;
    public boolean C;
    public float f26626a;
    public float f26627b;
    public float d;
    public int f26631i;
    public int f26632j;
    public int f26633k;
    public boolean f26634l;
    public float f26635m;
    public float f26636o;
    public Matrix f26637r;
    public int f26638s;
    public int f26639t;
    public boolean f26640u;
    public float v;
    public int f26641z;
    public float f26628c = 1.0f;
    public float f26629e = 1.0f;
    public float f26630f = 1.0f;

    public final ye clone() {
        ye yeVar = new ye();
        yeVar.f26626a = this.f26626a;
        yeVar.f26627b = this.f26627b;
        yeVar.f26628c = this.f26628c;
        yeVar.d = this.d;
        yeVar.f26629e = this.f26629e;
        yeVar.f26630f = this.f26630f;
        yeVar.f26631i = this.f26631i;
        yeVar.f26632j = this.f26632j;
        yeVar.f26633k = this.f26633k;
        yeVar.f26634l = this.f26634l;
        yeVar.f26635m = this.f26635m;
        yeVar.f26636o = this.f26636o;
        yeVar.f26637r = this.f26637r;
        yeVar.f26638s = this.f26638s;
        yeVar.f26639t = this.f26639t;
        yeVar.f26640u = this.f26640u;
        yeVar.v = this.v;
        yeVar.f26641z = this.f26641z;
        yeVar.C = this.C;
        yeVar.B = this.B;
        return yeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f26637r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f26629e == 1.0f && this.f26630f == 1.0f && this.f26628c == 1.0f && this.d == 0.0f && this.f26631i == 0 && this.f26632j == 0 && this.f26633k == 0 && !this.f26634l && this.f26635m == 0.0f && this.f26636o == 0.0f && this.f26638s == 0 && this.f26639t == 0 && !this.f26640u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f26626a = inputSerializedData.readFloat(z9);
        this.f26627b = inputSerializedData.readFloat(z9);
        this.f26628c = inputSerializedData.readFloat(z9);
        this.d = inputSerializedData.readFloat(z9);
        this.f26629e = inputSerializedData.readFloat(z9);
        this.f26630f = inputSerializedData.readFloat(z9);
        this.f26631i = inputSerializedData.readInt32(z9);
        this.f26632j = inputSerializedData.readInt32(z9);
        this.f26633k = inputSerializedData.readInt32(z9);
        this.f26634l = inputSerializedData.readBool(z9);
        this.f26635m = inputSerializedData.readFloat(z9);
        this.f26636o = inputSerializedData.readFloat(z9);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z9);
        }
        Matrix matrix = new Matrix();
        this.f26637r = matrix;
        matrix.setValues(fArr);
        this.f26638s = inputSerializedData.readInt32(z9);
        this.f26639t = inputSerializedData.readInt32(z9);
        this.f26640u = inputSerializedData.readBool(z9);
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
        this.f26641z = inputSerializedData.readInt32(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f26626a);
        outputSerializedData.writeFloat(this.f26627b);
        outputSerializedData.writeFloat(this.f26628c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f26629e);
        outputSerializedData.writeFloat(this.f26630f);
        outputSerializedData.writeInt32(this.f26631i);
        outputSerializedData.writeInt32(this.f26632j);
        outputSerializedData.writeInt32(this.f26633k);
        outputSerializedData.writeBool(this.f26634l);
        outputSerializedData.writeFloat(this.f26635m);
        outputSerializedData.writeFloat(this.f26636o);
        float[] fArr = new float[9];
        Matrix matrix = this.f26637r;
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
        outputSerializedData.writeInt32(this.f26638s);
        outputSerializedData.writeInt32(this.f26639t);
        outputSerializedData.writeBool(this.f26640u);
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
        outputSerializedData.writeInt32(this.f26641z);
    }
}
