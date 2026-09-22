package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class n11 extends TextureView {
    public static Boolean f26592f;
    public l11 f26593a;
    public final o1.a f26594b;
    public final ArrayList f26595c;
    public Runnable d;
    public boolean e;

    public n11(Context context, Runnable runnable) {
        super(context);
        this.f26594b = new o1.a(this, 1);
        this.f26595c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new ki.c(this, 3));
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
        if (f26592f == null) {
            f26592f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f26592f;
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
            ArrayList arrayList = this.f26595c;
            if (i11 >= arrayList.size()) {
                break;
            }
            m11 m11Var = (m11) arrayList.get(i11);
            if (m11Var.f26278a == view) {
                Runnable runnable = m11Var.d;
                if (runnable != null) {
                    b(runnable);
                    m11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            l11 l11Var = this.f26593a;
            ArrayList arrayList2 = l11Var.W;
            if (l11Var.f25950b.get()) {
                Handler handler = l11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        k11 k11Var = (k11) arrayList2.get(i10);
                        if (k11Var.f25563a.contains(view)) {
                            Runnable runnable2 = k11Var.f25566f;
                            if (runnable2 != null) {
                                b(runnable2);
                                k11Var.f25566f = null;
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
