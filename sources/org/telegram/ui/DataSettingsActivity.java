package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class DataSettingsActivity extends org.telegram.ui.ActionBar.d {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public long Y;
    public s20 a;
    public fu b;
    public ArrayList c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    private int proxyRow;
    public int r;
    private int resetDownloadRow;
    public boolean s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int w;
    public int x;
    public int y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131751665, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 9));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new s20(this, context, (byte) 3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        fu fuVar = new fu((byte) 14, context, this);
        this.b = fuVar;
        fuVar.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new v82(this, context, (byte) 14));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.b.setItemAnimator(gb3Var);
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ahb.class, ld5.class, vl7.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i = bkb.L6;
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.M6;
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        up3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        up3.q(this.currentAccount).s(true);
        s0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        r61.i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        i63 i63Var = new i63(this, (byte) 1);
        gl.d3(i63Var, 100L);
        r61.c0(new p0c(this, i63Var, System.currentTimeMillis(), (byte) 1));
        if (this.b != null && this.a != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                s49 T = this.b.T(childAt);
                if (T != null) {
                    s20 s20Var = this.a;
                    this.b.getClass();
                    s20Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        s0(false);
    }

    public final void p0() {
        tp3 tp3Var;
        tp3 tp3Var2;
        String str;
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).X3.edit();
        for (int i = 0; i < 3; i++) {
            int i2 = this.currentAccount;
            if (i == 0) {
                tp3Var = up3.q(i2).N;
                tp3Var2 = up3.q(this.currentAccount).L;
                str = "mobilePreset";
            } else if (i == 1) {
                tp3Var = up3.q(i2).O;
                tp3Var2 = up3.q(this.currentAccount).M;
                str = "wifiPreset";
            } else {
                tp3Var = up3.q(i2).P;
                tp3Var2 = up3.q(this.currentAccount).K;
                str = "roamingPreset";
            }
            tp3Var.c(tp3Var2);
            tp3Var.g = tp3Var2.b();
            up3.q(this.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            up3.q(this.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            up3.q(this.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, tp3Var.toString());
        }
        edit.commit();
        up3.q(this.currentAccount).g();
        for (int i3 = 0; i3 < 3; i3++) {
            up3.q(this.currentAccount).w(i3);
        }
        this.a.l(this.e, 4);
        s0(false);
    }

    public final void q0(android.content.Context r19, android.view.View r20, int r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.q0(android.content.Context, android.view.View, int, float):void");
    }

    public final void r0(int i) {
        if (this.b != null && this.a != null) {
            for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
                s49 T = this.b.T(this.b.getChildAt(i2));
                if (T != null && T.b() == i) {
                    this.a.t(T, i);
                    return;
                }
            }
        }
    }

    public final void s0(boolean z) {
        boolean z2;
        int i;
        this.s = true;
        this.U = 3;
        this.w = 2;
        this.n = -1;
        ArrayList c1 = gl.c1();
        this.c = c1;
        if (c1.size() > 1) {
            int i2 = this.U;
            this.U = i2 + 1;
            this.n = i2;
        }
        int i3 = this.U;
        this.x = i3;
        this.d = i3 + 1;
        this.e = i3 + 2;
        this.h = i3 + 3;
        this.U = i3 + 5;
        this.f = i3 + 4;
        up3 downloadController = getDownloadController();
        tp3 tp3Var = downloadController.K;
        tp3 tp3Var2 = downloadController.M;
        tp3 tp3Var3 = downloadController.L;
        if (tp3Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && tp3Var3.a(downloadController.n()) && tp3Var3.b() == downloadController.N.g && tp3Var2.a(downloadController.p()) && tp3Var2.b() == downloadController.O.g) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.resetDownloadRow;
        if (z2) {
            i = -1;
        } else {
            i = this.U;
            this.U = i + 1;
        }
        this.resetDownloadRow = i;
        s20 s20Var = this.a;
        if (s20Var != null && !z) {
            if (i4 < 0) {
                if (i >= 0) {
                    s20Var.g(this.f);
                    this.a.i(this.resetDownloadRow);
                }
                z = true;
            } else {
                if (i < 0) {
                    s20Var.g(this.f);
                    this.a.r(i4);
                }
                z = true;
            }
        }
        int i5 = this.U;
        this.r = i5;
        this.S = i5 + 1;
        this.saveToGalleryPeerRow = i5 + 2;
        this.saveToGalleryGroupsRow = i5 + 3;
        this.saveToGalleryChannelsRow = i5 + 4;
        this.T = i5 + 5;
        this.y = i5 + 6;
        int i6 = i5 + 8;
        this.U = i6;
        this.E = i5 + 7;
        boolean z3 = w01.a;
        this.H = i6;
        this.G = i5 + 9;
        this.I = i5 + 10;
        this.F = -1;
        this.N = i5 + 11;
        this.useLessDataForCallsRow = i5 + 12;
        this.O = i5 + 13;
        this.P = i5 + 14;
        this.proxyRow = i5 + 15;
        this.Q = i5 + 16;
        this.clearDraftsRow = i5 + 17;
        this.U = i5 + 19;
        this.R = i5 + 18;
        s20 s20Var2 = this.a;
        if (s20Var2 != null && z) {
            s20Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
