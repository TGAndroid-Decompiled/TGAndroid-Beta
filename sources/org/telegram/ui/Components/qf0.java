package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class qf0 {
    public final rf0 f27663a = new rf0();
    public final rf0 f27664b = new rf0();
    public final rf0 f27665c = new rf0();
    public final rf0 d = new rf0();
    public final ByteBuffer e;
    public int f27666f;

    public qf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        rf0 rf0Var = this.f27663a;
        if (rf0Var.f27906f == null) {
            rf0Var.a();
        }
        float[] fArr = rf0Var.f27906f;
        rf0 rf0Var2 = this.f27664b;
        if (rf0Var2.f27906f == null) {
            rf0Var2.a();
        }
        float[] fArr2 = rf0Var2.f27906f;
        rf0 rf0Var3 = this.f27665c;
        if (rf0Var3.f27906f == null) {
            rf0Var3.a();
        }
        float[] fArr3 = rf0Var3.f27906f;
        rf0 rf0Var4 = this.d;
        if (rf0Var4.f27906f == null) {
            rf0Var4.a();
        }
        float[] fArr4 = rf0Var4.f27906f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27663a.b() && this.f27664b.b() && this.f27665c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
