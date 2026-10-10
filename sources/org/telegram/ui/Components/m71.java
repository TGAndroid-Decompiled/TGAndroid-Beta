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
import org.telegram.messenger.AndroidUtilities;
public class m71 extends View {
    public org.telegram.ui.Cells.z E;
    public ValueAnimator F;
    public float G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public CharSequence L;
    public int M;
    public int f28695a;
    public String f28696b;
    public int f28697c;
    public final TextPaint d;
    public final Paint f28698e;
    public final RectF f28699f;
    public int h;
    public int f28700n;
    public Drawable f28701r;
    public StaticLayout f28702s;
    public Drawable v;
    public StaticLayout f28703w;
    public int f28704x;
    public final TextPaint f28705y;

    public m71(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f28698e = new Paint(1);
        this.f28699f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.f28705y = textPaint2;
        this.G = 1.0f;
        this.M = org.telegram.ui.ActionBar.i6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z10) {
        if (this.L != str) {
            this.L = str;
            this.H = z10;
            this.f28703w = this.f28702s;
            this.v = this.f28701r;
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = this.f28705y;
            textPaint.setTypeface(bold);
            this.f28704x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f28701r = null;
            this.f28702s = new StaticLayout(str, textPaint, this.f28704x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f28703w == null && this.v == null) {
                return;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.G = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new v51(1, this));
            this.F.setDuration(150L);
            this.F.start();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            zVar.setState(getDrawableState());
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
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            zVar.jumpToCurrentState();
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
        StaticLayout staticLayout = this.f28702s;
        if (isEnabled()) {
            i10 = this.M;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21185y6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, getResourceProvider());
        int i15 = this.I;
        TextPaint textPaint = this.f28705y;
        if (i15 != w02) {
            this.I = w02;
            textPaint.setColor(w02);
        }
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sd, getResourceProvider());
        int i16 = this.J;
        TextPaint textPaint2 = this.d;
        if (i16 != w03) {
            this.J = w03;
            textPaint2.setColor(w03);
        }
        int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21104tf, getResourceProvider());
        int i17 = this.K;
        Paint paint = this.f28698e;
        if (i17 != w04) {
            this.K = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f28700n != org.telegram.ui.ActionBar.i6.w0(this.M, getResourceProvider()) || this.E == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int w05 = org.telegram.ui.ActionBar.i6.w0(this.M, getResourceProvider());
                this.f28700n = w05;
                org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(dp, 0, i0.a.k(w05, 26));
                this.E = i02;
                i02.setCallback(this);
            }
            if (getLeft() + measuredWidth2 <= 0) {
                i14 = measuredWidth2 - AndroidUtilities.dp(20.0f);
            } else {
                i14 = measuredWidth2;
            }
            int i18 = measuredWidth2 + measuredWidth;
            if (i18 > ((View) getParent()).getMeasuredWidth()) {
                i18 += AndroidUtilities.dp(20.0f);
            }
            int i19 = measuredWidth / 2;
            this.E.setBounds(i14, (getMeasuredHeight() / 2) - i19, i18, (getMeasuredHeight() / 2) + i19);
            this.E.draw(canvas);
        }
        if (this.f28702s != null) {
            canvas.save();
            if (this.G != 1.0f && this.f28703w != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f28703w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f28702s.getHeight()) / 2));
                Drawable drawable = this.v;
                if (drawable != null) {
                    i12 = AndroidUtilities.dp(3.0f) + (drawable.getIntrinsicWidth() / 2);
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
                canvas.translate(f13, f10 * AndroidUtilities.dp(18.0f) * this.G);
                Drawable drawable2 = this.v;
                if (drawable2 != null) {
                    f7 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f28702s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.f28702s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.G) * alpha));
                    this.v.draw(canvas);
                } else {
                    f7 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                }
                float f15 = alpha;
                textPaint.setAlpha((int) ((f11 - this.G) * f15));
                this.f28703w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f28704x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f28702s.getHeight()) / 2));
                Drawable drawable3 = this.f28701r;
                if (drawable3 != null) {
                    i13 = AndroidUtilities.dp(f12) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i13 = 0;
                }
                float f16 = i13;
                if (this.H) {
                    f14 = f11;
                }
                canvas.translate(f16, (f11 - this.G) * f14 * AndroidUtilities.dp(18.0f));
                Drawable drawable4 = this.f28701r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(f7), AndroidUtilities.dp(f11) + ((this.f28702s.getHeight() - this.f28701r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f7), AndroidUtilities.dp(f11) + ((this.f28701r.getIntrinsicHeight() + this.f28702s.getHeight()) / 2));
                    this.f28701r.setAlpha((int) (this.G * f15));
                    this.f28701r.draw(canvas);
                }
                textPaint.setAlpha((int) (f15 * this.G));
                this.f28702s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f7 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f28704x) / 2) - (this.h / 2);
                Drawable drawable5 = this.f28701r;
                if (drawable5 != null) {
                    i11 = AndroidUtilities.dp(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                canvas.translate(measuredWidth3 + i11, getTopOffset() + ((getMeasuredHeight() - this.f28702s.getHeight()) / 2));
                Drawable drawable6 = this.f28701r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f28702s.getHeight() - this.f28701r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f28701r.getIntrinsicHeight() + this.f28702s.getHeight()) / 2));
                    this.f28701r.setAlpha(255);
                    this.f28701r.draw(canvas);
                }
                this.f28702s.draw(canvas);
            }
            canvas.restore();
        } else {
            f7 = 6.0f;
        }
        if (this.f28696b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int dp2 = AndroidUtilities.dp(f7) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float dp3 = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f28699f;
            rectF.set(dp2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), dp2 + this.h, dp3);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            canvas.drawText(this.f28696b, rectF.centerX() - (this.f28697c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
        }
    }

    public void setCounter(int i10) {
        if (this.f28695a != i10) {
            this.f28695a = i10;
            if (i10 == 0) {
                this.f28696b = null;
                this.h = 0;
            } else {
                String formatWholeNumber = AndroidUtilities.formatWholeNumber(i10, 0);
                this.f28696b = formatWholeNumber;
                this.f28697c = (int) Math.ceil(this.d.measureText(formatWholeNumber));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.f28697c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f28705y;
        textPaint.setTypeface(bold);
        this.f28704x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f28701r = null;
        this.f28702s = new StaticLayout(charSequence, textPaint, this.f28704x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.f28705y;
        textPaint.setTypeface(null);
        this.f28704x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f28701r = null;
        this.f28702s = new StaticLayout(charSequence, textPaint, this.f28704x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            if (zVar != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
