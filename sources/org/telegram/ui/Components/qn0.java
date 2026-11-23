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
public final class qn0 extends View implements org.telegram.ui.ActionBar.c6 {
    public static final wt0 f38956x;
    public ImageReceiver f38957a;
    public a9 f38958b;
    public org.telegram.ui.Cells.y f38959c;
    public Paint d;
    public Paint f38960e;
    public r1.g f38961f;
    public ValueAnimator h;
    public float f38962n;
    public boolean f38963r;
    public boolean f38964s;
    public int f38965w;

    static {
        wt0 wt0Var = new wt0(new ub0(9), new ub0(10));
        wt0Var.f41732c = 100.0f;
        f38956x = wt0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (z10) {
            r1.g gVar = this.f38961f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f38964s = false;
            this.f38963r = false;
            if (z11) {
                float f11 = this.f38962n * 100.0f;
                r1.g gVar2 = new r1.g(this, f38956x);
                gVar2.f56437b = f11;
                gVar2.f56438c = true;
                this.f38961f = gVar2;
                if (f10 < this.f38962n) {
                    z12 = true;
                }
                float f12 = f10 * 100.0f;
                this.f38964s = z12;
                this.f38963r = !z12;
                r1.h hVar = new r1.h(f12);
                hVar.f56454i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f56446m = hVar;
                this.f38961f.b(new mh(this, z12, f11, f12));
                this.f38961f.a(new xa(this, 4));
                this.f38961f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f38962n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(kr.f36858f);
            this.h.addUpdateListener(new e60(this, 17));
            this.h.addListener(new p60(this, 18));
            this.h.start();
            return;
        }
        this.f38962n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f38959c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f38962n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f38959c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38957a.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38957a.S();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f38960e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f38963r) {
            f10 = 1.0f - this.f38962n;
        } else if (this.f38964s) {
            f10 = this.f38962n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f38957a.h(canvas, null);
        int i7 = (int) (this.f38962n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f38959c.setBounds(0, 0, getWidth(), getHeight());
        this.f38959c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f38957a.z0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        a9 a9Var = this.f38958b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.n10.k((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.gd.a0("AccDescrSendAsPeer", null, 2131754774, str));
        a9Var.l(tLObject);
        this.f38957a.j0(tLObject, a9Var, null);
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
        this.f38960e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Tf, false));
        if (this.f38959c != null) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.2f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
            if (r12 != this.f38965w) {
                this.f38965w = r12;
                org.telegram.ui.ActionBar.n6.H1(this.f38959c, r12, true);
            }
            invalidate();
            return;
        }
        this.f38965w = org.telegram.ui.ActionBar.n6.r1(0.2f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f38965w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, i7, i7);
        this.f38959c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f38959c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
