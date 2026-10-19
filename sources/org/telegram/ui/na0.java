package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class na0 implements zf.k0 {
    public final int f39485a;
    public boolean f39486b;
    public boolean f39487c;
    public final Object d;

    public na0(Object obj, int i10) {
        this.f39485a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f39485a) {
            case 0:
                if (this.f39486b != z10 && !this.f39487c) {
                    this.f39486b = z10;
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
                        m0 m0Var = launchActivity.f33191w0;
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
                zf.l0 l0Var = (zf.l0) this.d;
                if (this.f39486b != z10 && !this.f39487c) {
                    this.f39486b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var.f51579a++;
                    } else {
                        l0Var.f51579a--;
                    }
                    int i14 = 0;
                    if (l0Var.f51579a <= 0) {
                        z11 = false;
                    }
                    if (l0Var.f51580b != z11) {
                        l0Var.f51580b = z11;
                        Window window = (Window) ((WeakReference) l0Var.f51581c.f50473b).get();
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
        if (!this.f39486b) {
            this.f39486b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f39485a) {
            case 0:
                a(false);
                this.f39487c = true;
                return;
            default:
                a(false);
                this.f39487c = true;
                return;
        }
    }

    public na0(LaunchActivity launchActivity, boolean z10) {
        this.f39485a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
