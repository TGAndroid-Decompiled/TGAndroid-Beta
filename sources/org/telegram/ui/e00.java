package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 extends wf.a {
    public View.OnClickListener f37767c;
    public CharSequence d;
    public String f37768e;
    public boolean f37769f;
    public boolean f37770g;
    public long h;
    public String f37771i;
    public int f37772j;
    public int f37773k;
    public boolean f37774l;
    public TL_chatlists.TL_exportedChatlistInvite f37775m;

    public static e00 b(int i9, String str, boolean z10) {
        ?? aVar = new wf.a(4, false);
        aVar.f37773k = i9;
        aVar.d = str;
        aVar.f37774l = z10;
        return aVar;
    }

    public static e00 c(int i9, String str, String str2, boolean z10) {
        ?? aVar = new wf.a(1, false);
        aVar.f37770g = z10;
        aVar.d = str;
        aVar.f37771i = str2;
        aVar.f37772j = i9;
        return aVar;
    }

    public static e00 d(String str) {
        int i9;
        if (TextUtils.isEmpty(str)) {
            i9 = 3;
        } else {
            i9 = 6;
        }
        ?? aVar = new wf.a(i9, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && e00.class == obj.getClass()) {
                e00 e00Var = (e00) obj;
                int i9 = this.f48814a;
                if (i9 == e00Var.f48814a) {
                    if (i9 == 11) {
                        if (!TextUtils.equals(this.d, e00Var.d) || !TextUtils.equals(this.f37768e, e00Var.f37768e)) {
                            return false;
                        }
                    } else if ((i9 != 0 && i9 != 1 && i9 != 3 && i9 != 4) || TextUtils.equals(this.d, e00Var.d)) {
                        int i10 = this.f48814a;
                        if (i10 == 0) {
                            if (this.f37769f != e00Var.f37769f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != e00Var.h || !TextUtils.equals(this.f37771i, e00Var.f37771i) || this.f37772j != e00Var.f37772j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f37775m) != (tL_exportedChatlistInvite2 = e00Var.f37775m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f37775m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = e00Var.f37775m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f37775m.peers.size() != e00Var.f37775m.peers.size()) {
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
