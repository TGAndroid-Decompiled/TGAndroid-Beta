package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class lf0 {
    public final mf0 f28729a = new mf0();
    public final mf0 f28730b = new mf0();
    public final mf0 f28731c = new mf0();
    public final mf0 d = new mf0();
    public final ByteBuffer f28732e;
    public int f28733f;

    public lf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f28732e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f28732e;
        byteBuffer.position(0);
        mf0 mf0Var = this.f28729a;
        if (mf0Var.f29041f == null) {
            mf0Var.a();
        }
        float[] fArr = mf0Var.f29041f;
        mf0 mf0Var2 = this.f28730b;
        if (mf0Var2.f29041f == null) {
            mf0Var2.a();
        }
        float[] fArr2 = mf0Var2.f29041f;
        mf0 mf0Var3 = this.f28731c;
        if (mf0Var3.f29041f == null) {
            mf0Var3.a();
        }
        float[] fArr3 = mf0Var3.f29041f;
        mf0 mf0Var4 = this.d;
        if (mf0Var4.f29041f == null) {
            mf0Var4.a();
        }
        float[] fArr4 = mf0Var4.f29041f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f28729a.b() && this.f28730b.b() && this.f28731c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
