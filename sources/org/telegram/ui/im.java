package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class im extends org.telegram.ui.Components.xu0 {
    public int A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final qn F0;
    public int f39210s0;
    public int f39211t0;
    public int f39212u0;
    public final ArrayList f39213v0;
    public final ArrayList f39214w0;
    public final ArrayList f39215x0;
    public final ArrayList f39216y0;
    public Paint f39217z0;

    public im(qn qnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.F0 = qnVar;
        this.f39210s0 = 0;
        this.f39213v0 = new ArrayList();
        this.f39214w0 = new ArrayList();
        this.f39215x0 = new ArrayList();
        this.f39216y0 = new ArrayList();
        this.D = new hm(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        qn qnVar = this.F0;
        qnVar.T0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        kVar.setTranslationY(0.0f);
        rk rkVar = qnVar.Xa;
        if (rkVar != null) {
            mk mkVar = qnVar.f41967k1;
            if (mkVar != null) {
                i9 = mkVar.getCurrentHeight();
            } else {
                i9 = 0;
            }
            rkVar.setTranslationY(i9);
        }
        kh.x3 x3Var = qnVar.f42065s1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        kh.x3 x3Var2 = qnVar.f42051r1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.b21 b21Var = qnVar.N1;
        if (b21Var != null) {
            b21Var.setTranslationY(0.0f);
        }
        qnVar.M0.setTranslationY(0.0f);
        qnVar.L.setTranslationY(0.0f);
        qnVar.f42073s9 = 0.0f;
        qnVar.f42086t9 = 0.0f;
        qnVar.T0.setBackgroundTranslation(0);
        uk ukVar = qnVar.X2;
        if (ukVar != null) {
            ukVar.f28292p0 = 0.0f;
            ukVar.s();
        }
        kh.h6 h6Var = qnVar.f42092u2;
        if (h6Var != null) {
            org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) h6Var.f15397b;
            x9Var.f34620u = 0.0f;
            x9Var.d.invalidate();
        }
        qnVar.setFragmentPanTranslationOffset(0);
        qnVar.o9();
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
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        qn qnVar = this.F0;
        ng.a c10 = qnVar.S.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(qnVar.S.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(qnVar.S.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.f42164zb = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        qnVar.Ab = z11;
        qnVar.H.f18609a = c10;
        rg.f fVar = qnVar.T;
        if (fVar != null) {
            fVar.invalidate();
        }
        pg.f fVar2 = qnVar.O;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        qnVar.n9();
        qnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.t1 t1Var, int i9) {
        float f11;
        int save = canvas.save();
        qn qnVar = this.F0;
        float x10 = t1Var.getX() + qnVar.f42077t0.getLeft();
        float y10 = t1Var.getY() + qnVar.f42077t0.getY() + t1Var.getPaddingTop();
        if (t1Var.a()) {
            f11 = t1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(qnVar.f42077t0.getLeft(), f10, qnVar.f42077t0.getRight(), ((((qnVar.f42077t0.getY() + qnVar.f42077t0.getMeasuredHeight()) - qnVar.f42123wa) - qnVar.v.d()) - qnVar.f42024oc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y10);
        boolean z10 = true;
        t1Var.setInvalidatesParent(true);
        if (i9 == 0) {
            t1Var.m2(f11, canvas, true);
        } else if (i9 == 1) {
            t1Var.W1(canvas, f11);
        } else if (i9 == 2) {
            t1Var.I1(f11, canvas, (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (i9 == 3) {
            z10 = (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false;
            t1Var.N1(canvas, f11);
            if (!z10) {
                t1Var.d2(canvas, f11, null);
            }
        } else if (i9 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && qnVar.I8 != null)) {
            float f12 = (qnVar.D8 * qnVar.G8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, qnVar.I8, f12, qnVar.E8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            t1Var.i2(this, canvas, qnVar.J8, qnVar.I8, f12);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ig igVar;
        int i10;
        qn qnVar = this.F0;
        ig.a aVar = qnVar.F;
        ak akVar = qnVar.U;
        if (akVar != null && view == akVar.f26126i0) {
            rg.f fVar = qnVar.T;
            if (fVar != null) {
                i10 = indexOfChild(fVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                i9 = i10;
            }
            super.addView(view, i9, layoutParams);
        } else {
            super.addView(view, i9, layoutParams);
        }
        ak akVar2 = qnVar.U;
        if (akVar2 != null && view == akVar2.f26126i0) {
            mh.y yVar = (mh.y) view;
            yVar.setBackgroundDrawable(aVar.c(yVar.f18206c, qnVar.f42126x, false));
        }
        ak akVar3 = qnVar.U;
        if (akVar3 != null && view == (igVar = akVar3.J1)) {
            igVar.setBlurredBackgroundFactory(aVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.H) {
            qn qnVar = this.F0;
            if (view != qnVar.f42092u2 && view != qnVar.f41990m1 && view != qnVar.i9 && view != qnVar.T && view != qnVar.G3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        wk wkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (wkVar = this.F0.Aa) != null && wkVar.f27461s) {
            wkVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.F0.f42077t0.getBottom();
    }

    public qn getChatActivity() {
        return this.F0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.F0.Ka) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.F0.f42077t0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.F0.f41848aa.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.F0.f41848aa.h;
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
        return this.F0.f42077t0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        qn qnVar = this.F0;
        if (!qnVar.Ka) {
            b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).f22647b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.D;
                    b5Var3 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                    q1Var.f23715b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.D.f23715b = qnVar.T0;
        }
        this.D.c();
        qnVar.U.setAdjustPanLayoutHelper(this.D);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == qnVar.P5)) {
            MediaController.getInstance().setTextureView(qnVar.N7(false), qnVar.f42058r8, qnVar.f42032p8, true);
        }
        kp kpVar = qnVar.L9;
        if (kpVar != null) {
            kpVar.f();
        }
        qnVar.f42087ta.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.D.d();
        qn qnVar = this.F0;
        kp kpVar = qnVar.L9;
        if (kpVar != null) {
            NotificationCenter.getInstance(kpVar.f39886a0).removeObserver(kpVar, NotificationCenter.updateInterfaces);
            kpVar.B.onDetachedFromWindow();
            org.telegram.ui.Components.k5 k5Var = kpVar.f39896g0;
            if (k5Var != null && (view = kpVar.W) != null) {
                k5Var.o(view);
            }
            kpVar.M = 0.0f;
            kpVar.L = 0L;
            qnVar.L9 = null;
        }
        qnVar.f42087ta.k();
        AndroidUtilities.runOnUIThread(new bg.d2(24));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qn qnVar;
        kh.h6 h6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (h6Var = (qnVar = this.F0).f42092u2) != null && h6Var.a() && qnVar.f42092u2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        qn qnVar = this.F0;
        og.d.c(qnVar.f42110v8, qnVar.fragmentView);
        qnVar.w8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.F0.B4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i9, int i10, int i11, int i12) {
        qn qnVar = this.F0;
        qnVar.f42059r9 = i10;
        qnVar.o9();
        qnVar.r9();
    }

    @Override
    public final void M() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
