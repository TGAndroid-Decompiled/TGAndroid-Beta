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

public final class go0 extends View {
    public static final su0 v;

    public ImageReceiver f28779a;

    public y8 f28780b;

    public org.telegram.ui.Cells.z f28781c;
    public Paint d;

    public Paint f28782e;

    public o1.j f28783f;
    public ValueAnimator h;

    public float f28784n;

    public boolean f28785r;

    public boolean f28786s;

    static {
        su0 su0Var = new su0(new pc0(9), new pc0(10));
        su0Var.f32580c = 100.0f;
        v = su0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (!z10) {
            this.f28784n = f10;
            invalidate();
            return;
        }
        o1.j jVar = this.f28783f;
        if (jVar != null) {
            jVar.c();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28786s = false;
        this.f28785r = false;
        if (!z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.f28784n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(er.f28122f);
            this.h.addUpdateListener(new v60(this, 16));
            this.h.addListener(new sz(this, 19));
            this.h.start();
            return;
        }
        float f11 = this.f28784n * 100.0f;
        o1.j jVar2 = new o1.j(this, v);
        jVar2.f19138b = f11;
        jVar2.f19139c = true;
        this.f28783f = jVar2;
        boolean z12 = f10 < this.f28784n;
        float f12 = f10 * 100.0f;
        this.f28786s = z12;
        this.f28785r = !z12;
        o1.k kVar = new o1.k(f12);
        kVar.f19154i = f12;
        kVar.b(450.0f);
        kVar.a(1.0f);
        jVar2.f19147u = kVar;
        this.f28783f.b(new zg(this, z12, f11, f12));
        this.f28783f.a(new wa(this, 3));
        this.f28783f.f();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28781c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f28784n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28781c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28779a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28779a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f28782e;
        canvas.save();
        float f10 = 1.0f;
        if (this.f28785r) {
            f10 = 1.0f - this.f28784n;
        } else if (this.f28786s) {
            f10 = this.f28784n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f28779a.draw(canvas);
        int i10 = (int) (this.f28784n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f28781c.setBounds(0, 0, getWidth(), getHeight());
        this.f28781c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f28779a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String firstName;
        y8 y8Var = this.f28780b;
        if (tLObject instanceof TLRPC.User) {
            firstName = UserObject.getFirstName((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            firstName = ((TLRPC.Chat) tLObject).title;
        } else {
            firstName = tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : "";
        }
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, firstName));
        y8Var.p(tLObject);
        this.f28779a.setForUserOrChat(tLObject, y8Var);
    }

    public void setProgress(float f10) {
        a(true, f10 != 0.0f, f10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f28781c == drawable;
    }
}
