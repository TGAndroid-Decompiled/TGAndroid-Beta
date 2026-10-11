package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e31 extends org.telegram.ui.Components.rm0 {
    public final Context f37197c;
    public final f31 d;

    public e31(f31 f31Var, Context context) {
        this.d = f31Var;
        this.f37197c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        if (b10 != 0) {
            f31 f31Var = this.d;
            if (b10 != f31Var.f37523c && b10 != f31Var.d && b10 != f31Var.f37524e) {
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
        f31 f31Var = this.d;
        if (i10 == f31Var.f37525f) {
            return 0;
        }
        if (i10 != 0 && i10 != f31Var.f37523c && i10 != f31Var.d && i10 != f31Var.f37524e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        String str2;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                f31 f31Var = this.d;
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
                            } else if (i10 == f31Var.f37523c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == f31Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == f31Var.f37524e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = f31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != f31Var.f37524e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = k3Var.f22357a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            k3Var.f22358b = z10;
                            k3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), f31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(this.f37197c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20750b7));
        e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f37197c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                        k3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
                        this.d.f37526n[i10 - 9] = k3Var;
                        e9Var = k3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ca(context);
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(e9Var);
    }
}
