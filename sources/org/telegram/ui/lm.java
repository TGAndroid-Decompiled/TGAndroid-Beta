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
public final class lm extends org.telegram.ui.Components.jw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final sn J0;
    public int f38889w0;
    public int f38890x0;
    public int f38891y0;
    public final ArrayList f38892z0;

    public lm(sn snVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = snVar;
        this.f38889w0 = 0;
        this.f38892z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new km(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        sn snVar = this.J0;
        snVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        kVar.setTranslationY(0.0f);
        xk xkVar = snVar.f41189bb;
        if (xkVar != null) {
            sk skVar = snVar.f41341o1;
            if (skVar != null) {
                i10 = skVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            xkVar.setTranslationY(i10);
        }
        ei.x3 x3Var = snVar.f41442w1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        ei.x3 x3Var2 = snVar.f41428v1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        snVar.Q0.setTranslationY(0.0f);
        snVar.P.setTranslationY(0.0f);
        snVar.w9 = 0.0f;
        snVar.f41463x9 = 0.0f;
        snVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.r60 r60Var = snVar.f41181b3;
        if (r60Var != null) {
            r60Var.e(0.0f);
        }
        ei.g6 g6Var = snVar.f41470y2;
        if (g6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.f9072b;
            faVar.f26207u = 0.0f;
            faVar.d.invalidate();
        }
        snVar.setFragmentPanTranslationOffset(0);
        snVar.t9();
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
            this.f27626f = 0;
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
        sn snVar = this.J0;
        gh.a c10 = snVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(snVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(snVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        snVar.Eb = z11;
        snVar.L.f11066a = c10;
        kh.f fVar = snVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.f fVar2 = snVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        snVar.s9();
        snVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        sn snVar = this.J0;
        float x10 = u1Var.getX() + snVar.f41454x0.getLeft();
        float y3 = u1Var.getY() + snVar.f41454x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(snVar.f41454x0.getLeft(), f7, snVar.f41454x0.getRight(), ((((snVar.f41454x0.getY() + snVar.f41454x0.getMeasuredHeight()) - snVar.Ba) - snVar.v.e()) - snVar.f41401sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && snVar.M8 != null)) {
            float f11 = (snVar.H8 * snVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, snVar.M8, f11, snVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, snVar.N8, snVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        sn snVar = this.J0;
        bh.b bVar = snVar.J;
        hk hkVar = snVar.Y;
        if (hkVar != null && view == hkVar.m0) {
            kh.f fVar = snVar.X;
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
        hk hkVar2 = snVar.Y;
        if (hkVar2 != null && view == hkVar2.m0) {
            gi.x xVar = (gi.x) view;
            xVar.setBackgroundDrawable(bVar.c(xVar.f11537c, snVar.f41453x, false));
        }
        hk hkVar3 = snVar.Y;
        if (hkVar3 != null && view == (sgVar = hkVar3.O1)) {
            sgVar.setBlurredBackgroundFactory(bVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            sn snVar = this.J0;
            if (view != snVar.f41470y2 && view != snVar.f41363q1 && view != snVar.f41322m9 && view != snVar.X && view != snVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        cl clVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (clVar = this.J0.Fa) != null && clVar.f28934s) {
            clVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f41454x0.getBottom();
    }

    public sn getChatActivity() {
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
        return this.J0.f41454x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable e = this.J0.f41226ea.e();
        if (e != null) {
            return e;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f41226ea.h;
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
        return this.J0.f41454x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        sn snVar = this.J0;
        if (!snVar.Pa) {
            d5Var = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                if (((ActionBarLayout) d5Var2).f20552b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                    o1Var.f21637b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21637b = snVar.X0;
        }
        this.H.c();
        snVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == snVar.T5)) {
            MediaController.getInstance().setTextureView(snVar.Q7(false), snVar.f41435v8, snVar.f41410t8, true);
        }
        np npVar = snVar.P9;
        if (npVar != null) {
            npVar.f();
        }
        snVar.f41464xa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        sn snVar = this.J0;
        np npVar = snVar.P9;
        if (npVar != null) {
            NotificationCenter.getInstance(npVar.f39521e0).removeObserver(npVar, NotificationCenter.updateInterfaces);
            npVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.r5 r5Var = npVar.f39528k0;
            if (r5Var != null && (view = npVar.f39515a0) != null) {
                r5Var.o(view);
            }
            npVar.Q = 0.0f;
            npVar.P = 0L;
            snVar.P9 = null;
        }
        snVar.f41464xa.j();
        AndroidUtilities.runOnUIThread(new ah.j(24));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sn snVar;
        ei.g6 g6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (g6Var = (snVar = this.J0).f41470y2) != null && g6Var.a() && snVar.f41470y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        sn snVar = this.J0;
        hh.d.c(snVar.f41487z8, snVar.fragmentView);
        snVar.A8.d();
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
        sn snVar = this.J0;
        snVar.f41436v9 = i11;
        snVar.t9();
        snVar.w9();
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
