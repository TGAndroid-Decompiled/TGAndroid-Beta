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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.xa0;
public final class a6 extends FrameLayout {
    public final TextView f24051a;
    public final TextView f24052b;
    public final ImageView f24053c;
    public final Switch d;
    public boolean f24054e;
    public boolean f24055f;
    public final org.telegram.ui.ActionBar.b6 h;

    public a6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        this.h = b6Var;
        ImageView imageView = new ImageView(context);
        this.f24053c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(imageView, g7.e6.d(28, 28.0f, i9 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f24051a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f10 = 66.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 66.0f;
        }
        addView(textView, g7.e6.d(-1, -2.0f, i14, f10, 8.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24052b = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.f23386z6, b6Var, textView2, 1, 13.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z11) {
            f12 = 66.0f;
        } else {
            f12 = 64.0f;
        }
        if (z11) {
            f13 = 64.0f;
        } else {
            f13 = 66.0f;
        }
        addView(textView2, g7.e6.d(-2, -2.0f, i15, f12, 31.0f, f13, 10.0f));
        Switch r32 = new Switch(context, b6Var);
        this.d = r32;
        int i16 = org.telegram.ui.ActionBar.f6.M6;
        int i17 = org.telegram.ui.ActionBar.f6.N6;
        int i18 = org.telegram.ui.ActionBar.f6.f23001d6;
        r32.d(i16, i17, i18, i18);
        addView(r32, g7.e6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, int i9, int i10, boolean z10) {
        boolean q10;
        this.f24051a.setText(str);
        org.telegram.ui.ActionBar.b6 b6Var = this.h;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        xa0 xa0Var = new xa0(1);
        int i11 = -14899731;
        switch (i9) {
            case 1:
            case 2:
                break;
            case 3:
                i11 = -11565578;
                break;
            case 4:
                i11 = -14965523;
                break;
            case 5:
                i11 = -1007845;
                break;
            case 6:
                i11 = -881871;
                break;
            case 7:
                i11 = -11154873;
                break;
            case 8:
                i11 = -765355;
                break;
            case 9:
                i11 = -13451058;
                break;
            case 10:
                i11 = -3903756;
                break;
            case 11:
                i11 = -7956054;
                break;
            default:
                throw null;
        }
        int i12 = -15431455;
        switch (i9) {
            case 1:
            case 4:
                break;
            case 2:
                i12 = -15497247;
                break;
            case 3:
                i12 = -13276952;
                break;
            case 5:
                i12 = -1996271;
                break;
            case 6:
                i12 = -1940716;
                break;
            case 7:
                i12 = -14175180;
                break;
            case 8:
                i12 = -2148011;
                break;
            case 9:
                i12 = -14836538;
                break;
            case 10:
                i12 = -6335009;
                break;
            case 11:
                i12 = -9534569;
                break;
            default:
                throw null;
        }
        xa0Var.b(i11, i12);
        xa0Var.f34630b = q10;
        ImageView imageView = this.f24053c;
        imageView.setBackground(xa0Var);
        imageView.setImageResource(i10);
        boolean z11 = this.f24054e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f24052b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i9;
        super.dispatchDraw(canvas);
        if (this.f24055f) {
            org.telegram.ui.ActionBar.b6 b6Var = this.h;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
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
                    i9 = AndroidUtilities.dp(19.0f);
                } else {
                    i9 = 0;
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint2);
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
        sb2.append(this.f24051a.getText());
        TextView textView = this.f24052b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f24054e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f24055f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f24052b.setText(charSequence);
    }
}
