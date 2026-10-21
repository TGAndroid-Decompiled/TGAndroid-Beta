package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class tn0 extends im0 {
    public final un0 f30627c;

    public tn0(un0 un0Var) {
        this.f30627c = un0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        un0 un0Var = this.f30627c;
        int i11 = un0Var.v;
        if (i10 >= i11 && i10 < un0Var.f30983w) {
            return (MessageObject) un0Var.e.get(i10 - i11);
        }
        int i12 = un0Var.f30985y;
        if (i10 >= i12 && i10 < un0Var.E) {
            return (MessageObject) un0Var.f30979f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f30627c.f30981r;
    }

    @Override
    public final int j(int i10) {
        un0 un0Var = this.f30627c;
        if (i10 != un0Var.f30982s && i10 != un0Var.f30984x) {
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
        un0 un0Var = this.f30627c;
        org.telegram.ui.w00 w00Var = un0Var.J;
        int i13 = b1Var.f45920f;
        View view = b1Var.f45917a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == un0Var.f30982s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (u3Var.getText().equals(string)) {
                    if (un0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = un0Var.H;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.f23591b;
                    t3Var.c(string2, true, z14);
                    t3Var.setVisibility(0);
                    return;
                }
                if (un0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                u3Var.c(string, LocaleController.getString(i11), new sn0(this));
                return;
            } else if (i10 == un0Var.f30984x) {
                u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new u80(this, 10));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (un0Var.I.g() && i10 >= un0Var.v && i10 < un0Var.f30983w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                qn0 qn0Var = (qn0) view;
                qn0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                org.telegram.ui.Cells.i7 i7Var = qn0Var.f29682a;
                if (i7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = i7Var.getMessage().getId();
                }
                i7Var.c(E, true);
                int id4 = i7Var.getMessage().getId();
                w00Var.f42425a = i7Var.getMessage().getDialogId();
                w00Var.f42426b = id4;
                boolean b10 = un0Var.I.b(w00Var);
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
                w00Var.f42425a = h7Var.getMessage().getDialogId();
                w00Var.f42426b = id5;
                boolean b11 = un0Var.I.b(w00Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (h7Var.f22375d0 != z10) {
                    h7Var.f22375d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        h7Var.f22376e0 = f7;
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
            frameLayout2.f29682a = i7Var;
            i7Var.f22434r.setVisibility(8);
            frameLayout2.addView(i7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.h7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
