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
public final class fy0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.sm0 f37804a;
    public s4.d0 f37805b;
    public ey0 f37806c;
    public org.telegram.ui.Components.d00 d;
    public int f37807e;
    public int f37808f;
    public int h;
    public int f37809n;
    public int f37810r;
    public int f37811s;
    public int v;
    public int f37812w;
    public final boolean f37813x;
    public final int f37814y;

    public fy0() {
        super(null);
        this.f37814y = 1;
        this.f37813x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false)));
        int i11 = this.f37814y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new tt0(11, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new dy0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f37807e = 0;
        this.f37808f = -1;
        this.f37809n = -1;
        this.h = -1;
        this.f37812w = -1;
        if (!this.f37813x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f37807e;
            int i11 = i10 + 1;
            this.f37807e = i11;
            this.f37808f = i10;
            int i12 = this.f37814y;
            if (i12 == 1) {
                this.f37807e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f37807e;
                        this.f37807e = i13 + 1;
                        this.f37809n = i13;
                    }
                    int i14 = this.f37807e;
                    this.f37810r = i14;
                    int i15 = i14 + size;
                    this.f37811s = i15;
                    int i16 = i15 + 1;
                    this.f37807e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f37807e = i15 + 2;
                        this.f37812w = i16;
                    }
                } else {
                    this.f37809n = -1;
                    this.f37810r = -1;
                    this.f37811s = -1;
                    this.v = -1;
                    this.f37812w = -1;
                }
            } else {
                throw null;
            }
        }
        ey0 ey0Var = this.f37806c;
        if (ey0Var != null) {
            ey0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f37814y;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(context, null);
        this.d = d00Var;
        if (i11 == 1) {
            d00Var.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            d00Var.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(context, null);
        this.f37804a = sm0Var;
        sm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37804a);
        this.f37804a.setItemSelectorColorProvider(new cy0(this));
        this.f37804a.setEmptyView(this.d);
        org.telegram.ui.Components.sm0 sm0Var2 = this.f37804a;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f37805b = d0Var;
        sm0Var2.setLayoutManager(d0Var);
        this.f37804a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.sm0 sm0Var3 = this.f37804a;
        ey0 ey0Var = new ey0(this, context);
        this.f37806c = ey0Var;
        sm0Var3.setAdapter(ey0Var);
        org.telegram.ui.Components.sm0 sm0Var4 = this.f37804a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        sm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f37804a, w7.x5.d(-1.0f, -1));
        this.f37804a.setOnItemClickListener(new i(this, 27));
        this.f37804a.setOnItemLongClickListener(new cy0(this));
        if (i11 == 1) {
            this.f37804a.setOnScrollListener(new h3(this, 25));
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
        org.telegram.ui.Components.sm0 sm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (sm0Var = this.f37804a) != null) {
                int childCount = sm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f37804a.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20770c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20750b7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21171y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f20971n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.h6.f21039r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20951m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21100u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21118v6));
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
        if (this.f37814y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f37814y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37804a.setPadding(0, 0, 0, i13);
        this.f37804a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ey0 ey0Var = this.f37806c;
        if (ey0Var != null) {
            ey0Var.l();
        }
    }
}
