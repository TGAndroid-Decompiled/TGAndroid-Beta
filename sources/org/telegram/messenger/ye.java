package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ye extends TLObject {
    public Matrix B;
    public boolean C;
    public float f26618a;
    public float f26619b;
    public float d;
    public int f26623i;
    public int f26624j;
    public int f26625k;
    public boolean f26626l;
    public float f26627m;
    public float f26628o;
    public Matrix f26629r;
    public int f26630s;
    public int f26631t;
    public boolean f26632u;
    public float v;
    public int f26633z;
    public float f26620c = 1.0f;
    public float f26621e = 1.0f;
    public float f26622f = 1.0f;

    public final ye clone() {
        ye yeVar = new ye();
        yeVar.f26618a = this.f26618a;
        yeVar.f26619b = this.f26619b;
        yeVar.f26620c = this.f26620c;
        yeVar.d = this.d;
        yeVar.f26621e = this.f26621e;
        yeVar.f26622f = this.f26622f;
        yeVar.f26623i = this.f26623i;
        yeVar.f26624j = this.f26624j;
        yeVar.f26625k = this.f26625k;
        yeVar.f26626l = this.f26626l;
        yeVar.f26627m = this.f26627m;
        yeVar.f26628o = this.f26628o;
        yeVar.f26629r = this.f26629r;
        yeVar.f26630s = this.f26630s;
        yeVar.f26631t = this.f26631t;
        yeVar.f26632u = this.f26632u;
        yeVar.v = this.v;
        yeVar.f26633z = this.f26633z;
        yeVar.C = this.C;
        yeVar.B = this.B;
        return yeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f26629r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f26621e == 1.0f && this.f26622f == 1.0f && this.f26620c == 1.0f && this.d == 0.0f && this.f26623i == 0 && this.f26624j == 0 && this.f26625k == 0 && !this.f26626l && this.f26627m == 0.0f && this.f26628o == 0.0f && this.f26630s == 0 && this.f26631t == 0 && !this.f26632u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f26618a = inputSerializedData.readFloat(z9);
        this.f26619b = inputSerializedData.readFloat(z9);
        this.f26620c = inputSerializedData.readFloat(z9);
        this.d = inputSerializedData.readFloat(z9);
        this.f26621e = inputSerializedData.readFloat(z9);
        this.f26622f = inputSerializedData.readFloat(z9);
        this.f26623i = inputSerializedData.readInt32(z9);
        this.f26624j = inputSerializedData.readInt32(z9);
        this.f26625k = inputSerializedData.readInt32(z9);
        this.f26626l = inputSerializedData.readBool(z9);
        this.f26627m = inputSerializedData.readFloat(z9);
        this.f26628o = inputSerializedData.readFloat(z9);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z9);
        }
        Matrix matrix = new Matrix();
        this.f26629r = matrix;
        matrix.setValues(fArr);
        this.f26630s = inputSerializedData.readInt32(z9);
        this.f26631t = inputSerializedData.readInt32(z9);
        this.f26632u = inputSerializedData.readBool(z9);
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
        this.f26633z = inputSerializedData.readInt32(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f26618a);
        outputSerializedData.writeFloat(this.f26619b);
        outputSerializedData.writeFloat(this.f26620c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f26621e);
        outputSerializedData.writeFloat(this.f26622f);
        outputSerializedData.writeInt32(this.f26623i);
        outputSerializedData.writeInt32(this.f26624j);
        outputSerializedData.writeInt32(this.f26625k);
        outputSerializedData.writeBool(this.f26626l);
        outputSerializedData.writeFloat(this.f26627m);
        outputSerializedData.writeFloat(this.f26628o);
        float[] fArr = new float[9];
        Matrix matrix = this.f26629r;
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
        outputSerializedData.writeInt32(this.f26630s);
        outputSerializedData.writeInt32(this.f26631t);
        outputSerializedData.writeBool(this.f26632u);
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
        outputSerializedData.writeInt32(this.f26633z);
    }
}
