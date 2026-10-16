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
public final class n31 extends org.telegram.ui.ActionBar.m2 {
    public m31 f38130a;
    public org.telegram.ui.Components.mm0 f38131b;
    public int f38132c;
    public int d;
    public int e;
    public int f38133f;
    public int h;
    public org.telegram.ui.Cells.k3[] f38134n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 26));
        this.f38130a = new m31(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f38131b = mm0Var;
        mm0Var.p1();
        this.f38131b.setVerticalScrollBarEnabled(false);
        this.f38131b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f38131b, w7.z5.e(-1, -1, 51));
        this.f38131b.setAdapter(this.f38130a);
        this.actionBar.setAdaptiveBackground(this.f38131b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.k3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 8388608, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38131b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f38132c = 1;
        this.d = 2;
        this.e = 3;
        this.h = 5;
        this.f38133f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.k3[] k3VarArr = this.f38134n;
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
        m31 m31Var = this.f38130a;
        if (m31Var != null) {
            m31Var.l();
        }
    }
}
