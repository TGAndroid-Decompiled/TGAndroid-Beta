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
import org.telegram.ui.Components.dk0;
public final class ha extends dk0 {
    public final Context f30769c;
    public final ia d;

    public ha(ia iaVar, Context context) {
        this.d = iaVar;
        this.f30769c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        ia iaVar = this.d;
        int size = iaVar.f30841l3.size() + iaVar.f30842m3.size();
        iaVar.f30844o3 = size;
        return size;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        float f10;
        org.telegram.ui.ActionBar.l6 l6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) e1Var.f59111a;
        ia iaVar = this.d;
        ArrayList arrayList = iaVar.f30842m3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = iaVar.f30841l3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) arrayList.get(i10);
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f30341b0.f30838h3;
        themesHorizontalListCell$InnerThemeView.f30340b = l6Var2;
        themesHorizontalListCell$InnerThemeView.f30347s = z11;
        themesHorizontalListCell$InnerThemeView.f30346r = z10;
        themesHorizontalListCell$InnerThemeView.G = l6Var2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f30338a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f30347s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f30348w = 0.0f;
        org.telegram.ui.ActionBar.l6 l6Var3 = themesHorizontalListCell$InnerThemeView.f30340b;
        if (l6Var3.f29200b != null && !l6Var3.U) {
            l6Var3.R = org.telegram.ui.ActionBar.m6.F0(org.telegram.ui.ActionBar.m6.f29610ra);
            themesHorizontalListCell$InnerThemeView.f30340b.S = org.telegram.ui.ActionBar.m6.F0(org.telegram.ui.ActionBar.m6.f29611rb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f30340b.f29200b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (l6Var = themesHorizontalListCell$InnerThemeView.f30340b).G) != null) {
                if (tL_theme.document != null) {
                    l6Var.V = false;
                    themesHorizontalListCell$InnerThemeView.f30348w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232402).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x02;
                    org.telegram.ui.ActionBar.m6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.f30340b.G.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.f30340b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f30340b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f30340b.G;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232578).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x03;
                    org.telegram.ui.ActionBar.m6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f30769c));
    }
}
