package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class aa0 {
    public final int f35596a;
    public boolean f35597b;
    public boolean f35598c;
    public final Object d;

    public aa0(Object obj, int i10) {
        this.f35596a = i10;
        this.d = obj;
    }

    public void a() {
        if (!this.f35597b) {
            this.f35597b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b() {
        switch (this.f35596a) {
            case 0:
                c(false);
                this.f35598c = true;
                return;
            default:
                c(false);
                this.f35598c = true;
                return;
        }
    }

    public void c(boolean z10) {
        int i10;
        int i11;
        switch (this.f35596a) {
            case 0:
                if (this.f35597b != z10 && !this.f35598c) {
                    this.f35597b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.C1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i13 = i12 + i10;
                        launchActivity.C1 = i13;
                        l0 l0Var = launchActivity.f33389w0;
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
                c5.e eVar = (c5.e) this.d;
                if (this.f35597b != z10 && !this.f35598c) {
                    this.f35597b = z10;
                    boolean z11 = true;
                    if (z10) {
                        eVar.f3775a++;
                    } else {
                        eVar.f3775a--;
                    }
                    int i14 = 0;
                    if (eVar.f3775a <= 0) {
                        z11 = false;
                    }
                    if (eVar.f3776b != z11) {
                        eVar.f3776b = z11;
                        Window window = (Window) ((WeakReference) ((mg.l) eVar.f3777c).f13182b).get();
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

    public aa0(LaunchActivity launchActivity, boolean z10) {
        this.f35596a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
