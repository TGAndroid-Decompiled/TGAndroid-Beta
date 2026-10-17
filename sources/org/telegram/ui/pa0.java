package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class pa0 implements zf.j0 {
    public final int f40026a;
    public boolean f40027b;
    public boolean f40028c;
    public final Object d;

    public pa0(Object obj, int i10) {
        this.f40026a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f40026a) {
            case 0:
                if (this.f40027b != z10 && !this.f40028c) {
                    this.f40027b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.B1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i13 = i12 + i10;
                        launchActivity.B1 = i13;
                        m0 m0Var = launchActivity.f33185w0;
                        if (m0Var != null) {
                            if (i13 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            m0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                zf.k0 k0Var = (zf.k0) this.d;
                if (this.f40027b != z10 && !this.f40028c) {
                    this.f40027b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var.f51601a++;
                    } else {
                        k0Var.f51601a--;
                    }
                    int i14 = 0;
                    if (k0Var.f51601a <= 0) {
                        z11 = false;
                    }
                    if (k0Var.f51602b != z11) {
                        k0Var.f51602b = z11;
                        Window window = (Window) ((WeakReference) k0Var.f51603c.f50509b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (z11) {
                                i14 = 8;
                            }
                            decorView.setVisibility(i14);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void b() {
        if (!this.f40027b) {
            this.f40027b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f40026a) {
            case 0:
                a(false);
                this.f40028c = true;
                return;
            default:
                a(false);
                this.f40028c = true;
                return;
        }
    }

    public pa0(LaunchActivity launchActivity, boolean z10) {
        this.f40026a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
