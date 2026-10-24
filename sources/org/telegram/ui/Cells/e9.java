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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.w90;
public class e9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final x1 f22339a;
    public final t90 f22340b;
    public int f22341c;
    public Integer d;
    public int e;
    public int f22342f;
    public int h;
    public boolean f22343n;
    public CharSequence f22344r;
    public final org.telegram.ui.ActionBar.g6 f22345s;
    public int v;

    public e9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        x1 x1Var = this.f22339a;
        if (arrayList != null) {
            if (z10) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x1Var, View.ALPHA, f7));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        x1Var.setAlpha(f7);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.f22339a.getText();
    }

    public w90 getTextView() {
        return this.f22339a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        t90 t90Var = this.f22340b;
        if (t90Var != null) {
            canvas.save();
            x1 x1Var = this.f22339a;
            canvas.translate(x1Var.getLeft(), x1Var.getTop());
            if (t90Var.f(canvas)) {
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
        accessibilityNodeInfo.setText(this.f22344r);
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
        this.f22342f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.f22341c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f22344r)) {
            this.f22344r = charSequence;
            x1 x1Var = this.f22339a;
            if (charSequence == null) {
                x1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            } else {
                x1Var.setPadding(0, AndroidUtilities.dp(this.e), 0, AndroidUtilities.dp(this.f22342f));
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
            x1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i10) {
        x1 x1Var = this.f22339a;
        ColorStateList linkTextColors = x1Var.getLinkTextColors();
        org.telegram.ui.ActionBar.r6.r(x1Var);
        org.telegram.ui.ActionBar.r6.I(x1Var, this.f22341c, this.f22345s);
        if (linkTextColors != null) {
            x1Var.setLinkTextColor(linkTextColors);
        }
        x1Var.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f22345s;
        x1 x1Var = this.f22339a;
        org.telegram.ui.ActionBar.r6.W(x1Var, i10, g6Var);
        x1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.f22339a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    @Override
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B6, this.f22345s);
            x1 x1Var = this.f22339a;
            if (x1Var != null && w02 != this.v) {
                this.v = w02;
                x1Var.setEmojiColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public e9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, 24, g6Var);
    }

    public e9(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22341c = org.telegram.ui.ActionBar.k6.J6;
        this.e = 10;
        this.f22342f = 17;
        this.f22345s = g6Var;
        t90 t90Var = new t90(this);
        this.f22340b = t90Var;
        x1 x1Var = new x1(this, context, t90Var, g6Var);
        this.f22339a = x1Var;
        x1Var.setTextSize(1, 14.0f);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        x1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.W(x1Var, i11, g6Var);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        this.v = w02;
        x1Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.r6.I(x1Var, this.f22341c, g6Var);
        x1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(x1Var, w7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.f22343n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b() {
    }
}
