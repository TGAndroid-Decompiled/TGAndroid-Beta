package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kg0 extends org.telegram.ui.Components.lm0 {
    public final Context f38946c;
    public final lg0 d;

    public kg0(lg0 lg0Var, Context context) {
        this.d = lg0Var;
        this.f38946c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        lg0 lg0Var = this.d;
        if (b10 != lg0Var.f39242c && b10 != lg0Var.d && b10 != lg0Var.e && b10 != lg0Var.f39243f && b10 != lg0Var.h && b10 != lg0Var.f39245r) {
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
        lg0 lg0Var = this.d;
        lg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != lg0Var.f39242c && i10 != lg0Var.d && i10 != lg0Var.e && i10 != lg0Var.f39243f && i10 != lg0Var.h) {
            if (i10 == lg0Var.f39244n) {
                return 2;
            }
            if (i10 == lg0Var.f39245r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i11 != 0) {
            lg0 lg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                        if (i10 == lg0Var.f39246s) {
                            e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i10 == lg0Var.f39245r) {
                    org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.f21404p7, null);
                    caVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == lg0Var.f39242c) {
                d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == lg0Var.d) {
                d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == lg0Var.e) {
                d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == lg0Var.f39243f) {
                d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == lg0Var.h) {
                d9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
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
        org.telegram.ui.Cells.d9 d9Var;
        Context context = this.f38946c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        View e9Var = new org.telegram.ui.Cells.e9(context);
                        org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var, null);
                        d9Var = e9Var;
                    } else {
                        View caVar = new org.telegram.ui.Cells.ca(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, caVar, null);
                        d9Var = caVar;
                    }
                } else {
                    d9Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                }
            } else {
                org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
                d9Var2.setMultilineDetail(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, d9Var2, null);
                d9Var = d9Var2;
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l4Var, null);
            d9Var = l4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(d9Var, d9Var, -1, -2);
    }
}
