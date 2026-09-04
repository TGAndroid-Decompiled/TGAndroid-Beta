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
public final class ua0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f30838a;
    public TLRPC.InputStickerSet f30839b;
    public final Rect f30840c;
    public q5 d;
    public boolean f30841e;
    public final h90 f30842f;
    public final TextPaint h;
    public final CharSequence f30843n;
    public StaticLayout f30844r;
    public final String f30845s;
    public SpannableStringBuilder v;
    public StaticLayout f30846w;
    public int f30847x;
    public int f30848y;

    public ua0(int r11, android.content.Context r12, org.telegram.ui.ActionBar.f6 r13, java.util.ArrayList r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.<init>(int, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList, int):void");
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
        CharSequence charSequence2 = this.f30843n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30844r = staticLayout;
                h90 h90Var = this.f30842f;
                if (h90Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f30847x = AndroidUtilities.dp(2.0f) + ((int) this.f30844r.getPrimaryHorizontal(charSequence2.length()));
                    this.f30848y = this.f30844r.getLineTop(lineCount);
                    this.E = r3 - this.f30848y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f30844r.getWidth() - this.f30847x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f30847x;
                    rect.set(i13, this.f30848y, (int) (i13 + min), r3);
                    h90Var.setBounds(this.N);
                    this.f30841e = true;
                }
            } else {
                this.f30844r = null;
                this.f30841e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f30846w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f30846w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f30844r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f30846w;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q5 q5Var = this.d;
        if (q5Var != null) {
            q5Var.a(this);
        }
        NotificationCenter.getInstance(this.f30838a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q5 q5Var = this.d;
        if (q5Var != null) {
            q5Var.o(this);
        }
        NotificationCenter.getInstance(this.f30838a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f30844r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f30844r.draw(canvas);
            h90 h90Var = this.f30842f;
            if (h90Var != null && this.f30841e) {
                h90Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    h90Var.setBounds(rect3);
                }
                h90Var.draw(canvas);
                invalidate();
            }
            if (this.f30846w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f30848y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f30846w.draw(canvas);
                canvas.restore();
            }
            q5 q5Var = this.d;
            if (q5Var != null) {
                q5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f30840c);
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
