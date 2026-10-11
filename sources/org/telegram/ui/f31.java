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
public final class f31 extends org.telegram.ui.ActionBar.m2 {
    public e31 f37521a;
    public org.telegram.ui.Components.sm0 f37522b;
    public int f37523c;
    public int d;
    public int f37524e;
    public int f37525f;
    public int h;
    public org.telegram.ui.Cells.k3[] f37526n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 24));
        this.f37521a = new e31(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(context, null);
        this.f37522b = sm0Var;
        sm0Var.p1();
        this.f37522b.setVerticalScrollBarEnabled(false);
        this.f37522b.setLayoutManager(new s4.d0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37522b, w7.x5.e(-1, -1, 51));
        this.f37522b.setAdapter(this.f37521a);
        this.actionBar.setAdaptiveBackground(this.f37522b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.k3.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 8388608, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37522b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f37523c = 1;
        this.d = 2;
        this.f37524e = 3;
        this.h = 5;
        this.f37525f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.k3[] k3VarArr = this.f37526n;
            if (i10 < k3VarArr.length) {
                org.telegram.ui.Cells.k3 k3Var = k3VarArr[i10];
                if (k3Var != null) {
                    String obj = k3Var.getTextView().getText().toString();
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
        e31 e31Var = this.f37521a;
        if (e31Var != null) {
            e31Var.l();
        }
    }
}
