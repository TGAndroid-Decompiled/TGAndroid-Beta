package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ia extends org.telegram.ui.Components.ql0 {
    public final ra f34882c;

    public ia(ra raVar) {
        this.f34882c = raVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        ra raVar = this.f34882c;
        org.telegram.ui.Components.rl0 rl0Var = raVar.f37776b;
        ArrayList arrayList = raVar.v;
        if (rl0Var != null) {
            ArrayList arrayList2 = rl0Var.H2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                rl0Var.H2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                raVar.f37776b.H2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (raVar.v.size() > 0) {
            i10 = raVar.v.size() + 2;
        } else {
            i10 = 0;
        }
        return i10 + 3;
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
        if (i10 == h() - 1) {
            return 2;
        }
        return 4;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        boolean z4;
        ra raVar = this.f34882c;
        long j10 = raVar.f37783x;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) raVar.v.get(i10 - 4);
                    oa oaVar = (oa) view;
                    if (tL_username.editable) {
                        raVar.B = oaVar;
                    } else if (raVar.B == oaVar) {
                        raVar.B = null;
                    }
                    if (i10 < h() - 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    oaVar.a(tL_username, z4, false, raVar.f37783x);
                    return;
                }
                raVar.f37779n = true;
                la laVar = (la) view;
                raVar.f37784y = laVar;
                laVar.f35720a.setText(raVar.f37780r);
                raVar.f37779n = false;
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (j10 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            z8Var.setText(LocaleController.getString(i12));
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == 0) {
            if (j10 != 0) {
                i11 = R.string.BotSetPublicLinkHeader;
            } else {
                i11 = R.string.SetUsernameHeader;
            }
        } else {
            i11 = R.string.UsernamesProfileHeader;
        }
        l4Var.setText(LocaleController.getString(i11));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ra raVar = this.f34882c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new f2.l1(new ha(this, raVar.getParentActivity(), raVar.getResourceProvider()));
                    }
                    return new f2.l1(new la(raVar, raVar.getParentActivity()));
                }
                return new f2.l1(new org.telegram.ui.Cells.z8(raVar.getParentActivity()));
            }
            qa qaVar = new qa(raVar, raVar.getParentActivity());
            qaVar.setTag(-33024);
            return new f2.l1(qaVar);
        }
        return new f2.l1(new org.telegram.ui.Cells.l4(raVar.getParentActivity()));
    }
}
