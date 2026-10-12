package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class xn0 extends lm0 {
    public final yn0 f31288c;

    public xn0(yn0 yn0Var) {
        this.f31288c = yn0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        yn0 yn0Var = this.f31288c;
        int i11 = yn0Var.v;
        if (i10 >= i11 && i10 < yn0Var.f31660w) {
            return (MessageObject) yn0Var.e.get(i10 - i11);
        }
        int i12 = yn0Var.f31662y;
        if (i10 >= i12 && i10 < yn0Var.E) {
            return (MessageObject) yn0Var.f31656f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f31288c.f31658r;
    }

    @Override
    public final int j(int i10) {
        yn0 yn0Var = this.f31288c;
        if (i10 != yn0Var.f31659s && i10 != yn0Var.f31661x) {
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
        yn0 yn0Var = this.f31288c;
        org.telegram.ui.u10 u10Var = yn0Var.J;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == yn0Var.f31659s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (v3Var.getText().equals(string)) {
                    if (yn0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = yn0Var.H;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.f22562b;
                    u3Var.c(string2, true, z14);
                    u3Var.setVisibility(0);
                    return;
                }
                if (yn0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                v3Var.c(string, LocaleController.getString(i11), new wn0(this));
                return;
            } else if (i10 == yn0Var.f31661x) {
                v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new z80(this, 10));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (yn0Var.I.g() && i10 >= yn0Var.v && i10 < yn0Var.f31660w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                un0 un0Var = (un0) view;
                un0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                org.telegram.ui.Cells.k7 k7Var = un0Var.f29739a;
                if (k7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = k7Var.getMessage().getId();
                }
                k7Var.c(E, true);
                int id4 = k7Var.getMessage().getId();
                u10Var.f40516a = k7Var.getMessage().getDialogId();
                u10Var.f40517b = id4;
                boolean b10 = yn0Var.I.b(u10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k7Var.b(b10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (k7Var.O != z10) {
                    k7Var.O = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        k7Var.P = f7;
                    }
                    k7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                if (j7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = j7Var.getMessage().getId();
                }
                j7Var.f(E, true);
                int id5 = j7Var.getMessage().getId();
                u10Var.f40516a = j7Var.getMessage().getDialogId();
                u10Var.f40517b = id5;
                boolean b11 = yn0Var.I.b(u10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (j7Var.f21401d0 != z10) {
                    j7Var.f21401d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        j7Var.f21402e0 = f7;
                    }
                    j7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 2, null);
            frameLayout2.f29739a = k7Var;
            k7Var.f21461r.setVisibility(8);
            frameLayout2.addView(k7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.j7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
