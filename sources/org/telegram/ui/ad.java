package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad extends FrameLayout {
    public final int f32047a;
    public final org.telegram.ui.ActionBar.e6 f32048b;
    public final ArrayList f32049c;
    public final wb1 d;
    public final org.telegram.ui.Components.v00 e;
    public boolean f32050f;
    public final yc h;
    public boolean f32051n;
    public Utilities.Callback f32052r;
    public String f32053s;
    public TLRPC.WallPaper v;
    public final HashMap f32054w;
    public final HashMap f32055x;

    public ad(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f32049c = new ArrayList();
        this.f32054w = new HashMap();
        this.f32055x = new HashMap();
        this.f32047a = i10;
        this.f32048b = e6Var;
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(getContext(), e6Var);
        this.e = v00Var;
        v00Var.setViewType(14);
        v00Var.setVisibility(0);
        addView(v00Var, w7.y5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        wb1 wb1Var = new wb1(activity, 4, e6Var);
        this.d = wb1Var;
        wb1Var.setClipToPadding(false);
        wb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        wb1Var.setLayoutManager(c0Var);
        wb1Var.setAlpha(0.0f);
        yc ycVar = new yc(this, i10, e6Var);
        this.h = ycVar;
        wb1Var.setAdapter(ycVar);
        addView(wb1Var, w7.y5.c(130.0f, -1));
        wb1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new zc(this, i10), true);
        if (!this.f32051n) {
            AndroidUtilities.updateViewVisibilityAnimated(v00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(v00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int S;
        this.f32053s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f32049c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) arrayList.get(i11);
            if (!TextUtils.equals(this.f32053s, npVar.a()) && (!TextUtils.isEmpty(str) || !npVar.f26877a.f18800a)) {
                z11 = false;
            }
            npVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        wb1 wb1Var = this.d;
        if (i10 >= 0 && !z10 && (wb1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) wb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < wb1Var.getChildCount(); i12++) {
            View childAt = wb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.j21) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                ((org.telegram.ui.Components.j21) childAt).g(((org.telegram.ui.Components.np) arrayList.get(S)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new wc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f32049c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.np) arrayList.get(0)).f26877a.f18800a) && this.f32050f) {
                arrayList.add(0, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.d4.a(this.f32047a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f32052r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f32050f = z10;
    }
}
