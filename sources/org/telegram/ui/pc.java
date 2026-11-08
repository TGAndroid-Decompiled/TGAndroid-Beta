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
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int f48771a;
    public final org.telegram.ui.ActionBar.f6 f48772b;
    public final ArrayList f48773c;
    public final e61 d;
    public final org.telegram.ui.Components.mz f48774e;
    public boolean f48775f;
    public final nc h;
    public boolean f48776n;
    public org.telegram.messenger.c20 f48777r;
    public String f48778s;
    public TLRPC.WallPaper f48779w;
    public final HashMap f48780x;
    public final HashMap f48781y;

    public pc(int i7, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f48773c = new ArrayList();
        this.f48780x = new HashMap();
        this.f48781y = new HashMap();
        this.f48771a = i7;
        this.f48772b = f6Var;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(getContext(), f6Var);
        this.f48774e = mzVar;
        mzVar.setViewType(14);
        mzVar.setVisibility(0);
        addView(mzVar, c8.ha.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        e61 e61Var = new e61(4, activity, f6Var);
        this.d = e61Var;
        e61Var.setClipToPadding(false);
        e61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        e61Var.setLayoutManager(b0Var);
        e61Var.setAlpha(0.0f);
        nc ncVar = new nc(this, i7, f6Var);
        this.h = ncVar;
        e61Var.setAdapter(ncVar);
        addView(e61Var, c8.ha.c(130.0f, -1));
        e61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new oc(this, i7), true);
        if (!this.f48776n) {
            org.telegram.messenger.g0.Z3(mzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(mzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z9) {
        ArrayList arrayList;
        int R;
        this.f48778s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f48773c;
            boolean z10 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i10);
            if (!TextUtils.equals(this.f48778s, uoVar.a()) && (!TextUtils.isEmpty(str) || !uoVar.f38699a.f28459a)) {
                z10 = false;
            }
            uoVar.d = z10;
            if (z10) {
                i7 = i10;
            }
            i10++;
        }
        e61 e61Var = this.d;
        if (i7 >= 0 && !z9 && (e61Var.getLayoutManager() instanceof v4.b0)) {
            ((v4.b0) e61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < e61Var.getChildCount(); i11++) {
            View childAt = e61Var.getChildAt(i11);
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
        this.f48779w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new lc(this, 1));
        if (this.f48779w != null) {
            ArrayList arrayList = this.f48773c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.uo) arrayList.get(0)).f38699a.f28459a) && this.f48775f) {
                arrayList.add(0, new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.r3.a(this.f48771a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.c20 c20Var) {
        this.f48777r = c20Var;
    }

    public void setWithRemovedStub(boolean z9) {
        this.f48775f = z9;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        nc ncVar;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48772b;
        if (f6Var != null) {
            r02 = f6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.k6.I.q();
        }
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f48773c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i7);
            if (uoVar.f38701c != r02) {
                uoVar.f38701c = r02;
                z9 = true;
            }
            i7++;
        }
        e61 e61Var = this.d;
        if (e61Var != null) {
            org.telegram.messenger.g0.d0(e61Var, new lc(this, 0));
            if (z9 && (ncVar = this.h) != null) {
                ncVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
