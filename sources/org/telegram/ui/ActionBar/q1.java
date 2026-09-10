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
    public final r1 f18571a;

    public q1(r1 r1Var) {
        this.f18571a = r1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        r1 r1Var = this.f18571a;
        FrameLayout frameLayout = r1Var.f18593a;
        int height = frameLayout.getHeight();
        int i11 = height - r1Var.i();
        int i12 = r1Var.f18598i;
        if (i11 != i12 - r1Var.f18600k && height != i12 && r1Var.f18602m == null) {
            if (r1Var.b() && Math.abs(r1Var.f18598i - height) >= AndroidUtilities.dp(20.0f)) {
                if (r1Var.f18598i != -1 && r1Var.f18599j == r1Var.f18595c.getHeight()) {
                    if (height < r1Var.f18595c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r1Var.f18608s = z10;
                    int i13 = r1Var.f18598i;
                    if (r1Var.v) {
                        r1Var.v = false;
                    } else if (r1Var.f18610u) {
                        ValueAnimator valueAnimator = r1Var.f18602m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = r1Var.i();
                        ArrayList arrayList = r1Var.f18604o;
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
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null && launchActivity.P() != null) {
                            i10 = LaunchActivity.G1.P().getExpandedHeight();
                        } else {
                            i10 = 0;
                        }
                        boolean z11 = r1Var instanceof yg.o;
                        if (!z11) {
                            r1Var.h(Math.max(i13, height + i10));
                        }
                        r1Var.d.requestLayout();
                        r1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        r1Var.f18596f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            r1Var.e(f10, 1.0f, z10);
                            r1Var.f18605p = -f10;
                            r1Var.f18606q = -i10;
                            r1Var.f18607r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(r1Var.f18600k);
                            }
                            r1Var.e(-r1Var.f18600k, 0.0f, z10);
                            r1Var.f18606q = -r1Var.f18600k;
                            r1Var.f18605p = f7;
                            r1Var.f18607r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        r1Var.f18602m = ofFloat;
                        r1Var.e = false;
                        ofFloat.addUpdateListener(new x0(r1Var, 3));
                        r1Var.f18602m.addListener(new h(r1Var, 2));
                        r1Var.f18602m.setDuration(250L);
                        r1Var.f18602m.setInterpolator(r1.f18592w);
                        r1Var.f18603n.lock();
                        if (r1Var.f18597g) {
                            r1Var.f18597g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(r1Var.h, 100L);
                        } else {
                            r1Var.f18602m.start();
                        }
                    }
                    r1Var.f18598i = height;
                    r1Var.f18599j = r1Var.f18595c.getHeight();
                    r1Var.f18600k = r1Var.i();
                    return false;
                }
                r1Var.f18598i = height;
                r1Var.f18599j = r1Var.f18595c.getHeight();
                r1Var.f18600k = r1Var.i();
                return false;
            }
            r1Var.f18598i = height;
            r1Var.f18599j = r1Var.f18595c.getHeight();
            r1Var.f18600k = r1Var.i();
            r1Var.e = false;
            return true;
        }
        if (r1Var.f18602m == null) {
            r1Var.f18598i = height;
            r1Var.f18599j = r1Var.f18595c.getHeight();
            r1Var.f18600k = r1Var.i();
            r1Var.e = false;
        }
        return true;
    }
}
