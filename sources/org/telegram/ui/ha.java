package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ha extends org.telegram.ui.Components.kl0 {
    public final qa f36966c;

    public ha(qa qaVar) {
        this.f36966c = qaVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        qa qaVar = this.f36966c;
        org.telegram.ui.Components.ll0 ll0Var = qaVar.f39827b;
        ArrayList arrayList = qaVar.v;
        if (ll0Var != null) {
            ArrayList arrayList2 = ll0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                ll0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                qaVar.f39827b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (qaVar.v.size() > 0) {
            i10 = qaVar.v.size() + 2;
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
        qa qaVar = this.f36966c;
        long j3 = qaVar.f39835x;
        int i13 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) qaVar.v.get(i10 - 4);
                    na naVar = (na) view;
                    if (tL_username.editable) {
                        qaVar.E = naVar;
                    } else if (qaVar.E == naVar) {
                        qaVar.E = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    naVar.a(tL_username, z10, false, qaVar.f39835x);
                    return;
                }
                qaVar.f39831n = true;
                ka kaVar = (ka) view;
                qaVar.f39836y = kaVar;
                kaVar.f38008a.setText(qaVar.f39832r);
                qaVar.f39831n = false;
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
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == 0) {
            if (j3 != 0) {
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qa qaVar = this.f36966c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.c1(new ga(this, qaVar.getParentActivity(), qaVar.getResourceProvider()));
                    }
                    return new s4.c1(new ka(qaVar, qaVar.getParentActivity()));
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(qaVar.getParentActivity()));
            }
            pa paVar = new pa(qaVar, qaVar.getParentActivity());
            paVar.setTag(-33024);
            return new s4.c1(paVar);
        }
        return new s4.c1(new org.telegram.ui.Cells.l4(qaVar.getParentActivity()));
    }
}
