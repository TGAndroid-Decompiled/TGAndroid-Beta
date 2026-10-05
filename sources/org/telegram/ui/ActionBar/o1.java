package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class o1 implements ViewTreeObserver.OnPreDrawListener {
    public final p1 f21442a;

    public o1(p1 p1Var) {
        this.f21442a = p1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        p1 p1Var = this.f21442a;
        FrameLayout frameLayout = p1Var.f21453a;
        int height = frameLayout.getHeight();
        int i11 = height - p1Var.i();
        int i12 = p1Var.f21459i;
        if (i11 != i12 - p1Var.f21461k && height != i12 && p1Var.f21463m == null) {
            if (p1Var.b() && Math.abs(p1Var.f21459i - height) >= AndroidUtilities.dp(20.0f)) {
                if (p1Var.f21459i != -1 && p1Var.f21460j == p1Var.f21455c.getHeight()) {
                    if (height < p1Var.f21455c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p1Var.f21469s = z10;
                    int i13 = p1Var.f21459i;
                    if (p1Var.v) {
                        p1Var.v = false;
                    } else if (p1Var.f21471u) {
                        ValueAnimator valueAnimator = p1Var.f21463m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = p1Var.i();
                        ArrayList arrayList = p1Var.f21465o;
                        arrayList.clear();
                        FrameLayout frameLayout2 = frameLayout;
                        while (frameLayout2 != 0) {
                            arrayList.add(frameLayout2);
                            if (frameLayout2 == p1Var.d) {
                                break;
                            } else if (frameLayout2.getParent() instanceof View) {
                                frameLayout2 = (View) frameLayout2.getParent();
                            } else {
                                frameLayout2 = 0;
                            }
                        }
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null && launchActivity.P() != null) {
                            i10 = LaunchActivity.G1.P().getExpandedHeight();
                        } else {
                            i10 = 0;
                        }
                        boolean z11 = p1Var instanceof zg.k;
                        if (!z11) {
                            p1Var.h(Math.max(i13, height + i10));
                        }
                        p1Var.d.requestLayout();
                        p1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        p1Var.f21457f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            p1Var.e(f10, 1.0f, z10);
                            p1Var.f21466p = -f10;
                            p1Var.f21467q = -i10;
                            p1Var.f21468r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(p1Var.f21461k);
                            }
                            p1Var.e(-p1Var.f21461k, 0.0f, z10);
                            p1Var.f21467q = -p1Var.f21461k;
                            p1Var.f21466p = f7;
                            p1Var.f21468r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        p1Var.f21463m = ofFloat;
                        p1Var.f21456e = false;
                        ofFloat.addUpdateListener(new w0(p1Var, 3));
                        p1Var.f21463m.addListener(new h(p1Var, 2));
                        p1Var.f21463m.setDuration(250L);
                        p1Var.f21463m.setInterpolator(p1.f21452w);
                        p1Var.f21464n.lock();
                        if (p1Var.f21458g) {
                            p1Var.f21458g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(p1Var.h, 100L);
                        } else {
                            p1Var.f21463m.start();
                        }
                    }
                    p1Var.f21459i = height;
                    p1Var.f21460j = p1Var.f21455c.getHeight();
                    p1Var.f21461k = p1Var.i();
                    return false;
                }
                p1Var.f21459i = height;
                p1Var.f21460j = p1Var.f21455c.getHeight();
                p1Var.f21461k = p1Var.i();
                return false;
            }
            p1Var.f21459i = height;
            p1Var.f21460j = p1Var.f21455c.getHeight();
            p1Var.f21461k = p1Var.i();
            p1Var.f21456e = false;
            return true;
        }
        if (p1Var.f21463m == null) {
            p1Var.f21459i = height;
            p1Var.f21460j = p1Var.f21455c.getHeight();
            p1Var.f21461k = p1Var.i();
            p1Var.f21456e = false;
        }
        return true;
    }
}
