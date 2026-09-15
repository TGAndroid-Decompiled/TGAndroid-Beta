package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f31 extends org.telegram.ui.Components.kl0 {
    public final Context f33468c;
    public final g31 d;

    public f31(g31 g31Var, Context context) {
        this.d = g31Var;
        this.f33468c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 0) {
            g31 g31Var = this.d;
            if (b10 != g31Var.f33749c && b10 != g31Var.d && b10 != g31Var.e) {
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
        if (i10 == g31Var.f33750f) {
            return 0;
        }
        if (i10 != 0 && i10 != g31Var.f33749c && i10 != g31Var.d && i10 != g31Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        int i11 = c1Var.f42678f;
        View view = c1Var.f42675a;
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
                            org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) view;
                            if (i10 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i10 == g31Var.f33749c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == g31Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == g31Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = g31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != g31Var.e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = j3Var.f20296a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            j3Var.f20297b = z10;
                            j3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), g31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(this.f33468c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18800b7));
        e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f33468c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                        j3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                        this.d.f33751n[i10 - 9] = j3Var;
                        e9Var = j3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ea(context);
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(e9Var);
    }
}
