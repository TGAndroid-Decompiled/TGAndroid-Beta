package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
public final class w3 extends FrameLayout {
    public final int f25623a;
    public final org.telegram.ui.ActionBar.u6 f25624b;
    public final org.telegram.ui.Components.y9 f25625c;
    public final org.telegram.ui.Components.y9[] d;
    public final TextView[] e;
    public final TextView f25626f;
    public final TextView h;
    public final TextView f25627n;
    public final LinearLayout f25628r;
    public boolean f25629s;
    public int v;
    public boolean f25630w;

    public w3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = new org.telegram.ui.Components.y9[3];
        this.e = new TextView[2];
        this.f25623a = i10;
        this.f25624b = u6Var;
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25628r = linearLayout;
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutDirection(LocaleController.isRTL ? 1 : 0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f25625c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout.addView(y9Var, gb1.r(16, 16));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        TextView c10 = c(context, 13, i11);
        this.f25626f = c10;
        NotificationCenter.listenEmojiLoading(c10);
        c10.setTypeface(AndroidUtilities.bold());
        c10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c10.setEllipsize(truncateAt);
        linearLayout.addView(c10, gb1.o(6.0f, 0.0f, 6.0f, 0.0f, -2, 16));
        TextView c11 = c(context, 13, org.telegram.ui.ActionBar.y6.f23748y6);
        this.h = c11;
        c11.setSingleLine(true);
        linearLayout.addView(c11, gb1.r(-2, 16));
        addView(linearLayout);
        TextView c12 = c(context, 14, i11);
        this.f25627n = c12;
        NotificationCenter.listenEmojiLoading(c12);
        c12.setMaxLines(3);
        c12.setEllipsize(truncateAt);
        c12.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        c12.setLineSpacing(AndroidUtilities.dp(18.0f) - c12.getPaint().getFontSpacing(), 1.0f);
        addView(c12);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.y9[] y9VarArr = this.d;
            if (i12 >= y9VarArr.length) {
                break;
            }
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            y9VarArr[i12] = y9Var2;
            y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
            y9Var2.getImageReceiver().setCrossfadeAlpha((byte) 1);
            addView(y9Var2);
            i12++;
        }
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i13 < textViewArr.length) {
                TextView c13 = c(context, 12, org.telegram.ui.ActionBar.y6.G6);
                textViewArr[i13] = c13;
                c13.setTextColor(-1);
                c13.setGravity(17);
                c13.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                c13.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(4.0f), Integer.MIN_VALUE));
                addView(c13);
                i13++;
            } else {
                return;
            }
        }
    }

    public final int a() {
        float f7;
        if (this.v == 2) {
            f7 = 100.0f;
        } else {
            f7 = 72.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void b(org.telegram.messenger.MessageObject r31, java.util.ArrayList r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w3.b(org.telegram.messenger.MessageObject, java.util.ArrayList):void");
    }

    public final TextView c(Context context, int i10, int i11) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10);
        org.telegram.ui.ActionBar.f7.V(textView, i11, this.f25624b);
        textView.setIncludeFontPadding(false);
        textView.setElegantTextHeight(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            textView.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            textView.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        textView.setGravity(16);
        return textView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f25630w) {
            canvas.drawLine(AndroidUtilities.dp(14.0f), getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int width;
        if (LocaleController.isRTL && this.f25629s) {
            dp = a() + AndroidUtilities.dp(26.0f);
        } else {
            dp = AndroidUtilities.dp(14.0f);
        }
        int dp2 = AndroidUtilities.dp(10.0f);
        LinearLayout linearLayout = this.f25628r;
        linearLayout.layout(dp, dp2, linearLayout.getMeasuredWidth() + dp, AndroidUtilities.dp(26.0f));
        int dp3 = AndroidUtilities.dp(31.0f);
        TextView textView = this.f25627n;
        textView.layout(dp, dp3, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + AndroidUtilities.dp(31.0f));
        if (LocaleController.isRTL) {
            width = AndroidUtilities.dp(11.0f);
        } else {
            width = (getWidth() - AndroidUtilities.dp(11.0f)) - a();
        }
        int dp4 = AndroidUtilities.dp(10.0f);
        int dp5 = AndroidUtilities.dp(72.0f);
        int i14 = this.v;
        int i15 = 0;
        org.telegram.ui.Components.y9[] y9VarArr = this.d;
        if (i14 >= 3) {
            int measuredWidth = y9VarArr[0].getMeasuredWidth();
            int i16 = (width + dp5) - measuredWidth;
            int i17 = dp5 + dp4;
            y9VarArr[0].layout(width, dp4, width + measuredWidth, i17);
            int i18 = i16 + measuredWidth;
            y9VarArr[1].layout(i16, dp4, i18, dp4 + measuredWidth);
            y9VarArr[2].layout(i16, i17 - measuredWidth, i18, i17);
        } else {
            for (int i19 = 0; i19 < y9VarArr.length; i19++) {
                int b10 = vh.b(52.0f, i19, width);
                org.telegram.ui.Components.y9 y9Var = y9VarArr[i19];
                y9Var.layout(b10, dp4, y9Var.getMeasuredWidth() + b10, dp4 + dp5);
            }
        }
        while (true) {
            TextView[] textViewArr = this.e;
            if (i15 < textViewArr.length) {
                TextView textView2 = textViewArr[i15];
                int measuredWidth2 = (y9VarArr[i15].getMeasuredWidth() + vh.b(52.0f, i15, width)) - AndroidUtilities.dp(4.0f);
                textView2.layout(measuredWidth2 - textView2.getMeasuredWidth(), AndroidUtilities.dp(62.0f), measuredWidth2, AndroidUtilities.dp(78.0f));
                i15++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int max;
        TextView[] textViewArr;
        int dp2;
        int dp3;
        int dp4;
        int size = View.MeasureSpec.getSize(i10);
        if (this.f25629s) {
            dp = a() + AndroidUtilities.dp(40.0f);
        } else {
            dp = AndroidUtilities.dp(25.0f);
        }
        int i12 = size - dp;
        TextView textView = this.h;
        int dp5 = (i12 - AndroidUtilities.dp(28.0f)) - ((int) textView.getPaint().measureText(textView.getText().toString()));
        int i13 = 0;
        this.f25626f.setMaxWidth(Math.max(0, dp5));
        this.f25628r.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), Integer.MIN_VALUE);
        TextView textView2 = this.f25627n;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(1, Math.min(3, textView2.getLineCount())) * 18), 1073741824));
        int B = vh.B(2.0f, AndroidUtilities.dp(72.0f), 2);
        int i14 = 0;
        while (true) {
            org.telegram.ui.Components.y9[] y9VarArr = this.d;
            if (i14 >= y9VarArr.length) {
                break;
            }
            int i15 = this.v;
            if (i15 >= 3) {
                dp3 = B;
            } else if (i15 == 2) {
                dp3 = AndroidUtilities.dp(48.0f);
            } else {
                dp3 = AndroidUtilities.dp(72.0f);
            }
            if (this.v >= 3 && i14 > 0) {
                dp4 = B;
            } else {
                dp4 = AndroidUtilities.dp(72.0f);
            }
            y9VarArr[i14].measure(View.MeasureSpec.makeMeasureSpec(dp3, 1073741824), View.MeasureSpec.makeMeasureSpec(dp4, 1073741824));
            i14++;
        }
        for (TextView textView3 : this.e) {
            if (this.v == 2) {
                dp2 = AndroidUtilities.dp(40.0f);
            } else {
                dp2 = AndroidUtilities.dp(64.0f);
            }
            textView3.measure(View.MeasureSpec.makeMeasureSpec(dp2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
        int dp6 = AndroidUtilities.dp(max + 42);
        if (this.f25629s) {
            i13 = AndroidUtilities.dp(94.0f);
        }
        setMeasuredDimension(size, Math.max(dp6, i13));
    }

    public void setMessage(MessageObject messageObject) {
        b(messageObject, null);
    }
}
