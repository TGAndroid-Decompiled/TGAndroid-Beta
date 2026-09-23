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
    public org.telegram.ui.Components.n30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.v1 f31579a;
    public qh1 f31580b;
    public ci.h2 f31581c;
    public org.telegram.ui.Components.ml0 d;
    public org.telegram.ui.Components.u00 e;
    public org.telegram.ui.Components.v60 f31582f;
    public ph1 h;
    public nh1 f31583n;
    public org.telegram.ui.Components.z10 f31584r;
    public FrameLayout.LayoutParams f31585s;
    public boolean v;
    public int f31586w;
    public int f31587x;
    public int f31588y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.i();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f31587x = 0;
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
        nh1 nh1Var = this.f31583n;
        if (nh1Var != null) {
            nh1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f31587x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f31586w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f31586w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f31586w == 0) {
                this.E.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.p6 title = this.E.getTitle();
            int i13 = this.f31586w;
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
        if (this.f31587x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f24164a = true;
            frameLayout.f24165b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(parentActivity, true, true, true);
            frameLayout.f24166c = p6Var;
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
            p6Var.setTextSize(AndroidUtilities.dp(18.0f));
            p6Var.setGravity(3);
            p6Var.setTypeface(AndroidUtilities.bold());
            p6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(p6Var);
            org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(parentActivity, true, true, true);
            frameLayout.d = p6Var2;
            p6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.B8));
            p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
            p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            p6Var2.setGravity(3);
            p6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(p6Var2);
            p6Var.getDrawable().D = true;
            p6Var2.getDrawable().D = true;
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
            p6Var.b(1.0f, 150L, rrVar);
            p6Var2.b(1.0f, 150L, rrVar);
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
        int i14 = this.f31587x;
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
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 8));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 6);
        this.f31579a = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f31579a, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        fVar.addView(this.f31579a);
        qh1 qh1Var = new qh1(this, context);
        this.f31580b = qh1Var;
        this.f31579a.addView(qh1Var, w7.x5.c(-2.0f, -1));
        this.f31580b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f34984b;

            {
                this.f34984b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f34984b;
                        usersSelectActivity.f31581c.clearFocus();
                        usersSelectActivity.f31581c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f31581c);
                        return;
                    default:
                        this.f34984b.X();
                        return;
                }
            }
        });
        ci.h2 h2Var = new ci.h2(this, context, 9);
        this.f31581c = h2Var;
        h2Var.setTextSize(1, 16.0f);
        this.f31581c.setHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Xh, false));
        this.f31581c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f31581c.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Yh, false));
        this.f31581c.setCursorWidth(1.5f);
        ci.h2 h2Var2 = this.f31581c;
        h2Var2.setInputType(h2Var2.getInputType() | 176);
        this.f31581c.setSingleLine(true);
        this.f31581c.setBackgroundDrawable(null);
        this.f31581c.setVerticalScrollBarEnabled(false);
        this.f31581c.setHorizontalScrollBarEnabled(false);
        this.f31581c.setTextIsSelectable(false);
        this.f31581c.setPadding(0, 0, 0, 0);
        this.f31581c.setImeOptions(268435462);
        ci.h2 h2Var3 = this.f31581c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h2Var3.setGravity(i10 | 16);
        this.f31580b.addView(this.f31581c);
        this.f31581c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f31581c.setCustomSelectionActionModeCallback(new ii.d1(5));
        this.f31581c.setOnKeyListener(new u60(1, this));
        this.f31581c.addTextChangedListener(new mh1(this));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.e = u00Var;
        u00Var.setViewType(10);
        org.telegram.ui.Components.u00 u00Var2 = this.e;
        u00Var2.f28353w = false;
        u00Var2.setItemsCount(3);
        org.telegram.ui.Components.u00 u00Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.h6.G8;
        int i17 = org.telegram.ui.ActionBar.h6.f18878i6;
        u00Var3.f(i16, i17, i17);
        fVar.addView(this.e);
        org.telegram.ui.Components.v60 v60Var = new org.telegram.ui.Components.v60(context, this.e, 1, null, 2);
        this.f31582f = v60Var;
        v60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f31582f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f31582f);
        s4.c0 c0Var = new s4.c0(1, false);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.d = ml0Var;
        ml0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f31582f);
        org.telegram.ui.Components.ml0 ml0Var2 = this.d;
        ph1 ph1Var = new ph1(this, context);
        this.h = ph1Var;
        ml0Var2.setAdapter(ph1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ml0 ml0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        ml0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new ai.t(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new ai.n6(22, this, context));
        this.d.setOnScrollListener(new ge1(this, 2));
        this.f31585s = org.telegram.ui.Components.z10.b();
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f31584r = z10Var;
        z10Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f31584r, this.f31585s);
        this.f31584r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f34984b;

            {
                this.f34984b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f34984b;
                        usersSelectActivity.f31581c.clearFocus();
                        usersSelectActivity.f31581c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f31581c);
                        return;
                    default:
                        this.f34984b.X();
                        return;
                }
            }
        });
        this.f31584r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f31587x == 2) {
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
                org.telegram.ui.Components.n30 n30Var = new org.telegram.ui.Components.n30(this.f31581c.getContext(), str);
                this.f31580b.a(n30Var, false);
                n30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.n30 n30Var2 = new org.telegram.ui.Components.n30(this.f31581c.getContext(), chat);
                    this.f31580b.a(n30Var2, false);
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
            org.telegram.ui.Components.v60 v60Var = this.f31582f;
            if (v60Var != null) {
                v60Var.e(false, true);
            }
            ph1 ph1Var = this.h;
            if (ph1Var != null) {
                ph1Var.l();
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
        return this.f31588y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        qy0 qy0Var = new qy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f18789d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31579a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18935l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18954m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18974n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31582f, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f18772c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31582f, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f18860h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31581c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31581c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31581c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18744ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18879i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18897j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18917k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18973n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.S7));
        int i12 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31580b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18782ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31580b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18763bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31580b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18801di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31580b, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) view;
        if (n30Var.f26339y) {
            this.P = null;
            this.f31580b.b(n30Var);
            if (this.f31587x == 2) {
                if (n30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (n30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (n30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (n30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (n30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (n30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (n30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (n30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (n30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (n30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (n30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (n30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.n30 n30Var2 = this.P;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.P = n30Var;
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
        ci.h2 h2Var = this.f31581c;
        if (h2Var != null) {
            h2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f31588y = i10;
        qh1 qh1Var = this.f31580b;
        if (qh1Var != null) {
            qh1Var.requestLayout();
        }
    }
}
