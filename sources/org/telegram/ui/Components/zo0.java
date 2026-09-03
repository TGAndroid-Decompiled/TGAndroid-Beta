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
public final class zo0 extends View {
    public static final iv0 v;
    public ImageReceiver f31440a;
    public z8 f31441b;
    public org.telegram.ui.Cells.z f31442c;
    public Paint d;
    public Paint e;
    public o1.j f31443f;
    public ValueAnimator h;
    public float f31444n;
    public boolean f31445r;
    public boolean f31446s;

    static {
        iv0 iv0Var = new iv0(new lh0(3), new lh0(4));
        iv0Var.f25780c = 100.0f;
        v = iv0Var;
    }

    public final void a(boolean z4, boolean z10, float f10) {
        if (z4) {
            o1.j jVar = this.f31443f;
            if (jVar != null) {
                jVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z11 = false;
            this.f31446s = false;
            this.f31445r = false;
            if (z10) {
                float f11 = this.f31444n * 100.0f;
                o1.j jVar2 = new o1.j(this, v);
                jVar2.f16170b = f11;
                jVar2.f16171c = true;
                this.f31443f = jVar2;
                if (f10 < this.f31444n) {
                    z11 = true;
                }
                float f12 = f10 * 100.0f;
                this.f31446s = z11;
                this.f31445r = !z11;
                o1.k kVar = new o1.k(f12);
                kVar.f16184i = f12;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f16178u = kVar;
                this.f31443f.b(new dh(this, z11, f11, f12));
                this.f31443f.a(new ya(this, 3));
                this.f31443f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f31444n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(mr.f27122f);
            this.h.addUpdateListener(new j70(this, 16));
            this.h.addListener(new od0(this, 10));
            this.h.start();
            return;
        }
        this.f31444n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31442c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f31444n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31442c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31440a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31440a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f31445r) {
            f10 = 1.0f - this.f31444n;
        } else if (this.f31446s) {
            f10 = this.f31444n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f31440a.draw(canvas);
        int i10 = (int) (this.f31444n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f31442c.setBounds(0, 0, getWidth(), getHeight());
        this.f31442c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f31440a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        z8 z8Var = this.f31441b;
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
        this.f31440a.setForUserOrChat(tLObject, z8Var);
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
        if (!super.verifyDrawable(drawable) && this.f31442c != drawable) {
            return false;
        }
        return true;
    }
}
