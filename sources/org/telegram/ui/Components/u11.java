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
    public final TextPaint f28373a;
    public final Paint f28374b;
    public StaticLayout f28375c;
    public float d;
    public int e;
    public int f28376f;
    public Drawable f28377g;
    public int h;
    public final Context f28378i;
    public final org.telegram.ui.ActionBar.d6 f28379j;
    public boolean f28380k;
    public boolean f28381l;
    public boolean f28382m;
    public ColorFilter f28383n;

    public u11(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f28373a = textPaint;
        this.f28374b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f28376f = -1;
        this.f28378i = context;
        this.f28379j = d6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static u11 a(int i10) {
        u11 u11Var = new u11(ApplicationLoader.applicationContext, null);
        u11Var.b(i10);
        u11Var.f28381l = true;
        return u11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f28376f != i10) {
            this.f28376f = i10;
            boolean z10 = this.f28382m;
            Context context = this.f28378i;
            if (z10) {
                this.f28377g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f28377g = mutate;
                mutate.setColorFilter(this.f28383n);
            }
            invalidateSelf();
            int i12 = this.f28376f;
            if (i12 >= 1 && i12 < 60) {
                str = hg.c.i(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerSeconds, a4.a.v(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerMinutes, a4.a.v(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerHours, a4.a.v(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerDays, a4.a.v(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerWeeks, a4.a.v(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerMonths, a4.a.v(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.z0.h(R.string.SecretChatTimerYears, a4.a.v(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f28373a;
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
                this.f28375c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f28375c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f28382m;
        Paint paint = this.f28374b;
        int i10 = -1;
        TextPaint textPaint = this.f28373a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28379j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f28381l) {
            if (!this.f28380k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, d6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        }
        if (this.f28377g != null) {
            if (!this.f28381l && !this.f28382m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f28377g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f28382m) {
                this.f28377g.setBounds(getBounds().left, getBounds().top, this.f28377g.getIntrinsicWidth() + getBounds().left, this.f28377g.getIntrinsicHeight() + getBounds().top);
                this.f28377g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f28377g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f28377g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f28377g.setBounds(rect);
                this.f28377g.draw(canvas);
            }
        }
        if (this.f28376f != 0 && this.f28375c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f28382m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f28375c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f28375c.draw(canvas);
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
        this.f28383n = colorFilter;
        if (this.f28381l) {
            this.f28377g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
