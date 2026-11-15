package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.tj0;
public final class fa extends tj0 {
    public final Context f30308c;
    public final ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.f30308c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.f30342l3.size() + gaVar.f30343m3.size();
        gaVar.f30345o3 = size;
        return size;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        float f10;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) e1Var.f58535a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.f30343m3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = gaVar.f30342l3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) arrayList.get(i10);
        if (i7 == b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f29969b0.f30339h3;
        themesHorizontalListCell$InnerThemeView.f29968b = i6Var2;
        themesHorizontalListCell$InnerThemeView.f29975s = z11;
        themesHorizontalListCell$InnerThemeView.f29974r = z10;
        themesHorizontalListCell$InnerThemeView.G = i6Var2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f29966a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f29975s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f29976w = 0.0f;
        org.telegram.ui.ActionBar.i6 i6Var3 = themesHorizontalListCell$InnerThemeView.f29968b;
        if (i6Var3.f28700b != null && !i6Var3.U) {
            i6Var3.R = org.telegram.ui.ActionBar.j6.F0(org.telegram.ui.ActionBar.j6.f29112ra);
            themesHorizontalListCell$InnerThemeView.f29968b.S = org.telegram.ui.ActionBar.j6.F0(org.telegram.ui.ActionBar.j6.f29113rb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f29968b.f28700b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (i6Var = themesHorizontalListCell$InnerThemeView.f29968b).G) != null) {
                if (tL_theme.document != null) {
                    i6Var.V = false;
                    themesHorizontalListCell$InnerThemeView.f29976w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232401).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x02;
                    org.telegram.ui.ActionBar.j6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.f29968b.G.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.f29968b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f29968b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f29968b.G;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232577).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x03;
                    org.telegram.ui.ActionBar.j6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f30308c));
    }
}
