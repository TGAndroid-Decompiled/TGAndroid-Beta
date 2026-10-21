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
public final class ly extends org.telegram.ui.ActionBar.n2 {
    public iy f39043a;
    public org.telegram.ui.Components.jm0 f39044b;
    public s4.y f39045c;
    public ImageView d;
    public final ArrayList e;
    public ky f39046f;
    public int h;
    public int f39047n;
    public int f39048r;
    public int f39049s;
    public int v;
    public final int f39050w;
    public final int f39051x;
    public b1 f39052y;

    public ly(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f39050w = i10;
        this.f39051x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(ly lyVar, Context context, int i10) {
        ArrayList arrayList = lyVar.e;
        if (i10 == lyVar.h) {
            org.telegram.ui.Components.v70 v70Var = new org.telegram.ui.Components.v70(context, lyVar.currentAccount, null, 0L, lyVar, null);
            v70Var.Z(new ut(lyVar, 5));
            v70Var.a0(arrayList);
            lyVar.showDialog(v70Var);
        }
    }

    public static org.telegram.ui.ActionBar.d5 W(ly lyVar) {
        return lyVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 X(ly lyVar) {
        return lyVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ti(this, 27), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f39047n = -1;
            this.f39048r = -1;
        } else {
            int i10 = this.v;
            this.f39047n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f39048r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f39049s = i11;
        iy iyVar = this.f39043a;
        if (iyVar != null) {
            iyVar.l();
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
        if (this.f39050w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new fy(this));
        this.f39043a = new iy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f39044b = jm0Var;
        jm0Var.setLayoutManager(new s4.b0(1, false));
        this.f39044b.setVerticalScrollBarEnabled(false);
        this.f39044b.setAdapter(this.f39043a);
        ((s4.k) this.f39044b.getItemAnimator()).C = false;
        frameLayout.addView(this.f39044b, w7.z5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new jy(this));
        this.f39045c = yVar;
        yVar.d(this.f39044b);
        this.f39044b.setOnItemClickListener(new ci.y4(16, this, context));
        this.f39044b.setOnItemLongClickListener(new hy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 16, new Class[]{org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21269s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20952b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39044b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f39052y == null) {
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
        cy.g4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
