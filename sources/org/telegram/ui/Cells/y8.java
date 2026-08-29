package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.y80;
public class y8 extends FrameLayout {
    public final w1 f26011a;
    public final v80 f26012b;
    public int f26013c;
    public Integer d;
    public int f26014e;
    public int f26015f;
    public int h;
    public boolean f26016n;
    public CharSequence f26017r;
    public final org.telegram.ui.ActionBar.c6 f26018s;

    public y8(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f9 = 0.5f;
        w1 w1Var = this.f26011a;
        if (arrayList != null) {
            if (z10) {
                f9 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w1Var, View.ALPHA, f9));
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        w1Var.setAlpha(f9);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f26011a.getText();
    }

    public y80 getTextView() {
        return this.f26011a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v80 v80Var = this.f26012b;
        if (v80Var != null) {
            canvas.save();
            w1 w1Var = this.f26011a;
            canvas.translate(w1Var.getLeft(), w1Var.getTop());
            if (v80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextView.class.getName());
        accessibilityNodeInfo.setText(this.f26017r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.h;
        if (i12 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (i12 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i10) {
        this.f26015f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f26013c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f26017r)) {
            this.f26017r = charSequence;
            w1 w1Var = this.f26011a;
            if (charSequence == null) {
                w1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                w1Var.setPadding(0, AndroidUtilities.dp(this.f26014e), 0, AndroidUtilities.dp(this.f26015f));
            }
            SpannableString spannableString = null;
            if (charSequence != null) {
                int length = charSequence.length();
                for (int i10 = 0; i10 < length - 1; i10++) {
                    if (charSequence.charAt(i10) == '\n') {
                        int i11 = i10 + 1;
                        if (charSequence.charAt(i11) == '\n') {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan(10, true), i11, i10 + 2, 33);
                        }
                    }
                }
            }
            if (spannableString != null) {
                charSequence = spannableString;
            }
            w1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i10) {
        this.f26011a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.f26018s);
        w1 w1Var = this.f26011a;
        w1Var.setTextColor(v02);
        w1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f26011a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.f26014e = i10;
    }

    public y8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 24, c6Var);
    }

    public y8(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26013c = org.telegram.ui.ActionBar.g6.J6;
        this.f26014e = 10;
        this.f26015f = 17;
        this.f26018s = c6Var;
        v80 v80Var = new v80(this);
        this.f26012b = v80Var;
        w1 w1Var = new w1(this, context, v80Var, c6Var);
        this.f26011a = w1Var;
        w1Var.setTextSize(1, 14.0f);
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        w1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.g6.B6;
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(this.f26013c, c6Var));
        w1Var.setImportantForAccessibility(2);
        float f9 = i10;
        addView(w1Var, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f9, 0.0f, f9, 0.0f));
        this.f26016n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
