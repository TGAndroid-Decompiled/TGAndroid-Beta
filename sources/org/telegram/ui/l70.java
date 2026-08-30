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
public final class l70 extends org.telegram.ui.Components.rl0 {
    public final Context f35970c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public g00 f35971f;
    public String h;
    public int f35972n;
    public final m70 f35973r;

    public l70(m70 m70Var, Context context) {
        this.f35973r = m70Var;
        this.f35970c = context;
        C(true);
    }

    public static void E(l70 l70Var, String str) {
        m70 m70Var = l70Var.f35973r;
        if (m70Var.K) {
            if (!TextUtils.isEmpty(str)) {
                m70Var.d.setBackgroundColor(m70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
            } else {
                m70Var.d.setBackground(null);
            }
        }
        if (l70Var.f35972n != 0) {
            m70Var.getConnectionsManager().cancelRequest(l70Var.f35972n, true);
            l70Var.f35972n = 0;
        }
        g00 g00Var = l70Var.f35971f;
        if (g00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g00Var);
            l70Var.f35971f = null;
        }
        l70Var.h = null;
        int h = l70Var.h();
        if (h > 0) {
            l70Var.d.clear();
            l70Var.e.clear();
            l70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            m70Var.f36217b.setVisibility(8);
            m70Var.f36217b.e(false, true);
            return;
        }
        if (m70Var.f36217b.getVisibility() != 0) {
            m70Var.f36217b.setVisibility(0);
            m70Var.f36217b.e(true, false);
        } else {
            m70Var.f36217b.e(true, true);
        }
        g00 g00Var2 = new g00(10, l70Var, str);
        l70Var.f35971f = g00Var2;
        AndroidUtilities.runOnUIThread(g00Var2, 300L);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (j(l1Var.b()) == 0) {
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19211id;
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
    public final void v(f2.l1 l1Var, int i10) {
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
            arrayList = this.e;
        } else {
            arrayList = this.d;
        }
        if (z4) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) l1Var.f5785a;
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
        m70 m70Var = this.f35973r;
        org.telegram.ui.ActionBar.f6 resourceProvider = m70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.f20140q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            k8Var.f21307b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.f20140q6, resourceProvider), length, str.length() + length, 0);
            k8Var.f21308c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m70Var.f36221r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f19211id;
        } else if (m70Var.b0(m70Var.v) != null) {
            j10 = m70Var.b0(m70Var.v).f19211id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f19211id != j10) {
            z11 = false;
        }
        k8Var.b(z11, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        int i11;
        Context context = this.f35970c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.j6.B6;
            m70 m70Var = this.f35973r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f35970c, i12, 21, 0, 0, false, false, m70Var.getResourceProvider());
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(m70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
            nqVar.f27342w = true;
            m4Var.setBackground(nqVar);
            if (m70Var.K) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            k8Var = m4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(context, 3);
            k8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(k8Var);
    }
}
