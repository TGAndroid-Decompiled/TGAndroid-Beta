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
public class UsersSelectActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.f5 E;
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
    public org.telegram.ui.Components.w30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.x1 f30720a;
    public di1 f30721b;
    public bi.t2 f30722c;
    public org.telegram.ui.Components.vl0 d;
    public org.telegram.ui.Components.a10 e;
    public org.telegram.ui.Components.d70 f30723f;
    public ci1 h;
    public ai1 f30724n;
    public org.telegram.ui.Components.h20 f30725r;
    public FrameLayout.LayoutParams f30726s;
    public boolean v;
    public int f30727w;
    public int f30728x;
    public int f30729y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.i();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f30728x = 0;
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
        ai1 ai1Var = this.f30724n;
        if (ai1Var != null) {
            ai1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f30728x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f30727w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f30727w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f30727w == 0) {
                this.E.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.o6 title = this.E.getTitle();
            int i13 = this.f30727w;
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
        if (this.f30728x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f22858a = true;
            frameLayout.f22859b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            frameLayout.f22860c = o6Var;
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            o6Var.setTextSize(AndroidUtilities.dp(18.0f));
            o6Var.setGravity(3);
            o6Var.setTypeface(AndroidUtilities.bold());
            o6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(o6Var);
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            frameLayout.d = o6Var2;
            o6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
            o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var2.setGravity(3);
            o6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(o6Var2);
            o6Var.getDrawable().D = true;
            o6Var2.getDrawable().D = true;
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
            o6Var.b(1.0f, 150L, wrVar);
            o6Var2.b(1.0f, 150L, wrVar);
            frameLayout.setClipChildren(false);
            this.E = frameLayout;
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
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
            lVar.addView((View) frameLayout, w7.a6.d(-1, -1.0f, 0, f7, 0.0f, f10, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f30728x;
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
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 8));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 6);
        this.f30720a = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f30720a, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        fVar.addView(this.f30720a);
        di1 di1Var = new di1(this, context);
        this.f30721b = di1Var;
        this.f30720a.addView(di1Var, w7.a6.c(-2.0f, -1));
        this.f30721b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f39004b;

            {
                this.f39004b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f39004b;
                        usersSelectActivity.f30722c.clearFocus();
                        usersSelectActivity.f30722c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f30722c);
                        return;
                    default:
                        this.f39004b.X();
                        return;
                }
            }
        });
        bi.t2 t2Var = new bi.t2(this, context, 9);
        this.f30722c = t2Var;
        t2Var.setTextSize(1, 16.0f);
        this.f30722c.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xh, false));
        this.f30722c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f30722c.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yh, false));
        this.f30722c.setCursorWidth(1.5f);
        bi.t2 t2Var2 = this.f30722c;
        t2Var2.setInputType(t2Var2.getInputType() | 176);
        this.f30722c.setSingleLine(true);
        this.f30722c.setBackgroundDrawable(null);
        this.f30722c.setVerticalScrollBarEnabled(false);
        this.f30722c.setHorizontalScrollBarEnabled(false);
        this.f30722c.setTextIsSelectable(false);
        this.f30722c.setPadding(0, 0, 0, 0);
        this.f30722c.setImeOptions(268435462);
        bi.t2 t2Var3 = this.f30722c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        t2Var3.setGravity(i10 | 16);
        this.f30721b.addView(this.f30722c);
        this.f30722c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f30722c.setCustomSelectionActionModeCallback(new hi.f1(5));
        this.f30722c.setOnKeyListener(new x60(1, this));
        this.f30722c.addTextChangedListener(new zh1(this));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        this.e = a10Var;
        a10Var.setViewType(10);
        org.telegram.ui.Components.a10 a10Var2 = this.e;
        a10Var2.f21345w = false;
        a10Var2.setItemsCount(3);
        org.telegram.ui.Components.a10 a10Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        int i17 = org.telegram.ui.ActionBar.j6.f18017i6;
        a10Var3.f(i16, i17, i17);
        fVar.addView(this.e);
        org.telegram.ui.Components.d70 d70Var = new org.telegram.ui.Components.d70(context, this.e, 1, null, 2);
        this.f30723f = d70Var;
        d70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f30723f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f30723f);
        s4.c0 c0Var = new s4.c0(1, false);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.d = vl0Var;
        vl0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f30723f);
        org.telegram.ui.Components.vl0 vl0Var2 = this.d;
        ci1 ci1Var = new ci1(this, context);
        this.h = ci1Var;
        vl0Var2.setAdapter(ci1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.vl0 vl0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        vl0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new fg.j0(9));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new ai.b0(21, this, context));
        this.d.setOnScrollListener(new se1(this, 2));
        this.f30726s = org.telegram.ui.Components.h20.b();
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f30725r = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f30725r, this.f30726s);
        this.f30725r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f39004b;

            {
                this.f39004b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f39004b;
                        usersSelectActivity.f30722c.clearFocus();
                        usersSelectActivity.f30722c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f30722c);
                        return;
                    default:
                        this.f39004b.X();
                        return;
                }
            }
        });
        this.f30725r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f30728x == 2) {
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
                org.telegram.ui.Components.w30 w30Var = new org.telegram.ui.Components.w30(this.f30722c.getContext(), str);
                this.f30721b.a(w30Var, false);
                w30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.w30 w30Var2 = new org.telegram.ui.Components.w30(this.f30722c.getContext(), chat);
                    this.f30721b.a(w30Var2, false);
                    w30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.d70 d70Var = this.f30723f;
            if (d70Var != null) {
                d70Var.e(false, true);
            }
            ci1 ci1Var = this.h;
            if (ci1Var != null) {
                ci1Var.l();
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
        return this.f30729y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        zy0 zy0Var = new zy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30720a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18074l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18092m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18111n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30723f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30723f, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f17999h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30722c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30722c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30722c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17883ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18018i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18036j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18056k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.S7));
        int i12 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30721b, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17921ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30721b, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17902bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30721b, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17939di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30721b, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.w30 w30Var = (org.telegram.ui.Components.w30) view;
        if (w30Var.f28653y) {
            this.P = null;
            this.f30721b.b(w30Var);
            if (this.f30728x == 2) {
                if (w30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (w30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (w30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (w30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (w30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (w30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (w30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (w30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (w30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (w30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (w30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (w30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.w30 w30Var2 = this.P;
        if (w30Var2 != null) {
            w30Var2.a();
        }
        this.P = w30Var;
        w30Var.b();
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
        bi.t2 t2Var = this.f30722c;
        if (t2Var != null) {
            t2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f30729y = i10;
        di1 di1Var = this.f30721b;
        if (di1Var != null) {
            di1Var.requestLayout();
        }
    }
}
