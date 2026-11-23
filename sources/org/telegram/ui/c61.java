package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c61 extends org.telegram.ui.Cells.ja {
    public final int f46723r3 = 1;
    public final Object f46724s3;

    public c61(Context context, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, ArrayList arrayList2, h6.o oVar) {
        super(context, g2Var, 2, arrayList, arrayList2);
        this.f46724s3 = oVar;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.m6 m6Var) {
        boolean z10;
        String N0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z11;
        CharSequence[] charSequenceArr;
        switch (this.f46723r3) {
            case 0:
                e61 e61Var = ((e61) this.f46724s3).f47460e.f43956a;
                ThemeActivity themeActivity = e61Var.f47460e;
                if (themeActivity.getParentActivity() != null) {
                    if ((m6Var.G == null || m6Var.V) && themeActivity.f43965f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (m6Var.f29322b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.gd.N0(2131750846, "ExportTheme")};
                            iArr = new int[]{0, 2131232370};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = m6Var.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String N02 = org.telegram.messenger.gd.N0(2131745263, "ShareFile");
                            String N03 = org.telegram.messenger.gd.N0(2131750846, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = m6Var.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                N0 = null;
                            } else {
                                N0 = org.telegram.messenger.gd.N0(2131751323, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = m6Var.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.gd.N0(2131743900, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z10) {
                                c10 = 1;
                                str2 = org.telegram.messenger.gd.N0(2131751586, "Delete");
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
                            iArr2[0] = 2131232368;
                            iArr2[c10] = 2131232370;
                            iArr2[2] = 2131232121;
                            iArr2[3] = 2131232208;
                            iArr2[4] = 2131232113;
                            iArr = iArr2;
                            z11 = z10;
                            charSequenceArr = charSequenceArr2;
                        }
                        og.j jVar = new og.j(13, e61Var, m6Var);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.Q = charSequenceArr;
                        t1Var.R = iArr;
                        t1Var.N = jVar;
                        themeActivity.showDialog(t1Var);
                        if (z11) {
                            t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29692q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29672p7, false));
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
        switch (this.f46723r3) {
            case 0:
                ((e61) this.f46724s3).f47460e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.w2) ((h6.o) this.f46724s3).f13936b).f30268y0.run();
                return;
        }
    }

    public c61(e61 e61Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, g2Var, i7, arrayList, arrayList2);
        this.f46724s3 = e61Var;
    }
}
