package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class nf0 {
    public final of0 f26631a = new of0();
    public final of0 f26632b = new of0();
    public final of0 f26633c = new of0();
    public final of0 d = new of0();
    public final ByteBuffer e;
    public int f26634f;

    public nf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        of0 of0Var = this.f26631a;
        if (of0Var.f26907f == null) {
            of0Var.a();
        }
        float[] fArr = of0Var.f26907f;
        of0 of0Var2 = this.f26632b;
        if (of0Var2.f26907f == null) {
            of0Var2.a();
        }
        float[] fArr2 = of0Var2.f26907f;
        of0 of0Var3 = this.f26633c;
        if (of0Var3.f26907f == null) {
            of0Var3.a();
        }
        float[] fArr3 = of0Var3.f26907f;
        of0 of0Var4 = this.d;
        if (of0Var4.f26907f == null) {
            of0Var4.a();
        }
        float[] fArr4 = of0Var4.f26907f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26631a.b() && this.f26632b.b() && this.f26633c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
