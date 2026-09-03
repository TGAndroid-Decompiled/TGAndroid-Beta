package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qg0 extends org.telegram.ui.Components.ql0 {
    public final Context f37410c;
    public final rg0 d;

    public qg0(rg0 rg0Var, Context context) {
        this.d = rg0Var;
        this.f37410c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        rg0 rg0Var = this.d;
        if (b10 != rg0Var.f37831c && b10 != rg0Var.d && b10 != rg0Var.e && b10 != rg0Var.f37832f && b10 != rg0Var.h && b10 != rg0Var.f37834r) {
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
        rg0 rg0Var = this.d;
        rg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != rg0Var.f37831c && i10 != rg0Var.d && i10 != rg0Var.e && i10 != rg0Var.f37832f && i10 != rg0Var.h) {
            if (i10 == rg0Var.f37833n) {
                return 2;
            }
            if (i10 == rg0Var.f37834r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 0) {
            rg0 rg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                        if (i10 == rg0Var.f37835s) {
                            z8Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                if (i10 == rg0Var.f37834r) {
                    z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
                    z9Var.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == rg0Var.f37831c) {
                y8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == rg0Var.d) {
                y8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == rg0Var.e) {
                y8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == rg0Var.f37832f) {
                y8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == rg0Var.h) {
                y8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
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
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y8 y8Var;
        View view;
        Context context = this.f37410c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.z8(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7));
                    } else {
                        FrameLayout z9Var = new org.telegram.ui.Cells.z9(context);
                        z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                        y8Var = z9Var;
                    }
                } else {
                    view = new org.telegram.ui.Cells.y6(context, (b) null);
                }
                return ai.n(view, view, -1, -2);
            }
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            y8Var2.setMultilineDetail(true);
            y8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            y8Var = y8Var2;
        } else {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            y8Var = l4Var;
        }
        view = y8Var;
        return ai.n(view, view, -1, -2);
    }
}
