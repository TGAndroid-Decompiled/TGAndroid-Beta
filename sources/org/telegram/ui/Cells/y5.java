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
import org.telegram.ui.Components.mb0;
public final class y5 extends FrameLayout {
    public final TextView f25995a;
    public final TextView f25996b;
    public final ImageView f25997c;
    public final Switch d;
    public boolean f25998e;
    public boolean f25999f;
    public final org.telegram.ui.ActionBar.c6 h;

    public y5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f9;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        this.h = c6Var;
        ImageView imageView = new ImageView(context);
        this.f25997c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, i7.f6.d(28, 28.0f, i10 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f25995a = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
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
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        if (z10) {
            f9 = 66.0f;
        } else {
            f9 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 66.0f;
        }
        addView(textView, i7.f6.d(-1, -2.0f, i15, f9, 8.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25996b = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23450z6, c6Var, textView2, 1, 13.0f);
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
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i16 = i14 | 48;
        if (z11) {
            f11 = 66.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 66.0f;
        }
        addView(textView2, i7.f6.d(-2, -2.0f, i16, f11, 31.0f, f12, 10.0f));
        Switch r32 = new Switch(context, c6Var);
        this.d = r32;
        int i17 = org.telegram.ui.ActionBar.g6.M6;
        int i18 = org.telegram.ui.ActionBar.g6.N6;
        int i19 = org.telegram.ui.ActionBar.g6.f23062d6;
        r32.d(i17, i18, i19, i19);
        addView(r32, i7.f6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, int i10, int i11, boolean z10) {
        boolean q6;
        this.f25995a.setText(str);
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        mb0 mb0Var = new mb0(1);
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
        mb0Var.b(i12, i13);
        mb0Var.f30641b = q6;
        ImageView imageView = this.f25997c;
        imageView.setBackground(mb0Var);
        imageView.setImageResource(i11);
        boolean z11 = this.f25998e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f25996b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f25999f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.h;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25995a.getText());
        TextView textView = this.f25996b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f25998e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f25999f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f25996b.setText(charSequence);
    }
}
