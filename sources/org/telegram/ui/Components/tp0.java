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
public final class tp0 extends View {
    public static final ew0 v;
    public ImageReceiver f30642a;
    public h9 f30643b;
    public org.telegram.ui.Cells.z f30644c;
    public Paint d;
    public Paint e;
    public o1.k f30645f;
    public ValueAnimator h;
    public float f30646n;
    public boolean f30647r;
    public boolean f30648s;

    static {
        ew0 ew0Var = new ew0(new ug0(5), new ug0(6));
        ew0Var.f25985c = 100.0f;
        v = ew0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f30645f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f30648s = false;
            this.f30647r = false;
            if (z11) {
                float f10 = this.f30646n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f17550b = f10;
                kVar2.f17551c = true;
                this.f30645f = kVar2;
                if (f7 < this.f30646n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f30648s = z12;
                this.f30647r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f17565i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f17559u = lVar;
                this.f30645f.b(new nh(this, z12, f10, f11));
                this.f30645f.a(new hb(this, 4));
                this.f30645f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f30646n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(bs.f25021f);
            this.h.addUpdateListener(new b80(this, 17));
            this.h.addListener(new c80(this, 17));
            this.h.start();
            return;
        }
        this.f30646n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f30644c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f30646n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f30644c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30642a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30642a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f30647r) {
            f7 = 1.0f - this.f30646n;
        } else if (this.f30648s) {
            f7 = this.f30646n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f30642a.draw(canvas);
        int i10 = (int) (this.f30646n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f30644c.setBounds(0, 0, getWidth(), getHeight());
        this.f30644c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f30642a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        h9 h9Var = this.f30643b;
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
        this.f30642a.setForUserOrChat(tLObject, h9Var);
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
        if (!super.verifyDrawable(drawable) && this.f30644c != drawable) {
            return false;
        }
        return true;
    }
}
