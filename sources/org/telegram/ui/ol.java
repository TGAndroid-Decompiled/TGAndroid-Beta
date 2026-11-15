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
public final class ol extends org.telegram.ui.Components.st0 {
    public int f49986g0;
    public int f49987h0;
    public int f49988i0;
    public final ArrayList f49989j0;
    public final ArrayList f49990k0;
    public final ArrayList f49991l0;
    public final ArrayList m0;
    public Paint f49992n0;
    public int f49993o0;
    public final ml f49994p0;
    public final ml f49995q0;
    public final RectF f49996r0;
    public float f49997s0;
    public float f49998t0;
    public long f49999u0;
    public boolean f50000v0;
    public ColorDrawable f50001w0;
    public final an f50002x0;

    public ol(an anVar, Context context, org.telegram.ui.ActionBar.o4 o4Var) {
        super(context, o4Var);
        this.f50002x0 = anVar;
        this.f49986g0 = 0;
        this.f49989j0 = new ArrayList();
        this.f49990k0 = new ArrayList();
        this.f49991l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.f49994p0 = new eh.a(this) {
            public final ol f49249b;

            {
                this.f49249b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8087a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        an anVar2 = this.f49249b.f50002x0;
                        if (anVar2.A0.Y0() && anVar2.A0.getOverScrollMode() != 2) {
                            anVar2.A0.d(canvas, rectF);
                            return;
                        }
                        anVar2.A0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < anVar2.A0.getChildCount(); i7++) {
                            View childAt = anVar2.A0.getChildAt(i7);
                            if (!an.m2(anVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                    if (q1Var.L0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, q1Var.W);
                                        q1Var.M0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.k2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).J(canvas);
                                    canvas.restore();
                                } else {
                                    anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        anVar2.A0.A1(canvas, rectF);
                        return;
                    default:
                        ol olVar = this.f49249b;
                        an anVar3 = olVar.f50002x0;
                        RectF rectF2 = olVar.f49996r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.f45199fd.f57081e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.j6.n0(org.telegram.ui.ActionBar.j6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6))));
                            }
                            ih.d.b(olVar.f49994p0, canvas, rectF, anVar3.A0, olVar, i10);
                            di.c1 c1Var = anVar3.f45122a4;
                            if (c1Var != null) {
                                ih.d.b(c1Var, canvas, rectF, c1Var, olVar, i11);
                            }
                            hi.i1 i1Var = anVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = anVar3.F1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = anVar3.F1.getChildAt(i12);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).f46216a.f45278m1;
                                        ih.d.a(olVar2.f49995q0, canvas, rectF, olVar2, olVar);
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
        this.f49995q0 = new eh.a(this) {
            public final ol f49249b;

            {
                this.f49249b = this;
            }

            @Override
            public final void c(dh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f8087a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        an anVar2 = this.f49249b.f50002x0;
                        if (anVar2.A0.Y0() && anVar2.A0.getOverScrollMode() != 2) {
                            anVar2.A0.d(canvas, rectF);
                            return;
                        }
                        anVar2.A0.z1(canvas, rectF);
                        for (int i7 = 0; i7 < anVar2.A0.getChildCount(); i7++) {
                            View childAt = anVar2.A0.getChildAt(i7);
                            if (!an.m2(anVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                    if (q1Var.L0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, q1Var.W);
                                        q1Var.M0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.k2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).J(canvas);
                                    canvas.restore();
                                } else {
                                    anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        anVar2.A0.A1(canvas, rectF);
                        return;
                    default:
                        ol olVar = this.f49249b;
                        an anVar3 = olVar.f50002x0;
                        RectF rectF2 = olVar.f49996r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.f45199fd.f57081e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.j6.n0(org.telegram.ui.ActionBar.j6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6))));
                            }
                            ih.d.b(olVar.f49994p0, canvas, rectF, anVar3.A0, olVar, i10);
                            di.c1 c1Var = anVar3.f45122a4;
                            if (c1Var != null) {
                                ih.d.b(c1Var, canvas, rectF, c1Var, olVar, i11);
                            }
                            hi.i1 i1Var = anVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = anVar3.F1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = anVar3.F1.getChildAt(i12);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).f46216a.f45278m1;
                                        ih.d.a(olVar2.f49995q0, canvas, rectF, olVar2, olVar);
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
        this.f49996r0 = new RectF();
        this.I = new nl(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        an anVar = this.f50002x0;
        anVar.f45278m1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        kVar.setTranslationY(0.0f);
        hk hkVar = anVar.Ab;
        if (hkVar != null) {
            ak akVar = anVar.D1;
            if (akVar != null) {
                i7 = akVar.getCurrentHeight();
            } else {
                i7 = 0;
            }
            hkVar.setTranslationY(i7);
        }
        hi.l3 l3Var = anVar.L1;
        if (l3Var != null) {
            l3Var.setTranslationY(0.0f);
        }
        hi.l3 l3Var2 = anVar.K1;
        if (l3Var2 != null) {
            l3Var2.setTranslationY(0.0f);
        }
        anVar.f45189f1.setTranslationY(0.0f);
        anVar.R.setTranslationY(0.0f);
        anVar.S9 = 0.0f;
        anVar.T9 = 0.0f;
        anVar.f45278m1.setBackgroundTranslation(0);
        org.telegram.ui.Components.w40 w40Var = anVar.f45329q3;
        if (w40Var != null) {
            w40Var.g(0.0f);
        }
        hi.n5 n5Var = anVar.N2;
        if (n5Var != null) {
            org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) n5Var.f14761b;
            s9Var.f39257u = 0.0f;
            s9Var.d.invalidate();
        }
        anVar.setFragmentPanTranslationOffset(0);
        anVar.M9();
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
        fi.p2 p2Var = this.f50002x0.Y1;
        if (p2Var != null && p2Var.isShowing()) {
            this.f39419f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        boolean z11;
        an anVar = this.f50002x0;
        jh.l lVar = anVar.Y;
        if (drawable instanceof org.telegram.ui.Components.ra0) {
            ((org.telegram.ui.Components.ra0) drawable).p();
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
        anVar.f45212gc = z10;
        if (B2 <= 0.9f) {
            z11 = true;
        } else {
            z11 = false;
        }
        anVar.f45225hc = z11;
        anVar.N.f58445a = c10;
        ui.f fVar = anVar.J;
        if (fVar != null) {
            Iterator it = fVar.f58444w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).f11350g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.f fVar2 = anVar.K;
        if (fVar2 != null) {
            Iterator it2 = fVar2.f58444w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).f11350g0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = anVar.Z;
        if (fVar3 != null) {
            if (anVar.S9()) {
                i7 = anVar.getThemedColor(org.telegram.ui.ActionBar.j6.f29188va);
            }
            fVar3.setOverlayColor(i7);
            anVar.Z.invalidate();
        }
        jh.f fVar4 = anVar.U;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        anVar.f45278m1.invalidate();
        Iterator it3 = anVar.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        anVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i7) {
        float f11;
        int save = canvas.save();
        an anVar = this.f50002x0;
        float x10 = q1Var.getX() + anVar.A0.getLeft();
        float y10 = q1Var.getY() + anVar.A0.getY() + q1Var.getPaddingTop();
        if (q1Var.a()) {
            f11 = q1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(anVar.A0.getLeft(), f10, anVar.A0.getRight(), ((((anVar.A0.getY() + anVar.A0.getMeasuredHeight()) - anVar.Xa) - anVar.f45403w.e()) - anVar.Zc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.y1(f11, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, f11);
        } else if (i7 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f27753l & 1) != 0) {
                z10 = false;
            }
            q1Var.Q0(f11, canvas, z10);
        } else if (i7 == 3) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f27753l & 1) != 0) {
                z10 = false;
            }
            q1Var.V0(canvas, f11);
            if (!z10) {
                q1Var.o1(canvas, f11, null);
            }
        } else if (i7 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().f27753l) != 0) && anVar.f45142b9 != null)) {
            float f12 = (anVar.W8 * anVar.Z8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, anVar.f45142b9, f12, anVar.X8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            q1Var.t1(this, canvas, anVar.f45156c9, anVar.f45142b9, f12);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.M) {
            an anVar = this.f50002x0;
            if (view != anVar.N2 && view != anVar.F1 && view != anVar.I9 && view != anVar.Z && view != anVar.Z3 && view != anVar.f45289n0 && !(view instanceof org.telegram.ui.ActionBar.g5)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.gg ggVar;
        int i10;
        an anVar = this.f50002x0;
        qj qjVar = anVar.f45118a0;
        if (qjVar != null && view == qjVar.f32246n0) {
            lh.f fVar = anVar.Z;
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
        qj qjVar2 = anVar.f45118a0;
        if (qjVar2 != null && view == qjVar2.f32246n0) {
            ki.w wVar = (ki.w) view;
            wVar.setBackgroundDrawable(anVar.L.c(wVar.f18609c, anVar.E, false));
        }
        qj qjVar3 = anVar.f45118a0;
        if (qjVar3 != null && view == (ggVar = qjVar3.f32310w2)) {
            ggVar.setBlurredBackgroundFactory(anVar.L);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        lk lkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (lkVar = this.f50002x0.f45144bb) != null && lkVar.f35955s) {
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
        an anVar = this.f50002x0;
        org.telegram.ui.Components.v01 v01Var = anVar.f45289n0;
        if (view != v01Var && view != this.M && view != anVar.Z && !(view instanceof org.telegram.ui.ActionBar.g5) && v01Var != null) {
            f10 = v01Var.getProgress() * anVar.f45289n0.getContentWidth();
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
        return this.f50002x0.A0.getBottom();
    }

    public an getChatActivity() {
        return this.f50002x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.f50002x0.getThemedColor(org.telegram.ui.ActionBar.j6.f29169ua);
        ColorDrawable colorDrawable = this.f50001w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.f50001w0 = new ColorDrawable(themedColor);
        }
        return this.f50001w0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.f50002x0.f45276lb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.f50002x0.A0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        an anVar = this.f50002x0;
        if (anVar.S9()) {
            return getCompactBackground();
        }
        Drawable m10 = anVar.Aa.m();
        if (m10 != null) {
            return m10;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.f50002x0.Aa.f53546g;
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
        return this.f50002x0.A0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 o4Var3;
        View view;
        super.onAttachedToWindow();
        an anVar = this.f50002x0;
        if (!anVar.f45276lb) {
            o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
            if (o4Var != null) {
                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                if (((ActionBarLayout) o4Var2).f28328b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.I;
                    o4Var3 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                    i1Var.f28646b = (FrameLayout) o4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.I.f28646b = anVar.f45278m1;
        }
        this.I.c();
        anVar.f45118a0.setAdjustPanLayoutHelper(this.I);
        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null && ((gjVar.h4() || org.telegram.messenger.gj.L4(gjVar.f23817k)) && gjVar.T == 0 && org.telegram.messenger.gj.B0(gjVar.f23817k) == anVar.f45259k6)) {
            MediaController.B().p0(anVar.e8(false), anVar.K8, anVar.I8, true);
        }
        wo woVar = anVar.f45275la;
        if (woVar != null) {
            woVar.G.P();
            org.telegram.ui.Components.g5 g5Var = woVar.f52957l0;
            if (g5Var != null && (view = woVar.f52944b0) != null) {
                g5Var.a(view);
            }
            org.telegram.messenger.ns.f(woVar.f52951f0).c(woVar, org.telegram.messenger.ns.f25559r);
        }
        anVar.Ta.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.I.d();
        an anVar = this.f50002x0;
        wo woVar = anVar.f45275la;
        if (woVar != null) {
            org.telegram.messenger.ns.f(woVar.f52951f0).n(woVar, org.telegram.messenger.ns.f25559r);
            woVar.G.R();
            org.telegram.ui.Components.g5 g5Var = woVar.f52957l0;
            if (g5Var != null && (view = woVar.f52944b0) != null) {
                g5Var.n(view);
            }
            woVar.R = 0.0f;
            woVar.Q = 0L;
            anVar.f45275la = null;
        }
        anVar.Ta.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.c6(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        an anVar;
        hi.n5 n5Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (n5Var = (anVar = this.f50002x0).N2) != null && n5Var.a() && anVar.N2.getTag() != null) {
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
        an anVar = this.f50002x0;
        ih.d.c(anVar.O8, anVar.fragmentView);
        anVar.P8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f50002x0.S4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        an anVar = this.f50002x0;
        anVar.R9 = i10;
        anVar.M9();
        anVar.O9();
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
