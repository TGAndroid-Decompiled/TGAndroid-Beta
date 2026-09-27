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
public final class q70 extends org.telegram.ui.Components.xl0 {
    public final Context f36621c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public tv f36622f;
    public String h;
    public int f36623n;
    public final r70 f36624r;

    public q70(r70 r70Var, Context context) {
        this.f36624r = r70Var;
        this.f36621c = context;
        C(true);
    }

    public static void E(q70 q70Var, String str) {
        r70 r70Var = q70Var.f36624r;
        if (r70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                r70Var.d.setBackgroundColor(r70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
            } else {
                r70Var.d.setBackground(null);
            }
        }
        if (q70Var.f36623n != 0) {
            r70Var.getConnectionsManager().cancelRequest(q70Var.f36623n, true);
            q70Var.f36623n = 0;
        }
        tv tvVar = q70Var.f36622f;
        if (tvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tvVar);
            q70Var.f36622f = null;
        }
        q70Var.h = null;
        int h = q70Var.h();
        if (h > 0) {
            q70Var.d.clear();
            q70Var.e.clear();
            q70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            r70Var.f37020b.setVisibility(8);
            r70Var.f37020b.e(false, true);
            return;
        }
        if (r70Var.f37020b.getVisibility() != 0) {
            r70Var.f37020b.setVisibility(0);
            r70Var.f37020b.e(true, false);
        } else {
            r70Var.f37020b.e(true, true);
        }
        tv tvVar2 = new tv(23, q70Var, str);
        q70Var.f36622f = tvVar2;
        AndroidUtilities.runOnUIThread(tvVar2, 300L);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (j(c1Var.b()) == 0) {
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f18356id;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j3;
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
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) c1Var.f43005a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        r70 r70Var = this.f36624r;
        org.telegram.ui.ActionBar.e6 resourceProvider = r70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.g10(org.telegram.ui.ActionBar.i6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            m8Var.f20647b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder u10 = a4.a.u(str2);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.g10(org.telegram.ui.ActionBar.i6.q6, resourceProvider), length, str.length() + length, 0);
            m8Var.f20648c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = r70Var.f37024r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f18356id;
        } else if (r70Var.b0(r70Var.v) != null) {
            j3 = r70Var.b0(r70Var.v).f18356id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f18356id != j3) {
            z12 = false;
        }
        m8Var.b(z12, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11;
        Context context = this.f36621c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.i6.B6;
            r70 r70Var = this.f36624r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f36621c, i12, 21, 0, 0, false, false, r70Var.getResourceProvider());
            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(r70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f19021b7));
            rqVar.f28069w = true;
            m4Var.setBackground(rqVar);
            if (r70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(m8Var);
    }
}
