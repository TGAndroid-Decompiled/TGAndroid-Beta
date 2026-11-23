package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class oz0 extends TextureView {
    public static Boolean f38379f;
    public mz0 f38380a;
    public final iz0 f38381b;
    public final ArrayList f38382c;
    public Runnable d;
    public boolean f38383e;

    public oz0(Context context, Runnable runnable) {
        super(context);
        this.f38381b = new iz0(this, 0);
        this.f38382c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new k40(this, 1));
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
        if (f38379f == null) {
            f38379f = Boolean.valueOf(org.telegram.messenger.np.g1().getBoolean("nothanos", false));
        }
        Boolean bool = f38379f;
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
            ArrayList arrayList = this.f38382c;
            if (i10 >= arrayList.size()) {
                break;
            }
            nz0 nz0Var = (nz0) arrayList.get(i10);
            if (nz0Var.f37986a == view) {
                Runnable runnable = nz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    nz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            mz0 mz0Var = this.f38380a;
            ArrayList arrayList2 = mz0Var.X;
            if (mz0Var.f37624b.get()) {
                Handler handler = mz0Var.getHandler();
                if (handler == null) {
                    while (i7 < arrayList2.size()) {
                        lz0 lz0Var = (lz0) arrayList2.get(i7);
                        if (lz0Var.f37291a.contains(view)) {
                            Runnable runnable2 = lz0Var.f37295f;
                            if (runnable2 != null) {
                                b(runnable2);
                                lz0Var.f37295f = null;
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
