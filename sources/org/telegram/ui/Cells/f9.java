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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;
public class f9 extends FrameLayout {
    public final x1 f20052a;
    public final a90 f20053b;
    public int f20054c;
    public Integer d;
    public int e;
    public int f20055f;
    public int h;
    public boolean f20056n;
    public CharSequence f20057r;
    public final org.telegram.ui.ActionBar.d6 f20058s;

    public f9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        x1 x1Var = this.f20052a;
        if (arrayList != null) {
            if (z10) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x1Var, View.ALPHA, f7));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        x1Var.setAlpha(f7);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f20052a.getText();
    }

    public d90 getTextView() {
        return this.f20052a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a90 a90Var = this.f20053b;
        if (a90Var != null) {
            canvas.save();
            x1 x1Var = this.f20052a;
            canvas.translate(x1Var.getLeft(), x1Var.getTop());
            if (a90Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f20057r);
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
        this.f20055f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f20054c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f20057r)) {
            this.f20057r = charSequence;
            x1 x1Var = this.f20052a;
            if (charSequence == null) {
                x1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                x1Var.setPadding(0, AndroidUtilities.dp(this.e), 0, AndroidUtilities.dp(this.f20055f));
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
            x1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i10) {
        this.f20052a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, this.f20058s);
        x1 x1Var = this.f20052a;
        x1Var.setTextColor(v02);
        x1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f20052a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    public f9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, 24, d6Var);
    }

    public f9(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20054c = org.telegram.ui.ActionBar.h6.J6;
        this.e = 10;
        this.f20055f = 17;
        this.f20058s = d6Var;
        a90 a90Var = new a90(this);
        this.f20053b = a90Var;
        x1 x1Var = new x1(this, context, a90Var, d6Var);
        this.f20052a = x1Var;
        x1Var.setTextSize(1, 14.0f);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        x1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.h6.B6;
        x1Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        x1Var.setEmojiColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(this.f20054c, d6Var));
        x1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(x1Var, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.f20056n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
