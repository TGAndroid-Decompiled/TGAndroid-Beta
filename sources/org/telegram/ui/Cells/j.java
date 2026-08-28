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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.qz0;
public abstract class j extends FrameLayout {
    public static final int T = AndroidUtilities.dp(76.0f);
    public static final int U = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final i80 A;
    public h B;
    public p80 C;
    public final org.telegram.ui.ActionBar.o2 D;
    public final org.telegram.ui.ActionBar.b6 E;
    public final FrameLayout F;
    public final z G;
    public StaticLayout H;
    public StaticLayout[] I;
    public int J;
    public Point[] K;
    public boolean L;
    public boolean M;
    public final float N;
    public final f O;
    public float P;
    public ValueAnimator Q;
    public int R;
    public boolean S;
    public StaticLayout f24529a;
    public String f24530b;
    public int f24531c;
    public int d;
    public SpannableStringBuilder f24532e;
    public SpannableStringBuilder f24533f;
    public final TextView h;
    public final c f24534n;
    public final FrameLayout f24535r;
    public final FrameLayout f24536s;
    public final Drawable v;
    public m80 f24537w;
    public float f24538x;
    public StaticLayout f24539y;

    public j(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        new Point();
        new f80(0);
        this.I = null;
        this.J = -1;
        this.L = false;
        Paint paint = new Paint();
        this.N = AndroidUtilities.dp(3.0f);
        this.O = new f(this);
        this.P = 0.0f;
        this.R = 0;
        this.S = false;
        this.E = b6Var;
        this.D = o2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.A = new i80(frameLayout);
        this.G = org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        ll.n(org.telegram.ui.ActionBar.f6.f23386z6, b6Var, textView, 1, 13.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24536s = frameLayout2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(mutate);
        addView(frameLayout2, g7.e6.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, g7.e6.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f24171a = false;
        this.f24534n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.DescriptionMore));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24535r = frameLayout3;
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(mutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView((View) textView2, g7.e6.c(-2.0f, -2));
        addView(frameLayout3, g7.e6.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i9, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.f6.P1, Math.max(1, i9)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = rv0.a();
            } else {
                Layout.Alignment[] alignmentArr = rv0.f32294a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.f6.P1, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i9) {
        f2.a1 a1Var = (f2.a1) getLayoutParams();
        boolean z10 = true;
        if (a1Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            a1Var = new f2.a1(-1, i9);
        } else {
            if (((ViewGroup.MarginLayoutParams) a1Var).height == i9) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) a1Var).height = i9;
        }
        if (z10) {
            setLayoutParams(a1Var);
        }
    }

    private void setShowMoreMarginBottom(int i9) {
        FrameLayout frameLayout = this.f24535r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i9) {
            layoutParams.bottomMargin = i9;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i9, boolean z10) {
        boolean z11;
        int i10;
        int height;
        boolean z12;
        float f10;
        int i11 = 0;
        if (this.M) {
            this.S = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f24532e;
        FrameLayout frameLayout = this.F;
        c cVar = this.f24534n;
        if (spannableStringBuilder != null && (i9 != this.R || z10)) {
            StaticLayout c10 = c(i9, spannableStringBuilder);
            this.f24529a = c10;
            if (c10.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.S = z11;
            int lineCount = this.f24529a.getLineCount();
            FrameLayout frameLayout2 = this.f24535r;
            if (lineCount >= 3 && this.S) {
                int max = Math.max(this.f24529a.getLineStart(2), this.f24529a.getLineEnd(2));
                if (this.f24532e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i12 = max - 1;
                if (this.f24532e.charAt(i12) != ' ' && this.f24532e.charAt(i12) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.L = z12;
                this.H = c(i9, this.f24532e.subSequence(0, max));
                this.I = new StaticLayout[this.f24529a.getLineCount() - 3];
                this.K = new Point[this.f24529a.getLineCount() - 3];
                float lineRight = this.H.getLineRight(this.H.getLineCount() - 1);
                boolean z13 = this.L;
                float f11 = this.N;
                if (z13) {
                    f10 = f11;
                } else {
                    f10 = 0.0f;
                }
                float f12 = lineRight + f10;
                this.J = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i13 = U;
                    frameLayout2.measure(i13, i13);
                }
                for (int i14 = 3; i14 < this.f24529a.getLineCount(); i14++) {
                    int lineStart = this.f24529a.getLineStart(i14);
                    int lineEnd = this.f24529a.getLineEnd(i14);
                    StaticLayout c11 = c(i9, this.f24532e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i15 = i14 - 3;
                    this.I[i15] = c11;
                    this.K[i15] = new Point();
                    if (this.J == -1) {
                        if (f12 > frameLayout2.getPaddingLeft() + (i9 - frameLayout2.getMeasuredWidth())) {
                            this.J = i15;
                        }
                    }
                    f12 += c11.getLineRight(0) + f11;
                }
                if (f12 < frameLayout2.getPaddingLeft() + (i9 - frameLayout2.getMeasuredWidth())) {
                    this.S = false;
                }
            }
            if (!this.S) {
                this.H = null;
                this.I = null;
            }
            this.R = i9;
            frameLayout.setMinimumHeight(g());
            if (this.S && this.H != null) {
                if (this.h.getVisibility() == 0) {
                    i10 = AndroidUtilities.dp(20.0f);
                } else {
                    i10 = 0;
                }
                int min = Math.min(T + i10, g()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.H;
                int lineBottom = ((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom();
                if (cVar.getLayout() == null) {
                    height = 0;
                } else {
                    height = cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1);
                }
                setShowMoreMarginBottom(lineBottom - height);
            }
        }
        if (!this.S) {
            i11 = 8;
        }
        cVar.setVisibility(i11);
        if (!this.S && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.G);
        }
        if (this.S && this.P < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final m80 b(StaticLayout staticLayout, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i14);
            float f10 = i13;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f10 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f10 && i14 >= 0 && i14 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    m80 m80Var = new m80(clickableSpanArr[0], this.E, i11, i12, 0);
                    m80Var.d(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, this.E));
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    f80 b10 = m80Var.b();
                    float f11 = i10;
                    this.f24538x = f11;
                    b10.d(staticLayout, spanStart, f11);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return m80Var;
                }
                return null;
            }
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f10) {
        h hVar = this.B;
        h hVar2 = null;
        if (hVar != null) {
            hVar.a(false);
            this.B = null;
        }
        if (layout != null && clickableSpan != null) {
            hVar2 = new h(this, layout, clickableSpan, f10);
        }
        this.B = hVar2;
        if (clickableSpan instanceof p41) {
            String url = ((p41) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            ((qz0) this).V.f43616e.B4(url, this.B);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (AndroidUtilities.shouldShowUrlInAlert(url2)) {
                org.telegram.ui.Components.y4.r0(this.D, url2, true, true, true, false, this.B, null, null);
                return;
            }
            ve.e.q(getContext(), Uri.parse(url2), true, true, this.B);
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
        this.A.d(true);
        this.f24537w = null;
        AndroidUtilities.cancelRunOnUIThread(this.O);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f24530b)) {
            try {
                this.f24530b = AndroidUtilities.getSafeString(str);
            } catch (Throwable unused) {
                this.f24530b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24530b);
            this.f24532e = spannableStringBuilder;
            this.f24533f = null;
            MessageObject.addLinks(false, spannableStringBuilder, false, false, !z10);
            Emoji.replaceEmoji(this.f24532e, org.telegram.ui.ActionBar.f6.P1.getFontMetricsInt(), false);
            if (this.R <= 0) {
                this.R = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
            }
            a(this.R, true);
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
                a(this.R, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int dp;
        StaticLayout staticLayout = this.f24529a;
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
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        float f10 = this.P;
        float g10 = g();
        float min = Math.min(T, g10);
        Math.abs(AndroidUtilities.lerp(min, g10, 1.0f) - AndroidUtilities.lerp(min, g10, f10));
        this.Q = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f18780a = 0.0f;
        obj.f18781b = 0.0f;
        this.Q.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, (o1.e) obj));
        this.Q.addListener(new mh.x(this, 10));
        this.Q.setDuration(Math.abs(f10 - 1.0f) * 1250.0f * 2.0f);
        this.Q.start();
    }

    public final int i() {
        int i9;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i9 = AndroidUtilities.dp(20.0f);
        } else {
            i9 = 0;
        }
        float min = Math.min(T + i9, g());
        if (this.S) {
            g10 = (int) AndroidUtilities.lerp(min, g10, this.P);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24529a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f24533f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f24532e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f24532e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new i(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f24533f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.f24532e;
                        this.f24533f = spannableStringBuilder;
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
    public final void onMeasure(int i9, int i10) {
        a(View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(36.0f), false);
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMoreButtonDisabled(boolean z10) {
        this.M = z10;
    }
}
