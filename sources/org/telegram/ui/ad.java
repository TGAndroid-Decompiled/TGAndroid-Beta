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
    public final int f30891a;
    public final org.telegram.ui.ActionBar.f6 f30892b;
    public final ArrayList f30893c;
    public final ic1 d;
    public final org.telegram.ui.Components.a10 e;
    public boolean f30894f;
    public final yc h;
    public boolean f30895n;
    public Utilities.Callback f30896r;
    public String f30897s;
    public TLRPC.WallPaper v;
    public final HashMap f30898w;
    public final HashMap f30899x;

    public ad(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f30893c = new ArrayList();
        this.f30898w = new HashMap();
        this.f30899x = new HashMap();
        this.f30891a = i10;
        this.f30892b = f6Var;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(getContext(), f6Var);
        this.e = a10Var;
        a10Var.setViewType(14);
        a10Var.setVisibility(0);
        addView(a10Var, w7.a6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        ic1 ic1Var = new ic1(activity, 3, f6Var);
        this.d = ic1Var;
        ic1Var.setClipToPadding(false);
        ic1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        ic1Var.setLayoutManager(c0Var);
        ic1Var.setAlpha(0.0f);
        yc ycVar = new yc(this, i10, f6Var);
        this.h = ycVar;
        ic1Var.setAdapter(ycVar);
        addView(ic1Var, w7.a6.c(130.0f, -1));
        ic1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new zc(this, i10), true);
        if (!this.f30895n) {
            AndroidUtilities.updateViewVisibilityAnimated(a10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(a10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f30897s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f30893c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.rp rpVar = (org.telegram.ui.Components.rp) arrayList.get(i11);
            if (!TextUtils.equals(this.f30897s, rpVar.a()) && (!TextUtils.isEmpty(str) || !rpVar.f26733a.f17714a)) {
                z11 = false;
            }
            rpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        ic1 ic1Var = this.d;
        if (i10 >= 0 && !z10 && (ic1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) ic1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < ic1Var.getChildCount(); i12++) {
            View childAt = ic1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.i21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.i21) childAt).g(((org.telegram.ui.Components.rp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new wc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f30893c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.rp) arrayList.get(0)).f26733a.f17714a) && this.f30894f) {
                arrayList.add(0, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.f4.a(this.f30891a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f30896r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f30894f = z10;
    }
}
