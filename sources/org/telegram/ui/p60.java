package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
public class p60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, ne.d, View.OnClickListener, qh.d {
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
    public org.telegram.ui.Components.t30 X;
    public org.telegram.ui.Components.t30 Y;
    public a0.h Z;
    public final int f40348a;
    public ArrayList f40349a0;
    public final ne.e f40350b;
    public org.telegram.ui.Components.t30 f40351b0;
    public final ne.b f40352c;
    public int f40353c0;
    public ci.h3 d;
    public org.telegram.ui.Components.ve0 f40354d0;
    public ei.g6 e;
    public boolean f40355e0;
    public org.telegram.ui.Components.i20 f40356f;
    public final HashSet f40357f0;
    public boolean f40358g0;
    public h60 h;
    public boolean f40359h0;
    public ArrayList f40360i0;
    public boolean f40361j0;
    public boolean f40362k0;
    public int f40363l0;
    public int m0;
    public org.telegram.ui.Components.lm0 f40364n;
    public int f40365n0;
    public final Rect f40366o0;
    public final bh.f f40367p0;
    public final gh.d f40368q0;
    public s4.b0 f40369r;
    public bh.l f40370r0;
    public org.telegram.ui.Components.vx0 f40371s;
    public final ArrayList f40372s0;
    public final RectF f40373t0;
    public final RectF f40374u0;
    public n60 v;
    public l60 f40375w;
    public k60 f40376x;
    public org.telegram.ui.Components.f20 f40377y;

    public p60(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f40348a = i10;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.f40350b = new ne.e(3, this, zrVar, 350L);
        this.f40352c = new ne.b(4, this, zrVar, 350L, false);
        this.Z = new a0.h();
        this.f40349a0 = new ArrayList();
        this.f40357f0 = new HashSet();
        this.f40363l0 = -4;
        this.f40366o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f40372s0 = arrayList;
        RectF rectF = new RectF();
        this.f40373t0 = rectF;
        RectF rectF2 = new RectF();
        this.f40374u0 = rectF2;
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
            this.f40367p0 = new bh.f(false);
            this.f40368q0 = new gh.d(null);
            return;
        }
        this.f40367p0 = null;
        this.f40368q0 = null;
    }

    public static void U(p60 p60Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.oc J;
        boolean z10;
        int i11 = p60Var.K;
        long j11 = p60Var.H;
        n60 n60Var = p60Var.v;
        if (i10 == n60Var.f39742w) {
            int i12 = p60Var.currentAccount;
            org.telegram.ui.ActionBar.g6 g6Var = p60Var.resourceProvider;
            f60 f60Var = new f60(p60Var, 0);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            c2Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.tb(i12, c2Var, context, g6Var, f60Var, 5));
        } else if (i10 == 0 && n60Var.F != 0 && !n60Var.f39739n) {
            TLRPC.ChatFull chatFull = p60Var.I;
            long j12 = p60Var.G;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.ve0 ve0Var = new org.telegram.ui.Components.ve0(context, p60Var, chatFull, j12, z10);
            p60Var.f40354d0 = ve0Var;
            p60Var.showDialog(ve0Var);
        } else if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (f4Var.f22363r) {
                org.telegram.ui.Components.t30 t30Var = p60Var.X;
                if (t30Var == null) {
                    org.telegram.ui.Components.t30 t30Var2 = new org.telegram.ui.Components.t30(p60Var.f40356f.f27258r.getContext(), "premium");
                    p60Var.X = t30Var2;
                    p60Var.h.a(t30Var2);
                    p60Var.X.setOnClickListener(p60Var);
                } else {
                    p60Var.h.c(t30Var);
                    p60Var.X = null;
                }
                p60Var.k0();
            } else if (f4Var.f22364s) {
                org.telegram.ui.Components.t30 t30Var3 = p60Var.Y;
                if (t30Var3 == null) {
                    org.telegram.ui.Components.t30 t30Var4 = new org.telegram.ui.Components.t30(p60Var.f40356f.f27258r.getContext(), "miniapps");
                    p60Var.Y = t30Var4;
                    p60Var.h.a(t30Var4);
                    p60Var.Y.setOnClickListener(p60Var);
                } else {
                    p60Var.h.c(t30Var3);
                    p60Var.Y = null;
                }
                p60Var.k0();
            } else {
                Object object = f4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f20491id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20344id;
                } else {
                    return;
                }
                a0.h hVar = p60Var.J;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (f4Var.O) {
                        int i13 = -p60Var.f40363l0;
                        p60Var.f40363l0 = i13;
                        AndroidUtilities.shakeViewSpring(f4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(p60Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(p60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.vc.a0(p60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.vc.a0(p60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new f60(p60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.t30 t30Var5 = (org.telegram.ui.Components.t30) p60Var.Z.f(j10);
                    if (t30Var5 != null) {
                        p60Var.h.c(t30Var5);
                    } else if (i11 == 0 || p60Var.Z.m() != i11) {
                        if (p60Var.M == 0 && p60Var.Z.m() == p60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20679a;
                            c2Var2.R = string;
                            c2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            p60Var.showDialog(c2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (p60Var.R && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.vc.a0(p60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = p60Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.f20679a;
                                    if (canAddAdmins) {
                                        c2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        c2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new ks(10, p60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        c2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    p60Var.showDialog(c2Var3);
                                    return;
                                }
                            }
                            p60Var.getMessagesController().putUser(user, !p60Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            p60Var.getMessagesController().putChat((TLRPC.Chat) object, !p60Var.T);
                        }
                        org.telegram.ui.Components.t30 t30Var6 = new org.telegram.ui.Components.t30(p60Var.f40356f.f27258r.getContext(), object);
                        p60Var.h.a(t30Var6);
                        t30Var6.setOnClickListener(p60Var);
                    } else {
                        return;
                    }
                    p60Var.s0();
                    if (!p60Var.T && !p60Var.S) {
                        p60Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(p60Var.f40356f.f27258r);
                    }
                    if (p60Var.f40356f.f27258r.length() > 0) {
                        p60Var.f40356f.f27258r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(p60 p60Var) {
        if (p60Var.F == null) {
            return;
        }
        p60Var.f40352c.a(!p60Var.Z.i(), true);
    }

    public static void a0(p60 p60Var, Canvas canvas, RectF rectF, Paint paint) {
        gh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = p60Var.f40368q0) != null) {
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
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21157bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21367n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21137ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
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
        this.f40349a0.clear();
        this.Z.b();
        this.f40351b0 = null;
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
        this.f40356f = new org.telegram.ui.Components.i20(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 7);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        h60 h60Var = new h60(this, context, this.currentAccount);
        this.h = h60Var;
        h60Var.setDelegate(new e60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new g60(this, 0));
        h60 h60Var2 = this.h;
        this.Z = h60Var2.f28491b;
        this.f40349a0 = h60Var2.f28492c;
        r0();
        this.f40356f.f27258r.setOnEditorActionListener(new ka(this, 4));
        this.f40356f.f27258r.setOnKeyListener(new i60(0, this));
        this.f40356f.f27258r.addTextChangedListener(new n0(this, 6));
        ArrayList arrayList = this.f40360i0;
        if (arrayList != null) {
            p0(arrayList, this.f40361j0, this.f40362k0);
        }
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        z00Var.setViewType(6);
        z00Var.f33104w = false;
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, z00Var, 1, null);
        this.f40371s = vx0Var;
        vx0Var.addView(z00Var);
        this.f40371s.e(true, false);
        this.f40371s.d.setText(LocaleController.getString(R.string.NoResult));
        l0Var.addView(this.f40371s);
        this.f40369r = new s4.b0(1, false);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f40364n = lm0Var;
        lm0Var.setFastScrollEnabled(0);
        this.f40364n.setEmptyView(this.f40371s);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f40364n;
        n60 n60Var = new n60(this, context);
        this.v = n60Var;
        lm0Var2.setAdapter(n60Var);
        this.f40364n.setLayoutManager(this.f40369r);
        this.f40364n.setVerticalScrollBarEnabled(false);
        this.f40364n.setClipToPadding(false);
        org.telegram.ui.Components.lm0 lm0Var3 = this.f40364n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        lm0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.lm0 lm0Var4 = this.f40364n;
        float f7 = -this.f40348a;
        l0Var.addView(lm0Var4, w7.z5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f40364n.setOnItemClickListener(new ci.x4(17, this, context));
        this.f40364n.setOnScrollListener(new j3(this, 13));
        org.telegram.ui.Components.lm0 lm0Var5 = this.f40364n;
        lm0Var5.W1 = true;
        lm0Var5.X1 = 0;
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(context, this.resourceProvider, false);
        this.f40377y = f20Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.f20940l = 180;
            h2Var.invalidateSelf();
            this.f40377y.f26170c.setImageDrawable(h2Var);
        } else {
            f20Var.f26170c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            l0Var.addView(this.f40377y, org.telegram.ui.Components.f20.b());
        }
        this.f40377y.setOnClickListener(new g60(this, 1));
        this.f40377y.e(this.E, false);
        this.f40377y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.w1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, view, this.resourceProvider);
            this.F.addView(view, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.z5.e(-1, -2, 87));
            ei.d dVar = new ei.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.vq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new g60(this, 2));
            ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.vq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new g60(this, 3));
            l0Var.addView(this.F, w7.z5.e(-1, -2, 87));
            g0();
        }
        s0();
        ci.h3 h3Var = new ci.h3(this, context);
        this.d = h3Var;
        l0Var.addView(h3Var, w7.z5.e(-1, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f40356f, w7.z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.lm0 lm0Var6 = this.f40364n;
        Objects.requireNonNull(lm0Var6);
        this.f40370r0 = new bh.l(lm0Var6, l0Var, new ns(lm0Var6, 0));
        this.f40364n.C0(new f60(this, 3));
        ei.g6 g6Var = new ei.g6(context, this.parentLayout);
        this.e = g6Var;
        g6Var.b(false, false);
        l0Var.addView(this.e, w7.z5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33474h1.d.add(this);
        }
        View view2 = this.fragmentView;
        e60 e60Var = new e60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(view2, e60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            n60 n60Var = this.v;
            if (n60Var != null) {
                n60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f40364n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f40364n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f40364n.getChildAt(i12);
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
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f40367p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f40353c0;
            RectF rectF = this.f40373t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f40374u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f40352c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f40372s0);
            fVar.e(this.f40370r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p60.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.w1 w1Var = this.F;
        if (w1Var == null) {
            return;
        }
        float f7 = this.f40352c.e;
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21329l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21348m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21368n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40371s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21166c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40371s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21137ai));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21274i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21292j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40364n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21312k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.t30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21177ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.t30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21194di));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40371s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40371s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21572y6));
        if (this.f40354d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.f20 f20Var = this.f40377y;
        if (f20Var != null) {
            f20Var.setTranslationY(-Math.max(this.m0, this.f40365n0));
        }
    }

    public final void i0() {
        if (this.f40364n.a1()) {
            this.f40364n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f40348a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40350b.e);
        int measuredWidth = this.f40364n.getMeasuredWidth();
        int B = org.telegram.messenger.v0.B(i11, this.f40364n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f40352c.e));
        Rect rect = this.f40366o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f40364n.setClipBounds(rect);
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
        this.f40364n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40350b.e), 0, AndroidUtilities.dp(this.f40348a) + this.m0 + i10);
        this.f40371s.setPadding(0, 0, 0, this.m0);
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.f40365n0 = k1Var.f45250a.f(8).d;
        h0();
    }

    public final void k0() {
        String string;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f40364n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f40364n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f20491id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20344id;
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
                this.f40364n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    u3Var.a(string, new g60(this, 4));
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
        k60 k60Var = this.f40376x;
        if (k60Var != null) {
            k60Var.i(i10, arrayList);
        }
        finishFragment();
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f40364n.getPaddingTop();
            j0();
            org.telegram.ui.Components.i20 i20Var = this.f40356f;
            ne.e eVar2 = this.f40350b;
            i20Var.setTranslationY(eVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f40364n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((ne.b) this.e.f9080c).f17447f) {
                this.f40364n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            g0();
            i0();
        }
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
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.R = formatPluralString;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        c2Var.T = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
                    }
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                        z1VarArr[0] = z1Var;
                        z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
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
                        linearLayout.addView(z1VarArr[0], w7.z5.n(-1, -2));
                        z1VarArr[0].setOnClickListener(new g20(z1VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new ks(11, this, z1VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(c2Var);
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
                presentFragment(new sn(bundle), true);
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
                    presentFragment(new w60(bundle2));
                    return true;
                }
                l60 l60Var = this.f40375w;
                if (l60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    l60Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.t30 t30Var = (org.telegram.ui.Components.t30) view;
        if (t30Var.f30711y) {
            this.f40351b0 = null;
            this.h.c(t30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.t30 t30Var2 = this.f40351b0;
        if (t30Var2 != null) {
            t30Var2.a();
        }
        this.f40351b0 = t30Var;
        t30Var.b();
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
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.i20 i20Var = this.f40356f;
            if (i20Var != null) {
                i20Var.updateColors();
            }
            org.telegram.ui.Components.f20 f20Var = this.f40377y;
            if (f20Var != null) {
                f20Var.updateColors();
            }
            t0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.t30 t30Var;
        org.telegram.ui.Components.t30 t30Var2;
        Object user;
        HashSet hashSet = this.f40357f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f40358g0 = z10;
        this.f40359h0 = z11;
        h60 h60Var = this.h;
        if (h60Var == null) {
            this.f40360i0 = arrayList;
            this.f40361j0 = z10;
            this.f40362k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.t30 t30Var3 = new org.telegram.ui.Components.t30(getParentActivity(), "premium");
            this.X = t30Var3;
            this.h.a(t30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (t30Var = this.X) != null) {
            h60Var.c(t30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.t30 t30Var4 = new org.telegram.ui.Components.t30(getParentActivity(), "miniApps");
            this.Y = t30Var4;
            this.h.a(t30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (t30Var2 = this.Y) != null) {
            this.h.c(t30Var2);
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
                org.telegram.ui.Components.t30 t30Var5 = new org.telegram.ui.Components.t30(getParentActivity(), user);
                this.h.a(t30Var5);
                t30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.l20 l20Var = this.h.d;
        AnimatorSet animatorSet = l20Var.f28139a;
        if (animatorSet != null && animatorSet.isRunning()) {
            l20Var.f28139a.setupEndValues();
            l20Var.f28139a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f40364n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f40364n, new org.telegram.ui.Components.c2(this, i10, 18));
    }

    public final void r0() {
        n60 n60Var;
        ei.e2 e2Var = this.f40356f.f27258r;
        if (e2Var == null) {
            return;
        }
        if (this.M == 2) {
            e2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((n60Var = this.v) == null || n60Var.G != 0)) {
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
            if (this.E && this.f40349a0.isEmpty()) {
                this.f40377y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f40349a0.isEmpty()) {
                this.f40377y.e(true, true);
                this.E = true;
            }
        }
    }

    public final void t0() {
        try {
            org.telegram.ui.Components.lm0 lm0Var = this.f40364n;
            if (lm0Var != null) {
                lm0Var.A1();
                if (this.f40364n.getFastScroll() != null) {
                    this.f40364n.getFastScroll().invalidate();
                }
            }
            h60 h60Var = this.h;
            if (h60Var != null && h60Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i10 = 0; i10 < spansContainer.getChildCount(); i10++) {
                    View childAt = spansContainer.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.t30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
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
