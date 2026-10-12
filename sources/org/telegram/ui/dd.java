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
public final class dd extends FrameLayout {
    public final int f36765a;
    public final org.telegram.ui.ActionBar.c6 f36766b;
    public final ArrayList f36767c;
    public final hc1 d;
    public final org.telegram.ui.Components.m10 f36768e;
    public boolean f36769f;
    public final bd h;
    public boolean f36770n;
    public Utilities.Callback f36771r;
    public String f36772s;
    public TLRPC.WallPaper v;
    public final HashMap f36773w;
    public final HashMap f36774x;

    public dd(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f36767c = new ArrayList();
        this.f36773w = new HashMap();
        this.f36774x = new HashMap();
        this.f36765a = i10;
        this.f36766b = c6Var;
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(getContext(), c6Var);
        this.f36768e = m10Var;
        m10Var.setViewType(14);
        m10Var.setVisibility(0);
        addView(m10Var, w7.w5.a(104.0f, 16.0f, 13.0f, 16.0f, 6.0f, -1, 8388611));
        hc1 hc1Var = new hc1(activity, 4, c6Var);
        this.d = hc1Var;
        hc1Var.setClipToPadding(false);
        hc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        hc1Var.setLayoutManager(d0Var);
        hc1Var.setAlpha(0.0f);
        bd bdVar = new bd(this, i10, c6Var);
        this.h = bdVar;
        hc1Var.setAdapter(bdVar);
        addView(hc1Var, w7.w5.d(130.0f, -1));
        hc1Var.setOnItemClickListener(new i(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new cd(this, i10), true);
        if (!this.f36770n) {
            AndroidUtilities.updateViewVisibilityAnimated(m10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(m10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f36772s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f36767c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) arrayList.get(i11);
            if (!TextUtils.equals(this.f36772s, dqVar.a()) && (!TextUtils.isEmpty(str) || !dqVar.f25449a.f20240a)) {
                z11 = false;
            }
            dqVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        hc1 hc1Var = this.d;
        if (i10 >= 0 && !z10 && (hc1Var.getLayoutManager() instanceof s4.d0)) {
            ((s4.d0) hc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < hc1Var.getChildCount(); i12++) {
            View childAt = hc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.f31) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.f31) childAt).g(((org.telegram.ui.Components.dq) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new zc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f36767c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.dq) arrayList.get(0)).f25449a.f20240a) && this.f36769f) {
                arrayList.add(0, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.b4.a(this.f36765a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f36771r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f36769f = z10;
    }
}
