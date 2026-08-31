package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class b11 extends TextureView {
    public static Boolean f25454f;
    public z01 f25455a;
    public final o1.a f25456b;
    public final ArrayList f25457c;
    public Runnable d;
    public boolean f25458e;

    public b11(Context context, Runnable runnable) {
        super(context);
        this.f25456b = new o1.a(this, 1);
        this.f25457c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new jh.h(this, 3));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f25454f == null) {
            f25454f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f25454f;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f25457c;
            if (i11 >= arrayList.size()) {
                break;
            }
            a11 a11Var = (a11) arrayList.get(i11);
            if (a11Var.f25113a == view) {
                Runnable runnable = a11Var.d;
                if (runnable != null) {
                    b(runnable);
                    a11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z4 = true;
            }
            i11++;
        }
        if (!z4) {
            z01 z01Var = this.f25455a;
            ArrayList arrayList2 = z01Var.T;
            if (z01Var.f33678b.get()) {
                Handler handler = z01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        y01 y01Var = (y01) arrayList2.get(i10);
                        if (y01Var.f33236a.contains(view)) {
                            Runnable runnable2 = y01Var.f33240f;
                            if (runnable2 != null) {
                                b(runnable2);
                                y01Var.f33240f = null;
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
