package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp0 extends View implements org.telegram.ui.ActionBar.b6 {
    public static final gw0 f32314w;
    public ImageReceiver f32315a;
    public f9 f32316b;
    public org.telegram.ui.Cells.y f32317c;
    public Paint d;
    public Paint e;
    public o1.k f32318f;
    public ValueAnimator h;
    public float f32319n;
    public boolean f32320r;
    public boolean f32321s;
    public int v;

    static {
        gw0 gw0Var = new gw0(new sd0(13), new sd0(14));
        gw0Var.f26806c = 100.0f;
        f32314w = gw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f32318f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f32321s = false;
            this.f32320r = false;
            if (z11) {
                float f10 = this.f32319n * 100.0f;
                o1.k kVar2 = new o1.k(this, f32314w);
                kVar2.f17613b = f10;
                kVar2.f17614c = true;
                this.f32318f = kVar2;
                if (f7 < this.f32319n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f32321s = z12;
                this.f32320r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f17628i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f17622u = lVar;
                this.f32318f.b(new lh(this, z12, f10, f11));
                this.f32318f.a(new fb(this, 4));
                this.f32318f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32319n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(zr.f33337f);
            this.h.addUpdateListener(new b80(this, 17));
            this.h.addListener(new g60(this, 18));
            this.h.start();
            return;
        }
        this.f32319n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32317c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32319n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32317c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32315a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32315a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f32320r) {
            f7 = 1.0f - this.f32319n;
        } else if (this.f32321s) {
            f7 = this.f32319n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32315a.draw(canvas);
        int i10 = (int) (this.f32319n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32317c.setBounds(0, 0, getWidth(), getHeight());
        this.f32317c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32315a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        f9 f9Var = this.f32316b;
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
        this.f32315a.setForUserOrChat(tLObject, f9Var);
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
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21174cf, false));
        this.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21154bf, false));
        if (this.f32317c != null) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
            if (o12 != this.v) {
                this.v = o12;
                org.telegram.ui.ActionBar.k6.E1(this.f32317c, o12, true);
            }
            invalidate();
            return;
        }
        this.v = org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = this.v;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, i10, i10);
        this.f32317c = j02;
        j02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f32317c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
