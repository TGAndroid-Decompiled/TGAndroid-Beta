package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class p01 extends TextureView {
    public static Boolean f31532f;
    public n01 f31533a;
    public final o1.b f31534b;
    public final ArrayList f31535c;
    public Runnable d;
    public boolean f31536e;

    public p01(Context context, Runnable runnable) {
        super(context);
        this.f31534b = new o1.b(this, 1);
        this.f31535c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new gh.h(this, 3));
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
        if (f31532f == null) {
            f31532f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f31532f;
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
            ArrayList arrayList = this.f31535c;
            if (i11 >= arrayList.size()) {
                break;
            }
            o01 o01Var = (o01) arrayList.get(i11);
            if (o01Var.f31216a == view) {
                Runnable runnable = o01Var.d;
                if (runnable != null) {
                    b(runnable);
                    o01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            n01 n01Var = this.f31533a;
            ArrayList arrayList2 = n01Var.S;
            if (n01Var.f30801b.get()) {
                Handler handler = n01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        m01 m01Var = (m01) arrayList2.get(i10);
                        if (m01Var.f30498a.contains(view)) {
                            Runnable runnable2 = m01Var.f30502f;
                            if (runnable2 != null) {
                                b(runnable2);
                                m01Var.f30502f = null;
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
