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
public final class cn0 extends View implements org.telegram.ui.ActionBar.a6 {
    public static final lt0 f32621x;
    public ImageReceiver f32622a;
    public w8 f32623b;
    public org.telegram.ui.Cells.y f32624c;
    public Paint d;
    public Paint f32625e;
    public r1.g f32626f;
    public ValueAnimator h;
    public float f32627n;
    public boolean f32628r;
    public boolean f32629s;
    public int f32630w;

    static {
        lt0 lt0Var = new lt0(new il0(4), new il0(5));
        lt0Var.f35743c = 100.0f;
        f32621x = lt0Var;
    }

    public final void a(boolean z9, boolean z10, float f10) {
        if (z9) {
            r1.g gVar = this.f32626f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z11 = false;
            this.f32629s = false;
            this.f32628r = false;
            if (z10) {
                float f11 = this.f32627n * 100.0f;
                r1.g gVar2 = new r1.g(this, f32621x);
                gVar2.f54166b = f11;
                gVar2.f54167c = true;
                this.f32626f = gVar2;
                if (f10 < this.f32627n) {
                    z11 = true;
                }
                float f12 = f10 * 100.0f;
                this.f32629s = z11;
                this.f32628r = !z11;
                r1.h hVar = new r1.h(f12);
                hVar.f54183i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f54175m = hVar;
                this.f32626f.b(new xg(this, z11, f11, f12));
                this.f32626f.a(new ta(this, 4));
                this.f32626f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32627n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(xq.f40329f);
            this.h.addUpdateListener(new c60(this, 15));
            this.h.addListener(new e60(this, 18));
            this.h.start();
            return;
        }
        this.f32627n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32624c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32627n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32624c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32622a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32622a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f32625e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f32628r) {
            f10 = 1.0f - this.f32627n;
        } else if (this.f32629s) {
            f10 = this.f32627n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32622a.h(canvas, null);
        int i7 = (int) (this.f32627n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32624c.setBounds(0, 0, getWidth(), getHeight());
        this.f32624c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32622a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        w8 w8Var = this.f32623b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.t10.j((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.hd.a0("AccDescrSendAsPeer", null, 2131754775, str));
        w8Var.l(tLObject);
        this.f32622a.i0(tLObject, w8Var, null);
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
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rf, false));
        this.f32625e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qf, false));
        if (this.f32624c != null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
            if (r12 != this.f32630w) {
                this.f32630w = r12;
                org.telegram.ui.ActionBar.k6.H1(this.f32624c, r12, true);
            }
            invalidate();
            return;
        }
        this.f32630w = org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f32630w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, i7, i7);
        this.f32624c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f32624c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
