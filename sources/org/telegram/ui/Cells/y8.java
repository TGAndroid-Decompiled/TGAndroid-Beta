package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.s70;
public class y8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final b2 f31003a;
    public final m2.p0 f31004b;
    public int f31005c;
    public Integer d;
    public int f31006e;
    public int f31007f;
    public int h;
    public boolean f31008n;
    public CharSequence f31009r;
    public final org.telegram.ui.ActionBar.e6 f31010s;
    public int f31011w;

    public y8(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        b2 b2Var = this.f31003a;
        if (arrayList != null) {
            if (z10) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b2Var, View.ALPHA, f10));
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        b2Var.setAlpha(f10);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f31003a.getText();
    }

    public s70 getTextView() {
        return this.f31003a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m2.p0 p0Var = this.f31004b;
        if (p0Var != null) {
            canvas.save();
            b2 b2Var = this.f31003a;
            canvas.translate(b2Var.getLeft(), b2Var.getTop());
            if (p0Var.h(canvas)) {
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
        accessibilityNodeInfo.setText(this.f31009r);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = this.h;
        if (i11 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (i11 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.h), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i3) {
        this.f31007f = i3;
    }

    public void setFixedSize(int i3) {
        this.h = i3;
    }

    public void setLinkTextColorKey(int i3) {
        this.f31005c = i3;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f31009r)) {
            this.f31009r = charSequence;
            b2 b2Var = this.f31003a;
            if (charSequence == null) {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
            } else {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(this.f31006e), 0, org.telegram.messenger.g0.L(this.f31007f));
            }
            SpannableString spannableString = null;
            if (charSequence != null) {
                int length = charSequence.length();
                for (int i3 = 0; i3 < length - 1; i3++) {
                    if (charSequence.charAt(i3) == '\n') {
                        int i10 = i3 + 1;
                        if (charSequence.charAt(i10) == '\n') {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan(10, true), i10, i3 + 2, 33);
                        }
                    }
                }
            }
            if (spannableString != null) {
                charSequence = spannableString;
            }
            b2Var.setText(charSequence);
        }
    }

    public void setTextColor(int i3) {
        b2 b2Var = this.f31003a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        b2Var.setTag(2131296709, null);
        org.telegram.ui.ActionBar.r6.H(b2Var, this.f31005c, this.f31010s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i3);
    }

    public void setTextColorByKey(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f31010s;
        b2 b2Var = this.f31003a;
        org.telegram.ui.ActionBar.r6.V(b2Var, i3, e6Var);
        b2Var.setTag(Integer.valueOf(i3));
    }

    public void setTextGravity(int i3) {
        this.f31003a.setGravity(i3);
    }

    public void setTopPadding(int i3) {
        this.f31006e = i3;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B6, this.f31010s);
            b2 b2Var = this.f31003a;
            if (b2Var != null && w02 != this.f31011w) {
                this.f31011w = w02;
                b2Var.setEmojiColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public y8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(24, context, e6Var);
    }

    public y8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31005c = org.telegram.ui.ActionBar.k6.J6;
        this.f31006e = 10;
        this.f31007f = 17;
        this.f31010s = e6Var;
        m2.p0 p0Var = new m2.p0(this);
        this.f31004b = p0Var;
        b2 b2Var = new b2(this, context, p0Var, e6Var);
        this.f31003a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(bd.f21784a0 ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.V(b2Var, i10, e6Var);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        this.f31011w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.r6.H(b2Var, this.f31005c, e6Var);
        b2Var.setImportantForAccessibility(2);
        float f10 = i3;
        addView(b2Var, mf.d(-1, -2.0f, (bd.f21784a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f31008n = bd.f21784a0;
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void a() {
    }

    public void b() {
    }
}
