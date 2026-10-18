package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class t11 extends TextureView {
    public static Boolean f30429f;
    public r11 f30430a;
    public final o1.a f30431b;
    public final ArrayList f30432c;
    public Runnable d;
    public boolean e;

    public t11(Context context, Runnable runnable) {
        super(context);
        this.f30431b = new o1.a(this, 1);
        this.f30432c = new ArrayList();
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
        if (f30429f == null) {
            f30429f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f30429f;
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
            ArrayList arrayList = this.f30432c;
            if (i11 >= arrayList.size()) {
                break;
            }
            s11 s11Var = (s11) arrayList.get(i11);
            if (s11Var.f30142a == view) {
                Runnable runnable = s11Var.d;
                if (runnable != null) {
                    b(runnable);
                    s11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            r11 r11Var = this.f30430a;
            ArrayList arrayList2 = r11Var.W;
            if (r11Var.f29790b.get()) {
                Handler handler = r11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        q11 q11Var = (q11) arrayList2.get(i10);
                        if (q11Var.f29518a.contains(view)) {
                            Runnable runnable2 = q11Var.f29521f;
                            if (runnable2 != null) {
                                b(runnable2);
                                q11Var.f29521f = null;
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
