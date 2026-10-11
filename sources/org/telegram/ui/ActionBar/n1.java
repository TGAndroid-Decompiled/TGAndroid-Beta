package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class n1 implements ViewTreeObserver.OnPreDrawListener {
    public final o1 f21397a;

    public n1(o1 o1Var) {
        this.f21397a = o1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        o1 o1Var = this.f21397a;
        FrameLayout frameLayout = o1Var.f21408a;
        int height = frameLayout.getHeight();
        int i11 = height - o1Var.i();
        int i12 = o1Var.f21414i;
        if (i11 != i12 - o1Var.f21416k && height != i12 && o1Var.f21418m == null) {
            if (o1Var.b() && Math.abs(o1Var.f21414i - height) >= AndroidUtilities.dp(20.0f)) {
                if (o1Var.f21414i != -1 && o1Var.f21415j == o1Var.f21410c.getHeight()) {
                    if (height < o1Var.f21410c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o1Var.f21424s = z10;
                    int i13 = o1Var.f21414i;
                    if (o1Var.v) {
                        o1Var.v = false;
                    } else if (o1Var.f21426u) {
                        ValueAnimator valueAnimator = o1Var.f21418m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = o1Var.i();
                        ArrayList arrayList = o1Var.f21420o;
                        arrayList.clear();
                        FrameLayout frameLayout2 = frameLayout;
                        while (frameLayout2 != 0) {
                            arrayList.add(frameLayout2);
                            if (frameLayout2 == o1Var.d) {
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
                        boolean z11 = o1Var instanceof zg.n;
                        if (!z11) {
                            o1Var.h(Math.max(i13, height + i10));
                        }
                        o1Var.d.requestLayout();
                        o1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        o1Var.f21412f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            o1Var.e(f10, 1.0f, z10);
                            o1Var.f21421p = -f10;
                            o1Var.f21422q = -i10;
                            o1Var.f21423r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(o1Var.f21416k);
                            }
                            o1Var.e(-o1Var.f21416k, 0.0f, z10);
                            o1Var.f21422q = -o1Var.f21416k;
                            o1Var.f21421p = f7;
                            o1Var.f21423r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o1Var.f21418m = ofFloat;
                        o1Var.f21411e = false;
                        ofFloat.addUpdateListener(new v0(o1Var, 3));
                        o1Var.f21418m.addListener(new h(o1Var, 2));
                        o1Var.f21418m.setDuration(250L);
                        o1Var.f21418m.setInterpolator(o1.f21407w);
                        o1Var.f21419n.lock();
                        if (o1Var.f21413g) {
                            o1Var.f21413g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(o1Var.h, 100L);
                        } else {
                            o1Var.f21418m.start();
                        }
                    }
                    o1Var.f21414i = height;
                    o1Var.f21415j = o1Var.f21410c.getHeight();
                    o1Var.f21416k = o1Var.i();
                    return false;
                }
                o1Var.f21414i = height;
                o1Var.f21415j = o1Var.f21410c.getHeight();
                o1Var.f21416k = o1Var.i();
                return false;
            }
            o1Var.f21414i = height;
            o1Var.f21415j = o1Var.f21410c.getHeight();
            o1Var.f21416k = o1Var.i();
            o1Var.f21411e = false;
            return true;
        }
        if (o1Var.f21418m == null) {
            o1Var.f21414i = height;
            o1Var.f21415j = o1Var.f21410c.getHeight();
            o1Var.f21416k = o1Var.i();
            o1Var.f21411e = false;
        }
        return true;
    }
}
