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
    public final int f36885a;
    public final Object f36886b;

    public ea(Object obj, int i10) {
        this.f36885a = i10;
        this.f36886b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f36885a;
        Object obj = this.f36886b;
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
                    if (bdVar.f36019b >= bdVar.U0() && bdVar.S0()) {
                        bdVar.X0();
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
                    bdVar.f36034n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f36035o0 = ofFloat;
                    ofFloat.addUpdateListener(new ei.eb(bdVar, 1));
                    bdVar.f36035o0.addListener(new m.a(bdVar, 22));
                    bdVar.f36035o0.setDuration(400L);
                    bdVar.f36035o0.setInterpolator(org.telegram.ui.Components.st.e);
                    bdVar.f36035o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new gc(bdVar, 0));
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
                    org.telegram.ui.Components.as asVar = yoVar.f43933r;
                    if (asVar == null || asVar.f24834c <= 0.0f) {
                        yoVar.Z();
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
                    k8Var.A0(i10);
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
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.ig0) obj).f27318r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.oh0) obj).dismiss();
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Components.ir0) obj).onBackPressed();
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.e71) obj).finishFragment();
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
                    ((hh1) obj).a(false, false);
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((rt) obj).finishFragment();
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
                    ((ou) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((cv) obj).finishFragment();
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
                oz ozVar = (oz) obj;
                if (i10 == -1) {
                    if (ozVar.W(true)) {
                        ozVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(ozVar.U - 1.0f) < 0.1f) {
                        ozVar.c0();
                        return;
                    } else if (Math.abs(ozVar.U - 0.5f) < 0.1f) {
                        for (int i12 = 0; i12 < ozVar.f40303a.getChildCount(); i12++) {
                            View childAt = ozVar.f40303a.getChildAt(i12);
                            ozVar.f40303a.getClass();
                            if (RecyclerView.R(childAt) == ozVar.M && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i13 = -ozVar.v;
                                ozVar.v = i13;
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
                q00 q00Var = (q00) obj;
                if (i10 == -1) {
                    if (q00Var.h0(true)) {
                        q00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    q00Var.q0();
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
                    ((b20) obj).finishFragment();
                    return;
                }
                return;
            default:
                p60 p60Var = (p60) obj;
                if (i10 == -1) {
                    if (p60Var.f0(true)) {
                        p60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    p60Var.o0();
                    return;
                } else {
                    return;
                }
        }
    }
}
