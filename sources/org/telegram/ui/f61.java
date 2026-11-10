package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f61 extends org.telegram.ui.Cells.ga {
    public final int f45629q3 = 1;
    public final Object f45630r3;

    public f61(Context context, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, ArrayList arrayList2, h9.f1 f1Var) {
        super(context, f2Var, 2, arrayList, arrayList2);
        this.f45630r3 = f1Var;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.l6 l6Var) {
        boolean z9;
        String M0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.f45629q3) {
            case 0:
                h61 h61Var = ((h61) this.f45630r3).f46233e.f42009a;
                ThemeActivity themeActivity = h61Var.f46233e;
                if (themeActivity.getParentActivity() != null) {
                    if ((l6Var.F == null || l6Var.U) && themeActivity.f42018f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (l6Var.f27767b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.id.M0(2131750858, "ExportTheme")};
                            iArr = new int[]{0, 2131232365};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = l6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            String M02 = org.telegram.messenger.id.M0(2131745459, "ShareFile");
                            String M03 = org.telegram.messenger.id.M0(2131750858, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = l6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131751335, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = l6Var.F;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.id.M0(2131744145, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z9) {
                                c10 = 1;
                                str2 = org.telegram.messenger.id.M0(2131751598, "Delete");
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
                        og.j jVar = new og.j(13, h61Var, l6Var);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.P = charSequenceArr;
                        u1Var.Q = iArr;
                        u1Var.M = jVar;
                        themeActivity.showDialog(u1Var);
                        if (z10) {
                            u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28131q7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28111p7, false));
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
        switch (this.f45629q3) {
            case 0:
                ((h61) this.f45630r3).f46233e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) this.f45630r3).f14325b).f28711x0.run();
                return;
        }
    }

    public f61(h61 h61Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, f2Var, i7, arrayList, arrayList2);
        this.f45630r3 = h61Var;
    }
}
