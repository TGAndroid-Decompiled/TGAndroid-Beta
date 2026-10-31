package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class a00 extends hg.b {
    public View.OnClickListener f35495c;
    public CharSequence d;
    public String e;
    public boolean f35496f;
    public boolean f35497g;
    public long h;
    public String f35498i;
    public int f35499j;
    public int f35500k;
    public boolean f35501l;
    public TL_chatlists.TL_exportedChatlistInvite f35502m;

    public static a00 b(int i10, String str, boolean z10) {
        ?? bVar = new hg.b(4, false);
        bVar.f35500k = i10;
        bVar.d = str;
        bVar.f35501l = z10;
        return bVar;
    }

    public static a00 c(int i10, String str, String str2, boolean z10) {
        ?? bVar = new hg.b(1, false);
        bVar.f35497g = z10;
        bVar.d = str;
        bVar.f35498i = str2;
        bVar.f35499j = i10;
        return bVar;
    }

    public static a00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? bVar = new hg.b(i10, false);
        bVar.d = str;
        return bVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && a00.class == obj.getClass()) {
                a00 a00Var = (a00) obj;
                int i10 = this.f7680a;
                if (i10 == a00Var.f7680a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, a00Var.d) || !TextUtils.equals(this.e, a00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, a00Var.d)) {
                        int i11 = this.f7680a;
                        if (i11 == 0) {
                            if (this.f35496f != a00Var.f35496f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != a00Var.h || !TextUtils.equals(this.f35498i, a00Var.f35498i) || this.f35499j != a00Var.f35499j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f35502m) != (tL_exportedChatlistInvite2 = a00Var.f35502m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f35502m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = a00Var.f35502m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f35502m.peers.size() != a00Var.f35502m.peers.size()) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
