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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.k80;
public class z8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final b2 f32517a;
    public final n2.o0 f32518b;
    public int f32519c;
    public Integer d;
    public int f32520e;
    public int f32521f;
    public int h;
    public boolean f32522n;
    public CharSequence f32523r;
    public final org.telegram.ui.ActionBar.i6 f32524s;
    public int f32525w;

    public z8(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        b2 b2Var = this.f32517a;
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
        return this.f32517a.getText();
    }

    public k80 getTextView() {
        return this.f32517a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n2.o0 o0Var = this.f32518b;
        if (o0Var != null) {
            canvas.save();
            b2 b2Var = this.f32517a;
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
        accessibilityNodeInfo.setText(this.f32523r);
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
        this.f32521f = i7;
    }

    public void setFixedSize(int i7) {
        this.h = i7;
    }

    public void setLinkTextColorKey(int i7) {
        this.f32519c = i7;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f32523r)) {
            this.f32523r = charSequence;
            b2 b2Var = this.f32517a;
            if (charSequence == null) {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
            } else {
                b2Var.setPadding(0, org.telegram.messenger.g0.L(this.f32520e), 0, org.telegram.messenger.g0.L(this.f32521f));
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
        b2 b2Var = this.f32517a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30084a;
        b2Var.setTag(2131296709, null);
        org.telegram.ui.ActionBar.u6.G(b2Var, this.f32519c, this.f32524s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i7);
    }

    public void setTextColorByKey(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f32524s;
        b2 b2Var = this.f32517a;
        org.telegram.ui.ActionBar.u6.U(b2Var, i7, i6Var);
        b2Var.setTag(Integer.valueOf(i7));
    }

    public void setTextGravity(int i7) {
        this.f32517a.setGravity(i7);
    }

    public void setTopPadding(int i7) {
        this.f32520e = i7;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B6, this.f32524s);
            b2 b2Var = this.f32517a;
            if (b2Var != null && w02 != this.f32525w) {
                this.f32525w = w02;
                b2Var.setEmojiColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public z8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(24, context, i6Var);
    }

    public z8(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f32519c = org.telegram.ui.ActionBar.n6.J6;
        this.f32520e = 10;
        this.f32521f = 17;
        this.f32524s = i6Var;
        n2.o0 o0Var = new n2.o0(this);
        this.f32518b = o0Var;
        b2 b2Var = new b2(this, context, o0Var, i6Var);
        this.f32517a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(gd.f24216a0 ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.n6.B6;
        org.telegram.ui.ActionBar.u6.U(b2Var, i10, i6Var);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        this.f32525w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.u6.G(b2Var, this.f32519c, i6Var);
        b2Var.setImportantForAccessibility(2);
        float f10 = i7;
        addView(b2Var, c8.ma.d(-1, -2.0f, (gd.f24216a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f32522n = gd.f24216a0;
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
