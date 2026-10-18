package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class pa0 implements zf.k0 {
    public final int f40045a;
    public boolean f40046b;
    public boolean f40047c;
    public final Object d;

    public pa0(Object obj, int i10) {
        this.f40045a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f40045a) {
            case 0:
                if (this.f40046b != z10 && !this.f40047c) {
                    this.f40046b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.B1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i13 = i12 + i10;
                        launchActivity.B1 = i13;
                        m0 m0Var = launchActivity.f33192w0;
                        if (m0Var != null) {
                            if (i13 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            m0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                zf.l0 l0Var = (zf.l0) this.d;
                if (this.f40046b != z10 && !this.f40047c) {
                    this.f40046b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var.f51626a++;
                    } else {
                        l0Var.f51626a--;
                    }
                    int i14 = 0;
                    if (l0Var.f51626a <= 0) {
                        z11 = false;
                    }
                    if (l0Var.f51627b != z11) {
                        l0Var.f51627b = z11;
                        Window window = (Window) ((WeakReference) l0Var.f51628c.f50534b).get();
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
        if (!this.f40046b) {
            this.f40046b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f40045a) {
            case 0:
                a(false);
                this.f40047c = true;
                return;
            default:
                a(false);
                this.f40047c = true;
                return;
        }
    }

    public pa0(LaunchActivity launchActivity, boolean z10) {
        this.f40045a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
