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
public final class gy0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.qm0 f38140a;
    public s4.d0 f38141b;
    public fy0 f38142c;
    public org.telegram.ui.Components.c00 d;
    public int f38143e;
    public int f38144f;
    public int h;
    public int f38145n;
    public int f38146r;
    public int f38147s;
    public int v;
    public int f38148w;
    public final boolean f38149x;
    public final int f38150y;

    public gy0() {
        super(null);
        this.f38150y = 1;
        this.f38149x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false)));
        int i11 = this.f38150y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new rt0(12, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new ey0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f38143e = 0;
        this.f38144f = -1;
        this.f38145n = -1;
        this.h = -1;
        this.f38148w = -1;
        if (!this.f38149x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f38143e;
            int i11 = i10 + 1;
            this.f38143e = i11;
            this.f38144f = i10;
            int i12 = this.f38150y;
            if (i12 == 1) {
                this.f38143e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f38143e;
                        this.f38143e = i13 + 1;
                        this.f38145n = i13;
                    }
                    int i14 = this.f38143e;
                    this.f38146r = i14;
                    int i15 = i14 + size;
                    this.f38147s = i15;
                    int i16 = i15 + 1;
                    this.f38143e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f38143e = i15 + 2;
                        this.f38148w = i16;
                    }
                } else {
                    this.f38145n = -1;
                    this.f38146r = -1;
                    this.f38147s = -1;
                    this.v = -1;
                    this.f38148w = -1;
                }
            } else {
                throw null;
            }
        }
        fy0 fy0Var = this.f38142c;
        if (fy0Var != null) {
            fy0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f38150y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context, null);
        this.d = c00Var;
        if (i11 == 1) {
            c00Var.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            c00Var.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f38140a = qm0Var;
        qm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38140a);
        this.f38140a.setItemSelectorColorProvider(new dy0(this));
        this.f38140a.setEmptyView(this.d);
        org.telegram.ui.Components.qm0 qm0Var2 = this.f38140a;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f38141b = d0Var;
        qm0Var2.setLayoutManager(d0Var);
        this.f38140a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.qm0 qm0Var3 = this.f38140a;
        fy0 fy0Var = new fy0(this, context);
        this.f38142c = fy0Var;
        qm0Var3.setAdapter(fy0Var);
        org.telegram.ui.Components.qm0 qm0Var4 = this.f38140a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        qm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38140a, w7.x5.d(-1.0f, -1));
        this.f38140a.setOnItemClickListener(new i(this, 27));
        this.f38140a.setOnItemLongClickListener(new dy0(this));
        if (i11 == 1) {
            this.f38140a.setOnScrollListener(new i3(this, 25));
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
        org.telegram.ui.Components.qm0 qm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (qm0Var = this.f38140a) != null) {
                int childCount = qm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f38140a.getChildAt(i12);
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
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20781c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20869h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21181y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f20982n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21049r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20962m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21110u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38140a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21128v6));
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
        if (this.f38150y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f38150y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38140a.setPadding(0, 0, 0, i13);
        this.f38140a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fy0 fy0Var = this.f38142c;
        if (fy0Var != null) {
            fy0Var.l();
        }
    }
}
