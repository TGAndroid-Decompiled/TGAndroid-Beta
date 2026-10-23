package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ja extends org.telegram.ui.Components.im0 {
    public final sa f38224c;

    public ja(sa saVar) {
        this.f38224c = saVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        sa saVar = this.f38224c;
        org.telegram.ui.Components.jm0 jm0Var = saVar.f41416b;
        ArrayList arrayList = saVar.v;
        if (jm0Var != null) {
            ArrayList arrayList2 = jm0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                jm0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                saVar.f41416b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        sa saVar = this.f38224c;
        long j10 = saVar.f41423x;
        int i13 = b1Var.f45924f;
        View view = b1Var.f45921a;
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
                    paVar.a(tL_username, z10, false, saVar.f41423x);
                    return;
                }
                saVar.f41419n = true;
                ma maVar = (ma) view;
                saVar.f41424y = maVar;
                maVar.f39168a.setText(saVar.f41420r);
                saVar.f41419n = false;
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (j10 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            d9Var.setText(LocaleController.getString(i12));
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        sa saVar = this.f38224c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.b1(new ia(this, saVar.getParentActivity(), saVar.getResourceProvider()));
                    }
                    return new s4.b1(new ma(saVar, saVar.getParentActivity()));
                }
                return new s4.b1(new org.telegram.ui.Cells.d9(saVar.getParentActivity()));
            }
            ra raVar = new ra(saVar, saVar.getParentActivity());
            raVar.setTag(-33024);
            return new s4.b1(raVar);
        }
        return new s4.b1(new org.telegram.ui.Cells.l4(saVar.getParentActivity()));
    }
}
