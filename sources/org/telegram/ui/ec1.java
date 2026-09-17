package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ec1 extends org.telegram.ui.Cells.qa {
    public final int j3 = 1;
    public final Object f33363k3;

    public ec1(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.b3 b3Var) {
        super(context, o2Var, 2, arrayList, arrayList2);
        this.f33363k3 = b3Var;
    }

    @Override
    public void A1(org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z10;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z11;
        int[] iArr;
        switch (this.j3) {
            case 0:
                hc1 hc1Var = ((hc1) this.f33363k3).e.f31562a;
                ThemeActivity themeActivity = hc1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((i6Var.F == null || i6Var.U) && themeActivity.f31570f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (i6Var.f18758b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = i6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String string2 = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string3 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = i6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                string = null;
                            } else {
                                string = LocaleController.getString("Edit", R.string.Edit);
                            }
                            TLRPC.TL_theme tL_theme3 = i6Var.F;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                            } else {
                                str = null;
                            }
                            if (z10) {
                                str2 = LocaleController.getString("Delete", R.string.Delete);
                            } else {
                                str2 = null;
                            }
                            boolean z12 = z10;
                            charSequenceArr = new CharSequence[]{string2, string3, string, str, str2};
                            z11 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        lg.j jVar = new lg.j(12, hc1Var, i6Var);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                        c2Var.P = charSequenceArr;
                        c2Var.Q = iArr;
                        c2Var.M = jVar;
                        themeActivity.showDialog(c2Var);
                        if (z11) {
                            c2Var.l(c2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19082p7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void B1() {
        Runnable runnable;
        switch (this.j3) {
            case 0:
                ((hc1) this.f33363k3).e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.b3) this.f33363k3).f18470a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public ec1(hc1 hc1Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, o2Var, i10, arrayList, arrayList2);
        this.f33363k3 = hc1Var;
    }
}
