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
import org.telegram.ui.Components.pj0;
public final class fa extends pj0 {
    public final Context f29139c;
    public final ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.f29139c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.f29225k3.size() + gaVar.f29226l3.size();
        gaVar.f29228n3 = size;
        return size;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.k6 k6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) d1Var.f57056a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.f29226l3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = gaVar.f29225k3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) arrayList.get(i10);
        if (i7 == b() - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f28857a0.f29222g3;
        themesHorizontalListCell$InnerThemeView.f28858b = k6Var2;
        themesHorizontalListCell$InnerThemeView.f28864s = z10;
        themesHorizontalListCell$InnerThemeView.f28863r = z9;
        themesHorizontalListCell$InnerThemeView.F = k6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f28856a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f28864s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f28865w = 0.0f;
        org.telegram.ui.ActionBar.k6 k6Var3 = themesHorizontalListCell$InnerThemeView.f28858b;
        if (k6Var3.f27738b != null && !k6Var3.T) {
            k6Var3.Q = org.telegram.ui.ActionBar.l6.F0(org.telegram.ui.ActionBar.l6.f28128ra);
            themesHorizontalListCell$InnerThemeView.f28858b.R = org.telegram.ui.ActionBar.l6.F0(org.telegram.ui.ActionBar.l6.f28070ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f28858b.f27738b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (k6Var = themesHorizontalListCell$InnerThemeView.f28858b).F) != null) {
                if (tL_theme.document != null) {
                    k6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.f28865w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232400).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.l6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.f28858b.F.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.f28858b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f28858b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f28858b.F;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232576).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.l6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f29139c));
    }
}
