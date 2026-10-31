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
import org.telegram.messenger.cd;
import org.telegram.ui.Components.p80;
public class b9 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final b2 f21743a;
    public final ji.a f21744b;
    public int f21745c;
    public Integer d;
    public int e;
    public int f21746f;
    public int h;
    public boolean f21747n;
    public CharSequence f21748r;
    public final org.telegram.ui.ActionBar.p6 f21749s;
    public int f21750w;

    public b9(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        b2 b2Var = this.f21743a;
        if (arrayList != null) {
            if (z10) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b2Var, View.ALPHA, f7));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        b2Var.setAlpha(f7);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f21743a.getText();
    }

    public p80 getTextView() {
        return this.f21743a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ji.a aVar = this.f21744b;
        if (aVar != null) {
            canvas.save();
            b2 b2Var = this.f21743a;
            canvas.translate(b2Var.getLeft(), b2Var.getTop());
            if (aVar.h(canvas)) {
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
        accessibilityNodeInfo.setText(this.f21748r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.h;
        if (i12 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (i12 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.h), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i10) {
        this.f21746f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f21745c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f21748r)) {
            this.f21748r = charSequence;
            b2 b2Var = this.f21743a;
            if (charSequence == null) {
                b2Var.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
            } else {
                b2Var.setPadding(0, org.telegram.messenger.i0.L(this.e), 0, org.telegram.messenger.i0.L(this.f21746f));
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
            b2Var.setText(charSequence);
        }
    }

    public void setTextColor(int i10) {
        b2 b2Var = this.f21743a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.f20157a;
        b2Var.setTag(2131296709, null);
        org.telegram.ui.ActionBar.a7.H(b2Var, this.f21745c, this.f21749s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f21749s;
        b2 b2Var = this.f21743a;
        org.telegram.ui.ActionBar.a7.V(b2Var, i10, p6Var);
        b2Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f21743a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B6, this.f21749s);
            b2 b2Var = this.f21743a;
            if (b2Var != null && w02 != this.f21750w) {
                this.f21750w = w02;
                b2Var.setEmojiColor(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public b9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(24, context, p6Var);
    }

    public b9(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f21745c = org.telegram.ui.ActionBar.t6.J6;
        this.e = 10;
        this.f21746f = 17;
        this.f21749s = p6Var;
        ji.a aVar = new ji.a(this);
        this.f21744b = aVar;
        b2 b2Var = new b2(this, context, aVar, p6Var);
        this.f21743a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(cd.X ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.t6.B6;
        org.telegram.ui.ActionBar.a7.V(b2Var, i11, p6Var);
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        this.f21750w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.a7.H(b2Var, this.f21745c, p6Var);
        b2Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(b2Var, w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.f21747n = cd.X;
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
