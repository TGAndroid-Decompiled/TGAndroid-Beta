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
public final class lc extends org.telegram.ui.ActionBar.j {
    public final int f39685a;
    public final Object f39686b;

    public lc(Object obj, int i10) {
        this.f39685a = i10;
        this.f39686b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f39685a;
        Object obj = this.f39686b;
        switch (i11) {
            case 0:
                fd fdVar = (fd) obj;
                if (i10 == -1) {
                    if (fdVar.f37726b >= fdVar.S0() && fdVar.Q0()) {
                        fdVar.V0();
                        return;
                    } else {
                        fdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) fdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    fdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    fdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    fdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    pc pcVar = new pc(fdVar, fdVar.getParentActivity(), canvas, (fdVar.L.getMeasuredWidth() / 2.0f) + f7, (fdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    fdVar.m0 = pcVar;
                    pcVar.setOnTouchListener(new bi.d(2));
                    fdVar.f37742n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fdVar.f37743o0 = ofFloat;
                    ofFloat.addUpdateListener(new ci.ub(fdVar, 1));
                    fdVar.f37743o0.addListener(new w4(fdVar, 17));
                    fdVar.f37743o0.setDuration(400L);
                    fdVar.f37743o0.setInterpolator(org.telegram.ui.Components.du.f25466e);
                    fdVar.f37743o0.start();
                    frameLayout.addView(fdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new jc(fdVar, 0));
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
                    org.telegram.ui.Components.is isVar = lpVar.f39822r;
                    if (isVar == null || isVar.f27268c <= 0.0f) {
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
                wr wrVar = (wr) obj;
                if (i10 == -1) {
                    if (wrVar.g0(true)) {
                        wrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    wrVar.u0();
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) obj;
                if (i10 == -1) {
                    l8Var.dismiss();
                    return;
                } else {
                    l8Var.u0(i10);
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.db) obj).dismiss();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.aj ajVar = (org.telegram.ui.Components.aj) obj;
                if (i10 == -1) {
                    if (!ajVar.B0.j()) {
                        ajVar.dismiss();
                        return;
                    }
                    return;
                }
                ajVar.B0.w(i10);
                return;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.v40) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.pg0) obj).f29503r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.wh0) obj).dismiss();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.sr0) obj).onBackPressed();
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.k71) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.y0) obj).b(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((qi1) obj).a(false, false);
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((cu) obj).finishFragment();
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
                    ((bv) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((pv) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((nz) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                e00 e00Var = (e00) obj;
                if (i10 == -1) {
                    if (e00Var.W(true)) {
                        e00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(e00Var.T - 1.0f) < 0.1f) {
                        e00Var.c0();
                        return;
                    } else if (Math.abs(e00Var.T - 0.5f) < 0.1f) {
                        for (int i12 = 0; i12 < e00Var.f36945a.getChildCount(); i12++) {
                            View childAt = e00Var.f36945a.getChildAt(i12);
                            e00Var.f36945a.getClass();
                            if (RecyclerView.R(childAt) == e00Var.L && (childAt instanceof org.telegram.ui.Components.s10)) {
                                int i13 = -e00Var.f36952s;
                                e00Var.f36952s = i13;
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
                h10 h10Var = (h10) obj;
                if (i10 == -1) {
                    if (h10Var.h0(true)) {
                        h10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    h10Var.q0();
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
                e70 e70Var = (e70) obj;
                if (i10 == -1) {
                    if (e70Var.f0(true)) {
                        e70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    e70Var.o0();
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
