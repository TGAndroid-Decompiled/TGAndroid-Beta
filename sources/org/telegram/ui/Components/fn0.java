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
public final class fn0 extends View implements org.telegram.ui.ActionBar.z5 {
    public static final kt0 f33821x;
    public ImageReceiver f33822a;
    public u8 f33823b;
    public org.telegram.ui.Cells.y f33824c;
    public Paint d;
    public Paint f33825e;
    public q1.g f33826f;
    public ValueAnimator h;
    public float f33827n;
    public boolean f33828r;
    public boolean f33829s;
    public int f33830w;

    static {
        kt0 kt0Var = new kt0(new lf0(5), new lf0(6));
        kt0Var.f35485c = 100.0f;
        f33821x = kt0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (z10) {
            q1.g gVar = this.f33826f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f33829s = false;
            this.f33828r = false;
            if (z11) {
                float f11 = this.f33827n * 100.0f;
                q1.g gVar2 = new q1.g(this, f33821x);
                gVar2.f53644b = f11;
                gVar2.f53645c = true;
                this.f33826f = gVar2;
                if (f10 < this.f33827n) {
                    z12 = true;
                }
                float f12 = f10 * 100.0f;
                this.f33829s = z12;
                this.f33828r = !z12;
                q1.h hVar = new q1.h(f12);
                hVar.f53661i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f53653m = hVar;
                this.f33826f.b(new ug(this, z12, f11, f12));
                this.f33826f.a(new sa(this, 4));
                this.f33826f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f33827n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(xq.f40452f);
            this.h.addUpdateListener(new y50(this, 16));
            this.h.addListener(new a60(this, 18));
            this.h.start();
            return;
        }
        this.f33827n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33824c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f33827n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33824c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33822a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33822a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f33825e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f33828r) {
            f10 = 1.0f - this.f33827n;
        } else if (this.f33829s) {
            f10 = this.f33827n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f33822a.h(canvas, null);
        int i3 = (int) (this.f33827n * 255.0f);
        paint.setAlpha(i3);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i3);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f33824c.setBounds(0, 0, getWidth(), getHeight());
        this.f33824c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f33822a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        u8 u8Var = this.f33823b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.l10.j((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.bd.a0("AccDescrSendAsPeer", null, 2131754775, str));
        u8Var.l(tLObject);
        this.f33822a.i0(tLObject, u8Var, null);
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
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rf, false));
        this.f33825e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qf, false));
        if (this.f33824c != null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
            if (r12 != this.f33830w) {
                this.f33830w = r12;
                org.telegram.ui.ActionBar.k6.H1(this.f33824c, r12, true);
            }
            invalidate();
            return;
        }
        this.f33830w = org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i3 = this.f33830w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, i3, i3);
        this.f33824c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f33824c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
