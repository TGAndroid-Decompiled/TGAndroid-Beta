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
public class UsersSelectActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.g5 E;
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
    public org.telegram.ui.Components.m30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.v1 f34238a;
    public yh1 f34239b;
    public di.h2 f34240c;
    public org.telegram.ui.Components.ll0 d;
    public org.telegram.ui.Components.t00 f34241e;
    public org.telegram.ui.Components.u60 f34242f;
    public xh1 h;
    public vh1 f34243n;
    public org.telegram.ui.Components.y10 f34244r;
    public FrameLayout.LayoutParams f34245s;
    public boolean v;
    public int f34246w;
    public int f34247x;
    public int f34248y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.i();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f34247x = 0;
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
        vh1 vh1Var = this.f34243n;
        if (vh1Var != null) {
            vh1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f34247x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f34246w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f34246w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f34246w == 0) {
                this.E.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.q6 title = this.E.getTitle();
            int i13 = this.f34246w;
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
        if (this.f34247x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f26255a = true;
            frameLayout.f26256b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(parentActivity, true, true, true);
            frameLayout.f26257c = q6Var;
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            q6Var.setTextSize(AndroidUtilities.dp(18.0f));
            q6Var.setGravity(3);
            q6Var.setTypeface(AndroidUtilities.bold());
            q6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(q6Var);
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(parentActivity, true, true, true);
            frameLayout.d = q6Var2;
            q6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
            q6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            q6Var2.setGravity(3);
            q6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(q6Var2);
            q6Var.getDrawable().D = true;
            q6Var2.getDrawable().D = true;
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29467f;
            q6Var.b(1.0f, 150L, prVar);
            q6Var2.b(1.0f, 150L, prVar);
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
            kVar.addView((View) frameLayout, w7.x5.d(-1, -1.0f, 0, f7, 0.0f, f10, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f34247x;
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
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 9));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 6);
        this.f34238a = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f34238a, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
        fVar.addView(this.f34238a);
        yh1 yh1Var = new yh1(this, context);
        this.f34239b = yh1Var;
        this.f34238a.addView(yh1Var, w7.x5.c(-2.0f, -1));
        this.f34239b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40759b;

            {
                this.f40759b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40759b;
                        usersSelectActivity.f34240c.clearFocus();
                        usersSelectActivity.f34240c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34240c);
                        return;
                    default:
                        this.f40759b.X();
                        return;
                }
            }
        });
        di.h2 h2Var = new di.h2(this, context, 9);
        this.f34240c = h2Var;
        h2Var.setTextSize(1, 16.0f);
        this.f34240c.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xh, false));
        this.f34240c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f34240c.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yh, false));
        this.f34240c.setCursorWidth(1.5f);
        di.h2 h2Var2 = this.f34240c;
        h2Var2.setInputType(h2Var2.getInputType() | 176);
        this.f34240c.setSingleLine(true);
        this.f34240c.setBackgroundDrawable(null);
        this.f34240c.setVerticalScrollBarEnabled(false);
        this.f34240c.setHorizontalScrollBarEnabled(false);
        this.f34240c.setTextIsSelectable(false);
        this.f34240c.setPadding(0, 0, 0, 0);
        this.f34240c.setImeOptions(268435462);
        di.h2 h2Var3 = this.f34240c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h2Var3.setGravity(i10 | 16);
        this.f34239b.addView(this.f34240c);
        this.f34240c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f34240c.setCustomSelectionActionModeCallback(new ji.c1(5));
        this.f34240c.setOnKeyListener(new y60(1, this));
        this.f34240c.addTextChangedListener(new uh1(this));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.f34241e = t00Var;
        t00Var.setViewType(10);
        org.telegram.ui.Components.t00 t00Var2 = this.f34241e;
        t00Var2.f30466w = false;
        t00Var2.setItemsCount(3);
        org.telegram.ui.Components.t00 t00Var3 = this.f34241e;
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        int i17 = org.telegram.ui.ActionBar.j6.f20754i6;
        t00Var3.f(i16, i17, i17);
        fVar.addView(this.f34241e);
        org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(context, this.f34241e, 1, null, 2);
        this.f34242f = u60Var;
        u60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f34242f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f34242f);
        s4.c0 c0Var = new s4.c0(1, false);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.d = ll0Var;
        ll0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f34242f);
        org.telegram.ui.Components.ll0 ll0Var2 = this.d;
        xh1 xh1Var = new xh1(this, context);
        this.h = xh1Var;
        ll0Var2.setAdapter(xh1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ll0 ll0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        ll0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new bi.o(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new bi.x5(22, this, context));
        this.d.setOnScrollListener(new oe1(this, 2));
        this.f34245s = org.telegram.ui.Components.y10.b();
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f34244r = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f34244r, this.f34245s);
        this.f34244r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40759b;

            {
                this.f40759b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40759b;
                        usersSelectActivity.f34240c.clearFocus();
                        usersSelectActivity.f34240c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34240c);
                        return;
                    default:
                        this.f40759b.X();
                        return;
                }
            }
        });
        this.f34244r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f34247x == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i18 == 2 && !this.H) {
                    str = "new_chats";
                    i12 = 2;
                } else if (i18 == (!this.H ? 1 : 0) + 2) {
                    str = "contacts";
                    i12 = 4;
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
                org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(this.f34240c.getContext(), str);
                this.f34239b.a(m30Var, false);
                m30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.m30 m30Var2 = new org.telegram.ui.Components.m30(this.f34240c.getContext(), chat);
                    this.f34239b.a(m30Var2, false);
                    m30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.u60 u60Var = this.f34242f;
            if (u60Var != null) {
                u60Var.e(false, true);
            }
            xh1 xh1Var = this.h;
            if (xh1Var != null) {
                xh1Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.f34248y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        xy0 xy0Var = new xy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f20664d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20938s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20993v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20957t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34238a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20754i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20811l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20829m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20848n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20786k0, null, null, org.telegram.ui.ActionBar.j6.f20665d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34242f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20647c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34242f, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f20736h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34240c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34240c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34240c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20619ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20755i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20773j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20793k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20847n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21043y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.j6.f20911r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.S7));
        int i12 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34239b, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20657ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34239b, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20638bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34239b, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20676di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34239b, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) view;
        if (m30Var.f28373y) {
            this.P = null;
            this.f34239b.b(m30Var);
            if (this.f34247x == 2) {
                if (m30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (m30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (m30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (m30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (m30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (m30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (m30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (m30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (m30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (m30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (m30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (m30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.m30 m30Var2 = this.P;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.P = m30Var;
        m30Var.b();
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
        di.h2 h2Var = this.f34240c;
        if (h2Var != null) {
            h2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f34248y = i10;
        yh1 yh1Var = this.f34239b;
        if (yh1Var != null) {
            yh1Var.requestLayout();
        }
    }
}
