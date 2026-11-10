package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class o50 extends org.telegram.ui.Components.oj0 {
    public final Context f48430c;
    public ArrayList d = new ArrayList();
    public ArrayList f48431e = new ArrayList();
    public f10 f48432f;
    public String h;
    public int f48433n;
    public final p50 f48434r;

    public o50(p50 p50Var, Context context) {
        this.f48434r = p50Var;
        this.f48430c = context;
        C(true);
    }

    public static void E(o50 o50Var, String str) {
        p50 p50Var = o50Var.f48434r;
        if (p50Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, p50Var.d, p50Var.getResourceProvider());
            } else {
                p50Var.d.setBackground(null);
            }
        }
        if (o50Var.f48433n != 0) {
            p50Var.getConnectionsManager().cancelRequest(o50Var.f48433n, true);
            o50Var.f48433n = 0;
        }
        f10 f10Var = o50Var.f48432f;
        if (f10Var != null) {
            org.telegram.messenger.g0.r(f10Var);
            o50Var.f48432f = null;
        }
        o50Var.h = null;
        int b10 = o50Var.b();
        if (b10 > 0) {
            o50Var.d.clear();
            o50Var.f48431e.clear();
            o50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            p50Var.f48658b.setVisibility(8);
            p50Var.f48658b.e(false, true);
            return;
        }
        if (p50Var.f48658b.getVisibility() != 0) {
            p50Var.f48658b.setVisibility(0);
            p50Var.f48658b.e(true, false);
        } else {
            p50Var.f48658b.e(true, true);
        }
        f10 f10Var2 = new f10(6, o50Var, str);
        o50Var.f48432f = f10Var2;
        org.telegram.messenger.g0.i3(f10Var2, 300L);
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
        return this.f48431e.size() + this.d.size() + (!this.f48431e.isEmpty());
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        if (d(i7) == 0) {
            if (i7 > this.d.size()) {
                arrayList = this.f48431e;
            } else {
                arrayList = this.d;
            }
            if (i7 > this.d.size()) {
                i7 = (i7 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.f26987id;
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
            arrayList = this.f48431e;
        } else {
            arrayList = this.d;
        }
        if (z9) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) d1Var.f57052a;
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
        p50 p50Var = this.f48434r;
        org.telegram.ui.ActionBar.h6 resourceProvider = p50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.f28130q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            g8Var.f29217b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.f28130q6, resourceProvider), length, str.length() + length, 0);
            g8Var.f29218c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = p50Var.f48663r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f26987id;
        } else if (p50Var.g0(p50Var.f48665w) != null) {
            j3 = p50Var.g0(p50Var.f48665w).f26987id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f26987id != j3) {
            z11 = false;
        }
        g8Var.b(z11, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g8 g8Var;
        int i10;
        if (i7 != 0) {
            int i11 = org.telegram.ui.ActionBar.m6.B6;
            p50 p50Var = this.f48434r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f48430c, i11, 21, 0, 0, false, false, p50Var.getResourceProvider());
            if (p50Var.N) {
                i10 = 2131752119;
            } else {
                i10 = 2131752118;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i10, null));
            g8Var = n4Var;
        } else {
            org.telegram.ui.Cells.g8 g8Var2 = new org.telegram.ui.Cells.g8(this.f48430c, 3);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, g8Var2, null);
            g8Var = g8Var2;
        }
        g8Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(g8Var);
    }
}
