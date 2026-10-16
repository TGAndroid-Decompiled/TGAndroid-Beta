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
public class j70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, ne.d, View.OnClickListener, qh.d {
    public boolean E;
    public bi.i7 F;
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
    public org.telegram.ui.Components.z30 X;
    public org.telegram.ui.Components.z30 Y;
    public a0.h Z;
    public final int f36939a;
    public ArrayList f36940a0;
    public final ne.e f36941b;
    public org.telegram.ui.Components.z30 f36942b0;
    public final ne.b f36943c;
    public int f36944c0;
    public bi.d4 d;
    public org.telegram.ui.Components.af0 f36945d0;
    public di.p6 e;
    public boolean f36946e0;
    public org.telegram.ui.Components.o20 f36947f;
    public final HashSet f36948f0;
    public boolean f36949g0;
    public b70 h;
    public boolean f36950h0;
    public ArrayList f36951i0;
    public boolean f36952j0;
    public boolean f36953k0;
    public int f36954l0;
    public int m0;
    public org.telegram.ui.Components.mm0 f36955n;
    public int f36956n0;
    public final Rect f36957o0;
    public final bh.f f36958p0;
    public final gh.d f36959q0;
    public s4.b0 f36960r;
    public bh.l f36961r0;
    public org.telegram.ui.Components.wx0 f36962s;
    public final ArrayList f36963s0;
    public final RectF f36964t0;
    public final RectF f36965u0;
    public h70 v;
    public f70 f36966w;
    public e70 f36967x;
    public org.telegram.ui.Components.l20 f36968y;

    public j70(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f36939a = i10;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.f36941b = new ne.e(3, this, esVar, 350L);
        this.f36943c = new ne.b(4, this, esVar, 350L, false);
        this.Z = new a0.h();
        this.f36940a0 = new ArrayList();
        this.f36948f0 = new HashSet();
        this.f36954l0 = -4;
        this.f36957o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f36963s0 = arrayList;
        RectF rectF = new RectF();
        this.f36964t0 = rectF;
        RectF rectF2 = new RectF();
        this.f36965u0 = rectF2;
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
            this.f36958p0 = new bh.f(false);
            this.f36959q0 = new gh.d(null);
            return;
        }
        this.f36958p0 = null;
        this.f36959q0 = null;
    }

    public static void U(j70 j70Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.sc J;
        boolean z10;
        int i11 = j70Var.K;
        long j11 = j70Var.H;
        h70 h70Var = j70Var.v;
        if (i10 == h70Var.f36428w) {
            int i12 = j70Var.currentAccount;
            org.telegram.ui.ActionBar.c6 c6Var = j70Var.resourceProvider;
            z60 z60Var = new z60(j70Var, 0);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            a2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new bi.ia(i12, a2Var, context, c6Var, z60Var, 3));
        } else if (i10 == 0 && h70Var.F != 0 && !h70Var.f36425n) {
            TLRPC.ChatFull chatFull = j70Var.I;
            long j12 = j70Var.G;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.af0 af0Var = new org.telegram.ui.Components.af0(context, j70Var, chatFull, j12, z10);
            j70Var.f36945d0 = af0Var;
            j70Var.showDialog(af0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f20917r) {
                org.telegram.ui.Components.z30 z30Var = j70Var.X;
                if (z30Var == null) {
                    org.telegram.ui.Components.z30 z30Var2 = new org.telegram.ui.Components.z30(j70Var.f36947f.f27510r.getContext(), "premium");
                    j70Var.X = z30Var2;
                    j70Var.h.a(z30Var2);
                    j70Var.X.setOnClickListener(j70Var);
                } else {
                    j70Var.h.c(z30Var);
                    j70Var.X = null;
                }
                j70Var.k0();
            } else if (g4Var.f20918s) {
                org.telegram.ui.Components.z30 z30Var3 = j70Var.Y;
                if (z30Var3 == null) {
                    org.telegram.ui.Components.z30 z30Var4 = new org.telegram.ui.Components.z30(j70Var.f36947f.f27510r.getContext(), "miniapps");
                    j70Var.Y = z30Var4;
                    j70Var.h.a(z30Var4);
                    j70Var.Y.setOnClickListener(j70Var);
                } else {
                    j70Var.h.c(z30Var3);
                    j70Var.Y = null;
                }
                j70Var.k0();
            } else {
                Object object = g4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f19063id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f18916id;
                } else {
                    return;
                }
                a0.h hVar = j70Var.J;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (g4Var.O) {
                        int i13 = -j70Var.f36954l0;
                        j70Var.f36954l0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(j70Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(j70Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.zc.a0(j70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.zc.a0(j70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new z60(j70Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.z30 z30Var5 = (org.telegram.ui.Components.z30) j70Var.Z.f(j10);
                    if (z30Var5 != null) {
                        j70Var.h.c(z30Var5);
                    } else if (i11 == 0 || j70Var.Z.m() != i11) {
                        if (j70Var.M == 0 && j70Var.Z.m() == j70Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j70Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                            a2Var2.R = string;
                            a2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            j70Var.showDialog(a2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (j70Var.R && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.zc.a0(j70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = j70Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j70Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.f19248a;
                                    if (canAddAdmins) {
                                        a2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        a2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new qw(6, j70Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        a2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    j70Var.showDialog(a2Var3);
                                    return;
                                }
                            }
                            j70Var.getMessagesController().putUser(user, !j70Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            j70Var.getMessagesController().putChat((TLRPC.Chat) object, !j70Var.T);
                        }
                        org.telegram.ui.Components.z30 z30Var6 = new org.telegram.ui.Components.z30(j70Var.f36947f.f27510r.getContext(), object);
                        j70Var.h.a(z30Var6);
                        z30Var6.setOnClickListener(j70Var);
                    } else {
                        return;
                    }
                    j70Var.s0();
                    if (!j70Var.T && !j70Var.S) {
                        j70Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(j70Var.f36947f.f27510r);
                    }
                    if (j70Var.f36947f.f27510r.length() > 0) {
                        j70Var.f36947f.f27510r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(j70 j70Var) {
        if (j70Var.F == null) {
            return;
        }
        j70Var.f36943c.a(!j70Var.Z.i(), true);
    }

    public static void a0(j70 j70Var, Canvas canvas, RectF rectF, Paint paint) {
        gh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = j70Var.f36959q0) != null) {
            dVar.v(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
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
        this.f36940a0.clear();
        this.Z.b();
        this.f36942b0 = null;
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
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 28));
        this.f36947f = new org.telegram.ui.Components.o20(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 7);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        b70 b70Var = new b70(this, context, this.currentAccount);
        this.h = b70Var;
        b70Var.setDelegate(new y60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new a70(this, 0));
        b70 b70Var2 = this.h;
        this.Z = b70Var2.f28704b;
        this.f36940a0 = b70Var2.f28705c;
        r0();
        this.f36947f.f27510r.setOnEditorActionListener(new na(this, 4));
        this.f36947f.f27510r.setOnKeyListener(new c70(0, this));
        this.f36947f.f27510r.addTextChangedListener(new n0(this, 6));
        ArrayList arrayList = this.f36951i0;
        if (arrayList != null) {
            p0(arrayList, this.f36952j0, this.f36953k0);
        }
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(6);
        f10Var.f24549w = false;
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, f10Var, 1, null);
        this.f36962s = wx0Var;
        wx0Var.addView(f10Var);
        this.f36962s.e(true, false);
        this.f36962s.d.setText(LocaleController.getString(R.string.NoResult));
        l0Var.addView(this.f36962s);
        this.f36960r = new s4.b0(1, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f36955n = mm0Var;
        mm0Var.setFastScrollEnabled(0);
        this.f36955n.setEmptyView(this.f36962s);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f36955n;
        h70 h70Var = new h70(this, context);
        this.v = h70Var;
        mm0Var2.setAdapter(h70Var);
        this.f36955n.setLayoutManager(this.f36960r);
        this.f36955n.setVerticalScrollBarEnabled(false);
        this.f36955n.setClipToPadding(false);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f36955n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f36955n;
        float f7 = -this.f36939a;
        l0Var.addView(mm0Var4, w7.z5.a(-1.0f, 0.0f, f7, 0.0f, f7, -1, 119));
        this.f36955n.setOnItemClickListener(new bi.z5(17, this, context));
        this.f36955n.setOnScrollListener(new k3(this, 13));
        org.telegram.ui.Components.mm0 mm0Var5 = this.f36955n;
        mm0Var5.W1 = true;
        mm0Var5.X1 = 0;
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, this.resourceProvider, false);
        this.f36968y = l20Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            f2Var.f19482l = 180;
            f2Var.invalidateSelf();
            this.f36968y.f26585c.setImageDrawable(f2Var);
        } else {
            l20Var.f26585c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            l0Var.addView(this.f36968y, org.telegram.ui.Components.l20.b());
        }
        this.f36968y.setOnClickListener(new a70(this, 1));
        this.f36968y.e(this.E, false);
        this.f36968y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new bi.i7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, this.resourceProvider));
            this.F.addView(view, w7.z5.a(1.0f / AndroidUtilities.density, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.z5.e(-1, -2, 87));
            di.d dVar = new di.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new a70(this, 2));
            di.d dVar2 = new di.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.br(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new a70(this, 3));
            l0Var.addView(this.F, w7.z5.e(-1, -2, 87));
            g0();
        }
        s0();
        bi.d4 d4Var = new bi.d4(this, context);
        this.d = d4Var;
        l0Var.addView(d4Var, w7.z5.e(-1, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f36947f, w7.z5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        l0Var.addView(this.h);
        org.telegram.ui.Components.mm0 mm0Var6 = this.f36955n;
        Objects.requireNonNull(mm0Var6);
        this.f36961r0 = new bh.l(mm0Var6, l0Var, new bt(mm0Var6, 0));
        this.f36955n.C0(new z60(this, 3));
        di.p6 p6Var = new di.p6(context, this.parentLayout);
        this.e = p6Var;
        p6Var.b(false, false);
        l0Var.addView(this.e, w7.z5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31818g1.d.add(this);
        }
        View view2 = this.fragmentView;
        y60 y60Var = new y60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(view2, y60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            h70 h70Var = this.v;
            if (h70Var != null) {
                h70Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f36955n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f36955n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f36955n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
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
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f36958p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f36944c0;
            RectF rectF = this.f36964t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f36965u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f36943c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f36963s0);
            fVar.e(this.f36961r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j70.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        bi.i7 i7Var = this.F;
        if (i7Var == null) {
            return;
        }
        float f7 = this.f36943c.e;
        i7Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        bi.i7 i7Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        i7Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f19880s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19746l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19765m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19785n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36962s, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19583c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36962s, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f19673h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Zh));
        int i12 = org.telegram.ui.ActionBar.g6.f19554ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19691i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19709j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19729k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19784n6));
        int i13 = org.telegram.ui.ActionBar.g6.f19988y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36955n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        int i14 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19594ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19574bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19611di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36962s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36962s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.af0 af0Var = this.f36945d0;
        if (af0Var != null) {
            arrayList.addAll(af0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.l20 l20Var = this.f36968y;
        if (l20Var != null) {
            l20Var.setTranslationY(-Math.max(this.m0, this.f36956n0));
        }
    }

    public final void i0() {
        if (this.f36955n.Z0()) {
            this.f36955n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f36939a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f36941b.e);
        int measuredWidth = this.f36955n.getMeasuredWidth();
        int B = org.telegram.messenger.g0.B(i11, this.f36955n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f36943c.e));
        Rect rect = this.f36957o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f36955n.setClipBounds(rect);
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
        this.f36955n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f36941b.e), 0, AndroidUtilities.dp(this.f36939a) + this.m0 + i10);
        this.f36962s.setPadding(0, 0, 0, this.m0);
    }

    @Override
    public final void k(r0.l1 l1Var) {
        this.f36956n0 = l1Var.f43497a.f(8).d;
        h0();
    }

    public final void k0() {
        String string;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f36955n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f36955n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19063id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f18916id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g4Var.c(z11, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g4Var.c(z10, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.J;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g4Var.c(z12, true);
                        g4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                this.f36955n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new a70(this, 4));
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
        e70 e70Var = this.f36967x;
        if (e70Var != null) {
            e70Var.i(i10, arrayList);
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
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.R = formatPluralString;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.j61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        a2Var.T = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
                    }
                    org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(getParentActivity(), 1, this.resourceProvider);
                        a2VarArr[0] = a2Var2;
                        a2Var2.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                        a2VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            a2VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                        } else {
                            a2VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                        }
                        org.telegram.ui.Cells.a2 a2Var3 = a2VarArr[0];
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
                        a2Var3.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(a2VarArr[0], w7.z5.n(-1, -2));
                        a2VarArr[0].setOnClickListener(new a30(a2VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new qw(7, this, a2VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(a2Var);
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
                presentFragment(new fo(bundle), true);
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
                    presentFragment(new p70(bundle2));
                    return true;
                }
                f70 f70Var = this.f36966w;
                if (f70Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    f70Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) view;
        if (z30Var.f31447y) {
            this.f36942b0 = null;
            this.h.c(z30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.z30 z30Var2 = this.f36942b0;
        if (z30Var2 != null) {
            z30Var2.a();
        }
        this.f36942b0 = z30Var;
        z30Var.b();
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

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f36955n.getPaddingTop();
            j0();
            org.telegram.ui.Components.o20 o20Var = this.f36947f;
            ne.e eVar2 = this.f36941b;
            o20Var.setTranslationY(eVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f36955n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((ne.b) this.e.f7591c).f16004f) {
                this.f36955n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            g0();
            i0();
        }
    }

    public final void p0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.z30 z30Var;
        org.telegram.ui.Components.z30 z30Var2;
        Object user;
        HashSet hashSet = this.f36948f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f36949g0 = z10;
        this.f36950h0 = z11;
        b70 b70Var = this.h;
        if (b70Var == null) {
            this.f36951i0 = arrayList;
            this.f36952j0 = z10;
            this.f36953k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.z30 z30Var3 = new org.telegram.ui.Components.z30(getParentActivity(), "premium");
            this.X = z30Var3;
            this.h.a(z30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (z30Var = this.X) != null) {
            b70Var.c(z30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.z30 z30Var4 = new org.telegram.ui.Components.z30(getParentActivity(), "miniApps");
            this.Y = z30Var4;
            this.h.a(z30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (z30Var2 = this.Y) != null) {
            this.h.c(z30Var2);
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
                org.telegram.ui.Components.z30 z30Var5 = new org.telegram.ui.Components.z30(getParentActivity(), user);
                this.h.a(z30Var5);
                z30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.r20 r20Var = this.h.d;
        AnimatorSet animatorSet = r20Var.f28405a;
        if (animatorSet != null && animatorSet.isRunning()) {
            r20Var.f28405a.setupEndValues();
            r20Var.f28405a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f36955n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f36955n, new org.telegram.ui.Components.o8(this, i10, 17));
    }

    public final void r0() {
        h70 h70Var;
        di.g2 g2Var = this.f36947f.f27510r;
        if (g2Var == null) {
            return;
        }
        if (this.M == 2) {
            g2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((h70Var = this.v) == null || h70Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    g2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    g2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            g2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            g2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
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
            if (this.E && this.f36940a0.isEmpty()) {
                this.f36968y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f36940a0.isEmpty()) {
                this.f36968y.e(true, true);
                this.E = true;
            }
        }
    }

    @Override
    public final void J() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
