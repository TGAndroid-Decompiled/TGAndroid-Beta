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
public final class km extends org.telegram.ui.Components.uu0 {
    public int f38886f0;
    public int f38887g0;
    public int f38888h0;
    public final ArrayList f38889i0;
    public final ArrayList f38890j0;
    public final ArrayList f38891k0;
    public final ArrayList f38892l0;
    public Paint m0;
    public int f38893n0;
    public final im f38894o0;
    public final im f38895p0;
    public final RectF f38896q0;
    public float f38897r0;
    public float f38898s0;
    public long f38899t0;
    public boolean f38900u0;
    public ColorDrawable f38901v0;
    public final un f38902w0;

    public km(un unVar, Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context, z4Var);
        this.f38902w0 = unVar;
        this.f38886f0 = 0;
        this.f38889i0 = new ArrayList();
        this.f38890j0 = new ArrayList();
        this.f38891k0 = new ArrayList();
        this.f38892l0 = new ArrayList();
        this.f38894o0 = new ug.a(this) {
            public final km f38279b;

            {
                this.f38279b = this;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        un unVar2 = this.f38279b.f38902w0;
                        if (unVar2.f42492z0.Y0()) {
                            unVar2.f42492z0.d(canvas, rectF);
                            return;
                        }
                        unVar2.f42492z0.z1(canvas, rectF);
                        for (int i10 = 0; i10 < unVar2.f42492z0.getChildCount(); i10++) {
                            View childAt = unVar2.f42492z0.getChildAt(i10);
                            if (!un.k2(unVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                    if (q1Var.J0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, q1Var.V);
                                        q1Var.K0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    unVar2.f42492z0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.h2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.g1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                                    unVar2.f42492z0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.s0) childAt).I(canvas);
                                    canvas.restore();
                                } else {
                                    unVar2.f42492z0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        unVar2.f42492z0.A1(canvas, rectF);
                        return;
                    default:
                        km kmVar = this.f38279b;
                        un unVar3 = kmVar.f38902w0;
                        RectF rectF2 = kmVar.f38896q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, kmVar.getWidth(), kmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = unVar3.Uc.e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.t6.n0(org.telegram.ui.ActionBar.t6.r1(f7 * 0.85f, unVar3.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6))));
                            }
                            yg.d.b(kmVar.f38894o0, canvas, rectF, unVar3.f42492z0, kmVar, i11);
                            ag.b1 b1Var = unVar3.Z3;
                            if (b1Var != null) {
                                yg.d.b(b1Var, canvas, rectF, b1Var, kmVar, i12);
                            }
                            hk hkVar = unVar3.E1;
                            if (hkVar != null && hkVar.getVisibility() == 0) {
                                int childCount = unVar3.E1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = unVar3.E1.getChildAt(i13);
                                    if ((childAt2 instanceof wn) && childAt2.getVisibility() == 0) {
                                        km kmVar2 = ((wn) childAt2).f43336a.l1;
                                        yg.d.a(kmVar2.f38895p0, canvas, rectF, kmVar2, kmVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }

            @Override
            public final void g(g.y yVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        yVar.f7258b = true;
                        return;
                }
            }
        };
        this.f38895p0 = new ug.a(this) {
            public final km f38279b;

            {
                this.f38279b = this;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        un unVar2 = this.f38279b.f38902w0;
                        if (unVar2.f42492z0.Y0()) {
                            unVar2.f42492z0.d(canvas, rectF);
                            return;
                        }
                        unVar2.f42492z0.z1(canvas, rectF);
                        for (int i10 = 0; i10 < unVar2.f42492z0.getChildCount(); i10++) {
                            View childAt = unVar2.f42492z0.getChildAt(i10);
                            if (!un.k2(unVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                    if (q1Var.J0()) {
                                        canvas.save();
                                        canvas.translate(0.0f, q1Var.V);
                                        q1Var.K0(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    unVar2.f42492z0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.h2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.g1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                                    unVar2.f42492z0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.s0) childAt).I(canvas);
                                    canvas.restore();
                                } else {
                                    unVar2.f42492z0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        unVar2.f42492z0.A1(canvas, rectF);
                        return;
                    default:
                        km kmVar = this.f38279b;
                        un unVar3 = kmVar.f38902w0;
                        RectF rectF2 = kmVar.f38896q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, kmVar.getWidth(), kmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = unVar3.Uc.e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.t6.n0(org.telegram.ui.ActionBar.t6.r1(f7 * 0.85f, unVar3.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6))));
                            }
                            yg.d.b(kmVar.f38894o0, canvas, rectF, unVar3.f42492z0, kmVar, i11);
                            ag.b1 b1Var = unVar3.Z3;
                            if (b1Var != null) {
                                yg.d.b(b1Var, canvas, rectF, b1Var, kmVar, i12);
                            }
                            hk hkVar = unVar3.E1;
                            if (hkVar != null && hkVar.getVisibility() == 0) {
                                int childCount = unVar3.E1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = unVar3.E1.getChildAt(i13);
                                    if ((childAt2 instanceof wn) && childAt2.getVisibility() == 0) {
                                        km kmVar2 = ((wn) childAt2).f43336a.l1;
                                        yg.d.a(kmVar2.f38895p0, canvas, rectF, kmVar2, kmVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }

            @Override
            public final void g(g.y yVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        yVar.f7258b = true;
                        return;
                }
            }
        };
        this.f38896q0 = new RectF();
        this.H = new jm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        un unVar = this.f38902w0;
        unVar.l1.setTranslationY(f7);
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        lVar.setTranslationY(0.0f);
        dl dlVar = unVar.f42464wb;
        if (dlVar != null) {
            wk wkVar = unVar.C1;
            if (wkVar != null) {
                i10 = wkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            dlVar.setTranslationY(i10);
        }
        vh.p2 p2Var = unVar.K1;
        if (p2Var != null) {
            p2Var.setTranslationY(0.0f);
        }
        vh.p2 p2Var2 = unVar.J1;
        if (p2Var2 != null) {
            p2Var2.setTranslationY(0.0f);
        }
        unVar.f42233e1.setTranslationY(0.0f);
        unVar.Q.setTranslationY(0.0f);
        unVar.P9 = 0.0f;
        unVar.Q9 = 0.0f;
        unVar.l1.setBackgroundTranslation(0);
        org.telegram.ui.Components.j50 j50Var = unVar.f42370p3;
        if (j50Var != null) {
            j50Var.f(0.0f);
        }
        kg.f0 f0Var = unVar.M2;
        if (f0Var != null) {
            org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f0Var.f11063b;
            q9Var.f29617u = 0.0f;
            q9Var.d.invalidate();
        }
        unVar.setFragmentPanTranslationOffset(0);
        unVar.A9();
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
        ag.v vVar = this.f38902w0.X1;
        if (vVar != null && vVar.isShowing()) {
            this.f31056f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        boolean z11;
        un unVar = this.f38902w0;
        zg.i iVar = unVar.X;
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        hi.a c10 = iVar.c(drawable);
        float B = org.telegram.messenger.i0.B(iVar.b(c10));
        float B2 = org.telegram.messenger.i0.B(iVar.a(c10));
        int i10 = 0;
        if (B <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.Yb = z10;
        if (B2 <= 0.9f) {
            z11 = true;
        } else {
            z11 = false;
        }
        unVar.Zb = z11;
        unVar.M.f7724a = c10;
        hi.f fVar = unVar.I;
        if (fVar != null) {
            Iterator it = fVar.f7723w.iterator();
            while (it.hasNext()) {
                vg.d dVar = ((vg.f) it.next()).f50842b0;
                if (dVar != null) {
                    dVar.h = true;
                }
            }
        }
        hi.f fVar2 = unVar.J;
        if (fVar2 != null) {
            Iterator it2 = fVar2.f7723w.iterator();
            while (it2.hasNext()) {
                vg.d dVar2 = ((vg.f) it2.next()).f50842b0;
                if (dVar2 != null) {
                    dVar2.h = true;
                }
            }
        }
        bh.i iVar2 = unVar.Y;
        if (iVar2 != null) {
            if (unVar.G9()) {
                i10 = unVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21263va);
            }
            iVar2.setOverlayColor(i10);
            unVar.Y.invalidate();
        }
        zg.e eVar = unVar.T;
        if (eVar != null) {
            eVar.invalidate();
        }
        unVar.l1.invalidate();
        Iterator it3 = unVar.E.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        unVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        float f10;
        int save = canvas.save();
        un unVar = this.f38902w0;
        float x10 = q1Var.getX() + unVar.f42492z0.getLeft();
        float y3 = q1Var.getY() + unVar.f42492z0.getY() + q1Var.getPaddingTop();
        if (q1Var.a()) {
            f10 = q1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(unVar.f42492z0.getLeft(), f7, unVar.f42492z0.getRight(), ((((unVar.f42492z0.getY() + unVar.f42492z0.getMeasuredHeight()) - unVar.Ua) - unVar.f42453w.e()) - unVar.Oc) - org.telegram.messenger.i0.L(9.0f));
        canvas.translate(x10, y3);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            q1Var.v1(f10, canvas, true);
        } else if (i10 == 1) {
            q1Var.f1(canvas, f10);
        } else if (i10 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f14783l & 1) != 0) {
                z10 = false;
            }
            q1Var.O0(f10, canvas, z10);
        } else if (i10 == 3) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f14783l & 1) != 0) {
                z10 = false;
            }
            q1Var.T0(canvas, f10);
            if (!z10) {
                q1Var.m1(canvas, f10, null);
            }
        } else if (i10 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().f14783l) != 0) && unVar.f42187a9 != null)) {
            float f11 = (unVar.V8 * unVar.Y8) / 0.2f;
            canvas.save();
            q1Var.q1(canvas, unVar.f42187a9, f11, unVar.W8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            q1Var.r1(this, canvas, unVar.f42201b9, unVar.f42187a9, f11);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.L) {
            un unVar = this.f38902w0;
            if (view != unVar.M2 && view != unVar.E1 && view != unVar.F9 && view != unVar.Y && view != unVar.Y3 && !(view instanceof org.telegram.ui.ActionBar.s5)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.wf wfVar;
        int i11;
        un unVar = this.f38902w0;
        mk mkVar = unVar.Z;
        if (mkVar != null && view == mkVar.m0) {
            bh.i iVar = unVar.Y;
            if (iVar != null) {
                i11 = indexOfChild(iVar);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                i10 = i11;
            }
            super.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
        mk mkVar2 = unVar.Z;
        if (mkVar2 != null && view == mkVar2.m0) {
            xh.s sVar = (xh.s) view;
            sVar.setBackgroundDrawable(unVar.K.c(sVar.f54012c, unVar.D, false));
        }
        mk mkVar3 = unVar.Z;
        if (mkVar3 != null && view == (wfVar = mkVar3.O1)) {
            wfVar.setBlurredBackgroundFactory(unVar.K);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hl hlVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (hlVar = this.f38902w0.Ya) != null && hlVar.f24358s) {
            hlVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        un unVar = this.f38902w0;
        org.telegram.ui.Components.t11 t11Var = unVar.m0;
        if (view != t11Var && view != this.L && view != unVar.Y && !(view instanceof org.telegram.ui.ActionBar.s5) && t11Var != null) {
            f7 = t11Var.getProgress() * org.telegram.messenger.i0.L(288.0f);
        } else {
            f7 = 0.0f;
        }
        if (f7 <= 0.0f) {
            return Z(canvas, view, j10);
        }
        canvas.save();
        canvas.translate(-f7, 0.0f);
        boolean Z = Z(canvas, view, j10);
        canvas.restore();
        return Z;
    }

    @Override
    public float getBottomOffset() {
        return this.f38902w0.f42492z0.getBottom();
    }

    public un getChatActivity() {
        return this.f38902w0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.f38902w0.getThemedColor(org.telegram.ui.ActionBar.t6.ua);
        ColorDrawable colorDrawable = this.f38901v0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.f38901v0 = new ColorDrawable(themedColor);
        }
        return this.f38901v0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.f38902w0.f42289ib) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.f38902w0.f42492z0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        un unVar = this.f38902w0;
        if (unVar.G9()) {
            return getCompactBackground();
        }
        Drawable m10 = unVar.f42477xa.m();
        if (m10 != null) {
            return m10;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.f38902w0.f42477xa.f41591g;
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
        return this.f38902w0.f42492z0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        View view;
        super.onAttachedToWindow();
        un unVar = this.f38902w0;
        if (!unVar.f42289ib) {
            z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
            if (z4Var != null) {
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                if (((ActionBarLayout) z4Var2).f20072b) {
                    org.telegram.ui.ActionBar.m1 m1Var = this.H;
                    z4Var3 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                    m1Var.f20563b = (FrameLayout) z4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f20563b = unVar.l1;
        }
        this.H.c();
        unVar.Z.setAdjustPanLayoutHelper(this.H);
        org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null && ((jjVar.h4() || org.telegram.messenger.jj.L4(jjVar.f16337k)) && jjVar.T == 0 && org.telegram.messenger.jj.B0(jjVar.f16337k) == unVar.f42297j6)) {
            MediaController.B().p0(unVar.V7(false), unVar.J8, unVar.H8, true);
        }
        tp tpVar = unVar.ia;
        if (tpVar != null) {
            tpVar.F.P();
            org.telegram.ui.Components.f5 f5Var = tpVar.f41901k0;
            if (f5Var != null && (view = tpVar.f41888a0) != null) {
                f5Var.a(view);
            }
            org.telegram.messenger.zs.f(tpVar.f41894e0).c(tpVar, org.telegram.messenger.zs.f19676r);
        }
        unVar.Qa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        un unVar = this.f38902w0;
        tp tpVar = unVar.ia;
        if (tpVar != null) {
            org.telegram.messenger.zs.f(tpVar.f41894e0).n(tpVar, org.telegram.messenger.zs.f19676r);
            tpVar.F.R();
            org.telegram.ui.Components.f5 f5Var = tpVar.f41901k0;
            if (f5Var != null && (view = tpVar.f41888a0) != null) {
                f5Var.n(view);
            }
            tpVar.Q = 0.0f;
            tpVar.P = 0L;
            unVar.ia = null;
        }
        unVar.Qa.j();
        org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        un unVar;
        kg.f0 f0Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (f0Var = (unVar = this.f38902w0).M2) != null && f0Var.a() && unVar.M2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        un unVar = this.f38902w0;
        yg.d.c(unVar.N8, unVar.fragmentView);
        unVar.O8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f38902w0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        un unVar = this.f38902w0;
        unVar.O9 = i11;
        unVar.A9();
        unVar.C9();
    }

    @Override
    public final void L() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
