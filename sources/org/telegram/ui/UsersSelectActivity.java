package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.i5 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public int J;
    public final ArrayList K;
    public boolean L;
    public boolean M;
    public a0.i N;
    public ArrayList O;
    public org.telegram.ui.Components.g40 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.u1 f34429a;
    public bi1 f34430b;
    public ci.g2 f34431c;
    public org.telegram.ui.Components.wm0 d;
    public org.telegram.ui.Components.m10 f34432e;
    public org.telegram.ui.Components.z70 f34433f;
    public ai1 h;
    public yh1 f34434n;
    public org.telegram.ui.Components.s20 f34435r;
    public FrameLayout.LayoutParams f34436s;
    public boolean v;
    public int f34437w;
    public int f34438x;
    public int f34439y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.i();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f34438x = 0;
        this.G = true;
    }

    public static void U(org.telegram.ui.UsersSelectActivity r12, android.content.Context r13, android.view.View r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.U(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.W():void");
    }

    public final void X() {
        a0.i iVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            if (iVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
        }
        yh1 yh1Var = this.f34434n;
        if (yh1Var != null) {
            yh1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f34438x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f34437w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f34437w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f34437w == 0) {
                this.E.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.r6 title = this.E.getTitle();
            int i13 = this.f34437w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.R > 0) {
                this.E.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.E.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        Object chat;
        int i12;
        float f7;
        float f10;
        this.M = false;
        this.L = false;
        this.O.clear();
        this.N.b();
        this.P = null;
        if (this.f34438x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f27051a = true;
            frameLayout.f27052b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(parentActivity, true, true, true);
            frameLayout.f27053c = r6Var;
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            r6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            r6Var.setTextSize(AndroidUtilities.dp(18.0f));
            r6Var.setGravity(3);
            r6Var.setTypeface(AndroidUtilities.bold());
            r6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(r6Var);
            org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(parentActivity, true, true, true);
            frameLayout.d = r6Var2;
            r6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.B8));
            r6Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            r6Var2.setGravity(3);
            r6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(r6Var2);
            r6Var.getDrawable().J = true;
            r6Var2.getDrawable().J = true;
            org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27627f;
            r6Var.b(1.0f, 150L, jsVar);
            r6Var2.b(1.0f, 150L, jsVar);
            frameLayout.setClipChildren(false);
            this.E = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 64.0f;
            }
            if (z10) {
                f10 = 64.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.addView((View) frameLayout, w7.w5.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, 0));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f34438x;
        boolean z11 = this.I;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                Y();
            }
        } else if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        }
        this.actionBar.setActionBarMenuOnItemClick(new f51(this, 10));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 6);
        this.f34429a = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f34429a, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
        fVar.addView(this.f34429a);
        bi1 bi1Var = new bi1(this, context);
        this.f34430b = bi1Var;
        this.f34429a.addView(bi1Var, w7.w5.d(-2.0f, -1));
        this.f34430b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f43534b;

            {
                this.f43534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f43534b;
                        usersSelectActivity.f34431c.clearFocus();
                        usersSelectActivity.f34431c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34431c);
                        return;
                    default:
                        this.f43534b.X();
                        return;
                }
            }
        });
        ci.g2 g2Var = new ci.g2(this, context, 9);
        this.f34431c = g2Var;
        g2Var.setTextSize(1, 16.0f);
        this.f34431c.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xh, false));
        this.f34431c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f34431c.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yh, false));
        this.f34431c.setCursorWidth(1.5f);
        ci.g2 g2Var2 = this.f34431c;
        g2Var2.setInputType(g2Var2.getInputType() | 176);
        this.f34431c.setSingleLine(true);
        this.f34431c.setBackgroundDrawable(null);
        this.f34431c.setVerticalScrollBarEnabled(false);
        this.f34431c.setHorizontalScrollBarEnabled(false);
        this.f34431c.setTextIsSelectable(false);
        this.f34431c.setPadding(0, 0, 0, 0);
        this.f34431c.setImeOptions(268435462);
        ci.g2 g2Var3 = this.f34431c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var3.setGravity(i10 | 16);
        this.f34430b.addView(this.f34431c);
        this.f34431c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f34431c.setCustomSelectionActionModeCallback(new ii.d1(4));
        this.f34431c.setOnKeyListener(new x60(1, this));
        this.f34431c.addTextChangedListener(new xh1(this));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
        this.f34432e = m10Var;
        m10Var.setViewType(10);
        org.telegram.ui.Components.m10 m10Var2 = this.f34432e;
        m10Var2.f28355w = false;
        m10Var2.setItemsCount(3);
        org.telegram.ui.Components.m10 m10Var3 = this.f34432e;
        int i16 = org.telegram.ui.ActionBar.h6.G8;
        int i17 = org.telegram.ui.ActionBar.h6.f20650i6;
        m10Var3.f(i16, i17, i17);
        fVar.addView(this.f34432e);
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, this.f34432e, 1, null, 2);
        this.f34433f = z70Var;
        z70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f34433f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f34433f);
        s4.d0 d0Var = new s4.d0(1, false);
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.d = wm0Var;
        wm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f34433f);
        org.telegram.ui.Components.wm0 wm0Var2 = this.d;
        ai1 ai1Var = new ai1(this, context);
        this.h = ai1Var;
        wm0Var2.setAdapter(ai1Var);
        this.d.setLayoutManager(d0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wm0 wm0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        wm0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new ai.t(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new ai.o6(22, this, context));
        this.d.setOnScrollListener(new re1(this, 2));
        this.f34436s = org.telegram.ui.Components.s20.b();
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(context, this.resourceProvider, false);
        this.f34435r = s20Var;
        s20Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f34435r, this.f34436s);
        this.f34435r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f43534b;

            {
                this.f43534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f43534b;
                        usersSelectActivity.f34431c.clearFocus();
                        usersSelectActivity.f34431c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34431c);
                        return;
                    default:
                        this.f43534b.X();
                        return;
                }
            }
        });
        this.f34435r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f34438x == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i18 == 2 && !this.H) {
                    str = "new_chats";
                    i12 = 2;
                } else if (i18 == (!this.H ? 1 : 0) + 2) {
                    i12 = 4;
                    str = "contacts";
                } else {
                    i12 = 8;
                }
            } else if (z11) {
                if (i18 == 1) {
                    i12 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i18 == 2) {
                    i12 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i18 == 3) {
                    i12 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i18 == 4) {
                    i12 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i12 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i18 == 1) {
                i12 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i18 == 2) {
                i12 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i12 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i12 & this.J) != 0) {
                org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(this.f34431c.getContext(), str);
                this.f34430b.a(g40Var, false);
                g40Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.K;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Long l4 = (Long) arrayList.get(i19);
                if (l4.longValue() > 0) {
                    chat = getMessagesController().getUser(l4);
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                }
                if (chat != null) {
                    org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(this.f34431c.getContext(), chat);
                    this.f34430b.a(g40Var2, false);
                    g40Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.z70 z70Var = this.f34433f;
            if (z70Var != null) {
                z70Var.e(false, true);
            }
            ai1 ai1Var = this.h;
            if (ai1Var != null) {
                ai1Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.f34439y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        yy0 yy0Var = new yy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20559d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f20839s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34429a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20706l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20725m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20745n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34433f, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20543c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34433f, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20631h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34431c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34431c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34431c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20514ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20651i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20669j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20688k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20744n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20945y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.h6.f20812r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.S7));
        int i12 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34430b, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20552ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34430b, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20534bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34430b, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20571di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34430b, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) view;
        if (g40Var.f26268y) {
            this.P = null;
            this.f34430b.b(g40Var);
            if (this.f34438x == 2) {
                if (g40Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (g40Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (g40Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (g40Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (g40Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (g40Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (g40Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (g40Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (g40Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (g40Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (g40Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (g40Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.g40 g40Var2 = this.P;
        if (g40Var2 != null) {
            g40Var2.a();
        }
        this.P = g40Var;
        g40Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ci.g2 g2Var = this.f34431c;
        if (g2Var != null) {
            g2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f34439y = i10;
        bi1 bi1Var = this.f34430b;
        if (bi1Var != null) {
            bi1Var.requestLayout();
        }
    }
}
