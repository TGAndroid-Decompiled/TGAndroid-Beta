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
public final class pm extends org.telegram.ui.Components.bw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final wn J0;
    public int f36574w0;
    public int f36575x0;
    public int f36576y0;
    public final ArrayList f36577z0;

    public pm(wn wnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.J0 = wnVar;
        this.f36574w0 = 0;
        this.f36577z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new om(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        wn wnVar = this.J0;
        wnVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        kVar.setTranslationY(0.0f);
        al alVar = wnVar.f39417ab;
        if (alVar != null) {
            vk vkVar = wnVar.f39580o1;
            if (vkVar != null) {
                i10 = vkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            alVar.setTranslationY(i10);
        }
        ci.e4 e4Var = wnVar.f39682w1;
        if (e4Var != null) {
            e4Var.setTranslationY(0.0f);
        }
        ci.e4 e4Var2 = wnVar.f39669v1;
        if (e4Var2 != null) {
            e4Var2.setTranslationY(0.0f);
        }
        wnVar.Q0.setTranslationY(0.0f);
        wnVar.P.setTranslationY(0.0f);
        wnVar.f39690w9 = 0.0f;
        wnVar.f39703x9 = 0.0f;
        wnVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.i60 i60Var = wnVar.f39423b3;
        if (i60Var != null) {
            i60Var.e(0.0f);
        }
        ci.r6 r6Var = wnVar.f39709y2;
        if (r6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f5457b;
            faVar.f24197u = 0.0f;
            faVar.d.invalidate();
        }
        wnVar.setFragmentPanTranslationOffset(0);
        wnVar.o9();
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
        wn wnVar = this.J0;
        fh.a c10 = wnVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(wnVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(wnVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.Cb = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        wnVar.Db = z11;
        wnVar.L.f9063a = c10;
        jh.f fVar = wnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = wnVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        wnVar.n9();
        wnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        wn wnVar = this.J0;
        float x10 = u1Var.getX() + wnVar.f39694x0.getLeft();
        float y3 = u1Var.getY() + wnVar.f39694x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(wnVar.f39694x0.getLeft(), f7, wnVar.f39694x0.getRight(), ((((wnVar.f39694x0.getY() + wnVar.f39694x0.getMeasuredHeight()) - wnVar.Aa) - wnVar.v.d()) - wnVar.f39628rc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && wnVar.M8 != null)) {
            float f11 = (wnVar.H8 * wnVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, wnVar.M8, f11, wnVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, wnVar.N8, wnVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        wn wnVar = this.J0;
        ah.c cVar = wnVar.J;
        jk jkVar = wnVar.Y;
        if (jkVar != null && view == jkVar.m0) {
            jh.f fVar = wnVar.X;
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
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.f8722c, wnVar.f39693x, false));
        }
        jk jkVar3 = wnVar.Y;
        if (jkVar3 != null && view == (sgVar = jkVar3.O1)) {
            sgVar.setBlurredBackgroundFactory(cVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            wn wnVar = this.J0;
            if (view != wnVar.f39709y2 && view != wnVar.f39604q1 && view != wnVar.f39563m9 && view != wnVar.X && view != wnVar.K3) {
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
        el elVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (elVar = this.J0.Ea) != null && elVar.f24468s) {
            elVar.a(true);
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
        return this.J0.f39694x0.getBottom();
    }

    public wn getChatActivity() {
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
        return this.J0.f39694x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f39468ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f39468ea.h;
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
        return this.J0.f39694x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        wn wnVar = this.J0;
        if (!wnVar.Oa) {
            b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).f18605b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    b5Var3 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                    o1Var.f19670b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f19670b = wnVar.X0;
        }
        this.H.c();
        wnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == wnVar.T5)) {
            MediaController.getInstance().setTextureView(wnVar.N7(false), wnVar.f39676v8, wnVar.f39651t8, true);
        }
        up upVar = wnVar.P9;
        if (upVar != null) {
            upVar.f();
        }
        wnVar.f39704xa.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        wn wnVar = this.J0;
        up upVar = wnVar.P9;
        if (upVar != null) {
            NotificationCenter.getInstance(upVar.f38526e0).removeObserver(upVar, NotificationCenter.updateInterfaces);
            upVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = upVar.f38533k0;
            if (q5Var != null && (view = upVar.f38520a0) != null) {
                q5Var.o(view);
            }
            upVar.Q = 0.0f;
            upVar.P = 0L;
            wnVar.P9 = null;
        }
        wnVar.f39704xa.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wn wnVar;
        ci.r6 r6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (r6Var = (wnVar = this.J0).f39709y2) != null && r6Var.a() && wnVar.f39709y2.getTag() != null) {
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
        wn wnVar = this.J0;
        gh.d.c(wnVar.f39727z8, wnVar.fragmentView);
        wnVar.A8.d();
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
        wn wnVar = this.J0;
        wnVar.v9 = i11;
        wnVar.o9();
        wnVar.r9();
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
