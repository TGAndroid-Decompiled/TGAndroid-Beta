package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class x51 extends View {
    public final TextPaint D;
    public org.telegram.ui.Cells.y E;
    public ValueAnimator F;
    public float G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public CharSequence L;
    public int M;
    public int f32427a;
    public String f32428b;
    public int f32429c;
    public final TextPaint d;
    public final Paint e;
    public final RectF f32430f;
    public int h;
    public int f32431n;
    public Drawable f32432r;
    public StaticLayout f32433s;
    public Drawable f32434w;
    public StaticLayout f32435x;
    public int f32436y;

    public x51(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f32430f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.D = textPaint2;
        this.G = 1.0f;
        this.M = org.telegram.ui.ActionBar.t6.f21161pf;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
    }

    public final void a(String str, boolean z10) {
        if (this.L != str) {
            this.L = str;
            this.H = z10;
            this.f32435x = this.f32433s;
            this.f32434w = this.f32432r;
            Typeface o10 = org.telegram.messenger.i0.o();
            TextPaint textPaint = this.D;
            textPaint.setTypeface(o10);
            this.f32436y = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f32432r = null;
            this.f32433s = new StaticLayout(str, textPaint, this.f32436y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f32435x == null && this.f32434w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.G = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new w51(0, this));
            this.F.setDuration(150L);
            this.F.start();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.E;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    public org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.E;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        int i13;
        int i14;
        StaticLayout staticLayout = this.f32433s;
        if (isEnabled()) {
            i10 = this.M;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, getResourceProvider());
        int i15 = this.I;
        TextPaint textPaint = this.D;
        if (i15 != w02) {
            this.I = w02;
            textPaint.setColor(w02);
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, getResourceProvider());
        int i16 = this.J;
        TextPaint textPaint2 = this.d;
        if (i16 != w03) {
            this.J = w03;
            textPaint2.setColor(w03);
        }
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21011hg, getResourceProvider());
        int i17 = this.K;
        Paint paint = this.e;
        if (i17 != w04) {
            this.K = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f32431n != org.telegram.ui.ActionBar.t6.w0(this.M, getResourceProvider()) || this.E == null) {
                int L = org.telegram.messenger.i0.L(60.0f);
                int w05 = org.telegram.ui.ActionBar.t6.w0(this.M, getResourceProvider());
                this.f32431n = w05;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(L, 0, i0.b.o(w05, 26));
                this.E = j02;
                j02.setCallback(this);
            }
            if (getLeft() + measuredWidth2 <= 0) {
                i14 = measuredWidth2 - org.telegram.messenger.i0.L(20.0f);
            } else {
                i14 = measuredWidth2;
            }
            int i18 = measuredWidth2 + measuredWidth;
            if (i18 > ((View) getParent()).getMeasuredWidth()) {
                i18 += org.telegram.messenger.i0.L(20.0f);
            }
            int i19 = measuredWidth / 2;
            this.E.setBounds(i14, (getMeasuredHeight() / 2) - i19, i18, (getMeasuredHeight() / 2) + i19);
            this.E.draw(canvas);
        }
        if (this.f32433s != null) {
            canvas.save();
            if (this.G != 1.0f && this.f32435x != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f32435x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f32433s.getHeight()) / 2));
                Drawable drawable = this.f32434w;
                if (drawable != null) {
                    i12 = org.telegram.messenger.i0.L(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i12 = 0;
                }
                float f13 = i12;
                float f14 = -1.0f;
                if (this.H) {
                    f10 = -1.0f;
                } else {
                    f10 = 1.0f;
                }
                canvas.translate(f13, f10 * org.telegram.messenger.i0.L(18.0f) * this.G);
                Drawable drawable2 = this.f32434w;
                if (drawable2 != null) {
                    f7 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32433s.getHeight() - this.f32434w.getIntrinsicHeight()) / 2), -org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32434w.getIntrinsicHeight() + this.f32433s.getHeight()) / 2));
                    this.f32434w.setAlpha((int) ((1.0f - this.G) * alpha));
                    this.f32434w.draw(canvas);
                } else {
                    f7 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                }
                float f15 = alpha;
                textPaint.setAlpha((int) ((f11 - this.G) * f15));
                this.f32435x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f32436y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f32433s.getHeight()) / 2));
                Drawable drawable3 = this.f32432r;
                if (drawable3 != null) {
                    i13 = org.telegram.messenger.i0.L(f12) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i13 = 0;
                }
                float f16 = i13;
                if (this.H) {
                    f14 = f11;
                }
                canvas.translate(f16, (f11 - this.G) * f14 * org.telegram.messenger.i0.L(18.0f));
                Drawable drawable4 = this.f32432r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f11) + ((this.f32433s.getHeight() - this.f32432r.getIntrinsicHeight()) / 2), -org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f11) + ((this.f32432r.getIntrinsicHeight() + this.f32433s.getHeight()) / 2));
                    this.f32432r.setAlpha((int) (this.G * f15));
                    this.f32432r.draw(canvas);
                }
                textPaint.setAlpha((int) (f15 * this.G));
                this.f32433s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f7 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f32436y) / 2) - (this.h / 2);
                Drawable drawable5 = this.f32432r;
                if (drawable5 != null) {
                    i11 = org.telegram.messenger.i0.L(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                canvas.translate(measuredWidth3 + i11, getTopOffset() + ((getMeasuredHeight() - this.f32433s.getHeight()) / 2));
                Drawable drawable6 = this.f32432r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32433s.getHeight() - this.f32432r.getIntrinsicHeight()) / 2), -org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32432r.getIntrinsicHeight() + this.f32433s.getHeight()) / 2));
                    this.f32432r.setAlpha(255);
                    this.f32432r.draw(canvas);
                }
                this.f32433s.draw(canvas);
            }
            canvas.restore();
        } else {
            f7 = 6.0f;
        }
        if (this.f32428b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int L2 = org.telegram.messenger.i0.L(f7) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float L3 = org.telegram.messenger.i0.L(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f32430f;
            rectF.set(L2, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(10.0f), L2 + this.h, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
            canvas.drawText(this.f32428b, rectF.centerX() - (this.f32429c / 2.0f), rectF.top + org.telegram.messenger.i0.L(14.5f), textPaint2);
        }
    }

    public void setCounter(int i10) {
        if (this.f32427a != i10) {
            this.f32427a = i10;
            if (i10 == 0) {
                this.f32428b = null;
                this.h = 0;
            } else {
                String o02 = org.telegram.messenger.i0.o0(i10, 0);
                this.f32428b = o02;
                this.f32429c = (int) Math.ceil(this.d.measureText(o02));
                int max = Math.max(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(12.0f) + this.f32429c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o10 = org.telegram.messenger.i0.o();
        TextPaint textPaint = this.D;
        textPaint.setTypeface(o10);
        this.f32436y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f32432r = null;
        this.f32433s = new StaticLayout(charSequence, textPaint, this.f32436y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.D;
        textPaint.setTypeface(null);
        this.f32436y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f32432r = null;
        this.f32433s = new StaticLayout(charSequence, textPaint, this.f32436y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.y yVar = this.E;
        if (yVar != null) {
            if (yVar != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
