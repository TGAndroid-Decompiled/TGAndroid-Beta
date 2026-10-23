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
public final class ea extends org.telegram.ui.ActionBar.j {
    public final int f36615a;
    public final Object f36616b;

    public ea(Object obj, int i10) {
        this.f36615a = i10;
        this.f36616b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f36615a;
        Object obj = this.f36616b;
        switch (i11) {
            case 0:
                sa saVar = (sa) obj;
                if (i10 == -1) {
                    saVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    sa.Y(saVar);
                    sa.Z(saVar);
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((vb) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                bd bdVar = (bd) obj;
                if (i10 == -1) {
                    if (bdVar.f35579b >= bdVar.S0() && bdVar.Q0()) {
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
                    lc lcVar = new lc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    bdVar.m0 = lcVar;
                    lcVar.setOnTouchListener(new di.d(2));
                    bdVar.f35594n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f35595o0 = ofFloat;
                    ofFloat.addUpdateListener(new ei.eb(bdVar, 1));
                    bdVar.f35595o0.addListener(new m.a(bdVar, 22));
                    bdVar.f35595o0.setDuration(400L);
                    bdVar.f35595o0.setInterpolator(org.telegram.ui.Components.st.e);
                    bdVar.f35595o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new gc(bdVar, 0));
                    return;
                } else {
                    return;
                }
            case 3:
                io ioVar = (io) obj;
                if (i10 == -1) {
                    if (ioVar.e0(true)) {
                        ioVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    ioVar.j0();
                    return;
                } else {
                    return;
                }
            case 4:
                wo woVar = (wo) obj;
                if (i10 == -1) {
                    woVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.as asVar = woVar.f42931r;
                    if (asVar == null || asVar.f24711c <= 0.0f) {
                        woVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((ip) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((pp) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                bq bqVar = (bq) obj;
                if (i10 == -1) {
                    if (bqVar.m0(true)) {
                        bqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    bqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 8:
                hr hrVar = (hr) obj;
                if (i10 == -1) {
                    if (hrVar.g0(true)) {
                        hrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    hrVar.u0();
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
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.eg0) obj).f25905r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.lh0) obj).dismiss();
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Components.fr0) obj).onBackPressed();
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.x61) obj).finishFragment();
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
                    ((ah1) obj).a(false, false);
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((ot) obj).finishFragment();
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
                    ((lu) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((av) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((uy) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                lz lzVar = (lz) obj;
                if (i10 == -1) {
                    if (lzVar.W(true)) {
                        lzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(lzVar.T - 1.0f) < 0.1f) {
                        lzVar.c0();
                        return;
                    } else if (Math.abs(lzVar.T - 0.5f) < 0.1f) {
                        for (int i12 = 0; i12 < lzVar.f39059a.getChildCount(); i12++) {
                            View childAt = lzVar.f39059a.getChildAt(i12);
                            lzVar.f39059a.getClass();
                            if (RecyclerView.R(childAt) == lzVar.L && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i13 = -lzVar.f39065s;
                                lzVar.f39065s = i13;
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
                n00 n00Var = (n00) obj;
                if (i10 == -1) {
                    if (n00Var.h0(true)) {
                        n00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    n00Var.q0();
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
                    ((y10) obj).finishFragment();
                    return;
                }
                return;
            default:
                l60 l60Var = (l60) obj;
                if (i10 == -1) {
                    if (l60Var.f0(true)) {
                        l60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    l60Var.o0();
                    return;
                } else {
                    return;
                }
        }
    }
}
