package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ig0 {
    public final jg0 f27384a = new jg0();
    public final jg0 f27385b = new jg0();
    public final jg0 f27386c = new jg0();
    public final jg0 d = new jg0();
    public final ByteBuffer f27387e;
    public int f27388f;

    public ig0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f27387e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f27387e;
        byteBuffer.position(0);
        jg0 jg0Var = this.f27384a;
        if (jg0Var.f27677f == null) {
            jg0Var.a();
        }
        float[] fArr = jg0Var.f27677f;
        jg0 jg0Var2 = this.f27385b;
        if (jg0Var2.f27677f == null) {
            jg0Var2.a();
        }
        float[] fArr2 = jg0Var2.f27677f;
        jg0 jg0Var3 = this.f27386c;
        if (jg0Var3.f27677f == null) {
            jg0Var3.a();
        }
        float[] fArr3 = jg0Var3.f27677f;
        jg0 jg0Var4 = this.d;
        if (jg0Var4.f27677f == null) {
            jg0Var4.a();
        }
        float[] fArr4 = jg0Var4.f27677f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27384a.b() && this.f27385b.b() && this.f27386c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
