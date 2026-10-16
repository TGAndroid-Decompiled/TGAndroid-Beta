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
public final class hz extends org.telegram.ui.ActionBar.m2 {
    public ez f36670a;
    public org.telegram.ui.Components.mm0 f36671b;
    public s4.y f36672c;
    public ImageView d;
    public final ArrayList e;
    public gz f36673f;
    public int h;
    public int f36674n;
    public int f36675r;
    public int f36676s;
    public int v;
    public final int f36677w;
    public final int f36678x;
    public b1 f36679y;

    public hz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f36677w = i10;
        this.f36678x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(hz hzVar, Context context, int i10) {
        ArrayList arrayList = hzVar.e;
        if (i10 == hzVar.h) {
            org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, hzVar.currentAccount, null, 0L, hzVar, null);
            z70Var.Z(new mu(hzVar, 5));
            z70Var.a0(arrayList);
            hzVar.showDialog(z70Var);
        }
    }

    public static org.telegram.ui.ActionBar.b5 W(hz hzVar) {
        return hzVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(hz hzVar) {
        return hzVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new gj(this, 27), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f36674n = -1;
            this.f36675r = -1;
        } else {
            int i10 = this.v;
            this.f36674n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f36675r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f36676s = i11;
        ez ezVar = this.f36670a;
        if (ezVar != null) {
            ezVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f36677w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new bz(this));
        this.f36670a = new ez(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f36671b = mm0Var;
        mm0Var.setLayoutManager(new s4.b0(1, false));
        this.f36671b.setVerticalScrollBarEnabled(false);
        this.f36671b.setAdapter(this.f36670a);
        ((s4.k) this.f36671b.getItemAnimator()).C = false;
        frameLayout.addView(this.f36671b, w7.z5.d(-1.0f, -1));
        s4.y yVar = new s4.y(new fz(this));
        this.f36672c = yVar;
        yVar.d(this.f36671b);
        this.f36671b.setOnItemClickListener(new bi.z5(16, this, context));
        this.f36671b.setOnItemLongClickListener(new dz(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36671b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f36679y == null) {
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
        yy.g4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
