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
    public final int f50515a;
    public final org.telegram.ui.ActionBar.i6 f50516b;
    public final ArrayList f50517c;
    public final f61 d;
    public final org.telegram.ui.Components.wz f50518e;
    public boolean f50519f;
    public final mc h;
    public boolean f50520n;
    public org.telegram.messenger.x10 f50521r;
    public String f50522s;
    public TLRPC.WallPaper f50523w;
    public final HashMap f50524x;
    public final HashMap f50525y;

    public oc(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.f50517c = new ArrayList();
        this.f50524x = new HashMap();
        this.f50525y = new HashMap();
        this.f50515a = i7;
        this.f50516b = i6Var;
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(getContext(), i6Var);
        this.f50518e = wzVar;
        wzVar.setViewType(14);
        wzVar.setVisibility(0);
        addView(wzVar, c8.ma.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        f61 f61Var = new f61(4, activity, i6Var);
        this.d = f61Var;
        f61Var.setClipToPadding(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        getContext();
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        f61Var.setLayoutManager(c0Var);
        f61Var.setAlpha(0.0f);
        mc mcVar = new mc(this, i7, i6Var);
        this.h = mcVar;
        f61Var.setAdapter(mcVar);
        addView(f61Var, c8.ma.c(130.0f, -1));
        f61Var.setOnItemClickListener(new h(this, 3));
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(i7);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        f10.q(new nc(this, i7), true);
        if (!this.f50520n) {
            org.telegram.messenger.g0.X3(wzVar, true, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.X3(wzVar, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f50522s = str;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f50517c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(i10);
            if (!TextUtils.equals(this.f50522s, kpVar.a()) && (!TextUtils.isEmpty(str) || !kpVar.f36837a.f29997a)) {
                z11 = false;
            }
            kpVar.d = z11;
            if (z11) {
                i7 = i10;
            }
            i10++;
        }
        f61 f61Var = this.d;
        if (i7 >= 0 && !z10 && (f61Var.getLayoutManager() instanceof v4.c0)) {
            ((v4.c0) f61Var.getLayoutManager()).h1(i7, (org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < f61Var.getChildCount(); i11++) {
            View childAt = f61Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.j01) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.j01) childAt).g(((org.telegram.ui.Components.kp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.f50523w = wallPaper;
        org.telegram.messenger.g0.d0(this.d, new kc(this, 1));
        if (this.f50523w != null) {
            ArrayList arrayList = this.f50517c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.kp) arrayList.get(0)).f36837a.f29997a) && this.f50519f) {
                arrayList.add(0, new org.telegram.ui.Components.kp(org.telegram.ui.ActionBar.t3.a(this.f50515a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(org.telegram.messenger.x10 x10Var) {
        this.f50521r = x10Var;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f50519f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        mc mcVar;
        org.telegram.ui.ActionBar.i6 i6Var = this.f50516b;
        if (i6Var != null) {
            r02 = i6Var.d();
        } else {
            r02 = org.telegram.ui.ActionBar.n6.I.q();
        }
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f50517c;
            if (i7 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(i7);
            if (kpVar.f36839c != r02) {
                kpVar.f36839c = r02;
                z10 = true;
            }
            i7++;
        }
        f61 f61Var = this.d;
        if (f61Var != null) {
            org.telegram.messenger.g0.d0(f61Var, new kc(this, 0));
            if (z10 && (mcVar = this.h) != null) {
                mcVar.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
