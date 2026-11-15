package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a61 extends org.telegram.ui.Cells.ga {
    public final int f44945r3 = 1;
    public final Object f44946s3;

    public a61(Context context, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.messenger.ou ouVar) {
        super(context, e2Var, 2, arrayList, arrayList2);
        this.f44946s3 = ouVar;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z10;
        String M0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z11;
        CharSequence[] charSequenceArr;
        switch (this.f44945r3) {
            case 0:
                c61 c61Var = ((c61) this.f44946s3).f46027e.f43384a;
                ThemeActivity themeActivity = c61Var.f46027e;
                if (themeActivity.getParentActivity() != null) {
                    if ((i6Var.G == null || i6Var.V) && themeActivity.f43393f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (i6Var.f28700b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.hd.M0(2131750858, "ExportTheme")};
                            iArr = new int[]{0, 2131232366};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = i6Var.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String M02 = org.telegram.messenger.hd.M0(2131745459, "ShareFile");
                            String M03 = org.telegram.messenger.hd.M0(2131750858, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = i6Var.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131751335, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = i6Var.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.hd.M0(2131744145, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z10) {
                                c10 = 1;
                                str2 = org.telegram.messenger.hd.M0(2131751598, "Delete");
                            } else {
                                c10 = 1;
                                str2 = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = M02;
                            charSequenceArr2[c10] = M03;
                            charSequenceArr2[2] = M0;
                            charSequenceArr2[3] = str;
                            charSequenceArr2[4] = str2;
                            int[] iArr2 = new int[5];
                            iArr2[0] = 2131232364;
                            iArr2[c10] = 2131232366;
                            iArr2[2] = 2131232117;
                            iArr2[3] = 2131232204;
                            iArr2[4] = 2131232109;
                            iArr = iArr2;
                            z11 = z10;
                            charSequenceArr = charSequenceArr2;
                        }
                        og.j jVar = new og.j(13, c61Var, i6Var);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.Q = charSequenceArr;
                        t1Var.R = iArr;
                        t1Var.N = jVar;
                        themeActivity.showDialog(t1Var);
                        if (z11) {
                            t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29070p7, false));
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
    public final void D1() {
        switch (this.f44945r3) {
            case 0:
                ((c61) this.f44946s3).f46027e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) this.f44946s3).f25806b).f29724y0.run();
                return;
        }
    }

    public a61(c61 c61Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, e2Var, i7, arrayList, arrayList2);
        this.f44946s3 = c61Var;
    }
}
