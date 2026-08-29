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
public final class c21 extends org.telegram.ui.ActionBar.o2 {
    public b21 f36971a;
    public org.telegram.ui.Components.jl0 f36972b;
    public int f36973c;
    public int d;
    public int f36974e;
    public int f36975f;
    public int h;
    public org.telegram.ui.Cells.h3[] f36976n;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 11));
        this.f36971a = new b21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f36972b = jl0Var;
        jl0Var.p1();
        this.f36972b.setVerticalScrollBarEnabled(false);
        this.f36972b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f36972b, i7.f6.e(-1, -1, 51));
        this.f36972b.setAdapter(this.f36971a);
        this.actionBar.setAdaptiveBackground(this.f36972b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.h3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 4, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 8388608, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36972b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f36973c = 1;
        this.d = 2;
        this.f36974e = 3;
        this.h = 5;
        this.f36975f = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.h3[] h3VarArr = this.f36976n;
            if (i10 < h3VarArr.length) {
                org.telegram.ui.Cells.h3 h3Var = h3VarArr[i10];
                if (h3Var != null) {
                    String obj = h3Var.getTextView().getText().toString();
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
        b21 b21Var = this.f36971a;
        if (b21Var != null) {
            b21Var.l();
        }
    }
}
