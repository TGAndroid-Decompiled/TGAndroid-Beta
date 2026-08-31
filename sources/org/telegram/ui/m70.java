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
public final class m70 extends org.telegram.ui.Components.sl0 {
    public final Context f38985c;
    public ArrayList d = new ArrayList();
    public ArrayList f38986e = new ArrayList();
    public v10 f38987f;
    public String h;
    public int f38988n;
    public final n70 f38989r;

    public m70(n70 n70Var, Context context) {
        this.f38989r = n70Var;
        this.f38985c = context;
        C(true);
    }

    public static void E(m70 m70Var, String str) {
        n70 n70Var = m70Var.f38989r;
        if (n70Var.K) {
            if (!TextUtils.isEmpty(str)) {
                n70Var.d.setBackgroundColor(n70Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
            } else {
                n70Var.d.setBackground(null);
            }
        }
        if (m70Var.f38988n != 0) {
            n70Var.getConnectionsManager().cancelRequest(m70Var.f38988n, true);
            m70Var.f38988n = 0;
        }
        v10 v10Var = m70Var.f38987f;
        if (v10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            m70Var.f38987f = null;
        }
        m70Var.h = null;
        int h = m70Var.h();
        if (h > 0) {
            m70Var.d.clear();
            m70Var.f38986e.clear();
            m70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            n70Var.f39332b.setVisibility(8);
            n70Var.f39332b.e(false, true);
            return;
        }
        if (n70Var.f39332b.getVisibility() != 0) {
            n70Var.f39332b.setVisibility(0);
            n70Var.f39332b.e(true, false);
        } else {
            n70Var.f39332b.e(true, true);
        }
        v10 v10Var2 = new v10(9, m70Var, str);
        m70Var.f38987f = v10Var2;
        AndroidUtilities.runOnUIThread(v10Var2, 300L);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (j(m1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38986e.size() + this.d.size() + (!this.f38986e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.f38986e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f20870id;
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
    public final void v(f2.m1 m1Var, int i10) {
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
            arrayList = this.f38986e;
        } else {
            arrayList = this.d;
        }
        if (z4) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) m1Var.f5875a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k8Var.d(tL_messages_stickerSet, z10, !z4);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        n70 n70Var = this.f38989r;
        org.telegram.ui.ActionBar.g6 resourceProvider = n70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.k6.f21894q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            k8Var.f23072b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.k6.f21894q6, resourceProvider), length, str.length() + length, 0);
            k8Var.f23073c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n70Var.f39337r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f20870id;
        } else if (n70Var.b0(n70Var.v) != null) {
            j10 = n70Var.b0(n70Var.v).f20870id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f20870id != j10) {
            z11 = false;
        }
        k8Var.b(z11, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        int i11;
        Context context = this.f38985c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.k6.B6;
            n70 n70Var = this.f38989r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f38985c, i12, 21, 0, 0, false, false, n70Var.getResourceProvider());
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(n70Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7)), org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
            pqVar.f30173w = true;
            m4Var.setBackground(pqVar);
            if (n70Var.K) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            k8Var = m4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(context, 3);
            k8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(k8Var);
    }
}
