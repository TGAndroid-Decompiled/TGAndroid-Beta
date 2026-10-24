package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.f5 E;
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
    public org.telegram.ui.Components.t30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.u1 f34259a;
    public qg1 f34260b;
    public ei.e2 f34261c;
    public org.telegram.ui.Components.lm0 d;
    public org.telegram.ui.Components.z00 e;
    public org.telegram.ui.Components.o70 f34262f;
    public pg1 h;
    public ng1 f34263n;
    public org.telegram.ui.Components.f20 f34264r;
    public FrameLayout.LayoutParams f34265s;
    public boolean v;
    public int f34266w;
    public int f34267x;
    public int f34268y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f34267x = 0;
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
        ng1 ng1Var = this.f34263n;
        if (ng1Var != null) {
            ng1Var.d(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10;
        int i11 = this.f34267x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f34266w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f34266w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f34266w == 0) {
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
            int i13 = this.f34266w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.R > 0) {
                this.E.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.E.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21157bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21367n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
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
        if (this.f34267x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f26195a = true;
            frameLayout.f26196b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            frameLayout.f26197c = o6Var;
            int i13 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.r6.a0(o6Var, i13, null);
            o6Var.setTextSize(AndroidUtilities.dp(18.0f));
            o6Var.setGravity(3);
            o6Var.setTypeface(AndroidUtilities.bold());
            o6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(o6Var);
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            frameLayout.d = o6Var2;
            o6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
            org.telegram.ui.ActionBar.r6.a0(o6Var2, i13, null);
            o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var2.setGravity(3);
            o6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(o6Var2);
            o6Var.getDrawable().J = true;
            o6Var2.getDrawable().J = true;
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
            o6Var.b(1.0f, 150L, zrVar);
            o6Var2.b(1.0f, 150L, zrVar);
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
        int i14 = this.f34267x;
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
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 12));
        e eVar = new e(this, context, 4);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 6);
        this.f34259a = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f34259a, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
        eVar.addView(this.f34259a);
        qg1 qg1Var = new qg1(this, context);
        this.f34260b = qg1Var;
        this.f34259a.addView(qg1Var, w7.z5.c(-2.0f, -1));
        this.f34260b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f39265b;

            {
                this.f39265b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f39265b;
                        usersSelectActivity.f34261c.clearFocus();
                        usersSelectActivity.f34261c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34261c);
                        return;
                    default:
                        this.f39265b.X();
                        return;
                }
            }
        });
        ei.e2 e2Var = new ei.e2(this, context, 9);
        this.f34261c = e2Var;
        e2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.C(this.f34261c, org.telegram.ui.ActionBar.k6.Xh, null);
        org.telegram.ui.ActionBar.r6.W(this.f34261c, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.x(this.f34261c, org.telegram.ui.ActionBar.k6.Yh, null);
        this.f34261c.setCursorWidth(1.5f);
        ei.e2 e2Var2 = this.f34261c;
        e2Var2.setInputType(e2Var2.getInputType() | 176);
        this.f34261c.setSingleLine(true);
        this.f34261c.setBackgroundDrawable(null);
        this.f34261c.setVerticalScrollBarEnabled(false);
        this.f34261c.setHorizontalScrollBarEnabled(false);
        this.f34261c.setTextIsSelectable(false);
        this.f34261c.setPadding(0, 0, 0, 0);
        this.f34261c.setImeOptions(268435462);
        ei.e2 e2Var3 = this.f34261c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e2Var3.setGravity(i10 | 16);
        this.f34260b.addView(this.f34261c);
        this.f34261c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f34261c.setCustomSelectionActionModeCallback(new ki.c1(4));
        this.f34261c.setOnKeyListener(new i60(1, this));
        this.f34261c.addTextChangedListener(new mg1(this));
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        this.e = z00Var;
        z00Var.setViewType(10);
        org.telegram.ui.Components.z00 z00Var2 = this.e;
        z00Var2.f33104w = false;
        z00Var2.setItemsCount(3);
        org.telegram.ui.Components.z00 z00Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.k6.G8;
        int i17 = org.telegram.ui.ActionBar.k6.f21273i6;
        z00Var3.e(i16, i17, i17);
        eVar.addView(this.e);
        org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(1, 2, context, this.e, null);
        this.f34262f = o70Var;
        o70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f34262f.d.setText(LocaleController.getString(R.string.NoContacts));
        eVar.addView(this.f34262f);
        s4.b0 b0Var = new s4.b0(1, false);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.d = lm0Var;
        lm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f34262f);
        org.telegram.ui.Components.lm0 lm0Var2 = this.d;
        pg1 pg1Var = new pg1(this, context);
        this.h = pg1Var;
        lm0Var2.setAdapter(pg1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.lm0 lm0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        lm0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new ci.l(10));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new ci.x4(22, this, context));
        this.d.setOnScrollListener(new gd1(this, 2));
        this.f34265s = org.telegram.ui.Components.f20.b();
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(context, this.resourceProvider, false);
        this.f34264r = f20Var;
        f20Var.setImageResource(R.drawable.floating_check);
        eVar.addView(this.f34264r, this.f34265s);
        this.f34264r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f39265b;

            {
                this.f39265b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f39265b;
                        usersSelectActivity.f34261c.clearFocus();
                        usersSelectActivity.f34261c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f34261c);
                        return;
                    default:
                        this.f39265b.X();
                        return;
                }
            }
        });
        this.f34264r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f34267x == 2) {
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
                org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(this.f34261c.getContext(), str);
                this.f34260b.a(t30Var, false);
                t30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.t30 t30Var2 = new org.telegram.ui.Components.t30(this.f34261c.getContext(), chat);
                    this.f34260b.a(t30Var2, false);
                    t30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.o70 o70Var = this.f34262f;
            if (o70Var != null) {
                o70Var.e(false, true);
            }
            pg1 pg1Var = this.h;
            if (pg1Var != null) {
                pg1Var.l();
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
        return this.f34268y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34259a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21329l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21348m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21368n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34262f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21166c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34262f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34261c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21137ai));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21274i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21292j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21312k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34260b, 0, new Class[]{org.telegram.ui.Components.t30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21177ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34260b, 0, new Class[]{org.telegram.ui.Components.t30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21194di));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.t30 t30Var = (org.telegram.ui.Components.t30) view;
        if (t30Var.f30711y) {
            this.P = null;
            this.f34260b.b(t30Var);
            if (this.f34267x == 2) {
                if (t30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (t30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (t30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (t30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (t30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (t30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (t30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (t30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (t30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (t30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (t30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (t30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Y();
            W();
            return;
        }
        org.telegram.ui.Components.t30 t30Var2 = this.P;
        if (t30Var2 != null) {
            t30Var2.a();
        }
        this.P = t30Var;
        t30Var.b();
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
        ei.e2 e2Var = this.f34261c;
        if (e2Var != null) {
            e2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ei.e2 e2Var = this.f34261c;
            if (e2Var != null) {
                org.telegram.ui.ActionBar.r6.m(e2Var, 34, org.telegram.ui.ActionBar.k6.Xh, null);
                org.telegram.ui.ActionBar.r6.x(this.f34261c, org.telegram.ui.ActionBar.k6.Yh, null);
            }
            org.telegram.ui.Components.lm0 lm0Var = this.d;
            if (lm0Var != null) {
                lm0Var.A1();
            }
            org.telegram.ui.ActionBar.u1 u1Var = this.f34259a;
            if (u1Var != null) {
                AndroidUtilities.setScrollViewEdgeEffectColor(u1Var, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
            }
            if (this.f34260b != null) {
                for (int i10 = 0; i10 < this.f34260b.getChildCount(); i10++) {
                    View childAt = this.f34260b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.t30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setContainerHeight(int i10) {
        this.f34268y = i10;
        qg1 qg1Var = this.f34260b;
        if (qg1Var != null) {
            qg1Var.requestLayout();
        }
    }
}
