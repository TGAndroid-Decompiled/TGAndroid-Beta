package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class fb0 implements yf.j0 {
    public final int f33273a = 0;
    public boolean f33274b;
    public boolean f33275c;
    public final Object d;

    public fb0(yf.k0 k0Var) {
        this.d = k0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f33273a) {
            case 0:
                if (this.f33274b != z10 && !this.f33275c) {
                    this.f33274b = z10;
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
                        k0 k0Var = launchActivity.f30827w0;
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
                yf.k0 k0Var2 = (yf.k0) this.d;
                if (this.f33274b != z10 && !this.f33275c) {
                    this.f33274b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var2.f46794a++;
                    } else {
                        k0Var2.f46794a--;
                    }
                    int i14 = 0;
                    if (k0Var2.f46794a <= 0) {
                        z11 = false;
                    }
                    if (k0Var2.f46795b != z11) {
                        k0Var2.f46795b = z11;
                        Window window = (Window) ((WeakReference) k0Var2.f46796c.f42001b).get();
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
        switch (this.f33273a) {
            case 0:
                a(false);
                this.f33275c = true;
                return;
            default:
                a(false);
                this.f33275c = true;
                return;
        }
    }

    public fb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
