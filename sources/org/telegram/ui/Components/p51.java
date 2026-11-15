package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
public final class p51 extends l2.j {
    public final u51 d;

    public p51(Context context, u51 u51Var) {
        super(context);
        this.d = u51Var;
    }

    @Override
    public final n2.r0 a(Context context) {
        fi.a4 a4Var = new fi.a4(context, 1);
        ?? obj = new Object();
        obj.f22202f = this.d;
        ?? obj2 = new Object();
        obj2.f5306e = new float[0];
        obj2.f5303a = 3;
        obj2.d = new float[513];
        obj2.f5304b = new float[1024];
        obj2.f5305c = new float[1024];
        int[] iArr = new int[1024];
        obj2.f5307f = iArr;
        iArr[0] = 0;
        int i7 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) obj2.f5307f;
                iArr2[i11 + i10] = iArr2[i11] + i7;
            }
            i10 <<= 1;
            i7 >>= 1;
        }
        obj2.f5308g = new float[1024];
        obj2.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) obj2.f5308g)[i12] = (float) Math.sin(d);
            ((float[]) obj2.h)[i12] = (float) Math.cos(d);
        }
        obj.f22200c = obj2;
        obj.d = new float[1024];
        obj.f22198a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.f22201e = allocateDirect;
        allocateDirect.position(0);
        a4Var.d = new h6.m(new f2.m[]{new n2.y0(obj)});
        return a4Var.a();
    }
}
