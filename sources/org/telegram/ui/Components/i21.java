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
public final class i21 extends Drawable {
    public final TextPaint f24923a;
    public final Paint f24924b;
    public StaticLayout f24925c;
    public float d;
    public int e;
    public int f24926f;
    public Drawable f24927g;
    public int h;
    public final Context f24928i;
    public final org.telegram.ui.ActionBar.d6 f24929j;
    public boolean f24930k;
    public boolean f24931l;
    public boolean f24932m;
    public ColorFilter f24933n;

    public i21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f24923a = textPaint;
        this.f24924b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f24926f = -1;
        this.f24928i = context;
        this.f24929j = d6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static i21 a(int i10) {
        i21 i21Var = new i21(ApplicationLoader.applicationContext, null);
        i21Var.b(i10);
        i21Var.f24931l = true;
        return i21Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f24926f != i10) {
            this.f24926f = i10;
            boolean z10 = this.f24932m;
            Context context = this.f24928i;
            if (z10) {
                this.f24927g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f24927g = mutate;
                mutate.setColorFilter(this.f24933n);
            }
            invalidateSelf();
            int i12 = this.f24926f;
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
            TextPaint textPaint = this.f24923a;
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
                this.f24925c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f24925c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f24932m;
        Paint paint = this.f24924b;
        int i10 = -1;
        TextPaint textPaint = this.f24923a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24929j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f24931l) {
            if (!this.f24930k) {
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19338s8, d6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var));
        }
        if (this.f24927g != null) {
            if (!this.f24931l && !this.f24932m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f24927g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f24932m) {
                this.f24927g.setBounds(getBounds().left, getBounds().top, this.f24927g.getIntrinsicWidth() + getBounds().left, this.f24927g.getIntrinsicHeight() + getBounds().top);
                this.f24927g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f24927g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f24927g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f24927g.setBounds(rect);
                this.f24927g.draw(canvas);
            }
        }
        if (this.f24926f != 0 && this.f24925c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f24932m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f24925c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f24925c.draw(canvas);
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
        this.f24933n = colorFilter;
        if (this.f24931l) {
            this.f24927g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
