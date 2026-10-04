package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class rf0 {
    public final sf0 f30367a = new sf0();
    public final sf0 f30368b = new sf0();
    public final sf0 f30369c = new sf0();
    public final sf0 d = new sf0();
    public final ByteBuffer f30370e;
    public int f30371f;

    public rf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f30370e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f30370e;
        byteBuffer.position(0);
        sf0 sf0Var = this.f30367a;
        if (sf0Var.f30707f == null) {
            sf0Var.a();
        }
        float[] fArr = sf0Var.f30707f;
        sf0 sf0Var2 = this.f30368b;
        if (sf0Var2.f30707f == null) {
            sf0Var2.a();
        }
        float[] fArr2 = sf0Var2.f30707f;
        sf0 sf0Var3 = this.f30369c;
        if (sf0Var3.f30707f == null) {
            sf0Var3.a();
        }
        float[] fArr3 = sf0Var3.f30707f;
        sf0 sf0Var4 = this.d;
        if (sf0Var4.f30707f == null) {
            sf0Var4.a();
        }
        float[] fArr4 = sf0Var4.f30707f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f30367a.b() && this.f30368b.b() && this.f30369c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
