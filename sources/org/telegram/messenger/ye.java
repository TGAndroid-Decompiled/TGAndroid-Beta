package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ye extends TLObject {
    public Matrix B;
    public boolean C;
    public float f26639a;
    public float f26640b;
    public float d;
    public int f26644i;
    public int f26645j;
    public int f26646k;
    public boolean f26647l;
    public float f26648m;
    public float f26649o;
    public Matrix f26650r;
    public int f26651s;
    public int f26652t;
    public boolean f26653u;
    public float v;
    public int f26654z;
    public float f26641c = 1.0f;
    public float f26642e = 1.0f;
    public float f26643f = 1.0f;

    public final ye clone() {
        ye yeVar = new ye();
        yeVar.f26639a = this.f26639a;
        yeVar.f26640b = this.f26640b;
        yeVar.f26641c = this.f26641c;
        yeVar.d = this.d;
        yeVar.f26642e = this.f26642e;
        yeVar.f26643f = this.f26643f;
        yeVar.f26644i = this.f26644i;
        yeVar.f26645j = this.f26645j;
        yeVar.f26646k = this.f26646k;
        yeVar.f26647l = this.f26647l;
        yeVar.f26648m = this.f26648m;
        yeVar.f26649o = this.f26649o;
        yeVar.f26650r = this.f26650r;
        yeVar.f26651s = this.f26651s;
        yeVar.f26652t = this.f26652t;
        yeVar.f26653u = this.f26653u;
        yeVar.v = this.v;
        yeVar.f26654z = this.f26654z;
        yeVar.C = this.C;
        yeVar.B = this.B;
        return yeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f26650r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.f26642e == 1.0f && this.f26643f == 1.0f && this.f26641c == 1.0f && this.d == 0.0f && this.f26644i == 0 && this.f26645j == 0 && this.f26646k == 0 && !this.f26647l && this.f26648m == 0.0f && this.f26649o == 0.0f && this.f26651s == 0 && this.f26652t == 0 && !this.f26653u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f26639a = inputSerializedData.readFloat(z9);
        this.f26640b = inputSerializedData.readFloat(z9);
        this.f26641c = inputSerializedData.readFloat(z9);
        this.d = inputSerializedData.readFloat(z9);
        this.f26642e = inputSerializedData.readFloat(z9);
        this.f26643f = inputSerializedData.readFloat(z9);
        this.f26644i = inputSerializedData.readInt32(z9);
        this.f26645j = inputSerializedData.readInt32(z9);
        this.f26646k = inputSerializedData.readInt32(z9);
        this.f26647l = inputSerializedData.readBool(z9);
        this.f26648m = inputSerializedData.readFloat(z9);
        this.f26649o = inputSerializedData.readFloat(z9);
        float[] fArr = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            fArr[i7] = inputSerializedData.readFloat(z9);
        }
        Matrix matrix = new Matrix();
        this.f26650r = matrix;
        matrix.setValues(fArr);
        this.f26651s = inputSerializedData.readInt32(z9);
        this.f26652t = inputSerializedData.readInt32(z9);
        this.f26653u = inputSerializedData.readBool(z9);
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
        this.f26654z = inputSerializedData.readInt32(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f26639a);
        outputSerializedData.writeFloat(this.f26640b);
        outputSerializedData.writeFloat(this.f26641c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.f26642e);
        outputSerializedData.writeFloat(this.f26643f);
        outputSerializedData.writeInt32(this.f26644i);
        outputSerializedData.writeInt32(this.f26645j);
        outputSerializedData.writeInt32(this.f26646k);
        outputSerializedData.writeBool(this.f26647l);
        outputSerializedData.writeFloat(this.f26648m);
        outputSerializedData.writeFloat(this.f26649o);
        float[] fArr = new float[9];
        Matrix matrix = this.f26650r;
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
        outputSerializedData.writeInt32(this.f26651s);
        outputSerializedData.writeInt32(this.f26652t);
        outputSerializedData.writeBool(this.f26653u);
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
        outputSerializedData.writeInt32(this.f26654z);
    }
}
