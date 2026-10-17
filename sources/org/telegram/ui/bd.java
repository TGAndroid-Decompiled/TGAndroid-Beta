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
public final class bd extends FrameLayout {
    public final int f35646a;
    public final org.telegram.ui.ActionBar.d6 f35647b;
    public final ArrayList f35648c;
    public final ua1 d;
    public final org.telegram.ui.Components.b10 e;
    public boolean f35649f;
    public final zc h;
    public boolean f35650n;
    public Utilities.Callback f35651r;
    public String f35652s;
    public TLRPC.WallPaper v;
    public final HashMap f35653w;
    public final HashMap f35654x;

    public bd(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f35648c = new ArrayList();
        this.f35653w = new HashMap();
        this.f35654x = new HashMap();
        this.f35646a = i10;
        this.f35647b = d6Var;
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getContext(), d6Var);
        this.e = b10Var;
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        addView(b10Var, w7.z5.a(104.0f, 16.0f, 13.0f, 16.0f, 6.0f, -1, 8388611));
        ua1 ua1Var = new ua1(activity, 4, d6Var);
        this.d = ua1Var;
        ua1Var.setClipToPadding(false);
        ua1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        ua1Var.setLayoutManager(b0Var);
        ua1Var.setAlpha(0.0f);
        zc zcVar = new zc(this, i10, d6Var);
        this.h = zcVar;
        ua1Var.setAdapter(zcVar);
        addView(ua1Var, w7.z5.d(130.0f, -1));
        ua1Var.setOnItemClickListener(new i(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new ad(this, i10), true);
        if (!this.f35650n) {
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f35652s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f35648c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(i11);
            if (!TextUtils.equals(this.f35652s, vpVar.a()) && (!TextUtils.isEmpty(str) || !vpVar.f31889a.f20719a)) {
                z11 = false;
            }
            vpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        ua1 ua1Var = this.d;
        if (i10 >= 0 && !z10 && (ua1Var.getLayoutManager() instanceof s4.b0)) {
            ((s4.b0) ua1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < ua1Var.getChildCount(); i12++) {
            View childAt = ua1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.p21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.p21) childAt).g(((org.telegram.ui.Components.vp) arrayList.get(R)).d, true);
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
            ArrayList arrayList = this.f35648c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.vp) arrayList.get(0)).f31889a.f20719a) && this.f35649f) {
                arrayList.add(0, new org.telegram.ui.Components.vp(org.telegram.ui.ActionBar.c4.a(this.f35646a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f35651r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f35649f = z10;
    }
}
