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
    public az f35915a;
    public org.telegram.ui.Components.ll0 f35916b;
    public s4.y f35917c;
    public ImageView d;
    public final ArrayList f35918e;
    public cz f35919f;
    public int h;
    public int f35920n;
    public int f35921r;
    public int f35922s;
    public int v;
    public final int f35923w;
    public final int f35924x;
    public z0 f35925y;

    public dz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f35918e = arrayList;
        this.f35923w = i10;
        this.f35924x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(dz dzVar, Context context, int i10) {
        ArrayList arrayList = dzVar.f35918e;
        if (i10 == dzVar.h) {
            org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(context, dzVar.currentAccount, null, 0L, dzVar, null);
            b70Var.Y(new iu(dzVar, 5));
            b70Var.Z(arrayList);
            dzVar.showDialog(b70Var);
        }
    }

    public static org.telegram.ui.ActionBar.d5 W(dz dzVar) {
        return dzVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 X(dz dzVar) {
        return dzVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new dj(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.f35918e;
        if (arrayList.isEmpty()) {
            this.f35920n = -1;
            this.f35921r = -1;
        } else {
            int i10 = this.v;
            this.f35920n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f35921r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f35922s = i11;
        az azVar = this.f35915a;
        if (azVar != null) {
            azVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f35923w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new xy(this));
        this.f35915a = new az(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20635a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f35916b = ll0Var;
        ll0Var.setLayoutManager(new s4.c0(1, false));
        this.f35916b.setVerticalScrollBarEnabled(false);
        this.f35916b.setAdapter(this.f35915a);
        ((s4.j) this.f35916b.getItemAnimator()).C = false;
        frameLayout.addView(this.f35916b, w7.x5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new bz(this));
        this.f35917c = yVar;
        yVar.d(this.f35916b);
        this.f35916b.setOnItemClickListener(new bi.x5(16, this, context));
        this.f35916b.setOnItemLongClickListener(new zy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20691d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20635a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20965s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21020v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20984t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20781i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20813k0, null, null, org.telegram.ui.ActionBar.j6.f20692d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20655b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35916b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f35925y == null) {
            if (z10) {
                Y();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        uy.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
