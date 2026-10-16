package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class fg0 {
    public final gg0 f24725a = new gg0();
    public final gg0 f24726b = new gg0();
    public final gg0 f24727c = new gg0();
    public final gg0 d = new gg0();
    public final ByteBuffer e;
    public int f24728f;

    public fg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        gg0 gg0Var = this.f24725a;
        if (gg0Var.f24963f == null) {
            gg0Var.a();
        }
        float[] fArr = gg0Var.f24963f;
        gg0 gg0Var2 = this.f24726b;
        if (gg0Var2.f24963f == null) {
            gg0Var2.a();
        }
        float[] fArr2 = gg0Var2.f24963f;
        gg0 gg0Var3 = this.f24727c;
        if (gg0Var3.f24963f == null) {
            gg0Var3.a();
        }
        float[] fArr3 = gg0Var3.f24963f;
        gg0 gg0Var4 = this.d;
        if (gg0Var4.f24963f == null) {
            gg0Var4.a();
        }
        float[] fArr4 = gg0Var4.f24963f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f24725a.b() && this.f24726b.b() && this.f24727c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
