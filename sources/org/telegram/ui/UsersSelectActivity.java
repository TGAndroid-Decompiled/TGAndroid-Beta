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
    public org.telegram.ui.Components.e5 A;
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
    public org.telegram.ui.Components.j30 L;
    public int M;
    public int N;
    public org.telegram.ui.ActionBar.w1 f36350a;
    public sg1 f36351b;
    public ig.f f36352c;
    public org.telegram.ui.Components.jl0 d;
    public org.telegram.ui.Components.p00 f36353e;
    public org.telegram.ui.Components.q60 f36354f;
    public rg1 h;
    public pg1 f36355n;
    public org.telegram.ui.Components.u10 f36356r;
    public FrameLayout.LayoutParams f36357s;
    public boolean v;
    public int f36358w;
    public int f36359x;
    public int f36360y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.J = new a0.h();
        this.K = new ArrayList();
        this.E = z10;
        this.F = i10;
        this.G = arrayList;
        this.f36359x = 0;
        this.C = true;
    }

    public static void U(org.telegram.ui.UsersSelectActivity r12, android.content.Context r13, android.view.View r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.U(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.W():void");
    }

    public final void X() {
        a0.h hVar = this.J;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        pg1 pg1Var = this.f36355n;
        if (pg1Var != null) {
            pg1Var.a(this.F, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f36359x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f36358w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f36358w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f36358w == 0) {
                this.A.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.N > 0) {
                    this.A.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.A.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.o6 title = this.A.getTitle();
            int i13 = this.f36358w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.N > 0) {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        Object chat;
        int i12;
        float f9;
        float f10;
        this.I = false;
        this.H = false;
        this.K.clear();
        this.J.b();
        this.L = null;
        if (this.f36359x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f27927a = true;
            frameLayout.f27928b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            frameLayout.f27929c = o6Var;
            int i13 = org.telegram.ui.ActionBar.g6.A8;
            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            o6Var.setTextSize(AndroidUtilities.dp(18.0f));
            o6Var.setGravity(3);
            o6Var.setTypeface(AndroidUtilities.bold());
            o6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(o6Var);
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            frameLayout.d = o6Var2;
            o6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.B8));
            o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var2.setGravity(3);
            o6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(o6Var2);
            o6Var.getDrawable().D = true;
            o6Var2.getDrawable().D = true;
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
            o6Var.b(1.0f, 150L, jrVar);
            o6Var2.b(1.0f, 150L, jrVar);
            frameLayout.setClipChildren(false);
            this.A = frameLayout;
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 64.0f;
            }
            if (z10) {
                f10 = 64.0f;
            } else {
                f10 = 0.0f;
            }
            lVar.addView((View) frameLayout, i7.f6.d(-1, -1.0f, 0, f9, 0.0f, f10, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f36359x;
        boolean z11 = this.E;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                Y();
            }
        } else if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 25));
        g gVar = new g(this, context, 4);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 6);
        this.f36350a = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f36350a, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        gVar.addView(this.f36350a);
        sg1 sg1Var = new sg1(this, context);
        this.f36351b = sg1Var;
        this.f36350a.addView(sg1Var, i7.f6.c(-2.0f, -1));
        this.f36351b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40801b;

            {
                this.f40801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40801b;
                        usersSelectActivity.f36352c.clearFocus();
                        usersSelectActivity.f36352c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36352c);
                        return;
                    default:
                        this.f40801b.X();
                        return;
                }
            }
        });
        ig.f fVar = new ig.f(this, context, 10);
        this.f36352c = fVar;
        fVar.setTextSize(1, 16.0f);
        this.f36352c.setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xh, false));
        this.f36352c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f36352c.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yh, false));
        this.f36352c.setCursorWidth(1.5f);
        ig.f fVar2 = this.f36352c;
        fVar2.setInputType(fVar2.getInputType() | 176);
        this.f36352c.setSingleLine(true);
        this.f36352c.setBackgroundDrawable(null);
        this.f36352c.setVerticalScrollBarEnabled(false);
        this.f36352c.setHorizontalScrollBarEnabled(false);
        this.f36352c.setTextIsSelectable(false);
        this.f36352c.setPadding(0, 0, 0, 0);
        this.f36352c.setImeOptions(268435462);
        ig.f fVar3 = this.f36352c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar3.setGravity(i10 | 16);
        this.f36351b.addView(this.f36352c);
        this.f36352c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f36352c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.k0(4));
        this.f36352c.setOnKeyListener(new f60(1, this));
        this.f36352c.addTextChangedListener(new og1(this));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.f36353e = p00Var;
        p00Var.setViewType(10);
        org.telegram.ui.Components.p00 p00Var2 = this.f36353e;
        p00Var2.f31529w = false;
        p00Var2.setItemsCount(3);
        org.telegram.ui.Components.p00 p00Var3 = this.f36353e;
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        int i17 = org.telegram.ui.ActionBar.g6.f23152i6;
        p00Var3.f(i16, i17, i17);
        gVar.addView(this.f36353e);
        org.telegram.ui.Components.q60 q60Var = new org.telegram.ui.Components.q60(context, this.f36353e, 1, null, 2);
        this.f36354f = q60Var;
        q60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f36354f.d.setText(LocaleController.getString(R.string.NoContacts));
        gVar.addView(this.f36354f);
        f2.j0 j0Var = new f2.j0(1, false);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.d = jl0Var;
        jl0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f36354f);
        org.telegram.ui.Components.jl0 jl0Var2 = this.d;
        rg1 rg1Var = new rg1(this, context);
        this.h = rg1Var;
        jl0Var2.setAdapter(rg1Var);
        this.d.setLayoutManager(j0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.jl0 jl0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        jl0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new lh.j(8));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new eg.w0(23, this, context));
        this.d.setOnScrollListener(new lb1(this, 3));
        this.f36357s = org.telegram.ui.Components.u10.b();
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.f36356r = u10Var;
        u10Var.setImageResource(R.drawable.floating_check);
        gVar.addView(this.f36356r, this.f36357s);
        this.f36356r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f40801b;

            {
                this.f40801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f40801b;
                        usersSelectActivity.f36352c.clearFocus();
                        usersSelectActivity.f36352c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36352c);
                        return;
                    default:
                        this.f40801b.X();
                        return;
                }
            }
        });
        this.f36356r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f36359x == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i18 == 2 && !this.D) {
                    str = "new_chats";
                    i12 = 2;
                } else if (i18 == (!this.D ? 1 : 0) + 2) {
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
            if ((i12 & this.F) != 0) {
                org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(this.f36352c.getContext(), str);
                this.f36351b.a(j30Var, false);
                j30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.G;
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
                    org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(this.f36352c.getContext(), chat);
                    this.f36351b.a(j30Var2, false);
                    j30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.q60 q60Var = this.f36354f;
            if (q60Var != null) {
                q60Var.e(false, true);
            }
            rg1 rg1Var = this.h;
            if (rg1Var != null) {
                rg1Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.f36360y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        rx0 rx0Var = new rx0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36350a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23207l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23224m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23242n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36354f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36354f, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36352c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36352c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36352c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23153i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23171j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23190k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.e4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.S7));
        int i12 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36351b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36351b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36351b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36351b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view;
        if (j30Var.f29540y) {
            this.L = null;
            this.f36351b.b(j30Var);
            if (this.f36359x == 2) {
                if (j30Var.getUid() == -9223372036854775800L) {
                    this.F &= -2;
                } else if (j30Var.getUid() == -9223372036854775799L) {
                    this.F &= -3;
                } else if (j30Var.getUid() == Long.MIN_VALUE) {
                    this.F &= -5;
                } else if (j30Var.getUid() == -9223372036854775807L) {
                    this.F &= -9;
                }
            } else if (j30Var.getUid() == Long.MIN_VALUE) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (j30Var.getUid() == -9223372036854775807L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (j30Var.getUid() == -9223372036854775806L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (j30Var.getUid() == -9223372036854775805L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (j30Var.getUid() == -9223372036854775804L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (j30Var.getUid() == -9223372036854775803L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (j30Var.getUid() == -9223372036854775802L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (j30Var.getUid() == -9223372036854775801L) {
                this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.j30 j30Var2 = this.L;
        if (j30Var2 != null) {
            j30Var2.a();
        }
        this.L = j30Var;
        j30Var.b();
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
        ig.f fVar = this.f36352c;
        if (fVar != null) {
            fVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f36360y = i10;
        sg1 sg1Var = this.f36351b;
        if (sg1Var != null) {
            sg1Var.requestLayout();
        }
    }
}
