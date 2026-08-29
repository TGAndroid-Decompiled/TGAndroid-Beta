package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ca extends org.telegram.ui.Components.il0 {
    public final la f37059c;

    public ca(la laVar) {
        this.f37059c = laVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        la laVar = this.f37059c;
        org.telegram.ui.Components.jl0 jl0Var = laVar.f40140b;
        ArrayList arrayList = laVar.v;
        if (jl0Var != null) {
            ArrayList arrayList2 = jl0Var.G2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                jl0Var.G2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                laVar.f40140b.G2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (laVar.v.size() > 0) {
            i10 = laVar.v.size() + 2;
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        la laVar = this.f37059c;
        long j10 = laVar.f40148x;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) laVar.v.get(i10 - 4);
                    ia iaVar = (ia) view;
                    if (tL_username.editable) {
                        laVar.A = iaVar;
                    } else if (laVar.A == iaVar) {
                        laVar.A = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    iaVar.a(tL_username, z10, false, laVar.f40148x);
                    return;
                }
                laVar.f40144n = true;
                fa faVar = (fa) view;
                laVar.f40149y = faVar;
                faVar.f38082a.setText(laVar.f40145r);
                laVar.f40144n = false;
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (j10 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            y8Var.setText(LocaleController.getString(i12));
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (i10 == 0) {
            if (j10 != 0) {
                i11 = R.string.BotSetPublicLinkHeader;
            } else {
                i11 = R.string.SetUsernameHeader;
            }
        } else {
            i11 = R.string.UsernamesProfileHeader;
        }
        k4Var.setText(LocaleController.getString(i11));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        la laVar = this.f37059c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new f2.n1(new ba(this, laVar.getParentActivity(), laVar.getResourceProvider()));
                    }
                    return new f2.n1(new fa(laVar, laVar.getParentActivity()));
                }
                return new f2.n1(new org.telegram.ui.Cells.y8(laVar.getParentActivity()));
            }
            ka kaVar = new ka(laVar, laVar.getParentActivity());
            kaVar.setTag(-33024);
            return new f2.n1(kaVar);
        }
        return new f2.n1(new org.telegram.ui.Cells.k4(laVar.getParentActivity()));
    }
}
