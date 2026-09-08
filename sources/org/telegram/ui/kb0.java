package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class kb0 implements yf.k0 {
    public final int f38019a = 0;
    public boolean f38020b;
    public boolean f38021c;
    public final Object d;

    public kb0(yf.l0 l0Var) {
        this.d = l0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f38019a) {
            case 0:
                if (this.f38020b != z10 && !this.f38021c) {
                    this.f38020b = z10;
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
                        j0 j0Var = launchActivity.f33492w0;
                        if (j0Var != null) {
                            if (i13 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            j0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.d;
                if (this.f38020b != z10 && !this.f38021c) {
                    this.f38020b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var.f50147a++;
                    } else {
                        l0Var.f50147a--;
                    }
                    int i14 = 0;
                    if (l0Var.f50147a <= 0) {
                        z11 = false;
                    }
                    if (l0Var.f50148b != z11) {
                        l0Var.f50148b = z11;
                        Window window = (Window) ((WeakReference) l0Var.f50149c.f45444b).get();
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
        switch (this.f38019a) {
            case 0:
                a(false);
                this.f38021c = true;
                return;
            default:
                a(false);
                this.f38021c = true;
                return;
        }
    }

    public kb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
