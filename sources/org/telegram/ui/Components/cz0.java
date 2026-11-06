package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class cz0 extends TextureView {
    public static Boolean f32721f;
    public az0 f32722a;
    public final wy0 f32723b;
    public final ArrayList f32724c;
    public Runnable d;
    public boolean f32725e;

    public cz0(Context context, Runnable runnable) {
        super(context);
        this.f32723b = new wy0(this, 0);
        this.f32724c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new w30(this, 1));
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
        if (f32721f == null) {
            f32721f = Boolean.valueOf(org.telegram.messenger.qp.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f32721f;
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
            ArrayList arrayList = this.f32724c;
            if (i10 >= arrayList.size()) {
                break;
            }
            bz0 bz0Var = (bz0) arrayList.get(i10);
            if (bz0Var.f32339a == view) {
                Runnable runnable = bz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    bz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z9 = true;
            }
            i10++;
        }
        if (!z9) {
            az0 az0Var = this.f32722a;
            ArrayList arrayList2 = az0Var.W;
            if (az0Var.f31944b.get()) {
                Handler handler = az0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        zy0 zy0Var = (zy0) arrayList2.get(i7);
                        if (zy0Var.f41112a.contains(view)) {
                            Runnable runnable2 = zy0Var.f41116f;
                            if (runnable2 != null) {
                                b(runnable2);
                                zy0Var.f41116f = null;
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
