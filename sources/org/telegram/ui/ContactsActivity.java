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
public class ContactsActivity extends org.telegram.ui.ActionBar.m2 implements me.d, NotificationCenter.NotificationCenterDelegate, dh0, ph.d {
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
    public at W;
    public String X;
    public ci.r6 Y;
    public org.telegram.ui.Components.t20 Z;
    public final int f33753a;
    public org.telegram.ui.ActionBar.a2 f33754a0;
    public final me.b f33755b;
    public boolean f33756b0;
    public final me.b f33757c;
    public boolean f33758c0;
    public xs d;
    public final a0.i f33759d0;
    public org.telegram.ui.Components.by0 f33760e;
    public ImageView f33761e0;
    public org.telegram.ui.Components.rm0 f33762f;
    public NumberTextView f33763f0;
    public org.telegram.ui.ActionBar.u0 f33764g0;
    public org.telegram.ui.Components.ul0 h;
    public org.telegram.ui.ActionBar.f2 f33765h0;
    public String f33766i0;
    public boolean f33767j0;
    public long f33768k0;
    public boolean f33769l0;
    public final v5 m0;
    public s4.d0 f33770n;
    public int f33771n0;
    public int f33772o0;
    public float f33773p0;
    public int phonebookRow;
    public int f33774q0;
    public ws f33775r;
    public int f33776r0;
    public org.telegram.ui.ActionBar.u0 f33777s;
    public boolean f33778s0;
    public final ah.h f33779t0;
    public final fh.d f33780u0;
    public boolean v;
    public final fh.d f33781v0;
    public org.telegram.ui.Components.q20 f33782w;
    public ah.n f33783w0;
    public boolean f33784x;
    public final ArrayList f33785x0;
    public u8 f33786y;
    public final RectF f33787y0;
    public final RectF f33788z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33753a = i10;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f33755b = new me.b(0, this, isVar, 350L, false);
        this.f33757c = new me.b(2, this, isVar, 350L, false);
        this.phonebookRow = 0;
        this.f33784x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f33756b0 = true;
        this.f33759d0 = new a0.i();
        this.f33767j0 = true;
        this.m0 = new v5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f33785x0 = arrayList;
        RectF rectF = new RectF();
        this.f33787y0 = rectF;
        RectF rectF2 = new RectF();
        this.f33788z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f33779t0 = new ah.h(false);
            this.f33780u0 = new fh.d(null);
            this.f33781v0 = new fh.d(null);
            return;
        }
        this.f33779t0 = null;
        this.f33780u0 = null;
        this.f33781v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.i iVar = contactsActivity.f33759d0;
        s4.i0 adapter = contactsActivity.f33762f.getAdapter();
        ws wsVar = contactsActivity.f33775r;
        if (adapter == wsVar) {
            wsVar.getClass();
            Object E = contactsActivity.f33775r.E(i11);
            if (!iVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() != null && i6Var.getUser().contact) {
                    contactsActivity.r0(i6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ws wsVar2 = contactsActivity.f33775r;
                int size = wsVar2.d.size();
                int size2 = wsVar2.H.size();
                gg.b2 b2Var = wsVar2.f10814f;
                int size3 = b2Var.f10534e.size();
                int size4 = b2Var.f10538j.size();
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
                    if (user.f20215id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20215id);
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
                    ck0 ck0Var = new ck0(contactsActivity.getParentActivity(), contactsActivity);
                    ck0Var.x(str2, true);
                    ck0Var.show();
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
                org.telegram.ui.Components.q20 q20Var = contactsActivity.f33782w;
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
                            contactsActivity.presentFragment(new k80());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new i9(null));
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
                        contactsActivity.presentFragment(new c70(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new ld(org.telegram.ui.Cells.c1.f(0, "step")));
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
                        bundle2.putLong("user_id", user2.f20215id);
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
                        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.y2(contactsActivity, str, false, 24));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f20404a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.rm0 rm0Var = contactsActivity.f33762f;
        if (rm0Var != null) {
            int childCount = rm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f33762f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.xa) {
                    ((org.telegram.ui.Cells.xa) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) childAt).v(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f33761e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21209y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f33761e0.setBackground(org.telegram.ui.ActionBar.h6.g0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21227z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        u8 u8Var = contactsActivity.f33786y;
        if (u8Var != null) {
            u8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7));
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
        contactsActivity.f33756b0 = z10;
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
            new ck0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f33762f.getY() + contactsActivity.f33762f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f33762f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f33762f.getChildAt(i11);
            contactsActivity.f33762f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.o0 X = contactsActivity.f33762f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.rm0 rm0Var = contactsActivity.f33762f;
                X.a(rect, childAt, rm0Var, rm0Var.f3165u0);
                float y10 = contactsActivity.f33762f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f33762f.getY() + contactsActivity.f33762f.getPaddingTop(), contactsActivity.f33757c.f16401e) - AndroidUtilities.dp(48.0f));
        me.b bVar = contactsActivity.f33755b;
        if (y3 > (contactsActivity.f33762f.getY() + contactsActivity.f33762f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        xs xsVar;
        boolean z10;
        org.telegram.ui.Components.q20 q20Var = contactsActivity.f33782w;
        if (q20Var != null && (xsVar = contactsActivity.d) != null) {
            if (contactsActivity.f33784x && !contactsActivity.F && !xsVar.I) {
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
        org.telegram.ui.Components.rm0 rm0Var = this.f33762f;
        if (rm0Var != null && rm0Var.getFastScroll() != null && this.f33762f.getFastScroll().f33400n) {
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
        this.f33765h0 = f2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(f2Var);
        }
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(context, this.resourceProvider);
        this.Z = t20Var;
        t20Var.f31040w = true;
        t20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        t20Var.e();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        j3.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f33761e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f33761e0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.f33761e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21209y8), PorterDuff.Mode.MULTIPLY));
            this.f33761e0.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21227z8), 1, -1));
            this.f33761e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f42291b;

                {
                    this.f42291b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f42291b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f42291b);
                            return;
                    }
                }
            });
            j3.addView(this.f33761e0, w7.x5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f33763f0 = numberTextView;
        int i13 = 18;
        numberTextView.setTextSize(18);
        this.f33763f0.setTypeface(AndroidUtilities.bold());
        this.f33763f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21209y8));
        NumberTextView numberTextView2 = this.f33763f0;
        if (!this.I) {
            i13 = 72;
        }
        j3.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, i13, 0, 0));
        int i14 = 2;
        this.f33763f0.setOnTouchListener(new bi.d(2));
        j3.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new vs(this));
        org.telegram.ui.ActionBar.y o9 = this.actionBar.o();
        org.telegram.ui.ActionBar.u0 a2 = o9.a(0, R.drawable.outline_header_search);
        this.f33764g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ci.g2 g2Var = this.Z.f31038r;
        g2Var.addTextChangedListener(new yf.g0(g2Var, new hg.e2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.u0 a10 = o9.a(1, i11);
            this.f33777s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f33762f = new org.telegram.ui.Components.rm0(context, null);
        this.f33775r = new ws(this, context, this.f33759d0, this.V, this.O, this.N);
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
        xs xsVar = new xs(this, context, this.G ? 1 : 0, this.H, this.f33759d0, i10);
        this.d = xsVar;
        if (this.f33777s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        xsVar.Y(i14, false);
        this.d.H = this.f33758c0;
        u8 u8Var = new u8(this, context, 3);
        this.f33786y = u8Var;
        this.fragmentView = u8Var;
        org.telegram.ui.Components.rm0 rm0Var = this.f33762f;
        Objects.requireNonNull(rm0Var);
        this.f33783w0 = new ah.n(rm0Var, u8Var, new us(rm0Var, 0));
        this.f33762f.C0(new rs(this, 1));
        this.f33762f.setSections(true);
        this.f33786y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        k10Var.setViewType(29);
        k10Var.f27916w = false;
        org.telegram.ui.Components.by0 by0Var = new org.telegram.ui.Components.by0(context, k10Var, 1, null);
        this.f33760e = by0Var;
        by0Var.addView(k10Var, 0);
        this.f33760e.setAnimateLayoutChange(true);
        this.f33760e.e(true, false);
        this.f33760e.d.setText(LocaleController.getString(R.string.NoResult));
        this.f33760e.f25123e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f33786y.addView(this.f33760e, w7.x5.a(-1.0f, 12.0f, 64.0f, 12.0f, 0.0f, -1, 119));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.f47822m = false;
        this.f33762f.setItemAnimator(jVar);
        this.f33762f.setSectionsType(1);
        this.f33762f.setVerticalScrollBarEnabled(false);
        this.f33762f.setFastScrollEnabled(0);
        org.telegram.ui.Components.rm0 rm0Var2 = this.f33762f;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f33770n = d0Var;
        rm0Var2.setLayoutManager(d0Var);
        this.f33762f.setAdapter(this.d);
        this.f33762f.setClipToPadding(false);
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0(this.f33762f, this.f33770n);
        this.h = ul0Var;
        ul0Var.h = new ss(this);
        u8 u8Var2 = this.f33786y;
        org.telegram.ui.Components.rm0 rm0Var3 = this.f33762f;
        float f7 = -this.f33753a;
        u8Var2.addView(rm0Var3, w7.x5.a(-1.0f, 0.0f, f7, 0.0f, f7, -1, 3));
        this.f33786y.addView(this.Z, w7.x5.a(52.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        this.f33762f.setEmptyView(this.f33760e);
        org.telegram.ui.Components.rm0 rm0Var4 = this.f33762f;
        rm0Var4.W1 = true;
        rm0Var4.X1 = 0;
        rm0Var4.setOnItemClickListener(new i2.s(this, i10, 10));
        this.f33762f.setOnItemLongClickListener(new ss(this));
        this.f33762f.setOnScrollListener(new ys(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(context, this.resourceProvider, false);
            this.f33782w = q20Var;
            this.f33786y.addView(q20Var, org.telegram.ui.Components.q20.b());
            this.f33782w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f42291b;

                {
                    this.f42291b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f42291b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f42291b);
                            return;
                    }
                }
            });
            this.f33782w.f30088c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f33782w.f30088c.getAnimatedDrawable().M(this.f33782w.f30088c.getAnimatedDrawable().f25810e[0] - 1);
            this.f33782w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.y(str);
            this.X = null;
        }
        this.f33786y.addView(this.actionBar);
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.Y = r6Var;
        r6Var.b(false, false);
        this.f33786y.addView(this.Y, w7.x5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f33762f);
        this.actionBar.setDrawBlurBackground(this.f33786y);
        this.f33755b.a(true, false);
        l0();
        setBulletinDelegate(new x8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33852g1.d.add(this);
        }
        View view = this.fragmentView;
        ss ssVar = new ss(this);
        WeakHashMap weakHashMap = r0.i0.f46890a;
        r0.a0.i(view, ssVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.rm0 rm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            xs xsVar = this.d;
            if (xsVar != null) {
                if (!this.v) {
                    xsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f33775r != null) {
                s4.i0 adapter = this.f33762f.getAdapter();
                ws wsVar = this.f33775r;
                if (adapter == wsVar) {
                    wsVar.G(this.f33766i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (rm0Var = this.f33762f) != null) {
                int childCount = rm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f33762f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.xa) {
                        ((org.telegram.ui.Cells.xa) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f33769l0) {
                this.f33769l0 = true;
                v5 v5Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                AndroidUtilities.runOnUIThread(v5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f20076id);
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
            if (z10 && this.f33756b0) {
                showDialog(org.telegram.ui.Components.g5.v(parentActivity, new qs(this, 1)).f20404a);
                return;
            }
            this.f33768k0 = SystemClock.elapsedRealtime();
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
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f33779t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f33774q0) - AndroidUtilities.dp(8.0f);
            this.f33787y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33788z0;
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
            hVar.g(i10, this.f33785x0);
            hVar.e(this.f33783w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20822d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21101s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20969l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20988m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21008n7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21207y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21007n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, org.telegram.ui.ActionBar.h6.f21075r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21025o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20987m6));
        org.telegram.ui.Components.q20 q20Var = this.f33782w;
        if (q20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(q20Var.f30088c, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33782w.f30088c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33782w.f30088c, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20908i1}, null, org.telegram.ui.ActionBar.h6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20854f1}, null, org.telegram.ui.ActionBar.h6.f21228z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.h6.Q0, null, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.h6.P0, null, null, org.telegram.ui.ActionBar.h6.f21042p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33762f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.by0 by0Var = this.f33760e;
        if (by0Var != null) {
            by0Var.b(Math.max(this.f33774q0 + this.f33771n0, this.f33776r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.q20 q20Var = this.f33782w;
        if (q20Var != null) {
            q20Var.setTranslationY(((-this.f33774q0) - this.f33772o0) - this.f33773p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.k1 k1Var) {
        this.f33776r0 = k1Var.f46901a.f(8).d;
        h0();
    }

    public final void j0() {
        org.telegram.ui.Components.rm0 rm0Var = this.f33762f;
        int i10 = this.f33753a;
        rm0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f33774q0 + this.f33771n0);
    }

    public final void k0() {
        org.telegram.ui.Components.q20.d(this.f33764g0, (1.0f - this.f33757c.f16401e) * (1.0f - this.f33755b.f16401e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        xs xsVar = this.d;
        if (xsVar != null && xsVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33778s0 == z10 && !TextUtils.isEmpty(this.Z.f31038r.getHint())) {
            return;
        }
        ci.g2 g2Var = this.Z.f31038r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        g2Var.setHint(LocaleController.getString(i10));
        ci.g2 g2Var2 = this.Z.f31038r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        g2Var2.setContentDescription(LocaleController.getString(i11));
        this.f33778s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f33757c.f16401e;
        xs xsVar = this.d;
        org.telegram.ui.Components.q20.d(this.f33777s, f10 * ((xsVar == null || xsVar.I) ? 0.0f : 0.0f));
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
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                        if (canAddAdmins) {
                            a2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            a2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.y2(this, user, str));
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
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20404a;
                a2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a1.g.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.h6.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new zs(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                a2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new z6(this, user, editTextBoldCursor, 11));
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
        at atVar = this.W;
        if (atVar != null) {
            atVar.b(user);
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
        int childCount = this.f33762f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.i iVar = this.f33759d0;
            if (i10 < childCount) {
                View childAt = this.f33762f.getChildAt(i10);
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
                this.f33765h0.c(0.0f, true);
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
        } else if (this.f33757c.f16402f) {
            if (z10) {
                this.Z.f31038r.getText().clear();
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
        if (this.f33767j0 && (parentActivity = getParentActivity()) != null) {
            this.f33767j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(parentActivity, new qs(this, 0)).f20404a;
                    this.f33754a0 = a2Var;
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
        org.telegram.ui.ActionBar.a2 a2Var = this.f33754a0;
        if (a2Var != null && dialog == a2Var && getParentActivity() != null && this.f33756b0) {
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
        this.f33767j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f33758c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f33771n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f33772o0 = i11;
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
        this.f33774q0 = i13;
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
                    this.f33756b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f33768k0 < 200) {
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
        xs xsVar = this.d;
        if (xsVar != null) {
            xsVar.l();
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
        a0.i iVar = this.f33759d0;
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
            this.f33765h0.c(1.0f, true);
        }
        this.f33763f0.a(iVar.m(), z12);
    }

    @Override
    public final void s() {
        if (this.f33770n.L0() < 15) {
            this.f33762f.x0(0);
        } else {
            org.telegram.ui.Components.ul0 ul0Var = this.h;
            ul0Var.f31630b = 1;
            ul0Var.c(0, 0, false, false);
        }
        this.f33755b.a(true, true);
    }

    @Override
    public final fh.d y() {
        return this.f33781v0;
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
