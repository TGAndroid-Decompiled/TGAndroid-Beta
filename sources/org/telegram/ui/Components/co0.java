package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class co0 extends rm0 {
    public final do0 f25252c;

    public co0(do0 do0Var) {
        this.f25252c = do0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        do0 do0Var = this.f25252c;
        int i11 = do0Var.v;
        if (i10 >= i11 && i10 < do0Var.f25651w) {
            return (MessageObject) do0Var.f25646e.get(i10 - i11);
        }
        int i12 = do0Var.f25653y;
        if (i10 >= i12 && i10 < do0Var.E) {
            return (MessageObject) do0Var.f25647f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f25252c.f25649r;
    }

    @Override
    public final int j(int i10) {
        do0 do0Var = this.f25252c;
        if (i10 != do0Var.f25650s && i10 != do0Var.f25652x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        int id2;
        boolean z11;
        int id3;
        boolean z12;
        int i11;
        int i12;
        do0 do0Var = this.f25252c;
        org.telegram.ui.n10 n10Var = do0Var.J;
        int i13 = d1Var.f47752f;
        View view = d1Var.f47748a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == do0Var.f25650s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (v3Var.getText().equals(string)) {
                    if (do0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = do0Var.H;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.f23529b;
                    u3Var.c(string2, true, z14);
                    u3Var.setVisibility(0);
                    return;
                }
                if (do0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                v3Var.c(string, LocaleController.getString(i11), new bo0(this));
                return;
            } else if (i10 == do0Var.f25652x) {
                v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new c90(this, 10));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (do0Var.I.g() && i10 >= do0Var.v && i10 < do0Var.f25651w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                zn0 zn0Var = (zn0) view;
                zn0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
                org.telegram.ui.Cells.k7 k7Var = zn0Var.f33617a;
                if (k7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = k7Var.getMessage().getId();
                }
                k7Var.c(E, true);
                int id4 = k7Var.getMessage().getId();
                n10Var.f40110a = k7Var.getMessage().getDialogId();
                n10Var.f40111b = id4;
                boolean c10 = do0Var.I.c(n10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k7Var.b(c10, z12);
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
                n10Var.f40110a = j7Var.getMessage().getDialogId();
                n10Var.f40111b = id5;
                boolean c11 = do0Var.I.c(n10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.e(c11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (j7Var.f22325d0 != z10) {
                    j7Var.f22325d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        j7Var.f22327e0 = f7;
                    }
                    j7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 2, null);
            frameLayout2.f33617a = k7Var;
            k7Var.f22391r.setVisibility(8);
            frameLayout2.addView(k7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.j7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(frameLayout);
    }
}
