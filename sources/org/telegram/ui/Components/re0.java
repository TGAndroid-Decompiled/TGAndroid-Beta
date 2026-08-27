package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class re0 {

    public final se0 f32143a = new se0();

    public final se0 f32144b = new se0();

    public final se0 f32145c = new se0();
    public final se0 d = new se0();

    public final ByteBuffer f32146e;

    public int f32147f;

    public re0() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(800);
        this.f32146e = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f32146e;
        byteBuffer.position(0);
        se0 se0Var = this.f32143a;
        if (se0Var.f32412f == null) {
            se0Var.a();
        }
        float[] fArr = se0Var.f32412f;
        se0 se0Var2 = this.f32144b;
        if (se0Var2.f32412f == null) {
            se0Var2.a();
        }
        float[] fArr2 = se0Var2.f32412f;
        se0 se0Var3 = this.f32145c;
        if (se0Var3.f32412f == null) {
            se0Var3.a();
        }
        float[] fArr3 = se0Var3.f32412f;
        se0 se0Var4 = this.d;
        if (se0Var4.f32412f == null) {
            se0Var4.a();
        }
        float[] fArr4 = se0Var4.f32412f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        return this.f32143a.b() && this.f32144b.b() && this.f32145c.b() && this.d.b();
    }
}
