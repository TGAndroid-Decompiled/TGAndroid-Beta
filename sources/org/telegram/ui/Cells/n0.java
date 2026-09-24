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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.zc;
public final class n0 {
    public final u1 f20649a;
    public final org.telegram.ui.Components.h9[] f20650b;
    public final ImageReceiver[] f20651c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f20652f;
    public final boolean f20653g;
    public final Drawable h;
    public final Paint f20654i;
    public final Paint f20655j;
    public final t01 f20656k;
    public boolean f20657l;
    public boolean f20658m;
    public final zc f20659n;
    public final TLObject f20660o;

    public n0(int i10, u1 u1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f20654i = new Paint(1);
        this.f20655j = new Paint(1);
        new Paint(1);
        this.f20649a = u1Var;
        this.f20660o = tLObjectArr[0];
        this.f20659n = new l0(u1Var, u1Var, 0);
        this.f20651c = new ImageReceiver[3];
        this.f20650b = new org.telegram.ui.Components.h9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f20651c[i12] = new ImageReceiver(u1Var);
            this.f20651c[i12].setParentView(u1Var);
            this.f20651c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f20650b[i12] = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f20650b[i12].j(i10, tLObject);
                this.f20651c[i12].setForUserOrChat(tLObjectArr[i12], this.f20650b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19306ra, u1Var.Id), org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19428y6, u1Var.Id)));
                paint.setColor(v);
                this.f20651c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (u1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(u1Var.I7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f20654i.setStyle(Paint.Style.STROKE);
        this.f20653g = true;
        this.h = isPremium ? null : u1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f20660o) == null) {
            this.f20656k = null;
        } else {
            this.f20656k = new t01(hg.c.h(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f20651c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b(Canvas canvas, int i10, float f7) {
        float f10;
        float f11;
        float f12;
        canvas.save();
        float a2 = this.f20659n.a(0.075f);
        float f13 = i10;
        canvas.scale(a2, a2, f13 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f20652f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.e;
                this.f20652f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f20652f = uw0.c(this.e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f20652f != null) {
            canvas.save();
            canvas.translate((i10 - this.f20652f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f20651c.length;
            u1 u1Var = this.f20649a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ec, u1Var.Id));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19428y6, u1Var.Id));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f7));
            this.f20652f.draw(canvas);
            canvas.restore();
        }
        t01 t01Var = this.f20656k;
        if (t01Var != null) {
            t01Var.f28367p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            if (drawable != null) {
                f10 = 17.0f;
            } else {
                f10 = 8.0f;
            }
            float l4 = (f13 - (t01Var.l() + AndroidUtilities.dp(f10))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z10 = this.f20653g;
            if (drawable != null) {
                float f14 = 0.0f;
                if (z10) {
                    f12 = t01Var.l() + AndroidUtilities.dp(1.33f);
                } else {
                    f12 = 0.0f;
                }
                int dp2 = (int) (f12 + l4 + AndroidUtilities.dp(3.0f));
                int b10 = (int) ok.b(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp);
                if (z10) {
                    f14 = AndroidUtilities.dp(1.33f) + t01Var.l();
                }
                drawable.setBounds(dp2, b10, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f14 + l4 + AndroidUtilities.dp(3.0f)), (int) a4.a.e(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            if (!z10) {
                f11 = 12.66f;
            } else {
                f11 = 4.0f;
            }
            this.f20656k.c(l4 + AndroidUtilities.dp(f11), dp, f7, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, u1 u1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f20654i = new Paint(1);
        this.f20655j = new Paint(1);
        new Paint(1);
        this.f20649a = u1Var;
        this.f20660o = tLObject;
        this.f20659n = new l0(u1Var, u1Var, 1);
        this.f20651c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(u1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (u1Var.M0) {
            a();
        }
        this.f20650b = r1;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.h9[] h9VarArr = {h9Var};
        h9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, h9VarArr[0]);
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
        this.e = charSequence;
        this.f20654i.setStyle(Paint.Style.STROKE);
        this.f20653g = false;
        this.h = u1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f20656k = null;
        } else {
            this.f20656k = new t01(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
