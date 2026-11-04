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
public class n41 extends View {
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
    public int f36365a;
    public String f36366b;
    public int f36367c;
    public final TextPaint d;
    public final Paint f36368e;
    public final RectF f36369f;
    public int h;
    public int f36370n;
    public Drawable f36371r;
    public StaticLayout f36372s;
    public Drawable f36373w;
    public StaticLayout f36374x;
    public int f36375y;

    public n41(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f36368e = new Paint(1);
        this.f36369f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.E = textPaint2;
        this.H = 1.0f;
        this.N = org.telegram.ui.ActionBar.k6.f28110pf;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
    }

    public final void a(String str, boolean z10) {
        if (this.M != str) {
            this.M = str;
            this.I = z10;
            this.f36374x = this.f36372s;
            this.f36373w = this.f36371r;
            Typeface o10 = org.telegram.messenger.g0.o();
            TextPaint textPaint = this.E;
            textPaint.setTypeface(o10);
            this.f36375y = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f36371r = null;
            this.f36372s = new StaticLayout(str, textPaint, this.f36375y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f36374x == null && this.f36373w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.H = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new m41(0, this));
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
        int i3;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        StaticLayout staticLayout = this.f36372s;
        if (isEnabled()) {
            i3 = this.N;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, getResourceProvider());
        int i14 = this.J;
        TextPaint textPaint = this.E;
        if (i14 != w02) {
            this.J = w02;
            textPaint.setColor(w02);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, getResourceProvider());
        int i15 = this.K;
        TextPaint textPaint2 = this.d;
        if (i15 != w03) {
            this.K = w03;
            textPaint2.setColor(w03);
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27963hg, getResourceProvider());
        int i16 = this.L;
        Paint paint = this.f36368e;
        if (i16 != w04) {
            this.L = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f36370n != org.telegram.ui.ActionBar.k6.w0(this.N, getResourceProvider()) || this.F == null) {
                int L = org.telegram.messenger.g0.L(60.0f);
                int w05 = org.telegram.ui.ActionBar.k6.w0(this.N, getResourceProvider());
                this.f36370n = w05;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(w05, 26));
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
        if (this.f36372s != null) {
            canvas.save();
            if (this.H != 1.0f && this.f36374x != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f36374x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f36372s.getHeight()) / 2));
                Drawable drawable = this.f36373w;
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
                Drawable drawable2 = this.f36373w;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f12 = 1.0f;
                    f13 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f36372s.getHeight() - this.f36373w.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f36373w.getIntrinsicHeight() + this.f36372s.getHeight()) / 2));
                    this.f36373w.setAlpha((int) ((1.0f - this.H) * alpha));
                    this.f36373w.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f12 = 1.0f;
                    f13 = 3.0f;
                }
                float f16 = alpha;
                textPaint.setAlpha((int) ((f12 - this.H) * f16));
                this.f36374x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f36375y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f36372s.getHeight()) / 2));
                Drawable drawable3 = this.f36371r;
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
                Drawable drawable4 = this.f36371r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12) + ((this.f36372s.getHeight() - this.f36371r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12) + ((this.f36371r.getIntrinsicHeight() + this.f36372s.getHeight()) / 2));
                    this.f36371r.setAlpha((int) (this.H * f16));
                    this.f36371r.draw(canvas);
                }
                textPaint.setAlpha((int) (f16 * this.H));
                this.f36372s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f36375y) / 2) - (this.h / 2);
                Drawable drawable5 = this.f36371r;
                if (drawable5 != null) {
                    i10 = org.telegram.messenger.g0.L(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i10 = 0;
                }
                canvas.translate(measuredWidth3 + i10, getTopOffset() + ((getMeasuredHeight() - this.f36372s.getHeight()) / 2));
                Drawable drawable6 = this.f36371r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f36372s.getHeight() - this.f36371r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.f36371r.getIntrinsicHeight() + this.f36372s.getHeight()) / 2));
                    this.f36371r.setAlpha(255);
                    this.f36371r.draw(canvas);
                }
                this.f36372s.draw(canvas);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.f36366b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int L2 = org.telegram.messenger.g0.L(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float L3 = org.telegram.messenger.g0.L(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f36369f;
            rectF.set(L2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(10.0f), L2 + this.h, L3);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            canvas.drawText(this.f36366b, rectF.centerX() - (this.f36367c / 2.0f), rectF.top + org.telegram.messenger.g0.L(14.5f), textPaint2);
        }
    }

    public void setCounter(int i3) {
        if (this.f36365a != i3) {
            this.f36365a = i3;
            if (i3 == 0) {
                this.f36366b = null;
                this.h = 0;
            } else {
                String o02 = org.telegram.messenger.g0.o0(i3, 0);
                this.f36366b = o02;
                this.f36367c = (int) Math.ceil(this.d.measureText(o02));
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f) + this.f36367c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o10 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.E;
        textPaint.setTypeface(o10);
        this.f36375y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f36371r = null;
        this.f36372s = new StaticLayout(charSequence, textPaint, this.f36375y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i3) {
        this.N = i3;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.E;
        textPaint.setTypeface(null);
        this.f36375y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f36371r = null;
        this.f36372s = new StaticLayout(charSequence, textPaint, this.f36375y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
