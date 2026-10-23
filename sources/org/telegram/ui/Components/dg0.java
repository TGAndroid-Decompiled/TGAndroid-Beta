package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class dg0 {
    public final eg0 f25623a = new eg0();
    public final eg0 f25624b = new eg0();
    public final eg0 f25625c = new eg0();
    public final eg0 d = new eg0();
    public final ByteBuffer e;
    public int f25626f;

    public dg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        eg0 eg0Var = this.f25623a;
        if (eg0Var.f25970f == null) {
            eg0Var.a();
        }
        float[] fArr = eg0Var.f25970f;
        eg0 eg0Var2 = this.f25624b;
        if (eg0Var2.f25970f == null) {
            eg0Var2.a();
        }
        float[] fArr2 = eg0Var2.f25970f;
        eg0 eg0Var3 = this.f25625c;
        if (eg0Var3.f25970f == null) {
            eg0Var3.a();
        }
        float[] fArr3 = eg0Var3.f25970f;
        eg0 eg0Var4 = this.d;
        if (eg0Var4.f25970f == null) {
            eg0Var4.a();
        }
        float[] fArr4 = eg0Var4.f25970f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f25623a.b() && this.f25624b.b() && this.f25625c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
