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
public final class qm extends org.telegram.ui.Components.cw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final xn J0;
    public int f36773w0;
    public int f36774x0;
    public int f36775y0;
    public final ArrayList f36776z0;

    public qm(xn xnVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = xnVar;
        this.f36773w0 = 0;
        this.f36776z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new pm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        xn xnVar = this.J0;
        xnVar.X0.setTranslationY(f7);
        lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
        lVar.setTranslationY(0.0f);
        bl blVar = xnVar.f39699ab;
        if (blVar != null) {
            xk xkVar = xnVar.f39863o1;
            if (xkVar != null) {
                i10 = xkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            blVar.setTranslationY(i10);
        }
        ci.e4 e4Var = xnVar.f39965w1;
        if (e4Var != null) {
            e4Var.setTranslationY(0.0f);
        }
        ci.e4 e4Var2 = xnVar.f39952v1;
        if (e4Var2 != null) {
            e4Var2.setTranslationY(0.0f);
        }
        xnVar.Q0.setTranslationY(0.0f);
        xnVar.P.setTranslationY(0.0f);
        xnVar.f39973w9 = 0.0f;
        xnVar.f39986x9 = 0.0f;
        xnVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.j60 j60Var = xnVar.f39705b3;
        if (j60Var != null) {
            j60Var.e(0.0f);
        }
        ci.r6 r6Var = xnVar.f39992y2;
        if (r6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f5454b;
            faVar.f24224u = 0.0f;
            faVar.d.invalidate();
        }
        xnVar.setFragmentPanTranslationOffset(0);
        xnVar.o9();
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
        if (drawable instanceof org.telegram.ui.Components.nc0) {
            ((org.telegram.ui.Components.nc0) drawable).p();
        }
        xn xnVar = this.J0;
        fh.a c10 = xnVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(xnVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(xnVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.Cb = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        xnVar.Db = z11;
        xnVar.L.f9068a = c10;
        jh.f fVar = xnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = xnVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        xnVar.n9();
        xnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        xn xnVar = this.J0;
        float x10 = u1Var.getX() + xnVar.f39977x0.getLeft();
        float y3 = u1Var.getY() + xnVar.f39977x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(xnVar.f39977x0.getLeft(), f7, xnVar.f39977x0.getRight(), ((((xnVar.f39977x0.getY() + xnVar.f39977x0.getMeasuredHeight()) - xnVar.Aa) - xnVar.v.d()) - xnVar.f39911rc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && xnVar.M8 != null)) {
            float f11 = (xnVar.H8 * xnVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, xnVar.M8, f11, xnVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, xnVar.N8, xnVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        xn xnVar = this.J0;
        ah.c cVar = xnVar.J;
        lk lkVar = xnVar.Y;
        if (lkVar != null && view == lkVar.m0) {
            jh.f fVar = xnVar.X;
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
        lk lkVar2 = xnVar.Y;
        if (lkVar2 != null && view == lkVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.f8725c, xnVar.f39976x, false));
        }
        lk lkVar3 = xnVar.Y;
        if (lkVar3 != null && view == (sgVar = lkVar3.O1)) {
            sgVar.setBlurredBackgroundFactory(cVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            xn xnVar = this.J0;
            if (view != xnVar.f39992y2 && view != xnVar.f39887q1 && view != xnVar.f39846m9 && view != xnVar.X && view != xnVar.K3) {
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
        fl flVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (flVar = this.J0.Ea) != null && flVar.f24546s) {
            flVar.a(true);
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
        return this.J0.f39977x0.getBottom();
    }

    public xn getChatActivity() {
        return this.J0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.J0.Oa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.J0.f39977x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f39750ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f39750ea.h;
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
        return this.J0.f39977x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        xn xnVar = this.J0;
        if (!xnVar.Oa) {
            d5Var = ((org.telegram.ui.ActionBar.o2) xnVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.o2) xnVar).parentLayout;
                if (((ActionBarLayout) d5Var2).f18599b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.o2) xnVar).parentLayout;
                    q1Var.f19720b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f19720b = xnVar.X0;
        }
        this.H.c();
        xnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == xnVar.T5)) {
            MediaController.getInstance().setTextureView(xnVar.N7(false), xnVar.f39959v8, xnVar.f39934t8, true);
        }
        vp vpVar = xnVar.P9;
        if (vpVar != null) {
            vpVar.f();
        }
        xnVar.f39987xa.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        xn xnVar = this.J0;
        vp vpVar = xnVar.P9;
        if (vpVar != null) {
            NotificationCenter.getInstance(vpVar.f38664e0).removeObserver(vpVar, NotificationCenter.updateInterfaces);
            vpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = vpVar.f38671k0;
            if (q5Var != null && (view = vpVar.f38658a0) != null) {
                q5Var.o(view);
            }
            vpVar.Q = 0.0f;
            vpVar.P = 0L;
            xnVar.P9 = null;
        }
        xnVar.f39987xa.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xn xnVar;
        ci.r6 r6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (r6Var = (xnVar = this.J0).f39992y2) != null && r6Var.a() && xnVar.f39992y2.getTag() != null) {
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
        xn xnVar = this.J0;
        gh.d.c(xnVar.f40010z8, xnVar.fragmentView);
        xnVar.A8.d();
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
        xn xnVar = this.J0;
        xnVar.v9 = i11;
        xnVar.o9();
        xnVar.r9();
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
