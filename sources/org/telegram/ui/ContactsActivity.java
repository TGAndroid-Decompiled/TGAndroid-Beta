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
public class ContactsActivity extends org.telegram.ui.ActionBar.o2 implements vd.b, NotificationCenter.NotificationCenterDelegate, mg0, ah.d {
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
    public ss S;
    public String T;
    public cg.i0 U;
    public org.telegram.ui.Components.x10 V;
    public org.telegram.ui.ActionBar.c2 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final int f35478a;
    public ImageView f35479a0;
    public final vd.a f35480b;
    public NumberTextView f35481b0;
    public final vd.a f35482c;
    public org.telegram.ui.ActionBar.w0 f35483c0;
    public ps d;
    public org.telegram.ui.ActionBar.h2 f35484d0;
    public org.telegram.ui.Components.qw0 f35485e;
    public String f35486e0;
    public org.telegram.ui.Components.jl0 f35487f;
    public boolean f35488f0;
    public long f35489g0;
    public c2.z h;
    public boolean f35490h0;
    public final w5 f35491i0;
    public int f35492j0;
    public int f35493k0;
    public float f35494l0;
    public int m0;
    public f2.j0 f35495n;
    public int f35496n0;
    public boolean f35497o0;
    public final lg.e f35498p0;
    public int phonebookRow;
    public final qg.d f35499q0;
    public os f35500r;
    public final qg.d f35501r0;
    public org.telegram.ui.ActionBar.w0 f35502s;
    public lg.k f35503s0;
    public final ArrayList f35504t0;
    public final RectF f35505u0;
    public boolean v;
    public final RectF f35506v0;
    public org.telegram.ui.Components.u10 f35507w;
    public boolean f35508x;
    public ih.j4 f35509y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f35478a = i10;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.f35480b = new vd.a(0, this, jrVar, 350L, false);
        this.f35482c = new vd.a(2, this, jrVar, 350L, false);
        this.phonebookRow = 0;
        this.f35508x = true;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.Q = null;
        this.R = true;
        this.X = true;
        this.Z = new a0.h();
        this.f35488f0 = true;
        this.f35491i0 = new w5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f35504t0 = arrayList;
        RectF rectF = new RectF();
        this.f35505u0 = rectF;
        RectF rectF2 = new RectF();
        this.f35506v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f35498p0 = new lg.e(false);
            this.f35499q0 = new qg.d(null);
            this.f35501r0 = new qg.d(null);
            return;
        }
        this.f35498p0 = null;
        this.f35499q0 = null;
        this.f35501r0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.Z;
        f2.p0 adapter = contactsActivity.f35487f.getAdapter();
        os osVar = contactsActivity.f35500r;
        if (adapter == osVar) {
            osVar.getClass();
            Object E = contactsActivity.f35500r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.f6)) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                if (f6Var.getUser() != null && f6Var.getUser().contact) {
                    contactsActivity.r0(f6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                os osVar2 = contactsActivity.f35500r;
                int size = osVar2.d.size();
                int size2 = osVar2.D.size();
                rf.k1 k1Var = osVar2.f47195f;
                int size3 = k1Var.f47280e.size();
                int size4 = k1Var.f47284j.size();
                if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (contactsActivity.G) {
                    contactsActivity.n0(user, true, null);
                    return;
                } else if (contactsActivity.H) {
                    if (user.f22539id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.I = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22539id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new tn(bundle), contactsActivity.M);
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
                    kj0 kj0Var = new kj0(contactsActivity.getParentActivity(), contactsActivity);
                    kj0Var.v(str2, true);
                    kj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.c5.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.mq)) {
                org.telegram.ui.Components.u10 u10Var = contactsActivity.f35507w;
                if (u10Var != null) {
                    u10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.sa)) {
                contactsActivity.r0((org.telegram.ui.Cells.sa) view);
            } else if ((!contactsActivity.C || i10 != 0) && S == 0) {
                if (contactsActivity.D) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            c.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new s70());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new h9(null));
                    }
                } else if (i10 != 0) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            c.b(contactsActivity.currentAccount);
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
                        c.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new m60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        c.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new hd(a4.w.h(0, "step")));
                        return;
                    }
                    contactsActivity.presentFragment(new i(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.G) {
                        contactsActivity.n0(user2, true, null);
                    } else if (contactsActivity.H) {
                        contactsActivity.I = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f22539id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new tn(bundle2), contactsActivity.M);
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
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new xr(1, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f22714a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.jl0 jl0Var = contactsActivity.f35487f;
        if (jl0Var != null) {
            int childCount = jl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f35487f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.sa) {
                    ((org.telegram.ui.Cells.sa) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f35479a0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f35479a0.setBackground(org.telegram.ui.ActionBar.g6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
        }
        org.telegram.ui.ActionBar.l lVar = contactsActivity.actionBar;
        if (lVar != null) {
            lVar.e();
        }
        ih.j4 j4Var = contactsActivity.f35509y;
        if (j4Var != null) {
            j4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
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
        contactsActivity.f0(false);
    }

    public static void X(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            c.b(contactsActivity.currentAccount);
        } else {
            new kj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y8 = contactsActivity.f35487f.getY() + contactsActivity.f35487f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f35487f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f35487f.getChildAt(i11);
            contactsActivity.f35487f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                f2.v0 X = contactsActivity.f35487f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.jl0 jl0Var = contactsActivity.f35487f;
                X.a(rect, childAt, jl0Var, jl0Var.f1847p0);
                float y10 = contactsActivity.f35487f.getY();
                float y11 = childAt.getY();
                if (contactsActivity.d.G) {
                    i10 = 0;
                } else {
                    i10 = rect.top;
                }
                y8 = y10 + (y11 - i10);
            } else if (R > 0) {
                y8 = -AndroidUtilities.dp(52.0f);
                break;
            } else {
                i11++;
            }
        }
        contactsActivity.V.setTranslationY(AndroidUtilities.lerp(y8, contactsActivity.f35487f.getY() + contactsActivity.f35487f.getPaddingTop(), contactsActivity.f35482c.f49505e) - AndroidUtilities.dp(48.0f));
        vd.a aVar = contactsActivity.f35480b;
        if (y8 > (contactsActivity.f35487f.getY() + contactsActivity.f35487f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        aVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        ps psVar;
        boolean z10;
        org.telegram.ui.Components.u10 u10Var = contactsActivity.f35507w;
        if (u10Var != null && (psVar = contactsActivity.d) != null) {
            if (contactsActivity.f35508x && !contactsActivity.B && !psVar.E) {
                z10 = true;
            } else {
                z10 = false;
            }
            u10Var.e(z10, true);
        }
    }

    @Override
    public final View M() {
        return this.fragmentView;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.jl0 jl0Var = this.f35487f;
        if (jl0Var != null && jl0Var.getFastScroll() != null && this.f35487f.getFastScroll().f32680n) {
            return false;
        }
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
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
        this.B = false;
        this.A = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.F) {
            if (this.G) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (this.H) {
                    i13 = R.string.NewSecretChat;
                } else {
                    i13 = R.string.NewMessageTitle;
                }
                lVar.setTitle(LocaleController.getString(i13));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f35484d0 = h2Var;
        if (!this.E) {
            this.actionBar.setBackButtonDrawable(h2Var);
        }
        org.telegram.ui.Components.x10 x10Var = new org.telegram.ui.Components.x10(context, this.resourceProvider);
        this.V = x10Var;
        x10Var.f34548w = true;
        x10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        x10Var.e();
        this.V.setPivotY(0.0f);
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.E) {
            ImageView imageView = new ImageView(context);
            this.f35479a0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f35479a0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.f35479a0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            this.f35479a0.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
            this.f35479a0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f40269b;

                {
                    this.f40269b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40269b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f40269b);
                            return;
                    }
                }
            });
            j10.addView(this.f35479a0, i7.f6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f35481b0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f35481b0.setTypeface(AndroidUtilities.bold());
        this.f35481b0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
        NumberTextView numberTextView2 = this.f35481b0;
        if (this.E) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j10.addView(numberTextView2, i7.f6.m(1.0f, 0, -1, i10, 0, 0));
        int i14 = 2;
        this.f35481b0.setOnTouchListener(new mh.d(2));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ns(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f35483c0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ig.f fVar = this.V.f34546r;
        fVar.addTextChangedListener(new jf.n0(fVar, new bb(this, 6)));
        if (!this.H && !this.G) {
            if (this.v) {
                i12 = R.drawable.msg_contacts_time;
            } else {
                i12 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, i12);
            this.f35502s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f35487f = new org.telegram.ui.Components.jl0(context, null);
        this.f35500r = new os(this, context, this.Z, this.R, this.K, this.J);
        if (this.P != 0) {
            i11 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.P)), 3) ? 1 : 0;
        } else {
            if (this.O != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                }
            }
            i11 = 0;
        }
        ps psVar = new ps(this, context, this.C ? 1 : 0, this.D, this.Z, i11);
        this.d = psVar;
        if (this.f35502s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        psVar.Y(i14, false);
        this.d.D = this.Y;
        ih.j4 j4Var = new ih.j4(this, context, 4);
        this.f35509y = j4Var;
        this.fragmentView = j4Var;
        org.telegram.ui.Components.jl0 jl0Var = this.f35487f;
        Objects.requireNonNull(jl0Var);
        this.f35503s0 = new lg.k(jl0Var, j4Var, new ms(jl0Var, 0));
        this.f35487f.C0(new js(this, 1));
        this.f35487f.setSections(true);
        this.f35509y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        p00Var.setViewType(29);
        p00Var.f31529w = false;
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, p00Var, 1, null);
        this.f35485e = qw0Var;
        qw0Var.addView(p00Var, 0);
        this.f35485e.setAnimateLayoutChange(true);
        this.f35485e.e(true, false);
        this.f35485e.d.setText(LocaleController.getString(R.string.NoResult));
        this.f35485e.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f35509y.addView(this.f35485e, i7.f6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.l lVar2 = new f2.l();
        lVar2.C = false;
        lVar2.n(150L);
        lVar2.f6463m = false;
        this.f35487f.setItemAnimator(lVar2);
        this.f35487f.setSectionsType(1);
        this.f35487f.setVerticalScrollBarEnabled(false);
        this.f35487f.setFastScrollEnabled(0);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f35487f;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f35495n = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        this.f35487f.setAdapter(this.d);
        this.f35487f.setClipToPadding(false);
        c2.z zVar = new c2.z(this.f35487f, this.f35495n);
        this.h = zVar;
        zVar.h = new ks(this);
        ih.j4 j4Var2 = this.f35509y;
        org.telegram.ui.Components.jl0 jl0Var3 = this.f35487f;
        float f9 = -this.f35478a;
        j4Var2.addView(jl0Var3, i7.f6.d(-1, -1.0f, 3, 0.0f, f9, 0.0f, f9));
        this.f35509y.addView(this.V, i7.f6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f35487f.setEmptyView(this.f35485e);
        org.telegram.ui.Components.jl0 jl0Var4 = this.f35487f;
        jl0Var4.U1 = true;
        jl0Var4.V1 = 0;
        jl0Var4.setOnItemClickListener(new eg.n2(this, i11, 8));
        this.f35487f.setOnItemLongClickListener(new ks(this));
        this.f35487f.setOnScrollListener(new qs(this));
        if (!this.H && !this.G) {
            org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
            this.f35507w = u10Var;
            this.f35509y.addView(u10Var, org.telegram.ui.Components.u10.b());
            this.f35507w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f40269b;

                {
                    this.f40269b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40269b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f40269b);
                            return;
                    }
                }
            });
            this.f35507w.f33090c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f35507w.f33090c.getAnimatedDrawable().K(this.f35507w.f33090c.getAnimatedDrawable().f34737e[0] - 1);
            this.f35507w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.T;
        if (str != null) {
            this.actionBar.x(str);
            this.T = null;
        }
        this.f35509y.addView(this.actionBar);
        cg.i0 i0Var = new cg.i0(context, this.parentLayout);
        this.U = i0Var;
        i0Var.b(false, false);
        this.f35509y.addView(this.U, i7.f6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f35487f);
        this.actionBar.setDrawBlurBackground(this.f35509y);
        this.f35480b.a(true, false);
        l0();
        setBulletinDelegate(new w8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35568c1.d.add(this);
        }
        View view = this.fragmentView;
        ks ksVar = new ks(this);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(view, ksVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.jl0 jl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            ps psVar = this.d;
            if (psVar != null) {
                if (!this.v) {
                    psVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f35500r != null) {
                f2.p0 adapter = this.f35487f.getAdapter();
                os osVar = this.f35500r;
                if (adapter == osVar) {
                    osVar.G(this.f35486e0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (jl0Var = this.f35487f) != null) {
                int childCount = jl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f35487f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.sa) {
                        ((org.telegram.ui.Cells.sa) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f35490h0) {
                this.f35490h0 = true;
                w5 w5Var = this.f35491i0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.H && this.I) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f22400id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new tn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.I) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.X) {
                showDialog(org.telegram.ui.Components.c5.w(parentActivity, new is(this, 1)).f22714a);
                return;
            }
            this.f35489g0 = SystemClock.elapsedRealtime();
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

    public final void g0() {
        lg.e eVar;
        float f9;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f35498p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.m0) - AndroidUtilities.dp(8.0f);
            this.f35505u0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f35506v0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f9 = 0.0f;
            } else {
                f9 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f9);
            if (this.E) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f35504t0);
            eVar.e(this.f35503s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 12);
        if (!this.E) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 524288, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23207l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23224m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23242n7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23260o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        org.telegram.ui.Components.u10 u10Var = this.f35507w;
        if (u10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(u10Var.f33090c, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35507w.f33090c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35507w.f33090c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23147i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23094f1}, null, org.telegram.ui.ActionBar.g6.f23453z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.f23278p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35487f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.qw0 qw0Var = this.f35485e;
        if (qw0Var != null) {
            qw0Var.b(Math.max(this.m0 + this.f35492j0, this.f35496n0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.u10 u10Var = this.f35507w;
        if (u10Var != null) {
            u10Var.setTranslationY(((-this.m0) - this.f35493k0) - this.f35494l0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.jl0 jl0Var = this.f35487f;
        int i10 = this.f35478a;
        jl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.m0 + this.f35492j0);
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f35496n0 = m1Var.f46843a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.u10.d(this.f35483c0, (1.0f - this.f35482c.f49505e) * (1.0f - this.f35480b.f49505e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        ps psVar = this.d;
        if (psVar != null && psVar.E) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f35497o0 == z10 && !TextUtils.isEmpty(this.V.f34546r.getHint())) {
            return;
        }
        ig.f fVar = this.V.f34546r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        fVar.setHint(LocaleController.getString(i10));
        ig.f fVar2 = this.V.f34546r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        fVar2.setContentDescription(LocaleController.getString(i11));
        this.f35497o0 = z10;
    }

    public final void m0() {
        float f9 = 1.0f;
        float f10 = 1.0f - this.f35482c.f49505e;
        ps psVar = this.d;
        org.telegram.ui.Components.u10.d(this.f35502s, f10 * ((psVar == null || psVar.E) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.Q != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.tc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else if (this.O != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        if (canAddAdmins) {
                            c2Var.N = LocaleController.getString(R.string.AddBotAdminAlert);
                            c2Var.P = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new xr(this, user, str));
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
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                c2Var2.N = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.Q, UserObject.getUserName(user));
                if (!user.bot && this.L) {
                    formatStringSimple = a4.w.y(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.g6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new rs(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                c2Var2.P = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new z6(this, user, editTextBoldCursor, 11));
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
        ss ssVar = this.S;
        if (ssVar != null) {
            ssVar.d(user);
            if (this.N) {
                this.S = null;
            }
        }
        if (this.M) {
            finishFragment();
        }
    }

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f35487f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i10 < childCount) {
                View childAt = this.f35487f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.sa) {
                    org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) childAt;
                    if (hVar.h(saVar.getDialogId()) >= 0) {
                        saVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (hVar.h(f6Var.getDialogId()) >= 0) {
                        f6Var.s(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                this.f35484d0.c(0.0f, true);
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
        } else if (this.f35482c.f49506f) {
            if (z10) {
                this.V.f34546r.getText().clear();
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
        if (this.f35488f0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f35488f0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.w(parentActivity, new is(this, 0)).f22714a;
                    this.W = c2Var;
                    showDialog(c2Var);
                    return;
                }
                f0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.c2 c2Var = this.W;
        if (c2Var != null && dialog == c2Var && getParentActivity() != null && this.X) {
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
        this.f35488f0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        int i11 = 0;
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
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f35492j0 = i10;
        if (this.E) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f35493k0 = i11;
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.m0 = i13;
        j0();
        i0();
        h0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.h(true);
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
                    if (SystemClock.elapsedRealtime() - this.f35489g0 < 200) {
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
        ps psVar = this.d;
        if (psVar != null) {
            psVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(com.google.firebase.messaging.i iVar) {
        this.S = iVar;
    }

    public final void q0(String str) {
        this.T = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.sa;
        boolean z12 = false;
        a0.h hVar = this.Z;
        if (z11) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) viewGroup;
            long dialogId = saVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                saVar.c(false, true);
            } else if (saVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) saVar.getCurrentObject(), dialogId);
                saVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) viewGroup;
            long dialogId2 = f6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                f6Var.s(false, true);
            } else if (f6Var.getUser() != null) {
                hVar.k(f6Var.getUser(), dialogId2);
                f6Var.s(true, true);
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
            this.actionBar.O(null, null);
            this.f35484d0.c(1.0f, true);
        }
        this.f35481b0.a(hVar.m(), z12);
    }

    @Override
    public final void s() {
        if (this.f35495n.L0() < 15) {
            this.f35487f.x0(0);
        } else {
            c2.z zVar = this.h;
            zVar.f2933b = 1;
            zVar.c(0, 0, false, false);
        }
        this.f35480b.a(true, true);
    }

    @Override
    public final qg.d y() {
        return this.f35501r0;
    }

    @Override
    public final void I() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
