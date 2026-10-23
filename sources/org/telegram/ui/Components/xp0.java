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
public final class xp0 extends View implements org.telegram.ui.ActionBar.b6 {
    public static final hw0 f32621w;
    public ImageReceiver f32622a;
    public h9 f32623b;
    public org.telegram.ui.Cells.y f32624c;
    public Paint d;
    public Paint e;
    public o1.k f32625f;
    public ValueAnimator h;
    public float f32626n;
    public boolean f32627r;
    public boolean f32628s;
    public int v;

    static {
        hw0 hw0Var = new hw0(new ud0(13), new ud0(14));
        hw0Var.f27066c = 100.0f;
        f32621w = hw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f32625f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f32628s = false;
            this.f32627r = false;
            if (z11) {
                float f10 = this.f32626n * 100.0f;
                o1.k kVar2 = new o1.k(this, f32621w);
                kVar2.f17613b = f10;
                kVar2.f17614c = true;
                this.f32625f = kVar2;
                if (f7 < this.f32626n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f32628s = z12;
                this.f32627r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f17628i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f17622u = lVar;
                this.f32625f.b(new nh(this, z12, f10, f11));
                this.f32625f.a(new hb(this, 4));
                this.f32625f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32626n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(bs.f25133f);
            this.h.addUpdateListener(new d80(this, 17));
            this.h.addListener(new i60(this, 18));
            this.h.start();
            return;
        }
        this.f32626n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32624c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32626n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32624c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32622a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32622a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f32627r) {
            f7 = 1.0f - this.f32626n;
        } else if (this.f32628s) {
            f7 = this.f32626n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32622a.draw(canvas);
        int i10 = (int) (this.f32626n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32624c.setBounds(0, 0, getWidth(), getHeight());
        this.f32624c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32622a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        h9 h9Var = this.f32623b;
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
        h9Var.p(tLObject);
        this.f32622a.setForUserOrChat(tLObject, h9Var);
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
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21173cf, false));
        this.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21153bf, false));
        if (this.f32624c != null) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
            if (o12 != this.v) {
                this.v = o12;
                org.telegram.ui.ActionBar.k6.E1(this.f32624c, o12, true);
            }
            invalidate();
            return;
        }
        this.v = org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = this.v;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, i10, i10);
        this.f32624c = j02;
        j02.setCallback(this);
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
