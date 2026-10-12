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
public final class iy0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.wm0 f39035a;
    public s4.d0 f39036b;
    public hy0 f39037c;
    public org.telegram.ui.Components.f00 d;
    public int f39038e;
    public int f39039f;
    public int h;
    public int f39040n;
    public int f39041r;
    public int f39042s;
    public int v;
    public int f39043w;
    public final boolean f39044x;
    public final int f39045y;

    public iy0() {
        super(null);
        this.f39045y = 1;
        this.f39044x = true;
    }

    public final void U(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.s80 H = org.telegram.ui.Components.s80.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false)));
        int i11 = this.f39045y;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new du0(10, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = R.drawable.msg_user_remove;
        }
        H.m(z11, i10, LocaleController.getString(R.string.Remove), true, new gy0(this, l4));
        H.S = 190;
        H.Z();
    }

    public final void V() {
        this.f39038e = 0;
        this.f39039f = -1;
        this.f39040n = -1;
        this.h = -1;
        this.f39043w = -1;
        if (!this.f39044x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.f39038e;
            int i11 = i10 + 1;
            this.f39038e = i11;
            this.f39039f = i10;
            int i12 = this.f39045y;
            if (i12 == 1) {
                this.f39038e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.f39038e;
                        this.f39038e = i13 + 1;
                        this.f39040n = i13;
                    }
                    int i14 = this.f39038e;
                    this.f39041r = i14;
                    int i15 = i14 + size;
                    this.f39042s = i15;
                    int i16 = i15 + 1;
                    this.f39038e = i16;
                    this.v = i15;
                    if (i12 != 1) {
                        this.f39038e = i15 + 2;
                        this.f39043w = i16;
                    }
                } else {
                    this.f39040n = -1;
                    this.f39041r = -1;
                    this.f39042s = -1;
                    this.v = -1;
                    this.f39043w = -1;
                }
            } else {
                throw null;
            }
        }
        hy0 hy0Var = this.f39037c;
        if (hy0Var != null) {
            hy0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 2;
        int i11 = this.f39045y;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(context, null);
        this.d = f00Var;
        if (i11 == 1) {
            f00Var.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            f00Var.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, w7.w5.d(-1.0f, -1));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f39035a = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39035a);
        this.f39035a.setItemSelectorColorProvider(new fy0(this));
        this.f39035a.setEmptyView(this.d);
        org.telegram.ui.Components.wm0 wm0Var2 = this.f39035a;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f39036b = d0Var;
        wm0Var2.setLayoutManager(d0Var);
        this.f39035a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wm0 wm0Var3 = this.f39035a;
        hy0 hy0Var = new hy0(this, context);
        this.f39037c = hy0Var;
        wm0Var3.setAdapter(hy0Var);
        org.telegram.ui.Components.wm0 wm0Var4 = this.f39035a;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        wm0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f39035a, w7.w5.d(-1.0f, -1));
        this.f39035a.setOnItemClickListener(new i(this, 28));
        this.f39035a.setOnItemLongClickListener(new fy0(this));
        if (i11 == 1) {
            this.f39035a.setOnScrollListener(new i3(this, 25));
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
        org.telegram.ui.Components.wm0 wm0Var;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (wm0Var = this.f39035a) != null) {
                int childCount = wm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f39035a.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20544c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20632h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20524b7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f20946y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f20745n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.h6.f20813r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20725m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20875u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39035a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20893v6));
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
        if (this.f39045y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f39045y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39035a.setPadding(0, 0, 0, i13);
        this.f39035a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        hy0 hy0Var = this.f39037c;
        if (hy0Var != null) {
            hy0Var.l();
        }
    }
}
