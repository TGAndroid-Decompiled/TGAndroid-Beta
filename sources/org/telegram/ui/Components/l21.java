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
public final class l21 extends Drawable {
    public final TextPaint f25891a;
    public final Paint f25892b;
    public StaticLayout f25893c;
    public float d;
    public int e;
    public int f25894f;
    public Drawable f25895g;
    public int h;
    public final Context f25896i;
    public final org.telegram.ui.ActionBar.d6 f25897j;
    public boolean f25898k;
    public boolean f25899l;
    public boolean f25900m;
    public ColorFilter f25901n;

    public l21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f25891a = textPaint;
        this.f25892b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f25894f = -1;
        this.f25896i = context;
        this.f25897j = d6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static l21 a(int i10) {
        l21 l21Var = new l21(ApplicationLoader.applicationContext, null);
        l21Var.b(i10);
        l21Var.f25899l = true;
        return l21Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f25894f != i10) {
            this.f25894f = i10;
            boolean z10 = this.f25900m;
            Context context = this.f25896i;
            if (z10) {
                this.f25895g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f25895g = mutate;
                mutate.setColorFilter(this.f25901n);
            }
            invalidateSelf();
            int i12 = this.f25894f;
            if (i12 >= 1 && i12 < 60) {
                str = hg.c.h(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerSeconds, a4.a.v(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerMinutes, a4.a.v(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerHours, a4.a.v(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerDays, a4.a.v(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerWeeks, a4.a.v(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerMonths, a4.a.v(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.f0.g(R.string.SecretChatTimerYears, a4.a.v(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f25891a;
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
                this.f25893c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f25893c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f25900m;
        Paint paint = this.f25892b;
        int i10 = -1;
        TextPaint textPaint = this.f25891a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25897j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f25899l) {
            if (!this.f25898k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19354s8, d6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        }
        if (this.f25895g != null) {
            if (!this.f25899l && !this.f25900m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f25895g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f25900m) {
                this.f25895g.setBounds(getBounds().left, getBounds().top, this.f25895g.getIntrinsicWidth() + getBounds().left, this.f25895g.getIntrinsicHeight() + getBounds().top);
                this.f25895g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f25895g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f25895g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f25895g.setBounds(rect);
                this.f25895g.draw(canvas);
            }
        }
        if (this.f25894f != 0 && this.f25893c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f25900m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f25893c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f25893c.draw(canvas);
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
        this.f25901n = colorFilter;
        if (this.f25899l) {
            this.f25895g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
