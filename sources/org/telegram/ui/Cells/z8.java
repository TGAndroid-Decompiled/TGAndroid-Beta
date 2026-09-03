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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f90;
public class z8 extends FrameLayout {
    public final w1 f22669a;
    public final c90 f22670b;
    public int f22671c;
    public Integer d;
    public int e;
    public int f22672f;
    public int h;
    public boolean f22673n;
    public CharSequence f22674r;
    public final org.telegram.ui.ActionBar.f6 f22675s;

    public z8(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z4) {
        float f10 = 0.5f;
        w1 w1Var = this.f22669a;
        if (arrayList != null) {
            if (z4) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w1Var, View.ALPHA, f10));
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        w1Var.setAlpha(f10);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f22669a.getText();
    }

    public f90 getTextView() {
        return this.f22669a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        c90 c90Var = this.f22670b;
        if (c90Var != null) {
            canvas.save();
            w1 w1Var = this.f22669a;
            canvas.translate(w1Var.getLeft(), w1Var.getTop());
            if (c90Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f22674r);
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
        this.f22672f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f22671c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f22674r)) {
            this.f22674r = charSequence;
            w1 w1Var = this.f22669a;
            if (charSequence == null) {
                w1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                w1Var.setPadding(0, AndroidUtilities.dp(this.e), 0, AndroidUtilities.dp(this.f22672f));
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
        this.f22669a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f22675s);
        w1 w1Var = this.f22669a;
        w1Var.setTextColor(v02);
        w1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f22669a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    public z8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 24, f6Var);
    }

    public z8(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22671c = org.telegram.ui.ActionBar.j6.J6;
        this.e = 10;
        this.f22672f = 17;
        this.f22675s = f6Var;
        c90 c90Var = new c90(this);
        this.f22670b = c90Var;
        w1 w1Var = new w1(this, context, c90Var, f6Var);
        this.f22669a = w1Var;
        w1Var.setTextSize(1, 14.0f);
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        w1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        w1Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(this.f22671c, f6Var));
        w1Var.setImportantForAccessibility(2);
        float f10 = i10;
        addView(w1Var, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f22673n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
