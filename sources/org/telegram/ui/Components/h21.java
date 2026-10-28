package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class h21 extends TextureView {
    public static Boolean f28834f;
    public f21 f28835a;
    public final o1.a f28836b;
    public final ArrayList f28837c;
    public Runnable d;
    public boolean e;

    public h21(Context context, Runnable runnable) {
        super(context);
        this.f28836b = new o1.a(this, 1);
        this.f28837c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new v50(this, 2));
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
        if (f28834f == null) {
            f28834f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f28834f;
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
            ArrayList arrayList = this.f28837c;
            if (i11 >= arrayList.size()) {
                break;
            }
            g21 g21Var = (g21) arrayList.get(i11);
            if (g21Var.f28361a == view) {
                Runnable runnable = g21Var.d;
                if (runnable != null) {
                    b(runnable);
                    g21Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            f21 f21Var = this.f28835a;
            ArrayList arrayList2 = f21Var.W;
            if (f21Var.f27985b.get()) {
                Handler handler = f21Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        e21 e21Var = (e21) arrayList2.get(i10);
                        if (e21Var.f27659a.contains(view)) {
                            Runnable runnable2 = e21Var.f27662f;
                            if (runnable2 != null) {
                                b(runnable2);
                                e21Var.f27662f = null;
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
