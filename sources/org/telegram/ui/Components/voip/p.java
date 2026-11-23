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
import org.telegram.ui.ActionBar.m6;
public final class p extends View {
    public org.telegram.ui.Cells.y f41251a;
    public final Paint f41252b;
    public final Paint f41253c;
    public final Paint d;
    public final RectF f41254e;
    public final Drawable f41255f;
    public final String h;
    public int f41256n;
    public int f41257r;
    public int f41258s;
    public int f41259w;

    public p(Context context) {
        super(context);
        this.f41252b = new Paint(1);
        Paint paint = new Paint(1);
        this.f41253c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f41254e = new RectF();
        this.f41256n = -761748;
        this.f41257r = org.telegram.messenger.g0.L(26.0f);
        this.f41258s = 255;
        this.f41259w = 0;
        Drawable mutate = getContext().getDrawable(2131230918).mutate();
        this.f41255f = mutate;
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
        this.h = hd.N0(2131752029, null);
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
        org.telegram.ui.Cells.y yVar = this.f41251a;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f41251a;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i7 = this.f41256n;
        Paint paint = this.f41252b;
        paint.setColor(i7);
        RectF rectF = this.f41254e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f41257r;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Drawable drawable = this.f41255f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f41258s);
        drawable.draw(canvas);
        int i10 = this.f41259w;
        Paint paint2 = this.f41253c;
        paint2.setAlpha(i10);
        Paint paint3 = this.d;
        paint3.setAlpha((this.f41259w / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, org.telegram.messenger.g0.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + org.telegram.messenger.g0.L(6.0f), paint3);
        if (this.f41251a == null) {
            org.telegram.ui.Cells.y a02 = m6.a0(m6.x0(null, m6.f29473i6, false), 8, 8);
            this.f41251a = a02;
            a02.setCallback(this);
        }
        this.f41251a.setBounds(0, 0, getWidth(), getHeight());
        this.f41251a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f41251a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
