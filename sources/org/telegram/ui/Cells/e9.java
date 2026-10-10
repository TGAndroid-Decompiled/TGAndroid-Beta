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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.fa0;
public class e9 extends FrameLayout {
    public final y1 f22050a;
    public final ca0 f22051b;
    public int f22052c;
    public Integer d;
    public int f22053e;
    public int f22054f;
    public int h;
    public boolean f22055n;
    public CharSequence f22056r;
    public final org.telegram.ui.ActionBar.e6 f22057s;

    public e9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        y1 y1Var = this.f22050a;
        if (arrayList != null) {
            if (z10) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(y1Var, View.ALPHA, f7));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        y1Var.setAlpha(f7);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f22050a.getText();
    }

    public fa0 getTextView() {
        return this.f22050a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ca0 ca0Var = this.f22051b;
        if (ca0Var != null) {
            canvas.save();
            y1 y1Var = this.f22050a;
            canvas.translate(y1Var.getLeft(), y1Var.getTop());
            if (ca0Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f22056r);
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
        this.f22054f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f22052c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f22056r)) {
            this.f22056r = charSequence;
            y1 y1Var = this.f22050a;
            if (charSequence == null) {
                y1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                y1Var.setPadding(0, AndroidUtilities.dp(this.f22053e), 0, AndroidUtilities.dp(this.f22054f));
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
            y1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i10) {
        this.f22050a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, this.f22057s);
        y1 y1Var = this.f22050a;
        y1Var.setTextColor(w02);
        y1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f22050a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.f22053e = i10;
    }

    public e9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, 24, e6Var);
    }

    public e9(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f22052c = org.telegram.ui.ActionBar.i6.J6;
        this.f22053e = 10;
        this.f22054f = 17;
        this.f22057s = e6Var;
        ca0 ca0Var = new ca0(this);
        this.f22051b = ca0Var;
        y1 y1Var = new y1(this, context, ca0Var, e6Var);
        this.f22050a = y1Var;
        y1Var.setTextSize(1, 14.0f);
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        y1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.i6.B6;
        y1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        y1Var.setEmojiColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(this.f22052c, e6Var));
        y1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(y1Var, w7.x5.a(-2.0f, f7, 0.0f, f7, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        this.f22055n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
