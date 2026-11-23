package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
public final class d61 extends l2.j {
    public final i61 d;

    public d61(Context context, i61 i61Var) {
        super(context);
        this.d = i61Var;
    }

    @Override
    public final n2.r0 a(Context context) {
        fi.y3 y3Var = new fi.y3(context, 1);
        ?? obj = new Object();
        obj.f22032f = this.d;
        ?? obj2 = new Object();
        obj2.f5620e = new float[0];
        obj2.f5617a = 3;
        obj2.d = new float[513];
        obj2.f5618b = new float[1024];
        obj2.f5619c = new float[1024];
        int[] iArr = new int[1024];
        obj2.f5621f = iArr;
        iArr[0] = 0;
        int i7 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) obj2.f5621f;
                iArr2[i11 + i10] = iArr2[i11] + i7;
            }
            i10 <<= 1;
            i7 >>= 1;
        }
        obj2.f5622g = new float[1024];
        obj2.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) obj2.f5622g)[i12] = (float) Math.sin(d);
            ((float[]) obj2.h)[i12] = (float) Math.cos(d);
        }
        obj.f22030c = obj2;
        obj.d = new float[1024];
        obj.f22028a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.f22031e = allocateDirect;
        allocateDirect.position(0);
        y3Var.d = new h6.m(new f2.n[]{new n2.y0(obj)});
        return y3Var.a();
    }
}
