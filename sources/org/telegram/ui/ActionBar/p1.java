package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class p1 implements ViewTreeObserver.OnPreDrawListener {
    public final q1 f19485a;

    public p1(q1 q1Var) {
        this.f19485a = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        q1 q1Var = this.f19485a;
        FrameLayout frameLayout = q1Var.f19509a;
        int height = frameLayout.getHeight();
        int i11 = height - q1Var.i();
        int i12 = q1Var.f19514i;
        if (i11 != i12 - q1Var.f19516k && height != i12 && q1Var.f19518m == null) {
            if (q1Var.b() && Math.abs(q1Var.f19514i - height) >= AndroidUtilities.dp(20.0f)) {
                if (q1Var.f19514i != -1 && q1Var.f19515j == q1Var.f19511c.getHeight()) {
                    if (height < q1Var.f19511c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q1Var.f19524s = z10;
                    int i13 = q1Var.f19514i;
                    if (q1Var.v) {
                        q1Var.v = false;
                    } else if (q1Var.f19526u) {
                        ValueAnimator valueAnimator = q1Var.f19518m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = q1Var.i();
                        ArrayList arrayList = q1Var.f19520o;
                        arrayList.clear();
                        FrameLayout frameLayout2 = frameLayout;
                        while (frameLayout2 != 0) {
                            arrayList.add(frameLayout2);
                            if (frameLayout2 == q1Var.d) {
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
                        boolean z11 = q1Var instanceof zg.n;
                        if (!z11) {
                            q1Var.h(Math.max(i13, height + i10));
                        }
                        q1Var.d.requestLayout();
                        q1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        q1Var.f19512f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            q1Var.e(f10, 1.0f, z10);
                            q1Var.f19521p = -f10;
                            q1Var.f19522q = -i10;
                            q1Var.f19523r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(q1Var.f19516k);
                            }
                            q1Var.e(-q1Var.f19516k, 0.0f, z10);
                            q1Var.f19522q = -q1Var.f19516k;
                            q1Var.f19521p = f7;
                            q1Var.f19523r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        q1Var.f19518m = ofFloat;
                        q1Var.e = false;
                        ofFloat.addUpdateListener(new x0(q1Var, 3));
                        q1Var.f19518m.addListener(new h(q1Var, 2));
                        q1Var.f19518m.setDuration(250L);
                        q1Var.f19518m.setInterpolator(q1.f19508w);
                        q1Var.f19519n.lock();
                        if (q1Var.f19513g) {
                            q1Var.f19513g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(q1Var.h, 100L);
                        } else {
                            q1Var.f19518m.start();
                        }
                    }
                    q1Var.f19514i = height;
                    q1Var.f19515j = q1Var.f19511c.getHeight();
                    q1Var.f19516k = q1Var.i();
                    return false;
                }
                q1Var.f19514i = height;
                q1Var.f19515j = q1Var.f19511c.getHeight();
                q1Var.f19516k = q1Var.i();
                return false;
            }
            q1Var.f19514i = height;
            q1Var.f19515j = q1Var.f19511c.getHeight();
            q1Var.f19516k = q1Var.i();
            q1Var.e = false;
            return true;
        }
        if (q1Var.f19518m == null) {
            q1Var.f19514i = height;
            q1Var.f19515j = q1Var.f19511c.getHeight();
            q1Var.f19516k = q1Var.i();
            q1Var.e = false;
        }
        return true;
    }
}
