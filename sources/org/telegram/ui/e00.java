package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 extends pg.a {
    public View.OnClickListener f36473c;
    public CharSequence d;
    public String e;
    public boolean f36474f;
    public boolean f36475g;
    public long h;
    public String f36476i;
    public int f36477j;
    public int f36478k;
    public boolean f36479l;
    public TL_chatlists.TL_exportedChatlistInvite f36480m;

    public static e00 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(4, false);
        aVar.f36478k = i10;
        aVar.d = str;
        aVar.f36479l = z10;
        return aVar;
    }

    public static e00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new pg.a(1, false);
        aVar.f36475g = z10;
        aVar.d = str;
        aVar.f36476i = str2;
        aVar.f36477j = i10;
        return aVar;
    }

    public static e00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? aVar = new pg.a(i10, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && e00.class == obj.getClass()) {
                e00 e00Var = (e00) obj;
                int i10 = this.f44296a;
                if (i10 == e00Var.f44296a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, e00Var.d) || !TextUtils.equals(this.e, e00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, e00Var.d)) {
                        int i11 = this.f44296a;
                        if (i11 == 0) {
                            if (this.f36474f != e00Var.f36474f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != e00Var.h || !TextUtils.equals(this.f36476i, e00Var.f36476i) || this.f36477j != e00Var.f36477j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f36480m) != (tL_exportedChatlistInvite2 = e00Var.f36480m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f36480m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = e00Var.f36480m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f36480m.peers.size() != e00Var.f36480m.peers.size()) {
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
