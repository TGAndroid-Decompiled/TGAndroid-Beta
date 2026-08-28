package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class d01 extends TextureView {
    public static Boolean f27619f;
    public b01 f27620a;
    public final o1.a f27621b;
    public final ArrayList f27622c;
    public Runnable d;
    public boolean f27623e;

    public d01(Context context, Runnable runnable) {
        super(context);
        this.f27621b = new o1.a(this, 1);
        this.f27622c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new dh.i(this, 3));
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
        if (f27619f == null) {
            f27619f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f27619f;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i9 = 0;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f27622c;
            if (i10 >= arrayList.size()) {
                break;
            }
            c01 c01Var = (c01) arrayList.get(i10);
            if (c01Var.f27327a == view) {
                Runnable runnable = c01Var.d;
                if (runnable != null) {
                    b(runnable);
                    c01Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            b01 b01Var = this.f27620a;
            ArrayList arrayList2 = b01Var.S;
            if (b01Var.f26955b.get()) {
                Handler handler = b01Var.getHandler();
                if (handler == null) {
                    while (i9 < arrayList2.size()) {
                        a01 a01Var = (a01) arrayList2.get(i9);
                        if (a01Var.f26593a.contains(view)) {
                            Runnable runnable2 = a01Var.f26597f;
                            if (runnable2 != null) {
                                b(runnable2);
                                a01Var.f26597f = null;
                            }
                            arrayList2.remove(i9);
                            i9--;
                        }
                        i9++;
                    }
                    return;
                }
                handler.sendMessage(handler.obtainMessage(5, view));
            }
        }
    }
}
