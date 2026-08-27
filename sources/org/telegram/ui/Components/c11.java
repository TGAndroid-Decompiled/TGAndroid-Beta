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

public final class c11 extends Drawable {

    public final TextPaint f27277a;

    public final Paint f27278b;

    public StaticLayout f27279c;
    public float d;

    public int f27280e;

    public int f27281f;

    public Drawable f27282g;
    public int h;

    public final Context f27283i;

    public final org.telegram.ui.ActionBar.c6 f27284j;

    public boolean f27285k;

    public boolean f27286l;

    public boolean f27287m;

    public ColorFilter f27288n;

    public c11(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f27277a = textPaint;
        this.f27278b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f27280e = 0;
        this.f27281f = -1;
        this.f27283i = context;
        this.f27284j = c6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static c11 a(int i10) {
        c11 c11Var = new c11(ApplicationLoader.applicationContext, null);
        c11Var.b(i10);
        c11Var.f27286l = true;
        return c11Var;
    }

    public final void b(int i10) {
        String strI;
        if (this.f27281f != i10) {
            this.f27281f = i10;
            boolean z10 = this.f27287m;
            Context context = this.f27283i;
            if (z10) {
                this.f27282g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                Drawable drawableMutate = context.getDrawable(i10 == 0 ? R.drawable.msg_mini_autodelete : R.drawable.msg_mini_autodelete_empty).mutate();
                this.f27282g = drawableMutate;
                drawableMutate.setColorFilter(this.f27288n);
            }
            invalidateSelf();
            int i11 = this.f27281f;
            if (i11 >= 1 && i11 < 60) {
                strI = i0.a.k(i10, "");
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerSeconds, com.google.android.recaptcha.internal.a.o(strI));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                strI = "" + (i10 / 60);
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerMinutes, com.google.android.recaptcha.internal.a.o(strI));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                strI = "" + ((i10 / 60) / 60);
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerHours, com.google.android.recaptcha.internal.a.o(strI));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                strI = "" + (((i10 / 60) / 60) / 24);
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerDays, com.google.android.recaptcha.internal.a.o(strI));
                }
            } else if (i11 < 2678400) {
                strI = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerWeeks, com.google.android.recaptcha.internal.a.o(strI));
                } else if (strI.length() > 2) {
                    strI = "c";
                }
            } else if (i11 < 31449600) {
                strI = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerMonths, com.google.android.recaptcha.internal.a.o(strI));
                }
            } else {
                strI = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (strI.length() < 2) {
                    strI = org.telegram.messenger.y1.i(R.string.SecretChatTimerYears, com.google.android.recaptcha.internal.a.o(strI));
                }
            }
            String str = strI;
            float fDp = AndroidUtilities.dp(11.0f);
            TextPaint textPaint = this.f27277a;
            textPaint.setTextSize(fDp);
            float fMeasureText = textPaint.measureText(str);
            this.d = fMeasureText;
            if (fMeasureText > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(9.0f));
                this.d = textPaint.measureText(str);
            }
            if (this.d > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(6.0f));
                this.d = textPaint.measureText(str);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f27279c = staticLayout;
                this.f27280e = staticLayout.getHeight();
            } catch (Exception e9) {
                this.f27279c = null;
                FileLog.e(e9);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(23.0f);
        int iDp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f27287m;
        Paint paint = this.f27278b;
        TextPaint textPaint = this.f27277a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27284j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (this.f27286l) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
        } else {
            if (!this.f27285k) {
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, c6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        }
        if (this.f27282g != null) {
            if (!this.f27286l && !this.f27287m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var);
                if (this.h != iV0) {
                    this.h = iV0;
                    this.f27282g.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f27287m) {
                this.f27282g.setBounds(getBounds().left, getBounds().top, this.f27282g.getIntrinsicWidth() + getBounds().left, this.f27282g.getIntrinsicHeight() + getBounds().top);
                this.f27282g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f27282g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f27282g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f27282g.setBounds(rect);
                this.f27282g.draw(canvas);
            }
        }
        if (this.f27281f == 0 || this.f27279c == null) {
            return;
        }
        int i10 = AndroidUtilities.density != 3.0f ? 0 : -1;
        canvas.save();
        if (this.f27287m) {
            canvas.translate((float) ((((double) (getBounds().width() / 2)) - Math.ceil(this.d / 2.0f)) + ((double) i10)), (getBounds().height() - this.f27280e) / 2.0f);
            this.f27279c.draw(canvas);
        } else {
            canvas.translate(((int) (((double) (iDp / 2)) - Math.ceil(this.d / 2.0f))) + i10, (iDp2 - this.f27280e) / 2.0f);
            this.f27279c.draw(canvas);
        }
        canvas.restore();
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
        this.f27288n = colorFilter;
        if (this.f27286l) {
            this.f27282g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
