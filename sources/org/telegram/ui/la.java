package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class la extends org.telegram.ui.Components.vm0 {
    public final ua f39672c;

    public la(ua uaVar) {
        this.f39672c = uaVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        ua uaVar = this.f39672c;
        org.telegram.ui.Components.wm0 wm0Var = uaVar.f42433b;
        ArrayList arrayList = uaVar.v;
        if (wm0Var != null) {
            ArrayList arrayList2 = wm0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                wm0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                uaVar.f42433b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        if (uaVar.v.size() > 0) {
            i10 = uaVar.v.size() + 2;
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ua uaVar = this.f39672c;
        long j3 = uaVar.f42441x;
        int i13 = d1Var.f47901f;
        View view = d1Var.f47897a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) uaVar.v.get(i10 - 4);
                    ra raVar = (ra) view;
                    if (tL_username.editable) {
                        uaVar.E = raVar;
                    } else if (uaVar.E == raVar) {
                        uaVar.E = null;
                    }
                    if (i10 < h() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    raVar.a(tL_username, z10, false, uaVar.f42441x);
                    return;
                }
                uaVar.f42437n = true;
                oa oaVar = (oa) view;
                uaVar.f42442y = oaVar;
                oaVar.f40610a.setText(uaVar.f42438r);
                uaVar.f42437n = false;
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ua uaVar = this.f39672c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.d1(new ka(this, uaVar.getParentActivity(), uaVar.getResourceProvider()));
                    }
                    return new s4.d1(new oa(uaVar, uaVar.getParentActivity()));
                }
                return new s4.d1(new org.telegram.ui.Cells.e9(uaVar.getParentActivity()));
            }
            ta taVar = new ta(uaVar, uaVar.getParentActivity());
            taVar.setTag(-33024);
            return new s4.d1(taVar);
        }
        return new s4.d1(new org.telegram.ui.Cells.m4(uaVar.getParentActivity()));
    }
}
