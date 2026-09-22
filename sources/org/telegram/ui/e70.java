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
public class e70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, le.d, View.OnClickListener, ph.d {
    public boolean E;
    public ai.v7 F;
    public final long G;
    public final long H;
    public TLRPC.ChatFull I;
    public a0.i J;
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
    public org.telegram.ui.Components.m30 X;
    public org.telegram.ui.Components.m30 Y;
    public a0.i Z;
    public final int f33184a;
    public ArrayList f33185a0;
    public final le.e f33186b;
    public org.telegram.ui.Components.m30 f33187b0;
    public final le.b f33188c;
    public int f33189c0;
    public ai.n4 d;
    public org.telegram.ui.Components.ae0 f33190d0;
    public ci.s6 e;
    public boolean f33191e0;
    public org.telegram.ui.Components.b20 f33192f;
    public final HashSet f33193f0;
    public boolean f33194g0;
    public w60 h;
    public boolean f33195h0;
    public ArrayList f33196i0;
    public boolean f33197j0;
    public boolean f33198k0;
    public int f33199l0;
    public int m0;
    public org.telegram.ui.Components.ll0 f33200n;
    public int f33201n0;
    public final Rect f33202o0;
    public final ah.h f33203p0;
    public final fh.d f33204q0;
    public s4.c0 f33205r;
    public ah.n f33206r0;
    public org.telegram.ui.Components.yw0 f33207s;
    public final ArrayList f33208s0;
    public final RectF f33209t0;
    public final RectF f33210u0;
    public c70 v;
    public a70 f33211w;
    public z60 f33212x;
    public org.telegram.ui.Components.y10 f33213y;

    public e70(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33184a = i10;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.f33186b = new le.e(3, this, qrVar, 350L);
        this.f33188c = new le.b(4, this, qrVar, 350L, false);
        this.Z = new a0.i();
        this.f33185a0 = new ArrayList();
        this.f33193f0 = new HashSet();
        this.f33199l0 = -4;
        this.f33202o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f33208s0 = arrayList;
        RectF rectF = new RectF();
        this.f33209t0 = rectF;
        RectF rectF2 = new RectF();
        this.f33210u0 = rectF2;
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
            this.f33203p0 = new ah.h(false);
            this.f33204q0 = new fh.d(null);
            return;
        }
        this.f33203p0 = null;
        this.f33204q0 = null;
    }

    public static void U(e70 e70Var, Context context, View view, int i10) {
        long j3;
        String str;
        org.telegram.ui.Components.oc J;
        boolean z10;
        int i11 = e70Var.K;
        long j10 = e70Var.H;
        c70 c70Var = e70Var.v;
        if (i10 == c70Var.f32697w) {
            int i12 = e70Var.currentAccount;
            org.telegram.ui.ActionBar.e6 e6Var = e70Var.resourceProvider;
            u60 u60Var = new u60(e70Var, 0);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.ya(i12, b2Var, context, e6Var, u60Var, 3));
        } else if (i10 == 0 && c70Var.F != 0 && !c70Var.f32694n) {
            TLRPC.ChatFull chatFull = e70Var.I;
            long j11 = e70Var.G;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.ae0 ae0Var = new org.telegram.ui.Components.ae0(context, e70Var, chatFull, j11, z10);
            e70Var.f33190d0 = ae0Var;
            e70Var.showDialog(ae0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f20119r) {
                org.telegram.ui.Components.m30 m30Var = e70Var.X;
                if (m30Var == null) {
                    org.telegram.ui.Components.m30 m30Var2 = new org.telegram.ui.Components.m30(e70Var.f33192f.f22569r.getContext(), "premium");
                    e70Var.X = m30Var2;
                    e70Var.h.a(m30Var2);
                    e70Var.X.setOnClickListener(e70Var);
                } else {
                    e70Var.h.c(m30Var);
                    e70Var.X = null;
                }
                e70Var.k0();
            } else if (g4Var.f20120s) {
                org.telegram.ui.Components.m30 m30Var3 = e70Var.Y;
                if (m30Var3 == null) {
                    org.telegram.ui.Components.m30 m30Var4 = new org.telegram.ui.Components.m30(e70Var.f33192f.f22569r.getContext(), "miniapps");
                    e70Var.Y = m30Var4;
                    e70Var.h.a(m30Var4);
                    e70Var.Y.setOnClickListener(e70Var);
                } else {
                    e70Var.h.c(m30Var3);
                    e70Var.Y = null;
                }
                e70Var.k0();
            } else {
                Object object = g4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f18256id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18109id;
                } else {
                    return;
                }
                a0.i iVar = e70Var.J;
                if (iVar == null || iVar.h(j3) < 0) {
                    if (g4Var.O) {
                        int i13 = -e70Var.f33199l0;
                        e70Var.f33199l0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(e70Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(e70Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.vc.a0(e70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.vc.a0(e70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new u60(e70Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.m30 m30Var5 = (org.telegram.ui.Components.m30) e70Var.Z.f(j3);
                    if (m30Var5 != null) {
                        e70Var.h.c(m30Var5);
                    } else if (i11 == 0 || e70Var.Z.m() != i11) {
                        if (e70Var.M == 0 && e70Var.Z.m() == e70Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e70Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18435a;
                            b2Var2.R = string;
                            b2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            e70Var.showDialog(b2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (e70Var.R && user.bot) {
                                int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.vc.a0(e70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = e70Var.getMessagesController().getChat(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e70Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f18435a;
                                    if (canAddAdmins) {
                                        b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new d20(2, e70Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        b2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    e70Var.showDialog(b2Var3);
                                    return;
                                }
                            }
                            e70Var.getMessagesController().putUser(user, !e70Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            e70Var.getMessagesController().putChat((TLRPC.Chat) object, !e70Var.T);
                        }
                        org.telegram.ui.Components.m30 m30Var6 = new org.telegram.ui.Components.m30(e70Var.f33192f.f22569r.getContext(), object);
                        e70Var.h.a(m30Var6);
                        m30Var6.setOnClickListener(e70Var);
                    } else {
                        return;
                    }
                    e70Var.s0();
                    if (!e70Var.T && !e70Var.S) {
                        e70Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(e70Var.f33192f.f22569r);
                    }
                    if (e70Var.f33192f.f22569r.length() > 0) {
                        e70Var.f33192f.f22569r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(e70 e70Var) {
        if (e70Var.F == null) {
            return;
        }
        e70Var.f33188c.a(!e70Var.Z.i(), true);
    }

    public static void a0(e70 e70Var, Canvas canvas, RectF rectF, Paint paint) {
        fh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = e70Var.f33204q0) != null) {
            dVar.y(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f33200n.getPaddingTop();
            j0();
            org.telegram.ui.Components.b20 b20Var = this.f33192f;
            le.e eVar2 = this.f33186b;
            b20Var.setTranslationY(eVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f33200n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((le.b) this.e.f5514c).f13973f) {
                this.f33200n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            g0();
            i0();
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
        this.f33185a0.clear();
        this.Z.b();
        this.f33187b0 = null;
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
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 26));
        this.f33192f = new org.telegram.ui.Components.b20(context, this.resourceProvider);
        j0 j0Var = new j0(this, context, 7);
        this.fragmentView = j0Var;
        j0Var.setFocusableInTouchMode(true);
        j0Var.setDescendantFocusability(131072);
        w60 w60Var = new w60(this, context, this.currentAccount);
        this.h = w60Var;
        w60Var.setDelegate(new t60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new v60(this, 0));
        w60 w60Var2 = this.h;
        this.Z = w60Var2.f23782b;
        this.f33185a0 = w60Var2.f23783c;
        r0();
        this.f33192f.f22569r.setOnEditorActionListener(new ia(this, 4));
        this.f33192f.f22569r.setOnKeyListener(new x60(0, this));
        this.f33192f.f22569r.addTextChangedListener(new l0(this, 6));
        ArrayList arrayList = this.f33196i0;
        if (arrayList != null) {
            p0(arrayList, this.f33197j0, this.f33198k0);
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(6);
        t00Var.f28015w = false;
        org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, t00Var, 1, null);
        this.f33207s = yw0Var;
        yw0Var.addView(t00Var);
        this.f33207s.e(true, false);
        this.f33207s.d.setText(LocaleController.getString(R.string.NoResult));
        j0Var.addView(this.f33207s);
        this.f33205r = new s4.c0(1, false);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f33200n = ll0Var;
        ll0Var.setFastScrollEnabled(0);
        this.f33200n.setEmptyView(this.f33207s);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f33200n;
        c70 c70Var = new c70(this, context);
        this.v = c70Var;
        ll0Var2.setAdapter(c70Var);
        this.f33200n.setLayoutManager(this.f33205r);
        this.f33200n.setVerticalScrollBarEnabled(false);
        this.f33200n.setClipToPadding(false);
        org.telegram.ui.Components.ll0 ll0Var3 = this.f33200n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        ll0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.ll0 ll0Var4 = this.f33200n;
        float f7 = -this.f33184a;
        j0Var.addView(ll0Var4, w7.x5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f33200n.setOnItemClickListener(new ai.o6(17, this, context));
        this.f33200n.setOnScrollListener(new h3(this, 13));
        org.telegram.ui.Components.ll0 ll0Var5 = this.f33200n;
        ll0Var5.Y1 = true;
        ll0Var5.Z1 = 0;
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f33213y = y10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f18683l = 180;
            g2Var.invalidateSelf();
            this.f33213y.f30127c.setImageDrawable(g2Var);
        } else {
            y10Var.f30127c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            j0Var.addView(this.f33213y, org.telegram.ui.Components.y10.b());
        }
        this.f33213y.setOnClickListener(new v60(this, 1));
        this.f33213y.e(this.E, false);
        this.f33213y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.v7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18835d7, this.resourceProvider));
            this.F.addView(view, w7.x5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.x5.e(-1, -2, 87));
            ci.d dVar = new ci.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new v60(this, 2));
            ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.oq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new v60(this, 3));
            j0Var.addView(this.F, w7.x5.e(-1, -2, 87));
            g0();
        }
        s0();
        ai.n4 n4Var = new ai.n4(this, context);
        this.d = n4Var;
        j0Var.addView(n4Var, w7.x5.e(-1, 0, 48));
        j0Var.addView(this.actionBar);
        j0Var.addView(this.f33192f, w7.x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        j0Var.addView(this.h);
        org.telegram.ui.Components.ll0 ll0Var6 = this.f33200n;
        Objects.requireNonNull(ll0Var6);
        this.f33206r0 = new ah.n(ll0Var6, j0Var, new xs(ll0Var6, 0));
        this.f33200n.C0(new u60(this, 3));
        ci.s6 s6Var = new ci.s6(context, this.parentLayout);
        this.e = s6Var;
        s6Var.b(false, false);
        j0Var.addView(this.e, w7.x5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f30824g1.d.add(this);
        }
        View view2 = this.fragmentView;
        t60 t60Var = new t60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f41839a;
        r0.a0.j(view2, t60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            c70 c70Var = this.v;
            if (c70Var != null) {
                c70Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f33200n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f33200n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f33200n.getChildAt(i12);
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
        ah.h hVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f33203p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f33189c0;
            RectF rectF = this.f33209t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f33210u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f33188c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f33208s0);
            hVar.e(this.f33206r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e70.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.v7 v7Var = this.F;
        if (v7Var == null) {
            return;
        }
        float f7 = this.f33188c.e;
        v7Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        ai.v7 v7Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        v7Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f18834d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.f19110s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19165v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19129t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f18923i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f18980l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f18999m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19019n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f18955k0, null, null, org.telegram.ui.ActionBar.i6.f18835d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33207s, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f18817c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33207s, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f18905h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i12 = org.telegram.ui.ActionBar.i6.f18789ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18924i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18942j7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18962k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19018n6));
        int i13 = org.telegram.ui.ActionBar.i6.f19215y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33200n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.i6.f19083r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i14 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f18827ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f18808bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f18846di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33207s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33207s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.ae0 ae0Var = this.f33190d0;
        if (ae0Var != null) {
            arrayList.addAll(ae0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.y10 y10Var = this.f33213y;
        if (y10Var != null) {
            y10Var.setTranslationY(-Math.max(this.m0, this.f33201n0));
        }
    }

    public final void i0() {
        if (this.f33200n.Z0()) {
            this.f33200n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f33184a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f33186b.e);
        int measuredWidth = this.f33200n.getMeasuredWidth();
        int B = org.telegram.messenger.y0.B(i11, this.f33200n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f33188c.e));
        Rect rect = this.f33202o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f33200n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f33201n0 = l1Var.f41851a.f(8).d;
        h0();
    }

    public final void j0() {
        int i10;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.ll0 ll0Var = this.f33200n;
        int i11 = this.f33184a;
        ll0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f33186b.e), 0, AndroidUtilities.dp(i11) + this.m0 + i10);
        this.f33207s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        String string;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f33200n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f33200n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18256id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18109id;
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
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.i iVar = this.J;
                    if (iVar != null && iVar.h(j3) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j3) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g4Var.c(z12, true);
                        g4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                this.f33200n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new v60(this, 4));
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
        z60 z60Var = this.f33212x;
        if (z60Var != null) {
            z60Var.j(i10, arrayList);
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
            long j3 = this.G;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
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
                    if (j3 == 0) {
                        j3 = this.H;
                    }
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        b2Var.T = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
                    }
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                        z1VarArr[0] = z1Var;
                        z1Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
                        z1VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                        } else {
                            z1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                        }
                        org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
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
                        z1Var2.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(z1VarArr[0], w7.x5.n(-1, -2));
                        z1VarArr[0].setOnClickListener(new w20(z1VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new d20(3, this, z1VarArr));
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
                getMessagesController().addUsersToChannel(j3, arrayList, null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new bo(bundle), true);
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
                    presentFragment(new l70(bundle2));
                    return true;
                }
                a70 a70Var = this.f33211w;
                if (a70Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    a70Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) view;
        if (m30Var.f26054y) {
            this.f33187b0 = null;
            this.h.c(m30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.m30 m30Var2 = this.f33187b0;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.f33187b0 = m30Var;
        m30Var.b();
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
        org.telegram.ui.Components.m30 m30Var;
        org.telegram.ui.Components.m30 m30Var2;
        Object user;
        HashSet hashSet = this.f33193f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f33194g0 = z10;
        this.f33195h0 = z11;
        w60 w60Var = this.h;
        if (w60Var == null) {
            this.f33196i0 = arrayList;
            this.f33197j0 = z10;
            this.f33198k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.m30 m30Var3 = new org.telegram.ui.Components.m30(getParentActivity(), "premium");
            this.X = m30Var3;
            this.h.a(m30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (m30Var = this.X) != null) {
            w60Var.c(m30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.m30 m30Var4 = new org.telegram.ui.Components.m30(getParentActivity(), "miniApps");
            this.Y = m30Var4;
            this.h.a(m30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (m30Var2 = this.Y) != null) {
            this.h.c(m30Var2);
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
                org.telegram.ui.Components.m30 m30Var5 = new org.telegram.ui.Components.m30(getParentActivity(), user);
                this.h.a(m30Var5);
                m30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.e20 e20Var = this.h.d;
        AnimatorSet animatorSet = e20Var.f23488a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.f23488a.setupEndValues();
            e20Var.f23488a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f33200n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f33200n, new org.telegram.ui.Components.id(this, i10, 16));
    }

    public final void r0() {
        c70 c70Var;
        ci.h2 h2Var = this.f33192f.f22569r;
        if (h2Var == null) {
            return;
        }
        if (this.M == 2) {
            h2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((c70Var = this.v) == null || c70Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    h2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    h2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            h2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            h2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
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
            if (this.E && this.f33185a0.isEmpty()) {
                this.f33213y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f33185a0.isEmpty()) {
                this.f33213y.e(true, true);
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
    public final void s() {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
