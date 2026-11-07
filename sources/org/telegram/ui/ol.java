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
public final class ol extends org.telegram.ui.Components.rt0 {
    public int f48425f0;
    public int f48426g0;
    public int f48427h0;
    public final ArrayList f48428i0;
    public final ArrayList f48429j0;
    public final ArrayList f48430k0;
    public final ArrayList f48431l0;
    public Paint m0;
    public int f48432n0;
    public final ml f48433o0;
    public final ml f48434p0;
    public final RectF f48435q0;
    public float f48436r0;
    public float f48437s0;
    public long f48438t0;
    public boolean f48439u0;
    public ColorDrawable f48440v0;
    public final an f48441w0;

    public ol(an anVar, Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.f48441w0 = anVar;
        this.f48425f0 = 0;
        this.f48428i0 = new ArrayList();
        this.f48429j0 = new ArrayList();
        this.f48430k0 = new ArrayList();
        this.f48431l0 = new ArrayList();
        this.f48433o0 = new eh.a(this) {
            public final ol f47827b;

            {
                this.f47827b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8700a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        an anVar2 = this.f47827b.f48441w0;
                        if (anVar2.f44037z0.Y0()) {
                            anVar2.f44037z0.d(canvas, rectF);
                            return;
                        }
                        anVar2.f44037z0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < anVar2.f44037z0.getChildCount(); i7++) {
                            View childAt = anVar2.f44037z0.getChildAt(i7);
                            if (!an.l2(anVar2, childAt, rectF)) {
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
                                    anVar2.f44037z0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.j2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    anVar2.f44037z0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                    canvas.restore();
                                } else {
                                    anVar2.f44037z0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        anVar2.f44037z0.A1(canvas, rectF);
                        return;
                    default:
                        ol olVar = this.f47827b;
                        an anVar3 = olVar.f48441w0;
                        RectF rectF2 = olVar.f48435q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.f43758cd.f55394e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6))));
                            }
                            ih.d.b(olVar.f48433o0, canvas, rectF, anVar3.f44037z0, olVar, i10);
                            bi.q1 q1Var2 = anVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, olVar, i11);
                            }
                            fi.g1 g1Var = anVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = anVar3.E1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = anVar3.E1.getChildAt(i12);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).f44857a.l1;
                                        ih.d.a(olVar2.f48434p0, canvas, rectF, olVar2, olVar);
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
        this.f48434p0 = new eh.a(this) {
            public final ol f47827b;

            {
                this.f47827b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8700a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        an anVar2 = this.f47827b.f48441w0;
                        if (anVar2.f44037z0.Y0()) {
                            anVar2.f44037z0.d(canvas, rectF);
                            return;
                        }
                        anVar2.f44037z0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < anVar2.f44037z0.getChildCount(); i7++) {
                            View childAt = anVar2.f44037z0.getChildAt(i7);
                            if (!an.l2(anVar2, childAt, rectF)) {
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
                                    anVar2.f44037z0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.j2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    anVar2.f44037z0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                    canvas.restore();
                                } else {
                                    anVar2.f44037z0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        anVar2.f44037z0.A1(canvas, rectF);
                        return;
                    default:
                        ol olVar = this.f47827b;
                        an anVar3 = olVar.f48441w0;
                        RectF rectF2 = olVar.f48435q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.f43758cd.f55394e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6))));
                            }
                            ih.d.b(olVar.f48433o0, canvas, rectF, anVar3.f44037z0, olVar, i10);
                            bi.q1 q1Var2 = anVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, olVar, i11);
                            }
                            fi.g1 g1Var = anVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = anVar3.E1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = anVar3.E1.getChildAt(i12);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).f44857a.l1;
                                        ih.d.a(olVar2.f48434p0, canvas, rectF, olVar2, olVar);
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
        this.f48435q0 = new RectF();
        this.H = new nl(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        an anVar = this.f48441w0;
        anVar.l1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        kVar.setTranslationY(0.0f);
        hk hkVar = anVar.f44023xb;
        if (hkVar != null) {
            ak akVar = anVar.C1;
            if (akVar != null) {
                i7 = akVar.getCurrentHeight();
            } else {
                i7 = 0;
            }
            hkVar.setTranslationY(i7);
        }
        fi.m3 m3Var = anVar.K1;
        if (m3Var != null) {
            m3Var.setTranslationY(0.0f);
        }
        fi.m3 m3Var2 = anVar.J1;
        if (m3Var2 != null) {
            m3Var2.setTranslationY(0.0f);
        }
        anVar.f43773e1.setTranslationY(0.0f);
        anVar.Q.setTranslationY(0.0f);
        anVar.P9 = 0.0f;
        anVar.Q9 = 0.0f;
        anVar.l1.setBackgroundTranslation(0);
        org.telegram.ui.Components.t40 t40Var = anVar.f43911p3;
        if (t40Var != null) {
            t40Var.g(0.0f);
        }
        fi.p5 p5Var = anVar.M2;
        if (p5Var != null) {
            org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) p5Var.f12597b;
            w9Var.f39948u = 0.0f;
            w9Var.d.invalidate();
        }
        anVar.setFragmentPanTranslationOffset(0);
        anVar.K9();
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
        di.u2 u2Var = this.f48441w0.X1;
        if (u2Var != null && u2Var.isShowing()) {
            this.f37748f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z9;
        boolean z10;
        an anVar = this.f48441w0;
        jh.l lVar = anVar.X;
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
        anVar.dc = z9;
        if (B2 <= 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        anVar.f43783ec = z10;
        anVar.M.f54485a = c10;
        ri.f fVar = anVar.I;
        if (fVar != null) {
            Iterator it = fVar.f54484w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).f11535f0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ri.f fVar2 = anVar.J;
        if (fVar2 != null) {
            Iterator it2 = fVar2.f54484w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).f11535f0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = anVar.Y;
        if (fVar3 != null) {
            if (anVar.Q9()) {
                i7 = anVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28188va);
            }
            fVar3.setOverlayColor(i7);
            anVar.Y.invalidate();
        }
        jh.f fVar4 = anVar.T;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        anVar.l1.invalidate();
        Iterator it3 = anVar.E.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        anVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i7) {
        float f11;
        int save = canvas.save();
        an anVar = this.f48441w0;
        float x10 = q1Var.getX() + anVar.f44037z0.getLeft();
        float y10 = q1Var.getY() + anVar.f44037z0.getY() + q1Var.getPaddingTop();
        if (q1Var.b()) {
            f11 = q1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(anVar.f44037z0.getLeft(), f10, anVar.f44037z0.getRight(), ((((anVar.f44037z0.getY() + anVar.f44037z0.getMeasuredHeight()) - anVar.Ua) - anVar.f43998w.e()) - anVar.Wc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        boolean z9 = true;
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.x1(f11, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, f11);
        } else if (i7 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21451l & 1) != 0) {
                z9 = false;
            }
            q1Var.Q0(f11, canvas, z9);
        } else if (i7 == 3) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21451l & 1) != 0) {
                z9 = false;
            }
            q1Var.V0(canvas, f11);
            if (!z9) {
                q1Var.o1(canvas, f11, null);
            }
        } else if (i7 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().f21451l) != 0) && anVar.f43725a9 != null)) {
            float f12 = (anVar.V8 * anVar.Y8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, anVar.f43725a9, f12, anVar.W8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            q1Var.t1(this, canvas, anVar.f43740b9, anVar.f43725a9, f12);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.L) {
            an anVar = this.f48441w0;
            if (view != anVar.M2 && view != anVar.E1 && view != anVar.F9 && view != anVar.Y && view != anVar.Y3 && view != anVar.m0 && !(view instanceof org.telegram.ui.ActionBar.i5)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ag agVar;
        int i10;
        an anVar = this.f48441w0;
        qj qjVar = anVar.Z;
        if (qjVar != null && view == qjVar.m0) {
            lh.f fVar = anVar.Y;
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
        qj qjVar2 = anVar.Z;
        if (qjVar2 != null && view == qjVar2.m0) {
            hi.u uVar = (hi.u) view;
            uVar.setBackgroundDrawable(anVar.K.c(uVar.f14964c, anVar.D, false));
        }
        qj qjVar3 = anVar.Z;
        if (qjVar3 != null && view == (agVar = qjVar3.O1)) {
            agVar.setBlurredBackgroundFactory(anVar.K);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        lk lkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (lkVar = this.f48441w0.Ya) != null && lkVar.f34575s) {
            lkVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        an anVar = this.f48441w0;
        org.telegram.ui.Components.s01 s01Var = anVar.m0;
        if (view != s01Var && view != this.L && view != anVar.Y && !(view instanceof org.telegram.ui.ActionBar.i5) && s01Var != null) {
            f10 = s01Var.getProgress() * anVar.m0.getContentWidth();
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
        return this.f48441w0.f44037z0.getBottom();
    }

    public an getChatActivity() {
        return this.f48441w0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.f48441w0.getThemedColor(org.telegram.ui.ActionBar.k6.f28169ua);
        ColorDrawable colorDrawable = this.f48440v0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.f48440v0 = new ColorDrawable(themedColor);
        }
        return this.f48440v0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.f48441w0.f43835ib) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.f48441w0.f44037z0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        an anVar = this.f48441w0;
        if (anVar.Q9()) {
            return getCompactBackground();
        }
        Drawable m10 = anVar.f44022xa.m();
        if (m10 != null) {
            return m10;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.f48441w0.f44022xa.f52271g;
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
        return this.f48441w0.f44037z0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        View view;
        super.onAttachedToWindow();
        an anVar = this.f48441w0;
        if (!anVar.f43835ib) {
            q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                if (((ActionBarLayout) q4Var2).f27230b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.H;
                    q4Var3 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                    i1Var.f27543b = (FrameLayout) q4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f27543b = anVar.l1;
        }
        this.H.c();
        anVar.Z.setAdjustPanLayoutHelper(this.H);
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null && ((ijVar.i4() || org.telegram.messenger.ij.M4(ijVar.f23244k)) && ijVar.T == 0 && org.telegram.messenger.ij.B0(ijVar.f23244k) == anVar.f43842j6)) {
            MediaController.B().p0(anVar.c8(false), anVar.J8, anVar.H8, true);
        }
        vo voVar = anVar.f43834ia;
        if (voVar != null) {
            voVar.F.P();
            org.telegram.ui.Components.i5 i5Var = voVar.f50781k0;
            if (i5Var != null && (view = voVar.f50767a0) != null) {
                i5Var.a(view);
            }
            org.telegram.messenger.qs.f(voVar.f50774e0).c(voVar, org.telegram.messenger.qs.f25054r);
        }
        anVar.Qa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        an anVar = this.f48441w0;
        vo voVar = anVar.f43834ia;
        if (voVar != null) {
            org.telegram.messenger.qs.f(voVar.f50774e0).n(voVar, org.telegram.messenger.qs.f25054r);
            voVar.F.R();
            org.telegram.ui.Components.i5 i5Var = voVar.f50781k0;
            if (i5Var != null && (view = voVar.f50767a0) != null) {
                i5Var.n(view);
            }
            voVar.Q = 0.0f;
            voVar.P = 0L;
            anVar.f43834ia = null;
        }
        anVar.Qa.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.pd(13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        an anVar;
        fi.p5 p5Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (p5Var = (anVar = this.f48441w0).M2) != null && p5Var.a() && anVar.M2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        an anVar = this.f48441w0;
        ih.d.c(anVar.N8, anVar.fragmentView);
        anVar.O8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f48441w0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        an anVar = this.f48441w0;
        anVar.O9 = i10;
        anVar.K9();
        anVar.M9();
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
