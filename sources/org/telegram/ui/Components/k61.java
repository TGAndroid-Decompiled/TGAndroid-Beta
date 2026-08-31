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
public class k61 extends View {
    public org.telegram.ui.Cells.z B;
    public ValueAnimator C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public CharSequence I;
    public int J;
    public int f28287a;
    public String f28288b;
    public int f28289c;
    public final TextPaint d;
    public final Paint f28290e;
    public final RectF f28291f;
    public int h;
    public int f28292n;
    public Drawable f28293r;
    public StaticLayout f28294s;
    public Drawable v;
    public StaticLayout f28295w;
    public int f28296x;
    public final TextPaint f28297y;

    public k61(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f28290e = new Paint(1);
        this.f28291f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.f28297y = textPaint2;
        this.D = 1.0f;
        this.J = org.telegram.ui.ActionBar.k6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z4) {
        if (this.I != str) {
            this.I = str;
            this.E = z4;
            this.f28295w = this.f28294s;
            this.v = this.f28293r;
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = this.f28297y;
            textPaint.setTypeface(bold);
            this.f28296x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f28293r = null;
            this.f28294s = new StaticLayout(str, textPaint, this.f28296x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f28295w == null && this.v == null) {
                return;
            }
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.D = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new j61(0, this));
            this.C.setDuration(150L);
            this.C.start();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.B;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.B;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        int i13;
        int i14;
        StaticLayout staticLayout = this.f28294s;
        if (isEnabled()) {
            i10 = this.J;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f22036y6;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, getResourceProvider());
        int i15 = this.F;
        TextPaint textPaint = this.f28297y;
        if (i15 != v02) {
            this.F = v02;
            textPaint.setColor(v02);
        }
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sd, getResourceProvider());
        int i16 = this.G;
        TextPaint textPaint2 = this.d;
        if (i16 != v03) {
            this.G = v03;
            textPaint2.setColor(v03);
        }
        int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21951tf, getResourceProvider());
        int i17 = this.H;
        Paint paint = this.f28290e;
        if (i17 != v04) {
            this.H = v04;
            paint.setColor(v04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f28292n != org.telegram.ui.ActionBar.k6.v0(this.J, getResourceProvider()) || this.B == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int v05 = org.telegram.ui.ActionBar.k6.v0(this.J, getResourceProvider());
                this.f28292n = v05;
                org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.k6.h0(dp, 0, i0.a.k(v05, 26));
                this.B = h02;
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
            this.B.setBounds(i14, (getMeasuredHeight() / 2) - i19, i18, (getMeasuredHeight() / 2) + i19);
            this.B.draw(canvas);
        }
        if (this.f28294s != null) {
            canvas.save();
            if (this.D != 1.0f && this.f28295w != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f28295w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f28294s.getHeight()) / 2));
                Drawable drawable = this.v;
                if (drawable != null) {
                    i12 = AndroidUtilities.dp(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i12 = 0;
                }
                float f14 = i12;
                float f15 = -1.0f;
                if (this.E) {
                    f11 = -1.0f;
                } else {
                    f11 = 1.0f;
                }
                canvas.translate(f14, f11 * AndroidUtilities.dp(18.0f) * this.D);
                Drawable drawable2 = this.v;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f12 = 3.0f;
                    f13 = 1.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f28294s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.f28294s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.D) * alpha));
                    this.v.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f12 = 3.0f;
                    f13 = 1.0f;
                }
                float f16 = alpha;
                textPaint.setAlpha((int) ((f13 - this.D) * f16));
                this.f28295w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f28296x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f28294s.getHeight()) / 2));
                Drawable drawable3 = this.f28293r;
                if (drawable3 != null) {
                    i13 = AndroidUtilities.dp(f12) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i13 = 0;
                }
                float f17 = i13;
                if (this.E) {
                    f15 = 1.0f;
                }
                canvas.translate(f17, (f13 - this.D) * f15 * AndroidUtilities.dp(18.0f));
                Drawable drawable4 = this.f28293r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(f10), AndroidUtilities.dp(f13) + ((this.f28294s.getHeight() - this.f28293r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f10), AndroidUtilities.dp(f13) + ((this.f28293r.getIntrinsicHeight() + this.f28294s.getHeight()) / 2));
                    this.f28293r.setAlpha((int) (this.D * f16));
                    this.f28293r.draw(canvas);
                }
                textPaint.setAlpha((int) (f16 * this.D));
                this.f28294s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f28296x) / 2) - (this.h / 2);
                Drawable drawable5 = this.f28293r;
                if (drawable5 != null) {
                    i11 = AndroidUtilities.dp(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                canvas.translate(measuredWidth3 + i11, getTopOffset() + ((getMeasuredHeight() - this.f28294s.getHeight()) / 2));
                Drawable drawable6 = this.f28293r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f28294s.getHeight() - this.f28293r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f28293r.getIntrinsicHeight() + this.f28294s.getHeight()) / 2));
                    this.f28293r.setAlpha(255);
                    this.f28293r.draw(canvas);
                }
                this.f28294s.draw(canvas);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.f28288b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int dp2 = AndroidUtilities.dp(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float dp3 = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f28291f;
            rectF.set(dp2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), dp2 + this.h, dp3);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            canvas.drawText(this.f28288b, rectF.centerX() - (this.f28289c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
        }
    }

    public void setCounter(int i10) {
        if (this.f28287a != i10) {
            this.f28287a = i10;
            if (i10 == 0) {
                this.f28288b = null;
                this.h = 0;
            } else {
                String formatWholeNumber = AndroidUtilities.formatWholeNumber(i10, 0);
                this.f28288b = formatWholeNumber;
                this.f28289c = (int) Math.ceil(this.d.measureText(formatWholeNumber));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.f28289c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f28297y;
        textPaint.setTypeface(bold);
        this.f28296x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f28293r = null;
        this.f28294s = new StaticLayout(charSequence, textPaint, this.f28296x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.f28297y;
        textPaint.setTypeface(null);
        this.f28296x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f28293r = null;
        this.f28294s = new StaticLayout(charSequence, textPaint, this.f28296x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.z zVar = this.B;
        if (zVar != null) {
            if (zVar != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
