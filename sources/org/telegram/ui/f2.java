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
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.j9, c3 {
    public final l60 f36972a;
    public final f4 f36973b;
    public z2 f36974c;
    public final d2 d;
    public final e2 e;
    public TL_iv.pageBlockPreformatted f36975f;
    public CharSequence h;
    public boolean f36976n;
    public int f36977r;
    public final Paint f36978s;

    public f2(Context context, final l60 l60Var, f4 f4Var) {
        super(context);
        this.f36978s = new Paint();
        this.f36972a = l60Var;
        this.f36973b = f4Var;
        d2 d2Var = new d2(this, context, l60Var);
        this.d = d2Var;
        d2Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        addView(d2Var, w7.b6.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, l60Var, f4Var);
        this.e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = org.telegram.messenger.i0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = org.telegram.messenger.i0.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        org.telegram.messenger.at.i(e2Var);
        d2Var.addView(e2Var, layoutParams);
        d2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                org.telegram.ui.Cells.k9 k9Var = ((h4) l60.this).P0;
                if (k9Var != null && k9Var.x()) {
                    k9Var.w();
                }
            }
        });
        setWillNotDraw(false);
    }

    public static void a(f2 f2Var, SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (f2Var.h == spannableString) {
            f2Var.e.requestLayout();
            f2Var.invalidate();
        }
    }

    public static SpannableString b(f2 f2Var, CharSequence charSequence, String str) {
        char c10;
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = org.telegram.ui.Components.g90.f26367a;
        char[] cArr = new char[spannableString.length()];
        int i10 = 0;
        for (int i11 = 0; i11 <= spannableString.length(); i11++) {
            if (i11 >= spannableString.length() || spannableString.charAt(i11) == '\n') {
                int h = org.telegram.ui.Components.g90.h(i10, spannableString);
                for (int i12 = i10; i12 < i11; i12++) {
                    if (h != 3 && i12 != i10) {
                        c10 = spannableString.charAt(i12);
                    } else {
                        c10 = ' ';
                    }
                    cArr[i12] = c10;
                }
                if (i11 < spannableString.length()) {
                    cArr[i11] = '\n';
                }
                i10 = i11 + 1;
            }
        }
        String str2 = new String(cArr);
        h0 h0Var = new h0(2, f2Var, spannableString);
        di.s sVar = di.l.f5973a;
        if (str2.length() == spannableString.length()) {
            String b10 = di.s.b(str);
            if (!b10.isEmpty() && !str2.isEmpty()) {
                di.l.f5973a.d(str2, b10, new ag.m(9, spannableString, h0Var));
            }
        }
        return spannableString;
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i10 = 0;
        while (i10 <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i10);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int h = org.telegram.ui.Components.g90.h(i10, spannableString);
            if (h != 1) {
                if (h != 2) {
                    if (h == 3 && indexOf > i10) {
                        spannableString.setSpan(new di.e(6), i10, indexOf, 33);
                    }
                } else {
                    spannableString.setSpan(new di.e(20), i10, i10 + 1, 33);
                }
            } else {
                spannableString.setSpan(new di.e(19), i10, i10 + 1, 33);
            }
            i10 = indexOf + 1;
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f36974c == null) {
            return -1;
        }
        int k10 = this.f36974c.k() + org.telegram.messenger.i0.L(16.0f);
        this.f36972a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f36974c == null) {
            return -1;
        }
        int l4 = this.f36974c.l() + org.telegram.messenger.i0.L(16.0f);
        this.f36972a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f36974c == null) {
            return -1;
        }
        int m10 = this.f36974c.m() + org.telegram.messenger.i0.L(16.0f);
        this.f36972a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f36974c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f36974c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f36974c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        StaticLayout staticLayout;
        int i10;
        TL_iv.pageBlockPreformatted pageblockpreformatted = this.f36975f;
        if (pageblockpreformatted != null) {
            int i11 = 0;
            if (pageblockpreformatted.diff) {
                z2 z2Var = this.f36974c;
                if (z2Var != null && (staticLayout = z2Var.d) != null) {
                    CharSequence text = staticLayout.getText();
                    int top = this.e.getTop() + this.d.getTop();
                    int lineCount = staticLayout.getLineCount();
                    for (int i12 = 0; i12 < lineCount; i12++) {
                        int h = org.telegram.ui.Components.g90.h(staticLayout.getLineStart(i12), text);
                        Paint paint = this.f36978s;
                        if (h == 1) {
                            paint.setColor(640993113);
                        } else if (h == 2) {
                            paint.setColor(654261040);
                        }
                        float lineTop = staticLayout.getLineTop(i12) + top;
                        float measuredWidth = getMeasuredWidth();
                        int lineBottom = staticLayout.getLineBottom(i12) + top;
                        if (i12 == lineCount - 1) {
                            i10 = this.f36977r;
                        } else {
                            i10 = 0;
                        }
                        canvas.drawRect(0.0f, lineTop, measuredWidth, lineBottom + i10, paint);
                    }
                    return;
                }
                return;
            }
            if (pageblockpreformatted.continuesPrev) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(8.0f);
            }
            float f7 = L;
            float measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!this.f36975f.continuesNext) {
                i11 = org.telegram.messenger.i0.L(8.0f);
            }
            canvas.drawRect(0.0f, f7, measuredWidth2, measuredHeight - i11, h4.f37660q1);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.f36974c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754871, h4.h(this.f36972a, this.f36973b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d2 d2Var = this.d;
        d2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, d2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        int i10;
        int L;
        int L2;
        int L3;
        f4 f4Var;
        this.h = null;
        this.f36975f = pageblockpreformatted;
        this.f36976n = true;
        int i11 = 0;
        if (pageblockpreformatted.diff && (f4Var = this.f36973b) != null) {
            i10 = f4Var.H;
        } else {
            i10 = 0;
        }
        d2 d2Var = this.d;
        d2Var.setScrollX(i10);
        this.f36976n = false;
        d2Var.setHorizontalScrollBarEnabled(true ^ pageblockpreformatted.diff);
        if (pageblockpreformatted.continuesPrev) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(8.0f);
        }
        if (pageblockpreformatted.continuesNext) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.i0.L(8.0f);
        }
        d2Var.setPadding(0, L, 0, L2);
        e2 e2Var = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e2Var.getLayoutParams();
        if (pageblockpreformatted.continuesPrev) {
            L3 = 0;
        } else {
            L3 = org.telegram.messenger.i0.L(12.0f);
        }
        marginLayoutParams.topMargin = L3;
        if (!pageblockpreformatted.continuesNext) {
            i11 = org.telegram.messenger.i0.L(12.0f);
        }
        marginLayoutParams.bottomMargin = i11;
        e2Var.requestLayout();
    }
}
