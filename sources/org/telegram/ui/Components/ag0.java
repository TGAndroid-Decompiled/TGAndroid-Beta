package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ag0 {
    public final bg0 f26497a = new bg0();
    public final bg0 f26498b = new bg0();
    public final bg0 f26499c = new bg0();
    public final bg0 d = new bg0();
    public final ByteBuffer e;
    public int f26500f;

    public ag0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        bg0 bg0Var = this.f26497a;
        if (bg0Var.f26851f == null) {
            bg0Var.a();
        }
        float[] fArr = bg0Var.f26851f;
        bg0 bg0Var2 = this.f26498b;
        if (bg0Var2.f26851f == null) {
            bg0Var2.a();
        }
        float[] fArr2 = bg0Var2.f26851f;
        bg0 bg0Var3 = this.f26499c;
        if (bg0Var3.f26851f == null) {
            bg0Var3.a();
        }
        float[] fArr3 = bg0Var3.f26851f;
        bg0 bg0Var4 = this.d;
        if (bg0Var4.f26851f == null) {
            bg0Var4.a();
        }
        float[] fArr4 = bg0Var4.f26851f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26497a.b() && this.f26498b.b() && this.f26499c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
