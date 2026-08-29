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
public final class m11 extends Drawable {
    public final TextPaint f30526a;
    public final Paint f30527b;
    public StaticLayout f30528c;
    public float d;
    public int f30529e;
    public int f30530f;
    public Drawable f30531g;
    public int h;
    public final Context f30532i;
    public final org.telegram.ui.ActionBar.c6 f30533j;
    public boolean f30534k;
    public boolean f30535l;
    public boolean f30536m;
    public ColorFilter f30537n;

    public m11(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f30526a = textPaint;
        this.f30527b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f30529e = 0;
        this.f30530f = -1;
        this.f30532i = context;
        this.f30533j = c6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static m11 a(int i10) {
        m11 m11Var = new m11(ApplicationLoader.applicationContext, null);
        m11Var.b(i10);
        m11Var.f30535l = true;
        return m11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f30530f != i10) {
            this.f30530f = i10;
            boolean z10 = this.f30536m;
            Context context = this.f30532i;
            if (z10) {
                this.f30531g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f30531g = mutate;
                mutate.setColorFilter(this.f30537n);
            }
            invalidateSelf();
            int i12 = this.f30530f;
            if (i12 >= 1 && i12 < 60) {
                str = j7.l1.k(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerSeconds, com.google.android.recaptcha.internal.a.n(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerMinutes, com.google.android.recaptcha.internal.a.n(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerHours, com.google.android.recaptcha.internal.a.n(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerDays, com.google.android.recaptcha.internal.a.n(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerWeeks, com.google.android.recaptcha.internal.a.n(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerMonths, com.google.android.recaptcha.internal.a.n(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.x3.i(R.string.SecretChatTimerYears, com.google.android.recaptcha.internal.a.n(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f30526a;
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
                this.f30528c = staticLayout;
                this.f30529e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f30528c = null;
                FileLog.e(e10);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f30536m;
        Paint paint = this.f30527b;
        int i10 = -1;
        TextPaint textPaint = this.f30526a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30533j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f30535l) {
            if (!this.f30534k) {
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, c6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
        }
        if (this.f30531g != null) {
            if (!this.f30535l && !this.f30536m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f30531g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f30536m) {
                this.f30531g.setBounds(getBounds().left, getBounds().top, this.f30531g.getIntrinsicWidth() + getBounds().left, this.f30531g.getIntrinsicHeight() + getBounds().top);
                this.f30531g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f30531g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f30531g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f30531g.setBounds(rect);
                this.f30531g.draw(canvas);
            }
        }
        if (this.f30530f != 0 && this.f30528c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f30536m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f30529e) / 2.0f);
                this.f30528c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f30529e) / 2.0f);
                this.f30528c.draw(canvas);
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
        this.f30537n = colorFilter;
        if (this.f30535l) {
            this.f30531g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
