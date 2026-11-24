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
public final class e extends n39 {
    public final Context c;
    public final f d;

    public e(f fVar, Context context) {
        this.d = fVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        f fVar = this.d;
        int size = fVar.l3.size() + fVar.m3.size();
        fVar.o3 = size;
        return size;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        float f;
        akb akbVar;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) s49Var.a;
        f fVar = this.d;
        ArrayList arrayList = fVar.m3;
        if (i < arrayList.size()) {
            i2 = i;
        } else {
            ArrayList arrayList2 = fVar.l3;
            int size = i - arrayList.size();
            arrayList = arrayList2;
            i2 = size;
        }
        akb akbVar2 = (akb) arrayList.get(i2);
        if (i == b() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.b0.h3;
        themesHorizontalListCell$InnerThemeView.b = akbVar2;
        themesHorizontalListCell$InnerThemeView.s = z2;
        themesHorizontalListCell$InnerThemeView.r = z;
        themesHorizontalListCell$InnerThemeView.G = akbVar2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.s) {
            f = 49.0f;
        } else {
            f = 27.0f;
        }
        layoutParams.leftMargin = gl.L(f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        akb akbVar3 = themesHorizontalListCell$InnerThemeView.b;
        if (akbVar3.b != null && !akbVar3.U) {
            akbVar3.R = bkb.D0(bkb.qa);
            themesHorizontalListCell$InnerThemeView.b.S = bkb.D0(bkb.qb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (akbVar = themesHorizontalListCell$InnerThemeView.b).G) != null) {
                if (tL_theme.document != null) {
                    akbVar.V = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232405).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int w0 = bkb.w0(null, bkb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w0;
                    bkb.A1(w0, mutate);
                    if (!exists) {
                        String r = ba4.r(null, themesHorizontalListCell$InnerThemeView.b.G.document);
                        if (!hashMap.containsKey(r)) {
                            hashMap.put(r, themesHorizontalListCell$InnerThemeView.b);
                            ba4 G = ba4.G(themesHorizontalListCell$InnerThemeView.b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.G;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232581).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int w02 = bkb.w0(null, bkb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w02;
                    bkb.A1(w02, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
