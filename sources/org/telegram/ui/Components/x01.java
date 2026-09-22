package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class x01 extends TextureView {
    public static Boolean f29836f;
    public v01 f29837a;
    public final o1.a f29838b;
    public final ArrayList f29839c;
    public Runnable d;
    public boolean e;

    public x01(Context context, Runnable runnable) {
        super(context);
        this.f29838b = new o1.a(this, 1);
        this.f29839c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new j50(this, 2));
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
        if (f29836f == null) {
            f29836f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f29836f;
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
            ArrayList arrayList = this.f29839c;
            if (i11 >= arrayList.size()) {
                break;
            }
            w01 w01Var = (w01) arrayList.get(i11);
            if (w01Var.f29505a == view) {
                Runnable runnable = w01Var.d;
                if (runnable != null) {
                    b(runnable);
                    w01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            v01 v01Var = this.f29837a;
            ArrayList arrayList2 = v01Var.W;
            if (v01Var.f28542b.get()) {
                Handler handler = v01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        u01 u01Var = (u01) arrayList2.get(i10);
                        if (u01Var.f28223a.contains(view)) {
                            Runnable runnable2 = u01Var.f28226f;
                            if (runnable2 != null) {
                                b(runnable2);
                                u01Var.f28226f = null;
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
