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
public final class k21 extends Drawable {
    public final TextPaint f25608a;
    public final Paint f25609b;
    public StaticLayout f25610c;
    public float d;
    public int e;
    public int f25611f;
    public Drawable f25612g;
    public int h;
    public final Context f25613i;
    public final org.telegram.ui.ActionBar.e6 f25614j;
    public boolean f25615k;
    public boolean f25616l;
    public boolean f25617m;
    public ColorFilter f25618n;

    public k21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f25608a = textPaint;
        this.f25609b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f25611f = -1;
        this.f25613i = context;
        this.f25614j = e6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static k21 a(int i10) {
        k21 k21Var = new k21(ApplicationLoader.applicationContext, null);
        k21Var.b(i10);
        k21Var.f25616l = true;
        return k21Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f25611f != i10) {
            this.f25611f = i10;
            boolean z10 = this.f25617m;
            Context context = this.f25613i;
            if (z10) {
                this.f25612g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                if (i10 == 0) {
                    i11 = R.drawable.msg_mini_autodelete;
                } else {
                    i11 = R.drawable.msg_mini_autodelete_empty;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f25612g = mutate;
                mutate.setColorFilter(this.f25618n);
            }
            invalidateSelf();
            int i12 = this.f25611f;
            if (i12 >= 1 && i12 < 60) {
                str = hg.k0.h(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerSeconds, a4.a.u(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerMinutes, a4.a.u(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerHours, a4.a.u(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerDays, a4.a.u(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerWeeks, a4.a.u(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerMonths, a4.a.u(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.l0.g(R.string.SecretChatTimerYears, a4.a.u(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f25608a;
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
                this.f25610c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f25610c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.f25617m;
        Paint paint = this.f25609b;
        int i10 = -1;
        TextPaint textPaint = this.f25608a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25614j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f25616l) {
            if (!this.f25615k) {
                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19337s8, e6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, e6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, e6Var));
        }
        if (this.f25612g != null) {
            if (!this.f25616l && !this.f25617m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, e6Var);
                if (this.h != v02) {
                    this.h = v02;
                    this.f25612g.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f25617m) {
                this.f25612g.setBounds(getBounds().left, getBounds().top, this.f25612g.getIntrinsicWidth() + getBounds().left, this.f25612g.getIntrinsicHeight() + getBounds().top);
                this.f25612g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.f25612g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.f25612g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.f25612g.setBounds(rect);
                this.f25612g.draw(canvas);
            }
        }
        if (this.f25611f != 0 && this.f25610c != null) {
            if (AndroidUtilities.density != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f25617m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f25610c.draw(canvas);
            } else {
                canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
                this.f25610c.draw(canvas);
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
        this.f25618n = colorFilter;
        if (this.f25616l) {
            this.f25612g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
