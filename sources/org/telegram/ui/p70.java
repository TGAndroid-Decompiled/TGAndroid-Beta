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
public final class p70 extends org.telegram.ui.Components.ll0 {
    public final Context f36034c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hw f36035f;
    public String h;
    public int f36036n;
    public final q70 f36037r;

    public p70(q70 q70Var, Context context) {
        this.f36037r = q70Var;
        this.f36034c = context;
        C(true);
    }

    public static void E(p70 p70Var, String str) {
        q70 q70Var = p70Var.f36037r;
        if (q70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                q70Var.d.setBackgroundColor(q70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
            } else {
                q70Var.d.setBackground(null);
            }
        }
        if (p70Var.f36036n != 0) {
            q70Var.getConnectionsManager().cancelRequest(p70Var.f36036n, true);
            p70Var.f36036n = 0;
        }
        hw hwVar = p70Var.f36035f;
        if (hwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hwVar);
            p70Var.f36035f = null;
        }
        p70Var.h = null;
        int h = p70Var.h();
        if (h > 0) {
            p70Var.d.clear();
            p70Var.e.clear();
            p70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            q70Var.f36307b.setVisibility(8);
            q70Var.f36307b.e(false, true);
            return;
        }
        if (q70Var.f36307b.getVisibility() != 0) {
            q70Var.f36307b.setVisibility(0);
            q70Var.f36307b.e(true, false);
        } else {
            q70Var.f36307b.e(true, true);
        }
        hw hwVar2 = new hw(22, p70Var, str);
        p70Var.f36035f = hwVar2;
        AndroidUtilities.runOnUIThread(hwVar2, 300L);
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f18110id;
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
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) c1Var.f42627a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        n8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        q70 q70Var = this.f36037r;
        org.telegram.ui.ActionBar.d6 resourceProvider = q70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            n8Var.f20471b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder v = a4.a.v(str2);
            v.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(v.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, str.length() + length, 0);
            n8Var.f20472c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = q70Var.f36311r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f18110id;
        } else if (q70Var.b0(q70Var.v) != null) {
            j3 = q70Var.b0(q70Var.v).f18110id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f18110id != j3) {
            z12 = false;
        }
        n8Var.b(z12, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        int i11;
        Context context = this.f36034c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.h6.B6;
            q70 q70Var = this.f36037r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f36034c, i12, 21, 0, 0, false, false, q70Var.getResourceProvider());
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(q70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f18753b7));
            qqVar.f27431w = true;
            m4Var.setBackground(qqVar);
            if (q70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            n8Var = m4Var;
        } else {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context, 3);
            n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
            n8Var = n8Var2;
        }
        n8Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(n8Var);
    }
}
