package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class jg0 extends org.telegram.ui.Components.yk0 {

    public final Context f39367c;
    public final kg0 d;

    public jg0(kg0 kg0Var, Context context) {
        this.d = kg0Var;
        this.f39367c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        kg0 kg0Var = this.d;
        return iB == kg0Var.f39720c || iB == kg0Var.d || iB == kg0Var.f39721e || iB == kg0Var.f39722f || iB == kg0Var.h || iB == kg0Var.f39724r;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        kg0 kg0Var = this.d;
        kg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == kg0Var.f39720c || i10 == kg0Var.d || i10 == kg0Var.f39721e || i10 == kg0Var.f39722f || i10 == kg0Var.h) {
            return 1;
        }
        if (i10 == kg0Var.f39723n) {
            return 2;
        }
        return i10 == kg0Var.f39724r ? 3 : 4;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == 0) {
                j4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        kg0 kg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                if (i10 == kg0Var.f39724r) {
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                    x9Var.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == kg0Var.f39725s) {
                x8Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (i10 == kg0Var.f39720c) {
            w8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == kg0Var.d) {
            w8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == kg0Var.f39721e) {
            w8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == kg0Var.f39722f) {
            w8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == kg0Var.h) {
            w8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View w6Var;
        Context context = this.f39367c;
        if (i10 == 0) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            view = j4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                } else if (i10 != 3) {
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
                    x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                    w6Var = x8Var;
                } else {
                    org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                    x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    view = x9Var;
                }
                return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
            }
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setMultilineDetail(true);
            w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            view = w8Var;
        }
        w6Var = view;
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }
}
