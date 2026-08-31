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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
public final class j extends View {
    public org.telegram.ui.Cells.z f32101a;
    public final Paint f32102b;
    public final Paint f32103c;
    public final Paint d;
    public final RectF f32104e;
    public final Drawable f32105f;
    public final String h;
    public int f32106n;
    public int f32107r;
    public int f32108s;
    public int v;

    public j(Context context) {
        super(context);
        this.f32102b = new Paint(1);
        Paint paint = new Paint(1);
        this.f32103c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f32104e = new RectF();
        this.f32106n = -761748;
        this.f32107r = AndroidUtilities.dp(26.0f);
        this.f32108s = 255;
        this.v = 0;
        Drawable mutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f32105f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(AndroidUtilities.dp(18.0f));
        paint.setTypeface(AndroidUtilities.bold());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(AndroidUtilities.dp(18.0f));
        paint2.setTypeface(AndroidUtilities.bold());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = LocaleController.getString(R.string.Close);
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
        org.telegram.ui.Cells.z zVar = this.f32101a;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f32101a;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = this.f32106n;
        Paint paint = this.f32102b;
        paint.setColor(i10);
        RectF rectF = this.f32104e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f32107r;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Drawable drawable = this.f32105f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f32108s);
        drawable.draw(canvas);
        int i11 = this.v;
        Paint paint2 = this.f32103c;
        paint2.setAlpha(i11);
        Paint paint3 = this.d;
        paint3.setAlpha((this.v / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, AndroidUtilities.dp(6.0f) + height, paint2);
        canvas.drawText(str, width, height + AndroidUtilities.dp(6.0f), paint3);
        if (this.f32101a == null) {
            org.telegram.ui.Cells.z Y = k6.Y(k6.w0(null, k6.f21750i6, false), 8, 8);
            this.f32101a = Y;
            Y.setCallback(this);
        }
        this.f32101a.setBounds(0, 0, getWidth(), getHeight());
        this.f32101a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32101a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
