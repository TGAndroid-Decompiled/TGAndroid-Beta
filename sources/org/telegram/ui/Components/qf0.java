package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class qf0 {
    public final rf0 f27552a = new rf0();
    public final rf0 f27553b = new rf0();
    public final rf0 f27554c = new rf0();
    public final rf0 d = new rf0();
    public final ByteBuffer e;
    public int f27555f;

    public qf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        rf0 rf0Var = this.f27552a;
        if (rf0Var.f27947f == null) {
            rf0Var.a();
        }
        float[] fArr = rf0Var.f27947f;
        rf0 rf0Var2 = this.f27553b;
        if (rf0Var2.f27947f == null) {
            rf0Var2.a();
        }
        float[] fArr2 = rf0Var2.f27947f;
        rf0 rf0Var3 = this.f27554c;
        if (rf0Var3.f27947f == null) {
            rf0Var3.a();
        }
        float[] fArr3 = rf0Var3.f27947f;
        rf0 rf0Var4 = this.d;
        if (rf0Var4.f27947f == null) {
            rf0Var4.a();
        }
        float[] fArr4 = rf0Var4.f27947f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27552a.b() && this.f27553b.b() && this.f27554c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
