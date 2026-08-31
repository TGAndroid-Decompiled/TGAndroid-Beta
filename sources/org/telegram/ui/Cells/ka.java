package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.sl0;
public final class ka extends sl0 {
    public final Context f23085c;
    public final la d;

    public ka(la laVar, Context context) {
        this.d = laVar;
        this.f23085c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        la laVar = this.d;
        int size = laVar.f23136a3.size() + laVar.f23137b3.size();
        laVar.f23138d3 = size;
        return size;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) m1Var.f5875a;
        la laVar = this.d;
        ArrayList arrayList = laVar.f23137b3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = laVar.f23136a3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) arrayList.get(i11);
        if (i10 == h() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.U.W2;
        themesHorizontalListCell$InnerThemeView.f22519b = j6Var2;
        themesHorizontalListCell$InnerThemeView.f22525s = z10;
        themesHorizontalListCell$InnerThemeView.f22524r = z4;
        themesHorizontalListCell$InnerThemeView.C = j6Var2.V;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f22518a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f22525s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.j6 j6Var3 = themesHorizontalListCell$InnerThemeView.f22519b;
        if (j6Var3.f21505b != null && !j6Var3.Q) {
            j6Var3.N = org.telegram.ui.ActionBar.k6.C0(org.telegram.ui.ActionBar.k6.f21916ra);
            themesHorizontalListCell$InnerThemeView.f22519b.O = org.telegram.ui.ActionBar.k6.C0(org.telegram.ui.ActionBar.k6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f22519b.f21505b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (j6Var = themesHorizontalListCell$InnerThemeView.f22519b).C) != null) {
                if (tL_theme.document != null) {
                    j6Var.R = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.Q = mutate;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.R = w02;
                    org.telegram.ui.ActionBar.k6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f22519b.C.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f22519b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f22519b.B);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f22519b.C;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.Q = mutate2;
                    int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.R = w03;
                    org.telegram.ui.ActionBar.k6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f23085c));
    }
}
