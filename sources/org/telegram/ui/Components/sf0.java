package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class sf0 {
    public final tf0 f28247a = new tf0();
    public final tf0 f28248b = new tf0();
    public final tf0 f28249c = new tf0();
    public final tf0 d = new tf0();
    public final ByteBuffer e;
    public int f28250f;

    public sf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        tf0 tf0Var = this.f28247a;
        if (tf0Var.f28503f == null) {
            tf0Var.a();
        }
        float[] fArr = tf0Var.f28503f;
        tf0 tf0Var2 = this.f28248b;
        if (tf0Var2.f28503f == null) {
            tf0Var2.a();
        }
        float[] fArr2 = tf0Var2.f28503f;
        tf0 tf0Var3 = this.f28249c;
        if (tf0Var3.f28503f == null) {
            tf0Var3.a();
        }
        float[] fArr3 = tf0Var3.f28503f;
        tf0 tf0Var4 = this.d;
        if (tf0Var4.f28503f == null) {
            tf0Var4.a();
        }
        float[] fArr4 = tf0Var4.f28503f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f28247a.b() && this.f28248b.b() && this.f28249c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
