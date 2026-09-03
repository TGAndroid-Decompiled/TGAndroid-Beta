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
public final class x11 extends Drawable {
    public final TextPaint f32920a;
    public final Paint f32921b;
    public StaticLayout f32922c;
    public float d;
    public int f32923e;
    public int f32924f;
    public Drawable f32925g;
    public int h;
    public final Context f32926i;
    public final org.telegram.ui.ActionBar.g6 f32927j;
    public boolean f32928k;
    public boolean f32929l;
    public boolean f32930m;
    public ColorFilter f32931n;

    public x11(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f32920a = textPaint;
        this.f32921b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f32923e = 0;
        this.f32924f = -1;
        this.f32926i = context;
        this.f32927j = g6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static x11 a(int i10) {
        x11 x11Var = new x11(ApplicationLoader.applicationContext, null);
        x11Var.b(i10);
        x11Var.f32929l = true;
        return x11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f32924f != i10) {
            this.f32924f = i10;
            boolean z4 = this.f32930m;
            Context context = this.f32926i;
            if (z4) {
                this.f32925g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f32925g = mutate;
                mutate.setColorFilter(this.f32931n);
            }
            invalidateSelf();
            int i12 = this.f32924f;
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
            TextPaint textPaint = this.f32920a;
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
                this.f32922c = staticLayout;
                this.f32923e = staticLayout.getHeight();
            } catch (Exception e6) {
                this.f32922c = null;
                FileLog.e(e6);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z4 = this.f32930m;
        Paint paint = this.f32921b;
        int i10 = -1;
        TextPaint textPaint = this.f32920a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f32927j;
        if (z4) {
            textPaint.setColor(-1);
        } else if (!this.f32929l) {
            if (!this.f32928k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21932s8, g6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, g6Var));
        }
        if (this.f32925g != null) {
            if (!this.f32929l && !this.f32930m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, g6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f32925g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f32930m) {
                this.f32925g.setBounds(getBounds().left, getBounds().top, this.f32925g.getIntrinsicWidth() + getBounds().left, this.f32925g.getIntrinsicHeight() + getBounds().top);
                this.f32925g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f32925g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f32925g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f32925g.setBounds(rect);
                this.f32925g.draw(canvas);
            }
        }
        if (this.f32924f != 0 && this.f32922c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f32930m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f32923e) / 2.0f);
                this.f32922c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f32923e) / 2.0f);
                this.f32922c.draw(canvas);
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
        this.f32931n = colorFilter;
        if (this.f32929l) {
            this.f32925g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
