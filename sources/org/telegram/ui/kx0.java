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
public final class kx0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.jm0 f38681a;
    public s4.b0 f38682b;
    public jx0 f38683c;
    public org.telegram.ui.Components.vz d;
    public int e;
    public int f38684f;
    public int h;
    public int f38685n;
    public int f38686r;
    public int f38687s;
    public int v;
    public int f38688w;
    public final boolean f38689x;
    public final int f38690y;

    public kx0() {
        super(null);
        this.f38690y = 1;
        this.f38689x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false)));
        int i11 = this.f38690y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new jv0(6, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new ix0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.e = 0;
        this.f38684f = -1;
        this.f38685n = -1;
        this.h = -1;
        this.f38688w = -1;
        if (!this.f38689x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f38684f = i10;
            int i12 = this.f38690y;
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
                        this.f38685n = i13;
                    }
                    int i14 = this.e;
                    this.f38686r = i14;
                    int i15 = i14 + size;
                    this.f38687s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f38688w = i16;
                    }
                } else {
                    this.f38685n = -1;
                    this.f38686r = -1;
                    this.f38687s = -1;
                    this.v = -1;
                    this.f38688w = -1;
                }
            } else {
                throw null;
            }
        }
        jx0 jx0Var = this.f38683c;
        if (jx0Var != null) {
            jx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f38690y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 25));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.d = vzVar;
        if (i11 == 1) {
            vzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            vzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f38681a = jm0Var;
        jm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38681a);
        this.f38681a.setItemSelectorColorProvider(new hx0(this));
        this.f38681a.setEmptyView(this.d);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f38681a;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f38682b = b0Var;
        jm0Var2.setLayoutManager(b0Var);
        this.f38681a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.jm0 jm0Var3 = this.f38681a;
        jx0 jx0Var = new jx0(this, context);
        this.f38683c = jx0Var;
        jm0Var3.setAdapter(jx0Var);
        org.telegram.ui.Components.jm0 jm0Var4 = this.f38681a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        jm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38681a, w7.z5.c(-1.0f, -1));
        this.f38681a.setOnItemClickListener(new i(this, 28));
        this.f38681a.setOnItemLongClickListener(new hx0(this));
        if (i11 == 1) {
            this.f38681a.setOnScrollListener(new k3(this, 25));
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
        org.telegram.ui.Components.jm0 jm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (jm0Var = this.f38681a) != null) {
                int childCount = jm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f38681a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).c(intValue);
                    }
                }
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.d.c();
            V();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21269s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20972c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21062h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20952b7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21378y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21173n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.h6.f21241r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21153m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21306u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38681a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21323v6));
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
        if (this.f38690y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f38690y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38681a.setPadding(0, 0, 0, i13);
        this.f38681a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        jx0 jx0Var = this.f38683c;
        if (jx0Var != null) {
            jx0Var.l();
        }
    }
}
