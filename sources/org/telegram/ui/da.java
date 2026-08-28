package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class da extends org.telegram.ui.Components.vk0 {
    public final ma f37485c;

    public da(ma maVar) {
        this.f37485c = maVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i9;
        ma maVar = this.f37485c;
        org.telegram.ui.Components.wk0 wk0Var = maVar.f40362b;
        ArrayList arrayList = maVar.v;
        if (wk0Var != null) {
            ArrayList arrayList2 = wk0Var.G2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                wk0Var.G2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                maVar.f40362b.G2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (maVar.v.size() > 0) {
            i9 = maVar.v.size() + 2;
        } else {
            i9 = 0;
        }
        return i9 + 3;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 3) {
            return 0;
        }
        if (i9 == h() - 1) {
            return 2;
        }
        return 4;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        boolean z10;
        ma maVar = this.f37485c;
        long j10 = maVar.f40370x;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) maVar.v.get(i9 - 4);
                    ja jaVar = (ja) view;
                    if (tL_username.editable) {
                        maVar.A = jaVar;
                    } else if (maVar.A == jaVar) {
                        maVar.A = null;
                    }
                    if (i9 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jaVar.a(tL_username, z10, false, maVar.f40370x);
                    return;
                }
                maVar.f40366n = true;
                ga gaVar = (ga) view;
                maVar.f40371y = gaVar;
                gaVar.f38487a.setText(maVar.f40367r);
                maVar.f40366n = false;
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (j10 != 0) {
                i11 = R.string.BotUsernamesHelp;
            } else {
                i11 = R.string.UsernamesProfileHelp;
            }
            b9Var.setText(LocaleController.getString(i11));
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i9 == 0) {
            if (j10 != 0) {
                i10 = R.string.BotSetPublicLinkHeader;
            } else {
                i10 = R.string.SetUsernameHeader;
            }
        } else {
            i10 = R.string.UsernamesProfileHeader;
        }
        m4Var.setText(LocaleController.getString(i10));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ma maVar = this.f37485c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            return null;
                        }
                        return new f2.q1(new ca(this, maVar.getParentActivity(), maVar.getResourceProvider()));
                    }
                    return new f2.q1(new ga(maVar, maVar.getParentActivity()));
                }
                return new f2.q1(new org.telegram.ui.Cells.b9(maVar.getParentActivity()));
            }
            la laVar = new la(maVar, maVar.getParentActivity());
            laVar.setTag(-33024);
            return new f2.q1(laVar);
        }
        return new f2.q1(new org.telegram.ui.Cells.m4(maVar.getParentActivity()));
    }
}
