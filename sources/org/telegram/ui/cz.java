package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class cz extends rg.a {
    public View.OnClickListener f46773c;
    public CharSequence d;
    public String f46774e;
    public boolean f46775f;
    public boolean f46776g;
    public long h;
    public String f46777i;
    public int f46778j;
    public int f46779k;
    public boolean f46780l;
    public TL_chatlists.TL_exportedChatlistInvite f46781m;

    public static cz b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(4, false);
        aVar.f46779k = i7;
        aVar.d = str;
        aVar.f46780l = z10;
        return aVar;
    }

    public static cz c(int i7, String str, String str2, boolean z10) {
        ?? aVar = new rg.a(1, false);
        aVar.f46776g = z10;
        aVar.d = str;
        aVar.f46777i = str2;
        aVar.f46778j = i7;
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
                        if (!TextUtils.equals(this.d, czVar.d) || !TextUtils.equals(this.f46774e, czVar.f46774e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, czVar.d)) {
                        int i10 = this.f56589a;
                        if (i10 == 0) {
                            if (this.f46775f != czVar.f46775f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != czVar.h || !TextUtils.equals(this.f46777i, czVar.f46777i) || this.f46778j != czVar.f46778j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f46781m) != (tL_exportedChatlistInvite2 = czVar.f46781m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f46781m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = czVar.f46781m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f46781m.peers.size() != czVar.f46781m.peers.size()) {
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
