package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class bg0 {
    public final cg0 f26827a = new cg0();
    public final cg0 f26828b = new cg0();
    public final cg0 f26829c = new cg0();
    public final cg0 d = new cg0();
    public final ByteBuffer e;
    public int f26830f;

    public bg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        cg0 cg0Var = this.f26827a;
        if (cg0Var.f27158f == null) {
            cg0Var.a();
        }
        float[] fArr = cg0Var.f27158f;
        cg0 cg0Var2 = this.f26828b;
        if (cg0Var2.f27158f == null) {
            cg0Var2.a();
        }
        float[] fArr2 = cg0Var2.f27158f;
        cg0 cg0Var3 = this.f26829c;
        if (cg0Var3.f27158f == null) {
            cg0Var3.a();
        }
        float[] fArr3 = cg0Var3.f27158f;
        cg0 cg0Var4 = this.d;
        if (cg0Var4.f27158f == null) {
            cg0Var4.a();
        }
        float[] fArr4 = cg0Var4.f27158f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26827a.b() && this.f26828b.b() && this.f26829c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
