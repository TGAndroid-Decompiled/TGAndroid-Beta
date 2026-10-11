package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class e21 extends TextureView {
    public static Boolean f25805f;
    public c21 f25806a;
    public final o1.a f25807b;
    public final ArrayList f25808c;
    public Runnable d;
    public boolean f25809e;

    public e21(Context context, Runnable runnable) {
        super(context);
        this.f25807b = new o1.a(this, 1);
        this.f25808c = new ArrayList();
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
        if (f25805f == null) {
            f25805f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f25805f;
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
            ArrayList arrayList = this.f25808c;
            if (i11 >= arrayList.size()) {
                break;
            }
            d21 d21Var = (d21) arrayList.get(i11);
            if (d21Var.f25411a == view) {
                Runnable runnable = d21Var.d;
                if (runnable != null) {
                    b(runnable);
                    d21Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            c21 c21Var = this.f25806a;
            ArrayList arrayList2 = c21Var.W;
            if (c21Var.f25068b.get()) {
                Handler handler = c21Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        b21 b21Var = (b21) arrayList2.get(i10);
                        if (b21Var.f24785a.contains(view)) {
                            Runnable runnable2 = b21Var.f24789f;
                            if (runnable2 != null) {
                                b(runnable2);
                                b21Var.f24789f = null;
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
