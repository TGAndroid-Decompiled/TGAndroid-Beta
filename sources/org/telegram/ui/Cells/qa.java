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
import org.telegram.ui.Components.ll0;
public final class qa extends ll0 {
    public final Context f20606c;
    public final ra d;

    public qa(ra raVar, Context context) {
        this.d = raVar;
        this.f20606c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        ra raVar = this.d;
        int size = raVar.f20781d3.size() + raVar.f20782e3.size();
        raVar.f20784g3 = size;
        return size;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) c1Var.f42627a;
        ra raVar = this.d;
        ArrayList arrayList = raVar.f20782e3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = raVar.f20781d3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) arrayList.get(i11);
        if (i10 == h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f19735a0.Z2;
        themesHorizontalListCell$InnerThemeView.f19736b = g6Var2;
        themesHorizontalListCell$InnerThemeView.f19741s = z11;
        themesHorizontalListCell$InnerThemeView.f19740r = z10;
        themesHorizontalListCell$InnerThemeView.F = g6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f19734a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f19741s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.g6 g6Var3 = themesHorizontalListCell$InnerThemeView.f19736b;
        if (g6Var3.f18684b != null && !g6Var3.T) {
            g6Var3.Q = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.f19048ra);
            themesHorizontalListCell$InnerThemeView.f19736b.R = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f19736b.f18684b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (g6Var = themesHorizontalListCell$InnerThemeView.f19736b).F) != null) {
                if (tL_theme.document != null) {
                    g6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = w02;
                    org.telegram.ui.ActionBar.h6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f19736b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f19736b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f19736b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f19736b.F;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = w03;
                    org.telegram.ui.ActionBar.h6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f20606c));
    }
}
