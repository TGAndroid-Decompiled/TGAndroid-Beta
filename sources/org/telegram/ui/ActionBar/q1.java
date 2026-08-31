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
    public final r1 f22235a;

    public q1(r1 r1Var) {
        this.f22235a = r1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        int i10;
        r1 r1Var = this.f22235a;
        FrameLayout frameLayout = r1Var.f22250a;
        int height = frameLayout.getHeight();
        int i11 = height - r1Var.i();
        int i12 = r1Var.f22256i;
        if (i11 != i12 - r1Var.f22258k && height != i12 && r1Var.f22260m == null) {
            if (r1Var.b() && Math.abs(r1Var.f22256i - height) >= AndroidUtilities.dp(20.0f)) {
                if (r1Var.f22256i != -1 && r1Var.f22257j == r1Var.f22252c.getHeight()) {
                    if (height < r1Var.f22252c.getBottom()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r1Var.f22266s = z4;
                    int i13 = r1Var.f22256i;
                    if (r1Var.v) {
                        r1Var.v = false;
                    } else if (r1Var.f22268u) {
                        ValueAnimator valueAnimator = r1Var.f22260m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = r1Var.i();
                        ArrayList arrayList = r1Var.f22262o;
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
                        boolean z10 = r1Var instanceof ng.o;
                        if (!z10) {
                            r1Var.h(Math.max(i13, height + i10));
                        }
                        r1Var.d.requestLayout();
                        r1Var.g(height, z4);
                        float f10 = height - i13;
                        Math.abs(f10);
                        r1Var.f22254f = true;
                        if (height > i13) {
                            float f11 = f10 - i14;
                            if (!z10) {
                                frameLayout.setTranslationY(-f11);
                            }
                            r1Var.e(f11, 1.0f, z4);
                            r1Var.f22263p = -f11;
                            r1Var.f22264q = -i10;
                            r1Var.f22265r = true;
                        } else {
                            if (!z10) {
                                frameLayout.setTranslationY(r1Var.f22258k);
                            }
                            r1Var.e(-r1Var.f22258k, 0.0f, z4);
                            r1Var.f22264q = -r1Var.f22258k;
                            r1Var.f22263p = f10;
                            r1Var.f22265r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        r1Var.f22260m = ofFloat;
                        r1Var.f22253e = false;
                        ofFloat.addUpdateListener(new x0(r1Var, 3));
                        r1Var.f22260m.addListener(new h(r1Var, 2));
                        r1Var.f22260m.setDuration(250L);
                        r1Var.f22260m.setInterpolator(r1.f22249w);
                        r1Var.f22261n.lock();
                        if (r1Var.f22255g) {
                            r1Var.f22255g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(r1Var.h, 100L);
                        } else {
                            r1Var.f22260m.start();
                        }
                    }
                    r1Var.f22256i = height;
                    r1Var.f22257j = r1Var.f22252c.getHeight();
                    r1Var.f22258k = r1Var.i();
                    return false;
                }
                r1Var.f22256i = height;
                r1Var.f22257j = r1Var.f22252c.getHeight();
                r1Var.f22258k = r1Var.i();
                return false;
            }
            r1Var.f22256i = height;
            r1Var.f22257j = r1Var.f22252c.getHeight();
            r1Var.f22258k = r1Var.i();
            r1Var.f22253e = false;
            return true;
        }
        if (r1Var.f22260m == null) {
            r1Var.f22256i = height;
            r1Var.f22257j = r1Var.f22252c.getHeight();
            r1Var.f22258k = r1Var.i();
            r1Var.f22253e = false;
        }
        return true;
    }
}
