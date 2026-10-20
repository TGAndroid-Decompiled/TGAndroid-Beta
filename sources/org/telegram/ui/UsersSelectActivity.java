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
    public org.telegram.ui.Components.h5 E;
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
    public org.telegram.ui.Components.v30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.v1 f33955a;
    public lg1 f33956b;
    public ei.e2 f33957c;
    public org.telegram.ui.Components.jm0 d;
    public org.telegram.ui.Components.b10 e;
    public org.telegram.ui.Components.o70 f33958f;
    public kg1 h;
    public ig1 f33959n;
    public org.telegram.ui.Components.h20 f33960r;
    public FrameLayout.LayoutParams f33961s;
    public boolean v;
    public int f33962w;
    public int f33963x;
    public int f33964y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f33963x = 0;
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
        ig1 ig1Var = this.f33959n;
        if (ig1Var != null) {
            ig1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f33963x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f33962w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f33962w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f33962w == 0) {
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
            int i13 = this.f33962w;
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
        if (this.f33963x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f26752a = true;
            frameLayout.f26753b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(parentActivity, true, true, true);
            frameLayout.f26754c = q6Var;
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            q6Var.setTextSize(AndroidUtilities.dp(18.0f));
            q6Var.setGravity(3);
            q6Var.setTypeface(AndroidUtilities.bold());
            q6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(q6Var);
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(parentActivity, true, true, true);
            frameLayout.d = q6Var2;
            q6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.B8));
            q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            q6Var2.setGravity(3);
            q6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(q6Var2);
            q6Var.getDrawable().J = true;
            q6Var2.getDrawable().J = true;
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25021f;
            q6Var.b(1.0f, 150L, bsVar);
            q6Var2.b(1.0f, 150L, bsVar);
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
            kVar.addView((View) frameLayout, w7.z5.d(-1, -1.0f, 0, f7, 0.0f, f10, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f33963x;
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
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 12));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 6);
        this.f33955a = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f33955a, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
        fVar.addView(this.f33955a);
        lg1 lg1Var = new lg1(this, context);
        this.f33956b = lg1Var;
        this.f33955a.addView(lg1Var, w7.z5.c(-2.0f, -1));
        this.f33956b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f37323b;

            {
                this.f37323b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f37323b;
                        usersSelectActivity.f33957c.clearFocus();
                        usersSelectActivity.f33957c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f33957c);
                        return;
                    default:
                        this.f37323b.X();
                        return;
                }
            }
        });
        ei.e2 e2Var = new ei.e2(this, context, 9);
        this.f33957c = e2Var;
        e2Var.setTextSize(1, 16.0f);
        this.f33957c.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xh, false));
        this.f33957c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f33957c.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yh, false));
        this.f33957c.setCursorWidth(1.5f);
        ei.e2 e2Var2 = this.f33957c;
        e2Var2.setInputType(e2Var2.getInputType() | 176);
        this.f33957c.setSingleLine(true);
        this.f33957c.setBackgroundDrawable(null);
        this.f33957c.setVerticalScrollBarEnabled(false);
        this.f33957c.setHorizontalScrollBarEnabled(false);
        this.f33957c.setTextIsSelectable(false);
        this.f33957c.setPadding(0, 0, 0, 0);
        this.f33957c.setImeOptions(268435462);
        ei.e2 e2Var3 = this.f33957c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e2Var3.setGravity(i10 | 16);
        this.f33956b.addView(this.f33957c);
        this.f33957c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f33957c.setCustomSelectionActionModeCallback(new ki.c1(4));
        this.f33957c.setOnKeyListener(new e60(1, this));
        this.f33957c.addTextChangedListener(new hg1(this));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.e = b10Var;
        b10Var.setViewType(10);
        org.telegram.ui.Components.b10 b10Var2 = this.e;
        b10Var2.f24774w = false;
        b10Var2.setItemsCount(3);
        org.telegram.ui.Components.b10 b10Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.h6.G8;
        int i17 = org.telegram.ui.ActionBar.h6.f21079i6;
        b10Var3.f(i16, i17, i17);
        fVar.addView(this.e);
        org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(context, this.e, 1, null, 2);
        this.f33958f = o70Var;
        o70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f33958f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f33958f);
        s4.b0 b0Var = new s4.b0(1, false);
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.d = jm0Var;
        jm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f33958f);
        org.telegram.ui.Components.jm0 jm0Var2 = this.d;
        kg1 kg1Var = new kg1(this, context);
        this.h = kg1Var;
        jm0Var2.setAdapter(kg1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.jm0 jm0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        jm0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new ci.l(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new ci.y4(22, this, context));
        this.d.setOnScrollListener(new bd1(this, 2));
        this.f33961s = org.telegram.ui.Components.h20.b();
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f33960r = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f33960r, this.f33961s);
        this.f33960r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f37323b;

            {
                this.f37323b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f37323b;
                        usersSelectActivity.f33957c.clearFocus();
                        usersSelectActivity.f33957c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f33957c);
                        return;
                    default:
                        this.f37323b.X();
                        return;
                }
            }
        });
        this.f33960r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f33963x == 2) {
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
                org.telegram.ui.Components.v30 v30Var = new org.telegram.ui.Components.v30(this.f33957c.getContext(), str);
                this.f33956b.a(v30Var, false);
                v30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.v30 v30Var2 = new org.telegram.ui.Components.v30(this.f33957c.getContext(), chat);
                    this.f33956b.a(v30Var2, false);
                    v30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.o70 o70Var = this.f33958f;
            if (o70Var != null) {
                o70Var.e(false, true);
            }
            kg1 kg1Var = this.h;
            if (kg1Var != null) {
                kg1Var.l();
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
        return this.f33964y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        zx0 zx0Var = new zx0(9, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20990d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21269s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33955a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21135l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21154m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21174n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33958f, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20972c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33958f, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21062h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33957c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33957c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33957c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20943ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21080i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21098j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21118k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21173n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21378y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.h6.f21241r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.S7));
        int i12 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33956b, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20983ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33956b, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20963bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33956b, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21000di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33956b, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) view;
        if (v30Var.f31135y) {
            this.P = null;
            this.f33956b.b(v30Var);
            if (this.f33963x == 2) {
                if (v30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (v30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (v30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (v30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (v30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (v30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (v30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (v30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (v30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (v30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (v30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (v30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.v30 v30Var2 = this.P;
        if (v30Var2 != null) {
            v30Var2.a();
        }
        this.P = v30Var;
        v30Var.b();
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
        ei.e2 e2Var = this.f33957c;
        if (e2Var != null) {
            e2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f33964y = i10;
        lg1 lg1Var = this.f33956b;
        if (lg1Var != null) {
            lg1Var.requestLayout();
        }
    }
}
