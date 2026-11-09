package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class az extends rg.a {
    public View.OnClickListener f43828c;
    public CharSequence d;
    public String f43829e;
    public boolean f43830f;
    public boolean f43831g;
    public long h;
    public String f43832i;
    public int f43833j;
    public int f43834k;
    public boolean f43835l;
    public TL_chatlists.TL_exportedChatlistInvite f43836m;

    public static az b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(4, false);
        aVar.f43834k = i7;
        aVar.d = str;
        aVar.f43835l = z9;
        return aVar;
    }

    public static az c(int i7, String str, String str2, boolean z9) {
        ?? aVar = new rg.a(1, false);
        aVar.f43831g = z9;
        aVar.d = str;
        aVar.f43832i = str2;
        aVar.f43833j = i7;
        return aVar;
    }

    public static az d(String str) {
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
            if (obj != null && az.class == obj.getClass()) {
                az azVar = (az) obj;
                int i7 = this.f54544a;
                if (i7 == azVar.f54544a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, azVar.d) || !TextUtils.equals(this.f43829e, azVar.f43829e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, azVar.d)) {
                        int i10 = this.f54544a;
                        if (i10 == 0) {
                            if (this.f43830f != azVar.f43830f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != azVar.h || !TextUtils.equals(this.f43832i, azVar.f43832i) || this.f43833j != azVar.f43833j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f43836m) != (tL_exportedChatlistInvite2 = azVar.f43836m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f43836m;
                                boolean z9 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = azVar.f43836m;
                                if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f43836m.peers.size() != azVar.f43836m.peers.size()) {
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
