package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class y01 extends TextureView {
    public static Boolean f30069f;
    public w01 f30070a;
    public final o1.a f30071b;
    public final ArrayList f30072c;
    public Runnable d;
    public boolean e;

    public y01(Context context, Runnable runnable) {
        super(context);
        this.f30071b = new o1.a(this, 1);
        this.f30072c = new ArrayList();
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
        if (f30069f == null) {
            f30069f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f30069f;
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
            ArrayList arrayList = this.f30072c;
            if (i11 >= arrayList.size()) {
                break;
            }
            x01 x01Var = (x01) arrayList.get(i11);
            if (x01Var.f29802a == view) {
                Runnable runnable = x01Var.d;
                if (runnable != null) {
                    b(runnable);
                    x01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            w01 w01Var = this.f30070a;
            ArrayList arrayList2 = w01Var.W;
            if (w01Var.f29460b.get()) {
                Handler handler = w01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        v01 v01Var = (v01) arrayList2.get(i10);
                        if (v01Var.f28538a.contains(view)) {
                            Runnable runnable2 = v01Var.f28541f;
                            if (runnable2 != null) {
                                b(runnable2);
                                v01Var.f28541f = null;
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
