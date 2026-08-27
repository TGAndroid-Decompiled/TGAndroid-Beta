package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public class UsersSelectActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
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
    public org.telegram.ui.Components.a30 L;
    public int M;
    public int N;

    public org.telegram.ui.ActionBar.v1 f36288a;

    public pg1 f36289b;

    public gg.g f36290c;
    public org.telegram.ui.Components.zk0 d;

    public org.telegram.ui.Components.h00 f36291e;

    public org.telegram.ui.Components.i60 f36292f;
    public og1 h;

    public mg1 f36293n;

    public org.telegram.ui.Components.m10 f36294r;

    public FrameLayout.LayoutParams f36295s;
    public boolean v;

    public int f36296w;

    public int f36297x;

    public int f36298y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.J = new a0.h();
        this.K = new ArrayList();
        this.E = z10;
        this.F = i10;
        this.G = arrayList;
        this.f36297x = 0;
        this.C = true;
    }

    public static void U(UsersSelectActivity usersSelectActivity, Context context, View view, int i10) {
        long j10;
        UsersSelectActivity usersSelectActivity2;
        a0.h hVar = usersSelectActivity.J;
        if (view instanceof org.telegram.ui.Cells.d4) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            Object object = d4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j10 = -9223372036854775807L;
                int i11 = 4;
                if (usersSelectActivity.f36297x == 2) {
                    if (i10 == 1) {
                        j10 = -9223372036854775800L;
                        i11 = 1;
                    } else if (i10 == 2 && !usersSelectActivity.D) {
                        j10 = -9223372036854775799L;
                        i11 = 2;
                    } else if (i10 == (!usersSelectActivity.D ? 1 : 0) + 2) {
                        j10 = Long.MIN_VALUE;
                    } else {
                        i11 = 8;
                    }
                } else if (usersSelectActivity.E) {
                    if (i10 == 1) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        j10 = Long.MIN_VALUE;
                    } else if (i10 == 2) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i10 == 3) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        j10 = -9223372036854775806L;
                    } else if (i10 == 4) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        j10 = -9223372036854775805L;
                    } else {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        j10 = -9223372036854775804L;
                    }
                } else if (i10 == 1) {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    j10 = -9223372036854775803L;
                } else if (i10 == 2) {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    j10 = -9223372036854775802L;
                } else {
                    i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    j10 = -9223372036854775801L;
                }
                org.telegram.ui.Components.bp bpVar = d4Var.d;
                if (bpVar != null ? bpVar.f27188a.f26309q : d4Var.D) {
                    usersSelectActivity.F &= ~i11;
                } else {
                    usersSelectActivity.F |= i11;
                }
            } else if (object instanceof TLRPC.User) {
                j10 = ((TLRPC.User) object).f22527id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j10 = -chat.f22380id;
                if (usersSelectActivity.f36297x == 1 && !ChatObject.canUserDoAdminAction(chat, 13)) {
                    org.telegram.messenger.y1.r(R.string.NeedAdminRightForSetAutoDeleteTimer, org.telegram.ui.Components.mc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.f36289b.b((org.telegram.ui.Components.a30) hVar.f(j10));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z10 && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.f36296w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.f36296w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    ag.i1 i1Var = new ag.i1(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                    i1Var.f446s0 = usersSelectActivity.f36296w;
                    usersSelectActivity.showDialog(i1Var);
                    return;
                }
                usersSelectActivity2 = usersSelectActivity;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity2.I);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity2.I);
                }
                org.telegram.ui.Components.a30 a30Var = new org.telegram.ui.Components.a30(usersSelectActivity2.f36290c.getContext(), object);
                usersSelectActivity2.f36289b.a(a30Var, true);
                a30Var.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.Y();
            if (usersSelectActivity2.I || usersSelectActivity2.H) {
                AndroidUtilities.showKeyboard(usersSelectActivity2.f36290c);
            } else {
                d4Var.c(!z11, true);
            }
            if (usersSelectActivity2.f36290c.length() > 0) {
                usersSelectActivity2.f36290c.setText((CharSequence) null);
            }
        }
    }

    public final void W() {
        long j10;
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                Object object = d4Var.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    j10 = -9223372036854775800L;
                    switch (str.hashCode()) {
                        case -1716307998:
                            str.equals("archived");
                            j10 = -9223372036854775801L;
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                j10 = -9223372036854775806L;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                j10 = -9223372036854775807L;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                j10 = Long.MIN_VALUE;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case -268161860:
                            if (!str.equals("new_chats")) {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                j10 = -9223372036854775804L;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                j10 = -9223372036854775802L;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                j10 = -9223372036854775803L;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case 151051367:
                            if (!str.equals("existing_chats")) {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                j10 = -9223372036854775805L;
                            } else {
                                j10 = -9223372036854775801L;
                            }
                            break;
                        default:
                            j10 = -9223372036854775801L;
                            break;
                    }
                } else if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22527id;
                } else {
                    j10 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).f22380id : 0L;
                }
                if (j10 != 0) {
                    d4Var.c(this.J.h(j10) >= 0, true);
                    d4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void X() {
        a0.h hVar = this.J;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        mg1 mg1Var = this.f36293n;
        if (mg1Var != null) {
            mg1Var.a(this.F, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10 = this.f36297x;
        if (i10 == 0) {
            int i11 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i12 = this.f36296w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i11, new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.f36296w), Integer.valueOf(i11)));
                return;
            }
        }
        if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f36296w == 0) {
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
            int i13 = this.f36296w;
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
        this.I = false;
        this.H = false;
        this.K.clear();
        this.J.b();
        org.telegram.ui.ActionBar.c6 c6Var = null;
        this.L = null;
        int i11 = 1;
        if (this.f36297x == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.a5 a5Var = new org.telegram.ui.Components.a5(parentActivity);
            a5Var.f26629a = true;
            a5Var.f26630b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            a5Var.f26631c = j6Var;
            int i12 = org.telegram.ui.ActionBar.g6.A8;
            j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            j6Var.setTextSize(AndroidUtilities.dp(18.0f));
            j6Var.setGravity(3);
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            a5Var.addView(j6Var);
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            a5Var.d = j6Var2;
            j6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.B8));
            j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var2.setGravity(3);
            j6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            a5Var.addView(j6Var2);
            j6Var.getDrawable().D = true;
            j6Var2.getDrawable().D = true;
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
            j6Var.b(1.0f, 150L, erVar);
            j6Var2.b(1.0f, 150L, erVar);
            a5Var.setClipChildren(false);
            this.A = a5Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            kVar.addView(a5Var, h7.z5.d(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.f36297x;
        boolean z11 = this.E;
        if (i13 == 0 || i13 == 2) {
            if (z11) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i13 == 1) {
            Y();
        }
        this.actionBar.setActionBarMenuOnItemClick(new ed1(4, this));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 6);
        this.f36288a = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f36288a, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        fVar.addView(this.f36288a);
        pg1 pg1Var = new pg1(this, context);
        this.f36289b = pg1Var;
        this.f36288a.addView(pg1Var, h7.z5.c(-2.0f, -1));
        final int i14 = 0;
        this.f36289b.setOnClickListener(new View.OnClickListener(this) {

            public final UsersSelectActivity f39727b;

            {
                this.f39727b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f39727b;
                        usersSelectActivity.f36290c.clearFocus();
                        usersSelectActivity.f36290c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36290c);
                        break;
                    default:
                        this.f39727b.X();
                        break;
                }
            }
        });
        gg.g gVar = new gg.g(this, context, 10);
        this.f36290c = gVar;
        gVar.setTextSize(1, 16.0f);
        this.f36290c.setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xh, false));
        this.f36290c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f36290c.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yh, false));
        this.f36290c.setCursorWidth(1.5f);
        gg.g gVar2 = this.f36290c;
        gVar2.setInputType(gVar2.getInputType() | 176);
        this.f36290c.setSingleLine(true);
        this.f36290c.setBackgroundDrawable(null);
        this.f36290c.setVerticalScrollBarEnabled(false);
        this.f36290c.setHorizontalScrollBarEnabled(false);
        this.f36290c.setTextIsSelectable(false);
        this.f36290c.setPadding(0, 0, 0, 0);
        this.f36290c.setImeOptions(268435462);
        this.f36290c.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.f36289b.addView(this.f36290c);
        this.f36290c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.f36290c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(4));
        this.f36290c.setOnKeyListener(new h60(1, this));
        this.f36290c.addTextChangedListener(new lg1(this));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        this.f36291e = h00Var;
        h00Var.setViewType(10);
        org.telegram.ui.Components.h00 h00Var2 = this.f36291e;
        h00Var2.f28887w = false;
        h00Var2.setItemsCount(3);
        org.telegram.ui.Components.h00 h00Var3 = this.f36291e;
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        int i16 = org.telegram.ui.ActionBar.g6.f23144i6;
        h00Var3.f(i15, i16, i16);
        fVar.addView(this.f36291e);
        org.telegram.ui.Components.i60 i60Var = new org.telegram.ui.Components.i60(context, this.f36291e, i11, c6Var, 2);
        this.f36292f = i60Var;
        i60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f36292f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f36292f);
        f2.k0 k0Var = new f2.k0(1, false);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.d = zk0Var;
        zk0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f36292f);
        org.telegram.ui.Components.zk0 zk0Var2 = this.d;
        og1 og1Var = new og1(this, context);
        this.h = og1Var;
        zk0Var2.setAdapter(og1Var);
        this.d.setLayoutManager(k0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.d.i(new jh.j(8));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new cg.x0(24, this, context));
        this.d.setOnScrollListener(new ib1(this, 3));
        this.f36295s = org.telegram.ui.Components.m10.b();
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.f36294r = m10Var;
        m10Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.f36294r, this.f36295s);
        final int i17 = 1;
        this.f36294r.setOnClickListener(new View.OnClickListener(this) {

            public final UsersSelectActivity f39727b;

            {
                this.f39727b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f39727b;
                        usersSelectActivity.f36290c.clearFocus();
                        usersSelectActivity.f36290c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.f36290c);
                        break;
                    default:
                        this.f39727b.X();
                        break;
                }
            }
        });
        this.f36294r.setContentDescription(LocaleController.getString(R.string.Next));
        int i18 = z11 ? 5 : 3;
        for (int i19 = 1; i19 <= i18; i19++) {
            String str = "non_contacts";
            if (this.f36297x == 2) {
                if (i19 == 1) {
                    str = "existing_chats";
                    i10 = 1;
                } else if (i19 == 2 && !this.D) {
                    str = "new_chats";
                    i10 = 2;
                } else if (i19 == (!this.D ? 1 : 0) + 2) {
                    str = "contacts";
                    i10 = 4;
                } else {
                    i10 = 8;
                }
            } else if (z11) {
                if (i19 == 1) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i19 == 2) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i19 == 3) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i19 == 4) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i19 == 1) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i19 == 2) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i10 & this.F) != 0) {
                org.telegram.ui.Components.a30 a30Var = new org.telegram.ui.Components.a30(this.f36290c.getContext(), str);
                this.f36289b.a(a30Var, false);
                a30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.G;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                Long l10 = (Long) arrayList.get(i20);
                Object user = l10.longValue() > 0 ? getMessagesController().getUser(l10) : getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (user != null) {
                    org.telegram.ui.Components.a30 a30Var2 = new org.telegram.ui.Components.a30(this.f36290c.getContext(), user);
                    this.f36289b.a(a30Var2, false);
                    a30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.i60 i60Var = this.f36292f;
            if (i60Var != null) {
                i60Var.e(false, true);
            }
            og1 og1Var = this.h;
            if (og1Var != null) {
                og1Var.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.d.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt).f(iIntValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.f36298y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        sx0 sx0Var = new sx0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36288a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23199l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23216m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23235n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36292f, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36290c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36290c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36290c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23145i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23163j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.d4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.S7));
        int i12 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36289b, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36289b, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36289b, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36289b, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view;
        if (!a30Var.f26618y) {
            org.telegram.ui.Components.a30 a30Var2 = this.L;
            if (a30Var2 != null) {
                a30Var2.a();
            }
            this.L = a30Var;
            a30Var.b();
            return;
        }
        this.L = null;
        this.f36289b.b(a30Var);
        if (this.f36297x == 2) {
            if (a30Var.getUid() == -9223372036854775800L) {
                this.F &= -2;
            } else if (a30Var.getUid() == -9223372036854775799L) {
                this.F &= -3;
            } else if (a30Var.getUid() == Long.MIN_VALUE) {
                this.F &= -5;
            } else if (a30Var.getUid() == -9223372036854775807L) {
                this.F &= -9;
            }
        } else if (a30Var.getUid() == Long.MIN_VALUE) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (a30Var.getUid() == -9223372036854775807L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (a30Var.getUid() == -9223372036854775806L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (a30Var.getUid() == -9223372036854775805L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (a30Var.getUid() == -9223372036854775804L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (a30Var.getUid() == -9223372036854775803L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (a30Var.getUid() == -9223372036854775802L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (a30Var.getUid() == -9223372036854775801L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        Y();
        W();
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
        gg.g gVar = this.f36290c;
        if (gVar != null) {
            gVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.f36298y = i10;
        pg1 pg1Var = this.f36289b;
        if (pg1Var != null) {
            pg1Var.requestLayout();
        }
    }
}
