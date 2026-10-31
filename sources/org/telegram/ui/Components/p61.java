package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
public final class p61 extends i2.j {
    public final u61 d;

    public p61(Context context, u61 u61Var) {
        super(context);
        this.d = u61Var;
    }

    @Override
    public final k2.w0 a(Context context) {
        k2.t0 t0Var = new k2.t0(context, 0);
        ?? obj = new Object();
        obj.f3333f = this.d;
        ?? obj2 = new Object();
        obj2.e = new float[0];
        obj2.f16551a = 3;
        obj2.d = new float[513];
        obj2.f16552b = new float[1024];
        obj2.f16553c = new float[1024];
        int[] iArr = new int[1024];
        obj2.h = iArr;
        iArr[0] = 0;
        int i10 = 512;
        int i11 = 1;
        while (i11 < 1024) {
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = (int[]) obj2.h;
                iArr2[i12 + i11] = iArr2[i12] + i10;
            }
            i11 <<= 1;
            i10 >>= 1;
        }
        obj2.f16554f = new float[1024];
        obj2.f16555g = new float[1024];
        for (int i13 = 0; i13 < 1024; i13++) {
            double d = (-3.1415927f) / i13;
            ((float[]) obj2.f16554f)[i13] = (float) Math.sin(d);
            ((float[]) obj2.f16555g)[i13] = (float) Math.cos(d);
        }
        obj.f3332c = obj2;
        obj.d = new float[1024];
        obj.f3330a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.e = allocateDirect;
        allocateDirect.position(0);
        t0Var.d = new android.support.v4.media.session.a0(new c2.m[]{new k2.d1(obj)});
        return t0Var.a();
    }
}
