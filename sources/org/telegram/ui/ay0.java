package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ay0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.yl0 f32174a;
    public s4.c0 f32175b;
    public zx0 f32176c;
    public org.telegram.ui.Components.oz d;
    public int e;
    public int f32177f;
    public int h;
    public int f32178n;
    public int f32179r;
    public int f32180s;
    public int v;
    public int f32181w;
    public final boolean f32182x;
    public final int f32183y;

    public ay0() {
        super(null);
        this.f32183y = 1;
        this.f32182x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false)));
        int i11 = this.f32183y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new jl0(29, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new yx0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.e = 0;
        this.f32177f = -1;
        this.f32178n = -1;
        this.h = -1;
        this.f32181w = -1;
        if (!this.f32182x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f32177f = i10;
            int i12 = this.f32183y;
            if (i12 == 1) {
                this.e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.e;
                        this.e = i13 + 1;
                        this.f32178n = i13;
                    }
                    int i14 = this.e;
                    this.f32179r = i14;
                    int i15 = i14 + size;
                    this.f32180s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f32181w = i16;
                    }
                } else {
                    this.f32178n = -1;
                    this.f32179r = -1;
                    this.f32180s = -1;
                    this.v = -1;
                    this.f32181w = -1;
                }
            } else {
                throw null;
            }
        }
        zx0 zx0Var = this.f32176c;
        if (zx0Var != null) {
            zx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f32183y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.d = ozVar;
        if (i11 == 1) {
            ozVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            ozVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f32174a = yl0Var;
        yl0Var.q1();
        this.f32174a.setItemSelectorColorProvider(new xx0(this));
        this.f32174a.setEmptyView(this.d);
        org.telegram.ui.Components.yl0 yl0Var2 = this.f32174a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f32175b = c0Var;
        yl0Var2.setLayoutManager(c0Var);
        this.f32174a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.yl0 yl0Var3 = this.f32174a;
        zx0 zx0Var = new zx0(this, context);
        this.f32176c = zx0Var;
        yl0Var3.setAdapter(zx0Var);
        org.telegram.ui.Components.yl0 yl0Var4 = this.f32174a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        yl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f32174a, w7.y5.c(-1.0f, -1));
        this.f32174a.setOnItemClickListener(new i(this, 27));
        this.f32174a.setOnItemLongClickListener(new xx0(this));
        if (i11 == 1) {
            this.f32174a.setOnScrollListener(new j3(this, 25));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        V();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.yl0 yl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (yl0Var = this.f32174a) != null) {
                int childCount = yl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f32174a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).c(intValue);
                    }
                }
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.d.c();
            V();
        }
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f32174a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f19040c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f19129h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19021b7));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f19442y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f19242n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f19310r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19222m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19372u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32174a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19390v6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.f32183y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f32183y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        zx0 zx0Var = this.f32176c;
        if (zx0Var != null) {
            zx0Var.l();
        }
    }
}
