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
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f49895a;
    public final org.telegram.ui.ActionBar.e6 f49896b;
    public final ArrayList f49897c;
    public final b61 d;
    public final org.telegram.ui.Components.pz f49898e;
    public boolean f49899f;
    public final mc h;
    public boolean f49900n;
    public org.telegram.messenger.z10 f49901r;
    public String f49902s;
    public TLRPC.WallPaper f49903w;
    public final HashMap f49904x;
    public final HashMap f49905y;

    public oc(int i7, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f49897c = new ArrayList();
        this.f49904x = new HashMap();
        this.f49905y = new HashMap();
        this.f49895a = i7;
        this.f49896b = e6Var;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(getContext(), e6Var);
        this.f49898e = pzVar;
        pzVar.setViewType(14);
        pzVar.setVisibility(0);
        addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        b61 b61Var = new b61(4, activity, e6Var);
        this.d = b61Var;
        b61Var.setClipToPadding(false);
        b61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        b61Var.setLayoutManager(b0Var);
        b61Var.setAlpha(0.0f);
        mc mcVar = new mc(this, i7, e6Var);
        this.h = mcVar;
        b61Var.setAdapter(mcVar);
        addView(b61Var, c8.ja.c(130.0f, -1));
        b61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new nc(this, i7), true);
        if (!this.f49900n) {
            org.telegram.messenger.g0.Y3(pzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Y3(pzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f49902s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f49897c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(i10);
            if (!TextUtils.equals(this.f49902s, dpVar.a()) && (!TextUtils.isEmpty(str) || !dpVar.f34009a.f29470a)) {
                z11 = false;
            }
            dpVar.d = z11;
            if (z11) {
                i7 = i10;
            }
            i10++;
        }
        b61 b61Var = this.d;
        if (i7 >= 0 && !z10 && (b61Var.getLayoutManager() instanceof v4.b0)) {
            ((v4.b0) b61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < b61Var.getChildCount(); i11++) {
            View childAt = b61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.b01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.b01) childAt).g(((org.telegram.ui.Components.dp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f49903w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new kc(this, 1));
        if (this.f49903w != null) {
            ArrayList arrayList = this.f49897c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.dp) arrayList.get(0)).f34009a.f29470a) && this.f49899f) {
                arrayList.add(0, new org.telegram.ui.Components.dp(org.telegram.ui.ActionBar.p3.a(this.f49895a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.z10 z10Var) {
        this.f49901r = z10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f49899f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        mc mcVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.f49896b;
        if (e6Var != null) {
            r02 = e6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.j6.I.q();
        }
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f49897c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(i7);
            if (dpVar.f34011c != r02) {
                dpVar.f34011c = r02;
                z10 = true;
            }
            i7++;
        }
        b61 b61Var = this.d;
        if (b61Var != null) {
            org.telegram.messenger.g0.d0(b61Var, new kc(this, 0));
            if (z10 && (mcVar = this.h) != null) {
                mcVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
