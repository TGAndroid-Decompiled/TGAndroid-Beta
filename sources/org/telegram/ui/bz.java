package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class bz extends rg.a {
    public View.OnClickListener f44175c;
    public CharSequence d;
    public String f44176e;
    public boolean f44177f;
    public boolean f44178g;
    public long h;
    public String f44179i;
    public int f44180j;
    public int f44181k;
    public boolean f44182l;
    public TL_chatlists.TL_exportedChatlistInvite f44183m;

    public static bz b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(4, false);
        aVar.f44181k = i7;
        aVar.d = str;
        aVar.f44182l = z9;
        return aVar;
    }

    public static bz c(int i7, String str, String str2, boolean z9) {
        ?? aVar = new rg.a(1, false);
        aVar.f44178g = z9;
        aVar.d = str;
        aVar.f44179i = str2;
        aVar.f44180j = i7;
        return aVar;
    }

    public static bz d(String str) {
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
            if (obj != null && bz.class == obj.getClass()) {
                bz bzVar = (bz) obj;
                int i7 = this.f54543a;
                if (i7 == bzVar.f54543a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, bzVar.d) || !TextUtils.equals(this.f44176e, bzVar.f44176e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, bzVar.d)) {
                        int i10 = this.f54543a;
                        if (i10 == 0) {
                            if (this.f44177f != bzVar.f44177f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != bzVar.h || !TextUtils.equals(this.f44179i, bzVar.f44179i) || this.f44180j != bzVar.f44180j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f44183m) != (tL_exportedChatlistInvite2 = bzVar.f44183m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f44183m;
                                boolean z9 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = bzVar.f44183m;
                                if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f44183m.peers.size() != bzVar.f44183m.peers.size()) {
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
