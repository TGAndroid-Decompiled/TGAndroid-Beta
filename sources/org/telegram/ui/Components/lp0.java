package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lp0 extends View {
    public static final vv0 v;
    public ImageReceiver f26058a;
    public h9 f26059b;
    public org.telegram.ui.Cells.z f26060c;
    public Paint d;
    public Paint e;
    public o1.k f26061f;
    public ValueAnimator h;
    public float f26062n;
    public boolean f26063r;
    public boolean f26064s;

    static {
        vv0 vv0Var = new vv0(new ha0(17), new ha0(18));
        vv0Var.f29748c = 100.0f;
        v = vv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f26061f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f26064s = false;
            this.f26063r = false;
            if (z11) {
                float f10 = this.f26062n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f15524b = f10;
                kVar2.f15525c = true;
                this.f26061f = kVar2;
                if (f7 < this.f26062n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f26064s = z12;
                this.f26063r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f15539i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f15533u = lVar;
                this.f26061f.b(new oh(this, z12, f10, f11));
                this.f26061f.a(new hb(this, 3));
                this.f26061f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f26062n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(sr.f28348f);
            this.h.addUpdateListener(new u70(this, 16));
            this.h.addListener(new hd0(this, 12));
            this.h.start();
            return;
        }
        this.f26062n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f26060c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f26062n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f26060c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26058a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26058a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f26063r) {
            f7 = 1.0f - this.f26062n;
        } else if (this.f26064s) {
            f7 = this.f26062n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f26058a.draw(canvas);
        int i10 = (int) (this.f26062n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f26060c.setBounds(0, 0, getWidth(), getHeight());
        this.f26060c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f26058a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        h9 h9Var = this.f26059b;
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
        this.f26058a.setForUserOrChat(tLObject, h9Var);
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
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f26060c != drawable) {
            return false;
        }
        return true;
    }
}
