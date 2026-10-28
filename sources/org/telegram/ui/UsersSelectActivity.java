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
public class UsersSelectActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
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
    public org.telegram.ui.Components.x30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.w1 f36346a;
    public tg1 f36347b;
    public fi.c2 f36348c;
    public org.telegram.ui.Components.nm0 d;
    public org.telegram.ui.Components.c10 e;
    public org.telegram.ui.Components.s70 f36349f;
    public sg1 h;
    public qg1 f36350n;
    public org.telegram.ui.Components.j20 f36351r;
    public FrameLayout.LayoutParams f36352s;
    public boolean v;
    public int f36353w;
    public int f36354x;
    public int f36355y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f36354x = 0;
        this.G = true;
    }

    public static void V(org.telegram.ui.UsersSelectActivity r12, android.content.Context r13, android.view.View r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.V(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.X():void");
    }

    public final void Y() {
        a0.h hVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        qg1 qg1Var = this.f36350n;
        if (qg1Var != null) {
            qg1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Z() {
        int i10;
        int i11 = this.f36354x;
        if (i11 == 0) {
            if (getUserConfig().isPremium()) {
                i10 = getMessagesController().dialogFiltersChatsLimitPremium;
            } else {
                i10 = getMessagesController().dialogFiltersChatsLimitDefault;
            }
            int i12 = this.f36353w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f36353w), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f36353w == 0) {
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
            int i13 = this.f36353w;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23330bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23541n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
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
        if (this.f36354x == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f29212a = true;
            frameLayout.f29213b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            frameLayout.f29214c = s6Var;
            int i13 = org.telegram.ui.ActionBar.y6.A8;
            org.telegram.ui.ActionBar.f7.Z(s6Var, i13, null);
            s6Var.setTextSize(AndroidUtilities.dp(18.0f));
            s6Var.setGravity(3);
            s6Var.setTypeface(AndroidUtilities.bold());
            s6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            frameLayout.addView(s6Var);
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            frameLayout.d = s6Var2;
            s6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
            org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, null);
            s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            s6Var2.setGravity(3);
            s6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(s6Var2);
            s6Var.getDrawable().J = true;
            s6Var2.getDrawable().J = true;
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
            s6Var.b(1.0f, 150L, dsVar);
            s6Var2.b(1.0f, 150L, dsVar);
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
            kVar.addView((View) frameLayout, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, f7, 0.0f, f10, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f36354x;
        boolean z11 = this.I;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                Z();
            }
        } else if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        }
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, 15));
        e eVar = new e(this, context, 4);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 5);
        this.f36346a = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f36346a, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
        eVar.addView(this.f36346a);
        tg1 tg1Var = new tg1(this, context);
        this.f36347b = tg1Var;
        this.f36346a.addView(tg1Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        this.f36347b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f42092b;

            {
                this.f42092b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f42092b;
                        usersSelectActivity.f36348c.clearFocus();
                        usersSelectActivity.f36348c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36348c);
                        return;
                    default:
                        this.f42092b.Y();
                        return;
                }
            }
        });
        fi.c2 c2Var = new fi.c2(this, context, 9);
        this.f36348c = c2Var;
        c2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.B(this.f36348c, org.telegram.ui.ActionBar.y6.Xh, null);
        org.telegram.ui.ActionBar.f7.V(this.f36348c, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.w(this.f36348c, org.telegram.ui.ActionBar.y6.Yh, null);
        this.f36348c.setCursorWidth(1.5f);
        fi.c2 c2Var2 = this.f36348c;
        c2Var2.setInputType(c2Var2.getInputType() | 176);
        this.f36348c.setSingleLine(true);
        this.f36348c.setBackgroundDrawable(null);
        this.f36348c.setVerticalScrollBarEnabled(false);
        this.f36348c.setHorizontalScrollBarEnabled(false);
        this.f36348c.setTextIsSelectable(false);
        this.f36348c.setPadding(0, 0, 0, 0);
        this.f36348c.setImeOptions(268435462);
        fi.c2 c2Var3 = this.f36348c;
        int i15 = 5;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        c2Var3.setGravity(i10 | 16);
        this.f36347b.addView(this.f36348c);
        this.f36348c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f36348c.setCustomSelectionActionModeCallback(new li.b1(4));
        this.f36348c.setOnKeyListener(new m60(1, this));
        this.f36348c.addTextChangedListener(new pg1(this));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.e = c10Var;
        c10Var.setViewType(10);
        org.telegram.ui.Components.c10 c10Var2 = this.e;
        c10Var2.f27026w = false;
        c10Var2.setItemsCount(3);
        org.telegram.ui.Components.c10 c10Var3 = this.e;
        int i16 = org.telegram.ui.ActionBar.y6.G8;
        int i17 = org.telegram.ui.ActionBar.y6.f23449i6;
        c10Var3.e(i16, i17, i17);
        eVar.addView(this.e);
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(1, 2, context, this.e, null);
        this.f36349f = s70Var;
        s70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f36349f.d.setText(LocaleController.getString(R.string.NoContacts));
        eVar.addView(this.f36349f);
        s4.c0 c0Var = new s4.c0(1, false);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.d = nm0Var;
        nm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f36349f);
        org.telegram.ui.Components.nm0 nm0Var2 = this.d;
        sg1 sg1Var = new sg1(this, context);
        this.h = sg1Var;
        nm0Var2.setAdapter(sg1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.nm0 nm0Var3 = this.d;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        nm0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new di.l(10));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new di.x4(22, this, context));
        this.d.setOnScrollListener(new z81(this, 4));
        this.f36352s = org.telegram.ui.Components.j20.b();
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.f36351r = j20Var;
        j20Var.setImageResource(R.drawable.floating_check);
        eVar.addView(this.f36351r, this.f36352s);
        this.f36351r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f42092b;

            {
                this.f42092b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f42092b;
                        usersSelectActivity.f36348c.clearFocus();
                        usersSelectActivity.f36348c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36348c);
                        return;
                    default:
                        this.f42092b.Y();
                        return;
                }
            }
        });
        this.f36351r.setContentDescription(LocaleController.getString(R.string.Next));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f36354x == 2) {
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
                org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(this.f36348c.getContext(), str);
                this.f36347b.a(x30Var, false);
                x30Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(this.f36348c.getContext(), chat);
                    this.f36347b.a(x30Var2, false);
                    x30Var2.setOnClickListener(this);
                }
            }
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.s70 s70Var = this.f36349f;
            if (s70Var != null) {
                s70Var.e(false, true);
            }
            sg1 sg1Var = this.h;
            if (sg1Var != null) {
                sg1Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.k4) {
                            ((org.telegram.ui.Cells.k4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.f36355y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36346a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23504l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23522m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23542n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36349f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36349f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36348c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23310ai));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23450i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23467j7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23486k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36347b, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23350ci));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36347b, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23369di));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) view;
        if (x30Var.f34655y) {
            this.P = null;
            this.f36347b.b(x30Var);
            if (this.f36354x == 2) {
                if (x30Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (x30Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (x30Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (x30Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (x30Var.getUid() == Long.MIN_VALUE) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (x30Var.getUid() == -9223372036854775807L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (x30Var.getUid() == -9223372036854775806L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (x30Var.getUid() == -9223372036854775805L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (x30Var.getUid() == -9223372036854775804L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (x30Var.getUid() == -9223372036854775803L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (x30Var.getUid() == -9223372036854775802L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (x30Var.getUid() == -9223372036854775801L) {
                this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            Z();
            X();
            return;
        }
        org.telegram.ui.Components.x30 x30Var2 = this.P;
        if (x30Var2 != null) {
            x30Var2.a();
        }
        this.P = x30Var;
        x30Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatDidCreated);
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
        fi.c2 c2Var = this.f36348c;
        if (c2Var != null) {
            c2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fi.c2 c2Var = this.f36348c;
            if (c2Var != null) {
                org.telegram.ui.ActionBar.f7.m(c2Var, 34, org.telegram.ui.ActionBar.y6.Xh, null);
                org.telegram.ui.ActionBar.f7.w(this.f36348c, org.telegram.ui.ActionBar.y6.Yh, null);
            }
            org.telegram.ui.Components.nm0 nm0Var = this.d;
            if (nm0Var != null) {
                nm0Var.A1();
            }
            org.telegram.ui.ActionBar.w1 w1Var = this.f36346a;
            if (w1Var != null) {
                AndroidUtilities.setScrollViewEdgeEffectColor(w1Var, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
            }
            if (this.f36347b != null) {
                for (int i10 = 0; i10 < this.f36347b.getChildCount(); i10++) {
                    View childAt = this.f36347b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.x30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setContainerHeight(int i10) {
        this.f36355y = i10;
        tg1 tg1Var = this.f36347b;
        if (tg1Var != null) {
            tg1Var.requestLayout();
        }
    }
}
