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
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;

public final class FilledTabsView extends View {
    public final Paint backgroundPaint;
    public RectF[] bounds;
    public int lastPressedIndex;
    public PollItemMenu$$ExternalSyntheticLambda14 onTabClick;
    public final Paint selectedPaint;
    public float selectedTabIndex;
    public Text[] tabs;

    public FilledTabsView(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.selectedPaint = paint;
        this.lastPressedIndex = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.tabs == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int iDp = AndroidUtilities.dp(2.0f) + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(this.tabs.length, 24.0f, AndroidUtilities.dp(2.0f));
        int i = 0;
        while (true) {
            Text[] textArr = this.tabs;
            if (i >= textArr.length) {
                break;
            }
            iDp = (int) (textArr[i].getWidth() + iDp);
            i++;
        }
        float fDp = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float fDp2 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f = (width - iDp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f, fDp, iDp + f, fDp2);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.backgroundPaint);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float fDp3 = f + AndroidUtilities.dp(14.0f);
        int i2 = 0;
        while (true) {
            Text[] textArr2 = this.tabs;
            if (i2 >= textArr2.length) {
                AndroidUtilities.dp(2.0f);
                float fDp4 = (height - AndroidUtilities.dp(26.0f)) / 2.0f;
                float fDp5 = (AndroidUtilities.dp(26.0f) + height) / 2.0f;
                int iClamp = Utilities.clamp((int) Math.floor(this.selectedTabIndex), this.tabs.length - 1, 0);
                int iClamp2 = Utilities.clamp((int) Math.ceil(this.selectedTabIndex), this.tabs.length - 1, 0);
                float fDp6 = this.bounds[iClamp].left + AndroidUtilities.dp(2.0f);
                float fDp7 = this.bounds[iClamp2].left + AndroidUtilities.dp(2.0f);
                double d = this.selectedTabIndex;
                float fLerp = AndroidUtilities.lerp(fDp6, fDp7, (float) (d - Math.floor(d)));
                float fDp8 = this.bounds[iClamp].right - AndroidUtilities.dp(2.0f);
                float fDp9 = this.bounds[iClamp2].right - AndroidUtilities.dp(2.0f);
                double d2 = this.selectedTabIndex;
                float fLerp2 = AndroidUtilities.lerp(fDp8, fDp9, (float) (d2 - Math.floor(d2)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fLerp, fDp4, fLerp2, fDp5);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.selectedPaint);
                canvas.restore();
                return;
            }
            textArr2[i2].draw(fDp3, height / 2.0f, 1.0f, -1, canvas);
            this.bounds[i2].set(fDp3 - AndroidUtilities.dp(14.0f), fDp, this.tabs[i2].getWidth() + fDp3 + AndroidUtilities.dp(14.0f), fDp2);
            fDp3 += this.tabs[i2].getWidth() + AndroidUtilities.dp(24.0f);
            i2++;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
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
            PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = this.onTabClick;
            if (pollItemMenu$$ExternalSyntheticLambda14 != null) {
                pollItemMenu$$ExternalSyntheticLambda14.run(Integer.valueOf(i));
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

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundPaint.setColor(i);
        invalidate();
    }

    public void setSelected(float f) {
        if (Math.abs(f - this.selectedTabIndex) > 0.001f) {
            invalidate();
        }
        this.selectedTabIndex = f;
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
}
