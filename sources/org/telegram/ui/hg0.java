package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg0 extends org.telegram.ui.Components.hm0 {
    public final Context f37544c;
    public final ig0 d;

    public hg0(ig0 ig0Var, Context context) {
        this.d = ig0Var;
        this.f37544c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        ig0 ig0Var = this.d;
        if (b10 != ig0Var.f37883c && b10 != ig0Var.d && b10 != ig0Var.e && b10 != ig0Var.f37884f && b10 != ig0Var.h && b10 != ig0Var.f37886r) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        ig0 ig0Var = this.d;
        ig0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != ig0Var.f37883c && i10 != ig0Var.d && i10 != ig0Var.e && i10 != ig0Var.f37884f && i10 != ig0Var.h) {
            if (i10 == ig0Var.f37885n) {
                return 2;
            }
            if (i10 == ig0Var.f37886r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f45941f;
        View view = b1Var.f45938a;
        if (i11 != 0) {
            ig0 ig0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                        if (i10 == ig0Var.f37887s) {
                            d9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                if (i10 == ig0Var.f37886r) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
                    baVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
            if (i10 == ig0Var.f37883c) {
                c9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == ig0Var.d) {
                c9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == ig0Var.e) {
                c9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == ig0Var.f37884f) {
                c9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == ig0Var.h) {
                c9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == 0) {
            l4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.c9 c9Var;
        View view;
        Context context = this.f37544c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.d9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20948b7));
                    } else {
                        FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
                        baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                        c9Var = baVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
                }
                return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
            }
            org.telegram.ui.Cells.c9 c9Var2 = new org.telegram.ui.Cells.c9(context);
            c9Var2.setMultilineDetail(true);
            c9Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
            c9Var = c9Var2;
        } else {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
            c9Var = l4Var;
        }
        view = c9Var;
        return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
    }
}
