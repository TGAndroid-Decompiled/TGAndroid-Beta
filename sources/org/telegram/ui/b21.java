package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b21 extends org.telegram.ui.Components.il0 {
    public final Context f36661c;
    public final c21 d;

    public b21(c21 c21Var, Context context) {
        this.d = c21Var;
        this.f36661c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        if (b10 != 0) {
            c21 c21Var = this.d;
            if (b10 != c21Var.f36973c && b10 != c21Var.d && b10 != c21Var.f36974e) {
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
        c21 c21Var = this.d;
        if (i10 == c21Var.f36975f) {
            return 0;
        }
        if (i10 != 0 && i10 != c21Var.f36973c && i10 != c21Var.d && i10 != c21Var.f36974e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                c21 c21Var = this.d;
                if (i11 != 4) {
                    switch (i11) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) view;
                            if (i10 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i10 == c21Var.f36973c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == c21Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == c21Var.f36974e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = c21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != c21Var.f36974e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = h3Var.f24437a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            h3Var.f24438b = z10;
                            h3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.q8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), c21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.f36661c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
        y8Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        Context context = this.f36661c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context);
                        h3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                        this.d.f36976n[i10 - 9] = h3Var;
                        y8Var = h3Var;
                        break;
                    default:
                        y8Var = new org.telegram.ui.Cells.q8(context);
                        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                        break;
                }
            } else {
                y8Var = new org.telegram.ui.Cells.y9(context);
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            }
        } else {
            y8Var = new org.telegram.ui.Cells.y8(context);
        }
        y8Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(y8Var);
    }
}
