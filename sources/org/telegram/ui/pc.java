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
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f48686a;
    public final org.telegram.ui.ActionBar.g6 f48687b;
    public final ArrayList f48688c;
    public final f61 d;
    public final org.telegram.ui.Components.mz f48689e;
    public boolean f48690f;
    public final nc h;
    public boolean f48691n;
    public org.telegram.messenger.c20 f48692r;
    public String f48693s;
    public TLRPC.WallPaper f48694w;
    public final HashMap f48695x;
    public final HashMap f48696y;

    public pc(int i7, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f48688c = new ArrayList();
        this.f48695x = new HashMap();
        this.f48696y = new HashMap();
        this.f48686a = i7;
        this.f48687b = g6Var;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(getContext(), g6Var);
        this.f48689e = mzVar;
        mzVar.setViewType(14);
        mzVar.setVisibility(0);
        addView(mzVar, c8.ha.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        f61 f61Var = new f61(4, activity, g6Var);
        this.d = f61Var;
        f61Var.setClipToPadding(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        f61Var.setLayoutManager(b0Var);
        f61Var.setAlpha(0.0f);
        nc ncVar = new nc(this, i7, g6Var);
        this.h = ncVar;
        f61Var.setAdapter(ncVar);
        addView(f61Var, c8.ha.c(130.0f, -1));
        f61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new oc(this, i7), true);
        if (!this.f48691n) {
            org.telegram.messenger.g0.Z3(mzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(mzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z9) {
        ArrayList arrayList;
        int R;
        this.f48693s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f48688c;
            boolean z10 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i10);
            if (!TextUtils.equals(this.f48693s, uoVar.a()) && (!TextUtils.isEmpty(str) || !uoVar.f38760a.f28460a)) {
                z10 = false;
            }
            uoVar.d = z10;
            if (z10) {
                i7 = i10;
            }
            i10++;
        }
        f61 f61Var = this.d;
        if (i7 >= 0 && !z9 && (f61Var.getLayoutManager() instanceof v4.b0)) {
            ((v4.b0) f61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < f61Var.getChildCount(); i11++) {
            View childAt = f61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.a01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.a01) childAt).g(((org.telegram.ui.Components.uo) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f48694w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new lc(this, 1));
        if (this.f48694w != null) {
            ArrayList arrayList = this.f48688c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.uo) arrayList.get(0)).f38760a.f28460a) && this.f48690f) {
                arrayList.add(0, new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.r3.a(this.f48686a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.c20 c20Var) {
        this.f48692r = c20Var;
    }

    public void setWithRemovedStub(boolean z9) {
        this.f48690f = z9;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        nc ncVar;
        org.telegram.ui.ActionBar.g6 g6Var = this.f48687b;
        if (g6Var != null) {
            r02 = g6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.l6.I.q();
        }
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f48688c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i7);
            if (uoVar.f38762c != r02) {
                uoVar.f38762c = r02;
                z9 = true;
            }
            i7++;
        }
        f61 f61Var = this.d;
        if (f61Var != null) {
            org.telegram.messenger.g0.d0(f61Var, new lc(this, 0));
            if (z9 && (ncVar = this.h) != null) {
                ncVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
