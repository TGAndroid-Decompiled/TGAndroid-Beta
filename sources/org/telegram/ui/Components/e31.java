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
public final class e31 extends Drawable {
    public final TextPaint f27705a;
    public final Paint f27706b;
    public StaticLayout f27707c;
    public float d;
    public int e;
    public int f27708f;
    public Drawable f27709g;
    public int h;
    public final Context f27710i;
    public final org.telegram.ui.ActionBar.u6 f27711j;
    public boolean f27712k;
    public boolean f27713l;
    public boolean f27714m;
    public ColorFilter f27715n;

    public e31(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f27705a = textPaint;
        this.f27706b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f27708f = -1;
        this.f27710i = context;
        this.f27711j = u6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static e31 a(int i10) {
        e31 e31Var = new e31(ApplicationLoader.applicationContext, null);
        e31Var.b(i10);
        e31Var.f27713l = true;
        return e31Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f27708f != i10) {
            this.f27708f = i10;
            boolean z10 = this.f27714m;
            Context context = this.f27710i;
            if (z10) {
                this.f27709g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f27709g = mutate;
                mutate.setColorFilter(this.f27715n);
            }
            invalidateSelf();
            int i12 = this.f27708f;
            if (i12 >= 1 && i12 < 60) {
                str = ic.a.i(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerSeconds, a1.g.u(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerMinutes, a1.g.u(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerHours, a1.g.u(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerDays, a1.g.u(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerWeeks, a1.g.u(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerMonths, a1.g.u(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerYears, a1.g.u(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f27705a;
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
                this.f27707c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f27707c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f27714m;
        Paint paint = this.f27706b;
        int i10 = -1;
        TextPaint textPaint = this.f27705a;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27711j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f27713l) {
            if (!this.f27712k) {
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23634s8, u6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, u6Var));
        }
        if (this.f27709g != null) {
            if (!this.f27713l && !this.f27714m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f27709g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f27714m) {
                this.f27709g.setBounds(getBounds().left, getBounds().top, this.f27709g.getIntrinsicWidth() + getBounds().left, this.f27709g.getIntrinsicHeight() + getBounds().top);
                this.f27709g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f27709g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f27709g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f27709g.setBounds(rect);
                this.f27709g.draw(canvas);
            }
        }
        if (this.f27708f != 0 && this.f27707c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f27714m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f27707c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f27707c.draw(canvas);
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
        this.f27715n = colorFilter;
        if (this.f27713l) {
            this.f27709g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
