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
public class ContactsActivity extends org.telegram.ui.ActionBar.p2 implements xd.b, NotificationCenter.NotificationCenterDelegate, ug0, ch.d {
    public boolean B;
    public boolean C;
    public boolean D;
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
    public long P;
    public long Q;
    public String R;
    public boolean S;
    public zs T;
    public String U;
    public eg.i0 V;
    public org.telegram.ui.Components.c20 W;
    public org.telegram.ui.ActionBar.d2 X;
    public boolean Y;
    public boolean Z;
    public final int f31535a;
    public final a0.h f31536a0;
    public final xd.a f31537b;
    public ImageView f31538b0;
    public final xd.a f31539c;
    public NumberTextView f31540c0;
    public ws d;
    public org.telegram.ui.ActionBar.w0 f31541d0;
    public org.telegram.ui.Components.zw0 e;
    public org.telegram.ui.ActionBar.i2 f31542e0;
    public org.telegram.ui.Components.sl0 f31543f;
    public String f31544f0;
    public boolean f31545g0;
    public c2.y h;
    public long f31546h0;
    public boolean f31547i0;
    public final z5 f31548j0;
    public int f31549k0;
    public int f31550l0;
    public float m0;
    public f2.i0 f31551n;
    public int f31552n0;
    public int f31553o0;
    public boolean f31554p0;
    public int phonebookRow;
    public final ng.e f31555q0;
    public vs f31556r;
    public final sg.d f31557r0;
    public org.telegram.ui.ActionBar.w0 f31558s;
    public final sg.d f31559s0;
    public ng.k f31560t0;
    public final ArrayList f31561u0;
    public boolean v;
    public final RectF f31562v0;
    public org.telegram.ui.Components.z10 f31563w;
    public final RectF f31564w0;
    public boolean f31565x;
    public kh.j4 f31566y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f31535a = i10;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.f31537b = new xd.a(0, this, nrVar, 350L, false);
        this.f31539c = new xd.a(2, this, nrVar, 350L, false);
        this.phonebookRow = 0;
        this.f31565x = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = null;
        this.S = true;
        this.Y = true;
        this.f31536a0 = new a0.h();
        this.f31545g0 = true;
        this.f31548j0 = new z5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f31561u0 = arrayList;
        RectF rectF = new RectF();
        this.f31562v0 = rectF;
        RectF rectF2 = new RectF();
        this.f31564w0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f31555q0 = new ng.e(false);
            this.f31557r0 = new sg.d(null);
            this.f31559s0 = new sg.d(null);
            return;
        }
        this.f31555q0 = null;
        this.f31557r0 = null;
        this.f31559s0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.f31536a0;
        f2.o0 adapter = contactsActivity.f31543f.getAdapter();
        vs vsVar = contactsActivity.f31556r;
        if (adapter == vsVar) {
            vsVar.getClass();
            Object E = contactsActivity.f31556r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() != null && h6Var.getUser().contact) {
                    contactsActivity.r0(h6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                vs vsVar2 = contactsActivity.f31556r;
                int size = vsVar2.d.size();
                int size2 = vsVar2.E.size();
                tf.k1 k1Var = vsVar2.f44680f;
                int size3 = k1Var.e.size();
                int size4 = k1Var.f44775j.size();
                if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (contactsActivity.H) {
                    contactsActivity.n0(user, true, null);
                    return;
                } else if (contactsActivity.I) {
                    if (user.f19331id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.J = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19331id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new xn(bundle), contactsActivity.N);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        c.b(contactsActivity.currentAccount);
                        return;
                    }
                    sj0 sj0Var = new sj0(contactsActivity.getParentActivity(), contactsActivity);
                    sj0Var.v(str2, true);
                    sj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.z4.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.qq)) {
                org.telegram.ui.Components.z10 z10Var = contactsActivity.f31563w;
                if (z10Var != null) {
                    z10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.va)) {
                contactsActivity.r0((org.telegram.ui.Cells.va) view);
            } else if ((!contactsActivity.D || i10 != 0) && S == 0) {
                if (contactsActivity.E) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            c.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new c80());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new l9(null));
                    }
                } else if (i10 != 0) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            c.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j10 = contactsActivity.Q;
                        if (j10 == 0) {
                            j10 = contactsActivity.P;
                        }
                        ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                        p2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        c.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new y60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        c.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new nd(android.support.v4.media.a.h(0, "step")));
                        return;
                    }
                    contactsActivity.presentFragment(new i(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.H) {
                        contactsActivity.n0(user2, true, null);
                    } else if (contactsActivity.I) {
                        contactsActivity.J = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f19331id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new xn(bundle2), contactsActivity.N);
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
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qs(0, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f19503a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.sl0 sl0Var = contactsActivity.f31543f;
        if (sl0Var != null) {
            int childCount = sl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f31543f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f31538b0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f31538b0.setBackground(org.telegram.ui.ActionBar.j6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        kh.j4 j4Var = contactsActivity.f31566y;
        if (j4Var != null) {
            j4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        }
    }

    public static void W(ContactsActivity contactsActivity, int i10) {
        boolean z4;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        contactsActivity.Y = z4;
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
            c.b(contactsActivity.currentAccount);
        } else {
            new sj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y10 = contactsActivity.f31543f.getY() + contactsActivity.f31543f.getPaddingTop();
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f31543f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f31543f.getChildAt(i11);
            contactsActivity.f31543f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                f2.u0 X = contactsActivity.f31543f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.sl0 sl0Var = contactsActivity.f31543f;
                X.a(rect, childAt, sl0Var, sl0Var.f1240q0);
                float y11 = contactsActivity.f31543f.getY();
                float y12 = childAt.getY();
                if (contactsActivity.d.H) {
                    i10 = 0;
                } else {
                    i10 = rect.top;
                }
                y10 = y11 + (y12 - i10);
            } else if (R > 0) {
                y10 = -AndroidUtilities.dp(52.0f);
                break;
            } else {
                i11++;
            }
        }
        contactsActivity.W.setTranslationY(AndroidUtilities.lerp(y10, contactsActivity.f31543f.getY() + contactsActivity.f31543f.getPaddingTop(), contactsActivity.f31539c.e) - AndroidUtilities.dp(48.0f));
        xd.a aVar = contactsActivity.f31537b;
        if (y10 > (contactsActivity.f31543f.getY() + contactsActivity.f31543f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z4 = true;
        }
        aVar.a(z4, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        ws wsVar;
        boolean z4;
        org.telegram.ui.Components.z10 z10Var = contactsActivity.f31563w;
        if (z10Var != null && (wsVar = contactsActivity.d) != null) {
            if (contactsActivity.f31565x && !contactsActivity.C && !wsVar.F) {
                z4 = true;
            } else {
                z4 = false;
            }
            z10Var.e(z4, true);
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.Components.sl0 sl0Var = this.f31543f;
        if (sl0Var != null && sl0Var.getFastScroll() != null && this.f31543f.getFastScroll().f23713n) {
            return false;
        }
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.K();
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
        int i13;
        this.C = false;
        this.B = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.G) {
            if (this.H) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (this.I) {
                    i13 = R.string.NewSecretChat;
                } else {
                    i13 = R.string.NewMessageTitle;
                }
                kVar.setTitle(LocaleController.getString(i13));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f31542e0 = i2Var;
        if (!this.F) {
            this.actionBar.setBackButtonDrawable(i2Var);
        }
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider);
        this.W = c20Var;
        c20Var.f23817w = true;
        c20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        c20Var.e();
        this.W.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.F) {
            ImageView imageView = new ImageView(context);
            this.f31538b0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f31538b0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.f31538b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8), PorterDuff.Mode.MULTIPLY));
            this.f31538b0.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), 1, -1));
            this.f31538b0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f38433b;

                {
                    this.f38433b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f38433b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f38433b);
                            return;
                    }
                }
            });
            j10.addView(this.f31538b0, k7.b6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f31540c0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f31540c0.setTypeface(AndroidUtilities.bold());
        this.f31540c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8));
        NumberTextView numberTextView2 = this.f31540c0;
        if (this.F) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j10.addView(numberTextView2, k7.b6.m(1.0f, 0, -1, i10, 0, 0));
        int i14 = 2;
        this.f31540c0.setOnTouchListener(new oh.d(2));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new us(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f31541d0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        kg.f fVar = this.W.f23815r;
        fVar.addTextChangedListener(new lf.n0(fVar, new fb(this, 6)));
        if (!this.I && !this.H) {
            if (this.v) {
                i12 = R.drawable.msg_contacts_time;
            } else {
                i12 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, i12);
            this.f31558s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f31543f = new org.telegram.ui.Components.sl0(context, null);
        this.f31556r = new vs(this, context, this.f31536a0, this.S, this.L, this.K);
        if (this.Q != 0) {
            i11 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.Q)), 3) ? 1 : 0;
        } else {
            if (this.P != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.P));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                }
            }
            i11 = 0;
        }
        ws wsVar = new ws(this, context, this.D ? 1 : 0, this.E, this.f31536a0, i11);
        this.d = wsVar;
        if (this.f31558s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        wsVar.Y(i14, false);
        this.d.E = this.Z;
        kh.j4 j4Var = new kh.j4(this, context, 4);
        this.f31566y = j4Var;
        this.fragmentView = j4Var;
        org.telegram.ui.Components.sl0 sl0Var = this.f31543f;
        Objects.requireNonNull(sl0Var);
        this.f31560t0 = new ng.k(sl0Var, j4Var, new ts(sl0Var, 0));
        this.f31543f.C0(new ps(this, 1));
        this.f31543f.setSections(true);
        this.f31566y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(29);
        t00Var.f28855w = false;
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, t00Var, 1, null);
        this.e = zw0Var;
        zw0Var.addView(t00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f31566y.addView(this.e, k7.b6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.n(150L);
        lVar.f5818m = false;
        this.f31543f.setItemAnimator(lVar);
        this.f31543f.setSectionsType(1);
        this.f31543f.setVerticalScrollBarEnabled(false);
        this.f31543f.setFastScrollEnabled(0);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f31543f;
        f2.i0 i0Var = new f2.i0(1, false);
        this.f31551n = i0Var;
        sl0Var2.setLayoutManager(i0Var);
        this.f31543f.setAdapter(this.d);
        this.f31543f.setClipToPadding(false);
        c2.y yVar = new c2.y(this.f31543f, this.f31551n);
        this.h = yVar;
        yVar.h = new rs(this);
        kh.j4 j4Var2 = this.f31566y;
        org.telegram.ui.Components.sl0 sl0Var3 = this.f31543f;
        float f10 = -this.f31535a;
        j4Var2.addView(sl0Var3, k7.b6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.f31566y.addView(this.W, k7.b6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f31543f.setEmptyView(this.e);
        org.telegram.ui.Components.sl0 sl0Var4 = this.f31543f;
        sl0Var4.V1 = true;
        sl0Var4.W1 = 0;
        sl0Var4.setOnItemClickListener(new gg.m2(this, i11, 9));
        this.f31543f.setOnItemLongClickListener(new rs(this));
        this.f31543f.setOnScrollListener(new xs(this));
        if (!this.I && !this.H) {
            org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
            this.f31563w = z10Var;
            this.f31566y.addView(z10Var, org.telegram.ui.Components.z10.b());
            this.f31563w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f38433b;

                {
                    this.f38433b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f38433b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f38433b);
                            return;
                    }
                }
            });
            this.f31563w.f31207c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f31563w.f31207c.getAnimatedDrawable().K(this.f31563w.f31207c.getAnimatedDrawable().e[0] - 1);
            this.f31563w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.U;
        if (str != null) {
            this.actionBar.x(str);
            this.U = null;
        }
        this.f31566y.addView(this.actionBar);
        eg.i0 i0Var2 = new eg.i0(context, this.parentLayout);
        this.V = i0Var2;
        i0Var2.b(false, false);
        this.f31566y.addView(this.V, k7.b6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f31543f);
        this.actionBar.setDrawBlurBackground(this.f31566y);
        this.f31537b.a(true, false);
        l0();
        setBulletinDelegate(new a9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f31621d1.d.add(this);
        }
        View view = this.fragmentView;
        rs rsVar = new rs(this);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(view, rsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.sl0 sl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            ws wsVar = this.d;
            if (wsVar != null) {
                if (!this.v) {
                    wsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f31556r != null) {
                f2.o0 adapter = this.f31543f.getAdapter();
                vs vsVar = this.f31556r;
                if (adapter == vsVar) {
                    vsVar.G(this.f31544f0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (sl0Var = this.f31543f) != null) {
                int childCount = sl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f31543f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f31547i0) {
                this.f31547i0 = true;
                z5 z5Var = this.f31548j0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.I && this.J) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f19192id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new xn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.J) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z4) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z4 && this.Y) {
                showDialog(org.telegram.ui.Components.z4.w(parentActivity, new os(this, 1)).f19503a);
                return;
            }
            this.f31546h0 = SystemClock.elapsedRealtime();
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
        ng.e eVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f31555q0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f31552n0) - AndroidUtilities.dp(8.0f);
            this.f31562v0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f31564w0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.F) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f31561u0);
            eVar.e(this.f31560t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 12);
        if (!this.F) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20050l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20068m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20086n7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 262148, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 262148, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20103o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        org.telegram.ui.Components.z10 z10Var = this.f31563w;
        if (z10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(z10Var.f31207c, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31563w.f31207c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31563w.f31207c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19943f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19991i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19937f1}, null, org.telegram.ui.ActionBar.j6.f20301z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.j6.Q0, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.f20121p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31543f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.zw0 zw0Var = this.e;
        if (zw0Var != null) {
            zw0Var.b(Math.max(this.f31552n0 + this.f31549k0, this.f31553o0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.z10 z10Var = this.f31563w;
        if (z10Var != null) {
            z10Var.setTranslationY(((-this.f31552n0) - this.f31550l0) - this.m0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.sl0 sl0Var = this.f31543f;
        int i10 = this.f31535a;
        sl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f31552n0 + this.f31549k0);
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f31553o0 = m1Var.f43130a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.z10.d(this.f31541d0, (1.0f - this.f31539c.e) * (1.0f - this.f31537b.e));
    }

    public final void l0() {
        boolean z4;
        int i10;
        int i11;
        ws wsVar = this.d;
        if (wsVar != null && wsVar.F) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f31554p0 == z4 && !TextUtils.isEmpty(this.W.f23815r.getHint())) {
            return;
        }
        kg.f fVar = this.W.f23815r;
        if (z4) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        fVar.setHint(LocaleController.getString(i10));
        kg.f fVar2 = this.W.f23815r;
        if (z4) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        fVar2.setContentDescription(LocaleController.getString(i11));
        this.f31554p0 = z4;
    }

    public final void m0() {
        float f10 = 1.0f;
        float f11 = 1.0f - this.f31539c.e;
        ws wsVar = this.d;
        org.telegram.ui.Components.z10.d(this.f31558s, f11 * ((wsVar == null || wsVar.F) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z4, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z4 && this.R != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.qc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (this.P != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.P));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        if (canAddAdmins) {
                            d2Var.O = LocaleController.getString(R.string.AddBotAdminAlert);
                            d2Var.Q = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new qs(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            d2Var.Q = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(d2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                d2Var2.O = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.R, UserObject.getUserName(user));
                if (!user.bot && this.M) {
                    formatStringSimple = android.support.v4.media.a.z(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.j6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new ys(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                d2Var2.Q = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new d7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(d2Var2);
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
        zs zsVar = this.T;
        if (zsVar != null) {
            zsVar.b(user);
            if (this.O) {
                this.T = null;
            }
        }
        if (this.N) {
            finishFragment();
        }
    }

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f31543f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.f31536a0;
            if (i10 < childCount) {
                View childAt = this.f31543f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) childAt;
                    if (hVar.h(vaVar.getDialogId()) >= 0) {
                        vaVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (hVar.h(h6Var.getDialogId()) >= 0) {
                        h6Var.s(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                this.f31542e0.c(0.0f, true);
                return;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.actionBar.s()) {
            if (z4) {
                o0();
                return false;
            }
        } else if (this.f31539c.f46893f) {
            if (z4) {
                this.W.f23815r.getText().clear();
            }
        } else {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (this.f31545g0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f31545g0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(parentActivity, new os(this, 0)).f19503a;
                    this.X = d2Var;
                    showDialog(d2Var);
                    return;
                }
                f0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.d2 d2Var = this.X;
        if (d2Var != null && dialog == d2Var && getParentActivity() != null && this.Y) {
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
        this.f31545g0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.D = bundle.getBoolean("onlyUsers", false);
            this.G = this.arguments.getBoolean("destroyAfterSelect", false);
            this.H = this.arguments.getBoolean("returnAsResult", false);
            this.I = this.arguments.getBoolean("createSecretChat", false);
            this.R = this.arguments.getString("selectAlertString");
            this.S = this.arguments.getBoolean("allowUsernameSearch", true);
            this.M = this.arguments.getBoolean("needForwardCount", true);
            this.L = this.arguments.getBoolean("allowBots", true);
            this.K = this.arguments.getBoolean("allowSelf", true);
            this.P = this.arguments.getLong("channelId", 0L);
            this.N = this.arguments.getBoolean("needFinishFragment", true);
            this.Q = this.arguments.getLong("chat_id", 0L);
            this.Z = this.arguments.getBoolean("disableSections", false);
            this.O = this.arguments.getBoolean("resetDelegate", false);
            this.E = this.arguments.getBoolean("needPhonebook", false);
            this.F = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.E = true;
        }
        if (!this.I && !this.H) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        if (this.F) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f31549k0 = i10;
        if (this.F) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f31550l0 = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.T = null;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31552n0 = i13;
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
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f31546h0 < 200) {
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
        ws wsVar = this.d;
        if (wsVar != null) {
            wsVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(com.google.firebase.messaging.i iVar) {
        this.T = iVar;
    }

    public final void q0(String str) {
        this.U = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z4;
        boolean z10 = viewGroup instanceof org.telegram.ui.Cells.va;
        boolean z11 = false;
        a0.h hVar = this.f31536a0;
        if (z10) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) viewGroup;
            long dialogId = vaVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                vaVar.c(false, true);
            } else if (vaVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) vaVar.getCurrentObject(), dialogId);
                vaVar.c(true, true);
                z4 = true;
            }
            z4 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) viewGroup;
            long dialogId2 = h6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                h6Var.s(false, true);
            } else if (h6Var.getUser() != null) {
                hVar.k(h6Var.getUser(), dialogId2);
                h6Var.s(true, true);
                z4 = true;
            }
            z4 = false;
        } else {
            return;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                o0();
                return;
            }
            z11 = true;
        } else if (z4) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.f31542e0.c(1.0f, true);
        }
        this.f31540c0.a(hVar.m(), z11);
    }

    @Override
    public final void s() {
        if (this.f31551n.L0() < 15) {
            this.f31543f.x0(0);
        } else {
            c2.y yVar = this.h;
            yVar.f2031b = 1;
            yVar.c(0, 0, false, false);
        }
        this.f31537b.a(true, true);
    }

    @Override
    public final sg.d y() {
        return this.f31559s0;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
