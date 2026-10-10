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
    public org.telegram.ui.Components.rm0 f38186a;
    public s4.d0 f38187b;
    public fy0 f38188c;
    public org.telegram.ui.Components.d00 d;
    public int f38189e;
    public int f38190f;
    public int h;
    public int f38191n;
    public int f38192r;
    public int f38193s;
    public int v;
    public int f38194w;
    public final boolean f38195x;
    public final int f38196y;

    public gy0() {
        super(null);
        this.f38196y = 1;
        this.f38195x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false)));
        int i11 = this.f38196y;
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
        this.f38189e = 0;
        this.f38190f = -1;
        this.f38191n = -1;
        this.h = -1;
        this.f38194w = -1;
        if (!this.f38195x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f38189e;
            int i11 = i10 + 1;
            this.f38189e = i11;
            this.f38190f = i10;
            int i12 = this.f38196y;
            if (i12 == 1) {
                this.f38189e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f38189e;
                        this.f38189e = i13 + 1;
                        this.f38191n = i13;
                    }
                    int i14 = this.f38189e;
                    this.f38192r = i14;
                    int i15 = i14 + size;
                    this.f38193s = i15;
                    int i16 = i15 + 1;
                    this.f38189e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f38189e = i15 + 2;
                        this.f38194w = i16;
                    }
                } else {
                    this.f38191n = -1;
                    this.f38192r = -1;
                    this.f38193s = -1;
                    this.v = -1;
                    this.f38194w = -1;
                }
            } else {
                throw null;
            }
        }
        fy0 fy0Var = this.f38188c;
        if (fy0Var != null) {
            fy0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f38196y;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
        org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(context, null);
        this.d = d00Var;
        if (i11 == 1) {
            d00Var.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            d00Var.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f38186a = rm0Var;
        rm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38186a);
        this.f38186a.setItemSelectorColorProvider(new dy0(this));
        this.f38186a.setEmptyView(this.d);
        org.telegram.ui.Components.rm0 rm0Var2 = this.f38186a;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f38187b = d0Var;
        rm0Var2.setLayoutManager(d0Var);
        this.f38186a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.rm0 rm0Var3 = this.f38186a;
        fy0 fy0Var = new fy0(this, context);
        this.f38188c = fy0Var;
        rm0Var3.setAdapter(fy0Var);
        org.telegram.ui.Components.rm0 rm0Var4 = this.f38186a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        rm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38186a, w7.x5.d(-1.0f, -1));
        this.f38186a.setOnItemClickListener(new i(this, 27));
        this.f38186a.setOnItemLongClickListener(new dy0(this));
        if (i11 == 1) {
            this.f38186a.setOnScrollListener(new i3(this, 25));
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
        org.telegram.ui.Components.rm0 rm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (rm0Var = this.f38186a) != null) {
                int childCount = rm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f38186a.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20745a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20801d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21079s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20785c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20873h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20765b7));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21185y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f20986n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20966m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21114u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38186a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21132v6));
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
        if (this.f38196y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f38196y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38186a.setPadding(0, 0, 0, i13);
        this.f38186a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fy0 fy0Var = this.f38188c;
        if (fy0Var != null) {
            fy0Var.l();
        }
    }
}
