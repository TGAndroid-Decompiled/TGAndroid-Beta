package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class bz extends rg.a {
    public View.OnClickListener f46665c;
    public CharSequence d;
    public String f46666e;
    public boolean f46667f;
    public boolean f46668g;
    public long h;
    public String f46669i;
    public int f46670j;
    public int f46671k;
    public boolean f46672l;
    public TL_chatlists.TL_exportedChatlistInvite f46673m;

    public static bz b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(4, false);
        aVar.f46671k = i7;
        aVar.d = str;
        aVar.f46672l = z10;
        return aVar;
    }

    public static bz c(int i7, String str, String str2, boolean z10) {
        ?? aVar = new rg.a(1, false);
        aVar.f46668g = z10;
        aVar.d = str;
        aVar.f46669i = str2;
        aVar.f46670j = i7;
        return aVar;
    }

    public static bz d(String str) {
        int i7;
        if (TextUtils.isEmpty(str)) {
            i7 = 3;
        } else {
            i7 = 6;
        }
        ?? aVar = new rg.a(i7, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && bz.class == obj.getClass()) {
                bz bzVar = (bz) obj;
                int i7 = this.f56712a;
                if (i7 == bzVar.f56712a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, bzVar.d) || !TextUtils.equals(this.f46666e, bzVar.f46666e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, bzVar.d)) {
                        int i10 = this.f56712a;
                        if (i10 == 0) {
                            if (this.f46667f != bzVar.f46667f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != bzVar.h || !TextUtils.equals(this.f46669i, bzVar.f46669i) || this.f46670j != bzVar.f46670j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f46673m) != (tL_exportedChatlistInvite2 = bzVar.f46673m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f46673m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = bzVar.f46673m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f46673m.peers.size() != bzVar.f46673m.peers.size()) {
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
