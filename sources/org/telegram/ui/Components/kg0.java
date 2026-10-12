package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class kg0 {
    public final lg0 f27852a = new lg0();
    public final lg0 f27853b = new lg0();
    public final lg0 f27854c = new lg0();
    public final lg0 d = new lg0();
    public final ByteBuffer f27855e;
    public int f27856f;

    public kg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f27855e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f27855e;
        byteBuffer.position(0);
        lg0 lg0Var = this.f27852a;
        if (lg0Var.f28193f == null) {
            lg0Var.a();
        }
        float[] fArr = lg0Var.f28193f;
        lg0 lg0Var2 = this.f27853b;
        if (lg0Var2.f28193f == null) {
            lg0Var2.a();
        }
        float[] fArr2 = lg0Var2.f28193f;
        lg0 lg0Var3 = this.f27854c;
        if (lg0Var3.f28193f == null) {
            lg0Var3.a();
        }
        float[] fArr3 = lg0Var3.f28193f;
        lg0 lg0Var4 = this.d;
        if (lg0Var4.f28193f == null) {
            lg0Var4.a();
        }
        float[] fArr4 = lg0Var4.f28193f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        if (this.f27852a.b() && this.f27853b.b() && this.f27854c.b() && this.d.b()) {
            return true;
        }
        return false;
    }
}
