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
public final class b70 extends org.telegram.ui.Components.hm0 {
    public final Context f35602c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public nt f35603f;
    public String h;
    public int f35604n;
    public final c70 f35605r;

    public b70(c70 c70Var, Context context) {
        this.f35605r = c70Var;
        this.f35602c = context;
        C(true);
    }

    public static void E(b70 b70Var, String str) {
        c70 c70Var = b70Var.f35605r;
        if (c70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                c70Var.d.setBackgroundColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
            } else {
                c70Var.d.setBackground(null);
            }
        }
        if (b70Var.f35604n != 0) {
            c70Var.getConnectionsManager().cancelRequest(b70Var.f35604n, true);
            b70Var.f35604n = 0;
        }
        nt ntVar = b70Var.f35603f;
        if (ntVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ntVar);
            b70Var.f35603f = null;
        }
        b70Var.h = null;
        int h = b70Var.h();
        if (h > 0) {
            b70Var.d.clear();
            b70Var.e.clear();
            b70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            c70Var.f35874b.setVisibility(8);
            c70Var.f35874b.e(false, true);
            return;
        }
        if (c70Var.f35874b.getVisibility() != 0) {
            c70Var.f35874b.setVisibility(0);
            c70Var.f35874b.e(true, false);
        } else {
            c70Var.f35874b.e(true, true);
        }
        nt ntVar2 = new nt(27, b70Var, str);
        b70Var.f35603f = ntVar2;
        AndroidUtilities.runOnUIThread(ntVar2, 300L);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (j(b1Var.b()) == 0) {
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f20306id;
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
    public final void v(s4.b1 b1Var, int i10) {
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
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) b1Var.f45958a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        l8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        c70 c70Var = this.f35605r;
        org.telegram.ui.ActionBar.d6 resourceProvider = c70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            l8Var.f22543b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, str.length() + length, 0);
            l8Var.f22544c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = c70Var.f35878r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f20306id;
        } else if (c70Var.b0(c70Var.v) != null) {
            j10 = c70Var.b0(c70Var.v).f20306id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f20306id != j10) {
            z12 = false;
        }
        l8Var.b(z12, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l8 l8Var;
        int i11;
        Context context = this.f35602c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.h6.B6;
            c70 c70Var = this.f35605r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f35602c, i12, 21, 0, 0, false, false, c70Var.getResourceProvider());
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(c70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20955b7));
            zqVar.f33006w = true;
            l4Var.setBackground(zqVar);
            if (c70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            l4Var.setText(LocaleController.getString(i11));
            l8Var = l4Var;
        } else {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context, 3);
            l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
            l8Var = l8Var2;
        }
        l8Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(l8Var);
    }
}
