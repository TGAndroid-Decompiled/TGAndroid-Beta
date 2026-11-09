package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class n50 extends org.telegram.ui.Components.pj0 {
    public final Context f48095c;
    public ArrayList d = new ArrayList();
    public ArrayList f48096e = new ArrayList();
    public s10 f48097f;
    public String h;
    public int f48098n;
    public final o50 f48099r;

    public n50(o50 o50Var, Context context) {
        this.f48099r = o50Var;
        this.f48095c = context;
        C(true);
    }

    public static void E(n50 n50Var, String str) {
        o50 o50Var = n50Var.f48099r;
        if (o50Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, o50Var.d, o50Var.getResourceProvider());
            } else {
                o50Var.d.setBackground(null);
            }
        }
        if (n50Var.f48098n != 0) {
            o50Var.getConnectionsManager().cancelRequest(n50Var.f48098n, true);
            n50Var.f48098n = 0;
        }
        s10 s10Var = n50Var.f48097f;
        if (s10Var != null) {
            org.telegram.messenger.g0.r(s10Var);
            n50Var.f48097f = null;
        }
        n50Var.h = null;
        int b10 = n50Var.b();
        if (b10 > 0) {
            n50Var.d.clear();
            n50Var.f48096e.clear();
            n50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            o50Var.f48341b.setVisibility(8);
            o50Var.f48341b.e(false, true);
            return;
        }
        if (o50Var.f48341b.getVisibility() != 0) {
            o50Var.f48341b.setVisibility(0);
            o50Var.f48341b.e(true, false);
        } else {
            o50Var.f48341b.e(true, true);
        }
        s10 s10Var2 = new s10(5, n50Var, str);
        n50Var.f48097f = s10Var2;
        org.telegram.messenger.g0.i3(s10Var2, 300L);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d(d1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48096e.size() + this.d.size() + (!this.f48096e.isEmpty());
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        if (d(i7) == 0) {
            if (i7 > this.d.size()) {
                arrayList = this.f48096e;
            } else {
                arrayList = this.d;
            }
            if (i7 > this.d.size()) {
                i7 = (i7 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.f26983id;
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        ArrayList arrayList;
        boolean z10;
        String str;
        long j3;
        String str2;
        if (d(i7) != 0) {
            return;
        }
        boolean z11 = true;
        if (i7 > this.d.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            arrayList = this.f48096e;
        } else {
            arrayList = this.d;
        }
        if (z9) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) d1Var.f57056a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i7);
        if (i7 != arrayList.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        g8Var.d(tL_messages_stickerSet, z10, !z9);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        o50 o50Var = this.f48099r;
        org.telegram.ui.ActionBar.g6 resourceProvider = o50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.l6.f28105q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            g8Var.f29206b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
            m10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(m10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.l6.f28105q6, resourceProvider), length, str.length() + length, 0);
            g8Var.f29207c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o50Var.f48346r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f26983id;
        } else if (o50Var.g0(o50Var.f48348w) != null) {
            j3 = o50Var.g0(o50Var.f48348w).f26983id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f26983id != j3) {
            z11 = false;
        }
        g8Var.b(z11, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g8 g8Var;
        int i10;
        if (i7 != 0) {
            int i11 = org.telegram.ui.ActionBar.l6.B6;
            o50 o50Var = this.f48099r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f48095c, i11, 21, 0, 0, false, false, o50Var.getResourceProvider());
            if (o50Var.N) {
                i10 = 2131752119;
            } else {
                i10 = 2131752118;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i10, null));
            g8Var = n4Var;
        } else {
            org.telegram.ui.Cells.g8 g8Var2 = new org.telegram.ui.Cells.g8(this.f48095c, 3);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, g8Var2, null);
            g8Var = g8Var2;
        }
        g8Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(g8Var);
    }
}
