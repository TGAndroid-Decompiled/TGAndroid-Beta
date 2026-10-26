package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class bo0 extends lm0 {
    public final co0 f26923c;

    public bo0(co0 co0Var) {
        this.f26923c = co0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        co0 co0Var = this.f26923c;
        int i11 = co0Var.v;
        if (i10 >= i11 && i10 < co0Var.f27224w) {
            return (MessageObject) co0Var.e.get(i10 - i11);
        }
        int i12 = co0Var.f27226y;
        if (i10 >= i12 && i10 < co0Var.E) {
            return (MessageObject) co0Var.f27220f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f26923c.f27222r;
    }

    @Override
    public final int j(int i10) {
        co0 co0Var = this.f26923c;
        if (i10 != co0Var.f27223s && i10 != co0Var.f27225x) {
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
        co0 co0Var = this.f26923c;
        org.telegram.ui.z00 z00Var = co0Var.J;
        int i13 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == co0Var.f27223s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (z3Var.getText().equals(string)) {
                    if (co0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = co0Var.H;
                    org.telegram.ui.Cells.y3 y3Var = z3Var.f25782b;
                    y3Var.c(string2, true, z14);
                    y3Var.setVisibility(0);
                    return;
                }
                if (co0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                z3Var.b(string, LocaleController.getString(i11), new ao0(this));
                return;
            } else if (i10 == co0Var.f27225x) {
                z3Var.b(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new w80(this, 9));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (co0Var.I.g() && i10 >= co0Var.v && i10 < co0Var.f27224w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                yn0 yn0Var = (yn0) view;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, yn0Var, null);
                org.telegram.ui.Cells.o7 o7Var = yn0Var.f35084a;
                if (o7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = o7Var.getMessage().getId();
                }
                o7Var.c(E, true);
                int id4 = o7Var.getMessage().getId();
                z00Var.f46148a = o7Var.getMessage().getDialogId();
                z00Var.f46149b = id4;
                boolean c10 = co0Var.I.c(z00Var);
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
                z00Var.f46148a = n7Var.getMessage().getDialogId();
                z00Var.f46149b = id5;
                boolean c11 = co0Var.I.c(z00Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n7Var.e(c11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (n7Var.f24549d0 != z10) {
                    n7Var.f24549d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        n7Var.f24550e0 = f7;
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
            frameLayout2.f35084a = o7Var;
            o7Var.f24614r.setVisibility(8);
            frameLayout2.addView(o7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.n7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}
