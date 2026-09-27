package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class hb0 implements yf.k0 {
    public final int f34183a = 0;
    public boolean f34184b;
    public boolean f34185c;
    public final Object d;

    public hb0(yf.l0 l0Var) {
        this.d = l0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f34183a) {
            case 0:
                if (this.f34184b != z10 && !this.f34185c) {
                    this.f34184b = z10;
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
                        l0 l0Var = launchActivity.f31144w0;
                        if (l0Var != null) {
                            if (i13 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            l0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                yf.l0 l0Var2 = (yf.l0) this.d;
                if (this.f34184b != z10 && !this.f34185c) {
                    this.f34184b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var2.f47167a++;
                    } else {
                        l0Var2.f47167a--;
                    }
                    int i14 = 0;
                    if (l0Var2.f47167a <= 0) {
                        z11 = false;
                    }
                    if (l0Var2.f47168b != z11) {
                        l0Var2.f47168b = z11;
                        Window window = (Window) ((WeakReference) l0Var2.f47169c.f42379b).get();
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
        switch (this.f34183a) {
            case 0:
                a(false);
                this.f34185c = true;
                return;
            default:
                a(false);
                this.f34185c = true;
                return;
        }
    }

    public hb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
