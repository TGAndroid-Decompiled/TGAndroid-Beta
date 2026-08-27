package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class fx extends f2.q {

    public final int f28462b;

    public ArrayList f28463c;
    public Object d;

    public fx() {
        this.f28462b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f28462b) {
            case 0:
                return true;
            case 1:
                return b(i10, i11);
            case 2:
                return true;
            case 3:
                return ((pf.i) ((pf.k) this.d).J.get(i10)).f49413a == ((pf.i) this.f28463c.get(i11)).f49413a;
            default:
                xf.a aVar = (xf.a) this.f28463c.get(i10);
                xf.a aVar2 = (xf.a) ((ArrayList) this.d).get(i11);
                if (aVar.f49413a != aVar2.f49413a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.TL_contact tL_contact;
        TLRPC.TL_contact tL_contact2;
        TLRPC.RecentMeUrl recentMeUrl;
        String str;
        switch (this.f28462b) {
            case 0:
                return ((Integer) this.f28463c.get(i10)).equals(((gx) this.d).f28858n.get(i11));
            case 1:
                return Objects.equals(this.f28463c.get(i10), ((vk0) this.d).f33437n.get(i11));
            case 2:
                return ((Long) this.f28463c.get(i10)).equals(((org.telegram.ui.a61) this.d).f36422r0.get(i11));
            case 3:
                pf.i iVar = (pf.i) ((pf.k) this.d).J.get(i10);
                pf.i iVar2 = (pf.i) this.f28463c.get(i11);
                TLRPC.Dialog dialog = iVar.f45823c;
                int i12 = iVar.f49413a;
                int i13 = iVar2.f49413a;
                TLRPC.Dialog dialog2 = iVar2.f45823c;
                return i12 == i13 && (i12 != 0 ? i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : iVar.f45828j == iVar2.f45828j : !((tL_contact = iVar.f45824e) == null || (tL_contact2 = iVar2.f45824e) == null || tL_contact.user_id != tL_contact2.user_id) : !((recentMeUrl = iVar.d) == null || iVar2.d == null || (str = recentMeUrl.url) == null || !str.equals(str)) : dialog != null && dialog2 != null && dialog.f22384id == dialog2.f22384id && dialog.isFolder == dialog2.isFolder : dialog != null && dialog2 != null && dialog.f22384id == dialog2.f22384id && iVar.h == iVar2.h && iVar.f45825f == iVar2.f45825f && iVar.f45826g == iVar2.f45826g);
            default:
                xf.a aVar = (xf.a) this.f28463c.get(i10);
                xf.a aVar2 = (xf.a) ((ArrayList) this.d).get(i11);
                if (aVar.f49413a != aVar2.f49413a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f28462b) {
            case 0:
                return ((gx) this.d).f28858n.size();
            case 1:
                return ((vk0) this.d).f33437n.size();
            case 2:
                return ((org.telegram.ui.a61) this.d).f36422r0.size();
            case 3:
                return this.f28463c.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f28462b) {
            case 0:
                return this.f28463c.size();
            case 1:
                return this.f28463c.size();
            case 2:
                return this.f28463c.size();
            case 3:
                return ((pf.k) this.d).J.size();
            default:
                return this.f28463c.size();
        }
    }

    public fx(Object obj, ArrayList arrayList, int i10) {
        this.f28462b = i10;
        this.d = obj;
        this.f28463c = arrayList;
    }
}
