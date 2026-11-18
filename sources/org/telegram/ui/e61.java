package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e61 extends org.telegram.ui.Cells.ia {
    public final int f47075r3 = 1;
    public final Object f47076s3;

    public e61(Context context, org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, ArrayList arrayList2, hi.w4 w4Var) {
        super(context, h2Var, 2, arrayList, arrayList2);
        this.f47076s3 = w4Var;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.m6 m6Var) {
        boolean z10;
        String M0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z11;
        CharSequence[] charSequenceArr;
        switch (this.f47075r3) {
            case 0:
                g61 g61Var = ((g61) this.f47076s3).f47912e.f43830a;
                ThemeActivity themeActivity = g61Var.f47912e;
                if (themeActivity.getParentActivity() != null) {
                    if ((m6Var.G == null || m6Var.V) && themeActivity.f43839f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (m6Var.f29249b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.gd.M0(2131750847, "ExportTheme")};
                            iArr = new int[]{0, 2131232367};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = m6Var.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String M02 = org.telegram.messenger.gd.M0(2131745264, "ShareFile");
                            String M03 = org.telegram.messenger.gd.M0(2131750847, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = m6Var.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131751324, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = m6Var.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.gd.M0(2131743910, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z10) {
                                c10 = 1;
                                str2 = org.telegram.messenger.gd.M0(2131751587, "Delete");
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
                            iArr2[0] = 2131232365;
                            iArr2[c10] = 2131232367;
                            iArr2[2] = 2131232118;
                            iArr2[3] = 2131232205;
                            iArr2[4] = 2131232110;
                            iArr = iArr2;
                            z11 = z10;
                            charSequenceArr = charSequenceArr2;
                        }
                        og.j jVar = new og.j(13, g61Var, m6Var);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.Q = charSequenceArr;
                        u1Var.R = iArr;
                        u1Var.N = jVar;
                        themeActivity.showDialog(u1Var);
                        if (z11) {
                            u1Var.m(u1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29635q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29615p7, false));
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
        switch (this.f47075r3) {
            case 0:
                ((g61) this.f47076s3).f47912e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) this.f47076s3).f15642b).f30232y0.run();
                return;
        }
    }

    public e61(g61 g61Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, h2Var, i7, arrayList, arrayList2);
        this.f47076s3 = g61Var;
    }
}
