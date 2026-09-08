package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dc1 extends org.telegram.ui.Cells.pa {
    public final int j3 = 1;
    public final Object f35788k3;

    public dc1(Context context, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.a3 a3Var) {
        super(context, n2Var, 2, arrayList, arrayList2);
        this.f35788k3 = a3Var;
    }

    @Override
    public void y1(org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z10;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z11;
        int[] iArr;
        switch (this.j3) {
            case 0:
                gc1 gc1Var = ((gc1) this.f35788k3).f36653e.f34201a;
                ThemeActivity themeActivity = gc1Var.f36653e;
                if (themeActivity.getParentActivity() != null) {
                    if ((i6Var.F == null || i6Var.U) && themeActivity.f34210f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (i6Var.f20569b == null) {
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
                        mg.j jVar = new mg.j(12, gc1Var, i6Var);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.P = charSequenceArr;
                        b2Var.Q = iArr;
                        b2Var.M = jVar;
                        themeActivity.showDialog(b2Var);
                        if (z11) {
                            b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20907p7, false));
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
        switch (this.j3) {
            case 0:
                ((gc1) this.f35788k3).f36653e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.a3) this.f35788k3).f20231a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public dc1(gc1 gc1Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, n2Var, i10, arrayList, arrayList2);
        this.f35788k3 = gc1Var;
    }
}
