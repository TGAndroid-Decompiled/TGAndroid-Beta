package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class co0 extends mm0 {
    public final do0 f27219c;

    public co0(do0 do0Var) {
        this.f27219c = do0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        do0 do0Var = this.f27219c;
        int i11 = do0Var.v;
        if (i10 >= i11 && i10 < do0Var.f27507w) {
            return (MessageObject) do0Var.e.get(i10 - i11);
        }
        int i12 = do0Var.f27509y;
        if (i10 >= i12 && i10 < do0Var.E) {
            return (MessageObject) do0Var.f27503f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f27219c.f27505r;
    }

    @Override
    public final int j(int i10) {
        do0 do0Var = this.f27219c;
        if (i10 != do0Var.f27506s && i10 != do0Var.f27508x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int id2;
        boolean z11;
        int id3;
        boolean z12;
        int i11;
        int i12;
        do0 do0Var = this.f27219c;
        org.telegram.ui.b10 b10Var = do0Var.J;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == do0Var.f27506s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (z3Var.getText().equals(string)) {
                    if (do0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = do0Var.H;
                    org.telegram.ui.Cells.y3 y3Var = z3Var.f25784b;
                    y3Var.c(string2, true, z14);
                    y3Var.setVisibility(0);
                    return;
                }
                if (do0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                z3Var.b(string, LocaleController.getString(i11), new bo0(this));
                return;
            } else if (i10 == do0Var.f27508x) {
                z3Var.b(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new x80(this, 9));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (do0Var.I.g() && i10 >= do0Var.v && i10 < do0Var.f27507w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                zn0 zn0Var = (zn0) view;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, zn0Var, null);
                org.telegram.ui.Cells.o7 o7Var = zn0Var.f35404a;
                if (o7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = o7Var.getMessage().getId();
                }
                o7Var.c(E, true);
                int id4 = o7Var.getMessage().getId();
                b10Var.f37862a = o7Var.getMessage().getDialogId();
                b10Var.f37863b = id4;
                boolean c10 = do0Var.I.c(b10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o7Var.b(c10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (o7Var.O != z10) {
                    o7Var.O = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        o7Var.P = f7;
                    }
                    o7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                if (n7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = n7Var.getMessage().getId();
                }
                n7Var.f(E, true);
                int id5 = n7Var.getMessage().getId();
                b10Var.f37862a = n7Var.getMessage().getDialogId();
                b10Var.f37863b = id5;
                boolean c11 = do0Var.I.c(b10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n7Var.e(c11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (n7Var.f24551d0 != z10) {
                    n7Var.f24551d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        n7Var.f24552e0 = f7;
                    }
                    n7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 2, null);
            frameLayout2.f35404a = o7Var;
            o7Var.f24616r.setVisibility(8);
            frameLayout2.addView(o7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.n7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}
