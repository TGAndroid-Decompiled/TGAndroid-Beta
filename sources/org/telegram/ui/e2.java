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
public final class e2 extends FrameLayout implements org.telegram.ui.Cells.h9, c3 {
    public final o50 f45171a;
    public final e4 f45172b;
    public z2 f45173c;
    public final c2 d;
    public final d2 f45174e;
    public TL_iv.pageBlockPreformatted f45175f;
    public CharSequence h;
    public boolean f45176n;
    public int f45177r;
    public final Paint f45178s;

    public e2(Context context, final o50 o50Var, e4 e4Var) {
        super(context);
        this.f45178s = new Paint();
        this.f45171a = o50Var;
        this.f45172b = e4Var;
        c2 c2Var = new c2(this, context, o50Var);
        this.d = c2Var;
        c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(c2Var, c8.ha.c(-2.0f, -1));
        d2 d2Var = new d2(this, context, o50Var, e4Var);
        this.f45174e = d2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = org.telegram.messenger.g0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = org.telegram.messenger.g0.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        org.telegram.messenger.qs.i(d2Var);
        c2Var.addView(d2Var, layoutParams);
        c2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i7, int i10, int i11, int i12) {
                org.telegram.ui.Cells.i9 i9Var = ((g4) o50.this).P0;
                if (i9Var != null && i9Var.x()) {
                    i9Var.w();
                }
            }
        });
        setWillNotDraw(false);
    }

    public static void a(e2 e2Var, SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (e2Var.h == spannableString) {
            e2Var.f45174e.requestLayout();
            e2Var.invalidate();
        }
    }

    public static SpannableString b(e2 e2Var, CharSequence charSequence, String str) {
        char c10;
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = org.telegram.ui.Components.n80.f36265a;
        char[] cArr = new char[spannableString.length()];
        int i7 = 0;
        for (int i10 = 0; i10 <= spannableString.length(); i10++) {
            if (i10 >= spannableString.length() || spannableString.charAt(i10) == '\n') {
                int h = org.telegram.ui.Components.n80.h(i7, spannableString);
                for (int i11 = i7; i11 < i10; i11++) {
                    if (h != 3 && i11 != i7) {
                        c10 = spannableString.charAt(i11);
                    } else {
                        c10 = ' ';
                    }
                    cArr[i11] = c10;
                }
                if (i10 < spannableString.length()) {
                    cArr[i10] = '\n';
                }
                i7 = i10 + 1;
            }
        }
        String str2 = new String(cArr);
        org.telegram.ui.ActionBar.p pVar = new org.telegram.ui.ActionBar.p(8, e2Var, spannableString);
        ni.s sVar = ni.m.f20635a;
        if (str2.length() == spannableString.length()) {
            String b10 = ni.s.b(str);
            if (!b10.isEmpty() && !str2.isEmpty()) {
                ni.m.f20635a.d(str2, b10, new zh.i3(spannableString, pVar));
            }
        }
        return spannableString;
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i7 = 0;
        while (i7 <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i7);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int h = org.telegram.ui.Components.n80.h(i7, spannableString);
            if (h != 1) {
                if (h != 2) {
                    if (h == 3 && indexOf > i7) {
                        spannableString.setSpan(new ni.f(6), i7, indexOf, 33);
                    }
                } else {
                    spannableString.setSpan(new ni.f(20), i7, i7 + 1, 33);
                }
            } else {
                spannableString.setSpan(new ni.f(19), i7, i7 + 1, 33);
            }
            i7 = indexOf + 1;
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f45173c == null) {
            return -1;
        }
        int k10 = this.f45173c.k() + org.telegram.messenger.g0.L(16.0f);
        this.f45171a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f45173c == null) {
            return -1;
        }
        int l10 = this.f45173c.l() + org.telegram.messenger.g0.L(16.0f);
        this.f45171a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f45173c == null) {
            return -1;
        }
        int m10 = this.f45173c.m() + org.telegram.messenger.g0.L(16.0f);
        this.f45171a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void invalidate() {
        this.f45174e.invalidate();
        super.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f45173c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f45173c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f45173c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        StaticLayout staticLayout;
        int i7;
        TL_iv.pageBlockPreformatted pageblockpreformatted = this.f45175f;
        if (pageblockpreformatted != null) {
            int i10 = 0;
            if (pageblockpreformatted.diff) {
                z2 z2Var = this.f45173c;
                if (z2Var != null && (staticLayout = z2Var.d) != null) {
                    CharSequence text = staticLayout.getText();
                    int top = this.f45174e.getTop() + this.d.getTop();
                    int lineCount = staticLayout.getLineCount();
                    for (int i11 = 0; i11 < lineCount; i11++) {
                        int h = org.telegram.ui.Components.n80.h(staticLayout.getLineStart(i11), text);
                        Paint paint = this.f45178s;
                        if (h == 1) {
                            paint.setColor(640993113);
                        } else if (h == 2) {
                            paint.setColor(654261040);
                        }
                        float lineTop = staticLayout.getLineTop(i11) + top;
                        float measuredWidth = getMeasuredWidth();
                        int lineBottom = staticLayout.getLineBottom(i11) + top;
                        if (i11 == lineCount - 1) {
                            i7 = this.f45177r;
                        } else {
                            i7 = 0;
                        }
                        canvas.drawRect(0.0f, lineTop, measuredWidth, lineBottom + i7, paint);
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
            if (!this.f45175f.continuesNext) {
                i10 = org.telegram.messenger.g0.L(8.0f);
            }
            canvas.drawRect(0.0f, f10, measuredWidth2, measuredHeight - i10, g4.f45788q1);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.f45173c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754871, g4.h(this.f45171a, this.f45172b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        c2 c2Var = this.d;
        c2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, c2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        int i7;
        int L;
        int L2;
        int L3;
        e4 e4Var;
        this.h = null;
        this.f45175f = pageblockpreformatted;
        this.f45176n = true;
        int i10 = 0;
        if (pageblockpreformatted.diff && (e4Var = this.f45172b) != null) {
            i7 = e4Var.H;
        } else {
            i7 = 0;
        }
        c2 c2Var = this.d;
        c2Var.setScrollX(i7);
        this.f45176n = false;
        c2Var.setHorizontalScrollBarEnabled(true ^ pageblockpreformatted.diff);
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
        c2Var.setPadding(0, L, 0, L2);
        d2 d2Var = this.f45174e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d2Var.getLayoutParams();
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
        d2Var.requestLayout();
    }
}
