package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fo0 extends View {
    public static final pu0 v;
    public ImageReceiver f28529a;
    public z8 f28530b;
    public org.telegram.ui.Cells.z f28531c;
    public Paint d;
    public Paint f28532e;
    public o1.j f28533f;
    public ValueAnimator h;
    public float f28534n;
    public boolean f28535r;
    public boolean f28536s;

    static {
        pu0 pu0Var = new pu0(new if0(4), new if0(5));
        pu0Var.f31764c = 100.0f;
        v = pu0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (z10) {
            o1.j jVar = this.f28533f;
            if (jVar != null) {
                jVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f28536s = false;
            this.f28535r = false;
            if (z11) {
                float f11 = this.f28534n * 100.0f;
                o1.j jVar2 = new o1.j(this, v);
                jVar2.f18791b = f11;
                jVar2.f18792c = true;
                this.f28533f = jVar2;
                if (f10 < this.f28534n) {
                    z12 = true;
                }
                float f12 = f10 * 100.0f;
                this.f28536s = z12;
                this.f28535r = !z12;
                o1.k kVar = new o1.k(f12);
                kVar.f18807i = f12;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f18800u = kVar;
                this.f28533f.b(new dh(this, z12, f11, f12));
                this.f28533f.a(new ya(this, 3));
                this.f28533f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f28534n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(gr.f28844f);
            this.h.addUpdateListener(new q60(this, 16));
            this.h.addListener(new r60(this, 17));
            this.h.start();
            return;
        }
        this.f28534n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28531c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f28534n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28531c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28529a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28529a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f28532e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f28535r) {
            f10 = 1.0f - this.f28534n;
        } else if (this.f28536s) {
            f10 = this.f28534n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f28529a.draw(canvas);
        int i9 = (int) (this.f28534n * 255.0f);
        paint.setAlpha(i9);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i9);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f28531c.setBounds(0, 0, getWidth(), getHeight());
        this.f28531c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f28529a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        z8 z8Var = this.f28530b;
        if (tLObject instanceof TLRPC.User) {
            str = UserObject.getFirstName((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, str));
        z8Var.p(tLObject);
        this.f28529a.setForUserOrChat(tLObject, z8Var);
    }

    public void setProgress(float f10) {
        boolean z10;
        if (f10 != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(true, z10, f10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f28531c != drawable) {
            return false;
        }
        return true;
    }
}
