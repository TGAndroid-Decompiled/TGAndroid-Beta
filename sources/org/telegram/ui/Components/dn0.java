package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dn0 extends View implements org.telegram.ui.ActionBar.b6 {
    public static final nt0 f33112x;
    public ImageReceiver f33113a;
    public w8 f33114b;
    public org.telegram.ui.Cells.y f33115c;
    public Paint d;
    public Paint f33116e;
    public r1.g f33117f;
    public ValueAnimator h;
    public float f33118n;
    public boolean f33119r;
    public boolean f33120s;
    public int f33121w;

    static {
        nt0 nt0Var = new nt0(new jl0(4), new jl0(5));
        nt0Var.f36500c = 100.0f;
        f33112x = nt0Var;
    }

    public final void a(boolean z9, boolean z10, float f10) {
        if (z9) {
            r1.g gVar = this.f33117f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z11 = false;
            this.f33120s = false;
            this.f33119r = false;
            if (z10) {
                float f11 = this.f33118n * 100.0f;
                r1.g gVar2 = new r1.g(this, f33112x);
                gVar2.f54271b = f11;
                gVar2.f54272c = true;
                this.f33117f = gVar2;
                if (f10 < this.f33118n) {
                    z11 = true;
                }
                float f12 = f10 * 100.0f;
                this.f33120s = z11;
                this.f33119r = !z11;
                r1.h hVar = new r1.h(f12);
                hVar.f54288i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f54280m = hVar;
                this.f33117f.b(new xg(this, z11, f11, f12));
                this.f33117f.a(new ta(this, 4));
                this.f33117f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f33118n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(xq.f40458f);
            this.h.addUpdateListener(new d60(this, 15));
            this.h.addListener(new f60(this, 18));
            this.h.start();
            return;
        }
        this.f33118n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33115c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f33118n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33115c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33113a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33113a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f33116e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f33119r) {
            f10 = 1.0f - this.f33118n;
        } else if (this.f33120s) {
            f10 = this.f33118n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f33113a.h(canvas, null);
        int i7 = (int) (this.f33118n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f33115c.setBounds(0, 0, getWidth(), getHeight());
        this.f33115c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f33113a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        w8 w8Var = this.f33114b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.t10.j((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.id.a0("AccDescrSendAsPeer", null, 2131754775, str));
        w8Var.l(tLObject);
        this.f33113a.i0(tLObject, w8Var, null);
    }

    public void setProgress(float f10) {
        boolean z9;
        if (f10 != 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        a(true, z9, f10);
    }

    @Override
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Rf, false));
        this.f33116e.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Qf, false));
        if (this.f33115c != null) {
            int r12 = org.telegram.ui.ActionBar.l6.r1(0.2f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
            if (r12 != this.f33121w) {
                this.f33121w = r12;
                org.telegram.ui.ActionBar.l6.H1(this.f33115c, r12, true);
            }
            invalidate();
            return;
        }
        this.f33121w = org.telegram.ui.ActionBar.l6.r1(0.2f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f33121w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L, L, L, L, 0, i7, i7);
        this.f33115c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f33115c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
