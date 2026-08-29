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
public class m60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, vd.b, View.OnClickListener, ah.d {
    public boolean A;
    public bg.z3 B;
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
    public org.telegram.ui.Components.j30 T;
    public org.telegram.ui.Components.j30 U;
    public a0.h V;
    public ArrayList W;
    public org.telegram.ui.Components.j30 X;
    public int Y;
    public org.telegram.ui.Components.vd0 Z;
    public final int f40441a;
    public boolean f40442a0;
    public final vd.c f40443b;
    public final HashSet f40444b0;
    public final vd.a f40445c;
    public boolean f40446c0;
    public lh.z2 d;
    public boolean f40447d0;
    public cg.i0 f40448e;
    public ArrayList f40449e0;
    public org.telegram.ui.Components.x10 f40450f;
    public boolean f40451f0;
    public boolean f40452g0;
    public e60 h;
    public int f40453h0;
    public int f40454i0;
    public int f40455j0;
    public final Rect f40456k0;
    public final lg.e f40457l0;
    public final qg.d m0;
    public org.telegram.ui.Components.jl0 f40458n;
    public lg.k f40459n0;
    public final ArrayList f40460o0;
    public final RectF f40461p0;
    public final RectF f40462q0;
    public f2.j0 f40463r;
    public org.telegram.ui.Components.qw0 f40464s;
    public k60 v;
    public i60 f40465w;
    public h60 f40466x;
    public org.telegram.ui.Components.u10 f40467y;

    public m60(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f40441a = i10;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.f40443b = new vd.c(3, this, jrVar, 350L);
        this.f40445c = new vd.a(4, this, jrVar, 350L, false);
        this.V = new a0.h();
        this.W = new ArrayList();
        this.f40444b0 = new HashSet();
        this.f40453h0 = -4;
        this.f40456k0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f40460o0 = arrayList;
        RectF rectF = new RectF();
        this.f40461p0 = rectF;
        RectF rectF2 = new RectF();
        this.f40462q0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i13 = bundle.getInt("chatType", 0);
        this.I = i13;
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
        if (!z10 && !z11 && !z13) {
            if (z12) {
                this.G = getMessagesController().conferenceCallSizeLimit - 1;
            } else {
                MessagesController messagesController = getMessagesController();
                if (i13 == 0) {
                    i11 = messagesController.maxMegagroupCount;
                } else {
                    i11 = messagesController.maxBroadcastCount;
                }
                this.G = i11;
            }
        } else {
            this.G = 0;
        }
        if (i12 >= 31) {
            this.f40457l0 = new lg.e(false);
            this.m0 = new qg.d(null);
            return;
        }
        this.f40457l0 = null;
        this.m0 = null;
    }

    public static void U(m60 m60Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.mc J;
        boolean z10;
        int i11 = m60Var.G;
        long j11 = m60Var.D;
        k60 k60Var = m60Var.v;
        if (i10 == k60Var.f39767w) {
            int i12 = m60Var.currentAccount;
            org.telegram.ui.ActionBar.c6 c6Var = m60Var.resourceProvider;
            c60 c60Var = new c60(m60Var, 0);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            c2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new jf.i0(i12, c2Var, context, c6Var, c60Var, 5));
        } else if (i10 == 0 && k60Var.B != 0 && !k60Var.f39764n) {
            TLRPC.ChatFull chatFull = m60Var.E;
            long j12 = m60Var.C;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context, m60Var, chatFull, j12, z10);
            m60Var.Z = vd0Var;
            m60Var.showDialog(vd0Var);
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            if (e4Var.f24283r) {
                org.telegram.ui.Components.j30 j30Var = m60Var.T;
                if (j30Var == null) {
                    org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(m60Var.f40450f.f34546r.getContext(), "premium");
                    m60Var.T = j30Var2;
                    m60Var.h.a(j30Var2);
                    m60Var.T.setOnClickListener(m60Var);
                } else {
                    m60Var.h.c(j30Var);
                    m60Var.T = null;
                }
                m60Var.k0();
            } else if (e4Var.f24284s) {
                org.telegram.ui.Components.j30 j30Var3 = m60Var.U;
                if (j30Var3 == null) {
                    org.telegram.ui.Components.j30 j30Var4 = new org.telegram.ui.Components.j30(m60Var.f40450f.f34546r.getContext(), "miniapps");
                    m60Var.U = j30Var4;
                    m60Var.h.a(j30Var4);
                    m60Var.U.setOnClickListener(m60Var);
                } else {
                    m60Var.h.c(j30Var3);
                    m60Var.U = null;
                }
                m60Var.k0();
            } else {
                Object object = e4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f22539id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22392id;
                } else {
                    return;
                }
                a0.h hVar = m60Var.F;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (e4Var.K) {
                        int i13 = -m60Var.f40453h0;
                        m60Var.f40453h0 = i13;
                        AndroidUtilities.shakeViewSpring(e4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(m60Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(m60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.tc.a0(m60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.tc.a0(m60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c60(m60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.j30 j30Var5 = (org.telegram.ui.Components.j30) m60Var.V.f(j10);
                    if (j30Var5 != null) {
                        m60Var.h.c(j30Var5);
                    } else if (i11 == 0 || m60Var.V.m() != i11) {
                        if (m60Var.I == 0 && m60Var.V.m() == m60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
                            c2Var2.N = string;
                            c2Var2.P = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            m60Var.showDialog(c2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (m60Var.N && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.tc.a0(m60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = m60Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.f22714a;
                                    if (canAddAdmins) {
                                        c2Var3.N = LocaleController.getString(R.string.AddBotAdminAlert);
                                        c2Var3.P = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new xr(12, m60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        c2Var3.P = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    m60Var.showDialog(c2Var3);
                                    return;
                                }
                            }
                            m60Var.getMessagesController().putUser(user, !m60Var.P);
                        } else if (object instanceof TLRPC.Chat) {
                            m60Var.getMessagesController().putChat((TLRPC.Chat) object, !m60Var.P);
                        }
                        org.telegram.ui.Components.j30 j30Var6 = new org.telegram.ui.Components.j30(m60Var.f40450f.f34546r.getContext(), object);
                        m60Var.h.a(j30Var6);
                        j30Var6.setOnClickListener(m60Var);
                    } else {
                        return;
                    }
                    m60Var.s0();
                    if (!m60Var.P && !m60Var.O) {
                        m60Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(m60Var.f40450f.f34546r);
                    }
                    if (m60Var.f40450f.f34546r.length() > 0) {
                        m60Var.f40450f.f34546r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(m60 m60Var) {
        if (m60Var.B == null) {
            return;
        }
        m60Var.f40445c.a(!m60Var.V.i(), true);
    }

    public static void a0(m60 m60Var, Canvas canvas, RectF rectF, Paint paint) {
        qg.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = m60Var.m0) != null) {
            dVar.E0(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final View M() {
        return this.fragmentView;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 3) {
            int paddingTop = this.f40458n.getPaddingTop();
            j0();
            org.telegram.ui.Components.x10 x10Var = this.f40450f;
            vd.c cVar2 = this.f40443b;
            x10Var.setTranslationY(cVar2.f49510e);
            i0();
            this.f40448e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar2.f49510e);
            this.d.invalidate();
            int paddingTop2 = this.f40458n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((vd.a) this.f40448e.f3158c).f49506f) {
                this.f40458n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            g0();
            i0();
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return f0(true);
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        this.P = false;
        this.O = false;
        this.W.clear();
        this.V.b();
        this.X = null;
        boolean z10 = this.N;
        int i12 = this.I;
        if (i12 == 2) {
            this.A = true;
        } else {
            this.A = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.H);
        boolean z11 = this.L;
        boolean z12 = this.K;
        boolean z13 = this.M;
        if (!isEmpty) {
            this.actionBar.setTitle(this.H);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (z10) {
            if (this.D != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
            }
        } else {
            int i13 = this.Q;
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
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (i12 == 0) {
                    i10 = R.string.NewGroup;
                } else {
                    i10 = R.string.NewBroadcastList;
                }
                lVar.setTitle(LocaleController.getString(i10));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 13));
        this.f40450f = new org.telegram.ui.Components.x10(context, this.resourceProvider);
        n0 n0Var = new n0(this, context, 7);
        this.fragmentView = n0Var;
        n0Var.setFocusableInTouchMode(true);
        n0Var.setDescendantFocusability(131072);
        e60 e60Var = new e60(this, context, this.currentAccount);
        this.h = e60Var;
        e60Var.setDelegate(new b60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new d60(this, 0));
        e60 e60Var2 = this.h;
        this.V = e60Var2.f26948b;
        this.W = e60Var2.f26949c;
        r0();
        this.f40450f.f34546r.setOnEditorActionListener(new da(this, 4));
        this.f40450f.f34546r.setOnKeyListener(new f60(0, this));
        this.f40450f.f34546r.addTextChangedListener(new p0(this, 6));
        ArrayList arrayList = this.f40449e0;
        if (arrayList != null) {
            p0(arrayList, this.f40451f0, this.f40452g0);
        }
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        p00Var.setViewType(6);
        p00Var.f31529w = false;
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, p00Var, 1, null);
        this.f40464s = qw0Var;
        qw0Var.addView(p00Var);
        this.f40464s.e(true, false);
        this.f40464s.d.setText(LocaleController.getString(R.string.NoResult));
        n0Var.addView(this.f40464s);
        this.f40463r = new f2.j0(1, false);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f40458n = jl0Var;
        jl0Var.setFastScrollEnabled(0);
        this.f40458n.setEmptyView(this.f40464s);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f40458n;
        k60 k60Var = new k60(this, context);
        this.v = k60Var;
        jl0Var2.setAdapter(k60Var);
        this.f40458n.setLayoutManager(this.f40463r);
        this.f40458n.setVerticalScrollBarEnabled(false);
        this.f40458n.setClipToPadding(false);
        org.telegram.ui.Components.jl0 jl0Var3 = this.f40458n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        jl0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.jl0 jl0Var4 = this.f40458n;
        float f9 = -this.f40441a;
        n0Var.addView(jl0Var4, i7.f6.d(-1, -1.0f, 119, 0.0f, f9, 0.0f, f9));
        this.f40458n.setOnItemClickListener(new eg.w0(18, this, context));
        this.f40458n.setOnScrollListener(new m3(this, 13));
        org.telegram.ui.Components.jl0 jl0Var5 = this.f40458n;
        jl0Var5.U1 = true;
        jl0Var5.V1 = 0;
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.f40467y = u10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.f23477l = 180;
            h2Var.invalidateSelf();
            this.f40467y.f33090c.setImageDrawable(h2Var);
        } else {
            u10Var.f33090c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            n0Var.addView(this.f40467y, org.telegram.ui.Components.u10.b());
        }
        this.f40467y.setOnClickListener(new d60(this, 1));
        this.f40467y.e(this.A, false);
        this.f40467y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.B = new bg.z3(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.resourceProvider));
            this.B.addView(view, i7.f6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.B.addView(linearLayout, i7.f6.e(-1, -2, 87));
            nh.d dVar = new nh.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, i7.f6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new d60(this, 2));
            nh.d dVar2 = new nh.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.iq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, i7.f6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new d60(this, 3));
            n0Var.addView(this.B, i7.f6.e(-1, -2, 87));
            g0();
        }
        s0();
        lh.z2 z2Var = new lh.z2(this, context);
        this.d = z2Var;
        n0Var.addView(z2Var, i7.f6.e(-1, 0, 48));
        n0Var.addView(this.actionBar);
        n0Var.addView(this.f40450f, i7.f6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        n0Var.addView(this.h);
        org.telegram.ui.Components.jl0 jl0Var6 = this.f40458n;
        Objects.requireNonNull(jl0Var6);
        this.f40459n0 = new lg.k(jl0Var6, n0Var, new ms(jl0Var6, 0));
        this.f40458n.C0(new c60(this, 3));
        cg.i0 i0Var = new cg.i0(context, this.parentLayout);
        this.f40448e = i0Var;
        i0Var.b(false, false);
        n0Var.addView(this.f40448e, i7.f6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35568c1.d.add(this);
        }
        View view2 = this.fragmentView;
        b60 b60Var = new b60(this, 3);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(view2, b60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            k60 k60Var = this.v;
            if (k60Var != null) {
                k60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f40458n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f40458n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f40458n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt).f(intValue);
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
        lg.e eVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f40457l0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.Y;
            RectF rectF = this.f40461p0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f9 = -dp;
            rectF.inset(0.0f, f9);
            if (this.B != null) {
                RectF rectF2 = this.f40462q0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.B.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f9);
            }
            if (this.B != null && this.f40445c.f49505e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f40460o0);
            eVar.e(this.f40459n0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m60.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        bg.z3 z3Var = this.B;
        if (z3Var == null) {
            return;
        }
        float f9 = this.f40445c.f49505e;
        z3Var.setTranslationY((1.0f - f9) * AndroidUtilities.dp(12.0f));
        this.B.setAlpha(f9);
        bg.z3 z3Var2 = this.B;
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        z3Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23207l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23224m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23242n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40464s, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40464s, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 16, new Class[]{org.telegram.ui.Cells.d4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 0, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Zh));
        int i12 = org.telegram.ui.ActionBar.g6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23153i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23171j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23190k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23241n6));
        int i13 = org.telegram.ui.ActionBar.g6.f23433y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40458n, 0, new Class[]{org.telegram.ui.Cells.e4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        int i14 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40464s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40464s.f32122e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.vd0 vd0Var = this.Z;
        if (vd0Var != null) {
            arrayList.addAll(vd0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.u10 u10Var = this.f40467y;
        if (u10Var != null) {
            u10Var.setTranslationY(-Math.max(this.f40454i0, this.f40455j0));
        }
    }

    public final void i0() {
        if (this.f40458n.Z0()) {
            this.f40458n.setClipBounds(null);
            return;
        }
        int i10 = this.f40454i0;
        int i11 = this.f40441a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40443b.f49510e);
        int measuredWidth = this.f40458n.getMeasuredWidth();
        int B = org.telegram.messenger.x3.B(i11, this.f40458n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f40445c.f49505e));
        Rect rect = this.f40456k0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f40458n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int i10;
        if (this.M) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.jl0 jl0Var = this.f40458n;
        int i11 = this.f40441a;
        jl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40443b.f49510e), 0, AndroidUtilities.dp(i11) + this.f40454i0 + i10);
        this.f40464s.setPadding(0, 0, 0, this.f40454i0);
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f40455j0 = m1Var.f46843a.f(8).d;
        h0();
    }

    public final void k0() {
        String string;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f40458n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f40458n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                Object object = e4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22539id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22392id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.T != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e4Var.c(z11, true);
                        e4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.U != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e4Var.c(z10, true);
                        e4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.F;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        e4Var.c(true, false);
                        e4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.V.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        e4Var.c(z12, true);
                        e4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.s3) {
                this.f40458n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) childAt;
                    if (this.T == null && this.V.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    s3Var.b(string, new d60(this, 4));
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
        h60 h60Var = this.f40466x;
        if (h60Var != null) {
            h60Var.j(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean o0() {
        boolean z10;
        int dp;
        int dp2;
        boolean i10 = this.V.i();
        boolean z11 = this.N;
        int i11 = this.I;
        boolean z12 = false;
        if (!i10 || i11 == 2 || !z11) {
            long j10 = this.C;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.V.m(), new Object[0]);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = formatPluralString;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < this.V.m(); i12++) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.V.j(i12)));
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
                    String str = "";
                    if (this.V.m() > 5) {
                        int m10 = this.V.m();
                        if (chat != null) {
                            str = chat.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", m10, str)));
                        String format = String.format("%d", Integer.valueOf(this.V.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        c2Var.P = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
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
                        org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
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
                        y1Var2.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(y1VarArr[0], i7.f6.n(-1, -2));
                        y1VarArr[0].setOnClickListener(new e20(y1VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new xr(13, this, y1VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(c2Var);
                    return true;
                }
            } else if (i11 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i14 = 0; i14 < this.V.m(); i14++) {
                    TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.V.j(i14))));
                    if (inputUser != null) {
                        arrayList.add(inputUser);
                    }
                }
                getMessagesController().addUsersToChannel(j10, arrayList, null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new tn(bundle), true);
                return true;
            } else if (this.A) {
                if (z11) {
                    m0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < this.V.m(); i15++) {
                    arrayList2.add(Long.valueOf(this.V.j(i15)));
                }
                if (!this.K && !this.L) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        jArr[i16] = ((Long) arrayList2.get(i16)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.J);
                    presentFragment(new t60(bundle2));
                    return true;
                }
                i60 i60Var = this.f40465w;
                if (i60Var != null) {
                    if (this.T != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.U != null) {
                        z12 = true;
                    }
                    i60Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view;
        if (j30Var.f29540y) {
            this.X = null;
            this.h.c(j30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.j30 j30Var2 = this.X;
        if (j30Var2 != null) {
            j30Var2.a();
        }
        this.X = j30Var;
        j30Var.b();
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
        org.telegram.ui.Components.j30 j30Var;
        org.telegram.ui.Components.j30 j30Var2;
        Object user;
        HashSet hashSet = this.f40444b0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f40446c0 = z10;
        this.f40447d0 = z11;
        e60 e60Var = this.h;
        if (e60Var == null) {
            this.f40449e0 = arrayList;
            this.f40451f0 = z10;
            this.f40452g0 = z11;
            return;
        }
        if (z10 && this.T == null) {
            org.telegram.ui.Components.j30 j30Var3 = new org.telegram.ui.Components.j30(getParentActivity(), "premium");
            this.T = j30Var3;
            this.h.a(j30Var3);
            this.T.setOnClickListener(this);
        } else if (!z10 && (j30Var = this.T) != null) {
            e60Var.c(j30Var);
            this.T = null;
        }
        if (z11 && this.U == null) {
            org.telegram.ui.Components.j30 j30Var4 = new org.telegram.ui.Components.j30(getParentActivity(), "miniApps");
            this.U = j30Var4;
            this.h.a(j30Var4);
            this.U.setOnClickListener(this);
        } else if (!z11 && (j30Var2 = this.U) != null) {
            this.h.c(j30Var2);
            this.U = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            if (longValue < 0) {
                user = getMessagesController().getChat(Long.valueOf(-longValue));
            } else {
                user = getMessagesController().getUser(l10);
            }
            if (user != null) {
                org.telegram.ui.Components.j30 j30Var5 = new org.telegram.ui.Components.j30(getParentActivity(), user);
                this.h.a(j30Var5);
                j30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.a20 a20Var = this.h.d;
        AnimatorSet animatorSet = a20Var.f26623a;
        if (animatorSet != null && animatorSet.isRunning()) {
            a20Var.f26623a.setupEndValues();
            a20Var.f26623a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f40458n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f40458n, new org.telegram.ui.Components.i8(this, i10, 17));
    }

    public final void r0() {
        k60 k60Var;
        ig.f fVar = this.f40450f.f34546r;
        if (fVar == null) {
            return;
        }
        if (this.I == 2) {
            fVar.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.N && ((k60Var = this.v) == null || k60Var.C != 0)) {
            if (!this.K && !this.L) {
                if (this.M) {
                    fVar.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    fVar.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            fVar.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            fVar.setHint(LocaleController.getString(R.string.SearchForPeople));
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
                boolean i11 = this.V.i();
                int i12 = this.G;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.M ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.V.m()), Integer.valueOf(this.V.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 != 2 && z11) {
            if (this.A && this.W.isEmpty()) {
                this.f40467y.e(false, true);
                this.A = false;
            } else if (!this.A && !this.W.isEmpty()) {
                this.f40467y.e(true, true);
                this.A = true;
            }
        }
    }

    @Override
    public final void I() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
