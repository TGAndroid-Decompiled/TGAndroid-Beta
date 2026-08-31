package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class dn0 extends sl0 {
    public final en0 f26301c;

    public dn0(en0 en0Var) {
        this.f26301c = en0Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        en0 en0Var = this.f26301c;
        int i11 = en0Var.v;
        if (i10 >= i11 && i10 < en0Var.f26591w) {
            return (MessageObject) en0Var.f26586e.get(i10 - i11);
        }
        int i12 = en0Var.f26593y;
        if (i10 >= i12 && i10 < en0Var.B) {
            return (MessageObject) en0Var.f26587f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f26301c.f26589r;
    }

    @Override
    public final int j(int i10) {
        en0 en0Var = this.f26301c;
        if (i10 != en0Var.f26590s && i10 != en0Var.f26592x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        int id2;
        boolean z10;
        int id3;
        boolean z11;
        int i11;
        int i12;
        en0 en0Var = this.f26301c;
        org.telegram.ui.l10 l10Var = en0Var.G;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z12 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == en0Var.f26590s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (u3Var.getText().equals(string)) {
                    if (en0Var.E) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z13 = en0Var.E;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.f24193b;
                    t3Var.c(string2, true, z13);
                    t3Var.setVisibility(0);
                    return;
                }
                if (en0Var.E) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                u3Var.c(string, LocaleController.getString(i11), new cn0(this));
                return;
            } else if (i10 == en0Var.f26592x) {
                u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new b80(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (en0Var.F.f() && i10 >= en0Var.v && i10 < en0Var.f26591w) {
                z4 = true;
            } else {
                z4 = false;
            }
            float f10 = 0.0f;
            if (i13 == 1) {
                an0 an0Var = (an0) view;
                an0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                org.telegram.ui.Cells.i7 i7Var = an0Var.f25298a;
                if (i7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = i7Var.getMessage().getId();
                }
                i7Var.c(E, true);
                int id4 = i7Var.getMessage().getId();
                l10Var.f38557a = i7Var.getMessage().getDialogId();
                l10Var.f38558b = id4;
                boolean b10 = en0Var.F.b(l10Var);
                if (id3 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.b(b10, z11);
                if (id3 == E.getId()) {
                    z12 = true;
                }
                if (i7Var.L != z4) {
                    i7Var.L = z4;
                    if (!z12) {
                        if (z4) {
                            f10 = 1.0f;
                        }
                        i7Var.M = f10;
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
                l10Var.f38557a = h7Var.getMessage().getDialogId();
                l10Var.f38558b = id5;
                boolean b11 = en0Var.F.b(l10Var);
                if (id2 == E.getId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h7Var.e(b11, z10);
                if (id2 == E.getId()) {
                    z12 = true;
                }
                if (h7Var.f22924a0 != z4) {
                    h7Var.f22924a0 = z4;
                    if (!z12) {
                        if (z4) {
                            f10 = 1.0f;
                        }
                        h7Var.f22926b0 = f10;
                    }
                    h7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            frameLayout2.f25298a = i7Var;
            i7Var.f22979r.setVisibility(8);
            frameLayout2.addView(i7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.h7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(frameLayout);
    }
}
