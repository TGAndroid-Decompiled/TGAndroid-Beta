package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class l50 extends org.telegram.ui.Components.oj0 {
    public final Context f47423c;
    public ArrayList d = new ArrayList();
    public ArrayList f47424e = new ArrayList();
    public q10 f47425f;
    public String h;
    public int f47426n;
    public final m50 f47427r;

    public l50(m50 m50Var, Context context) {
        this.f47427r = m50Var;
        this.f47423c = context;
        C(true);
    }

    public static void E(l50 l50Var, String str) {
        m50 m50Var = l50Var.f47427r;
        if (m50Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, m50Var.d, m50Var.getResourceProvider());
            } else {
                m50Var.d.setBackground(null);
            }
        }
        if (l50Var.f47426n != 0) {
            m50Var.getConnectionsManager().cancelRequest(l50Var.f47426n, true);
            l50Var.f47426n = 0;
        }
        q10 q10Var = l50Var.f47425f;
        if (q10Var != null) {
            org.telegram.messenger.g0.r(q10Var);
            l50Var.f47425f = null;
        }
        l50Var.h = null;
        int b10 = l50Var.b();
        if (b10 > 0) {
            l50Var.d.clear();
            l50Var.f47424e.clear();
            l50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            m50Var.f47663b.setVisibility(8);
            m50Var.f47663b.e(false, true);
            return;
        }
        if (m50Var.f47663b.getVisibility() != 0) {
            m50Var.f47663b.setVisibility(0);
            m50Var.f47663b.e(true, false);
        } else {
            m50Var.f47663b.e(true, true);
        }
        q10 q10Var2 = new q10(5, l50Var, str);
        l50Var.f47425f = q10Var2;
        org.telegram.messenger.g0.i3(q10Var2, 300L);
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
        return this.f47424e.size() + this.d.size() + (!this.f47424e.isEmpty());
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        if (d(i7) == 0) {
            if (i7 > this.d.size()) {
                arrayList = this.f47424e;
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
            arrayList = this.f47424e;
        } else {
            arrayList = this.d;
        }
        if (z9) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) d1Var.f57044a;
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
        m50 m50Var = this.f47427r;
        org.telegram.ui.ActionBar.f6 resourceProvider = m50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.f28092q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            g8Var.f29202b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.f28092q6, resourceProvider), length, str.length() + length, 0);
            g8Var.f29203c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m50Var.f47668r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f26983id;
        } else if (m50Var.g0(m50Var.f47670w) != null) {
            j3 = m50Var.g0(m50Var.f47670w).f26983id;
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
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            m50 m50Var = this.f47427r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f47423c, i11, 21, 0, 0, false, false, m50Var.getResourceProvider());
            if (m50Var.N) {
                i10 = 2131752119;
            } else {
                i10 = 2131752118;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i10, null));
            g8Var = n4Var;
        } else {
            org.telegram.ui.Cells.g8 g8Var2 = new org.telegram.ui.Cells.g8(this.f47423c, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, g8Var2, null);
            g8Var = g8Var2;
        }
        g8Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(g8Var);
    }
}
