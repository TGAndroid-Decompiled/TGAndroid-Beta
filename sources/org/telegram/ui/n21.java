package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n21 extends org.telegram.ui.Components.rl0 {
    public final Context f36435c;
    public final o21 d;

    public n21(o21 o21Var, Context context) {
        this.d = o21Var;
        this.f36435c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        if (b10 != 0) {
            o21 o21Var = this.d;
            if (b10 != o21Var.f36779c && b10 != o21Var.d && b10 != o21Var.e) {
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
        o21 o21Var = this.d;
        if (i10 == o21Var.f36780f) {
            return 0;
        }
        if (i10 != 0 && i10 != o21Var.f36779c && i10 != o21Var.d && i10 != o21Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z4 = false;
                o21 o21Var = this.d;
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
                            } else if (i10 == o21Var.f36779c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == o21Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == o21Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = o21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != o21Var.e) {
                                z4 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = j3Var.f21243a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            j3Var.f21244b = z4;
                            j3Var.setWillNotDraw(!z4);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.s8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), o21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.f36435c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
        a9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.f36435c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                        j3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                        this.d.f36781n[i10 - 9] = j3Var;
                        a9Var = j3Var;
                        break;
                    default:
                        a9Var = new org.telegram.ui.Cells.s8(context);
                        a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                        break;
                }
            } else {
                a9Var = new org.telegram.ui.Cells.aa(context);
                a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            }
        } else {
            a9Var = new org.telegram.ui.Cells.a9(context);
        }
        a9Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(a9Var);
    }
}
