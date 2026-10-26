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
import org.telegram.ui.Components.lm0;
public final class qa extends lm0 {
    public final Context f24840c;
    public final ra d;

    public qa(ra raVar, Context context) {
        this.d = raVar;
        this.f24840c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        ra raVar = this.d;
        int size = raVar.f25005l3.size() + raVar.f25006m3.size();
        raVar.f25008o3 = size;
        return size;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f7;
        org.telegram.ui.ActionBar.x6 x6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) e1Var.f47738a;
        ra raVar = this.d;
        ArrayList arrayList = raVar.f25006m3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = raVar.f25005l3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.x6 x6Var2 = (org.telegram.ui.ActionBar.x6) arrayList.get(i11);
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f23825a0.f25001h3;
        themesHorizontalListCell$InnerThemeView.f23826b = x6Var2;
        themesHorizontalListCell$InnerThemeView.f23831s = z11;
        themesHorizontalListCell$InnerThemeView.f23830r = z10;
        themesHorizontalListCell$InnerThemeView.F = x6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f23824a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f23831s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.x6 x6Var3 = themesHorizontalListCell$InnerThemeView.f23826b;
        if (x6Var3.f23253b != null && !x6Var3.T) {
            x6Var3.Q = org.telegram.ui.ActionBar.y6.E0(org.telegram.ui.ActionBar.y6.f23618ra);
            themesHorizontalListCell$InnerThemeView.f23826b.R = org.telegram.ui.ActionBar.y6.E0(org.telegram.ui.ActionBar.y6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f23826b.f23253b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (x6Var = themesHorizontalListCell$InnerThemeView.f23826b).F) != null) {
                if (tL_theme.document != null) {
                    x6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.y6.z1(x02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f23826b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f23826b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f23826b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f23826b.F;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.y6.z1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f24840c));
    }
}
