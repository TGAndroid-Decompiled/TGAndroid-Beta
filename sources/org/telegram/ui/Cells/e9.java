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
public class e9 extends FrameLayout {
    public final x1 f21867a;
    public final a90 f21868b;
    public int f21869c;
    public Integer d;
    public int f21870e;
    public int f21871f;
    public int h;
    public boolean f21872n;
    public CharSequence f21873r;
    public final org.telegram.ui.ActionBar.f6 f21874s;

    public e9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        x1 x1Var = this.f21867a;
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
        return this.f21867a.getText();
    }

    public d90 getTextView() {
        return this.f21867a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a90 a90Var = this.f21868b;
        if (a90Var != null) {
            canvas.save();
            x1 x1Var = this.f21867a;
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
        accessibilityNodeInfo.setText(this.f21873r);
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
        this.f21871f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f21869c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f21873r)) {
            this.f21873r = charSequence;
            x1 x1Var = this.f21867a;
            if (charSequence == null) {
                x1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                x1Var.setPadding(0, AndroidUtilities.dp(this.f21870e), 0, AndroidUtilities.dp(this.f21871f));
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
        this.f21867a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f21874s);
        x1 x1Var = this.f21867a;
        x1Var.setTextColor(v02);
        x1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f21867a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.f21870e = i10;
    }

    public e9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 24, f6Var);
    }

    public e9(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21869c = org.telegram.ui.ActionBar.j6.J6;
        this.f21870e = 10;
        this.f21871f = 17;
        this.f21874s = f6Var;
        a90 a90Var = new a90(this);
        this.f21868b = a90Var;
        x1 x1Var = new x1(this, context, a90Var, f6Var);
        this.f21867a = x1Var;
        x1Var.setTextSize(1, 14.0f);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        x1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(this.f21869c, f6Var));
        x1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(x1Var, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.f21872n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
