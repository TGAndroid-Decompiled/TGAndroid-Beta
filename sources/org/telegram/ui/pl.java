package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pl extends org.telegram.ui.Components.du0 {
    public int f50896g0;
    public int f50897h0;
    public int f50898i0;
    public final ArrayList f50899j0;
    public final ArrayList f50900k0;
    public final ArrayList f50901l0;
    public final ArrayList m0;
    public Paint f50902n0;
    public int f50903o0;
    public final nl f50904p0;
    public final nl f50905q0;
    public final RectF f50906r0;
    public float f50907s0;
    public float f50908t0;
    public long f50909u0;
    public boolean f50910v0;
    public ColorDrawable f50911w0;
    public final bn f50912x0;

    public pl(bn bnVar, Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context, r4Var);
        this.f50912x0 = bnVar;
        this.f50896g0 = 0;
        this.f50899j0 = new ArrayList();
        this.f50900k0 = new ArrayList();
        this.f50901l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.f50904p0 = new eh.a(this) {
            public final pl f50212b;

            {
                this.f50212b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8401a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bn bnVar2 = this.f50212b.f50912x0;
                        if (bnVar2.A0.Y0() && bnVar2.A0.getOverScrollMode() != 2) {
                            bnVar2.A0.d(canvas, rectF);
                            return;
                        }
                        bnVar2.A0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < bnVar2.A0.getChildCount(); i7++) {
                            View childAt = bnVar2.A0.getChildAt(i7);
                            if (!bn.m2(bnVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.r1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                                    if (r1Var.L0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, r1Var.W);
                                        r1Var.M0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    if (r1Var.k2()) {
                                        canvas.save();
                                        canvas.translate(r1Var.getX(), r1Var.getY());
                                        r1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                    bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.v0) childAt).I(canvas);
                                    canvas.restore();
                                } else {
                                    bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        bnVar2.A0.A1(canvas, rectF);
                        return;
                    default:
                        pl plVar = this.f50212b;
                        bn bnVar3 = plVar.f50912x0;
                        RectF rectF2 = plVar.f50906r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, plVar.getWidth(), plVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = bnVar3.f46045gd.f57700e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, bnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6))));
                            }
                            ih.d.b(plVar.f50904p0, canvas, rectF, bnVar3.A0, plVar, i10);
                            di.b1 b1Var = bnVar3.f45954a4;
                            if (b1Var != null) {
                                ih.d.b(b1Var, canvas, rectF, b1Var, plVar, i11);
                            }
                            hi.i1 i1Var = bnVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = bnVar3.F1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = bnVar3.F1.getChildAt(i12);
                                    if ((childAt2 instanceof dn) && childAt2.getVisibility() == 0) {
                                        pl plVar2 = ((dn) childAt2).f47013a.f46111m1;
                                        ih.d.a(plVar2.f50905q0, canvas, rectF, plVar2, plVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f50905q0 = new eh.a(this) {
            public final pl f50212b;

            {
                this.f50212b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8401a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bn bnVar2 = this.f50212b.f50912x0;
                        if (bnVar2.A0.Y0() && bnVar2.A0.getOverScrollMode() != 2) {
                            bnVar2.A0.d(canvas, rectF);
                            return;
                        }
                        bnVar2.A0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < bnVar2.A0.getChildCount(); i7++) {
                            View childAt = bnVar2.A0.getChildAt(i7);
                            if (!bn.m2(bnVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.r1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                                    if (r1Var.L0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, r1Var.W);
                                        r1Var.M0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    if (r1Var.k2()) {
                                        canvas.save();
                                        canvas.translate(r1Var.getX(), r1Var.getY());
                                        r1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                    bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.v0) childAt).I(canvas);
                                    canvas.restore();
                                } else {
                                    bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        bnVar2.A0.A1(canvas, rectF);
                        return;
                    default:
                        pl plVar = this.f50212b;
                        bn bnVar3 = plVar.f50912x0;
                        RectF rectF2 = plVar.f50906r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, plVar.getWidth(), plVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = bnVar3.f46045gd.f57700e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, bnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6))));
                            }
                            ih.d.b(plVar.f50904p0, canvas, rectF, bnVar3.A0, plVar, i10);
                            di.b1 b1Var = bnVar3.f45954a4;
                            if (b1Var != null) {
                                ih.d.b(b1Var, canvas, rectF, b1Var, plVar, i11);
                            }
                            hi.i1 i1Var = bnVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = bnVar3.F1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = bnVar3.F1.getChildAt(i12);
                                    if ((childAt2 instanceof dn) && childAt2.getVisibility() == 0) {
                                        pl plVar2 = ((dn) childAt2).f47013a.f46111m1;
                                        ih.d.a(plVar2.f50905q0, canvas, rectF, plVar2, plVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f50906r0 = new RectF();
        this.I = new ol(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        bn bnVar = this.f50912x0;
        bnVar.f46111m1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        kVar.setTranslationY(0.0f);
        ik ikVar = bnVar.Bb;
        if (ikVar != null) {
            bk bkVar = bnVar.D1;
            if (bkVar != null) {
                i7 = bkVar.getCurrentHeight();
            } else {
                i7 = 0;
            }
            ikVar.setTranslationY(i7);
        }
        hi.l3 l3Var = bnVar.L1;
        if (l3Var != null) {
            l3Var.setTranslationY(0.0f);
        }
        hi.l3 l3Var2 = bnVar.K1;
        if (l3Var2 != null) {
            l3Var2.setTranslationY(0.0f);
        }
        bnVar.f46021f1.setTranslationY(0.0f);
        bnVar.R.setTranslationY(0.0f);
        bnVar.T9 = 0.0f;
        bnVar.U9 = 0.0f;
        bnVar.f46111m1.setBackgroundTranslation(0);
        org.telegram.ui.Components.h50 h50Var = bnVar.f46162q3;
        if (h50Var != null) {
            h50Var.g(0.0f);
        }
        hi.l5 l5Var = bnVar.N2;
        if (l5Var != null) {
            org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) l5Var.f15005b;
            aaVar.f33462u = 0.0f;
            aaVar.d.invalidate();
        }
        bnVar.setFragmentPanTranslationOffset(0);
        bnVar.M9();
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q() {
        fi.n2 n2Var = this.f50912x0.Y1;
        if (n2Var != null && n2Var.isShowing()) {
            this.f34583f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        boolean z11;
        bn bnVar = this.f50912x0;
        jh.l lVar = bnVar.Y;
        if (drawable instanceof org.telegram.ui.Components.cb0) {
            ((org.telegram.ui.Components.cb0) drawable).p();
        }
        ui.a c10 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c10));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c10));
        int i7 = 0;
        if (B <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.f46057hc = z10;
        if (B2 <= 0.9f) {
            z11 = true;
        } else {
            z11 = false;
        }
        bnVar.f46070ic = z11;
        bnVar.N.f59055a = c10;
        ui.f fVar = bnVar.J;
        if (fVar != null) {
            Iterator it = fVar.f59054w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).f11699g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.f fVar2 = bnVar.K;
        if (fVar2 != null) {
            Iterator it2 = fVar2.f59054w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).f11699g0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = bnVar.Z;
        if (fVar3 != null) {
            if (bnVar.S9()) {
                i7 = bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29720va);
            }
            fVar3.setOverlayColor(i7);
            bnVar.Z.invalidate();
        }
        jh.f fVar4 = bnVar.U;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        bnVar.f46111m1.invalidate();
        Iterator it3 = bnVar.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        bnVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.r1 r1Var, int i7) {
        float f11;
        int save = canvas.save();
        bn bnVar = this.f50912x0;
        float x10 = r1Var.getX() + bnVar.A0.getLeft();
        float y10 = r1Var.getY() + bnVar.A0.getY() + r1Var.getPaddingTop();
        if (r1Var.b()) {
            f11 = r1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(bnVar.A0.getLeft(), f10, bnVar.A0.getRight(), ((((bnVar.A0.getY() + bnVar.A0.getMeasuredHeight()) - bnVar.Ya) - bnVar.f46236w.e()) - bnVar.f45963ad) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        boolean z10 = true;
        r1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            r1Var.y1(f11, canvas, true);
        } else if (i7 == 1) {
            r1Var.h1(canvas, f11);
        } else if (i7 == 2) {
            if (r1Var.getCurrentPosition() == null || (r1Var.getCurrentPosition().f28101l & 1) != 0) {
                z10 = false;
            }
            r1Var.Q0(f11, canvas, z10);
        } else if (i7 == 3) {
            if (r1Var.getCurrentPosition() == null || (r1Var.getCurrentPosition().f28101l & 1) != 0) {
                z10 = false;
            }
            r1Var.V0(canvas, f11);
            if (!z10) {
                r1Var.o1(canvas, f11, null);
            }
        } else if (i7 == 4 && ((r1Var.getCurrentPosition() == null || (1 & r1Var.getCurrentPosition().f28101l) != 0) && bnVar.f45988c9 != null)) {
            float f12 = (bnVar.X8 * bnVar.f45959a9) / 0.2f;
            canvas.save();
            r1Var.s1(canvas, bnVar.f45988c9, f12, bnVar.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            r1Var.t1(this, canvas, bnVar.f46001d9, bnVar.f45988c9, f12);
            canvas.restore();
        }
        r1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pl.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.M) {
            bn bnVar = this.f50912x0;
            if (view != bnVar.N2 && view != bnVar.F1 && view != bnVar.J9 && view != bnVar.Z && view != bnVar.Z3 && view != bnVar.f46122n0 && !(view instanceof org.telegram.ui.ActionBar.j5)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.rg rgVar;
        int i10;
        bn bnVar = this.f50912x0;
        rj rjVar = bnVar.f45950a0;
        if (rjVar != null && view == rjVar.f32674n0) {
            lh.f fVar = bnVar.Z;
            if (fVar != null) {
                i10 = indexOfChild(fVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                i7 = i10;
            }
            super.addView(view, i7, layoutParams);
        } else {
            super.addView(view, i7, layoutParams);
        }
        rj rjVar2 = bnVar.f45950a0;
        if (rjVar2 != null && view == rjVar2.f32674n0) {
            ki.u uVar = (ki.u) view;
            uVar.setBackgroundDrawable(bnVar.L.c(uVar.f18993c, bnVar.E, false));
        }
        rj rjVar3 = bnVar.f45950a0;
        if (rjVar3 != null && view == (rgVar = rjVar3.E2)) {
            rgVar.setBlurredBackgroundFactory(bnVar.L);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pl.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        mk mkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (mkVar = this.f50912x0.f45990cb) != null && mkVar.f41744s) {
            mkVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pl.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        bn bnVar = this.f50912x0;
        org.telegram.ui.Components.g11 g11Var = bnVar.f46122n0;
        if (view != g11Var && view != this.M && view != bnVar.Z && !(view instanceof org.telegram.ui.ActionBar.j5) && g11Var != null) {
            f10 = g11Var.getProgress() * bnVar.f46122n0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        if (f10 <= 0.0f) {
            return Z(canvas, view, j3);
        }
        canvas.save();
        canvas.translate(-f10, 0.0f);
        boolean Z = Z(canvas, view, j3);
        canvas.restore();
        return Z;
    }

    @Override
    public float getBottomOffset() {
        return this.f50912x0.A0.getBottom();
    }

    public bn getChatActivity() {
        return this.f50912x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.f50912x0.getThemedColor(org.telegram.ui.ActionBar.m6.f29701ua);
        ColorDrawable colorDrawable = this.f50911w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.f50911w0 = new ColorDrawable(themedColor);
        }
        return this.f50911w0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.f50912x0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.f50912x0.A0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        bn bnVar = this.f50912x0;
        if (bnVar.S9()) {
            return getCompactBackground();
        }
        Drawable c10 = bnVar.Ba.c();
        if (c10 != null) {
            return c10;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.f50912x0.Ba.f54590g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        if (wallPaperSettings != null && wallPaperSettings.motion) {
            return true;
        }
        return false;
    }

    @Override
    public int getScrollOffset() {
        return this.f50912x0.A0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        View view;
        super.onAttachedToWindow();
        bn bnVar = this.f50912x0;
        if (!bnVar.mb) {
            r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                if (((ActionBarLayout) r4Var2).f28713b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.I;
                    r4Var3 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                    i1Var.f29007b = (FrameLayout) r4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.I.f29007b = bnVar.f46111m1;
        }
        this.I.c();
        bnVar.f45950a0.setAdjustPanLayoutHelper(this.I);
        org.telegram.messenger.gj gjVar = MediaController.B().f22771v0;
        if (gjVar != null && ((gjVar.h4() || org.telegram.messenger.gj.L4(gjVar.f24213k)) && gjVar.T == 0 && org.telegram.messenger.gj.B0(gjVar.f24213k) == bnVar.f46103l6)) {
            MediaController.B().p0(bnVar.e8(false), bnVar.L8, bnVar.J8, true);
        }
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            yoVar.G.P();
            org.telegram.ui.Components.p5 p5Var = yoVar.f54259l0;
            if (p5Var != null && (view = yoVar.f54246b0) != null) {
                p5Var.a(view);
            }
            org.telegram.messenger.ls.f(yoVar.f54253f0).c(yoVar, org.telegram.messenger.ls.f25371r);
        }
        bnVar.Ua.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.I.d();
        bn bnVar = this.f50912x0;
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            org.telegram.messenger.ls.f(yoVar.f54253f0).n(yoVar, org.telegram.messenger.ls.f25371r);
            yoVar.G.R();
            org.telegram.ui.Components.p5 p5Var = yoVar.f54259l0;
            if (p5Var != null && (view = yoVar.f54246b0) != null) {
                p5Var.n(view);
            }
            yoVar.R = 0.0f;
            yoVar.Q = 0L;
            bnVar.ma = null;
        }
        bnVar.Ua.j();
        org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bn bnVar;
        hi.l5 l5Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (l5Var = (bnVar = this.f50912x0).N2) != null && l5Var.a() && bnVar.N2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pl.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pl.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        bn bnVar = this.f50912x0;
        ih.d.c(bnVar.P8, bnVar.fragmentView);
        bnVar.Q8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f50912x0.T4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        bn bnVar = this.f50912x0;
        bnVar.S9 = i10;
        bnVar.M9();
        bnVar.O9();
    }

    @Override
    public final void K() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
