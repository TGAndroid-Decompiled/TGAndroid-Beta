package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class of0 {
    public final pf0 f26925a = new pf0();
    public final pf0 f26926b = new pf0();
    public final pf0 f26927c = new pf0();
    public final pf0 d = new pf0();
    public final ByteBuffer e;
    public int f26928f;

    public of0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        pf0 pf0Var = this.f26925a;
        if (pf0Var.f27203f == null) {
            pf0Var.a();
        }
        float[] fArr = pf0Var.f27203f;
        pf0 pf0Var2 = this.f26926b;
        if (pf0Var2.f27203f == null) {
            pf0Var2.a();
        }
        float[] fArr2 = pf0Var2.f27203f;
        pf0 pf0Var3 = this.f26927c;
        if (pf0Var3.f27203f == null) {
            pf0Var3.a();
        }
        float[] fArr3 = pf0Var3.f27203f;
        pf0 pf0Var4 = this.d;
        if (pf0Var4.f27203f == null) {
            pf0Var4.a();
        }
        float[] fArr4 = pf0Var4.f27203f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26925a.b() && this.f26926b.b() && this.f26927c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
