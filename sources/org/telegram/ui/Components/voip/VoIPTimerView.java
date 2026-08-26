package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;

public final class VoIPTimerView extends View {
    public final Paint activePaint;
    public final Drawable callsDeclineDrawable;
    public String currentTimeStr;
    public final Paint inactivePaint;
    public boolean isDrawCallIcon;
    public final RectF rectF;
    public int signalBarCount;
    public final TextPaint textPaint;
    public StaticLayout timerLayout;
    public final ComposeDrawable$$ExternalSyntheticLambda0 updater;

    public VoIPTimerView(Activity activity) {
        super(activity);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.activePaint = paint;
        Paint paint2 = new Paint(1);
        this.inactivePaint = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.signalBarCount = 4;
        this.isDrawCallIcon = false;
        this.updater = new ComposeDrawable$$ExternalSyntheticLambda0(this, 3);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(ColorUtils.setAlphaComponent(-1, 229));
        paint2.setColor(ColorUtils.setAlphaComponent(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.callsDeclineDrawable = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp;
        StaticLayout staticLayout = this.timerLayout;
        int i = 0;
        if (staticLayout == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - iDp) / 2.0f, 0.0f);
        canvas.save();
        if (this.isDrawCallIcon) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.callsDeclineDrawable.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i < 4) {
                int i2 = i + 1;
                Paint paint = i2 > this.signalBarCount ? this.inactivePaint : this.activePaint;
                RectF rectF = this.rectF;
                float f = i;
                rectF.set(AndroidUtilities.dpf2(4.16f) * f, AndroidUtilities.dpf2(2.75f) * (3 - i), AndroidUtilities.dpf2(2.75f) + (AndroidUtilities.dpf2(4.16f) * f), AndroidUtilities.dp(11.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.7f), AndroidUtilities.dpf2(0.7f), paint);
                i = i2;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(AndroidUtilities.dp(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout = this.timerLayout;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(15.0f));
        }
    }

    public void setSignalBarCount(int i) {
        this.signalBarCount = i;
        invalidate();
    }

    @Override
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            if (i == 0) {
                this.currentTimeStr = "00:00";
                String str = this.currentTimeStr;
                TextPaint textPaint = this.textPaint;
                this.timerLayout = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                updateTimer();
            } else {
                this.currentTimeStr = null;
                this.timerLayout = null;
            }
        }
        super.setVisibility(i);
    }

    public final void updateTimer() {
        ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda0 = this.updater;
        removeCallbacks(composeDrawable$$ExternalSyntheticLambda0);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String longDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.currentTimeStr;
        if (str == null || !str.equals(longDuration)) {
            this.currentTimeStr = longDuration;
            if (this.timerLayout == null) {
                requestLayout();
            }
            String str2 = this.currentTimeStr;
            TextPaint textPaint = this.textPaint;
            this.timerLayout = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(composeDrawable$$ExternalSyntheticLambda0, 300L);
        invalidate();
    }
}
