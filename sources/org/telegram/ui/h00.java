package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

public final class h00 extends xf.a {

    public View.OnClickListener f38643c;
    public CharSequence d;

    public String f38644e;

    public boolean f38645f;

    public boolean f38646g;
    public long h;

    public String f38647i;

    public int f38648j;

    public int f38649k;

    public boolean f38650l;

    public TL_chatlists.TL_exportedChatlistInvite f38651m;

    public static h00 b(int i10, String str, boolean z10) {
        h00 h00Var = new h00(4, false);
        h00Var.f38649k = i10;
        h00Var.d = str;
        h00Var.f38650l = z10;
        return h00Var;
    }

    public static h00 c(int i10, String str, String str2, boolean z10) {
        h00 h00Var = new h00(1, false);
        h00Var.f38646g = z10;
        h00Var.d = str;
        h00Var.f38647i = str2;
        h00Var.f38648j = i10;
        return h00Var;
    }

    public static h00 d(String str) {
        h00 h00Var = new h00(TextUtils.isEmpty(str) ? 3 : 6, false);
        h00Var.d = str;
        return h00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || h00.class != obj.getClass()) {
                return false;
            }
            h00 h00Var = (h00) obj;
            int i10 = this.f49413a;
            if (i10 != h00Var.f49413a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, h00Var.d) || !TextUtils.equals(this.f38644e, h00Var.f38644e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, h00Var.d)) {
                    return false;
                }
                int i11 = this.f49413a;
                if (i11 == 0) {
                    if (this.f38645f != h00Var.f38645f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != h00Var.h || !TextUtils.equals(this.f38647i, h00Var.f38647i) || this.f38648j != h00Var.f38648j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f38651m) != (tL_exportedChatlistInvite2 = h00Var.f38651m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f38651m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = h00Var.f38651m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f38651m.peers.size() != h00Var.f38651m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
