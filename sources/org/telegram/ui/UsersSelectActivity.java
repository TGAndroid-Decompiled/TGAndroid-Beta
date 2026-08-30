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
    public org.telegram.ui.Components.b5 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public int G;
    public final ArrayList H;
    public boolean I;
    public boolean J;
    public a0.h K;
    public ArrayList L;
    public org.telegram.ui.Components.n30 M;
    public int N;
    public int O;
    public org.telegram.ui.ActionBar.x1 f32387a;
    public eh1 f32388b;
    public kg.f f32389c;
    public org.telegram.ui.Components.sl0 d;
    public org.telegram.ui.Components.t00 e;
    public org.telegram.ui.Components.v60 f32390f;
    public dh1 h;
    public bh1 f32391n;
    public org.telegram.ui.Components.z10 f32392r;
    public FrameLayout.LayoutParams f32393s;
    public boolean v;
    public int f32394w;
    public int f32395x;
    public int f32396y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z4) {
        super(null);
        this.K = new a0.h();
        this.L = new ArrayList();
        this.F = z4;
        this.G = i10;
        this.H = arrayList;
        this.f32395x = 0;
        this.D = true;
    }

    public static void U(org.telegram.ui.UsersSelectActivity r12, android.content.Context r13, android.view.View r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.U(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.W():void");
    }

    public final void X() {
        a0.h hVar = this.K;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        bh1 bh1Var = this.f32391n;
        if (bh1Var != null) {
            bh1Var.a(this.G, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f32395x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f32394w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f32394w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f32394w == 0) {
                this.B.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.O > 0) {
                    this.B.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.B.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.k6 title = this.B.getTitle();
            int i13 = this.f32394w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.O > 0) {
                this.B.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.B.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        Object chat;
        int i12;
        float f10;
        float f11;
        this.J = false;
        this.I = false;
        this.L.clear();
        this.K.b();
        this.M = null;
        if (this.f32395x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f23565a = true;
            frameLayout.f23566b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, true, true, true);
            frameLayout.f23567c = k6Var;
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            k6Var.setTextSize(AndroidUtilities.dp(18.0f));
            k6Var.setGravity(3);
            k6Var.setTypeface(AndroidUtilities.bold());
            k6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(k6Var);
            org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(parentActivity, true, true, true);
            frameLayout.d = k6Var2;
            k6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
            k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            k6Var2.setGravity(3);
            k6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(k6Var2);
            k6Var.getDrawable().D = true;
            k6Var2.getDrawable().D = true;
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
            k6Var.b(1.0f, 150L, nrVar);
            k6Var2.b(1.0f, 150L, nrVar);
            frameLayout.setClipChildren(false);
            this.B = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            if (z4) {
                f11 = 64.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.addView((View) frameLayout, k7.b6.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f32395x;
        boolean z10 = this.F;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                Y();
            }
        } else if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        }
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 25));
        g gVar = new g(this, context, 4);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 6);
        this.f32387a = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f32387a, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        gVar.addView(this.f32387a);
        eh1 eh1Var = new eh1(this, context);
        this.f32388b = eh1Var;
        this.f32387a.addView(eh1Var, k7.b6.c(-2.0f, -1));
        this.f32388b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40801b;

            {
                this.f40801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40801b;
                        usersSelectActivity.f32389c.clearFocus();
                        usersSelectActivity.f32389c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f32389c);
                        return;
                    default:
                        this.f40801b.X();
                        return;
                }
            }
        });
        kg.f fVar = new kg.f(this, context, 8);
        this.f32389c = fVar;
        fVar.setTextSize(1, 16.0f);
        this.f32389c.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xh, false));
        this.f32389c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f32389c.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yh, false));
        this.f32389c.setCursorWidth(1.5f);
        kg.f fVar2 = this.f32389c;
        fVar2.setInputType(fVar2.getInputType() | 176);
        this.f32389c.setSingleLine(true);
        this.f32389c.setBackgroundDrawable(null);
        this.f32389c.setVerticalScrollBarEnabled(false);
        this.f32389c.setHorizontalScrollBarEnabled(false);
        this.f32389c.setTextIsSelectable(false);
        this.f32389c.setPadding(0, 0, 0, 0);
        this.f32389c.setImeOptions(268435462);
        kg.f fVar3 = this.f32389c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar3.setGravity(i10 | 16);
        this.f32388b.addView(this.f32389c);
        this.f32389c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f32389c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(4));
        this.f32389c.setOnKeyListener(new r60(1, this));
        this.f32389c.addTextChangedListener(new ah1(this));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.e = t00Var;
        t00Var.setViewType(10);
        org.telegram.ui.Components.t00 t00Var2 = this.e;
        t00Var2.f28855w = false;
        t00Var2.setItemsCount(3);
        org.telegram.ui.Components.t00 t00Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        int i17 = org.telegram.ui.ActionBar.j6.f19996i6;
        t00Var3.f(i16, i17, i17);
        gVar.addView(this.e);
        org.telegram.ui.Components.v60 v60Var = new org.telegram.ui.Components.v60(context, this.e, 1, null, 2);
        this.f32390f = v60Var;
        v60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f32390f.d.setText(LocaleController.getString(R.string.NoContacts));
        gVar.addView(this.f32390f);
        f2.i0 i0Var = new f2.i0(1, false);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.d = sl0Var;
        sl0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f32390f);
        org.telegram.ui.Components.sl0 sl0Var2 = this.d;
        dh1 dh1Var = new dh1(this, context);
        this.h = dh1Var;
        sl0Var2.setAdapter(dh1Var);
        this.d.setLayoutManager(i0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.sl0 sl0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        sl0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new nh.k(8));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new gg.v0(23, this, context));
        this.d.setOnScrollListener(new yb1(this, 3));
        this.f32393s = org.telegram.ui.Components.z10.b();
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f32392r = z10Var;
        z10Var.setImageResource(R.drawable.floating_check);
        gVar.addView(this.f32392r, this.f32393s);
        this.f32392r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40801b;

            {
                this.f40801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40801b;
                        usersSelectActivity.f32389c.clearFocus();
                        usersSelectActivity.f32389c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f32389c);
                        return;
                    default:
                        this.f40801b.X();
                        return;
                }
            }
        });
        this.f32392r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z10) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f32395x == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i18 == 2 && !this.E) {
                    str = "new_chats";
                    i12 = 2;
                } else if (i18 == (!this.E ? 1 : 0) + 2) {
                    str = "contacts";
                    i12 = 4;
                } else {
                    i12 = 8;
                }
            } else if (z10) {
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
            if ((i12 & this.G) != 0) {
                org.telegram.ui.Components.n30 n30Var = new org.telegram.ui.Components.n30(this.f32389c.getContext(), str);
                this.f32388b.a(n30Var, false);
                n30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.H;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Long l10 = (Long) arrayList.get(i19);
                if (l10.longValue() > 0) {
                    chat = getMessagesController().getUser(l10);
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                }
                if (chat != null) {
                    org.telegram.ui.Components.n30 n30Var2 = new org.telegram.ui.Components.n30(this.f32389c.getContext(), chat);
                    this.f32388b.a(n30Var2, false);
                    n30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.v60 v60Var = this.f32390f;
            if (v60Var != null) {
                v60Var.e(false, true);
            }
            dh1 dh1Var = this.h;
            if (dh1Var != null) {
                dh1Var.l();
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
        return this.f32396y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        cy0 cy0Var = new cy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32387a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20050l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20068m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20086n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32390f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32390f, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19978h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32389c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32389c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32389c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19943f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19997i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20014j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20032k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.S7));
        int i12 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32388b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32388b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32388b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32388b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) view;
        if (n30Var.f27182y) {
            this.M = null;
            this.f32388b.b(n30Var);
            if (this.f32395x == 2) {
                if (n30Var.getUid() == -9223372036854775800L) {
                    this.G &= -2;
                } else if (n30Var.getUid() == -9223372036854775799L) {
                    this.G &= -3;
                } else if (n30Var.getUid() == Long.MIN_VALUE) {
                    this.G &= -5;
                } else if (n30Var.getUid() == -9223372036854775807L) {
                    this.G &= -9;
                }
            } else if (n30Var.getUid() == Long.MIN_VALUE) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (n30Var.getUid() == -9223372036854775807L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (n30Var.getUid() == -9223372036854775806L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (n30Var.getUid() == -9223372036854775805L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (n30Var.getUid() == -9223372036854775804L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (n30Var.getUid() == -9223372036854775803L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (n30Var.getUid() == -9223372036854775802L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (n30Var.getUid() == -9223372036854775801L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.n30 n30Var2 = this.M;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.M = n30Var;
        n30Var.b();
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
        kg.f fVar = this.f32389c;
        if (fVar != null) {
            fVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f32396y = i10;
        eh1 eh1Var = this.f32388b;
        if (eh1Var != null) {
            eh1Var.requestLayout();
        }
    }
}
