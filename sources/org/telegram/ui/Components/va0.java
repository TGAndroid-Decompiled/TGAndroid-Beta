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
public final class va0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public CharSequence D;
    public int E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public Rect K;
    public Rect L;
    public final int f29404a;
    public TLRPC.InputStickerSet f29405b;
    public final Rect f29406c;
    public l5 d;
    public boolean e;
    public final i90 f29407f;
    public final TextPaint h;
    public final CharSequence f29408n;
    public StaticLayout f29409r;
    public final String f29410s;
    public SpannableStringBuilder v;
    public StaticLayout f29411w;
    public int f29412x;
    public int f29413y;

    public va0(int r11, android.content.Context r12, org.telegram.ui.ActionBar.f6 r13, java.util.ArrayList r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.va0.<init>(int, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList, int):void");
    }

    public final int a(int i10, boolean z4) {
        int i11;
        float f10;
        float f11;
        int i12 = 0;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.D;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f29408n;
        if (charSequence2 != charSequence || this.C != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29409r = staticLayout;
                i90 i90Var = this.f29407f;
                if (i90Var != null && this.L == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f29412x = AndroidUtilities.dp(2.0f) + ((int) this.f29409r.getPrimaryHorizontal(charSequence2.length()));
                    this.f29413y = this.f29409r.getLineTop(lineCount);
                    this.B = r3 - this.f29413y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f29409r.getWidth() - this.f29412x);
                    if (this.K == null) {
                        this.K = new Rect();
                    }
                    Rect rect = this.K;
                    int i13 = this.f29412x;
                    rect.set(i13, this.f29413y, (int) (i13 + min), r3);
                    i90Var.setBounds(this.K);
                    this.e = true;
                }
            } else {
                this.f29409r = null;
                this.e = false;
            }
            this.D = charSequence2;
            this.C = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.F || this.E != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f29411w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f29411w = null;
            }
            this.F = this.v;
            this.E = i11;
        }
        StaticLayout staticLayout2 = this.f29409r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f29411w;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.B;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = this.J;
            }
            f10 = height * f11;
        } else {
            f10 = 0.0f;
        }
        return i12 + ((int) f10);
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.va0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.a(this);
        }
        NotificationCenter.getInstance(this.f29404a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.o(this);
        }
        NotificationCenter.getInstance(this.f29404a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f29409r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f29409r.draw(canvas);
            i90 i90Var = this.f29407f;
            if (i90Var != null && this.e) {
                i90Var.setAlpha((int) ((1.0f - this.J) * 255.0f));
                Rect rect2 = this.K;
                if (rect2 != null && (rect = this.L) != null) {
                    float f10 = this.J;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f10, rect3);
                    i90Var.setBounds(rect3);
                }
                i90Var.draw(canvas);
                invalidate();
            }
            if (this.f29411w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f29413y);
                textPaint.setAlpha((int) (this.J * 255.0f));
                this.f29411w.draw(canvas);
                canvas.restore();
            }
            l5 l5Var = this.d;
            if (l5Var != null) {
                l5Var.setAlpha((int) (this.J * 255.0f));
                this.d.setBounds(this.f29406c);
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
        if (this.H && (i12 = this.G) > 0) {
            size = Math.min(size, i12);
        }
        this.G = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }
}
