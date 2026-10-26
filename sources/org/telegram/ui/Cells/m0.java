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
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.xc;
public final class m0 {
    public final s1 f24406a;
    public final org.telegram.ui.Components.j9[] f24407b;
    public final ImageReceiver[] f24408c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f24409f;
    public final boolean f24410g;
    public final Drawable h;
    public final Paint f24411i;
    public final Paint f24412j;
    public final q11 f24413k;
    public boolean f24414l;
    public boolean f24415m;
    public final xc f24416n;
    public final TLObject f24417o;

    public m0(int i10, s1 s1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f24411i = new Paint(1);
        this.f24412j = new Paint(1);
        new Paint(1);
        this.f24406a = s1Var;
        this.f24417o = tLObjectArr[0];
        this.f24416n = new k0(s1Var, s1Var, 0);
        this.f24408c = new ImageReceiver[3];
        this.f24407b = new org.telegram.ui.Components.j9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f24408c[i12] = new ImageReceiver(s1Var);
            this.f24408c[i12].setParentView(s1Var);
            this.f24408c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f24407b[i12] = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f24407b[i12].j(i10, tLObject);
                this.f24408c[i12].setForUserOrChat(tLObjectArr[i12], this.f24407b[i12]);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23618ra, s1Var.Id), org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23748y6, s1Var.Id)))};
                paint.setColor(iArr[0]);
                this.f24408c[i12].setImageBitmap(new l0(s1Var, iArr, paint));
            }
        }
        if (s1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(s1Var.I7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f24411i.setStyle(Paint.Style.STROKE);
        this.f24410g = true;
        this.h = isPremium ? null : s1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f24417o) == null) {
            this.f24413k = null;
        } else {
            this.f24413k = new q11(ic.a.i(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f24408c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public m0(int i10, s1 s1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f24411i = new Paint(1);
        this.f24412j = new Paint(1);
        new Paint(1);
        this.f24406a = s1Var;
        this.f24417o = tLObject;
        this.f24416n = new k0(s1Var, s1Var, 1);
        this.f24408c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(s1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (s1Var.M0) {
            a();
        }
        this.f24407b = r1;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.j9[] j9VarArr = {j9Var};
        j9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, j9VarArr[0]);
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
        this.f24411i.setStyle(Paint.Style.STROKE);
        this.f24410g = false;
        this.h = s1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f24413k = null;
        } else {
            this.f24413k = new q11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
