package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ga extends org.telegram.ui.Components.rl0 {
    public final pa f37045c;

    public ga(pa paVar) {
        this.f37045c = paVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        pa paVar = this.f37045c;
        org.telegram.ui.Components.sl0 sl0Var = paVar.f39952b;
        ArrayList arrayList = paVar.v;
        if (sl0Var != null) {
            ArrayList arrayList2 = sl0Var.H2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                sl0Var.H2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                paVar.f39952b.H2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (paVar.v.size() > 0) {
            i10 = paVar.v.size() + 2;
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        boolean z4;
        pa paVar = this.f37045c;
        long j10 = paVar.f39960x;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) paVar.v.get(i10 - 4);
                    ma maVar = (ma) view;
                    if (tL_username.editable) {
                        paVar.B = maVar;
                    } else if (paVar.B == maVar) {
                        paVar.B = null;
                    }
                    if (i10 < h() - 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    maVar.a(tL_username, z4, false, paVar.f39960x);
                    return;
                }
                paVar.f39956n = true;
                ja jaVar = (ja) view;
                paVar.f39961y = jaVar;
                jaVar.f37889a.setText(paVar.f39957r);
                paVar.f39956n = false;
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (j10 != 0) {
                i12 = R.string.BotUsernamesHelp;
            } else {
                i12 = R.string.UsernamesProfileHelp;
            }
            a9Var.setText(LocaleController.getString(i12));
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
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        pa paVar = this.f37045c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new f2.m1(new fa(this, paVar.getParentActivity(), paVar.getResourceProvider()));
                    }
                    return new f2.m1(new ja(paVar, paVar.getParentActivity()));
                }
                return new f2.m1(new org.telegram.ui.Cells.a9(paVar.getParentActivity()));
            }
            oa oaVar = new oa(paVar, paVar.getParentActivity());
            oaVar.setTag(-33024);
            return new f2.m1(oaVar);
        }
        return new f2.m1(new org.telegram.ui.Cells.m4(paVar.getParentActivity()));
    }
}
