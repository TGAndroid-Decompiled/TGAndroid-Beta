package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class me0 {
    public final ne0 f30802a = new ne0();
    public final ne0 f30803b = new ne0();
    public final ne0 f30804c = new ne0();
    public final ne0 d = new ne0();
    public final ByteBuffer f30805e;
    public int f30806f;

    public me0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f30805e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f30805e;
        byteBuffer.position(0);
        ne0 ne0Var = this.f30802a;
        if (ne0Var.f31087f == null) {
            ne0Var.a();
        }
        float[] fArr = ne0Var.f31087f;
        ne0 ne0Var2 = this.f30803b;
        if (ne0Var2.f31087f == null) {
            ne0Var2.a();
        }
        float[] fArr2 = ne0Var2.f31087f;
        ne0 ne0Var3 = this.f30804c;
        if (ne0Var3.f31087f == null) {
            ne0Var3.a();
        }
        float[] fArr3 = ne0Var3.f31087f;
        ne0 ne0Var4 = this.d;
        if (ne0Var4.f31087f == null) {
            ne0Var4.a();
        }
        float[] fArr4 = ne0Var4.f31087f;
        for (int i9 = 0; i9 < 200; i9++) {
            byteBuffer.put((byte) (fArr2[i9] * 255.0f));
            byteBuffer.put((byte) (fArr3[i9] * 255.0f));
            byteBuffer.put((byte) (fArr4[i9] * 255.0f));
            byteBuffer.put((byte) (fArr[i9] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f30802a.b() && this.f30803b.b() && this.f30804c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
