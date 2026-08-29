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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;
import org.telegram.ui.qz0;
public abstract class j extends FrameLayout {
    public static final int T = AndroidUtilities.dp(76.0f);
    public static final int U = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final v80 A;
    public h B;
    public c90 C;
    public final org.telegram.ui.ActionBar.o2 D;
    public final org.telegram.ui.ActionBar.c6 E;
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
    public StaticLayout f24517a;
    public String f24518b;
    public int f24519c;
    public int d;
    public SpannableStringBuilder f24520e;
    public SpannableStringBuilder f24521f;
    public final TextView h;
    public final c f24522n;
    public final FrameLayout f24523r;
    public final FrameLayout f24524s;
    public final Drawable v;
    public z80 f24525w;
    public float f24526x;
    public StaticLayout f24527y;

    public j(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        new Point();
        new s80(0);
        this.I = null;
        this.J = -1;
        this.L = false;
        Paint paint = new Paint();
        this.N = AndroidUtilities.dp(3.0f);
        this.O = new f(this);
        this.P = 0.0f;
        this.R = 0;
        this.S = false;
        this.E = c6Var;
        this.D = o2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.A = new v80(frameLayout);
        this.G = org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23450z6, c6Var, textView, 1, 13.0f);
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
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24524s = frameLayout2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(mutate);
        addView(frameLayout2, i7.f6.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, i7.f6.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f24138a = false;
        this.f24522n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var));
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.DescriptionMore));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24523r = frameLayout3;
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(mutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView((View) textView2, i7.f6.c(-2.0f, -2));
        addView(frameLayout3, i7.f6.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.g6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = bw0.a();
            } else {
                Layout.Alignment[] alignmentArr = bw0.f27242a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.g6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i10) {
        f2.x0 x0Var = (f2.x0) getLayoutParams();
        boolean z10 = true;
        if (x0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            x0Var = new f2.x0(-1, i10);
        } else {
            if (((ViewGroup.MarginLayoutParams) x0Var).height == i10) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) x0Var).height = i10;
        }
        if (z10) {
            setLayoutParams(x0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.f24523r;
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
        float f9;
        int i12 = 0;
        if (this.M) {
            this.S = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f24520e;
        FrameLayout frameLayout = this.F;
        c cVar = this.f24522n;
        if (spannableStringBuilder != null && (i10 != this.R || z10)) {
            StaticLayout c3 = c(i10, spannableStringBuilder);
            this.f24517a = c3;
            if (c3.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.S = z11;
            int lineCount = this.f24517a.getLineCount();
            FrameLayout frameLayout2 = this.f24523r;
            if (lineCount >= 3 && this.S) {
                int max = Math.max(this.f24517a.getLineStart(2), this.f24517a.getLineEnd(2));
                if (this.f24520e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i13 = max - 1;
                if (this.f24520e.charAt(i13) != ' ' && this.f24520e.charAt(i13) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.L = z12;
                this.H = c(i10, this.f24520e.subSequence(0, max));
                this.I = new StaticLayout[this.f24517a.getLineCount() - 3];
                this.K = new Point[this.f24517a.getLineCount() - 3];
                float lineRight = this.H.getLineRight(this.H.getLineCount() - 1);
                boolean z13 = this.L;
                float f10 = this.N;
                if (z13) {
                    f9 = f10;
                } else {
                    f9 = 0.0f;
                }
                float f11 = lineRight + f9;
                this.J = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i14 = U;
                    frameLayout2.measure(i14, i14);
                }
                for (int i15 = 3; i15 < this.f24517a.getLineCount(); i15++) {
                    int lineStart = this.f24517a.getLineStart(i15);
                    int lineEnd = this.f24517a.getLineEnd(i15);
                    StaticLayout c6 = c(i10, this.f24520e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i16 = i15 - 3;
                    this.I[i16] = c6;
                    this.K[i16] = new Point();
                    if (this.J == -1) {
                        if (f11 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.J = i16;
                        }
                    }
                    f11 += c6.getLineRight(0) + f10;
                }
                if (f11 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.S = false;
                }
            }
            if (!this.S) {
                this.H = null;
                this.I = null;
            }
            this.R = i10;
            frameLayout.setMinimumHeight(g());
            if (this.S && this.H != null) {
                if (this.h.getVisibility() == 0) {
                    i11 = AndroidUtilities.dp(20.0f);
                } else {
                    i11 = 0;
                }
                int min = Math.min(T + i11, g()) - AndroidUtilities.dp(8.0f);
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
            i12 = 8;
        }
        cVar.setVisibility(i12);
        if (!this.S && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.G);
        }
        if (this.S && this.P < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final z80 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f9 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f9);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f9 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f9 && i15 >= 0 && i15 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    z80 z80Var = new z80(clickableSpanArr[0], this.E, i12, i13, 0);
                    z80Var.d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.E));
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    s80 b10 = z80Var.b();
                    float f10 = i11;
                    this.f24526x = f10;
                    b10.d(staticLayout, spanStart, f10);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return z80Var;
                }
                return null;
            }
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f9) {
        h hVar = this.B;
        h hVar2 = null;
        if (hVar != null) {
            hVar.a(false);
            this.B = null;
        }
        if (layout != null && clickableSpan != null) {
            hVar2 = new h(this, layout, clickableSpan, f9);
        }
        this.B = hVar2;
        if (clickableSpan instanceof a51) {
            String url = ((a51) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            ((qz0) this).V.f43803e.B4(url, this.B);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (AndroidUtilities.shouldShowUrlInAlert(url2)) {
                org.telegram.ui.Components.c5.r0(this.D, url2, true, true, true, false, this.B, null, null);
                return;
            }
            ye.d.q(getContext(), Uri.parse(url2), true, true, this.B);
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
        this.f24525w = null;
        AndroidUtilities.cancelRunOnUIThread(this.O);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f24518b)) {
            try {
                this.f24518b = AndroidUtilities.getSafeString(str);
            } catch (Throwable unused) {
                this.f24518b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24518b);
            this.f24520e = spannableStringBuilder;
            this.f24521f = null;
            MessageObject.addLinks(false, spannableStringBuilder, false, false, !z10);
            Emoji.replaceEmoji(this.f24520e, org.telegram.ui.ActionBar.g6.P1.getFontMetricsInt(), false);
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
        StaticLayout staticLayout = this.f24517a;
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
        float f9 = this.P;
        float g10 = g();
        float min = Math.min(T, g10);
        Math.abs(AndroidUtilities.lerp(min, g10, 1.0f) - AndroidUtilities.lerp(min, g10, f9));
        this.Q = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f19025a = 0.0f;
        obj.f19026b = 0.0f;
        this.Q.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f9)), f9, 1.0f, (o1.f) obj));
        this.Q.addListener(new nh.q5(this, 12));
        this.Q.setDuration(Math.abs(f9 - 1.0f) * 1250.0f * 2.0f);
        this.Q.start();
    }

    public final int i() {
        int i10;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        float min = Math.min(T + i10, g());
        if (this.S) {
            g10 = (int) AndroidUtilities.lerp(min, g10, this.P);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24517a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f24521f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f24520e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f24520e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new i(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f24521f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.f24520e;
                        this.f24521f = spannableStringBuilder;
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
        this.M = z10;
    }
}
