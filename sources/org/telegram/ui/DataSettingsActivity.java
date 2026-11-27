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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.e {
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
    public t20 a;
    public gu b;
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
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131751642, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 10));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new t20(this, context, (byte) 3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        gu guVar = new gu((byte) 14, context, this);
        this.b = guVar;
        guVar.s1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new q72(this, context, (byte) 18));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, wkb.class, mf5.class, uo7.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        int i = aob.M6;
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.N6;
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        lq3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        lq3.q(this.currentAccount).s(true);
        s0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        z61.i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        b73 b73Var = new b73(this, (byte) 1);
        hl.d3(b73Var, 100L);
        z61.c0(new p4c(this, b73Var, System.currentTimeMillis(), (byte) 1));
        if (this.b != null && this.a != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                f89 U = this.b.U(childAt);
                if (U != null) {
                    t20 t20Var = this.a;
                    this.b.getClass();
                    t20Var.t(U, RecyclerView.S(childAt));
                }
            }
        }
        s0(false);
    }

    public final void p0() {
        kq3 kq3Var;
        kq3 kq3Var2;
        String str;
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).Y3.edit();
        for (int i = 0; i < 3; i++) {
            int i2 = this.currentAccount;
            if (i == 0) {
                kq3Var = lq3.q(i2).N;
                kq3Var2 = lq3.q(this.currentAccount).L;
                str = "mobilePreset";
            } else if (i == 1) {
                kq3Var = lq3.q(i2).O;
                kq3Var2 = lq3.q(this.currentAccount).M;
                str = "wifiPreset";
            } else {
                kq3Var = lq3.q(i2).P;
                kq3Var2 = lq3.q(this.currentAccount).K;
                str = "roamingPreset";
            }
            kq3Var.c(kq3Var2);
            kq3Var.g = kq3Var2.b();
            lq3.q(this.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            lq3.q(this.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            lq3.q(this.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, kq3Var.toString());
        }
        edit.commit();
        lq3.q(this.currentAccount).g();
        for (int i3 = 0; i3 < 3; i3++) {
            lq3.q(this.currentAccount).w(i3);
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
                f89 U = this.b.U(this.b.getChildAt(i2));
                if (U != null && U.b() == i) {
                    this.a.t(U, i);
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
        ArrayList c1 = hl.c1();
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
        lq3 downloadController = getDownloadController();
        kq3 kq3Var = downloadController.K;
        kq3 kq3Var2 = downloadController.M;
        kq3 kq3Var3 = downloadController.L;
        if (kq3Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && kq3Var3.a(downloadController.n()) && kq3Var3.b() == downloadController.N.g && kq3Var2.a(downloadController.p()) && kq3Var2.b() == downloadController.O.g) {
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
        t20 t20Var = this.a;
        if (t20Var != null && !z) {
            if (i4 < 0) {
                if (i >= 0) {
                    t20Var.g(this.f);
                    this.a.i(this.resetDownloadRow);
                }
                z = true;
            } else {
                if (i < 0) {
                    t20Var.g(this.f);
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
        boolean z3 = f11.a;
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
        t20 t20Var2 = this.a;
        if (t20Var2 != null && z) {
            t20Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
