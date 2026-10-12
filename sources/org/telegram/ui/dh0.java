package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dh0 extends org.telegram.ui.Components.lm0 {
    public final Context f35261c;
    public final eh0 d;

    public dh0(eh0 eh0Var, Context context) {
        this.d = eh0Var;
        this.f35261c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        eh0 eh0Var = this.d;
        if (b10 != eh0Var.f35575c && b10 != eh0Var.d && b10 != eh0Var.e && b10 != eh0Var.f35576f && b10 != eh0Var.h && b10 != eh0Var.f35578r) {
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
        eh0 eh0Var = this.d;
        eh0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != eh0Var.f35575c && i10 != eh0Var.d && i10 != eh0Var.e && i10 != eh0Var.f35576f && i10 != eh0Var.h) {
            if (i10 == eh0Var.f35577n) {
                return 2;
            }
            if (i10 == eh0Var.f35578r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 != 0) {
            eh0 eh0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                        if (i10 == eh0Var.f35579s) {
                            e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i10 == eh0Var.f35578r) {
                    caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
                    caVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == eh0Var.f35575c) {
                d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == eh0Var.d) {
                d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == eh0Var.e) {
                d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == eh0Var.f35576f) {
                d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == eh0Var.h) {
                d9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == 0) {
            m4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.d9 d9Var;
        View view;
        Context context = this.f35261c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.e9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19863b7));
                    } else {
                        FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
                        caVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                        d9Var = caVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                }
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            }
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            d9Var2.setMultilineDetail(true);
            d9Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            d9Var = d9Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            d9Var = m4Var;
        }
        view = d9Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
