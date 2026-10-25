package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class ContactsActivity extends org.telegram.ui.ActionBar.r2 implements oe.d, NotificationCenter.NotificationCenterDelegate, og0, rh.d {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public long Q;
    public long R;
    public String S;
    public boolean T;
    public rs U;
    public String V;
    public org.telegram.ui.ActionBar.e2 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final oe.e f35452a;
    public org.telegram.ui.ActionBar.y5 f35453a0;
    public os f35454b;
    public String f35455b0;
    public org.telegram.ui.Components.ey0 f35456c;
    public boolean f35457c0;
    public org.telegram.ui.Components.mm0 d;
    public long f35458d0;
    public org.telegram.ui.Components.pl0 e;
    public ViewPropertyAnimator f35459e0;
    public s4.c0 f35460f;
    public boolean f35461f0;
    public final y5 f35462g0;
    public ns h;
    public int f35463h0;
    public int f35464i0;
    public float f35465j0;
    public int f35466k0;
    public int f35467l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.y5 f35468n;
    public boolean f35469n0;
    public int phonebookRow;
    public boolean f35470r;
    public org.telegram.ui.Components.j20 f35471s;
    public boolean v;
    public a9 f35472w;
    public boolean f35473x;
    public boolean f35474y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f35452a = new oe.e(0, this, org.telegram.ui.Components.ds.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.v = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.S = null;
        this.T = true;
        this.X = true;
        this.Z = new a0.h();
        this.f35457c0 = true;
        this.f35462g0 = new y5(this, 2);
    }

    public static void V(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void W(ContactsActivity contactsActivity, int i10) {
        boolean z10;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.X = z10;
        if (i10 == 0) {
            return;
        }
        contactsActivity.d0(false);
    }

    public static void X(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new oj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void Y(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.Z;
        s4.h0 adapter = contactsActivity.d.getAdapter();
        ns nsVar = contactsActivity.h;
        if (adapter == nsVar) {
            nsVar.getClass();
            Object E = contactsActivity.h.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.m6)) {
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                if (m6Var.getUser() != null && m6Var.getUser().contact) {
                    contactsActivity.l0(m6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ns nsVar2 = contactsActivity.h;
                int size = nsVar2.d.size();
                int size2 = nsVar2.H.size();
                ig.a2 a2Var = nsVar2.f14252f;
                int size3 = a2Var.e.size();
                int size4 = a2Var.f13994j.size();
                if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (contactsActivity.I) {
                    contactsActivity.h0(user, true, null);
                    return;
                } else if (contactsActivity.J) {
                    if (user.f22174id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.K = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22174id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new un(bundle), contactsActivity.O);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    oj0 oj0Var = new oj0(contactsActivity.getParentActivity(), contactsActivity);
                    oj0Var.w(str2, true);
                    oj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.g5.u(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f35454b.getClass();
        int S = contactsActivity.f35454b.S(i11);
        int Q = contactsActivity.f35454b.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.dr)) {
                org.telegram.ui.Components.j20 j20Var = contactsActivity.f35471s;
                if (j20Var != null) {
                    j20Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.ab)) {
                contactsActivity.l0((org.telegram.ui.Cells.ab) view);
            } else if ((!contactsActivity.E || i10 != 0) && S == 0) {
                if (contactsActivity.F) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new w70());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new o9(null));
                    }
                } else if (i10 != 0) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j10 = contactsActivity.R;
                        if (j10 == 0) {
                            j10 = contactsActivity.Q;
                        }
                        ?? r2Var = new org.telegram.ui.ActionBar.r2(null);
                        r2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new r60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")));
                        return;
                    }
                    contactsActivity.presentFragment(new g(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f35454b.O(contactsActivity.f35454b.S(i11), contactsActivity.f35454b.Q(i11));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.I) {
                        contactsActivity.h0(user2, true, null);
                    } else if (contactsActivity.J) {
                        contactsActivity.K = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f22174id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new un(bundle2), contactsActivity.O);
                        }
                    }
                } else if (O instanceof ContactsController.Contact) {
                    ContactsController.Contact contact2 = (ContactsController.Contact) O;
                    if (!contact2.phones.isEmpty()) {
                        str = contact2.phones.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.voip.k1(4, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f22366a);
                    }
                }
            }
        }
    }

    public static void c0(ContactsActivity contactsActivity) {
        os osVar;
        boolean z10;
        org.telegram.ui.Components.j20 j20Var = contactsActivity.f35471s;
        if (j20Var != null && (osVar = contactsActivity.f35454b) != null) {
            if (contactsActivity.v && !contactsActivity.f35474y && !osVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            j20Var.e(z10, true);
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            os osVar = this.f35454b;
            ArrayList arrayList = osVar.N;
            osVar.L = f7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Cells.v4) arrayList.get(i11)).setLetterProgress(f7);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final View O() {
        return this.fragmentView;
    }

    @Override
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.getFastScroll() != null && this.d.getFastScroll().f32638n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23578p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23374e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23518m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23746y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        this.f35474y = false;
        this.f35473x = false;
        if (this.H) {
            if (this.I) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
                if (this.J) {
                    i12 = R.string.NewSecretChat;
                } else {
                    i12 = R.string.NewMessageTitle;
                }
                r5Var.setTitle(LocaleController.getString(i12));
            }
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        if (!this.G) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        }
        this.simpleActionBar.h().c(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 20));
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, R.drawable.outline_header_search);
        this.f35453a0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        org.telegram.ui.ActionBar.y5 y5Var = this.f35453a0;
        y5Var.N();
        y5Var.f23289z0 = new jg.e2(this, 8);
        if (!this.J && !this.I) {
            if (this.f35470r) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.y5 a10 = j10.a(1, i11);
            this.f35468n = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.d = new org.telegram.ui.Components.mm0(context, null);
        this.h = new ns(this, context, this.Z, this.T, this.M, this.L);
        int i13 = 2;
        if (this.R != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.R)), 3) ? 1 : 0;
        } else {
            if (this.Q != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Q));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        os osVar = new os(this, context, this.E ? 1 : 0, this.F, this.Z, i10);
        this.f35454b = osVar;
        if (this.f35468n != null) {
            if (this.f35470r) {
                i13 = 1;
            }
        } else {
            i13 = 0;
        }
        osVar.Y(i13, false);
        os osVar2 = this.f35454b;
        osVar2.M = 17.0f;
        osVar2.H = this.Y;
        a9 a9Var = new a9(this, context, 3);
        this.f35472w = a9Var;
        this.fragmentView = a9Var;
        this.d.u1();
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23297a7, this.f35472w, getResourceProvider());
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(29);
        c10Var.f27029w = false;
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, c10Var, 1, null);
        this.f35456c = ey0Var;
        ey0Var.addView(c10Var, 0);
        this.f35456c.setAnimateLayoutChange(true);
        this.f35456c.e(true, false);
        this.f35456c.d.setText(LocaleController.getString(R.string.NoResult));
        this.f35456c.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f35472w.addView(this.f35456c, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        s4.l lVar = new s4.l();
        lVar.C = false;
        lVar.n(150L);
        lVar.f47760m = false;
        this.d.setItemAnimator(lVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f35460f = c0Var;
        mm0Var.setLayoutManager(c0Var);
        this.d.setAdapter(this.f35454b);
        this.d.setClipToPadding(false);
        this.e = new org.telegram.ui.Components.pl0(this.d, this.f35460f);
        this.f35472w.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.d.setEmptyView(this.f35456c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.d;
        mm0Var2.W1 = true;
        mm0Var2.X1 = 0;
        mm0Var2.setOnItemClickListener(new i2.r(this, i10, 10));
        this.d.setOnItemLongClickListener(new ms(this));
        this.d.setOnScrollListener(new ps(this));
        if (!this.J && !this.I) {
            org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
            this.f35471s = j20Var;
            this.f35472w.addView(j20Var, org.telegram.ui.Components.j20.b());
            this.f35471s.setOnClickListener(new a(this, 15));
            this.f35471s.f29455c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f35471s.f29455c.getAnimatedDrawable().M(this.f35471s.f29455c.getAnimatedDrawable().e[0] - 1);
            this.f35471s.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.V;
        if (str != null) {
            org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
            if (r5Var2.r(true, false)) {
                r5Var2.setSearchFieldText(str);
            }
            this.V = null;
        }
        g0();
        setBulletinDelegate(new d9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35535h1.d.add(this);
        }
        View view = this.fragmentView;
        ms msVar = new ms(this);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(view, msVar);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.X) {
                showDialog(org.telegram.ui.Components.g5.v(parentActivity, new ks(this, 1)).f22366a);
                return;
            }
            this.f35458d0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.mm0 mm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            os osVar = this.f35454b;
            if (osVar != null) {
                if (!this.f35470r) {
                    osVar.Y(2, true);
                }
                this.f35454b.l();
            }
            if (this.h != null) {
                s4.h0 adapter = this.d.getAdapter();
                ns nsVar = this.h;
                if (adapter == nsVar) {
                    nsVar.G(this.f35455b0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (mm0Var = this.d) != null) {
                int childCount = mm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.ab) {
                        ((org.telegram.ui.Cells.ab) childAt).i(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.f35470r && this.f35454b != null && !this.f35461f0) {
                this.f35461f0 = true;
                y5 y5Var = this.f35462g0;
                AndroidUtilities.cancelRunOnUIThread(y5Var);
                AndroidUtilities.runOnUIThread(y5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.J && this.K) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f22035id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new un(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.K) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return !this.G;
    }

    public final void e0() {
        org.telegram.ui.Components.ey0 ey0Var = this.f35456c;
        if (ey0Var != null) {
            ey0Var.b(Math.max(this.f35466k0 + this.f35463h0, this.f35467l0), false);
        }
    }

    public final void f0() {
        org.telegram.ui.Components.j20 j20Var = this.f35471s;
        if (j20Var != null) {
            j20Var.setTranslationY(((-this.f35466k0) - this.f35464i0) - this.f35465j0);
        }
    }

    public final void g0() {
        boolean z10;
        int i10;
        os osVar = this.f35454b;
        if (osVar != null && osVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.m0 == z10 && this.f35469n0) {
            return;
        }
        org.telegram.ui.ActionBar.y5 y5Var = this.f35453a0;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        y5Var.setSearchFieldHint(LocaleController.getString(i10));
        this.m0 = z10;
        this.f35469n0 = true;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(6, this);
        if (!this.G) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23634s8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23501l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23519m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23539n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23538n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 262148, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23558o6));
        org.telegram.ui.Components.j20 j20Var = this.f35471s;
        if (j20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(j20Var.f29455c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35471s.f29455c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q9));
        }
        return arrayList;
    }

    public final void h0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.S != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.wc.b0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (this.Q != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Q));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                        if (canAddAdmins) {
                            e2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            e2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.voip.k1(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            e2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(e2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22366a;
                e2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.S, UserObject.getUserName(user));
                if (!user.bot && this.N) {
                    formatStringSimple = a1.g.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23462j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.y6.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new qs(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                e2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new e7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(e2Var2);
                if (editTextBoldCursor != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                        }
                        int dp = AndroidUtilities.dp(24.0f);
                        marginLayoutParams.leftMargin = dp;
                        marginLayoutParams.rightMargin = dp;
                        marginLayoutParams.height = AndroidUtilities.dp(36.0f);
                        editTextBoldCursor.setLayoutParams(marginLayoutParams);
                    }
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    return;
                }
                return;
            }
            return;
        }
        rs rsVar = this.U;
        if (rsVar != null) {
            rsVar.b(user);
            if (this.P) {
                this.U = null;
            }
        }
        if (this.O) {
            finishFragment();
        }
    }

    public final void i0() {
        this.simpleActionBar.n();
        int childCount = this.d.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i10 < childCount) {
                View childAt = this.d.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.ab) {
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                    if (hVar.h(abVar.getDialogId()) >= 0) {
                        abVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    if (hVar.h(m6Var.getDialogId()) >= 0) {
                        m6Var.r(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                return;
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(bi.z3 z3Var) {
        this.U = z3Var;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.f35467l0 = k1Var.f47115a.f(8).d;
        e0();
    }

    public final void k0(String str) {
        this.V = str;
    }

    public final void l0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.ab;
        boolean z12 = true;
        a0.h hVar = this.Z;
        if (z11) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) viewGroup;
            long dialogId = abVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                abVar.c(false, true);
            } else if (abVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) abVar.getCurrentObject(), dialogId);
                abVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.m6) {
            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) viewGroup;
            long dialogId2 = m6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                m6Var.r(false, true);
            } else if (m6Var.getUser() != null) {
                hVar.k(m6Var.getUser(), dialogId2);
                m6Var.r(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.simpleActionBar.o()) {
            if (hVar.i()) {
                i0();
                return;
            }
        } else {
            if (z10) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
                this.simpleActionBar.t(hVar.m(), false);
                this.simpleActionBar.x();
            }
            z12 = false;
        }
        this.simpleActionBar.t(hVar.m(), z12);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.o()) {
            if (z10) {
                i0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            if (r5Var.F) {
                if (z10) {
                    r5Var.f(true);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (this.f35457c0 && (parentActivity = getParentActivity()) != null) {
            this.f35457c0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(parentActivity, new ks(this, 0)).f22366a;
                    this.W = e2Var;
                    showDialog(e2Var);
                    return;
                }
                d0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.e2 e2Var = this.W;
        if (e2Var != null && dialog == e2Var && getParentActivity() != null && this.X) {
            d0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.f35457c0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.E = bundle.getBoolean("onlyUsers", false);
            this.H = this.arguments.getBoolean("destroyAfterSelect", false);
            this.I = this.arguments.getBoolean("returnAsResult", false);
            this.J = this.arguments.getBoolean("createSecretChat", false);
            this.S = this.arguments.getString("selectAlertString");
            this.T = this.arguments.getBoolean("allowUsernameSearch", true);
            this.N = this.arguments.getBoolean("needForwardCount", true);
            this.M = this.arguments.getBoolean("allowBots", true);
            this.L = this.arguments.getBoolean("allowSelf", true);
            this.Q = this.arguments.getLong("channelId", 0L);
            this.O = this.arguments.getBoolean("needFinishFragment", true);
            this.R = this.arguments.getLong("chat_id", 0L);
            this.Y = this.arguments.getBoolean("disableSections", false);
            this.P = this.arguments.getBoolean("resetDelegate", false);
            this.F = this.arguments.getBoolean("needPhonebook", false);
            this.G = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.F = true;
        }
        if (!this.J && !this.I) {
            this.f35470r = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        if (this.G) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f35463h0 = i10;
        if (this.G) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f35464i0 = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.U = null;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35466k0 = i13;
        oi.a.d(this.d, i11, i13, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f35463h0);
        f0();
        e0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.f(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.X = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f35458d0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        os osVar = this.f35454b;
        if (osVar != null) {
            osVar.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.mm0 mm0Var = this.d;
                if (mm0Var != null) {
                    mm0Var.A1();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void s() {
        if (this.f35460f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.pl0 pl0Var = this.e;
        pl0Var.f31595b = 1;
        pl0Var.c(0, 0, false, false);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final hh.d y() {
        return null;
    }

    @Override
    public final void D() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
