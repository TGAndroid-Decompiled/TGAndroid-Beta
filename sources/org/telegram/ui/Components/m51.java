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

public class m51 extends View {
    public org.telegram.ui.Cells.z A;
    public ValueAnimator B;
    public float C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;

    public int f30567a;

    public String f30568b;

    public int f30569c;
    public final TextPaint d;

    public final Paint f30570e;

    public final RectF f30571f;
    public int h;

    public int f30572n;

    public Drawable f30573r;

    public StaticLayout f30574s;
    public Drawable v;

    public StaticLayout f30575w;

    public int f30576x;

    public final TextPaint f30577y;

    public m51(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f30570e = new Paint(1);
        this.f30571f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.f30577y = textPaint2;
        this.C = 1.0f;
        this.I = org.telegram.ui.ActionBar.g6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z10) {
        if (this.H == str) {
            return;
        }
        this.H = str;
        this.D = z10;
        this.f30575w = this.f30574s;
        this.v = this.f30573r;
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = this.f30577y;
        textPaint.setTypeface(typefaceBold);
        int i10 = 0;
        this.f30576x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
        this.f30573r = null;
        this.f30574s = new StaticLayout(str, textPaint, this.f30576x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(str);
        invalidate();
        if (this.f30575w == null && this.v == null) {
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new l51(i10, this));
        this.B.setDuration(150L);
        this.B.start();
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
        float f10;
        int iDp;
        int iDp2;
        float f11;
        float f12;
        int iDp3;
        StaticLayout staticLayout = this.f30574s;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(isEnabled() ? this.I : org.telegram.ui.ActionBar.g6.f23423y6, getResourceProvider());
        int i10 = this.E;
        TextPaint textPaint = this.f30577y;
        if (i10 != iV0) {
            this.E = iV0;
            textPaint.setColor(iV0);
        }
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, getResourceProvider());
        int i11 = this.F;
        TextPaint textPaint2 = this.d;
        if (i11 != iV1) {
            this.F = iV1;
            textPaint2.setColor(iV1);
        }
        int iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23348tf, getResourceProvider());
        int i12 = this.G;
        Paint paint = this.f30570e;
        if (i12 != iV2) {
            this.G = iV2;
            paint.setColor(iV2);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f30572n != org.telegram.ui.ActionBar.g6.v0(this.I, getResourceProvider()) || this.A == null) {
                int iDp4 = AndroidUtilities.dp(60.0f);
                int iV3 = org.telegram.ui.ActionBar.g6.v0(this.I, getResourceProvider());
                this.f30572n = iV3;
                org.telegram.ui.Cells.z zVarH0 = org.telegram.ui.ActionBar.g6.h0(iDp4, 0, i0.b.k(iV3, 26));
                this.A = zVarH0;
                zVarH0.setCallback(this);
            }
            int iDp5 = getLeft() + measuredWidth2 <= 0 ? measuredWidth2 - AndroidUtilities.dp(20.0f) : measuredWidth2;
            int iDp6 = measuredWidth2 + measuredWidth;
            if (iDp6 > ((View) getParent()).getMeasuredWidth()) {
                iDp6 += AndroidUtilities.dp(20.0f);
            }
            int i13 = measuredWidth / 2;
            this.A.setBounds(iDp5, (getMeasuredHeight() / 2) - i13, iDp6, (getMeasuredHeight() / 2) + i13);
            this.A.draw(canvas);
        }
        if (this.f30574s != null) {
            canvas.save();
            if (this.C == 1.0f || this.f30575w == null) {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f30576x) / 2) - (this.h / 2);
                Drawable drawable = this.f30573r;
                if (drawable != null) {
                    iDp = AndroidUtilities.dp(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    iDp = 0;
                }
                canvas.translate(measuredWidth3 + iDp, getTopOffset() + ((getMeasuredHeight() - this.f30574s.getHeight()) / 2));
                Drawable drawable2 = this.f30573r;
                if (drawable2 != null) {
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f30574s.getHeight() - this.f30573r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f30573r.getIntrinsicHeight() + this.f30574s.getHeight()) / 2));
                    this.f30573r.setAlpha(255);
                    this.f30573r.draw(canvas);
                }
                this.f30574s.draw(canvas);
            } else {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f30575w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f30574s.getHeight()) / 2));
                Drawable drawable3 = this.v;
                if (drawable3 != null) {
                    iDp2 = AndroidUtilities.dp(3.0f) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    iDp2 = 0;
                }
                canvas.translate(iDp2, (this.D ? -1.0f : 1.0f) * AndroidUtilities.dp(18.0f) * this.C);
                Drawable drawable4 = this.v;
                if (drawable4 != null) {
                    f10 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f30574s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.f30574s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.C) * alpha));
                    this.v.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                }
                float f13 = alpha;
                textPaint.setAlpha((int) ((f12 - this.C) * f13));
                this.f30575w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f30576x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f30574s.getHeight()) / 2));
                Drawable drawable5 = this.f30573r;
                if (drawable5 != null) {
                    iDp3 = AndroidUtilities.dp(f11) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    iDp3 = 0;
                }
                canvas.translate(iDp3, (f12 - this.C) * (this.D ? 1.0f : -1.0f) * AndroidUtilities.dp(18.0f));
                Drawable drawable6 = this.f30573r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(f10), AndroidUtilities.dp(f12) + ((this.f30574s.getHeight() - this.f30573r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f10), AndroidUtilities.dp(f12) + ((this.f30573r.getIntrinsicHeight() + this.f30574s.getHeight()) / 2));
                    this.f30573r.setAlpha((int) (this.C * f13));
                    this.f30573r.draw(canvas);
                }
                textPaint.setAlpha((int) (f13 * this.C));
                this.f30574s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.f30568b == null || staticLayout == null) {
            return;
        }
        int iCeil = (int) Math.ceil(staticLayout.getLineWidth(0));
        int iDp7 = AndroidUtilities.dp(f10) + ((((getMeasuredWidth() - iCeil) / 2) + iCeil) - (this.h / 2));
        float f14 = iDp7;
        float measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f);
        float f15 = iDp7 + this.h;
        float fDp = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
        RectF rectF = this.f30571f;
        rectF.set(f14, measuredHeight, f15, fDp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        canvas.drawText(this.f30568b, rectF.centerX() - (this.f30569c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
    }

    public void setCounter(int i10) {
        if (this.f30567a != i10) {
            this.f30567a = i10;
            if (i10 == 0) {
                this.f30568b = null;
                this.h = 0;
            } else {
                String wholeNumber = AndroidUtilities.formatWholeNumber(i10, 0);
                this.f30568b = wholeNumber;
                this.f30569c = (int) Math.ceil(this.d.measureText(wholeNumber));
                int iMax = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.f30569c);
                if (this.h != iMax) {
                    this.h = iMax;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = this.f30577y;
        textPaint.setTypeface(typefaceBold);
        this.f30576x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f30573r = null;
        this.f30574s = new StaticLayout(charSequence, textPaint, this.f30576x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.I = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.f30577y;
        textPaint.setTypeface(null);
        this.f30576x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f30573r = null;
        this.f30574s = new StaticLayout(charSequence, textPaint, this.f30576x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            return zVar == drawable || super.verifyDrawable(drawable);
        }
        return super.verifyDrawable(drawable);
    }
}
