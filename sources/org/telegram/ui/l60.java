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
public class l60 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, ne.d, View.OnClickListener, qh.d {
    public boolean E;
    public ai.w1 F;
    public final long G;
    public final long H;
    public TLRPC.ChatFull I;
    public a0.h J;
    public final int K;
    public String L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public final int U;
    public final boolean V;
    public final boolean W;
    public org.telegram.ui.Components.v30 X;
    public org.telegram.ui.Components.v30 Y;
    public a0.h Z;
    public final int f38805a;
    public ArrayList f38806a0;
    public final ne.e f38807b;
    public org.telegram.ui.Components.v30 f38808b0;
    public final ne.b f38809c;
    public int f38810c0;
    public ci.i3 d;
    public org.telegram.ui.Components.ue0 f38811d0;
    public ei.g6 e;
    public boolean f38812e0;
    public org.telegram.ui.Components.k20 f38813f;
    public final HashSet f38814f0;
    public boolean f38815g0;
    public d60 h;
    public boolean f38816h0;
    public ArrayList f38817i0;
    public boolean f38818j0;
    public boolean f38819k0;
    public int f38820l0;
    public int m0;
    public org.telegram.ui.Components.jm0 f38821n;
    public int f38822n0;
    public final Rect f38823o0;
    public final bh.f f38824p0;
    public final gh.d f38825q0;
    public s4.b0 f38826r;
    public bh.l f38827r0;
    public org.telegram.ui.Components.tx0 f38828s;
    public final ArrayList f38829s0;
    public final RectF f38830t0;
    public final RectF f38831u0;
    public j60 v;
    public h60 f38832w;
    public g60 f38833x;
    public org.telegram.ui.Components.h20 f38834y;

    public l60(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38805a = i10;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.f38807b = new ne.e(3, this, bsVar, 350L);
        this.f38809c = new ne.b(4, this, bsVar, 350L, false);
        this.Z = new a0.h();
        this.f38806a0 = new ArrayList();
        this.f38814f0 = new HashSet();
        this.f38820l0 = -4;
        this.f38823o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f38829s0 = arrayList;
        RectF rectF = new RectF();
        this.f38830t0 = rectF;
        RectF rectF2 = new RectF();
        this.f38831u0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i13 = bundle.getInt("chatType", 0);
        this.M = i13;
        this.N = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.O = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.P = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.Q = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.R = z13;
        this.U = bundle.getInt("chatAddType", 0);
        this.V = bundle.getBoolean("allowPremium", false);
        this.W = bundle.getBoolean("allowMiniapps", false);
        this.G = bundle.getLong("chatId");
        this.H = bundle.getLong("channelId");
        if (!z10 && !z11 && !z13) {
            if (z12) {
                this.K = getMessagesController().conferenceCallSizeLimit - 1;
            } else {
                MessagesController messagesController = getMessagesController();
                if (i13 == 0) {
                    i11 = messagesController.maxMegagroupCount;
                } else {
                    i11 = messagesController.maxBroadcastCount;
                }
                this.K = i11;
            }
        } else {
            this.K = 0;
        }
        if (i12 >= 31) {
            this.f38824p0 = new bh.f(false);
            this.f38825q0 = new gh.d(null);
            return;
        }
        this.f38824p0 = null;
        this.f38825q0 = null;
    }

    public static void U(l60 l60Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.qc J;
        boolean z10;
        int i11 = l60Var.K;
        long j11 = l60Var.H;
        j60 j60Var = l60Var.v;
        if (i10 == j60Var.f38186w) {
            int i12 = l60Var.currentAccount;
            org.telegram.ui.ActionBar.d6 d6Var = l60Var.resourceProvider;
            b60 b60Var = new b60(l60Var, 0);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.sb(i12, b2Var, context, d6Var, b60Var, 5));
        } else if (i10 == 0 && j60Var.F != 0 && !j60Var.f38183n) {
            TLRPC.ChatFull chatFull = l60Var.I;
            long j12 = l60Var.G;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(context, l60Var, chatFull, j12, z10);
            l60Var.f38811d0 = ue0Var;
            l60Var.showDialog(ue0Var);
        } else if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (f4Var.f22245r) {
                org.telegram.ui.Components.v30 v30Var = l60Var.X;
                if (v30Var == null) {
                    org.telegram.ui.Components.v30 v30Var2 = new org.telegram.ui.Components.v30(l60Var.f38813f.f27730r.getContext(), "premium");
                    l60Var.X = v30Var2;
                    l60Var.h.a(v30Var2);
                    l60Var.X.setOnClickListener(l60Var);
                } else {
                    l60Var.h.c(v30Var);
                    l60Var.X = null;
                }
                l60Var.k0();
            } else if (f4Var.f22246s) {
                org.telegram.ui.Components.v30 v30Var3 = l60Var.Y;
                if (v30Var3 == null) {
                    org.telegram.ui.Components.v30 v30Var4 = new org.telegram.ui.Components.v30(l60Var.f38813f.f27730r.getContext(), "miniapps");
                    l60Var.Y = v30Var4;
                    l60Var.h.a(v30Var4);
                    l60Var.Y.setOnClickListener(l60Var);
                } else {
                    l60Var.h.c(v30Var3);
                    l60Var.Y = null;
                }
                l60Var.k0();
            } else {
                Object object = f4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f20427id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20280id;
                } else {
                    return;
                }
                a0.h hVar = l60Var.J;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (f4Var.O) {
                        int i13 = -l60Var.f38820l0;
                        l60Var.f38820l0 = i13;
                        AndroidUtilities.shakeViewSpring(f4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(l60Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(l60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.xc.a0(l60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.xc.a0(l60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new b60(l60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.v30 v30Var5 = (org.telegram.ui.Components.v30) l60Var.Z.f(j10);
                    if (v30Var5 != null) {
                        l60Var.h.c(v30Var5);
                    } else if (i11 == 0 || l60Var.Z.m() != i11) {
                        if (l60Var.M == 0 && l60Var.Z.m() == l60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20609a;
                            b2Var2.R = string;
                            b2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            l60Var.showDialog(b2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (l60Var.R && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.xc.a0(l60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = l60Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20609a;
                                    if (canAddAdmins) {
                                        b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new xu(8, l60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        b2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    l60Var.showDialog(b2Var3);
                                    return;
                                }
                            }
                            l60Var.getMessagesController().putUser(user, !l60Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            l60Var.getMessagesController().putChat((TLRPC.Chat) object, !l60Var.T);
                        }
                        org.telegram.ui.Components.v30 v30Var6 = new org.telegram.ui.Components.v30(l60Var.f38813f.f27730r.getContext(), object);
                        l60Var.h.a(v30Var6);
                        v30Var6.setOnClickListener(l60Var);
                    } else {
                        return;
                    }
                    l60Var.s0();
                    if (!l60Var.T && !l60Var.S) {
                        l60Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(l60Var.f38813f.f27730r);
                    }
                    if (l60Var.f38813f.f27730r.length() > 0) {
                        l60Var.f38813f.f27730r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(l60 l60Var) {
        if (l60Var.F == null) {
            return;
        }
        l60Var.f38809c.a(!l60Var.Z.i(), true);
    }

    public static void a0(l60 l60Var, Canvas canvas, RectF rectF, Paint paint) {
        gh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = l60Var.f38825q0) != null) {
            dVar.y(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
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
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        this.T = false;
        this.S = false;
        this.f38806a0.clear();
        this.Z.b();
        this.f38808b0 = null;
        boolean z10 = this.R;
        int i12 = this.M;
        if (i12 == 2) {
            this.E = true;
        } else {
            this.E = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z11 = this.P;
        boolean z12 = this.O;
        boolean z13 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (z10) {
            if (this.H != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
            }
        } else {
            int i13 = this.U;
            if (z12) {
                if (i13 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i12 == 0) {
                    i10 = R.string.NewGroup;
                } else {
                    i10 = R.string.NewBroadcastList;
                }
                kVar.setTitle(LocaleController.getString(i10));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 29));
        this.f38813f = new org.telegram.ui.Components.k20(context, this.resourceProvider);
        m0 m0Var = new m0(this, context, 7);
        this.fragmentView = m0Var;
        m0Var.setFocusableInTouchMode(true);
        m0Var.setDescendantFocusability(131072);
        d60 d60Var = new d60(this, context, this.currentAccount);
        this.h = d60Var;
        d60Var.setDelegate(new a60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new c60(this, 0));
        d60 d60Var2 = this.h;
        this.Z = d60Var2.f28929b;
        this.f38806a0 = d60Var2.f28930c;
        r0();
        this.f38813f.f27730r.setOnEditorActionListener(new ka(this, 4));
        this.f38813f.f27730r.setOnKeyListener(new e60(0, this));
        this.f38813f.f27730r.addTextChangedListener(new o0(this, 6));
        ArrayList arrayList = this.f38817i0;
        if (arrayList != null) {
            p0(arrayList, this.f38818j0, this.f38819k0);
        }
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(6);
        b10Var.f24778w = false;
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, b10Var, 1, null);
        this.f38828s = tx0Var;
        tx0Var.addView(b10Var);
        this.f38828s.e(true, false);
        this.f38828s.d.setText(LocaleController.getString(R.string.NoResult));
        m0Var.addView(this.f38828s);
        this.f38826r = new s4.b0(1, false);
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f38821n = jm0Var;
        jm0Var.setFastScrollEnabled(0);
        this.f38821n.setEmptyView(this.f38828s);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f38821n;
        j60 j60Var = new j60(this, context);
        this.v = j60Var;
        jm0Var2.setAdapter(j60Var);
        this.f38821n.setLayoutManager(this.f38826r);
        this.f38821n.setVerticalScrollBarEnabled(false);
        this.f38821n.setClipToPadding(false);
        org.telegram.ui.Components.jm0 jm0Var3 = this.f38821n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        jm0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.jm0 jm0Var4 = this.f38821n;
        float f7 = -this.f38805a;
        m0Var.addView(jm0Var4, w7.z5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f38821n.setOnItemClickListener(new ci.y4(17, this, context));
        this.f38821n.setOnScrollListener(new k3(this, 13));
        org.telegram.ui.Components.jm0 jm0Var5 = this.f38821n;
        jm0Var5.W1 = true;
        jm0Var5.X1 = 0;
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f38834y = h20Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f20873l = 180;
            g2Var.invalidateSelf();
            this.f38834y.f26721c.setImageDrawable(g2Var);
        } else {
            h20Var.f26721c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            m0Var.addView(this.f38834y, org.telegram.ui.Components.h20.b());
        }
        this.f38834y.setOnClickListener(new c60(this, 1));
        this.f38834y.e(this.E, false);
        this.f38834y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.w1(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20995d7, this.resourceProvider));
            this.F.addView(view, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.z5.e(-1, -2, 87));
            ei.d dVar = new ei.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new c60(this, 2));
            ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.yq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new c60(this, 3));
            m0Var.addView(this.F, w7.z5.e(-1, -2, 87));
            g0();
        }
        s0();
        ci.i3 i3Var = new ci.i3(this, context);
        this.d = i3Var;
        m0Var.addView(i3Var, w7.z5.e(-1, 0, 48));
        m0Var.addView(this.actionBar);
        m0Var.addView(this.f38813f, w7.z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        m0Var.addView(this.h);
        org.telegram.ui.Components.jm0 jm0Var6 = this.f38821n;
        Objects.requireNonNull(jm0Var6);
        this.f38827r0 = new bh.l(jm0Var6, m0Var, new ks(jm0Var6, 0));
        this.f38821n.C0(new b60(this, 3));
        ei.g6 g6Var = new ei.g6(context, this.parentLayout);
        this.e = g6Var;
        g6Var.b(false, false);
        m0Var.addView(this.e, w7.z5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f33173g1.d.add(this);
        }
        View view2 = this.fragmentView;
        a60 a60Var = new a60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f44830a;
        r0.a0.i(view2, a60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            j60 j60Var = this.v;
            if (j60Var != null) {
                j60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f38821n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f38821n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f38821n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        bh.f fVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f38824p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f38810c0;
            RectF rectF = this.f38830t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f38831u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f38809c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f38829s0);
            fVar.e(this.f38827r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l60.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.w1 w1Var = this.F;
        if (w1Var == null) {
            return;
        }
        float f7 = this.f38809c.e;
        w1Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        ai.w1 w1Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w1Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20994d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21273s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21083i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21139l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21158m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21178n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21115k0, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38828s, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20976c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38828s, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21066h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i12 = org.telegram.ui.ActionBar.h6.f20947ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21084i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21102j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21122k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21177n6));
        int i13 = org.telegram.ui.ActionBar.h6.f21382y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38821n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.h6.f21245r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i14 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20987ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20967bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21004di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38828s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38828s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.ue0 ue0Var = this.f38811d0;
        if (ue0Var != null) {
            arrayList.addAll(ue0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.h20 h20Var = this.f38834y;
        if (h20Var != null) {
            h20Var.setTranslationY(-Math.max(this.m0, this.f38822n0));
        }
    }

    public final void i0() {
        if (this.f38821n.Z0()) {
            this.f38821n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f38805a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f38807b.e);
        int measuredWidth = this.f38821n.getMeasuredWidth();
        int B = org.telegram.messenger.g0.B(i11, this.f38821n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f38809c.e));
        Rect rect = this.f38823o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f38821n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int i10;
        int i11;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        this.f38821n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f38807b.e), 0, AndroidUtilities.dp(this.f38805a) + this.m0 + i10);
        this.f38828s.setPadding(0, 0, 0, this.m0);
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.f38822n0 = k1Var.f44839a.f(8).d;
        h0();
    }

    public final void k0() {
        String string;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f38821n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f38821n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f20427id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20280id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f4Var.c(z11, true);
                        f4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f4Var.c(z10, true);
                        f4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.J;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        f4Var.c(true, false);
                        f4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        f4Var.c(z12, true);
                        f4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.u3) {
                this.f38821n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    u3Var.b(string, new c60(this, 4));
                }
            }
        }
    }

    public final HashSet l0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void m0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.Z.j(i11))));
        }
        g60 g60Var = this.f38833x;
        if (g60Var != null) {
            g60Var.i(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean o0() {
        boolean z10;
        int dp;
        int dp2;
        boolean i10 = this.Z.i();
        boolean z11 = this.R;
        int i11 = this.M;
        boolean z12 = false;
        if (!i10 || i11 == 2 || !z11) {
            long j10 = this.G;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                    b2Var.R = formatPluralString;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < this.Z.m(); i12++) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.Z.j(i12)));
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
                        j10 = this.H;
                    }
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                    String str = "";
                    if (this.Z.m() > 5) {
                        int m10 = this.Z.m();
                        if (chat != null) {
                            str = chat.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", m10, str)));
                        String format = String.format("%d", Integer.valueOf(this.Z.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        b2Var.T = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
                    }
                    org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(getParentActivity(), 1, this.resourceProvider);
                        a2VarArr[0] = a2Var;
                        a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        a2VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            a2VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                        } else {
                            a2VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                        }
                        org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
                        if (LocaleController.isRTL) {
                            dp = AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            dp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            dp2 = AndroidUtilities.dp(16.0f);
                        }
                        a2Var2.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(a2VarArr[0], w7.z5.n(-1, -2));
                        a2VarArr[0].setOnClickListener(new d20(a2VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new xu(9, this, a2VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(b2Var);
                    return true;
                }
            } else if (i11 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i14 = 0; i14 < this.Z.m(); i14++) {
                    TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.Z.j(i14))));
                    if (inputUser != null) {
                        arrayList.add(inputUser);
                    }
                }
                getMessagesController().addUsersToChannel(j10, arrayList, null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new qn(bundle), true);
                return true;
            } else if (this.E) {
                if (z11) {
                    m0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < this.Z.m(); i15++) {
                    arrayList2.add(Long.valueOf(this.Z.j(i15)));
                }
                if (!this.O && !this.P) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        jArr[i16] = ((Long) arrayList2.get(i16)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new s60(bundle2));
                    return true;
                }
                h60 h60Var = this.f38832w;
                if (h60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    h60Var.b(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!f0(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) view;
        if (v30Var.f31140y) {
            this.f38808b0 = null;
            this.h.c(v30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.v30 v30Var2 = this.f38808b0;
        if (v30Var2 != null) {
            v30Var2.a();
        }
        this.f38808b0 = v30Var;
        v30Var.b();
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
        org.telegram.ui.Components.v30 v30Var;
        org.telegram.ui.Components.v30 v30Var2;
        Object user;
        HashSet hashSet = this.f38814f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f38815g0 = z10;
        this.f38816h0 = z11;
        d60 d60Var = this.h;
        if (d60Var == null) {
            this.f38817i0 = arrayList;
            this.f38818j0 = z10;
            this.f38819k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.v30 v30Var3 = new org.telegram.ui.Components.v30(getParentActivity(), "premium");
            this.X = v30Var3;
            this.h.a(v30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (v30Var = this.X) != null) {
            d60Var.c(v30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.v30 v30Var4 = new org.telegram.ui.Components.v30(getParentActivity(), "miniApps");
            this.Y = v30Var4;
            this.h.a(v30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (v30Var2 = this.Y) != null) {
            this.h.c(v30Var2);
            this.Y = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            long longValue = l4.longValue();
            if (longValue < 0) {
                user = getMessagesController().getChat(Long.valueOf(-longValue));
            } else {
                user = getMessagesController().getUser(l4);
            }
            if (user != null) {
                org.telegram.ui.Components.v30 v30Var5 = new org.telegram.ui.Components.v30(getParentActivity(), user);
                this.h.a(v30Var5);
                v30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.n20 n20Var = this.h.d;
        AnimatorSet animatorSet = n20Var.f28664a;
        if (animatorSet != null && animatorSet.isRunning()) {
            n20Var.f28664a.setupEndValues();
            n20Var.f28664a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f38821n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f38821n, new org.telegram.ui.Components.e2(this, i10, 18));
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f38821n.getPaddingTop();
            j0();
            org.telegram.ui.Components.k20 k20Var = this.f38813f;
            ne.e eVar2 = this.f38807b;
            k20Var.setTranslationY(eVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f38821n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((ne.b) this.e.f9070c).f17384f) {
                this.f38821n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            g0();
            i0();
        }
    }

    public final void r0() {
        j60 j60Var;
        ei.e2 e2Var = this.f38813f.f27730r;
        if (e2Var == null) {
            return;
        }
        if (this.M == 2) {
            e2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((j60Var = this.v) == null || j60Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    e2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    e2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            e2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            e2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
        }
    }

    public final void s0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.Z.m(), new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.Q ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.Z.m()), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 != 2 && z11) {
            if (this.E && this.f38806a0.isEmpty()) {
                this.f38834y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f38806a0.isEmpty()) {
                this.f38834y.e(true, true);
                this.E = true;
            }
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
    public final void H(float f7, int i10) {
    }
}
