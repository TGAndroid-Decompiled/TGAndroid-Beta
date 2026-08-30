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
public final class pm extends org.telegram.ui.Components.qv0 {
    public Paint A0;
    public int B0;
    public float C0;
    public float D0;
    public long E0;
    public boolean F0;
    public final xn G0;
    public int f37368t0;
    public int f37369u0;
    public int f37370v0;
    public final ArrayList f37371w0;
    public final ArrayList f37372x0;
    public final ArrayList f37373y0;
    public final ArrayList f37374z0;

    public pm(xn xnVar, Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context, e5Var);
        this.G0 = xnVar;
        this.f37368t0 = 0;
        this.f37371w0 = new ArrayList();
        this.f37372x0 = new ArrayList();
        this.f37373y0 = new ArrayList();
        this.f37374z0 = new ArrayList();
        this.E = new om(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        xn xnVar = this.G0;
        xnVar.U0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        kVar.setTranslationY(0.0f);
        al alVar = xnVar.Ya;
        if (alVar != null) {
            vk vkVar = xnVar.l1;
            if (vkVar != null) {
                i10 = vkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            alVar.setTranslationY(i10);
        }
        ph.f3 f3Var = xnVar.f40183t1;
        if (f3Var != null) {
            f3Var.setTranslationY(0.0f);
        }
        ph.f3 f3Var2 = xnVar.f40173s1;
        if (f3Var2 != null) {
            f3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.w21 w21Var = xnVar.O1;
        if (w21Var != null) {
            w21Var.setTranslationY(0.0f);
        }
        xnVar.N0.setTranslationY(0.0f);
        xnVar.M.setTranslationY(0.0f);
        xnVar.t9 = 0.0f;
        xnVar.f40202u9 = 0.0f;
        xnVar.U0.setBackgroundTranslation(0);
        dl dlVar = xnVar.Y2;
        if (dlVar != null) {
            dlVar.f30566q0 = 0.0f;
            dlVar.s();
        }
        eg.i0 i0Var = xnVar.f40208v2;
        if (i0Var != null) {
            org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.f5301b;
            x9Var.f30632u = 0.0f;
            x9Var.d.invalidate();
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
        boolean z4;
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            ((org.telegram.ui.Components.dc0) drawable).p();
        }
        xn xnVar = this.G0;
        sg.a c3 = xnVar.T.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(xnVar.T.b(c3));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(xnVar.T.a(c3));
        boolean z10 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z4 = true;
        } else {
            z4 = false;
        }
        xnVar.Ab = z4;
        if (computePerceivedBrightness2 <= 0.9f) {
            z10 = true;
        }
        xnVar.Bb = z10;
        xnVar.I.f44317a = c3;
        wg.f fVar = xnVar.U;
        if (fVar != null) {
            fVar.invalidate();
        }
        ug.f fVar2 = xnVar.P;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        xnVar.n9();
        xnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.t1 t1Var, int i10) {
        float f11;
        int save = canvas.save();
        xn xnVar = this.G0;
        float x10 = t1Var.getX() + xnVar.f40193u0.getLeft();
        float y10 = t1Var.getY() + xnVar.f40193u0.getY() + t1Var.getPaddingTop();
        if (t1Var.a()) {
            f11 = t1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(xnVar.f40193u0.getLeft(), f10, xnVar.f40193u0.getRight(), ((((xnVar.f40193u0.getY() + xnVar.f40193u0.getMeasuredHeight()) - xnVar.f40244xa) - xnVar.v.d()) - xnVar.f40144pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y10);
        boolean z4 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(f11, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, f11);
        } else if (i10 == 2) {
            t1Var.I1(f11, canvas, (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (i10 == 3) {
            z4 = (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false;
            t1Var.N1(canvas, f11);
            if (!z4) {
                t1Var.d2(canvas, f11, null);
            }
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && xnVar.J8 != null)) {
            float f12 = (xnVar.E8 * xnVar.H8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, xnVar.J8, f12, xnVar.F8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            t1Var.i2(this, canvas, xnVar.K8, xnVar.J8, f12);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ig igVar;
        int i11;
        xn xnVar = this.G0;
        ng.a aVar = xnVar.G;
        jk jkVar = xnVar.V;
        if (jkVar != null && view == jkVar.f22786j0) {
            wg.f fVar = xnVar.U;
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
        jk jkVar2 = xnVar.V;
        if (jkVar2 != null && view == jkVar2.f22786j0) {
            rh.w wVar = (rh.w) view;
            wVar.setBackgroundDrawable(aVar.c(wVar.f43821c, xnVar.f40233x, false));
        }
        jk jkVar3 = xnVar.V;
        if (jkVar3 != null && view == (igVar = jkVar3.K1)) {
            igVar.setBlurredBackgroundFactory(aVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.I) {
            xn xnVar = this.G0;
            if (view != xnVar.f40208v2 && view != xnVar.f40109n1 && view != xnVar.f40068j9 && view != xnVar.U && view != xnVar.H3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        fl flVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (flVar = this.G0.Ba) != null && flVar.f30291s) {
            flVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.G0.f40193u0.getBottom();
    }

    public xn getChatActivity() {
        return this.G0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.G0.La) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.G0.f40193u0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.G0.f39968ba.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.G0.f39968ba.h;
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
        return this.G0.f40193u0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        super.onAttachedToWindow();
        xn xnVar = this.G0;
        if (!xnVar.La) {
            e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                if (((ActionBarLayout) e5Var2).f19450b) {
                    org.telegram.ui.ActionBar.r1 r1Var = this.E;
                    e5Var3 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                    r1Var.f20545b = (FrameLayout) e5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.E.f20545b = xnVar.U0;
        }
        this.E.c();
        xnVar.V.setAdjustPanLayoutHelper(this.E);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == xnVar.Q5)) {
            MediaController.getInstance().setTextureView(xnVar.N7(false), xnVar.f40179s8, xnVar.f40153q8, true);
        }
        tp tpVar = xnVar.M9;
        if (tpVar != null) {
            tpVar.f();
        }
        xnVar.f40203ua.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.E.d();
        xn xnVar = this.G0;
        tp tpVar = xnVar.M9;
        if (tpVar != null) {
            NotificationCenter.getInstance(tpVar.f38696b0).removeObserver(tpVar, NotificationCenter.updateInterfaces);
            tpVar.C.onDetachedFromWindow();
            org.telegram.ui.Components.l5 l5Var = tpVar.f38704h0;
            if (l5Var != null && (view = tpVar.X) != null) {
                l5Var.o(view);
            }
            tpVar.N = 0.0f;
            tpVar.M = 0L;
            xnVar.M9 = null;
        }
        xnVar.f40203ua.k();
        AndroidUtilities.runOnUIThread(new cg.n0(22));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xn xnVar;
        eg.i0 i0Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (i0Var = (xnVar = this.G0).f40208v2) != null && i0Var.a() && xnVar.f40208v2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        xn xnVar = this.G0;
        tg.c.c(xnVar.f40228w8, xnVar.fragmentView);
        xnVar.f40242x8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.G0.C4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        xn xnVar = this.G0;
        xnVar.s9 = i11;
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
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
    }
}
