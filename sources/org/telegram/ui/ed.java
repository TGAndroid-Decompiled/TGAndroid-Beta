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
public final class ed extends FrameLayout {
    public final int f35256a;
    public final org.telegram.ui.ActionBar.c6 f35257b;
    public final ArrayList f35258c;
    public final kc1 d;
    public final org.telegram.ui.Components.f10 e;
    public boolean f35259f;
    public final cd h;
    public boolean f35260n;
    public Utilities.Callback f35261r;
    public String f35262s;
    public TLRPC.WallPaper v;
    public final HashMap f35263w;
    public final HashMap f35264x;

    public ed(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f35258c = new ArrayList();
        this.f35263w = new HashMap();
        this.f35264x = new HashMap();
        this.f35256a = i10;
        this.f35257b = c6Var;
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(getContext(), c6Var);
        this.e = f10Var;
        f10Var.setViewType(14);
        f10Var.setVisibility(0);
        addView(f10Var, w7.z5.a(104.0f, 16.0f, 13.0f, 16.0f, 6.0f, -1, 8388611));
        kc1 kc1Var = new kc1(activity, 4, c6Var);
        this.d = kc1Var;
        kc1Var.setClipToPadding(false);
        kc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        kc1Var.setLayoutManager(b0Var);
        kc1Var.setAlpha(0.0f);
        cd cdVar = new cd(this, i10, c6Var);
        this.h = cdVar;
        kc1Var.setAdapter(cdVar);
        addView(kc1Var, w7.z5.d(130.0f, -1));
        kc1Var.setOnItemClickListener(new i(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new dd(this, i10), true);
        if (!this.f35260n) {
            AndroidUtilities.updateViewVisibilityAnimated(f10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(f10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f35262s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f35258c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i11);
            if (!TextUtils.equals(this.f35262s, ypVar.a()) && (!TextUtils.isEmpty(str) || !ypVar.f31345a.f19342a)) {
                z11 = false;
            }
            ypVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        kc1 kc1Var = this.d;
        if (i10 >= 0 && !z10 && (kc1Var.getLayoutManager() instanceof s4.b0)) {
            ((s4.b0) kc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < kc1Var.getChildCount(); i12++) {
            View childAt = kc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.w21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.w21) childAt).g(((org.telegram.ui.Components.yp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new ad(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f35258c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.yp) arrayList.get(0)).f31345a.f19342a) && this.f35259f) {
                arrayList.add(0, new org.telegram.ui.Components.yp(org.telegram.ui.ActionBar.b4.a(this.f35256a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f35261r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f35259f = z10;
    }
}
