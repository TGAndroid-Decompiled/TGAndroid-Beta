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
public final class ky0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.vl0 f34473a;
    public s4.c0 f34474b;
    public jy0 f34475c;
    public org.telegram.ui.Components.tz d;
    public int e;
    public int f34476f;
    public int h;
    public int f34477n;
    public int f34478r;
    public int f34479s;
    public int v;
    public int f34480w;
    public final boolean f34481x;
    public final int f34482y;

    public ky0() {
        super(null);
        this.f34482y = 1;
        this.f34481x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false)));
        int i11 = this.f34482y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new ey0(1, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new iy0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.e = 0;
        this.f34476f = -1;
        this.f34477n = -1;
        this.h = -1;
        this.f34480w = -1;
        if (!this.f34481x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f34476f = i10;
            int i12 = this.f34482y;
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
                        this.f34477n = i13;
                    }
                    int i14 = this.e;
                    this.f34478r = i14;
                    int i15 = i14 + size;
                    this.f34479s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f34480w = i16;
                    }
                } else {
                    this.f34477n = -1;
                    this.f34478r = -1;
                    this.f34479s = -1;
                    this.v = -1;
                    this.f34480w = -1;
                }
            } else {
                throw null;
            }
        }
        jy0 jy0Var = this.f34475c;
        if (jy0Var != null) {
            jy0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f34482y;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.d = tzVar;
        if (i11 == 1) {
            tzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            tzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f34473a = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34473a);
        this.f34473a.setItemSelectorColorProvider(new hy0(this));
        this.f34473a.setEmptyView(this.d);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f34473a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f34474b = c0Var;
        vl0Var2.setLayoutManager(c0Var);
        this.f34473a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.vl0 vl0Var3 = this.f34473a;
        jy0 jy0Var = new jy0(this, context);
        this.f34475c = jy0Var;
        vl0Var3.setAdapter(jy0Var);
        org.telegram.ui.Components.vl0 vl0Var4 = this.f34473a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        vl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f34473a, w7.a6.c(-1.0f, -1));
        this.f34473a.setOnItemClickListener(new i(this, 27));
        this.f34473a.setOnItemLongClickListener(new hy0(this));
        if (i11 == 1) {
            this.f34473a.setOnScrollListener(new j3(this, 25));
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
        org.telegram.ui.Components.vl0 vl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (vl0Var = this.f34473a) != null) {
                int childCount = vl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f34473a.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f17999h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34473a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
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
        if (this.f34482y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f34482y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34473a.setPadding(0, 0, 0, i13);
        this.f34473a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        jy0 jy0Var = this.f34475c;
        if (jy0Var != null) {
            jy0Var.l();
        }
    }
}
