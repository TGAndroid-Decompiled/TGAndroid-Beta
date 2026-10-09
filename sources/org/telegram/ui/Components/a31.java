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
public final class a31 extends Drawable {
    public final TextPaint f24580a;
    public final Paint f24581b;
    public StaticLayout f24582c;
    public float d;
    public int f24583e;
    public int f24584f;
    public Drawable f24585g;
    public int h;
    public final Context f24586i;
    public final org.telegram.ui.ActionBar.e6 f24587j;
    public boolean f24588k;
    public boolean f24589l;
    public boolean f24590m;
    public ColorFilter f24591n;

    public a31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f24580a = textPaint;
        this.f24581b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f24583e = 0;
        this.f24584f = -1;
        this.f24586i = context;
        this.f24587j = e6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static a31 a(int i10) {
        a31 a31Var = new a31(ApplicationLoader.applicationContext, null);
        a31Var.b(i10);
        a31Var.f24589l = true;
        return a31Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f24584f != i10) {
            this.f24584f = i10;
            boolean z10 = this.f24590m;
            Context context = this.f24586i;
            if (z10) {
                this.f24585g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f24585g = mutate;
                mutate.setColorFilter(this.f24591n);
            }
            invalidateSelf();
            int i12 = this.f24584f;
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
            TextPaint textPaint = this.f24580a;
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
                this.f24582c = staticLayout;
                this.f24583e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f24582c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f24590m;
        Paint paint = this.f24581b;
        int i10 = -1;
        TextPaint textPaint = this.f24580a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24587j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f24589l) {
            if (!this.f24588k) {
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21075s8, e6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var));
        }
        if (this.f24585g != null) {
            if (!this.f24589l && !this.f24590m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f24585g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f24590m) {
                this.f24585g.setBounds(getBounds().left, getBounds().top, this.f24585g.getIntrinsicWidth() + getBounds().left, this.f24585g.getIntrinsicHeight() + getBounds().top);
                this.f24585g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f24585g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f24585g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f24585g.setBounds(rect);
                this.f24585g.draw(canvas);
            }
        }
        if (this.f24584f != 0 && this.f24582c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f24590m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f24583e) / 2.0f);
                this.f24582c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f24583e) / 2.0f);
                this.f24582c.draw(canvas);
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
        this.f24591n = colorFilter;
        if (this.f24589l) {
            this.f24585g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
