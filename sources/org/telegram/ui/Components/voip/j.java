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
import org.telegram.ui.ActionBar.f6;
public final class j extends View {
    public org.telegram.ui.Cells.z f33577a;
    public final Paint f33578b;
    public final Paint f33579c;
    public final Paint d;
    public final RectF f33580e;
    public final Drawable f33581f;
    public final String h;
    public int f33582n;
    public int f33583r;
    public int f33584s;
    public int v;

    public j(Context context) {
        super(context);
        this.f33578b = new Paint(1);
        Paint paint = new Paint(1);
        this.f33579c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f33580e = new RectF();
        this.f33582n = -761748;
        this.f33583r = AndroidUtilities.dp(26.0f);
        this.f33584s = 255;
        this.v = 0;
        Drawable mutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f33581f = mutate;
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
        org.telegram.ui.Cells.z zVar = this.f33577a;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f33577a;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i9 = this.f33582n;
        Paint paint = this.f33578b;
        paint.setColor(i9);
        RectF rectF = this.f33580e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f33583r;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Drawable drawable = this.f33581f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f33584s);
        drawable.draw(canvas);
        int i10 = this.v;
        Paint paint2 = this.f33579c;
        paint2.setAlpha(i10);
        Paint paint3 = this.d;
        paint3.setAlpha((this.v / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, AndroidUtilities.dp(6.0f) + height, paint2);
        canvas.drawText(str, width, height + AndroidUtilities.dp(6.0f), paint3);
        if (this.f33577a == null) {
            org.telegram.ui.Cells.z Y = f6.Y(f6.w0(null, f6.f23092i6, false), 8, 8);
            this.f33577a = Y;
            Y.setCallback(this);
        }
        this.f33577a.setBounds(0, 0, getWidth(), getHeight());
        this.f33577a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33577a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
