package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class fz0 extends TextureView {
    public static Boolean f34758f;
    public dz0 f34759a;
    public final zy0 f34760b;
    public final ArrayList f34761c;
    public Runnable d;
    public boolean f34762e;

    public fz0(Context context, Runnable runnable) {
        super(context);
        this.f34760b = new zy0(this, 0);
        this.f34761c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new z30(this, 1));
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
        if (f34758f == null) {
            f34758f = Boolean.valueOf(org.telegram.messenger.np.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f34758f;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i7 = 0;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f34761c;
            if (i10 >= arrayList.size()) {
                break;
            }
            ez0 ez0Var = (ez0) arrayList.get(i10);
            if (ez0Var.f34454a == view) {
                Runnable runnable = ez0Var.d;
                if (runnable != null) {
                    b(runnable);
                    ez0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            dz0 dz0Var = this.f34759a;
            ArrayList arrayList2 = dz0Var.X;
            if (dz0Var.f34097b.get()) {
                Handler handler = dz0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        cz0 cz0Var = (cz0) arrayList2.get(i7);
                        if (cz0Var.f33724a.contains(view)) {
                            Runnable runnable2 = cz0Var.f33728f;
                            if (runnable2 != null) {
                                b(runnable2);
                                cz0Var.f33728f = null;
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
