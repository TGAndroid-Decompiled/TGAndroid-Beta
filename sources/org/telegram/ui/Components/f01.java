package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class f01 extends TextureView {

    public static Boolean f28220f;

    public d01 f28221a;

    public final o1.a f28222b;

    public final ArrayList f28223c;
    public Runnable d;

    public boolean f28224e;

    public f01(Context context, Runnable runnable) {
        super(context);
        this.f28222b = new o1.a(this, 1);
        this.f28223c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new eh.h(this, 3));
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
        if (f28220f == null) {
            f28220f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f28220f;
        return bool == null || !bool.booleanValue();
    }

    public final void a(View view) {
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f28223c;
            if (i11 >= arrayList.size()) {
                break;
            }
            e01 e01Var = (e01) arrayList.get(i11);
            if (e01Var.f27913a == view) {
                Runnable runnable = e01Var.d;
                if (runnable != null) {
                    b(runnable);
                    e01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            return;
        }
        d01 d01Var = this.f28221a;
        ArrayList arrayList2 = d01Var.S;
        if (d01Var.f27594b.get()) {
            Handler handler = d01Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i10 < arrayList2.size()) {
                c01 c01Var = (c01) arrayList2.get(i10);
                if (c01Var.f27250a.contains(view)) {
                    Runnable runnable2 = c01Var.f27254f;
                    if (runnable2 != null) {
                        b(runnable2);
                        c01Var.f27254f = null;
                    }
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }
}
