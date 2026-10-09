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
    public x0 f23753a;
    public boolean f23754b;
    public RectF f23755c;
    public TextPaint d;

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        float f10;
        TextPaint textPaint = this.d;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.M6, false);
        int red = Color.red(x02);
        int green = Color.green(x02);
        int blue = Color.blue(x02);
        x0 x0Var = this.f23753a;
        x0Var.b(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20854g7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20870h7, false));
        RectF rectF = this.f23755c;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        org.telegram.ui.ActionBar.i6.X1.setColor(Color.argb((int) (x0Var.getProgress() * 43.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.X1);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        org.telegram.ui.ActionBar.i6.f21086t0.setColor(Color.argb((int) ((1.0f - x0Var.getProgress()) * 31.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.f21086t0);
        boolean z10 = this.f23754b;
        if (z10) {
            i10 = R.string.ChatListExpanded;
        } else {
            i10 = R.string.ChatListDefault;
        }
        String string = LocaleController.getString(i10);
        textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        int i14 = 2;
        canvas.drawText(string, (getMeasuredWidth() - ((int) Math.ceil(textPaint.measureText(string)))) / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i15 = 0;
        while (i15 < i14) {
            if (i15 == 0) {
                f7 = 21.0f;
            } else {
                f7 = 53.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            Paint paint = org.telegram.ui.ActionBar.i6.f21086t0;
            if (i15 == 0) {
                i11 = 204;
            } else {
                i11 = 90;
            }
            paint.setColor(Color.argb(i11, red, green, blue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), dp, AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.i6.f21086t0);
            int i16 = 0;
            while (true) {
                if (z10) {
                    i12 = 3;
                } else {
                    i12 = i14;
                }
                if (i16 < i12) {
                    Paint paint2 = org.telegram.ui.ActionBar.i6.f21086t0;
                    if (i16 == 0) {
                        i13 = 204;
                    } else {
                        i13 = 90;
                    }
                    paint2.setColor(Color.argb(i13, red, green, blue));
                    float f11 = 72.0f;
                    if (z10) {
                        float dp2 = AndroidUtilities.dp(41.0f);
                        float dp3 = dp - AndroidUtilities.dp(8.3f - (i16 * 7));
                        int measuredWidth = getMeasuredWidth();
                        if (i16 != 0) {
                            f11 = 48.0f;
                        }
                        rectF.set(dp2, dp3, measuredWidth - AndroidUtilities.dp(f11), dp - AndroidUtilities.dp(5.3f - f10));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), org.telegram.ui.ActionBar.i6.f21086t0);
                    } else {
                        float dp4 = AndroidUtilities.dp(41.0f);
                        int i17 = i16 * 10;
                        float dp5 = dp - AndroidUtilities.dp(7 - i17);
                        int measuredWidth2 = getMeasuredWidth();
                        if (i16 != 0) {
                            f11 = 48.0f;
                        }
                        rectF.set(dp4, dp5, measuredWidth2 - AndroidUtilities.dp(f11), dp - AndroidUtilities.dp(3 - i17));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21086t0);
                    }
                    i16++;
                    i14 = 2;
                }
            }
            i15++;
            i14 = 2;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setChecked(this.f23753a.f24300f);
        accessibilityNodeInfo.setCheckable(true);
        if (this.f23754b) {
            i10 = R.string.ChatListExpanded;
        } else {
            i10 = R.string.ChatListDefault;
        }
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(i10));
    }
}
