package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class fm0 extends vk0 {
    public final gm0 f28513c;

    public fm0(gm0 gm0Var) {
        this.f28513c = gm0Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 1 || i9 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i9) {
        gm0 gm0Var = this.f28513c;
        int i10 = gm0Var.v;
        if (i9 >= i10 && i9 < gm0Var.f28816w) {
            return (MessageObject) gm0Var.f28811e.get(i9 - i10);
        }
        int i11 = gm0Var.f28818y;
        if (i9 >= i11 && i9 < gm0Var.A) {
            return (MessageObject) gm0Var.f28812f.get(i9 - i11);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f28513c.f28814r;
    }

    @Override
    public final int j(int i9) {
        gm0 gm0Var = this.f28513c;
        if (i9 != gm0Var.f28815s && i9 != gm0Var.f28817x) {
            MessageObject E = E(i9);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        int id2;
        boolean z11;
        int id3;
        boolean z12;
        int i10;
        int i11;
        gm0 gm0Var = this.f28513c;
        org.telegram.ui.x00 x00Var = gm0Var.F;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z13 = false;
        if (i12 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 == gm0Var.f28815s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (v3Var.getText().equals(string)) {
                    if (gm0Var.D) {
                        i11 = R.string.PauseAll;
                    } else {
                        i11 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i11);
                    boolean z14 = gm0Var.D;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.f25787b;
                    u3Var.c(string2, true, z14);
                    u3Var.setVisibility(0);
                    return;
                }
                if (gm0Var.D) {
                    i10 = R.string.PauseAll;
                } else {
                    i10 = R.string.ResumeAll;
                }
                v3Var.c(string, LocaleController.getString(i10), new em0(this));
                return;
            } else if (i9 == gm0Var.f28817x) {
                v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new h70(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i9);
        if (E != null) {
            if (gm0Var.E.f() && i9 >= gm0Var.v && i9 < gm0Var.f28816w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f10 = 0.0f;
            if (i12 == 1) {
                cm0 cm0Var = (cm0) view;
                cm0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                org.telegram.ui.Cells.i7 i7Var = cm0Var.f27513a;
                if (i7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = i7Var.getMessage().getId();
                }
                i7Var.c(E, true);
                int id4 = i7Var.getMessage().getId();
                x00Var.f44299a = i7Var.getMessage().getDialogId();
                x00Var.f44300b = id4;
                boolean b10 = gm0Var.E.b(x00Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7Var.b(b10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (i7Var.K != z10) {
                    i7Var.K = z10;
                    if (!z13) {
                        if (z10) {
                            f10 = 1.0f;
                        }
                        i7Var.L = f10;
                    }
                    i7Var.invalidate();
                }
            } else if (i12 == 2) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                if (h7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = h7Var.getMessage().getId();
                }
                h7Var.f(E, true);
                int id5 = h7Var.getMessage().getId();
                x00Var.f44299a = h7Var.getMessage().getDialogId();
                x00Var.f44300b = id5;
                boolean b11 = gm0Var.E.b(x00Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (h7Var.W != z10) {
                    h7Var.W = z10;
                    if (!z13) {
                        if (z10) {
                            f10 = 1.0f;
                        }
                        h7Var.f24472a0 = f10;
                    }
                    h7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        if (i9 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i9 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            frameLayout2.f27513a = i7Var;
            i7Var.f24519r.setVisibility(8);
            frameLayout2.addView(i7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.h7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(frameLayout);
    }
}
