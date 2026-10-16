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
public final class ma extends lm0 {
    public final Context f21231c;
    public final na d;

    public ma(na naVar, Context context) {
        this.d = naVar;
        this.f21231c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        na naVar = this.d;
        int size = naVar.f21300b3.size() + naVar.f21301c3.size();
        naVar.f21303e3 = size;
        return size;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f7;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) b1Var.f44838a;
        na naVar = this.d;
        ArrayList arrayList = naVar.f21301c3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = naVar.f21300b3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) arrayList.get(i11);
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f20578a0.X2;
        themesHorizontalListCell$InnerThemeView.f20579b = f6Var2;
        themesHorizontalListCell$InnerThemeView.f20584s = z11;
        themesHorizontalListCell$InnerThemeView.f20583r = z10;
        themesHorizontalListCell$InnerThemeView.F = f6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f20577a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f20584s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.f6 f6Var3 = themesHorizontalListCell$InnerThemeView.f20579b;
        if (f6Var3.f19493b != null && !f6Var3.T) {
            f6Var3.Q = org.telegram.ui.ActionBar.g6.D0(org.telegram.ui.ActionBar.g6.f19862ra);
            themesHorizontalListCell$InnerThemeView.f20579b.R = org.telegram.ui.ActionBar.g6.D0(org.telegram.ui.ActionBar.g6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f20579b.f19493b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (f6Var = themesHorizontalListCell$InnerThemeView.f20579b).F) != null) {
                if (tL_theme.document != null) {
                    f6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.g6.x1(x02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f20579b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f20579b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f20579b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f20579b.F;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.g6.x1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f21231c));
    }
}
