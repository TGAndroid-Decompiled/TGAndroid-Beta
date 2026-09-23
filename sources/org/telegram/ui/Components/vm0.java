package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class vm0 extends ll0 {
    public final wm0 f28773c;

    public vm0(wm0 wm0Var) {
        this.f28773c = wm0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        wm0 wm0Var = this.f28773c;
        int i11 = wm0Var.v;
        if (i10 >= i11 && i10 < wm0Var.f29754w) {
            return (MessageObject) wm0Var.e.get(i10 - i11);
        }
        int i12 = wm0Var.f29756y;
        if (i10 >= i12 && i10 < wm0Var.E) {
            return (MessageObject) wm0Var.f29750f.get(i10 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.f28773c.f29752r;
    }

    @Override
    public final int j(int i10) {
        wm0 wm0Var = this.f28773c;
        if (i10 != wm0Var.f29753s && i10 != wm0Var.f29755x) {
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
        wm0 wm0Var = this.f28773c;
        org.telegram.ui.m10 m10Var = wm0Var.J;
        int i13 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z13 = false;
        if (i13 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == wm0Var.f29753s) {
                String string = LocaleController.getString(R.string.Downloading);
                if (v3Var.getText().equals(string)) {
                    if (wm0Var.H) {
                        i12 = R.string.PauseAll;
                    } else {
                        i12 = R.string.ResumeAll;
                    }
                    String string2 = LocaleController.getString(i12);
                    boolean z14 = wm0Var.H;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.f21442b;
                    u3Var.c(string2, true, z14);
                    u3Var.setVisibility(0);
                    return;
                }
                if (wm0Var.H) {
                    i11 = R.string.PauseAll;
                } else {
                    i11 = R.string.ResumeAll;
                }
                v3Var.c(string, LocaleController.getString(i11), new um0(this));
                return;
            } else if (i10 == wm0Var.f29755x) {
                v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new y70(this, 11));
                return;
            } else {
                return;
            }
        }
        MessageObject E = E(i10);
        if (E != null) {
            if (wm0Var.I.g() && i10 >= wm0Var.v && i10 < wm0Var.f29754w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f7 = 0.0f;
            if (i13 == 1) {
                sm0 sm0Var = (sm0) view;
                sm0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                org.telegram.ui.Cells.j7 j7Var = sm0Var.f27957a;
                if (j7Var.getMessage() == null) {
                    id3 = 0;
                } else {
                    id3 = j7Var.getMessage().getId();
                }
                j7Var.c(E, true);
                int id4 = j7Var.getMessage().getId();
                m10Var.f35122a = j7Var.getMessage().getDialogId();
                m10Var.f35123b = id4;
                boolean c10 = wm0Var.I.c(m10Var);
                if (id3 == E.getId()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j7Var.b(c10, z12);
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
                m10Var.f35122a = i7Var.getMessage().getDialogId();
                m10Var.f35123b = id5;
                boolean c11 = wm0Var.I.c(m10Var);
                if (id2 == E.getId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.e(c11, z11);
                if (id2 == E.getId()) {
                    z13 = true;
                }
                if (i7Var.f20229d0 != z10) {
                    i7Var.f20229d0 = z10;
                    if (!z13) {
                        if (z10) {
                            f7 = 1.0f;
                        }
                        i7Var.f20230e0 = f7;
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
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ?? frameLayout2 = new FrameLayout(context);
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 2, null);
            frameLayout2.f27957a = j7Var;
            j7Var.f20292r.setVisibility(8);
            frameLayout2.addView(j7Var);
            frameLayout = frameLayout2;
        } else {
            frameLayout = new org.telegram.ui.Cells.i7(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
