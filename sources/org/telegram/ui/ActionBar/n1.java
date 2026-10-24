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
    public final o1 f21650a;

    public n1(o1 o1Var) {
        this.f21650a = o1Var;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        o1 o1Var = this.f21650a;
        FrameLayout frameLayout = o1Var.f21719a;
        int height = frameLayout.getHeight();
        int i11 = height - o1Var.i();
        int i12 = o1Var.f21724i;
        if (i11 != i12 - o1Var.f21726k && height != i12 && o1Var.f21728m == null) {
            if (o1Var.b() && Math.abs(o1Var.f21724i - height) >= AndroidUtilities.dp(20.0f)) {
                if (o1Var.f21724i != -1 && o1Var.f21725j == o1Var.f21721c.getHeight()) {
                    if (height < o1Var.f21721c.getBottom()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o1Var.f21734s = z10;
                    int i13 = o1Var.f21724i;
                    if (o1Var.v) {
                        o1Var.v = false;
                    } else if (o1Var.f21736u) {
                        ValueAnimator valueAnimator = o1Var.f21728m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i14 = o1Var.i();
                        ArrayList arrayList = o1Var.f21730o;
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
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null && launchActivity.P() != null) {
                            i10 = LaunchActivity.I1.P().getExpandedHeight();
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
                        o1Var.f21722f = true;
                        if (height > i13) {
                            float f10 = f7 - i14;
                            if (!z11) {
                                frameLayout.setTranslationY(-f10);
                            }
                            o1Var.e(f10, 1.0f, z10);
                            o1Var.f21731p = -f10;
                            o1Var.f21732q = -i10;
                            o1Var.f21733r = true;
                        } else {
                            if (!z11) {
                                frameLayout.setTranslationY(o1Var.f21726k);
                            }
                            o1Var.e(-o1Var.f21726k, 0.0f, z10);
                            o1Var.f21732q = -o1Var.f21726k;
                            o1Var.f21731p = f7;
                            o1Var.f21733r = false;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o1Var.f21728m = ofFloat;
                        o1Var.e = false;
                        ofFloat.addUpdateListener(new v0(o1Var, 3));
                        o1Var.f21728m.addListener(new h(o1Var, 2));
                        o1Var.f21728m.setDuration(250L);
                        o1Var.f21728m.setInterpolator(o1.f21718w);
                        o1Var.f21729n.lock();
                        if (o1Var.f21723g) {
                            o1Var.f21723g = false;
                            SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(o1Var.h, 100L);
                        } else {
                            o1Var.f21728m.start();
                        }
                    }
                    o1Var.f21724i = height;
                    o1Var.f21725j = o1Var.f21721c.getHeight();
                    o1Var.f21726k = o1Var.i();
                    return false;
                }
                o1Var.f21724i = height;
                o1Var.f21725j = o1Var.f21721c.getHeight();
                o1Var.f21726k = o1Var.i();
                return false;
            }
            o1Var.f21724i = height;
            o1Var.f21725j = o1Var.f21721c.getHeight();
            o1Var.f21726k = o1Var.i();
            o1Var.e = false;
            return true;
        }
        if (o1Var.f21728m == null) {
            o1Var.f21724i = height;
            o1Var.f21725j = o1Var.f21721c.getHeight();
            o1Var.f21726k = o1Var.i();
            o1Var.e = false;
        }
        return true;
    }
}
