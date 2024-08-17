package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public class TimerDrawable extends Drawable {
    Context context;
    ColorFilter currentColorFilter;
    private Drawable currentTtlIcon;
    private int iconColor;
    private boolean isDialog;
    private boolean isStaticIcon;
    private boolean overrideColor;
    Theme.ResourcesProvider resourcesProvider;
    private StaticLayout timeLayout;
    private TextPaint timePaint = new TextPaint(1);
    private Paint paint = new Paint(1);
    private Paint linePaint = new Paint(1);
    private float timeWidth = 0.0f;
    private int timeHeight = 0;
    private int time = -1;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    public TimerDrawable(Context context, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        this.timePaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.linePaint.setStyle(Paint.Style.STROKE);
    }

    public void setTime(int i) {
        String str;
        if (this.time != i) {
            this.time = i;
            if (this.isDialog) {
                this.currentTtlIcon = ContextCompat.getDrawable(this.context, R.drawable.msg_autodelete_badge2).mutate();
            } else {
                Drawable mutate = ContextCompat.getDrawable(this.context, i == 0 ? R.drawable.msg_mini_autodelete : R.drawable.msg_mini_autodelete_empty).mutate();
                this.currentTtlIcon = mutate;
                mutate.setColorFilter(this.currentColorFilter);
            }
            invalidateSelf();
            int i2 = this.time;
            if (i2 >= 1 && i2 < 60) {
                str = "" + i;
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerSeconds", R.string.SecretChatTimerSeconds);
                }
            } else if (i2 >= 60 && i2 < 3600) {
                str = "" + (i / 60);
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerMinutes", R.string.SecretChatTimerMinutes);
                }
            } else if (i2 >= 3600 && i2 < 86400) {
                str = "" + ((i / 60) / 60);
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerHours", R.string.SecretChatTimerHours);
                }
            } else if (i2 >= 86400 && i2 < 604800) {
                str = "" + (((i / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerDays", R.string.SecretChatTimerDays);
                }
            } else if (i2 < 2678400) {
                str = "" + ((((i / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerWeeks", R.string.SecretChatTimerWeeks);
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i2 < 31449600) {
                str = "" + ((((i / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerMonths", R.string.SecretChatTimerMonths);
                }
            } else {
                str = "" + ((((i / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = str + LocaleController.getString("SecretChatTimerYears", R.string.SecretChatTimerYears);
                }
            }
            String str2 = str;
            this.timePaint.setTextSize(AndroidUtilities.dp(11.0f));
            float measureText = this.timePaint.measureText(str2);
            this.timeWidth = measureText;
            if (measureText > AndroidUtilities.dp(13.0f)) {
                this.timePaint.setTextSize(AndroidUtilities.dp(9.0f));
                this.timeWidth = this.timePaint.measureText(str2);
            }
            if (this.timeWidth > AndroidUtilities.dp(13.0f)) {
                this.timePaint.setTextSize(AndroidUtilities.dp(6.0f));
                this.timeWidth = this.timePaint.measureText(str2);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str2, this.timePaint, (int) Math.ceil(this.timeWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.timeLayout = staticLayout;
                this.timeHeight = staticLayout.getHeight();
            } catch (Exception e) {
                this.timeLayout = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    public static TimerDrawable getTtlIcon(int i) {
        TimerDrawable timerDrawable = new TimerDrawable(ApplicationLoader.applicationContext, null);
        timerDrawable.setTime(i);
        timerDrawable.isStaticIcon = true;
        return timerDrawable;
    }

    public static TimerDrawable getTtlIconForDialogs(int i) {
        TimerDrawable timerDrawable = new TimerDrawable(ApplicationLoader.applicationContext, null);
        timerDrawable.isDialog = true;
        timerDrawable.setTime(i);
        return timerDrawable;
    }

    @Override
    public void draw(Canvas canvas) {
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        if (this.isDialog) {
            this.timePaint.setColor(-1);
        } else if (!this.isStaticIcon) {
            if (!this.overrideColor) {
                this.paint.setColor(Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider));
            }
            this.timePaint.setColor(Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider));
        } else {
            this.timePaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
        }
        if (this.currentTtlIcon != null) {
            if (!this.isStaticIcon && !this.isDialog) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, this.paint);
                int color = Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider);
                if (this.iconColor != color) {
                    this.iconColor = color;
                    this.currentTtlIcon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.isDialog) {
                this.currentTtlIcon.setBounds(getBounds().left, getBounds().top, getBounds().left + this.currentTtlIcon.getIntrinsicWidth(), getBounds().top + this.currentTtlIcon.getIntrinsicHeight());
                this.currentTtlIcon.draw(canvas);
            } else {
                android.graphics.Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), (getBounds().centerX() - AndroidUtilities.dp(10.5f)) + this.currentTtlIcon.getIntrinsicWidth(), (getBounds().centerY() - AndroidUtilities.dp(10.5f)) + this.currentTtlIcon.getIntrinsicHeight());
                this.currentTtlIcon.setBounds(rect);
                this.currentTtlIcon.draw(canvas);
            }
        }
        if (this.time == 0 || this.timeLayout == null) {
            return;
        }
        int i = AndroidUtilities.density != 3.0f ? 0 : -1;
        if (this.isDialog) {
            double width = getBounds().width() / 2;
            double ceil = Math.ceil(this.timeWidth / 2.0f);
            Double.isNaN(width);
            double d = i;
            Double.isNaN(d);
            canvas.translate((float) ((width - ceil) + d), (getBounds().height() - this.timeHeight) / 2.0f);
            this.timeLayout.draw(canvas);
            return;
        }
        double ceil2 = Math.ceil(this.timeWidth / 2.0f);
        Double.isNaN(intrinsicWidth / 2);
        canvas.translate(((int) (r5 - ceil2)) + i, (intrinsicHeight - this.timeHeight) / 2.0f);
        this.timeLayout.draw(canvas);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        if (this.isStaticIcon) {
            this.currentTtlIcon.setColorFilter(colorFilter);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(23.0f);
    }

    public void setBackgroundColor(int i) {
        this.overrideColor = true;
        this.paint.setColor(i);
    }

    public int getTime() {
        return this.time;
    }
}
