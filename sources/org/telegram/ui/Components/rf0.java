package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class rf0 {
    public final sf0 f27953a = new sf0();
    public final sf0 f27954b = new sf0();
    public final sf0 f27955c = new sf0();
    public final sf0 d = new sf0();
    public final ByteBuffer e;
    public int f27956f;

    public rf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        sf0 sf0Var = this.f27953a;
        if (sf0Var.f28216f == null) {
            sf0Var.a();
        }
        float[] fArr = sf0Var.f28216f;
        sf0 sf0Var2 = this.f27954b;
        if (sf0Var2.f28216f == null) {
            sf0Var2.a();
        }
        float[] fArr2 = sf0Var2.f28216f;
        sf0 sf0Var3 = this.f27955c;
        if (sf0Var3.f28216f == null) {
            sf0Var3.a();
        }
        float[] fArr3 = sf0Var3.f28216f;
        sf0 sf0Var4 = this.d;
        if (sf0Var4.f28216f == null) {
            sf0Var4.a();
        }
        float[] fArr4 = sf0Var4.f28216f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27953a.b() && this.f27954b.b() && this.f27955c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
