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
public class w51 extends View {
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
    public int f32008a;
    public String f32009b;
    public int f32010c;
    public final TextPaint d;
    public final Paint e;
    public final RectF f32011f;
    public int h;
    public int f32012n;
    public Drawable f32013r;
    public StaticLayout f32014s;
    public Drawable f32015w;
    public StaticLayout f32016x;
    public int f32017y;

    public w51(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f32011f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.D = textPaint2;
        this.G = 1.0f;
        this.M = org.telegram.ui.ActionBar.t6.f21160pf;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
    }

    public final void a(String str, boolean z10) {
        if (this.L != str) {
            this.L = str;
            this.H = z10;
            this.f32016x = this.f32014s;
            this.f32015w = this.f32013r;
            Typeface o10 = org.telegram.messenger.i0.o();
            TextPaint textPaint = this.D;
            textPaint.setTypeface(o10);
            this.f32017y = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f32013r = null;
            this.f32014s = new StaticLayout(str, textPaint, this.f32017y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f32016x == null && this.f32015w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.G = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new v51(0, this));
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
        StaticLayout staticLayout = this.f32014s;
        if (isEnabled()) {
            i10 = this.M;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21311y6;
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
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21010hg, getResourceProvider());
        int i17 = this.K;
        Paint paint = this.e;
        if (i17 != w04) {
            this.K = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f32012n != org.telegram.ui.ActionBar.t6.w0(this.M, getResourceProvider()) || this.E == null) {
                int L = org.telegram.messenger.i0.L(60.0f);
                int w05 = org.telegram.ui.ActionBar.t6.w0(this.M, getResourceProvider());
                this.f32012n = w05;
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
        if (this.f32014s != null) {
            canvas.save();
            if (this.G != 1.0f && this.f32016x != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f32016x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f32014s.getHeight()) / 2));
                Drawable drawable = this.f32015w;
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
                Drawable drawable2 = this.f32015w;
                if (drawable2 != null) {
                    f7 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32014s.getHeight() - this.f32015w.getIntrinsicHeight()) / 2), -org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32015w.getIntrinsicHeight() + this.f32014s.getHeight()) / 2));
                    this.f32015w.setAlpha((int) ((1.0f - this.G) * alpha));
                    this.f32015w.draw(canvas);
                } else {
                    f7 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                }
                float f15 = alpha;
                textPaint.setAlpha((int) ((f11 - this.G) * f15));
                this.f32016x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f32017y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f32014s.getHeight()) / 2));
                Drawable drawable3 = this.f32013r;
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
                Drawable drawable4 = this.f32013r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f11) + ((this.f32014s.getHeight() - this.f32013r.getIntrinsicHeight()) / 2), -org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f11) + ((this.f32013r.getIntrinsicHeight() + this.f32014s.getHeight()) / 2));
                    this.f32013r.setAlpha((int) (this.G * f15));
                    this.f32013r.draw(canvas);
                }
                textPaint.setAlpha((int) (f15 * this.G));
                this.f32014s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f7 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f32017y) / 2) - (this.h / 2);
                Drawable drawable5 = this.f32013r;
                if (drawable5 != null) {
                    i11 = org.telegram.messenger.i0.L(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                canvas.translate(measuredWidth3 + i11, getTopOffset() + ((getMeasuredHeight() - this.f32014s.getHeight()) / 2));
                Drawable drawable6 = this.f32013r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32014s.getHeight() - this.f32013r.getIntrinsicHeight()) / 2), -org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + ((this.f32013r.getIntrinsicHeight() + this.f32014s.getHeight()) / 2));
                    this.f32013r.setAlpha(255);
                    this.f32013r.draw(canvas);
                }
                this.f32014s.draw(canvas);
            }
            canvas.restore();
        } else {
            f7 = 6.0f;
        }
        if (this.f32009b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int L2 = org.telegram.messenger.i0.L(f7) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float L3 = org.telegram.messenger.i0.L(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f32011f;
            rectF.set(L2, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(10.0f), L2 + this.h, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
            canvas.drawText(this.f32009b, rectF.centerX() - (this.f32010c / 2.0f), rectF.top + org.telegram.messenger.i0.L(14.5f), textPaint2);
        }
    }

    public void setCounter(int i10) {
        if (this.f32008a != i10) {
            this.f32008a = i10;
            if (i10 == 0) {
                this.f32009b = null;
                this.h = 0;
            } else {
                String o02 = org.telegram.messenger.i0.o0(i10, 0);
                this.f32009b = o02;
                this.f32010c = (int) Math.ceil(this.d.measureText(o02));
                int max = Math.max(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(12.0f) + this.f32010c);
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
        this.f32017y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f32013r = null;
        this.f32014s = new StaticLayout(charSequence, textPaint, this.f32017y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
        this.f32017y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f32013r = null;
        this.f32014s = new StaticLayout(charSequence, textPaint, this.f32017y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
