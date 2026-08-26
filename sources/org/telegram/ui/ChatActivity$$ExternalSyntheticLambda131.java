package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public final class ChatActivity$$ExternalSyntheticLambda131 implements AlertDialog.OnButtonClickListener, SlideChooseView.Callback, Utilities.Callback2Return, ViewPositionWatcher.OnChangedListener, RecyclerListView.OnInterceptTouchListener, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter, LanguageDetector.ExceptionCallback, NumberPicker.Formatter, NumberPicker.OnValueChangeListener {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda131(int i) {
        this.$r8$classId = i;
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 18:
                return String.format("%02d", Integer.valueOf(i));
            case 19:
            case 24:
            default:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 20:
                return String.format("%02d", Integer.valueOf(i));
            case 21:
                if (i == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i2 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                int i3 = calendar.get(1);
                if (i3 != i2 || i >= 7) {
                    return i3 == i2 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 22:
                return String.format("%02d", Integer.valueOf(i));
            case 23:
                return String.format("%02d", Integer.valueOf(i));
            case 25:
                return String.format("%02d", Integer.valueOf(i));
            case 26:
                return String.format("%02d", Integer.valueOf(i));
            case 27:
                return LocaleController.formatPluralString("Times", i + 1, new Object[0]);
            case 28:
                return LocaleController.formatPluralString("Minutes", i + 1, new Object[0]);
        }
    }

    @Override
    public float get(Object obj) {
        CodeNumberField codeNumberField = (CodeNumberField) obj;
        switch (this.$r8$classId) {
            case 8:
                return codeNumberField.focusedProgress;
            case 9:
            case 11:
            default:
                return codeNumberField.successScaleProgress;
            case 10:
                return codeNumberField.errorProgress;
            case 12:
                return codeNumberField.successProgress;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                alertDialog.dismiss();
                break;
            case 4:
                alertDialog.dismiss();
                break;
            case 6:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onOptionSelected(int i) {
        if (i == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public void onPositionChanged(View view, RectF rectF) {
        view.invalidate();
    }

    @Override
    public void onTouchEnd() {
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        Pattern pattern = AlertsCreator.URL_PATTERN;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.$r8$classId) {
            case 3:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void set(Object obj, float f) {
        CodeNumberField codeNumberField = (CodeNumberField) obj;
        switch (this.$r8$classId) {
            case 9:
                codeNumberField.focusedProgress = f;
                if (codeNumberField.getParent() != null) {
                    ((View) codeNumberField.getParent()).invalidate();
                }
                break;
            case 10:
            case 12:
            default:
                codeNumberField.successScaleProgress = f;
                if (codeNumberField.getParent() != null) {
                    ((View) codeNumberField.getParent()).invalidate();
                }
                break;
            case 11:
                codeNumberField.errorProgress = f;
                if (codeNumberField.getParent() != null) {
                    ((View) codeNumberField.getParent()).invalidate();
                }
                break;
            case 13:
                codeNumberField.successProgress = f;
                if (codeNumberField.getParent() != null) {
                    ((View) codeNumberField.getParent()).invalidate();
                }
                break;
        }
    }

    @Override
    public void run(Exception exc) {
        switch (this.$r8$classId) {
            case 16:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
