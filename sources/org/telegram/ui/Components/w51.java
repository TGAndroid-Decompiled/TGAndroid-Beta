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
public class w51 extends View {
    public org.telegram.ui.Cells.z A;
    public ValueAnimator B;
    public float C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public int f34321a;
    public String f34322b;
    public int f34323c;
    public final TextPaint d;
    public final Paint f34324e;
    public final RectF f34325f;
    public int h;
    public int f34326n;
    public Drawable f34327r;
    public StaticLayout f34328s;
    public Drawable v;
    public StaticLayout f34329w;
    public int f34330x;
    public final TextPaint f34331y;

    public w51(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f34324e = new Paint(1);
        this.f34325f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.f34331y = textPaint2;
        this.C = 1.0f;
        this.I = org.telegram.ui.ActionBar.g6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z10) {
        if (this.H != str) {
            this.H = str;
            this.D = z10;
            this.f34329w = this.f34328s;
            this.v = this.f34327r;
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = this.f34331y;
            textPaint.setTypeface(bold);
            this.f34330x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f34327r = null;
            this.f34328s = new StaticLayout(str, textPaint, this.f34330x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f34329w == null && this.v == null) {
                return;
            }
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.C = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new v51(0, this));
            this.B.setDuration(150L);
            this.B.start();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        int i13;
        int i14;
        StaticLayout staticLayout = this.f34328s;
        if (isEnabled()) {
            i10 = this.I;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23433y6;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, getResourceProvider());
        int i15 = this.E;
        TextPaint textPaint = this.f34331y;
        if (i15 != v02) {
            this.E = v02;
            textPaint.setColor(v02);
        }
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, getResourceProvider());
        int i16 = this.F;
        TextPaint textPaint2 = this.d;
        if (i16 != v03) {
            this.F = v03;
            textPaint2.setColor(v03);
        }
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23355tf, getResourceProvider());
        int i17 = this.G;
        Paint paint = this.f34324e;
        if (i17 != v04) {
            this.G = v04;
            paint.setColor(v04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f34326n != org.telegram.ui.ActionBar.g6.v0(this.I, getResourceProvider()) || this.A == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int v05 = org.telegram.ui.ActionBar.g6.v0(this.I, getResourceProvider());
                this.f34326n = v05;
                org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(dp, 0, i0.a.k(v05, 26));
                this.A = h02;
                h02.setCallback(this);
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
            this.A.setBounds(i14, (getMeasuredHeight() / 2) - i19, i18, (getMeasuredHeight() / 2) + i19);
            this.A.draw(canvas);
        }
        if (this.f34328s != null) {
            canvas.save();
            if (this.C != 1.0f && this.f34329w != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f34329w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f34328s.getHeight()) / 2));
                Drawable drawable = this.v;
                if (drawable != null) {
                    i12 = AndroidUtilities.dp(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i12 = 0;
                }
                float f13 = i12;
                float f14 = -1.0f;
                if (this.D) {
                    f10 = -1.0f;
                } else {
                    f10 = 1.0f;
                }
                canvas.translate(f13, f10 * AndroidUtilities.dp(18.0f) * this.C);
                Drawable drawable2 = this.v;
                if (drawable2 != null) {
                    f9 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f34328s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.f34328s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.C) * alpha));
                    this.v.draw(canvas);
                } else {
                    f9 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                }
                float f15 = alpha;
                textPaint.setAlpha((int) ((f12 - this.C) * f15));
                this.f34329w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f34330x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f34328s.getHeight()) / 2));
                Drawable drawable3 = this.f34327r;
                if (drawable3 != null) {
                    i13 = AndroidUtilities.dp(f11) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i13 = 0;
                }
                float f16 = i13;
                if (this.D) {
                    f14 = 1.0f;
                }
                canvas.translate(f16, (f12 - this.C) * f14 * AndroidUtilities.dp(18.0f));
                Drawable drawable4 = this.f34327r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(f9), AndroidUtilities.dp(f12) + ((this.f34328s.getHeight() - this.f34327r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f9), AndroidUtilities.dp(f12) + ((this.f34327r.getIntrinsicHeight() + this.f34328s.getHeight()) / 2));
                    this.f34327r.setAlpha((int) (this.C * f15));
                    this.f34327r.draw(canvas);
                }
                textPaint.setAlpha((int) (f15 * this.C));
                this.f34328s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f9 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f34330x) / 2) - (this.h / 2);
                Drawable drawable5 = this.f34327r;
                if (drawable5 != null) {
                    i11 = AndroidUtilities.dp(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                canvas.translate(measuredWidth3 + i11, getTopOffset() + ((getMeasuredHeight() - this.f34328s.getHeight()) / 2));
                Drawable drawable6 = this.f34327r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f34328s.getHeight() - this.f34327r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f34327r.getIntrinsicHeight() + this.f34328s.getHeight()) / 2));
                    this.f34327r.setAlpha(255);
                    this.f34327r.draw(canvas);
                }
                this.f34328s.draw(canvas);
            }
            canvas.restore();
        } else {
            f9 = 6.0f;
        }
        if (this.f34322b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int dp2 = AndroidUtilities.dp(f9) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float dp3 = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f34325f;
            rectF.set(dp2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), dp2 + this.h, dp3);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            canvas.drawText(this.f34322b, rectF.centerX() - (this.f34323c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
        }
    }

    public void setCounter(int i10) {
        if (this.f34321a != i10) {
            this.f34321a = i10;
            if (i10 == 0) {
                this.f34322b = null;
                this.h = 0;
            } else {
                String formatWholeNumber = AndroidUtilities.formatWholeNumber(i10, 0);
                this.f34322b = formatWholeNumber;
                this.f34323c = (int) Math.ceil(this.d.measureText(formatWholeNumber));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.f34323c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f34331y;
        textPaint.setTypeface(bold);
        this.f34330x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f34327r = null;
        this.f34328s = new StaticLayout(charSequence, textPaint, this.f34330x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.I = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.f34331y;
        textPaint.setTypeface(null);
        this.f34330x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f34327r = null;
        this.f34328s = new StaticLayout(charSequence, textPaint, this.f34330x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            if (zVar != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
