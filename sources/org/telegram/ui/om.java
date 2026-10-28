package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class om extends org.telegram.ui.Components.ww0 {
    public boolean A0;
    public final wn B0;
    public int f42108l0;
    public int m0;
    public int f42109n0;
    public final ArrayList f42110o0;
    public final ArrayList f42111p0;
    public final ArrayList f42112q0;
    public final ArrayList f42113r0;
    public Paint f42114s0;
    public int f42115t0;
    public final mm f42116u0;
    public final mm f42117v0;
    public final RectF f42118w0;
    public float f42119x0;
    public float f42120y0;
    public long f42121z0;

    public om(wn wnVar, Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context, j5Var);
        this.B0 = wnVar;
        this.f42108l0 = 0;
        this.f42110o0 = new ArrayList();
        this.f42111p0 = new ArrayList();
        this.f42112q0 = new ArrayList();
        this.f42113r0 = new ArrayList();
        this.f42116u0 = new dh.a(this) {
            public final om f41463b;

            {
                this.f41463b = this;
            }

            @Override
            public final void b(ch.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f6296a = true;
                        return;
                }
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wn wnVar2 = this.f41463b.B0;
                        if (wnVar2.f45339x0.Z0()) {
                            wnVar2.f45339x0.f(canvas, rectF);
                            return;
                        }
                        wnVar2.f45339x0.C1(canvas, rectF);
                        for (int i10 = 0; i10 < wnVar2.f45339x0.getChildCount(); i10++) {
                            View childAt = wnVar2.f45339x0.getChildAt(i10);
                            if (!wn.h2(wnVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                    if (s1Var.C1()) {
                                        canvas.save();
                                        canvas.translate(0.0f, s1Var.V);
                                        s1Var.D1(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    wnVar2.f45339x0.drawChild(canvas, childAt, uptimeMillis);
                                    if (s1Var.U2()) {
                                        canvas.save();
                                        canvas.translate(s1Var.getX(), s1Var.getY());
                                        s1Var.X1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                    wnVar2.f45339x0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                                    canvas.restore();
                                } else {
                                    wnVar2.f45339x0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        wnVar2.f45339x0.D1(canvas, rectF);
                        return;
                    default:
                        om omVar = this.f41463b;
                        wn wnVar3 = omVar.B0;
                        RectF rectF2 = omVar.f42118w0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, omVar.getWidth(), omVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = wnVar3.Zc.e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.y6.m0(org.telegram.ui.ActionBar.y6.o1(f7 * 0.85f, wnVar3.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6))));
                            }
                            ih.d.b(omVar.f42116u0, canvas, rectF, wnVar3.f45339x0, omVar, i11);
                            bi.r1 r1Var = wnVar3.X3;
                            if (r1Var != null) {
                                ih.d.b(r1Var, canvas, rectF, r1Var, omVar, i12);
                            }
                            fi.h1 h1Var = wnVar3.C1;
                            if (h1Var != null && h1Var.getVisibility() == 0) {
                                int childCount = wnVar3.C1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = wnVar3.C1.getChildAt(i13);
                                    if ((childAt2 instanceof yn) && childAt2.getVisibility() == 0) {
                                        om omVar2 = ((yn) childAt2).f46049a.f45163j1;
                                        ih.d.a(omVar2.f42117v0, canvas, rectF, omVar2, omVar);
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
        this.f42117v0 = new dh.a(this) {
            public final om f41463b;

            {
                this.f41463b = this;
            }

            @Override
            public final void b(ch.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f6296a = true;
                        return;
                }
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wn wnVar2 = this.f41463b.B0;
                        if (wnVar2.f45339x0.Z0()) {
                            wnVar2.f45339x0.f(canvas, rectF);
                            return;
                        }
                        wnVar2.f45339x0.C1(canvas, rectF);
                        for (int i10 = 0; i10 < wnVar2.f45339x0.getChildCount(); i10++) {
                            View childAt = wnVar2.f45339x0.getChildAt(i10);
                            if (!wn.h2(wnVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                    if (s1Var.C1()) {
                                        canvas.save();
                                        canvas.translate(0.0f, s1Var.V);
                                        s1Var.D1(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    wnVar2.f45339x0.drawChild(canvas, childAt, uptimeMillis);
                                    if (s1Var.U2()) {
                                        canvas.save();
                                        canvas.translate(s1Var.getX(), s1Var.getY());
                                        s1Var.X1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                    wnVar2.f45339x0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                                    canvas.restore();
                                } else {
                                    wnVar2.f45339x0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        wnVar2.f45339x0.D1(canvas, rectF);
                        return;
                    default:
                        om omVar = this.f41463b;
                        wn wnVar3 = omVar.B0;
                        RectF rectF2 = omVar.f42118w0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, omVar.getWidth(), omVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = wnVar3.Zc.e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.y6.m0(org.telegram.ui.ActionBar.y6.o1(f7 * 0.85f, wnVar3.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6))));
                            }
                            ih.d.b(omVar.f42116u0, canvas, rectF, wnVar3.f45339x0, omVar, i11);
                            bi.r1 r1Var = wnVar3.X3;
                            if (r1Var != null) {
                                ih.d.b(r1Var, canvas, rectF, r1Var, omVar, i12);
                            }
                            fi.h1 h1Var = wnVar3.C1;
                            if (h1Var != null && h1Var.getVisibility() == 0) {
                                int childCount = wnVar3.C1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = wnVar3.C1.getChildAt(i13);
                                    if ((childAt2 instanceof yn) && childAt2.getVisibility() == 0) {
                                        om omVar2 = ((yn) childAt2).f46049a.f45163j1;
                                        ih.d.a(omVar2.f42117v0, canvas, rectF, omVar2, omVar);
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
        this.f42118w0 = new RectF();
        this.H = new nm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        wn wnVar = this.B0;
        wnVar.f45163j1.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        kVar.setTranslationY(0.0f);
        zk zkVar = wnVar.Ab;
        if (zkVar != null) {
            uk ukVar = wnVar.A1;
            if (ukVar != null) {
                i10 = ukVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            zkVar.setTranslationY(i10);
        }
        fi.v3 v3Var = wnVar.I1;
        if (v3Var != null) {
            v3Var.setTranslationY(0.0f);
        }
        fi.v3 v3Var2 = wnVar.H1;
        if (v3Var2 != null) {
            v3Var2.setTranslationY(0.0f);
        }
        wnVar.f45074c1.setTranslationY(0.0f);
        wnVar.P.setTranslationY(0.0f);
        wnVar.M9 = 0.0f;
        wnVar.N9 = 0.0f;
        wnVar.f45163j1.setBackgroundTranslation(0);
        org.telegram.ui.Components.u60 u60Var = wnVar.f45214n3;
        if (u60Var != null) {
            u60Var.f(0.0f);
        }
        fi.f6 f6Var = wnVar.K2;
        if (f6Var != null) {
            org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f6Var.f10863b;
            jaVar.f29595u = 0.0f;
            jaVar.d.invalidate();
        }
        wnVar.setFragmentPanTranslationOffset(0);
        wnVar.A9();
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
        di.a3 a3Var = this.B0.V1;
        if (a3Var != null && a3Var.isShowing()) {
            this.f34588f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        wn wnVar = this.B0;
        jh.m mVar = wnVar.W;
        if (drawable instanceof org.telegram.ui.Components.vc0) {
            ((org.telegram.ui.Components.vc0) drawable).p();
        }
        hh.a c10 = mVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(mVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.f45099dc = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        wnVar.f45112ec = z11;
        wnVar.L.f12844a = c10;
        hh.d dVar = wnVar.H;
        if (dVar != null) {
            Iterator it = dVar.v.iterator();
            while (it.hasNext()) {
                ((eh.e) it.next()).f9973g0 = true;
            }
        }
        hh.d dVar2 = wnVar.I;
        if (dVar2 != null) {
            Iterator it2 = dVar2.v.iterator();
            while (it2.hasNext()) {
                ((eh.e) it2.next()).f9973g0 = true;
            }
        }
        lh.f fVar = wnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        jh.f fVar2 = wnVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        wnVar.f45163j1.invalidate();
        Iterator it3 = wnVar.f45351y.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        wnVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f7, org.telegram.ui.Cells.s1 s1Var, int i10) {
        float f10;
        int save = canvas.save();
        wn wnVar = this.B0;
        float x9 = s1Var.getX() + wnVar.f45339x0.getLeft();
        float y3 = s1Var.getY() + wnVar.f45339x0.getY() + s1Var.getPaddingTop();
        if (s1Var.a()) {
            f10 = s1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(wnVar.f45339x0.getLeft(), f7, wnVar.f45339x0.getRight(), ((((wnVar.f45339x0.getY() + wnVar.f45339x0.getMeasuredHeight()) - wnVar.Ra) - wnVar.v.e()) - wnVar.Tc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x9, y3);
        boolean z10 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            s1Var.I1(f10, canvas, z10);
        } else if (i10 == 3) {
            if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            s1Var.N1(canvas, f10);
            if (!z10) {
                s1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && wnVar.f45082c9 != null)) {
            float f11 = (wnVar.X8 * wnVar.f45053a9) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, wnVar.f45082c9, f11, wnVar.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x9, y3);
            s1Var.i2(this, canvas, wnVar.f45096d9, wnVar.f45082c9, f11);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(View view) {
        if (view != this.L) {
            wn wnVar = this.B0;
            if (view != wnVar.K2 && view != wnVar.C1 && view != wnVar.C9 && view != wnVar.X && view != wnVar.W3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        wn wnVar = this.B0;
        jk jkVar = wnVar.Y;
        if (jkVar != null && view == jkVar.m0) {
            lh.f fVar = wnVar.X;
            if (fVar != null) {
                i11 = indexOfChild(fVar);
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
        jk jkVar2 = wnVar.Y;
        if (jkVar2 != null && view == jkVar2.m0) {
            hi.e0 e0Var = (hi.e0) view;
            e0Var.setBackgroundDrawable(wnVar.J.c(e0Var.f12948c, wnVar.f45338x, false));
        }
        jk jkVar3 = wnVar.Y;
        if (jkVar3 != null && view == (sgVar = jkVar3.O1)) {
            sgVar.setBlurredBackgroundFactory(wnVar.J);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        el elVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (elVar = this.B0.Va) != null && elVar.f31269s) {
            elVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.B0.f45339x0.getBottom();
    }

    public wn getChatActivity() {
        return this.B0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.B0.f45124fb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.B0.f45339x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable l4 = this.B0.f45309ua.l();
        if (l4 != null) {
            return l4;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.B0.f45309ua.f44060g;
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
        return this.B0.f45339x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        super.onAttachedToWindow();
        wn wnVar = this.B0;
        if (!wnVar.f45124fb) {
            j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                if (((ActionBarLayout) j5Var2).f22307b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.H;
                    j5Var3 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                    q1Var.f22966b = (FrameLayout) j5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f22966b = wnVar.f45163j1;
        }
        this.H.c();
        wnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == wnVar.f45168j6)) {
            MediaController.getInstance().setTextureView(wnVar.W7(false), wnVar.L8, wnVar.J8, true);
        }
        tp tpVar = wnVar.f45123fa;
        if (tpVar != null) {
            tpVar.f();
        }
        wnVar.Na.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        wn wnVar = this.B0;
        tp tpVar = wnVar.f45123fa;
        if (tpVar != null) {
            NotificationCenter.getInstance(tpVar.f43695e0).removeObserver(tpVar, NotificationCenter.updateInterfaces);
            tpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.t5 t5Var = tpVar.f43702k0;
            if (t5Var != null && (view = tpVar.f43689a0) != null) {
                t5Var.o(view);
            }
            tpVar.Q = 0.0f;
            tpVar.P = 0L;
            wnVar.f45123fa = null;
        }
        wnVar.Na.j();
        AndroidUtilities.runOnUIThread(new ag.c(26));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wn wnVar;
        fi.f6 f6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (f6Var = (wnVar = this.B0).K2) != null && f6Var.a() && wnVar.K2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        wn wnVar = this.B0;
        ih.d.c(wnVar.P8, wnVar.fragmentView);
        wnVar.Q8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.B0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        wn wnVar = this.B0;
        wnVar.L9 = i11;
        wnVar.A9();
        wnVar.C9();
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
