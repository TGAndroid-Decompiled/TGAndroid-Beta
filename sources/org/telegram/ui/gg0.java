package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gg0 extends org.telegram.ui.Components.vk0 {
    public final Context f38538c;
    public final hg0 d;

    public gg0(hg0 hg0Var, Context context) {
        this.d = hg0Var;
        this.f38538c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        hg0 hg0Var = this.d;
        if (b10 != hg0Var.f38780c && b10 != hg0Var.d && b10 != hg0Var.f38781e && b10 != hg0Var.f38782f && b10 != hg0Var.h && b10 != hg0Var.f38784r) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i9) {
        hg0 hg0Var = this.d;
        hg0Var.getClass();
        if (i9 == 0) {
            return 0;
        }
        if (i9 != hg0Var.f38780c && i9 != hg0Var.d && i9 != hg0Var.f38781e && i9 != hg0Var.f38782f && i9 != hg0Var.h) {
            if (i9 == hg0Var.f38783n) {
                return 2;
            }
            if (i9 == hg0Var.f38784r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 0) {
            hg0 hg0Var = this.d;
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                        if (i9 == hg0Var.f38785s) {
                            b9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                if (i9 == hg0Var.f38784r) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                    baVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i9 == hg0Var.f38780c) {
                a9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i9 == hg0Var.d) {
                a9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i9 == hg0Var.f38781e) {
                a9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i9 == hg0Var.f38782f) {
                a9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i9 == hg0Var.h) {
                a9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i9 == 0) {
            m4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.a9 a9Var;
        View view;
        Context context = this.f38538c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        view = new org.telegram.ui.Cells.b9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                    } else {
                        FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
                        baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                        a9Var = baVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                }
                return j3.r0.s(view, view, -1, -2);
            }
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            a9Var2.setMultilineDetail(true);
            a9Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            a9Var = a9Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            a9Var = m4Var;
        }
        view = a9Var;
        return j3.r0.s(view, view, -1, -2);
    }
}
