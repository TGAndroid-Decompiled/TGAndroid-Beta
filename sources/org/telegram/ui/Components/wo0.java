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
public final class wo0 extends View {
    public static final iv0 v;
    public ImageReceiver f29758a;
    public f9 f29759b;
    public org.telegram.ui.Cells.z f29760c;
    public Paint d;
    public Paint e;
    public o1.k f29761f;
    public ValueAnimator h;
    public float f29762n;
    public boolean f29763r;
    public boolean f29764s;

    static {
        iv0 iv0Var = new iv0(new in0(1), new in0(2));
        iv0Var.f25153c = 100.0f;
        v = iv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f29761f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f29764s = false;
            this.f29763r = false;
            if (z11) {
                float f10 = this.f29762n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f15340b = f10;
                kVar2.f15341c = true;
                this.f29761f = kVar2;
                if (f7 < this.f29762n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f29764s = z12;
                this.f29763r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f15355i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f15349u = lVar;
                this.f29761f.b(new mh(this, z12, f10, f11));
                this.f29761f.a(new fb(this, 3));
                this.f29761f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f29762n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(qr.f27420f);
            this.h.addUpdateListener(new h70(this, 16));
            this.h.addListener(new jd0(this, 11));
            this.h.start();
            return;
        }
        this.f29762n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29760c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f29762n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29760c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29758a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29758a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f29763r) {
            f7 = 1.0f - this.f29762n;
        } else if (this.f29764s) {
            f7 = this.f29762n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f29758a.draw(canvas);
        int i10 = (int) (this.f29762n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f29760c.setBounds(0, 0, getWidth(), getHeight());
        this.f29760c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f29758a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        f9 f9Var = this.f29759b;
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
        f9Var.p(tLObject);
        this.f29758a.setForUserOrChat(tLObject, f9Var);
    }

    public void setProgress(float f7) {
        boolean z10;
        if (f7 != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(true, z10, f7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f29760c != drawable) {
            return false;
        }
        return true;
    }
}
