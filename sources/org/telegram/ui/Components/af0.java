package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class af0 {
    public final bf0 f26761a = new bf0();
    public final bf0 f26762b = new bf0();
    public final bf0 f26763c = new bf0();
    public final bf0 d = new bf0();
    public final ByteBuffer f26764e;
    public int f26765f;

    public af0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f26764e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f26764e;
        byteBuffer.position(0);
        bf0 bf0Var = this.f26761a;
        if (bf0Var.f27070f == null) {
            bf0Var.a();
        }
        float[] fArr = bf0Var.f27070f;
        bf0 bf0Var2 = this.f26762b;
        if (bf0Var2.f27070f == null) {
            bf0Var2.a();
        }
        float[] fArr2 = bf0Var2.f27070f;
        bf0 bf0Var3 = this.f26763c;
        if (bf0Var3.f27070f == null) {
            bf0Var3.a();
        }
        float[] fArr3 = bf0Var3.f27070f;
        bf0 bf0Var4 = this.d;
        if (bf0Var4.f27070f == null) {
            bf0Var4.a();
        }
        float[] fArr4 = bf0Var4.f27070f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f26761a.b() && this.f26762b.b() && this.f26763c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
