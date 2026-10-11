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
    public org.telegram.ui.Components.e40 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.u1 f34654a;
    public yh1 f34655b;
    public ci.g2 f34656c;
    public org.telegram.ui.Components.rm0 d;
    public org.telegram.ui.Components.k10 f34657e;
    public org.telegram.ui.Components.w70 f34658f;
    public xh1 h;
    public vh1 f34659n;
    public org.telegram.ui.Components.q20 f34660r;
    public FrameLayout.LayoutParams f34661s;
    public boolean v;
    public int f34662w;
    public int f34663x;
    public int f34664y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.i();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f34663x = 0;
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
        vh1 vh1Var = this.f34659n;
        if (vh1Var != null) {
            vh1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f34663x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f34662w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f34662w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f34662w == 0) {
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
            int i13 = this.f34662w;
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
        if (this.f34663x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f27323a = true;
            frameLayout.f27324b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(parentActivity, true, true, true);
            frameLayout.f27325c = r6Var;
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
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27500f;
            r6Var.b(1.0f, 150L, isVar);
            r6Var2.b(1.0f, 150L, isVar);
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
            kVar.addView((View) frameLayout, w7.x5.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, 0));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f34663x;
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
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 6);
        this.f34654a = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f34654a, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
        fVar.addView(this.f34654a);
        yh1 yh1Var = new yh1(this, context);
        this.f34655b = yh1Var;
        this.f34654a.addView(yh1Var, w7.x5.d(-2.0f, -1));
        this.f34655b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f42228b;

            {
                this.f42228b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f42228b;
                        usersSelectActivity.f34656c.clearFocus();
                        usersSelectActivity.f34656c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34656c);
                        return;
                    default:
                        this.f42228b.X();
                        return;
                }
            }
        });
        ci.g2 g2Var = new ci.g2(this, context, 9);
        this.f34656c = g2Var;
        g2Var.setTextSize(1, 16.0f);
        this.f34656c.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xh, false));
        this.f34656c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f34656c.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yh, false));
        this.f34656c.setCursorWidth(1.5f);
        ci.g2 g2Var2 = this.f34656c;
        g2Var2.setInputType(g2Var2.getInputType() | 176);
        this.f34656c.setSingleLine(true);
        this.f34656c.setBackgroundDrawable(null);
        this.f34656c.setVerticalScrollBarEnabled(false);
        this.f34656c.setHorizontalScrollBarEnabled(false);
        this.f34656c.setTextIsSelectable(false);
        this.f34656c.setPadding(0, 0, 0, 0);
        this.f34656c.setImeOptions(268435462);
        ci.g2 g2Var3 = this.f34656c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var3.setGravity(i10 | 16);
        this.f34655b.addView(this.f34656c);
        this.f34656c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f34656c.setCustomSelectionActionModeCallback(new ii.d1(4));
        this.f34656c.setOnKeyListener(new v60(1, this));
        this.f34656c.addTextChangedListener(new uh1(this));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        this.f34657e = k10Var;
        k10Var.setViewType(10);
        org.telegram.ui.Components.k10 k10Var2 = this.f34657e;
        k10Var2.f27916w = false;
        k10Var2.setItemsCount(3);
        org.telegram.ui.Components.k10 k10Var3 = this.f34657e;
        int i16 = org.telegram.ui.ActionBar.h6.G8;
        int i17 = org.telegram.ui.ActionBar.h6.f20913i6;
        k10Var3.f(i16, i17, i17);
        fVar.addView(this.f34657e);
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, this.f34657e, 1, null, 2);
        this.f34658f = w70Var;
        w70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f34658f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f34658f);
        s4.d0 d0Var = new s4.d0(1, false);
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.d = rm0Var;
        rm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f34658f);
        org.telegram.ui.Components.rm0 rm0Var2 = this.d;
        xh1 xh1Var = new xh1(this, context);
        this.h = xh1Var;
        rm0Var2.setAdapter(xh1Var);
        this.d.setLayoutManager(d0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.rm0 rm0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        rm0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new ai.t(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new ai.o6(22, this, context));
        this.d.setOnScrollListener(new oe1(this, 2));
        this.f34661s = org.telegram.ui.Components.q20.b();
        org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(context, this.resourceProvider, false);
        this.f34660r = q20Var;
        q20Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f34660r, this.f34661s);
        this.f34660r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f42228b;

            {
                this.f42228b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f42228b;
                        usersSelectActivity.f34656c.clearFocus();
                        usersSelectActivity.f34656c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34656c);
                        return;
                    default:
                        this.f42228b.X();
                        return;
                }
            }
        });
        this.f34660r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f34663x == 2) {
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
                org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(this.f34656c.getContext(), str);
                this.f34655b.a(e40Var, false);
                e40Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.e40 e40Var2 = new org.telegram.ui.Components.e40(this.f34656c.getContext(), chat);
                    this.f34655b.a(e40Var2, false);
                    e40Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.w70 w70Var = this.f34658f;
            if (w70Var != null) {
                w70Var.e(false, true);
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
        return this.f34664y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        vy0 vy0Var = new vy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21101s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34654a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20969l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20988m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21008n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34658f, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20806c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34658f, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34656c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34656c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34656c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20777ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20914i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20932j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20951k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21007n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21207y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.h6.f21075r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.S7));
        int i12 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34655b, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20815ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34655b, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20797bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34655b, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20834di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34655b, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.e40 e40Var = (org.telegram.ui.Components.e40) view;
        if (e40Var.f25978y) {
            this.P = null;
            this.f34655b.b(e40Var);
            if (this.f34663x == 2) {
                if (e40Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (e40Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (e40Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (e40Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (e40Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (e40Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (e40Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (e40Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (e40Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (e40Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (e40Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (e40Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.e40 e40Var2 = this.P;
        if (e40Var2 != null) {
            e40Var2.a();
        }
        this.P = e40Var;
        e40Var.b();
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
        ci.g2 g2Var = this.f34656c;
        if (g2Var != null) {
            g2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f34664y = i10;
        yh1 yh1Var = this.f34655b;
        if (yh1Var != null) {
            yh1Var.requestLayout();
        }
    }
}
