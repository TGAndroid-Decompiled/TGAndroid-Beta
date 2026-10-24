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
public final class km extends org.telegram.ui.Components.nw0 {
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
    public int f38939w0;
    public int f38940x0;
    public int f38941y0;
    public final ArrayList f38942z0;

    public km(sn snVar, Context context, org.telegram.ui.ActionBar.h5 h5Var) {
        super(context, h5Var);
        this.J0 = snVar;
        this.f38939w0 = 0;
        this.f38942z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new jm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        sn snVar = this.J0;
        snVar.f41558j1.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        kVar.setTranslationY(0.0f);
        wk wkVar = snVar.f41618nb;
        if (wkVar != null) {
            rk rkVar = snVar.A1;
            if (rkVar != null) {
                i10 = rkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            wkVar.setTranslationY(i10);
        }
        ei.x3 x3Var = snVar.I1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        ei.x3 x3Var2 = snVar.H1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        snVar.f41473c1.setTranslationY(0.0f);
        snVar.P.setTranslationY(0.0f);
        snVar.I9 = 0.0f;
        snVar.J9 = 0.0f;
        snVar.f41558j1.setBackgroundTranslation(0);
        org.telegram.ui.Components.q60 q60Var = snVar.f41610n3;
        if (q60Var != null) {
            q60Var.e(0.0f);
        }
        ei.g6 g6Var = snVar.K2;
        if (g6Var != null) {
            org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) g6Var.f9079b;
            daVar.f25648u = 0.0f;
            daVar.d.invalidate();
        }
        snVar.setFragmentPanTranslationOffset(0);
        snVar.t9();
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
        ci.a3 a3Var = this.J0.V1;
        if (a3Var != null && a3Var.isShowing()) {
            this.f29054f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        sn snVar = this.J0;
        ih.m mVar = snVar.W;
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            ((org.telegram.ui.Components.wc0) drawable).p();
        }
        gh.a c10 = mVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(mVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.Qb = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        snVar.Rb = z11;
        snVar.L.f11082a = c10;
        gh.d dVar = snVar.H;
        if (dVar != null) {
            dVar.f();
        }
        gh.d dVar2 = snVar.I;
        if (dVar2 != null) {
            dVar2.f();
        }
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

    public final void Z(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        float f10;
        int save = canvas.save();
        sn snVar = this.J0;
        float x10 = t1Var.getX() + snVar.f41734x0.getLeft();
        float y3 = t1Var.getY() + snVar.f41734x0.getY() + t1Var.getPaddingTop();
        if (t1Var.c()) {
            f10 = t1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(snVar.f41734x0.getLeft(), f7, snVar.f41734x0.getRight(), ((((snVar.f41734x0.getY() + snVar.f41734x0.getMeasuredHeight()) - snVar.Na) - snVar.v.e()) - snVar.Gc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        boolean z10 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.l2(f10, canvas, true);
        } else if (i10 == 1) {
            t1Var.V1(canvas, f10);
        } else if (i10 == 2) {
            if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            t1Var.H1(f10, canvas, z10);
        } else if (i10 == 3) {
            if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            t1Var.M1(canvas, f10);
            if (!z10) {
                t1Var.c2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && snVar.Y8 != null)) {
            float f11 = (snVar.T8 * snVar.W8) / 0.2f;
            canvas.save();
            t1Var.g2(canvas, snVar.Y8, f11, snVar.U8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.h2(this, canvas, snVar.Z8, snVar.Y8, f11);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean a0(View view) {
        if (view != this.L) {
            sn snVar = this.J0;
            if (view != snVar.K2 && view != snVar.C1 && view != snVar.f41756y9 && view != snVar.X && view != snVar.W3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.qg qgVar;
        int i11;
        sn snVar = this.J0;
        bh.b bVar = snVar.J;
        gk gkVar = snVar.Y;
        if (gkVar != null && view == gkVar.m0) {
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
        gk gkVar2 = snVar.Y;
        if (gkVar2 != null && view == gkVar2.m0) {
            gi.x xVar = (gi.x) view;
            xVar.setBackgroundDrawable(bVar.c(xVar.f11561c, snVar.f41733x, false));
        }
        gk gkVar3 = snVar.Y;
        if (gkVar3 != null && view == (qgVar = gkVar3.O1)) {
            qgVar.setBlurredBackgroundFactory(bVar);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        bl blVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (blVar = this.J0.Ra) != null && blVar.f29543s) {
            blVar.a(true);
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
        return this.J0.f41734x0.getBottom();
    }

    public sn getChatActivity() {
        return this.J0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.J0.f41469bb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.J0.f41734x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable l4 = this.J0.f41651qa.l();
        if (l4 != null) {
            return l4;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f41651qa.f40883g;
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
        return this.J0.f41734x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.h5 h5Var3;
        super.onAttachedToWindow();
        sn snVar = this.J0;
        if (!snVar.f41469bb) {
            h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
            if (h5Var != null) {
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                if (((ActionBarLayout) h5Var2).f20617b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    h5Var3 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                    o1Var.f21720b = (FrameLayout) h5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21720b = snVar.f41558j1;
        }
        this.H.c();
        snVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == snVar.f41516f6)) {
            MediaController.getInstance().setTextureView(snVar.Q7(false), snVar.H8, snVar.F8, true);
        }
        np npVar = snVar.f41468ba;
        if (npVar != null) {
            npVar.f();
        }
        snVar.Ja.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        sn snVar = this.J0;
        np npVar = snVar.f41468ba;
        if (npVar != null) {
            NotificationCenter.getInstance(npVar.f39934e0).removeObserver(npVar, NotificationCenter.updateInterfaces);
            npVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.p5 p5Var = npVar.f39941k0;
            if (p5Var != null && (view = npVar.f39928a0) != null) {
                p5Var.o(view);
            }
            npVar.Q = 0.0f;
            npVar.P = 0L;
            snVar.f41468ba = null;
        }
        snVar.Ja.j();
        AndroidUtilities.runOnUIThread(new ah.j(24));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sn snVar;
        ei.g6 g6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (g6Var = (snVar = this.J0).K2) != null && g6Var.a() && snVar.K2.getTag() != null) {
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
        sn snVar = this.J0;
        hh.d.c(snVar.L8, snVar.fragmentView);
        snVar.M8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.J0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        sn snVar = this.J0;
        snVar.H9 = i11;
        snVar.t9();
        snVar.w9();
    }

    @Override
    public final void L() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
