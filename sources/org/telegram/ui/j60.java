package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class j60 extends org.telegram.ui.Components.sk0 {
    public final Context f38436c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public xs f38437f;
    public String h;
    public int f38438n;
    public final k60 f38439r;

    public j60(k60 k60Var, Context context) {
        this.f38439r = k60Var;
        this.f38436c = context;
        C(true);
    }

    public static void E(j60 j60Var, String str) {
        k60 k60Var = j60Var.f38439r;
        if (k60Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, k60Var.d, k60Var.getResourceProvider());
            } else {
                k60Var.d.setBackground(null);
            }
        }
        if (j60Var.f38438n != 0) {
            k60Var.getConnectionsManager().cancelRequest(j60Var.f38438n, true);
            j60Var.f38438n = 0;
        }
        xs xsVar = j60Var.f38437f;
        if (xsVar != null) {
            org.telegram.messenger.i0.r(xsVar);
            j60Var.f38437f = null;
        }
        j60Var.h = null;
        int b10 = j60Var.b();
        if (b10 > 0) {
            j60Var.d.clear();
            j60Var.e.clear();
            j60Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            k60Var.f38696b.setVisibility(8);
            k60Var.f38696b.e(false, true);
            return;
        }
        if (k60Var.f38696b.getVisibility() != 0) {
            k60Var.f38696b.setVisibility(0);
            k60Var.f38696b.e(true, false);
        } else {
            k60Var.f38696b.e(true, true);
        }
        xs xsVar2 = new xs(28, j60Var, str);
        j60Var.f38437f = xsVar2;
        org.telegram.messenger.i0.h3(xsVar2, 300L);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (d(c1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty());
    }

    @Override
    public final long c(int i10) {
        ArrayList arrayList;
        if (d(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19820id;
        }
        return -1L;
    }

    @Override
    public final int d(int i10) {
        if (this.d.size() == i10) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j10;
        String str2;
        if (d(i10) != 0) {
            return;
        }
        boolean z12 = true;
        if (i10 > this.d.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) c1Var.f47898a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        k8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        k60 k60Var = this.f38439r;
        org.telegram.ui.ActionBar.p6 resourceProvider = k60Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            k8Var.f22177b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder t10 = a1.g.t(str2);
            t10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(t10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, resourceProvider), length, str.length() + length, 0);
            k8Var.f22178c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = k60Var.f38700r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f19820id;
        } else if (k60Var.f0(k60Var.f38702w) != null) {
            j10 = k60Var.f0(k60Var.f38702w).f19820id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f19820id != j10) {
            z12 = false;
        }
        k8Var.b(z12, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        int i11;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.t6.B6;
            k60 k60Var = this.f38439r;
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.f38436c, i12, 21, 0, 0, false, false, k60Var.getResourceProvider());
            if (k60Var.N) {
                i11 = 2131752119;
            } else {
                i11 = 2131752118;
            }
            p4Var.setText(org.telegram.messenger.cd.L0(i11, null));
            k8Var = p4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f38436c, 3);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, k8Var2, null);
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(k8Var);
    }
}
