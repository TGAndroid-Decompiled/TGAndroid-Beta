package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class ez0 extends TextureView {
    public static Boolean f33524f;
    public cz0 f33525a;
    public final yy0 f33526b;
    public final ArrayList f33527c;
    public Runnable d;
    public boolean f33528e;

    public ez0(Context context, Runnable runnable) {
        super(context);
        this.f33526b = new yy0(this, 0);
        this.f33527c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new x30(this, 1));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            org.telegram.messenger.g0.h3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f33524f == null) {
            f33524f = Boolean.valueOf(org.telegram.messenger.qp.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f33524f;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i7 = 0;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f33527c;
            if (i10 >= arrayList.size()) {
                break;
            }
            dz0 dz0Var = (dz0) arrayList.get(i10);
            if (dz0Var.f33230a == view) {
                Runnable runnable = dz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    dz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z9 = true;
            }
            i10++;
        }
        if (!z9) {
            cz0 cz0Var = this.f33525a;
            ArrayList arrayList2 = cz0Var.W;
            if (cz0Var.f32797b.get()) {
                Handler handler = cz0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        bz0 bz0Var = (bz0) arrayList2.get(i7);
                        if (bz0Var.f32446a.contains(view)) {
                            Runnable runnable2 = bz0Var.f32450f;
                            if (runnable2 != null) {
                                b(runnable2);
                                bz0Var.f32450f = null;
                            }
                            arrayList2.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    return;
                }
                handler.sendMessage(handler.obtainMessage(5, view));
            }
        }
    }
}
