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
public final class qo0 extends View {
    public static final av0 v;
    public ImageReceiver f32017a;
    public e9 f32018b;
    public org.telegram.ui.Cells.z f32019c;
    public Paint d;
    public Paint f32020e;
    public o1.k f32021f;
    public ValueAnimator h;
    public float f32022n;
    public boolean f32023r;
    public boolean f32024s;

    static {
        av0 av0Var = new av0(new r2(28), new r2(29));
        av0Var.f26899c = 100.0f;
        v = av0Var;
    }

    public final void a(boolean z10, boolean z11, float f9) {
        if (z10) {
            o1.k kVar = this.f32021f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f32024s = false;
            this.f32023r = false;
            if (z11) {
                float f10 = this.f32022n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f19036b = f10;
                kVar2.f19037c = true;
                this.f32021f = kVar2;
                if (f9 < this.f32022n) {
                    z12 = true;
                }
                float f11 = f9 * 100.0f;
                this.f32024s = z12;
                this.f32023r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f19052i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f19045u = lVar;
                this.f32021f.b(new gh(this, z12, f10, f11));
                this.f32021f.a(new db(this, 3));
                this.f32021f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32022n, f9).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(jr.f29800f);
            this.h.addUpdateListener(new d70(this, 16));
            this.h.addListener(new zz(this, 19));
            this.h.start();
            return;
        }
        this.f32022n = f9;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32019c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32022n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32019c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32017a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32017a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f32020e;
        canvas.save();
        float f9 = 1.0f;
        if (this.f32023r) {
            f9 = 1.0f - this.f32022n;
        } else if (this.f32024s) {
            f9 = this.f32022n;
        }
        canvas.scale(f9, f9, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32017a.draw(canvas);
        int i10 = (int) (this.f32022n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32019c.setBounds(0, 0, getWidth(), getHeight());
        this.f32019c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32017a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        e9 e9Var = this.f32018b;
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
        e9Var.p(tLObject);
        this.f32017a.setForUserOrChat(tLObject, e9Var);
    }

    public void setProgress(float f9) {
        boolean z10;
        if (f9 != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(true, z10, f9);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f32019c != drawable) {
            return false;
        }
        return true;
    }
}
