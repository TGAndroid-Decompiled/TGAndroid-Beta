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
public final class x0 extends FrameLayout {
    public w0 f24388a;
    public boolean f24389b;
    public RectF f24390c;
    public TextPaint d;

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        float f11;
        TextPaint textPaint = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.M6, false);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        w0 w0Var = this.f24388a;
        w0Var.b(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21717g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21735h7, false));
        RectF rectF = this.f24390c;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        org.telegram.ui.ActionBar.k6.X1.setColor(Color.argb((int) (w0Var.getProgress() * 43.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.X1);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        org.telegram.ui.ActionBar.k6.f21941t0.setColor(Color.argb((int) ((1.0f - w0Var.getProgress()) * 31.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.f21941t0);
        boolean z4 = this.f24389b;
        if (z4) {
            i10 = R.string.ChatListExpanded;
        } else {
            i10 = R.string.ChatListDefault;
        }
        String string = LocaleController.getString(i10);
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        canvas.drawText(string, (getMeasuredWidth() - ((int) Math.ceil(textPaint.measureText(string)))) / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            if (i14 == 0) {
                f10 = 21.0f;
            } else {
                f10 = 53.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            Paint paint = org.telegram.ui.ActionBar.k6.f21941t0;
            if (i14 == 0) {
                i11 = 204;
            } else {
                i11 = 90;
            }
            paint.setColor(Color.argb(i11, red, green, blue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), dp, AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.k6.f21941t0);
            int i16 = 0;
            while (true) {
                if (z4) {
                    i12 = 3;
                } else {
                    i12 = 2;
                }
                if (i16 < i12) {
                    Paint paint2 = org.telegram.ui.ActionBar.k6.f21941t0;
                    if (i16 == 0) {
                        i13 = 204;
                    } else {
                        i13 = 90;
                    }
                    paint2.setColor(Color.argb(i13, red, green, blue));
                    float f12 = 72.0f;
                    if (z4) {
                        float dp2 = AndroidUtilities.dp(41.0f);
                        float dp3 = dp - AndroidUtilities.dp(8.3f - (i16 * 7));
                        int measuredWidth = getMeasuredWidth();
                        if (i16 != 0) {
                            f12 = 48.0f;
                        }
                        rectF.set(dp2, dp3, measuredWidth - AndroidUtilities.dp(f12), dp - AndroidUtilities.dp(5.3f - f11));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), org.telegram.ui.ActionBar.k6.f21941t0);
                    } else {
                        float dp4 = AndroidUtilities.dp(41.0f);
                        int i17 = i16 * 10;
                        float dp5 = dp - AndroidUtilities.dp(7 - i17);
                        int measuredWidth2 = getMeasuredWidth();
                        if (i16 != 0) {
                            f12 = 48.0f;
                        }
                        rectF.set(dp4, dp5, measuredWidth2 - AndroidUtilities.dp(f12), dp - AndroidUtilities.dp(3 - i17));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21941t0);
                    }
                    i16++;
                }
            }
            i14++;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setChecked(this.f24388a.f25008f);
        accessibilityNodeInfo.setCheckable(true);
        if (this.f24389b) {
            i10 = R.string.ChatListExpanded;
        } else {
            i10 = R.string.ChatListDefault;
        }
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(i10));
    }
}
