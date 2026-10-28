package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g70 extends org.telegram.ui.Components.mm0 {
    public final Context f39520c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public kz f39521f;
    public String h;
    public int f39522n;
    public final h70 f39523r;

    public g70(h70 h70Var, Context context) {
        this.f39523r = h70Var;
        this.f39520c = context;
        C(true);
    }

    public static void E(g70 g70Var, String str) {
        h70 h70Var = g70Var.f39523r;
        if (h70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, h70Var.d, h70Var.getResourceProvider());
            } else {
                h70Var.d.setBackground(null);
            }
        }
        if (g70Var.f39522n != 0) {
            h70Var.getConnectionsManager().cancelRequest(g70Var.f39522n, true);
            g70Var.f39522n = 0;
        }
        kz kzVar = g70Var.f39521f;
        if (kzVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kzVar);
            g70Var.f39521f = null;
        }
        g70Var.h = null;
        int h = g70Var.h();
        if (h > 0) {
            g70Var.d.clear();
            g70Var.e.clear();
            g70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            h70Var.f39804b.setVisibility(8);
            h70Var.f39804b.e(false, true);
            return;
        }
        if (h70Var.f39804b.getVisibility() != 0) {
            h70Var.f39804b.setVisibility(0);
            h70Var.f39804b.e(true, false);
        } else {
            h70Var.f39804b.e(true, true);
        }
        kz kzVar2 = new kz(15, g70Var, str);
        g70Var.f39521f = kzVar2;
        AndroidUtilities.runOnUIThread(kzVar2, 300L);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (j(e1Var.b()) == 0) {
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f22055id;
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j10;
        String str2;
        if (j(i10) != 0) {
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
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) e1Var.f47773a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        p8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        h70 h70Var = this.f39523r;
        org.telegram.ui.ActionBar.u6 resourceProvider = h70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23598q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            p8Var.f24773b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder u10 = a1.g.u(str2);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23598q6, resourceProvider), length, str.length() + length, 0);
            p8Var.f24774c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = h70Var.f39808r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f22055id;
        } else if (h70Var.c0(h70Var.v) != null) {
            j10 = h70Var.c0(h70Var.v).f22055id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f22055id != j10) {
            z12 = false;
        }
        p8Var.b(z12, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        int i11;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.y6.B6;
            h70 h70Var = this.f39523r;
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.f39520c, i12, 21, 0, 0, false, false, h70Var.getResourceProvider());
            if (h70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            q4Var.setText(LocaleController.getString(i11));
            p8Var = q4Var;
        } else {
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(this.f39520c, 3);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, p8Var2, null);
            p8Var = p8Var2;
        }
        p8Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(p8Var);
    }
}
