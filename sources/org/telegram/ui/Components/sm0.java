package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class sm0 extends il0 {
    public final tm0 f32690c;

    public sm0(tm0 tm0Var) {
        this.f32690c = tm0Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        tm0 tm0Var = this.f32690c;
        int i11 = tm0Var.v;
        if (i10 >= i11 && i10 < tm0Var.f32985w) {
            return (MessageObject) tm0Var.f32980e.get(i10 - i11);
        }
        int i12 = tm0Var.f32987y;
        if (i10 >= i12 && i10 < tm0Var.A) {
            return (MessageObject) tm0Var.f32981f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f32690c.f32983r;
    }

    @Override
    public final int j(int i10) {
        tm0 tm0Var = this.f32690c;
        if (i10 != tm0Var.f32984s && i10 != tm0Var.f32986x) {
            MessageObject E = E(i10);
            if (E == null || !E.isMusic()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        int id2;
        boolean z11;
        int id3;
        boolean z12;
        int i11;
        int i12;
        tm0 tm0Var = this.f32690c;
        org.telegram.ui.z00 z00Var = tm0Var.F;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == tm0Var.f32984s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (s3Var.getText().equals(string)) {
                    if (tm0Var.D) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = tm0Var.D;
                    org.telegram.ui.Cells.r3 r3Var = s3Var.f25639b;
                    r3Var.c(string2, true, z14);
                    r3Var.setVisibility(0);
                    return;
                }
                if (tm0Var.D) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                s3Var.c(string, LocaleController.getString(i11), new rm0(this));
                return;
            } else if (i10 == tm0Var.f32986x) {
                s3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new u70(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (tm0Var.E.f() && i10 >= tm0Var.v && i10 < tm0Var.f32985w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f9 = 0.0f;
            if (i13 == 1) {
                pm0 pm0Var = (pm0) view;
                pm0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                org.telegram.ui.Cells.g7 g7Var = pm0Var.f31712a;
                if (g7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = g7Var.getMessage().getId();
                }
                g7Var.c(E, true);
                int id4 = g7Var.getMessage().getId();
                z00Var.f45005a = g7Var.getMessage().getDialogId();
                z00Var.f45006b = id4;
                boolean b10 = tm0Var.E.b(z00Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g7Var.b(b10, z12);
                if (id3 == E.getId()) {
                    z13 = true;
                }
                if (g7Var.K != z10) {
                    g7Var.K = z10;
                    if (!z13) {
                        if (z10) {
                            f9 = 1.0f;
                        }
                        g7Var.L = f9;
                    }
                    g7Var.invalidate();
                }
            } else if (i13 == 2) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                if (f7Var.getMessage() == null) {
                    id2 = 0;
                } else {
                    id2 = f7Var.getMessage().getId();
                }
                f7Var.f(E, true);
                int id5 = f7Var.getMessage().getId();
                z00Var.f45005a = f7Var.getMessage().getDialogId();
                z00Var.f45006b = id5;
                boolean b11 = tm0Var.E.b(z00Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f7Var.e(b11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (f7Var.W != z10) {
                    f7Var.W = z10;
                    if (!z13) {
                        if (z10) {
                            f9 = 1.0f;
                        }
                        f7Var.f24352a0 = f9;
                    }
                    f7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(context, 2, null);
            frameLayout2.f31712a = g7Var;
            g7Var.f24411r.setVisibility(8);
            frameLayout2.addView(g7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.f7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(frameLayout);
    }
}
