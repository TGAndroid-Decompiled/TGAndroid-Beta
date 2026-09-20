package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class hn0 extends ul0 {
    public final in0 f24726c;

    public hn0(in0 in0Var) {
        this.f24726c = in0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42977f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        in0 in0Var = this.f24726c;
        int i11 = in0Var.v;
        if (i10 >= i11 && i10 < in0Var.f25093w) {
            return (MessageObject) in0Var.e.get(i10 - i11);
        }
        int i12 = in0Var.f25095y;
        if (i10 >= i12 && i10 < in0Var.E) {
            return (MessageObject) in0Var.f25089f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f24726c.f25091r;
    }

    @Override
    public final int j(int i10) {
        in0 in0Var = this.f24726c;
        if (i10 != in0Var.f25092s && i10 != in0Var.f25094x) {
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
        in0 in0Var = this.f24726c;
        org.telegram.ui.p10 p10Var = in0Var.J;
        int i13 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (i10 == in0Var.f25092s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (w3Var.getText().equals(string)) {
                    if (in0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = in0Var.H;
                    org.telegram.ui.Cells.v3 v3Var = w3Var.f21787b;
                    v3Var.c(string2, true, z14);
                    v3Var.setVisibility(0);
                    return;
                }
                if (in0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                w3Var.c(string, LocaleController.getString(i11), new gn0(this));
                return;
            } else if (i10 == in0Var.f25094x) {
                w3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new f80(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (in0Var.I.g() && i10 >= in0Var.v && i10 < in0Var.f25093w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                en0 en0Var = (en0) view;
                en0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                org.telegram.ui.Cells.l7 l7Var = en0Var.f23884a;
                if (l7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = l7Var.getMessage().getId();
                }
                l7Var.c(E, true);
                int id4 = l7Var.getMessage().getId();
                p10Var.f36423a = l7Var.getMessage().getDialogId();
                p10Var.f36424b = id4;
                boolean c10 = in0Var.I.c(p10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l7Var.b(c10, z12);
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
                p10Var.f36423a = k7Var.getMessage().getDialogId();
                p10Var.f36424b = id5;
                boolean c11 = in0Var.I.c(p10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.e(c11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (k7Var.f20560d0 != z10) {
                    k7Var.f20560d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        k7Var.f20561e0 = f7;
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
            frameLayout = new org.telegram.ui.Cells.w3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 2, null);
            frameLayout2.f23884a = l7Var;
            l7Var.f20623r.setVisibility(8);
            frameLayout2.addView(l7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.k7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
