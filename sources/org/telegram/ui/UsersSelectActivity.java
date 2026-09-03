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
    public org.telegram.ui.Components.o30 M;
    public int N;
    public int O;
    public org.telegram.ui.ActionBar.x1 f32361a;
    public mh1 f32362b;
    public kg.f f32363c;
    public org.telegram.ui.Components.rl0 d;
    public org.telegram.ui.Components.u00 e;
    public org.telegram.ui.Components.w60 f32364f;
    public lh1 h;
    public jh1 f32365n;
    public org.telegram.ui.Components.a20 f32366r;
    public FrameLayout.LayoutParams f32367s;
    public boolean v;
    public int f32368w;
    public int f32369x;
    public int f32370y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z4) {
        super(null);
        this.K = new a0.h();
        this.L = new ArrayList();
        this.F = z4;
        this.G = i10;
        this.H = arrayList;
        this.f32369x = 0;
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
        jh1 jh1Var = this.f32365n;
        if (jh1Var != null) {
            jh1Var.a(this.G, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f32369x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f32368w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f32368w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f32368w == 0) {
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
            int i13 = this.f32368w;
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
        if (this.f32369x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f23552a = true;
            frameLayout.f23553b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, true, true, true);
            frameLayout.f23554c = k6Var;
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
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
            k6Var.b(1.0f, 150L, mrVar);
            k6Var2.b(1.0f, 150L, mrVar);
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
        int i14 = this.f32369x;
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
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 25));
        g gVar = new g(this, context, 4);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 6);
        this.f32361a = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f32361a, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        gVar.addView(this.f32361a);
        mh1 mh1Var = new mh1(this, context);
        this.f32362b = mh1Var;
        this.f32361a.addView(mh1Var, k7.b6.c(-2.0f, -1));
        this.f32362b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f34677b;

            {
                this.f34677b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f34677b;
                        usersSelectActivity.f32363c.clearFocus();
                        usersSelectActivity.f32363c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f32363c);
                        return;
                    default:
                        this.f34677b.X();
                        return;
                }
            }
        });
        kg.f fVar = new kg.f(this, context, 8);
        this.f32363c = fVar;
        fVar.setTextSize(1, 16.0f);
        this.f32363c.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xh, false));
        this.f32363c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f32363c.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yh, false));
        this.f32363c.setCursorWidth(1.5f);
        kg.f fVar2 = this.f32363c;
        fVar2.setInputType(fVar2.getInputType() | 176);
        this.f32363c.setSingleLine(true);
        this.f32363c.setBackgroundDrawable(null);
        this.f32363c.setVerticalScrollBarEnabled(false);
        this.f32363c.setHorizontalScrollBarEnabled(false);
        this.f32363c.setTextIsSelectable(false);
        this.f32363c.setPadding(0, 0, 0, 0);
        this.f32363c.setImeOptions(268435462);
        kg.f fVar3 = this.f32363c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar3.setGravity(i10 | 16);
        this.f32362b.addView(this.f32363c);
        this.f32363c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f32363c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(4));
        this.f32363c.setOnKeyListener(new t60(1, this));
        this.f32363c.addTextChangedListener(new ih1(this));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.e = u00Var;
        u00Var.setViewType(10);
        org.telegram.ui.Components.u00 u00Var2 = this.e;
        u00Var2.f29071w = false;
        u00Var2.setItemsCount(3);
        org.telegram.ui.Components.u00 u00Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        int i17 = org.telegram.ui.ActionBar.j6.f19971i6;
        u00Var3.f(i16, i17, i17);
        gVar.addView(this.e);
        org.telegram.ui.Components.w60 w60Var = new org.telegram.ui.Components.w60(context, this.e, 1, null, 2);
        this.f32364f = w60Var;
        w60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f32364f.d.setText(LocaleController.getString(R.string.NoContacts));
        gVar.addView(this.f32364f);
        f2.i0 i0Var = new f2.i0(1, false);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.d = rl0Var;
        rl0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f32364f);
        org.telegram.ui.Components.rl0 rl0Var2 = this.d;
        lh1 lh1Var = new lh1(this, context);
        this.h = lh1Var;
        rl0Var2.setAdapter(lh1Var);
        this.d.setLayoutManager(i0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.rl0 rl0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        rl0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new nh.k(8));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new gg.v0(23, this, context));
        this.d.setOnScrollListener(new be1(this, 2));
        this.f32367s = org.telegram.ui.Components.a20.b();
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.f32366r = a20Var;
        a20Var.setImageResource(R.drawable.floating_check);
        gVar.addView(this.f32366r, this.f32367s);
        this.f32366r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f34677b;

            {
                this.f34677b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f34677b;
                        usersSelectActivity.f32363c.clearFocus();
                        usersSelectActivity.f32363c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f32363c);
                        return;
                    default:
                        this.f34677b.X();
                        return;
                }
            }
        });
        this.f32366r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z10) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f32369x == 2) {
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
                org.telegram.ui.Components.o30 o30Var = new org.telegram.ui.Components.o30(this.f32363c.getContext(), str);
                this.f32362b.a(o30Var, false);
                o30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.o30 o30Var2 = new org.telegram.ui.Components.o30(this.f32363c.getContext(), chat);
                    this.f32362b.a(o30Var2, false);
                    o30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.w60 w60Var = this.f32364f;
            if (w60Var != null) {
                w60Var.e(false, true);
            }
            lh1 lh1Var = this.h;
            if (lh1Var != null) {
                lh1Var.l();
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
        return this.f32370y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        jy0 jy0Var = new jy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20151s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32361a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20025l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20043m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20061n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32364f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19864c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32364f, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19953h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32363c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32363c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32363c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19918f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.t3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19899e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19972i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19989j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20007k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20060n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20256y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.S7));
        int i12 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32362b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32362b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32362b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32362b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) view;
        if (o30Var.f27451y) {
            this.M = null;
            this.f32362b.b(o30Var);
            if (this.f32369x == 2) {
                if (o30Var.getUid() == -9223372036854775800L) {
                    this.G &= -2;
                } else if (o30Var.getUid() == -9223372036854775799L) {
                    this.G &= -3;
                } else if (o30Var.getUid() == Long.MIN_VALUE) {
                    this.G &= -5;
                } else if (o30Var.getUid() == -9223372036854775807L) {
                    this.G &= -9;
                }
            } else if (o30Var.getUid() == Long.MIN_VALUE) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (o30Var.getUid() == -9223372036854775807L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (o30Var.getUid() == -9223372036854775806L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (o30Var.getUid() == -9223372036854775805L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (o30Var.getUid() == -9223372036854775804L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (o30Var.getUid() == -9223372036854775803L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (o30Var.getUid() == -9223372036854775802L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (o30Var.getUid() == -9223372036854775801L) {
                this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.o30 o30Var2 = this.M;
        if (o30Var2 != null) {
            o30Var2.a();
        }
        this.M = o30Var;
        o30Var.b();
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
        kg.f fVar = this.f32363c;
        if (fVar != null) {
            fVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f32370y = i10;
        mh1 mh1Var = this.f32362b;
        if (mh1Var != null) {
            mh1Var.requestLayout();
        }
    }
}
