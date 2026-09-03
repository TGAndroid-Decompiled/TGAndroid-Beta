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
    public final s1 f21389a;
    public final org.telegram.ui.Components.z8[] f21390b;
    public final ImageReceiver[] f21391c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f21392f;
    public final boolean f21393g;
    public final Drawable h;
    public final Paint f21394i;
    public final Paint f21395j;
    public final k01 f21396k;
    public boolean f21397l;
    public boolean f21398m;
    public final rc f21399n;
    public final TLObject f21400o;

    public n0(int i10, s1 s1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f21394i = new Paint(1);
        this.f21395j = new Paint(1);
        new Paint(1);
        this.f21389a = s1Var;
        this.f21400o = tLObjectArr[0];
        this.f21399n = new l0(s1Var, s1Var, 0);
        this.f21391c = new ImageReceiver[3];
        this.f21390b = new org.telegram.ui.Components.z8[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f21391c[i12] = new ImageReceiver(s1Var);
            this.f21391c[i12].setParentView(s1Var);
            this.f21391c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f21390b[i12] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f21390b[i12].j(i10, tLObject);
                this.f21391c[i12].setForUserOrChat(tLObjectArr[i12], this.f21390b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20136ra, s1Var.Fd), org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, s1Var.Fd)));
                paint.setColor(v);
                this.f21391c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (s1Var.J0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(s1Var.F7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f21394i.setStyle(Paint.Style.STROKE);
        this.f21393g = true;
        this.h = isPremium ? null : s1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f21400o) == null) {
            this.f21396k = null;
        } else {
            this.f21396k = new k01(kf.k0.j(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f21391c;
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
        float a2 = this.f21399n.a(0.075f);
        float f14 = i10;
        canvas.scale(a2, a2, f14 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f21392f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.e;
                this.f21392f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f21392f = kw0.c(this.e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f21392f != null) {
            canvas.save();
            canvas.translate((i10 - this.f21392f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f21391c.length;
            s1 s1Var = this.f21389a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19904ec, s1Var.Fd));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, s1Var.Fd));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f10));
            this.f21392f.draw(canvas);
            canvas.restore();
        }
        k01 k01Var = this.f21396k;
        if (k01Var != null) {
            k01Var.f26134p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            if (drawable != null) {
                f11 = 17.0f;
            } else {
                f11 = 8.0f;
            }
            float l10 = (f14 - (k01Var.l() + AndroidUtilities.dp(f11))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z4 = this.f21393g;
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
                drawable.setBounds(dp2, A, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f15 + l10 + AndroidUtilities.dp(3.0f)), (int) vh.w2.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            if (!z4) {
                f12 = 12.66f;
            } else {
                f12 = 4.0f;
            }
            this.f21396k.c(l10 + AndroidUtilities.dp(f12), dp, f10, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, s1 s1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f21394i = new Paint(1);
        this.f21395j = new Paint(1);
        new Paint(1);
        this.f21389a = s1Var;
        this.f21400o = tLObject;
        this.f21399n = new l0(s1Var, s1Var, 1);
        this.f21391c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(s1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (s1Var.J0) {
            a();
        }
        this.f21390b = r1;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
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
        this.e = charSequence;
        this.f21394i.setStyle(Paint.Style.STROKE);
        this.f21393g = false;
        this.h = s1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f21396k = null;
        } else {
            this.f21396k = new k01(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
