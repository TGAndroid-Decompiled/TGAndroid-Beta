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
    public final q1 f23724a;

    public p1(q1 q1Var) {
        this.f23724a = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        q1 q1Var = this.f23724a;
        FrameLayout frameLayout = q1Var.f23736a;
        int height = frameLayout.getHeight();
        int i11 = height - q1Var.i();
        int i12 = q1Var.f23742i;
        if (i11 != i12 - q1Var.f23744k && height != i12 && q1Var.f23746m == null) {
            if (q1Var.b() && Math.abs(q1Var.f23742i - height) >= AndroidUtilities.dp(20.0f)) {
                if (q1Var.f23742i != -1 && q1Var.f23743j == q1Var.f23738c.getHeight()) {
                    if (height < q1Var.f23738c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q1Var.f23752s = z10;
                    int i13 = q1Var.f23742i;
                    if (q1Var.v) {
                        q1Var.v = false;
                    } else if (q1Var.f23754u) {
                        ValueAnimator valueAnimator = q1Var.f23746m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = q1Var.i();
                        ArrayList arrayList = q1Var.f23748o;
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
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null && launchActivity.P() != null) {
                            i10 = LaunchActivity.C1.P().getExpandedHeight();
                        } else {
                            i10 = 0;
                        }
                        boolean z11 = q1Var instanceof kg.o;
                        if (!z11) {
                            q1Var.h(Math.max(i13, height + i10));
                        }
                        q1Var.d.requestLayout();
                        q1Var.g(height, z10);
                        float f9 = height - i13;
                        Math.abs(f9);
                        q1Var.f23740f = true;
                        if (height > i13) {
                            float f10 = f9 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            q1Var.e(f10, 1.0f, z10);
                            q1Var.f23749p = -f10;
                            q1Var.f23750q = -i10;
                            q1Var.f23751r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(q1Var.f23744k);
                            }
                            q1Var.e(-q1Var.f23744k, 0.0f, z10);
                            q1Var.f23750q = -q1Var.f23744k;
                            q1Var.f23749p = f9;
                            q1Var.f23751r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        q1Var.f23746m = ofFloat;
                        q1Var.f23739e = false;
                        ofFloat.addUpdateListener(new x0(q1Var, 3));
                        q1Var.f23746m.addListener(new i(q1Var, 2));
                        q1Var.f23746m.setDuration(250L);
                        q1Var.f23746m.setInterpolator(q1.f23735w);
                        q1Var.f23747n.lock();
                        if (q1Var.f23741g) {
                            q1Var.f23741g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(q1Var.h, 100L);
                        } else {
                            q1Var.f23746m.start();
                        }
                    }
                    q1Var.f23742i = height;
                    q1Var.f23743j = q1Var.f23738c.getHeight();
                    q1Var.f23744k = q1Var.i();
                    return false;
                }
                q1Var.f23742i = height;
                q1Var.f23743j = q1Var.f23738c.getHeight();
                q1Var.f23744k = q1Var.i();
                return false;
            }
            q1Var.f23742i = height;
            q1Var.f23743j = q1Var.f23738c.getHeight();
            q1Var.f23744k = q1Var.i();
            q1Var.f23739e = false;
            return true;
        }
        if (q1Var.f23746m == null) {
            q1Var.f23742i = height;
            q1Var.f23743j = q1Var.f23738c.getHeight();
            q1Var.f23744k = q1Var.i();
            q1Var.f23739e = false;
        }
        return true;
    }
}
