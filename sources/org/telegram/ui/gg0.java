package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gg0 extends org.telegram.ui.Components.il0 {
    public final Context f38583c;
    public final hg0 d;

    public gg0(hg0 hg0Var, Context context) {
        this.d = hg0Var;
        this.f38583c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        hg0 hg0Var = this.d;
        if (b10 != hg0Var.f38901c && b10 != hg0Var.d && b10 != hg0Var.f38902e && b10 != hg0Var.f38903f && b10 != hg0Var.h && b10 != hg0Var.f38905r) {
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
        hg0 hg0Var = this.d;
        hg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != hg0Var.f38901c && i10 != hg0Var.d && i10 != hg0Var.f38902e && i10 != hg0Var.f38903f && i10 != hg0Var.h) {
            if (i10 == hg0Var.f38904n) {
                return 2;
            }
            if (i10 == hg0Var.f38905r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 != 0) {
            hg0 hg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                        if (i10 == hg0Var.f38906s) {
                            y8Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                if (i10 == hg0Var.f38905r) {
                    y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                    y9Var.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == hg0Var.f38901c) {
                x8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == hg0Var.d) {
                x8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == hg0Var.f38902e) {
                x8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == hg0Var.f38903f) {
                x8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == hg0Var.h) {
                x8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (i10 == 0) {
            k4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.x8 x8Var;
        View view;
        Context context = this.f38583c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.y8(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                    } else {
                        FrameLayout y9Var = new org.telegram.ui.Cells.y9(context);
                        y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                        x8Var = y9Var;
                    }
                } else {
                    view = new org.telegram.ui.Cells.x6(context, (b) null);
                }
                return th.m(view, view, -1, -2);
            }
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            x8Var2.setMultilineDetail(true);
            x8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            x8Var = x8Var2;
        } else {
            FrameLayout k4Var = new org.telegram.ui.Cells.k4(context);
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            x8Var = k4Var;
        }
        view = x8Var;
        return th.m(view, view, -1, -2);
    }
}
