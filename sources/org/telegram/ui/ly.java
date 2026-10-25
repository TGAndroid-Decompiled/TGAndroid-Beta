package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ly extends org.telegram.ui.ActionBar.r2 {
    public iy f41389a;
    public org.telegram.ui.Components.mm0 f41390b;
    public s4.z f41391c;
    public ImageView d;
    public final ArrayList e;
    public ky f41392f;
    public int h;
    public int f41393n;
    public int f41394r;
    public int f41395s;
    public int v;
    public final int f41396w;
    public final int f41397x;
    public y0 f41398y;

    public ly(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f41396w = i10;
        this.f41397x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        a0();
    }

    public static void V(ly lyVar, Context context, int i10) {
        ArrayList arrayList = lyVar.e;
        if (i10 == lyVar.h) {
            org.telegram.ui.Components.y70 y70Var = new org.telegram.ui.Components.y70(context, lyVar.currentAccount, null, 0L, lyVar, null);
            y70Var.Y(new qt(lyVar, 7));
            y70Var.Z(arrayList);
            lyVar.showDialog(y70Var);
        }
    }

    public static org.telegram.ui.ActionBar.j5 X(ly lyVar) {
        return lyVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 Y(ly lyVar) {
        return lyVar.parentLayout;
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ui(this, 26), 1000L);
    }

    public final void a0() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f41393n = -1;
            this.f41394r = -1;
        } else {
            int i10 = this.v;
            this.f41393n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f41394r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f41395s = i11;
        iy iyVar = this.f41389a;
        if (iyVar != null) {
            iyVar.l();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f41396w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.l().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new fy(this));
        this.f41389a = new iy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23297a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f41390b = mm0Var;
        mm0Var.setLayoutManager(new s4.c0(1, false));
        this.f41390b.setVerticalScrollBarEnabled(false);
        this.f41390b.setAdapter(this.f41389a);
        ((s4.l) this.f41390b.getItemAnimator()).C = false;
        frameLayout.addView(this.f41390b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        s4.z zVar = new s4.z(new jy(this));
        this.f41391c = zVar;
        zVar.h(this.f41390b);
        this.f41390b.setOnItemClickListener(new di.x4(16, this, context));
        this.f41390b.setOnItemLongClickListener(new hy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        int i10 = org.telegram.ui.ActionBar.y6.f23595q6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f41398y == null) {
            if (z10) {
                Z();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        cy.q4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
