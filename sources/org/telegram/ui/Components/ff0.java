package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ff0 {
    public final gf0 f26055a = new gf0();
    public final gf0 f26056b = new gf0();
    public final gf0 f26057c = new gf0();
    public final gf0 d = new gf0();
    public final ByteBuffer f26058e;
    public int f26059f;

    public ff0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f26058e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f26058e;
        byteBuffer.position(0);
        gf0 gf0Var = this.f26055a;
        if (gf0Var.f26403f == null) {
            gf0Var.a();
        }
        float[] fArr = gf0Var.f26403f;
        gf0 gf0Var2 = this.f26056b;
        if (gf0Var2.f26403f == null) {
            gf0Var2.a();
        }
        float[] fArr2 = gf0Var2.f26403f;
        gf0 gf0Var3 = this.f26057c;
        if (gf0Var3.f26403f == null) {
            gf0Var3.a();
        }
        float[] fArr3 = gf0Var3.f26403f;
        gf0 gf0Var4 = this.d;
        if (gf0Var4.f26403f == null) {
            gf0Var4.a();
        }
        float[] fArr4 = gf0Var4.f26403f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26055a.b() && this.f26056b.b() && this.f26057c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
