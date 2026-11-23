package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
public final class c61 extends l2.k {
    public final h61 d;

    public c61(Context context, h61 h61Var) {
        super(context);
        this.d = h61Var;
    }

    @Override
    public final n2.s0 a(Context context) {
        fi.y3 y3Var = new fi.y3(context, 1);
        ?? obj = new Object();
        obj.f22098f = this.d;
        ?? obj2 = new Object();
        obj2.f5583e = new float[0];
        obj2.f5580a = 3;
        obj2.d = new float[513];
        obj2.f5581b = new float[1024];
        obj2.f5582c = new float[1024];
        int[] iArr = new int[1024];
        obj2.f5584f = iArr;
        iArr[0] = 0;
        int i7 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) obj2.f5584f;
                iArr2[i11 + i10] = iArr2[i11] + i7;
            }
            i10 <<= 1;
            i7 >>= 1;
        }
        obj2.f5585g = new float[1024];
        obj2.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) obj2.f5585g)[i12] = (float) Math.sin(d);
            ((float[]) obj2.h)[i12] = (float) Math.cos(d);
        }
        obj.f22096c = obj2;
        obj.d = new float[1024];
        obj.f22094a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.f22097e = allocateDirect;
        allocateDirect.position(0);
        y3Var.d = new h6.m(new f2.n[]{new n2.z0(obj)});
        return y3Var.a();
    }
}
