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
import org.telegram.ui.Components.sj0;
public final class fa extends sj0 {
    public final Context f29249c;
    public final ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.f29249c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.f29283l3.size() + gaVar.f29284m3.size();
        gaVar.f29286o3 = size;
        return size;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        boolean z10;
        boolean z11;
        float f10;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) d1Var.f55540a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.f29284m3;
        if (i3 < arrayList.size()) {
            i10 = i3;
        } else {
            ArrayList arrayList2 = gaVar.f29283l3;
            int size = i3 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) arrayList.get(i10);
        if (i3 == b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f28913b0.f29280h3;
        themesHorizontalListCell$InnerThemeView.f28912b = j6Var2;
        themesHorizontalListCell$InnerThemeView.f28919s = z11;
        themesHorizontalListCell$InnerThemeView.f28918r = z10;
        themesHorizontalListCell$InnerThemeView.G = j6Var2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f28910a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f28919s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f28920w = 0.0f;
        org.telegram.ui.ActionBar.j6 j6Var3 = themesHorizontalListCell$InnerThemeView.f28912b;
        if (j6Var3.f27677b != null && !j6Var3.U) {
            j6Var3.R = org.telegram.ui.ActionBar.k6.F0(org.telegram.ui.ActionBar.k6.f28143ra);
            themesHorizontalListCell$InnerThemeView.f28912b.S = org.telegram.ui.ActionBar.k6.F0(org.telegram.ui.ActionBar.k6.f28086ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f28912b.f27677b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (j6Var = themesHorizontalListCell$InnerThemeView.f28912b).G) != null) {
                if (tL_theme.document != null) {
                    j6Var.V = false;
                    themesHorizontalListCell$InnerThemeView.f28920w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232400).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x02;
                    org.telegram.ui.ActionBar.k6.C1(x02, mutate);
                    if (!exists) {
                        String r5 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.f28912b.G.document);
                        if (!hashMap.containsKey(r5)) {
                            hashMap.put(r5, themesHorizontalListCell$InnerThemeView.f28912b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f28912b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f28912b.G;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232574).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x03;
                    org.telegram.ui.ActionBar.k6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f29249c));
    }
}
