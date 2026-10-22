package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class v11 extends TextureView {
    public static Boolean f31117f;
    public t11 f31118a;
    public final o1.a f31119b;
    public final ArrayList f31120c;
    public Runnable d;
    public boolean e;

    public v11(Context context, Runnable runnable) {
        super(context);
        this.f31119b = new o1.a(this, 1);
        this.f31120c = new ArrayList();
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
        if (f31117f == null) {
            f31117f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f31117f;
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
            ArrayList arrayList = this.f31120c;
            if (i11 >= arrayList.size()) {
                break;
            }
            u11 u11Var = (u11) arrayList.get(i11);
            if (u11Var.f30817a == view) {
                Runnable runnable = u11Var.d;
                if (runnable != null) {
                    b(runnable);
                    u11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            t11 t11Var = this.f31118a;
            ArrayList arrayList2 = t11Var.W;
            if (t11Var.f30395b.get()) {
                Handler handler = t11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        s11 s11Var = (s11) arrayList2.get(i10);
                        if (s11Var.f30118a.contains(view)) {
                            Runnable runnable2 = s11Var.f30121f;
                            if (runnable2 != null) {
                                b(runnable2);
                                s11Var.f30121f = null;
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
