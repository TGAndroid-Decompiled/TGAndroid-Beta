package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
public final class h51 extends k2.j {
    public final m51 d;

    public h51(Context context, m51 m51Var) {
        super(context);
        this.d = m51Var;
    }

    @Override
    public final m2.s0 a(Context context) {
        ei.i4 i4Var = new ei.i4(context, 1);
        ?? obj = new Object();
        obj.f19553f = this.d;
        ?? obj2 = new Object();
        obj2.f3686e = new float[0];
        obj2.f3683a = 3;
        obj2.d = new float[513];
        obj2.f3684b = new float[1024];
        obj2.f3685c = new float[1024];
        int[] iArr = new int[1024];
        obj2.f3687f = iArr;
        iArr[0] = 0;
        int i3 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) obj2.f3687f;
                iArr2[i11 + i10] = iArr2[i11] + i3;
            }
            i10 <<= 1;
            i3 >>= 1;
        }
        obj2.f3688g = new float[1024];
        obj2.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) obj2.f3688g)[i12] = (float) Math.sin(d);
            ((float[]) obj2.h)[i12] = (float) Math.cos(d);
        }
        obj.f19551c = obj2;
        obj.d = new float[1024];
        obj.f19549a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.f19552e = allocateDirect;
        allocateDirect.position(0);
        i4Var.d = new k4.j(new m2.z0(obj));
        return i4Var.a();
    }
}
