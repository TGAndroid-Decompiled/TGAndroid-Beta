package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class k50 extends org.telegram.ui.Components.tj0 {
    public final Context f48587c;
    public ArrayList d = new ArrayList();
    public ArrayList f48588e = new ArrayList();
    public g50 f48589f;
    public String h;
    public int f48590n;
    public final l50 f48591r;

    public k50(l50 l50Var, Context context) {
        this.f48591r = l50Var;
        this.f48587c = context;
        C(true);
    }

    public static void E(k50 k50Var, String str) {
        l50 l50Var = k50Var.f48591r;
        if (l50Var.O) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l50Var.d, l50Var.getResourceProvider());
            } else {
                l50Var.d.setBackground(null);
            }
        }
        if (k50Var.f48590n != 0) {
            l50Var.getConnectionsManager().cancelRequest(k50Var.f48590n, true);
            k50Var.f48590n = 0;
        }
        g50 g50Var = k50Var.f48589f;
        if (g50Var != null) {
            org.telegram.messenger.g0.r(g50Var);
            k50Var.f48589f = null;
        }
        k50Var.h = null;
        int b10 = k50Var.b();
        if (b10 > 0) {
            k50Var.d.clear();
            k50Var.f48588e.clear();
            k50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            l50Var.f48846b.setVisibility(8);
            l50Var.f48846b.e(false, true);
            return;
        }
        if (l50Var.f48846b.getVisibility() != 0) {
            l50Var.f48846b.setVisibility(0);
            l50Var.f48846b.e(true, false);
        } else {
            l50Var.f48846b.e(true, true);
        }
        g50 g50Var2 = new g50(1, k50Var, str);
        k50Var.f48589f = g50Var2;
        org.telegram.messenger.g0.i3(g50Var2, 300L);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (d(e1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48588e.size() + this.d.size() + (!this.f48588e.isEmpty());
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        if (d(i7) == 0) {
            if (i7 > this.d.size()) {
                arrayList = this.f48588e;
            } else {
                arrayList = this.d;
            }
            if (i7 > this.d.size()) {
                i7 = (i7 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.f28078id;
        }
        return -1L;
    }

    @Override
    public final int d(int i7) {
        if (this.d.size() == i7) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j3;
        String str2;
        if (d(i7) != 0) {
            return;
        }
        boolean z12 = true;
        if (i7 > this.d.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f48588e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) e1Var.f58535a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i7);
        if (i7 != arrayList.size() - 1) {
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
        l50 l50Var = this.f48591r;
        org.telegram.ui.ActionBar.e6 resourceProvider = l50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.f29089q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            f8Var.f30295b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
            m10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(m10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.f29089q6, resourceProvider), length, str.length() + length, 0);
            f8Var.f30296c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = l50Var.f48851r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f28078id;
        } else if (l50Var.g0(l50Var.f48853w) != null) {
            j3 = l50Var.g0(l50Var.f48853w).f28078id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f28078id != j3) {
            z12 = false;
        }
        f8Var.b(z12, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.f8 f8Var;
        int i10;
        if (i7 != 0) {
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            l50 l50Var = this.f48591r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f48587c, i11, 21, 0, 0, false, false, l50Var.getResourceProvider());
            if (l50Var.O) {
                i10 = 2131752119;
            } else {
                i10 = 2131752118;
            }
            n4Var.setText(org.telegram.messenger.hd.M0(i10, null));
            f8Var = n4Var;
        } else {
            org.telegram.ui.Cells.f8 f8Var2 = new org.telegram.ui.Cells.f8(this.f48587c, 3);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, f8Var2, null);
            f8Var = f8Var2;
        }
        f8Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(f8Var);
    }
}
