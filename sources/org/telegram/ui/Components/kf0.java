package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class kf0 {
    public final lf0 f26269a = new lf0();
    public final lf0 f26270b = new lf0();
    public final lf0 f26271c = new lf0();
    public final lf0 d = new lf0();
    public final ByteBuffer e;
    public int f26272f;

    public kf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        lf0 lf0Var = this.f26269a;
        if (lf0Var.f26654f == null) {
            lf0Var.a();
        }
        float[] fArr = lf0Var.f26654f;
        lf0 lf0Var2 = this.f26270b;
        if (lf0Var2.f26654f == null) {
            lf0Var2.a();
        }
        float[] fArr2 = lf0Var2.f26654f;
        lf0 lf0Var3 = this.f26271c;
        if (lf0Var3.f26654f == null) {
            lf0Var3.a();
        }
        float[] fArr3 = lf0Var3.f26654f;
        lf0 lf0Var4 = this.d;
        if (lf0Var4.f26654f == null) {
            lf0Var4.a();
        }
        float[] fArr4 = lf0Var4.f26654f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26269a.b() && this.f26270b.b() && this.f26271c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
