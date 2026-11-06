package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ks0 extends FrameLayout {
    public boolean f47271a;
    public boolean f47272b;
    public final Paint f47273c;
    public final PremiumPreviewFragment d;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f47273c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        ug.q1 q1Var;
        float f12;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z9 = premiumPreviewFragment.f41589h0;
        ug.y0 y0Var = premiumPreviewFragment.m0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f41607w0 != null) {
            premiumPreviewFragment.o0();
        }
        if (!premiumPreviewFragment.Z) {
            if (premiumPreviewFragment.f41578a0) {
                float f13 = premiumPreviewFragment.f41580b0 + 0.016f;
                premiumPreviewFragment.f41580b0 = f13;
                if (f13 > 3.0f) {
                    premiumPreviewFragment.f41578a0 = false;
                }
            } else {
                float f14 = premiumPreviewFragment.f41580b0 - 0.016f;
                premiumPreviewFragment.f41580b0 = f14;
                if (f14 < 1.0f) {
                    premiumPreviewFragment.f41578a0 = true;
                }
            }
        }
        if (premiumPreviewFragment.f41577a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f41577a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.f41582c0 = bottom;
        kVar = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        float f15 = 16.0f;
        int L = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
        float f16 = 1.0f - ((premiumPreviewFragment.f41582c0 - L) / (premiumPreviewFragment.Y - L));
        premiumPreviewFragment.f41587f0 = f16;
        premiumPreviewFragment.f41587f0 = Utilities.i(f16, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.f41582c0 < L2) {
            premiumPreviewFragment.f41582c0 = L2;
        }
        float f17 = premiumPreviewFragment.f41598q0;
        premiumPreviewFragment.f41598q0 = 0.0f;
        if (premiumPreviewFragment.f41582c0 < org.telegram.messenger.g0.L(30.0f) + L2) {
            premiumPreviewFragment.f41598q0 = ((org.telegram.messenger.g0.L(30.0f) + L2) - premiumPreviewFragment.f41582c0) / org.telegram.messenger.g0.L(30.0f);
        }
        if (premiumPreviewFragment.W) {
            premiumPreviewFragment.f41598q0 = 1.0f;
            premiumPreviewFragment.f41587f0 = 1.0f;
        }
        if (f17 != premiumPreviewFragment.f41598q0) {
            premiumPreviewFragment.f41577a.invalidate();
        }
        int i7 = premiumPreviewFragment.f41582c0;
        kVar3 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        int measuredHeight = i7 - ((premiumPreviewFragment.U.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.X);
        if (premiumPreviewFragment.U.f50107e.getVisibility() == 0) {
            f10 = 24.0f;
        } else {
            f10 = 16.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.X) - premiumPreviewFragment.U.f50104a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.X) - premiumPreviewFragment.U.getTop()) - premiumPreviewFragment.U.f50104a.getTop(), org.telegram.messenger.g0.L(24.0f) + L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f);
        premiumPreviewFragment.U.setTranslationY(max);
        bi.qd qdVar = premiumPreviewFragment.U.d;
        if (premiumPreviewFragment.f41588g0 == 1) {
            f15 = 9.0f;
        }
        qdVar.setTranslationY(L4 + org.telegram.messenger.g0.L(f15));
        float f18 = premiumPreviewFragment.f41587f0;
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f18, 0.4f, 0.6f);
        if (f18 > 0.5f) {
            f11 = (f18 - 0.5f) / 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f19 = 1.0f - f11;
        premiumPreviewFragment.U.d.setScaleX(z10);
        premiumPreviewFragment.U.d.setScaleY(z10);
        premiumPreviewFragment.U.d.setAlpha(f19);
        premiumPreviewFragment.U.f50105b.setAlpha(f19);
        premiumPreviewFragment.U.f50107e.setAlpha(f19);
        premiumPreviewFragment.V.setAlpha(1.0f - premiumPreviewFragment.f41587f0);
        premiumPreviewFragment.V.setTranslationY(premiumPreviewFragment.U.f50106c.getY() + premiumPreviewFragment.U.getY() + ((-(q1Var.getMeasuredHeight() - premiumPreviewFragment.U.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.g0.L(72.0f) - premiumPreviewFragment.U.f50104a.getLeft();
        float f20 = premiumPreviewFragment.f41587f0;
        if (f20 > 0.3f) {
            f12 = (f20 - 0.3f) / 0.7f;
        } else {
            f12 = 0.0f;
        }
        premiumPreviewFragment.U.f50104a.setTranslationX((1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - f12)) * L5);
        ts0 ts0Var = premiumPreviewFragment.U;
        ts0Var.d.f57295b.f57273s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.f41580b0) + (premiumPreviewFragment.U.f50106c.getX() + ts0Var.getX())) / getMeasuredWidth();
        ts0 ts0Var2 = premiumPreviewFragment.U;
        ts0Var2.d.f57295b.f57274t = (premiumPreviewFragment.U.f50106c.getY() + ts0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.Z) {
            invalidate();
            premiumPreviewFragment.K.invalidate();
            premiumPreviewFragment.J.invalidate();
        }
        y0Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f41580b0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z9) {
            int i10 = org.telegram.ui.ActionBar.k6.f27792a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.f47273c;
            paint.setColor(themedColor);
            boolean z11 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f41598q0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.f(premiumPreviewFragment.f41598q0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z11;
                }
            }
            canvas2 = canvas;
            r11 = z11;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y0Var.f56752f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.J.getVisibility() != 0) {
            premiumPreviewFragment.f41605v0.b(premiumPreviewFragment.f41596o0.d, r11);
            premiumPreviewFragment.f41605v0.setBounds(r11, getHeight() - premiumPreviewFragment.f41596o0.d, getWidth(), getHeight());
            premiumPreviewFragment.f41605v0.draw(canvas2);
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).parentLayout;
        if (q4Var != null && z9) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).parentLayout;
            int i11 = (int) (premiumPreviewFragment.f41598q0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) q4Var2).p(canvas2, i11, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.U.f50106c.getX() + premiumPreviewFragment.U.getX();
        float y10 = premiumPreviewFragment.U.f50106c.getY() + premiumPreviewFragment.U.getY();
        RectF rectF = org.telegram.messenger.g0.P;
        bi.qd qdVar = premiumPreviewFragment.U.d;
        if (qdVar == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = qdVar.getMeasuredWidth();
        }
        float f10 = measuredWidth + x10;
        bi.qd qdVar2 = premiumPreviewFragment.U.d;
        if (qdVar2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = qdVar2.getMeasuredHeight();
        }
        rectF.set(x10, y10, f10, measuredHeight + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f47271a) && !premiumPreviewFragment.f41577a.I1) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f47271a = false;
                }
            } else {
                this.f47271a = true;
            }
            premiumPreviewFragment.U.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.U.f50107e.getX() + premiumPreviewFragment.U.getX();
        float y11 = premiumPreviewFragment.U.f50107e.getY() + premiumPreviewFragment.U.getY();
        rectF.set(x11, y11, premiumPreviewFragment.U.f50107e.getWidth() + x11, premiumPreviewFragment.U.f50107e.getHeight() + y11);
        if (premiumPreviewFragment.f41598q0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f47272b) && !premiumPreviewFragment.f41577a.I1)) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0) {
                this.f47272b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f47272b = false;
            }
            premiumPreviewFragment.U.f50107e.dispatchTouchEvent(motionEvent);
            if (this.f47272b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        bi.qd qdVar = premiumPreviewFragment.U.d;
        qdVar.f57295b.f57275u = qdVar.getMeasuredWidth() / getMeasuredWidth();
        bi.qd qdVar2 = premiumPreviewFragment.U.d;
        qdVar2.f57295b.v = qdVar2.getMeasuredHeight() / getMeasuredHeight();
        ts0 ts0Var = premiumPreviewFragment.U;
        ts0Var.d.f57295b.f57273s = (premiumPreviewFragment.U.d.getX() + ts0Var.getX()) / getMeasuredWidth();
        ts0 ts0Var2 = premiumPreviewFragment.U;
        ts0Var2.d.f57295b.f57274t = (premiumPreviewFragment.U.d.getY() + ts0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int i11 = 0;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.W = z9;
        premiumPreviewFragment.X = org.telegram.messenger.g0.f22531m;
        premiumPreviewFragment.U.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.V.getLayoutParams().height = premiumPreviewFragment.U.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.J;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(68.0f);
        }
        org.telegram.ui.Components.ly lyVar = premiumPreviewFragment.P;
        lyVar.M = (premiumPreviewFragment.X + i11) - org.telegram.messenger.g0.L(16.0f);
        lyVar.p1();
        premiumPreviewFragment.P.S = i11;
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f41581c;
        ArrayList arrayList2 = premiumPreviewFragment.f41579b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.L.a((us0) arrayList2.get(i14), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((us0) arrayList2.get(i14)).f50488e = i13;
            i13 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.L.a((us0) arrayList.get(i15), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((us0) arrayList.get(i15)).f50488e = i13;
            i13 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        premiumPreviewFragment.N = i13;
    }
}
