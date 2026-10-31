package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class h01 extends TextureView {
    public static Boolean f26573f;
    public f01 f26574a;
    public final o1.a f26575b;
    public final ArrayList f26576c;
    public Runnable d;
    public boolean e;

    public h01(Context context, Runnable runnable) {
        super(context);
        this.f26575b = new o1.a(this, 1);
        this.f26576c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new li.e(this, 4));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            org.telegram.messenger.i0.g3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f26573f == null) {
            f26573f = Boolean.valueOf(org.telegram.messenger.vp.d1().getBoolean("nothanos", false));
        }
        Boolean bool = f26573f;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f26576c;
            if (i11 >= arrayList.size()) {
                break;
            }
            g01 g01Var = (g01) arrayList.get(i11);
            if (g01Var.f26206a == view) {
                Runnable runnable = g01Var.d;
                if (runnable != null) {
                    b(runnable);
                    g01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            f01 f01Var = this.f26574a;
            ArrayList arrayList2 = f01Var.W;
            if (f01Var.f25916b.get()) {
                Handler handler = f01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        e01 e01Var = (e01) arrayList2.get(i10);
                        if (e01Var.f25583a.contains(view)) {
                            Runnable runnable2 = e01Var.f25586f;
                            if (runnable2 != null) {
                                b(runnable2);
                                e01Var.f25586f = null;
                            }
                            arrayList2.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    return;
                }
                handler.sendMessage(handler.obtainMessage(5, view));
            }
        }
    }
}
