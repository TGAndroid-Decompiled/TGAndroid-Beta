package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ic extends org.telegram.ui.ActionBar.j {
    public final int f37293a;
    public final Object f37294b;

    public ic(Object obj, int i10) {
        this.f37293a = i10;
        this.f37294b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f37293a;
        Object obj = this.f37294b;
        switch (i11) {
            case 0:
                bd bdVar = (bd) obj;
                if (i10 == -1) {
                    if (bdVar.f34736b >= bdVar.S0() && bdVar.Q0()) {
                        bdVar.V0();
                        return;
                    } else {
                        bdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) bdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    bdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    bdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    bdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    mc mcVar = new mc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    bdVar.m0 = mcVar;
                    mcVar.setOnTouchListener(new ci.d(2));
                    bdVar.f34752n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f34753o0 = ofFloat;
                    ofFloat.addUpdateListener(new di.yb(bdVar, 1));
                    bdVar.f34753o0.addListener(new s0(bdVar, 20));
                    bdVar.f34753o0.setDuration(400L);
                    bdVar.f34753o0.setInterpolator(org.telegram.ui.Components.jt.f27568e);
                    bdVar.f34753o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new fc(bdVar, 0));
                    return;
                } else {
                    return;
                }
            case 1:
                xo xoVar = (xo) obj;
                if (i10 == -1) {
                    if (xoVar.e0(true)) {
                        xoVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    xoVar.j0();
                    return;
                } else {
                    return;
                }
            case 2:
                lp lpVar = (lp) obj;
                if (i10 == -1) {
                    lpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.or orVar = lpVar.f38445r;
                    if (orVar == null || orVar.f29171c <= 0.0f) {
                        lpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((xp) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((eq) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                qq qqVar = (qq) obj;
                if (i10 == -1) {
                    if (qqVar.m0(true)) {
                        qqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    qqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                vr vrVar = (vr) obj;
                if (i10 == -1) {
                    if (vrVar.g0(true)) {
                        vrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    vrVar.u0();
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) obj;
                if (i10 == -1) {
                    k8Var.dismiss();
                    return;
                } else {
                    k8Var.t0(i10);
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) obj).dismiss();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj;
                if (i10 == -1) {
                    if (!viVar.f31340y0.i()) {
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.f31340y0.t(i10);
                return;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.b40) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) obj).f27820r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.pg0) obj).dismiss();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.hq0) obj).onBackPressed();
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.y51) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((ni1) obj).a(false, false);
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((bu) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((av) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((ov) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((mz) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                c00 c00Var = (c00) obj;
                if (i10 == -1) {
                    if (c00Var.W(true)) {
                        c00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(c00Var.T - 1.0f) < 0.1f) {
                        c00Var.c0();
                        return;
                    } else if (Math.abs(c00Var.T - 0.5f) < 0.1f) {
                        for (int i12 = 0; i12 < c00Var.f34953a.getChildCount(); i12++) {
                            View childAt = c00Var.f34953a.getChildAt(i12);
                            c00Var.f34953a.getClass();
                            if (RecyclerView.R(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
                                int i13 = -c00Var.f34960s;
                                c00Var.f34960s = i13;
                                AndroidUtilities.shakeViewSpring(childAt, i13);
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 24:
                f10 f10Var = (f10) obj;
                if (i10 == -1) {
                    if (f10Var.h0(true)) {
                        f10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    f10Var.q0();
                    return;
                } else {
                    return;
                }
            case 25:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((r20) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                f70 f70Var = (f70) obj;
                if (i10 == -1) {
                    if (f70Var.f0(true)) {
                        f70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    f70Var.o0();
                    return;
                } else {
                    return;
                }
            case 28:
                if (i10 == -1) {
                    ((l70) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((n70) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
