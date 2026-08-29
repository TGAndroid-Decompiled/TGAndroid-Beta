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
public final class oy extends org.telegram.ui.ActionBar.o2 {
    public ly f41237a;
    public org.telegram.ui.Components.jl0 f41238b;
    public f2.e0 f41239c;
    public ImageView d;
    public final ArrayList f41240e;
    public ny f41241f;
    public int h;
    public int f41242n;
    public int f41243r;
    public int f41244s;
    public int v;
    public final int f41245w;
    public final int f41246x;
    public c1 f41247y;

    public oy(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f41240e = arrayList;
        this.f41245w = i10;
        this.f41246x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Z();
    }

    public static void U(oy oyVar, Context context, int i10) {
        ArrayList arrayList = oyVar.f41240e;
        if (i10 == oyVar.h) {
            org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(context, oyVar.currentAccount, null, 0L, oyVar, null);
            x60Var.Y(new xt(oyVar, 5));
            x60Var.Z(arrayList);
            oyVar.showDialog(x60Var);
        }
    }

    public static org.telegram.ui.ActionBar.b5 W(oy oyVar) {
        return oyVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(oy oyVar) {
        return oyVar.parentLayout;
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ui(this, 26), 1000L);
    }

    public final void Z() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.f41240e;
        if (arrayList.isEmpty()) {
            this.f41242n = -1;
            this.f41243r = -1;
        } else {
            int i10 = this.v;
            this.f41242n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f41243r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f41244s = i11;
        ly lyVar = this.f41237a;
        if (lyVar != null) {
            lyVar.l();
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
        if (this.f41245w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new iy(this));
        this.f41237a = new ly(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f41238b = jl0Var;
        jl0Var.setLayoutManager(new f2.j0(1, false));
        this.f41238b.setVerticalScrollBarEnabled(false);
        this.f41238b.setAdapter(this.f41237a);
        ((f2.l) this.f41238b.getItemAnimator()).C = false;
        frameLayout.addView(this.f41238b, i7.f6.c(-1.0f, -1));
        f2.e0 e0Var = new f2.e0(new my(this));
        this.f41239c = e0Var;
        e0Var.d(this.f41238b);
        this.f41238b.setOnItemClickListener(new eg.w0(17, this, context));
        this.f41238b.setOnItemLongClickListener(new ky(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 16, new Class[]{org.telegram.ui.Cells.m8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41238b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f41247y == null) {
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
        fy.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
