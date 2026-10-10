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
    public ImageReceiver f25378a;
    public j9 f25379b;
    public org.telegram.ui.Cells.z f25380c;
    public Paint d;
    public Paint f25381e;
    public o1.k f25382f;
    public ValueAnimator h;
    public float f25383n;
    public boolean f25384r;
    public boolean f25385s;

    static {
        mw0 mw0Var = new mw0(new ge0(9), new ge0(10));
        mw0Var.f28922c = 100.0f;
        v = mw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f25382f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f25385s = false;
            this.f25384r = false;
            if (z11) {
                float f10 = this.f25383n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f16932b = f10;
                kVar2.f16933c = true;
                this.f25382f = kVar2;
                if (f7 < this.f25383n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f25385s = z12;
                this.f25384r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f16949i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f16942u = lVar;
                this.f25382f.b(new qh(this, z12, f10, f11));
                this.f25382f.a(new kb(this, 4));
                this.f25382f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f25383n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(is.f27443f);
            this.h.addUpdateListener(new k80(this, 17));
            this.h.addListener(new wd0(this, 12));
            this.h.start();
            return;
        }
        this.f25383n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25380c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f25383n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f25380c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25378a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25378a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f25381e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f25384r) {
            f7 = 1.0f - this.f25383n;
        } else if (this.f25385s) {
            f7 = this.f25383n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f25378a.draw(canvas);
        int i10 = (int) (this.f25383n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f25380c.setBounds(0, 0, getWidth(), getHeight());
        this.f25380c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f25378a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        j9 j9Var = this.f25379b;
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
        this.f25378a.setForUserOrChat(tLObject, j9Var);
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
        if (!super.verifyDrawable(drawable) && this.f25380c != drawable) {
            return false;
        }
        return true;
    }
}
