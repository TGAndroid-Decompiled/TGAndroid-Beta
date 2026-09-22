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
public final class lp0 extends View {
    public static final vv0 v;
    public ImageReceiver f26158a;
    public g9 f26159b;
    public org.telegram.ui.Cells.z f26160c;
    public Paint d;
    public Paint e;
    public o1.k f26161f;
    public ValueAnimator h;
    public float f26162n;
    public boolean f26163r;
    public boolean f26164s;

    static {
        vv0 vv0Var = new vv0(new lg0(6), new lg0(7));
        vv0Var.f29821c = 100.0f;
        v = vv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f26161f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f26164s = false;
            this.f26163r = false;
            if (z11) {
                float f10 = this.f26162n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f15528b = f10;
                kVar2.f15529c = true;
                this.f26161f = kVar2;
                if (f7 < this.f26162n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f26164s = z12;
                this.f26163r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f15543i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f15537u = lVar;
                this.f26161f.b(new nh(this, z12, f10, f11));
                this.f26161f.a(new gb(this, 3));
                this.f26161f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f26162n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(qr.f27653f);
            this.h.addUpdateListener(new s70(this, 16));
            this.h.addListener(new gd0(this, 12));
            this.h.start();
            return;
        }
        this.f26162n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f26160c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f26162n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f26160c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26158a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26158a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f26163r) {
            f7 = 1.0f - this.f26162n;
        } else if (this.f26164s) {
            f7 = this.f26162n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f26158a.draw(canvas);
        int i10 = (int) (this.f26162n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f26160c.setBounds(0, 0, getWidth(), getHeight());
        this.f26160c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f26158a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        g9 g9Var = this.f26159b;
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
        g9Var.p(tLObject);
        this.f26158a.setForUserOrChat(tLObject, g9Var);
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
        if (!super.verifyDrawable(drawable) && this.f26160c != drawable) {
            return false;
        }
        return true;
    }
}
