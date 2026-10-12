package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class i21 extends TextureView {
    public static Boolean f27020f;
    public g21 f27021a;
    public final o1.a f27022b;
    public final ArrayList f27023c;
    public Runnable d;
    public boolean f27024e;

    public i21(Context context, Runnable runnable) {
        super(context);
        this.f27022b = new o1.a(this, 1);
        this.f27023c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new e60(this, 2));
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
        if (f27020f == null) {
            f27020f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f27020f;
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
            ArrayList arrayList = this.f27023c;
            if (i11 >= arrayList.size()) {
                break;
            }
            h21 h21Var = (h21) arrayList.get(i11);
            if (h21Var.f26615a == view) {
                Runnable runnable = h21Var.d;
                if (runnable != null) {
                    b(runnable);
                    h21Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            g21 g21Var = this.f27021a;
            ArrayList arrayList2 = g21Var.W;
            if (g21Var.f26232b.get()) {
                Handler handler = g21Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        f21 f21Var = (f21) arrayList2.get(i10);
                        if (f21Var.f25846a.contains(view)) {
                            Runnable runnable2 = f21Var.f25850f;
                            if (runnable2 != null) {
                                b(runnable2);
                                f21Var.f25850f = null;
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
