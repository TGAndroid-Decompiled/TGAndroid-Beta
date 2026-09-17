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
public final class xo0 extends View {
    public static final hv0 v;
    public ImageReceiver f32663a;
    public i9 f32664b;
    public org.telegram.ui.Cells.z f32665c;
    public Paint d;
    public Paint f32666e;
    public o1.k f32667f;
    public ValueAnimator h;
    public float f32668n;
    public boolean f32669r;
    public boolean f32670s;

    static {
        hv0 hv0Var = new hv0(new p2(29), new wo0(0));
        hv0Var.f26907c = 100.0f;
        v = hv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.k kVar = this.f32667f;
            if (kVar != null) {
                kVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f32670s = false;
            this.f32669r = false;
            if (z11) {
                float f10 = this.f32668n * 100.0f;
                o1.k kVar2 = new o1.k(this, v);
                kVar2.f16842b = f10;
                kVar2.f16843c = true;
                this.f32667f = kVar2;
                if (f7 < this.f32668n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f32670s = z12;
                this.f32669r = !z12;
                o1.l lVar = new o1.l(f11);
                lVar.f16859i = f11;
                lVar.b(450.0f);
                lVar.a(1.0f);
                kVar2.f16852u = lVar;
                this.f32667f.b(new oh(this, z12, f10, f11));
                this.f32667f.a(new hb(this, 3));
                this.f32667f.f();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f32668n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(pr.f29494f);
            this.h.addUpdateListener(new h70(this, 16));
            this.h.addListener(new r80(this, 14));
            this.h.start();
            return;
        }
        this.f32668n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32665c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f32668n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32665c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32663a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32663a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f32666e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f32669r) {
            f7 = 1.0f - this.f32668n;
        } else if (this.f32670s) {
            f7 = this.f32668n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f32663a.draw(canvas);
        int i10 = (int) (this.f32668n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f32665c.setBounds(0, 0, getWidth(), getHeight());
        this.f32665c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f32663a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        i9 i9Var = this.f32664b;
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
        i9Var.p(tLObject);
        this.f32663a.setForUserOrChat(tLObject, i9Var);
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
        if (!super.verifyDrawable(drawable) && this.f32665c != drawable) {
            return false;
        }
        return true;
    }
}
