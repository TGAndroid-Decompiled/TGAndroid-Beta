package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class ib0 implements yf.g0 {
    public final int f37381a = 0;
    public boolean f37382b;
    public boolean f37383c;
    public final Object d;

    public ib0(yf.h0 h0Var) {
        this.d = h0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f37381a) {
            case 0:
                if (this.f37382b != z10 && !this.f37383c) {
                    this.f37382b = z10;
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
                        k0 k0Var = launchActivity.f33809w0;
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
                yf.h0 h0Var = (yf.h0) this.d;
                if (this.f37382b != z10 && !this.f37383c) {
                    this.f37382b = z10;
                    boolean z11 = true;
                    if (z10) {
                        h0Var.f50991a++;
                    } else {
                        h0Var.f50991a--;
                    }
                    int i14 = 0;
                    if (h0Var.f50991a <= 0) {
                        z11 = false;
                    }
                    if (h0Var.f50992b != z11) {
                        h0Var.f50992b = z11;
                        Window window = (Window) ((WeakReference) h0Var.f50993c.f45772b).get();
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
        switch (this.f37381a) {
            case 0:
                a(false);
                this.f37383c = true;
                return;
            default:
                a(false);
                this.f37383c = true;
                return;
        }
    }

    public ib0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
