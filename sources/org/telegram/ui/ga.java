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
public final class ga extends org.telegram.ui.ActionBar.j {
    public final int f37195a;
    public final Object f37196b;

    public ga(Object obj, int i10) {
        this.f37195a = i10;
        this.f37196b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f37195a;
        Object obj = this.f37196b;
        switch (i11) {
            case 0:
                ua uaVar = (ua) obj;
                if (i10 == -1) {
                    uaVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ua.Y(uaVar);
                    ua.Z(uaVar);
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((xb) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                dd ddVar = (dd) obj;
                if (i10 == -1) {
                    if (ddVar.f36138b >= ddVar.S0() && ddVar.Q0()) {
                        ddVar.V0();
                        return;
                    } else {
                        ddVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) ddVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    ddVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    ddVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    ddVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    nc ncVar = new nc(ddVar, ddVar.getParentActivity(), canvas, (ddVar.L.getMeasuredWidth() / 2.0f) + f7, (ddVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    ddVar.m0 = ncVar;
                    ncVar.setOnTouchListener(new di.d(2));
                    ddVar.f36153n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ddVar.f36154o0 = ofFloat;
                    ofFloat.addUpdateListener(new ei.eb(ddVar, 1));
                    ddVar.f36154o0.addListener(new m.a(ddVar, 22));
                    ddVar.f36154o0.setDuration(400L);
                    ddVar.f36154o0.setInterpolator(org.telegram.ui.Components.st.e);
                    ddVar.f36154o0.start();
                    frameLayout.addView(ddVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new ic(ddVar, 0));
                    return;
                } else {
                    return;
                }
            case 3:
                ko koVar = (ko) obj;
                if (i10 == -1) {
                    if (koVar.e0(true)) {
                        koVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    koVar.j0();
                    return;
                } else {
                    return;
                }
            case 4:
                yo yoVar = (yo) obj;
                if (i10 == -1) {
                    yoVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.as asVar = yoVar.f43456r;
                    if (asVar == null || asVar.f24703c <= 0.0f) {
                        yoVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((kp) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((rp) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                dq dqVar = (dq) obj;
                if (i10 == -1) {
                    if (dqVar.m0(true)) {
                        dqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    dqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 8:
                jr jrVar = (jr) obj;
                if (i10 == -1) {
                    if (jrVar.g0(true)) {
                        jrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    jrVar.u0();
                    return;
                } else {
                    return;
                }
            case 9:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) obj;
                if (i10 == -1) {
                    k8Var.dismiss();
                    return;
                } else {
                    k8Var.u0(i10);
                    return;
                }
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) obj).dismiss();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj;
                if (i10 == -1) {
                    if (!tiVar.B0.j()) {
                        tiVar.dismiss();
                        return;
                    }
                    return;
                }
                tiVar.B0.w(i10);
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.k40) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.dg0) obj).f25588r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.kh0) obj).dismiss();
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Components.dr0) obj).onBackPressed();
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.v61) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((ch1) obj).a(false, false);
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((qt) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((nu) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((bv) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((wy) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                nz nzVar = (nz) obj;
                if (i10 == -1) {
                    if (nzVar.W(true)) {
                        nzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(nzVar.T - 1.0f) < 0.1f) {
                        nzVar.c0();
                        return;
                    } else if (Math.abs(nzVar.T - 0.5f) < 0.1f) {
                        for (int i12 = 0; i12 < nzVar.f39588a.getChildCount(); i12++) {
                            View childAt = nzVar.f39588a.getChildAt(i12);
                            nzVar.f39588a.getClass();
                            if (RecyclerView.R(childAt) == nzVar.L && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i13 = -nzVar.f39594s;
                                nzVar.f39594s = i13;
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
            case 26:
                p00 p00Var = (p00) obj;
                if (i10 == -1) {
                    if (p00Var.h0(true)) {
                        p00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    p00Var.q0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((a20) obj).finishFragment();
                    return;
                }
                return;
            default:
                n60 n60Var = (n60) obj;
                if (i10 == -1) {
                    if (n60Var.f0(true)) {
                        n60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    n60Var.o0();
                    return;
                } else {
                    return;
                }
        }
    }
}
