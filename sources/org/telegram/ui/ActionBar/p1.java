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
    public final q1 f23702a;

    public p1(q1 q1Var) {
        this.f23702a = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i9;
        q1 q1Var = this.f23702a;
        FrameLayout frameLayout = q1Var.f23714a;
        int height = frameLayout.getHeight();
        int i10 = height - q1Var.i();
        int i11 = q1Var.f23720i;
        if (i10 != i11 - q1Var.f23722k && height != i11 && q1Var.f23724m == null) {
            if (q1Var.b() && Math.abs(q1Var.f23720i - height) >= AndroidUtilities.dp(20.0f)) {
                if (q1Var.f23720i != -1 && q1Var.f23721j == q1Var.f23716c.getHeight()) {
                    if (height < q1Var.f23716c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q1Var.f23730s = z10;
                    int i12 = q1Var.f23720i;
                    if (q1Var.v) {
                        q1Var.v = false;
                    } else if (q1Var.f23732u) {
                        ValueAnimator valueAnimator = q1Var.f23724m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i13 = q1Var.i();
                        ArrayList arrayList = q1Var.f23726o;
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
                            i9 = LaunchActivity.C1.P().getExpandedHeight();
                        } else {
                            i9 = 0;
                        }
                        boolean z11 = q1Var instanceof hg.o;
                        if (!z11) {
                            q1Var.h(Math.max(i12, height + i9));
                        }
                        q1Var.d.requestLayout();
                        q1Var.g(height, z10);
                        float f10 = height - i12;
                        Math.abs(f10);
                        q1Var.f23718f = true;
                        if (height > i12) {
                            float f11 = f10 - i13;
                            if (!z11) {
                                frameLayout.setTranslationY(-f11);
                            }
                            q1Var.e(f11, 1.0f, z10);
                            q1Var.f23727p = -f11;
                            q1Var.f23728q = -i9;
                            q1Var.f23729r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(q1Var.f23722k);
                            }
                            q1Var.e(-q1Var.f23722k, 0.0f, z10);
                            q1Var.f23728q = -q1Var.f23722k;
                            q1Var.f23727p = f10;
                            q1Var.f23729r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        q1Var.f23724m = ofFloat;
                        q1Var.f23717e = false;
                        ofFloat.addUpdateListener(new x0(q1Var, 3));
                        q1Var.f23724m.addListener(new h(q1Var, 2));
                        q1Var.f23724m.setDuration(250L);
                        q1Var.f23724m.setInterpolator(q1.f23713w);
                        q1Var.f23725n.lock();
                        if (q1Var.f23719g) {
                            q1Var.f23719g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(q1Var.h, 100L);
                        } else {
                            q1Var.f23724m.start();
                        }
                    }
                    q1Var.f23720i = height;
                    q1Var.f23721j = q1Var.f23716c.getHeight();
                    q1Var.f23722k = q1Var.i();
                    return false;
                }
                q1Var.f23720i = height;
                q1Var.f23721j = q1Var.f23716c.getHeight();
                q1Var.f23722k = q1Var.i();
                return false;
            }
            q1Var.f23720i = height;
            q1Var.f23721j = q1Var.f23716c.getHeight();
            q1Var.f23722k = q1Var.i();
            q1Var.f23717e = false;
            return true;
        }
        if (q1Var.f23724m == null) {
            q1Var.f23720i = height;
            q1Var.f23721j = q1Var.f23716c.getHeight();
            q1Var.f23722k = q1Var.i();
            q1Var.f23717e = false;
        }
        return true;
    }
}
