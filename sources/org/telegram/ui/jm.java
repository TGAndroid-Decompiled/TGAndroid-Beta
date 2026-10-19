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
public final class jm extends org.telegram.ui.Components.kw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final qn J0;
    public int f38272w0;
    public int f38273x0;
    public int f38274y0;
    public final ArrayList f38275z0;

    public jm(qn qnVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = qnVar;
        this.f38272w0 = 0;
        this.f38275z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new im(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        qn qnVar = this.J0;
        qnVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        kVar.setTranslationY(0.0f);
        vk vkVar = qnVar.f40630bb;
        if (vkVar != null) {
            qk qkVar = qnVar.f40782o1;
            if (qkVar != null) {
                i10 = qkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            vkVar.setTranslationY(i10);
        }
        ei.x3 x3Var = qnVar.f40883w1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        ei.x3 x3Var2 = qnVar.f40869v1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        qnVar.Q0.setTranslationY(0.0f);
        qnVar.P.setTranslationY(0.0f);
        qnVar.w9 = 0.0f;
        qnVar.f40904x9 = 0.0f;
        qnVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.r60 r60Var = qnVar.f40622b3;
        if (r60Var != null) {
            r60Var.e(0.0f);
        }
        ei.g6 g6Var = qnVar.f40911y2;
        if (g6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.f9069b;
            faVar.f26185u = 0.0f;
            faVar.d.invalidate();
        }
        qnVar.setFragmentPanTranslationOffset(0);
        qnVar.t9();
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
    public final int R() {
        ci.b3 b3Var = this.J0.J1;
        if (b3Var != null && b3Var.isShowing()) {
            this.f28001f = 0;
            return 0;
        }
        return super.R();
    }

    @Override
    public final void U(Drawable drawable) {
        boolean z10;
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            ((org.telegram.ui.Components.wc0) drawable).p();
        }
        qn qnVar = this.J0;
        gh.a c10 = qnVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(qnVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(qnVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        qnVar.Eb = z11;
        qnVar.L.f11063a = c10;
        kh.f fVar = qnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.f fVar2 = qnVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        qnVar.s9();
        qnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        qn qnVar = this.J0;
        float x10 = u1Var.getX() + qnVar.f40895x0.getLeft();
        float y3 = u1Var.getY() + qnVar.f40895x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(qnVar.f40895x0.getLeft(), f7, qnVar.f40895x0.getRight(), ((((qnVar.f40895x0.getY() + qnVar.f40895x0.getMeasuredHeight()) - qnVar.Ba) - qnVar.v.e()) - qnVar.f40855tc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        boolean z10 = true;
        u1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            u1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            u1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            if (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            u1Var.I1(f10, canvas, z10);
        } else if (i10 == 3) {
            if (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            u1Var.N1(canvas, f10);
            if (!z10) {
                u1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && qnVar.M8 != null)) {
            float f11 = (qnVar.H8 * qnVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, qnVar.M8, f11, qnVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, qnVar.N8, qnVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        qn qnVar = this.J0;
        bh.b bVar = qnVar.J;
        fk fkVar = qnVar.Y;
        if (fkVar != null && view == fkVar.m0) {
            kh.f fVar = qnVar.X;
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
        fk fkVar2 = qnVar.Y;
        if (fkVar2 != null && view == fkVar2.m0) {
            gi.x xVar = (gi.x) view;
            xVar.setBackgroundDrawable(bVar.c(xVar.f11534c, qnVar.f40894x, false));
        }
        fk fkVar3 = qnVar.Y;
        if (fkVar3 != null && view == (sgVar = fkVar3.O1)) {
            sgVar.setBlurredBackgroundFactory(bVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            qn qnVar = this.J0;
            if (view != qnVar.f40911y2 && view != qnVar.f40804q1 && view != qnVar.f40763m9 && view != qnVar.X && view != qnVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        al alVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (alVar = this.J0.Fa) != null && alVar.f28953s) {
            alVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f40895x0.getBottom();
    }

    public qn getChatActivity() {
        return this.J0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.J0.Pa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.J0.f40895x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable e = this.J0.f40667ea.e();
        if (e != null) {
            return e;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f40667ea.h;
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
        return this.J0.f40895x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        qn qnVar = this.J0;
        if (!qnVar.Pa) {
            d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                if (((ActionBarLayout) d5Var2).f20546b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                    o1Var.f21631b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21631b = qnVar.X0;
        }
        this.H.c();
        qnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == qnVar.T5)) {
            MediaController.getInstance().setTextureView(qnVar.Q7(false), qnVar.f40876v8, qnVar.f40851t8, true);
        }
        lp lpVar = qnVar.P9;
        if (lpVar != null) {
            lpVar.f();
        }
        qnVar.f40905xa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        qn qnVar = this.J0;
        lp lpVar = qnVar.P9;
        if (lpVar != null) {
            NotificationCenter.getInstance(lpVar.f38960e0).removeObserver(lpVar, NotificationCenter.updateInterfaces);
            lpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.r5 r5Var = lpVar.f38967k0;
            if (r5Var != null && (view = lpVar.f38954a0) != null) {
                r5Var.o(view);
            }
            lpVar.Q = 0.0f;
            lpVar.P = 0L;
            qnVar.P9 = null;
        }
        qnVar.f40905xa.j();
        AndroidUtilities.runOnUIThread(new ah.j(24));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qn qnVar;
        ei.g6 g6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (g6Var = (qnVar = this.J0).f40911y2) != null && g6Var.a() && qnVar.f40911y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        qn qnVar = this.J0;
        hh.d.c(qnVar.f40928z8, qnVar.fragmentView);
        qnVar.A8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.J0.F4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        qn qnVar = this.J0;
        qnVar.f40877v9 = i11;
        qnVar.t9();
        qnVar.w9();
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
