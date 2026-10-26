package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class g21 extends TextureView {
    public static Boolean f28392f;
    public e21 f28393a;
    public final o1.a f28394b;
    public final ArrayList f28395c;
    public Runnable d;
    public boolean e;

    public g21(Context context, Runnable runnable) {
        super(context);
        this.f28394b = new o1.a(this, 1);
        this.f28395c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new v50(this, 2));
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
        if (f28392f == null) {
            f28392f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f28392f;
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
            ArrayList arrayList = this.f28395c;
            if (i11 >= arrayList.size()) {
                break;
            }
            f21 f21Var = (f21) arrayList.get(i11);
            if (f21Var.f28043a == view) {
                Runnable runnable = f21Var.d;
                if (runnable != null) {
                    b(runnable);
                    f21Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            e21 e21Var = this.f28393a;
            ArrayList arrayList2 = e21Var.W;
            if (e21Var.f27692b.get()) {
                Handler handler = e21Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        d21 d21Var = (d21) arrayList2.get(i10);
                        if (d21Var.f27342a.contains(view)) {
                            Runnable runnable2 = d21Var.f27345f;
                            if (runnable2 != null) {
                                b(runnable2);
                                d21Var.f27345f = null;
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
