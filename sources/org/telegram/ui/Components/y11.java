package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class y11 extends TextureView {
    public static Boolean f31450f;
    public w11 f31451a;
    public final o1.a f31452b;
    public final ArrayList f31453c;
    public Runnable d;
    public boolean e;

    public y11(Context context, Runnable runnable) {
        super(context);
        this.f31452b = new o1.a(this, 1);
        this.f31453c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new li.e(this, 3));
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
        if (f31450f == null) {
            f31450f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f31450f;
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
            ArrayList arrayList = this.f31453c;
            if (i11 >= arrayList.size()) {
                break;
            }
            x11 x11Var = (x11) arrayList.get(i11);
            if (x11Var.f31108a == view) {
                Runnable runnable = x11Var.d;
                if (runnable != null) {
                    b(runnable);
                    x11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            w11 w11Var = this.f31451a;
            ArrayList arrayList2 = w11Var.W;
            if (w11Var.f30739b.get()) {
                Handler handler = w11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        v11 v11Var = (v11) arrayList2.get(i10);
                        if (v11Var.f29833a.contains(view)) {
                            Runnable runnable2 = v11Var.f29836f;
                            if (runnable2 != null) {
                                b(runnable2);
                                v11Var.f29836f = null;
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
