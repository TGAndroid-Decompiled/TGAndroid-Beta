package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class lb0 implements yf.l0 {
    public final int f35334a = 0;
    public boolean f35335b;
    public boolean f35336c;
    public final Object d;

    public lb0(yf.m0 m0Var) {
        this.d = m0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f35334a) {
            case 0:
                if (this.f35335b != z10 && !this.f35336c) {
                    this.f35335b = z10;
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
                        j0 j0Var = launchActivity.f31100w0;
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
                yf.m0 m0Var = (yf.m0) this.d;
                if (this.f35335b != z10 && !this.f35336c) {
                    this.f35335b = z10;
                    boolean z11 = true;
                    if (z10) {
                        m0Var.f47100a++;
                    } else {
                        m0Var.f47100a--;
                    }
                    int i14 = 0;
                    if (m0Var.f47100a <= 0) {
                        z11 = false;
                    }
                    if (m0Var.f47101b != z11) {
                        m0Var.f47101b = z11;
                        Window window = (Window) ((WeakReference) m0Var.f47102c.f42304b).get();
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
        switch (this.f35334a) {
            case 0:
                a(false);
                this.f35336c = true;
                return;
            default:
                a(false);
                this.f35336c = true;
                return;
        }
    }

    public lb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
