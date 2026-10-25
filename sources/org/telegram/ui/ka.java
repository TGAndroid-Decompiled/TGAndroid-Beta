package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ka extends org.telegram.ui.Components.lm0 {
    public final ta f40865c;

    public ka(ta taVar) {
        this.f40865c = taVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        ta taVar = this.f40865c;
        org.telegram.ui.Components.mm0 mm0Var = taVar.f43705b;
        ArrayList arrayList = taVar.v;
        if (mm0Var != null) {
            ArrayList arrayList2 = mm0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                mm0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                taVar.f43705b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ta taVar = this.f40865c;
        long j10 = taVar.f43712x;
        int i13 = e1Var.f47738f;
        View view = e1Var.f47735a;
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
                    qaVar.a(tL_username, z10, false, taVar.f43712x);
                    return;
                }
                taVar.f43708n = true;
                na naVar = (na) view;
                taVar.f43713y = naVar;
                naVar.f41821a.setText(taVar.f43709r);
                taVar.f43708n = false;
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (j10 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            i9Var.setText(LocaleController.getString(i12));
            return;
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        if (i10 == 0) {
            if (j10 != 0) {
                i11 = R.string.BotSetPublicLinkHeader;
            } else {
                i11 = R.string.SetUsernameHeader;
            }
        } else {
            i11 = R.string.UsernamesProfileHeader;
        }
        q4Var.setText(LocaleController.getString(i11));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ta taVar = this.f40865c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.e1(new ja(this, taVar.getParentActivity(), taVar.getResourceProvider()));
                    }
                    return new s4.e1(new na(taVar, taVar.getParentActivity()));
                }
                return new s4.e1(new org.telegram.ui.Cells.i9(taVar.getParentActivity()));
            }
            sa saVar = new sa(taVar, taVar.getParentActivity());
            saVar.setTag(-33024);
            return new s4.e1(saVar);
        }
        return new s4.e1(new org.telegram.ui.Cells.q4(taVar.getParentActivity()));
    }
}
