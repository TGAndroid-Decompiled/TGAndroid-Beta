package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d61 extends org.telegram.ui.Cells.ga {
    public final int f44973q3 = 1;
    public final Object f44974r3;

    public d61(Context context, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, ArrayList arrayList2, h9.f1 f1Var) {
        super(context, f2Var, 2, arrayList, arrayList2);
        this.f44974r3 = f1Var;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
        boolean z9;
        String M0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.f44973q3) {
            case 0:
                f61 f61Var = ((f61) this.f44974r3).f45466e.f42011a;
                ThemeActivity themeActivity = f61Var.f45466e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.F == null || j6Var.U) && themeActivity.f42020f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.f27631b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.id.M0(2131750859, "ExportTheme")};
                            iArr = new int[]{0, 2131232365};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            String M02 = org.telegram.messenger.id.M0(2131745462, "ShareFile");
                            String M03 = org.telegram.messenger.id.M0(2131750859, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = j6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131751336, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = j6Var.F;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.id.M0(2131744148, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z9) {
                                c10 = 1;
                                str2 = org.telegram.messenger.id.M0(2131751599, "Delete");
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
                            iArr2[0] = 2131232363;
                            iArr2[c10] = 2131232365;
                            iArr2[2] = 2131232116;
                            iArr2[3] = 2131232203;
                            iArr2[4] = 2131232108;
                            iArr = iArr2;
                            z10 = z9;
                            charSequenceArr = charSequenceArr2;
                        }
                        og.j jVar = new og.j(13, f61Var, j6Var);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.P = charSequenceArr;
                        u1Var.Q = iArr;
                        u1Var.M = jVar;
                        themeActivity.showDialog(u1Var);
                        if (z10) {
                            u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28093q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28073p7, false));
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
        switch (this.f44973q3) {
            case 0:
                ((f61) this.f44974r3).f45466e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) this.f44974r3).f14323b).f28655x0.run();
                return;
        }
    }

    public d61(f61 f61Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, f2Var, i7, arrayList, arrayList2);
        this.f44974r3 = f61Var;
    }
}
