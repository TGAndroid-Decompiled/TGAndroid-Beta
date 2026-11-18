package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class cz extends rg.a {
    public View.OnClickListener f46793c;
    public CharSequence d;
    public String f46794e;
    public boolean f46795f;
    public boolean f46796g;
    public long h;
    public String f46797i;
    public int f46798j;
    public int f46799k;
    public boolean f46800l;
    public TL_chatlists.TL_exportedChatlistInvite f46801m;

    public static cz b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(4, false);
        aVar.f46799k = i7;
        aVar.d = str;
        aVar.f46800l = z10;
        return aVar;
    }

    public static cz c(int i7, String str, String str2, boolean z10) {
        ?? aVar = new rg.a(1, false);
        aVar.f46796g = z10;
        aVar.d = str;
        aVar.f46797i = str2;
        aVar.f46798j = i7;
        return aVar;
    }

    public static cz d(String str) {
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
            if (obj != null && cz.class == obj.getClass()) {
                cz czVar = (cz) obj;
                int i7 = this.f56589a;
                if (i7 == czVar.f56589a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, czVar.d) || !TextUtils.equals(this.f46794e, czVar.f46794e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, czVar.d)) {
                        int i10 = this.f56589a;
                        if (i10 == 0) {
                            if (this.f46795f != czVar.f46795f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != czVar.h || !TextUtils.equals(this.f46797i, czVar.f46797i) || this.f46798j != czVar.f46798j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f46801m) != (tL_exportedChatlistInvite2 = czVar.f46801m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f46801m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = czVar.f46801m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f46801m.peers.size() != czVar.f46801m.peers.size()) {
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
