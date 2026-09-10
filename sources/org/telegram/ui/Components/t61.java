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
public class t61 extends View {
    public org.telegram.ui.Cells.z E;
    public ValueAnimator F;
    public float G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public CharSequence L;
    public int M;
    public int f27346a;
    public String f27347b;
    public int f27348c;
    public final TextPaint d;
    public final Paint e;
    public final RectF f27349f;
    public int h;
    public int f27350n;
    public Drawable f27351r;
    public StaticLayout f27352s;
    public Drawable v;
    public StaticLayout f27353w;
    public int f27354x;
    public final TextPaint f27355y;

    public t61(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f27349f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.f27355y = textPaint2;
        this.G = 1.0f;
        this.M = org.telegram.ui.ActionBar.j6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z10) {
        if (this.L != str) {
            this.L = str;
            this.H = z10;
            this.f27353w = this.f27352s;
            this.v = this.f27351r;
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = this.f27355y;
            textPaint.setTypeface(bold);
            this.f27354x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
            this.f27351r = null;
            this.f27352s = new StaticLayout(str, textPaint, this.f27354x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.f27353w == null && this.v == null) {
                return;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.G = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new s61(0, this));
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

    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
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
        StaticLayout staticLayout = this.f27352s;
        if (isEnabled()) {
            i10 = this.M;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18306y6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, getResourceProvider());
        int i15 = this.I;
        TextPaint textPaint = this.f27355y;
        if (i15 != v02) {
            this.I = v02;
            textPaint.setColor(v02);
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, getResourceProvider());
        int i16 = this.J;
        TextPaint textPaint2 = this.d;
        if (i16 != v03) {
            this.J = v03;
            textPaint2.setColor(v03);
        }
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18226tf, getResourceProvider());
        int i17 = this.K;
        Paint paint = this.e;
        if (i17 != v04) {
            this.K = v04;
            paint.setColor(v04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.f27350n != org.telegram.ui.ActionBar.j6.v0(this.M, getResourceProvider()) || this.E == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int v05 = org.telegram.ui.ActionBar.j6.v0(this.M, getResourceProvider());
                this.f27350n = v05;
                org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(dp, 0, i0.a.k(v05, 26));
                this.E = h02;
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
            this.E.setBounds(i14, (getMeasuredHeight() / 2) - i19, i18, (getMeasuredHeight() / 2) + i19);
            this.E.draw(canvas);
        }
        if (this.f27352s != null) {
            canvas.save();
            if (this.G != 1.0f && this.f27353w != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f27353w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f27352s.getHeight()) / 2));
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
                    f11 = 3.0f;
                    f12 = 1.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f27352s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.f27352s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.G) * alpha));
                    this.v.draw(canvas);
                } else {
                    f7 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                }
                float f15 = alpha;
                textPaint.setAlpha((int) ((f12 - this.G) * f15));
                this.f27353w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.f27354x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.f27352s.getHeight()) / 2));
                Drawable drawable3 = this.f27351r;
                if (drawable3 != null) {
                    i13 = AndroidUtilities.dp(f11) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i13 = 0;
                }
                float f16 = i13;
                if (this.H) {
                    f14 = 1.0f;
                }
                canvas.translate(f16, (f12 - this.G) * f14 * AndroidUtilities.dp(18.0f));
                Drawable drawable4 = this.f27351r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(f7), AndroidUtilities.dp(f12) + ((this.f27352s.getHeight() - this.f27351r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f7), AndroidUtilities.dp(f12) + ((this.f27351r.getIntrinsicHeight() + this.f27352s.getHeight()) / 2));
                    this.f27351r.setAlpha((int) (this.G * f15));
                    this.f27351r.draw(canvas);
                }
                textPaint.setAlpha((int) (f15 * this.G));
                this.f27352s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f7 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.f27354x) / 2) - (this.h / 2);
                Drawable drawable5 = this.f27351r;
                if (drawable5 != null) {
                    i11 = AndroidUtilities.dp(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i11 = 0;
                }
                canvas.translate(measuredWidth3 + i11, getTopOffset() + ((getMeasuredHeight() - this.f27352s.getHeight()) / 2));
                Drawable drawable6 = this.f27351r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f27352s.getHeight() - this.f27351r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.f27351r.getIntrinsicHeight() + this.f27352s.getHeight()) / 2));
                    this.f27351r.setAlpha(255);
                    this.f27351r.draw(canvas);
                }
                this.f27352s.draw(canvas);
            }
            canvas.restore();
        } else {
            f7 = 6.0f;
        }
        if (this.f27347b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int dp2 = AndroidUtilities.dp(f7) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float dp3 = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f27349f;
            rectF.set(dp2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), dp2 + this.h, dp3);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            canvas.drawText(this.f27347b, rectF.centerX() - (this.f27348c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
        }
    }

    public void setCounter(int i10) {
        if (this.f27346a != i10) {
            this.f27346a = i10;
            if (i10 == 0) {
                this.f27347b = null;
                this.h = 0;
            } else {
                String formatWholeNumber = AndroidUtilities.formatWholeNumber(i10, 0);
                this.f27347b = formatWholeNumber;
                this.f27348c = (int) Math.ceil(this.d.measureText(formatWholeNumber));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.f27348c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f27355y;
        textPaint.setTypeface(bold);
        this.f27354x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f27351r = null;
        this.f27352s = new StaticLayout(charSequence, textPaint, this.f27354x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.f27355y;
        textPaint.setTypeface(null);
        this.f27354x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.f27351r = null;
        this.f27352s = new StaticLayout(charSequence, textPaint, this.f27354x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
