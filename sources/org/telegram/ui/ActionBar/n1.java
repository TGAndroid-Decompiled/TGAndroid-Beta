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
    public final o1 f20544a;

    public n1(o1 o1Var) {
        this.f20544a = o1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        o1 o1Var = this.f20544a;
        FrameLayout frameLayout = o1Var.f20555a;
        int height = frameLayout.getHeight();
        int i11 = height - o1Var.i();
        int i12 = o1Var.f20560i;
        if (i11 != i12 - o1Var.f20562k && height != i12 && o1Var.f20564m == null) {
            if (o1Var.b() && Math.abs(o1Var.f20560i - height) >= AndroidUtilities.dp(20.0f)) {
                if (o1Var.f20560i != -1 && o1Var.f20561j == o1Var.f20557c.getHeight()) {
                    if (height < o1Var.f20557c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o1Var.f20570s = z10;
                    int i13 = o1Var.f20560i;
                    if (o1Var.v) {
                        o1Var.v = false;
                    } else if (o1Var.f20572u) {
                        ValueAnimator valueAnimator = o1Var.f20564m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = o1Var.i();
                        ArrayList arrayList = o1Var.f20566o;
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
                        boolean z11 = o1Var instanceof ah.u;
                        if (!z11) {
                            o1Var.h(Math.max(i13, height + i10));
                        }
                        o1Var.d.requestLayout();
                        o1Var.g(height, z10);
                        float f7 = height - i13;
                        Math.abs(f7);
                        o1Var.f20558f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            o1Var.e(f10, 1.0f, z10);
                            o1Var.f20567p = -f10;
                            o1Var.f20568q = -i10;
                            o1Var.f20569r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(o1Var.f20562k);
                            }
                            o1Var.e(-o1Var.f20562k, 0.0f, z10);
                            o1Var.f20568q = -o1Var.f20562k;
                            o1Var.f20567p = f7;
                            o1Var.f20569r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o1Var.f20564m = ofFloat;
                        o1Var.e = false;
                        ofFloat.addUpdateListener(new v0(o1Var, 3));
                        o1Var.f20564m.addListener(new h(o1Var, 2));
                        o1Var.f20564m.setDuration(250L);
                        o1Var.f20564m.setInterpolator(o1.f20554w);
                        o1Var.f20565n.lock();
                        if (o1Var.f20559g) {
                            o1Var.f20559g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(o1Var.h, 100L);
                        } else {
                            o1Var.f20564m.start();
                        }
                    }
                    o1Var.f20560i = height;
                    o1Var.f20561j = o1Var.f20557c.getHeight();
                    o1Var.f20562k = o1Var.i();
                    return false;
                }
                o1Var.f20560i = height;
                o1Var.f20561j = o1Var.f20557c.getHeight();
                o1Var.f20562k = o1Var.i();
                return false;
            }
            o1Var.f20560i = height;
            o1Var.f20561j = o1Var.f20557c.getHeight();
            o1Var.f20562k = o1Var.i();
            o1Var.e = false;
            return true;
        }
        if (o1Var.f20564m == null) {
            o1Var.f20560i = height;
            o1Var.f20561j = o1Var.f20557c.getHeight();
            o1Var.f20562k = o1Var.i();
            o1Var.e = false;
        }
        return true;
    }
}
