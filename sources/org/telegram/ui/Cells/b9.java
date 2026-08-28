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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;
public class b9 extends FrameLayout {
    public final x1 f24152a;
    public final i80 f24153b;
    public int f24154c;
    public Integer d;
    public int f24155e;
    public int f24156f;
    public int h;
    public boolean f24157n;
    public CharSequence f24158r;
    public final org.telegram.ui.ActionBar.b6 f24159s;

    public b9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        x1 x1Var = this.f24152a;
        if (arrayList != null) {
            if (z10) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x1Var, View.ALPHA, f10));
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        x1Var.setAlpha(f10);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f24152a.getText();
    }

    public l80 getTextView() {
        return this.f24152a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i80 i80Var = this.f24153b;
        if (i80Var != null) {
            canvas.save();
            x1 x1Var = this.f24152a;
            canvas.translate(x1Var.getLeft(), x1Var.getTop());
            if (i80Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f24158r);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = this.h;
        if (i11 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (i11 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i9) {
        this.f24156f = i9;
    }

    public void setFixedSize(int i9) {
        this.h = i9;
    }

    public void setLinkTextColorKey(int i9) {
        this.f24154c = i9;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f24158r)) {
            this.f24158r = charSequence;
            x1 x1Var = this.f24152a;
            if (charSequence == null) {
                x1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                x1Var.setPadding(0, AndroidUtilities.dp(this.f24155e), 0, AndroidUtilities.dp(this.f24156f));
            }
            SpannableString spannableString = null;
            if (charSequence != null) {
                int length = charSequence.length();
                for (int i9 = 0; i9 < length - 1; i9++) {
                    if (charSequence.charAt(i9) == '\n') {
                        int i10 = i9 + 1;
                        if (charSequence.charAt(i10) == '\n') {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan(10, true), i10, i9 + 2, 33);
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

    public void setTextColor(int i9) {
        this.f24152a.setTextColor(i9);
    }

    public void setTextColorByKey(int i9) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.f24159s);
        x1 x1Var = this.f24152a;
        x1Var.setTextColor(v02);
        x1Var.setTag(Integer.valueOf(i9));
    }

    public void setTextGravity(int i9) {
        this.f24152a.setGravity(i9);
    }

    public void setTopPadding(int i9) {
        this.f24155e = i9;
    }

    public b9(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, 24, b6Var);
    }

    public b9(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24154c = org.telegram.ui.ActionBar.f6.J6;
        this.f24155e = 10;
        this.f24156f = 17;
        this.f24159s = b6Var;
        i80 i80Var = new i80(this);
        this.f24153b = i80Var;
        x1 x1Var = new x1(this, context, i80Var, b6Var);
        this.f24152a = x1Var;
        x1Var.setTextSize(1, 14.0f);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        x1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.f6.B6;
        x1Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        x1Var.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(this.f24154c, b6Var));
        x1Var.setImportantForAccessibility(2);
        float f10 = i9;
        addView(x1Var, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f24157n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
