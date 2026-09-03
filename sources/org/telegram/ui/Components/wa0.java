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
public final class wa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f30192a;
    public TLRPC.InputStickerSet f30193b;
    public final Rect f30194c;
    public l5 d;
    public boolean e;
    public final j90 f30195f;
    public final TextPaint h;
    public final CharSequence f30196n;
    public StaticLayout f30197r;
    public final String f30198s;
    public SpannableStringBuilder v;
    public StaticLayout f30199w;
    public int f30200x;
    public int f30201y;

    public wa0(int r11, android.content.Context r12, org.telegram.ui.ActionBar.f6 r13, java.util.ArrayList r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wa0.<init>(int, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList, int):void");
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
        CharSequence charSequence2 = this.f30196n;
        if (charSequence2 != charSequence || this.C != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30197r = staticLayout;
                j90 j90Var = this.f30195f;
                if (j90Var != null && this.L == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f30200x = AndroidUtilities.dp(2.0f) + ((int) this.f30197r.getPrimaryHorizontal(charSequence2.length()));
                    this.f30201y = this.f30197r.getLineTop(lineCount);
                    this.B = r3 - this.f30201y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f30197r.getWidth() - this.f30200x);
                    if (this.K == null) {
                        this.K = new Rect();
                    }
                    Rect rect = this.K;
                    int i13 = this.f30200x;
                    rect.set(i13, this.f30201y, (int) (i13 + min), r3);
                    j90Var.setBounds(this.K);
                    this.e = true;
                }
            } else {
                this.f30197r = null;
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
                this.f30199w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f30199w = null;
            }
            this.F = this.v;
            this.E = i11;
        }
        StaticLayout staticLayout2 = this.f30197r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f30199w;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wa0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.a(this);
        }
        NotificationCenter.getInstance(this.f30192a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.o(this);
        }
        NotificationCenter.getInstance(this.f30192a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f30197r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f30197r.draw(canvas);
            j90 j90Var = this.f30195f;
            if (j90Var != null && this.e) {
                j90Var.setAlpha((int) ((1.0f - this.J) * 255.0f));
                Rect rect2 = this.K;
                if (rect2 != null && (rect = this.L) != null) {
                    float f10 = this.J;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f10, rect3);
                    j90Var.setBounds(rect3);
                }
                j90Var.draw(canvas);
                invalidate();
            }
            if (this.f30199w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f30201y);
                textPaint.setAlpha((int) (this.J * 255.0f));
                this.f30199w.draw(canvas);
                canvas.restore();
            }
            l5 l5Var = this.d;
            if (l5Var != null) {
                l5Var.setAlpha((int) (this.J * 255.0f));
                this.d.setBounds(this.f30194c);
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
