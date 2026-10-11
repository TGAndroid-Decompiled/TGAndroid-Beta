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
public final class b31 extends Drawable {
    public final TextPaint f24893a;
    public final Paint f24894b;
    public StaticLayout f24895c;
    public float d;
    public int f24896e;
    public int f24897f;
    public Drawable f24898g;
    public int h;
    public final Context f24899i;
    public final org.telegram.ui.ActionBar.d6 f24900j;
    public boolean f24901k;
    public boolean f24902l;
    public boolean f24903m;
    public ColorFilter f24904n;

    public b31(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f24893a = textPaint;
        this.f24894b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f24896e = 0;
        this.f24897f = -1;
        this.f24899i = context;
        this.f24900j = d6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static b31 a(int i10) {
        b31 b31Var = new b31(ApplicationLoader.applicationContext, null);
        b31Var.b(i10);
        b31Var.f24902l = true;
        return b31Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f24897f != i10) {
            this.f24897f = i10;
            boolean z10 = this.f24903m;
            Context context = this.f24899i;
            if (z10) {
                this.f24898g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f24898g = mutate;
                mutate.setColorFilter(this.f24904n);
            }
            invalidateSelf();
            int i12 = this.f24897f;
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
            TextPaint textPaint = this.f24893a;
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
                this.f24895c = staticLayout;
                this.f24896e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f24895c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f24903m;
        Paint paint = this.f24894b;
        int i10 = -1;
        TextPaint textPaint = this.f24893a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24900j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f24902l) {
            if (!this.f24901k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21101s8, d6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        }
        if (this.f24898g != null) {
            if (!this.f24902l && !this.f24903m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f24898g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f24903m) {
                this.f24898g.setBounds(getBounds().left, getBounds().top, this.f24898g.getIntrinsicWidth() + getBounds().left, this.f24898g.getIntrinsicHeight() + getBounds().top);
                this.f24898g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f24898g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f24898g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f24898g.setBounds(rect);
                this.f24898g.draw(canvas);
            }
        }
        if (this.f24897f != 0 && this.f24895c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f24903m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f24896e) / 2.0f);
                this.f24895c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f24896e) / 2.0f);
                this.f24895c.draw(canvas);
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
        this.f24904n = colorFilter;
        if (this.f24902l) {
            this.f24898g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
