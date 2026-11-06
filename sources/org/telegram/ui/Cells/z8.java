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
import org.telegram.ui.Components.w70;
public class z8 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final b2 f30978a;
    public final n2.n0 f30979b;
    public int f30980c;
    public Integer d;
    public int f30981e;
    public int f30982f;
    public int h;
    public boolean f30983n;
    public CharSequence f30984r;
    public final org.telegram.ui.ActionBar.f6 f30985s;
    public int f30986w;

    public z8(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z9) {
        float f10 = 0.5f;
        b2 b2Var = this.f30978a;
        if (arrayList != null) {
            if (z9) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b2Var, View.ALPHA, f10));
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        b2Var.setAlpha(f10);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f30978a.getText();
    }

    public w70 getTextView() {
        return this.f30978a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n2.n0 n0Var = this.f30979b;
        if (n0Var != null) {
            canvas.save();
            b2 b2Var = this.f30978a;
            canvas.translate(b2Var.getLeft(), b2Var.getTop());
            if (n0Var.h(canvas)) {
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
        accessibilityNodeInfo.setText(this.f30984r);
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
        this.f30982f = i7;
    }

    public void setFixedSize(int i7) {
        this.h = i7;
    }

    public void setLinkTextColorKey(int i7) {
        this.f30980c = i7;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f30984r)) {
            this.f30984r = charSequence;
            b2 b2Var = this.f30978a;
            if (charSequence == null) {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
            } else {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(this.f30981e), 0, org.telegram.messenger.g0.L(this.f30982f));
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
            b2Var.setText(charSequence);
        }
    }

    public void setTextColor(int i7) {
        b2 b2Var = this.f30978a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28474a;
        b2Var.setTag(2131296709, null);
        org.telegram.ui.ActionBar.r6.H(b2Var, this.f30980c, this.f30985s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i7);
    }

    public void setTextColorByKey(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f30985s;
        b2 b2Var = this.f30978a;
        org.telegram.ui.ActionBar.r6.V(b2Var, i7, f6Var);
        b2Var.setTag(Integer.valueOf(i7));
    }

    public void setTextGravity(int i7) {
        this.f30978a.setGravity(i7);
    }

    public void setTopPadding(int i7) {
        this.f30981e = i7;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B6, this.f30985s);
            b2 b2Var = this.f30978a;
            if (b2Var != null && w02 != this.f30986w) {
                this.f30986w = w02;
                b2Var.setEmojiColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public z8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(24, context, f6Var);
    }

    public z8(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30980c = org.telegram.ui.ActionBar.k6.J6;
        this.f30981e = 10;
        this.f30982f = 17;
        this.f30985s = f6Var;
        n2.n0 n0Var = new n2.n0(this);
        this.f30979b = n0Var;
        b2 b2Var = new b2(this, context, n0Var, f6Var);
        this.f30978a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(hd.f22871a0 ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.V(b2Var, i10, f6Var);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        this.f30986w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.r6.H(b2Var, this.f30980c, f6Var);
        b2Var.setImportantForAccessibility(2);
        float f10 = i7;
        addView(b2Var, c8.ha.d(-1, -2.0f, (hd.f22871a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f30983n = hd.f22871a0;
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
