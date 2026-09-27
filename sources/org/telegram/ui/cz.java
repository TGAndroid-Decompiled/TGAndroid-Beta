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
public final class cz extends org.telegram.ui.ActionBar.o2 {
    public zy f32813a;
    public org.telegram.ui.Components.yl0 f32814b;
    public s4.y f32815c;
    public ImageView d;
    public final ArrayList e;
    public bz f32816f;
    public int h;
    public int f32817n;
    public int f32818r;
    public int f32819s;
    public int v;
    public final int f32820w;
    public final int f32821x;
    public a1 f32822y;

    public cz(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f32820w = i10;
        this.f32821x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(cz czVar, Context context, int i10) {
        ArrayList arrayList = czVar.e;
        if (i10 == czVar.h) {
            org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(context, czVar.currentAccount, null, 0L, czVar, null);
            o70Var.Y(new au(czVar, 7));
            o70Var.Z(arrayList);
            czVar.showDialog(o70Var);
        }
    }

    public static org.telegram.ui.ActionBar.d5 W(cz czVar) {
        return czVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 X(cz czVar) {
        return czVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new cj(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f32817n = -1;
            this.f32818r = -1;
        } else {
            int i10 = this.v;
            this.f32817n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f32818r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f32819s = i11;
        zy zyVar = this.f32813a;
        if (zyVar != null) {
            zyVar.l();
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
        if (this.f32820w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.o().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new wy(this));
        this.f32813a = new zy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f32814b = yl0Var;
        yl0Var.setLayoutManager(new s4.c0(1, false));
        this.f32814b.setVerticalScrollBarEnabled(false);
        this.f32814b.setAdapter(this.f32813a);
        ((s4.j) this.f32814b.getItemAnimator()).C = false;
        frameLayout.addView(this.f32814b, w7.y5.c(-1.0f, -1));
        s4.y yVar = new s4.y(new az(this));
        this.f32815c = yVar;
        yVar.e(this.f32814b);
        this.f32814b.setOnItemClickListener(new ai.n6(16, this, context));
        this.f32814b.setOnItemLongClickListener(new yy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 16, new Class[]{org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19021b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32814b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f32822y == null) {
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
        ty.r4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
