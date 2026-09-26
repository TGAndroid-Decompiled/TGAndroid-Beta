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
    public final o1 f19658a;

    public n1(o1 o1Var) {
        this.f19658a = o1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        o1 o1Var = this.f19658a;
        FrameLayout frameLayout = o1Var.f19669a;
        int height = frameLayout.getHeight();
        int i11 = height - o1Var.i();
        int i12 = o1Var.f19674i;
        if (i11 != i12 - o1Var.f19676k && height != i12 && o1Var.f19678m == null) {
            if (o1Var.b() && Math.abs(o1Var.f19674i - height) >= AndroidUtilities.dp(20.0f)) {
                if (o1Var.f19674i != -1 && o1Var.f19675j == o1Var.f19671c.getHeight()) {
                    if (height < o1Var.f19671c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o1Var.f19684s = z10;
                    int i13 = o1Var.f19674i;
                    if (o1Var.v) {
                        o1Var.v = false;
                    } else if (o1Var.f19686u) {
                        ValueAnimator valueAnimator = o1Var.f19678m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = o1Var.i();
                        ArrayList arrayList = o1Var.f19680o;
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
                        o1Var.f19672f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            o1Var.e(f10, 1.0f, z10);
                            o1Var.f19681p = -f10;
                            o1Var.f19682q = -i10;
                            o1Var.f19683r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(o1Var.f19676k);
                            }
                            o1Var.e(-o1Var.f19676k, 0.0f, z10);
                            o1Var.f19682q = -o1Var.f19676k;
                            o1Var.f19681p = f7;
                            o1Var.f19683r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o1Var.f19678m = ofFloat;
                        o1Var.e = false;
                        ofFloat.addUpdateListener(new v0(o1Var, 3));
                        o1Var.f19678m.addListener(new h(o1Var, 2));
                        o1Var.f19678m.setDuration(250L);
                        o1Var.f19678m.setInterpolator(o1.f19668w);
                        o1Var.f19679n.lock();
                        if (o1Var.f19673g) {
                            o1Var.f19673g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(o1Var.h, 100L);
                        } else {
                            o1Var.f19678m.start();
                        }
                    }
                    o1Var.f19674i = height;
                    o1Var.f19675j = o1Var.f19671c.getHeight();
                    o1Var.f19676k = o1Var.i();
                    return false;
                }
                o1Var.f19674i = height;
                o1Var.f19675j = o1Var.f19671c.getHeight();
                o1Var.f19676k = o1Var.i();
                return false;
            }
            o1Var.f19674i = height;
            o1Var.f19675j = o1Var.f19671c.getHeight();
            o1Var.f19676k = o1Var.i();
            o1Var.e = false;
            return true;
        }
        if (o1Var.f19678m == null) {
            o1Var.f19674i = height;
            o1Var.f19675j = o1Var.f19671c.getHeight();
            o1Var.f19676k = o1Var.i();
            o1Var.e = false;
        }
        return true;
    }
}
