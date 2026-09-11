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
import org.telegram.messenger.vl;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.x80;
import org.telegram.ui.v01;
public abstract class j extends FrameLayout {
    public static final int f22139a0 = AndroidUtilities.dp(76.0f);
    public static final int f22140b0 = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final a90 E;
    public h F;
    public h90 G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final org.telegram.ui.ActionBar.f6 I;
    public final FrameLayout J;
    public final z K;
    public StaticLayout L;
    public StaticLayout[] M;
    public int N;
    public Point[] O;
    public boolean P;
    public boolean Q;
    public final float R;
    public final f S;
    public float T;
    public ValueAnimator U;
    public int V;
    public boolean W;
    public StaticLayout f22141a;
    public String f22142b;
    public int f22143c;
    public int d;
    public SpannableStringBuilder f22144e;
    public SpannableStringBuilder f22145f;
    public final TextView h;
    public final c f22146n;
    public final FrameLayout f22147r;
    public final FrameLayout f22148s;
    public final Drawable v;
    public e90 f22149w;
    public float f22150x;
    public StaticLayout f22151y;

    public j(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        new Point();
        new x80(0);
        this.M = null;
        this.N = -1;
        this.P = false;
        Paint paint = new Paint();
        this.R = AndroidUtilities.dp(3.0f);
        this.S = new f(this);
        this.T = 0.0f;
        this.V = 0;
        this.W = false;
        this.I = f6Var;
        this.H = n2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.E = new a90(frameLayout);
        this.K = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        vl.n(org.telegram.ui.ActionBar.j6.f21061z6, f6Var, textView, 1, 13.0f);
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
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f22148s = frameLayout2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.f20663d6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(mutate);
        addView(frameLayout2, w7.x5.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, w7.x5.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f21663a = false;
        this.f22146n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20846n6, f6Var));
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.DescriptionMore));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22147r = frameLayout3;
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(mutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView((View) textView2, w7.x5.c(-2.0f, -2));
        addView(frameLayout3, w7.x5.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.j6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = iw0.a();
            } else {
                Layout.Alignment[] alignmentArr = iw0.f27279a;
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
        s4.p0 p0Var = (s4.p0) getLayoutParams();
        boolean z10 = true;
        if (p0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            p0Var = new s4.p0(-1, i10);
        } else {
            if (((ViewGroup.MarginLayoutParams) p0Var).height == i10) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) p0Var).height = i10;
        }
        if (z10) {
            setLayoutParams(p0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.f22147r;
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
            this.W = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f22144e;
        FrameLayout frameLayout = this.J;
        c cVar = this.f22146n;
        if (spannableStringBuilder != null && (i10 != this.V || z10)) {
            StaticLayout c10 = c(i10, spannableStringBuilder);
            this.f22141a = c10;
            if (c10.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W = z11;
            int lineCount = this.f22141a.getLineCount();
            FrameLayout frameLayout2 = this.f22147r;
            if (lineCount >= 3 && this.W) {
                int max = Math.max(this.f22141a.getLineStart(2), this.f22141a.getLineEnd(2));
                if (this.f22144e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i13 = max - 1;
                if (this.f22144e.charAt(i13) != ' ' && this.f22144e.charAt(i13) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.P = z12;
                this.L = c(i10, this.f22144e.subSequence(0, max));
                this.M = new StaticLayout[this.f22141a.getLineCount() - 3];
                this.O = new Point[this.f22141a.getLineCount() - 3];
                float lineRight = this.L.getLineRight(this.L.getLineCount() - 1);
                boolean z13 = this.P;
                float f10 = this.R;
                if (z13) {
                    f7 = f10;
                } else {
                    f7 = 0.0f;
                }
                float f11 = lineRight + f7;
                this.N = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i14 = f22140b0;
                    frameLayout2.measure(i14, i14);
                }
                for (int i15 = 3; i15 < this.f22141a.getLineCount(); i15++) {
                    int lineStart = this.f22141a.getLineStart(i15);
                    int lineEnd = this.f22141a.getLineEnd(i15);
                    StaticLayout c11 = c(i10, this.f22144e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
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
                    this.W = false;
                }
            }
            if (!this.W) {
                this.L = null;
                this.M = null;
            }
            this.V = i10;
            frameLayout.setMinimumHeight(g());
            if (this.W && this.L != null) {
                if (this.h.getVisibility() == 0) {
                    i11 = AndroidUtilities.dp(20.0f);
                } else {
                    i11 = 0;
                }
                int min = Math.min(f22139a0 + i11, g()) - AndroidUtilities.dp(8.0f);
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
        if (!this.W) {
            i12 = 8;
        }
        cVar.setVisibility(i12);
        if (!this.W && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.K);
        }
        if (this.W && this.T < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final e90 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
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
                    e90 e90Var = new e90(clickableSpanArr[0], this.I, i12, i13, 0);
                    e90Var.d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.I));
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    x80 b10 = e90Var.b();
                    float f10 = i11;
                    this.f22150x = f10;
                    b10.d(staticLayout, spanStart, f10);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return e90Var;
                }
                return null;
            }
            return null;
        } catch (Exception e7) {
            FileLog.e(e7);
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
        if (clickableSpan instanceof l51) {
            String url = ((l51) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            ((v01) this).f41376c0.f34291e.B4(url, this.F);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (AndroidUtilities.shouldShowUrlInAlert(url2)) {
                org.telegram.ui.Components.e5.r0(this.H, url2, true, true, true, false, this.F, null, null);
                return;
            }
            of.f.q(getContext(), Uri.parse(url2), true, true, this.F);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.E.d(true);
        this.f22149w = null;
        AndroidUtilities.cancelRunOnUIThread(this.S);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f22142b)) {
            try {
                this.f22142b = AndroidUtilities.getSafeString(str);
            } catch (Throwable unused) {
                this.f22142b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22142b);
            this.f22144e = spannableStringBuilder;
            this.f22145f = null;
            MessageObject.addLinks(false, spannableStringBuilder, false, false, !z10);
            Emoji.replaceEmoji(this.f22144e, org.telegram.ui.ActionBar.j6.P1.getFontMetricsInt(), false);
            if (this.V <= 0) {
                this.V = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
            }
            a(this.V, true);
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
                a(this.V, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int dp;
        StaticLayout staticLayout = this.f22141a;
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
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        float f7 = this.T;
        float g10 = g();
        float min = Math.min(f22139a0, g10);
        Math.abs(AndroidUtilities.lerp(min, g10, 1.0f) - AndroidUtilities.lerp(min, g10, f7));
        this.U = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f16804a = 0.0f;
        obj.f16805b = 0.0f;
        this.U.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f7)), f7, 1.0f, (o1.e) obj));
        this.U.addListener(new org.telegram.ui.s0(this, 7));
        this.U.setDuration(Math.abs(f7 - 1.0f) * 1250.0f * 2.0f);
        this.U.start();
    }

    public final int i() {
        int i10;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        float min = Math.min(f22139a0 + i10, g());
        if (this.W) {
            g10 = (int) AndroidUtilities.lerp(min, g10, this.T);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22141a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f22145f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f22144e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f22144e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new i(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f22145f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.f22144e;
                        this.f22145f = spannableStringBuilder;
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
}
