package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class m11 extends TextureView {
    public static Boolean f26278f;
    public k11 f26279a;
    public final o1.a f26280b;
    public final ArrayList f26281c;
    public Runnable d;
    public boolean e;

    public m11(Context context, Runnable runnable) {
        super(context);
        this.f26280b = new o1.a(this, 1);
        this.f26281c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new ki.c(this, 3));
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
        if (f26278f == null) {
            f26278f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f26278f;
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
            ArrayList arrayList = this.f26281c;
            if (i11 >= arrayList.size()) {
                break;
            }
            l11 l11Var = (l11) arrayList.get(i11);
            if (l11Var.f25987a == view) {
                Runnable runnable = l11Var.d;
                if (runnable != null) {
                    b(runnable);
                    l11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            k11 k11Var = this.f26279a;
            ArrayList arrayList2 = k11Var.W;
            if (k11Var.f25531b.get()) {
                Handler handler = k11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        j11 j11Var = (j11) arrayList2.get(i10);
                        if (j11Var.f25100a.contains(view)) {
                            Runnable runnable2 = j11Var.f25103f;
                            if (runnable2 != null) {
                                b(runnable2);
                                j11Var.f25103f = null;
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
