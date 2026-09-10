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
public final class fz extends org.telegram.ui.ActionBar.p2 {
    public cz f32936a;
    public org.telegram.ui.Components.vl0 f32937b;
    public s4.y f32938c;
    public ImageView d;
    public final ArrayList e;
    public ez f32939f;
    public int h;
    public int f32940n;
    public int f32941r;
    public int f32942s;
    public int v;
    public final int f32943w;
    public final int f32944x;
    public a1 f32945y;

    public fz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f32943w = i10;
        this.f32944x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(fz fzVar, Context context, int i10) {
        ArrayList arrayList = fzVar.e;
        if (i10 == fzVar.h) {
            org.telegram.ui.Components.k70 k70Var = new org.telegram.ui.Components.k70(context, fzVar.currentAccount, null, 0L, fzVar, null);
            k70Var.Y(new iu(fzVar, 5));
            k70Var.Z(arrayList);
            fzVar.showDialog(k70Var);
        }
    }

    public static org.telegram.ui.ActionBar.f5 W(fz fzVar) {
        return fzVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 X(fz fzVar) {
        return fzVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new fj(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f32940n = -1;
            this.f32941r = -1;
        } else {
            int i10 = this.v;
            this.f32940n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f32941r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f32942s = i11;
        cz czVar = this.f32936a;
        if (czVar != null) {
            czVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f32943w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new zy(this));
        this.f32936a = new cz(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f32937b = vl0Var;
        vl0Var.setLayoutManager(new s4.c0(1, false));
        this.f32937b.setVerticalScrollBarEnabled(false);
        this.f32937b.setAdapter(this.f32936a);
        ((s4.j) this.f32937b.getItemAnimator()).C = false;
        frameLayout.addView(this.f32937b, w7.a6.c(-1.0f, -1));
        s4.y yVar = new s4.y(new dz(this));
        this.f32938c = yVar;
        yVar.d(this.f32937b);
        this.f32937b.setOnItemClickListener(new ai.b0(15, this, context));
        this.f32937b.setOnItemLongClickListener(new bz(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 16, new Class[]{org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32937b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f32945y == null) {
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
        wy.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
