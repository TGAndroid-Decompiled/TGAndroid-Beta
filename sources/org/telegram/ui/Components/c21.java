package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class c21 extends TextureView {
    public static Boolean f25212f;
    public a21 f25213a;
    public final o1.a f25214b;
    public final ArrayList f25215c;
    public Runnable d;
    public boolean f25216e;

    public c21(Context context, Runnable runnable) {
        super(context);
        this.f25214b = new o1.a(this, 1);
        this.f25215c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new ki.d(this, 3));
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
        if (f25212f == null) {
            f25212f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f25212f;
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
            ArrayList arrayList = this.f25215c;
            if (i11 >= arrayList.size()) {
                break;
            }
            b21 b21Var = (b21) arrayList.get(i11);
            if (b21Var.f24853a == view) {
                Runnable runnable = b21Var.d;
                if (runnable != null) {
                    b(runnable);
                    b21Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            a21 a21Var = this.f25213a;
            ArrayList arrayList2 = a21Var.W;
            if (a21Var.f24546b.get()) {
                Handler handler = a21Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        z11 z11Var = (z11) arrayList2.get(i10);
                        if (z11Var.f33413a.contains(view)) {
                            Runnable runnable2 = z11Var.f33417f;
                            if (runnable2 != null) {
                                b(runnable2);
                                z11Var.f33417f = null;
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
