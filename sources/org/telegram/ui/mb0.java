package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class mb0 implements yf.k0 {
    public final int f35758a = 0;
    public boolean f35759b;
    public boolean f35760c;
    public final Object d;

    public mb0(yf.l0 l0Var) {
        this.d = l0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f35758a) {
            case 0:
                if (this.f35759b != z10 && !this.f35760c) {
                    this.f35759b = z10;
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
                        j0 j0Var = launchActivity.f30873w0;
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
                if (this.f35759b != z10 && !this.f35760c) {
                    this.f35759b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var.f46871a++;
                    } else {
                        l0Var.f46871a--;
                    }
                    int i14 = 0;
                    if (l0Var.f46871a <= 0) {
                        z11 = false;
                    }
                    if (l0Var.f46872b != z11) {
                        l0Var.f46872b = z11;
                        Window window = (Window) ((WeakReference) l0Var.f46873c.f42076b).get();
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
        switch (this.f35758a) {
            case 0:
                a(false);
                this.f35760c = true;
                return;
            default:
                a(false);
                this.f35760c = true;
                return;
        }
    }

    public mb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
