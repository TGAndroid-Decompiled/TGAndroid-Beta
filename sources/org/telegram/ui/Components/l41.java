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
public class l41 extends View {
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
    public int f35507a;
    public String f35508b;
    public int f35509c;
    public final TextPaint d;
    public final Paint f35510e;
    public final RectF f35511f;
    public int h;
    public int f35512n;
    public Drawable f35513r;
    public StaticLayout f35514s;
    public Drawable f35515w;
    public StaticLayout f35516x;
    public int f35517y;

    public l41(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f35510e = new Paint(1);
        this.f35511f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.D = textPaint2;
        this.G = 1.0f;
        this.M = org.telegram.ui.ActionBar.k6.f28077pf;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
    }

    public final void a(String str, boolean z9) {
        if (this.L != str) {
            this.L = str;
            this.H = z9;
            this.f35516x = this.f35514s;
            this.f35515w = this.f35513r;
            Typeface o4 = org.telegram.messenger.g0.o();
            TextPaint textPaint = this.D;
            textPaint.setTypeface(o4);
            this.f35517y = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f35513r = null;
            this.f35514s = new StaticLayout(str, textPaint, this.f35517y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f35516x == null && this.f35515w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.G = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 29));
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

    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
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
        int i7;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        StaticLayout staticLayout = this.f35514s;
        if (isEnabled()) {
            i7 = this.M;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28240y6;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, getResourceProvider());
        int i14 = this.I;
        TextPaint textPaint = this.D;
        if (i14 != w02) {
            this.I = w02;
            textPaint.setColor(w02);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, getResourceProvider());
        int i15 = this.J;
        TextPaint textPaint2 = this.d;
        if (i15 != w03) {
            this.J = w03;
            textPaint2.setColor(w03);
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hg, getResourceProvider());
        int i16 = this.K;
        Paint paint = this.f35510e;
        if (i16 != w04) {
            this.K = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f35512n != org.telegram.ui.ActionBar.k6.w0(this.M, getResourceProvider()) || this.E == null) {
                int L = org.telegram.messenger.g0.L(60.0f);
                int w05 = org.telegram.ui.ActionBar.k6.w0(this.M, getResourceProvider());
                this.f35512n = w05;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(w05, 26));
                this.E = j02;
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
            this.E.setBounds(i13, (getMeasuredHeight() / 2) - i18, i17, (getMeasuredHeight() / 2) + i18);
            this.E.draw(canvas);
        }
        if (this.f35514s != null) {
            canvas.save();
            if (this.G != 1.0f && this.f35516x != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f35516x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f35514s.getHeight()) / 2));
                Drawable drawable = this.f35515w;
                if (drawable != null) {
                    i11 = org.telegram.messenger.g0.L(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                float f14 = i11;
                float f15 = -1.0f;
                if (this.H) {
                    f11 = -1.0f;
                } else {
                    f11 = 1.0f;
                }
                canvas.translate(f14, f11 * org.telegram.messenger.g0.L(18.0f) * this.G);
                Drawable drawable2 = this.f35515w;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f12 = 1.0f;
                    f13 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f35514s.getHeight() - this.f35515w.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f35515w.getIntrinsicHeight() + this.f35514s.getHeight()) / 2));
                    this.f35515w.setAlpha((int) ((1.0f - this.G) * alpha));
                    this.f35515w.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f12 = 1.0f;
                    f13 = 3.0f;
                }
                float f16 = alpha;
                textPaint.setAlpha((int) ((f12 - this.G) * f16));
                this.f35516x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f35517y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f35514s.getHeight()) / 2));
                Drawable drawable3 = this.f35513r;
                if (drawable3 != null) {
                    i12 = org.telegram.messenger.g0.L(f13) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i12 = 0;
                }
                float f17 = i12;
                if (this.H) {
                    f15 = f12;
                }
                canvas.translate(f17, (f12 - this.G) * f15 * org.telegram.messenger.g0.L(18.0f));
                Drawable drawable4 = this.f35513r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12) + ((this.f35514s.getHeight() - this.f35513r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12) + ((this.f35513r.getIntrinsicHeight() + this.f35514s.getHeight()) / 2));
                    this.f35513r.setAlpha((int) (this.G * f16));
                    this.f35513r.draw(canvas);
                }
                textPaint.setAlpha((int) (f16 * this.G));
                this.f35514s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f35517y) / 2) - (this.h / 2);
                Drawable drawable5 = this.f35513r;
                if (drawable5 != null) {
                    i10 = org.telegram.messenger.g0.L(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i10 = 0;
                }
                canvas.translate(measuredWidth3 + i10, getTopOffset() + ((getMeasuredHeight() - this.f35514s.getHeight()) / 2));
                Drawable drawable6 = this.f35513r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f35514s.getHeight() - this.f35513r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f35513r.getIntrinsicHeight() + this.f35514s.getHeight()) / 2));
                    this.f35513r.setAlpha(255);
                    this.f35513r.draw(canvas);
                }
                this.f35514s.draw(canvas);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.f35508b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int L2 = org.telegram.messenger.g0.L(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float L3 = org.telegram.messenger.g0.L(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f35511f;
            rectF.set(L2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(10.0f), L2 + this.h, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            canvas.drawText(this.f35508b, rectF.centerX() - (this.f35509c / 2.0f), rectF.top + org.telegram.messenger.g0.L(14.5f), textPaint2);
        }
    }

    public void setCounter(int i7) {
        if (this.f35507a != i7) {
            this.f35507a = i7;
            if (i7 == 0) {
                this.f35508b = null;
                this.h = 0;
            } else {
                String o02 = org.telegram.messenger.g0.o0(i7, 0);
                this.f35508b = o02;
                this.f35509c = (int) Math.ceil(this.d.measureText(o02));
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f) + this.f35509c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.D;
        textPaint.setTypeface(o4);
        this.f35517y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f35513r = null;
        this.f35514s = new StaticLayout(charSequence, textPaint, this.f35517y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i7) {
        this.M = i7;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.D;
        textPaint.setTypeface(null);
        this.f35517y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f35513r = null;
        this.f35514s = new StaticLayout(charSequence, textPaint, this.f35517y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
