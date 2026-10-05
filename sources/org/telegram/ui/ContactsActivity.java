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
public class ContactsActivity extends org.telegram.ui.ActionBar.n2 implements le.d, NotificationCenter.NotificationCenterDelegate, bh0, ph.d {
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
    public org.telegram.ui.Components.f20 Z;
    public final int f33701a;
    public org.telegram.ui.ActionBar.b2 f33702a0;
    public final le.b f33703b;
    public boolean f33704b0;
    public final le.b f33705c;
    public boolean f33706c0;
    public ys d;
    public final a0.i f33707d0;
    public org.telegram.ui.Components.ux0 f33708e;
    public ImageView f33709e0;
    public org.telegram.ui.Components.zl0 f33710f;
    public NumberTextView f33711f0;
    public org.telegram.ui.ActionBar.v0 f33712g0;
    public org.telegram.ui.Components.bl0 h;
    public org.telegram.ui.ActionBar.g2 f33713h0;
    public String f33714i0;
    public boolean f33715j0;
    public long f33716k0;
    public boolean f33717l0;
    public final x5 m0;
    public s4.c0 f33718n;
    public int f33719n0;
    public int f33720o0;
    public float f33721p0;
    public int phonebookRow;
    public int f33722q0;
    public xs f33723r;
    public int f33724r0;
    public org.telegram.ui.ActionBar.v0 f33725s;
    public boolean f33726s0;
    public final ah.i f33727t0;
    public final fh.d f33728u0;
    public boolean v;
    public final fh.d f33729v0;
    public org.telegram.ui.Components.c20 f33730w;
    public ah.n f33731w0;
    public boolean f33732x;
    public final ArrayList f33733x0;
    public y8 f33734y;
    public final RectF f33735y0;
    public final RectF f33736z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33701a = i10;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.f33703b = new le.b(0, this, trVar, 350L, false);
        this.f33705c = new le.b(2, this, trVar, 350L, false);
        this.phonebookRow = 0;
        this.f33732x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.f33704b0 = true;
        this.f33707d0 = new a0.i();
        this.f33715j0 = true;
        this.m0 = new x5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.f33733x0 = arrayList;
        RectF rectF = new RectF();
        this.f33735y0 = rectF;
        RectF rectF2 = new RectF();
        this.f33736z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i11 >= 31) {
            this.f33727t0 = new ah.i();
            this.f33728u0 = new fh.d(null);
            this.f33729v0 = new fh.d(null);
            return;
        }
        this.f33727t0 = null;
        this.f33728u0 = null;
        this.f33729v0 = null;
    }

    public static void S(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.i iVar = contactsActivity.f33707d0;
        s4.h0 adapter = contactsActivity.f33710f.getAdapter();
        xs xsVar = contactsActivity.f33723r;
        if (adapter == xsVar) {
            xsVar.getClass();
            Object E = contactsActivity.f33723r.E(i11);
            if (!iVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() != null && i6Var.getUser().contact) {
                    contactsActivity.r0(i6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                xs xsVar2 = contactsActivity.f33723r;
                int size = xsVar2.d.size();
                int size2 = xsVar2.H.size();
                gg.c2 c2Var = xsVar2.f10813f;
                int size3 = c2Var.f10535e.size();
                int size4 = c2Var.f10539j.size();
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
                    if (user.f20194id != UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                        contactsActivity.M = true;
                        SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20194id);
                    if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                        contactsActivity.presentFragment(new yn(bundle), contactsActivity.Q);
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
                    ak0 ak0Var = new ak0(contactsActivity.getParentActivity(), contactsActivity);
                    ak0Var.v(str2, true);
                    ak0Var.show();
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
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.vq)) {
                org.telegram.ui.Components.c20 c20Var = contactsActivity.f33730w;
                if (c20Var != null) {
                    c20Var.performClick();
                }
            } else if (!iVar.i() && (view instanceof org.telegram.ui.Cells.za)) {
                contactsActivity.r0((org.telegram.ui.Cells.za) view);
            } else if ((!contactsActivity.G || i10 != 0) && S == 0) {
                if (contactsActivity.H) {
                    if (Q == 0) {
                        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new k80());
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
                        contactsActivity.presentFragment(new d70(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                        contactsActivity.presentFragment(new nd(org.telegram.ui.Cells.c1.h(0, "step")));
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
                        bundle2.putLong("user_id", user2.f20194id);
                        if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                            contactsActivity.presentFragment(new yn(bundle2), contactsActivity.Q);
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
                        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.InviteUser);
                        alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.w2(contactsActivity, str, false, 24));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        contactsActivity.showDialog(alertDialog$Builder.f20377a);
                    }
                }
            }
        }
    }

    public static void T(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.zl0 zl0Var = contactsActivity.f33710f;
        if (zl0Var != null) {
            int childCount = zl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f33710f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.za) {
                    ((org.telegram.ui.Cells.za) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.f33709e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21216y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.f33709e0.setBackground(org.telegram.ui.ActionBar.i6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21235z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        y8 y8Var = contactsActivity.f33734y;
        if (y8Var != null) {
            y8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7));
        }
    }

    public static void U(ContactsActivity contactsActivity, int i10) {
        boolean z10;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.f33704b0 = z10;
        if (i10 == 0) {
            return;
        }
        contactsActivity.f0(false);
    }

    public static void W(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void X(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new ak0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        int i10;
        float y3 = contactsActivity.f33710f.getY() + contactsActivity.f33710f.getPaddingTop();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= contactsActivity.f33710f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f33710f.getChildAt(i11);
            contactsActivity.f33710f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.n0 X = contactsActivity.f33710f.X(i11);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.zl0 zl0Var = contactsActivity.f33710f;
                X.a(rect, childAt, zl0Var, zl0Var.f3085t0);
                float y10 = contactsActivity.f33710f.getY();
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
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f33710f.getY() + contactsActivity.f33710f.getPaddingTop(), contactsActivity.f33705c.f15436e) - AndroidUtilities.dp(48.0f));
        le.b bVar = contactsActivity.f33703b;
        if (y3 > (contactsActivity.f33710f.getY() + contactsActivity.f33710f.getPaddingTop()) - AndroidUtilities.dp(12.0f)) {
            z10 = true;
        }
        bVar.a(z10, true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        ys ysVar;
        boolean z10;
        org.telegram.ui.Components.c20 c20Var = contactsActivity.f33730w;
        if (c20Var != null && (ysVar = contactsActivity.d) != null) {
            if (contactsActivity.f33732x && !contactsActivity.F && !ysVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            c20Var.e(z10, true);
        }
    }

    @Override
    public final View L() {
        return this.fragmentView;
    }

    @Override
    public final boolean Q(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.zl0 zl0Var = this.f33710f;
        if (zl0Var != null && zl0Var.getFastScroll() != null && this.f33710f.getFastScroll().f26517n) {
            return false;
        }
        return true;
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.I();
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
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f33713h0 = g2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(g2Var);
        }
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(context, this.resourceProvider);
        this.Z = f20Var;
        f20Var.f26297w = true;
        f20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        f20Var.e();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        j3.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.f33709e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f33709e0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f33709e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21216y8), PorterDuff.Mode.MULTIPLY));
            this.f33709e0.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f21235z8), 1, -1));
            this.f33709e0.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f41339b;

                {
                    this.f41339b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f41339b.o0();
                            return;
                        default:
                            ContactsActivity.X(this.f41339b);
                            return;
                    }
                }
            });
            j3.addView(this.f33709e0, w7.z5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f33711f0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f33711f0.setTypeface(AndroidUtilities.bold());
        this.f33711f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21216y8));
        NumberTextView numberTextView2 = this.f33711f0;
        if (this.I) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i10, 0, 0));
        int i14 = 2;
        this.f33711f0.setOnTouchListener(new bi.d(2));
        j3.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ws(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.f33712g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ci.h2 h2Var = this.Z.f26295r;
        h2Var.addTextChangedListener(new yf.c0(h2Var, new hg.d2(this, 8)));
        if (!this.L && !this.K) {
            if (this.v) {
                i12 = R.drawable.msg_contacts_time;
            } else {
                i12 = R.drawable.msg_contacts_name;
            }
            org.telegram.ui.ActionBar.v0 a10 = n10.a(1, i12);
            this.f33725s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f33710f = new org.telegram.ui.Components.zl0(context, null);
        this.f33723r = new xs(this, context, this.f33707d0, this.V, this.O, this.N);
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
        ys ysVar = new ys(this, context, this.G ? 1 : 0, this.H, this.f33707d0, i11);
        this.d = ysVar;
        if (this.f33725s != null) {
            if (this.v) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        ysVar.Y(i14, false);
        this.d.H = this.f33706c0;
        y8 y8Var = new y8(this, context, 3);
        this.f33734y = y8Var;
        this.fragmentView = y8Var;
        org.telegram.ui.Components.zl0 zl0Var = this.f33710f;
        Objects.requireNonNull(zl0Var);
        this.f33731w0 = new ah.n(zl0Var, y8Var, new vs(zl0Var, 0));
        this.f33710f.D0(new ss(this, 1));
        this.f33710f.setSections(true);
        this.f33734y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(29);
        w00Var.f32460w = false;
        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, w00Var, 1, null);
        this.f33708e = ux0Var;
        ux0Var.addView(w00Var, 0);
        this.f33708e.setAnimateLayoutChange(true);
        this.f33708e.e(true, false);
        this.f33708e.d.setText(LocaleController.getString(R.string.NoResult));
        this.f33708e.f31551e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f33734y.addView(this.f33708e, w7.z5.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.f46577m = false;
        this.f33710f.setItemAnimator(jVar);
        this.f33710f.setSectionsType(1);
        this.f33710f.setVerticalScrollBarEnabled(false);
        this.f33710f.setFastScrollEnabled(0);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f33710f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f33718n = c0Var;
        zl0Var2.setLayoutManager(c0Var);
        this.f33710f.setAdapter(this.d);
        this.f33710f.setClipToPadding(false);
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(this.f33710f, this.f33718n);
        this.h = bl0Var;
        bl0Var.h = new ts(this);
        y8 y8Var2 = this.f33734y;
        org.telegram.ui.Components.zl0 zl0Var3 = this.f33710f;
        float f7 = -this.f33701a;
        y8Var2.addView(zl0Var3, w7.z5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.f33734y.addView(this.Z, w7.z5.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f33710f.setEmptyView(this.f33708e);
        org.telegram.ui.Components.zl0 zl0Var4 = this.f33710f;
        zl0Var4.Y1 = true;
        zl0Var4.Z1 = 0;
        zl0Var4.setOnItemClickListener(new i2.s(this, i11, 10));
        this.f33710f.setOnItemLongClickListener(new ts(this));
        this.f33710f.setOnScrollListener(new zs(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
            this.f33730w = c20Var;
            this.f33734y.addView(c20Var, org.telegram.ui.Components.c20.b());
            this.f33730w.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f41339b;

                {
                    this.f41339b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f41339b.o0();
                            return;
                        default:
                            ContactsActivity.X(this.f41339b);
                            return;
                    }
                }
            });
            this.f33730w.f25230c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.f33730w.f25230c.getAnimatedDrawable().M(this.f33730w.f25230c.getAnimatedDrawable().f28216e[0] - 1);
            this.f33730w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.x(str);
            this.X = null;
        }
        this.f33734y.addView(this.actionBar);
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.Y = r6Var;
        ((le.b) r6Var.f5869c).a(false, false);
        this.f33734y.addView(this.Y, w7.z5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f33710f);
        this.actionBar.setDrawBlurBackground(this.f33734y);
        this.f33703b.a(true, false);
        l0();
        setBulletinDelegate(new b9(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33800g1.d.add(this);
        }
        View view = this.fragmentView;
        ts tsVar = new ts(this);
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.a0.j(view, tsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.zl0 zl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            ys ysVar = this.d;
            if (ysVar != null) {
                if (!this.v) {
                    ysVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.f33723r != null) {
                s4.h0 adapter = this.f33710f.getAdapter();
                xs xsVar = this.f33723r;
                if (adapter == xsVar) {
                    xsVar.G(this.f33714i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (zl0Var = this.f33710f) != null) {
                int childCount = zl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f33710f.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.za) {
                        ((org.telegram.ui.Cells.za) childAt).j(intValue);
                    }
                }
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) != 0 && !this.v && this.d != null && !this.f33717l0) {
                this.f33717l0 = true;
                x5 x5Var = this.m0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 5000L);
            }
        } else if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.L && this.M) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f20055id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new yn(bundle), false);
            }
        } else if (i10 == NotificationCenter.closeChats && !this.M) {
            removeSelfFromStack(true);
        }
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && UserConfig.getInstance(this.currentAccount).syncContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.f33704b0) {
                showDialog(org.telegram.ui.Components.e5.w(parentActivity, new rs(this, 1)).f20377a);
                return;
            }
            this.f33716k0 = SystemClock.elapsedRealtime();
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
        ah.i iVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f33727t0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f33722q0) - AndroidUtilities.dp(8.0f);
            this.f33735y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33736z0;
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
            iVar.g(i10, this.f33733x0);
            iVar.e(this.f33731w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20975l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20994m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f21014n7));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21214y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21013n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21030o6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20993m6));
        org.telegram.ui.Components.c20 c20Var = this.f33730w;
        if (c20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(c20Var.f25230c, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33730w.f25230c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33730w.f25230c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20913i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20859f1}, null, org.telegram.ui.ActionBar.i6.f21236z9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.i6.Q0, null, null, org.telegram.ui.ActionBar.i6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.f21048p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33710f, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.ux0 ux0Var = this.f33708e;
        if (ux0Var != null) {
            ux0Var.b(Math.max(this.f33722q0 + this.f33719n0, this.f33724r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.c20 c20Var = this.f33730w;
        if (c20Var != null) {
            c20Var.setTranslationY(((-this.f33722q0) - this.f33720o0) - this.f33721p0);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f33724r0 = l1Var.f45624a.f(8).d;
        h0();
    }

    public final void j0() {
        org.telegram.ui.Components.zl0 zl0Var = this.f33710f;
        int i10 = this.f33701a;
        zl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 44), 0, AndroidUtilities.dp(i10) + this.f33722q0 + this.f33719n0);
    }

    public final void k0() {
        org.telegram.ui.Components.c20.d(this.f33712g0, (1.0f - this.f33705c.f15436e) * (1.0f - this.f33703b.f15436e));
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
        if (this.f33726s0 == z10 && !TextUtils.isEmpty(this.Z.f26295r.getHint())) {
            return;
        }
        ci.h2 h2Var = this.Z.f26295r;
        if (z10) {
            i10 = R.string.SearchPeopleByUsername;
        } else {
            i10 = R.string.SearchContacts;
        }
        h2Var.setHint(LocaleController.getString(i10));
        ci.h2 h2Var2 = this.Z.f26295r;
        if (z10) {
            i11 = R.string.SearchPeopleByUsername;
        } else {
            i11 = R.string.SearchContacts;
        }
        h2Var2.setContentDescription(LocaleController.getString(i11));
        this.f33726s0 = z10;
    }

    public final void m0() {
        float f7 = 1.0f;
        float f10 = 1.0f - this.f33705c.f15436e;
        ys ysVar = this.d;
        org.telegram.ui.Components.c20.d(this.f33725s, f10 * ((ysVar == null || ysVar.I) ? 0.0f : 0.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.U != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.yc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    } else if (this.S != 0) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                        if (canAddAdmins) {
                            b2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                            b2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                            alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.w2(this, user, str));
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
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20377a;
                b2Var2.R = string;
                String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
                if (!user.bot && this.P) {
                    formatStringSimple = a4.a.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20935j5));
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.i6.S(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new at(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                b2Var2.T = formatStringSimple;
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new c7(this, user, editTextBoldCursor, 11));
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
        this.actionBar.r();
        int childCount = this.f33710f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.i iVar = this.f33707d0;
            if (i10 < childCount) {
                View childAt = this.f33710f.getChildAt(i10);
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
                this.f33713h0.c(0.0f, true);
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
        } else if (this.f33705c.f15437f) {
            if (z10) {
                this.Z.f26295r.getText().clear();
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
        if (this.f33715j0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f33715j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.w(parentActivity, new rs(this, 0)).f20377a;
                    this.f33702a0 = b2Var;
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
        org.telegram.ui.ActionBar.b2 b2Var = this.f33702a0;
        if (b2Var != null && dialog == b2Var && getParentActivity() != null && this.f33704b0) {
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
        this.f33715j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
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
            this.f33706c0 = this.arguments.getBoolean("disableSections", false);
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
        this.f33719n0 = i10;
        if (this.I) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f33720o0 = i11;
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
        this.f33722q0 = i13;
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
                    this.f33704b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f33716k0 < 200) {
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

    @Override
    public final void r() {
        if (this.f33718n.L0() < 15) {
            this.f33710f.y0(0);
        } else {
            org.telegram.ui.Components.bl0 bl0Var = this.h;
            bl0Var.f25015b = 1;
            bl0Var.d(0, 0, false, false);
        }
        this.f33703b.a(true, true);
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.za;
        boolean z12 = false;
        a0.i iVar = this.f33707d0;
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
            this.actionBar.L(null, null);
            this.f33713h0.c(1.0f, true);
        }
        this.f33711f0.a(iVar.m(), z12);
    }

    @Override
    public final fh.d x() {
        return this.f33729v0;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
