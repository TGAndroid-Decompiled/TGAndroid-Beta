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
public final class g31 extends Drawable {
    public final TextPaint f26244a;
    public final Paint f26245b;
    public StaticLayout f26246c;
    public float d;
    public int f26247e;
    public int f26248f;
    public Drawable f26249g;
    public int h;
    public final Context f26250i;
    public final org.telegram.ui.ActionBar.c6 f26251j;
    public boolean f26252k;
    public boolean f26253l;
    public boolean f26254m;
    public ColorFilter f26255n;

    public g31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f26244a = textPaint;
        this.f26245b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f26247e = 0;
        this.f26248f = -1;
        this.f26250i = context;
        this.f26251j = c6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static g31 a(int i10) {
        g31 g31Var = new g31(ApplicationLoader.applicationContext, null);
        g31Var.b(i10);
        g31Var.f26253l = true;
        return g31Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f26248f != i10) {
            this.f26248f = i10;
            boolean z10 = this.f26254m;
            Context context = this.f26250i;
            if (z10) {
                this.f26249g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f26249g = mutate;
                mutate.setColorFilter(this.f26255n);
            }
            invalidateSelf();
            int i12 = this.f26248f;
            if (i12 >= 1 && i12 < 60) {
                str = hg.c.i(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerSeconds, a1.g.v(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerMinutes, a1.g.v(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerHours, a1.g.v(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerDays, a1.g.v(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerWeeks, a1.g.v(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerMonths, a1.g.v(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.v0.h(R.string.SecretChatTimerYears, a1.g.v(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f26244a;
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
                this.f26246c = staticLayout;
                this.f26247e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f26246c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f26254m;
        Paint paint = this.f26245b;
        int i10 = -1;
        TextPaint textPaint = this.f26244a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26251j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f26253l) {
            if (!this.f26252k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20840s8, c6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, c6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, c6Var));
        }
        if (this.f26249g != null) {
            if (!this.f26253l && !this.f26254m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, c6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f26249g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f26254m) {
                this.f26249g.setBounds(getBounds().left, getBounds().top, this.f26249g.getIntrinsicWidth() + getBounds().left, this.f26249g.getIntrinsicHeight() + getBounds().top);
                this.f26249g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f26249g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f26249g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f26249g.setBounds(rect);
                this.f26249g.draw(canvas);
            }
        }
        if (this.f26248f != 0 && this.f26246c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f26254m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f26247e) / 2.0f);
                this.f26246c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f26247e) / 2.0f);
                this.f26246c.draw(canvas);
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
        this.f26255n = colorFilter;
        if (this.f26253l) {
            this.f26249g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
