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
public final class ia extends dk0 {
    public final Context f30934c;
    public final ja d;

    public ia(ja jaVar, Context context) {
        this.d = jaVar;
        this.f30934c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        ja jaVar = this.d;
        int size = jaVar.f30988l3.size() + jaVar.f30989m3.size();
        jaVar.f30991o3 = size;
        return size;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        float f10;
        org.telegram.ui.ActionBar.m6 m6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) f1Var.f59245a;
        ja jaVar = this.d;
        ArrayList arrayList = jaVar.f30989m3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = jaVar.f30988l3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) arrayList.get(i10);
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f30434b0.f30985h3;
        themesHorizontalListCell$InnerThemeView.f30433b = m6Var2;
        themesHorizontalListCell$InnerThemeView.f30440s = z11;
        themesHorizontalListCell$InnerThemeView.f30439r = z10;
        themesHorizontalListCell$InnerThemeView.G = m6Var2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f30431a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f30440s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f30441w = 0.0f;
        org.telegram.ui.ActionBar.m6 m6Var3 = themesHorizontalListCell$InnerThemeView.f30433b;
        if (m6Var3.f29322b != null && !m6Var3.U) {
            m6Var3.R = org.telegram.ui.ActionBar.n6.F0(org.telegram.ui.ActionBar.n6.f29714ra);
            themesHorizontalListCell$InnerThemeView.f30433b.S = org.telegram.ui.ActionBar.n6.F0(org.telegram.ui.ActionBar.n6.f29715rb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f30433b.f29322b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (m6Var = themesHorizontalListCell$InnerThemeView.f30433b).G) != null) {
                if (tL_theme.document != null) {
                    m6Var.V = false;
                    themesHorizontalListCell$InnerThemeView.f30441w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232405).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x02;
                    org.telegram.ui.ActionBar.n6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.f30433b.G.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.f30433b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.f30433b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f30433b.G;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232581).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x03;
                    org.telegram.ui.ActionBar.n6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f30934c));
    }
}
