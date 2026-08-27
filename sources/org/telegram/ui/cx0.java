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

public final class cx0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public org.telegram.ui.Components.zk0 f37180a;

    public f2.k0 f37181b;

    public bx0 f37182c;
    public org.telegram.ui.Components.az d;

    public int f37183e;

    public int f37184f;
    public int h;

    public int f37185n;

    public int f37186r;

    public int f37187s;
    public int v;

    public int f37188w;

    public final boolean f37189x;

    public final int f37190y;

    public cx0() {
        super(null);
        this.f37190y = 1;
        this.f37189x = true;
    }

    public final void U(Long l10, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
        b70VarH.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false)));
        int i10 = this.f37190y;
        b70VarH.l(0, LocaleController.getString(R.string.Unblock), new zs0(10, this, l10), i10 == 1);
        b70VarH.m(i10 != 1, i10 == 0 ? R.drawable.msg_user_remove : 0, LocaleController.getString(R.string.Remove), true, new ax0(this, l10));
        b70VarH.S = 190;
        b70VarH.Z();
    }

    public final void V() {
        this.f37183e = 0;
        this.f37184f = -1;
        this.f37185n = -1;
        this.h = -1;
        this.f37188w = -1;
        if (!this.f37189x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f37183e;
            int i11 = i10 + 1;
            this.f37183e = i11;
            this.f37184f = i10;
            int i12 = this.f37190y;
            if (i12 == 1) {
                this.f37183e = i10 + 2;
                this.h = i11;
            }
            if (i12 != 1) {
                throw null;
            }
            int size = getMessagesController().blockePeers.size();
            if (size != 0) {
                if (i12 == 1) {
                    int i13 = this.f37183e;
                    this.f37183e = i13 + 1;
                    this.f37185n = i13;
                }
                int i14 = this.f37183e;
                this.f37186r = i14;
                int i15 = i14 + size;
                this.f37187s = i15;
                int i16 = i15 + 1;
                this.f37183e = i16;
                this.v = i15;
                if (i12 != 1) {
                    this.f37183e = i15 + 2;
                    this.f37188w = i16;
                }
            } else {
                this.f37185n = -1;
                this.f37186r = -1;
                this.f37187s = -1;
                this.v = -1;
                this.f37188w = -1;
            }
        }
        bx0 bx0Var = this.f37182c;
        if (bx0Var != null) {
            bx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f37190y;
        if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.d = azVar;
        if (i10 == 1) {
            azVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            azVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f37180a = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37180a);
        this.f37180a.setItemSelectorColorProvider(new zw0(this));
        this.f37180a.setEmptyView(this.d);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f37180a;
        f2.k0 k0Var = new f2.k0(1, false);
        this.f37181b = k0Var;
        zk0Var2.setLayoutManager(k0Var);
        this.f37180a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.zk0 zk0Var3 = this.f37180a;
        bx0 bx0Var = new bx0(this, context);
        this.f37182c = bx0Var;
        zk0Var3.setAdapter(bx0Var);
        this.f37180a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.f37180a, h7.z5.c(-1.0f, -1));
        this.f37180a.setOnItemClickListener(new i(this, 26));
        this.f37180a.setOnItemLongClickListener(new zw0(this));
        if (i10 == 1) {
            this.f37180a.setOnScrollListener(new m3(this, 26));
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
        org.telegram.ui.Components.zk0 zk0Var;
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.blockedUsersDidLoad) {
                this.d.c();
                V();
                return;
            }
            return;
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0) || (zk0Var = this.f37180a) == null) {
            return;
        }
        int childCount = zk0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f37180a.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.y4) {
                ((org.telegram.ui.Cells.y4) childAt).c(iIntValue);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 16, new Class[]{org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.v4.class, org.telegram.ui.Cells.j4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 0, new Class[]{org.telegram.ui.Cells.y4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37180a, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
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
        if (this.f37190y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f37190y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37180a.setPadding(0, 0, 0, i13);
        this.f37180a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        bx0 bx0Var = this.f37182c;
        if (bx0Var != null) {
            bx0Var.l();
        }
    }
}
