package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class bn0 extends ql0 {
    public final cn0 f23724c;

    public bn0(cn0 cn0Var) {
        this.f23724c = cn0Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        cn0 cn0Var = this.f23724c;
        int i11 = cn0Var.v;
        if (i10 >= i11 && i10 < cn0Var.f23980w) {
            return (MessageObject) cn0Var.e.get(i10 - i11);
        }
        int i12 = cn0Var.f23982y;
        if (i10 >= i12 && i10 < cn0Var.B) {
            return (MessageObject) cn0Var.f23976f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f23724c.f23978r;
    }

    @Override
    public final int j(int i10) {
        cn0 cn0Var = this.f23724c;
        if (i10 != cn0Var.f23979s && i10 != cn0Var.f23981x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        int id2;
        boolean z10;
        int id3;
        boolean z11;
        int i11;
        int i12;
        cn0 cn0Var = this.f23724c;
        org.telegram.ui.m10 m10Var = cn0Var.G;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z12 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (i10 == cn0Var.f23979s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (t3Var.getText().equals(string)) {
                    if (cn0Var.E) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z13 = cn0Var.E;
                    org.telegram.ui.Cells.s3 s3Var = t3Var.f22321b;
                    s3Var.c(string2, true, z13);
                    s3Var.setVisibility(0);
                    return;
                }
                if (cn0Var.E) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                t3Var.c(string, LocaleController.getString(i11), new an0(this));
                return;
            } else if (i10 == cn0Var.f23981x) {
                t3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new a80(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (cn0Var.F.f() && i10 >= cn0Var.v && i10 < cn0Var.f23980w) {
                z4 = true;
            } else {
                z4 = false;
            }
            float f10 = 0.0f;
            if (i13 == 1) {
                ym0 ym0Var = (ym0) view;
                ym0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                org.telegram.ui.Cells.h7 h7Var = ym0Var.f31054a;
                if (h7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = h7Var.getMessage().getId();
                }
                h7Var.c(E, true);
                int id4 = h7Var.getMessage().getId();
                m10Var.f35953a = h7Var.getMessage().getDialogId();
                m10Var.f35954b = id4;
                boolean b10 = cn0Var.F.b(m10Var);
                if (id3 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.b(b10, z11);
                if (id3 == E.getId()) {
                    z12 = true;
                }
                if (h7Var.L != z4) {
                    h7Var.L = z4;
                    if (!z12) {
                        if (z4) {
                            f10 = 1.0f;
                        }
                        h7Var.M = f10;
                    }
                    h7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                if (g7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = g7Var.getMessage().getId();
                }
                g7Var.f(E, true);
                int id5 = g7Var.getMessage().getId();
                m10Var.f35953a = g7Var.getMessage().getDialogId();
                m10Var.f35954b = id5;
                boolean b11 = cn0Var.F.b(m10Var);
                if (id2 == E.getId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.e(b11, z10);
                if (id2 == E.getId()) {
                    z12 = true;
                }
                if (g7Var.f21094a0 != z4) {
                    g7Var.f21094a0 = z4;
                    if (!z12) {
                        if (z4) {
                            f10 = 1.0f;
                        }
                        g7Var.f21096b0 = f10;
                    }
                    g7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.t3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(context, 2, null);
            frameLayout2.f31054a = h7Var;
            h7Var.f21153r.setVisibility(8);
            frameLayout2.addView(h7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.g7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(frameLayout);
    }
}
