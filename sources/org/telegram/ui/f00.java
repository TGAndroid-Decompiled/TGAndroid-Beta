package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 extends qg.a {
    public View.OnClickListener f39228c;
    public CharSequence d;
    public String e;
    public boolean f39229f;
    public boolean f39230g;
    public long h;
    public String f39231i;
    public int f39232j;
    public int f39233k;
    public boolean f39234l;
    public TL_chatlists.TL_exportedChatlistInvite f39235m;

    public static f00 b(int i10, String str, boolean z10) {
        ?? aVar = new qg.a(4, false);
        aVar.f39233k = i10;
        aVar.d = str;
        aVar.f39234l = z10;
        return aVar;
    }

    public static f00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new qg.a(1, false);
        aVar.f39230g = z10;
        aVar.d = str;
        aVar.f39231i = str2;
        aVar.f39232j = i10;
        return aVar;
    }

    public static f00 d(String str) {
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
            if (obj != null && f00.class == obj.getClass()) {
                f00 f00Var = (f00) obj;
                int i10 = this.f47040a;
                if (i10 == f00Var.f47040a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, f00Var.d) || !TextUtils.equals(this.e, f00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, f00Var.d)) {
                        int i11 = this.f47040a;
                        if (i11 == 0) {
                            if (this.f39229f != f00Var.f39229f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != f00Var.h || !TextUtils.equals(this.f39231i, f00Var.f39231i) || this.f39232j != f00Var.f39232j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f39235m) != (tL_exportedChatlistInvite2 = f00Var.f39235m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f39235m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = f00Var.f39235m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f39235m.peers.size() != f00Var.f39235m.peers.size()) {
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
