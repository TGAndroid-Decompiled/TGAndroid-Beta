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
public final class s21 extends Drawable {
    public final TextPaint f30164a;
    public final Paint f30165b;
    public StaticLayout f30166c;
    public float d;
    public int e;
    public int f30167f;
    public Drawable f30168g;
    public int h;
    public final Context f30169i;
    public final org.telegram.ui.ActionBar.d6 f30170j;
    public boolean f30171k;
    public boolean f30172l;
    public boolean f30173m;
    public ColorFilter f30174n;

    public s21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f30164a = textPaint;
        this.f30165b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f30167f = -1;
        this.f30169i = context;
        this.f30170j = d6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static s21 a(int i10) {
        s21 s21Var = new s21(ApplicationLoader.applicationContext, null);
        s21Var.b(i10);
        s21Var.f30172l = true;
        return s21Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f30167f != i10) {
            this.f30167f = i10;
            boolean z10 = this.f30173m;
            Context context = this.f30169i;
            if (z10) {
                this.f30168g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f30168g = mutate;
                mutate.setColorFilter(this.f30174n);
            }
            invalidateSelf();
            int i12 = this.f30167f;
            if (i12 >= 1 && i12 < 60) {
                str = i2.e.j(i10, "");
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
            TextPaint textPaint = this.f30164a;
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
                this.f30166c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f30166c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f30173m;
        Paint paint = this.f30165b;
        int i10 = -1;
        TextPaint textPaint = this.f30164a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30170j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f30172l) {
            if (!this.f30171k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21273s8, d6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        }
        if (this.f30168g != null) {
            if (!this.f30172l && !this.f30173m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f30168g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f30173m) {
                this.f30168g.setBounds(getBounds().left, getBounds().top, this.f30168g.getIntrinsicWidth() + getBounds().left, this.f30168g.getIntrinsicHeight() + getBounds().top);
                this.f30168g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f30168g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f30168g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f30168g.setBounds(rect);
                this.f30168g.draw(canvas);
            }
        }
        if (this.f30167f != 0 && this.f30166c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f30173m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f30166c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f30166c.draw(canvas);
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
        this.f30174n = colorFilter;
        if (this.f30172l) {
            this.f30168g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
