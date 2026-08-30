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
public final class ap0 extends View {
    public static final iv0 v;
    public ImageReceiver f23485a;
    public z8 f23486b;
    public org.telegram.ui.Cells.z f23487c;
    public Paint d;
    public Paint e;
    public o1.j f23488f;
    public ValueAnimator h;
    public float f23489n;
    public boolean f23490r;
    public boolean f23491s;

    static {
        iv0 iv0Var = new iv0(new kh0(3), new kh0(4));
        iv0Var.f25791c = 100.0f;
        v = iv0Var;
    }

    public final void a(boolean z4, boolean z10, float f10) {
        if (z4) {
            o1.j jVar = this.f23488f;
            if (jVar != null) {
                jVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z11 = false;
            this.f23491s = false;
            this.f23490r = false;
            if (z10) {
                float f11 = this.f23489n * 100.0f;
                o1.j jVar2 = new o1.j(this, v);
                jVar2.f16190b = f11;
                jVar2.f16191c = true;
                this.f23488f = jVar2;
                if (f10 < this.f23489n) {
                    z11 = true;
                }
                float f12 = f10 * 100.0f;
                this.f23491s = z11;
                this.f23490r = !z11;
                o1.k kVar = new o1.k(f12);
                kVar.f16204i = f12;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f16198u = kVar;
                this.f23488f.b(new dh(this, z11, f11, f12));
                this.f23488f.a(new ya(this, 3));
                this.f23488f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f23489n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(nr.f27346f);
            this.h.addUpdateListener(new i70(this, 16));
            this.h.addListener(new nd0(this, 10));
            this.h.start();
            return;
        }
        this.f23489n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f23487c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f23489n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f23487c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23485a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23485a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f23490r) {
            f10 = 1.0f - this.f23489n;
        } else if (this.f23491s) {
            f10 = this.f23489n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f23485a.draw(canvas);
        int i10 = (int) (this.f23489n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f23487c.setBounds(0, 0, getWidth(), getHeight());
        this.f23487c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f23485a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        z8 z8Var = this.f23486b;
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
        this.f23485a.setForUserOrChat(tLObject, z8Var);
    }

    public void setProgress(float f10) {
        boolean z4;
        if (f10 != 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        a(true, z4, f10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f23487c != drawable) {
            return false;
        }
        return true;
    }
}
