package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class x11 extends TextureView {
    public static Boolean f32478f;
    public v11 f32479a;
    public final o1.a f32480b;
    public final ArrayList f32481c;
    public Runnable d;
    public boolean e;

    public x11(Context context, Runnable runnable) {
        super(context);
        this.f32480b = new o1.a(this, 1);
        this.f32481c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new r50(this, 2));
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
        if (f32478f == null) {
            f32478f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f32478f;
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
            ArrayList arrayList = this.f32481c;
            if (i11 >= arrayList.size()) {
                break;
            }
            w11 w11Var = (w11) arrayList.get(i11);
            if (w11Var.f32107a == view) {
                Runnable runnable = w11Var.d;
                if (runnable != null) {
                    b(runnable);
                    w11Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            v11 v11Var = this.f32479a;
            ArrayList arrayList2 = v11Var.W;
            if (v11Var.f31255b.get()) {
                Handler handler = v11Var.getHandler();
                if (handler == null) {
                    while (i10 < arrayList2.size()) {
                        u11 u11Var = (u11) arrayList2.get(i10);
                        if (u11Var.f30967a.contains(view)) {
                            Runnable runnable2 = u11Var.f30970f;
                            if (runnable2 != null) {
                                b(runnable2);
                                u11Var.f30970f = null;
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
