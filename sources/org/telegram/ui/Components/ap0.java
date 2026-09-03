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
    public ImageReceiver f25337a;
    public z8 f25338b;
    public org.telegram.ui.Cells.z f25339c;
    public Paint d;
    public Paint f25340e;
    public o1.j f25341f;
    public ValueAnimator h;
    public float f25342n;
    public boolean f25343r;
    public boolean f25344s;

    static {
        iv0 iv0Var = new iv0(new mh0(3), new mh0(4));
        iv0Var.f27906c = 100.0f;
        v = iv0Var;
    }

    public final void a(boolean z4, boolean z10, float f10) {
        if (z4) {
            o1.j jVar = this.f25341f;
            if (jVar != null) {
                jVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z11 = false;
            this.f25344s = false;
            this.f25343r = false;
            if (z10) {
                float f11 = this.f25342n * 100.0f;
                o1.j jVar2 = new o1.j(this, v);
                jVar2.f16329b = f11;
                jVar2.f16330c = true;
                this.f25341f = jVar2;
                if (f10 < this.f25342n) {
                    z11 = true;
                }
                float f12 = f10 * 100.0f;
                this.f25344s = z11;
                this.f25343r = !z11;
                o1.k kVar = new o1.k(f12);
                kVar.f16345i = f12;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f16338u = kVar;
                this.f25341f.b(new dh(this, z11, f11, f12));
                this.f25341f.a(new ya(this, 3));
                this.f25341f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f25342n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(pr.f30168f);
            this.h.addUpdateListener(new k70(this, 16));
            this.h.addListener(new pd0(this, 10));
            this.h.start();
            return;
        }
        this.f25342n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25339c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f25342n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f25339c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25337a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25337a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f25340e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f25343r) {
            f10 = 1.0f - this.f25342n;
        } else if (this.f25344s) {
            f10 = this.f25342n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f25337a.draw(canvas);
        int i10 = (int) (this.f25342n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f25339c.setBounds(0, 0, getWidth(), getHeight());
        this.f25339c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f25337a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        z8 z8Var = this.f25338b;
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
        this.f25337a.setForUserOrChat(tLObject, z8Var);
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
        if (!super.verifyDrawable(drawable) && this.f25339c != drawable) {
            return false;
        }
        return true;
    }
}
