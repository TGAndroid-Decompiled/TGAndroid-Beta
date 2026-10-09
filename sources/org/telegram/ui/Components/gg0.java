package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class gg0 {
    public final hg0 f26691a = new hg0();
    public final hg0 f26692b = new hg0();
    public final hg0 f26693c = new hg0();
    public final hg0 d = new hg0();
    public final ByteBuffer f26694e;
    public int f26695f;

    public gg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f26694e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f26694e;
        byteBuffer.position(0);
        hg0 hg0Var = this.f26691a;
        if (hg0Var.f27068f == null) {
            hg0Var.a();
        }
        float[] fArr = hg0Var.f27068f;
        hg0 hg0Var2 = this.f26692b;
        if (hg0Var2.f27068f == null) {
            hg0Var2.a();
        }
        float[] fArr2 = hg0Var2.f27068f;
        hg0 hg0Var3 = this.f26693c;
        if (hg0Var3.f27068f == null) {
            hg0Var3.a();
        }
        float[] fArr3 = hg0Var3.f27068f;
        hg0 hg0Var4 = this.d;
        if (hg0Var4.f27068f == null) {
            hg0Var4.a();
        }
        float[] fArr4 = hg0Var4.f27068f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26691a.b() && this.f26692b.b() && this.f26693c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
