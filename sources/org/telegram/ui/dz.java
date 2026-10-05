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
    public az f35906a;
    public org.telegram.ui.Components.zl0 f35907b;
    public s4.y f35908c;
    public ImageView d;
    public final ArrayList f35909e;
    public cz f35910f;
    public int h;
    public int f35911n;
    public int f35912r;
    public int f35913s;
    public int v;
    public final int f35914w;
    public final int f35915x;
    public z0 f35916y;

    public dz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f35909e = arrayList;
        this.f35914w = i10;
        this.f35915x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Y();
    }

    public static void S(dz dzVar, Context context, int i10) {
        ArrayList arrayList = dzVar.f35909e;
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
        ArrayList arrayList = this.f35909e;
        if (arrayList.isEmpty()) {
            this.f35911n = -1;
            this.f35912r = -1;
        } else {
            int i10 = this.v;
            this.f35911n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f35912r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f35913s = i11;
        az azVar = this.f35906a;
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
        if (this.f35914w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new xy(this));
        this.f35906a = new az(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f35907b = zl0Var;
        zl0Var.setLayoutManager(new s4.c0(1, false));
        this.f35907b.setVerticalScrollBarEnabled(false);
        this.f35907b.setAdapter(this.f35906a);
        ((s4.j) this.f35907b.getItemAnimator()).C = false;
        frameLayout.addView(this.f35907b, w7.z5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new bz(this));
        this.f35908c = yVar;
        yVar.e(this.f35907b);
        this.f35907b.setOnItemClickListener(new ai.n6(16, this, context));
        this.f35907b.setOnItemLongClickListener(new zy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20771a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21109s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20791b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35907b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f35916y == null) {
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
