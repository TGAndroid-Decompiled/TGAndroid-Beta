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
import org.telegram.ui.ActionBar.k6;
public final class p extends View {
    public org.telegram.ui.Cells.y f39411a;
    public final Paint f39412b;
    public final Paint f39413c;
    public final Paint d;
    public final RectF f39414e;
    public final Drawable f39415f;
    public final String h;
    public int f39416n;
    public int f39417r;
    public int f39418s;
    public int f39419w;

    public p(Context context) {
        super(context);
        this.f39412b = new Paint(1);
        Paint paint = new Paint(1);
        this.f39413c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f39414e = new RectF();
        this.f39416n = -761748;
        this.f39417r = org.telegram.messenger.g0.L(26.0f);
        this.f39418s = 255;
        this.f39419w = 0;
        Drawable mutate = getContext().getDrawable(2131230918).mutate();
        this.f39415f = mutate;
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
        org.telegram.ui.Cells.y yVar = this.f39411a;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f39411a;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i7 = this.f39416n;
        Paint paint = this.f39412b;
        paint.setColor(i7);
        RectF rectF = this.f39414e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f39417r;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Drawable drawable = this.f39415f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f39418s);
        drawable.draw(canvas);
        int i10 = this.f39419w;
        Paint paint2 = this.f39413c;
        paint2.setAlpha(i10);
        Paint paint3 = this.d;
        paint3.setAlpha((this.f39419w / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, org.telegram.messenger.g0.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + org.telegram.messenger.g0.L(6.0f), paint3);
        if (this.f39411a == null) {
            org.telegram.ui.Cells.y a02 = k6.a0(k6.x0(null, k6.f27941i6, false), 8, 8);
            this.f39411a = a02;
            a02.setCallback(this);
        }
        this.f39411a.setBounds(0, 0, getWidth(), getHeight());
        this.f39411a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f39411a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
