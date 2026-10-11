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
public final class cq0 extends View {
    public static final mw0 v;
    public ImageReceiver f25440a;
    public j9 f25441b;
    public org.telegram.ui.Cells.z f25442c;
    public Paint d;
    public Paint f25443e;
    public o1.k f25444f;
    public ValueAnimator h;
    public float f25445n;
    public boolean f25446r;
    public boolean f25447s;

    static {
        mw0 mw0Var = new mw0(new zd0(11), new zd0(12));
        mw0Var.f28962c = 100.0f;
        v = mw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f25444f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f25447s = false;
            this.f25446r = false;
            if (z11) {
                float f10 = this.f25445n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f17014b = f10;
                kVar2.f17015c = true;
                this.f25444f = kVar2;
                if (f7 < this.f25445n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f25447s = z12;
                this.f25446r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f17031i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f17024u = lVar;
                this.f25444f.b(new qh(this, z12, f10, f11));
                this.f25444f.a(new jb(this, 4));
                this.f25444f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f25445n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(is.f27500f);
            this.h.addUpdateListener(new j80(this, 17));
            this.h.addListener(new vd0(this, 12));
            this.h.start();
            return;
        }
        this.f25445n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25442c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f25445n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f25442c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25440a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25440a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f25443e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f25446r) {
            f7 = 1.0f - this.f25445n;
        } else if (this.f25447s) {
            f7 = this.f25445n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f25440a.draw(canvas);
        int i10 = (int) (this.f25445n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f25442c.setBounds(0, 0, getWidth(), getHeight());
        this.f25442c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f25440a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        j9 j9Var = this.f25441b;
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
        j9Var.p(tLObject);
        this.f25440a.setForUserOrChat(tLObject, j9Var);
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
        if (!super.verifyDrawable(drawable) && this.f25442c != drawable) {
            return false;
        }
        return true;
    }
}
