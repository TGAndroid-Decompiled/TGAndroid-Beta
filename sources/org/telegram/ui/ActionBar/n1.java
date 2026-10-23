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
    public final o1 f21616a;

    public n1(o1 o1Var) {
        this.f21616a = o1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        o1 o1Var = this.f21616a;
        FrameLayout frameLayout = o1Var.f21637a;
        int height = frameLayout.getHeight();
        int i11 = height - o1Var.i();
        int i12 = o1Var.f21642i;
        if (i11 != i12 - o1Var.f21644k && height != i12 && o1Var.f21646m == null) {
            if (o1Var.b() && Math.abs(o1Var.f21642i - height) >= AndroidUtilities.dp(20.0f)) {
                if (o1Var.f21642i != -1 && o1Var.f21643j == o1Var.f21639c.getHeight()) {
                    if (height < o1Var.f21639c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o1Var.f21652s = z10;
                    int i13 = o1Var.f21642i;
                    if (o1Var.v) {
                        o1Var.v = false;
                    } else if (o1Var.f21654u) {
                        ValueAnimator valueAnimator = o1Var.f21646m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = o1Var.i();
                        ArrayList arrayList = o1Var.f21648o;
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
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && launchActivity.P() != null) {
                            i10 = LaunchActivity.H1.P().getExpandedHeight();
                        } else {
                            i10 = 0;
                        }
                        boolean z11 = o1Var instanceof ah.u;
                        if (!z11) {
                            o1Var.h(Math.max(i13, height + i10));
                        }
                        o1Var.d.requestLayout();
                        o1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        o1Var.f21640f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            o1Var.e(f10, 1.0f, z10);
                            o1Var.f21649p = -f10;
                            o1Var.f21650q = -i10;
                            o1Var.f21651r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(o1Var.f21644k);
                            }
                            o1Var.e(-o1Var.f21644k, 0.0f, z10);
                            o1Var.f21650q = -o1Var.f21644k;
                            o1Var.f21649p = f7;
                            o1Var.f21651r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o1Var.f21646m = ofFloat;
                        o1Var.e = false;
                        ofFloat.addUpdateListener(new v0(o1Var, 3));
                        o1Var.f21646m.addListener(new h(o1Var, 2));
                        o1Var.f21646m.setDuration(250L);
                        o1Var.f21646m.setInterpolator(o1.f21636w);
                        o1Var.f21647n.lock();
                        if (o1Var.f21641g) {
                            o1Var.f21641g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(o1Var.h, 100L);
                        } else {
                            o1Var.f21646m.start();
                        }
                    }
                    o1Var.f21642i = height;
                    o1Var.f21643j = o1Var.f21639c.getHeight();
                    o1Var.f21644k = o1Var.i();
                    return false;
                }
                o1Var.f21642i = height;
                o1Var.f21643j = o1Var.f21639c.getHeight();
                o1Var.f21644k = o1Var.i();
                return false;
            }
            o1Var.f21642i = height;
            o1Var.f21643j = o1Var.f21639c.getHeight();
            o1Var.f21644k = o1Var.i();
            o1Var.e = false;
            return true;
        }
        if (o1Var.f21646m == null) {
            o1Var.f21642i = height;
            o1Var.f21643j = o1Var.f21639c.getHeight();
            o1Var.f21644k = o1Var.i();
            o1Var.e = false;
        }
        return true;
    }
}
