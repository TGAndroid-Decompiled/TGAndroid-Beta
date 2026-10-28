package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ab1 extends org.telegram.ui.Cells.ra {
    public final int f37726r3 = 1;
    public final Object f37727s3;

    public ab1(Context context, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.e3 e3Var) {
        super(context, r2Var, 2, arrayList, arrayList2);
        this.f37727s3 = e3Var;
    }

    @Override
    public void F1(org.telegram.ui.ActionBar.x6 x6Var) {
        boolean z10;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z11;
        int[] iArr;
        switch (this.f37726r3) {
            case 0:
                db1 db1Var = ((db1) this.f37727s3).e.f36287a;
                ThemeActivity themeActivity = db1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((x6Var.F == null || x6Var.U) && themeActivity.f36295f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (x6Var.f23254b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = x6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String string2 = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string3 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = x6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                string = null;
                            } else {
                                string = LocaleController.getString("Edit", R.string.Edit);
                            }
                            TLRPC.TL_theme tL_theme3 = x6Var.F;
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
                        ng.j jVar = new ng.j(13, db1Var, x6Var);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.P = charSequenceArr;
                        e2Var.Q = iArr;
                        e2Var.M = jVar;
                        themeActivity.showDialog(e2Var);
                        if (z11) {
                            e2Var.m(e2Var.P0.size() - 1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23599q7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23582p7, false));
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
    public final void G1() {
        Runnable runnable;
        switch (this.f37726r3) {
            case 0:
                ((db1) this.f37727s3).e.B0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.e3) this.f37727s3).f22602a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public ab1(db1 db1Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, r2Var, i10, arrayList, arrayList2);
        this.f37727s3 = db1Var;
    }
}
