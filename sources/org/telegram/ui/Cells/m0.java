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
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.yc;
public final class m0 {
    public final t1 f22703a;
    public final org.telegram.ui.Components.h9[] f22704b;
    public final ImageReceiver[] f22705c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f22706f;
    public final boolean f22707g;
    public final Drawable h;
    public final Paint f22708i;
    public final Paint f22709j;
    public final i11 f22710k;
    public boolean f22711l;
    public boolean f22712m;
    public final yc f22713n;
    public final TLObject f22714o;

    public m0(int i10, t1 t1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22708i = new Paint(1);
        this.f22709j = new Paint(1);
        new Paint(1);
        this.f22703a = t1Var;
        this.f22714o = tLObjectArr[0];
        this.f22713n = new k0(t1Var, t1Var, 0);
        this.f22705c = new ImageReceiver[3];
        this.f22704b = new org.telegram.ui.Components.h9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f22705c[i12] = new ImageReceiver(t1Var);
            this.f22705c[i12].setParentView(t1Var);
            this.f22705c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f22704b[i12] = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f22704b[i12].j(i10, tLObject);
                this.f22705c[i12].setForUserOrChat(tLObjectArr[i12], this.f22704b[i12]);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21444ra, t1Var.Id), org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21571y6, t1Var.Id)))};
                paint.setColor(iArr[0]);
                this.f22705c[i12].setImageBitmap(new l0(t1Var, iArr, paint));
            }
        }
        if (t1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(t1Var.I7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f22708i.setStyle(Paint.Style.STROKE);
        this.f22707g = true;
        this.h = isPremium ? null : t1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f22714o) == null) {
            this.f22710k = null;
        } else {
            this.f22710k = new i11(i2.o1.k(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f22705c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public m0(int i10, t1 t1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f22708i = new Paint(1);
        this.f22709j = new Paint(1);
        new Paint(1);
        this.f22703a = t1Var;
        this.f22714o = tLObject;
        this.f22713n = new k0(t1Var, t1Var, 1);
        this.f22705c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(t1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (t1Var.M0) {
            a();
        }
        this.f22704b = r1;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
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
        this.f22708i.setStyle(Paint.Style.STROKE);
        this.f22707g = false;
        this.h = t1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f22710k = null;
        } else {
            this.f22710k = new i11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
