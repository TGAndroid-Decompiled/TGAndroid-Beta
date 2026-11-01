package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class i60 extends org.telegram.ui.Components.tk0 {
    public final Context f37950c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public org.telegram.ui.Components.voip.u f37951f;
    public String h;
    public int f37952n;
    public final j60 f37953r;

    public i60(j60 j60Var, Context context) {
        this.f37953r = j60Var;
        this.f37950c = context;
        C(true);
    }

    public static void E(i60 i60Var, String str) {
        j60 j60Var = i60Var.f37953r;
        if (j60Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, j60Var.d, j60Var.getResourceProvider());
            } else {
                j60Var.d.setBackground(null);
            }
        }
        if (i60Var.f37952n != 0) {
            j60Var.getConnectionsManager().cancelRequest(i60Var.f37952n, true);
            i60Var.f37952n = 0;
        }
        org.telegram.ui.Components.voip.u uVar = i60Var.f37951f;
        if (uVar != null) {
            org.telegram.messenger.i0.r(uVar);
            i60Var.f37951f = null;
        }
        i60Var.h = null;
        int b10 = i60Var.b();
        if (b10 > 0) {
            i60Var.d.clear();
            i60Var.e.clear();
            i60Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            j60Var.f38283b.setVisibility(8);
            j60Var.f38283b.e(false, true);
            return;
        }
        if (j60Var.f38283b.getVisibility() != 0) {
            j60Var.f38283b.setVisibility(0);
            j60Var.f38283b.e(true, false);
        } else {
            j60Var.f38283b.e(true, true);
        }
        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(29, i60Var, str);
        i60Var.f37951f = uVar2;
        org.telegram.messenger.i0.h3(uVar2, 300L);
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19821id;
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
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) c1Var.f47909a;
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
        j60 j60Var = this.f37953r;
        org.telegram.ui.ActionBar.p6 resourceProvider = j60Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            k8Var.f22178b.setText(spannableString);
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
            k8Var.f22179c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = j60Var.f38287r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f19821id;
        } else if (j60Var.g0(j60Var.f38289w) != null) {
            j10 = j60Var.g0(j60Var.f38289w).f19821id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f19821id != j10) {
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
            j60 j60Var = this.f37953r;
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.f37950c, i12, 21, 0, 0, false, false, j60Var.getResourceProvider());
            if (j60Var.N) {
                i11 = 2131752119;
            } else {
                i11 = 2131752118;
            }
            p4Var.setText(org.telegram.messenger.dd.L0(i11, null));
            k8Var = p4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f37950c, 3);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, k8Var2, null);
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(k8Var);
    }
}
