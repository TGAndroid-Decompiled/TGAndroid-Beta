package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public final class ChatListCell$ListView extends FrameLayout {
    public final AnonymousClass1 button;
    public final boolean isThreeLines;
    public final RectF rect;
    public final TextPaint textPaint;

    public final class AnonymousClass1 extends RadioButton {
        public AnonymousClass1(Context context) {
            super(context);
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ChatListCell$ListView.this.invalidate();
        }
    }

    public ChatListCell$ListView(Context context, boolean z) {
        super(context);
        this.rect = new RectF();
        boolean z2 = true;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        setWillNotDraw(false);
        this.isThreeLines = z;
        setContentDescription(LocaleController.getString(z ? R.string.ChatListExpanded : R.string.ChatListDefault));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.button = anonymousClass1;
        anonymousClass1.setSize(AndroidUtilities.dp(20.0f));
        addView(anonymousClass1, LayoutHelper.createFrame(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
        if ((!z || !SharedConfig.useThreeLinesLayout) && (z || SharedConfig.useThreeLinesLayout)) {
            z2 = false;
        }
        anonymousClass1.setChecked(z2, false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int color = Theme.getColor(null, Theme.key_switchTrack, false);
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        int color2 = Theme.getColor(null, Theme.key_radioBackground, false);
        int color3 = Theme.getColor(null, Theme.key_radioBackgroundChecked, false);
        AnonymousClass1 anonymousClass1 = this.button;
        anonymousClass1.color = color2;
        anonymousClass1.checkedColor = color3;
        anonymousClass1.invalidate();
        RectF rectF = this.rect;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        Theme.chat_instantViewRectPaint.setColor(Color.argb((int) (anonymousClass1.getProgress() * 43.0f), iRed, iGreen, iBlue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_instantViewRectPaint);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) ((1.0f - anonymousClass1.getProgress()) * 31.0f), iRed, iGreen, iBlue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.dialogs_onlineCirclePaint);
        boolean z = this.isThreeLines;
        String string = LocaleController.getString(z ? R.string.ChatListExpanded : R.string.ChatListDefault);
        TextPaint textPaint = this.textPaint;
        int iCeil = (int) Math.ceil(textPaint.measureText(string));
        textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        int measuredWidth = getMeasuredWidth() - iCeil;
        canvas.drawText(string, measuredWidth / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            int iDp = AndroidUtilities.dp(i == 0 ? 21.0f : 53.0f);
            Theme.dialogs_onlineCirclePaint.setColor(Color.argb(i == 0 ? 204 : 90, iRed, iGreen, iBlue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), iDp, AndroidUtilities.dp(11.0f), Theme.dialogs_onlineCirclePaint);
            int i3 = 0;
            while (true) {
                if (i3 < (z ? 3 : 2)) {
                    Theme.dialogs_onlineCirclePaint.setColor(Color.argb(i3 == 0 ? 204 : 90, iRed, iGreen, iBlue));
                    if (z) {
                        float f = i3 * 7;
                        rectF.set(AndroidUtilities.dp(41.0f), iDp - AndroidUtilities.dp(8.3f - f), getMeasuredWidth() - AndroidUtilities.dp(i3 != 0 ? 48.0f : 72.0f), iDp - AndroidUtilities.dp(5.3f - f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), Theme.dialogs_onlineCirclePaint);
                    } else {
                        int i4 = i3 * 10;
                        rectF.set(AndroidUtilities.dp(41.0f), iDp - AndroidUtilities.dp(7 - i4), getMeasuredWidth() - AndroidUtilities.dp(i3 != 0 ? 48.0f : 72.0f), iDp - AndroidUtilities.dp(3 - i4));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setChecked(this.button.isChecked);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(this.isThreeLines ? R.string.ChatListExpanded : R.string.ChatListDefault));
    }
}
