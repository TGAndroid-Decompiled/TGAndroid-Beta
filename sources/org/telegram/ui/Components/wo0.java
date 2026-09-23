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
    public ImageReceiver f29765a;
    public h9 f29766b;
    public org.telegram.ui.Cells.z f29767c;
    public Paint d;
    public Paint e;
    public o1.k f29768f;
    public ValueAnimator h;
    public float f29769n;
    public boolean f29770r;
    public boolean f29771s;

    static {
        iv0 iv0Var = new iv0(new xc0(15), new xc0(16));
        iv0Var.f25070c = 100.0f;
        v = iv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f29768f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f29771s = false;
            this.f29770r = false;
            if (z11) {
                float f10 = this.f29769n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f15317b = f10;
                kVar2.f15318c = true;
                this.f29768f = kVar2;
                if (f7 < this.f29769n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f29771s = z12;
                this.f29770r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f15332i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f15326u = lVar;
                this.f29768f.b(new nh(this, z12, f10, f11));
                this.f29768f.a(new hb(this, 3));
                this.f29768f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f29769n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(rr.f27701f);
            this.h.addUpdateListener(new i70(this, 16));
            this.h.addListener(new jd0(this, 11));
            this.h.start();
            return;
        }
        this.f29769n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29767c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f29769n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29767c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29765a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29765a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f29770r) {
            f7 = 1.0f - this.f29769n;
        } else if (this.f29771s) {
            f7 = this.f29769n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f29765a.draw(canvas);
        int i10 = (int) (this.f29769n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f29767c.setBounds(0, 0, getWidth(), getHeight());
        this.f29767c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f29765a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        h9 h9Var = this.f29766b;
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
        this.f29765a.setForUserOrChat(tLObject, h9Var);
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
        if (!super.verifyDrawable(drawable) && this.f29767c != drawable) {
            return false;
        }
        return true;
    }
}
