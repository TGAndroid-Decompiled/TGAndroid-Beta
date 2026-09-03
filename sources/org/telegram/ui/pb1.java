package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pb1 extends org.telegram.ui.Cells.la {
    public final int f39969g3 = 1;
    public final Object f39970h3;

    public pb1(Context context, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.c3 c3Var) {
        super(context, p2Var, 2, arrayList, arrayList2);
        this.f39970h3 = c3Var;
    }

    @Override
    public void y1(org.telegram.ui.ActionBar.j6 j6Var) {
        boolean z4;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.f39969g3) {
            case 0:
                sb1 sb1Var = ((sb1) this.f39970h3).f41126e.f34870a;
                ThemeActivity themeActivity = sb1Var.f41126e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.C == null || j6Var.R) && themeActivity.f34879f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.f21507b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.C;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            String string2 = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string3 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = j6Var.C;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                string = null;
                            } else {
                                string = LocaleController.getString("Edit", R.string.Edit);
                            }
                            TLRPC.TL_theme tL_theme3 = j6Var.C;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                            } else {
                                str = null;
                            }
                            if (z4) {
                                str2 = LocaleController.getString("Delete", R.string.Delete);
                            } else {
                                str2 = null;
                            }
                            boolean z11 = z4;
                            charSequenceArr = new CharSequence[]{string2, string3, string, str, str2};
                            z10 = z11;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        dg.t1 t1Var = new dg.t1(12, sb1Var, j6Var);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        d2Var.M = charSequenceArr;
                        d2Var.N = iArr;
                        d2Var.J = t1Var;
                        themeActivity.showDialog(d2Var);
                        if (z10) {
                            d2Var.l(d2Var.K0.size() - 1, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21878p7, false));
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
    public final void z1() {
        Runnable runnable;
        switch (this.f39969g3) {
            case 0:
                ((sb1) this.f39970h3).f41126e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.c3) this.f39970h3).f21209a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public pb1(sb1 sb1Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, p2Var, i10, arrayList, arrayList2);
        this.f39970h3 = sb1Var;
    }
}
