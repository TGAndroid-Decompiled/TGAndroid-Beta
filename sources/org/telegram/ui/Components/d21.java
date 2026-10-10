package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class d21 extends TextureView {
    public static Boolean f25527f;
    public b21 f25528a;
    public final o1.a f25529b;
    public final ArrayList f25530c;
    public Runnable d;
    public boolean f25531e;

    public d21(Context context, Runnable runnable) {
        super(context);
        this.f25529b = new o1.a(this, 1);
        this.f25530c = new ArrayList();
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
        if (f25527f == null) {
            f25527f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f25527f;
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
            ArrayList arrayList = this.f25530c;
            if (i11 >= arrayList.size()) {
                break;
            }
            c21 c21Var = (c21) arrayList.get(i11);
            if (c21Var.f25137a == view) {
                Runnable runnable = c21Var.d;
                if (runnable != null) {
                    b(runnable);
                    c21Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            b21 b21Var = this.f25528a;
            ArrayList arrayList2 = b21Var.W;
            if (b21Var.f24814b.get()) {
                Handler handler = b21Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        a21 a21Var = (a21) arrayList2.get(i10);
                        if (a21Var.f24429a.contains(view)) {
                            Runnable runnable2 = a21Var.f24433f;
                            if (runnable2 != null) {
                                b(runnable2);
                                a21Var.f24433f = null;
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
