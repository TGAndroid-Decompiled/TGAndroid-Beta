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
    public final p1 f21277a;

    public o1(p1 p1Var) {
        this.f21277a = p1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        p1 p1Var = this.f21277a;
        FrameLayout frameLayout = p1Var.f21303a;
        int height = frameLayout.getHeight();
        int i11 = height - p1Var.i();
        int i12 = p1Var.f21309i;
        if (i11 != i12 - p1Var.f21311k && height != i12 && p1Var.f21313m == null) {
            if (p1Var.b() && Math.abs(p1Var.f21309i - height) >= AndroidUtilities.dp(20.0f)) {
                if (p1Var.f21309i != -1 && p1Var.f21310j == p1Var.f21305c.getHeight()) {
                    if (height < p1Var.f21305c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p1Var.f21319s = z10;
                    int i13 = p1Var.f21309i;
                    if (p1Var.v) {
                        p1Var.v = false;
                    } else if (p1Var.f21321u) {
                        ValueAnimator valueAnimator = p1Var.f21313m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = p1Var.i();
                        ArrayList arrayList = p1Var.f21315o;
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
                        boolean z11 = p1Var instanceof ah.v;
                        if (!z11) {
                            p1Var.h(Math.max(i13, height + i10));
                        }
                        p1Var.d.requestLayout();
                        p1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        p1Var.f21307f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            p1Var.e(f10, 1.0f, z10);
                            p1Var.f21316p = -f10;
                            p1Var.f21317q = -i10;
                            p1Var.f21318r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(p1Var.f21311k);
                            }
                            p1Var.e(-p1Var.f21311k, 0.0f, z10);
                            p1Var.f21317q = -p1Var.f21311k;
                            p1Var.f21316p = f7;
                            p1Var.f21318r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        p1Var.f21313m = ofFloat;
                        p1Var.f21306e = false;
                        ofFloat.addUpdateListener(new w0(p1Var, 3));
                        p1Var.f21313m.addListener(new h(p1Var, 2));
                        p1Var.f21313m.setDuration(250L);
                        p1Var.f21313m.setInterpolator(p1.f21302w);
                        p1Var.f21314n.lock();
                        if (p1Var.f21308g) {
                            p1Var.f21308g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(p1Var.h, 100L);
                        } else {
                            p1Var.f21313m.start();
                        }
                    }
                    p1Var.f21309i = height;
                    p1Var.f21310j = p1Var.f21305c.getHeight();
                    p1Var.f21311k = p1Var.i();
                    return false;
                }
                p1Var.f21309i = height;
                p1Var.f21310j = p1Var.f21305c.getHeight();
                p1Var.f21311k = p1Var.i();
                return false;
            }
            p1Var.f21309i = height;
            p1Var.f21310j = p1Var.f21305c.getHeight();
            p1Var.f21311k = p1Var.i();
            p1Var.f21306e = false;
            return true;
        }
        if (p1Var.f21313m == null) {
            p1Var.f21309i = height;
            p1Var.f21310j = p1Var.f21305c.getHeight();
            p1Var.f21311k = p1Var.i();
            p1Var.f21306e = false;
        }
        return true;
    }
}
