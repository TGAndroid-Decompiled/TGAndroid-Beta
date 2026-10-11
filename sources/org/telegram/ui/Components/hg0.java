package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class hg0 {
    public final ig0 f27092a = new ig0();
    public final ig0 f27093b = new ig0();
    public final ig0 f27094c = new ig0();
    public final ig0 d = new ig0();
    public final ByteBuffer f27095e;
    public int f27096f;

    public hg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f27095e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f27095e;
        byteBuffer.position(0);
        ig0 ig0Var = this.f27092a;
        if (ig0Var.f27445f == null) {
            ig0Var.a();
        }
        float[] fArr = ig0Var.f27445f;
        ig0 ig0Var2 = this.f27093b;
        if (ig0Var2.f27445f == null) {
            ig0Var2.a();
        }
        float[] fArr2 = ig0Var2.f27445f;
        ig0 ig0Var3 = this.f27094c;
        if (ig0Var3.f27445f == null) {
            ig0Var3.a();
        }
        float[] fArr3 = ig0Var3.f27445f;
        ig0 ig0Var4 = this.d;
        if (ig0Var4.f27445f == null) {
            ig0Var4.a();
        }
        float[] fArr4 = ig0Var4.f27445f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27092a.b() && this.f27093b.b() && this.f27094c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
