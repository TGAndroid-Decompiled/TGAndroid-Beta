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
public final class nc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f47945a;
    public final org.telegram.ui.ActionBar.e6 f47946b;
    public final ArrayList f47947c;
    public final u51 d;
    public final org.telegram.ui.Components.iz f47948e;
    public boolean f47949f;
    public final lc h;
    public boolean f47950n;
    public org.telegram.messenger.u10 f47951r;
    public String f47952s;
    public TLRPC.WallPaper f47953w;
    public final HashMap f47954x;
    public final HashMap f47955y;

    public nc(int i3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f47947c = new ArrayList();
        this.f47954x = new HashMap();
        this.f47955y = new HashMap();
        this.f47945a = i3;
        this.f47946b = e6Var;
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(getContext(), e6Var);
        this.f47948e = izVar;
        izVar.setViewType(14);
        izVar.setVisibility(0);
        addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        u51 u51Var = new u51(4, activity, e6Var);
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        u51Var.setLayoutManager(b0Var);
        u51Var.setAlpha(0.0f);
        lc lcVar = new lc(this, i3, e6Var);
        this.h = lcVar;
        u51Var.setAdapter(lcVar);
        addView(u51Var, b8.mf.c(130.0f, -1));
        u51Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i3);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new mc(this, i3), true);
        if (!this.f47950n) {
            org.telegram.messenger.g0.Z3(izVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(izVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f47952s = str;
        int i3 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f47947c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i10);
            if (!TextUtils.equals(this.f47952s, uoVar.a()) && (!TextUtils.isEmpty(str) || !uoVar.f38832a.f28419a)) {
                z11 = false;
            }
            uoVar.d = z11;
            if (z11) {
                i3 = i10;
            }
            i10++;
        }
        u51 u51Var = this.d;
        if (i3 >= 0 && !z10 && (u51Var.getLayoutManager() instanceof u4.b0)) {
            ((u4.b0) u51Var.getLayoutManager()).h1(i3, (org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < u51Var.getChildCount(); i11++) {
            View childAt = u51Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.yz0) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.yz0) childAt).g(((org.telegram.ui.Components.uo) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f47953w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new jc(this, 1));
        if (this.f47953w != null) {
            ArrayList arrayList = this.f47947c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.uo) arrayList.get(0)).f38832a.f28419a) && this.f47949f) {
                arrayList.add(0, new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.p3.a(this.f47945a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.u10 u10Var) {
        this.f47951r = u10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f47949f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        lc lcVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.f47946b;
        if (e6Var != null) {
            r02 = e6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.k6.I.q();
        }
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f47947c;
            if (i3 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i3);
            if (uoVar.f38834c != r02) {
                uoVar.f38834c = r02;
                z10 = true;
            }
            i3++;
        }
        u51 u51Var = this.d;
        if (u51Var != null) {
            org.telegram.messenger.g0.d0(u51Var, new jc(this, 0));
            if (z10 && (lcVar = this.h) != null) {
                lcVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
