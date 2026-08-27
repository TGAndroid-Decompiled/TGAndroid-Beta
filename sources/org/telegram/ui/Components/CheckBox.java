package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;

public class CheckBox extends View {
    public static Paint D;
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public int A;
    public int B;
    public String C;

    public final Drawable f26284a;

    public final TextPaint f26285b;

    public Bitmap f26286c;
    public Bitmap d;

    public Canvas f26287e;

    public Canvas f26288f;
    public boolean h;

    public boolean f26289n;

    public float f26290r;

    public ObjectAnimator f26291s;
    public boolean v;

    public boolean f26292w;

    public boolean f26293x;

    public int f26294y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.f26294y = 22;
        if (D == null) {
            D = new Paint(1);
            Paint paint = new Paint(1);
            E = paint;
            paint.setColor(0);
            Paint paint2 = E;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            F = paint3;
            paint3.setColor(0);
            Paint paint4 = F;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            F.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            G = paint5;
            paint5.setColor(-1);
            G.setStyle(style);
        }
        F.setStrokeWidth(AndroidUtilities.dp(28.0f));
        G.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f26285b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f26284a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.f26293x) {
            return;
        }
        this.f26293x = z10;
        if (!this.f26292w || !z11) {
            ObjectAnimator objectAnimator = this.f26291s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f26291s = null;
            }
            setProgress(z10 ? 1.0f : 0.0f);
            return;
        }
        this.v = z10;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
        this.f26291s = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new org.telegram.ui.am(this, 20));
        this.f26291s.setDuration(300L);
        this.f26291s.start();
    }

    public final void c(int i10, int i11) {
        this.B = i10;
        this.f26284a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f26285b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.f26290r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26292w = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26292w = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        String str;
        float f10;
        if (getVisibility() != 0 || this.f26286c == null || this.d == null) {
            return;
        }
        if (this.h || this.f26290r != 0.0f) {
            F.setStrokeWidth(AndroidUtilities.dp(this.f26294y + 6));
            this.f26286c.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f11 = this.f26290r;
            float f12 = f11 >= 0.5f ? 1.0f : f11 / 0.5f;
            float f13 = f11 < 0.5f ? 0.0f : (f11 - 0.5f) / 0.5f;
            if (!this.v) {
                f11 = 1.0f - f11;
            }
            if (f11 >= 0.2f) {
                if (f11 < 0.4f) {
                    fDp = AndroidUtilities.dp(2.0f) - (((f11 - 0.2f) * AndroidUtilities.dp(2.0f)) / 0.2f);
                }
                if (this.h) {
                    D.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), D);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), G);
                }
                D.setColor(this.B);
                if (this.f26289n) {
                    measuredWidth -= AndroidUtilities.dp(2.0f);
                }
                this.f26287e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, D);
                this.f26287e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f12) * measuredWidth, E);
                canvas.drawBitmap(this.f26286c, 0.0f, 0.0f, (Paint) null);
                this.d.eraseColor(0);
                str = this.C;
                if (str != null) {
                    TextPaint textPaint = this.f26285b;
                    int iCeil = (int) Math.ceil(textPaint.measureText(str));
                    Canvas canvas2 = this.f26288f;
                    String str2 = this.C;
                    float measuredWidth2 = (getMeasuredWidth() - iCeil) / 2;
                    if (this.f26294y == 40) {
                        f10 = 28.0f;
                    } else {
                        f10 = 21.0f;
                    }
                    canvas2.drawText(str2, measuredWidth2, AndroidUtilities.dp(f10), textPaint);
                } else {
                    Drawable drawable = this.f26284a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth3 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i10 = this.A;
                    drawable.setBounds(measuredWidth3, measuredHeight + i10, intrinsicWidth + measuredWidth3, measuredHeight + intrinsicHeight + i10);
                    drawable.draw(this.f26288f);
                }
                this.f26288f.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f13) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), F);
                canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
            }
            fDp = (AndroidUtilities.dp(2.0f) * f11) / 0.2f;
            measuredWidth -= fDp;
            if (this.h) {
                D.setColor(1140850688);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), D);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), G);
            }
            D.setColor(this.B);
            if (this.f26289n) {
                measuredWidth -= AndroidUtilities.dp(2.0f);
            }
            this.f26287e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, D);
            this.f26287e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f12) * measuredWidth, E);
            canvas.drawBitmap(this.f26286c, 0.0f, 0.0f, (Paint) null);
            this.d.eraseColor(0);
            str = this.C;
            if (str != null) {
                TextPaint textPaint2 = this.f26285b;
                int iCeil2 = (int) Math.ceil(textPaint2.measureText(str));
                Canvas canvas3 = this.f26288f;
                String str3 = this.C;
                float measuredWidth4 = (getMeasuredWidth() - iCeil2) / 2;
                if (this.f26294y == 40) {
                    f10 = 28.0f;
                } else {
                    f10 = 21.0f;
                }
                canvas3.drawText(str3, measuredWidth4, AndroidUtilities.dp(f10), textPaint2);
            } else {
                Drawable drawable2 = this.f26284a;
                int intrinsicWidth2 = drawable2.getIntrinsicWidth();
                int intrinsicHeight2 = drawable2.getIntrinsicHeight();
                int measuredWidth5 = (getMeasuredWidth() - intrinsicWidth2) / 2;
                int measuredHeight2 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                int i11 = this.A;
                drawable2.setBounds(measuredWidth5, measuredHeight2 + i11, intrinsicWidth2 + measuredWidth5, measuredHeight2 + intrinsicHeight2 + i11);
                drawable2.draw(this.f26288f);
            }
            this.f26288f.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f13) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), F);
            canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f26293x);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setCheckColor(int i10) {
        this.f26284a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f26285b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.A = i10;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.f26289n = z10;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.C = "" + (i10 + 1);
        } else if (this.f26291s == null) {
            this.C = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f26290r == f10) {
            return;
        }
        this.f26290r = f10;
        invalidate();
    }

    public void setSize(int i10) {
        this.f26294y = i10;
        if (i10 == 40) {
            this.f26285b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        G.setStrokeWidth(i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.f26286c == null) {
            try {
                int iDp = AndroidUtilities.dp(this.f26294y);
                int iDp2 = AndroidUtilities.dp(this.f26294y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.f26286c = Bitmap.createBitmap(iDp, iDp2, config);
                this.f26287e = new Canvas(this.f26286c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.f26294y), AndroidUtilities.dp(this.f26294y), config);
                this.f26288f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
