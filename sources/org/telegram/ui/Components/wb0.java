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
public final class wb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f32598a;
    public TLRPC.InputStickerSet f32599b;
    public final Rect f32600c;
    public s5 d;
    public boolean f32601e;
    public final ja0 f32602f;
    public final TextPaint h;
    public final CharSequence f32603n;
    public StaticLayout f32604r;
    public final String f32605s;
    public SpannableStringBuilder v;
    public StaticLayout f32606w;
    public int f32607x;
    public int f32608y;

    public wb0(int r10, int r11, android.content.Context r12, java.util.ArrayList r13, org.telegram.ui.ActionBar.d6 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wb0.<init>(int, int, android.content.Context, java.util.ArrayList, org.telegram.ui.ActionBar.d6):void");
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
        CharSequence charSequence2 = this.f32603n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f32604r = staticLayout;
                ja0 ja0Var = this.f32602f;
                if (ja0Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f32607x = AndroidUtilities.dp(2.0f) + ((int) this.f32604r.getPrimaryHorizontal(charSequence2.length()));
                    this.f32608y = this.f32604r.getLineTop(lineCount);
                    this.E = r3 - this.f32608y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f32604r.getWidth() - this.f32607x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f32607x;
                    rect.set(i13, this.f32608y, (int) (i13 + min), r3);
                    ja0Var.setBounds(this.N);
                    this.f32601e = true;
                }
            } else {
                this.f32604r = null;
                this.f32601e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f32606w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f32606w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f32604r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f32606w;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wb0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s5 s5Var = this.d;
        if (s5Var != null) {
            s5Var.a(this);
        }
        NotificationCenter.getInstance(this.f32598a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s5 s5Var = this.d;
        if (s5Var != null) {
            s5Var.o(this);
        }
        NotificationCenter.getInstance(this.f32598a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f32604r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f32604r.draw(canvas);
            ja0 ja0Var = this.f32602f;
            if (ja0Var != null && this.f32601e) {
                ja0Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    ja0Var.setBounds(rect3);
                }
                ja0Var.draw(canvas);
                invalidate();
            }
            if (this.f32606w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f32608y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f32606w.draw(canvas);
                canvas.restore();
            }
            s5 s5Var = this.d;
            if (s5Var != null) {
                s5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f32600c);
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
