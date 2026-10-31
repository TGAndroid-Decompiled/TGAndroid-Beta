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
import org.telegram.ui.Components.sk0;
public final class fa extends sk0 {
    public final Context f21905c;
    public final ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.f21905c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.f21942k3.size() + gaVar.f21943l3.size();
        gaVar.f21945n3 = size;
        return size;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f7;
        org.telegram.ui.ActionBar.s6 s6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) c1Var.f47898a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.f21943l3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = gaVar.f21942k3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) arrayList.get(i11);
        if (i10 == b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f21643a0.f21938g3;
        themesHorizontalListCell$InnerThemeView.f21644b = s6Var2;
        themesHorizontalListCell$InnerThemeView.f21649s = z11;
        themesHorizontalListCell$InnerThemeView.f21648r = z10;
        themesHorizontalListCell$InnerThemeView.F = s6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f21642a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f21649s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.i0.L(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.f21650w = 0.0f;
        org.telegram.ui.ActionBar.s6 s6Var3 = themesHorizontalListCell$InnerThemeView.f21644b;
        if (s6Var3.f20803b != null && !s6Var3.T) {
            s6Var3.Q = org.telegram.ui.ActionBar.t6.F0(org.telegram.ui.ActionBar.t6.f21190ra);
            themesHorizontalListCell$InnerThemeView.f21644b.R = org.telegram.ui.ActionBar.t6.F0(org.telegram.ui.ActionBar.t6.f21139ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f21644b.f20803b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (s6Var = themesHorizontalListCell$InnerThemeView.f21644b).F) != null) {
                if (tL_theme.document != null) {
                    s6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.f21650w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232399).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.t6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.b8.r(null, themesHorizontalListCell$InnerThemeView.f21644b.F.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.f21644b);
                            org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(themesHorizontalListCell$InnerThemeView.f21644b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f21644b.F;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232573).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.t6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f21905c));
    }
}
