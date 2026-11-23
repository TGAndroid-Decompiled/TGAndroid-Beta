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
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int f50640a;
    public final org.telegram.ui.ActionBar.i6 f50641b;
    public final ArrayList f50642c;
    public final d61 d;
    public final org.telegram.ui.Components.vz f50643e;
    public boolean f50644f;
    public final mc h;
    public boolean f50645n;
    public org.telegram.messenger.w10 f50646r;
    public String f50647s;
    public TLRPC.WallPaper f50648w;
    public final HashMap f50649x;
    public final HashMap f50650y;

    public oc(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.f50642c = new ArrayList();
        this.f50649x = new HashMap();
        this.f50650y = new HashMap();
        this.f50640a = i7;
        this.f50641b = i6Var;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(getContext(), i6Var);
        this.f50643e = vzVar;
        vzVar.setViewType(14);
        vzVar.setVisibility(0);
        addView(vzVar, c8.na.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        d61 d61Var = new d61(4, activity, i6Var);
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        d61Var.setLayoutManager(c0Var);
        d61Var.setAlpha(0.0f);
        mc mcVar = new mc(this, i7, i6Var);
        this.h = mcVar;
        d61Var.setAdapter(mcVar);
        addView(d61Var, c8.na.c(130.0f, -1));
        d61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new nc(this, i7), true);
        if (!this.f50645n) {
            org.telegram.messenger.g0.X3(vzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.X3(vzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f50647s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f50642c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList.get(i10);
            if (!TextUtils.equals(this.f50647s, jpVar.a()) && (!TextUtils.isEmpty(str) || !jpVar.f36472a.f30045a)) {
                z11 = false;
            }
            jpVar.d = z11;
            if (z11) {
                i7 = i10;
            }
            i10++;
        }
        d61 d61Var = this.d;
        if (i7 >= 0 && !z10 && (d61Var.getLayoutManager() instanceof v4.c0)) {
            ((v4.c0) d61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
            View childAt = d61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.j01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.j01) childAt).g(((org.telegram.ui.Components.jp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f50648w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new kc(this, 1));
        if (this.f50648w != null) {
            ArrayList arrayList = this.f50642c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.jp) arrayList.get(0)).f36472a.f30045a) && this.f50644f) {
                arrayList.add(0, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.s3.a(this.f50640a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.w10 w10Var) {
        this.f50646r = w10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f50644f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        mc mcVar;
        org.telegram.ui.ActionBar.i6 i6Var = this.f50641b;
        if (i6Var != null) {
            r02 = i6Var.b();
        } else {
            r02 = org.telegram.ui.ActionBar.n6.I.q();
        }
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f50642c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList.get(i7);
            if (jpVar.f36474c != r02) {
                jpVar.f36474c = r02;
                z10 = true;
            }
            i7++;
        }
        d61 d61Var = this.d;
        if (d61Var != null) {
            org.telegram.messenger.g0.d0(d61Var, new kc(this, 0));
            if (z10 && (mcVar = this.h) != null) {
                mcVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
