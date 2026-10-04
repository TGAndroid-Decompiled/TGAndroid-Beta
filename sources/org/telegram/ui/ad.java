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
    public final int f34778a;
    public final org.telegram.ui.ActionBar.d6 f34779b;
    public final ArrayList f34780c;
    public final zb1 d;
    public final org.telegram.ui.Components.w00 f34781e;
    public boolean f34782f;
    public final yc h;
    public boolean f34783n;
    public Utilities.Callback f34784r;
    public String f34785s;
    public TLRPC.WallPaper v;
    public final HashMap f34786w;
    public final HashMap f34787x;

    public ad(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f34780c = new ArrayList();
        this.f34786w = new HashMap();
        this.f34787x = new HashMap();
        this.f34778a = i10;
        this.f34779b = d6Var;
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(getContext(), d6Var);
        this.f34781e = w00Var;
        w00Var.setViewType(14);
        w00Var.setVisibility(0);
        addView(w00Var, w7.z5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        zb1 zb1Var = new zb1(activity, 4, d6Var);
        this.d = zb1Var;
        zb1Var.setClipToPadding(false);
        zb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        zb1Var.setLayoutManager(c0Var);
        zb1Var.setAlpha(0.0f);
        yc ycVar = new yc(this, i10, d6Var);
        this.h = ycVar;
        zb1Var.setAdapter(ycVar);
        addView(zb1Var, w7.z5.c(130.0f, -1));
        zb1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new zc(this, i10), true);
        if (!this.f34783n) {
            AndroidUtilities.updateViewVisibilityAnimated(w00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(w00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f34785s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f34780c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) arrayList.get(i11);
            if (!TextUtils.equals(this.f34785s, opVar.a()) && (!TextUtils.isEmpty(str) || !opVar.f29422a.f20499a)) {
                z11 = false;
            }
            opVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        zb1 zb1Var = this.d;
        if (i10 >= 0 && !z10 && (zb1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) zb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < zb1Var.getChildCount(); i12++) {
            View childAt = zb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.s21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.s21) childAt).g(((org.telegram.ui.Components.op) arrayList.get(R)).d, true);
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
            ArrayList arrayList = this.f34780c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.op) arrayList.get(0)).f29422a.f20499a) && this.f34782f) {
                arrayList.add(0, new org.telegram.ui.Components.op(org.telegram.ui.ActionBar.c4.a(this.f34778a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f34784r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f34782f = z10;
    }
}
