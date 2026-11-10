package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int f48740a;
    public final org.telegram.ui.ActionBar.h6 f48741b;
    public final ArrayList f48742c;
    public final g61 d;
    public final org.telegram.ui.Components.lz f48743e;
    public boolean f48744f;
    public final nc h;
    public boolean f48745n;
    public org.telegram.messenger.c20 f48746r;
    public String f48747s;
    public TLRPC.WallPaper f48748w;
    public final HashMap f48749x;
    public final HashMap f48750y;

    public pc(int i7, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f48742c = new ArrayList();
        this.f48749x = new HashMap();
        this.f48750y = new HashMap();
        this.f48740a = i7;
        this.f48741b = h6Var;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(getContext(), h6Var);
        this.f48743e = lzVar;
        lzVar.setViewType(14);
        lzVar.setVisibility(0);
        addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        g61 g61Var = new g61(4, activity, h6Var);
        this.d = g61Var;
        g61Var.setClipToPadding(false);
        g61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        g61Var.setLayoutManager(b0Var);
        g61Var.setAlpha(0.0f);
        nc ncVar = new nc(this, i7, h6Var);
        this.h = ncVar;
        g61Var.setAdapter(ncVar);
        addView(g61Var, c8.ha.c(130.0f, -1));
        g61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new oc(this, i7), true);
        if (!this.f48745n) {
            org.telegram.messenger.g0.Z3(lzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(lzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z9) {
        ArrayList arrayList;
        int R;
        this.f48747s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f48742c;
            boolean z10 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i10);
            if (!TextUtils.equals(this.f48747s, uoVar.a()) && (!TextUtils.isEmpty(str) || !uoVar.f38725a.f28485a)) {
                z10 = false;
            }
            uoVar.d = z10;
            if (z10) {
                i7 = i10;
            }
            i10++;
        }
        g61 g61Var = this.d;
        if (i7 >= 0 && !z9 && (g61Var.getLayoutManager() instanceof v4.b0)) {
            ((v4.b0) g61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
            View childAt = g61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.zz0) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.zz0) childAt).g(((org.telegram.ui.Components.uo) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f48748w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new lc(this, 1));
        if (this.f48748w != null) {
            ArrayList arrayList = this.f48742c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.uo) arrayList.get(0)).f38725a.f28485a) && this.f48744f) {
                arrayList.add(0, new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.s3.a(this.f48740a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.c20 c20Var) {
        this.f48746r = c20Var;
    }

    public void setWithRemovedStub(boolean z9) {
        this.f48744f = z9;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        nc ncVar;
        org.telegram.ui.ActionBar.h6 h6Var = this.f48741b;
        if (h6Var != null) {
            r02 = h6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.m6.I.q();
        }
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f48742c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i7);
            if (uoVar.f38727c != r02) {
                uoVar.f38727c = r02;
                z9 = true;
            }
            i7++;
        }
        g61 g61Var = this.d;
        if (g61Var != null) {
            org.telegram.messenger.g0.d0(g61Var, new lc(this, 0));
            if (z9 && (ncVar = this.h) != null) {
                ncVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
