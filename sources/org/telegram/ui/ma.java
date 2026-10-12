package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ma extends org.telegram.ui.Components.lm0 {
    public final va f38196c;

    public ma(va vaVar) {
        this.f38196c = vaVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        va vaVar = this.f38196c;
        org.telegram.ui.Components.mm0 mm0Var = vaVar.f40936b;
        ArrayList arrayList = vaVar.v;
        if (mm0Var != null) {
            ArrayList arrayList2 = mm0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                mm0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                vaVar.f40936b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (vaVar.v.size() > 0) {
            i10 = vaVar.v.size() + 2;
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
        va vaVar = this.f38196c;
        long j10 = vaVar.f40943x;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) vaVar.v.get(i10 - 4);
                    sa saVar = (sa) view;
                    if (tL_username.editable) {
                        vaVar.E = saVar;
                    } else if (vaVar.E == saVar) {
                        vaVar.E = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    saVar.a(tL_username, z10, false, vaVar.f40943x);
                    return;
                }
                vaVar.f40939n = true;
                pa paVar = (pa) view;
                vaVar.f40944y = paVar;
                paVar.f39166a.setText(vaVar.f40940r);
                vaVar.f40939n = false;
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (j10 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            e9Var.setText(LocaleController.getString(i12));
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == 0) {
            if (j10 != 0) {
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        va vaVar = this.f38196c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.b1(new la(this, vaVar.getParentActivity(), vaVar.getResourceProvider()));
                    }
                    return new s4.b1(new pa(vaVar, vaVar.getParentActivity()));
                }
                return new s4.b1(new org.telegram.ui.Cells.e9(vaVar.getParentActivity()));
            }
            ua uaVar = new ua(vaVar, vaVar.getParentActivity());
            uaVar.setTag(-33024);
            return new s4.b1(uaVar);
        }
        return new s4.b1(new org.telegram.ui.Cells.m4(vaVar.getParentActivity()));
    }
}
