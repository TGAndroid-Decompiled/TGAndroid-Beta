package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class of0 {
    public final pf0 f25772a = new pf0();
    public final pf0 f25773b = new pf0();
    public final pf0 f25774c = new pf0();
    public final pf0 d = new pf0();
    public final ByteBuffer e;
    public int f25775f;

    public of0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        pf0 pf0Var = this.f25772a;
        if (pf0Var.f26116f == null) {
            pf0Var.a();
        }
        float[] fArr = pf0Var.f26116f;
        pf0 pf0Var2 = this.f25773b;
        if (pf0Var2.f26116f == null) {
            pf0Var2.a();
        }
        float[] fArr2 = pf0Var2.f26116f;
        pf0 pf0Var3 = this.f25774c;
        if (pf0Var3.f26116f == null) {
            pf0Var3.a();
        }
        float[] fArr3 = pf0Var3.f26116f;
        pf0 pf0Var4 = this.d;
        if (pf0Var4.f26116f == null) {
            pf0Var4.a();
        }
        float[] fArr4 = pf0Var4.f26116f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f25772a.b() && this.f25773b.b() && this.f25774c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
