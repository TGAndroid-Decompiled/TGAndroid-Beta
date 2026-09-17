package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ff0 {
    public final gf0 f26029a = new gf0();
    public final gf0 f26030b = new gf0();
    public final gf0 f26031c = new gf0();
    public final gf0 d = new gf0();
    public final ByteBuffer f26032e;
    public int f26033f;

    public ff0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f26032e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f26032e;
        byteBuffer.position(0);
        gf0 gf0Var = this.f26029a;
        if (gf0Var.f26377f == null) {
            gf0Var.a();
        }
        float[] fArr = gf0Var.f26377f;
        gf0 gf0Var2 = this.f26030b;
        if (gf0Var2.f26377f == null) {
            gf0Var2.a();
        }
        float[] fArr2 = gf0Var2.f26377f;
        gf0 gf0Var3 = this.f26031c;
        if (gf0Var3.f26377f == null) {
            gf0Var3.a();
        }
        float[] fArr3 = gf0Var3.f26377f;
        gf0 gf0Var4 = this.d;
        if (gf0Var4.f26377f == null) {
            gf0Var4.a();
        }
        float[] fArr4 = gf0Var4.f26377f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26029a.b() && this.f26030b.b() && this.f26031c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
