package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class jb0 implements yf.j0 {
    public final int f39171a;
    public boolean f39172b;
    public boolean f39173c;
    public final Object d;

    public jb0(Object obj, int i10) {
        this.f39171a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f39171a) {
            case 0:
                if (this.f39172b != z10 && !this.f39173c) {
                    this.f39172b = z10;
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
                        k0 k0Var = launchActivity.f33656w0;
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
                if (this.f39172b != z10 && !this.f39173c) {
                    this.f39172b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var2.f52404a++;
                    } else {
                        k0Var2.f52404a--;
                    }
                    int i14 = 0;
                    if (k0Var2.f52404a <= 0) {
                        z11 = false;
                    }
                    if (k0Var2.f52405b != z11) {
                        k0Var2.f52405b = z11;
                        Window window = (Window) ((WeakReference) k0Var2.f52406c.f47201b).get();
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
        if (!this.f39172b) {
            this.f39172b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f39171a) {
            case 0:
                a(false);
                this.f39173c = true;
                return;
            default:
                a(false);
                this.f39173c = true;
                return;
        }
    }

    public jb0(LaunchActivity launchActivity, boolean z10) {
        this.f39171a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
