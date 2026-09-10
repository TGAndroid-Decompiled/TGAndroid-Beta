package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class kb0 implements xf.l0 {
    public final int f34326a = 0;
    public boolean f34327b;
    public boolean f34328c;
    public final Object d;

    public kb0(xf.m0 m0Var) {
        this.d = m0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f34326a) {
            case 0:
                if (this.f34327b != z10 && !this.f34328c) {
                    this.f34327b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.A1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i13 = i12 + i10;
                        launchActivity.A1 = i13;
                        k0 k0Var = launchActivity.f29969w0;
                        if (k0Var != null) {
                            if (i13 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            k0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                xf.m0 m0Var = (xf.m0) this.d;
                if (this.f34327b != z10 && !this.f34328c) {
                    this.f34327b = z10;
                    boolean z11 = true;
                    if (z10) {
                        m0Var.f45159a++;
                    } else {
                        m0Var.f45159a--;
                    }
                    int i14 = 0;
                    if (m0Var.f45159a <= 0) {
                        z11 = false;
                    }
                    if (m0Var.f45160b != z11) {
                        m0Var.f45160b = z11;
                        Window window = (Window) ((WeakReference) m0Var.f45161c.f42200b).get();
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

    @Override
    public final void destroy() {
        switch (this.f34326a) {
            case 0:
                a(false);
                this.f34328c = true;
                return;
            default:
                a(false);
                this.f34328c = true;
                return;
        }
    }

    public kb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
