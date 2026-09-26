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
public class ContactsActivity extends org.telegram.ui.ActionBar.m2 implements le.e, NotificationCenter.NotificationCenterDelegate, xg0, ph.d {
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
    public xs W;
    public String X;
    public ci.r6 Y;
    public org.telegram.ui.Components.d20 Z;
    public final int f31019a;
    public org.telegram.ui.ActionBar.a2 f31020a0;
    public final le.c f31021b;
    public boolean f31022b0;
    public final le.c f31023c;
    public boolean f31024c0;
    public us d;
    public final a0.i f31025d0;
    public org.telegram.ui.Components.jx0 e;
    public ImageView f31026e0;
    public org.telegram.ui.Components.xl0 f31027f;
    public NumberTextView f31028f0;
    public org.telegram.ui.ActionBar.u0 f31029g0;
    public org.telegram.ui.Components.al0 h;
    public org.telegram.ui.ActionBar.f2 f31030h0;
    public String f31031i0;
    public boolean f31032j0;
    public long f31033k0;
    public boolean f31034l0;
    public final w5 m0;
    public s4.c0 f31035n;
    public int f31036n0;
    public int f31037o0;
    public float f31038p0;
    public int phonebookRow;
    public int f31039q0;
    public ts f31040r;
    public int f31041r0;
    public org.telegram.ui.ActionBar.u0 f31042s;
    public boolean f31043s0;
    public final ah.h f31044t0;
    public final fh.d f31045u0;
    public boolean v;
    public final fh.d f31046v0;
    public org.telegram.ui.Components.a20 f31047w;
    public ah.n f31048w0;
    public boolean f31049x;
    public final ArrayList f31050x0;
    public w8 f31051y;
    public final RectF f31052y0;
    public final RectF f31053z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f31019a = i10;
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
        this.f31021b = new le.c(0, this, srVar, 350L, false);
        this.f31023c = new le.c(2, this, srVar, 350L, false);
        this.phonebookRow = 0;
        this.f31049x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f31022b0 = true;
        this.f31025d0 = new a0.i();
        this.f31032j0 = true;
        this.m0 = new w5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f31050x0 = arrayList;
        RectF rectF = new RectF();
        this.f31052y0 = rectF;
        RectF rectF2 = new RectF();
        this.f31053z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f31044t0 = new ah.h(false);
            this.f31045u0 = new fh.d(null);
            this.f31046v0 = new fh.d(null);
            return;
        }
        this.f31044t0 = null;
        this.f31045u0 = null;
        this.f31046v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.i iVar = contactsActivity.f31025d0;
        s4.h0 adapter = contactsActivity.f31027f.getAdapter();
        ts tsVar = contactsActivity.f31040r;
        if (adapter == tsVar) {
            tsVar.getClass();
            Object E = contactsActivity.f31040r.E(i11);
            if (!iVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() != null && i6Var.getUser().contact) {
                    contactsActivity.r0(i6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ts tsVar2 = contactsActivity.f31040r;
                int size = tsVar2.d.size();
                int size2 = tsVar2.H.size();
                gg.c2 c2Var = tsVar2.f9929f;
                int size3 = c2Var.e.size();
                int size4 = c2Var.f9677j.size();
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
                    if (user.f18482id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18482id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new wn(bundle), contactsActivity.Q);
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
                    wj0 wj0Var = new wj0(contactsActivity.getParentActivity(), contactsActivity);
                    wj0Var.v(str2, true);
                    wj0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.e5.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.uq)) {
                org.telegram.ui.Components.a20 a20Var = contactsActivity.f31047w;
                if (a20Var != null) {
                    a20Var.performClick();
                }
            } else if (!iVar.i() && (view instanceof org.telegram.ui.Cells.za)) {
                contactsActivity.r0((org.telegram.ui.Cells.za) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new g80());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new k9(null));
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
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                        m2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new z60(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new ld(org.telegram.ui.Cells.c1.g(0, "step")));
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
                        bundle2.putLong("user_id", user2.f18482id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new wn(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.w2(23, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f18661a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.xl0 xl0Var = contactsActivity.f31027f;
        if (xl0Var != null) {
            int childCount = xl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f31027f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.za) {
                    ((org.telegram.ui.Cells.za) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f31026e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f19444y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f31026e0.setBackground(org.telegram.ui.ActionBar.h6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f19463z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        w8 w8Var = contactsActivity.f31051y;
        if (w8Var != null) {
            w8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7));
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
        contactsActivity.f31022b0 = z10;
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
            new wj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f31027f.getY() + contactsActivity.f31027f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f31027f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f31027f.getChildAt(i11);
            contactsActivity.f31027f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.n0 X = contactsActivity.f31027f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.xl0 xl0Var = contactsActivity.f31027f;
                X.a(rect, childAt, xl0Var, xl0Var.f2855t0);
                float y10 = contactsActivity.f31027f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f31027f.getY() + contactsActivity.f31027f.getPaddingTop(), contactsActivity.f31023c.e) - AndroidUtilities.dp(48.0f));
        le.c cVar = contactsActivity.f31021b;
        if (y3 > (contactsActivity.f31027f.getY() + contactsActivity.f31027f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        cVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        us usVar;
        boolean z10;
        org.telegram.ui.Components.a20 a20Var = contactsActivity.f31047w;
        if (a20Var != null && (usVar = contactsActivity.d) != null) {
            if (contactsActivity.f31049x && !contactsActivity.F && !usVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            a20Var.e(z10, true);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
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
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.xl0 xl0Var = this.f31027f;
        if (xl0Var != null && xl0Var.getFastScroll() != null && this.f31027f.getFastScroll().f23987n) {
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
        int i13;
        this.F = false;
        this.E = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.J) {
            if (this.K) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (this.L) {
                    i13 = R.string.NewSecretChat;
                } else {
                    i13 = R.string.NewMessageTitle;
                }
                kVar.setTitle(LocaleController.getString(i13));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f31030h0 = f2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(f2Var);
        }
        org.telegram.ui.Components.d20 d20Var = new org.telegram.ui.Components.d20(context, this.resourceProvider);
        this.Z = d20Var;
        d20Var.f23477w = true;
        d20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        d20Var.e();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        j3.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f31026e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f31026e0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.f31026e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f19444y8), PorterDuff.Mode.MULTIPLY));
            this.f31026e0.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(org.telegram.ui.ActionBar.h6.f19463z8), 1, -1));
            this.f31026e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f36977b;

                {
                    this.f36977b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f36977b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f36977b);
                            return;
                    }
                }
            });
            j3.addView(this.f31026e0, w7.y5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f31028f0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f31028f0.setTypeface(AndroidUtilities.bold());
        this.f31028f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19444y8));
        NumberTextView numberTextView2 = this.f31028f0;
        if (this.I) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.y5.m(1.0f, 0, -1, i10, 0, 0));
        int i14 = 2;
        this.f31028f0.setOnTouchListener(new bi.d(2));
        j3.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ss(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f31029g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ci.h2 h2Var = this.Z.f23475r;
        h2Var.addTextChangedListener(new yf.g0(h2Var, new hg.e2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i12 = R.drawable.msg_contacts_time;
            } else {
                i12 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.u0 a10 = n10.a(1, i12);
            this.f31042s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f31027f = new org.telegram.ui.Components.xl0(context, null);
        this.f31040r = new ts(this, context, this.f31025d0, this.V, this.O, this.N);
        if (this.T != 0) {
            i11 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.T)), 3) ? 1 : 0;
        } else {
            if (this.S != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                }
            }
            i11 = 0;
        }
        us usVar = new us(this, context, this.G ? 1 : 0, this.H, this.f31025d0, i11);
        this.d = usVar;
        if (this.f31042s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        usVar.Y(i14, false);
        this.d.H = this.f31024c0;
        w8 w8Var = new w8(this, context, 3);
        this.f31051y = w8Var;
        this.fragmentView = w8Var;
        org.telegram.ui.Components.xl0 xl0Var = this.f31027f;
        Objects.requireNonNull(xl0Var);
        this.f31048w0 = new ah.n(xl0Var, w8Var, new rs(xl0Var, 0));
        this.f31027f.C0(new os(this, 1));
        this.f31027f.setSections(true);
        this.f31051y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7));
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        v00Var.setViewType(29);
        v00Var.f28952w = false;
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, v00Var, 1, null);
        this.e = jx0Var;
        jx0Var.addView(v00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f31051y.addView(this.e, w7.y5.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.f42994m = false;
        this.f31027f.setItemAnimator(jVar);
        this.f31027f.setSectionsType(1);
        this.f31027f.setVerticalScrollBarEnabled(false);
        this.f31027f.setFastScrollEnabled(0);
        org.telegram.ui.Components.xl0 xl0Var2 = this.f31027f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f31035n = c0Var;
        xl0Var2.setLayoutManager(c0Var);
        this.f31027f.setAdapter(this.d);
        this.f31027f.setClipToPadding(false);
        org.telegram.ui.Components.al0 al0Var = new org.telegram.ui.Components.al0(this.f31027f, this.f31035n);
        this.h = al0Var;
        al0Var.h = new ps(this);
        w8 w8Var2 = this.f31051y;
        org.telegram.ui.Components.xl0 xl0Var3 = this.f31027f;
        float f7 = -this.f31019a;
        w8Var2.addView(xl0Var3, w7.y5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.f31051y.addView(this.Z, w7.y5.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f31027f.setEmptyView(this.e);
        org.telegram.ui.Components.xl0 xl0Var4 = this.f31027f;
        xl0Var4.Y1 = true;
        xl0Var4.Z1 = 0;
        xl0Var4.setOnItemClickListener(new i2.s(this, i11, 10));
        this.f31027f.setOnItemLongClickListener(new ps(this));
        this.f31027f.setOnScrollListener(new vs(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
            this.f31047w = a20Var;
            this.f31051y.addView(a20Var, org.telegram.ui.Components.a20.b());
            this.f31047w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f36977b;

                {
                    this.f36977b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f36977b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f36977b);
                            return;
                    }
                }
            });
            this.f31047w.f22512c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f31047w.f22512c.getAnimatedDrawable().M(this.f31047w.f22512c.getAnimatedDrawable().e[0] - 1);
            this.f31047w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.x(str);
            this.X = null;
        }
        this.f31051y.addView(this.actionBar);
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.Y = r6Var;
        r6Var.b(false, false);
        this.f31051y.addView(this.Y, w7.y5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f31027f);
        this.actionBar.setDrawBlurBackground(this.f31051y);
        this.f31021b.a(true, false);
        l0();
        setBulletinDelegate(new z8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31112g1.d.add(this);
        }
        View view = this.fragmentView;
        ps psVar = new ps(this);
        WeakHashMap weakHashMap = r0.i0.f42127a;
        r0.a0.j(view, psVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.xl0 xl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            us usVar = this.d;
            if (usVar != null) {
                if (!this.v) {
                    usVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f31040r != null) {
                s4.h0 adapter = this.f31027f.getAdapter();
                ts tsVar = this.f31040r;
                if (adapter == tsVar) {
                    tsVar.G(this.f31031i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (xl0Var = this.f31027f) != null) {
                int childCount = xl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f31027f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.za) {
                        ((org.telegram.ui.Cells.za) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f31034l0) {
                this.f31034l0 = true;
                w5 w5Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f18343id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new wn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f31022b0) {
                showDialog(org.telegram.ui.Components.e5.w(parentActivity, new ns(this, 1)).f18661a);
                return;
            }
            this.f31033k0 = SystemClock.elapsedRealtime();
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
        ah.h hVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f31044t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f31039q0) - AndroidUtilities.dp(8.0f);
            this.f31052y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f31053z0;
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
            hVar.g(i10, this.f31050x0);
            hVar.e(this.f31048w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19205l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19224m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19244n7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f19442y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f19243n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.h6.f19310r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19260o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19223m6));
        org.telegram.ui.Components.a20 a20Var = this.f31047w;
        if (a20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(a20Var.f22512c, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31047w.f22512c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31047w.f22512c, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19143i1}, null, org.telegram.ui.ActionBar.h6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19090f1}, null, org.telegram.ui.ActionBar.h6.f19464z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.h6.Q0, null, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.h6.P0, null, null, org.telegram.ui.ActionBar.h6.f19278p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31027f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.jx0 jx0Var = this.e;
        if (jx0Var != null) {
            jx0Var.b(Math.max(this.f31039q0 + this.f31036n0, this.f31041r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.a20 a20Var = this.f31047w;
        if (a20Var != null) {
            a20Var.setTranslationY(((-this.f31039q0) - this.f31037o0) - this.f31038p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f31041r0 = l1Var.f42139a.f(8).d;
        h0();
    }

    public final void j0() {
        org.telegram.ui.Components.xl0 xl0Var = this.f31027f;
        int i10 = this.f31019a;
        xl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f31039q0 + this.f31036n0);
    }

    public final void k0() {
        org.telegram.ui.Components.a20.d(this.f31029g0, (1.0f - this.f31023c.e) * (1.0f - this.f31021b.e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        us usVar = this.d;
        if (usVar != null && usVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f31043s0 == z10 && !TextUtils.isEmpty(this.Z.f23475r.getHint())) {
            return;
        }
        ci.h2 h2Var = this.Z.f23475r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        h2Var.setHint(LocaleController.getString(i10));
        ci.h2 h2Var2 = this.Z.f23475r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        h2Var2.setContentDescription(LocaleController.getString(i11));
        this.f31043s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f31023c.e;
        us usVar = this.d;
        org.telegram.ui.Components.a20.d(this.f31042s, f10 * ((usVar == null || usVar.I) ? 0.0f : 0.0f));
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
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                        if (canAddAdmins) {
                            a2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            a2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.w2(this, user, str));
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
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18661a;
                a2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a4.a.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19165j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.h6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new ws(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                a2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new b7(this, user, editTextBoldCursor, 11));
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
        xs xsVar = this.W;
        if (xsVar != null) {
            xsVar.b(user);
            if (this.R) {
                this.W = null;
            }
        }
        if (this.Q) {
            finishFragment();
        }
    }

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f31027f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.i iVar = this.f31025d0;
            if (i10 < childCount) {
                View childAt = this.f31027f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.za) {
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                    if (iVar.h(zaVar.getDialogId()) >= 0) {
                        zaVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (iVar.h(i6Var.getDialogId()) >= 0) {
                        i6Var.s(false, true);
                    }
                }
                i10++;
            } else {
                iVar.b();
                this.f31030h0.c(0.0f, true);
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
        } else if (this.f31023c.f14201f) {
            if (z10) {
                this.Z.f23475r.getText().clear();
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
        if (this.f31032j0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f31032j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.e5.w(parentActivity, new ns(this, 0)).f18661a;
                    this.f31020a0 = a2Var;
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
        org.telegram.ui.ActionBar.a2 a2Var = this.f31020a0;
        if (a2Var != null && dialog == a2Var && getParentActivity() != null && this.f31022b0) {
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
        this.f31032j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f31024c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f31036n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f31037o0 = i11;
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
        this.f31039q0 = i13;
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
                    this.f31022b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f31033k0 < 200) {
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
        us usVar = this.d;
        if (usVar != null) {
            usVar.l();
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

    @Override
    public final void r() {
        if (this.f31035n.L0() < 15) {
            this.f31027f.x0(0);
        } else {
            org.telegram.ui.Components.al0 al0Var = this.h;
            al0Var.f22685b = 1;
            al0Var.c(0, 0, false, false);
        }
        this.f31021b.a(true, true);
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.za;
        boolean z12 = false;
        a0.i iVar = this.f31025d0;
        if (z11) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) viewGroup;
            long dialogId = zaVar.getDialogId();
            if (iVar.h(dialogId) >= 0) {
                iVar.l(dialogId);
                zaVar.c(false, true);
            } else if (zaVar.getCurrentObject() instanceof TLRPC.User) {
                iVar.k((TLRPC.User) zaVar.getCurrentObject(), dialogId);
                zaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.i6) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) viewGroup;
            long dialogId2 = i6Var.getDialogId();
            if (iVar.h(dialogId2) >= 0) {
                iVar.l(dialogId2);
                i6Var.s(false, true);
            } else if (i6Var.getUser() != null) {
                iVar.k(i6Var.getUser(), dialogId2);
                i6Var.s(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.actionBar.s()) {
            if (iVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.f31030h0.c(1.0f, true);
        }
        this.f31028f0.a(iVar.m(), z12);
    }

    @Override
    public final fh.d x() {
        return this.f31046v0;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
