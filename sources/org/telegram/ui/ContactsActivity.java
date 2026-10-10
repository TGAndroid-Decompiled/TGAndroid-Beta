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
public class ContactsActivity extends org.telegram.ui.ActionBar.n2 implements me.d, NotificationCenter.NotificationCenterDelegate, eh0, ph.d {
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
    public bt W;
    public String X;
    public ci.r6 Y;
    public org.telegram.ui.Components.t20 Z;
    public final int f33729a;
    public org.telegram.ui.ActionBar.b2 f33730a0;
    public final me.b f33731b;
    public boolean f33732b0;
    public final me.b f33733c;
    public boolean f33734c0;
    public ys d;
    public final a0.i f33735d0;
    public org.telegram.ui.Components.by0 f33736e;
    public ImageView f33737e0;
    public org.telegram.ui.Components.rm0 f33738f;
    public NumberTextView f33739f0;
    public org.telegram.ui.ActionBar.v0 f33740g0;
    public org.telegram.ui.Components.ul0 h;
    public org.telegram.ui.ActionBar.g2 f33741h0;
    public String f33742i0;
    public boolean f33743j0;
    public long f33744k0;
    public boolean f33745l0;
    public final w5 m0;
    public s4.d0 f33746n;
    public int f33747n0;
    public int f33748o0;
    public float f33749p0;
    public int phonebookRow;
    public int f33750q0;
    public xs f33751r;
    public int f33752r0;
    public org.telegram.ui.ActionBar.v0 f33753s;
    public boolean f33754s0;
    public final ah.h f33755t0;
    public final fh.d f33756u0;
    public boolean v;
    public final fh.d f33757v0;
    public org.telegram.ui.Components.q20 f33758w;
    public ah.n f33759w0;
    public boolean f33760x;
    public final ArrayList f33761x0;
    public v8 f33762y;
    public final RectF f33763y0;
    public final RectF f33764z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33729a = i10;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f33731b = new me.b(0, this, isVar, 350L, false);
        this.f33733c = new me.b(2, this, isVar, 350L, false);
        this.phonebookRow = 0;
        this.f33760x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f33732b0 = true;
        this.f33735d0 = new a0.i();
        this.f33743j0 = true;
        this.m0 = new w5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f33761x0 = arrayList;
        RectF rectF = new RectF();
        this.f33763y0 = rectF;
        RectF rectF2 = new RectF();
        this.f33764z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f33755t0 = new ah.h(false);
            this.f33756u0 = new fh.d(null);
            this.f33757v0 = new fh.d(null);
            return;
        }
        this.f33755t0 = null;
        this.f33756u0 = null;
        this.f33757v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.i iVar = contactsActivity.f33735d0;
        s4.i0 adapter = contactsActivity.f33738f.getAdapter();
        xs xsVar = contactsActivity.f33751r;
        if (adapter == xsVar) {
            xsVar.getClass();
            Object E = contactsActivity.f33751r.E(i11);
            if (!iVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() != null && i6Var.getUser().contact) {
                    contactsActivity.r0(i6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                xs xsVar2 = contactsActivity.f33751r;
                int size = xsVar2.d.size();
                int size2 = xsVar2.H.size();
                gg.b2 b2Var = xsVar2.f10815f;
                int size3 = b2Var.f10535e.size();
                int size4 = b2Var.f10539j.size();
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
                    if (user.f20189id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20189id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new zn(bundle), contactsActivity.Q);
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
                    dk0 dk0Var = new dk0(contactsActivity.getParentActivity(), contactsActivity);
                    dk0Var.x(str2, true);
                    dk0Var.show();
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
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.ir)) {
                org.telegram.ui.Components.q20 q20Var = contactsActivity.f33758w;
                if (q20Var != null) {
                    q20Var.performClick();
                }
            } else if (!iVar.i() && (view instanceof org.telegram.ui.Cells.xa)) {
                contactsActivity.r0((org.telegram.ui.Cells.xa) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new l80());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new j9(null));
                    }
                } else if (i10 != 0) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j3 = contactsActivity.T;
                        if (j3 == 0) {
                            j3 = contactsActivity.S;
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                        n2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new c70(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")));
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
                        bundle2.putLong("user_id", user2.f20189id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new zn(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.y2(23, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f20378a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.rm0 rm0Var = contactsActivity.f33738f;
        if (rm0Var != null) {
            int childCount = rm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f33738f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.xa) {
                    ((org.telegram.ui.Cells.xa) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) childAt).v(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f33737e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f33737e0.setBackground(org.telegram.ui.ActionBar.i6.g0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        v8 v8Var = contactsActivity.f33762y;
        if (v8Var != null) {
            v8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f20745a7));
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
        contactsActivity.f33732b0 = z10;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new dk0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f33738f.getY() + contactsActivity.f33738f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f33738f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f33738f.getChildAt(i11);
            contactsActivity.f33738f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.o0 X = contactsActivity.f33738f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.rm0 rm0Var = contactsActivity.f33738f;
                X.a(rect, childAt, rm0Var, rm0Var.f3165u0);
                float y10 = contactsActivity.f33738f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f33738f.getY() + contactsActivity.f33738f.getPaddingTop(), contactsActivity.f33733c.f16341e) - AndroidUtilities.dp(48.0f));
        me.b bVar = contactsActivity.f33731b;
        if (y3 > (contactsActivity.f33738f.getY() + contactsActivity.f33738f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        ys ysVar;
        boolean z10;
        org.telegram.ui.Components.q20 q20Var = contactsActivity.f33758w;
        if (q20Var != null && (ysVar = contactsActivity.d) != null) {
            if (contactsActivity.f33760x && !contactsActivity.F && !ysVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            q20Var.e(z10, true);
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.rm0 rm0Var = this.f33738f;
        if (rm0Var != null && rm0Var.getFastScroll() != null && this.f33738f.getFastScroll().f33346n) {
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
        this.f33741h0 = g2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(g2Var);
        }
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(context, this.resourceProvider);
        this.Z = t20Var;
        t20Var.f30960w = true;
        t20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        t20Var.e();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        j3.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f33737e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f33737e0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f33737e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8), PorterDuff.Mode.MULTIPLY));
            this.f33737e0.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8), 1, -1));
            this.f33737e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f42591b;

                {
                    this.f42591b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f42591b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f42591b);
                            return;
                    }
                }
            });
            j3.addView(this.f33737e0, w7.x5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f33739f0 = numberTextView;
        int i13 = 18;
        numberTextView.setTextSize(18);
        this.f33739f0.setTypeface(AndroidUtilities.bold());
        this.f33739f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8));
        NumberTextView numberTextView2 = this.f33739f0;
        if (!this.I) {
            i13 = 72;
        }
        j3.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, i13, 0, 0));
        int i14 = 2;
        this.f33739f0.setOnTouchListener(new bi.d(2));
        j3.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ws(this));
        org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
        org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.outline_header_search);
        this.f33740g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ci.g2 g2Var2 = this.Z.f30958r;
        g2Var2.addTextChangedListener(new yf.g0(g2Var2, new hg.e2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.v0 a10 = o9.a(1, i11);
            this.f33753s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f33738f = new org.telegram.ui.Components.rm0(context, null);
        this.f33751r = new xs(this, context, this.f33735d0, this.V, this.O, this.N);
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
        ys ysVar = new ys(this, context, this.G ? 1 : 0, this.H, this.f33735d0, i10);
        this.d = ysVar;
        if (this.f33753s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        ysVar.Y(i14, false);
        this.d.H = this.f33734c0;
        v8 v8Var = new v8(this, context, 3);
        this.f33762y = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.rm0 rm0Var = this.f33738f;
        Objects.requireNonNull(rm0Var);
        this.f33759w0 = new ah.n(rm0Var, v8Var, new vs(rm0Var, 0));
        this.f33738f.C0(new ss(this, 1));
        this.f33738f.setSections(true);
        this.f33762y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20745a7));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        k10Var.setViewType(29);
        k10Var.f27857w = false;
        org.telegram.ui.Components.by0 by0Var = new org.telegram.ui.Components.by0(context, k10Var, 1, null);
        this.f33736e = by0Var;
        by0Var.addView(k10Var, 0);
        this.f33736e.setAnimateLayoutChange(true);
        this.f33736e.e(true, false);
        this.f33736e.d.setText(LocaleController.getString(R.string.NoResult));
        this.f33736e.f25085e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f33762y.addView(this.f33736e, w7.x5.a(-1.0f, 12.0f, 64.0f, 12.0f, 0.0f, -1, 119));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.f47742m = false;
        this.f33738f.setItemAnimator(jVar);
        this.f33738f.setSectionsType(1);
        this.f33738f.setVerticalScrollBarEnabled(false);
        this.f33738f.setFastScrollEnabled(0);
        org.telegram.ui.Components.rm0 rm0Var2 = this.f33738f;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f33746n = d0Var;
        rm0Var2.setLayoutManager(d0Var);
        this.f33738f.setAdapter(this.d);
        this.f33738f.setClipToPadding(false);
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0(this.f33738f, this.f33746n);
        this.h = ul0Var;
        ul0Var.h = new ts(this);
        v8 v8Var2 = this.f33762y;
        org.telegram.ui.Components.rm0 rm0Var3 = this.f33738f;
        float f7 = -this.f33729a;
        v8Var2.addView(rm0Var3, w7.x5.a(-1.0f, 0.0f, f7, 0.0f, f7, -1, 3));
        this.f33762y.addView(this.Z, w7.x5.a(52.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        this.f33738f.setEmptyView(this.f33736e);
        org.telegram.ui.Components.rm0 rm0Var4 = this.f33738f;
        rm0Var4.W1 = true;
        rm0Var4.X1 = 0;
        rm0Var4.setOnItemClickListener(new i2.s(this, i10, 10));
        this.f33738f.setOnItemLongClickListener(new ts(this));
        this.f33738f.setOnScrollListener(new zs(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(context, this.resourceProvider, false);
            this.f33758w = q20Var;
            this.f33762y.addView(q20Var, org.telegram.ui.Components.q20.b());
            this.f33758w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f42591b;

                {
                    this.f42591b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f42591b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f42591b);
                            return;
                    }
                }
            });
            this.f33758w.f29985c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f33758w.f29985c.getAnimatedDrawable().M(this.f33758w.f29985c.getAnimatedDrawable().f25732e[0] - 1);
            this.f33758w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.y(str);
            this.X = null;
        }
        this.f33762y.addView(this.actionBar);
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.Y = r6Var;
        r6Var.b(false, false);
        this.f33762y.addView(this.Y, w7.x5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f33738f);
        this.actionBar.setDrawBlurBackground(this.f33762y);
        this.f33731b.a(true, false);
        l0();
        setBulletinDelegate(new y8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33828g1.d.add(this);
        }
        View view = this.fragmentView;
        ts tsVar = new ts(this);
        WeakHashMap weakHashMap = r0.i0.f46810a;
        r0.a0.i(view, tsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.rm0 rm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            ys ysVar = this.d;
            if (ysVar != null) {
                if (!this.v) {
                    ysVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f33751r != null) {
                s4.i0 adapter = this.f33738f.getAdapter();
                xs xsVar = this.f33751r;
                if (adapter == xsVar) {
                    xsVar.G(this.f33742i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (rm0Var = this.f33738f) != null) {
                int childCount = rm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f33738f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.xa) {
                        ((org.telegram.ui.Cells.xa) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f33745l0) {
                this.f33745l0 = true;
                w5 w5Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f20050id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new zn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f33732b0) {
                showDialog(org.telegram.ui.Components.g5.v(parentActivity, new rs(this, 1)).f20378a);
                return;
            }
            this.f33744k0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void g0() {
        ah.h hVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f33755t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f33750q0) - AndroidUtilities.dp(8.0f);
            this.f33763y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33764z0;
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
            hVar.g(i10, this.f33761x0);
            hVar.e(this.f33759w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20801d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21079s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20948l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20967m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20987n7));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21185y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f20986n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21004o6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20966m6));
        org.telegram.ui.Components.q20 q20Var = this.f33758w;
        if (q20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(q20Var.f29985c, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33758w.f29985c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33758w.f29985c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20887i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20833f1}, null, org.telegram.ui.ActionBar.i6.f21206z9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.i6.Q0, null, null, org.telegram.ui.ActionBar.i6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.f21021p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33738f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.by0 by0Var = this.f33736e;
        if (by0Var != null) {
            by0Var.b(Math.max(this.f33750q0 + this.f33747n0, this.f33752r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.q20 q20Var = this.f33758w;
        if (q20Var != null) {
            q20Var.setTranslationY(((-this.f33750q0) - this.f33748o0) - this.f33749p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.k1 k1Var) {
        this.f33752r0 = k1Var.f46821a.f(8).d;
        h0();
    }

    public final void j0() {
        org.telegram.ui.Components.rm0 rm0Var = this.f33738f;
        int i10 = this.f33729a;
        rm0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f33750q0 + this.f33747n0);
    }

    public final void k0() {
        org.telegram.ui.Components.q20.d(this.f33740g0, (1.0f - this.f33733c.f16341e) * (1.0f - this.f33731b.f16341e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        ys ysVar = this.d;
        if (ysVar != null && ysVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33754s0 == z10 && !TextUtils.isEmpty(this.Z.f30958r.getHint())) {
            return;
        }
        ci.g2 g2Var = this.Z.f30958r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        g2Var.setHint(LocaleController.getString(i10));
        ci.g2 g2Var2 = this.Z.f30958r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        g2Var2.setContentDescription(LocaleController.getString(i11));
        this.f33754s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f33733c.f16341e;
        ys ysVar = this.d;
        org.telegram.ui.Components.q20.d(this.f33753s, f10 * ((ysVar == null || ysVar.I) ? 0.0f : 0.0f));
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.U != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.ad.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    } else if (this.S != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                        if (canAddAdmins) {
                            b2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            b2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.y2(this, user, str));
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
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20378a;
                b2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a1.g.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20909j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.i6.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new at(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                b2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new a7(this, user, editTextBoldCursor, 11));
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
        bt btVar = this.W;
        if (btVar != null) {
            btVar.b(user);
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
        int childCount = this.f33738f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.i iVar = this.f33735d0;
            if (i10 < childCount) {
                View childAt = this.f33738f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.xa) {
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) childAt;
                    if (iVar.h(xaVar.getDialogId()) >= 0) {
                        xaVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (iVar.h(i6Var.getDialogId()) >= 0) {
                        i6Var.t(false, true);
                    }
                }
                i10++;
            } else {
                iVar.b();
                this.f33741h0.c(0.0f, true);
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
        } else if (this.f33733c.f16342f) {
            if (z10) {
                this.Z.f30958r.getText().clear();
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
        if (this.f33743j0 && (parentActivity = getParentActivity()) != null) {
            this.f33743j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.v(parentActivity, new rs(this, 0)).f20378a;
                    this.f33730a0 = b2Var;
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
        org.telegram.ui.ActionBar.b2 b2Var = this.f33730a0;
        if (b2Var != null && dialog == b2Var && getParentActivity() != null && this.f33732b0) {
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
        this.f33743j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f33734c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f33747n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f33748o0 = i11;
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
        this.f33750q0 = i13;
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
                    this.f33732b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f33744k0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
        ys ysVar = this.d;
        if (ysVar != null) {
            ysVar.l();
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
        a0.i iVar = this.f33735d0;
        if (z11) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) viewGroup;
            long dialogId = xaVar.getDialogId();
            if (iVar.h(dialogId) >= 0) {
                iVar.l(dialogId);
                xaVar.c(false, true);
            } else if (xaVar.getCurrentObject() instanceof TLRPC.User) {
                iVar.k((TLRPC.User) xaVar.getCurrentObject(), dialogId);
                xaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.i6) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) viewGroup;
            long dialogId2 = i6Var.getDialogId();
            if (iVar.h(dialogId2) >= 0) {
                iVar.l(dialogId2);
                i6Var.t(false, true);
            } else if (i6Var.getUser() != null) {
                iVar.k(i6Var.getUser(), dialogId2);
                i6Var.t(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.actionBar.t()) {
            if (iVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.f33741h0.c(1.0f, true);
        }
        this.f33739f0.a(iVar.m(), z12);
    }

    @Override
    public final void s() {
        if (this.f33746n.L0() < 15) {
            this.f33738f.x0(0);
        } else {
            org.telegram.ui.Components.ul0 ul0Var = this.h;
            ul0Var.f31548b = 1;
            ul0Var.c(0, 0, false, false);
        }
        this.f33731b.a(true, true);
    }

    @Override
    public final fh.d y() {
        return this.f33757v0;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
