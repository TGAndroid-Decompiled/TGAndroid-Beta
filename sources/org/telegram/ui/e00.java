package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 extends pg.a {
    public View.OnClickListener f36476c;
    public CharSequence d;
    public String e;
    public boolean f36477f;
    public boolean f36478g;
    public long h;
    public String f36479i;
    public int f36480j;
    public int f36481k;
    public boolean f36482l;
    public TL_chatlists.TL_exportedChatlistInvite f36483m;

    public static e00 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(4, false);
        aVar.f36481k = i10;
        aVar.d = str;
        aVar.f36482l = z10;
        return aVar;
    }

    public static e00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new pg.a(1, false);
        aVar.f36478g = z10;
        aVar.d = str;
        aVar.f36479i = str2;
        aVar.f36480j = i10;
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
                int i10 = this.f44299a;
                if (i10 == e00Var.f44299a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, e00Var.d) || !TextUtils.equals(this.e, e00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, e00Var.d)) {
                        int i11 = this.f44299a;
                        if (i11 == 0) {
                            if (this.f36477f != e00Var.f36477f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != e00Var.h || !TextUtils.equals(this.f36479i, e00Var.f36479i) || this.f36480j != e00Var.f36480j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f36483m) != (tL_exportedChatlistInvite2 = e00Var.f36483m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f36483m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = e00Var.f36483m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f36483m.peers.size() != e00Var.f36483m.peers.size()) {
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
