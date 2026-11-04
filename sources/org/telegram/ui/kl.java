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
public final class kl extends org.telegram.ui.Components.qt0 {
    public int f46963g0;
    public int f46964h0;
    public int f46965i0;
    public final ArrayList f46966j0;
    public final ArrayList f46967k0;
    public final ArrayList f46968l0;
    public final ArrayList m0;
    public Paint f46969n0;
    public int f46970o0;
    public final il f46971p0;
    public final il f46972q0;
    public final RectF f46973r0;
    public float f46974s0;
    public float f46975t0;
    public long f46976u0;
    public boolean f46977v0;
    public ColorDrawable f46978w0;
    public final wm f46979x0;

    public kl(wm wmVar, Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.f46979x0 = wmVar;
        this.f46963g0 = 0;
        this.f46966j0 = new ArrayList();
        this.f46967k0 = new ArrayList();
        this.f46968l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.f46971p0 = new fh.a(this) {
            public final kl f46285b;

            {
                this.f46285b = this;
            }

            @Override
            public final void b(eh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f9978a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wm wmVar2 = this.f46285b.f46979x0;
                        if (wmVar2.A0.Y0()) {
                            wmVar2.A0.d(canvas, rectF);
                            return;
                        }
                        wmVar2.A0.z1(canvas, rectF);
                        for (int i3 = 0; i3 < wmVar2.A0.getChildCount(); i3++) {
                            View childAt = wmVar2.A0.getChildAt(i3);
                            if (!wm.l2(wmVar2, childAt, rectF)) {
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
                                    wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.j2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).H(canvas);
                                    canvas.restore();
                                } else {
                                    wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        wmVar2.A0.A1(canvas, rectF);
                        return;
                    default:
                        kl klVar = this.f46285b;
                        wm wmVar3 = klVar.f46979x0;
                        RectF rectF2 = klVar.f46973r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, klVar.getWidth(), klVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = wmVar3.f51291dd.f53840e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, wmVar3.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6))));
                            }
                            jh.d.b(klVar.f46971p0, canvas, rectF, wmVar3.A0, klVar, i10);
                            ci.j1 j1Var = wmVar3.f51241a4;
                            if (j1Var != null) {
                                jh.d.b(j1Var, canvas, rectF, j1Var, klVar, i11);
                            }
                            gi.g1 g1Var = wmVar3.F1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = wmVar3.F1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = wmVar3.F1.getChildAt(i12);
                                    if ((childAt2 instanceof ym) && childAt2.getVisibility() == 0) {
                                        kl klVar2 = ((ym) childAt2).f52363a.m1;
                                        jh.d.a(klVar2.f46972q0, canvas, rectF, klVar2, klVar);
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
        this.f46972q0 = new fh.a(this) {
            public final kl f46285b;

            {
                this.f46285b = this;
            }

            @Override
            public final void b(eh.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f9978a = true;
                        return;
                }
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wm wmVar2 = this.f46285b.f46979x0;
                        if (wmVar2.A0.Y0()) {
                            wmVar2.A0.d(canvas, rectF);
                            return;
                        }
                        wmVar2.A0.z1(canvas, rectF);
                        for (int i3 = 0; i3 < wmVar2.A0.getChildCount(); i3++) {
                            View childAt = wmVar2.A0.getChildAt(i3);
                            if (!wm.l2(wmVar2, childAt, rectF)) {
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
                                    wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    if (q1Var.j2()) {
                                        canvas.save();
                                        canvas.translate(q1Var.getX(), q1Var.getY());
                                        q1Var.i1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.t0) childAt).H(canvas);
                                    canvas.restore();
                                } else {
                                    wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        wmVar2.A0.A1(canvas, rectF);
                        return;
                    default:
                        kl klVar = this.f46285b;
                        wm wmVar3 = klVar.f46979x0;
                        RectF rectF2 = klVar.f46973r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, klVar.getWidth(), klVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = wmVar3.f51291dd.f53840e;
                            int i10 = (int) ((1.0f - f10) * 255.0f);
                            int i11 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, wmVar3.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6))));
                            }
                            jh.d.b(klVar.f46971p0, canvas, rectF, wmVar3.A0, klVar, i10);
                            ci.j1 j1Var = wmVar3.f51241a4;
                            if (j1Var != null) {
                                jh.d.b(j1Var, canvas, rectF, j1Var, klVar, i11);
                            }
                            gi.g1 g1Var = wmVar3.F1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = wmVar3.F1.getChildCount();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = wmVar3.F1.getChildAt(i12);
                                    if ((childAt2 instanceof ym) && childAt2.getVisibility() == 0) {
                                        kl klVar2 = ((ym) childAt2).f52363a.m1;
                                        jh.d.a(klVar2.f46972q0, canvas, rectF, klVar2, klVar);
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
        this.f46973r0 = new RectF();
        this.I = new jl(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        wm wmVar = this.f46979x0;
        wmVar.m1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        kVar.setTranslationY(0.0f);
        dk dkVar = wmVar.f51558yb;
        if (dkVar != null) {
            wj wjVar = wmVar.D1;
            if (wjVar != null) {
                i3 = wjVar.getCurrentHeight();
            } else {
                i3 = 0;
            }
            dkVar.setTranslationY(i3);
        }
        gi.l3 l3Var = wmVar.L1;
        if (l3Var != null) {
            l3Var.setTranslationY(0.0f);
        }
        gi.l3 l3Var2 = wmVar.K1;
        if (l3Var2 != null) {
            l3Var2.setTranslationY(0.0f);
        }
        wmVar.f51308f1.setTranslationY(0.0f);
        wmVar.R.setTranslationY(0.0f);
        wmVar.Q9 = 0.0f;
        wmVar.R9 = 0.0f;
        wmVar.m1.setBackgroundTranslation(0);
        org.telegram.ui.Components.p40 p40Var = wmVar.f51448q3;
        if (p40Var != null) {
            p40Var.f(0.0f);
        }
        gi.n5 n5Var = wmVar.N2;
        if (n5Var != null) {
            org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) n5Var.f13303b;
            v9Var.f39051u = 0.0f;
            v9Var.d.invalidate();
        }
        wmVar.setFragmentPanTranslationOffset(0);
        wmVar.K9();
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
        ei.x2 x2Var = this.f46979x0.Y1;
        if (x2Var != null && x2Var.isShowing()) {
            this.f37535f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        boolean z11;
        wm wmVar = this.f46979x0;
        kh.l lVar = wmVar.Y;
        if (drawable instanceof org.telegram.ui.Components.la0) {
            ((org.telegram.ui.Components.la0) drawable).p();
        }
        si.a c2 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c2));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c2));
        int i3 = 0;
        if (B <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        wmVar.f51304ec = z10;
        if (B2 <= 0.9f) {
            z11 = true;
        } else {
            z11 = false;
        }
        wmVar.f51319fc = z11;
        wmVar.N.f54761a = c2;
        si.f fVar = wmVar.J;
        if (fVar != null) {
            Iterator it = fVar.f54760w.iterator();
            while (it.hasNext()) {
                gh.e eVar = ((gh.g) it.next()).f12330g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        si.f fVar2 = wmVar.K;
        if (fVar2 != null) {
            Iterator it2 = fVar2.f54760w.iterator();
            while (it2.hasNext()) {
                gh.e eVar2 = ((gh.g) it2.next()).f12330g0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        mh.f fVar3 = wmVar.Z;
        if (fVar3 != null) {
            if (wmVar.Q9()) {
                i3 = wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28218va);
            }
            fVar3.setOverlayColor(i3);
            wmVar.Z.invalidate();
        }
        kh.f fVar4 = wmVar.U;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        wmVar.m1.invalidate();
        Iterator it3 = wmVar.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        wmVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i3) {
        float f11;
        int save = canvas.save();
        wm wmVar = this.f46979x0;
        float x10 = q1Var.getX() + wmVar.A0.getLeft();
        float y9 = q1Var.getY() + wmVar.A0.getY() + q1Var.getPaddingTop();
        if (q1Var.a()) {
            f11 = q1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(wmVar.A0.getLeft(), f10, wmVar.A0.getRight(), ((((wmVar.A0.getY() + wmVar.A0.getMeasuredHeight()) - wmVar.Va) - wmVar.f51520w.e()) - wmVar.Xc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y9);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i3 == 0) {
            q1Var.x1(f11, canvas, true);
        } else if (i3 == 1) {
            q1Var.h1(canvas, f11);
        } else if (i3 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f25149l & 1) != 0) {
                z10 = false;
            }
            q1Var.Q0(f11, canvas, z10);
        } else if (i3 == 3) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f25149l & 1) != 0) {
                z10 = false;
            }
            q1Var.V0(canvas, f11);
            if (!z10) {
                q1Var.o1(canvas, f11, null);
            }
        } else if (i3 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().f25149l) != 0) && wmVar.f51260b9 != null)) {
            float f12 = (wmVar.W8 * wmVar.Z8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, wmVar.f51260b9, f12, wmVar.X8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y9);
            q1Var.t1(this, canvas, wmVar.f51274c9, wmVar.f51260b9, f12);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.M) {
            wm wmVar = this.f46979x0;
            if (view != wmVar.N2 && view != wmVar.F1 && view != wmVar.G9 && view != wmVar.Z && view != wmVar.Z3 && view != wmVar.f51407n0 && !(view instanceof org.telegram.ui.ActionBar.i5)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.yf yfVar;
        int i10;
        wm wmVar = this.f46979x0;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null && view == mjVar.f31162n0) {
            mh.f fVar = wmVar.Z;
            if (fVar != null) {
                i10 = indexOfChild(fVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                i3 = i10;
            }
            super.addView(view, i3, layoutParams);
        } else {
            super.addView(view, i3, layoutParams);
        }
        mj mjVar2 = wmVar.f51237a0;
        if (mjVar2 != null && view == mjVar2.f31162n0) {
            ii.w wVar = (ii.w) view;
            wVar.setBackgroundDrawable(wmVar.L.c(wVar.f15279c, wmVar.E, false));
        }
        mj mjVar3 = wmVar.f51237a0;
        if (mjVar3 != null && view == (yfVar = mjVar3.P1)) {
            yfVar.setBlurredBackgroundFactory(wmVar.L);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hk hkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (hkVar = this.f46979x0.Za) != null && hkVar.f33040s) {
            hkVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        wm wmVar = this.f46979x0;
        org.telegram.ui.Components.n01 n01Var = wmVar.f51407n0;
        if (view != n01Var && view != this.M && view != wmVar.Z && !(view instanceof org.telegram.ui.ActionBar.i5) && n01Var != null) {
            f10 = n01Var.getProgress() * wmVar.f51407n0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        if (f10 <= 0.0f) {
            return Z(canvas, view, j10);
        }
        canvas.save();
        canvas.translate(-f10, 0.0f);
        boolean Z = Z(canvas, view, j10);
        canvas.restore();
        return Z;
    }

    @Override
    public float getBottomOffset() {
        return this.f46979x0.A0.getBottom();
    }

    public wm getChatActivity() {
        return this.f46979x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.f46979x0.getThemedColor(org.telegram.ui.ActionBar.k6.f28200ua);
        ColorDrawable colorDrawable = this.f46978w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.f46978w0 = new ColorDrawable(themedColor);
        }
        return this.f46978w0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.f46979x0.jb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.f46979x0.A0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        wm wmVar = this.f46979x0;
        if (wmVar.Q9()) {
            return getCompactBackground();
        }
        Drawable m10 = wmVar.f51557ya.m();
        if (m10 != null) {
            return m10;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.f46979x0.f51557ya.f50125g;
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
        return this.f46979x0.A0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        View view;
        super.onAttachedToWindow();
        wm wmVar = this.f46979x0;
        if (!wmVar.jb) {
            q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                if (((ActionBarLayout) q4Var2).f27279b) {
                    org.telegram.ui.ActionBar.h1 h1Var = this.I;
                    q4Var3 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                    h1Var.f27553b = (FrameLayout) q4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.I.f27553b = wmVar.m1;
        }
        this.I.c();
        wmVar.f51237a0.setAdjustPanLayoutHelper(this.I);
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && ((ziVar.i4() || org.telegram.messenger.zi.M4(ziVar.f26868k)) && ziVar.T == 0 && org.telegram.messenger.zi.B0(ziVar.f26868k) == wmVar.f51376k6)) {
            MediaController.B().p0(wmVar.c8(false), wmVar.K8, wmVar.I8, true);
        }
        to toVar = wmVar.f51369ja;
        if (toVar != null) {
            toVar.G.P();
            org.telegram.ui.Components.g5 g5Var = toVar.f49852l0;
            if (g5Var != null && (view = toVar.f49839b0) != null) {
                g5Var.a(view);
            }
            org.telegram.messenger.hs.f(toVar.f49846f0).c(toVar, org.telegram.messenger.hs.f23292r);
        }
        wmVar.Ra.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.I.d();
        wm wmVar = this.f46979x0;
        to toVar = wmVar.f51369ja;
        if (toVar != null) {
            org.telegram.messenger.hs.f(toVar.f49846f0).n(toVar, org.telegram.messenger.hs.f23292r);
            toVar.G.R();
            org.telegram.ui.Components.g5 g5Var = toVar.f49852l0;
            if (g5Var != null && (view = toVar.f49839b0) != null) {
                g5Var.n(view);
            }
            toVar.R = 0.0f;
            toVar.Q = 0L;
            wmVar.f51369ja = null;
        }
        wmVar.Ra.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.hc(17));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wm wmVar;
        gi.n5 n5Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (n5Var = (wmVar = this.f46979x0).N2) != null && n5Var.a() && wmVar.N2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        wm wmVar = this.f46979x0;
        jh.d.c(wmVar.O8, wmVar.fragmentView);
        wmVar.P8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f46979x0.S4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        wm wmVar = this.f46979x0;
        wmVar.P9 = i10;
        wmVar.K9();
        wmVar.M9();
    }

    @Override
    public final void L() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
