package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class eb0 implements yf.j0 {
    public final int f33330a = 0;
    public boolean f33331b;
    public boolean f33332c;
    public final Object d;

    public eb0(yf.k0 k0Var) {
        this.d = k0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f33330a) {
            case 0:
                if (this.f33331b != z10 && !this.f33332c) {
                    this.f33331b = z10;
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
                        k0 k0Var = launchActivity.f31128w0;
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
                if (this.f33331b != z10 && !this.f33332c) {
                    this.f33331b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var2.f47108a++;
                    } else {
                        k0Var2.f47108a--;
                    }
                    int i14 = 0;
                    if (k0Var2.f47108a <= 0) {
                        z11 = false;
                    }
                    if (k0Var2.f47109b != z11) {
                        k0Var2.f47109b = z11;
                        Window window = (Window) ((WeakReference) k0Var2.f47110c.f42320b).get();
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
        switch (this.f33330a) {
            case 0:
                a(false);
                this.f33332c = true;
                return;
            default:
                a(false);
                this.f33332c = true;
                return;
        }
    }

    public eb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
