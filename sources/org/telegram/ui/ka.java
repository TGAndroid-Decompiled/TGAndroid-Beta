package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ka extends org.telegram.ui.Components.xl0 {
    public final ta f34983c;

    public ka(ta taVar) {
        this.f34983c = taVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        ta taVar = this.f34983c;
        org.telegram.ui.Components.yl0 yl0Var = taVar.f37736b;
        ArrayList arrayList = taVar.v;
        if (yl0Var != null) {
            ArrayList arrayList2 = yl0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                yl0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                taVar.f37736b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (taVar.v.size() > 0) {
            i10 = taVar.v.size() + 2;
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
        ta taVar = this.f34983c;
        long j3 = taVar.f37743x;
        int i13 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) taVar.v.get(i10 - 4);
                    qa qaVar = (qa) view;
                    if (tL_username.editable) {
                        taVar.E = qaVar;
                    } else if (taVar.E == qaVar) {
                        taVar.E = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qaVar.a(tL_username, z10, false, taVar.f37743x);
                    return;
                }
                taVar.f37739n = true;
                na naVar = (na) view;
                taVar.f37744y = naVar;
                naVar.f35904a.setText(taVar.f37740r);
                taVar.f37739n = false;
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
        ta taVar = this.f34983c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.c1(new ja(this, taVar.getParentActivity(), taVar.getResourceProvider()));
                    }
                    return new s4.c1(new na(taVar, taVar.getParentActivity()));
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(taVar.getParentActivity()));
            }
            sa saVar = new sa(taVar, taVar.getParentActivity());
            saVar.setTag(-33024);
            return new s4.c1(saVar);
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(taVar.getParentActivity()));
    }
}
