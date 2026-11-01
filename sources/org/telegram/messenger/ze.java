package org.telegram.messenger;

import android.graphics.Matrix;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class ze extends TLObject {
    public Matrix B;
    public boolean C;
    public float f19692a;
    public float f19693b;
    public float d;
    public int f19696i;
    public int f19697j;
    public int f19698k;
    public boolean f19699l;
    public float f19700m;
    public float f19701o;
    public Matrix f19702r;
    public int f19703s;
    public int f19704t;
    public boolean f19705u;
    public float v;
    public int f19706z;
    public float f19694c = 1.0f;
    public float e = 1.0f;
    public float f19695f = 1.0f;

    public final ze clone() {
        ze zeVar = new ze();
        zeVar.f19692a = this.f19692a;
        zeVar.f19693b = this.f19693b;
        zeVar.f19694c = this.f19694c;
        zeVar.d = this.d;
        zeVar.e = this.e;
        zeVar.f19695f = this.f19695f;
        zeVar.f19696i = this.f19696i;
        zeVar.f19697j = this.f19697j;
        zeVar.f19698k = this.f19698k;
        zeVar.f19699l = this.f19699l;
        zeVar.f19700m = this.f19700m;
        zeVar.f19701o = this.f19701o;
        zeVar.f19702r = this.f19702r;
        zeVar.f19703s = this.f19703s;
        zeVar.f19704t = this.f19704t;
        zeVar.f19705u = this.f19705u;
        zeVar.v = this.v;
        zeVar.f19706z = this.f19706z;
        zeVar.C = this.C;
        zeVar.B = this.B;
        return zeVar;
    }

    public final boolean b() {
        Matrix matrix = this.f19702r;
        if (matrix == null || matrix.isIdentity()) {
            Matrix matrix2 = this.B;
            if ((matrix2 == null || matrix2.isIdentity()) && this.e == 1.0f && this.f19695f == 1.0f && this.f19694c == 1.0f && this.d == 0.0f && this.f19696i == 0 && this.f19697j == 0 && this.f19698k == 0 && !this.f19699l && this.f19700m == 0.0f && this.f19701o == 0.0f && this.f19703s == 0 && this.f19704t == 0 && !this.f19705u && this.v == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f19692a = inputSerializedData.readFloat(z10);
        this.f19693b = inputSerializedData.readFloat(z10);
        this.f19694c = inputSerializedData.readFloat(z10);
        this.d = inputSerializedData.readFloat(z10);
        this.e = inputSerializedData.readFloat(z10);
        this.f19695f = inputSerializedData.readFloat(z10);
        this.f19696i = inputSerializedData.readInt32(z10);
        this.f19697j = inputSerializedData.readInt32(z10);
        this.f19698k = inputSerializedData.readInt32(z10);
        this.f19699l = inputSerializedData.readBool(z10);
        this.f19700m = inputSerializedData.readFloat(z10);
        this.f19701o = inputSerializedData.readFloat(z10);
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = inputSerializedData.readFloat(z10);
        }
        Matrix matrix = new Matrix();
        this.f19702r = matrix;
        matrix.setValues(fArr);
        this.f19703s = inputSerializedData.readInt32(z10);
        this.f19704t = inputSerializedData.readInt32(z10);
        this.f19705u = inputSerializedData.readBool(z10);
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
        this.f19706z = inputSerializedData.readInt32(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1151577037);
        outputSerializedData.writeFloat(this.f19692a);
        outputSerializedData.writeFloat(this.f19693b);
        outputSerializedData.writeFloat(this.f19694c);
        outputSerializedData.writeFloat(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeFloat(this.f19695f);
        outputSerializedData.writeInt32(this.f19696i);
        outputSerializedData.writeInt32(this.f19697j);
        outputSerializedData.writeInt32(this.f19698k);
        outputSerializedData.writeBool(this.f19699l);
        outputSerializedData.writeFloat(this.f19700m);
        outputSerializedData.writeFloat(this.f19701o);
        float[] fArr = new float[9];
        Matrix matrix = this.f19702r;
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
        outputSerializedData.writeInt32(this.f19703s);
        outputSerializedData.writeInt32(this.f19704t);
        outputSerializedData.writeBool(this.f19705u);
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
        outputSerializedData.writeInt32(this.f19706z);
    }
}
