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
public final class pp0 extends View {
    public static final ew0 v;
    public ImageReceiver f29699a;
    public h9 f29700b;
    public org.telegram.ui.Cells.z f29701c;
    public Paint d;
    public Paint f29702e;
    public o1.k f29703f;
    public ValueAnimator h;
    public float f29704n;
    public boolean f29705r;
    public boolean f29706s;

    static {
        ew0 ew0Var = new ew0(new ru(19), new ru(20));
        ew0Var.f26164c = 100.0f;
        v = ew0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f29703f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f29706s = false;
            this.f29705r = false;
            if (z11) {
                float f10 = this.f29704n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f16973b = f10;
                kVar2.f16974c = true;
                this.f29703f = kVar2;
                if (f7 < this.f29704n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f29706s = z12;
                this.f29705r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f16990i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f16983u = lVar;
                this.f29703f.b(new qh(this, z12, f10, f11));
                this.f29703f.a(new ib(this, 3));
                this.f29703f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f29704n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(tr.f31140f);
            this.h.addUpdateListener(new v70(this, 16));
            this.h.addListener(new hd0(this, 12));
            this.h.start();
            return;
        }
        this.f29704n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29701c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f29704n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29701c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29699a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29699a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f29702e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f29705r) {
            f7 = 1.0f - this.f29704n;
        } else if (this.f29706s) {
            f7 = this.f29704n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f29699a.draw(canvas);
        int i10 = (int) (this.f29704n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f29701c.setBounds(0, 0, getWidth(), getHeight());
        this.f29701c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f29699a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        h9 h9Var = this.f29700b;
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
        h9Var.p(tLObject);
        this.f29699a.setForUserOrChat(tLObject, h9Var);
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
        if (!super.verifyDrawable(drawable) && this.f29701c != drawable) {
            return false;
        }
        return true;
    }
}
