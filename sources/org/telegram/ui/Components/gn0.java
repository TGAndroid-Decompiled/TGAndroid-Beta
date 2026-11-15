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
public final class gn0 extends View implements org.telegram.ui.ActionBar.z5 {
    public static final mt0 f35027x;
    public ImageReceiver f35028a;
    public t8 f35029b;
    public org.telegram.ui.Cells.y f35030c;
    public Paint d;
    public Paint f35031e;
    public r1.g f35032f;
    public ValueAnimator h;
    public float f35033n;
    public boolean f35034r;
    public boolean f35035s;
    public int f35036w;

    static {
        mt0 mt0Var = new mt0(new rb0(8), new rb0(9));
        mt0Var.f37377c = 100.0f;
        f35027x = mt0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (z10) {
            r1.g gVar = this.f35032f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f35035s = false;
            this.f35034r = false;
            if (z11) {
                float f11 = this.f35033n * 100.0f;
                r1.g gVar2 = new r1.g(this, f35027x);
                gVar2.f55739b = f11;
                gVar2.f55740c = true;
                this.f35032f = gVar2;
                if (f10 < this.f35033n) {
                    z12 = true;
                }
                float f12 = f10 * 100.0f;
                this.f35035s = z12;
                this.f35034r = !z12;
                r1.h hVar = new r1.h(f12);
                hVar.f55756i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f55748m = hVar;
                this.f35032f.b(new ch(this, z12, f11, f12));
                this.f35032f.a(new pa(this, 4));
                this.f35032f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f35033n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(er.f34419f);
            this.h.addUpdateListener(new f60(this, 15));
            this.h.addListener(new h60(this, 18));
            this.h.start();
            return;
        }
        this.f35033n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f35030c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f35033n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f35030c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35028a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35028a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f35031e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f35034r) {
            f10 = 1.0f - this.f35033n;
        } else if (this.f35035s) {
            f10 = this.f35033n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f35028a.h(canvas, null);
        int i7 = (int) (this.f35033n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f35030c.setBounds(0, 0, getWidth(), getHeight());
        this.f35030c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f35028a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        t8 t8Var = this.f35029b;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.q10.j((TLRPC.User) tLObject, true);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(org.telegram.messenger.hd.a0("AccDescrSendAsPeer", null, 2131754775, str));
        t8Var.l(tLObject);
        this.f35028a.i0(tLObject, t8Var, null);
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
        this.d.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Uf, false));
        this.f35031e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Tf, false));
        if (this.f35030c != null) {
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.2f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
            if (r12 != this.f35036w) {
                this.f35036w = r12;
                org.telegram.ui.ActionBar.j6.H1(this.f35030c, r12, true);
            }
            invalidate();
            return;
        }
        this.f35036w = org.telegram.ui.ActionBar.j6.r1(0.2f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f35036w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, i7, i7);
        this.f35030c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f35030c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
