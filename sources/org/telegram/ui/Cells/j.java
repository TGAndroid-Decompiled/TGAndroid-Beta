package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x61;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
public abstract class j extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final int f24261c0 = AndroidUtilities.dp(76.0f);
    public static final int f24262d0 = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final w90 E;
    public h F;
    public da0 G;
    public final org.telegram.ui.ActionBar.r2 H;
    public final org.telegram.ui.ActionBar.u6 I;
    public final FrameLayout J;
    public final y K;
    public StaticLayout L;
    public StaticLayout[] M;
    public int N;
    public Point[] O;
    public boolean P;
    public boolean Q;
    public int R;
    public final Paint S;
    public final float T;
    public final f U;
    public float V;
    public ValueAnimator W;
    public StaticLayout f24263a;
    public int f24264a0;
    public String f24265b;
    public boolean f24266b0;
    public int f24267c;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f24268f;
    public final TextView h;
    public final c f24269n;
    public final FrameLayout f24270r;
    public final FrameLayout f24271s;
    public final Drawable v;
    public aa0 f24272w;
    public float f24273x;
    public StaticLayout f24274y;

    public j(Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        new Point();
        new s90(0);
        this.M = null;
        this.N = -1;
        this.P = false;
        Paint paint = new Paint();
        this.S = paint;
        this.T = AndroidUtilities.dp(3.0f);
        this.U = new f(this);
        this.V = 0.0f;
        this.f24264a0 = 0;
        this.f24266b0 = false;
        this.I = u6Var;
        this.H = r2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.E = new w90(frameLayout);
        this.K = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
        vh.r(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24271s = frameLayout2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, u6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(mutate);
        addView(frameLayout2, gb1.h(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, gb1.i(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f23917a = false;
        this.f24269n = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23540n6, u6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.DescriptionMore));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24270r = frameLayout3;
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = mutate2;
        org.telegram.ui.ActionBar.f7.y(this, mutate2, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(mutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView((View) textView2, gb1.g(-2.0f, -2));
        addView(frameLayout3, gb1.h(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.y6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = px0.a();
            } else {
                Layout.Alignment[] alignmentArr = px0.f31732a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.y6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i10) {
        s4.q0 q0Var = (s4.q0) getLayoutParams();
        boolean z10 = true;
        if (q0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            q0Var = new s4.q0(-1, i10);
        } else {
            if (((ViewGroup.MarginLayoutParams) q0Var).height == i10) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) q0Var).height = i10;
        }
        if (z10) {
            setLayoutParams(q0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.f24270r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i10) {
            layoutParams.bottomMargin = i10;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        int i11;
        int height;
        boolean z12;
        float f7;
        int i12 = 0;
        if (this.Q) {
            this.f24266b0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.J;
        c cVar = this.f24269n;
        if (spannableStringBuilder != null && (i10 != this.f24264a0 || z10)) {
            StaticLayout c10 = c(i10, spannableStringBuilder);
            this.f24263a = c10;
            if (c10.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f24266b0 = z11;
            int lineCount = this.f24263a.getLineCount();
            FrameLayout frameLayout2 = this.f24270r;
            if (lineCount >= 3 && this.f24266b0) {
                int max = Math.max(this.f24263a.getLineStart(2), this.f24263a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i13 = max - 1;
                if (this.e.charAt(i13) != ' ' && this.e.charAt(i13) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.P = z12;
                this.L = c(i10, this.e.subSequence(0, max));
                this.M = new StaticLayout[this.f24263a.getLineCount() - 3];
                this.O = new Point[this.f24263a.getLineCount() - 3];
                float lineRight = this.L.getLineRight(this.L.getLineCount() - 1);
                boolean z13 = this.P;
                float f10 = this.T;
                if (z13) {
                    f7 = f10;
                } else {
                    f7 = 0.0f;
                }
                float f11 = lineRight + f7;
                this.N = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i14 = f24262d0;
                    frameLayout2.measure(i14, i14);
                }
                for (int i15 = 3; i15 < this.f24263a.getLineCount(); i15++) {
                    int lineStart = this.f24263a.getLineStart(i15);
                    int lineEnd = this.f24263a.getLineEnd(i15);
                    StaticLayout c11 = c(i10, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i16 = i15 - 3;
                    this.M[i16] = c11;
                    this.O[i16] = new Point();
                    if (this.N == -1) {
                        if (f11 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.N = i16;
                        }
                    }
                    f11 += c11.getLineRight(0) + f10;
                }
                if (f11 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.f24266b0 = false;
                }
            }
            if (!this.f24266b0) {
                this.L = null;
                this.M = null;
            }
            this.f24264a0 = i10;
            frameLayout.setMinimumHeight(g());
            if (this.f24266b0 && this.L != null) {
                if (this.h.getVisibility() == 0) {
                    i11 = AndroidUtilities.dp(20.0f);
                } else {
                    i11 = 0;
                }
                int min = Math.min(f24261c0 + i11, g()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.L;
                int lineBottom = ((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom();
                if (cVar.getLayout() == null) {
                    height = 0;
                } else {
                    height = cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1);
                }
                setShowMoreMarginBottom(lineBottom - height);
            }
        }
        if (!this.f24266b0) {
            i12 = 8;
        }
        cVar.setVisibility(i12);
        if (!this.f24266b0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.K);
        }
        if (this.f24266b0 && this.V < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final aa0 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f7 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f7);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f7 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f7 && i15 >= 0 && i15 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    aa0 aa0Var = new aa0(clickableSpanArr[0], this.I, i12, i13, 0);
                    int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, this.I);
                    int i16 = ProfileActivity.R6;
                    aa0Var.d(w02);
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    s90 b10 = aa0Var.b();
                    float f10 = i11;
                    this.f24273x = f10;
                    b10.d(staticLayout, spanStart, f10);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return aa0Var;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f7) {
        h hVar = this.F;
        h hVar2 = null;
        if (hVar != null) {
            hVar.a(false);
            this.F = null;
        }
        if (layout != null && clickableSpan != null) {
            hVar2 = new h(this, layout, clickableSpan, f7);
        }
        this.F = hVar2;
        if (clickableSpan instanceof x61) {
            String url = ((x61) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            h hVar3 = this.F;
            ProfileActivity profileActivity = ((e01) this).f38963e0.e;
            int i10 = ProfileActivity.R6;
            profileActivity.J4(url, hVar3);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (AndroidUtilities.shouldShowUrlInAlert(url2)) {
                org.telegram.ui.Components.g5.q0(this.H, url2, true, true, true, false, this.F, null, null);
                return;
            }
            qf.d.p(getContext(), Uri.parse(url2), true, true, this.F);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.E.d(true);
        this.f24272w = null;
        AndroidUtilities.cancelRunOnUIThread(this.U);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f24265b)) {
            try {
                this.f24265b = AndroidUtilities.getSafeString(str);
            } catch (Throwable unused) {
                this.f24265b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24265b);
            this.e = spannableStringBuilder;
            this.f24268f = null;
            MessageObject.addLinks(false, spannableStringBuilder, false, false, !z10);
            Emoji.replaceEmoji(this.e, org.telegram.ui.ActionBar.y6.P1.getFontMetricsInt(), false);
            if (this.f24264a0 <= 0) {
                this.f24264a0 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
            }
            a(this.f24264a0, true);
            i();
            TextView textView = this.h;
            int visibility = textView.getVisibility();
            if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str2);
                textView.setVisibility(0);
            }
            if (visibility != textView.getVisibility()) {
                a(this.f24264a0, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int dp;
        StaticLayout staticLayout = this.f24263a;
        if (staticLayout != null) {
            dp = staticLayout.getHeight();
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        int dp2 = AndroidUtilities.dp(16.0f) + dp;
        if (this.h.getVisibility() == 0) {
            return AndroidUtilities.dp(23.0f) + dp2;
        }
        return dp2;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W = null;
        }
        float f7 = this.V;
        float g7 = g();
        float min = Math.min(f24261c0, g7);
        Math.abs(AndroidUtilities.lerp(min, g7, 1.0f) - AndroidUtilities.lerp(min, g7, f7));
        this.W = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f18950a = 0.0f;
        obj.f18951b = 0.0f;
        this.W.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f7)), f7, 1.0f, (o1.e) obj));
        this.W.addListener(new kg.e(this, 11));
        this.W.setDuration(Math.abs(f7 - 1.0f) * 1250.0f * 2.0f);
        this.W.start();
    }

    public final int i() {
        int i10;
        int g7 = g();
        if (this.h.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        float min = Math.min(f24261c0 + i10, g());
        if (this.f24266b0) {
            g7 = (int) AndroidUtilities.lerp(min, g7, this.V);
        }
        setHeight(g7);
        return g7;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24263a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f24268f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new i(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f24268f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.e;
                        this.f24268f = spannableStringBuilder;
                    }
                }
            }
            CharSequence text = this.h.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(spannableStringBuilder);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", spannableStringBuilder));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f), false);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMoreButtonDisabled(boolean z10) {
        this.Q = z10;
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.y6.P1;
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.u6 u6Var = this.I;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i11 = ProfileActivity.R6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var);
            y yVar = this.K;
            if (yVar != null && w03 != this.R) {
                this.R = w03;
                org.telegram.ui.ActionBar.y6.E1(yVar, w03, true);
            }
            this.S.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, u6Var));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
