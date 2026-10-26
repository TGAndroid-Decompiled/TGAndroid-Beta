package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ag0 {
    public final bg0 f26499a = new bg0();
    public final bg0 f26500b = new bg0();
    public final bg0 f26501c = new bg0();
    public final bg0 d = new bg0();
    public final ByteBuffer e;
    public int f26502f;

    public ag0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        bg0 bg0Var = this.f26499a;
        if (bg0Var.f26853f == null) {
            bg0Var.a();
        }
        float[] fArr = bg0Var.f26853f;
        bg0 bg0Var2 = this.f26500b;
        if (bg0Var2.f26853f == null) {
            bg0Var2.a();
        }
        float[] fArr2 = bg0Var2.f26853f;
        bg0 bg0Var3 = this.f26501c;
        if (bg0Var3.f26853f == null) {
            bg0Var3.a();
        }
        float[] fArr3 = bg0Var3.f26853f;
        bg0 bg0Var4 = this.d;
        if (bg0Var4.f26853f == null) {
            bg0Var4.a();
        }
        float[] fArr4 = bg0Var4.f26853f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26499a.b() && this.f26500b.b() && this.f26501c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
