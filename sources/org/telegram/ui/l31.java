package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l31 extends org.telegram.ui.Components.ul0 {
    public final Context f34529c;
    public final m31 d;

    public l31(m31 m31Var, Context context) {
        this.d = m31Var;
        this.f34529c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 0) {
            m31 m31Var = this.d;
            if (b10 != m31Var.f34835c && b10 != m31Var.d && b10 != m31Var.e) {
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
        m31 m31Var = this.d;
        if (i10 == m31Var.f34836f) {
            return 0;
        }
        if (i10 != 0 && i10 != m31Var.f34835c && i10 != m31Var.d && i10 != m31Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                m31 m31Var = this.d;
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
                            } else if (i10 == m31Var.f34835c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == m31Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == m31Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = m31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != m31Var.e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = j3Var.f19338a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            j3Var.f19339b = z10;
                            j3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.x8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), m31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.f34529c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
        f9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View f9Var;
        Context context = this.f34529c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                        j3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                        this.d.f34837n[i10 - 9] = j3Var;
                        f9Var = j3Var;
                        break;
                    default:
                        f9Var = new org.telegram.ui.Cells.x8(context);
                        f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                        break;
                }
            } else {
                f9Var = new org.telegram.ui.Cells.ga(context);
                f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            }
        } else {
            f9Var = new org.telegram.ui.Cells.f9(context);
        }
        f9Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(f9Var);
    }
}
