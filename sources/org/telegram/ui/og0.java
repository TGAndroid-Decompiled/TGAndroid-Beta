package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class og0 extends org.telegram.ui.Components.rl0 {
    public final Context f36892c;
    public final pg0 d;

    public og0(pg0 pg0Var, Context context) {
        this.d = pg0Var;
        this.f36892c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        pg0 pg0Var = this.d;
        if (b10 != pg0Var.f37308c && b10 != pg0Var.d && b10 != pg0Var.e && b10 != pg0Var.f37309f && b10 != pg0Var.h && b10 != pg0Var.f37311r) {
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
        pg0 pg0Var = this.d;
        pg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != pg0Var.f37308c && i10 != pg0Var.d && i10 != pg0Var.e && i10 != pg0Var.f37309f && i10 != pg0Var.h) {
            if (i10 == pg0Var.f37310n) {
                return 2;
            }
            if (i10 == pg0Var.f37311r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i11 != 0) {
            pg0 pg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                        if (i10 == pg0Var.f37312s) {
                            a9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i10 == pg0Var.f37311r) {
                    aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
                    aaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == pg0Var.f37308c) {
                z8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == pg0Var.d) {
                z8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == pg0Var.e) {
                z8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == pg0Var.f37309f) {
                z8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == pg0Var.h) {
                z8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
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
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z8 z8Var;
        View view;
        Context context = this.f36892c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.a9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19871b7));
                    } else {
                        FrameLayout aaVar = new org.telegram.ui.Cells.aa(context);
                        aaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                        z8Var = aaVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (b) null);
                }
                return yh.o(view, view, -1, -2);
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            z8Var2.setMultilineDetail(true);
            z8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            z8Var = z8Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            z8Var = m4Var;
        }
        view = z8Var;
        return yh.o(view, view, -1, -2);
    }
}
