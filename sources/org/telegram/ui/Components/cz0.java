package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class cz0 extends TextureView {
    public static Boolean f32867f;
    public az0 f32868a;
    public final wy0 f32869b;
    public final ArrayList f32870c;
    public Runnable d;
    public boolean f32871e;

    public cz0(Context context, Runnable runnable) {
        super(context);
        this.f32869b = new wy0(this, 0);
        this.f32870c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new s30(this, 2));
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
        if (f32867f == null) {
            f32867f = Boolean.valueOf(org.telegram.messenger.hp.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f32867f;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i3 = 0;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f32870c;
            if (i10 >= arrayList.size()) {
                break;
            }
            bz0 bz0Var = (bz0) arrayList.get(i10);
            if (bz0Var.f32478a == view) {
                Runnable runnable = bz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    bz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            az0 az0Var = this.f32868a;
            ArrayList arrayList2 = az0Var.X;
            if (az0Var.f32008b.get()) {
                Handler handler = az0Var.getHandler();
                if (handler == null) {
                    while (i3 < arrayList2.size()) {
                        zy0 zy0Var = (zy0) arrayList2.get(i3);
                        if (zy0Var.f41170a.contains(view)) {
                            Runnable runnable2 = zy0Var.f41174f;
                            if (runnable2 != null) {
                                b(runnable2);
                                zy0Var.f41174f = null;
                            }
                            arrayList2.remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                    return;
                }
                handler.sendMessage(handler.obtainMessage(5, view));
            }
        }
    }
}
