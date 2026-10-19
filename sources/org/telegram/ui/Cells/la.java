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
import org.telegram.ui.Components.hm0;
public final class la extends hm0 {
    public final Context f22549c;
    public final ma d;

    public la(ma maVar, Context context) {
        this.d = maVar;
        this.f22549c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        ma maVar = this.d;
        int size = maVar.f22610b3.size() + maVar.f22611c3.size();
        maVar.f22613e3 = size;
        return size;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) b1Var.f45912a;
        ma maVar = this.d;
        ArrayList arrayList = maVar.f22611c3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = maVar.f22610b3;
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f21938a0.X2;
        themesHorizontalListCell$InnerThemeView.f21939b = g6Var2;
        themesHorizontalListCell$InnerThemeView.f21944s = z11;
        themesHorizontalListCell$InnerThemeView.f21943r = z10;
        themesHorizontalListCell$InnerThemeView.F = g6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f21937a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f21944s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.g6 g6Var3 = themesHorizontalListCell$InnerThemeView.f21939b;
        if (g6Var3.f20880b != null && !g6Var3.T) {
            g6Var3.Q = org.telegram.ui.ActionBar.h6.D0(org.telegram.ui.ActionBar.h6.f21248ra);
            themesHorizontalListCell$InnerThemeView.f21939b.R = org.telegram.ui.ActionBar.h6.D0(org.telegram.ui.ActionBar.h6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f21939b.f20880b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (g6Var = themesHorizontalListCell$InnerThemeView.f21939b).F) != null) {
                if (tL_theme.document != null) {
                    g6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.h6.x1(x02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f21939b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f21939b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f21939b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f21939b.F;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.h6.x1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f22549c));
    }
}
