package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p21 extends org.telegram.ui.Components.sl0 {
    public final Context f39902c;
    public final q21 d;

    public p21(q21 q21Var, Context context) {
        this.d = q21Var;
        this.f39902c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        if (b10 != 0) {
            q21 q21Var = this.d;
            if (b10 != q21Var.f40328c && b10 != q21Var.d && b10 != q21Var.f40329e) {
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
        q21 q21Var = this.d;
        if (i10 == q21Var.f40330f) {
            return 0;
        }
        if (i10 != 0 && i10 != q21Var.f40328c && i10 != q21Var.d && i10 != q21Var.f40329e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        String str2;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z4 = false;
                q21 q21Var = this.d;
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
                            } else if (i10 == q21Var.f40328c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == q21Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == q21Var.f40329e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = q21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != q21Var.f40329e) {
                                z4 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = j3Var.f23003a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            j3Var.f23004b = z4;
                            j3Var.setWillNotDraw(!z4);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.s8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), q21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(this.f39902c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
        a9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.f39902c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                        j3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                        this.d.f40331n[i10 - 9] = j3Var;
                        a9Var = j3Var;
                        break;
                    default:
                        a9Var = new org.telegram.ui.Cells.s8(context);
                        a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                        break;
                }
            } else {
                a9Var = new org.telegram.ui.Cells.aa(context);
                a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            }
        } else {
            a9Var = new org.telegram.ui.Cells.a9(context);
        }
        a9Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(a9Var);
    }
}
