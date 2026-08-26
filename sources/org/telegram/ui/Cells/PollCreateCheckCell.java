package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.SettingsActivity;

public final class PollCreateCheckCell extends FrameLayout {
    public boolean animationsEnabled;
    public final Switch checkBox;
    public boolean divider;
    public final ImageView imageView;
    public final TextView multilineValueTextView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView;

    public PollCreateCheckCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrame(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        OKLCH.m(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider, textView, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 48, z ? 66.0f : 64.0f, 8.0f, z ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.multilineValueTextView = textView2;
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView2, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 66.0f : 64.0f, 31.0f, z2 ? 64.0f : 66.0f, 10.0f));
        Switch r3 = new Switch(context, resourcesProvider);
        this.checkBox = r3;
        int i = Theme.key_switchTrack;
        int i2 = Theme.key_switchTrackChecked;
        int i3 = Theme.key_windowBackgroundWhite;
        r3.trackColorKey = i;
        r3.trackCheckedColorKey = i2;
        r3.thumbColorKey = i3;
        r3.thumbCheckedColorKey = i3;
        addView(r3, LayoutHelper.createFrame(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r3.setFocusable(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.divider) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(19.0f) : 0), getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.textView.getText());
        TextView textView = this.multilineValueTextView;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked);
    }

    public void setAnimationsEnabled(boolean z) {
        this.animationsEnabled = z;
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(0, z, true);
    }

    public void setDivider(boolean z) {
        this.divider = z;
        invalidate();
    }

    public final void setTextAndValueAndIconAndCheck(String str, String str2, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.textView.setText(str);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background();
        switch (i) {
            case 1:
            case 2:
                i3 = -14899731;
                break;
            case 3:
                i3 = -11565578;
                break;
            case 4:
                i3 = -14965523;
                break;
            case 5:
                i3 = -1007845;
                break;
            case 6:
                i3 = -881871;
                break;
            case 7:
                i3 = -11154873;
                break;
            case 8:
                i3 = -765355;
                break;
            case 9:
                i3 = -13451058;
                break;
            case 10:
                i3 = -3903756;
                break;
            case 11:
                i3 = -7956054;
                break;
            default:
                throw null;
        }
        switch (i) {
            case 1:
            case 4:
                i4 = -15431455;
                break;
            case 2:
                i4 = -15497247;
                break;
            case 3:
                i4 = -13276952;
                break;
            case 5:
                i4 = -1996271;
                break;
            case 6:
                i4 = -1940716;
                break;
            case 7:
                i4 = -14175180;
                break;
            case 8:
                i4 = -2148011;
                break;
            case 9:
                i4 = -14836538;
                break;
            case 10:
                i4 = -6335009;
                break;
            case 11:
                i4 = -9534569;
                break;
            default:
                throw null;
        }
        background.setColor(i3, i4);
        background.border = zIsDark;
        ImageView imageView = this.imageView;
        imageView.setBackground(background);
        imageView.setImageResource(i2);
        Switch r7 = this.checkBox;
        r7.setChecked(0, z, this.animationsEnabled);
        this.multilineValueTextView.setText(str2);
        r7.setContentDescription(str);
    }

    public void setValue(CharSequence charSequence) {
        this.multilineValueTextView.setText(charSequence);
    }
}
