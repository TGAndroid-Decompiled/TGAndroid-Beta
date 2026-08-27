package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

public final class x0 extends FrameLayout {

    public w0 f25919a;

    public boolean f25920b;

    public RectF f25921c;
    public TextPaint d;

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.d;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false);
        int iRed = Color.red(iW0);
        int iGreen = Color.green(iW0);
        int iBlue = Color.blue(iW0);
        w0 w0Var = this.f25919a;
        w0Var.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126h7, false));
        RectF rectF = this.f25921c;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        org.telegram.ui.ActionBar.g6.X1.setColor(Color.argb((int) (w0Var.getProgress() * 43.0f), iRed, iGreen, iBlue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.X1);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        org.telegram.ui.ActionBar.g6.f23333t0.setColor(Color.argb((int) ((1.0f - w0Var.getProgress()) * 31.0f), iRed, iGreen, iBlue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.f23333t0);
        boolean z10 = this.f25920b;
        String string = LocaleController.getString(z10 ? R.string.ChatListExpanded : R.string.ChatListDefault);
        int iCeil = (int) Math.ceil(textPaint.measureText(string));
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int measuredWidth = getMeasuredWidth() - iCeil;
        canvas.drawText(string, measuredWidth / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            int iDp = AndroidUtilities.dp(i10 == 0 ? 21.0f : 53.0f);
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(Color.argb(i10 == 0 ? 204 : 90, iRed, iGreen, iBlue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), iDp, AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.g6.f23333t0);
            int i12 = 0;
            while (true) {
                if (i12 < (z10 ? 3 : 2)) {
                    org.telegram.ui.ActionBar.g6.f23333t0.setColor(Color.argb(i12 == 0 ? 204 : 90, iRed, iGreen, iBlue));
                    if (z10) {
                        float f10 = i12 * 7;
                        rectF.set(AndroidUtilities.dp(41.0f), iDp - AndroidUtilities.dp(8.3f - f10), getMeasuredWidth() - AndroidUtilities.dp(i12 != 0 ? 48.0f : 72.0f), iDp - AndroidUtilities.dp(5.3f - f10));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), org.telegram.ui.ActionBar.g6.f23333t0);
                    } else {
                        int i13 = i12 * 10;
                        rectF.set(AndroidUtilities.dp(41.0f), iDp - AndroidUtilities.dp(7 - i13), getMeasuredWidth() - AndroidUtilities.dp(i12 != 0 ? 48.0f : 72.0f), iDp - AndroidUtilities.dp(3 - i13));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
                    }
                    i12++;
                }
            }
            i10++;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setChecked(this.f25919a.f26504f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(this.f25920b ? R.string.ChatListExpanded : R.string.ChatListDefault));
    }
}
