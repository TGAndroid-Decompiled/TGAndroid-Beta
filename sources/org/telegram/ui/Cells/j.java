package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.y80;
import org.telegram.ui.b01;
public abstract class j extends FrameLayout {
    public static final int U = AndroidUtilities.dp(76.0f);
    public static final int V = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final b90 B;
    public h C;
    public i90 D;
    public final org.telegram.ui.ActionBar.p2 E;
    public final org.telegram.ui.ActionBar.f6 F;
    public final FrameLayout G;
    public final z H;
    public StaticLayout I;
    public StaticLayout[] J;
    public int K;
    public Point[] L;
    public boolean M;
    public boolean N;
    public final float O;
    public final f P;
    public float Q;
    public ValueAnimator R;
    public int S;
    public boolean T;
    public StaticLayout f21230a;
    public String f21231b;
    public int f21232c;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f21233f;
    public final TextView h;
    public final c f21234n;
    public final FrameLayout f21235r;
    public final FrameLayout f21236s;
    public final Drawable v;
    public f90 f21237w;
    public float f21238x;
    public StaticLayout f21239y;

    public j(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        new Point();
        new y80(0);
        this.J = null;
        this.K = -1;
        this.M = false;
        Paint paint = new Paint();
        this.O = AndroidUtilities.dp(3.0f);
        this.P = new f(this);
        this.Q = 0.0f;
        this.S = 0;
        this.T = false;
        this.F = f6Var;
        this.E = p2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.G = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.B = new b90(frameLayout);
        this.H = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20298z6, f6Var, textView, 1, 13.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f21236s = frameLayout2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(mutate);
        addView(frameLayout2, k7.b6.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, k7.b6.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f20892a = false;
        this.f21234n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var));
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.DescriptionMore));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f21235r = frameLayout3;
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(mutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView((View) textView2, k7.b6.c(-2.0f, -2));
        addView(frameLayout3, k7.b6.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.j6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = kw0.a();
            } else {
                Layout.Alignment[] alignmentArr = kw0.f26394a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.j6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i10) {
        f2.w0 w0Var = (f2.w0) getLayoutParams();
        boolean z4 = true;
        if (w0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            w0Var = new f2.w0(-1, i10);
        } else {
            if (((ViewGroup.MarginLayoutParams) w0Var).height == i10) {
                z4 = false;
            }
            ((ViewGroup.MarginLayoutParams) w0Var).height = i10;
        }
        if (z4) {
            setLayoutParams(w0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.f21235r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i10) {
            layoutParams.bottomMargin = i10;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i10, boolean z4) {
        boolean z10;
        int i11;
        int height;
        boolean z11;
        float f10;
        int i12 = 0;
        if (this.N) {
            this.T = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.G;
        c cVar = this.f21234n;
        if (spannableStringBuilder != null && (i10 != this.S || z4)) {
            StaticLayout c3 = c(i10, spannableStringBuilder);
            this.f21230a = c3;
            if (c3.getLineCount() >= 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T = z10;
            int lineCount = this.f21230a.getLineCount();
            FrameLayout frameLayout2 = this.f21235r;
            if (lineCount >= 3 && this.T) {
                int max = Math.max(this.f21230a.getLineStart(2), this.f21230a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i13 = max - 1;
                if (this.e.charAt(i13) != ' ' && this.e.charAt(i13) != '\n') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.M = z11;
                this.I = c(i10, this.e.subSequence(0, max));
                this.J = new StaticLayout[this.f21230a.getLineCount() - 3];
                this.L = new Point[this.f21230a.getLineCount() - 3];
                float lineRight = this.I.getLineRight(this.I.getLineCount() - 1);
                boolean z12 = this.M;
                float f11 = this.O;
                if (z12) {
                    f10 = f11;
                } else {
                    f10 = 0.0f;
                }
                float f12 = lineRight + f10;
                this.K = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i14 = V;
                    frameLayout2.measure(i14, i14);
                }
                for (int i15 = 3; i15 < this.f21230a.getLineCount(); i15++) {
                    int lineStart = this.f21230a.getLineStart(i15);
                    int lineEnd = this.f21230a.getLineEnd(i15);
                    StaticLayout c10 = c(i10, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i16 = i15 - 3;
                    this.J[i16] = c10;
                    this.L[i16] = new Point();
                    if (this.K == -1) {
                        if (f12 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.K = i16;
                        }
                    }
                    f12 += c10.getLineRight(0) + f11;
                }
                if (f12 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.T = false;
                }
            }
            if (!this.T) {
                this.I = null;
                this.J = null;
            }
            this.S = i10;
            frameLayout.setMinimumHeight(g());
            if (this.T && this.I != null) {
                if (this.h.getVisibility() == 0) {
                    i11 = AndroidUtilities.dp(20.0f);
                } else {
                    i11 = 0;
                }
                int min = Math.min(U + i11, g()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.I;
                int lineBottom = ((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom();
                if (cVar.getLayout() == null) {
                    height = 0;
                } else {
                    height = cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1);
                }
                setShowMoreMarginBottom(lineBottom - height);
            }
        }
        if (!this.T) {
            i12 = 8;
        }
        cVar.setVisibility(i12);
        if (!this.T && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.H);
        }
        if (this.T && this.Q < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final f90 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f10 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f10 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f10 && i15 >= 0 && i15 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    f90 f90Var = new f90(clickableSpanArr[0], this.F, i12, i13, 0);
                    f90Var.d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.F));
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    y80 b10 = f90Var.b();
                    float f11 = i11;
                    this.f21238x = f11;
                    b10.d(staticLayout, spanStart, f11);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return f90Var;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f10) {
        h hVar = this.C;
        h hVar2 = null;
        if (hVar != null) {
            hVar.a(false);
            this.C = null;
        }
        if (layout != null && clickableSpan != null) {
            hVar2 = new h(this, layout, clickableSpan, f10);
        }
        this.C = hVar2;
        if (clickableSpan instanceof m51) {
            String url = ((m51) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            ((b01) this).W.e.B4(url, this.C);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (AndroidUtilities.shouldShowUrlInAlert(url2)) {
                org.telegram.ui.Components.z4.r0(this.E, url2, true, true, true, false, this.C, null, null);
                return;
            }
            af.g.q(getContext(), Uri.parse(url2), true, true, this.C);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.B.d(true);
        this.f21237w = null;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        invalidate();
    }

    public final void f(String str, String str2, boolean z4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f21231b)) {
            try {
                this.f21231b = AndroidUtilities.getSafeString(str);
            } catch (Throwable unused) {
                this.f21231b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21231b);
            this.e = spannableStringBuilder;
            this.f21233f = null;
            MessageObject.addLinks(false, spannableStringBuilder, false, false, !z4);
            Emoji.replaceEmoji(this.e, org.telegram.ui.ActionBar.j6.P1.getFontMetricsInt(), false);
            if (this.S <= 0) {
                this.S = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
            }
            a(this.S, true);
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
                a(this.S, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int dp;
        StaticLayout staticLayout = this.f21230a;
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
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R = null;
        }
        float f10 = this.Q;
        float g10 = g();
        float min = Math.min(U, g10);
        Math.abs(AndroidUtilities.lerp(min, g10, 1.0f) - AndroidUtilities.lerp(min, g10, f10));
        this.R = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f16179a = 0.0f;
        obj.f16180b = 0.0f;
        this.R.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, (o1.e) obj));
        this.R.addListener(new org.telegram.ui.s5(this, 3));
        this.R.setDuration(Math.abs(f10 - 1.0f) * 1250.0f * 2.0f);
        this.R.start();
    }

    public final int i() {
        int i10;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        float min = Math.min(U + i10, g());
        if (this.T) {
            g10 = (int) AndroidUtilities.lerp(min, g10, this.Q);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21230a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f21233f;
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
                        this.f21233f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.e;
                        this.f21233f = spannableStringBuilder;
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

    public void setMoreButtonDisabled(boolean z4) {
        this.N = z4;
    }
}
