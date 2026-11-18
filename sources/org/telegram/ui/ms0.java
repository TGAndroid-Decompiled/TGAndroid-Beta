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
public final class ms0 extends FrameLayout {
    public boolean f49923a;
    public boolean f49924b;
    public final Paint f49925c;
    public final PremiumPreviewFragment d;

    public ms0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f49925c = new Paint(1);
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
        ug.u1 u1Var;
        float f12;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f43433i0;
        ug.b1 b1Var = premiumPreviewFragment.f43438n0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f43452x0 != null) {
            premiumPreviewFragment.o0();
        }
        if (!premiumPreviewFragment.f43421a0) {
            if (premiumPreviewFragment.f43423b0) {
                float f13 = premiumPreviewFragment.f43425c0 + 0.016f;
                premiumPreviewFragment.f43425c0 = f13;
                if (f13 > 3.0f) {
                    premiumPreviewFragment.f43423b0 = false;
                }
            } else {
                float f14 = premiumPreviewFragment.f43425c0 - 0.016f;
                premiumPreviewFragment.f43425c0 = f14;
                if (f14 < 1.0f) {
                    premiumPreviewFragment.f43423b0 = true;
                }
            }
        }
        if (premiumPreviewFragment.f43420a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f43420a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.f43426d0 = bottom;
        kVar = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
        float f15 = 16.0f;
        int L = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
        float f16 = 1.0f - ((premiumPreviewFragment.f43426d0 - L) / (premiumPreviewFragment.Z - L));
        premiumPreviewFragment.f43431g0 = f16;
        premiumPreviewFragment.f43431g0 = Utilities.i(f16, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.f43426d0 < L2) {
            premiumPreviewFragment.f43426d0 = L2;
        }
        float f17 = premiumPreviewFragment.f43443r0;
        premiumPreviewFragment.f43443r0 = 0.0f;
        if (premiumPreviewFragment.f43426d0 < org.telegram.messenger.g0.L(30.0f) + L2) {
            premiumPreviewFragment.f43443r0 = ((org.telegram.messenger.g0.L(30.0f) + L2) - premiumPreviewFragment.f43426d0) / org.telegram.messenger.g0.L(30.0f);
        }
        if (premiumPreviewFragment.X) {
            premiumPreviewFragment.f43443r0 = 1.0f;
            premiumPreviewFragment.f43431g0 = 1.0f;
        }
        if (f17 != premiumPreviewFragment.f43443r0) {
            premiumPreviewFragment.f43420a.invalidate();
        }
        int i7 = premiumPreviewFragment.f43426d0;
        kVar3 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
        int measuredHeight = i7 - ((premiumPreviewFragment.V.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.Y);
        if (premiumPreviewFragment.V.f52843e.getVisibility() == 0) {
            f10 = 24.0f;
        } else {
            f10 = 16.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.Y) - premiumPreviewFragment.V.f52840a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.Y) - premiumPreviewFragment.V.getTop()) - premiumPreviewFragment.V.f52840a.getTop(), org.telegram.messenger.g0.L(24.0f) + L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f);
        premiumPreviewFragment.V.setTranslationY(max);
        di.bc bcVar = premiumPreviewFragment.V.d;
        if (premiumPreviewFragment.f43432h0 == 1) {
            f15 = 9.0f;
        }
        bcVar.setTranslationY(L4 + org.telegram.messenger.g0.L(f15));
        float f18 = premiumPreviewFragment.f43431g0;
        float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f18, 0.4f, 0.6f);
        if (f18 > 0.5f) {
            f11 = (f18 - 0.5f) / 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f19 = 1.0f - f11;
        premiumPreviewFragment.V.d.setScaleX(z11);
        premiumPreviewFragment.V.d.setScaleY(z11);
        premiumPreviewFragment.V.d.setAlpha(f19);
        premiumPreviewFragment.V.f52841b.setAlpha(f19);
        premiumPreviewFragment.V.f52843e.setAlpha(f19);
        premiumPreviewFragment.W.setAlpha(1.0f - premiumPreviewFragment.f43431g0);
        premiumPreviewFragment.W.setTranslationY(premiumPreviewFragment.V.f52842c.getY() + premiumPreviewFragment.V.getY() + ((-(u1Var.getMeasuredHeight() - premiumPreviewFragment.V.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.g0.L(72.0f) - premiumPreviewFragment.V.f52840a.getLeft();
        float f20 = premiumPreviewFragment.f43431g0;
        if (f20 > 0.3f) {
            f12 = (f20 - 0.3f) / 0.7f;
        } else {
            f12 = 0.0f;
        }
        premiumPreviewFragment.V.f52840a.setTranslationX((1.0f - org.telegram.ui.Components.lr.h.getInterpolation(1.0f - f12)) * L5);
        vs0 vs0Var = premiumPreviewFragment.V;
        vs0Var.d.f59463b.f59441s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.f43425c0) + (premiumPreviewFragment.V.f52842c.getX() + vs0Var.getX())) / getMeasuredWidth();
        vs0 vs0Var2 = premiumPreviewFragment.V;
        vs0Var2.d.f59463b.f59442t = (premiumPreviewFragment.V.f52842c.getY() + vs0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.f43421a0) {
            invalidate();
            premiumPreviewFragment.L.invalidate();
            premiumPreviewFragment.K.invalidate();
        }
        b1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f43425c0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.n6.f29337a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.f49925c;
            paint.setColor(themedColor);
            boolean z12 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f43443r0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.f(premiumPreviewFragment.f43443r0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z12;
                }
            }
            canvas2 = canvas;
            r11 = z12;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b1Var.f58607f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.K.getVisibility() != 0) {
            premiumPreviewFragment.f43450w0.b(premiumPreviewFragment.f43440p0.d, r11);
            premiumPreviewFragment.f43450w0.setBounds(r11, getHeight() - premiumPreviewFragment.f43440p0.d, getWidth(), getHeight());
            premiumPreviewFragment.f43450w0.draw(canvas2);
        }
        s4Var = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).parentLayout;
        if (s4Var != null && z10) {
            s4Var2 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).parentLayout;
            int i11 = (int) (premiumPreviewFragment.f43443r0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) s4Var2).p(canvas2, i11, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.V.f52842c.getX() + premiumPreviewFragment.V.getX();
        float y10 = premiumPreviewFragment.V.f52842c.getY() + premiumPreviewFragment.V.getY();
        RectF rectF = org.telegram.messenger.g0.P;
        di.bc bcVar = premiumPreviewFragment.V.d;
        if (bcVar == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = bcVar.getMeasuredWidth();
        }
        float f10 = measuredWidth + x10;
        di.bc bcVar2 = premiumPreviewFragment.V.d;
        if (bcVar2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = bcVar2.getMeasuredHeight();
        }
        rectF.set(x10, y10, f10, measuredHeight + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f49923a) && !premiumPreviewFragment.f43420a.J1) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f49923a = false;
                }
            } else {
                this.f49923a = true;
            }
            premiumPreviewFragment.V.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.V.f52843e.getX() + premiumPreviewFragment.V.getX();
        float y11 = premiumPreviewFragment.V.f52843e.getY() + premiumPreviewFragment.V.getY();
        rectF.set(x11, y11, premiumPreviewFragment.V.f52843e.getWidth() + x11, premiumPreviewFragment.V.f52843e.getHeight() + y11);
        if (premiumPreviewFragment.f43443r0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f49924b) && !premiumPreviewFragment.f43420a.J1)) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0) {
                this.f49924b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f49924b = false;
            }
            premiumPreviewFragment.V.f52843e.dispatchTouchEvent(motionEvent);
            if (this.f49924b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        di.bc bcVar = premiumPreviewFragment.V.d;
        bcVar.f59463b.f59443u = bcVar.getMeasuredWidth() / getMeasuredWidth();
        di.bc bcVar2 = premiumPreviewFragment.V.d;
        bcVar2.f59463b.v = bcVar2.getMeasuredHeight() / getMeasuredHeight();
        vs0 vs0Var = premiumPreviewFragment.V;
        vs0Var.d.f59463b.f59441s = (premiumPreviewFragment.V.d.getX() + vs0Var.getX()) / getMeasuredWidth();
        vs0 vs0Var2 = premiumPreviewFragment.V;
        vs0Var2.d.f59463b.f59442t = (premiumPreviewFragment.V.d.getY() + vs0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int i11 = 0;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.X = z10;
        premiumPreviewFragment.Y = org.telegram.messenger.g0.f24112m;
        premiumPreviewFragment.V.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.W.getLayoutParams().height = premiumPreviewFragment.V.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.K;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(68.0f);
        }
        org.telegram.ui.Components.wy wyVar = premiumPreviewFragment.Q;
        wyVar.M = (premiumPreviewFragment.Y + i11) - org.telegram.messenger.g0.L(16.0f);
        wyVar.p1();
        premiumPreviewFragment.Q.S = i11;
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f43424c;
        ArrayList arrayList2 = premiumPreviewFragment.f43422b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.M.a((ws0) arrayList2.get(i14), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((ws0) arrayList2.get(i14)).f53472e = i13;
            i13 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.M.a((ws0) arrayList.get(i15), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((ws0) arrayList.get(i15)).f53472e = i13;
            i13 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        premiumPreviewFragment.O = i13;
    }
}
