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
public final class pn0 extends View implements org.telegram.ui.ActionBar.c6 {
    public static final ut0 f38494x;
    public ImageReceiver f38495a;
    public b9 f38496b;
    public org.telegram.ui.Cells.y f38497c;
    public Paint d;
    public Paint f38498e;
    public r1.g f38499f;
    public ValueAnimator h;
    public float f38500n;
    public boolean f38501r;
    public boolean f38502s;
    public int f38503w;

    static {
        ut0 ut0Var = new ut0(new wb0(9), new wb0(10));
        ut0Var.f40416c = 100.0f;
        f38494x = ut0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (z10) {
            r1.g gVar = this.f38499f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f38502s = false;
            this.f38501r = false;
            if (z11) {
                float f11 = this.f38500n * 100.0f;
                r1.g gVar2 = new r1.g(this, f38494x);
                gVar2.f56314b = f11;
                gVar2.f56315c = true;
                this.f38499f = gVar2;
                if (f10 < this.f38500n) {
                    z12 = true;
                }
                float f12 = f10 * 100.0f;
                this.f38502s = z12;
                this.f38501r = !z12;
                r1.h hVar = new r1.h(f12);
                hVar.f56331i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f56323m = hVar;
                this.f38499f.b(new lh(this, z12, f11, f12));
                this.f38499f.a(new ya(this, 4));
                this.f38499f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f38500n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(lr.f37208f);
            this.h.addUpdateListener(new e60(this, 17));
            this.h.addListener(new q60(this, 18));
            this.h.start();
            return;
        }
        this.f38500n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f38497c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f38500n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f38497c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38495a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38495a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f38498e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f38501r) {
            f10 = 1.0f - this.f38500n;
        } else if (this.f38502s) {
            f10 = this.f38500n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f38495a.h(canvas, null);
        int i7 = (int) (this.f38500n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f38497c.setBounds(0, 0, getWidth(), getHeight());
        this.f38497c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f38495a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        b9 b9Var = this.f38496b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.o10.k((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.gd.a0("AccDescrSendAsPeer", null, 2131754775, str));
        b9Var.l(tLObject);
        this.f38495a.i0(tLObject, b9Var, null);
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
        this.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Uf, false));
        this.f38498e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Tf, false));
        if (this.f38497c != null) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.2f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
            if (r12 != this.f38503w) {
                this.f38503w = r12;
                org.telegram.ui.ActionBar.n6.H1(this.f38497c, r12, true);
            }
            invalidate();
            return;
        }
        this.f38503w = org.telegram.ui.ActionBar.n6.r1(0.2f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f38503w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, i7, i7);
        this.f38497c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f38497c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
