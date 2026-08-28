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
public class ContactsActivity extends org.telegram.ui.ActionBar.o2 implements td.b, NotificationCenter.NotificationCenterDelegate, mg0, xg.d {
    public boolean A;
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
    public long O;
    public long P;
    public String Q;
    public boolean R;
    public ts S;
    public String T;
    public kh.h6 U;
    public org.telegram.ui.Components.m10 V;
    public org.telegram.ui.ActionBar.c2 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final int f35411a;
    public ImageView f35412a0;
    public final td.a f35413b;
    public NumberTextView f35414b0;
    public final td.a f35415c;
    public org.telegram.ui.ActionBar.w0 f35416c0;
    public qs d;
    public org.telegram.ui.ActionBar.h2 f35417d0;
    public org.telegram.ui.Components.gw0 f35418e;
    public String f35419e0;
    public org.telegram.ui.Components.wk0 f35420f;
    public boolean f35421f0;
    public long f35422g0;
    public c2.y h;
    public boolean f35423h0;
    public final v5 f35424i0;
    public int f35425j0;
    public int f35426k0;
    public float f35427l0;
    public int m0;
    public f2.m0 f35428n;
    public int f35429n0;
    public boolean f35430o0;
    public final ig.e f35431p0;
    public int phonebookRow;
    public final ng.d f35432q0;
    public ps f35433r;
    public final ng.d f35434r0;
    public org.telegram.ui.ActionBar.w0 f35435s;
    public ig.k f35436s0;
    public final ArrayList f35437t0;
    public final RectF f35438u0;
    public boolean v;
    public final RectF f35439v0;
    public org.telegram.ui.Components.j10 f35440w;
    public boolean f35441x;
    public fh.x4 f35442y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i9 = 48;
        } else {
            i9 = 0;
        }
        this.f35411a = i9;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f35413b = new td.a(0, this, grVar, 350L, false);
        this.f35415c = new td.a(2, this, grVar, 350L, false);
        this.phonebookRow = 0;
        this.f35441x = true;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.Q = null;
        this.R = true;
        this.X = true;
        this.Z = new a0.h();
        this.f35421f0 = true;
        this.f35424i0 = new v5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f35437t0 = arrayList;
        RectF rectF = new RectF();
        this.f35438u0 = rectF;
        RectF rectF2 = new RectF();
        this.f35439v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i10 >= 31) {
            this.f35431p0 = new ig.e(false);
            this.f35432q0 = new ng.d(null);
            this.f35434r0 = new ng.d(null);
            return;
        }
        this.f35431p0 = null;
        this.f35432q0 = null;
        this.f35434r0 = null;
    }

    public static void T(ContactsActivity contactsActivity, int i9, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.Z;
        f2.r0 adapter = contactsActivity.f35420f.getAdapter();
        ps psVar = contactsActivity.f35433r;
        if (adapter == psVar) {
            psVar.getClass();
            Object E = contactsActivity.f35433r.E(i10);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() != null && h6Var.getUser().contact) {
                    contactsActivity.q0(h6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ps psVar2 = contactsActivity.f35433r;
                int size = psVar2.d.size();
                int size2 = psVar2.D.size();
                of.v1 v1Var = psVar2.f19440f;
                int size3 = v1Var.f19527e.size();
                int size4 = v1Var.f19531j.size();
                if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (contactsActivity.G) {
                    contactsActivity.m0(user, true, null);
                    return;
                } else if (contactsActivity.H) {
                    if (user.f22527id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.I = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new qn(bundle), contactsActivity.M);
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
                    nj0 nj0Var = new nj0(contactsActivity.getParentActivity(), contactsActivity);
                    nj0Var.v(str2, true);
                    nj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.y4.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i10);
        int Q = contactsActivity.d.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.iq)) {
                org.telegram.ui.Components.j10 j10Var = contactsActivity.f35440w;
                if (j10Var != null) {
                    j10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.va)) {
                contactsActivity.q0((org.telegram.ui.Cells.va) view);
            } else if ((!contactsActivity.C || i9 != 0) && S == 0) {
                if (contactsActivity.D) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new q70());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new i9(null));
                    }
                } else if (i9 != 0) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j10 = contactsActivity.P;
                        if (j10 == 0) {
                            j10 = contactsActivity.O;
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                        o2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new k60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new id(aa.d.h(0, "step")));
                        return;
                    }
                    contactsActivity.presentFragment(new h(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.d.O(contactsActivity.d.S(i10), contactsActivity.d.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.G) {
                        contactsActivity.m0(user2, true, null);
                    } else if (contactsActivity.H) {
                        contactsActivity.I = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f22527id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new qn(bundle2), contactsActivity.M);
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
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new yr(1, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f22702a);
                    }
                }
            }
        }
    }

    public static void U(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.wk0 wk0Var = contactsActivity.f35420f;
        if (wk0Var != null) {
            int childCount = wk0Var.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = contactsActivity.f35420f.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f35412a0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f35412a0.setBackground(org.telegram.ui.ActionBar.f6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.d();
        }
        fh.x4 x4Var = contactsActivity.f35442y;
        if (x4Var != null) {
            x4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        }
    }

    public static void V(ContactsActivity contactsActivity, int i9) {
        boolean z10;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.X = z10;
        if (i9 == 0) {
            return;
        }
        contactsActivity.e0(false);
    }

    public static void W(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void X(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new nj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity) {
        int i9;
        float y10 = contactsActivity.f35420f.getY() + contactsActivity.f35420f.getPaddingTop();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= contactsActivity.f35420f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f35420f.getChildAt(i10);
            contactsActivity.f35420f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                f2.y0 X = contactsActivity.f35420f.X(i10);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.wk0 wk0Var = contactsActivity.f35420f;
                X.a(rect, childAt, wk0Var, wk0Var.f1357p0);
                float y11 = contactsActivity.f35420f.getY();
                float y12 = childAt.getY();
                if (contactsActivity.d.G) {
                    i9 = 0;
                } else {
                    i9 = rect.top;
                }
                y10 = y11 + (y12 - i9);
            } else if (R > 0) {
                y10 = -AndroidUtilities.dp(52.0f);
                break;
            } else {
                i10++;
            }
        }
        contactsActivity.V.setTranslationY(AndroidUtilities.lerp(y10, contactsActivity.f35420f.getY() + contactsActivity.f35420f.getPaddingTop(), contactsActivity.f35415c.f47775e) - AndroidUtilities.dp(48.0f));
        td.a aVar = contactsActivity.f35413b;
        if (y10 > (contactsActivity.f35420f.getY() + contactsActivity.f35420f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        aVar.a(z10, true);
    }

    public static void d0(ContactsActivity contactsActivity) {
        qs qsVar;
        boolean z10;
        org.telegram.ui.Components.j10 j10Var = contactsActivity.f35440w;
        if (j10Var != null && (qsVar = contactsActivity.d) != null) {
            if (contactsActivity.f35441x && !contactsActivity.B && !qsVar.E) {
                z10 = true;
            } else {
                z10 = false;
            }
            j10Var.e(z10, true);
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            j0();
        } else if (i9 == 2) {
            j0();
            l0();
        }
    }

    @Override
    public final View M() {
        return this.fragmentView;
    }

    @Override
    public final boolean R(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.wk0 wk0Var = this.f35420f;
        if (wk0Var != null && wk0Var.getFastScroll() != null && this.f35420f.getFastScroll().f28480n) {
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
        int i9;
        int i10;
        int i11;
        int i12;
        this.B = false;
        this.A = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.F) {
            if (this.G) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (this.H) {
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
        this.f35417d0 = h2Var;
        if (!this.E) {
            this.actionBar.setBackButtonDrawable(h2Var);
        }
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider);
        this.V = m10Var;
        m10Var.f30666w = true;
        m10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        m10Var.d();
        this.V.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.E) {
            ImageView imageView = new ImageView(context);
            this.f35412a0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f35412a0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.f35412a0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), PorterDuff.Mode.MULTIPLY));
            this.f35412a0.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
            this.f35412a0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f40513b;

                {
                    this.f40513b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40513b.n0();
                            return;
                        default:
                            ContactsActivity.X(this.f40513b);
                            return;
                    }
                }
            });
            j10.addView(this.f35412a0, g7.e6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f35414b0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f35414b0.setTypeface(AndroidUtilities.bold());
        this.f35414b0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8));
        NumberTextView numberTextView2 = this.f35414b0;
        if (this.E) {
            i9 = 18;
        } else {
            i9 = 72;
        }
        j10.addView(numberTextView2, g7.e6.m(1.0f, 0, -1, i9, 0, 0));
        int i13 = 2;
        this.f35414b0.setOnTouchListener(new jh.d(2));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new os(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f35416c0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        fg.g gVar = this.V.f30664r;
        gVar.addTextChangedListener(new ff.o0(gVar, new cb(this, 6)));
        if (!this.H && !this.G) {
            if (this.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.w0 a3 = n10.a(1, i11);
            this.f35435s = a3;
            a3.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f35420f = new org.telegram.ui.Components.wk0(context, null);
        this.f35433r = new ps(this, context, this.Z, this.R, this.K, this.J);
        if (this.P != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.P)), 3) ? 1 : 0;
        } else {
            if (this.O != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        qs qsVar = new qs(this, context, this.C ? 1 : 0, this.D, this.Z, i10);
        this.d = qsVar;
        if (this.f35435s != null) {
            if (this.v) {
                i13 = 1;
            }
        } else {
            i13 = 0;
        }
        qsVar.Y(i13, false);
        this.d.D = this.Y;
        fh.x4 x4Var = new fh.x4(this, context, 4);
        this.f35442y = x4Var;
        this.fragmentView = x4Var;
        org.telegram.ui.Components.wk0 wk0Var = this.f35420f;
        Objects.requireNonNull(wk0Var);
        this.f35436s0 = new ig.k(wk0Var, x4Var, new ns(wk0Var, 0));
        this.f35420f.C0(new ks(this, 1));
        this.f35420f.setSections(true);
        this.f35442y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(29);
        e00Var.f27885w = false;
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 1, null);
        this.f35418e = gw0Var;
        gw0Var.addView(e00Var, 0);
        this.f35418e.setAnimateLayoutChange(true);
        this.f35418e.e(true, false);
        this.f35418e.d.setText(LocaleController.getString(R.string.NoResult));
        this.f35418e.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f35442y.addView(this.f35418e, g7.e6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.n(150L);
        nVar.f5532m = false;
        this.f35420f.setItemAnimator(nVar);
        this.f35420f.setSectionsType(1);
        this.f35420f.setVerticalScrollBarEnabled(false);
        this.f35420f.setFastScrollEnabled(0);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f35420f;
        f2.m0 m0Var = new f2.m0(1, false);
        this.f35428n = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        this.f35420f.setAdapter(this.d);
        this.f35420f.setClipToPadding(false);
        c2.y yVar = new c2.y(this.f35420f, this.f35428n);
        this.h = yVar;
        yVar.h = new ls(this);
        fh.x4 x4Var2 = this.f35442y;
        org.telegram.ui.Components.wk0 wk0Var3 = this.f35420f;
        float f10 = -this.f35411a;
        x4Var2.addView(wk0Var3, g7.e6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.f35442y.addView(this.V, g7.e6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f35420f.setEmptyView(this.f35418e);
        org.telegram.ui.Components.wk0 wk0Var4 = this.f35420f;
        wk0Var4.U1 = true;
        wk0Var4.V1 = 0;
        wk0Var4.setOnItemClickListener(new bg.x2(this, i10, 8));
        this.f35420f.setOnItemLongClickListener(new ls(this));
        this.f35420f.setOnScrollListener(new rs(this));
        if (!this.H && !this.G) {
            org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
            this.f35440w = j10Var;
            this.f35442y.addView(j10Var, org.telegram.ui.Components.j10.b());
            this.f35440w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f40513b;

                {
                    this.f40513b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40513b.n0();
                            return;
                        default:
                            ContactsActivity.X(this.f40513b);
                            return;
                    }
                }
            });
            this.f35440w.f29579c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f35440w.f29579c.getAnimatedDrawable().K(this.f35440w.f29579c.getAnimatedDrawable().f30847e[0] - 1);
            this.f35440w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.T;
        if (str != null) {
            this.actionBar.x(str);
            this.T = null;
        }
        this.f35442y.addView(this.actionBar);
        kh.h6 h6Var = new kh.h6(context, this.parentLayout);
        this.U = h6Var;
        h6Var.b(false, false);
        this.f35442y.addView(this.U, g7.e6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f35420f);
        this.actionBar.setDrawBlurBackground(this.f35442y);
        this.f35413b.a(true, false);
        k0();
        setBulletinDelegate(new x8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35501c1.d.add(this);
        }
        View view = this.fragmentView;
        ls lsVar = new ls(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(view, lsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        if (i9 == NotificationCenter.contactsDidLoad) {
            qs qsVar = this.d;
            if (qsVar != null) {
                if (!this.v) {
                    qsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f35433r != null) {
                f2.r0 adapter = this.f35420f.getAdapter();
                ps psVar = this.f35433r;
                if (adapter == psVar) {
                    psVar.G(this.f35419e0);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (wk0Var = this.f35420f) != null) {
                int childCount = wk0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f35420f.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f35423h0) {
                this.f35423h0 = true;
                v5 v5Var = this.f35424i0;
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                AndroidUtilities.runOnUIThread(v5Var, 5000L);
            }
        } else if (i9 == NotificationCenter.encryptedChatCreated) {
            if (this.H && this.I) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f22388id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new qn(bundle), false);
            }
        } else if (i9 == NotificationCenter.closeChats && !this.I) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.X) {
                showDialog(org.telegram.ui.Components.y4.w(parentActivity, new js(this, 1)).f22702a);
                return;
            }
            this.f35422g0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void f0() {
        ig.e eVar;
        float f10;
        int i9;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f35431p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.m0) - AndroidUtilities.dp(8.0f);
            this.f35438u0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f35439v0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.E) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            eVar.g(i9, this.f35437t0);
            eVar.e(this.f35436s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        org.telegram.ui.Components.gw0 gw0Var = this.f35418e;
        if (gw0Var != null) {
            gw0Var.b(Math.max(this.m0 + this.f35425j0, this.f35429n0), false);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.E) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23145l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23163m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23180n7));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 262148, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 262148, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        org.telegram.ui.Components.j10 j10Var = this.f35440w;
        if (j10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(j10Var.f29579c, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35440w.f29579c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35440w.f29579c, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23087i1}, null, org.telegram.ui.ActionBar.f6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23032f1}, null, org.telegram.ui.ActionBar.f6.f23389z9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.f6.Q0, null, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.f6.P0, null, null, org.telegram.ui.ActionBar.f6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35420f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.j10 j10Var = this.f35440w;
        if (j10Var != null) {
            j10Var.setTranslationY(((-this.m0) - this.f35426k0) - this.f35427l0);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.wk0 wk0Var = this.f35420f;
        int i9 = this.f35411a;
        wk0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i9 + 44), 0, AndroidUtilities.dp(i9) + this.m0 + this.f35425j0);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.j10.d(this.f35416c0, (1.0f - this.f35415c.f47775e) * (1.0f - this.f35413b.f47775e));
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f35429n0 = m1Var.f46929a.f(8).d;
        g0();
    }

    public final void k0() {
        boolean z10;
        int i9;
        int i10;
        qs qsVar = this.d;
        if (qsVar != null && qsVar.E) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f35430o0 == z10 && !TextUtils.isEmpty(this.V.f30664r.getHint())) {
            return;
        }
        fg.g gVar = this.V.f30664r;
        if (z10) {
            i9 = R.string.SearchPeopleByUsername;
        } else {
            i9 = R.string.SearchContacts;
        }
        gVar.setHint(LocaleController.getString(i9));
        fg.g gVar2 = this.V.f30664r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        gVar2.setContentDescription(LocaleController.getString(i10));
        this.f35430o0 = z10;
    }

    public final void l0() {
        float f10 = 1.0f;
        float f11 = 1.0f - this.f35415c.f47775e;
        qs qsVar = this.d;
        org.telegram.ui.Components.j10.d(this.f35435s, f11 * ((qsVar == null || qsVar.E) ? 0.0f : 0.0f));
    }

    public final void m0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.Q != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.oc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else if (this.O != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        if (canAddAdmins) {
                            c2Var.N = LocaleController.getString(R.string.AddBotAdminAlert);
                            c2Var.P = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new yr(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            c2Var.P = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(c2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                c2Var2.N = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.Q, UserObject.getUserName(user));
                if (!user.bot && this.L) {
                    formatStringSimple = aa.d.z(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.f6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new ss(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                c2Var2.P = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new a7(this, user, editTextBoldCursor, 11));
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
        ts tsVar = this.S;
        if (tsVar != null) {
            tsVar.b(user);
            if (this.N) {
                this.S = null;
            }
        }
        if (this.M) {
            finishFragment();
        }
    }

    public final void n0() {
        this.actionBar.r();
        int childCount = this.f35420f.getChildCount();
        int i9 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i9 < childCount) {
                View childAt = this.f35420f.getChildAt(i9);
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
                i9++;
            } else {
                hVar.b();
                this.f35417d0.c(0.0f, true);
                return;
            }
        }
    }

    public final void o0(b5.e eVar) {
        this.S = eVar;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                n0();
                return false;
            }
        } else if (this.f35415c.f47776f) {
            if (z10) {
                this.V.f30664r.getText().clear();
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
        if (this.f35421f0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f35421f0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.w(parentActivity, new js(this, 0)).f22702a;
                    this.W = c2Var;
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
        org.telegram.ui.ActionBar.c2 c2Var = this.W;
        if (c2Var != null && dialog == c2Var && getParentActivity() != null && this.X) {
            e0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i9;
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.f35421f0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.C = bundle.getBoolean("onlyUsers", false);
            this.F = this.arguments.getBoolean("destroyAfterSelect", false);
            this.G = this.arguments.getBoolean("returnAsResult", false);
            this.H = this.arguments.getBoolean("createSecretChat", false);
            this.Q = this.arguments.getString("selectAlertString");
            this.R = this.arguments.getBoolean("allowUsernameSearch", true);
            this.L = this.arguments.getBoolean("needForwardCount", true);
            this.K = this.arguments.getBoolean("allowBots", true);
            this.J = this.arguments.getBoolean("allowSelf", true);
            this.O = this.arguments.getLong("channelId", 0L);
            this.M = this.arguments.getBoolean("needFinishFragment", true);
            this.P = this.arguments.getLong("chat_id", 0L);
            this.Y = this.arguments.getBoolean("disableSections", false);
            this.N = this.arguments.getBoolean("resetDelegate", false);
            this.D = this.arguments.getBoolean("needPhonebook", false);
            this.E = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.D = true;
        }
        if (!this.H && !this.G) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        if (this.E) {
            i9 = AndroidUtilities.dp(72.0f);
        } else {
            i9 = 0;
        }
        this.f35425j0 = i9;
        if (this.E) {
            i10 = AndroidUtilities.dp(64.0f);
        }
        this.f35426k0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.S = null;
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.m0 = i12;
        i0();
        h0();
        g0();
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
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (i9 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10 && "android.permission.READ_CONTACTS".equals(strArr[i10])) {
                    if (iArr[i10] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.X = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f35422g0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(String str) {
        this.T = str;
    }

    public final void q0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.va;
        boolean z12 = false;
        a0.h hVar = this.Z;
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
                h6Var.s(false, true);
            } else if (h6Var.getUser() != null) {
                hVar.k(h6Var.getUser(), dialogId2);
                h6Var.s(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                n0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.N(null, null);
            this.f35417d0.c(1.0f, true);
        }
        this.f35414b0.a(hVar.m(), z12);
    }

    @Override
    public final void s() {
        if (this.f35428n.L0() < 15) {
            this.f35420f.x0(0);
        } else {
            c2.y yVar = this.h;
            yVar.f2255b = 1;
            yVar.c(0, 0, false, false);
        }
        this.f35413b.a(true, true);
    }

    @Override
    public final ng.d y() {
        return this.f35434r0;
    }

    @Override
    public final void K() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
