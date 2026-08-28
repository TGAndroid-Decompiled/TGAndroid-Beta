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
public class UsersSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.a5 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public int F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public a0.h J;
    public ArrayList K;
    public org.telegram.ui.Components.w20 L;
    public int M;
    public int N;
    public org.telegram.ui.ActionBar.w1 f36285a;
    public qg1 f36286b;
    public fg.g f36287c;
    public org.telegram.ui.Components.wk0 d;
    public org.telegram.ui.Components.e00 f36288e;
    public org.telegram.ui.Components.d60 f36289f;
    public pg1 h;
    public ng1 f36290n;
    public org.telegram.ui.Components.j10 f36291r;
    public FrameLayout.LayoutParams f36292s;
    public boolean v;
    public int f36293w;
    public int f36294x;
    public int f36295y;

    public UsersSelectActivity(int i9, ArrayList arrayList, boolean z10) {
        super(null);
        this.J = new a0.h();
        this.K = new ArrayList();
        this.E = z10;
        this.F = i9;
        this.G = arrayList;
        this.f36294x = 0;
        this.C = true;
    }

    public static void T(org.telegram.ui.UsersSelectActivity r12, android.content.Context r13, android.view.View r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.T(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.V():void");
    }

    public final void W() {
        a0.h hVar = this.J;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            if (hVar.j(i9) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i9)));
            }
        }
        ng1 ng1Var = this.f36290n;
        if (ng1Var != null) {
            ng1Var.a(this.F, arrayList);
        }
        finishFragment();
    }

    public final void X() {
        int i9;
        int i10 = this.f36294x;
        if (i10 == 0) {
            if (getUserConfig().isPremium()) {
                i9 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i9 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i11 = this.f36293w;
            if (i11 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i9, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i11), Integer.valueOf(this.f36293w), Integer.valueOf(i9)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f36293w == 0) {
                this.A.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.N > 0) {
                    this.A.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.A.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.j6 title = this.A.getTitle();
            int i12 = this.f36293w;
            title.setText(LocaleController.formatPluralString("Chats", i12, Integer.valueOf(i12)));
            if (this.N > 0) {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        Object chat;
        int i11;
        float f10;
        float f11;
        this.I = false;
        this.H = false;
        this.K.clear();
        this.J.b();
        this.L = null;
        if (this.f36294x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f26662a = true;
            frameLayout.f26663b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            frameLayout.f26664c = j6Var;
            int i12 = org.telegram.ui.ActionBar.f6.A8;
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            j6Var.setTextSize(AndroidUtilities.dp(18.0f));
            j6Var.setGravity(3);
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(j6Var);
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            frameLayout.d = j6Var2;
            j6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.B8));
            j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var2.setGravity(3);
            j6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(j6Var2);
            j6Var.getDrawable().D = true;
            j6Var2.getDrawable().D = true;
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
            j6Var.b(1.0f, 150L, grVar);
            j6Var2.b(1.0f, 150L, grVar);
            frameLayout.setClipChildren(false);
            this.A = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            if (z10) {
                f11 = 64.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.addView((View) frameLayout, g7.e6.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.f36294x;
        boolean z11 = this.E;
        if (i13 != 0 && i13 != 2) {
            if (i13 == 1) {
                X();
            }
        } else if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        }
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 3));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 6);
        this.f36285a = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f36285a, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        fVar.addView(this.f36285a);
        qg1 qg1Var = new qg1(this, context);
        this.f36286b = qg1Var;
        this.f36285a.addView(qg1Var, g7.e6.c(-2.0f, -1));
        this.f36286b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40139b;

            {
                this.f40139b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40139b;
                        usersSelectActivity.f36287c.clearFocus();
                        usersSelectActivity.f36287c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36287c);
                        return;
                    default:
                        this.f40139b.W();
                        return;
                }
            }
        });
        fg.g gVar = new fg.g(this, context, 10);
        this.f36287c = gVar;
        gVar.setTextSize(1, 16.0f);
        this.f36287c.setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xh, false));
        this.f36287c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.f36287c.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yh, false));
        this.f36287c.setCursorWidth(1.5f);
        fg.g gVar2 = this.f36287c;
        gVar2.setInputType(gVar2.getInputType() | 176);
        this.f36287c.setSingleLine(true);
        this.f36287c.setBackgroundDrawable(null);
        this.f36287c.setVerticalScrollBarEnabled(false);
        this.f36287c.setHorizontalScrollBarEnabled(false);
        this.f36287c.setTextIsSelectable(false);
        this.f36287c.setPadding(0, 0, 0, 0);
        this.f36287c.setImeOptions(268435462);
        fg.g gVar3 = this.f36287c;
        int i14 = 5;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        gVar3.setGravity(i9 | 16);
        this.f36286b.addView(this.f36287c);
        this.f36287c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f36287c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(4));
        this.f36287c.setOnKeyListener(new d60(1, this));
        this.f36287c.addTextChangedListener(new mg1(this));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.f36288e = e00Var;
        e00Var.setViewType(10);
        org.telegram.ui.Components.e00 e00Var2 = this.f36288e;
        e00Var2.f27885w = false;
        e00Var2.setItemsCount(3);
        org.telegram.ui.Components.e00 e00Var3 = this.f36288e;
        int i15 = org.telegram.ui.ActionBar.f6.G8;
        int i16 = org.telegram.ui.ActionBar.f6.f23092i6;
        e00Var3.f(i15, i16, i16);
        fVar.addView(this.f36288e);
        org.telegram.ui.Components.d60 d60Var = new org.telegram.ui.Components.d60(context, this.f36288e, 1, null, 2);
        this.f36289f = d60Var;
        d60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f36289f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f36289f);
        f2.m0 m0Var = new f2.m0(1, false);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.d = wk0Var;
        wk0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f36289f);
        org.telegram.ui.Components.wk0 wk0Var2 = this.d;
        pg1 pg1Var = new pg1(this, context);
        this.h = pg1Var;
        wk0Var2.setAdapter(pg1Var);
        this.d.setLayoutManager(m0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wk0 wk0Var3 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        wk0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new ih.l(9));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new bg.b1(24, this, context));
        this.d.setOnScrollListener(new kb1(this, 3));
        this.f36292s = org.telegram.ui.Components.j10.b();
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.f36291r = j10Var;
        j10Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f36291r, this.f36292s);
        this.f36291r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40139b;

            {
                this.f40139b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40139b;
                        usersSelectActivity.f36287c.clearFocus();
                        usersSelectActivity.f36287c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36287c);
                        return;
                    default:
                        this.f40139b.W();
                        return;
                }
            }
        });
        this.f36291r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i14 = 3;
        }
        for (int i17 = 1; i17 <= i14; i17++) {
            String str = "non_contacts";
            if (this.f36294x == 2) {
                if (i17 == 1) {
                    str = "existing_chats";
                    i11 = 1;
                } else if (i17 == 2 && !this.D) {
                    str = "new_chats";
                    i11 = 2;
                } else if (i17 == (!this.D ? 1 : 0) + 2) {
                    str = "contacts";
                    i11 = 4;
                } else {
                    i11 = 8;
                }
            } else if (z11) {
                if (i17 == 1) {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i17 == 2) {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i17 == 3) {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i17 == 4) {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i17 == 1) {
                i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i17 == 2) {
                i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i11 & this.F) != 0) {
                org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20(this.f36287c.getContext(), str);
                this.f36286b.a(w20Var, false);
                w20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.G;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                Long l10 = (Long) arrayList.get(i18);
                if (l10.longValue() > 0) {
                    chat = getMessagesController().getUser(l10);
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                }
                if (chat != null) {
                    org.telegram.ui.Components.w20 w20Var2 = new org.telegram.ui.Components.w20(this.f36287c.getContext(), chat);
                    this.f36286b.a(w20Var2, false);
                    w20Var2.setOnClickListener(this);
                }
            }
        }
        X();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.d60 d60Var = this.f36289f;
            if (d60Var != null) {
                d60Var.e(false, true);
            }
            pg1 pg1Var = this.h;
            if (pg1Var != null) {
                pg1Var.l();
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.d.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.f36295y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        sx0 sx0Var = new sx0(10, this);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36285a, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23145l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23163m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23180n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36289f, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36289f, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36287c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36287c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36287c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23093i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23110j7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.S7));
        int i11 = org.telegram.ui.ActionBar.f6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36286b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36286b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36286b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36286b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) view;
        if (w20Var.f34088y) {
            this.L = null;
            this.f36286b.b(w20Var);
            if (this.f36294x == 2) {
                if (w20Var.getUid() == -9223372036854775800L) {
                    this.F &= -2;
                } else if (w20Var.getUid() == -9223372036854775799L) {
                    this.F &= -3;
                } else if (w20Var.getUid() == Long.MIN_VALUE) {
                    this.F &= -5;
                } else if (w20Var.getUid() == -9223372036854775807L) {
                    this.F &= -9;
                }
            } else if (w20Var.getUid() == Long.MIN_VALUE) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (w20Var.getUid() == -9223372036854775807L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (w20Var.getUid() == -9223372036854775806L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (w20Var.getUid() == -9223372036854775805L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (w20Var.getUid() == -9223372036854775804L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (w20Var.getUid() == -9223372036854775803L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (w20Var.getUid() == -9223372036854775802L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (w20Var.getUid() == -9223372036854775801L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            X();
            V();
            return;
        }
        org.telegram.ui.Components.w20 w20Var2 = this.L;
        if (w20Var2 != null) {
            w20Var2.a();
        }
        this.L = w20Var;
        w20Var.b();
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
        fg.g gVar = this.f36287c;
        if (gVar != null) {
            gVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i9) {
        this.f36295y = i9;
        qg1 qg1Var = this.f36286b;
        if (qg1Var != null) {
            qg1Var.requestLayout();
        }
    }
}
