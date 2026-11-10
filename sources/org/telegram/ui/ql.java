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
public final class ql extends org.telegram.ui.Components.st0 {
    public int f49065f0;
    public int f49066g0;
    public int f49067h0;
    public final ArrayList f49068i0;
    public final ArrayList f49069j0;
    public final ArrayList f49070k0;
    public final ArrayList f49071l0;
    public Paint m0;
    public int f49072n0;
    public final ol f49073o0;
    public final ol f49074p0;
    public final RectF f49075q0;
    public float f49076r0;
    public float f49077s0;
    public long f49078t0;
    public boolean f49079u0;
    public ColorDrawable f49080v0;
    public final cn f49081w0;

    public ql(cn cnVar, Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context, r4Var);
        this.f49081w0 = cnVar;
        this.f49065f0 = 0;
        this.f49068i0 = new ArrayList();
        this.f49069j0 = new ArrayList();
        this.f49070k0 = new ArrayList();
        this.f49071l0 = new ArrayList();
        this.f49073o0 = new eh.a(this) {
            public final ql f48543b;

            {
                this.f48543b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8703a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        cn cnVar2 = this.f48543b.f49081w0;
                        if (cnVar2.f44741z0.Y0() && cnVar2.f44741z0.getOverScrollMode() != 2) {
                            cnVar2.f44741z0.d(canvas, rectF);
                            return;
                        }
                        cnVar2.f44741z0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < cnVar2.f44741z0.getChildCount(); i7++) {
                            View childAt = cnVar2.f44741z0.getChildAt(i7);
                            if (!cn.m2(cnVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                    if (q1Var.L0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, q1Var.V);
                                        q1Var.M0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    cnVar2.f44741z0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.j2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    cnVar2.f44741z0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                    canvas.restore();
                                } else {
                                    cnVar2.f44741z0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        cnVar2.f44741z0.A1(canvas, rectF);
                        return;
                    default:
                        ql qlVar = this.f48543b;
                        cn cnVar3 = qlVar.f49081w0;
                        RectF rectF2 = qlVar.f49075q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qlVar.getWidth(), qlVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = cnVar3.f44486ed.f55498e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, cnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6))));
                            }
                            ih.d.b(qlVar.f49073o0, canvas, rectF, cnVar3.f44741z0, qlVar, i10);
                            bi.q1 q1Var2 = cnVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, qlVar, i11);
                            }
                            fi.g1 g1Var = cnVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = cnVar3.E1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = cnVar3.E1.getChildAt(i12);
                                    if ((childAt2 instanceof en) && childAt2.getVisibility() == 0) {
                                        ql qlVar2 = ((en) childAt2).f45407a.l1;
                                        ih.d.a(qlVar2.f49074p0, canvas, rectF, qlVar2, qlVar);
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
        this.f49074p0 = new eh.a(this) {
            public final ql f48543b;

            {
                this.f48543b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8703a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        cn cnVar2 = this.f48543b.f49081w0;
                        if (cnVar2.f44741z0.Y0() && cnVar2.f44741z0.getOverScrollMode() != 2) {
                            cnVar2.f44741z0.d(canvas, rectF);
                            return;
                        }
                        cnVar2.f44741z0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < cnVar2.f44741z0.getChildCount(); i7++) {
                            View childAt = cnVar2.f44741z0.getChildAt(i7);
                            if (!cn.m2(cnVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                    if (q1Var.L0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, q1Var.V);
                                        q1Var.M0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    cnVar2.f44741z0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.j2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    cnVar2.f44741z0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                    canvas.restore();
                                } else {
                                    cnVar2.f44741z0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        cnVar2.f44741z0.A1(canvas, rectF);
                        return;
                    default:
                        ql qlVar = this.f48543b;
                        cn cnVar3 = qlVar.f49081w0;
                        RectF rectF2 = qlVar.f49075q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qlVar.getWidth(), qlVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = cnVar3.f44486ed.f55498e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, cnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6))));
                            }
                            ih.d.b(qlVar.f49073o0, canvas, rectF, cnVar3.f44741z0, qlVar, i10);
                            bi.q1 q1Var2 = cnVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, qlVar, i11);
                            }
                            fi.g1 g1Var = cnVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = cnVar3.E1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = cnVar3.E1.getChildAt(i12);
                                    if ((childAt2 instanceof en) && childAt2.getVisibility() == 0) {
                                        ql qlVar2 = ((en) childAt2).f45407a.l1;
                                        ih.d.a(qlVar2.f49074p0, canvas, rectF, qlVar2, qlVar);
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
        this.f49075q0 = new RectF();
        this.H = new pl(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.l lVar;
        int i7;
        cn cnVar = this.f49081w0;
        cnVar.l1.setTranslationY(f10);
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        lVar.setTranslationY(0.0f);
        jk jkVar = cnVar.f44751zb;
        if (jkVar != null) {
            ck ckVar = cnVar.C1;
            if (ckVar != null) {
                i7 = ckVar.getCurrentHeight();
            } else {
                i7 = 0;
            }
            jkVar.setTranslationY(i7);
        }
        fi.m3 m3Var = cnVar.K1;
        if (m3Var != null) {
            m3Var.setTranslationY(0.0f);
        }
        fi.m3 m3Var2 = cnVar.J1;
        if (m3Var2 != null) {
            m3Var2.setTranslationY(0.0f);
        }
        cnVar.f44475e1.setTranslationY(0.0f);
        cnVar.Q.setTranslationY(0.0f);
        cnVar.R9 = 0.0f;
        cnVar.S9 = 0.0f;
        cnVar.l1.setBackgroundTranslation(0);
        org.telegram.ui.Components.t40 t40Var = cnVar.f44615p3;
        if (t40Var != null) {
            t40Var.g(0.0f);
        }
        fi.p5 p5Var = cnVar.M2;
        if (p5Var != null) {
            org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) p5Var.f12599b;
            v9Var.f38964u = 0.0f;
            v9Var.d.invalidate();
        }
        cnVar.setFragmentPanTranslationOffset(0);
        cnVar.L9();
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
        di.u2 u2Var = this.f49081w0.X1;
        if (u2Var != null && u2Var.isShowing()) {
            this.f38069f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z9;
        boolean z10;
        cn cnVar = this.f49081w0;
        jh.l lVar = cnVar.X;
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            ((org.telegram.ui.Components.qa0) drawable).p();
        }
        ri.a c10 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c10));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c10));
        int i7 = 0;
        if (B <= 0.721f) {
            z9 = true;
        } else {
            z9 = false;
        }
        cnVar.fc = z9;
        if (B2 <= 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        cnVar.f44512gc = z10;
        cnVar.M.f54589a = c10;
        ri.f fVar = cnVar.I;
        if (fVar != null) {
            Iterator it = fVar.f54588w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).f11540f0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ri.f fVar2 = cnVar.J;
        if (fVar2 != null) {
            Iterator it2 = fVar2.f54588w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).f11540f0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = cnVar.Y;
        if (fVar3 != null) {
            if (cnVar.R9()) {
                i7 = cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f28229va);
            }
            fVar3.setOverlayColor(i7);
            cnVar.Y.invalidate();
        }
        jh.f fVar4 = cnVar.T;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        cnVar.l1.invalidate();
        Iterator it3 = cnVar.E.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        cnVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i7) {
        float f11;
        int save = canvas.save();
        cn cnVar = this.f49081w0;
        float x10 = q1Var.getX() + cnVar.f44741z0.getLeft();
        float y10 = q1Var.getY() + cnVar.f44741z0.getY() + q1Var.getPaddingTop();
        if (q1Var.b()) {
            f11 = q1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(cnVar.f44741z0.getLeft(), f10, cnVar.f44741z0.getRight(), ((((cnVar.f44741z0.getY() + cnVar.f44741z0.getMeasuredHeight()) - cnVar.Wa) - cnVar.f44702w.e()) - cnVar.Yc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        boolean z9 = true;
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.x1(f11, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, f11);
        } else if (i7 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21455l & 1) != 0) {
                z9 = false;
            }
            q1Var.Q0(f11, canvas, z9);
        } else if (i7 == 3) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21455l & 1) != 0) {
                z9 = false;
            }
            q1Var.V0(canvas, f11);
            if (!z9) {
                q1Var.o1(canvas, f11, null);
            }
        } else if (i7 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().f21455l) != 0) && cnVar.f44427a9 != null)) {
            float f12 = (cnVar.V8 * cnVar.Y8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, cnVar.f44427a9, f12, cnVar.W8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            q1Var.t1(this, canvas, cnVar.f44442b9, cnVar.f44427a9, f12);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ql.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.L) {
            cn cnVar = this.f49081w0;
            if (view != cnVar.M2 && view != cnVar.E1 && view != cnVar.H9 && view != cnVar.Y && view != cnVar.Y3 && view != cnVar.m0 && !(view instanceof org.telegram.ui.ActionBar.j5)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.zf zfVar;
        int i10;
        cn cnVar = this.f49081w0;
        sj sjVar = cnVar.Z;
        if (sjVar != null && view == sjVar.m0) {
            lh.f fVar = cnVar.Y;
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
        sj sjVar2 = cnVar.Z;
        if (sjVar2 != null && view == sjVar2.m0) {
            hi.u uVar = (hi.u) view;
            uVar.setBackgroundDrawable(cnVar.K.c(uVar.f14969c, cnVar.D, false));
        }
        sj sjVar3 = cnVar.Z;
        if (sjVar3 != null && view == (zfVar = sjVar3.O1)) {
            zfVar.setBlurredBackgroundFactory(cnVar.K);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ql.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nk nkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (nkVar = this.f49081w0.f44429ab) != null && nkVar.f34586s) {
            nkVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ql.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        cn cnVar = this.f49081w0;
        org.telegram.ui.Components.s01 s01Var = cnVar.m0;
        if (view != s01Var && view != this.L && view != cnVar.Y && !(view instanceof org.telegram.ui.ActionBar.j5) && s01Var != null) {
            f10 = s01Var.getProgress() * cnVar.m0.getContentWidth();
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
        return this.f49081w0.f44741z0.getBottom();
    }

    public cn getChatActivity() {
        return this.f49081w0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.f49081w0.getThemedColor(org.telegram.ui.ActionBar.m6.f28210ua);
        ColorDrawable colorDrawable = this.f49080v0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.f49080v0 = new ColorDrawable(themedColor);
        }
        return this.f49080v0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.f49081w0.kb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.f49081w0.f44741z0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        cn cnVar = this.f49081w0;
        if (cnVar.R9()) {
            return getCompactBackground();
        }
        Drawable m10 = cnVar.f44750za.m();
        if (m10 != null) {
            return m10;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.f49081w0.f44750za.f43730g;
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
        return this.f49081w0.f44741z0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        View view;
        super.onAttachedToWindow();
        cn cnVar = this.f49081w0;
        if (!cnVar.kb) {
            r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                if (((ActionBarLayout) r4Var2).f27237b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.H;
                    r4Var3 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                    i1Var.f27529b = (FrameLayout) r4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f27529b = cnVar.l1;
        }
        this.H.c();
        cnVar.Z.setAdjustPanLayoutHelper(this.H);
        org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
        if (ijVar != null && ((ijVar.h4() || org.telegram.messenger.ij.L4(ijVar.f23266k)) && ijVar.T == 0 && org.telegram.messenger.ij.B0(ijVar.f23266k) == cnVar.f44545j6)) {
            MediaController.B().p0(cnVar.d8(false), cnVar.J8, cnVar.H8, true);
        }
        xo xoVar = cnVar.f44563ka;
        if (xoVar != null) {
            xoVar.F.P();
            org.telegram.ui.Components.h5 h5Var = xoVar.f51768k0;
            if (h5Var != null && (view = xoVar.f51754a0) != null) {
                h5Var.a(view);
            }
            org.telegram.messenger.qs.f(xoVar.f51761e0).c(xoVar, org.telegram.messenger.qs.f25067r);
        }
        cnVar.Sa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        cn cnVar = this.f49081w0;
        xo xoVar = cnVar.f44563ka;
        if (xoVar != null) {
            org.telegram.messenger.qs.f(xoVar.f51761e0).n(xoVar, org.telegram.messenger.qs.f25067r);
            xoVar.F.R();
            org.telegram.ui.Components.h5 h5Var = xoVar.f51768k0;
            if (h5Var != null && (view = xoVar.f51754a0) != null) {
                h5Var.n(view);
            }
            xoVar.Q = 0.0f;
            xoVar.P = 0L;
            cnVar.f44563ka = null;
        }
        cnVar.Sa.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.rc(15));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cn cnVar;
        fi.p5 p5Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (p5Var = (cnVar = this.f49081w0).M2) != null && p5Var.a() && cnVar.M2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ql.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ql.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        cn cnVar = this.f49081w0;
        ih.d.c(cnVar.N8, cnVar.fragmentView);
        cnVar.O8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f49081w0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        cn cnVar = this.f49081w0;
        cnVar.Q9 = i10;
        cnVar.L9();
        cnVar.N9();
    }

    @Override
    public final void L() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
