package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class m50 extends org.telegram.ui.Components.dk0 {
    public final Context f49766c;
    public ArrayList d = new ArrayList();
    public ArrayList f49767e = new ArrayList();
    public ss f49768f;
    public String h;
    public int f49769n;
    public final n50 f49770r;

    public m50(n50 n50Var, Context context) {
        this.f49770r = n50Var;
        this.f49766c = context;
        C(true);
    }

    public static void E(m50 m50Var, String str) {
        n50 n50Var = m50Var.f49770r;
        if (n50Var.O) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, n50Var.d, n50Var.getResourceProvider());
            } else {
                n50Var.d.setBackground(null);
            }
        }
        if (m50Var.f49769n != 0) {
            n50Var.getConnectionsManager().cancelRequest(m50Var.f49769n, true);
            m50Var.f49769n = 0;
        }
        ss ssVar = m50Var.f49768f;
        if (ssVar != null) {
            org.telegram.messenger.g0.r(ssVar);
            m50Var.f49768f = null;
        }
        m50Var.h = null;
        int b10 = m50Var.b();
        if (b10 > 0) {
            m50Var.d.clear();
            m50Var.f49767e.clear();
            m50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            n50Var.f50091b.setVisibility(8);
            n50Var.f50091b.e(false, true);
            return;
        }
        if (n50Var.f50091b.getVisibility() != 0) {
            n50Var.f50091b.setVisibility(0);
            n50Var.f50091b.e(true, false);
        } else {
            n50Var.f50091b.e(true, true);
        }
        ss ssVar2 = new ss(28, m50Var, str);
        m50Var.f49768f = ssVar2;
        org.telegram.messenger.g0.h3(ssVar2, 300L);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (d(f1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49767e.size() + this.d.size() + (!this.f49767e.isEmpty());
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        if (d(i7) == 0) {
            if (i7 > this.d.size()) {
                arrayList = this.f49767e;
            } else {
                arrayList = this.d;
            }
            if (i7 > this.d.size()) {
                i7 = (i7 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.f28461id;
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
    public final void t(v4.f1 f1Var, int i7) {
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
            arrayList = this.f49767e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) f1Var.f59165a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i7);
        if (i7 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        h8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        n50 n50Var = this.f49770r;
        org.telegram.ui.ActionBar.h6 resourceProvider = n50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.f29621q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            h8Var.f30790b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.f29621q6, resourceProvider), length, str.length() + length, 0);
            h8Var.f30791c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n50Var.f50096r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f28461id;
        } else if (n50Var.g0(n50Var.f50098w) != null) {
            j3 = n50Var.g0(n50Var.f50098w).f28461id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f28461id != j3) {
            z12 = false;
        }
        h8Var.b(z12, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h8 h8Var;
        int i10;
        if (i7 != 0) {
            int i11 = org.telegram.ui.ActionBar.m6.B6;
            n50 n50Var = this.f49770r;
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.f49766c, i11, 21, 0, 0, false, false, n50Var.getResourceProvider());
            if (n50Var.O) {
                i10 = 2131752107;
            } else {
                i10 = 2131752106;
            }
            o4Var.setText(org.telegram.messenger.hd.N0(i10, null));
            h8Var = o4Var;
        } else {
            org.telegram.ui.Cells.h8 h8Var2 = new org.telegram.ui.Cells.h8(this.f49766c, 3);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, h8Var2, null);
            h8Var = h8Var2;
        }
        h8Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(h8Var);
    }
}
