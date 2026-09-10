package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class en0 extends ul0 {
    public final fn0 f22732c;

    public en0(fn0 fn0Var) {
        this.f22732c = fn0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        fn0 fn0Var = this.f22732c;
        int i11 = fn0Var.v;
        if (i10 >= i11 && i10 < fn0Var.f23046w) {
            return (MessageObject) fn0Var.e.get(i10 - i11);
        }
        int i12 = fn0Var.f23048y;
        if (i10 >= i12 && i10 < fn0Var.E) {
            return (MessageObject) fn0Var.f23042f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f22732c.f23044r;
    }

    @Override
    public final int j(int i10) {
        fn0 fn0Var = this.f22732c;
        if (i10 != fn0Var.f23045s && i10 != fn0Var.f23047x) {
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
        fn0 fn0Var = this.f22732c;
        org.telegram.ui.r10 r10Var = fn0Var.J;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == fn0Var.f23045s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (u3Var.getText().equals(string)) {
                    if (fn0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = fn0Var.H;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.f20476b;
                    t3Var.c(string2, true, z14);
                    t3Var.setVisibility(0);
                    return;
                }
                if (fn0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                u3Var.c(string, LocaleController.getString(i11), new dn0(this));
                return;
            } else if (i10 == fn0Var.f23047x) {
                u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new g80(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (fn0Var.I.f() && i10 >= fn0Var.v && i10 < fn0Var.f23046w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                bn0 bn0Var = (bn0) view;
                bn0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                org.telegram.ui.Cells.l7 l7Var = bn0Var.f21863a;
                if (l7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = l7Var.getMessage().getId();
                }
                l7Var.c(E, true);
                int id4 = l7Var.getMessage().getId();
                r10Var.f36168a = l7Var.getMessage().getDialogId();
                r10Var.f36169b = id4;
                boolean b10 = fn0Var.I.b(r10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l7Var.b(b10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (l7Var.O != z10) {
                    l7Var.O = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        l7Var.P = f7;
                    }
                    l7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                if (k7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = k7Var.getMessage().getId();
                }
                k7Var.f(E, true);
                int id5 = k7Var.getMessage().getId();
                r10Var.f36168a = k7Var.getMessage().getDialogId();
                r10Var.f36169b = id5;
                boolean b11 = fn0Var.I.b(r10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (k7Var.f19433d0 != z10) {
                    k7Var.f19433d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        k7Var.f19434e0 = f7;
                    }
                    k7Var.invalidate();
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
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 2, null);
            frameLayout2.f21863a = l7Var;
            l7Var.f19493r.setVisibility(8);
            frameLayout2.addView(l7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.k7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
