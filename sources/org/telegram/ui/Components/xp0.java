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
public final class xp0 extends View {
    public static final hw0 v;
    public ImageReceiver f31300a;
    public k9 f31301b;
    public org.telegram.ui.Cells.z f31302c;
    public Paint d;
    public Paint e;
    public o1.k f31303f;
    public ValueAnimator h;
    public float f31304n;
    public boolean f31305r;
    public boolean f31306s;

    static {
        hw0 hw0Var = new hw0(new zg0(4), new zg0(5));
        hw0Var.f25769c = 100.0f;
        v = hw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f31303f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f31306s = false;
            this.f31305r = false;
            if (z11) {
                float f10 = this.f31304n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f16459b = f10;
                kVar2.f16460c = true;
                this.f31303f = kVar2;
                if (f7 < this.f31304n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f31306s = z12;
                this.f31305r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f16474i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f16468u = lVar;
                this.f31303f.b(new oh(this, z12, f10, f11));
                this.f31303f.a(new jb(this, 4));
                this.f31303f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f31304n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(es.f24771f);
            this.h.addUpdateListener(new g80(this, 17));
            this.h.addListener(new k90(this, 15));
            this.h.start();
            return;
        }
        this.f31304n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31302c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f31304n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31302c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31300a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31300a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f31305r) {
            f7 = 1.0f - this.f31304n;
        } else if (this.f31306s) {
            f7 = this.f31304n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f31300a.draw(canvas);
        int i10 = (int) (this.f31304n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f31302c.setBounds(0, 0, getWidth(), getHeight());
        this.f31302c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f31300a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        k9 k9Var = this.f31301b;
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
        k9Var.p(tLObject);
        this.f31300a.setForUserOrChat(tLObject, k9Var);
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
        if (!super.verifyDrawable(drawable) && this.f31302c != drawable) {
            return false;
        }
        return true;
    }
}
