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
import org.telegram.ui.Components.ul0;
public final class pa extends ul0 {
    public final Context f20826c;
    public final qa d;

    public pa(qa qaVar, Context context) {
        this.d = qaVar;
        this.f20826c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        qa qaVar = this.d;
        int size = qaVar.f20858d3.size() + qaVar.f20859e3.size();
        qaVar.f20861g3 = size;
        return size;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f7;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) c1Var.f42974a;
        qa qaVar = this.d;
        ArrayList arrayList = qaVar.f20859e3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = qaVar.f20858d3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) arrayList.get(i11);
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
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.f19985a0.Z2;
        themesHorizontalListCell$InnerThemeView.f19986b = i6Var2;
        themesHorizontalListCell$InnerThemeView.f19991s = z11;
        themesHorizontalListCell$InnerThemeView.f19990r = z10;
        themesHorizontalListCell$InnerThemeView.F = i6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f19984a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f19991s) {
            f7 = 49.0f;
        } else {
            f7 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.i6 i6Var3 = themesHorizontalListCell$InnerThemeView.f19986b;
        if (i6Var3.f18975b != null && !i6Var3.T) {
            i6Var3.Q = org.telegram.ui.ActionBar.j6.C0(org.telegram.ui.ActionBar.j6.f19355ra);
            themesHorizontalListCell$InnerThemeView.f19986b.R = org.telegram.ui.ActionBar.j6.C0(org.telegram.ui.ActionBar.j6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f19986b.f18975b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (i6Var = themesHorizontalListCell$InnerThemeView.f19986b).F) != null) {
                if (tL_theme.document != null) {
                    i6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = w02;
                    org.telegram.ui.ActionBar.j6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f19986b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f19986b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f19986b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f19986b.F;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = w03;
                    org.telegram.ui.ActionBar.j6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f20826c));
    }
}
