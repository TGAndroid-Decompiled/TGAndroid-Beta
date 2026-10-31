package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ye extends TLObject {
    public Matrix B;
    public boolean C;
    public float f19364a;
    public float f19365b;
    public float d;
    public int f19368i;
    public int f19369j;
    public int f19370k;
    public boolean f19371l;
    public float f19372m;
    public float f19373o;
    public Matrix f19374r;
    public int f19375s;
    public int f19376t;
    public boolean f19377u;
    public float v;
    public int f19378z;
    public float f19366c = 1.0f;
    public float e = 1.0f;
    public float f19367f = 1.0f;

    public final ye clone() {
        ye yeVar = new ye();
        yeVar.f19364a = this.f19364a;
        yeVar.f19365b = this.f19365b;
        yeVar.f19366c = this.f19366c;
        yeVar.d = this.d;
        yeVar.e = this.e;
        yeVar.f19367f = this.f19367f;
        yeVar.f19368i = this.f19368i;
        yeVar.f19369j = this.f19369j;
        yeVar.f19370k = this.f19370k;
        yeVar.f19371l = this.f19371l;
        yeVar.f19372m = this.f19372m;
        yeVar.f19373o = this.f19373o;
        yeVar.f19374r = this.f19374r;
        yeVar.f19375s = this.f19375s;
        yeVar.f19376t = this.f19376t;
        yeVar.f19377u = this.f19377u;
        yeVar.v = this.v;
        yeVar.f19378z = this.f19378z;
        yeVar.C = this.C;
        yeVar.B = this.B;
        return yeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f19374r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.e == 1.0f && this.f19367f == 1.0f && this.f19366c == 1.0f && this.d == 0.0f && this.f19368i == 0 && this.f19369j == 0 && this.f19370k == 0 && !this.f19371l && this.f19372m == 0.0f && this.f19373o == 0.0f && this.f19375s == 0 && this.f19376t == 0 && !this.f19377u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f19364a = inputSerializedData.readFloat(z10);
        this.f19365b = inputSerializedData.readFloat(z10);
        this.f19366c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.e = inputSerializedData.readFloat(z10);
        this.f19367f = inputSerializedData.readFloat(z10);
        this.f19368i = inputSerializedData.readInt32(z10);
        this.f19369j = inputSerializedData.readInt32(z10);
        this.f19370k = inputSerializedData.readInt32(z10);
        this.f19371l = inputSerializedData.readBool(z10);
        this.f19372m = inputSerializedData.readFloat(z10);
        this.f19373o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f19374r = matrix;
        matrix.setValues(fArr);
        this.f19375s = inputSerializedData.readInt32(z10);
        this.f19376t = inputSerializedData.readInt32(z10);
        this.f19377u = inputSerializedData.readBool(z10);
        this.v = inputSerializedData.readFloat(z10);
        if (inputSerializedData.readInt32(z10) == 178403937) {
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = inputSerializedData.readFloat(z10);
            }
            Matrix matrix2 = new Matrix();
            this.B = matrix2;
            matrix2.setValues(fArr);
        }
        this.C = inputSerializedData.readBool(z10);
        this.f19378z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f19364a);
        outputSerializedData.writeFloat(this.f19365b);
        outputSerializedData.writeFloat(this.f19366c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeFloat(this.f19367f);
        outputSerializedData.writeInt32(this.f19368i);
        outputSerializedData.writeInt32(this.f19369j);
        outputSerializedData.writeInt32(this.f19370k);
        outputSerializedData.writeBool(this.f19371l);
        outputSerializedData.writeFloat(this.f19372m);
        outputSerializedData.writeFloat(this.f19373o);
        float[] fArr = new float[9];
        Matrix matrix = this.f19374r;
        if (matrix != null) {
            matrix.getValues(fArr);
        } else {
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = 0.0f;
            }
        }
        for (int i11 = 0; i11 < 9; i11++) {
            outputSerializedData.writeFloat(fArr[i11]);
        }
        outputSerializedData.writeInt32(this.f19375s);
        outputSerializedData.writeInt32(this.f19376t);
        outputSerializedData.writeBool(this.f19377u);
        outputSerializedData.writeFloat(this.v);
        if (this.B == null) {
            outputSerializedData.writeInt32(1450380236);
        } else {
            outputSerializedData.writeInt32(178403937);
            this.B.getValues(fArr);
            for (int i12 = 0; i12 < 9; i12++) {
                outputSerializedData.writeFloat(fArr[i12]);
            }
        }
        outputSerializedData.writeBool(this.C);
        outputSerializedData.writeInt32(this.f19378z);
    }
}
