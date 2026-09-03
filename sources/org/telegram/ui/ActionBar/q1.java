package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class q1 implements ViewTreeObserver.OnPreDrawListener {
    public final r1 f20507a;

    public q1(r1 r1Var) {
        this.f20507a = r1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        int i10;
        r1 r1Var = this.f20507a;
        FrameLayout frameLayout = r1Var.f20519a;
        int height = frameLayout.getHeight();
        int i11 = height - r1Var.i();
        int i12 = r1Var.f20524i;
        if (i11 != i12 - r1Var.f20526k && height != i12 && r1Var.f20528m == null) {
            if (r1Var.b() && Math.abs(r1Var.f20524i - height) >= AndroidUtilities.dp(20.0f)) {
                if (r1Var.f20524i != -1 && r1Var.f20525j == r1Var.f20521c.getHeight()) {
                    if (height < r1Var.f20521c.getBottom()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r1Var.f20534s = z4;
                    int i13 = r1Var.f20524i;
                    if (r1Var.v) {
                        r1Var.v = false;
                    } else if (r1Var.f20536u) {
                        ValueAnimator valueAnimator = r1Var.f20528m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = r1Var.i();
                        ArrayList arrayList = r1Var.f20530o;
                        arrayList.clear();
                        FrameLayout frameLayout2 = frameLayout;
                        while (frameLayout2 != 0) {
                            arrayList.add(frameLayout2);
                            if (frameLayout2 == r1Var.d) {
                                break;
                            } else if (frameLayout2.getParent() instanceof View) {
                                frameLayout2 = (View) frameLayout2.getParent();
                            } else {
                                frameLayout2 = 0;
                            }
                        }
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null && launchActivity.P() != null) {
                            i10 = LaunchActivity.D1.P().getExpandedHeight();
                        } else {
                            i10 = 0;
                        }
                        boolean z10 = r1Var instanceof mg.o;
                        if (!z10) {
                            r1Var.h(Math.max(i13, height + i10));
                        }
                        r1Var.d.requestLayout();
                        r1Var.g(height, z4);
                        float f10 = height - i13;
                        Math.abs(f10);
                        r1Var.f20522f = true;
                        if (height > i13) {
                            float f11 = f10 - i14;
                            if (!z10) {
                                frameLayout.setTranslationY(-f11);
                            }
                            r1Var.e(f11, 1.0f, z4);
                            r1Var.f20531p = -f11;
                            r1Var.f20532q = -i10;
                            r1Var.f20533r = true;
                        } else {
                            if (!z10) {
                                frameLayout.setTranslationY(r1Var.f20526k);
                            }
                            r1Var.e(-r1Var.f20526k, 0.0f, z4);
                            r1Var.f20532q = -r1Var.f20526k;
                            r1Var.f20531p = f10;
                            r1Var.f20533r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        r1Var.f20528m = ofFloat;
                        r1Var.e = false;
                        ofFloat.addUpdateListener(new x0(r1Var, 3));
                        r1Var.f20528m.addListener(new h(r1Var, 2));
                        r1Var.f20528m.setDuration(250L);
                        r1Var.f20528m.setInterpolator(r1.f20518w);
                        r1Var.f20529n.lock();
                        if (r1Var.f20523g) {
                            r1Var.f20523g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(r1Var.h, 100L);
                        } else {
                            r1Var.f20528m.start();
                        }
                    }
                    r1Var.f20524i = height;
                    r1Var.f20525j = r1Var.f20521c.getHeight();
                    r1Var.f20526k = r1Var.i();
                    return false;
                }
                r1Var.f20524i = height;
                r1Var.f20525j = r1Var.f20521c.getHeight();
                r1Var.f20526k = r1Var.i();
                return false;
            }
            r1Var.f20524i = height;
            r1Var.f20525j = r1Var.f20521c.getHeight();
            r1Var.f20526k = r1Var.i();
            r1Var.e = false;
            return true;
        }
        if (r1Var.f20528m == null) {
            r1Var.f20524i = height;
            r1Var.f20525j = r1Var.f20521c.getHeight();
            r1Var.f20526k = r1Var.i();
            r1Var.e = false;
        }
        return true;
    }
}
