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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
public final class n0 {
    public final s1 f24729a;
    public final org.telegram.ui.Components.e9[] f24730b;
    public final ImageReceiver[] f24731c;
    public final TextPaint d;
    public final CharSequence f24732e;
    public StaticLayout f24733f;
    public final boolean f24734g;
    public final Drawable h;
    public final Paint f24735i;
    public final Paint f24736j;
    public final zz0 f24737k;
    public boolean f24738l;
    public boolean f24739m;
    public final uc f24740n;
    public final TLObject f24741o;

    public n0(int i10, s1 s1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f24735i = new Paint(1);
        this.f24736j = new Paint(1);
        new Paint(1);
        this.f24729a = s1Var;
        this.f24741o = tLObjectArr[0];
        this.f24740n = new l0(s1Var, s1Var, 0);
        this.f24731c = new ImageReceiver[3];
        this.f24730b = new org.telegram.ui.Components.e9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f24731c[i12] = new ImageReceiver(s1Var);
            this.f24731c[i12].setParentView(s1Var);
            this.f24731c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f24730b[i12] = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f24730b[i12].j(i10, tLObject);
                this.f24731c[i12].setForUserOrChat(tLObjectArr[i12], this.f24730b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23313ra, s1Var.Ed), org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, s1Var.Ed)));
                paint.setColor(v);
                this.f24731c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (s1Var.I0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(s1Var.E7).isPremium();
        this.f24732e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f24735i.setStyle(Paint.Style.STROKE);
        this.f24734g = true;
        this.h = isPremium ? null : s1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f24741o) == null) {
            this.f24737k = null;
        } else {
            this.f24737k = new zz0(j7.l1.k(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f24731c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b(Canvas canvas, int i10, float f9) {
        float f10;
        float f11;
        float f12;
        canvas.save();
        float a2 = this.f24740n.a(0.075f);
        float f13 = i10;
        canvas.scale(a2, a2, f13 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f24733f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f24732e;
                this.f24733f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f24733f = bw0.c(this.f24732e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f24733f != null) {
            canvas.save();
            canvas.translate((i10 - this.f24733f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f24731c.length;
            s1 s1Var = this.f24729a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23086ec, s1Var.Ed));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, s1Var.Ed));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f9));
            this.f24733f.draw(canvas);
            canvas.restore();
        }
        zz0 zz0Var = this.f24737k;
        if (zz0Var != null) {
            zz0Var.f35473p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            if (drawable != null) {
                f10 = 17.0f;
            } else {
                f10 = 8.0f;
            }
            float l10 = (f13 - (zz0Var.l() + AndroidUtilities.dp(f10))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z10 = this.f24734g;
            if (drawable != null) {
                float f14 = 0.0f;
                if (z10) {
                    f12 = zz0Var.l() + AndroidUtilities.dp(1.33f);
                } else {
                    f12 = 0.0f;
                }
                int dp2 = (int) (f12 + l10 + AndroidUtilities.dp(3.0f));
                int A = (int) org.telegram.messenger.x3.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp);
                if (z10) {
                    f14 = AndroidUtilities.dp(1.33f) + zz0Var.l();
                }
                drawable.setBounds(dp2, A, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f14 + l10 + AndroidUtilities.dp(3.0f)), (int) u3.c.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            if (!z10) {
                f11 = 12.66f;
            } else {
                f11 = 4.0f;
            }
            this.f24737k.c(l10 + AndroidUtilities.dp(f11), dp, f9, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, s1 s1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f24735i = new Paint(1);
        this.f24736j = new Paint(1);
        new Paint(1);
        this.f24729a = s1Var;
        this.f24741o = tLObject;
        this.f24740n = new l0(s1Var, s1Var, 1);
        this.f24731c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(s1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (s1Var.I0) {
            a();
        }
        this.f24730b = r1;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.e9[] e9VarArr = {e9Var};
        e9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, e9VarArr[0]);
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
        this.f24732e = charSequence;
        this.f24735i.setStyle(Paint.Style.STROKE);
        this.f24734g = false;
        this.h = s1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f24737k = null;
        } else {
            this.f24737k = new zz0(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
