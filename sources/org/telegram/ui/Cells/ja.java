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
import org.telegram.ui.Components.ql0;
public final class ja extends ql0 {
    public final Context f21249c;
    public final ka d;

    public ja(ka kaVar, Context context) {
        this.d = kaVar;
        this.f21249c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        ka kaVar = this.d;
        int size = kaVar.f21297a3.size() + kaVar.f21298b3.size();
        kaVar.f21299d3 = size;
        return size;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) l1Var.f5774a;
        ka kaVar = this.d;
        ArrayList arrayList = kaVar.f21298b3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = kaVar.f21297a3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) arrayList.get(i11);
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
        themesHorizontalListCell$InnerThemeView.f20775b = i6Var2;
        themesHorizontalListCell$InnerThemeView.f20780s = z10;
        themesHorizontalListCell$InnerThemeView.f20779r = z4;
        themesHorizontalListCell$InnerThemeView.C = i6Var2.V;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f20774a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (themesHorizontalListCell$InnerThemeView.f20780s) {
            f10 = 49.0f;
        } else {
            f10 = 27.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.i6 i6Var3 = themesHorizontalListCell$InnerThemeView.f20775b;
        if (i6Var3.f19782b != null && !i6Var3.Q) {
            i6Var3.N = org.telegram.ui.ActionBar.j6.C0(org.telegram.ui.ActionBar.j6.f20136ra);
            themesHorizontalListCell$InnerThemeView.f20775b.O = org.telegram.ui.ActionBar.j6.C0(org.telegram.ui.ActionBar.j6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.f20775b.f19782b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (i6Var = themesHorizontalListCell$InnerThemeView.f20775b).C) != null) {
                if (tL_theme.document != null) {
                    i6Var.R = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.Q = mutate;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.R = w02;
                    org.telegram.ui.ActionBar.j6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f20775b.C.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.f20775b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f20775b.B);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f20775b.C;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.Q = mutate2;
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.R = w03;
                    org.telegram.ui.ActionBar.j6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f21249c));
    }
}
