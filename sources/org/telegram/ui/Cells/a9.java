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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.m80;
public class a9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final c2 f30394a;
    public final n2.o0 f30395b;
    public int f30396c;
    public Integer d;
    public int f30397e;
    public int f30398f;
    public int h;
    public boolean f30399n;
    public CharSequence f30400r;
    public final org.telegram.ui.ActionBar.h6 f30401s;
    public int f30402w;

    public a9(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        c2 c2Var = this.f30394a;
        if (arrayList != null) {
            if (z10) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(c2Var, View.ALPHA, f10));
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        c2Var.setAlpha(f10);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f30394a.getText();
    }

    public m80 getTextView() {
        return this.f30394a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n2.o0 o0Var = this.f30395b;
        if (o0Var != null) {
            canvas.save();
            c2 c2Var = this.f30394a;
            canvas.translate(c2Var.getLeft(), c2Var.getTop());
            if (o0Var.h(canvas)) {
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
        accessibilityNodeInfo.setText(this.f30400r);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.h;
        if (i11 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (i11 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.h), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i7) {
        this.f30398f = i7;
    }

    public void setFixedSize(int i7) {
        this.h = i7;
    }

    public void setLinkTextColorKey(int i7) {
        this.f30396c = i7;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f30400r)) {
            this.f30400r = charSequence;
            c2 c2Var = this.f30394a;
            if (charSequence == null) {
                c2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
            } else {
                c2Var.setPadding(0, org.telegram.messenger.g0.L(this.f30397e), 0, org.telegram.messenger.g0.L(this.f30398f));
            }
            SpannableString spannableString = null;
            if (charSequence != null) {
                int length = charSequence.length();
                for (int i7 = 0; i7 < length - 1; i7++) {
                    if (charSequence.charAt(i7) == '\n') {
                        int i10 = i7 + 1;
                        if (charSequence.charAt(i10) == '\n') {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan(10, true), i10, i7 + 2, 33);
                        }
                    }
                }
            }
            if (spannableString != null) {
                charSequence = spannableString;
            }
            c2Var.setText(charSequence);
        }
    }

    public void setTextColor(int i7) {
        c2 c2Var = this.f30394a;
        ColorStateList linkTextColors = c2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f30034a;
        c2Var.setTag(2131296711, null);
        org.telegram.ui.ActionBar.t6.G(c2Var, this.f30396c, this.f30401s);
        if (linkTextColors != null) {
            c2Var.setLinkTextColor(linkTextColors);
        }
        c2Var.setTextColor(i7);
    }

    public void setTextColorByKey(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f30401s;
        c2 c2Var = this.f30394a;
        org.telegram.ui.ActionBar.t6.U(c2Var, i7, h6Var);
        c2Var.setTag(Integer.valueOf(i7));
    }

    public void setTextGravity(int i7) {
        this.f30394a.setGravity(i7);
    }

    public void setTopPadding(int i7) {
        this.f30397e = i7;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B6, this.f30401s);
            c2 c2Var = this.f30394a;
            if (c2Var != null && w02 != this.f30402w) {
                this.f30402w = w02;
                c2Var.setEmojiColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public a9(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(24, context, h6Var);
    }

    public a9(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30396c = org.telegram.ui.ActionBar.m6.J6;
        this.f30397e = 10;
        this.f30398f = 17;
        this.f30401s = h6Var;
        n2.o0 o0Var = new n2.o0(this);
        this.f30395b = o0Var;
        c2 c2Var = new c2(this, context, o0Var, h6Var);
        this.f30394a = c2Var;
        c2Var.setTextSize(1, 14.0f);
        c2Var.setGravity(hd.f24408a0 ? 5 : 3);
        c2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        c2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.m6.B6;
        org.telegram.ui.ActionBar.t6.U(c2Var, i10, h6Var);
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        this.f30402w = w02;
        c2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.t6.G(c2Var, this.f30396c, h6Var);
        c2Var.setImportantForAccessibility(2);
        float f10 = i7;
        addView(c2Var, c8.na.d(-1, -2.0f, (hd.f24408a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f30399n = hd.f24408a0;
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
