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

    public final p1 f23695a;

    public o1(p1 p1Var) {
        this.f23695a = p1Var;
    }

    @Override
    public final boolean onPreDraw() {
        p1 p1Var = this.f23695a;
        FrameLayout frameLayout = p1Var.f23707a;
        int height = frameLayout.getHeight();
        int i10 = height - p1Var.i();
        int i11 = p1Var.f23713i;
        if (i10 == i11 - p1Var.f23715k || height == i11 || p1Var.f23717m != null) {
            if (p1Var.f23717m == null) {
                p1Var.f23713i = height;
                p1Var.f23714j = p1Var.f23709c.getHeight();
                p1Var.f23715k = p1Var.i();
                p1Var.f23710e = false;
            }
            return true;
        }
        if (!p1Var.b() || Math.abs(p1Var.f23713i - height) < AndroidUtilities.dp(20.0f)) {
            p1Var.f23713i = height;
            p1Var.f23714j = p1Var.f23709c.getHeight();
            p1Var.f23715k = p1Var.i();
            p1Var.f23710e = false;
            return true;
        }
        if (p1Var.f23713i == -1 || p1Var.f23714j != p1Var.f23709c.getHeight()) {
            p1Var.f23713i = height;
            p1Var.f23714j = p1Var.f23709c.getHeight();
            p1Var.f23715k = p1Var.i();
            return false;
        }
        boolean z10 = height < p1Var.f23709c.getBottom();
        p1Var.f23723s = z10;
        int i12 = p1Var.f23713i;
        if (p1Var.v) {
            p1Var.v = false;
        } else if (p1Var.f23725u) {
            ValueAnimator valueAnimator = p1Var.f23717m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i13 = p1Var.i();
            ArrayList arrayList = p1Var.f23719o;
            arrayList.clear();
            View view = frameLayout;
            while (view != null) {
                arrayList.add(view);
                if (view == p1Var.d) {
                    break;
                }
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            int expandedHeight = (launchActivity == null || launchActivity.P() == null) ? 0 : LaunchActivity.C1.P().getExpandedHeight();
            boolean z11 = p1Var instanceof ig.o;
            if (!z11) {
                p1Var.h(Math.max(i12, height + expandedHeight));
            }
            p1Var.d.requestLayout();
            p1Var.g(height, z10);
            float f10 = height - i12;
            Math.abs(f10);
            p1Var.f23711f = true;
            if (height > i12) {
                float f11 = f10 - i13;
                if (!z11) {
                    frameLayout.setTranslationY(-f11);
                }
                p1Var.e(f11, 1.0f, z10);
                p1Var.f23720p = -f11;
                p1Var.f23721q = -expandedHeight;
                p1Var.f23722r = true;
            } else {
                if (!z11) {
                    frameLayout.setTranslationY(p1Var.f23715k);
                }
                p1Var.e(-p1Var.f23715k, 0.0f, z10);
                p1Var.f23721q = -p1Var.f23715k;
                p1Var.f23720p = f10;
                p1Var.f23722r = false;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            p1Var.f23717m = valueAnimatorOfFloat;
            p1Var.f23710e = false;
            valueAnimatorOfFloat.addUpdateListener(new w0(p1Var, 3));
            p1Var.f23717m.addListener(new h(p1Var, 2));
            p1Var.f23717m.setDuration(250L);
            p1Var.f23717m.setInterpolator(p1.f23706w);
            p1Var.f23718n.lock();
            if (p1Var.f23712g) {
                p1Var.f23712g = false;
                SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(p1Var.h, 100L);
            } else {
                p1Var.f23717m.start();
            }
        }
        p1Var.f23713i = height;
        p1Var.f23714j = p1Var.f23709c.getHeight();
        p1Var.f23715k = p1Var.i();
        return false;
    }
}
