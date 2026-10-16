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
public final class nb extends org.telegram.ui.ActionBar.j {
    public final int f38350a;
    public final Object f38351b;

    public nb(Object obj, int i10) {
        this.f38350a = i10;
        this.f38351b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f38350a;
        Object obj = this.f38351b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((ac) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                gd gdVar = (gd) obj;
                if (i10 == -1) {
                    if (gdVar.f36139b >= gdVar.S0() && gdVar.Q0()) {
                        gdVar.V0();
                        return;
                    } else {
                        gdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) gdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    gdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    gdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    gdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    qc qcVar = new qc(gdVar, gdVar.getParentActivity(), canvas, (gdVar.L.getMeasuredWidth() / 2.0f) + f7, (gdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    gdVar.m0 = qcVar;
                    qcVar.setOnTouchListener(new ci.d(2));
                    gdVar.f36154n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gdVar.f36155o0 = ofFloat;
                    ofFloat.addUpdateListener(new di.tb(gdVar, 1));
                    gdVar.f36155o0.addListener(new u0(gdVar, 20));
                    gdVar.f36155o0.setDuration(400L);
                    gdVar.f36155o0.setInterpolator(org.telegram.ui.Components.xt.e);
                    gdVar.f36155o0.start();
                    frameLayout.addView(gdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new lc(gdVar, 0));
                    return;
                } else {
                    return;
                }
            case 2:
                zo zoVar = (zo) obj;
                if (i10 == -1) {
                    if (zoVar.e0(true)) {
                        zoVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    zoVar.j0();
                    return;
                } else {
                    return;
                }
            case 3:
                np npVar = (np) obj;
                if (i10 == -1) {
                    npVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.ds dsVar = npVar.f38453r;
                    if (dsVar == null || dsVar.f24174c <= 0.0f) {
                        npVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((aq) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((hq) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                tq tqVar = (tq) obj;
                if (i10 == -1) {
                    if (tqVar.m0(true)) {
                        tqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    tqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 7:
                yr yrVar = (yr) obj;
                if (i10 == -1) {
                    if (yrVar.g0(true)) {
                        yrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    yrVar.u0();
                    return;
                } else {
                    return;
                }
            case 8:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj;
                if (i10 == -1) {
                    m8Var.dismiss();
                    return;
                } else {
                    m8Var.u0(i10);
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.db) obj).dismiss();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj;
                if (i10 == -1) {
                    if (!viVar.B0.j()) {
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.B0.w(i10);
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.o40) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kg0) obj).f26390r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qh0) obj).dismiss();
                    return;
                }
                return;
            case 14:
                ((org.telegram.ui.Components.ir0) obj).onBackPressed();
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.d71) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((vi1) obj).a(false, false);
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((fu) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((ev) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((sv) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((qz) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                h00 h00Var = (h00) obj;
                if (i10 == -1) {
                    if (h00Var.W(true)) {
                        h00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(h00Var.T - 1.0f) < 0.1f) {
                        h00Var.c0();
                        return;
                    } else if (Math.abs(h00Var.T - 0.5f) < 0.1f) {
                        for (int i12 = 0; i12 < h00Var.f36352a.getChildCount(); i12++) {
                            View childAt = h00Var.f36352a.getChildAt(i12);
                            h00Var.f36352a.getClass();
                            if (RecyclerView.R(childAt) == h00Var.L && (childAt instanceof org.telegram.ui.Components.l10)) {
                                int i13 = -h00Var.f36358s;
                                h00Var.f36358s = i13;
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
            case 25:
                k10 k10Var = (k10) obj;
                if (i10 == -1) {
                    if (k10Var.h0(true)) {
                        k10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    k10Var.q0();
                    return;
                } else {
                    return;
                }
            case 26:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((v20) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                j70 j70Var = (j70) obj;
                if (i10 == -1) {
                    if (j70Var.f0(true)) {
                        j70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    j70Var.o0();
                    return;
                } else {
                    return;
                }
            default:
                if (i10 == -1) {
                    ((p70) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
