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
public final class km extends org.telegram.ui.Components.hv0 {
    public int A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final tn F0;
    public int f39926s0;
    public int f39927t0;
    public int f39928u0;
    public final ArrayList f39929v0;
    public final ArrayList f39930w0;
    public final ArrayList f39931x0;
    public final ArrayList f39932y0;
    public Paint f39933z0;

    public km(tn tnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.F0 = tnVar;
        this.f39926s0 = 0;
        this.f39929v0 = new ArrayList();
        this.f39930w0 = new ArrayList();
        this.f39931x0 = new ArrayList();
        this.f39932y0 = new ArrayList();
        this.D = new jm(this, this);
    }

    public void setNonNoveTranslation(float f9) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        tn tnVar = this.F0;
        tnVar.T0.setTranslationY(f9);
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        lVar.setTranslationY(0.0f);
        uk ukVar = tnVar.Xa;
        if (ukVar != null) {
            pk pkVar = tnVar.f42865k1;
            if (pkVar != null) {
                i10 = pkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            ukVar.setTranslationY(i10);
        }
        nh.t3 t3Var = tnVar.f42961s1;
        if (t3Var != null) {
            t3Var.setTranslationY(0.0f);
        }
        nh.t3 t3Var2 = tnVar.f42949r1;
        if (t3Var2 != null) {
            t3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.m21 m21Var = tnVar.N1;
        if (m21Var != null) {
            m21Var.setTranslationY(0.0f);
        }
        tnVar.M0.setTranslationY(0.0f);
        tnVar.L.setTranslationY(0.0f);
        tnVar.f42969s9 = 0.0f;
        tnVar.f42982t9 = 0.0f;
        tnVar.T0.setBackgroundTranslation(0);
        xk xkVar = tnVar.X2;
        if (xkVar != null) {
            xkVar.f32513p0 = 0.0f;
            xkVar.s();
        }
        cg.i0 i0Var = tnVar.f42988u2;
        if (i0Var != null) {
            org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) i0Var.f3157b;
            caVar.f27421u = 0.0f;
            caVar.d.invalidate();
        }
        tnVar.setFragmentPanTranslationOffset(0);
        tnVar.o9();
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
        if (drawable instanceof org.telegram.ui.Components.yb0) {
            ((org.telegram.ui.Components.yb0) drawable).p();
        }
        tn tnVar = this.F0;
        qg.a c3 = tnVar.S.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(tnVar.S.b(c3));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(tnVar.S.a(c3));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        tnVar.f43061zb = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        tnVar.Ab = z11;
        tnVar.H.f46676a = c3;
        ug.f fVar = tnVar.T;
        if (fVar != null) {
            fVar.invalidate();
        }
        sg.f fVar2 = tnVar.O;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        tnVar.n9();
        tnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f9, org.telegram.ui.Cells.s1 s1Var, int i10) {
        float f10;
        int save = canvas.save();
        tn tnVar = this.F0;
        float x4 = s1Var.getX() + tnVar.f42973t0.getLeft();
        float y8 = s1Var.getY() + tnVar.f42973t0.getY() + s1Var.getPaddingTop();
        if (s1Var.a()) {
            f10 = s1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(tnVar.f42973t0.getLeft(), f9, tnVar.f42973t0.getRight(), ((((tnVar.f42973t0.getY() + tnVar.f42973t0.getMeasuredHeight()) - tnVar.f43023wa) - tnVar.v.d()) - tnVar.f42923oc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x4, y8);
        boolean z10 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            s1Var.I1(f10, canvas, (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (i10 == 3) {
            z10 = (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) ? false : false;
            s1Var.N1(canvas, f10);
            if (!z10) {
                s1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && tnVar.I8 != null)) {
            float f11 = (tnVar.D8 * tnVar.G8) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, tnVar.I8, f11, tnVar.E8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x4, y8);
            s1Var.i2(this, canvas, tnVar.J8, tnVar.I8, f11);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.lg lgVar;
        int i11;
        tn tnVar = this.F0;
        lg.a aVar = tnVar.F;
        dk dkVar = tnVar.U;
        if (dkVar != null && view == dkVar.f26137i0) {
            ug.f fVar = tnVar.T;
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
        dk dkVar2 = tnVar.U;
        if (dkVar2 != null && view == dkVar2.f26137i0) {
            ph.v vVar = (ph.v) view;
            vVar.setBackgroundDrawable(aVar.c(vVar.f46112c, tnVar.f43026x, false));
        }
        dk dkVar3 = tnVar.U;
        if (dkVar3 != null && view == (lgVar = dkVar3.J1)) {
            lgVar.setBlurredBackgroundFactory(aVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.H) {
            tn tnVar = this.F0;
            if (view != tnVar.f42988u2 && view != tnVar.f42887m1 && view != tnVar.f42847i9 && view != tnVar.T && view != tnVar.G3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zk zkVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (zkVar = this.F0.Aa) != null && zkVar.f32256s) {
            zkVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.F0.f42973t0.getBottom();
    }

    public tn getChatActivity() {
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
        return this.F0.f42973t0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.F0.f42746aa.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.F0.f42746aa.h;
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
        return this.F0.f42973t0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        tn tnVar = this.F0;
        if (!tnVar.Ka) {
            b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).f22659b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.D;
                    b5Var3 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                    q1Var.f23737b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.D.f23737b = tnVar.T0;
        }
        this.D.c();
        tnVar.U.setAdjustPanLayoutHelper(this.D);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == tnVar.P5)) {
            MediaController.getInstance().setTextureView(tnVar.N7(false), tnVar.f42955r8, tnVar.f42932p8, true);
        }
        np npVar = tnVar.L9;
        if (npVar != null) {
            npVar.f();
        }
        tnVar.f42983ta.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.D.d();
        tn tnVar = this.F0;
        np npVar = tnVar.L9;
        if (npVar != null) {
            NotificationCenter.getInstance(npVar.f40857a0).removeObserver(npVar, NotificationCenter.updateInterfaces);
            npVar.B.onDetachedFromWindow();
            org.telegram.ui.Components.p5 p5Var = npVar.f40867g0;
            if (p5Var != null && (view = npVar.W) != null) {
                p5Var.o(view);
            }
            npVar.M = 0.0f;
            npVar.L = 0L;
            tnVar.L9 = null;
        }
        tnVar.f42983ta.k();
        AndroidUtilities.runOnUIThread(new ag.o0(26));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tn tnVar;
        cg.i0 i0Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (i0Var = (tnVar = this.F0).f42988u2) != null && i0Var.a() && tnVar.f42988u2.getTag() != null) {
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
        tn tnVar = this.F0;
        rg.c.c(tnVar.f43007v8, tnVar.fragmentView);
        tnVar.f43021w8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.F0.B4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        tn tnVar = this.F0;
        tnVar.r9 = i11;
        tnVar.o9();
        tnVar.r9();
    }

    @Override
    public final void M() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
    }
}
