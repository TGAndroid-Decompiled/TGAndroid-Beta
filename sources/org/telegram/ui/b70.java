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
public final class b70 extends org.telegram.ui.Components.il0 {
    public final Context f36702c;
    public ArrayList d = new ArrayList();
    public ArrayList f36703e = new ArrayList();
    public x60 f36704f;
    public String h;
    public int f36705n;
    public final c70 f36706r;

    public b70(c70 c70Var, Context context) {
        this.f36706r = c70Var;
        this.f36702c = context;
        C(true);
    }

    public static void E(b70 b70Var, String str) {
        c70 c70Var = b70Var.f36706r;
        if (c70Var.J) {
            if (!TextUtils.isEmpty(str)) {
                c70Var.d.setBackgroundColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
            } else {
                c70Var.d.setBackground(null);
            }
        }
        if (b70Var.f36705n != 0) {
            c70Var.getConnectionsManager().cancelRequest(b70Var.f36705n, true);
            b70Var.f36705n = 0;
        }
        x60 x60Var = b70Var.f36704f;
        if (x60Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x60Var);
            b70Var.f36704f = null;
        }
        b70Var.h = null;
        int h = b70Var.h();
        if (h > 0) {
            b70Var.d.clear();
            b70Var.f36703e.clear();
            b70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            c70Var.f37013b.setVisibility(8);
            c70Var.f37013b.e(false, true);
            return;
        }
        if (c70Var.f37013b.getVisibility() != 0) {
            c70Var.f37013b.setVisibility(0);
            c70Var.f37013b.e(true, false);
        } else {
            c70Var.f37013b.e(true, true);
        }
        x60 x60Var2 = new x60(1, b70Var, str);
        b70Var.f36704f = x60Var2;
        AndroidUtilities.runOnUIThread(x60Var2, 300L);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (j(n1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36703e.size() + this.d.size() + (!this.f36703e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.f36703e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f22419id;
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
    public final void v(f2.n1 n1Var, int i10) {
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
            arrayList = this.f36703e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) n1Var.f6432a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        i8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        c70 c70Var = this.f36706r;
        org.telegram.ui.ActionBar.c6 resourceProvider = c70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.a10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            i8Var.f24503b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str2);
            n10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(n10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.a10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), length, str.length() + length, 0);
            i8Var.f24504c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = c70Var.f37018r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f22419id;
        } else if (c70Var.b0(c70Var.v) != null) {
            j10 = c70Var.b0(c70Var.v).f22419id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f22419id != j10) {
            z12 = false;
        }
        i8Var.b(z12, false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i8 i8Var;
        int i11;
        Context context = this.f36702c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.g6.B6;
            c70 c70Var = this.f36706r;
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(this.f36702c, i12, 21, 0, 0, false, false, c70Var.getResourceProvider());
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
            jqVar.f29792w = true;
            k4Var.setBackground(jqVar);
            if (c70Var.J) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            k4Var.setText(LocaleController.getString(i11));
            i8Var = k4Var;
        } else {
            org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(context, 3);
            i8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            i8Var = i8Var2;
        }
        i8Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(i8Var);
    }
}
