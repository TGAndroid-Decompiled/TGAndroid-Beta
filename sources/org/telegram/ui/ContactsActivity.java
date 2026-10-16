package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
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
import org.telegram.ui.Components.NumberTextView;
public class ContactsActivity extends org.telegram.ui.ActionBar.m2 implements ne.d, NotificationCenter.NotificationCenterDelegate, ih0, qh.d {
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
    public boolean Q;
    public boolean R;
    public long S;
    public long T;
    public String U;
    public boolean V;
    public ht W;
    public String X;
    public di.p6 Y;
    public org.telegram.ui.Components.o20 Z;
    public final int f31725a;
    public org.telegram.ui.ActionBar.a2 f31726a0;
    public final ne.b f31727b;
    public boolean f31728b0;
    public final ne.b f31729c;
    public boolean f31730c0;
    public et d;
    public final a0.h f31731d0;
    public org.telegram.ui.Components.wx0 e;
    public ImageView f31732e0;
    public org.telegram.ui.Components.mm0 f31733f;
    public NumberTextView f31734f0;
    public org.telegram.ui.ActionBar.u0 f31735g0;
    public org.telegram.ui.Components.pl0 h;
    public org.telegram.ui.ActionBar.f2 f31736h0;
    public String f31737i0;
    public boolean f31738j0;
    public long f31739k0;
    public boolean f31740l0;
    public final a6 m0;
    public s4.b0 f31741n;
    public int f31742n0;
    public int f31743o0;
    public float f31744p0;
    public int phonebookRow;
    public int f31745q0;
    public dt f31746r;
    public int f31747r0;
    public org.telegram.ui.ActionBar.u0 f31748s;
    public boolean f31749s0;
    public final bh.f f31750t0;
    public final gh.d f31751u0;
    public boolean v;
    public final gh.d f31752v0;
    public org.telegram.ui.Components.l20 f31753w;
    public bh.l f31754w0;
    public boolean f31755x;
    public final ArrayList f31756x0;
    public z8 f31757y;
    public final RectF f31758y0;
    public final RectF f31759z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f31725a = i10;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.f31727b = new ne.b(0, this, esVar, 350L, false);
        this.f31729c = new ne.b(2, this, esVar, 350L, false);
        this.phonebookRow = 0;
        this.f31755x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f31728b0 = true;
        this.f31731d0 = new a0.h();
        this.f31738j0 = true;
        this.m0 = new a6(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f31756x0 = arrayList;
        RectF rectF = new RectF();
        this.f31758y0 = rectF;
        RectF rectF2 = new RectF();
        this.f31759z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f31750t0 = new bh.f(false);
            this.f31751u0 = new gh.d(null);
            this.f31752v0 = new gh.d(null);
            return;
        }
        this.f31750t0 = null;
        this.f31751u0 = null;
        this.f31752v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.f31731d0;
        s4.g0 adapter = contactsActivity.f31733f.getAdapter();
        dt dtVar = contactsActivity.f31746r;
        if (adapter == dtVar) {
            dtVar.getClass();
            Object E = contactsActivity.f31746r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() != null && i6Var.getUser().contact) {
                    contactsActivity.r0(i6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                dt dtVar2 = contactsActivity.f31746r;
                int size = dtVar2.d.size();
                int size2 = dtVar2.H.size();
                hg.a2 a2Var = dtVar2.f10752f;
                int size3 = a2Var.e.size();
                int size4 = a2Var.f10494j.size();
                if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (contactsActivity.K) {
                    contactsActivity.n0(user, true, null);
                    return;
                } else if (contactsActivity.L) {
                    if (user.f19063id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19063id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new fo(bundle), contactsActivity.Q);
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
                    hk0 hk0Var = new hk0(contactsActivity.getParentActivity(), contactsActivity);
                    hk0Var.x(str2, true);
                    hk0Var.show();
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
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.fr)) {
                org.telegram.ui.Components.l20 l20Var = contactsActivity.f31753w;
                if (l20Var != null) {
                    l20Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.xa)) {
                contactsActivity.r0((org.telegram.ui.Cells.xa) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new p80());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new n9(null));
                    }
                } else if (i10 != 0) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j10 = contactsActivity.T;
                        if (j10 == 0) {
                            j10 = contactsActivity.S;
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                        m2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new j70(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new sd(org.telegram.ui.Cells.c1.f(0, "step")));
                        return;
                    }
                    contactsActivity.presentFragment(new h(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.K) {
                        contactsActivity.n0(user2, true, null);
                    } else if (contactsActivity.L) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f19063id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new fo(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.u2(25, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f19248a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.mm0 mm0Var = contactsActivity.f31733f;
        if (mm0Var != null) {
            int childCount = mm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f31733f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.xa) {
                    ((org.telegram.ui.Cells.xa) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) childAt).v(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f31732e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f31732e0.setBackground(org.telegram.ui.ActionBar.g6.g0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f20007z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.d();
        }
        z8 z8Var = contactsActivity.f31757y;
        if (z8Var != null) {
            z8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
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
        contactsActivity.f31728b0 = z10;
        if (i10 == 0) {
            return;
        }
        contactsActivity.f0(false);
    }

    public static void X(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new hk0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f31733f.getY() + contactsActivity.f31733f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f31733f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f31733f.getChildAt(i11);
            contactsActivity.f31733f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.m0 X = contactsActivity.f31733f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.mm0 mm0Var = contactsActivity.f31733f;
                X.a(rect, childAt, mm0Var, mm0Var.f2017u0);
                float y10 = contactsActivity.f31733f.getY();
                float y11 = childAt.getY();
                if (contactsActivity.d.K) {
                    i10 = 0;
                } else {
                    i10 = rect.top;
                }
                y3 = y10 + (y11 - i10);
            } else if (R > 0) {
                y3 = -AndroidUtilities.dp(52.0f);
                break;
            } else {
                i11++;
            }
        }
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f31733f.getY() + contactsActivity.f31733f.getPaddingTop(), contactsActivity.f31729c.e) - AndroidUtilities.dp(48.0f));
        ne.b bVar = contactsActivity.f31727b;
        if (y3 > (contactsActivity.f31733f.getY() + contactsActivity.f31733f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        et etVar;
        boolean z10;
        org.telegram.ui.Components.l20 l20Var = contactsActivity.f31753w;
        if (l20Var != null && (etVar = contactsActivity.d) != null) {
            if (contactsActivity.f31755x && !contactsActivity.F && !etVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            l20Var.e(z10, true);
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.mm0 mm0Var = this.f31733f;
        if (mm0Var != null && mm0Var.getFastScroll() != null && this.f31733f.getFastScroll().f29139n) {
            return false;
        }
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.L();
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        this.F = false;
        this.E = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.J) {
            if (this.K) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (this.L) {
                    i12 = R.string.NewSecretChat;
                } else {
                    i12 = R.string.NewMessageTitle;
                }
                kVar.setTitle(LocaleController.getString(i12));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f31736h0 = f2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(f2Var);
        }
        org.telegram.ui.Components.o20 o20Var = new org.telegram.ui.Components.o20(context, this.resourceProvider);
        this.Z = o20Var;
        o20Var.f27512w = true;
        o20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        o20Var.d();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f31732e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f31732e0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.f31732e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8), PorterDuff.Mode.MULTIPLY));
            this.f31732e0.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f20007z8), 1, -1));
            this.f31732e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f34082b;

                {
                    this.f34082b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f34082b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f34082b);
                            return;
                    }
                }
            });
            j10.addView(this.f31732e0, w7.z5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f31734f0 = numberTextView;
        int i13 = 18;
        numberTextView.setTextSize(18);
        this.f31734f0.setTypeface(AndroidUtilities.bold());
        this.f31734f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8));
        NumberTextView numberTextView2 = this.f31734f0;
        if (!this.I) {
            i13 = 72;
        }
        j10.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i13, 0, 0));
        int i14 = 2;
        this.f31734f0.setOnTouchListener(new ci.d(2));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ct(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f31735g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        di.g2 g2Var = this.Z.f27510r;
        g2Var.addTextChangedListener(new zf.h0(g2Var, new ig.d2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.u0 a10 = n10.a(1, i11);
            this.f31748s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f31733f = new org.telegram.ui.Components.mm0(context, null);
        this.f31746r = new dt(this, context, this.f31731d0, this.V, this.O, this.N);
        if (this.T != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.T)), 3) ? 1 : 0;
        } else {
            if (this.S != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        et etVar = new et(this, context, this.G ? 1 : 0, this.H, this.f31731d0, i10);
        this.d = etVar;
        if (this.f31748s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        etVar.Y(i14, false);
        this.d.H = this.f31730c0;
        z8 z8Var = new z8(this, context, 3);
        this.f31757y = z8Var;
        this.fragmentView = z8Var;
        org.telegram.ui.Components.mm0 mm0Var = this.f31733f;
        Objects.requireNonNull(mm0Var);
        this.f31754w0 = new bh.l(mm0Var, z8Var, new bt(mm0Var, 0));
        this.f31733f.C0(new ys(this, 1));
        this.f31733f.setSections(true);
        this.f31757y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(29);
        f10Var.f24549w = false;
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, f10Var, 1, null);
        this.e = wx0Var;
        wx0Var.addView(f10Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f31757y.addView(this.e, w7.z5.a(-1.0f, 12.0f, 64.0f, 12.0f, 0.0f, -1, 119));
        s4.k kVar2 = new s4.k();
        kVar2.C = false;
        kVar2.n(150L);
        kVar2.f44872m = false;
        this.f31733f.setItemAnimator(kVar2);
        this.f31733f.setSectionsType(1);
        this.f31733f.setVerticalScrollBarEnabled(false);
        this.f31733f.setFastScrollEnabled(0);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f31733f;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f31741n = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        this.f31733f.setAdapter(this.d);
        this.f31733f.setClipToPadding(false);
        org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(this.f31733f, this.f31741n);
        this.h = pl0Var;
        pl0Var.h = new zs(this);
        z8 z8Var2 = this.f31757y;
        org.telegram.ui.Components.mm0 mm0Var3 = this.f31733f;
        float f7 = -this.f31725a;
        z8Var2.addView(mm0Var3, w7.z5.a(-1.0f, 0.0f, f7, 0.0f, f7, -1, 3));
        this.f31757y.addView(this.Z, w7.z5.a(52.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        this.f31733f.setEmptyView(this.e);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f31733f;
        mm0Var4.W1 = true;
        mm0Var4.X1 = 0;
        mm0Var4.setOnItemClickListener(new i2.r(this, i10, 10));
        this.f31733f.setOnItemLongClickListener(new zs(this));
        this.f31733f.setOnScrollListener(new ft(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, this.resourceProvider, false);
            this.f31753w = l20Var;
            this.f31757y.addView(l20Var, org.telegram.ui.Components.l20.b());
            this.f31753w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f34082b;

                {
                    this.f34082b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f34082b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f34082b);
                            return;
                    }
                }
            });
            this.f31753w.f26585c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f31753w.f26585c.getAnimatedDrawable().M(this.f31753w.f26585c.getAnimatedDrawable().e[0] - 1);
            this.f31753w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.y(str);
            this.X = null;
        }
        this.f31757y.addView(this.actionBar);
        di.p6 p6Var = new di.p6(context, this.parentLayout);
        this.Y = p6Var;
        p6Var.b(false, false);
        this.f31757y.addView(this.Y, w7.z5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f31733f);
        this.actionBar.setDrawBlurBackground(this.f31757y);
        this.f31727b.a(true, false);
        l0();
        setBulletinDelegate(new c9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31818g1.d.add(this);
        }
        View view = this.fragmentView;
        zs zsVar = new zs(this);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(view, zsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.mm0 mm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            et etVar = this.d;
            if (etVar != null) {
                if (!this.v) {
                    etVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f31746r != null) {
                s4.g0 adapter = this.f31733f.getAdapter();
                dt dtVar = this.f31746r;
                if (adapter == dtVar) {
                    dtVar.G(this.f31737i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (mm0Var = this.f31733f) != null) {
                int childCount = mm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f31733f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.xa) {
                        ((org.telegram.ui.Cells.xa) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f31740l0) {
                this.f31740l0 = true;
                a6 a6Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f18924id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new fo(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f31728b0) {
                showDialog(org.telegram.ui.Components.g5.v(parentActivity, new xs(this, 1)).f19248a);
                return;
            }
            this.f31739k0 = SystemClock.elapsedRealtime();
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

    public final void g0() {
        bh.f fVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f31750t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f31745q0) - AndroidUtilities.dp(8.0f);
            this.f31758y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f31759z0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.I) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f31756x0);
            fVar.e(this.f31754w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19746l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19765m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19785n7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f19988y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f19784n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19804o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19764m6));
        org.telegram.ui.Components.l20 l20Var = this.f31753w;
        if (l20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(l20Var.f26585c, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31753w.f26585c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31753w.f26585c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19685i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19632f1}, null, org.telegram.ui.ActionBar.g6.f20008z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.f19821p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31733f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.wx0 wx0Var = this.e;
        if (wx0Var != null) {
            wx0Var.b(Math.max(this.f31745q0 + this.f31742n0, this.f31747r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.l20 l20Var = this.f31753w;
        if (l20Var != null) {
            l20Var.setTranslationY(((-this.f31745q0) - this.f31743o0) - this.f31744p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.mm0 mm0Var = this.f31733f;
        int i10 = this.f31725a;
        mm0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f31745q0 + this.f31742n0);
    }

    @Override
    public final void k(r0.l1 l1Var) {
        this.f31747r0 = l1Var.f43497a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.l20.d(this.f31735g0, (1.0f - this.f31729c.e) * (1.0f - this.f31727b.e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        et etVar = this.d;
        if (etVar != null && etVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f31749s0 == z10 && !TextUtils.isEmpty(this.Z.f27510r.getHint())) {
            return;
        }
        di.g2 g2Var = this.Z.f27510r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        g2Var.setHint(LocaleController.getString(i10));
        di.g2 g2Var2 = this.Z.f27510r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        g2Var2.setContentDescription(LocaleController.getString(i11));
        this.f31749s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f31729c.e;
        et etVar = this.d;
        org.telegram.ui.Components.l20.d(this.f31748s, f10 * ((etVar == null || etVar.I) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.U != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.zc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (this.S != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        if (canAddAdmins) {
                            a2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            a2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.u2(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            a2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(a2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
                a2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a1.g.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19707j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.g6.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new gt(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                a2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new f7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(a2Var2);
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
        ht htVar = this.W;
        if (htVar != null) {
            htVar.b(user);
            if (this.R) {
                this.W = null;
            }
        }
        if (this.Q) {
            finishFragment();
        }
    }

    public final void o0() {
        this.actionBar.s();
        int childCount = this.f31733f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.f31731d0;
            if (i10 < childCount) {
                View childAt = this.f31733f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.xa) {
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) childAt;
                    if (hVar.h(xaVar.getDialogId()) >= 0) {
                        xaVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (hVar.h(i6Var.getDialogId()) >= 0) {
                        i6Var.t(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                this.f31736h0.c(0.0f, true);
                return;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.t()) {
            if (z10) {
                o0();
                return false;
            }
        } else if (this.f31729c.f16004f) {
            if (z10) {
                this.Z.f27510r.getText().clear();
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (this.f31738j0 && (parentActivity = getParentActivity()) != null) {
            this.f31738j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(parentActivity, new xs(this, 0)).f19248a;
                    this.f31726a0 = a2Var;
                    showDialog(a2Var);
                    return;
                }
                f0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.a2 a2Var = this.f31726a0;
        if (a2Var != null && dialog == a2Var && getParentActivity() != null && this.f31728b0) {
            f0(false);
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
        this.f31738j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.G = bundle.getBoolean("onlyUsers", false);
            this.J = this.arguments.getBoolean("destroyAfterSelect", false);
            this.K = this.arguments.getBoolean("returnAsResult", false);
            this.L = this.arguments.getBoolean("createSecretChat", false);
            this.U = this.arguments.getString("selectAlertString");
            this.V = this.arguments.getBoolean("allowUsernameSearch", true);
            this.P = this.arguments.getBoolean("needForwardCount", true);
            this.O = this.arguments.getBoolean("allowBots", true);
            this.N = this.arguments.getBoolean("allowSelf", true);
            this.S = this.arguments.getLong("channelId", 0L);
            this.Q = this.arguments.getBoolean("needFinishFragment", true);
            this.T = this.arguments.getLong("chat_id", 0L);
            this.f31730c0 = this.arguments.getBoolean("disableSections", false);
            this.R = this.arguments.getBoolean("resetDelegate", false);
            this.H = this.arguments.getBoolean("needPhonebook", false);
            this.I = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.H = true;
        }
        if (!this.L && !this.K) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        if (this.I) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f31742n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f31743o0 = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.W = null;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31745q0 = i13;
        j0();
        i0();
        h0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
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
                    this.f31728b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f31739k0 < 200) {
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
        et etVar = this.d;
        if (etVar != null) {
            etVar.l();
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
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    public final void p0(com.google.firebase.messaging.i iVar) {
        this.W = iVar;
    }

    public final void q0(String str) {
        this.X = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.xa;
        boolean z12 = false;
        a0.h hVar = this.f31731d0;
        if (z11) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) viewGroup;
            long dialogId = xaVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                xaVar.c(false, true);
            } else if (xaVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) xaVar.getCurrentObject(), dialogId);
                xaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.i6) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) viewGroup;
            long dialogId2 = i6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                i6Var.t(false, true);
            } else if (i6Var.getUser() != null) {
                hVar.k(i6Var.getUser(), dialogId2);
                i6Var.t(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.actionBar.t()) {
            if (hVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.f31736h0.c(1.0f, true);
        }
        this.f31734f0.a(hVar.m(), z12);
    }

    @Override
    public final void t() {
        if (this.f31741n.L0() < 15) {
            this.f31733f.x0(0);
        } else {
            org.telegram.ui.Components.pl0 pl0Var = this.h;
            pl0Var.f28051b = 1;
            pl0Var.d(0, 0, false, false);
        }
        this.f31727b.a(true, true);
    }

    @Override
    public final gh.d z() {
        return this.f31752v0;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
