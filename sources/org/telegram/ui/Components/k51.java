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
public class k51 extends View {
    public org.telegram.ui.Cells.z A;
    public ValueAnimator B;
    public float C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public int f29962a;
    public String f29963b;
    public int f29964c;
    public final TextPaint d;
    public final Paint f29965e;
    public final RectF f29966f;
    public int h;
    public int f29967n;
    public Drawable f29968r;
    public StaticLayout f29969s;
    public Drawable v;
    public StaticLayout f29970w;
    public int f29971x;
    public final TextPaint f29972y;

    public k51(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f29965e = new Paint(1);
        this.f29966f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.f29972y = textPaint2;
        this.C = 1.0f;
        this.I = org.telegram.ui.ActionBar.f6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z10) {
        if (this.H != str) {
            this.H = str;
            this.D = z10;
            this.f29970w = this.f29969s;
            this.v = this.f29968r;
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = this.f29972y;
            textPaint.setTypeface(bold);
            this.f29971x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f29968r = null;
            this.f29969s = new StaticLayout(str, textPaint, this.f29971x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f29970w == null && this.v == null) {
                return;
            }
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.C = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new j51(0, this));
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

    public org.telegram.ui.ActionBar.b6 getResourceProvider() {
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
        int i9;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        StaticLayout staticLayout = this.f29969s;
        if (isEnabled()) {
            i9 = this.I;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, getResourceProvider());
        int i14 = this.E;
        TextPaint textPaint = this.f29972y;
        if (i14 != v02) {
            this.E = v02;
            textPaint.setColor(v02);
        }
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sd, getResourceProvider());
        int i15 = this.F;
        TextPaint textPaint2 = this.d;
        if (i15 != v03) {
            this.F = v03;
            textPaint2.setColor(v03);
        }
        int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23294tf, getResourceProvider());
        int i16 = this.G;
        Paint paint = this.f29965e;
        if (i16 != v04) {
            this.G = v04;
            paint.setColor(v04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f29967n != org.telegram.ui.ActionBar.f6.v0(this.I, getResourceProvider()) || this.A == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int v05 = org.telegram.ui.ActionBar.f6.v0(this.I, getResourceProvider());
                this.f29967n = v05;
                org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.f6.h0(dp, 0, i0.a.k(v05, 26));
                this.A = h02;
                h02.setCallback(this);
            }
            if (getLeft() + measuredWidth2 <= 0) {
                i13 = measuredWidth2 - AndroidUtilities.dp(20.0f);
            } else {
                i13 = measuredWidth2;
            }
            int i17 = measuredWidth2 + measuredWidth;
            if (i17 > ((View) getParent()).getMeasuredWidth()) {
                i17 += AndroidUtilities.dp(20.0f);
            }
            int i18 = measuredWidth / 2;
            this.A.setBounds(i13, (getMeasuredHeight() / 2) - i18, i17, (getMeasuredHeight() / 2) + i18);
            this.A.draw(canvas);
        }
        if (this.f29969s != null) {
            canvas.save();
            if (this.C != 1.0f && this.f29970w != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f29970w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f29969s.getHeight()) / 2));
                Drawable drawable = this.v;
                if (drawable != null) {
                    i11 = AndroidUtilities.dp(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                float f14 = i11;
                float f15 = -1.0f;
                if (this.D) {
                    f11 = -1.0f;
                } else {
                    f11 = 1.0f;
                }
                canvas.translate(f14, f11 * AndroidUtilities.dp(18.0f) * this.C);
                Drawable drawable2 = this.v;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f12 = 3.0f;
                    f13 = 1.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f29969s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.f29969s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.C) * alpha));
                    this.v.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f12 = 3.0f;
                    f13 = 1.0f;
                }
                float f16 = alpha;
                textPaint.setAlpha((int) ((f13 - this.C) * f16));
                this.f29970w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f29971x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f29969s.getHeight()) / 2));
                Drawable drawable3 = this.f29968r;
                if (drawable3 != null) {
                    i12 = AndroidUtilities.dp(f12) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i12 = 0;
                }
                float f17 = i12;
                if (this.D) {
                    f15 = 1.0f;
                }
                canvas.translate(f17, (f13 - this.C) * f15 * AndroidUtilities.dp(18.0f));
                Drawable drawable4 = this.f29968r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(f10), AndroidUtilities.dp(f13) + ((this.f29969s.getHeight() - this.f29968r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f10), AndroidUtilities.dp(f13) + ((this.f29968r.getIntrinsicHeight() + this.f29969s.getHeight()) / 2));
                    this.f29968r.setAlpha((int) (this.C * f16));
                    this.f29968r.draw(canvas);
                }
                textPaint.setAlpha((int) (f16 * this.C));
                this.f29969s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f29971x) / 2) - (this.h / 2);
                Drawable drawable5 = this.f29968r;
                if (drawable5 != null) {
                    i10 = AndroidUtilities.dp(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i10 = 0;
                }
                canvas.translate(measuredWidth3 + i10, getTopOffset() + ((getMeasuredHeight() - this.f29969s.getHeight()) / 2));
                Drawable drawable6 = this.f29968r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f29969s.getHeight() - this.f29968r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f29968r.getIntrinsicHeight() + this.f29969s.getHeight()) / 2));
                    this.f29968r.setAlpha(255);
                    this.f29968r.draw(canvas);
                }
                this.f29969s.draw(canvas);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.f29963b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int dp2 = AndroidUtilities.dp(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float dp3 = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f29966f;
            rectF.set(dp2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), dp2 + this.h, dp3);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            canvas.drawText(this.f29963b, rectF.centerX() - (this.f29964c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
        }
    }

    public void setCounter(int i9) {
        if (this.f29962a != i9) {
            this.f29962a = i9;
            if (i9 == 0) {
                this.f29963b = null;
                this.h = 0;
            } else {
                String formatWholeNumber = AndroidUtilities.formatWholeNumber(i9, 0);
                this.f29963b = formatWholeNumber;
                this.f29964c = (int) Math.ceil(this.d.measureText(formatWholeNumber));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.f29964c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f29972y;
        textPaint.setTypeface(bold);
        this.f29971x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f29968r = null;
        this.f29969s = new StaticLayout(charSequence, textPaint, this.f29971x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i9) {
        this.I = i9;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.f29972y;
        textPaint.setTypeface(null);
        this.f29971x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f29968r = null;
        this.f29969s = new StaticLayout(charSequence, textPaint, this.f29971x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
