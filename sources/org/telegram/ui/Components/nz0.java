package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class nz0 extends TextureView {
    public static Boolean f37960f;
    public lz0 f37961a;
    public final hz0 f37962b;
    public final ArrayList f37963c;
    public Runnable d;
    public boolean f37964e;

    public nz0(Context context, Runnable runnable) {
        super(context);
        this.f37962b = new hz0(this, 0);
        this.f37963c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new h40(this, 1));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            org.telegram.messenger.g0.g3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f37960f == null) {
            f37960f = Boolean.valueOf(org.telegram.messenger.mp.g1().getBoolean("nothanos", false));
        }
        Boolean bool = f37960f;
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
            ArrayList arrayList = this.f37963c;
            if (i10 >= arrayList.size()) {
                break;
            }
            mz0 mz0Var = (mz0) arrayList.get(i10);
            if (mz0Var.f37596a == view) {
                Runnable runnable = mz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    mz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            lz0 lz0Var = this.f37961a;
            ArrayList arrayList2 = lz0Var.X;
            if (lz0Var.f37268b.get()) {
                Handler handler = lz0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        kz0 kz0Var = (kz0) arrayList2.get(i7);
                        if (kz0Var.f36930a.contains(view)) {
                            Runnable runnable2 = kz0Var.f36934f;
                            if (runnable2 != null) {
                                b(runnable2);
                                kz0Var.f36934f = null;
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
