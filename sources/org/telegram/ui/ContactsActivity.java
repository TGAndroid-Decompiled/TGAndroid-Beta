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
public class ContactsActivity extends org.telegram.ui.ActionBar.p2 implements le.d, NotificationCenter.NotificationCenterDelegate, eh0, oh.d {
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
    public et W;
    public String X;
    public bi.s7 Y;
    public org.telegram.ui.Components.k20 Z;
    public final int f29847a;
    public org.telegram.ui.ActionBar.d2 f29848a0;
    public final le.b f29849b;
    public boolean f29850b0;
    public final le.b f29851c;
    public boolean f29852c0;
    public bt d;
    public final a0.i f29853d0;
    public org.telegram.ui.Components.jx0 e;
    public ImageView f29854e0;
    public org.telegram.ui.Components.vl0 f29855f;
    public NumberTextView f29856f0;
    public org.telegram.ui.ActionBar.w0 f29857g0;
    public org.telegram.ui.Components.yk0 h;
    public org.telegram.ui.ActionBar.i2 f29858h0;
    public String f29859i0;
    public boolean f29860j0;
    public long f29861k0;
    public boolean f29862l0;
    public final x5 m0;
    public s4.c0 f29863n;
    public int f29864n0;
    public int f29865o0;
    public float f29866p0;
    public int phonebookRow;
    public int f29867q0;
    public at f29868r;
    public int f29869r0;
    public org.telegram.ui.ActionBar.w0 f29870s;
    public boolean f29871s0;
    public final zg.e f29872t0;
    public final eh.d f29873u0;
    public boolean v;
    public final eh.d f29874v0;
    public org.telegram.ui.Components.h20 f29875w;
    public zg.k f29876w0;
    public boolean f29877x;
    public final ArrayList f29878x0;
    public w8 f29879y;
    public final RectF f29880y0;
    public final RectF f29881z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f29847a = i10;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.f29849b = new le.b(0, this, wrVar, 350L, false);
        this.f29851c = new le.b(2, this, wrVar, 350L, false);
        this.phonebookRow = 0;
        this.f29877x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f29850b0 = true;
        this.f29853d0 = new a0.i();
        this.f29860j0 = true;
        this.m0 = new x5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f29878x0 = arrayList;
        RectF rectF = new RectF();
        this.f29880y0 = rectF;
        RectF rectF2 = new RectF();
        this.f29881z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f29872t0 = new zg.e(false);
            this.f29873u0 = new eh.d(null);
            this.f29874v0 = new eh.d(null);
            return;
        }
        this.f29872t0 = null;
        this.f29873u0 = null;
        this.f29874v0 = null;
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.i iVar = contactsActivity.f29853d0;
        s4.h0 adapter = contactsActivity.f29855f.getAdapter();
        at atVar = contactsActivity.f29868r;
        if (adapter == atVar) {
            atVar.getClass();
            Object E = contactsActivity.f29868r.E(i11);
            if (!iVar.i() && (view instanceof org.telegram.ui.Cells.j6)) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                if (j6Var.getUser() != null && j6Var.getUser().contact) {
                    contactsActivity.r0(j6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                at atVar2 = contactsActivity.f29868r;
                int size = atVar2.d.size();
                int size2 = atVar2.H.size();
                fg.d2 d2Var = atVar2.f8246f;
                int size3 = d2Var.e.size();
                int size4 = d2Var.f7985j.size();
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
                    if (user.f17342id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f17342id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new eo(bundle), contactsActivity.Q);
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
                    ek0 ek0Var = new ek0(contactsActivity.getParentActivity(), contactsActivity);
                    ek0Var.v(str2, true);
                    ek0Var.show();
                    return;
                }
                return;
            } else if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                org.telegram.ui.Components.d5.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.yq)) {
                org.telegram.ui.Components.h20 h20Var = contactsActivity.f29875w;
                if (h20Var != null) {
                    h20Var.performClick();
                }
            } else if (!iVar.i() && (view instanceof org.telegram.ui.Cells.bb)) {
                contactsActivity.r0((org.telegram.ui.Cells.bb) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new k80());
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
                        ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                        p2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                    }
                } else if (Q == 0) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new e70(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new nd(org.telegram.ui.Cells.r6.e(0, "step")));
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
                        bundle2.putLong("user_id", user2.f17342id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new eo(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.km(17, contactsActivity, str));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f17528a);
                    }
                }
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.vl0 vl0Var = contactsActivity.f29855f;
        if (vl0Var != null) {
            int childCount = vl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f29855f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.bb) {
                    ((org.telegram.ui.Cells.bb) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                    ((org.telegram.ui.Cells.j6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f29854e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f29854e0.setBackground(org.telegram.ui.ActionBar.j6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8), 1, -1));
        }
        org.telegram.ui.ActionBar.l lVar = contactsActivity.actionBar;
        if (lVar != null) {
            lVar.e();
        }
        w8 w8Var = contactsActivity.f29879y;
        if (w8Var != null) {
            w8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
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
        contactsActivity.f29850b0 = z10;
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
            new ek0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f29855f.getY() + contactsActivity.f29855f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f29855f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f29855f.getChildAt(i11);
            contactsActivity.f29855f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.n0 X = contactsActivity.f29855f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.vl0 vl0Var = contactsActivity.f29855f;
                X.a(rect, childAt, vl0Var, vl0Var.f1555t0);
                float y10 = contactsActivity.f29855f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f29855f.getY() + contactsActivity.f29855f.getPaddingTop(), contactsActivity.f29851c.e) - AndroidUtilities.dp(48.0f));
        le.b bVar = contactsActivity.f29849b;
        if (y3 > (contactsActivity.f29855f.getY() + contactsActivity.f29855f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        bt btVar;
        boolean z10;
        org.telegram.ui.Components.h20 h20Var = contactsActivity.f29875w;
        if (h20Var != null && (btVar = contactsActivity.d) != null) {
            if (contactsActivity.f29877x && !contactsActivity.F && !btVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            h20Var.e(z10, true);
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
        org.telegram.ui.Components.vl0 vl0Var = this.f29855f;
        if (vl0Var != null && vl0Var.getFastScroll() != null && this.f29855f.getFastScroll().f22171n) {
            return false;
        }
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
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
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (this.L) {
                    i13 = R.string.NewSecretChat;
                } else {
                    i13 = R.string.NewMessageTitle;
                }
                lVar.setTitle(LocaleController.getString(i13));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f29858h0 = i2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(i2Var);
        }
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20(context, this.resourceProvider);
        this.Z = k20Var;
        k20Var.f24574w = true;
        k20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        k20Var.e();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        j3.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f29854e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f29854e0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.f29854e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8), PorterDuff.Mode.MULTIPLY));
            this.f29854e0.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8), 1, -1));
            this.f29854e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f38807b;

                {
                    this.f38807b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f38807b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f38807b);
                            return;
                    }
                }
            });
            j3.addView(this.f29854e0, w7.a6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f29856f0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f29856f0.setTypeface(AndroidUtilities.bold());
        this.f29856f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8));
        NumberTextView numberTextView2 = this.f29856f0;
        if (this.I) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.a6.m(1.0f, 0, -1, i10, 0, 0));
        int i14 = 2;
        this.f29856f0.setOnTouchListener(new ai.h(2));
        j3.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new zs(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f29857g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        bi.t2 t2Var = this.Z.f24572r;
        t2Var.addTextChangedListener(new xf.h0(t2Var, new gg.m2(this, 7)));
        if (!this.L && !this.K) {
            if (this.v) {
                i12 = R.drawable.msg_contacts_time;
            } else {
                i12 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, i12);
            this.f29870s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f29855f = new org.telegram.ui.Components.vl0(context, null);
        this.f29868r = new at(this, context, this.f29853d0, this.V, this.O, this.N);
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
        bt btVar = new bt(this, context, this.G ? 1 : 0, this.H, this.f29853d0, i11);
        this.d = btVar;
        if (this.f29870s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        btVar.Y(i14, false);
        this.d.H = this.f29852c0;
        w8 w8Var = new w8(this, context, 3);
        this.f29879y = w8Var;
        this.fragmentView = w8Var;
        org.telegram.ui.Components.vl0 vl0Var = this.f29855f;
        Objects.requireNonNull(vl0Var);
        this.f29876w0 = new zg.k(vl0Var, w8Var, new ys(vl0Var, 0));
        this.f29855f.C0(new vs(this, 1));
        this.f29855f.setSections(true);
        this.f29879y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        a10Var.setViewType(29);
        a10Var.f21345w = false;
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, a10Var, 1, null);
        this.e = jx0Var;
        jx0Var.addView(a10Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f29879y.addView(this.e, w7.a6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.f41645m = false;
        this.f29855f.setItemAnimator(jVar);
        this.f29855f.setSectionsType(1);
        this.f29855f.setVerticalScrollBarEnabled(false);
        this.f29855f.setFastScrollEnabled(0);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f29855f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f29863n = c0Var;
        vl0Var2.setLayoutManager(c0Var);
        this.f29855f.setAdapter(this.d);
        this.f29855f.setClipToPadding(false);
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(this.f29855f, this.f29863n);
        this.h = yk0Var;
        yk0Var.h = new ws(this);
        w8 w8Var2 = this.f29879y;
        org.telegram.ui.Components.vl0 vl0Var3 = this.f29855f;
        float f7 = -this.f29847a;
        w8Var2.addView(vl0Var3, w7.a6.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.f29879y.addView(this.Z, w7.a6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f29855f.setEmptyView(this.e);
        org.telegram.ui.Components.vl0 vl0Var4 = this.f29855f;
        vl0Var4.Y1 = true;
        vl0Var4.Z1 = 0;
        vl0Var4.setOnItemClickListener(new i2.s(this, i11, 9));
        this.f29855f.setOnItemLongClickListener(new ws(this));
        this.f29855f.setOnScrollListener(new ct(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
            this.f29875w = h20Var;
            this.f29879y.addView(h20Var, org.telegram.ui.Components.h20.b());
            this.f29875w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f38807b;

                {
                    this.f38807b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f38807b.o0();
                            return;
                        default:
                            ContactsActivity.Y(this.f38807b);
                            return;
                    }
                }
            });
            this.f29875w.f23496c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f29875w.f23496c.getAnimatedDrawable().M(this.f29875w.f23496c.getAnimatedDrawable().e[0] - 1);
            this.f29875w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.x(str);
            this.X = null;
        }
        this.f29879y.addView(this.actionBar);
        bi.s7 s7Var = new bi.s7(context, this.parentLayout);
        this.Y = s7Var;
        s7Var.b(false, false);
        this.f29879y.addView(this.Y, w7.a6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f29855f);
        this.actionBar.setDrawBlurBackground(this.f29879y);
        this.f29849b.a(true, false);
        l0();
        setBulletinDelegate(new z8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f29940g1.d.add(this);
        }
        View view = this.fragmentView;
        ws wsVar = new ws(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(view, wsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.vl0 vl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            bt btVar = this.d;
            if (btVar != null) {
                if (!this.v) {
                    btVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f29868r != null) {
                s4.h0 adapter = this.f29855f.getAdapter();
                at atVar = this.f29868r;
                if (adapter == atVar) {
                    atVar.G(this.f29859i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (vl0Var = this.f29855f) != null) {
                int childCount = vl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f29855f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.bb) {
                        ((org.telegram.ui.Cells.bb) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f29862l0) {
                this.f29862l0 = true;
                x5 x5Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f17203id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new eo(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f29850b0) {
                showDialog(org.telegram.ui.Components.d5.w(parentActivity, new us(this, 1)).f17528a);
                return;
            }
            this.f29861k0 = SystemClock.elapsedRealtime();
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
        zg.e eVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f29872t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f29867q0) - AndroidUtilities.dp(8.0f);
            this.f29880y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f29881z0;
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
            eVar.g(i10, this.f29878x0);
            eVar.e(this.f29876w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18074l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18092m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18111n7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 262148, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 262148, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18126o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        org.telegram.ui.Components.h20 h20Var = this.f29875w;
        if (h20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(h20Var.f23496c, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29875w.f23496c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29875w.f23496c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18012i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17959f1}, null, org.telegram.ui.ActionBar.j6.f18328z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.j6.class}, org.telegram.ui.ActionBar.j6.Q0, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.j6.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.f18143p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29855f, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.jx0 jx0Var = this.e;
        if (jx0Var != null) {
            jx0Var.b(Math.max(this.f29867q0 + this.f29864n0, this.f29869r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.h20 h20Var = this.f29875w;
        if (h20Var != null) {
            h20Var.setTranslationY(((-this.f29867q0) - this.f29865o0) - this.f29866p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f29869r0 = l1Var.f41074a.f(8).d;
        h0();
    }

    public final void j0() {
        org.telegram.ui.Components.vl0 vl0Var = this.f29855f;
        int i10 = this.f29847a;
        vl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f29867q0 + this.f29864n0);
    }

    public final void k0() {
        org.telegram.ui.Components.h20.d(this.f29857g0, (1.0f - this.f29851c.e) * (1.0f - this.f29849b.e));
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        bt btVar = this.d;
        if (btVar != null && btVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29871s0 == z10 && !TextUtils.isEmpty(this.Z.f24572r.getHint())) {
            return;
        }
        bi.t2 t2Var = this.Z.f24572r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        t2Var.setHint(LocaleController.getString(i10));
        bi.t2 t2Var2 = this.Z.f24572r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        t2Var2.setContentDescription(LocaleController.getString(i11));
        this.f29871s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f29851c.e;
        bt btVar = this.d;
        org.telegram.ui.Components.h20.d(this.f29870s, f10 * ((btVar == null || btVar.I) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.U != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.wc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (this.S != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        if (canAddAdmins) {
                            d2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            d2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.km(this, user, str));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        } else {
                            d2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                        showDialog(d2Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                d2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a4.a.C(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.j6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new dt(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                d2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new a7(this, user, editTextBoldCursor, 11));
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
        et etVar = this.W;
        if (etVar != null) {
            etVar.b(user);
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
        int childCount = this.f29855f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.i iVar = this.f29853d0;
            if (i10 < childCount) {
                View childAt = this.f29855f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.bb) {
                    org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) childAt;
                    if (iVar.h(bbVar.getDialogId()) >= 0) {
                        bbVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                    if (iVar.h(j6Var.getDialogId()) >= 0) {
                        j6Var.s(false, true);
                    }
                }
                i10++;
            } else {
                iVar.b();
                this.f29858h0.c(0.0f, true);
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
        } else if (this.f29851c.f12870f) {
            if (z10) {
                this.Z.f24572r.getText().clear();
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
        if (this.f29860j0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f29860j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.w(parentActivity, new us(this, 0)).f17528a;
                    this.f29848a0 = d2Var;
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
        org.telegram.ui.ActionBar.d2 d2Var = this.f29848a0;
        if (d2Var != null && dialog == d2Var && getParentActivity() != null && this.f29850b0) {
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
        this.f29860j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f29852c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f29864n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f29865o0 = i11;
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
        this.f29867q0 = i13;
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
                    this.f29850b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f29861k0 < 200) {
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
        bt btVar = this.d;
        if (btVar != null) {
            btVar.l();
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
        if (this.f29863n.L0() < 15) {
            this.f29855f.x0(0);
        } else {
            org.telegram.ui.Components.yk0 yk0Var = this.h;
            yk0Var.f29444b = 1;
            yk0Var.c(0, 0, false, false);
        }
        this.f29849b.a(true, true);
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.bb;
        boolean z12 = false;
        a0.i iVar = this.f29853d0;
        if (z11) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) viewGroup;
            long dialogId = bbVar.getDialogId();
            if (iVar.h(dialogId) >= 0) {
                iVar.l(dialogId);
                bbVar.c(false, true);
            } else if (bbVar.getCurrentObject() instanceof TLRPC.User) {
                iVar.k((TLRPC.User) bbVar.getCurrentObject(), dialogId);
                bbVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.j6) {
            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) viewGroup;
            long dialogId2 = j6Var.getDialogId();
            if (iVar.h(dialogId2) >= 0) {
                iVar.l(dialogId2);
                j6Var.s(false, true);
            } else if (j6Var.getUser() != null) {
                iVar.k(j6Var.getUser(), dialogId2);
                j6Var.s(true, true);
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
            this.f29858h0.c(1.0f, true);
        }
        this.f29856f0.a(iVar.m(), z12);
    }

    @Override
    public final eh.d x() {
        return this.f29874v0;
    }

    @Override
    public final void L() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
