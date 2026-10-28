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
public final class ny extends org.telegram.ui.ActionBar.r2 {
    public ky f41916a;
    public org.telegram.ui.Components.nm0 f41917b;
    public s4.z f41918c;
    public ImageView d;
    public final ArrayList e;
    public my f41919f;
    public int h;
    public int f41920n;
    public int f41921r;
    public int f41922s;
    public int v;
    public final int f41923w;
    public final int f41924x;
    public y0 f41925y;

    public ny(int i10, int i11) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f41923w = i10;
        this.f41924x = i11;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        a0();
    }

    public static void V(ny nyVar, Context context, int i10) {
        ArrayList arrayList = nyVar.e;
        if (i10 == nyVar.h) {
            org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, nyVar.currentAccount, null, 0L, nyVar, null);
            z70Var.Y(new st(nyVar, 7));
            z70Var.Z(arrayList);
            nyVar.showDialog(z70Var);
        }
    }

    public static org.telegram.ui.ActionBar.j5 X(ny nyVar) {
        return nyVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 Y(ny nyVar) {
        return nyVar.parentLayout;
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new xi(this, 26), 1000L);
    }

    public final void a0() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f41920n = -1;
            this.f41921r = -1;
        } else {
            int i10 = this.v;
            this.f41920n = i10;
            int size = arrayList.size() + i10;
            this.v = size;
            this.f41921r = size;
        }
        int i11 = this.v;
        this.v = i11 + 1;
        this.f41922s = i11;
        ky kyVar = this.f41916a;
        if (kyVar != null) {
            kyVar.l();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f41923w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.l().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new hy(this));
        this.f41916a = new ky(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f41917b = nm0Var;
        nm0Var.setLayoutManager(new s4.c0(1, false));
        this.f41917b.setVerticalScrollBarEnabled(false);
        this.f41917b.setAdapter(this.f41916a);
        ((s4.l) this.f41917b.getItemAnimator()).C = false;
        frameLayout.addView(this.f41917b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        s4.z zVar = new s4.z(new ly(this));
        this.f41918c = zVar;
        zVar.h(this.f41917b);
        this.f41917b.setOnItemClickListener(new di.x4(16, this, context));
        this.f41917b.setOnItemLongClickListener(new jy(this));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        int i10 = org.telegram.ui.ActionBar.y6.f23598q6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41917b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41917b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f41925y == null) {
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
        ey.q4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
