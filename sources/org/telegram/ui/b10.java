package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class b10 extends pg.a {
    public View.OnClickListener f34140c;
    public CharSequence d;
    public String e;
    public boolean f34141f;
    public boolean f34142g;
    public long h;
    public String f34143i;
    public int f34144j;
    public int f34145k;
    public boolean f34146l;
    public TL_chatlists.TL_exportedChatlistInvite f34147m;

    public static b10 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(4, false);
        aVar.f34145k = i10;
        aVar.d = str;
        aVar.f34146l = z10;
        return aVar;
    }

    public static b10 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new pg.a(1, false);
        aVar.f34142g = z10;
        aVar.d = str;
        aVar.f34143i = str2;
        aVar.f34144j = i10;
        return aVar;
    }

    public static b10 d(String str) {
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
            if (obj != null && b10.class == obj.getClass()) {
                b10 b10Var = (b10) obj;
                int i10 = this.f42904a;
                if (i10 == b10Var.f42904a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, b10Var.d) || !TextUtils.equals(this.e, b10Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, b10Var.d)) {
                        int i11 = this.f42904a;
                        if (i11 == 0) {
                            if (this.f34141f != b10Var.f34141f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != b10Var.h || !TextUtils.equals(this.f34143i, b10Var.f34143i) || this.f34144j != b10Var.f34144j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f34147m) != (tL_exportedChatlistInvite2 = b10Var.f34147m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f34147m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = b10Var.f34147m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f34147m.peers.size() != b10Var.f34147m.peers.size()) {
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
