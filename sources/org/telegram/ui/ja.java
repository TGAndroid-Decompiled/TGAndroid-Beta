package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ja extends org.telegram.ui.Components.yl0 {
    public final sa f37613c;

    public ja(sa saVar) {
        this.f37613c = saVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46527f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        sa saVar = this.f37613c;
        org.telegram.ui.Components.zl0 zl0Var = saVar.f40423b;
        ArrayList arrayList = saVar.v;
        if (zl0Var != null) {
            ArrayList arrayList2 = zl0Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                zl0Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                saVar.f40423b.L2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (saVar.v.size() > 0) {
            i10 = saVar.v.size() + 2;
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
        sa saVar = this.f37613c;
        long j3 = saVar.f40431x;
        int i13 = c1Var.f46527f;
        View view = c1Var.f46523a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) saVar.v.get(i10 - 4);
                    pa paVar = (pa) view;
                    if (tL_username.editable) {
                        saVar.E = paVar;
                    } else if (saVar.E == paVar) {
                        saVar.E = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    paVar.a(tL_username, z10, false, saVar.f40431x);
                    return;
                }
                saVar.f40427n = true;
                ma maVar = (ma) view;
                saVar.f40432y = maVar;
                maVar.f38507a.setText(saVar.f40428r);
                saVar.f40427n = false;
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
        sa saVar = this.f37613c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.c1(new ia(this, saVar.getParentActivity(), saVar.getResourceProvider()));
                    }
                    return new s4.c1(new ma(saVar, saVar.getParentActivity()));
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(saVar.getParentActivity()));
            }
            ra raVar = new ra(saVar, saVar.getParentActivity());
            raVar.setTag(-33024);
            return new s4.c1(raVar);
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(saVar.getParentActivity()));
    }
}
