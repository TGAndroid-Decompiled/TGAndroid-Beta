package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class pf0 {
    public final qf0 f27332a = new qf0();
    public final qf0 f27333b = new qf0();
    public final qf0 f27334c = new qf0();
    public final qf0 d = new qf0();
    public final ByteBuffer e;
    public int f27335f;

    public pf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        qf0 qf0Var = this.f27332a;
        if (qf0Var.f27608f == null) {
            qf0Var.a();
        }
        float[] fArr = qf0Var.f27608f;
        qf0 qf0Var2 = this.f27333b;
        if (qf0Var2.f27608f == null) {
            qf0Var2.a();
        }
        float[] fArr2 = qf0Var2.f27608f;
        qf0 qf0Var3 = this.f27334c;
        if (qf0Var3.f27608f == null) {
            qf0Var3.a();
        }
        float[] fArr3 = qf0Var3.f27608f;
        qf0 qf0Var4 = this.d;
        if (qf0Var4.f27608f == null) {
            qf0Var4.a();
        }
        float[] fArr4 = qf0Var4.f27608f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27332a.b() && this.f27333b.b() && this.f27334c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
