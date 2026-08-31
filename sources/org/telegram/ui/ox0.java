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
public final class ox0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.tl0 f39855a;
    public f2.j0 f39856b;
    public nx0 f39857c;
    public org.telegram.ui.Components.oz d;
    public int f39858e;
    public int f39859f;
    public int h;
    public int f39860n;
    public int f39861r;
    public int f39862s;
    public int v;
    public int f39863w;
    public final boolean f39864x;
    public final int f39865y;

    public ox0() {
        super(null);
        this.f39865y = 1;
        this.f39864x = true;
    }

    public final void U(Long l10, View view) {
        boolean z4;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)));
        int i11 = this.f39865y;
        if (i11 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new br0(15, this, l10), z4);
        if (i11 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z10, i10, LocaleController.getString(R.string.Remove), true, new mx0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f39858e = 0;
        this.f39859f = -1;
        this.f39860n = -1;
        this.h = -1;
        this.f39863w = -1;
        if (!this.f39864x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f39858e;
            int i11 = i10 + 1;
            this.f39858e = i11;
            this.f39859f = i10;
            int i12 = this.f39865y;
            if (i12 == 1) {
                this.f39858e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f39858e;
                        this.f39858e = i13 + 1;
                        this.f39860n = i13;
                    }
                    int i14 = this.f39858e;
                    this.f39861r = i14;
                    int i15 = i14 + size;
                    this.f39862s = i15;
                    int i16 = i15 + 1;
                    this.f39858e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f39858e = i15 + 2;
                        this.f39863w = i16;
                    }
                } else {
                    this.f39860n = -1;
                    this.f39861r = -1;
                    this.f39862s = -1;
                    this.v = -1;
                    this.f39863w = -1;
                }
            } else {
                throw null;
            }
        }
        nx0 nx0Var = this.f39857c;
        if (nx0Var != null) {
            nx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f39865y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.d = ozVar;
        if (i11 == 1) {
            ozVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            ozVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f39855a = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39855a);
        this.f39855a.setItemSelectorColorProvider(new lx0(this));
        this.f39855a.setEmptyView(this.d);
        org.telegram.ui.Components.tl0 tl0Var2 = this.f39855a;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f39856b = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        this.f39855a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tl0 tl0Var3 = this.f39855a;
        nx0 nx0Var = new nx0(this, context);
        this.f39857c = nx0Var;
        tl0Var3.setAdapter(nx0Var);
        org.telegram.ui.Components.tl0 tl0Var4 = this.f39855a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        tl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f39855a, k7.c6.c(-1.0f, -1));
        this.f39855a.setOnItemClickListener(new j(this, 26));
        this.f39855a.setOnItemLongClickListener(new lx0(this));
        if (i11 == 1) {
            this.f39855a.setOnScrollListener(new l3(this, 26));
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
        org.telegram.ui.Components.tl0 tl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (tl0Var = this.f39855a) != null) {
                int childCount = tl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f39855a.getChildAt(i12);
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
        f fVar = new f(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21642c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21961u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39855a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21979v6));
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
        if (this.f39865y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f39865y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39855a.setPadding(0, 0, 0, i13);
        this.f39855a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        nx0 nx0Var = this.f39857c;
        if (nx0Var != null) {
            nx0Var.l();
        }
    }
}
