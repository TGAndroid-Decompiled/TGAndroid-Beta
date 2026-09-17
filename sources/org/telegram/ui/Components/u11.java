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
    public final TextPaint f30770a;
    public final Paint f30771b;
    public StaticLayout f30772c;
    public float d;
    public int f30773e;
    public int f30774f;
    public Drawable f30775g;
    public int h;
    public final Context f30776i;
    public final org.telegram.ui.ActionBar.f6 f30777j;
    public boolean f30778k;
    public boolean f30779l;
    public boolean f30780m;
    public ColorFilter f30781n;

    public u11(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f30770a = textPaint;
        this.f30771b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f30773e = 0;
        this.f30774f = -1;
        this.f30776i = context;
        this.f30777j = f6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static u11 a(int i10) {
        u11 u11Var = new u11(ApplicationLoader.applicationContext, null);
        u11Var.b(i10);
        u11Var.f30779l = true;
        return u11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f30774f != i10) {
            this.f30774f = i10;
            boolean z10 = this.f30780m;
            Context context = this.f30776i;
            if (z10) {
                this.f30775g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f30775g = mutate;
                mutate.setColorFilter(this.f30781n);
            }
            invalidateSelf();
            int i12 = this.f30774f;
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
            TextPaint textPaint = this.f30770a;
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
                this.f30772c = staticLayout;
                this.f30773e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f30772c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f30780m;
        Paint paint = this.f30771b;
        int i10 = -1;
        TextPaint textPaint = this.f30770a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30777j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f30779l) {
            if (!this.f30778k) {
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20938s8, f6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
        }
        if (this.f30775g != null) {
            if (!this.f30779l && !this.f30780m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f30775g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f30780m) {
                this.f30775g.setBounds(getBounds().left, getBounds().top, this.f30775g.getIntrinsicWidth() + getBounds().left, this.f30775g.getIntrinsicHeight() + getBounds().top);
                this.f30775g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f30775g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f30775g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f30775g.setBounds(rect);
                this.f30775g.draw(canvas);
            }
        }
        if (this.f30774f != 0 && this.f30772c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f30780m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f30773e) / 2.0f);
                this.f30772c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f30773e) / 2.0f);
                this.f30772c.draw(canvas);
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
        this.f30781n = colorFilter;
        if (this.f30779l) {
            this.f30775g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
