package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class f50 extends org.telegram.ui.Components.sj0 {
    public final Context f45146c;
    public ArrayList d = new ArrayList();
    public ArrayList f45147e = new ArrayList();
    public ly f45148f;
    public String h;
    public int f45149n;
    public final g50 f45150r;

    public f50(g50 g50Var, Context context) {
        this.f45150r = g50Var;
        this.f45146c = context;
        C(true);
    }

    public static void E(f50 f50Var, String str) {
        g50 g50Var = f50Var.f45150r;
        if (g50Var.O) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, g50Var.d, g50Var.getResourceProvider());
            } else {
                g50Var.d.setBackground(null);
            }
        }
        if (f50Var.f45149n != 0) {
            g50Var.getConnectionsManager().cancelRequest(f50Var.f45149n, true);
            f50Var.f45149n = 0;
        }
        ly lyVar = f50Var.f45148f;
        if (lyVar != null) {
            org.telegram.messenger.g0.r(lyVar);
            f50Var.f45148f = null;
        }
        f50Var.h = null;
        int b10 = f50Var.b();
        if (b10 > 0) {
            f50Var.d.clear();
            f50Var.f45147e.clear();
            f50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            g50Var.f45534b.setVisibility(8);
            g50Var.f45534b.e(false, true);
            return;
        }
        if (g50Var.f45534b.getVisibility() != 0) {
            g50Var.f45534b.setVisibility(0);
            g50Var.f45534b.e(true, false);
        } else {
            g50Var.f45534b.e(true, true);
        }
        ly lyVar2 = new ly(10, f50Var, str);
        f50Var.f45148f = lyVar2;
        org.telegram.messenger.g0.i3(lyVar2, 300L);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d(d1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45147e.size() + this.d.size() + (!this.f45147e.isEmpty());
    }

    @Override
    public final long c(int i3) {
        ArrayList arrayList;
        if (d(i3) == 0) {
            if (i3 > this.d.size()) {
                arrayList = this.f45147e;
            } else {
                arrayList = this.d;
            }
            if (i3 > this.d.size()) {
                i3 = (i3 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i3)).set.f27028id;
        }
        return -1L;
    }

    @Override
    public final int d(int i3) {
        if (this.d.size() == i3) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j10;
        String str2;
        if (d(i3) != 0) {
            return;
        }
        boolean z12 = true;
        if (i3 > this.d.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f45147e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i3 = (i3 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) d1Var.f55540a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
        if (i3 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        f8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        g50 g50Var = this.f45150r;
        org.telegram.ui.ActionBar.e6 resourceProvider = g50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28121q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            f8Var.f29236b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str2);
            l10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(l10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28121q6, resourceProvider), length, str.length() + length, 0);
            f8Var.f29237c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = g50Var.f45539r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f27028id;
        } else if (g50Var.g0(g50Var.f45541w) != null) {
            j10 = g50Var.g0(g50Var.f45541w).f27028id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f27028id != j10) {
            z12 = false;
        }
        f8Var.b(z12, false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.f8 f8Var;
        int i10;
        if (i3 != 0) {
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            g50 g50Var = this.f45150r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f45146c, i11, 21, 0, 0, false, false, g50Var.getResourceProvider());
            if (g50Var.O) {
                i10 = 2131752119;
            } else {
                i10 = 2131752118;
            }
            n4Var.setText(org.telegram.messenger.bd.M0(i10, null));
            f8Var = n4Var;
        } else {
            org.telegram.ui.Cells.f8 f8Var2 = new org.telegram.ui.Cells.f8(this.f45146c, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, f8Var2, null);
            f8Var = f8Var2;
        }
        f8Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(f8Var);
    }
}
