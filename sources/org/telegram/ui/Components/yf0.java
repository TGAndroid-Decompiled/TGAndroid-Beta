package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class yf0 {
    public final zf0 f32619a = new zf0();
    public final zf0 f32620b = new zf0();
    public final zf0 f32621c = new zf0();
    public final zf0 d = new zf0();
    public final ByteBuffer e;
    public int f32622f;

    public yf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        zf0 zf0Var = this.f32619a;
        if (zf0Var.f32898f == null) {
            zf0Var.a();
        }
        float[] fArr = zf0Var.f32898f;
        zf0 zf0Var2 = this.f32620b;
        if (zf0Var2.f32898f == null) {
            zf0Var2.a();
        }
        float[] fArr2 = zf0Var2.f32898f;
        zf0 zf0Var3 = this.f32621c;
        if (zf0Var3.f32898f == null) {
            zf0Var3.a();
        }
        float[] fArr3 = zf0Var3.f32898f;
        zf0 zf0Var4 = this.d;
        if (zf0Var4.f32898f == null) {
            zf0Var4.a();
        }
        float[] fArr4 = zf0Var4.f32898f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f32619a.b() && this.f32620b.b() && this.f32621c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
