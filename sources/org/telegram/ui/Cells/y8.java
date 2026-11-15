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
import org.telegram.ui.Components.z70;
public class y8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final b2 f32078a;
    public final n2.o0 f32079b;
    public int f32080c;
    public Integer d;
    public int f32081e;
    public int f32082f;
    public int h;
    public boolean f32083n;
    public CharSequence f32084r;
    public final org.telegram.ui.ActionBar.e6 f32085s;
    public int f32086w;

    public y8(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        b2 b2Var = this.f32078a;
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
        return this.f32078a.getText();
    }

    public z70 getTextView() {
        return this.f32078a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n2.o0 o0Var = this.f32079b;
        if (o0Var != null) {
            canvas.save();
            b2 b2Var = this.f32078a;
            canvas.translate(b2Var.getLeft(), b2Var.getTop());
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
        accessibilityNodeInfo.setText(this.f32084r);
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
        this.f32082f = i7;
    }

    public void setFixedSize(int i7) {
        this.h = i7;
    }

    public void setLinkTextColorKey(int i7) {
        this.f32080c = i7;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f32084r)) {
            this.f32084r = charSequence;
            b2 b2Var = this.f32078a;
            if (charSequence == null) {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
            } else {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(this.f32081e), 0, org.telegram.messenger.g0.L(this.f32082f));
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
        b2 b2Var = this.f32078a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.f29534a;
        b2Var.setTag(2131296709, null);
        org.telegram.ui.ActionBar.q6.G(b2Var, this.f32080c, this.f32085s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i7);
    }

    public void setTextColorByKey(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f32085s;
        b2 b2Var = this.f32078a;
        org.telegram.ui.ActionBar.q6.U(b2Var, i7, e6Var);
        b2Var.setTag(Integer.valueOf(i7));
    }

    public void setTextGravity(int i7) {
        this.f32078a.setGravity(i7);
    }

    public void setTopPadding(int i7) {
        this.f32081e = i7;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B6, this.f32085s);
            b2 b2Var = this.f32078a;
            if (b2Var != null && w02 != this.f32086w) {
                this.f32086w = w02;
                b2Var.setEmojiColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public y8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(24, context, e6Var);
    }

    public y8(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32080c = org.telegram.ui.ActionBar.j6.J6;
        this.f32081e = 10;
        this.f32082f = 17;
        this.f32085s = e6Var;
        n2.o0 o0Var = new n2.o0(this);
        this.f32079b = o0Var;
        b2 b2Var = new b2(this, context, o0Var, e6Var);
        this.f32078a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(hd.f24104a0 ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.j6.B6;
        org.telegram.ui.ActionBar.q6.U(b2Var, i10, e6Var);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        this.f32086w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.q6.G(b2Var, this.f32080c, e6Var);
        b2Var.setImportantForAccessibility(2);
        float f10 = i7;
        addView(b2Var, c8.ja.d(-1, -2.0f, (hd.f24104a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f32083n = hd.f24104a0;
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
