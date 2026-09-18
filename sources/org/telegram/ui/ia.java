package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ia extends org.telegram.ui.Components.vl0 {
    public final ra f34477c;

    public ia(ra raVar) {
        this.f34477c = raVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        ra raVar = this.f34477c;
        org.telegram.ui.Components.wl0 wl0Var = raVar.f37002b;
        ArrayList arrayList = raVar.v;
        if (wl0Var != null) {
            ArrayList arrayList2 = wl0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                wl0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                raVar.f37002b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ra raVar = this.f34477c;
        long j3 = raVar.f37009x;
        int i13 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) raVar.v.get(i10 - 4);
                    oa oaVar = (oa) view;
                    if (tL_username.editable) {
                        raVar.E = oaVar;
                    } else if (raVar.E == oaVar) {
                        raVar.E = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    oaVar.a(tL_username, z10, false, raVar.f37009x);
                    return;
                }
                raVar.f37005n = true;
                la laVar = (la) view;
                raVar.f37010y = laVar;
                laVar.f35315a.setText(raVar.f37006r);
                raVar.f37005n = false;
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (j3 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            e9Var.setText(LocaleController.getString(i12));
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == 0) {
            if (j3 != 0) {
                i11 = R.string.BotSetPublicLinkHeader;
            } else {
                i11 = R.string.SetUsernameHeader;
            }
        } else {
            i11 = R.string.UsernamesProfileHeader;
        }
        m4Var.setText(LocaleController.getString(i11));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ra raVar = this.f34477c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.c1(new ha(this, raVar.getParentActivity(), raVar.getResourceProvider()));
                    }
                    return new s4.c1(new la(raVar, raVar.getParentActivity()));
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(raVar.getParentActivity()));
            }
            qa qaVar = new qa(raVar, raVar.getParentActivity());
            qaVar.setTag(-33024);
            return new s4.c1(qaVar);
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(raVar.getParentActivity()));
    }
}
