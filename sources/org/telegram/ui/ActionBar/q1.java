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
    public final r1 f20532a;

    public q1(r1 r1Var) {
        this.f20532a = r1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        int i10;
        r1 r1Var = this.f20532a;
        FrameLayout frameLayout = r1Var.f20544a;
        int height = frameLayout.getHeight();
        int i11 = height - r1Var.i();
        int i12 = r1Var.f20549i;
        if (i11 != i12 - r1Var.f20551k && height != i12 && r1Var.f20553m == null) {
            if (r1Var.b() && Math.abs(r1Var.f20549i - height) >= AndroidUtilities.dp(20.0f)) {
                if (r1Var.f20549i != -1 && r1Var.f20550j == r1Var.f20546c.getHeight()) {
                    if (height < r1Var.f20546c.getBottom()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r1Var.f20559s = z4;
                    int i13 = r1Var.f20549i;
                    if (r1Var.v) {
                        r1Var.v = false;
                    } else if (r1Var.f20561u) {
                        ValueAnimator valueAnimator = r1Var.f20553m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = r1Var.i();
                        ArrayList arrayList = r1Var.f20555o;
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
                        r1Var.f20547f = true;
                        if (height > i13) {
                            float f11 = f10 - i14;
                            if (!z10) {
                                frameLayout.setTranslationY(-f11);
                            }
                            r1Var.e(f11, 1.0f, z4);
                            r1Var.f20556p = -f11;
                            r1Var.f20557q = -i10;
                            r1Var.f20558r = true;
                        } else {
                            if (!z10) {
                                frameLayout.setTranslationY(r1Var.f20551k);
                            }
                            r1Var.e(-r1Var.f20551k, 0.0f, z4);
                            r1Var.f20557q = -r1Var.f20551k;
                            r1Var.f20556p = f10;
                            r1Var.f20558r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        r1Var.f20553m = ofFloat;
                        r1Var.e = false;
                        ofFloat.addUpdateListener(new x0(r1Var, 3));
                        r1Var.f20553m.addListener(new h(r1Var, 2));
                        r1Var.f20553m.setDuration(250L);
                        r1Var.f20553m.setInterpolator(r1.f20543w);
                        r1Var.f20554n.lock();
                        if (r1Var.f20548g) {
                            r1Var.f20548g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(r1Var.h, 100L);
                        } else {
                            r1Var.f20553m.start();
                        }
                    }
                    r1Var.f20549i = height;
                    r1Var.f20550j = r1Var.f20546c.getHeight();
                    r1Var.f20551k = r1Var.i();
                    return false;
                }
                r1Var.f20549i = height;
                r1Var.f20550j = r1Var.f20546c.getHeight();
                r1Var.f20551k = r1Var.i();
                return false;
            }
            r1Var.f20549i = height;
            r1Var.f20550j = r1Var.f20546c.getHeight();
            r1Var.f20551k = r1Var.i();
            r1Var.e = false;
            return true;
        }
        if (r1Var.f20553m == null) {
            r1Var.f20549i = height;
            r1Var.f20550j = r1Var.f20546c.getHeight();
            r1Var.f20551k = r1Var.i();
            r1Var.e = false;
        }
        return true;
    }
}
