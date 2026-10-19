package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.yc;
public final class n0 {
    public final u1 f22621a;
    public final org.telegram.ui.Components.h9[] f22622b;
    public final ImageReceiver[] f22623c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f22624f;
    public final boolean f22625g;
    public final Drawable h;
    public final Paint f22626i;
    public final Paint f22627j;
    public final e11 f22628k;
    public boolean f22629l;
    public boolean f22630m;
    public final yc f22631n;
    public final TLObject f22632o;

    public n0(int i10, u1 u1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22626i = new Paint(1);
        this.f22627j = new Paint(1);
        new Paint(1);
        this.f22621a = u1Var;
        this.f22632o = tLObjectArr[0];
        this.f22631n = new l0(u1Var, u1Var, 0);
        this.f22623c = new ImageReceiver[3];
        this.f22622b = new org.telegram.ui.Components.h9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f22623c[i12] = new ImageReceiver(u1Var);
            this.f22623c[i12].setParentView(u1Var);
            this.f22623c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f22622b[i12] = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f22622b[i12].j(i10, tLObject);
                this.f22623c[i12].setForUserOrChat(tLObjectArr[i12], this.f22622b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21248ra, u1Var.Id), org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, u1Var.Id)));
                paint.setColor(v);
                this.f22623c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (u1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(u1Var.I7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f22626i.setStyle(Paint.Style.STROKE);
        this.f22625g = true;
        this.h = isPremium ? null : u1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f22632o) == null) {
            this.f22628k = null;
        } else {
            this.f22628k = new e11(i2.e.j(i11, "+"), 9.33f, AndroidUtilities.bold());
        }
    }

    public static String b(TLObject tLObject) {
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
            ImageReceiver[] imageReceiverArr = this.f22623c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public n0(int i10, u1 u1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f22626i = new Paint(1);
        this.f22627j = new Paint(1);
        new Paint(1);
        this.f22621a = u1Var;
        this.f22632o = tLObject;
        this.f22631n = new l0(u1Var, u1Var, 1);
        this.f22623c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(u1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (u1Var.M0) {
            a();
        }
        this.f22622b = r1;
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
        this.f22626i.setStyle(Paint.Style.STROKE);
        this.f22625g = false;
        this.h = u1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f22628k = null;
        } else {
            this.f22628k = new e11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
