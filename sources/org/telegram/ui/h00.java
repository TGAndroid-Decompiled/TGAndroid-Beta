package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h00 extends qg.a {
    public View.OnClickListener f39737c;
    public CharSequence d;
    public String e;
    public boolean f39738f;
    public boolean f39739g;
    public long h;
    public String f39740i;
    public int f39741j;
    public int f39742k;
    public boolean f39743l;
    public TL_chatlists.TL_exportedChatlistInvite f39744m;

    public static h00 b(int i10, String str, boolean z10) {
        ?? aVar = new qg.a(4, false);
        aVar.f39742k = i10;
        aVar.d = str;
        aVar.f39743l = z10;
        return aVar;
    }

    public static h00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new qg.a(1, false);
        aVar.f39739g = z10;
        aVar.d = str;
        aVar.f39740i = str2;
        aVar.f39741j = i10;
        return aVar;
    }

    public static h00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? aVar = new qg.a(i10, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && h00.class == obj.getClass()) {
                h00 h00Var = (h00) obj;
                int i10 = this.f47075a;
                if (i10 == h00Var.f47075a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, h00Var.d) || !TextUtils.equals(this.e, h00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, h00Var.d)) {
                        int i11 = this.f47075a;
                        if (i11 == 0) {
                            if (this.f39738f != h00Var.f39738f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != h00Var.h || !TextUtils.equals(this.f39740i, h00Var.f39740i) || this.f39741j != h00Var.f39741j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f39744m) != (tL_exportedChatlistInvite2 = h00Var.f39744m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f39744m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = h00Var.f39744m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f39744m.peers.size() != h00Var.f39744m.peers.size()) {
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
