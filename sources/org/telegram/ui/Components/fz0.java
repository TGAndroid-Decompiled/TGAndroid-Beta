package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class fz0 extends TextureView {
    public static Boolean f34754f;
    public dz0 f34755a;
    public final zy0 f34756b;
    public final ArrayList f34757c;
    public Runnable d;
    public boolean f34758e;

    public fz0(Context context, Runnable runnable) {
        super(context);
        this.f34756b = new zy0(this, 0);
        this.f34757c = new ArrayList();
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
        if (f34754f == null) {
            f34754f = Boolean.valueOf(org.telegram.messenger.np.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f34754f;
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
            ArrayList arrayList = this.f34757c;
            if (i10 >= arrayList.size()) {
                break;
            }
            ez0 ez0Var = (ez0) arrayList.get(i10);
            if (ez0Var.f34455a == view) {
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
            dz0 dz0Var = this.f34755a;
            ArrayList arrayList2 = dz0Var.X;
            if (dz0Var.f34110b.get()) {
                Handler handler = dz0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        cz0 cz0Var = (cz0) arrayList2.get(i7);
                        if (cz0Var.f33722a.contains(view)) {
                            Runnable runnable2 = cz0Var.f33726f;
                            if (runnable2 != null) {
                                b(runnable2);
                                cz0Var.f33726f = null;
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
