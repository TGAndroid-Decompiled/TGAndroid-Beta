package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class g00 extends pg.a {
    public View.OnClickListener f37036c;
    public CharSequence d;
    public String e;
    public boolean f37037f;
    public boolean f37038g;
    public long h;
    public String f37039i;
    public int f37040j;
    public int f37041k;
    public boolean f37042l;
    public TL_chatlists.TL_exportedChatlistInvite f37043m;

    public static g00 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(4, false);
        aVar.f37041k = i10;
        aVar.d = str;
        aVar.f37042l = z10;
        return aVar;
    }

    public static g00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new pg.a(1, false);
        aVar.f37038g = z10;
        aVar.d = str;
        aVar.f37039i = str2;
        aVar.f37040j = i10;
        return aVar;
    }

    public static g00 d(String str) {
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
            if (obj != null && g00.class == obj.getClass()) {
                g00 g00Var = (g00) obj;
                int i10 = this.f44334a;
                if (i10 == g00Var.f44334a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, g00Var.d) || !TextUtils.equals(this.e, g00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, g00Var.d)) {
                        int i11 = this.f44334a;
                        if (i11 == 0) {
                            if (this.f37037f != g00Var.f37037f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != g00Var.h || !TextUtils.equals(this.f37039i, g00Var.f37039i) || this.f37040j != g00Var.f37040j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f37043m) != (tL_exportedChatlistInvite2 = g00Var.f37043m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f37043m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = g00Var.f37043m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f37043m.peers.size() != g00Var.f37043m.peers.size()) {
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
