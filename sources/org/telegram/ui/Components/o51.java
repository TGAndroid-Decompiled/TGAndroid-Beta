package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
public final class o51 extends l2.j {
    public final u51 d;

    public o51(Context context, u51 u51Var) {
        super(context);
        this.d = u51Var;
    }

    @Override
    public final n2.q0 a(Context context) {
        di.i4 i4Var = new di.i4(context, 1);
        ?? obj = new Object();
        obj.f18485f = this.d;
        ?? obj2 = new Object();
        obj2.f1589e = new float[0];
        obj2.f1586a = 3;
        obj2.d = new float[513];
        obj2.f1587b = new float[1024];
        obj2.f1588c = new float[1024];
        int[] iArr = new int[1024];
        obj2.f1590f = iArr;
        iArr[0] = 0;
        int i7 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) obj2.f1590f;
                iArr2[i11 + i10] = iArr2[i11] + i7;
            }
            i10 <<= 1;
            i7 >>= 1;
        }
        obj2.f1591g = new float[1024];
        obj2.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) obj2.f1591g)[i12] = (float) Math.sin(d);
            ((float[]) obj2.h)[i12] = (float) Math.cos(d);
        }
        obj.f18483c = obj2;
        obj.d = new float[1024];
        obj.f18481a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.f18484e = allocateDirect;
        allocateDirect.position(0);
        i4Var.d = new h6.m(new f2.n[]{new n2.x0(obj)});
        return i4Var.a();
    }
}
