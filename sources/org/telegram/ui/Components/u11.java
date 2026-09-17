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
public final class u11 extends Drawable {
    public final TextPaint f30797a;
    public final Paint f30798b;
    public StaticLayout f30799c;
    public float d;
    public int f30800e;
    public int f30801f;
    public Drawable f30802g;
    public int h;
    public final Context f30803i;
    public final org.telegram.ui.ActionBar.f6 f30804j;
    public boolean f30805k;
    public boolean f30806l;
    public boolean f30807m;
    public ColorFilter f30808n;

    public u11(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f30797a = textPaint;
        this.f30798b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f30800e = 0;
        this.f30801f = -1;
        this.f30803i = context;
        this.f30804j = f6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static u11 a(int i10) {
        u11 u11Var = new u11(ApplicationLoader.applicationContext, null);
        u11Var.b(i10);
        u11Var.f30806l = true;
        return u11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f30801f != i10) {
            this.f30801f = i10;
            boolean z10 = this.f30807m;
            Context context = this.f30803i;
            if (z10) {
                this.f30802g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f30802g = mutate;
                mutate.setColorFilter(this.f30808n);
            }
            invalidateSelf();
            int i12 = this.f30801f;
            if (i12 >= 1 && i12 < 60) {
                str = i2.g.i(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerSeconds, a4.a.u(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerMinutes, a4.a.u(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerHours, a4.a.u(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerDays, a4.a.u(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerWeeks, a4.a.u(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerMonths, a4.a.u(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.w1.h(R.string.SecretChatTimerYears, a4.a.u(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f30797a;
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
                this.f30799c = staticLayout;
                this.f30800e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f30799c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f30807m;
        Paint paint = this.f30798b;
        int i10 = -1;
        TextPaint textPaint = this.f30797a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30804j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f30806l) {
            if (!this.f30805k) {
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20965s8, f6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
        }
        if (this.f30802g != null) {
            if (!this.f30806l && !this.f30807m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f30802g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f30807m) {
                this.f30802g.setBounds(getBounds().left, getBounds().top, this.f30802g.getIntrinsicWidth() + getBounds().left, this.f30802g.getIntrinsicHeight() + getBounds().top);
                this.f30802g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f30802g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f30802g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f30802g.setBounds(rect);
                this.f30802g.draw(canvas);
            }
        }
        if (this.f30801f != 0 && this.f30799c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f30807m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f30800e) / 2.0f);
                this.f30799c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f30800e) / 2.0f);
                this.f30799c.draw(canvas);
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
        this.f30808n = colorFilter;
        if (this.f30806l) {
            this.f30802g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
