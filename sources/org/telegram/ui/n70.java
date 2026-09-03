package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n70 extends org.telegram.ui.Components.ql0 {
    public final Context f36398c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public w10 f36399f;
    public String h;
    public int f36400n;
    public final o70 f36401r;

    public n70(o70 o70Var, Context context) {
        this.f36401r = o70Var;
        this.f36398c = context;
        C(true);
    }

    public static void E(n70 n70Var, String str) {
        o70 o70Var = n70Var.f36401r;
        if (o70Var.K) {
            if (!TextUtils.isEmpty(str)) {
                o70Var.d.setBackgroundColor(o70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
            } else {
                o70Var.d.setBackground(null);
            }
        }
        if (n70Var.f36400n != 0) {
            o70Var.getConnectionsManager().cancelRequest(n70Var.f36400n, true);
            n70Var.f36400n = 0;
        }
        w10 w10Var = n70Var.f36399f;
        if (w10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w10Var);
            n70Var.f36399f = null;
        }
        n70Var.h = null;
        int h = n70Var.h();
        if (h > 0) {
            n70Var.d.clear();
            n70Var.e.clear();
            n70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            o70Var.f36671b.setVisibility(8);
            o70Var.f36671b.e(false, true);
            return;
        }
        if (o70Var.f36671b.getVisibility() != 0) {
            o70Var.f36671b.setVisibility(0);
            o70Var.f36671b.e(true, false);
        } else {
            o70Var.f36671b.e(true, true);
        }
        w10 w10Var2 = new w10(9, n70Var, str);
        n70Var.f36399f = w10Var2;
        AndroidUtilities.runOnUIThread(w10Var2, 300L);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (j(l1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19186id;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (this.d.size() == i10) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        ArrayList arrayList;
        boolean z10;
        String str;
        long j10;
        String str2;
        if (j(i10) != 0) {
            return;
        }
        boolean z11 = true;
        if (i10 > this.d.size()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            arrayList = this.e;
        } else {
            arrayList = this.d;
        }
        if (z4) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) l1Var.f5774a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j8Var.d(tL_messages_stickerSet, z10, !z4);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        o70 o70Var = this.f36401r;
        org.telegram.ui.ActionBar.f6 resourceProvider = o70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.j6.f20115q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            j8Var.f21237b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder l10 = e2.c.l(str2);
            l10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(l10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.j6.f20115q6, resourceProvider), length, str.length() + length, 0);
            j8Var.f21238c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o70Var.f36675r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f19186id;
        } else if (o70Var.b0(o70Var.v) != null) {
            j10 = o70Var.b0(o70Var.v).f19186id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f19186id != j10) {
            z11 = false;
        }
        j8Var.b(z11, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.j8 j8Var;
        int i11;
        Context context = this.f36398c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.j6.B6;
            o70 o70Var = this.f36401r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f36398c, i12, 21, 0, 0, false, false, o70Var.getResourceProvider());
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(o70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
            mqVar.f27116w = true;
            l4Var.setBackground(mqVar);
            if (o70Var.K) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            l4Var.setText(LocaleController.getString(i11));
            j8Var = l4Var;
        } else {
            org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(context, 3);
            j8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            j8Var = j8Var2;
        }
        j8Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(j8Var);
    }
}
