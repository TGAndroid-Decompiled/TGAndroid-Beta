package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.tl.TL_iv;
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f45119a;
    public final g4 f45120b;
    public a3 f45121c;
    public final d2 d;
    public final e2 f45122e;
    public TL_iv.pageBlockPreformatted f45123f;
    public CharSequence h;
    public boolean f45124n;
    public int f45125r;
    public final Paint f45126s;

    public f2(Context context, final i50 i50Var, g4 g4Var) {
        super(context);
        this.f45126s = new Paint();
        this.f45119a = i50Var;
        this.f45120b = g4Var;
        d2 d2Var = new d2(this, context, i50Var);
        this.d = d2Var;
        d2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(d2Var, b8.mf.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, i50Var, g4Var);
        this.f45122e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = org.telegram.messenger.g0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = org.telegram.messenger.g0.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        org.telegram.messenger.hs.i(e2Var);
        d2Var.addView(e2Var, layoutParams);
        d2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i3, int i10, int i11, int i12) {
                org.telegram.ui.Cells.h9 h9Var = ((i4) i50.this).Q0;
                if (h9Var != null && h9Var.x()) {
                    h9Var.w();
                }
            }
        });
        setWillNotDraw(false);
    }

    public static void a(f2 f2Var, SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (f2Var.h == spannableString) {
            f2Var.f45122e.requestLayout();
            f2Var.invalidate();
        }
    }

    public static SpannableString b(f2 f2Var, CharSequence charSequence, String str) {
        char c2;
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = org.telegram.ui.Components.k80.f35339a;
        char[] cArr = new char[spannableString.length()];
        int i3 = 0;
        for (int i10 = 0; i10 <= spannableString.length(); i10++) {
            if (i10 >= spannableString.length() || spannableString.charAt(i10) == '\n') {
                int h = org.telegram.ui.Components.k80.h(i3, spannableString);
                for (int i11 = i3; i11 < i10; i11++) {
                    if (h != 3 && i11 != i3) {
                        c2 = spannableString.charAt(i11);
                    } else {
                        c2 = ' ';
                    }
                    cArr[i11] = c2;
                }
                if (i10 < spannableString.length()) {
                    cArr[i10] = '\n';
                }
                i3 = i10 + 1;
            }
        }
        String str2 = new String(cArr);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(13, f2Var, spannableString);
        oi.q qVar = oi.k.f21149a;
        if (str2.length() == spannableString.length()) {
            String b10 = oi.q.b(str);
            if (!b10.isEmpty() && !str2.isEmpty()) {
                oi.k.f21149a.d(str2, b10, new mi.d4(9, spannableString, l0Var));
            }
        }
        return spannableString;
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i3 = 0;
        while (i3 <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i3);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int h = org.telegram.ui.Components.k80.h(i3, spannableString);
            if (h != 1) {
                if (h != 2) {
                    if (h == 3 && indexOf > i3) {
                        spannableString.setSpan(new oi.d(6), i3, indexOf, 33);
                    }
                } else {
                    spannableString.setSpan(new oi.d(20), i3, i3 + 1, 33);
                }
            } else {
                spannableString.setSpan(new oi.d(19), i3, i3 + 1, 33);
            }
            i3 = indexOf + 1;
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f45121c == null) {
            return -1;
        }
        int k10 = this.f45121c.k() + org.telegram.messenger.g0.L(16.0f);
        this.f45119a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f45121c == null) {
            return -1;
        }
        int l10 = this.f45121c.l() + org.telegram.messenger.g0.L(16.0f);
        this.f45119a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f45121c == null) {
            return -1;
        }
        int m10 = this.f45121c.m() + org.telegram.messenger.g0.L(16.0f);
        this.f45119a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void invalidate() {
        this.f45122e.invalidate();
        super.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f45121c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f45121c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f45121c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        StaticLayout staticLayout;
        int i3;
        TL_iv.pageBlockPreformatted pageblockpreformatted = this.f45123f;
        if (pageblockpreformatted != null) {
            int i10 = 0;
            if (pageblockpreformatted.diff) {
                a3 a3Var = this.f45121c;
                if (a3Var != null && (staticLayout = a3Var.d) != null) {
                    CharSequence text = staticLayout.getText();
                    int top = this.f45122e.getTop() + this.d.getTop();
                    int lineCount = staticLayout.getLineCount();
                    for (int i11 = 0; i11 < lineCount; i11++) {
                        int h = org.telegram.ui.Components.k80.h(staticLayout.getLineStart(i11), text);
                        Paint paint = this.f45126s;
                        if (h == 1) {
                            paint.setColor(640993113);
                        } else if (h == 2) {
                            paint.setColor(654261040);
                        }
                        float lineTop = staticLayout.getLineTop(i11) + top;
                        float measuredWidth = getMeasuredWidth();
                        int lineBottom = staticLayout.getLineBottom(i11) + top;
                        if (i11 == lineCount - 1) {
                            i3 = this.f45125r;
                        } else {
                            i3 = 0;
                        }
                        canvas.drawRect(0.0f, lineTop, measuredWidth, lineBottom + i3, paint);
                    }
                    return;
                }
                return;
            }
            if (pageblockpreformatted.continuesPrev) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            float f10 = L;
            float measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!this.f45123f.continuesNext) {
                i10 = org.telegram.messenger.g0.L(8.0f);
            }
            canvas.drawRect(0.0f, f10, measuredWidth2, measuredHeight - i10, i4.f46068r1);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.f45121c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754871, i4.h(this.f45119a, this.f45120b, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d2 d2Var = this.d;
        d2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, d2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        int i3;
        int L;
        int L2;
        int L3;
        g4 g4Var;
        this.h = null;
        this.f45123f = pageblockpreformatted;
        this.f45124n = true;
        int i10 = 0;
        if (pageblockpreformatted.diff && (g4Var = this.f45120b) != null) {
            i3 = g4Var.I;
        } else {
            i3 = 0;
        }
        d2 d2Var = this.d;
        d2Var.setScrollX(i3);
        this.f45124n = false;
        d2Var.setHorizontalScrollBarEnabled(true ^ pageblockpreformatted.diff);
        if (pageblockpreformatted.continuesPrev) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        if (pageblockpreformatted.continuesNext) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(8.0f);
        }
        d2Var.setPadding(0, L, 0, L2);
        e2 e2Var = this.f45122e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e2Var.getLayoutParams();
        if (pageblockpreformatted.continuesPrev) {
            L3 = 0;
        } else {
            L3 = org.telegram.messenger.g0.L(12.0f);
        }
        marginLayoutParams.topMargin = L3;
        if (!pageblockpreformatted.continuesNext) {
            i10 = org.telegram.messenger.g0.L(12.0f);
        }
        marginLayoutParams.bottomMargin = i10;
        e2Var.requestLayout();
    }
}
