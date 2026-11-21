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
public final class rn0 extends View implements org.telegram.ui.ActionBar.b6 {
    public static final xt0 f39277x;
    public ImageReceiver f39278a;
    public b9 f39279b;
    public org.telegram.ui.Cells.y f39280c;
    public Paint d;
    public Paint f39281e;
    public r1.g f39282f;
    public ValueAnimator h;
    public float f39283n;
    public boolean f39284r;
    public boolean f39285s;
    public int f39286w;

    static {
        xt0 xt0Var = new xt0(new xb0(9), new xb0(10));
        xt0Var.f42225c = 100.0f;
        f39277x = xt0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (z10) {
            r1.g gVar = this.f39282f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f39285s = false;
            this.f39284r = false;
            if (z11) {
                float f11 = this.f39283n * 100.0f;
                r1.g gVar2 = new r1.g(this, f39277x);
                gVar2.f56355b = f11;
                gVar2.f56356c = true;
                this.f39282f = gVar2;
                if (f10 < this.f39283n) {
                    z12 = true;
                }
                float f12 = f10 * 100.0f;
                this.f39285s = z12;
                this.f39284r = !z12;
                r1.h hVar = new r1.h(f12);
                hVar.f56372i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f56364m = hVar;
                this.f39282f.b(new nh(this, z12, f11, f12));
                this.f39282f.a(new ya(this, 4));
                this.f39282f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f39283n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(nr.f37956f);
            this.h.addUpdateListener(new h60(this, 17));
            this.h.addListener(new s60(this, 18));
            this.h.start();
            return;
        }
        this.f39283n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f39280c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f39283n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f39280c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39278a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39278a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f39281e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f39284r) {
            f10 = 1.0f - this.f39283n;
        } else if (this.f39285s) {
            f10 = this.f39283n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f39278a.h(canvas, null);
        int i7 = (int) (this.f39283n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f39280c.setBounds(0, 0, getWidth(), getHeight());
        this.f39280c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f39278a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        b9 b9Var = this.f39279b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.o10.k((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.gd.a0("AccDescrSendAsPeer", null, 2131754774, str));
        b9Var.l(tLObject);
        this.f39278a.i0(tLObject, b9Var, null);
    }

    public void setProgress(float f10) {
        boolean z10;
        if (f10 != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(true, z10, f10);
    }

    @Override
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uf, false));
        this.f39281e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Tf, false));
        if (this.f39280c != null) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
            if (r12 != this.f39286w) {
                this.f39286w = r12;
                org.telegram.ui.ActionBar.m6.H1(this.f39280c, r12, true);
            }
            invalidate();
            return;
        }
        this.f39286w = org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f39286w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, i7, i7);
        this.f39280c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f39280c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
