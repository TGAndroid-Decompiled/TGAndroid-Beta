package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class mb0 implements zf.k0 {
    public final int f37959a;
    public boolean f37960b;
    public boolean f37961c;
    public final Object d;

    public mb0(Object obj, int i10) {
        this.f37959a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f37959a) {
            case 0:
                if (this.f37960b != z10 && !this.f37961c) {
                    this.f37960b = z10;
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
                        l0 l0Var = launchActivity.f31847w0;
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
                if (this.f37960b != z10 && !this.f37961c) {
                    this.f37960b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var2.f50200a++;
                    } else {
                        l0Var2.f50200a--;
                    }
                    int i14 = 0;
                    if (l0Var2.f50200a <= 0) {
                        z11 = false;
                    }
                    if (l0Var2.f50201b != z11) {
                        l0Var2.f50201b = z11;
                        Window window = (Window) ((WeakReference) l0Var2.f50202c.f43968b).get();
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
        if (!this.f37960b) {
            this.f37960b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f37959a) {
            case 0:
                a(false);
                this.f37961c = true;
                return;
            default:
                a(false);
                this.f37961c = true;
                return;
        }
    }

    public mb0(LaunchActivity launchActivity, boolean z10) {
        this.f37959a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
