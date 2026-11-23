package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e61 extends org.telegram.ui.Cells.ia {
    public final int f47117r3 = 1;
    public final Object f47118s3;

    public e61(Context context, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, ArrayList arrayList2, hi.x4 x4Var) {
        super(context, g2Var, 2, arrayList, arrayList2);
        this.f47118s3 = x4Var;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.l6 l6Var) {
        boolean z10;
        String N0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z11;
        CharSequence[] charSequenceArr;
        switch (this.f47117r3) {
            case 0:
                g61 g61Var = ((g61) this.f47118s3).f47933e.f43840a;
                ThemeActivity themeActivity = g61Var.f47933e;
                if (themeActivity.getParentActivity() != null) {
                    if ((l6Var.G == null || l6Var.V) && themeActivity.f43849f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (l6Var.f29200b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.hd.N0(2131750846, "ExportTheme")};
                            iArr = new int[]{0, 2131232367};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = l6Var.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String N02 = org.telegram.messenger.hd.N0(2131745263, "ShareFile");
                            String N03 = org.telegram.messenger.hd.N0(2131750846, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = l6Var.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                N0 = null;
                            } else {
                                N0 = org.telegram.messenger.hd.N0(2131751323, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = l6Var.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.hd.N0(2131743904, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z10) {
                                c10 = 1;
                                str2 = org.telegram.messenger.hd.N0(2131751586, "Delete");
                            } else {
                                c10 = 1;
                                str2 = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = N02;
                            charSequenceArr2[c10] = N03;
                            charSequenceArr2[2] = N0;
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
                        og.j jVar = new og.j(13, g61Var, l6Var);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.Q = charSequenceArr;
                        t1Var.R = iArr;
                        t1Var.N = jVar;
                        themeActivity.showDialog(t1Var);
                        if (z11) {
                            t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29588q7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29568p7, false));
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
        switch (this.f47117r3) {
            case 0:
                ((g61) this.f47118s3).f47933e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.w2) ((hi.x4) this.f47118s3).f15680b).f30184y0.run();
                return;
        }
    }

    public e61(g61 g61Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, g2Var, i7, arrayList, arrayList2);
        this.f47118s3 = g61Var;
    }
}
