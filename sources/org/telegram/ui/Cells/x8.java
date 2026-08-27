package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;

public class x8 extends FrameLayout {

    public final w1 f25948a;

    public final m80 f25949b;

    public int f25950c;
    public Integer d;

    public int f25951e;

    public int f25952f;
    public int h;

    public boolean f25953n;

    public CharSequence f25954r;

    public final org.telegram.ui.ActionBar.c6 f25955s;

    public x8(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        w1 w1Var = this.f25948a;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(w1Var, (Property<w1, Float>) View.ALPHA, z10 ? 1.0f : 0.5f));
        } else {
            w1Var.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f25948a.getText();
    }

    public p80 getTextView() {
        return this.f25948a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m80 m80Var = this.f25949b;
        if (m80Var != null) {
            canvas.save();
            w1 w1Var = this.f25948a;
            canvas.translate(w1Var.getLeft(), w1Var.getTop());
            if (m80Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f25954r);
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
        this.f25952f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f25950c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f25954r)) {
            return;
        }
        this.f25954r = charSequence;
        w1 w1Var = this.f25948a;
        if (charSequence == null) {
            w1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        } else {
            w1Var.setPadding(0, AndroidUtilities.dp(this.f25951e), 0, AndroidUtilities.dp(this.f25952f));
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

    public void setTextColor(int i10) {
        this.f25948a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, this.f25955s);
        w1 w1Var = this.f25948a;
        w1Var.setTextColor(iV0);
        w1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f25948a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.f25951e = i10;
    }

    public x8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 24, c6Var);
    }

    public x8(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25950c = org.telegram.ui.ActionBar.g6.J6;
        this.f25951e = 10;
        this.f25952f = 17;
        this.f25955s = c6Var;
        m80 m80Var = new m80(this);
        this.f25949b = m80Var;
        w1 w1Var = new w1(this, context, m80Var, c6Var);
        this.f25948a = w1Var;
        w1Var.setTextSize(1, 14.0f);
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        w1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.g6.B6;
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(this.f25950c, c6Var));
        w1Var.setImportantForAccessibility(2);
        float f10 = i10;
        addView(w1Var, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f25953n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
