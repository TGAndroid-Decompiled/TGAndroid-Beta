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
    public final p1 f19430a;

    public o1(p1 p1Var) {
        this.f19430a = p1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        p1 p1Var = this.f19430a;
        FrameLayout frameLayout = p1Var.f19442a;
        int height = frameLayout.getHeight();
        int i11 = height - p1Var.i();
        int i12 = p1Var.f19447i;
        if (i11 != i12 - p1Var.f19449k && height != i12 && p1Var.f19451m == null) {
            if (p1Var.b() && Math.abs(p1Var.f19447i - height) >= AndroidUtilities.dp(20.0f)) {
                if (p1Var.f19447i != -1 && p1Var.f19448j == p1Var.f19444c.getHeight()) {
                    if (height < p1Var.f19444c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p1Var.f19457s = z10;
                    int i13 = p1Var.f19447i;
                    if (p1Var.v) {
                        p1Var.v = false;
                    } else if (p1Var.f19459u) {
                        ValueAnimator valueAnimator = p1Var.f19451m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = p1Var.i();
                        ArrayList arrayList = p1Var.f19453o;
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
                        boolean z11 = p1Var instanceof zg.n;
                        if (!z11) {
                            p1Var.h(Math.max(i13, height + i10));
                        }
                        p1Var.d.requestLayout();
                        p1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        p1Var.f19445f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            p1Var.e(f10, 1.0f, z10);
                            p1Var.f19454p = -f10;
                            p1Var.f19455q = -i10;
                            p1Var.f19456r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(p1Var.f19449k);
                            }
                            p1Var.e(-p1Var.f19449k, 0.0f, z10);
                            p1Var.f19455q = -p1Var.f19449k;
                            p1Var.f19454p = f7;
                            p1Var.f19456r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        p1Var.f19451m = ofFloat;
                        p1Var.e = false;
                        ofFloat.addUpdateListener(new w0(p1Var, 3));
                        p1Var.f19451m.addListener(new h(p1Var, 2));
                        p1Var.f19451m.setDuration(250L);
                        p1Var.f19451m.setInterpolator(p1.f19441w);
                        p1Var.f19452n.lock();
                        if (p1Var.f19446g) {
                            p1Var.f19446g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(p1Var.h, 100L);
                        } else {
                            p1Var.f19451m.start();
                        }
                    }
                    p1Var.f19447i = height;
                    p1Var.f19448j = p1Var.f19444c.getHeight();
                    p1Var.f19449k = p1Var.i();
                    return false;
                }
                p1Var.f19447i = height;
                p1Var.f19448j = p1Var.f19444c.getHeight();
                p1Var.f19449k = p1Var.i();
                return false;
            }
            p1Var.f19447i = height;
            p1Var.f19448j = p1Var.f19444c.getHeight();
            p1Var.f19449k = p1Var.i();
            p1Var.e = false;
            return true;
        }
        if (p1Var.f19451m == null) {
            p1Var.f19447i = height;
            p1Var.f19448j = p1Var.f19444c.getHeight();
            p1Var.f19449k = p1Var.i();
            p1Var.e = false;
        }
        return true;
    }
}
