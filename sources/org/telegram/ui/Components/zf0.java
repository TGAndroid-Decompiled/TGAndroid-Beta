package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class zf0 {
    public final ag0 f32892a = new ag0();
    public final ag0 f32893b = new ag0();
    public final ag0 f32894c = new ag0();
    public final ag0 d = new ag0();
    public final ByteBuffer e;
    public int f32895f;

    public zf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        ag0 ag0Var = this.f32892a;
        if (ag0Var.f24595f == null) {
            ag0Var.a();
        }
        float[] fArr = ag0Var.f24595f;
        ag0 ag0Var2 = this.f32893b;
        if (ag0Var2.f24595f == null) {
            ag0Var2.a();
        }
        float[] fArr2 = ag0Var2.f24595f;
        ag0 ag0Var3 = this.f32894c;
        if (ag0Var3.f24595f == null) {
            ag0Var3.a();
        }
        float[] fArr3 = ag0Var3.f24595f;
        ag0 ag0Var4 = this.d;
        if (ag0Var4.f24595f == null) {
            ag0Var4.a();
        }
        float[] fArr4 = ag0Var4.f24595f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f32892a.b() && this.f32893b.b() && this.f32894c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
