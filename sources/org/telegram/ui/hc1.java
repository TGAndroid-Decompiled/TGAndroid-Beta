package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hc1 extends org.telegram.ui.Cells.ra {
    public final int j3 = 1;
    public final Object f33346k3;

    public hc1(Context context, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.c3 c3Var) {
        super(context, p2Var, 2, arrayList, arrayList2);
        this.f33346k3 = c3Var;
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
                kc1 kc1Var = ((kc1) this.f33346k3).e.f30661a;
                ThemeActivity themeActivity = kc1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((i6Var.F == null || i6Var.U) && themeActivity.f30669f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (i6Var.f17836b == null) {
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
                        kg.j jVar = new kg.j(13, kc1Var, i6Var);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.P = charSequenceArr;
                        d2Var.Q = iArr;
                        d2Var.M = jVar;
                        themeActivity.showDialog(d2Var);
                        if (z11) {
                            d2Var.l(d2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
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
                ((kc1) this.f33346k3).e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.c3) this.f33346k3).f17571a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public hc1(kc1 kc1Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, p2Var, i10, arrayList, arrayList2);
        this.f33346k3 = kc1Var;
    }
}
