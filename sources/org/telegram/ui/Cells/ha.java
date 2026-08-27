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
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public final class ha extends yk0 {

    public final Context f24466c;
    public final ia d;

    public ha(ia iaVar, Context context) {
        this.d = iaVar;
        this.f24466c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        ia iaVar = this.d;
        int size = iaVar.Z2.size() + iaVar.a3.size();
        iaVar.f24502c3 = size;
        return size;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) o1Var.f5789a;
        ia iaVar = this.d;
        ArrayList arrayList = iaVar.a3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = iaVar.Z2;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) arrayList.get(i11);
        boolean z10 = i10 == h() - 1;
        boolean z11 = i10 == 0;
        HashMap map = themesHorizontalListCell$InnerThemeView.T.V2;
        themesHorizontalListCell$InnerThemeView.f24036b = f6Var2;
        themesHorizontalListCell$InnerThemeView.f24042s = z11;
        themesHorizontalListCell$InnerThemeView.f24041r = z10;
        themesHorizontalListCell$InnerThemeView.B = f6Var2.U;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f24035a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(themesHorizontalListCell$InnerThemeView.f24042s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.f6 f6Var3 = themesHorizontalListCell$InnerThemeView.f24036b;
        if (f6Var3.f22943b != null && !f6Var3.P) {
            f6Var3.M = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.f23305ra);
            themesHorizontalListCell$InnerThemeView.f24036b.N = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Aa);
            boolean zExists = new File(themesHorizontalListCell$InnerThemeView.f24036b.f22943b).exists();
            if ((!zExists || !themesHorizontalListCell$InnerThemeView.c() || !zExists) && (tL_theme = (f6Var = themesHorizontalListCell$InnerThemeView.f24036b).B) != null) {
                if (tL_theme.document != null) {
                    f6Var.Q = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable drawableMutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.P = drawableMutate;
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
                    themesHorizontalListCell$InnerThemeView.Q = iW0;
                    org.telegram.ui.ActionBar.g6.w1(iW0, drawableMutate);
                    if (!zExists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.f24036b.B.document);
                        if (!map.containsKey(attachFileName)) {
                            map.put(attachFileName, themesHorizontalListCell$InnerThemeView.f24036b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.f24036b.A);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.f24036b.B;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable drawableMutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.P = drawableMutate2;
                    int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
                    themesHorizontalListCell$InnerThemeView.Q = iW1;
                    org.telegram.ui.ActionBar.g6.w1(iW1, drawableMutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.f24466c));
    }
}
