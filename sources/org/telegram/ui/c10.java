package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c10 extends pg.a {
    public View.OnClickListener f34664c;
    public CharSequence d;
    public String e;
    public boolean f34665f;
    public boolean f34666g;
    public long h;
    public String f34667i;
    public int f34668j;
    public int f34669k;
    public boolean f34670l;
    public TL_chatlists.TL_exportedChatlistInvite f34671m;

    public static c10 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(4, false);
        aVar.f34669k = i10;
        aVar.d = str;
        aVar.f34670l = z10;
        return aVar;
    }

    public static c10 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new pg.a(1, false);
        aVar.f34666g = z10;
        aVar.d = str;
        aVar.f34667i = str2;
        aVar.f34668j = i10;
        return aVar;
    }

    public static c10 d(String str) {
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
            if (obj != null && c10.class == obj.getClass()) {
                c10 c10Var = (c10) obj;
                int i10 = this.f43203a;
                if (i10 == c10Var.f43203a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, c10Var.d) || !TextUtils.equals(this.e, c10Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, c10Var.d)) {
                        int i11 = this.f43203a;
                        if (i11 == 0) {
                            if (this.f34665f != c10Var.f34665f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != c10Var.h || !TextUtils.equals(this.f34667i, c10Var.f34667i) || this.f34668j != c10Var.f34668j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f34671m) != (tL_exportedChatlistInvite2 = c10Var.f34671m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f34671m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = c10Var.f34671m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f34671m.peers.size() != c10Var.f34671m.peers.size()) {
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
