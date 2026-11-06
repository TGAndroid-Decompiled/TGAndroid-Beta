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
import org.telegram.ui.Components.oj0;
public final class fa extends oj0 {
    public final Context f29132c;
    public final ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.f29132c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.f29218k3.size() + gaVar.f29219l3.size();
        gaVar.f29221n3 = size;
        return size;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) d1Var.f56951a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.f29219l3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = gaVar.f29218k3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) arrayList.get(i10);
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f28850a0.f29215g3;
        themesHorizontalListCell$InnerThemeView.f28851b = j6Var2;
        themesHorizontalListCell$InnerThemeView.f28857s = z10;
        themesHorizontalListCell$InnerThemeView.f28856r = z9;
        themesHorizontalListCell$InnerThemeView.F = j6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f28849a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f28857s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f28858w = 0.0f;
        org.telegram.ui.ActionBar.j6 j6Var3 = themesHorizontalListCell$InnerThemeView.f28851b;
        if (j6Var3.f27628b != null && !j6Var3.T) {
            j6Var3.Q = org.telegram.ui.ActionBar.k6.F0(org.telegram.ui.ActionBar.k6.f28112ra);
            themesHorizontalListCell$InnerThemeView.f28851b.R = org.telegram.ui.ActionBar.k6.F0(org.telegram.ui.ActionBar.k6.f28054ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f28851b.f27628b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (j6Var = themesHorizontalListCell$InnerThemeView.f28851b).F) != null) {
                if (tL_theme.document != null) {
                    j6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.f28858w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232400).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.k6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.f28851b.F.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.f28851b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f28851b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f28851b.F;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232576).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.k6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f29132c));
    }
}
