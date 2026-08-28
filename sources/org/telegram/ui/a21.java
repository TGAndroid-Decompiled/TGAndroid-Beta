package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a21 extends org.telegram.ui.Components.vk0 {
    public final Context f36344c;
    public final b21 d;

    public a21(b21 b21Var, Context context) {
        this.d = b21Var;
        this.f36344c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        if (b10 != 0) {
            b21 b21Var = this.d;
            if (b10 != b21Var.f36610c && b10 != b21Var.d && b10 != b21Var.f36611e) {
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
    public final int j(int i9) {
        b21 b21Var = this.d;
        if (i9 == b21Var.f36612f) {
            return 0;
        }
        if (i9 != 0 && i9 != b21Var.f36610c && i9 != b21Var.d && i9 != b21Var.f36611e) {
            return 1;
        }
        return i9 + 9;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 0) {
            if (i10 != 1) {
                boolean z10 = false;
                b21 b21Var = this.d;
                if (i10 != 4) {
                    switch (i10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
                            if (i9 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i9 == b21Var.f36610c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i9 == b21Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i9 == b21Var.f36611e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = b21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i9 != b21Var.f36611e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = k3Var.f24588a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            k3Var.f24589b = z10;
                            k3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.t8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), b21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(this.f36344c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
        b9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View b9Var;
        Context context = this.f36344c;
        if (i9 != 0) {
            if (i9 != 1) {
                switch (i9) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                        k3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                        this.d.f36613n[i9 - 9] = k3Var;
                        b9Var = k3Var;
                        break;
                    default:
                        b9Var = new org.telegram.ui.Cells.t8(context);
                        b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                        break;
                }
            } else {
                b9Var = new org.telegram.ui.Cells.ba(context);
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            }
        } else {
            b9Var = new org.telegram.ui.Cells.b9(context);
        }
        b9Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(b9Var);
    }
}
