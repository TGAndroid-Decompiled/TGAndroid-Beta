package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class a11 extends TextureView {
    public static Boolean f23261f;
    public y01 f23262a;
    public final o1.a f23263b;
    public final ArrayList f23264c;
    public Runnable d;
    public boolean e;

    public a11(Context context, Runnable runnable) {
        super(context);
        this.f23263b = new o1.a(this, 1);
        this.f23264c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new ih.h(this, 3));
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
        if (f23261f == null) {
            f23261f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f23261f;
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
            ArrayList arrayList = this.f23264c;
            if (i11 >= arrayList.size()) {
                break;
            }
            z01 z01Var = (z01) arrayList.get(i11);
            if (z01Var.f31197a == view) {
                Runnable runnable = z01Var.d;
                if (runnable != null) {
                    b(runnable);
                    z01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z4 = true;
            }
            i11++;
        }
        if (!z4) {
            y01 y01Var = this.f23262a;
            ArrayList arrayList2 = y01Var.T;
            if (y01Var.f30811b.get()) {
                Handler handler = y01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        x01 x01Var = (x01) arrayList2.get(i10);
                        if (x01Var.f30468a.contains(view)) {
                            Runnable runnable2 = x01Var.f30471f;
                            if (runnable2 != null) {
                                b(runnable2);
                                x01Var.f30471f = null;
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
