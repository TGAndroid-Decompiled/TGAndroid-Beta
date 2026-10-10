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
    public final TextPaint f24851a;
    public final Paint f24852b;
    public StaticLayout f24853c;
    public float d;
    public int f24854e;
    public int f24855f;
    public Drawable f24856g;
    public int h;
    public final Context f24857i;
    public final org.telegram.ui.ActionBar.e6 f24858j;
    public boolean f24859k;
    public boolean f24860l;
    public boolean f24861m;
    public ColorFilter f24862n;

    public b31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f24851a = textPaint;
        this.f24852b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f24854e = 0;
        this.f24855f = -1;
        this.f24857i = context;
        this.f24858j = e6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static b31 a(int i10) {
        b31 b31Var = new b31(ApplicationLoader.applicationContext, null);
        b31Var.b(i10);
        b31Var.f24860l = true;
        return b31Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f24855f != i10) {
            this.f24855f = i10;
            boolean z10 = this.f24861m;
            Context context = this.f24857i;
            if (z10) {
                this.f24856g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f24856g = mutate;
                mutate.setColorFilter(this.f24862n);
            }
            invalidateSelf();
            int i12 = this.f24855f;
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
            TextPaint textPaint = this.f24851a;
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
                this.f24853c = staticLayout;
                this.f24854e = staticLayout.getHeight();
            } catch (Exception e7) {
                this.f24853c = null;
                FileLog.e(e7);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f24861m;
        Paint paint = this.f24852b;
        int i10 = -1;
        TextPaint textPaint = this.f24851a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24858j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f24860l) {
            if (!this.f24859k) {
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21079s8, e6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var));
        }
        if (this.f24856g != null) {
            if (!this.f24860l && !this.f24861m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f24856g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f24861m) {
                this.f24856g.setBounds(getBounds().left, getBounds().top, this.f24856g.getIntrinsicWidth() + getBounds().left, this.f24856g.getIntrinsicHeight() + getBounds().top);
                this.f24856g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f24856g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f24856g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f24856g.setBounds(rect);
                this.f24856g.draw(canvas);
            }
        }
        if (this.f24855f != 0 && this.f24853c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f24861m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.f24854e) / 2.0f);
                this.f24853c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.f24854e) / 2.0f);
                this.f24853c.draw(canvas);
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
        this.f24862n = colorFilter;
        if (this.f24860l) {
            this.f24856g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
