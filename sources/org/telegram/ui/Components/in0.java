package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class in0 extends vl0 {
    public final jn0 f25020c;

    public in0(jn0 jn0Var) {
        this.f25020c = jn0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        jn0 jn0Var = this.f25020c;
        int i11 = jn0Var.v;
        if (i10 >= i11 && i10 < jn0Var.f25386w) {
            return (MessageObject) jn0Var.e.get(i10 - i11);
        }
        int i12 = jn0Var.f25388y;
        if (i10 >= i12 && i10 < jn0Var.E) {
            return (MessageObject) jn0Var.f25382f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f25020c.f25384r;
    }

    @Override
    public final int j(int i10) {
        jn0 jn0Var = this.f25020c;
        if (i10 != jn0Var.f25385s && i10 != jn0Var.f25387x) {
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
        jn0 jn0Var = this.f25020c;
        org.telegram.ui.p10 p10Var = jn0Var.J;
        int i13 = c1Var.f42932f;
        View view = c1Var.f42929a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == jn0Var.f25385s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (v3Var.getText().equals(string)) {
                    if (jn0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = jn0Var.H;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.f21644b;
                    u3Var.c(string2, true, z14);
                    u3Var.setVisibility(0);
                    return;
                }
                if (jn0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                v3Var.c(string, LocaleController.getString(i11), new hn0(this));
                return;
            } else if (i10 == jn0Var.f25387x) {
                v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new g80(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (jn0Var.I.g() && i10 >= jn0Var.v && i10 < jn0Var.f25386w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                fn0 fn0Var = (fn0) view;
                fn0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                org.telegram.ui.Cells.k7 k7Var = fn0Var.f24191a;
                if (k7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = k7Var.getMessage().getId();
                }
                k7Var.c(E, true);
                int id4 = k7Var.getMessage().getId();
                p10Var.f36295a = k7Var.getMessage().getDialogId();
                p10Var.f36296b = id4;
                boolean c10 = jn0Var.I.c(p10Var);
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
                p10Var.f36295a = j7Var.getMessage().getDialogId();
                p10Var.f36296b = id5;
                boolean c11 = jn0Var.I.c(p10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.e(c11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (j7Var.f20488d0 != z10) {
                    j7Var.f20488d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        j7Var.f20489e0 = f7;
                    }
                    j7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 2, null);
            frameLayout2.f24191a = k7Var;
            k7Var.f20552r.setVisibility(8);
            frameLayout2.addView(k7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.j7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
