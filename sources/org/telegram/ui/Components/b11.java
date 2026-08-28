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
public final class b11 extends Drawable {
    public final TextPaint f26969a;
    public final Paint f26970b;
    public StaticLayout f26971c;
    public float d;
    public int f26972e;
    public int f26973f;
    public Drawable f26974g;
    public int h;
    public final Context f26975i;
    public final org.telegram.ui.ActionBar.b6 f26976j;
    public boolean f26977k;
    public boolean f26978l;
    public boolean f26979m;
    public ColorFilter f26980n;

    public b11(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f26969a = textPaint;
        this.f26970b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f26972e = 0;
        this.f26973f = -1;
        this.f26975i = context;
        this.f26976j = b6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static b11 a(int i9) {
        b11 b11Var = new b11(ApplicationLoader.applicationContext, null);
        b11Var.b(i9);
        b11Var.f26978l = true;
        return b11Var;
    }

    public final void b(int i9) {
        int i10;
        String str;
        if (this.f26973f != i9) {
            this.f26973f = i9;
            boolean z10 = this.f26979m;
            Context context = this.f26975i;
            if (z10) {
                this.f26974g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i9 == 0) {
                    i10 = R.drawable.msg_mini_autodelete;
                } else {
                    i10 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f26974g = mutate;
                mutate.setColorFilter(this.f26980n);
            }
            invalidateSelf();
            int i11 = this.f26973f;
            if (i11 >= 1 && i11 < 60) {
                str = j3.r0.l(i9, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerSeconds, e2.c.n(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i9 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerMinutes, e2.c.n(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i9 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerHours, e2.c.n(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i9 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerDays, e2.c.n(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i9 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerWeeks, e2.c.n(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i9 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerMonths, e2.c.n(str));
                }
            } else {
                str = "" + ((((i9 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.h(R.string.SecretChatTimerYears, e2.c.n(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f26969a;
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
                this.f26971c = staticLayout;
                this.f26972e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f26971c = null;
                FileLog.e(e10);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f26979m;
        Paint paint = this.f26970b;
        int i9 = -1;
        TextPaint textPaint = this.f26969a;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26976j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f26978l) {
            if (!this.f26977k) {
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, b6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
        }
        if (this.f26974g != null) {
            if (!this.f26978l && !this.f26979m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f26974g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f26979m) {
                this.f26974g.setBounds(getBounds().left, getBounds().top, this.f26974g.getIntrinsicWidth() + getBounds().left, this.f26974g.getIntrinsicHeight() + getBounds().top);
                this.f26974g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f26974g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f26974g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f26974g.setBounds(rect);
                this.f26974g.draw(canvas);
            }
        }
        if (this.f26973f != 0 && this.f26971c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i9 = 0;
            }
            canvas.save();
            if (this.f26979m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i9), (getBounds().height() - this.f26972e) / 2.0f);
                this.f26971c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i9, (dp2 - this.f26972e) / 2.0f);
                this.f26971c.draw(canvas);
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
        this.f26980n = colorFilter;
        if (this.f26978l) {
            this.f26974g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i9) {
    }
}
