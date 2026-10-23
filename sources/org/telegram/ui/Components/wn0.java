package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class wn0 extends lm0 {
    public final xn0 f32277c;

    public wn0(xn0 xn0Var) {
        this.f32277c = xn0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        xn0 xn0Var = this.f32277c;
        int i11 = xn0Var.v;
        if (i10 >= i11 && i10 < xn0Var.f32613w) {
            return (MessageObject) xn0Var.e.get(i10 - i11);
        }
        int i12 = xn0Var.f32615y;
        if (i10 >= i12 && i10 < xn0Var.E) {
            return (MessageObject) xn0Var.f32609f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f32277c.f32611r;
    }

    @Override
    public final int j(int i10) {
        xn0 xn0Var = this.f32277c;
        if (i10 != xn0Var.f32612s && i10 != xn0Var.f32614x) {
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
        xn0 xn0Var = this.f32277c;
        org.telegram.ui.a10 a10Var = xn0Var.J;
        int i13 = b1Var.f46346f;
        View view = b1Var.f46343a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == xn0Var.f32612s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (u3Var.getText().equals(string)) {
                    if (xn0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = xn0Var.H;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.f23728b;
                    t3Var.c(string2, true, z14);
                    t3Var.setVisibility(0);
                    return;
                }
                if (xn0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                u3Var.b(string, LocaleController.getString(i11), new vn0(this));
                return;
            } else if (i10 == xn0Var.f32614x) {
                u3Var.b(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new v80(this, 10));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (xn0Var.I.g() && i10 >= xn0Var.v && i10 < xn0Var.f32613w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                tn0 tn0Var = (tn0) view;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, tn0Var, null);
                org.telegram.ui.Cells.k7 k7Var = tn0Var.f30872a;
                if (k7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = k7Var.getMessage().getId();
                }
                k7Var.c(E, true);
                int id4 = k7Var.getMessage().getId();
                a10Var.f35546a = k7Var.getMessage().getDialogId();
                a10Var.f35547b = id4;
                boolean b10 = xn0Var.I.b(a10Var);
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
                a10Var.f35546a = j7Var.getMessage().getDialogId();
                a10Var.f35547b = id5;
                boolean b11 = xn0Var.I.b(a10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (j7Var.f22597d0 != z10) {
                    j7Var.f22597d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        j7Var.f22598e0 = f7;
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
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 2, null);
            frameLayout2.f30872a = k7Var;
            k7Var.f22643r.setVisibility(8);
            frameLayout2.addView(k7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.j7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
