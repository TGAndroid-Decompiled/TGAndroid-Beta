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
public final class hy0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.ll0 f37158a;
    public s4.c0 f37159b;
    public gy0 f37160c;
    public org.telegram.ui.Components.mz d;
    public int f37161e;
    public int f37162f;
    public int h;
    public int f37163n;
    public int f37164r;
    public int f37165s;
    public int v;
    public int f37166w;
    public final boolean f37167x;
    public final int f37168y;

    public hy0() {
        super(null);
        this.f37168y = 1;
        this.f37167x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d6, false)));
        int i11 = this.f37168y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new rx0(4, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new fy0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f37161e = 0;
        this.f37162f = -1;
        this.f37163n = -1;
        this.h = -1;
        this.f37166w = -1;
        if (!this.f37167x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f37161e;
            int i11 = i10 + 1;
            this.f37161e = i11;
            this.f37162f = i10;
            int i12 = this.f37168y;
            if (i12 == 1) {
                this.f37161e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f37161e;
                        this.f37161e = i13 + 1;
                        this.f37163n = i13;
                    }
                    int i14 = this.f37161e;
                    this.f37164r = i14;
                    int i15 = i14 + size;
                    this.f37165s = i15;
                    int i16 = i15 + 1;
                    this.f37161e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f37161e = i15 + 2;
                        this.f37166w = i16;
                    }
                } else {
                    this.f37163n = -1;
                    this.f37164r = -1;
                    this.f37165s = -1;
                    this.v = -1;
                    this.f37166w = -1;
                }
            } else {
                throw null;
            }
        }
        gy0 gy0Var = this.f37160c;
        if (gy0Var != null) {
            gy0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f37168y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20635a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        if (i11 == 1) {
            mzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            mzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f37158a = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f37158a);
        this.f37158a.setItemSelectorColorProvider(new ey0(this));
        this.f37158a.setEmptyView(this.d);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f37158a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f37159b = c0Var;
        ll0Var2.setLayoutManager(c0Var);
        this.f37158a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ll0 ll0Var3 = this.f37158a;
        gy0 gy0Var = new gy0(this, context);
        this.f37160c = gy0Var;
        ll0Var3.setAdapter(gy0Var);
        org.telegram.ui.Components.ll0 ll0Var4 = this.f37158a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        ll0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f37158a, w7.x5.c(-1.0f, -1));
        this.f37158a.setOnItemClickListener(new i(this, 27));
        this.f37158a.setOnItemLongClickListener(new ey0(this));
        if (i11 == 1) {
            this.f37158a.setOnScrollListener(new i3(this, 25));
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
        org.telegram.ui.Components.ll0 ll0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (ll0Var = this.f37158a) != null) {
                int childCount = ll0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f37158a.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20635a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20691d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20965s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21020v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20984t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20781i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20674c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f20763h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20655b7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f21070y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f20874n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.f20938r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20855m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21000u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37158a, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21018v6));
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
        if (this.f37168y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f37168y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37158a.setPadding(0, 0, 0, i13);
        this.f37158a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gy0 gy0Var = this.f37160c;
        if (gy0Var != null) {
            gy0Var.l();
        }
    }
}
