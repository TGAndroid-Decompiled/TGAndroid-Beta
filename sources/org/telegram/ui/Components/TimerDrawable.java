package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public final class TimerDrawable extends Drawable {
    public final Context context;
    public ColorFilter currentColorFilter;
    public Drawable currentTtlIcon;
    public int iconColor;
    public boolean isDialog;
    public boolean isStaticIcon;
    public boolean overrideColor;
    public final Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;
    public int time;
    public int timeHeight;
    public StaticLayout timeLayout;
    public final TextPaint timePaint;
    public float timeWidth;

    public TimerDrawable(Context context, Theme.ResourcesProvider resourcesProvider) {
        TextPaint textPaint = new TextPaint(1);
        this.timePaint = textPaint;
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        this.timeWidth = 0.0f;
        this.timeHeight = 0;
        this.time = -1;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(23.0f);
        int iDp2 = AndroidUtilities.dp(23.0f);
        boolean z = this.isDialog;
        Paint paint = this.paint;
        TextPaint textPaint = this.timePaint;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z) {
            textPaint.setColor(-1);
        } else if (this.isStaticIcon) {
            textPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
        } else {
            if (!this.overrideColor) {
                paint.setColor(Theme.getColor(Theme.key_actionBarDefault, resourcesProvider));
            }
            textPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider));
        }
        if (this.currentTtlIcon != null) {
            if (!this.isStaticIcon && !this.isDialog) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int color = Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider);
                if (this.iconColor != color) {
                    this.iconColor = color;
                    this.currentTtlIcon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.isDialog) {
                this.currentTtlIcon.setBounds(getBounds().left, getBounds().top, this.currentTtlIcon.getIntrinsicWidth() + getBounds().left, this.currentTtlIcon.getIntrinsicHeight() + getBounds().top);
                this.currentTtlIcon.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.currentTtlIcon.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.currentTtlIcon.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.currentTtlIcon.setBounds(rect);
                this.currentTtlIcon.draw(canvas);
            }
        }
        if (this.time == 0 || this.timeLayout == null) {
            return;
        }
        int i = AndroidUtilities.density != 3.0f ? 0 : -1;
        canvas.save();
        if (this.isDialog) {
            canvas.translate((float) ((((double) (getBounds().width() / 2)) - Math.ceil(this.timeWidth / 2.0f)) + ((double) i)), (getBounds().height() - this.timeHeight) / 2.0f);
            this.timeLayout.draw(canvas);
        } else {
            canvas.translate(((int) (((double) (iDp / 2)) - Math.ceil(this.timeWidth / 2.0f))) + i, (iDp2 - this.timeHeight) / 2.0f);
            this.timeLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        if (this.isStaticIcon) {
            this.currentTtlIcon.setColorFilter(colorFilter);
        }
    }

    public final void setTime(int i) {
        String strM;
        if (this.time != i) {
            this.time = i;
            boolean z = this.isDialog;
            Context context = this.context;
            if (z) {
                this.currentTtlIcon = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                Drawable drawableMutate = context.getDrawable(i == 0 ? R.drawable.msg_mini_autodelete : R.drawable.msg_mini_autodelete_empty).mutate();
                this.currentTtlIcon = drawableMutate;
                drawableMutate.setColorFilter(this.currentColorFilter);
            }
            invalidateSelf();
            int i2 = this.time;
            if (i2 >= 1 && i2 < 60) {
                strM = DiffUtil.m(i, "");
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerSeconds);
                }
            } else if (i2 >= 60 && i2 < 3600) {
                strM = "" + (i / 60);
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerMinutes);
                }
            } else if (i2 >= 3600 && i2 < 86400) {
                strM = "" + ((i / 60) / 60);
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerHours);
                }
            } else if (i2 >= 86400 && i2 < 604800) {
                strM = "" + (((i / 60) / 60) / 24);
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerDays);
                }
            } else if (i2 < 2678400) {
                strM = "" + ((((i / 60) / 60) / 24) / 7);
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerWeeks);
                } else if (strM.length() > 2) {
                    strM = "c";
                }
            } else if (i2 < 31449600) {
                strM = "" + ((((i / 60) / 60) / 24) / 30);
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerMonths);
                }
            } else {
                strM = "" + ((((i / 60) / 60) / 24) / 364);
                if (strM.length() < 2) {
                    strM = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(strM), R.string.SecretChatTimerYears);
                }
            }
            String str = strM;
            TextPaint textPaint = this.timePaint;
            textPaint.setTextSize(AndroidUtilities.dp(11.0f));
            float fMeasureText = textPaint.measureText(str);
            this.timeWidth = fMeasureText;
            if (fMeasureText > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(9.0f));
                this.timeWidth = textPaint.measureText(str);
            }
            if (this.timeWidth > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(6.0f));
                this.timeWidth = textPaint.measureText(str);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str, textPaint, (int) Math.ceil(this.timeWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.timeLayout = staticLayout;
                this.timeHeight = staticLayout.getHeight();
            } catch (Exception e) {
                this.timeLayout = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }
}
