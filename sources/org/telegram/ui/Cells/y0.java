package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;
public final class y0 extends FrameLayout {
    public x0 f25976a;
    public boolean f25977b;
    public RectF f25978c;
    public TextPaint d;

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        TextPaint textPaint = this.d;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.M6, false);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        x0 x0Var = this.f25976a;
        x0Var.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23074h7, false));
        RectF rectF = this.f25978c;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        org.telegram.ui.ActionBar.f6.X1.setColor(Color.argb((int) (x0Var.getProgress() * 43.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.X1);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        org.telegram.ui.ActionBar.f6.f23279t0.setColor(Color.argb((int) ((1.0f - x0Var.getProgress()) * 31.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.f23279t0);
        boolean z10 = this.f25977b;
        if (z10) {
            i9 = R.string.ChatListExpanded;
        } else {
            i9 = R.string.ChatListDefault;
        }
        String string = LocaleController.getString(i9);
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        canvas.drawText(string, (getMeasuredWidth() - ((int) Math.ceil(textPaint.measureText(string)))) / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i13 = 0;
        for (int i14 = 2; i13 < i14; i14 = 2) {
            if (i13 == 0) {
                f10 = 21.0f;
            } else {
                f10 = 53.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            Paint paint = org.telegram.ui.ActionBar.f6.f23279t0;
            if (i13 == 0) {
                i10 = 204;
            } else {
                i10 = 90;
            }
            paint.setColor(Color.argb(i10, red, green, blue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), dp, AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.f6.f23279t0);
            int i15 = 0;
            while (true) {
                if (z10) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                if (i15 < i11) {
                    Paint paint2 = org.telegram.ui.ActionBar.f6.f23279t0;
                    if (i15 == 0) {
                        i12 = 204;
                    } else {
                        i12 = 90;
                    }
                    paint2.setColor(Color.argb(i12, red, green, blue));
                    float f12 = 72.0f;
                    if (z10) {
                        float dp2 = AndroidUtilities.dp(41.0f);
                        float dp3 = dp - AndroidUtilities.dp(8.3f - (i15 * 7));
                        int measuredWidth = getMeasuredWidth();
                        if (i15 != 0) {
                            f12 = 48.0f;
                        }
                        rectF.set(dp2, dp3, measuredWidth - AndroidUtilities.dp(f12), dp - AndroidUtilities.dp(5.3f - f11));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), org.telegram.ui.ActionBar.f6.f23279t0);
                    } else {
                        float dp4 = AndroidUtilities.dp(41.0f);
                        int i16 = i15 * 10;
                        float dp5 = dp - AndroidUtilities.dp(7 - i16);
                        int measuredWidth2 = getMeasuredWidth();
                        if (i15 != 0) {
                            f12 = 48.0f;
                        }
                        rectF.set(dp4, dp5, measuredWidth2 - AndroidUtilities.dp(f12), dp - AndroidUtilities.dp(3 - i16));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
                    }
                    i15++;
                }
            }
            i13++;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setChecked(this.f25976a.f26508f);
        accessibilityNodeInfo.setCheckable(true);
        if (this.f25977b) {
            i9 = R.string.ChatListExpanded;
        } else {
            i9 = R.string.ChatListDefault;
        }
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(i9));
    }
}
