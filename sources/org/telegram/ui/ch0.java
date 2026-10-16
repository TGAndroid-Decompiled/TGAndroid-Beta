package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ch0 extends org.telegram.ui.Components.lm0 {
    public final Context f34665c;
    public final dh0 d;

    public ch0(dh0 dh0Var, Context context) {
        this.d = dh0Var;
        this.f34665c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dh0 dh0Var = this.d;
        if (b10 != dh0Var.f35020c && b10 != dh0Var.d && b10 != dh0Var.e && b10 != dh0Var.f35021f && b10 != dh0Var.h && b10 != dh0Var.f35023r) {
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
        dh0 dh0Var = this.d;
        dh0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != dh0Var.f35020c && i10 != dh0Var.d && i10 != dh0Var.e && i10 != dh0Var.f35021f && i10 != dh0Var.h) {
            if (i10 == dh0Var.f35022n) {
                return 2;
            }
            if (i10 == dh0Var.f35023r) {
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
            dh0 dh0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                        if (i10 == dh0Var.f35024s) {
                            e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i10 == dh0Var.f35023r) {
                    caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19822p7, false));
                    caVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == dh0Var.f35020c) {
                d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == dh0Var.d) {
                d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == dh0Var.e) {
                d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == dh0Var.f35021f) {
                d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == dh0Var.h) {
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
        Context context = this.f34665c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.e9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19563b7));
                    } else {
                        FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
                        caVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                        d9Var = caVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                }
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            }
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            d9Var2.setMultilineDetail(true);
            d9Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            d9Var = d9Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            d9Var = m4Var;
        }
        view = d9Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
