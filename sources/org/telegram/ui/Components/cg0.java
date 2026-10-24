package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class cg0 {
    public final dg0 f25305a = new dg0();
    public final dg0 f25306b = new dg0();
    public final dg0 f25307c = new dg0();
    public final dg0 d = new dg0();
    public final ByteBuffer e;
    public int f25308f;

    public cg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        dg0 dg0Var = this.f25305a;
        if (dg0Var.f25730f == null) {
            dg0Var.a();
        }
        float[] fArr = dg0Var.f25730f;
        dg0 dg0Var2 = this.f25306b;
        if (dg0Var2.f25730f == null) {
            dg0Var2.a();
        }
        float[] fArr2 = dg0Var2.f25730f;
        dg0 dg0Var3 = this.f25307c;
        if (dg0Var3.f25730f == null) {
            dg0Var3.a();
        }
        float[] fArr3 = dg0Var3.f25730f;
        dg0 dg0Var4 = this.d;
        if (dg0Var4.f25730f == null) {
            dg0Var4.a();
        }
        float[] fArr4 = dg0Var4.f25730f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f25305a.b() && this.f25306b.b() && this.f25307c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
