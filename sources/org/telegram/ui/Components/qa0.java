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
public final class qa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public CharSequence C;
    public int D;
    public SpannableStringBuilder E;
    public int F;
    public boolean G;
    public ValueAnimator H;
    public float I;
    public Rect J;
    public Rect K;
    public final int f31875a;
    public TLRPC.InputStickerSet f31876b;
    public final Rect f31877c;
    public p5 d;
    public boolean f31878e;
    public final c90 f31879f;
    public final TextPaint h;
    public final CharSequence f31880n;
    public StaticLayout f31881r;
    public final String f31882s;
    public SpannableStringBuilder v;
    public StaticLayout f31883w;
    public int f31884x;
    public int f31885y;

    public qa0(int r11, android.content.Context r12, org.telegram.ui.ActionBar.c6 r13, java.util.ArrayList r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa0.<init>(int, android.content.Context, org.telegram.ui.ActionBar.c6, java.util.ArrayList, int):void");
    }

    public final int a(int i10, boolean z10) {
        int i11;
        float f9;
        float f10;
        int i12 = 0;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f31880n;
        if (charSequence2 != charSequence || this.B != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f31881r = staticLayout;
                c90 c90Var = this.f31879f;
                if (c90Var != null && this.K == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f31884x = AndroidUtilities.dp(2.0f) + ((int) this.f31881r.getPrimaryHorizontal(charSequence2.length()));
                    this.f31885y = this.f31881r.getLineTop(lineCount);
                    this.A = r3 - this.f31885y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f31881r.getWidth() - this.f31884x);
                    if (this.J == null) {
                        this.J = new Rect();
                    }
                    Rect rect = this.J;
                    int i13 = this.f31884x;
                    rect.set(i13, this.f31885y, (int) (i13 + min), r3);
                    c90Var.setBounds(this.J);
                    this.f31878e = true;
                }
            } else {
                this.f31881r = null;
                this.f31878e = false;
            }
            this.C = charSequence2;
            this.B = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.E || this.D != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f31883w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f31883w = null;
            }
            this.E = this.v;
            this.D = i11;
        }
        StaticLayout staticLayout2 = this.f31881r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f31883w;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.A;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.I;
            }
            f9 = height * f10;
        } else {
            f9 = 0.0f;
        }
        return i12 + ((int) f9);
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.a(this);
        }
        NotificationCenter.getInstance(this.f31875a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.o(this);
        }
        NotificationCenter.getInstance(this.f31875a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f31881r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f31881r.draw(canvas);
            c90 c90Var = this.f31879f;
            if (c90Var != null && this.f31878e) {
                c90Var.setAlpha((int) ((1.0f - this.I) * 255.0f));
                Rect rect2 = this.J;
                if (rect2 != null && (rect = this.K) != null) {
                    float f9 = this.I;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f9, rect3);
                    c90Var.setBounds(rect3);
                }
                c90Var.draw(canvas);
                invalidate();
            }
            if (this.f31883w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f31885y);
                textPaint.setAlpha((int) (this.I * 255.0f));
                this.f31883w.draw(canvas);
                canvas.restore();
            }
            p5 p5Var = this.d;
            if (p5Var != null) {
                p5Var.setAlpha((int) (this.I * 255.0f));
                this.d.setBounds(this.f31877c);
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
        if (this.G && (i12 = this.F) > 0) {
            size = Math.min(size, i12);
        }
        this.F = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }
}
