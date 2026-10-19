package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class u11 extends TextureView {
    public static Boolean f30861f;
    public s11 f30862a;
    public final o1.a f30863b;
    public final ArrayList f30864c;
    public Runnable d;
    public boolean e;

    public u11(Context context, Runnable runnable) {
        super(context);
        this.f30863b = new o1.a(this, 1);
        this.f30864c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new t50(this, 2));
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
        if (f30861f == null) {
            f30861f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f30861f;
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
            ArrayList arrayList = this.f30864c;
            if (i11 >= arrayList.size()) {
                break;
            }
            t11 t11Var = (t11) arrayList.get(i11);
            if (t11Var.f30384a == view) {
                Runnable runnable = t11Var.d;
                if (runnable != null) {
                    b(runnable);
                    t11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            s11 s11Var = this.f30862a;
            ArrayList arrayList2 = s11Var.W;
            if (s11Var.f30122b.get()) {
                Handler handler = s11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        r11 r11Var = (r11) arrayList2.get(i10);
                        if (r11Var.f29774a.contains(view)) {
                            Runnable runnable2 = r11Var.f29777f;
                            if (runnable2 != null) {
                                b(runnable2);
                                r11Var.f29777f = null;
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
