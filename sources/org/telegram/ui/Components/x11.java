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
    public final TextPaint f30508a;
    public final Paint f30509b;
    public StaticLayout f30510c;
    public float d;
    public int e;
    public int f30511f;
    public Drawable f30512g;
    public int h;
    public final Context f30513i;
    public final org.telegram.ui.ActionBar.f6 f30514j;
    public boolean f30515k;
    public boolean f30516l;
    public boolean f30517m;
    public ColorFilter f30518n;

    public x11(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f30508a = textPaint;
        this.f30509b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f30511f = -1;
        this.f30513i = context;
        this.f30514j = f6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static x11 a(int i10) {
        x11 x11Var = new x11(ApplicationLoader.applicationContext, null);
        x11Var.b(i10);
        x11Var.f30516l = true;
        return x11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f30511f != i10) {
            this.f30511f = i10;
            boolean z4 = this.f30517m;
            Context context = this.f30513i;
            if (z4) {
                this.f30512g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f30512g = mutate;
                mutate.setColorFilter(this.f30518n);
            }
            invalidateSelf();
            int i12 = this.f30511f;
            if (i12 >= 1 && i12 < 60) {
                str = kh.a2.j(i10, "");
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
            TextPaint textPaint = this.f30508a;
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
                this.f30510c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f30510c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z4 = this.f30517m;
        Paint paint = this.f30509b;
        int i10 = -1;
        TextPaint textPaint = this.f30508a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30514j;
        if (z4) {
            textPaint.setColor(-1);
        } else if (!this.f30516l) {
            if (!this.f30515k) {
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, f6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
        }
        if (this.f30512g != null) {
            if (!this.f30516l && !this.f30517m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f30512g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f30517m) {
                this.f30512g.setBounds(getBounds().left, getBounds().top, this.f30512g.getIntrinsicWidth() + getBounds().left, this.f30512g.getIntrinsicHeight() + getBounds().top);
                this.f30512g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f30512g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f30512g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f30512g.setBounds(rect);
                this.f30512g.draw(canvas);
            }
        }
        if (this.f30511f != 0 && this.f30510c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f30517m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f30510c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f30510c.draw(canvas);
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
        this.f30518n = colorFilter;
        if (this.f30516l) {
            this.f30512g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
