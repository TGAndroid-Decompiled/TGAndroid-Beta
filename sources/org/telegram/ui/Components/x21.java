package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class x21 extends Drawable {
    public final TextPaint f30840a;
    public final Paint f30841b;
    public StaticLayout f30842c;
    public float d;
    public int e;
    public int f30843f;
    public Drawable f30844g;
    public int h;
    public final Context f30845i;
    public final org.telegram.ui.ActionBar.c6 f30846j;
    public boolean f30847k;
    public boolean f30848l;
    public boolean f30849m;
    public ColorFilter f30850n;

    public x21(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f30840a = textPaint;
        this.f30841b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f30843f = -1;
        this.f30845i = context;
        this.f30846j = c6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static x21 a(int i10) {
        x21 x21Var = new x21(ApplicationLoader.applicationContext, null);
        x21Var.b(i10);
        x21Var.f30848l = true;
        return x21Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f30843f != i10) {
            this.f30843f = i10;
            boolean z10 = this.f30849m;
            Context context = this.f30845i;
            if (z10) {
                this.f30844g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f30844g = mutate;
                mutate.setColorFilter(this.f30850n);
            }
            invalidateSelf();
            int i12 = this.f30843f;
            if (i12 >= 1 && i12 < 60) {
                str = i2.d.j(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerSeconds, a1.g.u(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerMinutes, a1.g.u(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerHours, a1.g.u(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerDays, a1.g.u(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerWeeks, a1.g.u(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerMonths, a1.g.u(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.g0.g(R.string.SecretChatTimerYears, a1.g.u(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f30840a;
            textPaint.setTextSize(AndroidUtilities.dp(11.0f));
            float measureText = textPaint.measureText(str2);
            this.d = measureText;
            if (measureText > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(9.0f));
                this.d = textPaint.measureText(str2);
            }
            if (this.d > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(6.0f));
                this.d = textPaint.measureText(str2);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str2, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30842c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f30842c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f30849m;
        Paint paint = this.f30841b;
        int i10 = -1;
        TextPaint textPaint = this.f30840a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30846j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f30848l) {
            if (!this.f30847k) {
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19880s8, c6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, c6Var));
        }
        if (this.f30844g != null) {
            if (!this.f30848l && !this.f30849m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A8, c6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f30844g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f30849m) {
                this.f30844g.setBounds(getBounds().left, getBounds().top, this.f30844g.getIntrinsicWidth() + getBounds().left, this.f30844g.getIntrinsicHeight() + getBounds().top);
                this.f30844g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f30844g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f30844g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f30844g.setBounds(rect);
                this.f30844g.draw(canvas);
            }
        }
        if (this.f30843f != 0 && this.f30842c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f30849m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f30842c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f30842c.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30850n = colorFilter;
        if (this.f30848l) {
            this.f30844g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
