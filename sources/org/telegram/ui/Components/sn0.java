package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class sn0 extends hm0 {
    public final tn0 f30306c;

    public sn0(tn0 tn0Var) {
        this.f30306c = tn0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        tn0 tn0Var = this.f30306c;
        int i11 = tn0Var.v;
        if (i10 >= i11 && i10 < tn0Var.f30682w) {
            return (MessageObject) tn0Var.e.get(i10 - i11);
        }
        int i12 = tn0Var.f30684y;
        if (i10 >= i12 && i10 < tn0Var.E) {
            return (MessageObject) tn0Var.f30678f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f30306c.f30680r;
    }

    @Override
    public final int j(int i10) {
        tn0 tn0Var = this.f30306c;
        if (i10 != tn0Var.f30681s && i10 != tn0Var.f30683x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int id2;
        boolean z11;
        int id3;
        boolean z12;
        int i11;
        int i12;
        tn0 tn0Var = this.f30306c;
        org.telegram.ui.y00 y00Var = tn0Var.J;
        int i13 = b1Var.f45961f;
        View view = b1Var.f45958a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == tn0Var.f30681s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (u3Var.getText().equals(string)) {
                    if (tn0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = tn0Var.H;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.f23594b;
                    t3Var.c(string2, true, z14);
                    t3Var.setVisibility(0);
                    return;
                }
                if (tn0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                u3Var.c(string, LocaleController.getString(i11), new rn0(this));
                return;
            } else if (i10 == tn0Var.f30683x) {
                u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new u80(this, 10));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (tn0Var.I.g() && i10 >= tn0Var.v && i10 < tn0Var.f30682w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                pn0 pn0Var = (pn0) view;
                pn0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                org.telegram.ui.Cells.i7 i7Var = pn0Var.f29393a;
                if (i7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = i7Var.getMessage().getId();
                }
                i7Var.c(E, true);
                int id4 = i7Var.getMessage().getId();
                y00Var.f43325a = i7Var.getMessage().getDialogId();
                y00Var.f43326b = id4;
                boolean b10 = tn0Var.I.b(y00Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7Var.b(b10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (i7Var.O != z10) {
                    i7Var.O = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        i7Var.P = f7;
                    }
                    i7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                if (h7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = h7Var.getMessage().getId();
                }
                h7Var.f(E, true);
                int id5 = h7Var.getMessage().getId();
                y00Var.f43325a = h7Var.getMessage().getDialogId();
                y00Var.f43326b = id5;
                boolean b11 = tn0Var.I.b(y00Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (h7Var.f22378d0 != z10) {
                    h7Var.f22378d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        h7Var.f22379e0 = f7;
                    }
                    h7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            frameLayout2.f29393a = i7Var;
            i7Var.f22437r.setVisibility(8);
            frameLayout2.addView(i7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.h7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
