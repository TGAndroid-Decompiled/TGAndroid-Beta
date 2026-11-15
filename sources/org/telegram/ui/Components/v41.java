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
public class v41 extends View {
    public final TextPaint E;
    public org.telegram.ui.Cells.y F;
    public ValueAnimator G;
    public float H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public CharSequence M;
    public int N;
    public int f40255a;
    public String f40256b;
    public int f40257c;
    public final TextPaint d;
    public final Paint f40258e;
    public final RectF f40259f;
    public int h;
    public int f40260n;
    public Drawable f40261r;
    public StaticLayout f40262s;
    public Drawable f40263w;
    public StaticLayout f40264x;
    public int f40265y;

    public v41(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f40258e = new Paint(1);
        this.f40259f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.E = textPaint2;
        this.H = 1.0f;
        this.N = org.telegram.ui.ActionBar.j6.f29135sf;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
    }

    public final void a(String str, boolean z10) {
        if (this.M != str) {
            this.M = str;
            this.I = z10;
            this.f40264x = this.f40262s;
            this.f40263w = this.f40261r;
            Typeface o4 = org.telegram.messenger.g0.o();
            TextPaint textPaint = this.E;
            textPaint.setTypeface(o4);
            this.f40265y = (int) Math.ceil(Layout.getDesiredWidth(str, textPaint));
            this.f40261r = null;
            this.f40262s = new StaticLayout(str, textPaint, this.f40265y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f40264x == null && this.f40263w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.H = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new f60(this, 28));
            this.G.setDuration(150L);
            this.G.start();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        StaticLayout staticLayout = this.f40262s;
        if (isEnabled()) {
            i7 = this.N;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, getResourceProvider());
        int i14 = this.J;
        TextPaint textPaint = this.E;
        if (i14 != w02) {
            this.J = w02;
            textPaint.setColor(w02);
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Je, getResourceProvider());
        int i15 = this.K;
        TextPaint textPaint2 = this.d;
        if (i15 != w03) {
            this.K = w03;
            textPaint2.setColor(w03);
        }
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28987kg, getResourceProvider());
        int i16 = this.L;
        Paint paint = this.f40258e;
        if (i16 != w04) {
            this.L = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f40260n != org.telegram.ui.ActionBar.j6.w0(this.N, getResourceProvider()) || this.F == null) {
                int L = org.telegram.messenger.g0.L(60.0f);
                int w05 = org.telegram.ui.ActionBar.j6.w0(this.N, getResourceProvider());
                this.f40260n = w05;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(L, 0, i0.a.o(w05, 26));
                this.F = j02;
                j02.setCallback(this);
            }
            if (getLeft() + measuredWidth2 <= 0) {
                i13 = measuredWidth2 - org.telegram.messenger.g0.L(20.0f);
            } else {
                i13 = measuredWidth2;
            }
            int i17 = measuredWidth2 + measuredWidth;
            if (i17 > ((View) getParent()).getMeasuredWidth()) {
                i17 += org.telegram.messenger.g0.L(20.0f);
            }
            int i18 = measuredWidth / 2;
            this.F.setBounds(i13, (getMeasuredHeight() / 2) - i18, i17, (getMeasuredHeight() / 2) + i18);
            this.F.draw(canvas);
        }
        if (this.f40262s != null) {
            canvas.save();
            if (this.H != 1.0f && this.f40264x != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f40264x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f40262s.getHeight()) / 2));
                Drawable drawable = this.f40263w;
                if (drawable != null) {
                    i11 = org.telegram.messenger.g0.L(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                float f14 = i11;
                float f15 = -1.0f;
                if (this.I) {
                    f11 = -1.0f;
                } else {
                    f11 = 1.0f;
                }
                canvas.translate(f14, f11 * org.telegram.messenger.g0.L(18.0f) * this.H);
                Drawable drawable2 = this.f40263w;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f12 = 1.0f;
                    f13 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f40262s.getHeight() - this.f40263w.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f40263w.getIntrinsicHeight() + this.f40262s.getHeight()) / 2));
                    this.f40263w.setAlpha((int) ((1.0f - this.H) * alpha));
                    this.f40263w.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f12 = 1.0f;
                    f13 = 3.0f;
                }
                float f16 = alpha;
                textPaint.setAlpha((int) ((f12 - this.H) * f16));
                this.f40264x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f40265y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f40262s.getHeight()) / 2));
                Drawable drawable3 = this.f40261r;
                if (drawable3 != null) {
                    i12 = org.telegram.messenger.g0.L(f13) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i12 = 0;
                }
                float f17 = i12;
                if (this.I) {
                    f15 = f12;
                }
                canvas.translate(f17, (f12 - this.H) * f15 * org.telegram.messenger.g0.L(18.0f));
                Drawable drawable4 = this.f40261r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12) + ((this.f40262s.getHeight() - this.f40261r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12) + ((this.f40261r.getIntrinsicHeight() + this.f40262s.getHeight()) / 2));
                    this.f40261r.setAlpha((int) (this.H * f16));
                    this.f40261r.draw(canvas);
                }
                textPaint.setAlpha((int) (f16 * this.H));
                this.f40262s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f40265y) / 2) - (this.h / 2);
                Drawable drawable5 = this.f40261r;
                if (drawable5 != null) {
                    i10 = org.telegram.messenger.g0.L(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i10 = 0;
                }
                canvas.translate(measuredWidth3 + i10, getTopOffset() + ((getMeasuredHeight() - this.f40262s.getHeight()) / 2));
                Drawable drawable6 = this.f40261r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f40262s.getHeight() - this.f40261r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f40261r.getIntrinsicHeight() + this.f40262s.getHeight()) / 2));
                    this.f40261r.setAlpha(255);
                    this.f40261r.draw(canvas);
                }
                this.f40262s.draw(canvas);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.f40256b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int L2 = org.telegram.messenger.g0.L(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float L3 = org.telegram.messenger.g0.L(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f40259f;
            rectF.set(L2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(10.0f), L2 + this.h, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            canvas.drawText(this.f40256b, rectF.centerX() - (this.f40257c / 2.0f), rectF.top + org.telegram.messenger.g0.L(14.5f), textPaint2);
        }
    }

    public void setCounter(int i7) {
        if (this.f40255a != i7) {
            this.f40255a = i7;
            if (i7 == 0) {
                this.f40256b = null;
                this.h = 0;
            } else {
                String o02 = org.telegram.messenger.g0.o0(i7, 0);
                this.f40256b = o02;
                this.f40257c = (int) Math.ceil(this.d.measureText(o02));
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f) + this.f40257c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.E;
        textPaint.setTypeface(o4);
        this.f40265y = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        this.f40261r = null;
        this.f40262s = new StaticLayout(charSequence, textPaint, this.f40265y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i7) {
        this.N = i7;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.E;
        textPaint.setTypeface(null);
        this.f40265y = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        this.f40261r = null;
        this.f40262s = new StaticLayout(charSequence, textPaint, this.f40265y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            if (yVar != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
