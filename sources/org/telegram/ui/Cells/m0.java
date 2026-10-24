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
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.wc;
public final class m0 {
    public final t1 f22704a;
    public final org.telegram.ui.Components.f9[] f22705b;
    public final ImageReceiver[] f22706c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f22707f;
    public final boolean f22708g;
    public final Drawable h;
    public final Paint f22709i;
    public final Paint f22710j;
    public final h11 f22711k;
    public boolean f22712l;
    public boolean f22713m;
    public final wc f22714n;
    public final TLObject f22715o;

    public m0(int i10, t1 t1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22709i = new Paint(1);
        this.f22710j = new Paint(1);
        new Paint(1);
        this.f22704a = t1Var;
        this.f22715o = tLObjectArr[0];
        this.f22714n = new k0(t1Var, t1Var, 0);
        this.f22706c = new ImageReceiver[3];
        this.f22705b = new org.telegram.ui.Components.f9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f22706c[i12] = new ImageReceiver(t1Var);
            this.f22706c[i12].setParentView(t1Var);
            this.f22706c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f22705b[i12] = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f22705b[i12].j(i10, tLObject);
                this.f22706c[i12].setForUserOrChat(tLObjectArr[i12], this.f22705b[i12]);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21445ra, t1Var.Id), org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, t1Var.Id)))};
                paint.setColor(iArr[0]);
                this.f22706c[i12].setImageBitmap(new l0(t1Var, iArr, paint));
            }
        }
        if (t1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(t1Var.I7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f22709i.setStyle(Paint.Style.STROKE);
        this.f22708g = true;
        this.h = isPremium ? null : t1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f22715o) == null) {
            this.f22711k = null;
        } else {
            this.f22711k = new h11(i2.o1.k(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f22706c;
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
        this.f22709i = new Paint(1);
        this.f22710j = new Paint(1);
        new Paint(1);
        this.f22704a = t1Var;
        this.f22715o = tLObject;
        this.f22714n = new k0(t1Var, t1Var, 1);
        this.f22706c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(t1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (t1Var.M0) {
            a();
        }
        this.f22705b = r1;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.f9[] f9VarArr = {f9Var};
        f9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, f9VarArr[0]);
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
        this.f22709i.setStyle(Paint.Style.STROKE);
        this.f22708g = false;
        this.h = t1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f22711k = null;
        } else {
            this.f22711k = new h11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
