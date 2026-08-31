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
public class ContactsActivity extends org.telegram.ui.ActionBar.p2 implements xd.b, NotificationCenter.NotificationCenterDelegate, vg0, dh.d {
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
    public at T;
    public String U;
    public fg.i0 V;
    public org.telegram.ui.Components.d20 W;
    public org.telegram.ui.ActionBar.d2 X;
    public boolean Y;
    public boolean Z;
    public final int f34051a;
    public final a0.h f34052a0;
    public final xd.a f34053b;
    public ImageView f34054b0;
    public final xd.a f34055c;
    public NumberTextView f34056c0;
    public xs d;
    public org.telegram.ui.ActionBar.w0 f34057d0;
    public org.telegram.ui.Components.ax0 f34058e;
    public org.telegram.ui.ActionBar.i2 f34059e0;
    public org.telegram.ui.Components.tl0 f34060f;
    public String f34061f0;
    public boolean f34062g0;
    public c2.y h;
    public long f34063h0;
    public boolean f34064i0;
    public final z5 f34065j0;
    public int f34066k0;
    public int f34067l0;
    public float m0;
    public f2.j0 f34068n;
    public int f34069n0;
    public int f34070o0;
    public boolean f34071p0;
    public int phonebookRow;
    public final og.e f34072q0;
    public ws f34073r;
    public final tg.d f34074r0;
    public org.telegram.ui.ActionBar.w0 f34075s;
    public final tg.d f34076s0;
    public og.k f34077t0;
    public final ArrayList f34078u0;
    public boolean v;
    public final RectF f34079v0;
    public org.telegram.ui.Components.a20 f34080w;
    public final RectF f34081w0;
    public boolean f34082x;
    public lh.j4 f34083y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f34051a = i10;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f34053b = new xd.a(0, this, prVar, 350L, false);
        this.f34055c = new xd.a(2, this, prVar, 350L, false);
        this.phonebookRow = 0;
        this.f34082x = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = null;
        this.S = true;
        this.Y = true;
        this.f34052a0 = new a0.h();
        this.f34062g0 = true;
        this.f34065j0 = new z5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f34078u0 = arrayList;
        RectF rectF = new RectF();
        this.f34079v0 = rectF;
        RectF rectF2 = new RectF();
        this.f34081w0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f34072q0 = new og.e(false);
            this.f34074r0 = new tg.d(null);
            this.f34076s0 = new tg.d(null);
            return;
        }
        this.f34072q0 = null;
        this.f34074r0 = null;
        this.f34076s0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.f34052a0;
        f2.p0 adapter = contactsActivity.f34060f.getAdapter();
        ws wsVar = contactsActivity.f34073r;
        if (adapter == wsVar) {
            wsVar.getClass();
            Object E = contactsActivity.f34073r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() != null && h6Var.getUser().contact) {
                    contactsActivity.r0(h6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ws wsVar2 = contactsActivity.f34073r;
                int size = wsVar2.d.size();
                int size2 = wsVar2.E.size();
                uf.k1 k1Var = wsVar2.f48521f;
                int size3 = k1Var.f48621e.size();
                int size4 = k1Var.f48625j.size();
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
                    if (user.f20990id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.J = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20990id);
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
                    uj0 uj0Var = new uj0(contactsActivity.getParentActivity(), contactsActivity);
                    uj0Var.v(str2, true);
                    uj0Var.show();
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
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.sq)) {
                org.telegram.ui.Components.a20 a20Var = contactsActivity.f34080w;
                if (a20Var != null) {
                    a20Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.va)) {
                contactsActivity.r0((org.telegram.ui.Cells.va) view);
            } else if ((!contactsActivity.D || i10 != 0) && S == 0) {
                if (contactsActivity.E) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            c.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new d80());
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
                        contactsActivity.presentFragment(new z60(new Bundle()), false);
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
                        bundle2.putLong("user_id", user2.f20990id);
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
                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rs(0, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f21166a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.tl0 tl0Var = contactsActivity.f34060f;
        if (tl0Var != null) {
            int childCount = tl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f34060f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f34054b0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f22038y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f34054b0.setBackground(org.telegram.ui.ActionBar.k6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f22055z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        lh.j4 j4Var = contactsActivity.f34083y;
        if (j4Var != null) {
            j4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            c.b(contactsActivity.currentAccount);
        } else {
            new uj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y10 = contactsActivity.f34060f.getY() + contactsActivity.f34060f.getPaddingTop();
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f34060f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f34060f.getChildAt(i11);
            contactsActivity.f34060f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                f2.v0 X = contactsActivity.f34060f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.tl0 tl0Var = contactsActivity.f34060f;
                X.a(rect, childAt, tl0Var, tl0Var.f1339q0);
                float y11 = contactsActivity.f34060f.getY();
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
        contactsActivity.W.setTranslationY(AndroidUtilities.lerp(y10, contactsActivity.f34060f.getY() + contactsActivity.f34060f.getPaddingTop(), contactsActivity.f34055c.f50504e) - AndroidUtilities.dp(48.0f));
        xd.a aVar = contactsActivity.f34053b;
        if (y10 > (contactsActivity.f34060f.getY() + contactsActivity.f34060f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z4 = true;
        }
        aVar.a(z4, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        xs xsVar;
        boolean z4;
        org.telegram.ui.Components.a20 a20Var = contactsActivity.f34080w;
        if (a20Var != null && (xsVar = contactsActivity.d) != null) {
            if (contactsActivity.f34082x && !contactsActivity.C && !xsVar.F) {
                z4 = true;
            } else {
                z4 = false;
            }
            a20Var.e(z4, true);
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
        org.telegram.ui.Components.tl0 tl0Var = this.f34060f;
        if (tl0Var != null && tl0Var.getFastScroll() != null && this.f34060f.getFastScroll().f26044n) {
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
        this.f34059e0 = i2Var;
        if (!this.F) {
            this.actionBar.setBackButtonDrawable(i2Var);
        }
        org.telegram.ui.Components.d20 d20Var = new org.telegram.ui.Components.d20(context, this.resourceProvider);
        this.W = d20Var;
        d20Var.f26174w = true;
        d20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        d20Var.e();
        this.W.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.F) {
            ImageView imageView = new ImageView(context);
            this.f34054b0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f34054b0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.f34054b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f22038y8), PorterDuff.Mode.MULTIPLY));
            this.f34054b0.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f22055z8), 1, -1));
            this.f34054b0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f41701b;

                {
                    this.f41701b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f41701b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f41701b);
                            return;
                    }
                }
            });
            j10.addView(this.f34054b0, k7.c6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f34056c0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f34056c0.setTypeface(AndroidUtilities.bold());
        this.f34056c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f22038y8));
        NumberTextView numberTextView2 = this.f34056c0;
        if (this.F) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j10.addView(numberTextView2, k7.c6.m(1.0f, 0, -1, i10, 0, 0));
        this.f34056c0.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new vs(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f34057d0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        lg.f fVar = this.W.f26172r;
        fVar.addTextChangedListener(new lf.n0(fVar, new fb(this, 6)));
        if (!this.I && !this.H) {
            if (this.v) {
                i12 = R.drawable.msg_contacts_time;
            } else {
                i12 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, i12);
            this.f34075s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f34060f = new org.telegram.ui.Components.tl0(context, null);
        this.f34073r = new ws(this, context, this.f34052a0, this.S, this.L, this.K);
        int i14 = 2;
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
        xs xsVar = new xs(this, context, this.D ? 1 : 0, this.E, this.f34052a0, i11);
        this.d = xsVar;
        if (this.f34075s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        xsVar.Y(i14, false);
        this.d.E = this.Z;
        lh.j4 j4Var = new lh.j4(this, context, 4);
        this.f34083y = j4Var;
        this.fragmentView = j4Var;
        org.telegram.ui.Components.tl0 tl0Var = this.f34060f;
        Objects.requireNonNull(tl0Var);
        this.f34077t0 = new og.k(tl0Var, j4Var, new us(tl0Var, 0));
        this.f34060f.C0(new qs(this, 1));
        this.f34060f.setSections(true);
        this.f34083y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(29);
        u00Var.f31509w = false;
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, u00Var, 1, null);
        this.f34058e = ax0Var;
        ax0Var.addView(u00Var, 0);
        this.f34058e.setAnimateLayoutChange(true);
        this.f34058e.e(true, false);
        this.f34058e.d.setText(LocaleController.getString(R.string.NoResult));
        this.f34058e.f25364e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f34083y.addView(this.f34058e, k7.c6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.n(150L);
        lVar.f5910m = false;
        this.f34060f.setItemAnimator(lVar);
        this.f34060f.setSectionsType(1);
        this.f34060f.setVerticalScrollBarEnabled(false);
        this.f34060f.setFastScrollEnabled(0);
        org.telegram.ui.Components.tl0 tl0Var2 = this.f34060f;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f34068n = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        this.f34060f.setAdapter(this.d);
        this.f34060f.setClipToPadding(false);
        c2.y yVar = new c2.y(this.f34060f, this.f34068n);
        this.h = yVar;
        yVar.h = new ss(this);
        lh.j4 j4Var2 = this.f34083y;
        org.telegram.ui.Components.tl0 tl0Var3 = this.f34060f;
        float f10 = -this.f34051a;
        j4Var2.addView(tl0Var3, k7.c6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.f34083y.addView(this.W, k7.c6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f34060f.setEmptyView(this.f34058e);
        org.telegram.ui.Components.tl0 tl0Var4 = this.f34060f;
        tl0Var4.V1 = true;
        tl0Var4.W1 = 0;
        tl0Var4.setOnItemClickListener(new hg.m2(this, i11, 9));
        this.f34060f.setOnItemLongClickListener(new ss(this));
        this.f34060f.setOnScrollListener(new ys(this));
        if (!this.I && !this.H) {
            org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
            this.f34080w = a20Var;
            this.f34083y.addView(a20Var, org.telegram.ui.Components.a20.b());
            this.f34080w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f41701b;

                {
                    this.f41701b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f41701b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f41701b);
                            return;
                    }
                }
            });
            this.f34080w.f25128c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f34080w.f25128c.getAnimatedDrawable().K(this.f34080w.f25128c.getAnimatedDrawable().f27817e[0] - 1);
            this.f34080w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.U;
        if (str != null) {
            this.actionBar.x(str);
            this.U = null;
        }
        this.f34083y.addView(this.actionBar);
        fg.i0 i0Var = new fg.i0(context, this.parentLayout);
        this.V = i0Var;
        i0Var.b(false, false);
        this.f34083y.addView(this.V, k7.c6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f34060f);
        this.actionBar.setDrawBlurBackground(this.f34083y);
        this.f34053b.a(true, false);
        l0();
        setBulletinDelegate(new a9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f34143d1.d.add(this);
        }
        View view = this.fragmentView;
        ss ssVar = new ss(this);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(view, ssVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tl0 tl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            xs xsVar = this.d;
            if (xsVar != null) {
                if (!this.v) {
                    xsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f34073r != null) {
                f2.p0 adapter = this.f34060f.getAdapter();
                ws wsVar = this.f34073r;
                if (adapter == wsVar) {
                    wsVar.G(this.f34061f0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (tl0Var = this.f34060f) != null) {
                int childCount = tl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f34060f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f34064i0) {
                this.f34064i0 = true;
                z5 z5Var = this.f34065j0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.I && this.J) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f20851id);
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
                showDialog(org.telegram.ui.Components.z4.w(parentActivity, new ps(this, 1)).f21166a);
                return;
            }
            this.f34063h0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void g0() {
        og.e eVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f34072q0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f34069n0) - AndroidUtilities.dp(8.0f);
            this.f34079v0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f34081w0;
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
            eVar.g(i10, this.f34078u0);
            eVar.e(this.f34077t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 12);
        if (!this.F) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21804l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21822m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21840n7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 262148, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 262148, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21857o6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
        org.telegram.ui.Components.a20 a20Var = this.f34080w;
        if (a20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(a20Var.f25128c, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34080w.f25128c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34080w.f25128c, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21697f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21678e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21745i1}, null, org.telegram.ui.ActionBar.k6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21691f1}, null, org.telegram.ui.ActionBar.k6.f22056z9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.k6.Q0, null, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.k6.P0, null, null, org.telegram.ui.ActionBar.k6.f21875p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34060f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.ax0 ax0Var = this.f34058e;
        if (ax0Var != null) {
            ax0Var.b(Math.max(this.f34069n0 + this.f34066k0, this.f34070o0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.a20 a20Var = this.f34080w;
        if (a20Var != null) {
            a20Var.setTranslationY(((-this.f34069n0) - this.f34067l0) - this.m0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.tl0 tl0Var = this.f34060f;
        int i10 = this.f34051a;
        tl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f34069n0 + this.f34066k0);
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f34070o0 = m1Var.f46452a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.a20.d(this.f34057d0, (1.0f - this.f34055c.f50504e) * (1.0f - this.f34053b.f50504e));
    }

    public final void l0() {
        boolean z4;
        int i10;
        int i11;
        xs xsVar = this.d;
        if (xsVar != null && xsVar.F) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f34071p0 == z4 && !TextUtils.isEmpty(this.W.f26172r.getHint())) {
            return;
        }
        lg.f fVar = this.W.f26172r;
        if (z4) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        fVar.setHint(LocaleController.getString(i10));
        lg.f fVar2 = this.W.f26172r;
        if (z4) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        fVar2.setContentDescription(LocaleController.getString(i11));
        this.f34071p0 = z4;
    }

    public final void m0() {
        float f10 = 1.0f;
        float f11 = 1.0f - this.f34055c.f50504e;
        xs xsVar = this.d;
        org.telegram.ui.Components.a20.d(this.f34075s, f11 * ((xsVar == null || xsVar.F) ? 0.0f : 0.0f));
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
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    } else if (this.P != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.P));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        if (canAddAdmins) {
                            d2Var.O = LocaleController.getString(R.string.AddBotAdminAlert);
                            d2Var.Q = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new rs(this, user, str));
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
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21166a;
                d2Var2.O = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.R, UserObject.getUserName(user));
                if (!user.bot && this.M) {
                    formatStringSimple = android.support.v4.media.a.z(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21766j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new zs(editTextBoldCursor));
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
        at atVar = this.T;
        if (atVar != null) {
            atVar.b(user);
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
        int childCount = this.f34060f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.f34052a0;
            if (i10 < childCount) {
                View childAt = this.f34060f.getChildAt(i10);
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
                this.f34059e0.c(0.0f, true);
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
        } else if (this.f34055c.f50505f) {
            if (z4) {
                this.W.f26172r.getText().clear();
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
        if (this.f34062g0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f34062g0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(parentActivity, new ps(this, 0)).f21166a;
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
        this.f34062g0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
        this.f34066k0 = i10;
        if (this.F) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f34067l0 = i11;
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
        this.f34069n0 = i13;
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
                    if (SystemClock.elapsedRealtime() - this.f34063h0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
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
        xs xsVar = this.d;
        if (xsVar != null) {
            xsVar.l();
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
        a0.h hVar = this.f34052a0;
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
            this.f34059e0.c(1.0f, true);
        }
        this.f34056c0.a(hVar.m(), z11);
    }

    @Override
    public final void s() {
        if (this.f34068n.L0() < 15) {
            this.f34060f.x0(0);
        } else {
            c2.y yVar = this.h;
            yVar.f2206b = 1;
            yVar.c(0, 0, false, false);
        }
        this.f34053b.a(true, true);
    }

    @Override
    public final tg.d y() {
        return this.f34076s0;
    }

    @Override
    public final void I() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
