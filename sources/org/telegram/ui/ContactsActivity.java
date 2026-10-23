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
public class ContactsActivity extends org.telegram.ui.ActionBar.n2 implements ne.d, NotificationCenter.NotificationCenterDelegate, mg0, qh.d {
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
    public qs W;
    public String X;
    public ei.g6 Y;
    public org.telegram.ui.Components.k20 Z;
    public final int f33080a;
    public org.telegram.ui.ActionBar.b2 f33081a0;
    public final ne.b f33082b;
    public boolean f33083b0;
    public final ne.b f33084c;
    public boolean f33085c0;
    public ns d;
    public final a0.h f33086d0;
    public org.telegram.ui.Components.tx0 e;
    public ImageView f33087e0;
    public org.telegram.ui.Components.jm0 f33088f;
    public NumberTextView f33089f0;
    public org.telegram.ui.ActionBar.u0 f33090g0;
    public org.telegram.ui.Components.ml0 h;
    public org.telegram.ui.ActionBar.g2 f33091h0;
    public String f33092i0;
    public boolean f33093j0;
    public long f33094k0;
    public boolean f33095l0;
    public final a6 m0;
    public s4.b0 f33096n;
    public int f33097n0;
    public int f33098o0;
    public float f33099p0;
    public int phonebookRow;
    public int f33100q0;
    public ms f33101r;
    public int f33102r0;
    public org.telegram.ui.ActionBar.u0 f33103s;
    public boolean f33104s0;
    public final bh.f f33105t0;
    public final gh.d f33106u0;
    public boolean v;
    public final gh.d f33107v0;
    public org.telegram.ui.Components.h20 f33108w;
    public bh.l f33109w0;
    public boolean f33110x;
    public final ArrayList f33111x0;
    public y8 f33112y;
    public final RectF f33113y0;
    public final RectF f33114z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33080a = i10;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.f33082b = new ne.b(0, this, bsVar, 350L, false);
        this.f33084c = new ne.b(2, this, bsVar, 350L, false);
        this.phonebookRow = 0;
        this.f33110x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f33083b0 = true;
        this.f33086d0 = new a0.h();
        this.f33093j0 = true;
        this.m0 = new a6(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f33111x0 = arrayList;
        RectF rectF = new RectF();
        this.f33113y0 = rectF;
        RectF rectF2 = new RectF();
        this.f33114z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f33105t0 = new bh.f(false);
            this.f33106u0 = new gh.d(null);
            this.f33107v0 = new gh.d(null);
            return;
        }
        this.f33105t0 = null;
        this.f33106u0 = null;
        this.f33107v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.f33086d0;
        s4.g0 adapter = contactsActivity.f33088f.getAdapter();
        ms msVar = contactsActivity.f33101r;
        if (adapter == msVar) {
            msVar.getClass();
            Object E = contactsActivity.f33101r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() != null && h6Var.getUser().contact) {
                    contactsActivity.r0(h6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ms msVar2 = contactsActivity.f33101r;
                int size = msVar2.d.size();
                int size2 = msVar2.H.size();
                hg.a2 a2Var = msVar2.f12056f;
                int size3 = a2Var.e.size();
                int size4 = a2Var.f11798j.size();
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
                    if (user.f20427id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20427id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new qn(bundle), contactsActivity.Q);
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
                    mj0 mj0Var = new mj0(contactsActivity.getParentActivity(), contactsActivity);
                    mj0Var.x(str2, true);
                    mj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.f5.u(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.cr)) {
                org.telegram.ui.Components.h20 h20Var = contactsActivity.f33108w;
                if (h20Var != null) {
                    h20Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.va)) {
                contactsActivity.r0((org.telegram.ui.Cells.va) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new r70());
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
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                        n2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new l60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new md(org.telegram.ui.Cells.c1.i(0, "step")));
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
                        bundle2.putLong("user_id", user2.f20427id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new qn(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.q2(str, 27, contactsActivity));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f20609a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.jm0 jm0Var = contactsActivity.f33088f;
        if (jm0Var != null) {
            int childCount = jm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f33088f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).v(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f33087e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21384y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f33087e0.setBackground(org.telegram.ui.ActionBar.h6.g0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21401z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.d();
        }
        y8 y8Var = contactsActivity.f33112y;
        if (y8Var != null) {
            y8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20936a7));
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
        contactsActivity.f33083b0 = z10;
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
            new mj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f33088f.getY() + contactsActivity.f33088f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f33088f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f33088f.getChildAt(i11);
            contactsActivity.f33088f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.m0 X = contactsActivity.f33088f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.jm0 jm0Var = contactsActivity.f33088f;
                X.a(rect, childAt, jm0Var, jm0Var.f3627u0);
                float y10 = contactsActivity.f33088f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f33088f.getY() + contactsActivity.f33088f.getPaddingTop(), contactsActivity.f33084c.e) - AndroidUtilities.dp(48.0f));
        ne.b bVar = contactsActivity.f33082b;
        if (y3 > (contactsActivity.f33088f.getY() + contactsActivity.f33088f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        ns nsVar;
        boolean z10;
        org.telegram.ui.Components.h20 h20Var = contactsActivity.f33108w;
        if (h20Var != null && (nsVar = contactsActivity.d) != null) {
            if (contactsActivity.f33110x && !contactsActivity.F && !nsVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            h20Var.e(z10, true);
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.jm0 jm0Var = this.f33088f;
        if (jm0Var != null && jm0Var.getFastScroll() != null && this.f33088f.getFastScroll().f29652n) {
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
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f33091h0 = g2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(g2Var);
        }
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20(context, this.resourceProvider);
        this.Z = k20Var;
        k20Var.f27732w = true;
        k20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        k20Var.d();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f33087e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f33087e0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f33087e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21384y8), PorterDuff.Mode.MULTIPLY));
            this.f33087e0.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21401z8), 1, -1));
            this.f33087e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f38342b;

                {
                    this.f38342b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f38342b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f38342b);
                            return;
                    }
                }
            });
            j10.addView(this.f33087e0, w7.z5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f33089f0 = numberTextView;
        int i13 = 18;
        numberTextView.setTextSize(18);
        this.f33089f0.setTypeface(AndroidUtilities.bold());
        this.f33089f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21384y8));
        NumberTextView numberTextView2 = this.f33089f0;
        if (!this.I) {
            i13 = 72;
        }
        j10.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i13, 0, 0));
        int i14 = 2;
        this.f33089f0.setOnTouchListener(new di.d(2));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ls(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f33090g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ei.e2 e2Var = this.Z.f27730r;
        e2Var.addTextChangedListener(new zf.h0(e2Var, new ig.c2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.u0 a10 = n10.a(1, i11);
            this.f33103s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f33088f = new org.telegram.ui.Components.jm0(context, null);
        this.f33101r = new ms(this, context, this.f33086d0, this.V, this.O, this.N);
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
        ns nsVar = new ns(this, context, this.G ? 1 : 0, this.H, this.f33086d0, i10);
        this.d = nsVar;
        if (this.f33103s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        nsVar.Y(i14, false);
        this.d.H = this.f33085c0;
        y8 y8Var = new y8(this, context, 3);
        this.f33112y = y8Var;
        this.fragmentView = y8Var;
        org.telegram.ui.Components.jm0 jm0Var = this.f33088f;
        Objects.requireNonNull(jm0Var);
        this.f33109w0 = new bh.l(jm0Var, y8Var, new ks(jm0Var, 0));
        this.f33088f.C0(new hs(this, 1));
        this.f33088f.setSections(true);
        this.f33112y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20936a7));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(29);
        b10Var.f24778w = false;
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, b10Var, 1, null);
        this.e = tx0Var;
        tx0Var.addView(b10Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f33112y.addView(this.e, w7.z5.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.k kVar2 = new s4.k();
        kVar2.C = false;
        kVar2.n(150L);
        kVar2.f45955m = false;
        this.f33088f.setItemAnimator(kVar2);
        this.f33088f.setSectionsType(1);
        this.f33088f.setVerticalScrollBarEnabled(false);
        this.f33088f.setFastScrollEnabled(0);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f33088f;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f33096n = b0Var;
        jm0Var2.setLayoutManager(b0Var);
        this.f33088f.setAdapter(this.d);
        this.f33088f.setClipToPadding(false);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(this.f33088f, this.f33096n);
        this.h = ml0Var;
        ml0Var.h = new is(this);
        y8 y8Var2 = this.f33112y;
        org.telegram.ui.Components.jm0 jm0Var3 = this.f33088f;
        float f7 = -this.f33080a;
        y8Var2.addView(jm0Var3, w7.z5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.f33112y.addView(this.Z, w7.z5.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f33088f.setEmptyView(this.e);
        org.telegram.ui.Components.jm0 jm0Var4 = this.f33088f;
        jm0Var4.W1 = true;
        jm0Var4.X1 = 0;
        jm0Var4.setOnItemClickListener(new i2.s(this, i10, 10));
        this.f33088f.setOnItemLongClickListener(new is(this));
        this.f33088f.setOnScrollListener(new os(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
            this.f33108w = h20Var;
            this.f33112y.addView(h20Var, org.telegram.ui.Components.h20.b());
            this.f33108w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f38342b;

                {
                    this.f38342b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f38342b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f38342b);
                            return;
                    }
                }
            });
            this.f33108w.f26721c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f33108w.f26721c.getAnimatedDrawable().M(this.f33108w.f26721c.getAnimatedDrawable().e[0] - 1);
            this.f33108w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.y(str);
            this.X = null;
        }
        this.f33112y.addView(this.actionBar);
        ei.g6 g6Var = new ei.g6(context, this.parentLayout);
        this.Y = g6Var;
        g6Var.b(false, false);
        this.f33112y.addView(this.Y, w7.z5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f33088f);
        this.actionBar.setDrawBlurBackground(this.f33112y);
        this.f33082b.a(true, false);
        l0();
        setBulletinDelegate(new b9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f33173g1.d.add(this);
        }
        View view = this.fragmentView;
        is isVar = new is(this);
        WeakHashMap weakHashMap = r0.i0.f44830a;
        r0.a0.i(view, isVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.jm0 jm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            ns nsVar = this.d;
            if (nsVar != null) {
                if (!this.v) {
                    nsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f33101r != null) {
                s4.g0 adapter = this.f33088f.getAdapter();
                ms msVar = this.f33101r;
                if (adapter == msVar) {
                    msVar.G(this.f33092i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (jm0Var = this.f33088f) != null) {
                int childCount = jm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f33088f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f33095l0) {
                this.f33095l0 = true;
                a6 a6Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f20288id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new qn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f33083b0) {
                showDialog(org.telegram.ui.Components.f5.v(parentActivity, new gs(this, 1)).f20609a);
                return;
            }
            this.f33094k0 = SystemClock.elapsedRealtime();
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
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f33105t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f33100q0) - AndroidUtilities.dp(8.0f);
            this.f33113y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33114z0;
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
            fVar.g(i10, this.f33111x0);
            fVar.e(this.f33109w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20994d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21083i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21115k0, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21139l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21158m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21178n7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21382y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21177n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.h6.f21245r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 262148, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 262148, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21197o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21157m6));
        org.telegram.ui.Components.h20 h20Var = this.f33108w;
        if (h20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(h20Var.f26721c, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33108w.f26721c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33108w.f26721c, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21078i1}, null, org.telegram.ui.ActionBar.h6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21025f1}, null, org.telegram.ui.ActionBar.h6.f21402z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.h6.Q0, null, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.h6.P0, null, null, org.telegram.ui.ActionBar.h6.f21214p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33088f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.tx0 tx0Var = this.e;
        if (tx0Var != null) {
            tx0Var.b(Math.max(this.f33100q0 + this.f33097n0, this.f33102r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.h20 h20Var = this.f33108w;
        if (h20Var != null) {
            h20Var.setTranslationY(((-this.f33100q0) - this.f33098o0) - this.f33099p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.jm0 jm0Var = this.f33088f;
        int i10 = this.f33080a;
        jm0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f33100q0 + this.f33097n0);
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.f33102r0 = k1Var.f44839a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.h20.d(this.f33090g0, (1.0f - this.f33084c.e) * (1.0f - this.f33082b.e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        ns nsVar = this.d;
        if (nsVar != null && nsVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33104s0 == z10 && !TextUtils.isEmpty(this.Z.f27730r.getHint())) {
            return;
        }
        ei.e2 e2Var = this.Z.f27730r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        e2Var.setHint(LocaleController.getString(i10));
        ei.e2 e2Var2 = this.Z.f27730r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        e2Var2.setContentDescription(LocaleController.getString(i11));
        this.f33104s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f33084c.e;
        ns nsVar = this.d;
        org.telegram.ui.Components.h20.d(this.f33103s, f10 * ((nsVar == null || nsVar.I) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.U != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.xc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (this.S != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                        if (canAddAdmins) {
                            b2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            b2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.q2(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            b2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(b2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20609a;
                b2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a1.g.C(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21100j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.h6.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new ps(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                b2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new e7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(b2Var2);
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
        qs qsVar = this.W;
        if (qsVar != null) {
            qsVar.b(user);
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
        int childCount = this.f33088f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.f33086d0;
            if (i10 < childCount) {
                View childAt = this.f33088f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) childAt;
                    if (hVar.h(vaVar.getDialogId()) >= 0) {
                        vaVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (hVar.h(h6Var.getDialogId()) >= 0) {
                        h6Var.t(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                this.f33091h0.c(0.0f, true);
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
        } else if (this.f33084c.f17384f) {
            if (z10) {
                this.Z.f27730r.getText().clear();
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
        if (this.f33093j0 && (parentActivity = getParentActivity()) != null) {
            this.f33093j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(parentActivity, new gs(this, 0)).f20609a;
                    this.f33081a0 = b2Var;
                    showDialog(b2Var);
                    return;
                }
                f0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.b2 b2Var = this.f33081a0;
        if (b2Var != null && dialog == b2Var && getParentActivity() != null && this.f33083b0) {
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
        this.f33093j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f33085c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f33097n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f33098o0 = i11;
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
        this.f33100q0 = i13;
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
                    this.f33083b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f33094k0 < 200) {
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
        ns nsVar = this.d;
        if (nsVar != null) {
            nsVar.l();
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

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.va;
        boolean z12 = false;
        a0.h hVar = this.f33086d0;
        if (z11) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) viewGroup;
            long dialogId = vaVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                vaVar.c(false, true);
            } else if (vaVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) vaVar.getCurrentObject(), dialogId);
                vaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) viewGroup;
            long dialogId2 = h6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                h6Var.t(false, true);
            } else if (h6Var.getUser() != null) {
                hVar.k(h6Var.getUser(), dialogId2);
                h6Var.t(true, true);
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
            this.f33091h0.c(1.0f, true);
        }
        this.f33089f0.a(hVar.m(), z12);
    }

    @Override
    public final void t() {
        if (this.f33096n.L0() < 15) {
            this.f33088f.x0(0);
        } else {
            org.telegram.ui.Components.ml0 ml0Var = this.h;
            ml0Var.f28548b = 1;
            ml0Var.c(0, 0, false, false);
        }
        this.f33082b.a(true, true);
    }

    @Override
    public final gh.d z() {
        return this.f33107v0;
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
