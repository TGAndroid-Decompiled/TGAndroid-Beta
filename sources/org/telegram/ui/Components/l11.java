package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class l11 extends TextureView {
    public static Boolean f25992f;
    public j11 f25993a;
    public final o1.a f25994b;
    public final ArrayList f25995c;
    public Runnable d;
    public boolean e;

    public l11(Context context, Runnable runnable) {
        super(context);
        this.f25994b = new o1.a(this, 1);
        this.f25995c = new ArrayList();
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
        if (f25992f == null) {
            f25992f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f25992f;
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
            ArrayList arrayList = this.f25995c;
            if (i11 >= arrayList.size()) {
                break;
            }
            k11 k11Var = (k11) arrayList.get(i11);
            if (k11Var.f25613a == view) {
                Runnable runnable = k11Var.d;
                if (runnable != null) {
                    b(runnable);
                    k11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            j11 j11Var = this.f25993a;
            ArrayList arrayList2 = j11Var.W;
            if (j11Var.f25168b.get()) {
                Handler handler = j11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        i11 i11Var = (i11) arrayList2.get(i10);
                        if (i11Var.f24833a.contains(view)) {
                            Runnable runnable2 = i11Var.f24836f;
                            if (runnable2 != null) {
                                b(runnable2);
                                i11Var.f24836f = null;
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
