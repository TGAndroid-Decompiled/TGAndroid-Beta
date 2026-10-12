package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class eg0 {
    public final fg0 f24697a = new fg0();
    public final fg0 f24698b = new fg0();
    public final fg0 f24699c = new fg0();
    public final fg0 d = new fg0();
    public final ByteBuffer e;
    public int f24700f;

    public eg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        fg0 fg0Var = this.f24697a;
        if (fg0Var.f25030f == null) {
            fg0Var.a();
        }
        float[] fArr = fg0Var.f25030f;
        fg0 fg0Var2 = this.f24698b;
        if (fg0Var2.f25030f == null) {
            fg0Var2.a();
        }
        float[] fArr2 = fg0Var2.f25030f;
        fg0 fg0Var3 = this.f24699c;
        if (fg0Var3.f25030f == null) {
            fg0Var3.a();
        }
        float[] fArr3 = fg0Var3.f25030f;
        fg0 fg0Var4 = this.d;
        if (fg0Var4.f25030f == null) {
            fg0Var4.a();
        }
        float[] fArr4 = fg0Var4.f25030f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f24697a.b() && this.f24698b.b() && this.f24699c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
