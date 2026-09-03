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
    public final int f32840a;
    public final org.telegram.ui.ActionBar.f6 f32841b;
    public final ArrayList f32842c;
    public final rb1 d;
    public final org.telegram.ui.Components.u00 e;
    public boolean f32843f;
    public final zc h;
    public boolean f32844n;
    public Utilities.Callback f32845r;
    public String f32846s;
    public TLRPC.WallPaper v;
    public final HashMap f32847w;
    public final HashMap f32848x;

    public bd(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f32842c = new ArrayList();
        this.f32847w = new HashMap();
        this.f32848x = new HashMap();
        this.f32840a = i10;
        this.f32841b = f6Var;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), f6Var);
        this.e = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        rb1 rb1Var = new rb1(activity, 3, f6Var);
        this.d = rb1Var;
        rb1Var.setClipToPadding(false);
        rb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        rb1Var.setLayoutManager(i0Var);
        rb1Var.setAlpha(0.0f);
        zc zcVar = new zc(this, i10, f6Var);
        this.h = zcVar;
        rb1Var.setAdapter(zcVar);
        addView(rb1Var, k7.b6.c(130.0f, -1));
        rb1Var.setOnItemClickListener(new j(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new ad(this, i10), true);
        if (!this.f32844n) {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z4) {
        ArrayList arrayList;
        int R;
        this.f32846s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f32842c;
            boolean z10 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.ip ipVar = (org.telegram.ui.Components.ip) arrayList.get(i11);
            if (!TextUtils.equals(this.f32846s, ipVar.a()) && (!TextUtils.isEmpty(str) || !ipVar.f25749a.f19638a)) {
                z10 = false;
            }
            ipVar.d = z10;
            if (z10) {
                i10 = i11;
            }
            i11++;
        }
        rb1 rb1Var = this.d;
        if (i10 >= 0 && !z4 && (rb1Var.getLayoutManager() instanceof f2.i0)) {
            ((f2.i0) rb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < rb1Var.getChildCount(); i12++) {
            View childAt = rb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.w11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.w11) childAt).g(((org.telegram.ui.Components.ip) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new xc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f32842c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.ip) arrayList.get(0)).f25749a.f19638a) && this.f32843f) {
                arrayList.add(0, new org.telegram.ui.Components.ip(org.telegram.ui.ActionBar.e4.a(this.f32840a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f32845r = callback;
    }

    public void setWithRemovedStub(boolean z4) {
        this.f32843f = z4;
    }
}
