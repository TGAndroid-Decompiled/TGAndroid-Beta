package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mx extends f2.q {
    public final int f30774b;
    public ArrayList f30775c;
    public Object d;

    public mx() {
        this.f30774b = 4;
    }

    @Override
    public final boolean a(int i10, int i11) {
        switch (this.f30774b) {
            case 0:
                return true;
            case 1:
                return b(i10, i11);
            case 2:
                return true;
            case 3:
                if (((rf.j) ((rf.l) this.d).J.get(i10)).f50845a == ((rf.j) this.f30775c.get(i11)).f50845a) {
                    return true;
                }
                return false;
            default:
                zf.a aVar = (zf.a) this.f30775c.get(i10);
                zf.a aVar2 = (zf.a) ((ArrayList) this.d).get(i11);
                if (aVar.f50845a != aVar2.f50845a) {
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
        switch (this.f30774b) {
            case 0:
                return ((Integer) this.f30775c.get(i10)).equals(((nx) this.d).f31161n.get(i11));
            case 1:
                return Objects.equals(this.f30775c.get(i10), ((fl0) this.d).f28479n.get(i11));
            case 2:
                return ((Long) this.f30775c.get(i10)).equals(((org.telegram.ui.d61) this.d).f37356r0.get(i11));
            case 3:
                rf.j jVar = (rf.j) ((rf.l) this.d).J.get(i10);
                rf.j jVar2 = (rf.j) this.f30775c.get(i11);
                TLRPC.Dialog dialog = jVar.f47264c;
                int i12 = jVar.f50845a;
                int i13 = jVar2.f50845a;
                TLRPC.Dialog dialog2 = jVar2.f47264c;
                if (i12 != i13 || (i12 != 0 ? !(i12 != 14 ? i12 != 4 ? i12 != 6 ? i12 != 5 ? i12 != 10 : jVar.f47269j == jVar2.f47269j : (tL_contact = jVar.f47265e) != null && (tL_contact2 = jVar2.f47265e) != null && tL_contact.user_id == tL_contact2.user_id : (recentMeUrl = jVar.d) != null && jVar2.d != null && (str = recentMeUrl.url) != null && str.equals(str) : dialog != null && dialog2 != null && dialog.f22396id == dialog2.f22396id && dialog.isFolder == dialog2.isFolder) : !(dialog != null && dialog2 != null && dialog.f22396id == dialog2.f22396id && jVar.h == jVar2.h && jVar.f47266f == jVar2.f47266f && jVar.f47267g == jVar2.f47267g))) {
                    return false;
                }
                return true;
            default:
                zf.a aVar = (zf.a) this.f30775c.get(i10);
                zf.a aVar2 = (zf.a) ((ArrayList) this.d).get(i11);
                if (aVar.f50845a != aVar2.f50845a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f30774b) {
            case 0:
                return ((nx) this.d).f31161n.size();
            case 1:
                return ((fl0) this.d).f28479n.size();
            case 2:
                return ((org.telegram.ui.d61) this.d).f37356r0.size();
            case 3:
                return this.f30775c.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    @Override
    public final int e() {
        switch (this.f30774b) {
            case 0:
                return this.f30775c.size();
            case 1:
                return this.f30775c.size();
            case 2:
                return this.f30775c.size();
            case 3:
                return ((rf.l) this.d).J.size();
            default:
                return this.f30775c.size();
        }
    }

    public mx(Object obj, ArrayList arrayList, int i10) {
        this.f30774b = i10;
        this.d = obj;
        this.f30775c = arrayList;
    }
}
