package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.rc;
public final class n0 {
    public final t1 f23191a;
    public final org.telegram.ui.Components.z8[] f23192b;
    public final ImageReceiver[] f23193c;
    public final TextPaint d;
    public final CharSequence f23194e;
    public StaticLayout f23195f;
    public final boolean f23196g;
    public final Drawable h;
    public final Paint f23197i;
    public final Paint f23198j;
    public final k01 f23199k;
    public boolean f23200l;
    public boolean f23201m;
    public final rc f23202n;
    public final TLObject f23203o;

    public n0(int i10, t1 t1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f23197i = new Paint(1);
        this.f23198j = new Paint(1);
        new Paint(1);
        this.f23191a = t1Var;
        this.f23203o = tLObjectArr[0];
        this.f23202n = new l0(t1Var, t1Var, 0);
        this.f23193c = new ImageReceiver[3];
        this.f23192b = new org.telegram.ui.Components.z8[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f23193c[i12] = new ImageReceiver(t1Var);
            this.f23193c[i12].setParentView(t1Var);
            this.f23193c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f23192b[i12] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f23192b[i12].j(i10, tLObject);
                this.f23193c[i12].setForUserOrChat(tLObjectArr[i12], this.f23192b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21918ra, t1Var.Fd), org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, t1Var.Fd)));
                paint.setColor(v);
                this.f23193c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (t1Var.J0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(t1Var.F7).isPremium();
        this.f23194e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f23197i.setStyle(Paint.Style.STROKE);
        this.f23196g = true;
        this.h = isPremium ? null : t1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f23203o) == null) {
            this.f23199k = null;
        } else {
            this.f23199k = new k01(l.d.j(i11, "+"), 9.33f, AndroidUtilities.bold());
        }
    }

    public static String c(TLObject tLObject) {
        int i10;
        if (tLObject instanceof TLRPC.Chat) {
            int i11 = ((TLRPC.Chat) tLObject).participants_count;
            if (i11 > 1) {
                return LocaleController.formatShortNumber(i11, null);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i10 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return LocaleController.formatShortNumber(i10, null);
        }
        return null;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f23193c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b(Canvas canvas, int i10, float f10) {
        float f11;
        float f12;
        float f13;
        canvas.save();
        float a2 = this.f23202n.a(0.075f);
        float f14 = i10;
        canvas.scale(a2, a2, f14 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f23195f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f23194e;
                this.f23195f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f23195f = kw0.c(this.f23194e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f23195f != null) {
            canvas.save();
            canvas.translate((i10 - this.f23195f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f23193c.length;
            t1 t1Var = this.f23191a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21685ec, t1Var.Fd));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, t1Var.Fd));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f10));
            this.f23195f.draw(canvas);
            canvas.restore();
        }
        k01 k01Var = this.f23199k;
        if (k01Var != null) {
            k01Var.f28238p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            if (drawable != null) {
                f11 = 17.0f;
            } else {
                f11 = 8.0f;
            }
            float l10 = (f14 - (k01Var.l() + AndroidUtilities.dp(f11))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z4 = this.f23196g;
            if (drawable != null) {
                float f15 = 0.0f;
                if (z4) {
                    f13 = k01Var.l() + AndroidUtilities.dp(1.33f);
                } else {
                    f13 = 0.0f;
                }
                int dp2 = (int) (f13 + l10 + AndroidUtilities.dp(3.0f));
                int A = (int) org.telegram.messenger.y3.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp);
                if (z4) {
                    f15 = AndroidUtilities.dp(1.33f) + k01Var.l();
                }
                drawable.setBounds(dp2, A, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f15 + l10 + AndroidUtilities.dp(3.0f)), (int) w.c.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            if (!z4) {
                f12 = 12.66f;
            } else {
                f12 = 4.0f;
            }
            this.f23199k.c(l10 + AndroidUtilities.dp(f12), dp, f10, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, t1 t1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f23197i = new Paint(1);
        this.f23198j = new Paint(1);
        new Paint(1);
        this.f23191a = t1Var;
        this.f23203o = tLObject;
        this.f23202n = new l0(t1Var, t1Var, 1);
        this.f23193c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(t1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (t1Var.J0) {
            a();
        }
        this.f23192b = r1;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.z8[] z8VarArr = {z8Var};
        z8Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, z8VarArr[0]);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.f23194e = charSequence;
        this.f23197i.setStyle(Paint.Style.STROKE);
        this.f23196g = false;
        this.h = t1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f23199k = null;
        } else {
            this.f23199k = new k01(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
