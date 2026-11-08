package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class dz0 extends TextureView {
    public static Boolean f33138f;
    public bz0 f33139a;
    public final xy0 f33140b;
    public final ArrayList f33141c;
    public Runnable d;
    public boolean f33142e;

    public dz0(Context context, Runnable runnable) {
        super(context);
        this.f33140b = new xy0(this, 0);
        this.f33141c = new ArrayList();
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
        if (f33138f == null) {
            f33138f = Boolean.valueOf(org.telegram.messenger.qp.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f33138f;
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
            ArrayList arrayList = this.f33141c;
            if (i10 >= arrayList.size()) {
                break;
            }
            cz0 cz0Var = (cz0) arrayList.get(i10);
            if (cz0Var.f32737a == view) {
                Runnable runnable = cz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    cz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z9 = true;
            }
            i10++;
        }
        if (!z9) {
            bz0 bz0Var = this.f33139a;
            ArrayList arrayList2 = bz0Var.W;
            if (bz0Var.f32381b.get()) {
                Handler handler = bz0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        az0 az0Var = (az0) arrayList2.get(i7);
                        if (az0Var.f31952a.contains(view)) {
                            Runnable runnable2 = az0Var.f31956f;
                            if (runnable2 != null) {
                                b(runnable2);
                                az0Var.f31956f = null;
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
