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
public final class y11 extends Drawable {
    public final TextPaint f33273a;
    public final Paint f33274b;
    public StaticLayout f33275c;
    public float d;
    public int f33276e;
    public int f33277f;
    public Drawable f33278g;
    public int h;
    public final Context f33279i;
    public final org.telegram.ui.ActionBar.g6 f33280j;
    public boolean f33281k;
    public boolean f33282l;
    public boolean f33283m;
    public ColorFilter f33284n;

    public y11(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f33273a = textPaint;
        this.f33274b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f33276e = 0;
        this.f33277f = -1;
        this.f33279i = context;
        this.f33280j = g6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static y11 a(int i10) {
        y11 y11Var = new y11(ApplicationLoader.applicationContext, null);
        y11Var.b(i10);
        y11Var.f33282l = true;
        return y11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f33277f != i10) {
            this.f33277f = i10;
            boolean z4 = this.f33283m;
            Context context = this.f33279i;
            if (z4) {
                this.f33278g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f33278g = mutate;
                mutate.setColorFilter(this.f33284n);
            }
            invalidateSelf();
            int i12 = this.f33277f;
            if (i12 >= 1 && i12 < 60) {
                str = l.d.j(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerSeconds, e2.c.l(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerMinutes, e2.c.l(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerHours, e2.c.l(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerDays, e2.c.l(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerWeeks, e2.c.l(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerMonths, e2.c.l(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.y3.h(R.string.SecretChatTimerYears, e2.c.l(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f33273a;
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
                this.f33275c = staticLayout;
                this.f33276e = staticLayout.getHeight();
            } catch (Exception e6) {
                this.f33275c = null;
                FileLog.e(e6);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z4 = this.f33283m;
        Paint paint = this.f33274b;
        int i10 = -1;
        TextPaint textPaint = this.f33273a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33280j;
        if (z4) {
            textPaint.setColor(-1);
        } else if (!this.f33282l) {
            if (!this.f33281k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, g6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, g6Var));
        }
        if (this.f33278g != null) {
            if (!this.f33282l && !this.f33283m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, g6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f33278g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f33283m) {
                this.f33278g.setBounds(getBounds().left, getBounds().top, this.f33278g.getIntrinsicWidth() + getBounds().left, this.f33278g.getIntrinsicHeight() + getBounds().top);
                this.f33278g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f33278g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f33278g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f33278g.setBounds(rect);
                this.f33278g.draw(canvas);
            }
        }
        if (this.f33277f != 0 && this.f33275c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f33283m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f33276e) / 2.0f);
                this.f33275c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f33276e) / 2.0f);
                this.f33275c.draw(canvas);
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
        this.f33284n = colorFilter;
        if (this.f33282l) {
            this.f33278g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
