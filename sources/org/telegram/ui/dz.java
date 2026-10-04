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
public final class dz extends org.telegram.ui.ActionBar.n2 {
    public az f35861a;
    public org.telegram.ui.Components.zl0 f35862b;
    public s4.y f35863c;
    public ImageView d;
    public final ArrayList f35864e;
    public cz f35865f;
    public int h;
    public int f35866n;
    public int f35867r;
    public int f35868s;
    public int v;
    public final int f35869w;
    public final int f35870x;
    public z0 f35871y;

    public dz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f35864e = arrayList;
        this.f35869w = i10;
        this.f35870x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Y();
    }

    public static void S(dz dzVar, Context context, int i10) {
        ArrayList arrayList = dzVar.f35864e;
        if (i10 == dzVar.h) {
            org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(context, dzVar.currentAccount, null, 0L, dzVar, null);
            p70Var.X(new bu(dzVar, 7));
            p70Var.Y(arrayList);
            dzVar.showDialog(p70Var);
        }
    }

    public static org.telegram.ui.ActionBar.c5 U(dz dzVar) {
        return dzVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.c5 W(dz dzVar) {
        return dzVar.parentLayout;
    }

    public final void X() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new bj(this, 26), 1000L);
    }

    public final void Y() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.f35864e;
        if (arrayList.isEmpty()) {
            this.f35866n = -1;
            this.f35867r = -1;
        } else {
            int i10 = this.v;
            this.f35866n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f35867r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f35868s = i11;
        az azVar = this.f35861a;
        if (azVar != null) {
            azVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f35869w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new xy(this));
        this.f35861a = new az(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20761a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f35862b = zl0Var;
        zl0Var.setLayoutManager(new s4.c0(1, false));
        this.f35862b.setVerticalScrollBarEnabled(false);
        this.f35862b.setAdapter(this.f35861a);
        ((s4.j) this.f35862b.getItemAnimator()).C = false;
        frameLayout.addView(this.f35862b, w7.z5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new bz(this));
        this.f35863c = yVar;
        yVar.e(this.f35862b);
        this.f35862b.setOnItemClickListener(new ai.n6(16, this, context));
        this.f35862b.setOnItemLongClickListener(new zy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20817d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20761a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21099s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20908i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20940k0, null, null, org.telegram.ui.ActionBar.i6.f20818d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20781b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35862b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f35871y == null) {
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
        uy.r4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
