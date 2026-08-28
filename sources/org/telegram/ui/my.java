package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class my extends org.telegram.ui.ActionBar.o2 {
    public jy f40546a;
    public org.telegram.ui.Components.wk0 f40547b;
    public f2.h0 f40548c;
    public ImageView d;
    public final ArrayList f40549e;
    public ly f40550f;
    public int h;
    public int f40551n;
    public int f40552r;
    public int f40553s;
    public int v;
    public final int f40554w;
    public final int f40555x;
    public b1 f40556y;

    public my(int i9, int i10) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f40549e = arrayList;
        this.f40554w = i9;
        this.f40555x = i10;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i10, i9, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Y();
    }

    public static void T(my myVar, Context context, int i9) {
        ArrayList arrayList = myVar.f40549e;
        if (i9 == myVar.h) {
            org.telegram.ui.Components.k60 k60Var = new org.telegram.ui.Components.k60(context, myVar.currentAccount, null, 0L, myVar, null);
            k60Var.X(new wt(myVar, 5));
            k60Var.Y(arrayList);
            myVar.showDialog(k60Var);
        }
    }

    public static org.telegram.ui.ActionBar.b5 V(my myVar) {
        return myVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 W(my myVar) {
        return myVar.parentLayout;
    }

    public final void X() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ri(this, 26), 1000L);
    }

    public final void Y() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.f40549e;
        if (arrayList.isEmpty()) {
            this.f40551n = -1;
            this.f40552r = -1;
        } else {
            int i9 = this.v;
            this.f40551n = i9;
            int size = arrayList.size() + i9;
            this.v = size;
            this.f40552r = size;
        }
        int i10 = this.v;
        this.v = i10 + 1;
        this.f40553s = i10;
        jy jyVar = this.f40546a;
        if (jyVar != null) {
            jyVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f40554w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new gy(this));
        this.f40546a = new jy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f40547b = wk0Var;
        wk0Var.setLayoutManager(new f2.m0(1, false));
        this.f40547b.setVerticalScrollBarEnabled(false);
        this.f40547b.setAdapter(this.f40546a);
        ((f2.n) this.f40547b.getItemAnimator()).C = false;
        frameLayout.addView(this.f40547b, g7.e6.c(-1.0f, -1));
        f2.h0 h0Var = new f2.h0(new ky(this));
        this.f40548c = h0Var;
        h0Var.d(this.f40547b);
        this.f40547b.setOnItemClickListener(new bg.b1(18, this, context));
        this.f40547b.setOnItemLongClickListener(new iy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 16, new Class[]{org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.f23229q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40547b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f40556y == null) {
            if (z10) {
                X();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        dy.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
