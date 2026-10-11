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
public final class c31 extends Drawable {
    public final TextPaint f25102a;
    public final Paint f25103b;
    public StaticLayout f25104c;
    public float d;
    public int f25105e;
    public int f25106f;
    public Drawable f25107g;
    public int h;
    public final Context f25108i;
    public final org.telegram.ui.ActionBar.d6 f25109j;
    public boolean f25110k;
    public boolean f25111l;
    public boolean f25112m;
    public ColorFilter f25113n;

    public c31(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f25102a = textPaint;
        this.f25103b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f25105e = 0;
        this.f25106f = -1;
        this.f25108i = context;
        this.f25109j = d6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static c31 a(int i10) {
        c31 c31Var = new c31(ApplicationLoader.applicationContext, null);
        c31Var.b(i10);
        c31Var.f25111l = true;
        return c31Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f25106f != i10) {
            this.f25106f = i10;
            boolean z10 = this.f25112m;
            Context context = this.f25108i;
            if (z10) {
                this.f25107g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f25107g = mutate;
                mutate.setColorFilter(this.f25113n);
            }
            invalidateSelf();
            int i12 = this.f25106f;
            if (i12 >= 1 && i12 < 60) {
                str = hg.c.h(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerSeconds, a1.g.v(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerMinutes, a1.g.v(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerHours, a1.g.v(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerDays, a1.g.v(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerWeeks, a1.g.v(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerMonths, a1.g.v(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.q.g(R.string.SecretChatTimerYears, a1.g.v(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f25102a;
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
                this.f25104c = staticLayout;
                this.f25105e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f25104c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f25112m;
        Paint paint = this.f25103b;
        int i10 = -1;
        TextPaint textPaint = this.f25102a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25109j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f25111l) {
            if (!this.f25110k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065s8, d6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        }
        if (this.f25107g != null) {
            if (!this.f25111l && !this.f25112m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f25107g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f25112m) {
                this.f25107g.setBounds(getBounds().left, getBounds().top, this.f25107g.getIntrinsicWidth() + getBounds().left, this.f25107g.getIntrinsicHeight() + getBounds().top);
                this.f25107g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f25107g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f25107g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f25107g.setBounds(rect);
                this.f25107g.draw(canvas);
            }
        }
        if (this.f25106f != 0 && this.f25104c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f25112m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f25105e) / 2.0f);
                this.f25104c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f25105e) / 2.0f);
                this.f25104c.draw(canvas);
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
        this.f25113n = colorFilter;
        if (this.f25111l) {
            this.f25107g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
