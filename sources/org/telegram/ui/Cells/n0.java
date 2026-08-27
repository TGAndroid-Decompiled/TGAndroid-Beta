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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.tv0;

public final class n0 {

    public final s1 f24702a;

    public final org.telegram.ui.Components.y8[] f24703b;

    public final ImageReceiver[] f24704c;
    public final TextPaint d;

    public final CharSequence f24705e;

    public StaticLayout f24706f;

    public final boolean f24707g;
    public final Drawable h;

    public final Paint f24708i;

    public final Paint f24709j;

    public final pz0 f24710k;

    public boolean f24711l;

    public boolean f24712m;

    public final nc f24713n;

    public final TLObject f24714o;

    public n0(int i10, s1 s1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f24708i = new Paint(1);
        this.f24709j = new Paint(1);
        new Paint(1);
        this.f24702a = s1Var;
        this.f24714o = tLObjectArr[0];
        this.f24713n = new l0(s1Var, s1Var, 0);
        this.f24704c = new ImageReceiver[3];
        this.f24703b = new org.telegram.ui.Components.y8[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f24704c[i12] = new ImageReceiver(s1Var);
            this.f24704c[i12].setParentView(s1Var);
            this.f24704c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f24703b[i12] = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            if (i12 >= tLObjectArr.length || (tLObject = tLObjectArr[i12]) == null) {
                Paint paint = new Paint(1);
                int iV = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23305ra, s1Var.Ed), org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, s1Var.Ed)));
                paint.setColor(iV);
                this.f24704c[i12].setImageBitmap(new m0(paint, iV));
            } else {
                this.f24703b[i12].j(i10, tLObject);
                this.f24704c[i12].setForUserOrChat(tLObjectArr[i12], this.f24703b[i12]);
            }
        }
        if (s1Var.I0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean zIsPremium = UserConfig.getInstance(s1Var.E7).isPremium();
        this.f24705e = LocaleController.getString(zIsPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f24708i.setStyle(Paint.Style.STROKE);
        this.f24707g = true;
        this.h = zIsPremium ? null : s1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f24714o) == null) {
            this.f24710k = null;
        } else {
            this.f24710k = new pz0(i0.a.k(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f24704c;
            if (i10 >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
    }

    public final void b(Canvas canvas, int i10, float f10) {
        canvas.save();
        float fA = this.f24713n.a(0.075f);
        float f11 = i10;
        canvas.scale(fA, fA, f11 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f24706f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f24705e;
                this.f24706f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f24706f = tv0.c(this.f24705e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f24706f != null) {
            canvas.save();
            canvas.translate((i10 - this.f24706f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f24704c.length;
            s1 s1Var = this.f24702a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23077ec, s1Var.Ed));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, s1Var.Ed));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f10));
            this.f24706f.draw(canvas);
            canvas.restore();
        }
        pz0 pz0Var = this.f24710k;
        if (pz0Var != null) {
            pz0Var.f31708p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            float fL = (f11 - (pz0Var.l() + AndroidUtilities.dp(drawable != null ? 17.0f : 8.0f))) / 2.0f;
            float fDp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z10 = this.f24707g;
            if (drawable != null) {
                float fDp2 = 0.0f;
                int iL = (int) ((z10 ? pz0Var.l() + AndroidUtilities.dp(1.33f) : 0.0f) + fL + AndroidUtilities.dp(3.0f));
                int iC = (int) rl.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, fDp);
                if (z10) {
                    fDp2 = AndroidUtilities.dp(1.33f) + pz0Var.l();
                }
                drawable.setBounds(iL, iC, (int) ((drawable.getIntrinsicWidth() * 0.625f) + fDp2 + fL + AndroidUtilities.dp(3.0f)), (int) s3.c.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, fDp));
                drawable.draw(canvas);
            }
            this.f24710k.c(fL + AndroidUtilities.dp(!z10 ? 12.66f : 4.0f), fDp, f10, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, s1 s1Var, TLObject tLObject) {
        CharSequence userName;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f24708i = new Paint(1);
        this.f24709j = new Paint(1);
        new Paint(1);
        this.f24702a = s1Var;
        this.f24714o = tLObject;
        this.f24713n = new l0(s1Var, s1Var, 1);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        this.f24704c = imageReceiverArr;
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        imageReceiver.setParentView(s1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (s1Var.I0) {
            a();
        }
        org.telegram.ui.Components.y8[] y8VarArr = {y8Var};
        this.f24703b = y8VarArr;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, y8VarArr[0]);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            userName = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            userName = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            userName = "";
        }
        try {
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.f24705e = userName;
        this.f24708i.setStyle(Paint.Style.STROKE);
        this.f24707g = false;
        this.h = s1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f24710k = null;
        } else {
            this.f24710k = new pz0(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
