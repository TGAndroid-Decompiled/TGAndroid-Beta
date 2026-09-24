package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class pf0 {
    public final qf0 f27318a = new qf0();
    public final qf0 f27319b = new qf0();
    public final qf0 f27320c = new qf0();
    public final qf0 d = new qf0();
    public final ByteBuffer e;
    public int f27321f;

    public pf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        qf0 qf0Var = this.f27318a;
        if (qf0Var.f27602f == null) {
            qf0Var.a();
        }
        float[] fArr = qf0Var.f27602f;
        qf0 qf0Var2 = this.f27319b;
        if (qf0Var2.f27602f == null) {
            qf0Var2.a();
        }
        float[] fArr2 = qf0Var2.f27602f;
        qf0 qf0Var3 = this.f27320c;
        if (qf0Var3.f27602f == null) {
            qf0Var3.a();
        }
        float[] fArr3 = qf0Var3.f27602f;
        qf0 qf0Var4 = this.d;
        if (qf0Var4.f27602f == null) {
            qf0Var4.a();
        }
        float[] fArr4 = qf0Var4.f27602f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27318a.b() && this.f27319b.b() && this.f27320c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
