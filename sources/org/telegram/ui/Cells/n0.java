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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.zc;
public final class n0 {
    public final t1 f22315a;
    public final org.telegram.ui.Components.i9[] f22316b;
    public final ImageReceiver[] f22317c;
    public final TextPaint d;
    public final CharSequence f22318e;
    public StaticLayout f22319f;
    public final boolean f22320g;
    public final Drawable h;
    public final Paint f22321i;
    public final Paint f22322j;
    public final f01 f22323k;
    public boolean f22324l;
    public boolean f22325m;
    public final zc f22326n;
    public final TLObject f22327o;

    public n0(int i10, t1 t1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22321i = new Paint(1);
        this.f22322j = new Paint(1);
        new Paint(1);
        this.f22315a = t1Var;
        this.f22327o = tLObjectArr[0];
        this.f22326n = new l0(t1Var, t1Var, 0);
        this.f22317c = new ImageReceiver[3];
        this.f22316b = new org.telegram.ui.Components.i9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f22317c[i12] = new ImageReceiver(t1Var);
            this.f22317c[i12].setParentView(t1Var);
            this.f22317c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f22316b[i12] = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f22316b[i12].j(i10, tLObject);
                this.f22317c[i12].setForUserOrChat(tLObjectArr[i12], this.f22316b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20920ra, t1Var.Id), org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, t1Var.Id)));
                paint.setColor(v);
                this.f22317c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (t1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(t1Var.I7).isPremium();
        this.f22318e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f22321i.setStyle(Paint.Style.STROKE);
        this.f22320g = true;
        this.h = isPremium ? null : t1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.f22327o) == null) {
            this.f22323k = null;
        } else {
            this.f22323k = new f01(i2.g.i(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f22317c;
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
        float a2 = this.f22326n.a(0.075f);
        float f13 = i10;
        canvas.scale(a2, a2, f13 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f22319f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f22318e;
                this.f22319f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f22319f = iw0.c(this.f22318e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f22319f != null) {
            canvas.save();
            canvas.translate((i10 - this.f22319f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.f22317c.length;
            t1 t1Var = this.f22315a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ec, t1Var.Id));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, t1Var.Id));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f7));
            this.f22319f.draw(canvas);
            canvas.restore();
        }
        f01 f01Var = this.f22323k;
        if (f01Var != null) {
            f01Var.f25858p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            if (drawable != null) {
                f10 = 17.0f;
            } else {
                f10 = 8.0f;
            }
            float l4 = (f13 - (f01Var.l() + AndroidUtilities.dp(f10))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z10 = this.f22320g;
            if (drawable != null) {
                float f14 = 0.0f;
                if (z10) {
                    f12 = f01Var.l() + AndroidUtilities.dp(1.33f);
                } else {
                    f12 = 0.0f;
                }
                int dp2 = (int) (f12 + l4 + AndroidUtilities.dp(3.0f));
                int c10 = (int) wl.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp);
                if (z10) {
                    f14 = AndroidUtilities.dp(1.33f) + f01Var.l();
                }
                drawable.setBounds(dp2, c10, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f14 + l4 + AndroidUtilities.dp(3.0f)), (int) a4.a.e(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            if (!z10) {
                f11 = 12.66f;
            } else {
                f11 = 4.0f;
            }
            this.f22323k.c(l4 + AndroidUtilities.dp(f11), dp, f7, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, t1 t1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f22321i = new Paint(1);
        this.f22322j = new Paint(1);
        new Paint(1);
        this.f22315a = t1Var;
        this.f22327o = tLObject;
        this.f22326n = new l0(t1Var, t1Var, 1);
        this.f22317c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(t1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (t1Var.M0) {
            a();
        }
        this.f22316b = r1;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.i9[] i9VarArr = {i9Var};
        i9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, i9VarArr[0]);
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
        this.f22318e = charSequence;
        this.f22321i.setStyle(Paint.Style.STROKE);
        this.f22320g = false;
        this.h = t1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.f22323k = null;
        } else {
            this.f22323k = new f01(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
