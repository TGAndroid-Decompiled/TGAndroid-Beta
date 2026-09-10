package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class db0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public SpannableStringBuilder I;
    public int J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public Rect N;
    public Rect O;
    public final int f22348a;
    public TLRPC.InputStickerSet f22349b;
    public final Rect f22350c;
    public p5 d;
    public boolean e;
    public final q90 f22351f;
    public final TextPaint h;
    public final CharSequence f22352n;
    public StaticLayout f22353r;
    public final String f22354s;
    public SpannableStringBuilder v;
    public StaticLayout f22355w;
    public int f22356x;
    public int f22357y;

    public db0(int r11, android.content.Context r12, org.telegram.ui.ActionBar.f6 r13, java.util.ArrayList r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db0.<init>(int, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList, int):void");
    }

    public final int a(int i10, boolean z10) {
        int i11;
        float f7;
        float f10;
        int i12 = 0;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.G;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f22352n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f22353r = staticLayout;
                q90 q90Var = this.f22351f;
                if (q90Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f22356x = AndroidUtilities.dp(2.0f) + ((int) this.f22353r.getPrimaryHorizontal(charSequence2.length()));
                    this.f22357y = this.f22353r.getLineTop(lineCount);
                    this.E = r3 - this.f22357y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f22353r.getWidth() - this.f22356x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f22356x;
                    rect.set(i13, this.f22357y, (int) (i13 + min), r3);
                    q90Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.f22353r = null;
                this.e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f22355w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f22355w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f22353r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f22355w;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.E;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.M;
            }
            f7 = height * f10;
        } else {
            f7 = 0.0f;
        }
        return i12 + ((int) f7);
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.a(this);
        }
        NotificationCenter.getInstance(this.f22348a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.o(this);
        }
        NotificationCenter.getInstance(this.f22348a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f22353r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f22353r.draw(canvas);
            q90 q90Var = this.f22351f;
            if (q90Var != null && this.e) {
                q90Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    q90Var.setBounds(rect3);
                }
                q90Var.draw(canvas);
                invalidate();
            }
            if (this.f22355w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f22357y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f22355w.draw(canvas);
                canvas.restore();
            }
            p5 p5Var = this.d;
            if (p5Var != null) {
                p5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f22350c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int size = View.MeasureSpec.getSize(i10);
        if (this.K && (i12 = this.J) > 0) {
            size = Math.min(size, i12);
        }
        this.J = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }
}
