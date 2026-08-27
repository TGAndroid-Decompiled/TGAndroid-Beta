package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public class o60 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, ud.b, View.OnClickListener, yg.d {
    public boolean A;
    public hh.h1 B;
    public final long C;
    public final long D;
    public TLRPC.ChatFull E;
    public a0.h F;
    public final int G;
    public String H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public boolean O;
    public boolean P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public org.telegram.ui.Components.a30 T;
    public org.telegram.ui.Components.a30 U;
    public a0.h V;
    public ArrayList W;
    public org.telegram.ui.Components.a30 X;
    public int Y;
    public org.telegram.ui.Components.md0 Z;

    public final int f40993a;

    public boolean f40994a0;

    public final ud.c f40995b;

    public final HashSet f40996b0;

    public final ud.a f40997c;

    public boolean f40998c0;
    public jh.a3 d;

    public boolean f40999d0;

    public ag.t0 f41000e;

    public ArrayList f41001e0;

    public org.telegram.ui.Components.p10 f41002f;

    public boolean f41003f0;

    public boolean f41004g0;
    public g60 h;

    public int f41005h0;

    public int f41006i0;

    public int f41007j0;

    public final Rect f41008k0;

    public final jg.e f41009l0;
    public final og.d m0;

    public org.telegram.ui.Components.zk0 f41010n;

    public jg.k f41011n0;

    public final ArrayList f41012o0;

    public final RectF f41013p0;

    public final RectF f41014q0;

    public f2.k0 f41015r;

    public org.telegram.ui.Components.iw0 f41016s;
    public m60 v;

    public k60 f41017w;

    public j60 f41018x;

    public org.telegram.ui.Components.m10 f41019y;

    public o60(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f40993a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f40995b = new ud.c(3, this, erVar, 350L);
        this.f40997c = new ud.a(4, this, erVar, 350L, false);
        this.V = new a0.h();
        this.W = new ArrayList();
        this.f40996b0 = new HashSet();
        this.f41005h0 = -4;
        this.f41008k0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f41012o0 = arrayList;
        RectF rectF = new RectF();
        this.f41013p0 = rectF;
        RectF rectF2 = new RectF();
        this.f41014q0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i11 = bundle.getInt("chatType", 0);
        this.I = i11;
        this.J = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.K = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.L = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.M = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.N = z13;
        this.Q = bundle.getInt("chatAddType", 0);
        this.R = bundle.getBoolean("allowPremium", false);
        this.S = bundle.getBoolean("allowMiniapps", false);
        this.C = bundle.getLong("chatId");
        this.D = bundle.getLong("channelId");
        if (z10 || z11 || z13) {
            this.G = 0;
        } else if (z12) {
            this.G = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            MessagesController messagesController = getMessagesController();
            this.G = i11 == 0 ? messagesController.maxMegagroupCount : messagesController.maxBroadcastCount;
        }
        if (i10 >= 31) {
            this.f41009l0 = new jg.e(false);
            this.m0 = new og.d(null);
        } else {
            this.f41009l0 = null;
            this.m0 = null;
        }
    }

    public static void U(o60 o60Var, Context context, View view, int i10) {
        long j10;
        int i11 = o60Var.G;
        long j11 = o60Var.D;
        m60 m60Var = o60Var.v;
        int i12 = 0;
        if (i10 == m60Var.f40380w) {
            int i13 = o60Var.currentAccount;
            org.telegram.ui.ActionBar.c6 c6Var = o60Var.resourceProvider;
            e60 e60Var = new e60(o60Var, i12);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i13).sendRequest(createconferencecall, new gf.j0(i13, b2Var, context, c6Var, e60Var, 5));
            return;
        }
        if (i10 == 0 && m60Var.B != 0 && !m60Var.f40377n) {
            org.telegram.ui.Components.md0 md0Var = new org.telegram.ui.Components.md0(context, o60Var, o60Var.E, o60Var.C, j11 != 0);
            o60Var.Z = md0Var;
            o60Var.showDialog(md0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.d4) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            if (d4Var.f24210r) {
                org.telegram.ui.Components.a30 a30Var = o60Var.T;
                if (a30Var == null) {
                    org.telegram.ui.Components.a30 a30Var2 = new org.telegram.ui.Components.a30(o60Var.f41002f.f31468r.getContext(), "premium");
                    o60Var.T = a30Var2;
                    o60Var.h.a(a30Var2);
                    o60Var.T.setOnClickListener(o60Var);
                } else {
                    o60Var.h.c(a30Var);
                    o60Var.T = null;
                }
                o60Var.k0();
                return;
            }
            if (d4Var.f24211s) {
                org.telegram.ui.Components.a30 a30Var3 = o60Var.U;
                if (a30Var3 == null) {
                    org.telegram.ui.Components.a30 a30Var4 = new org.telegram.ui.Components.a30(o60Var.f41002f.f31468r.getContext(), "miniapps");
                    o60Var.U = a30Var4;
                    o60Var.h.a(a30Var4);
                    o60Var.U.setOnClickListener(o60Var);
                } else {
                    o60Var.h.c(a30Var3);
                    o60Var.U = null;
                }
                o60Var.k0();
                return;
            }
            Object object = d4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j10 = ((TLRPC.User) object).f22527id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j10 = -((TLRPC.Chat) object).f22380id;
            }
            a0.h hVar = o60Var.F;
            if (hVar == null || hVar.h(j10) < 0) {
                if (d4Var.K) {
                    int i14 = -o60Var.f41005h0;
                    o60Var.f41005h0 = i14;
                    AndroidUtilities.shakeViewSpring(d4Var, i14);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(o60Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(o60Var.currentAccount).premiumFeaturesBlocked() ? org.telegram.ui.Components.mc.a0(o60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.mc.a0(o60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new e60(o60Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.a30 a30Var5 = (org.telegram.ui.Components.a30) o60Var.V.f(j10);
                if (a30Var5 != null) {
                    o60Var.h.c(a30Var5);
                } else {
                    if (i11 != 0 && o60Var.V.m() == i11) {
                        return;
                    }
                    if (o60Var.I == 0 && o60Var.V.m() == o60Var.getMessagesController().maxGroupCount) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o60Var.getParentActivity());
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
                        b2Var2.N = string;
                        b2Var2.P = LocaleController.getString(R.string.SoftUserLimitAlert);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        o60Var.showDialog(b2Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (o60Var.N && user.bot) {
                            if (j11 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.mc.a0(o60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                    return;
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                TLRPC.Chat chat = o60Var.getMessagesController().getChat(Long.valueOf(j11));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o60Var.getParentActivity());
                                boolean zCanAddAdmins = ChatObject.canAddAdmins(chat);
                                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f22702a;
                                if (zCanAddAdmins) {
                                    b2Var3.N = LocaleController.getString(R.string.AddBotAdminAlert);
                                    b2Var3.P = LocaleController.getString(R.string.AddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new zr(12, o60Var, user));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    b2Var3.P = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                }
                                o60Var.showDialog(b2Var3);
                                return;
                            }
                        }
                        o60Var.getMessagesController().putUser(user, !o60Var.P);
                    } else if (object instanceof TLRPC.Chat) {
                        o60Var.getMessagesController().putChat((TLRPC.Chat) object, !o60Var.P);
                    }
                    org.telegram.ui.Components.a30 a30Var6 = new org.telegram.ui.Components.a30(o60Var.f41002f.f31468r.getContext(), object);
                    o60Var.h.a(a30Var6);
                    a30Var6.setOnClickListener(o60Var);
                }
                o60Var.s0();
                if (o60Var.P || o60Var.O) {
                    AndroidUtilities.showKeyboard(o60Var.f41002f.f31468r);
                } else {
                    o60Var.k0();
                }
                if (o60Var.f41002f.f31468r.length() > 0) {
                    o60Var.f41002f.f31468r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void Z(o60 o60Var) {
        if (o60Var.B == null) {
            return;
        }
        o60Var.f40997c.a(!o60Var.V.i(), true);
    }

    public static void a0(o60 o60Var, Canvas canvas, RectF rectF, Paint paint) {
        og.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (dVar = o60Var.m0) == null) {
            return;
        }
        dVar.T0(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean canBeginSlide() {
        return f0(true);
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k kVarCreateActionBar = super.createActionBar(context);
        kVarCreateActionBar.setAddToContainer(false);
        return kVarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10 = 0;
        this.P = false;
        this.O = false;
        this.W.clear();
        this.V.b();
        this.X = null;
        boolean z10 = this.N;
        int i11 = 1;
        int i12 = this.I;
        int i13 = 2;
        if (i12 == 2) {
            this.A = true;
        } else {
            this.A = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean zIsEmpty = TextUtils.isEmpty(this.H);
        boolean z11 = this.L;
        boolean z12 = this.K;
        boolean z13 = this.M;
        if (!zIsEmpty) {
            this.actionBar.setTitle(this.H);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (!z10) {
            int i14 = this.Q;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (!z11) {
                this.actionBar.setTitle(LocaleController.getString(i12 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
            } else if (i14 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            } else if (i14 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
            }
        } else if (this.D != 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
        }
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 22));
        this.f41002f = new org.telegram.ui.Components.p10(context, this.resourceProvider);
        n0 n0Var = new n0(this, context, 7);
        this.fragmentView = n0Var;
        n0Var.setFocusableInTouchMode(true);
        n0Var.setDescendantFocusability(131072);
        g60 g60Var = new g60(this, context, this.currentAccount);
        this.h = g60Var;
        g60Var.setDelegate(new d60(this, i10));
        this.h.getSpansContainer().setOnClickListener(new f60(this, i10));
        g60 g60Var2 = this.h;
        this.V = g60Var2.f32617b;
        this.W = g60Var2.f32618c;
        r0();
        this.f41002f.f31468r.setOnEditorActionListener(new fa(this, 4));
        this.f41002f.f31468r.setOnKeyListener(new h60(i10, this));
        this.f41002f.f31468r.addTextChangedListener(new p0(this, 6));
        ArrayList arrayList = this.f41001e0;
        if (arrayList != null) {
            p0(arrayList, this.f41003f0, this.f41004g0);
        }
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        h00Var.setViewType(6);
        h00Var.f28887w = false;
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, h00Var, 1, null);
        this.f41016s = iw0Var;
        iw0Var.addView(h00Var);
        this.f41016s.e(true, false);
        this.f41016s.d.setText(LocaleController.getString(R.string.NoResult));
        n0Var.addView(this.f41016s);
        this.f41015r = new f2.k0(1, false);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f41010n = zk0Var;
        zk0Var.setFastScrollEnabled(0);
        this.f41010n.setEmptyView(this.f41016s);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f41010n;
        m60 m60Var = new m60(this, context);
        this.v = m60Var;
        zk0Var2.setAdapter(m60Var);
        this.f41010n.setLayoutManager(this.f41015r);
        this.f41010n.setVerticalScrollBarEnabled(false);
        this.f41010n.setClipToPadding(false);
        this.f41010n.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.zk0 zk0Var3 = this.f41010n;
        float f10 = -this.f40993a;
        n0Var.addView(zk0Var3, h7.z5.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        this.f41010n.setOnItemClickListener(new cg.x0(19, this, context));
        this.f41010n.setOnScrollListener(new m3(this, 13));
        org.telegram.ui.Components.zk0 zk0Var4 = this.f41010n;
        zk0Var4.U1 = true;
        zk0Var4.V1 = 0;
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.f41019y = m10Var;
        if (z11 || z12 || z10) {
            m10Var.f30519c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f22974l = 180;
            g2Var.invalidateSelf();
            this.f41019y.f30519c.setImageDrawable(g2Var);
        }
        if (!z13) {
            n0Var.addView(this.f41019y, org.telegram.ui.Components.m10.b());
        }
        this.f41019y.setOnClickListener(new f60(this, i11));
        this.f41019y.e(this.A, false);
        this.f41019y.setContentDescription(LocaleController.getString(R.string.Next));
        int i15 = 3;
        if (z13) {
            this.B = new hh.h1(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourceProvider));
            this.B.addView(view, h7.z5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.B.addView(linearLayout, h7.z5.e(-1, -2, 87));
            lh.d dVar = new lh.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, h7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new f60(this, i13));
            lh.d dVar2 = new lh.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.cq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, h7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new f60(this, i15));
            n0Var.addView(this.B, h7.z5.e(-1, -2, 87));
            g0();
        }
        s0();
        jh.a3 a3Var = new jh.a3(this, context);
        this.d = a3Var;
        n0Var.addView(a3Var, h7.z5.e(-1, 0, 48));
        n0Var.addView(this.actionBar);
        n0Var.addView(this.f41002f, h7.z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        n0Var.addView(this.h);
        org.telegram.ui.Components.zk0 zk0Var5 = this.f41010n;
        Objects.requireNonNull(zk0Var5);
        this.f41011n0 = new jg.k(zk0Var5, n0Var, new os(zk0Var5, i10));
        this.f41010n.C0(new e60(this, i15));
        ag.t0 t0Var = new ag.t0(context, this.parentLayout);
        this.f41000e = t0Var;
        t0Var.b(false, false);
        n0Var.addView(this.f41000e, h7.z5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35504c1.d.add(this);
        }
        View view2 = this.fragmentView;
        d60 d60Var = new d60(this, i15);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(view2, d60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            m60 m60Var = this.v;
            if (m60Var != null) {
                m60Var.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.f41010n != null) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            int childCount = this.f41010n.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f41010n.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt).f(iIntValue);
                }
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f41009l0) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f) + this.Y;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + iDp2;
        RectF rectF = this.f41013p0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f10 = -iDp;
        rectF.inset(0.0f, f10);
        if (this.B != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.B.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.f41014q0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f10);
        }
        eVar.g((this.B == null || this.f40997c.f48497e <= 0.0f) ? 1 : 2, this.f41012o0);
        eVar.e(this.f41011n0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final boolean f0(boolean z10) {
        boolean z11;
        if (this.f40994a0) {
            HashSet<Long> hashSet = new HashSet();
            for (int i10 = 0; i10 < this.V.m(); i10++) {
                hashSet.add(Long.valueOf(this.V.j(i10)));
            }
            boolean z12 = this.f40998c0;
            boolean z13 = this.T == null;
            HashSet hashSet2 = this.f40996b0;
            if (z12 == z13) {
                z11 = true;
            } else if (this.f40999d0 == (this.U == null) || hashSet.size() != hashSet2.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                for (Long l10 : hashSet) {
                    l10.getClass();
                    if (!hashSet2.contains(l10)) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (z11) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new d60(this, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new d60(this, 2));
                    showDialog(alertDialog$Builder.f22702a);
                }
                return false;
            }
        }
        return true;
    }

    public final void g0() {
        hh.h1 h1Var = this.B;
        if (h1Var == null) {
            return;
        }
        float f10 = this.f40997c.f48497e;
        h1Var.setTranslationY((1.0f - f10) * AndroidUtilities.dp(12.0f));
        this.B.setAlpha(f10);
        this.B.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23199l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23216m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23235n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41016s, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41016s, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 16, new Class[]{org.telegram.ui.Cells.c4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 0, new Class[]{org.telegram.ui.Cells.c4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Zh));
        int i12 = org.telegram.ui.ActionBar.g6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 4, new Class[]{org.telegram.ui.Cells.c4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23145i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23163j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23234n6));
        int i13 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41010n, 0, new Class[]{org.telegram.ui.Cells.d4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        int i14 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41016s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41016s.f29506e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.md0 md0Var = this.Z;
        if (md0Var != null) {
            arrayList.addAll(md0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.m10 m10Var = this.f41019y;
        if (m10Var != null) {
            m10Var.setTranslationY(-Math.max(this.f41006i0, this.f41007j0));
        }
    }

    public final void i0() {
        if (this.f41010n.Z0()) {
            this.f41010n.setClipBounds(null);
            return;
        }
        int iDp = (int) ((AndroidUtilities.dp(76.0f) + this.f41006i0) * this.f40997c.f48497e);
        int i10 = this.f40993a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.f40995b.f48502e);
        int measuredWidth = this.f41010n.getMeasuredWidth();
        int iB = org.telegram.messenger.y1.B(i10, this.f41010n.getMeasuredHeight(), iDp);
        Rect rect = this.f41008k0;
        rect.set(0, measuredHeight, measuredWidth, iB);
        this.f41010n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int iDp = this.M ? AndroidUtilities.dp(76.0f) : 0;
        org.telegram.ui.Components.zk0 zk0Var = this.f41010n;
        int i10 = this.f40993a;
        zk0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.f40995b.f48502e), 0, AndroidUtilities.dp(i10) + this.f41006i0 + iDp);
        this.f41016s.setPadding(0, 0, 0, this.f41006i0);
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f41007j0 = m1Var.f46619a.f(8).d;
        h0();
    }

    public final void k0() {
        long j10;
        int childCount = this.f41010n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f41010n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                Object object = d4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22527id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22380id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        d4Var.c(this.T != null, true);
                        d4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        d4Var.c(this.U != null, true);
                        d4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.F;
                    if (hVar == null || hVar.h(j10) < 0) {
                        d4Var.c(this.V.h(j10) >= 0, true);
                        d4Var.setCheckBoxEnabled(true);
                    } else {
                        d4Var.c(true, false);
                        d4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.s3) {
                this.f41010n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    ((org.telegram.ui.Cells.s3) childAt).b((this.T == null && this.V.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new f60(this, 4));
                }
            }
        }
    }

    public final HashSet l0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.V.m(); i10++) {
            hashSet.add(Long.valueOf(this.V.j(i10)));
        }
        return hashSet;
    }

    public final void m0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.V.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.V.j(i11))));
        }
        j60 j60Var = this.f41018x;
        if (j60Var != null) {
            j60Var.j(i10, arrayList);
        }
        finishFragment();
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                g0();
                i0();
                return;
            }
            return;
        }
        int paddingTop = this.f41010n.getPaddingTop();
        j0();
        org.telegram.ui.Components.p10 p10Var = this.f41002f;
        ud.c cVar2 = this.f40995b;
        p10Var.setTranslationY(cVar2.f48502e);
        i0();
        this.f41000e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar2.f48502e);
        this.d.invalidate();
        int paddingTop2 = this.f41010n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((ud.a) this.f41000e.f662c).f48498f) {
            return;
        }
        this.f41010n.scrollBy(0, paddingTop - paddingTop2);
    }

    public final boolean o0() {
        boolean zI = this.V.i();
        boolean z10 = this.N;
        int i10 = this.I;
        if (!zI || i10 == 2 || !z10) {
            long j10 = this.C;
            int i11 = 1;
            if (!z10) {
                if (i10 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i12 = 0; i12 < this.V.m(); i12++) {
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.V.j(i12))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(j10, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new rn(bundle), true);
                    return true;
                }
                if (this.A) {
                    if (z10) {
                        m0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < this.V.m(); i13++) {
                        arrayList2.add(Long.valueOf(this.V.j(i13)));
                    }
                    if (this.K || this.L) {
                        k60 k60Var = this.f41017w;
                        if (k60Var != null) {
                            k60Var.b(arrayList2, this.T != null, this.U != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        jArr[i14] = ((Long) arrayList2.get(i14)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i10);
                    bundle2.putBoolean("forImport", this.J);
                    presentFragment(new u60(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String pluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.V.m(), new Object[0]);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = pluralString;
                StringBuilder sb2 = new StringBuilder();
                for (int i15 = 0; i15 < this.V.m(); i15++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.V.j(i15)));
                    if (user != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                        sb2.append("**");
                    }
                }
                MessagesController messagesController = getMessagesController();
                if (j10 == 0) {
                    j10 = this.D;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (this.V.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.V.m(), chat != null ? chat.title : "")));
                    String str = String.format("%d", Integer.valueOf(this.V.m()));
                    int iIndexOf = TextUtils.indexOf(spannableStringBuilder, str);
                    if (iIndexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), iIndexOf, str.length() + iIndexOf, 33);
                    }
                    b2Var.P = spannableStringBuilder;
                } else {
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb2, chat != null ? chat.title : ""));
                }
                org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1, this.resourceProvider);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1VarArr[0].setMultiline(true);
                    if (this.V.m() == 1) {
                        y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.V.j(0)))))), "", true, false, false);
                    } else {
                        y1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(y1VarArr[0], h7.z5.n(-1, -2));
                    y1VarArr[0].setOnClickListener(new f20(y1VarArr, i11));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Add), new zr(13, this, y1VarArr));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(b2Var);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (f0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view;
        if (a30Var.f26618y) {
            this.X = null;
            this.h.c(a30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.a30 a30Var2 = this.X;
        if (a30Var2 != null) {
            a30Var2.a();
        }
        this.X = a30Var;
        a30Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public final void p0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.a30 a30Var;
        org.telegram.ui.Components.a30 a30Var2;
        HashSet hashSet = this.f40996b0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f40998c0 = z10;
        this.f40999d0 = z11;
        g60 g60Var = this.h;
        if (g60Var == null) {
            this.f41001e0 = arrayList;
            this.f41003f0 = z10;
            this.f41004g0 = z11;
            return;
        }
        if (z10 && this.T == null) {
            org.telegram.ui.Components.a30 a30Var3 = new org.telegram.ui.Components.a30(getParentActivity(), "premium");
            this.T = a30Var3;
            this.h.a(a30Var3);
            this.T.setOnClickListener(this);
        } else if (!z10 && (a30Var = this.T) != null) {
            g60Var.c(a30Var);
            this.T = null;
        }
        if (z11 && this.U == null) {
            org.telegram.ui.Components.a30 a30Var4 = new org.telegram.ui.Components.a30(getParentActivity(), "miniApps");
            this.U = a30Var4;
            this.h.a(a30Var4);
            this.U.setOnClickListener(this);
        } else if (!z11 && (a30Var2 = this.U) != null) {
            this.h.c(a30Var2);
            this.U = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            long jLongValue = l10.longValue();
            Object chat = jLongValue < 0 ? getMessagesController().getChat(Long.valueOf(-jLongValue)) : getMessagesController().getUser(l10);
            if (chat != null) {
                org.telegram.ui.Components.a30 a30Var5 = new org.telegram.ui.Components.a30(getParentActivity(), chat);
                this.h.a(a30Var5);
                a30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.s10 s10Var = this.h.d;
        AnimatorSet animatorSet = s10Var.f32292a;
        if (animatorSet != null && animatorSet.isRunning()) {
            s10Var.f32292a.setupEndValues();
            s10Var.f32292a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f41010n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f41010n, new org.telegram.ui.Components.xl(this, i10, 14));
    }

    public final void r0() {
        m60 m60Var;
        gg.g gVar = this.f41002f.f31468r;
        if (gVar == null) {
            return;
        }
        if (this.I == 2) {
            gVar.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.N || ((m60Var = this.v) != null && m60Var.C == 0)) {
            gVar.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.K || this.L) {
            gVar.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.M) {
            gVar.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            gVar.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public final void s0() {
        boolean z10 = this.K;
        int i10 = this.I;
        boolean z11 = this.N;
        if (!z10 && !this.L && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.V.m(), new Object[0]));
            } else {
                boolean zI = this.V.i();
                int i11 = this.G;
                if (zI) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i11 + (this.M ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.V.m()), Integer.valueOf(this.V.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i10 == 2 || !z11) {
            return;
        }
        if (this.A && this.W.isEmpty()) {
            this.f41019y.e(false, true);
            this.A = false;
        } else {
            if (this.A || this.W.isEmpty()) {
                return;
            }
            this.f41019y.e(true, true);
            this.A = true;
        }
    }

    @Override
    public final void L() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
