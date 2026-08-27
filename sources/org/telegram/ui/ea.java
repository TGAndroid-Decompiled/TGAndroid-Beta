package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class ea extends org.telegram.ui.Components.yk0 {

    public final na f37689c;

    public ea(na naVar) {
        this.f37689c = naVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 4;
    }

    @Override
    public final int h() {
        na naVar = this.f37689c;
        org.telegram.ui.Components.zk0 zk0Var = naVar.f40701b;
        ArrayList arrayList = naVar.v;
        if (zk0Var != null) {
            ArrayList arrayList2 = zk0Var.G2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                zk0Var.G2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                naVar.f40701b.G2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (naVar.v.size() > 0 ? naVar.v.size() + 2 : 0) + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 0;
        }
        return i10 != h() - 1 ? 4 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        na naVar = this.f37689c;
        long j10 = naVar.f40709x;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == 0) {
                i11 = j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader;
            } else {
                i11 = R.string.UsernamesProfileHeader;
            }
            j4Var.setText(LocaleController.getString(i11));
            return;
        }
        if (i12 == 2) {
            ((org.telegram.ui.Cells.x8) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i12 == 3) {
            naVar.f40705n = true;
            ha haVar = (ha) view;
            naVar.f40710y = haVar;
            haVar.f38761a.setText(naVar.f40706r);
            naVar.f40705n = false;
            return;
        }
        if (i12 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) naVar.v.get(i10 - 4);
        ka kaVar = (ka) view;
        if (tL_username.editable) {
            naVar.A = kaVar;
        } else if (naVar.A == kaVar) {
            naVar.A = null;
        }
        kaVar.a(tL_username, i10 < h() - 2, false, naVar.f40709x);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        na naVar = this.f37689c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.j4(naVar.getParentActivity()));
        }
        if (i10 == 1) {
            ma maVar = new ma(naVar, naVar.getParentActivity());
            maVar.setTag(-33024);
            return new org.telegram.ui.Components.lk0(maVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.x8(naVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.lk0(new ha(naVar, naVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.lk0(new da(this, naVar.getParentActivity(), naVar.getResourceProvider()));
    }
}
