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
public final class do0 extends View implements org.telegram.ui.ActionBar.k6 {
    public static final ou0 f25472x;
    public ImageReceiver f25473a;
    public r8 f25474b;
    public org.telegram.ui.Cells.y f25475c;
    public Paint d;
    public Paint e;
    public o1.j f25476f;
    public ValueAnimator h;
    public float f25477n;
    public boolean f25478r;
    public boolean f25479s;
    public int f25480w;

    static {
        ou0 ou0Var = new ou0(new au(21), new au(22));
        ou0Var.f29199c = 100.0f;
        f25472x = ou0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.j jVar = this.f25476f;
            if (jVar != null) {
                jVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f25479s = false;
            this.f25478r = false;
            if (z11) {
                float f10 = this.f25477n * 100.0f;
                o1.j jVar2 = new o1.j(this, f25472x);
                jVar2.f13949b = f10;
                jVar2.f13950c = true;
                this.f25476f = jVar2;
                if (f7 < this.f25477n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f25479s = z12;
                this.f25478r = !z12;
                o1.k kVar = new o1.k(f11);
                kVar.f13964i = f11;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f13957m = kVar;
                this.f25476f.b(new tg(this, z12, f10, f11));
                this.f25476f.a(new na(this, 4));
                this.f25476f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f25477n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(gr.f26495f);
            this.h.addUpdateListener(new r60(this, 16));
            this.h.addListener(new t60(this, 18));
            this.h.start();
            return;
        }
        this.f25477n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25475c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f25477n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f25475c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25473a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25473a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f25478r) {
            f7 = 1.0f - this.f25477n;
        } else if (this.f25479s) {
            f7 = this.f25477n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f25473a.h(canvas, null);
        int i10 = (int) (this.f25477n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.i0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f25475c.setBounds(0, 0, getWidth(), getHeight());
        this.f25475c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f25473a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        r8 r8Var = this.f25474b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.h20.j((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.cd.a0("AccDescrSendAsPeer", null, 2131754775, str));
        r8Var.l(tLObject);
        this.f25473a.i0(tLObject, r8Var, null);
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
        this.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Rf, false));
        this.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Qf, false));
        if (this.f25475c != null) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
            if (r12 != this.f25480w) {
                this.f25480w = r12;
                org.telegram.ui.ActionBar.t6.H1(this.f25475c, r12, true);
            }
            invalidate();
            return;
        }
        this.f25480w = org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
        int L = org.telegram.messenger.i0.L(18.0f);
        int i10 = this.f25480w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, i10, i10);
        this.f25475c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f25475c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
