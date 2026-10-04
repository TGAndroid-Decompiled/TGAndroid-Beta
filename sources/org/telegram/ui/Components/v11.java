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
    public static Boolean f31498f;
    public t11 f31499a;
    public final o1.a f31500b;
    public final ArrayList f31501c;
    public Runnable d;
    public boolean f31502e;

    public v11(Context context, Runnable runnable) {
        super(context);
        this.f31500b = new o1.a(this, 1);
        this.f31501c = new ArrayList();
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
        if (f31498f == null) {
            f31498f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f31498f;
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
            ArrayList arrayList = this.f31501c;
            if (i11 >= arrayList.size()) {
                break;
            }
            u11 u11Var = (u11) arrayList.get(i11);
            if (u11Var.f31238a == view) {
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
            t11 t11Var = this.f31499a;
            ArrayList arrayList2 = t11Var.W;
            if (t11Var.f30922b.get()) {
                Handler handler = t11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        s11 s11Var = (s11) arrayList2.get(i10);
                        if (s11Var.f30559a.contains(view)) {
                            Runnable runnable2 = s11Var.f30563f;
                            if (runnable2 != null) {
                                b(runnable2);
                                s11Var.f30563f = null;
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
