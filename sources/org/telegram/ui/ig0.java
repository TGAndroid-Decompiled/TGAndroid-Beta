package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ig0 extends org.telegram.ui.Components.lm0 {
    public final Context f40243c;
    public final jg0 d;

    public ig0(jg0 jg0Var, Context context) {
        this.d = jg0Var;
        this.f40243c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        jg0 jg0Var = this.d;
        if (b10 != jg0Var.f40629c && b10 != jg0Var.d && b10 != jg0Var.e && b10 != jg0Var.f40630f && b10 != jg0Var.h && b10 != jg0Var.f40632r) {
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
        jg0 jg0Var = this.d;
        jg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != jg0Var.f40629c && i10 != jg0Var.d && i10 != jg0Var.e && i10 != jg0Var.f40630f && i10 != jg0Var.h) {
            if (i10 == jg0Var.f40631n) {
                return 2;
            }
            if (i10 == jg0Var.f40632r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        if (i11 != 0) {
            jg0 jg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                        if (i10 == jg0Var.f40633s) {
                            i9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i10 == jg0Var.f40632r) {
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.f23581p7, null);
                    gaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.h9 h9Var = (org.telegram.ui.Cells.h9) view;
            if (i10 == jg0Var.f40629c) {
                h9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == jg0Var.d) {
                h9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == jg0Var.e) {
                h9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == jg0Var.f40630f) {
                h9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == jg0Var.h) {
                h9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        if (i10 == 0) {
            q4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h9 h9Var;
        View view;
        Context context = this.f40243c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.i9(context);
                        return ic.a.n(view, view, -1, -2);
                    }
                    View gaVar = new org.telegram.ui.Cells.ga(context);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, gaVar, null);
                    h9Var = gaVar;
                } else {
                    h9Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                }
            } else {
                org.telegram.ui.Cells.h9 h9Var2 = new org.telegram.ui.Cells.h9(context);
                h9Var2.setMultilineDetail(true);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, h9Var2, null);
                h9Var = h9Var2;
            }
        } else {
            View q4Var = new org.telegram.ui.Cells.q4(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, null);
            h9Var = q4Var;
        }
        view = h9Var;
        return ic.a.n(view, view, -1, -2);
    }
}
