package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class w11 extends TextureView {
    public static Boolean f32471f;
    public u11 f32472a;
    public final o1.a f32473b;
    public final ArrayList f32474c;
    public Runnable d;
    public boolean f32475e;

    public w11(Context context, Runnable runnable) {
        super(context);
        this.f32473b = new o1.a(this, 1);
        this.f32474c = new ArrayList();
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
        if (f32471f == null) {
            f32471f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f32471f;
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
            ArrayList arrayList = this.f32474c;
            if (i11 >= arrayList.size()) {
                break;
            }
            v11 v11Var = (v11) arrayList.get(i11);
            if (v11Var.f31600a == view) {
                Runnable runnable = v11Var.d;
                if (runnable != null) {
                    b(runnable);
                    v11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            u11 u11Var = this.f32472a;
            ArrayList arrayList2 = u11Var.W;
            if (u11Var.f31290b.get()) {
                Handler handler = u11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        t11 t11Var = (t11) arrayList2.get(i10);
                        if (t11Var.f31008a.contains(view)) {
                            Runnable runnable2 = t11Var.f31012f;
                            if (runnable2 != null) {
                                b(runnable2);
                                t11Var.f31012f = null;
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
