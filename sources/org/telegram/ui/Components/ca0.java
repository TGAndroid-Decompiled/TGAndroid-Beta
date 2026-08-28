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
public final class ca0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f27441a;
    public TLRPC.InputStickerSet f27442b;
    public final Rect f27443c;
    public k5 d;
    public boolean f27444e;
    public final p80 f27445f;
    public final TextPaint h;
    public final CharSequence f27446n;
    public StaticLayout f27447r;
    public final String f27448s;
    public SpannableStringBuilder v;
    public StaticLayout f27449w;
    public int f27450x;
    public int f27451y;

    public ca0(int r11, android.content.Context r12, org.telegram.ui.ActionBar.b6 r13, java.util.ArrayList r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.<init>(int, android.content.Context, org.telegram.ui.ActionBar.b6, java.util.ArrayList, int):void");
    }

    public final int a(int i9, boolean z10) {
        int i10;
        float f10;
        float f11;
        int i11 = 0;
        if (i9 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f27446n;
        if (charSequence2 != charSequence || this.B != i9) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i9, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f27447r = staticLayout;
                p80 p80Var = this.f27445f;
                if (p80Var != null && this.K == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f27450x = AndroidUtilities.dp(2.0f) + ((int) this.f27447r.getPrimaryHorizontal(charSequence2.length()));
                    this.f27451y = this.f27447r.getLineTop(lineCount);
                    this.A = r3 - this.f27451y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f27447r.getWidth() - this.f27450x);
                    if (this.J == null) {
                        this.J = new Rect();
                    }
                    Rect rect = this.J;
                    int i12 = this.f27450x;
                    rect.set(i12, this.f27451y, (int) (i12 + min), r3);
                    p80Var.setBounds(this.J);
                    this.f27444e = true;
                }
            } else {
                this.f27447r = null;
                this.f27444e = false;
            }
            this.C = charSequence2;
            this.B = i9;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.E || this.D != i9) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i10 = i9;
                this.f27449w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i9;
                this.f27449w = null;
            }
            this.E = this.v;
            this.D = i10;
        }
        StaticLayout staticLayout2 = this.f27447r;
        if (staticLayout2 != null) {
            i11 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f27449w;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.A;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.I;
            }
            f10 = height * f11;
        } else {
            f10 = 0.0f;
        }
        return i11 + ((int) f10);
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.a(this);
        }
        NotificationCenter.getInstance(this.f27441a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.o(this);
        }
        NotificationCenter.getInstance(this.f27441a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f27447r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f27447r.draw(canvas);
            p80 p80Var = this.f27445f;
            if (p80Var != null && this.f27444e) {
                p80Var.setAlpha((int) ((1.0f - this.I) * 255.0f));
                Rect rect2 = this.J;
                if (rect2 != null && (rect = this.K) != null) {
                    float f10 = this.I;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f10, rect3);
                    p80Var.setBounds(rect3);
                }
                p80Var.draw(canvas);
                invalidate();
            }
            if (this.f27449w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f27451y);
                textPaint.setAlpha((int) (this.I * 255.0f));
                this.f27449w.draw(canvas);
                canvas.restore();
            }
            k5 k5Var = this.d;
            if (k5Var != null) {
                k5Var.setAlpha((int) (this.I * 255.0f));
                this.d.setBounds(this.f27443c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int size = View.MeasureSpec.getSize(i9);
        if (this.G && (i11 = this.F) > 0) {
            size = Math.min(size, i11);
        }
        this.F = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }
}
