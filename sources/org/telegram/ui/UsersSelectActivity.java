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
    public a0.h N;
    public ArrayList O;
    public org.telegram.ui.Components.z30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.u1 f32899a;
    public gi1 f32900b;
    public di.g2 f32901c;
    public org.telegram.ui.Components.mm0 d;
    public org.telegram.ui.Components.f10 e;
    public org.telegram.ui.Components.s70 f32902f;
    public ei1 h;
    public ci1 f32903n;
    public org.telegram.ui.Components.l20 f32904r;
    public FrameLayout.LayoutParams f32905s;
    public boolean v;
    public int f32906w;
    public int f32907x;
    public int f32908y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f32907x = 0;
        this.G = true;
    }

    public static void U(org.telegram.ui.UsersSelectActivity r12, android.content.Context r13, android.view.View r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.U(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.W():void");
    }

    public final void X() {
        a0.h hVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        ci1 ci1Var = this.f32903n;
        if (ci1Var != null) {
            ci1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f32907x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f32906w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f32906w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f32906w == 0) {
                this.E.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.s6 title = this.E.getTitle();
            int i13 = this.f32906w;
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
        if (this.f32907x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f25826a = true;
            frameLayout.f25827b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            frameLayout.f25828c = s6Var;
            int i13 = org.telegram.ui.ActionBar.g6.A8;
            s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            s6Var.setTextSize(AndroidUtilities.dp(18.0f));
            s6Var.setGravity(3);
            s6Var.setTypeface(AndroidUtilities.bold());
            s6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(s6Var);
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            frameLayout.d = s6Var2;
            s6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.B8));
            s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            s6Var2.setGravity(3);
            s6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(s6Var2);
            s6Var.getDrawable().J = true;
            s6Var2.getDrawable().J = true;
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
            s6Var.b(1.0f, 150L, esVar);
            s6Var2.b(1.0f, 150L, esVar);
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
            kVar.addView((View) frameLayout, w7.a6.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, 0));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f32907x;
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
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 11));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 6);
        this.f32899a = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f32899a, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        fVar.addView(this.f32899a);
        gi1 gi1Var = new gi1(this, context);
        this.f32900b = gi1Var;
        this.f32899a.addView(gi1Var, w7.a6.d(-2.0f, -1));
        this.f32900b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f34229b;

            {
                this.f34229b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f34229b;
                        usersSelectActivity.f32901c.clearFocus();
                        usersSelectActivity.f32901c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f32901c);
                        return;
                    default:
                        this.f34229b.X();
                        return;
                }
            }
        });
        di.g2 g2Var = new di.g2(this, context, 9);
        this.f32901c = g2Var;
        g2Var.setTextSize(1, 16.0f);
        this.f32901c.setHintColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xh, false));
        this.f32901c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f32901c.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yh, false));
        this.f32901c.setCursorWidth(1.5f);
        di.g2 g2Var2 = this.f32901c;
        g2Var2.setInputType(g2Var2.getInputType() | 176);
        this.f32901c.setSingleLine(true);
        this.f32901c.setBackgroundDrawable(null);
        this.f32901c.setVerticalScrollBarEnabled(false);
        this.f32901c.setHorizontalScrollBarEnabled(false);
        this.f32901c.setTextIsSelectable(false);
        this.f32901c.setPadding(0, 0, 0, 0);
        this.f32901c.setImeOptions(268435462);
        di.g2 g2Var3 = this.f32901c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var3.setGravity(i10 | 16);
        this.f32900b.addView(this.f32901c);
        this.f32901c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f32901c.setCustomSelectionActionModeCallback(new ji.c1(4));
        this.f32901c.setOnKeyListener(new c70(1, this));
        this.f32901c.addTextChangedListener(new bi1(this));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        this.e = f10Var;
        f10Var.setViewType(10);
        org.telegram.ui.Components.f10 f10Var2 = this.e;
        f10Var2.f24856w = false;
        f10Var2.setItemsCount(3);
        org.telegram.ui.Components.f10 f10Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        int i17 = org.telegram.ui.ActionBar.g6.f19990i6;
        f10Var3.f(i16, i17, i17);
        fVar.addView(this.e);
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, this.e, 1, null, 2);
        this.f32902f = s70Var;
        s70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f32902f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f32902f);
        s4.b0 b0Var = new s4.b0(1, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.d = mm0Var;
        mm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f32902f);
        org.telegram.ui.Components.mm0 mm0Var2 = this.d;
        ei1 ei1Var = new ei1(this, context);
        this.h = ei1Var;
        mm0Var2.setAdapter(ei1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new bi.o(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new bi.z5(22, this, context));
        this.d.setOnScrollListener(new ve1(this, 2));
        this.f32905s = org.telegram.ui.Components.l20.b();
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, this.resourceProvider, false);
        this.f32904r = l20Var;
        l20Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f32904r, this.f32905s);
        this.f32904r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f34229b;

            {
                this.f34229b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f34229b;
                        usersSelectActivity.f32901c.clearFocus();
                        usersSelectActivity.f32901c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f32901c);
                        return;
                    default:
                        this.f34229b.X();
                        return;
                }
            }
        });
        this.f32904r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f32907x == 2) {
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
                org.telegram.ui.Components.z30 z30Var = new org.telegram.ui.Components.z30(this.f32901c.getContext(), str);
                this.f32900b.a(z30Var, false);
                z30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.z30 z30Var2 = new org.telegram.ui.Components.z30(this.f32901c.getContext(), chat);
                    this.f32900b.a(z30Var2, false);
                    z30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.s70 s70Var = this.f32902f;
            if (s70Var != null) {
                s70Var.e(false, true);
            }
            ei1 ei1Var = this.h;
            if (ei1Var != null) {
                ei1Var.l();
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
        return this.f32908y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        cz0 cz0Var = new cz0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f20180s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32899a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f20046l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f20065m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f20085n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32902f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19883c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32902f, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f19973h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32901c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32901c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32901c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19854ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19991i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20009j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20029k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20084n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20288y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.S7));
        int i12 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32900b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19894ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32900b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19874bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32900b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19911di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32900b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) view;
        if (z30Var.f31754y) {
            this.P = null;
            this.f32900b.b(z30Var);
            if (this.f32907x == 2) {
                if (z30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (z30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (z30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (z30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (z30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (z30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (z30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (z30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (z30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (z30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (z30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (z30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.z30 z30Var2 = this.P;
        if (z30Var2 != null) {
            z30Var2.a();
        }
        this.P = z30Var;
        z30Var.b();
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
        di.g2 g2Var = this.f32901c;
        if (g2Var != null) {
            g2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f32908y = i10;
        gi1 gi1Var = this.f32900b;
        if (gi1Var != null) {
            gi1Var.requestLayout();
        }
    }
}
