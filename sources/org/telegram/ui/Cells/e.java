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
public final class e extends q59 {
    public final Context c;
    public final f d;

    public e(f fVar, Context context) {
        this.d = fVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
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
    public final void t(u69 u69Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        float f;
        bmb bmbVar;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) u69Var.a;
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
        bmb bmbVar2 = (bmb) arrayList.get(i2);
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
        themesHorizontalListCell$InnerThemeView.b = bmbVar2;
        themesHorizontalListCell$InnerThemeView.s = z2;
        themesHorizontalListCell$InnerThemeView.r = z;
        themesHorizontalListCell$InnerThemeView.G = bmbVar2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.s) {
            f = 49.0f;
        } else {
            f = 27.0f;
        }
        layoutParams.leftMargin = gm.L(f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        bmb bmbVar3 = themesHorizontalListCell$InnerThemeView.b;
        if (bmbVar3.b != null && !bmbVar3.U) {
            bmbVar3.R = cmb.D0(cmb.qa);
            themesHorizontalListCell$InnerThemeView.b.S = cmb.D0(cmb.qb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (bmbVar = themesHorizontalListCell$InnerThemeView.b).G) != null) {
                if (tL_theme.document != null) {
                    bmbVar.V = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232406).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int w0 = cmb.w0(null, cmb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w0;
                    cmb.A1(w0, mutate);
                    if (!exists) {
                        String r = bc4.r(null, themesHorizontalListCell$InnerThemeView.b.G.document);
                        if (!hashMap.containsKey(r)) {
                            hashMap.put(r, themesHorizontalListCell$InnerThemeView.b);
                            bc4 G = bc4.G(themesHorizontalListCell$InnerThemeView.b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.G;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(2131232593).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int w02 = cmb.w0(null, cmb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w02;
                    cmb.A1(w02, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
