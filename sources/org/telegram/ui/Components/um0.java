package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class um0 extends kl0 {
    public final vm0 f30924c;

    public um0(vm0 vm0Var) {
        this.f30924c = vm0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        vm0 vm0Var = this.f30924c;
        int i11 = vm0Var.v;
        if (i10 >= i11 && i10 < vm0Var.f31371w) {
            return (MessageObject) vm0Var.f31366e.get(i10 - i11);
        }
        int i12 = vm0Var.f31373y;
        if (i10 >= i12 && i10 < vm0Var.E) {
            return (MessageObject) vm0Var.f31367f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f30924c.f31369r;
    }

    @Override
    public final int j(int i10) {
        vm0 vm0Var = this.f30924c;
        if (i10 != vm0Var.f31370s && i10 != vm0Var.f31372x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int id2;
        boolean z11;
        int id3;
        boolean z12;
        int i11;
        int i12;
        vm0 vm0Var = this.f30924c;
        org.telegram.ui.p10 p10Var = vm0Var.J;
        int i13 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == vm0Var.f31370s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (u3Var.getText().equals(string)) {
                    if (vm0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = vm0Var.H;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.f23317b;
                    t3Var.c(string2, true, z14);
                    t3Var.setVisibility(0);
                    return;
                }
                if (vm0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                u3Var.c(string, LocaleController.getString(i11), new tm0(this));
                return;
            } else if (i10 == vm0Var.f31372x) {
                u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new x70(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (vm0Var.I.g() && i10 >= vm0Var.v && i10 < vm0Var.f31371w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                rm0 rm0Var = (rm0) view;
                rm0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
                org.telegram.ui.Cells.j7 j7Var = rm0Var.f30052a;
                if (j7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = j7Var.getMessage().getId();
                }
                j7Var.c(E, true);
                int id4 = j7Var.getMessage().getId();
                p10Var.f39381a = j7Var.getMessage().getDialogId();
                p10Var.f39382b = id4;
                boolean b10 = vm0Var.I.b(p10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j7Var.b(b10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (j7Var.O != z10) {
                    j7Var.O = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        j7Var.P = f7;
                    }
                    j7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                if (i7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = i7Var.getMessage().getId();
                }
                i7Var.f(E, true);
                int id5 = i7Var.getMessage().getId();
                p10Var.f39381a = i7Var.getMessage().getDialogId();
                p10Var.f39382b = id5;
                boolean b11 = vm0Var.I.b(p10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (i7Var.f22110d0 != z10) {
                    i7Var.f22110d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        i7Var.f22112e0 = f7;
                    }
                    i7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 2, null);
            frameLayout2.f30052a = j7Var;
            j7Var.f22189r.setVisibility(8);
            frameLayout2.addView(j7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.i7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
