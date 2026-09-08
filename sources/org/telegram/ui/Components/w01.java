package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class w01 extends TextureView {
    public static Boolean f32078f;
    public u01 f32079a;
    public final o1.a f32080b;
    public final ArrayList f32081c;
    public Runnable d;
    public boolean f32082e;

    public w01(Context context, Runnable runnable) {
        super(context);
        this.f32080b = new o1.a(this, 1);
        this.f32081c = new ArrayList();
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
        if (f32078f == null) {
            f32078f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f32078f;
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
            ArrayList arrayList = this.f32081c;
            if (i11 >= arrayList.size()) {
                break;
            }
            v01 v01Var = (v01) arrayList.get(i11);
            if (v01Var.f31059a == view) {
                Runnable runnable = v01Var.d;
                if (runnable != null) {
                    b(runnable);
                    v01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            u01 u01Var = this.f32079a;
            ArrayList arrayList2 = u01Var.W;
            if (u01Var.f30782b.get()) {
                Handler handler = u01Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        t01 t01Var = (t01) arrayList2.get(i10);
                        if (t01Var.f30495a.contains(view)) {
                            Runnable runnable2 = t01Var.f30499f;
                            if (runnable2 != null) {
                                b(runnable2);
                                t01Var.f30499f = null;
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
