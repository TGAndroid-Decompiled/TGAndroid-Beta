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
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
public class f9 extends FrameLayout {
    public final y1 f20294a;
    public final h90 f20295b;
    public int f20296c;
    public Integer d;
    public int e;
    public int f20297f;
    public int h;
    public boolean f20298n;
    public CharSequence f20299r;
    public final org.telegram.ui.ActionBar.f6 f20300s;

    public f9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        y1 y1Var = this.f20294a;
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
        return this.f20294a.getText();
    }

    public k90 getTextView() {
        return this.f20294a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h90 h90Var = this.f20295b;
        if (h90Var != null) {
            canvas.save();
            y1 y1Var = this.f20294a;
            canvas.translate(y1Var.getLeft(), y1Var.getTop());
            if (h90Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f20299r);
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
        this.f20297f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f20296c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f20299r)) {
            this.f20299r = charSequence;
            y1 y1Var = this.f20294a;
            if (charSequence == null) {
                y1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                y1Var.setPadding(0, AndroidUtilities.dp(this.e), 0, AndroidUtilities.dp(this.f20297f));
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
        this.f20294a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f20300s);
        y1 y1Var = this.f20294a;
        y1Var.setTextColor(v02);
        y1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f20294a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    public f9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 24, f6Var);
    }

    public f9(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f20296c = org.telegram.ui.ActionBar.j6.J6;
        this.e = 10;
        this.f20297f = 17;
        this.f20300s = f6Var;
        h90 h90Var = new h90(this);
        this.f20295b = h90Var;
        y1 y1Var = new y1(this, context, h90Var, f6Var);
        this.f20294a = y1Var;
        y1Var.setTextSize(1, 14.0f);
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        y1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        y1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        y1Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(this.f20296c, f6Var));
        y1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(y1Var, w7.y5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.f20298n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
