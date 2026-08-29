package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class g00 extends zf.a {
    public View.OnClickListener f38401c;
    public CharSequence d;
    public String f38402e;
    public boolean f38403f;
    public boolean f38404g;
    public long h;
    public String f38405i;
    public int f38406j;
    public int f38407k;
    public boolean f38408l;
    public TL_chatlists.TL_exportedChatlistInvite f38409m;

    public static g00 b(int i10, String str, boolean z10) {
        ?? aVar = new zf.a(4, false);
        aVar.f38407k = i10;
        aVar.d = str;
        aVar.f38408l = z10;
        return aVar;
    }

    public static g00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new zf.a(1, false);
        aVar.f38404g = z10;
        aVar.d = str;
        aVar.f38405i = str2;
        aVar.f38406j = i10;
        return aVar;
    }

    public static g00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? aVar = new zf.a(i10, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && g00.class == obj.getClass()) {
                g00 g00Var = (g00) obj;
                int i10 = this.f50845a;
                if (i10 == g00Var.f50845a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, g00Var.d) || !TextUtils.equals(this.f38402e, g00Var.f38402e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, g00Var.d)) {
                        int i11 = this.f50845a;
                        if (i11 == 0) {
                            if (this.f38403f != g00Var.f38403f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != g00Var.h || !TextUtils.equals(this.f38405i, g00Var.f38405i) || this.f38406j != g00Var.f38406j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f38409m) != (tL_exportedChatlistInvite2 = g00Var.f38409m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f38409m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = g00Var.f38409m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f38409m.peers.size() != g00Var.f38409m.peers.size()) {
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
