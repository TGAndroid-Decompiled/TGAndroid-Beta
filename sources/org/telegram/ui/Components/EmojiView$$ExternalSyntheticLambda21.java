package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata$Provider;

public final class EmojiView$$ExternalSyntheticLambda21 implements NumberPicker.Formatter, AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate, ImageReceiver.ImageReceiverDelegate, GenericProvider, BitmapMemoizedMetadata$Provider, SimpleFloatPropertyCompat.Getter {
    public final int $r8$classId;

    public EmojiView$$ExternalSyntheticLambda21(int i) {
        this.$r8$classId = i;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 23:
                MediaController.getInstance().stopRecording(1, z, i, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z, i, false, 0L);
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            rLottieDrawable.setCustomEndFrame(0);
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
            rLottieDrawable.setProgress(0.0f, false);
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 1:
                if (i == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i2 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                return calendar.get(1) == i2 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
            case 2:
                return String.format("%02d", Integer.valueOf(i));
            case 3:
                return String.format("%02d", Integer.valueOf(i));
            case 4:
            case 9:
            case 16:
            default:
                return DiffUtil.m(i, "");
            case 5:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 6:
                if (i == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i3 = calendar3.get(1);
                calendar3.add(6, i);
                long timeInMillis2 = calendar3.getTimeInMillis();
                if (calendar3.get(1) != i3) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
            case 7:
                return String.format("%02d", Integer.valueOf(i));
            case 8:
                return String.format("%02d", Integer.valueOf(i));
            case 10:
                boolean z = LocaleController.is24HourFormat;
                String str = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
                return i >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, str) : str;
            case 11:
                return String.format("%02d", Integer.valueOf(i));
            case 12:
                if (i == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i4 = calendar4.get(1);
                calendar4.add(6, i);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) != i4) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
            case 13:
                return String.format("%02d", Integer.valueOf(i));
            case 14:
                return String.format("%02d", Integer.valueOf(i));
            case 15:
                if (i == 0) {
                    return LocaleController.getString(R.string.ShortMessageLifetimeForever);
                }
                if (i >= 1 && i < 16) {
                    return LocaleController.formatTTLString(i);
                }
                if (i == 16) {
                    return LocaleController.formatTTLString(30);
                }
                if (i == 17) {
                    return LocaleController.formatTTLString(60);
                }
                if (i == 18) {
                    return LocaleController.formatTTLString(3600);
                }
                if (i == 19) {
                    return LocaleController.formatTTLString(86400);
                }
                return i == 20 ? LocaleController.formatTTLString(604800) : "";
            case 17:
                return DiffUtil.m(i, "");
            case 18:
                switch (i) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 19:
                return DiffUtil.m(i, "");
            case 20:
                switch (i) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 21:
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public float get(Object obj) {
        return ((OutlineTextContainerView) obj).selectionProgress;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                alertDialog.dismiss();
                break;
            case 9:
                alertDialog.dismiss();
                break;
            case 16:
                Pattern pattern = AlertsCreator.URL_PATTERN;
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int i = EmojiView.$r8$clinit;
                return 0;
            default:
                return CheckBoxBase.paint;
        }
    }

    @Override
    public Object get(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }
}
