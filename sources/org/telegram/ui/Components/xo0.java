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
    public static final jv0 v;
    public ImageReceiver f29954a;
    public f9 f29955b;
    public org.telegram.ui.Cells.z f29956c;
    public Paint d;
    public Paint e;
    public o1.k f29957f;
    public ValueAnimator h;
    public float f29958n;
    public boolean f29959r;
    public boolean f29960s;

    static {
        jv0 jv0Var = new jv0(new bn0(2), new bn0(3));
        jv0Var.f25452c = 100.0f;
        v = jv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f29957f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f29960s = false;
            this.f29959r = false;
            if (z11) {
                float f10 = this.f29958n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f15352b = f10;
                kVar2.f15353c = true;
                this.f29957f = kVar2;
                if (f7 < this.f29958n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f29960s = z12;
                this.f29959r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f15367i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f15361u = lVar;
                this.f29957f.b(new mh(this, z12, f10, f11));
                this.f29957f.a(new fb(this, 3));
                this.f29957f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f29958n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(qr.f27380f);
            this.h.addUpdateListener(new h70(this, 16));
            this.h.addListener(new jd0(this, 11));
            this.h.start();
            return;
        }
        this.f29958n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29956c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f29958n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29956c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29954a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29954a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f29959r) {
            f7 = 1.0f - this.f29958n;
        } else if (this.f29960s) {
            f7 = this.f29958n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f29954a.draw(canvas);
        int i10 = (int) (this.f29958n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f29956c.setBounds(0, 0, getWidth(), getHeight());
        this.f29956c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f29954a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        f9 f9Var = this.f29955b;
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
        this.f29954a.setForUserOrChat(tLObject, f9Var);
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
        if (!super.verifyDrawable(drawable) && this.f29956c != drawable) {
            return false;
        }
        return true;
    }
}
