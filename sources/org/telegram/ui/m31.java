package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m31 extends org.telegram.ui.Components.lm0 {
    public final Context f37903c;
    public final n31 d;

    public m31(n31 n31Var, Context context) {
        this.d = n31Var;
        this.f37903c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 0) {
            n31 n31Var = this.d;
            if (b10 != n31Var.f38132c && b10 != n31Var.d && b10 != n31Var.e) {
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
        n31 n31Var = this.d;
        if (i10 == n31Var.f38133f) {
            return 0;
        }
        if (i10 != 0 && i10 != n31Var.f38132c && i10 != n31Var.d && i10 != n31Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                n31 n31Var = this.d;
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
                            } else if (i10 == n31Var.f38132c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == n31Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == n31Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = n31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != n31Var.e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = k3Var.f21135a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            k3Var.f21136b = z10;
                            k3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), n31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(this.f37903c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
        e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f37903c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                        k3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                        this.d.f38134n[i10 - 9] = k3Var;
                        e9Var = k3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ca(context);
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(e9Var);
    }
}
