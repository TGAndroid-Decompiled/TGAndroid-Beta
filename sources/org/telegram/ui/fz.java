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
public final class fz extends org.telegram.ui.ActionBar.o2 {
    public cz f33792a;
    public org.telegram.ui.Components.ml0 f33793b;
    public s4.y f33794c;
    public ImageView d;
    public final ArrayList e;
    public ez f33795f;
    public int h;
    public int f33796n;
    public int f33797r;
    public int f33798s;
    public int v;
    public final int f33799w;
    public final int f33800x;
    public y0 f33801y;

    public fz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f33799w = i10;
        this.f33800x = i11;
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
            org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(context, fzVar.currentAccount, null, 0L, fzVar, null);
            b70Var.Y(new gu(fzVar, 6));
            b70Var.Z(arrayList);
            fzVar.showDialog(b70Var);
        }
    }

    public static org.telegram.ui.ActionBar.e5 W(fz fzVar) {
        return fzVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 X(fz fzVar) {
        return fzVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ej(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f33796n = -1;
            this.f33797r = -1;
        } else {
            int i10 = this.v;
            this.f33796n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f33797r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f33798s = i11;
        cz czVar = this.f33792a;
        if (czVar != null) {
            czVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f33799w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new zy(this));
        this.f33792a = new cz(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18806a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f33793b = ml0Var;
        ml0Var.setLayoutManager(new s4.c0(1, false));
        this.f33793b.setVerticalScrollBarEnabled(false);
        this.f33793b.setAdapter(this.f33792a);
        ((s4.j) this.f33793b.getItemAnimator()).C = false;
        frameLayout.addView(this.f33793b, w7.x5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new dz(this));
        this.f33794c = yVar;
        yVar.e(this.f33793b);
        this.f33793b.setOnItemClickListener(new ai.o6(16, this, context));
        this.f33793b.setOnItemLongClickListener(new bz(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18862d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18806a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19139s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18952i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18984k0, null, null, org.telegram.ui.ActionBar.j6.f18863d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18826b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33793b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f33801y == null) {
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
