package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class hb0 implements yf.j0 {
    public final int f38370a;
    public boolean f38371b;
    public boolean f38372c;
    public final Object d;

    public hb0(Object obj, int i10) {
        this.f38370a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f38370a) {
            case 0:
                if (this.f38371b != z10 && !this.f38372c) {
                    this.f38371b = z10;
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
                        j0 j0Var = launchActivity.f33847w0;
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
                if (this.f38371b != z10 && !this.f38372c) {
                    this.f38371b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var.f52267a++;
                    } else {
                        k0Var.f52267a--;
                    }
                    int i14 = 0;
                    if (k0Var.f52267a <= 0) {
                        z11 = false;
                    }
                    if (k0Var.f52268b != z11) {
                        k0Var.f52268b = z11;
                        Window window = (Window) ((WeakReference) k0Var.f52269c.f47077b).get();
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
        if (!this.f38371b) {
            this.f38371b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f38370a) {
            case 0:
                a(false);
                this.f38372c = true;
                return;
            default:
                a(false);
                this.f38372c = true;
                return;
        }
    }

    public hb0(LaunchActivity launchActivity, boolean z10) {
        this.f38370a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
