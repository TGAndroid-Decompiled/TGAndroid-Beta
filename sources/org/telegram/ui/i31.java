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
public final class i31 extends org.telegram.ui.ActionBar.n2 {
    public h31 f37183a;
    public org.telegram.ui.Components.ll0 f37184b;
    public int f37185c;
    public int d;
    public int f37186e;
    public int f37187f;
    public int h;
    public org.telegram.ui.Cells.j3[] f37188n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 25));
        this.f37183a = new h31(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20608a7, false));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f37184b = ll0Var;
        ll0Var.o1();
        this.f37184b.setVerticalScrollBarEnabled(false);
        this.f37184b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37184b, w7.x5.e(-1, -1, 51));
        this.f37184b.setAdapter(this.f37183a);
        this.actionBar.setAdaptiveBackground(this.f37184b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.j3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20664d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20608a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20938s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20993v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20957t8));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 8388608, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20754i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20786k0, null, null, org.telegram.ui.ActionBar.j6.f20665d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37184b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f37185c = 1;
        this.d = 2;
        this.f37186e = 3;
        this.h = 5;
        this.f37187f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.j3[] j3VarArr = this.f37188n;
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
        h31 h31Var = this.f37183a;
        if (h31Var != null) {
            h31Var.l();
        }
    }
}
