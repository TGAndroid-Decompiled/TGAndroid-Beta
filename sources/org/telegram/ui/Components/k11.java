package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class k11 extends TextureView {
    public static Boolean f24561f;
    public i11 f24562a;
    public final o1.a f24563b;
    public final ArrayList f24564c;
    public Runnable d;
    public boolean e;

    public k11(Context context, Runnable runnable) {
        super(context);
        this.f24563b = new o1.a(this, 1);
        this.f24564c = new ArrayList();
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
        if (f24561f == null) {
            f24561f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f24561f;
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
            ArrayList arrayList = this.f24564c;
            if (i11 >= arrayList.size()) {
                break;
            }
            j11 j11Var = (j11) arrayList.get(i11);
            if (j11Var.f24185a == view) {
                Runnable runnable = j11Var.d;
                if (runnable != null) {
                    b(runnable);
                    j11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            i11 i11Var = this.f24562a;
            ArrayList arrayList2 = i11Var.W;
            if (i11Var.f23862b.get()) {
                Handler handler = i11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        h11 h11Var = (h11) arrayList2.get(i10);
                        if (h11Var.f23470a.contains(view)) {
                            Runnable runnable2 = h11Var.f23473f;
                            if (runnable2 != null) {
                                b(runnable2);
                                h11Var.f23473f = null;
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
