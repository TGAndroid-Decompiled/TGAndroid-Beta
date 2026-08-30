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
public final class mx0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.sl0 f36400a;
    public f2.i0 f36401b;
    public lx0 f36402c;
    public org.telegram.ui.Components.mz d;
    public int e;
    public int f36403f;
    public int h;
    public int f36404n;
    public int f36405r;
    public int f36406s;
    public int v;
    public int f36407w;
    public final boolean f36408x;
    public final int f36409y;

    public mx0() {
        super(null);
        this.f36409y = 1;
        this.f36408x = true;
    }

    public final void U(Long l10, View view) {
        boolean z4;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false)));
        int i11 = this.f36409y;
        if (i11 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new zq0(16, this, l10), z4);
        if (i11 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z10, i10, LocaleController.getString(R.string.Remove), true, new kx0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.e = 0;
        this.f36403f = -1;
        this.f36404n = -1;
        this.h = -1;
        this.f36407w = -1;
        if (!this.f36408x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f36403f = i10;
            int i12 = this.f36409y;
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
                        this.f36404n = i13;
                    }
                    int i14 = this.e;
                    this.f36405r = i14;
                    int i15 = i14 + size;
                    this.f36406s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f36407w = i16;
                    }
                } else {
                    this.f36404n = -1;
                    this.f36405r = -1;
                    this.f36406s = -1;
                    this.v = -1;
                    this.f36407w = -1;
                }
            } else {
                throw null;
            }
        }
        lx0 lx0Var = this.f36402c;
        if (lx0Var != null) {
            lx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f36409y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        if (i11 == 1) {
            mzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            mzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f36400a = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36400a);
        this.f36400a.setItemSelectorColorProvider(new jx0(this));
        this.f36400a.setEmptyView(this.d);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f36400a;
        f2.i0 i0Var = new f2.i0(1, false);
        this.f36401b = i0Var;
        sl0Var2.setLayoutManager(i0Var);
        this.f36400a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f36400a;
        lx0 lx0Var = new lx0(this, context);
        this.f36402c = lx0Var;
        sl0Var3.setAdapter(lx0Var);
        org.telegram.ui.Components.sl0 sl0Var4 = this.f36400a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        sl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f36400a, k7.b6.c(-1.0f, -1));
        this.f36400a.setOnItemClickListener(new j(this, 26));
        this.f36400a.setOnItemLongClickListener(new jx0(this));
        if (i11 == 1) {
            this.f36400a.setOnScrollListener(new l3(this, 26));
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
        org.telegram.ui.Components.sl0 sl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (sl0Var = this.f36400a) != null) {
                int childCount = sl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f36400a.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19978h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20207u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36400a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20225v6));
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
        if (this.f36409y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f36409y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36400a.setPadding(0, 0, 0, i13);
        this.f36400a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        lx0 lx0Var = this.f36402c;
        if (lx0Var != null) {
            lx0Var.l();
        }
    }
}
