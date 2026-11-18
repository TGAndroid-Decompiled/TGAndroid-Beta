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
public class a9 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final c2 f30397a;
    public final n2.o0 f30398b;
    public int f30399c;
    public Integer d;
    public int f30400e;
    public int f30401f;
    public int h;
    public boolean f30402n;
    public CharSequence f30403r;
    public final org.telegram.ui.ActionBar.i6 f30404s;
    public int f30405w;

    public a9(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        c2 c2Var = this.f30397a;
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
        return this.f30397a.getText();
    }

    public k80 getTextView() {
        return this.f30397a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n2.o0 o0Var = this.f30398b;
        if (o0Var != null) {
            canvas.save();
            c2 c2Var = this.f30397a;
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
        accessibilityNodeInfo.setText(this.f30403r);
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
        this.f30401f = i7;
    }

    public void setFixedSize(int i7) {
        this.h = i7;
    }

    public void setLinkTextColorKey(int i7) {
        this.f30399c = i7;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f30403r)) {
            this.f30403r = charSequence;
            c2 c2Var = this.f30397a;
            if (charSequence == null) {
                c2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
            } else {
                c2Var.setPadding(0, org.telegram.messenger.g0.L(this.f30400e), 0, org.telegram.messenger.g0.L(this.f30401f));
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
        c2 c2Var = this.f30397a;
        ColorStateList linkTextColors = c2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30082a;
        c2Var.setTag(2131296709, null);
        org.telegram.ui.ActionBar.u6.G(c2Var, this.f30399c, this.f30404s);
        if (linkTextColors != null) {
            c2Var.setLinkTextColor(linkTextColors);
        }
        c2Var.setTextColor(i7);
    }

    public void setTextColorByKey(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f30404s;
        c2 c2Var = this.f30397a;
        org.telegram.ui.ActionBar.u6.U(c2Var, i7, i6Var);
        c2Var.setTag(Integer.valueOf(i7));
    }

    public void setTextGravity(int i7) {
        this.f30397a.setGravity(i7);
    }

    public void setTopPadding(int i7) {
        this.f30400e = i7;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B6, this.f30404s);
            c2 c2Var = this.f30397a;
            if (c2Var != null && w02 != this.f30405w) {
                this.f30405w = w02;
                c2Var.setEmojiColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public a9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(24, context, i6Var);
    }

    public a9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30399c = org.telegram.ui.ActionBar.n6.J6;
        this.f30400e = 10;
        this.f30401f = 17;
        this.f30404s = i6Var;
        n2.o0 o0Var = new n2.o0(this);
        this.f30398b = o0Var;
        c2 c2Var = new c2(this, context, o0Var, i6Var);
        this.f30397a = c2Var;
        c2Var.setTextSize(1, 14.0f);
        c2Var.setGravity(gd.f24213a0 ? 5 : 3);
        c2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        c2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.n6.B6;
        org.telegram.ui.ActionBar.u6.U(c2Var, i10, i6Var);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        this.f30405w = w02;
        c2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.u6.G(c2Var, this.f30399c, i6Var);
        c2Var.setImportantForAccessibility(2);
        float f10 = i7;
        addView(c2Var, c8.ma.d(-1, -2.0f, (gd.f24213a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.f30402n = gd.f24213a0;
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
