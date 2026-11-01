package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class i01 extends TextureView {
    public static Boolean f26975f;
    public g01 f26976a;
    public final o1.a f26977b;
    public final ArrayList f26978c;
    public Runnable d;
    public boolean e;

    public i01(Context context, Runnable runnable) {
        super(context);
        this.f26977b = new o1.a(this, 1);
        this.f26978c = new ArrayList();
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
        if (f26975f == null) {
            f26975f = Boolean.valueOf(org.telegram.messenger.wp.d1().getBoolean("nothanos", false));
        }
        Boolean bool = f26975f;
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
            ArrayList arrayList = this.f26978c;
            if (i11 >= arrayList.size()) {
                break;
            }
            h01 h01Var = (h01) arrayList.get(i11);
            if (h01Var.f26619a == view) {
                Runnable runnable = h01Var.d;
                if (runnable != null) {
                    b(runnable);
                    h01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            g01 g01Var = this.f26976a;
            ArrayList arrayList2 = g01Var.W;
            if (g01Var.f26268b.get()) {
                Handler handler = g01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        f01 f01Var = (f01) arrayList2.get(i10);
                        if (f01Var.f25996a.contains(view)) {
                            Runnable runnable2 = f01Var.f25999f;
                            if (runnable2 != null) {
                                b(runnable2);
                                f01Var.f25999f = null;
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
