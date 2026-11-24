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
    public s30 a;
    public fv b;
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
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131751614, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 10));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.a = new s30(this, context, (byte) 3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        fv fvVar = new fv((byte) 14, context, this);
        this.b = fvVar;
        fvVar.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new x92(this, context, (byte) 15));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, bjb.class, jf5.class, yn7.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i = cmb.L6;
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.M6;
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        er3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        er3.q(this.currentAccount).s(true);
        t0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y71.i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        u73 u73Var = new u73(this, (byte) 1);
        gm.d3(u73Var, 100L);
        y71.d0(new p2c(this, u73Var, System.currentTimeMillis(), (byte) 1));
        if (this.b != null && this.a != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                u69 T = this.b.T(childAt);
                if (T != null) {
                    s30 s30Var = this.a;
                    this.b.getClass();
                    s30Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void q0() {
        dr3 dr3Var;
        dr3 dr3Var2;
        String str;
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
        for (int i = 0; i < 3; i++) {
            int i2 = this.currentAccount;
            if (i == 0) {
                dr3Var = er3.q(i2).N;
                dr3Var2 = er3.q(this.currentAccount).L;
                str = "mobilePreset";
            } else if (i == 1) {
                dr3Var = er3.q(i2).O;
                dr3Var2 = er3.q(this.currentAccount).M;
                str = "wifiPreset";
            } else {
                dr3Var = er3.q(i2).P;
                dr3Var2 = er3.q(this.currentAccount).K;
                str = "roamingPreset";
            }
            dr3Var.c(dr3Var2);
            dr3Var.g = dr3Var2.b();
            er3.q(this.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            er3.q(this.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            er3.q(this.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, dr3Var.toString());
        }
        edit.commit();
        er3.q(this.currentAccount).g();
        for (int i3 = 0; i3 < 3; i3++) {
            er3.q(this.currentAccount).w(i3);
        }
        this.a.l(this.e, 4);
        t0(false);
    }

    public final void r0(android.content.Context r19, android.view.View r20, int r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.r0(android.content.Context, android.view.View, int, float):void");
    }

    public final void s0(int i) {
        if (this.b != null && this.a != null) {
            for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
                u69 T = this.b.T(this.b.getChildAt(i2));
                if (T != null && T.b() == i) {
                    this.a.t(T, i);
                    return;
                }
            }
        }
    }

    public final void t0(boolean z) {
        boolean z2;
        int i;
        this.s = true;
        this.U = 3;
        this.w = 2;
        this.n = -1;
        ArrayList c1 = gm.c1();
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
        er3 downloadController = getDownloadController();
        dr3 dr3Var = downloadController.K;
        dr3 dr3Var2 = downloadController.M;
        dr3 dr3Var3 = downloadController.L;
        if (dr3Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && dr3Var3.a(downloadController.n()) && dr3Var3.b() == downloadController.N.g && dr3Var2.a(downloadController.p()) && dr3Var2.b() == downloadController.O.g) {
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
        s30 s30Var = this.a;
        if (s30Var != null && !z) {
            if (i4 < 0) {
                if (i >= 0) {
                    s30Var.g(this.f);
                    this.a.i(this.resetDownloadRow);
                }
                z = true;
            } else {
                if (i < 0) {
                    s30Var.g(this.f);
                    this.a.s(i4);
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
        boolean z3 = e21.a;
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
        s30 s30Var2 = this.a;
        if (s30Var2 != null && z) {
            s30Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
