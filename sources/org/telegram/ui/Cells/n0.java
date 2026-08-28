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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rv0;
public final class n0 {
    public final t1 f24730a;
    public final org.telegram.ui.Components.z8[] f24731b;
    public final ImageReceiver[] f24732c;
    public final TextPaint d;
    public final CharSequence f24733e;
    public StaticLayout f24734f;
    public final boolean f24735g;
    public final Drawable h;
    public final Paint f24736i;
    public final Paint f24737j;
    public final nz0 f24738k;
    public boolean f24739l;
    public boolean f24740m;
    public final pc f24741n;
    public final TLObject f24742o;

    public n0(int i9, t1 t1Var, TLObject[] tLObjectArr, int i10) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f24736i = new Paint(1);
        this.f24737j = new Paint(1);
        new Paint(1);
        this.f24730a = t1Var;
        this.f24742o = tLObjectArr[0];
        this.f24741n = new l0(t1Var, t1Var, 0);
        this.f24732c = new ImageReceiver[3];
        this.f24731b = new org.telegram.ui.Components.z8[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.f24732c[i11] = new ImageReceiver(t1Var);
            this.f24732c[i11].setParentView(t1Var);
            this.f24732c[i11].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f24731b[i11] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            if (i11 < tLObjectArr.length && (tLObject = tLObjectArr[i11]) != null) {
                this.f24731b[i11].j(i9, tLObject);
                this.f24732c[i11].setForUserOrChat(tLObjectArr[i11], this.f24731b[i11]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23252ra, t1Var.Ed), org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, t1Var.Ed)));
                paint.setColor(v);
                this.f24732c[i11].setImageBitmap(new m0(paint, v));
            }
        }
        if (t1Var.I0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(t1Var.E7).isPremium();
        this.f24733e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f24736i.setStyle(Paint.Style.STROKE);
        this.f24735g = true;
        this.h = isPremium ? null : t1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f24742o) == null) {
            this.f24738k = null;
        } else {
            this.f24738k = new nz0(j3.r0.l(i10, "+"), 9.33f, AndroidUtilities.bold());
        }
    }

    public static String c(TLObject tLObject) {
        int i9;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return LocaleController.formatShortNumber(i10, null);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i9 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return LocaleController.formatShortNumber(i9, null);
        }
        return null;
    }

    public final void a() {
        int i9 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f24732c;
            if (i9 < imageReceiverArr.length) {
                imageReceiverArr[i9].onAttachedToWindow();
                i9++;
            } else {
                return;
            }
        }
    }

    public final void b(Canvas canvas, int i9, float f10) {
        float f11;
        float f12;
        float f13;
        canvas.save();
        float a2 = this.f24741n.a(0.075f);
        float f14 = i9;
        canvas.scale(a2, a2, f14 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f24734f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i9) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f24733e;
                this.f24734f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f24734f = rv0.c(this.f24733e, textPaint, i9, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i9 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f24734f != null) {
            canvas.save();
            canvas.translate((i9 - this.f24734f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f24732c.length;
            t1 t1Var = this.f24730a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ec, t1Var.Ed));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, t1Var.Ed));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f10));
            this.f24734f.draw(canvas);
            canvas.restore();
        }
        nz0 nz0Var = this.f24738k;
        if (nz0Var != null) {
            nz0Var.f31234p = i9 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            if (drawable != null) {
                f11 = 17.0f;
            } else {
                f11 = 8.0f;
            }
            float l10 = (f14 - (nz0Var.l() + AndroidUtilities.dp(f11))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z10 = this.f24735g;
            if (drawable != null) {
                float f15 = 0.0f;
                if (z10) {
                    f13 = nz0Var.l() + AndroidUtilities.dp(1.33f);
                } else {
                    f13 = 0.0f;
                }
                int dp2 = (int) (f13 + l10 + AndroidUtilities.dp(3.0f));
                int c10 = (int) ll.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp);
                if (z10) {
                    f15 = AndroidUtilities.dp(1.33f) + nz0Var.l();
                }
                drawable.setBounds(dp2, c10, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f15 + l10 + AndroidUtilities.dp(3.0f)), (int) j2.b(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            if (!z10) {
                f12 = 12.66f;
            } else {
                f12 = 4.0f;
            }
            this.f24738k.c(l10 + AndroidUtilities.dp(f12), dp, f10, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i9, t1 t1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f24736i = new Paint(1);
        this.f24737j = new Paint(1);
        new Paint(1);
        this.f24730a = t1Var;
        this.f24742o = tLObject;
        this.f24741n = new l0(t1Var, t1Var, 1);
        this.f24732c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(t1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (t1Var.I0) {
            a();
        }
        this.f24731b = r1;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.z8[] z8VarArr = {z8Var};
        z8Var.j(i9, tLObject);
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
        this.f24733e = charSequence;
        this.f24736i.setStyle(Paint.Style.STROKE);
        this.f24735g = false;
        this.h = t1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f24738k = null;
        } else {
            this.f24738k = new nz0(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
