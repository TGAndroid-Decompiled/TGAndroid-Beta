package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class kb0 implements yf.j0 {
    public final int f35117a = 0;
    public boolean f35118b;
    public boolean f35119c;
    public final Object d;

    public kb0(yf.k0 k0Var) {
        this.d = k0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f35117a) {
            case 0:
                if (this.f35118b != z10 && !this.f35119c) {
                    this.f35118b = z10;
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
                        j0 j0Var = launchActivity.f30853w0;
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
                yf.k0 k0Var = (yf.k0) this.d;
                if (this.f35118b != z10 && !this.f35119c) {
                    this.f35118b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var.f46836a++;
                    } else {
                        k0Var.f46836a--;
                    }
                    int i14 = 0;
                    if (k0Var.f46836a <= 0) {
                        z11 = false;
                    }
                    if (k0Var.f46837b != z11) {
                        k0Var.f46837b = z11;
                        Window window = (Window) ((WeakReference) k0Var.f46838c.f42048b).get();
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
        switch (this.f35117a) {
            case 0:
                a(false);
                this.f35119c = true;
                return;
            default:
                a(false);
                this.f35119c = true;
                return;
        }
    }

    public kb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
