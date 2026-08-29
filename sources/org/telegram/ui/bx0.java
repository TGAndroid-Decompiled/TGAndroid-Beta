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
public final class bx0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.jl0 f36931a;
    public f2.j0 f36932b;
    public ax0 f36933c;
    public org.telegram.ui.Components.hz d;
    public int f36934e;
    public int f36935f;
    public int h;
    public int f36936n;
    public int f36937r;
    public int f36938s;
    public int v;
    public int f36939w;
    public final boolean f36940x;
    public final int f36941y;

    public bx0() {
        super(null);
        this.f36941y = 1;
        this.f36940x = true;
    }

    public final void U(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false)));
        int i11 = this.f36941y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new av0(7, this, l10), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new zw0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f36934e = 0;
        this.f36935f = -1;
        this.f36936n = -1;
        this.h = -1;
        this.f36939w = -1;
        if (!this.f36940x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f36934e;
            int i11 = i10 + 1;
            this.f36934e = i11;
            this.f36935f = i10;
            int i12 = this.f36941y;
            if (i12 == 1) {
                this.f36934e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f36934e;
                        this.f36934e = i13 + 1;
                        this.f36936n = i13;
                    }
                    int i14 = this.f36934e;
                    this.f36937r = i14;
                    int i15 = i14 + size;
                    this.f36938s = i15;
                    int i16 = i15 + 1;
                    this.f36934e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f36934e = i15 + 2;
                        this.f36939w = i16;
                    }
                } else {
                    this.f36936n = -1;
                    this.f36937r = -1;
                    this.f36938s = -1;
                    this.v = -1;
                    this.f36939w = -1;
                }
            } else {
                throw null;
            }
        }
        ax0 ax0Var = this.f36933c;
        if (ax0Var != null) {
            ax0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f36941y;
        if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.d = hzVar;
        if (i11 == 1) {
            hzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            hzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f36931a = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36931a);
        this.f36931a.setItemSelectorColorProvider(new yw0(this));
        this.f36931a.setEmptyView(this.d);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f36931a;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f36932b = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        this.f36931a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.jl0 jl0Var3 = this.f36931a;
        ax0 ax0Var = new ax0(this, context);
        this.f36933c = ax0Var;
        jl0Var3.setAdapter(ax0Var);
        org.telegram.ui.Components.jl0 jl0Var4 = this.f36931a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        jl0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f36931a, i7.f6.c(-1.0f, -1));
        this.f36931a.setOnItemClickListener(new j(this, 26));
        this.f36931a.setOnItemLongClickListener(new yw0(this));
        if (i11 == 1) {
            this.f36931a.setOnScrollListener(new m3(this, 26));
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
        org.telegram.ui.Components.jl0 jl0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (jl0Var = this.f36931a) != null) {
                int childCount = jl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f36931a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.z4) {
                        ((org.telegram.ui.Cells.z4) childAt).c(intValue);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 16, new Class[]{org.telegram.ui.Cells.z4.class, org.telegram.ui.Cells.w4.class, org.telegram.ui.Cells.k4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 0, new Class[]{org.telegram.ui.Cells.z4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36931a, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
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
        if (this.f36941y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f36941y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36931a.setPadding(0, 0, 0, i13);
        this.f36931a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ax0 ax0Var = this.f36933c;
        if (ax0Var != null) {
            ax0Var.l();
        }
    }
}
