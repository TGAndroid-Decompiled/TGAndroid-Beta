package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;
public final class p extends View {
    public org.telegram.ui.Cells.y f40847a;
    public final Paint f40848b;
    public final Paint f40849c;
    public final Paint d;
    public final RectF f40850e;
    public final Drawable f40851f;
    public final String h;
    public int f40852n;
    public int f40853r;
    public int f40854s;
    public int f40855w;

    public p(Context context) {
        super(context);
        this.f40848b = new Paint(1);
        Paint paint = new Paint(1);
        this.f40849c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f40850e = new RectF();
        this.f40852n = -761748;
        this.f40853r = org.telegram.messenger.g0.L(26.0f);
        this.f40854s = 255;
        this.f40855w = 0;
        Drawable mutate = getContext().getDrawable(2131230918).mutate();
        this.f40851f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        paint.setTypeface(org.telegram.messenger.g0.o());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(org.telegram.messenger.g0.L(18.0f));
        paint2.setTypeface(org.telegram.messenger.g0.o());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = hd.M0(2131752041, null);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f40847a;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f40847a;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i7 = this.f40852n;
        Paint paint = this.f40848b;
        paint.setColor(i7);
        RectF rectF = this.f40850e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f40853r;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Drawable drawable = this.f40851f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f40854s);
        drawable.draw(canvas);
        int i10 = this.f40855w;
        Paint paint2 = this.f40849c;
        paint2.setAlpha(i10);
        Paint paint3 = this.d;
        paint3.setAlpha((this.f40855w / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, org.telegram.messenger.g0.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + org.telegram.messenger.g0.L(6.0f), paint3);
        if (this.f40847a == null) {
            org.telegram.ui.Cells.y a02 = j6.a0(j6.x0(null, j6.f28941i6, false), 8, 8);
            this.f40847a = a02;
            a02.setCallback(this);
        }
        this.f40847a.setBounds(0, 0, getWidth(), getHeight());
        this.f40847a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f40847a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
