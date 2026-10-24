package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d70 extends org.telegram.ui.Components.km0 {
    public final Context f36491c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ot f36492f;
    public String h;
    public int f36493n;
    public final e70 f36494r;

    public d70(e70 e70Var, Context context) {
        this.f36494r = e70Var;
        this.f36491c = context;
        C(true);
    }

    public static void E(d70 d70Var, String str) {
        e70 e70Var = d70Var.f36494r;
        if (e70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, e70Var.d, e70Var.getResourceProvider());
            } else {
                e70Var.d.setBackground(null);
            }
        }
        if (d70Var.f36493n != 0) {
            e70Var.getConnectionsManager().cancelRequest(d70Var.f36493n, true);
            d70Var.f36493n = 0;
        }
        ot otVar = d70Var.f36492f;
        if (otVar != null) {
            AndroidUtilities.cancelRunOnUIThread(otVar);
            d70Var.f36492f = null;
        }
        d70Var.h = null;
        int h = d70Var.h();
        if (h > 0) {
            d70Var.d.clear();
            d70Var.e.clear();
            d70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            e70Var.f36818b.setVisibility(8);
            e70Var.f36818b.e(false, true);
            return;
        }
        if (e70Var.f36818b.getVisibility() != 0) {
            e70Var.f36818b.setVisibility(0);
            e70Var.f36818b.e(true, false);
        } else {
            e70Var.f36818b.e(true, true);
        }
        ot otVar2 = new ot(27, d70Var, str);
        d70Var.f36492f = otVar2;
        AndroidUtilities.runOnUIThread(otVar2, 300L);
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f20371id;
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
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) b1Var.f46342a;
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
        e70 e70Var = this.f36494r;
        org.telegram.ui.ActionBar.g6 resourceProvider = e70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.k10(org.telegram.ui.ActionBar.k6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            l8Var.f22686b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.k10(org.telegram.ui.ActionBar.k6.q6, resourceProvider), length, str.length() + length, 0);
            l8Var.f22687c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = e70Var.f36822r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f20371id;
        } else if (e70Var.b0(e70Var.v) != null) {
            j10 = e70Var.b0(e70Var.v).f20371id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f20371id != j10) {
            z12 = false;
        }
        l8Var.b(z12, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l8 l8Var;
        int i11;
        Context context = this.f36491c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.k6.B6;
            e70 e70Var = this.f36494r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f36491c, i12, 21, 0, 0, false, false, e70Var.getResourceProvider());
            Drawable X0 = org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7);
            int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
            org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(new ColorDrawable(e70Var.getThemedColor(i13)), X0);
            wqVar.f32329w = true;
            l4Var.setBackground(wqVar);
            org.telegram.ui.ActionBar.g6 resourceProvider = e70Var.getResourceProvider();
            wv wvVar = new wv(4);
            wv wvVar2 = new wv(5);
            int R = org.telegram.ui.ActionBar.r6.R(i13, -1, 0, 0.0f, resourceProvider);
            wvVar2.d(R, l4Var);
            org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(100, l4Var);
            y3.c(i13, -1, 0, 0.0f, resourceProvider);
            y3.f21620n = wvVar;
            y3.f21621o = wvVar2;
            y3.f21619m = false;
            y3.f21614g = R;
            if (e70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            l4Var.setText(LocaleController.getString(i11));
            l8Var = l4Var;
        } else {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l8Var2, null);
            l8Var = l8Var2;
        }
        l8Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(l8Var);
    }
}
