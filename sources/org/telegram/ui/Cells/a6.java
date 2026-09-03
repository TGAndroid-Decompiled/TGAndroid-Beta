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
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.tb0;
public final class a6 extends FrameLayout {
    public final TextView f22544a;
    public final TextView f22545b;
    public final ImageView f22546c;
    public final Switch d;
    public boolean f22547e;
    public boolean f22548f;
    public final org.telegram.ui.ActionBar.g6 h;

    public a6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        this.h = g6Var;
        ImageView imageView = new ImageView(context);
        this.f22546c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, k7.c6.d(28, 28.0f, i10 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f22544a = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.G6, g6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        if (z4) {
            f10 = 66.0f;
        } else {
            f10 = 64.0f;
        }
        if (z4) {
            f11 = 64.0f;
        } else {
            f11 = 66.0f;
        }
        addView(textView, k7.c6.d(-1, -2.0f, i15, f10, 8.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22545b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22055z6, g6Var, textView2, 1, 13.0f);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i16 = i14 | 48;
        if (z10) {
            f12 = 66.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 66.0f;
        }
        addView(textView2, k7.c6.d(-2, -2.0f, i16, f12, 31.0f, f13, 10.0f));
        Switch r32 = new Switch(context, g6Var);
        this.d = r32;
        int i17 = org.telegram.ui.ActionBar.k6.M6;
        int i18 = org.telegram.ui.ActionBar.k6.N6;
        int i19 = org.telegram.ui.ActionBar.k6.f21661d6;
        r32.d(i17, i18, i19, i19);
        addView(r32, k7.c6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, int i10, int i11, boolean z4) {
        boolean q10;
        this.f22544a.setText(str);
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        tb0 tb0Var = new tb0(1);
        int i12 = -14899731;
        switch (i10) {
            case 1:
            case 2:
                break;
            case 3:
                i12 = -11565578;
                break;
            case 4:
                i12 = -14965523;
                break;
            case 5:
                i12 = -1007845;
                break;
            case 6:
                i12 = -881871;
                break;
            case 7:
                i12 = -11154873;
                break;
            case 8:
                i12 = -765355;
                break;
            case 9:
                i12 = -13451058;
                break;
            case 10:
                i12 = -3903756;
                break;
            case 11:
                i12 = -7956054;
                break;
            default:
                throw null;
        }
        int i13 = -15431455;
        switch (i10) {
            case 1:
            case 4:
                break;
            case 2:
                i13 = -15497247;
                break;
            case 3:
                i13 = -13276952;
                break;
            case 5:
                i13 = -1996271;
                break;
            case 6:
                i13 = -1940716;
                break;
            case 7:
                i13 = -14175180;
                break;
            case 8:
                i13 = -2148011;
                break;
            case 9:
                i13 = -14836538;
                break;
            case 10:
                i13 = -6335009;
                break;
            case 11:
                i13 = -9534569;
                break;
            default:
                throw null;
        }
        tb0Var.b(i12, i13);
        tb0Var.f31328b = q10;
        ImageView imageView = this.f22546c;
        imageView.setBackground(tb0Var);
        imageView.setImageResource(i11);
        boolean z10 = this.f22547e;
        Switch r02 = this.d;
        r02.b(0, z4, z10);
        this.f22545b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f22548f) {
            org.telegram.ui.ActionBar.g6 g6Var = this.h;
            if (g6Var != null) {
                paint = g6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f21781k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f21781k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(19.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(19.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22544a.getText());
        TextView textView = this.f22545b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z4) {
        this.f22547e = z4;
    }

    public void setChecked(boolean z4) {
        this.d.b(0, z4, true);
    }

    public void setDivider(boolean z4) {
        this.f22548f = z4;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f22545b.setText(charSequence);
    }
}
