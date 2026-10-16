package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class z11 extends TextureView {
    public static Boolean f31423f;
    public x11 f31424a;
    public final o1.a f31425b;
    public final ArrayList f31426c;
    public Runnable d;
    public boolean e;

    public z11(Context context, Runnable runnable) {
        super(context);
        this.f31425b = new o1.a(this, 1);
        this.f31426c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new x50(this, 2));
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
        if (f31423f == null) {
            f31423f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f31423f;
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
            ArrayList arrayList = this.f31426c;
            if (i11 >= arrayList.size()) {
                break;
            }
            y11 y11Var = (y11) arrayList.get(i11);
            if (y11Var.f31111a == view) {
                Runnable runnable = y11Var.d;
                if (runnable != null) {
                    b(runnable);
                    y11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            x11 x11Var = this.f31424a;
            ArrayList arrayList2 = x11Var.W;
            if (x11Var.f30802b.get()) {
                Handler handler = x11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        w11 w11Var = (w11) arrayList2.get(i10);
                        if (w11Var.f30402a.contains(view)) {
                            Runnable runnable2 = w11Var.f30405f;
                            if (runnable2 != null) {
                                b(runnable2);
                                w11Var.f30405f = null;
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
