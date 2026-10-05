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
public final class qm extends org.telegram.ui.Components.mw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public final om F0;
    public final om G0;
    public final RectF H0;
    public float I0;
    public float J0;
    public long K0;
    public boolean L0;
    public final yn M0;
    public int f39817w0;
    public int f39818x0;
    public int f39819y0;
    public final ArrayList f39820z0;

    public qm(yn ynVar, Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context, c5Var);
        this.M0 = ynVar;
        this.f39817w0 = 0;
        this.f39820z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.F0 = new bh.a(this) {
            public final qm f39247b;

            {
                this.f39247b = this;
            }

            @Override
            public final void b(ah.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f450a = true;
                        return;
                }
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yn ynVar2 = this.f39247b.M0;
                        if (ynVar2.f43526v0.Z0()) {
                            ynVar2.f43526v0.f(canvas, rectF);
                            return;
                        }
                        ynVar2.f43526v0.x1(canvas, rectF);
                        for (int i10 = 0; i10 < ynVar2.f43526v0.getChildCount(); i10++) {
                            View childAt = ynVar2.f43526v0.getChildAt(i10);
                            if (!yn.d2(ynVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.u1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                                    if (u1Var.C1()) {
                                        canvas.save();
                                        canvas.translate(0.0f, u1Var.V);
                                        u1Var.D1(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    ynVar2.f43526v0.drawChild(canvas, childAt, uptimeMillis);
                                    if (u1Var.U2()) {
                                        canvas.save();
                                        canvas.translate(u1Var.getX(), u1Var.getY());
                                        u1Var.X1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                                    ynVar2.f43526v0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                                    canvas.restore();
                                } else {
                                    ynVar2.f43526v0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        ynVar2.f43526v0.y1(canvas, rectF);
                        return;
                    default:
                        qm qmVar = this.f39247b;
                        yn ynVar3 = qmVar.M0;
                        RectF rectF2 = qmVar.H0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qmVar.getWidth(), qmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = ynVar3.f43537vc.f15436e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.i6.l0(org.telegram.ui.ActionBar.i6.l1(f7 * 0.85f, ynVar3.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6))));
                            }
                            gh.d.b(qmVar.F0, canvas, rectF, ynVar3.f43526v0, qmVar, i11);
                            ai.w0 w0Var = ynVar3.J3;
                            if (w0Var != null) {
                                gh.d.b(w0Var, canvas, rectF, w0Var, qmVar, i12);
                            }
                            ci.i1 i1Var = ynVar3.f43438o1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = ynVar3.f43438o1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = ynVar3.f43438o1.getChildAt(i13);
                                    if ((childAt2 instanceof ao) && childAt2.getVisibility() == 0) {
                                        qm qmVar2 = ((ao) childAt2).f34922a.V0;
                                        gh.d.a(qmVar2.G0, canvas, rectF, qmVar2, qmVar);
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
        this.G0 = new bh.a(this) {
            public final qm f39247b;

            {
                this.f39247b = this;
            }

            @Override
            public final void b(ah.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f450a = true;
                        return;
                }
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yn ynVar2 = this.f39247b.M0;
                        if (ynVar2.f43526v0.Z0()) {
                            ynVar2.f43526v0.f(canvas, rectF);
                            return;
                        }
                        ynVar2.f43526v0.x1(canvas, rectF);
                        for (int i10 = 0; i10 < ynVar2.f43526v0.getChildCount(); i10++) {
                            View childAt = ynVar2.f43526v0.getChildAt(i10);
                            if (!yn.d2(ynVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.u1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                                    if (u1Var.C1()) {
                                        canvas.save();
                                        canvas.translate(0.0f, u1Var.V);
                                        u1Var.D1(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    ynVar2.f43526v0.drawChild(canvas, childAt, uptimeMillis);
                                    if (u1Var.U2()) {
                                        canvas.save();
                                        canvas.translate(u1Var.getX(), u1Var.getY());
                                        u1Var.X1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                                    ynVar2.f43526v0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                                    canvas.restore();
                                } else {
                                    ynVar2.f43526v0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        ynVar2.f43526v0.y1(canvas, rectF);
                        return;
                    default:
                        qm qmVar = this.f39247b;
                        yn ynVar3 = qmVar.M0;
                        RectF rectF2 = qmVar.H0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qmVar.getWidth(), qmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = ynVar3.f43537vc.f15436e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.i6.l0(org.telegram.ui.ActionBar.i6.l1(f7 * 0.85f, ynVar3.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6))));
                            }
                            gh.d.b(qmVar.F0, canvas, rectF, ynVar3.f43526v0, qmVar, i11);
                            ai.w0 w0Var = ynVar3.J3;
                            if (w0Var != null) {
                                gh.d.b(w0Var, canvas, rectF, w0Var, qmVar, i12);
                            }
                            ci.i1 i1Var = ynVar3.f43438o1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = ynVar3.f43438o1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = ynVar3.f43438o1.getChildAt(i13);
                                    if ((childAt2 instanceof ao) && childAt2.getVisibility() == 0) {
                                        qm qmVar2 = ((ao) childAt2).f34922a.V0;
                                        gh.d.a(qmVar2.G0, canvas, rectF, qmVar2, qmVar);
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
        this.H0 = new RectF();
        this.H = new pm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        yn ynVar = this.M0;
        ynVar.V0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        kVar.setTranslationY(0.0f);
        al alVar = ynVar.Ya;
        if (alVar != null) {
            vk vkVar = ynVar.f43413m1;
            if (vkVar != null) {
                i10 = vkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            alVar.setTranslationY(i10);
        }
        ci.e4 e4Var = ynVar.f43514u1;
        if (e4Var != null) {
            e4Var.setTranslationY(0.0f);
        }
        ci.e4 e4Var2 = ynVar.f43502t1;
        if (e4Var2 != null) {
            e4Var2.setTranslationY(0.0f);
        }
        ynVar.O0.setTranslationY(0.0f);
        ynVar.N.setTranslationY(0.0f);
        ynVar.f43522u9 = 0.0f;
        ynVar.v9 = 0.0f;
        ynVar.V0.setBackgroundTranslation(0);
        org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
        if (k60Var != null) {
            k60Var.e(0.0f);
        }
        ci.r6 r6Var = ynVar.f43541w2;
        if (r6Var != null) {
            org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) r6Var.f5868b;
            gaVar.f26813u = 0.0f;
            gaVar.d.invalidate();
        }
        ynVar.setFragmentPanTranslationOffset(0);
        ynVar.o9();
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void U(Drawable drawable) {
        boolean z10;
        yn ynVar = this.M0;
        hh.l lVar = ynVar.U;
        if (drawable instanceof org.telegram.ui.Components.pc0) {
            ((org.telegram.ui.Components.pc0) drawable).p();
        }
        fh.a c10 = lVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(lVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(lVar.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ynVar.Ab = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        ynVar.Bb = z11;
        ynVar.J.f9867a = c10;
        jh.f fVar = ynVar.V;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = ynVar.Q;
        if (gVar != null) {
            gVar.invalidate();
        }
        ynVar.V0.invalidate();
        Iterator it = ynVar.f43564y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        ynVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        yn ynVar = this.M0;
        float x10 = u1Var.getX() + ynVar.f43526v0.getLeft();
        float y3 = u1Var.getY() + ynVar.f43526v0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(ynVar.f43526v0.getLeft(), f7, ynVar.f43526v0.getRight(), ((((ynVar.f43526v0.getY() + ynVar.f43526v0.getMeasuredHeight()) - ynVar.f43574ya) - ynVar.v.d()) - ynVar.f43460pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        boolean z10 = true;
        u1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            u1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            u1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            u1Var.I1(f10, canvas, (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (i10 == 3) {
            z10 = (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) ? false : false;
            u1Var.N1(canvas, f10);
            if (!z10) {
                u1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && ynVar.K8 != null)) {
            float f11 = (ynVar.F8 * ynVar.I8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, ynVar.K8, f11, ynVar.G8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, ynVar.L8, ynVar.K8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.tg tgVar;
        int i11;
        yn ynVar = this.M0;
        jk jkVar = ynVar.W;
        if (jkVar != null && view == jkVar.m0) {
            jh.f fVar = ynVar.V;
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
        jk jkVar2 = ynVar.W;
        if (jkVar2 != null && view == jkVar2.m0) {
            ei.z zVar = (ei.z) view;
            zVar.setBackgroundDrawable(ynVar.H.c(zVar.f9497c, ynVar.f43551x, false));
        }
        jk jkVar3 = ynVar.W;
        if (jkVar3 != null && view == (tgVar = jkVar3.O1)) {
            tgVar.setBlurredBackgroundFactory(ynVar.H);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            yn ynVar = this.M0;
            if (view != ynVar.f43541w2 && view != ynVar.f43438o1 && view != ynVar.f43398k9 && view != ynVar.V && view != ynVar.I3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        el elVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (elVar = this.M0.Ca) != null && elVar.f27463s) {
            elVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.M0.f43526v0.getBottom();
    }

    public yn getChatActivity() {
        return this.M0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.M0.Ma) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.M0.f43526v0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.M0.f43300ca.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.M0.f43300ca.h;
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
        return this.M0.f43526v0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        super.onAttachedToWindow();
        yn ynVar = this.M0;
        if (!ynVar.Ma) {
            c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
            if (c5Var != null) {
                c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                if (((ActionBarLayout) c5Var2).f20319b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    c5Var3 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                    p1Var.f21454b = (FrameLayout) c5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21454b = ynVar.V0;
        }
        this.H.c();
        ynVar.W.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == ynVar.R5)) {
            MediaController.getInstance().setTextureView(ynVar.N7(false), ynVar.f43509t8, ynVar.f43482r8, true);
        }
        wp wpVar = ynVar.N9;
        if (wpVar != null) {
            wpVar.f();
        }
        ynVar.f43535va.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        yn ynVar = this.M0;
        wp wpVar = ynVar.N9;
        if (wpVar != null) {
            NotificationCenter.getInstance(wpVar.f42632e0).removeObserver(wpVar, NotificationCenter.updateInterfaces);
            wpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = wpVar.f42639k0;
            if (q5Var != null && (view = wpVar.f42625a0) != null) {
                q5Var.o(view);
            }
            wpVar.Q = 0.0f;
            wpVar.P = 0L;
            ynVar.N9 = null;
        }
        ynVar.f43535va.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        yn ynVar;
        ci.r6 r6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (r6Var = (ynVar = this.M0).f43541w2) != null && r6Var.a() && ynVar.f43541w2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yn ynVar = this.M0;
        gh.d.c(ynVar.f43560x8, ynVar.fragmentView);
        ynVar.f43572y8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.M0.D4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        yn ynVar = this.M0;
        ynVar.f43510t9 = i11;
        ynVar.o9();
        ynVar.q9();
    }

    @Override
    public final void M() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
