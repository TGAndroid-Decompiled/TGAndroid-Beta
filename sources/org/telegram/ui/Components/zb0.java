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
public final class zb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f33316a;
    public TLRPC.InputStickerSet f33317b;
    public final Rect f33318c;
    public s5 d;
    public boolean f33319e;
    public final ma0 f33320f;
    public final TextPaint h;
    public final CharSequence f33321n;
    public StaticLayout f33322r;
    public final String f33323s;
    public SpannableStringBuilder v;
    public StaticLayout f33324w;
    public int f33325x;
    public int f33326y;

    public zb0(int r10, int r11, android.content.Context r12, java.util.ArrayList r13, org.telegram.ui.ActionBar.c6 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zb0.<init>(int, int, android.content.Context, java.util.ArrayList, org.telegram.ui.ActionBar.c6):void");
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
        CharSequence charSequence2 = this.f33321n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33322r = staticLayout;
                ma0 ma0Var = this.f33320f;
                if (ma0Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f33325x = AndroidUtilities.dp(2.0f) + ((int) this.f33322r.getPrimaryHorizontal(charSequence2.length()));
                    this.f33326y = this.f33322r.getLineTop(lineCount);
                    this.E = r3 - this.f33326y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f33322r.getWidth() - this.f33325x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f33325x;
                    rect.set(i13, this.f33326y, (int) (i13 + min), r3);
                    ma0Var.setBounds(this.N);
                    this.f33319e = true;
                }
            } else {
                this.f33322r = null;
                this.f33319e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f33324w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f33324w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f33322r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f33324w;
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
    public final void didReceivedNotification(int r8, int r9, java.lang.Object... r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zb0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s5 s5Var = this.d;
        if (s5Var != null) {
            s5Var.a(this);
        }
        NotificationCenter.getInstance(this.f33316a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s5 s5Var = this.d;
        if (s5Var != null) {
            s5Var.o(this);
        }
        NotificationCenter.getInstance(this.f33316a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f33322r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f33322r.draw(canvas);
            ma0 ma0Var = this.f33320f;
            if (ma0Var != null && this.f33319e) {
                ma0Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    ma0Var.setBounds(rect3);
                }
                ma0Var.draw(canvas);
                invalidate();
            }
            if (this.f33324w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f33326y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f33324w.draw(canvas);
                canvas.restore();
            }
            s5 s5Var = this.d;
            if (s5Var != null) {
                s5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f33318c);
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
