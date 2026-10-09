package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class ib0 implements yf.j0 {
    public final int f38601a;
    public boolean f38602b;
    public boolean f38603c;
    public final Object d;

    public ib0(Object obj, int i10) {
        this.f38601a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f38601a) {
            case 0:
                if (this.f38602b != z10 && !this.f38603c) {
                    this.f38602b = z10;
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
                        k0 k0Var = launchActivity.f33819w0;
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
                if (this.f38602b != z10 && !this.f38603c) {
                    this.f38602b = z10;
                    boolean z11 = true;
                    if (z10) {
                        k0Var2.f52180a++;
                    } else {
                        k0Var2.f52180a--;
                    }
                    int i14 = 0;
                    if (k0Var2.f52180a <= 0) {
                        z11 = false;
                    }
                    if (k0Var2.f52181b != z11) {
                        k0Var2.f52181b = z11;
                        Window window = (Window) ((WeakReference) k0Var2.f52182c.f46987b).get();
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
        if (!this.f38602b) {
            this.f38602b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f38601a) {
            case 0:
                a(false);
                this.f38603c = true;
                return;
            default:
                a(false);
                this.f38603c = true;
                return;
        }
    }

    public ib0(LaunchActivity launchActivity, boolean z10) {
        this.f38601a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
