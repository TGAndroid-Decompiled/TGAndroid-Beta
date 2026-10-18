package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class la extends org.telegram.ui.Components.hm0 {
    public final ua f38830c;

    public la(ua uaVar) {
        this.f38830c = uaVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45961f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10;
        ua uaVar = this.f38830c;
        org.telegram.ui.Components.im0 im0Var = uaVar.f41947b;
        ArrayList arrayList = uaVar.v;
        if (im0Var != null) {
            ArrayList arrayList2 = im0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                im0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                uaVar.f41947b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ua uaVar = this.f38830c;
        long j10 = uaVar.f41954x;
        int i13 = b1Var.f45961f;
        View view = b1Var.f45958a;
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
                    raVar.a(tL_username, z10, false, uaVar.f41954x);
                    return;
                }
                uaVar.f41950n = true;
                oa oaVar = (oa) view;
                uaVar.f41955y = oaVar;
                oaVar.f39717a.setText(uaVar.f41951r);
                uaVar.f41950n = false;
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
        ua uaVar = this.f38830c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.b1(new ka(this, uaVar.getParentActivity(), uaVar.getResourceProvider()));
                    }
                    return new s4.b1(new oa(uaVar, uaVar.getParentActivity()));
                }
                return new s4.b1(new org.telegram.ui.Cells.d9(uaVar.getParentActivity()));
            }
            ta taVar = new ta(uaVar, uaVar.getParentActivity());
            taVar.setTag(-33024);
            return new s4.b1(taVar);
        }
        return new s4.b1(new org.telegram.ui.Cells.l4(uaVar.getParentActivity()));
    }
}
