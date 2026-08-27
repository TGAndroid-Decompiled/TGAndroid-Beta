package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class b70 extends org.telegram.ui.Components.yk0 {

    public final Context f36712c;
    public ArrayList d = new ArrayList();

    public ArrayList f36713e = new ArrayList();

    public a30 f36714f;
    public String h;

    public int f36715n;

    public final c70 f36716r;

    public b70(c70 c70Var, Context context) {
        this.f36716r = c70Var;
        this.f36712c = context;
        C(true);
    }

    public static void E(b70 b70Var, String str) {
        c70 c70Var = b70Var.f36716r;
        if (c70Var.J) {
            if (TextUtils.isEmpty(str)) {
                c70Var.d.setBackground(null);
            } else {
                c70Var.d.setBackgroundColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            }
        }
        if (b70Var.f36715n != 0) {
            c70Var.getConnectionsManager().cancelRequest(b70Var.f36715n, true);
            b70Var.f36715n = 0;
        }
        a30 a30Var = b70Var.f36714f;
        if (a30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a30Var);
            b70Var.f36714f = null;
        }
        b70Var.h = null;
        int iH = b70Var.h();
        if (iH > 0) {
            b70Var.d.clear();
            b70Var.f36713e.clear();
            b70Var.t(0, iH);
        }
        if (TextUtils.isEmpty(str)) {
            c70Var.f36979b.setVisibility(8);
            c70Var.f36979b.e(false, true);
            return;
        }
        if (c70Var.f36979b.getVisibility() != 0) {
            c70Var.f36979b.setVisibility(0);
            c70Var.f36979b.e(true, false);
        } else {
            c70Var.f36979b.e(true, true);
        }
        a30 a30Var2 = new a30(4, b70Var, str);
        b70Var.f36714f = a30Var2;
        AndroidUtilities.runOnUIThread(a30Var2, 300L);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return j(o1Var.b()) == 0;
    }

    @Override
    public final int h() {
        return this.f36713e.size() + this.d.size() + (!this.f36713e.isEmpty() ? 1 : 0);
    }

    @Override
    public final long i(int i10) {
        if (j(i10) != 0) {
            return -1L;
        }
        ArrayList arrayList = i10 > this.d.size() ? this.f36713e : this.d;
        if (i10 > this.d.size()) {
            i10 = (i10 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f22407id;
    }

    @Override
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        long j10;
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.f36713e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) o1Var.f5789a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        h8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        c70 c70Var = this.f36716r;
        org.telegram.ui.ActionBar.c6 resourceProvider = c70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int iIndexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (iIndexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.s00(org.telegram.ui.ActionBar.g6.q6, resourceProvider), iIndexOf, lowerCase.length() + iIndexOf, 0);
            h8Var.f24453b.setText(spannableString);
        }
        int iIndexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (iIndexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + iIndexOf2;
            StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str3);
            sbO.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(sbO.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.s00(org.telegram.ui.ActionBar.g6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            h8Var.f24454c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = c70Var.f36984r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f22407id;
        } else {
            j10 = c70Var.b0(c70Var.v) != null ? c70Var.b0(c70Var.v).f22407id : 0L;
        }
        h8Var.b(tL_messages_stickerSet.set.f22407id == j10, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.f36712c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            c70 c70Var = this.f36716r;
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.f36712c, i11, 21, 0, 0, false, false, c70Var.getResourceProvider());
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            dqVar.f27828w = true;
            j4Var.setBackground(dqVar);
            j4Var.setText(LocaleController.getString(c70Var.J ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            view = j4Var;
        } else {
            org.telegram.ui.Cells.h8 h8Var = new org.telegram.ui.Cells.h8(context, 3);
            h8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            view = h8Var;
        }
        view.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(view);
    }
}
