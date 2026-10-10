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
public class c70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, me.d, View.OnClickListener, ph.d {
    public boolean E;
    public ai.x7 F;
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
    public org.telegram.ui.Components.e40 X;
    public org.telegram.ui.Components.e40 Y;
    public a0.i Z;
    public final int f36586a;
    public ArrayList f36587a0;
    public final me.e f36588b;
    public org.telegram.ui.Components.e40 f36589b0;
    public final me.b f36590c;
    public int f36591c0;
    public ai.o4 d;
    public org.telegram.ui.Components.df0 f36592d0;
    public ci.r6 f36593e;
    public boolean f36594e0;
    public org.telegram.ui.Components.t20 f36595f;
    public final HashSet f36596f0;
    public boolean f36597g0;
    public u60 h;
    public boolean f36598h0;
    public ArrayList f36599i0;
    public boolean f36600j0;
    public boolean f36601k0;
    public int f36602l0;
    public int m0;
    public org.telegram.ui.Components.rm0 f36603n;
    public int f36604n0;
    public final Rect f36605o0;
    public final ah.h f36606p0;
    public final fh.d f36607q0;
    public s4.d0 f36608r;
    public ah.n f36609r0;
    public org.telegram.ui.Components.by0 f36610s;
    public final ArrayList f36611s0;
    public final RectF f36612t0;
    public final RectF f36613u0;
    public a70 v;
    public y60 f36614w;
    public x60 f36615x;
    public org.telegram.ui.Components.q20 f36616y;

    public c70(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f36586a = i10;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f36588b = new me.e(3, this, isVar, 350L);
        this.f36590c = new me.b(4, this, isVar, 350L, false);
        this.Z = new a0.i();
        this.f36587a0 = new ArrayList();
        this.f36596f0 = new HashSet();
        this.f36602l0 = -4;
        this.f36605o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f36611s0 = arrayList;
        RectF rectF = new RectF();
        this.f36612t0 = rectF;
        RectF rectF2 = new RectF();
        this.f36613u0 = rectF2;
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
            this.f36606p0 = new ah.h(false);
            this.f36607q0 = new fh.d(null);
            return;
        }
        this.f36606p0 = null;
        this.f36607q0 = null;
    }

    public static void U(c70 c70Var, Context context, View view, int i10) {
        long j3;
        String str;
        org.telegram.ui.Components.tc J;
        boolean z10;
        int i11 = c70Var.K;
        long j10 = c70Var.H;
        a70 a70Var = c70Var.v;
        if (i10 == a70Var.f35909w) {
            int i12 = c70Var.currentAccount;
            org.telegram.ui.ActionBar.e6 e6Var = c70Var.resourceProvider;
            s60 s60Var = new s60(c70Var, 0);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.za(i12, b2Var, context, e6Var, s60Var, 3));
        } else if (i10 == 0 && a70Var.F != 0 && !a70Var.f35906n) {
            TLRPC.ChatFull chatFull = c70Var.I;
            long j11 = c70Var.G;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.df0 df0Var = new org.telegram.ui.Components.df0(context, c70Var, chatFull, j11, z10);
            c70Var.f36592d0 = df0Var;
            c70Var.showDialog(df0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f22132r) {
                org.telegram.ui.Components.e40 e40Var = c70Var.X;
                if (e40Var == null) {
                    org.telegram.ui.Components.e40 e40Var2 = new org.telegram.ui.Components.e40(c70Var.f36595f.f30958r.getContext(), "premium");
                    c70Var.X = e40Var2;
                    c70Var.h.a(e40Var2);
                    c70Var.X.setOnClickListener(c70Var);
                } else {
                    c70Var.h.c(e40Var);
                    c70Var.X = null;
                }
                c70Var.k0();
            } else if (g4Var.f22133s) {
                org.telegram.ui.Components.e40 e40Var3 = c70Var.Y;
                if (e40Var3 == null) {
                    org.telegram.ui.Components.e40 e40Var4 = new org.telegram.ui.Components.e40(c70Var.f36595f.f30958r.getContext(), "miniapps");
                    c70Var.Y = e40Var4;
                    c70Var.h.a(e40Var4);
                    c70Var.Y.setOnClickListener(c70Var);
                } else {
                    c70Var.h.c(e40Var3);
                    c70Var.Y = null;
                }
                c70Var.k0();
            } else {
                Object object = g4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f20189id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20042id;
                } else {
                    return;
                }
                a0.i iVar = c70Var.J;
                if (iVar == null || iVar.h(j3) < 0) {
                    if (g4Var.O) {
                        int i13 = -c70Var.f36602l0;
                        c70Var.f36602l0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(c70Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.ad.a0(c70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.ad.a0(c70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new s60(c70Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.e40 e40Var5 = (org.telegram.ui.Components.e40) c70Var.Z.f(j3);
                    if (e40Var5 != null) {
                        c70Var.h.c(e40Var5);
                    } else if (i11 == 0 || c70Var.Z.m() != i11) {
                        if (c70Var.M == 0 && c70Var.Z.m() == c70Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c70Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20378a;
                            b2Var2.R = string;
                            b2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            c70Var.showDialog(b2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (c70Var.R && user.bot) {
                                int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.ad.a0(c70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = c70Var.getMessagesController().getChat(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c70Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20378a;
                                    if (canAddAdmins) {
                                        b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new rw(4, c70Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        b2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    c70Var.showDialog(b2Var3);
                                    return;
                                }
                            }
                            c70Var.getMessagesController().putUser(user, !c70Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            c70Var.getMessagesController().putChat((TLRPC.Chat) object, !c70Var.T);
                        }
                        org.telegram.ui.Components.e40 e40Var6 = new org.telegram.ui.Components.e40(c70Var.f36595f.f30958r.getContext(), object);
                        c70Var.h.a(e40Var6);
                        e40Var6.setOnClickListener(c70Var);
                    } else {
                        return;
                    }
                    c70Var.s0();
                    if (!c70Var.T && !c70Var.S) {
                        c70Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(c70Var.f36595f.f30958r);
                    }
                    if (c70Var.f36595f.f30958r.length() > 0) {
                        c70Var.f36595f.f30958r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(c70 c70Var) {
        if (c70Var.F == null) {
            return;
        }
        c70Var.f36590c.a(!c70Var.Z.i(), true);
    }

    public static void a0(c70 c70Var, Canvas canvas, RectF rectF, Paint paint) {
        fh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = c70Var.f36607q0) != null) {
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
        this.f36587a0.clear();
        this.Z.b();
        this.f36589b0 = null;
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
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 26));
        this.f36595f = new org.telegram.ui.Components.t20(context, this.resourceProvider);
        k0 k0Var = new k0(this, context, 7);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        u60 u60Var = new u60(this, context, this.currentAccount);
        this.h = u60Var;
        u60Var.setDelegate(new r60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new t60(this, 0));
        u60 u60Var2 = this.h;
        this.Z = u60Var2.f32817b;
        this.f36587a0 = u60Var2.f32818c;
        r0();
        this.f36595f.f30958r.setOnEditorActionListener(new ja(this, 4));
        this.f36595f.f30958r.setOnKeyListener(new v60(0, this));
        this.f36595f.f30958r.addTextChangedListener(new m0(this, 6));
        ArrayList arrayList = this.f36599i0;
        if (arrayList != null) {
            p0(arrayList, this.f36600j0, this.f36601k0);
        }
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        k10Var.setViewType(6);
        k10Var.f27857w = false;
        org.telegram.ui.Components.by0 by0Var = new org.telegram.ui.Components.by0(context, k10Var, 1, null);
        this.f36610s = by0Var;
        by0Var.addView(k10Var);
        this.f36610s.e(true, false);
        this.f36610s.d.setText(LocaleController.getString(R.string.NoResult));
        k0Var.addView(this.f36610s);
        this.f36608r = new s4.d0(1, false);
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f36603n = rm0Var;
        rm0Var.setFastScrollEnabled(0);
        this.f36603n.setEmptyView(this.f36610s);
        org.telegram.ui.Components.rm0 rm0Var2 = this.f36603n;
        a70 a70Var = new a70(this, context);
        this.v = a70Var;
        rm0Var2.setAdapter(a70Var);
        this.f36603n.setLayoutManager(this.f36608r);
        this.f36603n.setVerticalScrollBarEnabled(false);
        this.f36603n.setClipToPadding(false);
        org.telegram.ui.Components.rm0 rm0Var3 = this.f36603n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        rm0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.rm0 rm0Var4 = this.f36603n;
        float f7 = -this.f36586a;
        k0Var.addView(rm0Var4, w7.x5.a(-1.0f, 0.0f, f7, 0.0f, f7, -1, 119));
        this.f36603n.setOnItemClickListener(new ai.o6(17, this, context));
        this.f36603n.setOnScrollListener(new i3(this, 13));
        org.telegram.ui.Components.rm0 rm0Var5 = this.f36603n;
        rm0Var5.W1 = true;
        rm0Var5.X1 = 0;
        org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(context, this.resourceProvider, false);
        this.f36616y = q20Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f20645l = 180;
            g2Var.invalidateSelf();
            this.f36616y.f29985c.setImageDrawable(g2Var);
        } else {
            q20Var.f29985c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            k0Var.addView(this.f36616y, org.telegram.ui.Components.q20.b());
        }
        this.f36616y.setOnClickListener(new t60(this, 1));
        this.f36616y.e(this.E, false);
        this.f36616y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.x7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20802d7, this.resourceProvider));
            this.F.addView(view, w7.x5.a(1.0f / AndroidUtilities.density, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.x5.e(-1, -2, 87));
            ci.d dVar = new ci.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new t60(this, 2));
            ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.er(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new t60(this, 3));
            k0Var.addView(this.F, w7.x5.e(-1, -2, 87));
            g0();
        }
        s0();
        ai.o4 o4Var = new ai.o4(this, context);
        this.d = o4Var;
        k0Var.addView(o4Var, w7.x5.e(-1, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f36595f, w7.x5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        k0Var.addView(this.h);
        org.telegram.ui.Components.rm0 rm0Var6 = this.f36603n;
        Objects.requireNonNull(rm0Var6);
        this.f36609r0 = new ah.n(rm0Var6, k0Var, new vs(rm0Var6, 0));
        this.f36603n.C0(new s60(this, 3));
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.f36593e = r6Var;
        r6Var.b(false, false);
        k0Var.addView(this.f36593e, w7.x5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33828g1.d.add(this);
        }
        View view2 = this.fragmentView;
        r60 r60Var = new r60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f46810a;
        r0.a0.i(view2, r60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            a70 a70Var = this.v;
            if (a70Var != null) {
                a70Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f36603n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f36603n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f36603n.getChildAt(i12);
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
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f36606p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f36591c0;
            RectF rectF = this.f36612t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f36613u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f36590c.f16341e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f36611s0);
            hVar.e(this.f36609r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c70.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.x7 x7Var = this.F;
        if (x7Var == null) {
            return;
        }
        float f7 = this.f36590c.f16341e;
        x7Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        ai.x7 x7Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        x7Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20801d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.f21079s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20948l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20967m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20987n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36610s, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20785c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36610s, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20873h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i12 = org.telegram.ui.ActionBar.i6.f20756ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20893i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20911j7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20930k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20986n6));
        int i13 = org.telegram.ui.ActionBar.i6.f21185y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36603n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i14 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20794ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20776bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20813di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36610s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36610s.f25085e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.df0 df0Var = this.f36592d0;
        if (df0Var != null) {
            arrayList.addAll(df0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.q20 q20Var = this.f36616y;
        if (q20Var != null) {
            q20Var.setTranslationY(-Math.max(this.m0, this.f36604n0));
        }
    }

    public final void i0() {
        if (this.f36603n.Z0()) {
            this.f36603n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f36586a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f36588b.f16349e);
        int measuredWidth = this.f36603n.getMeasuredWidth();
        int B = org.telegram.messenger.q.B(i11, this.f36603n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f36590c.f16341e));
        Rect rect = this.f36605o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f36603n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.k1 k1Var) {
        this.f36604n0 = k1Var.f46821a.f(8).d;
        h0();
    }

    public final void j0() {
        int i10;
        int i11;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        this.f36603n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f36588b.f16349e), 0, AndroidUtilities.dp(this.f36586a) + this.m0 + i10);
        this.f36610s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        String string;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f36603n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f36603n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f20189id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20042id;
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
                this.f36603n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new t60(this, 4));
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
        x60 x60Var = this.f36615x;
        if (x60Var != null) {
            x60Var.j(i10, arrayList);
        }
        finishFragment();
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f36603n.getPaddingTop();
            j0();
            org.telegram.ui.Components.t20 t20Var = this.f36595f;
            me.e eVar2 = this.f36588b;
            t20Var.setTranslationY(eVar2.f16349e);
            i0();
            this.f36593e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.f16349e);
            this.d.invalidate();
            int paddingTop2 = this.f36603n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((me.b) this.f36593e.f5908c).f16342f) {
                this.f36603n.scrollBy(0, paddingTop - paddingTop2);
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
            long j3 = this.G;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.n61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
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
                        a2Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
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
                        linearLayout.addView(a2VarArr[0], w7.x5.n(-1, -2));
                        a2VarArr[0].setOnClickListener(new u20(a2VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new rw(5, this, a2VarArr));
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
                presentFragment(new zn(bundle), true);
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
                    presentFragment(new j70(bundle2));
                    return true;
                }
                y60 y60Var = this.f36614w;
                if (y60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    y60Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.e40 e40Var = (org.telegram.ui.Components.e40) view;
        if (e40Var.f25904y) {
            this.f36589b0 = null;
            this.h.c(e40Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.e40 e40Var2 = this.f36589b0;
        if (e40Var2 != null) {
            e40Var2.a();
        }
        this.f36589b0 = e40Var;
        e40Var.b();
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
        org.telegram.ui.Components.e40 e40Var;
        org.telegram.ui.Components.e40 e40Var2;
        Object user;
        HashSet hashSet = this.f36596f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f36597g0 = z10;
        this.f36598h0 = z11;
        u60 u60Var = this.h;
        if (u60Var == null) {
            this.f36599i0 = arrayList;
            this.f36600j0 = z10;
            this.f36601k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.e40 e40Var3 = new org.telegram.ui.Components.e40(getParentActivity(), "premium");
            this.X = e40Var3;
            this.h.a(e40Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (e40Var = this.X) != null) {
            u60Var.c(e40Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.e40 e40Var4 = new org.telegram.ui.Components.e40(getParentActivity(), "miniApps");
            this.Y = e40Var4;
            this.h.a(e40Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (e40Var2 = this.Y) != null) {
            this.h.c(e40Var2);
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
                org.telegram.ui.Components.e40 e40Var5 = new org.telegram.ui.Components.e40(getParentActivity(), user);
                this.h.a(e40Var5);
                e40Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.w20 w20Var = this.h.d;
        AnimatorSet animatorSet = w20Var.f32569a;
        if (animatorSet != null && animatorSet.isRunning()) {
            w20Var.f32569a.setupEndValues();
            w20Var.f32569a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f36603n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f36603n, new org.telegram.ui.Components.nd(this, i10, 17));
    }

    public final void r0() {
        a70 a70Var;
        ci.g2 g2Var = this.f36595f.f30958r;
        if (g2Var == null) {
            return;
        }
        if (this.M == 2) {
            g2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((a70Var = this.v) == null || a70Var.G != 0)) {
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
            if (this.E && this.f36587a0.isEmpty()) {
                this.f36616y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f36587a0.isEmpty()) {
                this.f36616y.e(true, true);
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
    public final void t() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
