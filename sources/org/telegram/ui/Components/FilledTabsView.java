package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class FilledTabsView extends View {
    private final Paint backgroundPaint;
    private RectF[] bounds;
    private int lastPressedIndex;
    private Utilities.Callback<Integer> onTabClick;
    private final Paint selectedPaint;
    private float selectedTabIndex;
    private Text[] tabs;

    public FilledTabsView(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.selectedPaint = paint;
        this.lastPressedIndex = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.tabs = new Text[charSequenceArr.length];
        this.bounds = new RectF[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            this.tabs[i] = new Text(charSequenceArr[i], 14.0f, AndroidUtilities.bold());
            this.bounds[i] = new RectF();
        }
        invalidate();
    }

    public void setSelected(float f) {
        if (Math.abs(f - this.selectedTabIndex) > 0.001f) {
            invalidate();
        }
        this.selectedTabIndex = f;
    }

    public FilledTabsView onTabSelected(Utilities.Callback<Integer> callback) {
        this.onTabClick = callback;
        return this;
    }

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundPaint.setColor(i);
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.tabs == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(2.0f) + (this.tabs.length * AndroidUtilities.dp(24.0f)) + AndroidUtilities.dp(2.0f);
        int i = 0;
        while (true) {
            Text[] textArr = this.tabs;
            if (i >= textArr.length) {
                break;
            }
            dp = (int) (dp + textArr[i].getWidth());
            i++;
        }
        float dp2 = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f = (width - dp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f, dp2, dp + f, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.backgroundPaint);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float dp4 = f + AndroidUtilities.dp(14.0f);
        int i2 = 0;
        while (true) {
            Text[] textArr2 = this.tabs;
            if (i2 < textArr2.length) {
                int i3 = i2;
                textArr2[i2].draw(canvas, dp4, height / 2.0f, -1, 1.0f);
                this.bounds[i3].set(dp4 - AndroidUtilities.dp(14.0f), dp2, this.tabs[i3].getWidth() + dp4 + AndroidUtilities.dp(14.0f), dp3);
                dp4 += this.tabs[i3].getWidth() + AndroidUtilities.dp(24.0f);
                i2 = i3 + 1;
            } else {
                AndroidUtilities.dp(2.0f);
                float dp5 = (height - AndroidUtilities.dp(26.0f)) / 2.0f;
                float dp6 = (height + AndroidUtilities.dp(26.0f)) / 2.0f;
                int clamp = Utilities.clamp((int) Math.floor(this.selectedTabIndex), this.tabs.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(this.selectedTabIndex), this.tabs.length - 1, 0);
                float dp7 = this.bounds[clamp].left + AndroidUtilities.dp(2.0f);
                float dp8 = this.bounds[clamp2].left + AndroidUtilities.dp(2.0f);
                float f2 = this.selectedTabIndex;
                double d = f2;
                double floor = Math.floor(f2);
                Double.isNaN(d);
                float lerp = AndroidUtilities.lerp(dp7, dp8, (float) (d - floor));
                float dp9 = this.bounds[clamp].right - AndroidUtilities.dp(2.0f);
                float dp10 = this.bounds[clamp2].right - AndroidUtilities.dp(2.0f);
                float f3 = this.selectedTabIndex;
                double d2 = f3;
                double floor2 = Math.floor(f3);
                Double.isNaN(d2);
                float lerp2 = AndroidUtilities.lerp(dp9, dp10, (float) (d2 - floor2));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(lerp, dp5, lerp2, dp6);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.selectedPaint);
                canvas.restore();
                return;
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (this.tabs == null || this.bounds == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.bounds;
            if (i >= rectFArr.length) {
                i = -1;
                break;
            }
            if (rectFArr[i].contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
            i++;
        }
        if (i >= 0 && i != this.lastPressedIndex) {
            this.lastPressedIndex = i;
            Utilities.Callback<Integer> callback = this.onTabClick;
            if (callback != null) {
                callback.run(Integer.valueOf(i));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.lastPressedIndex = -1;
        }
        if (motionEvent.getAction() != 0 || i < 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }
}
