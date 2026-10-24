package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
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
public class ContactsActivity extends org.telegram.ui.ActionBar.o2 implements ne.d, NotificationCenter.NotificationCenterDelegate, pg0, qh.d {
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
    public ts W;
    public String X;
    public ei.g6 Y;
    public org.telegram.ui.Components.i20 Z;
    public final int f33379a;
    public org.telegram.ui.ActionBar.c2 f33380a0;
    public final ne.b f33381b;
    public boolean f33382b0;
    public final ne.b f33383c;
    public boolean f33384c0;
    public qs d;
    public final a0.h f33385d0;
    public org.telegram.ui.Components.vx0 e;
    public ImageView f33386e0;
    public org.telegram.ui.Components.lm0 f33387f;
    public NumberTextView f33388f0;
    public org.telegram.ui.ActionBar.u0 f33389g0;
    public org.telegram.ui.Components.ol0 h;
    public org.telegram.ui.ActionBar.h2 f33390h0;
    public String f33391i0;
    public boolean f33392j0;
    public long f33393k0;
    public boolean f33394l0;
    public final z5 m0;
    public s4.b0 f33395n;
    public int f33396n0;
    public int f33397o0;
    public float f33398p0;
    public int phonebookRow;
    public int f33399q0;
    public ps f33400r;
    public int f33401r0;
    public org.telegram.ui.ActionBar.u0 f33402s;
    public boolean f33403s0;
    public final bh.f f33404t0;
    public final gh.d f33405u0;
    public boolean v;
    public final gh.d f33406v0;
    public org.telegram.ui.Components.f20 f33407w;
    public bh.l f33408w0;
    public boolean f33409x;
    public final ArrayList f33410x0;
    public y8 f33411y;
    public final RectF f33412y0;
    public final RectF f33413z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33379a = i10;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.f33381b = new ne.b(0, this, zrVar, 350L, false);
        this.f33383c = new ne.b(2, this, zrVar, 350L, false);
        this.phonebookRow = 0;
        this.f33409x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f33382b0 = true;
        this.f33385d0 = new a0.h();
        this.f33392j0 = true;
        this.m0 = new z5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f33410x0 = arrayList;
        RectF rectF = new RectF();
        this.f33412y0 = rectF;
        RectF rectF2 = new RectF();
        this.f33413z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f33404t0 = new bh.f(false);
            this.f33405u0 = new gh.d(null);
            this.f33406v0 = new gh.d(null);
            return;
        }
        this.f33404t0 = null;
        this.f33405u0 = null;
        this.f33406v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.f33385d0;
        s4.g0 adapter = contactsActivity.f33387f.getAdapter();
        ps psVar = contactsActivity.f33400r;
        if (adapter == psVar) {
            psVar.getClass();
            Object E = contactsActivity.f33400r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() != null && i6Var.getUser().contact) {
                    contactsActivity.r0(i6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ps psVar2 = contactsActivity.f33400r;
                int size = psVar2.d.size();
                int size2 = psVar2.H.size();
                hg.a2 a2Var = psVar2.f12086f;
                int size3 = a2Var.e.size();
                int size4 = a2Var.f11825j.size();
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
                    if (user.f20491id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20491id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new sn(bundle), contactsActivity.Q);
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
                    qj0 qj0Var = new qj0(contactsActivity.getParentActivity(), contactsActivity);
                    qj0Var.x(str2, true);
                    qj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.d5.u(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.zq)) {
                org.telegram.ui.Components.f20 f20Var = contactsActivity.f33407w;
                if (f20Var != null) {
                    f20Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.wa)) {
                contactsActivity.r0((org.telegram.ui.Cells.wa) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new x70());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new m9(null));
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
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                        o2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new p60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")));
                        return;
                    }
                    contactsActivity.presentFragment(new g(0));
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
                        bundle2.putLong("user_id", user2.f20491id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new sn(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.o2(str, 29, contactsActivity));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f20679a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity, int i10) {
        boolean z10;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.f33382b0 = z10;
        if (i10 == 0) {
            return;
        }
        contactsActivity.e0(false);
    }

    public static void W(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void X(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new qj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f33387f.getY() + contactsActivity.f33387f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f33387f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f33387f.getChildAt(i11);
            contactsActivity.f33387f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.m0 X = contactsActivity.f33387f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.lm0 lm0Var = contactsActivity.f33387f;
                X.a(rect, childAt, lm0Var, lm0Var.f3634u0);
                float y10 = contactsActivity.f33387f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f33387f.getY() + contactsActivity.f33387f.getPaddingTop(), contactsActivity.f33383c.e) - AndroidUtilities.dp(48.0f));
        ne.b bVar = contactsActivity.f33381b;
        if (y3 > (contactsActivity.f33387f.getY() + contactsActivity.f33387f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void d0(ContactsActivity contactsActivity) {
        qs qsVar;
        boolean z10;
        org.telegram.ui.Components.f20 f20Var = contactsActivity.f33407w;
        if (f20Var != null && (qsVar = contactsActivity.d) != null) {
            if (contactsActivity.f33409x && !contactsActivity.F && !qsVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            f20Var.e(z10, true);
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.lm0 lm0Var = this.f33387f;
        if (lm0Var != null && lm0Var.getFastScroll() != null && this.f33387f.getFastScroll().f30557n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21404p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21592z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.K();
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        createActionBar.j();
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
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f33390h0 = h2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(h2Var);
        }
        org.telegram.ui.Components.i20 i20Var = new org.telegram.ui.Components.i20(context, this.resourceProvider);
        this.Z = i20Var;
        i20Var.f27260w = true;
        i20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        i20Var.updateColors();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.y i13 = this.actionBar.i(null);
        i13.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f33386e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f33386e0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            org.telegram.ui.ActionBar.r6.t(this.f33386e0, org.telegram.ui.ActionBar.k6.f21574y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f33386e0;
            int i14 = org.telegram.ui.ActionBar.k6.f21591z8;
            org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i14), getResourceProvider());
            this.f33386e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f39649b;

                {
                    this.f39649b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f39649b.o0();
                            return;
                        default:
                            ContactsActivity.X(this.f39649b);
                            return;
                    }
                }
            });
            i13.addView(this.f33386e0, w7.z5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(i13.getContext());
        this.f33388f0 = numberTextView;
        int i15 = 18;
        numberTextView.setTextSize(18);
        this.f33388f0.setTypeface(AndroidUtilities.bold());
        this.f33388f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8));
        NumberTextView numberTextView2 = this.f33388f0;
        if (!this.I) {
            i15 = 72;
        }
        i13.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i15, 0, 0));
        int i16 = 2;
        this.f33388f0.setOnTouchListener(new di.d(2));
        i13.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new os(this));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        this.f33389g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ei.e2 e2Var = this.Z.f27258r;
        e2Var.addTextChangedListener(new zf.h0(e2Var, new ig.b2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.u0 a10 = m10.a(1, i11);
            this.f33402s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f33387f = new org.telegram.ui.Components.lm0(context, null);
        this.f33400r = new ps(this, context, this.f33385d0, this.V, this.O, this.N);
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
        qs qsVar = new qs(this, context, this.G ? 1 : 0, this.H, this.f33385d0, i10);
        this.d = qsVar;
        if (this.f33402s != null) {
            if (this.v) {
                i16 = 1;
            }
        } else {
            i16 = 0;
        }
        qsVar.Y(i16, false);
        this.d.H = this.f33384c0;
        y8 y8Var = new y8(this, context, 3);
        this.f33411y = y8Var;
        this.fragmentView = y8Var;
        org.telegram.ui.Components.lm0 lm0Var = this.f33387f;
        Objects.requireNonNull(lm0Var);
        this.f33408w0 = new bh.l(lm0Var, y8Var, new ns(lm0Var, 0));
        this.f33387f.C0(new js(this, 1));
        this.f33387f.setSections(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, this.f33411y, getResourceProvider());
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        z00Var.setViewType(29);
        z00Var.f33104w = false;
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, z00Var, 1, null);
        this.e = vx0Var;
        vx0Var.addView(z00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f33411y.addView(this.e, w7.z5.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.k kVar2 = new s4.k();
        kVar2.C = false;
        kVar2.n(150L);
        kVar2.f46376m = false;
        this.f33387f.setItemAnimator(kVar2);
        this.f33387f.setSectionsType(1);
        this.f33387f.setVerticalScrollBarEnabled(false);
        this.f33387f.setFastScrollEnabled(0);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f33387f;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f33395n = b0Var;
        lm0Var2.setLayoutManager(b0Var);
        this.f33387f.setAdapter(this.d);
        this.f33387f.setClipToPadding(false);
        org.telegram.ui.Components.ol0 ol0Var = new org.telegram.ui.Components.ol0(this.f33387f, this.f33395n);
        this.h = ol0Var;
        ol0Var.h = new ls(this);
        y8 y8Var2 = this.f33411y;
        org.telegram.ui.Components.lm0 lm0Var3 = this.f33387f;
        float f7 = -this.f33379a;
        y8Var2.addView(lm0Var3, w7.z5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.f33411y.addView(this.Z, w7.z5.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f33387f.setEmptyView(this.e);
        org.telegram.ui.Components.lm0 lm0Var4 = this.f33387f;
        lm0Var4.W1 = true;
        lm0Var4.X1 = 0;
        lm0Var4.setOnItemClickListener(new i2.r(this, i10, 10));
        this.f33387f.setOnItemLongClickListener(new ls(this));
        this.f33387f.setOnScrollListener(new rs(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(context, this.resourceProvider, false);
            this.f33407w = f20Var;
            this.f33411y.addView(f20Var, org.telegram.ui.Components.f20.b());
            this.f33407w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f39649b;

                {
                    this.f39649b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f39649b.o0();
                            return;
                        default:
                            ContactsActivity.X(this.f39649b);
                            return;
                    }
                }
            });
            this.f33407w.f26170c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f33407w.f26170c.getAnimatedDrawable().M(this.f33407w.f26170c.getAnimatedDrawable().e[0] - 1);
            this.f33407w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.x(str);
            this.X = null;
        }
        this.f33411y.addView(this.actionBar);
        ei.g6 g6Var = new ei.g6(context, this.parentLayout);
        this.Y = g6Var;
        g6Var.b(false, false);
        this.f33411y.addView(this.Y, w7.z5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f33387f);
        this.actionBar.setDrawBlurBackground(this.f33411y);
        this.f33381b.a(true, false);
        l0();
        setBulletinDelegate(new b9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33474h1.d.add(this);
        }
        View view = this.fragmentView;
        ls lsVar = new ls(this);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(view, lsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.lm0 lm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            qs qsVar = this.d;
            if (qsVar != null) {
                if (!this.v) {
                    qsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f33400r != null) {
                s4.g0 adapter = this.f33387f.getAdapter();
                ps psVar = this.f33400r;
                if (adapter == psVar) {
                    psVar.G(this.f33391i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (lm0Var = this.f33387f) != null) {
                int childCount = lm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f33387f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.wa) {
                        ((org.telegram.ui.Cells.wa) childAt).i(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f33394l0) {
                this.f33394l0 = true;
                z5 z5Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f20352id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new sn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f33382b0) {
                showDialog(org.telegram.ui.Components.d5.v(parentActivity, new is(this, 1)).f20679a);
                return;
            }
            this.f33393k0 = SystemClock.elapsedRealtime();
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

    public final void f0() {
        bh.f fVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f33404t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f33399q0) - AndroidUtilities.dp(8.0f);
            this.f33412y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33413z0;
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
            fVar.g(i10, this.f33410x0);
            fVar.e(this.f33408w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.updateColors();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(6, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33387f, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21329l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33387f, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21348m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33387f, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21368n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33387f, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33387f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21387o6));
        org.telegram.ui.Components.f20 f20Var = this.f33407w;
        if (f20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(f20Var.f26170c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33407w.f26170c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.vx0 vx0Var = this.e;
        if (vx0Var != null) {
            vx0Var.b(Math.max(this.f33399q0 + this.f33396n0, this.f33401r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.f20 f20Var = this.f33407w;
        if (f20Var != null) {
            f20Var.setTranslationY(((-this.f33399q0) - this.f33397o0) - this.f33398p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.lm0 lm0Var = this.f33387f;
        int i10 = this.f33379a;
        lm0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f33399q0 + this.f33396n0);
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.f33401r0 = k1Var.f45250a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.f20.d(this.f33389g0, (1.0f - this.f33383c.e) * (1.0f - this.f33381b.e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        qs qsVar = this.d;
        if (qsVar != null && qsVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33403s0 == z10 && !TextUtils.isEmpty(this.Z.f27258r.getHint())) {
            return;
        }
        ei.e2 e2Var = this.Z.f27258r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        e2Var.setHint(LocaleController.getString(i10));
        ei.e2 e2Var2 = this.Z.f27258r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        e2Var2.setContentDescription(LocaleController.getString(i11));
        this.f33403s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f33383c.e;
        qs qsVar = this.d;
        org.telegram.ui.Components.f20.d(this.f33402s, f10 * ((qsVar == null || qsVar.I) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.U != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.vc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (this.S != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        if (canAddAdmins) {
                            c2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            c2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new ks(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            c2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(c2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                c2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a1.g.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21290j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new ss(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                c2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new e7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(c2Var2);
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
        ts tsVar = this.W;
        if (tsVar != null) {
            tsVar.b(user);
            if (this.R) {
                this.W = null;
            }
        }
        if (this.Q) {
            finishFragment();
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f33387f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.f33385d0;
            if (i10 < childCount) {
                View childAt = this.f33387f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.wa) {
                    org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) childAt;
                    if (hVar.h(waVar.getDialogId()) >= 0) {
                        waVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (hVar.h(i6Var.getDialogId()) >= 0) {
                        i6Var.s(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                this.f33390h0.c(0.0f, true);
                return;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                o0();
                return false;
            }
        } else if (this.f33383c.f17447f) {
            if (z10) {
                this.Z.f27258r.getText().clear();
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
        if (this.f33392j0 && (parentActivity = getParentActivity()) != null) {
            this.f33392j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.d5.v(parentActivity, new is(this, 0)).f20679a;
                    this.f33380a0 = c2Var;
                    showDialog(c2Var);
                    return;
                }
                e0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.c2 c2Var = this.f33380a0;
        if (c2Var != null && dialog == c2Var && getParentActivity() != null && this.f33382b0) {
            e0(false);
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
        this.f33392j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f33384c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f33396n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f33397o0 = i11;
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
        this.f33399q0 = i13;
        j0();
        i0();
        h0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.g(true);
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
                    this.f33382b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f33393k0 < 200) {
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
        qs qsVar = this.d;
        if (qsVar != null) {
            qsVar.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
            try {
                org.telegram.ui.Components.lm0 lm0Var = this.f33387f;
                if (lm0Var != null) {
                    lm0Var.A1();
                }
                NumberTextView numberTextView = this.f33388f0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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

    public final void p0(ai.e4 e4Var) {
        this.W = e4Var;
    }

    public final void q0(String str) {
        this.X = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.wa;
        boolean z12 = false;
        a0.h hVar = this.f33385d0;
        if (z11) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) viewGroup;
            long dialogId = waVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                waVar.c(false, true);
            } else if (waVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) waVar.getCurrentObject(), dialogId);
                waVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.i6) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) viewGroup;
            long dialogId2 = i6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                i6Var.s(false, true);
            } else if (i6Var.getUser() != null) {
                hVar.k(i6Var.getUser(), dialogId2);
                i6Var.s(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.N(null, null);
            this.f33390h0.c(1.0f, true);
        }
        this.f33388f0.a(hVar.m(), z12);
    }

    @Override
    public final void t() {
        if (this.f33395n.L0() < 15) {
            this.f33387f.x0(0);
        } else {
            org.telegram.ui.Components.ol0 ol0Var = this.h;
            ol0Var.f29317b = 1;
            ol0Var.c(0, 0, false, false);
        }
        this.f33381b.a(true, true);
    }

    @Override
    public final gh.d z() {
        return this.f33406v0;
    }

    @Override
    public final void L() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
