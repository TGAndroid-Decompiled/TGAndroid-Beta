package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f31 extends org.telegram.ui.Components.pm0 {
    public final Context f37438c;
    public final g31 d;

    public f31(g31 g31Var, Context context) {
        this.d = g31Var;
        this.f37438c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        if (b10 != 0) {
            g31 g31Var = this.d;
            if (b10 != g31Var.f37760c && b10 != g31Var.d && b10 != g31Var.f37761e) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.h;
    }

    @Override
    public final int j(int i10) {
        g31 g31Var = this.d;
        if (i10 == g31Var.f37762f) {
            return 0;
        }
        if (i10 != 0 && i10 != g31Var.f37760c && i10 != g31Var.d && i10 != g31Var.f37761e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        String str2;
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                g31 g31Var = this.d;
                if (i11 != 4) {
                    switch (i11) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
                            if (i10 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i10 == g31Var.f37760c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == g31Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == g31Var.f37761e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = g31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != g31Var.f37761e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = k3Var.f22365a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            k3Var.f22366b = z10;
                            k3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), g31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(this.f37438c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
        e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f37438c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                        k3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                        this.d.f37763n[i10 - 9] = k3Var;
                        e9Var = k3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ca(context);
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(e9Var);
    }
}
