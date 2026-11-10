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
public final class cn0 extends View implements org.telegram.ui.ActionBar.c6 {
    public static final mt0 f32713x;
    public ImageReceiver f32714a;
    public v8 f32715b;
    public org.telegram.ui.Cells.y f32716c;
    public Paint d;
    public Paint f32717e;
    public r1.g f32718f;
    public ValueAnimator h;
    public float f32719n;
    public boolean f32720r;
    public boolean f32721s;
    public int f32722w;

    static {
        mt0 mt0Var = new mt0(new il0(4), new il0(5));
        mt0Var.f36092c = 100.0f;
        f32713x = mt0Var;
    }

    public final void a(boolean z9, boolean z10, float f10) {
        if (z9) {
            r1.g gVar = this.f32718f;
            if (gVar != null) {
                gVar.d();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z11 = false;
            this.f32721s = false;
            this.f32720r = false;
            if (z10) {
                float f11 = this.f32719n * 100.0f;
                r1.g gVar2 = new r1.g(this, f32713x);
                gVar2.f54270b = f11;
                gVar2.f54271c = true;
                this.f32718f = gVar2;
                if (f10 < this.f32719n) {
                    z11 = true;
                }
                float f12 = f10 * 100.0f;
                this.f32721s = z11;
                this.f32720r = !z11;
                r1.h hVar = new r1.h(f12);
                hVar.f54287i = f12;
                hVar.b(450.0f);
                hVar.a(1.0f);
                gVar2.f54279m = hVar;
                this.f32718f.b(new wg(this, z11, f11, f12));
                this.f32718f.a(new sa(this, 4));
                this.f32718f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32719n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(wq.f40046f);
            this.h.addUpdateListener(new c60(this, 15));
            this.h.addListener(new e60(this, 18));
            this.h.start();
            return;
        }
        this.f32719n = f10;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32716c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32719n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32716c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32714a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32714a.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f32717e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f32720r) {
            f10 = 1.0f - this.f32719n;
        } else if (this.f32721s) {
            f10 = this.f32719n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32714a.h(canvas, null);
        int i7 = (int) (this.f32719n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32716c.setBounds(0, 0, getWidth(), getHeight());
        this.f32716c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32714a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        v8 v8Var = this.f32715b;
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
        v8Var.l(tLObject);
        this.f32714a.i0(tLObject, v8Var, null);
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
        this.d.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Rf, false));
        this.f32717e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Qf, false));
        if (this.f32716c != null) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
            if (r12 != this.f32722w) {
                this.f32722w = r12;
                org.telegram.ui.ActionBar.m6.H1(this.f32716c, r12, true);
            }
            invalidate();
            return;
        }
        this.f32722w = org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.f32722w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, i7, i7);
        this.f32716c = k02;
        k02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f32716c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
