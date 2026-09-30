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
import org.telegram.ui.Components.yl0;
public final class oa extends yl0 {
    public final Context f20797c;
    public final pa d;

    public oa(pa paVar, Context context) {
        this.d = paVar;
        this.f20797c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        pa paVar = this.d;
        int size = paVar.f20842k3.size() + paVar.f20843l3.size();
        paVar.f20845n3 = size;
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
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) c1Var.f43068a;
        pa paVar = this.d;
        ArrayList arrayList = paVar.f20843l3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = paVar.f20842k3;
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f20006a0.f20839g3;
        themesHorizontalListCell$InnerThemeView.f20007b = g6Var2;
        themesHorizontalListCell$InnerThemeView.f20012s = z11;
        themesHorizontalListCell$InnerThemeView.f20011r = z10;
        themesHorizontalListCell$InnerThemeView.F = g6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f20005a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f20012s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.g6 g6Var3 = themesHorizontalListCell$InnerThemeView.f20007b;
        if (g6Var3.f18951b != null && !g6Var3.T) {
            g6Var3.Q = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.f19337ra);
            themesHorizontalListCell$InnerThemeView.f20007b.R = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f20007b.f18951b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (g6Var = themesHorizontalListCell$InnerThemeView.f20007b).F) != null) {
                if (tL_theme.document != null) {
                    g6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = w02;
                    org.telegram.ui.ActionBar.h6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f20007b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f20007b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f20007b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f20007b.F;
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
        return new s4.c1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f20797c));
    }
}
