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
public final class xo0 extends View {
    public static final hv0 v;
    public ImageReceiver f32635a;
    public i9 f32636b;
    public org.telegram.ui.Cells.z f32637c;
    public Paint d;
    public Paint f32638e;
    public o1.k f32639f;
    public ValueAnimator h;
    public float f32640n;
    public boolean f32641r;
    public boolean f32642s;

    static {
        hv0 hv0Var = new hv0(new p2(29), new wo0(0));
        hv0Var.f26879c = 100.0f;
        v = hv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f32639f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f32642s = false;
            this.f32641r = false;
            if (z11) {
                float f10 = this.f32640n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f16815b = f10;
                kVar2.f16816c = true;
                this.f32639f = kVar2;
                if (f7 < this.f32640n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f32642s = z12;
                this.f32641r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f16832i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f16825u = lVar;
                this.f32639f.b(new oh(this, z12, f10, f11));
                this.f32639f.a(new hb(this, 3));
                this.f32639f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32640n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(pr.f29466f);
            this.h.addUpdateListener(new h70(this, 16));
            this.h.addListener(new r80(this, 14));
            this.h.start();
            return;
        }
        this.f32640n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32637c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32640n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32637c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32635a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32635a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f32638e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f32641r) {
            f7 = 1.0f - this.f32640n;
        } else if (this.f32642s) {
            f7 = this.f32640n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32635a.draw(canvas);
        int i10 = (int) (this.f32640n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32637c.setBounds(0, 0, getWidth(), getHeight());
        this.f32637c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32635a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        i9 i9Var = this.f32636b;
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
        i9Var.p(tLObject);
        this.f32635a.setForUserOrChat(tLObject, i9Var);
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
        if (!super.verifyDrawable(drawable) && this.f32637c != drawable) {
            return false;
        }
        return true;
    }
}
