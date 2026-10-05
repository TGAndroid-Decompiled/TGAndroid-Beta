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
public final class by0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.zl0 f35234a;
    public s4.c0 f35235b;
    public ay0 f35236c;
    public org.telegram.ui.Components.pz d;
    public int f35237e;
    public int f35238f;
    public int h;
    public int f35239n;
    public int f35240r;
    public int f35241s;
    public int v;
    public int f35242w;
    public final boolean f35243x;
    public final int f35244y;

    public by0() {
        super(null);
        this.f35244y = 1;
        this.f35243x = true;
    }

    public final void S(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)));
        int i11 = this.f35244y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new wx0(1, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new zx0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void T() {
        this.f35237e = 0;
        this.f35238f = -1;
        this.f35239n = -1;
        this.h = -1;
        this.f35242w = -1;
        if (!this.f35243x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f35237e;
            int i11 = i10 + 1;
            this.f35237e = i11;
            this.f35238f = i10;
            int i12 = this.f35244y;
            if (i12 == 1) {
                this.f35237e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f35237e;
                        this.f35237e = i13 + 1;
                        this.f35239n = i13;
                    }
                    int i14 = this.f35237e;
                    this.f35240r = i14;
                    int i15 = i14 + size;
                    this.f35241s = i15;
                    int i16 = i15 + 1;
                    this.f35237e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f35237e = i15 + 2;
                        this.f35242w = i16;
                    }
                } else {
                    this.f35239n = -1;
                    this.f35240r = -1;
                    this.f35241s = -1;
                    this.v = -1;
                    this.f35242w = -1;
                }
            } else {
                throw null;
            }
        }
        ay0 ay0Var = this.f35236c;
        if (ay0Var != null) {
            ay0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f35244y;
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
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.d = pzVar;
        if (i11 == 1) {
            pzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            pzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f35234a = zl0Var;
        zl0Var.r1();
        this.f35234a.setItemSelectorColorProvider(new yx0(this));
        this.f35234a.setSectionsDrawBackground(true);
        this.f35234a.setEmptyView(this.d);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f35234a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f35235b = c0Var;
        zl0Var2.setLayoutManager(c0Var);
        this.f35234a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.zl0 zl0Var3 = this.f35234a;
        ay0 ay0Var = new ay0(this, context);
        this.f35236c = ay0Var;
        zl0Var3.setAdapter(ay0Var);
        org.telegram.ui.Components.zl0 zl0Var4 = this.f35234a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        zl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f35234a, w7.z5.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        this.f35234a.setOnItemClickListener(new i(this, 27));
        this.f35234a.setOnItemLongClickListener(new yx0(this));
        if (i11 == 1) {
            this.f35234a.setOnScrollListener(new i3(this, 26));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        T();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.zl0 zl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (zl0Var = this.f35234a) != null) {
                int childCount = zl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f35234a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).c(intValue);
                    }
                }
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.d.c();
            T();
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f35234a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20810c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20900h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20791b7));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21214y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21013n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20993m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21144u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35234a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21162v6));
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
        if (this.f35244y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f35244y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ay0 ay0Var = this.f35236c;
        if (ay0Var != null) {
            ay0Var.l();
        }
    }
}
