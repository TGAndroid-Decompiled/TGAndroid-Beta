package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g31 extends org.telegram.ui.ActionBar.n2 {
    public f31 f33747a;
    public org.telegram.ui.Components.ll0 f33748b;
    public int f33749c;
    public int d;
    public int e;
    public int f33750f;
    public int h;
    public org.telegram.ui.Cells.j3[] f33751n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 24));
        this.f33747a = new f31(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f33748b = ll0Var;
        ll0Var.p1();
        this.f33748b.setVerticalScrollBarEnabled(false);
        this.f33748b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f33748b, w7.x5.e(-1, -1, 51));
        this.f33748b.setAdapter(this.f33747a);
        this.actionBar.setAdaptiveBackground(this.f33748b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.j3.class}, null, null, null, org.telegram.ui.ActionBar.i6.f18836d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f18780a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19113s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19168v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19132t8));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 8388608, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f18926i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f18958k0, null, null, org.telegram.ui.ActionBar.i6.f18837d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33748b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f33749c = 1;
        this.d = 2;
        this.e = 3;
        this.h = 5;
        this.f33750f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.j3[] j3VarArr = this.f33751n;
            if (i10 < j3VarArr.length) {
                org.telegram.ui.Cells.j3 j3Var = j3VarArr[i10];
                if (j3Var != null) {
                    String obj = j3Var.getTextView().getText().toString();
                    if (!TextUtils.isEmpty(obj)) {
                        edit.putString("quick_reply_msg" + (i10 + 1), obj);
                    } else {
                        edit.remove("quick_reply_msg" + (i10 + 1));
                    }
                }
                i10++;
            } else {
                edit.commit();
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        f31 f31Var = this.f33747a;
        if (f31Var != null) {
            f31Var.l();
        }
    }
}
