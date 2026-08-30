package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class jf0 {
    public final kf0 f25969a = new kf0();
    public final kf0 f25970b = new kf0();
    public final kf0 f25971c = new kf0();
    public final kf0 d = new kf0();
    public final ByteBuffer e;
    public int f25972f;

    public jf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        kf0 kf0Var = this.f25969a;
        if (kf0Var.f26263f == null) {
            kf0Var.a();
        }
        float[] fArr = kf0Var.f26263f;
        kf0 kf0Var2 = this.f25970b;
        if (kf0Var2.f26263f == null) {
            kf0Var2.a();
        }
        float[] fArr2 = kf0Var2.f26263f;
        kf0 kf0Var3 = this.f25971c;
        if (kf0Var3.f26263f == null) {
            kf0Var3.a();
        }
        float[] fArr3 = kf0Var3.f26263f;
        kf0 kf0Var4 = this.d;
        if (kf0Var4.f26263f == null) {
            kf0Var4.a();
        }
        float[] fArr4 = kf0Var4.f26263f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f25969a.b() && this.f25970b.b() && this.f25971c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
