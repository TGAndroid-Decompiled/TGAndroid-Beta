package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class nb0 implements zf.k0 {
    public final int f38636a;
    public boolean f38637b;
    public boolean f38638c;
    public final Object d;

    public nb0(Object obj, int i10) {
        this.f38636a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f38636a) {
            case 0:
                if (this.f38637b != z10 && !this.f38638c) {
                    this.f38637b = z10;
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
                        l0 l0Var = launchActivity.f32145w0;
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
                zf.l0 l0Var2 = (zf.l0) this.d;
                if (this.f38637b != z10 && !this.f38638c) {
                    this.f38637b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var2.f50199a++;
                    } else {
                        l0Var2.f50199a--;
                    }
                    int i14 = 0;
                    if (l0Var2.f50199a <= 0) {
                        z11 = false;
                    }
                    if (l0Var2.f50200b != z11) {
                        l0Var2.f50200b = z11;
                        Window window = (Window) ((WeakReference) l0Var2.f50201c.f44209b).get();
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
        if (!this.f38637b) {
            this.f38637b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f38636a) {
            case 0:
                a(false);
                this.f38638c = true;
                return;
            default:
                a(false);
                this.f38638c = true;
                return;
        }
    }

    public nb0(LaunchActivity launchActivity, boolean z10) {
        this.f38636a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
