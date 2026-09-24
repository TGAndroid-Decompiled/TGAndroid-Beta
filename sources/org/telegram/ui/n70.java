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
public final class n70 extends org.telegram.ui.Components.vl0 {
    public final Context f35743c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public tt f35744f;
    public String h;
    public int f35745n;
    public final o70 f35746r;

    public n70(o70 o70Var, Context context) {
        this.f35746r = o70Var;
        this.f35743c = context;
        C(true);
    }

    public static void E(n70 n70Var, String str) {
        o70 o70Var = n70Var.f35746r;
        if (o70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                o70Var.d.setBackgroundColor(o70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
            } else {
                o70Var.d.setBackground(null);
            }
        }
        if (n70Var.f35745n != 0) {
            o70Var.getConnectionsManager().cancelRequest(n70Var.f35745n, true);
            n70Var.f35745n = 0;
        }
        tt ttVar = n70Var.f35744f;
        if (ttVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ttVar);
            n70Var.f35744f = null;
        }
        n70Var.h = null;
        int h = n70Var.h();
        if (h > 0) {
            n70Var.d.clear();
            n70Var.e.clear();
            n70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            o70Var.f36043b.setVisibility(8);
            o70Var.f36043b.e(false, true);
            return;
        }
        if (o70Var.f36043b.getVisibility() != 0) {
            o70Var.f36043b.setVisibility(0);
            o70Var.f36043b.e(true, false);
        } else {
            o70Var.f36043b.e(true, true);
        }
        tt ttVar2 = new tt(28, n70Var, str);
        n70Var.f35744f = ttVar2;
        AndroidUtilities.runOnUIThread(ttVar2, 300L);
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f18348id;
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
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) c1Var.f42946a;
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
        o70 o70Var = this.f35746r;
        org.telegram.ui.ActionBar.d6 resourceProvider = o70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            m8Var.f20631b.setText(spannableString);
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
            m8Var.f20632c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o70Var.f36047r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f18348id;
        } else if (o70Var.b0(o70Var.v) != null) {
            j3 = o70Var.b0(o70Var.v).f18348id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f18348id != j3) {
            z12 = false;
        }
        m8Var.b(z12, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11;
        Context context = this.f35743c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.h6.B6;
            o70 o70Var = this.f35746r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f35743c, i12, 21, 0, 0, false, false, o70Var.getResourceProvider());
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(o70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18989a7)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19009b7));
            qqVar.f27733w = true;
            m4Var.setBackground(qqVar);
            if (o70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(m8Var);
    }
}
