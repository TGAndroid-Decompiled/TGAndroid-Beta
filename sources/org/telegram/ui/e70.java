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
    public final int f33245a;
    public ArrayList f33246a0;
    public final le.e f33247b;
    public org.telegram.ui.Components.m30 f33248b0;
    public final le.b f33249c;
    public int f33250c0;
    public ai.n4 d;
    public org.telegram.ui.Components.ie0 f33251d0;
    public ci.s6 e;
    public boolean f33252e0;
    public org.telegram.ui.Components.b20 f33253f;
    public final HashSet f33254f0;
    public boolean f33255g0;
    public w60 h;
    public boolean f33256h0;
    public ArrayList f33257i0;
    public boolean f33258j0;
    public boolean f33259k0;
    public int f33260l0;
    public int m0;
    public org.telegram.ui.Components.vl0 f33261n;
    public int f33262n0;
    public final Rect f33263o0;
    public final ah.i f33264p0;
    public final fh.d f33265q0;
    public s4.c0 f33266r;
    public ah.o f33267r0;
    public org.telegram.ui.Components.jx0 f33268s;
    public final ArrayList f33269s0;
    public final RectF f33270t0;
    public final RectF f33271u0;
    public c70 v;
    public a70 f33272w;
    public z60 f33273x;
    public org.telegram.ui.Components.y10 f33274y;

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
        this.f33245a = i10;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.f33247b = new le.e(3, this, qrVar, 350L);
        this.f33249c = new le.b(4, this, qrVar, 350L, false);
        this.Z = new a0.i();
        this.f33246a0 = new ArrayList();
        this.f33254f0 = new HashSet();
        this.f33260l0 = -4;
        this.f33263o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f33269s0 = arrayList;
        RectF rectF = new RectF();
        this.f33270t0 = rectF;
        RectF rectF2 = new RectF();
        this.f33271u0 = rectF2;
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
            this.f33264p0 = new ah.i(false);
            this.f33265q0 = new fh.d(null);
            return;
        }
        this.f33264p0 = null;
        this.f33265q0 = null;
    }

    public static void U(e70 e70Var, Context context, View view, int i10) {
        long j3;
        String str;
        org.telegram.ui.Components.pc J;
        boolean z10;
        int i11 = e70Var.K;
        long j10 = e70Var.H;
        c70 c70Var = e70Var.v;
        if (i10 == c70Var.f32658w) {
            int i12 = e70Var.currentAccount;
            org.telegram.ui.ActionBar.f6 f6Var = e70Var.resourceProvider;
            u60 u60Var = new u60(e70Var, 0);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.ya(i12, b2Var, context, f6Var, u60Var, 3));
        } else if (i10 == 0 && c70Var.F != 0 && !c70Var.f32655n) {
            TLRPC.ChatFull chatFull = e70Var.I;
            long j11 = e70Var.G;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.ie0 ie0Var = new org.telegram.ui.Components.ie0(context, e70Var, chatFull, j11, z10);
            e70Var.f33251d0 = ie0Var;
            e70Var.showDialog(ie0Var);
        } else if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.f20383r) {
                org.telegram.ui.Components.m30 m30Var = e70Var.X;
                if (m30Var == null) {
                    org.telegram.ui.Components.m30 m30Var2 = new org.telegram.ui.Components.m30(e70Var.f33253f.f22856r.getContext(), "premium");
                    e70Var.X = m30Var2;
                    e70Var.h.a(m30Var2);
                    e70Var.X.setOnClickListener(e70Var);
                } else {
                    e70Var.h.c(m30Var);
                    e70Var.X = null;
                }
                e70Var.k0();
            } else if (h4Var.f20384s) {
                org.telegram.ui.Components.m30 m30Var3 = e70Var.Y;
                if (m30Var3 == null) {
                    org.telegram.ui.Components.m30 m30Var4 = new org.telegram.ui.Components.m30(e70Var.f33253f.f22856r.getContext(), "miniapps");
                    e70Var.Y = m30Var4;
                    e70Var.h.a(m30Var4);
                    e70Var.Y.setOnClickListener(e70Var);
                } else {
                    e70Var.h.c(m30Var3);
                    e70Var.Y = null;
                }
                e70Var.k0();
            } else {
                Object object = h4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f18475id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18328id;
                } else {
                    return;
                }
                a0.i iVar = e70Var.J;
                if (iVar == null || iVar.h(j3) < 0) {
                    if (h4Var.O) {
                        int i13 = -e70Var.f33260l0;
                        e70Var.f33260l0 = i13;
                        AndroidUtilities.shakeViewSpring(h4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(e70Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(e70Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.xc.a0(e70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.xc.a0(e70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new u60(e70Var, 2));
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
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18654a;
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
                                        org.telegram.ui.Components.xc.a0(e70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = e70Var.getMessagesController().getChat(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e70Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f18654a;
                                    if (canAddAdmins) {
                                        b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new z10(3, e70Var, user));
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
                        org.telegram.ui.Components.m30 m30Var6 = new org.telegram.ui.Components.m30(e70Var.f33253f.f22856r.getContext(), object);
                        e70Var.h.a(m30Var6);
                        m30Var6.setOnClickListener(e70Var);
                    } else {
                        return;
                    }
                    e70Var.s0();
                    if (!e70Var.T && !e70Var.S) {
                        e70Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(e70Var.f33253f.f22856r);
                    }
                    if (e70Var.f33253f.f22856r.length() > 0) {
                        e70Var.f33253f.f22856r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(e70 e70Var) {
        if (e70Var.F == null) {
            return;
        }
        e70Var.f33249c.a(!e70Var.Z.i(), true);
    }

    public static void a0(e70 e70Var, Canvas canvas, RectF rectF, Paint paint) {
        fh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = e70Var.f33265q0) != null) {
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
            int paddingTop = this.f33261n.getPaddingTop();
            j0();
            org.telegram.ui.Components.b20 b20Var = this.f33253f;
            le.e eVar2 = this.f33247b;
            b20Var.setTranslationY(eVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f33261n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((le.b) this.e.f5518c).f14170f) {
                this.f33261n.scrollBy(0, paddingTop - paddingTop2);
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
        this.f33246a0.clear();
        this.Z.b();
        this.f33248b0 = null;
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
        this.f33253f = new org.telegram.ui.Components.b20(context, this.resourceProvider);
        j0 j0Var = new j0(this, context, 6);
        this.fragmentView = j0Var;
        j0Var.setFocusableInTouchMode(true);
        j0Var.setDescendantFocusability(131072);
        w60 w60Var = new w60(this, context, this.currentAccount);
        this.h = w60Var;
        w60Var.setDelegate(new t60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new v60(this, 0));
        w60 w60Var2 = this.h;
        this.Z = w60Var2.f23976b;
        this.f33246a0 = w60Var2.f23977c;
        r0();
        this.f33253f.f22856r.setOnEditorActionListener(new ja(this, 4));
        this.f33253f.f22856r.setOnKeyListener(new x60(0, this));
        this.f33253f.f22856r.addTextChangedListener(new l0(this, 6));
        ArrayList arrayList = this.f33257i0;
        if (arrayList != null) {
            p0(arrayList, this.f33258j0, this.f33259k0);
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(6);
        t00Var.f28252w = false;
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, t00Var, 1, null);
        this.f33268s = jx0Var;
        jx0Var.addView(t00Var);
        this.f33268s.e(true, false);
        this.f33268s.d.setText(LocaleController.getString(R.string.NoResult));
        j0Var.addView(this.f33268s);
        this.f33266r = new s4.c0(1, false);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f33261n = vl0Var;
        vl0Var.setFastScrollEnabled(0);
        this.f33261n.setEmptyView(this.f33268s);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f33261n;
        c70 c70Var = new c70(this, context);
        this.v = c70Var;
        vl0Var2.setAdapter(c70Var);
        this.f33261n.setLayoutManager(this.f33266r);
        this.f33261n.setVerticalScrollBarEnabled(false);
        this.f33261n.setClipToPadding(false);
        org.telegram.ui.Components.vl0 vl0Var3 = this.f33261n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        vl0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.vl0 vl0Var4 = this.f33261n;
        float f7 = -this.f33245a;
        j0Var.addView(vl0Var4, w7.y5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f33261n.setOnItemClickListener(new ai.o6(17, this, context));
        this.f33261n.setOnScrollListener(new h3(this, 13));
        org.telegram.ui.Components.vl0 vl0Var5 = this.f33261n;
        vl0Var5.Y1 = true;
        vl0Var5.Z1 = 0;
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f33274y = y10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f18902l = 180;
            g2Var.invalidateSelf();
            this.f33274y.f30430c.setImageDrawable(g2Var);
        } else {
            y10Var.f30430c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            j0Var.addView(this.f33274y, org.telegram.ui.Components.y10.b());
        }
        this.f33274y.setOnClickListener(new v60(this, 1));
        this.f33274y.e(this.E, false);
        this.f33274y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.v7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19095d7, this.resourceProvider));
            this.F.addView(view, w7.y5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.y5.e(-1, -2, 87));
            ci.d dVar = new ci.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.y5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new v60(this, 2));
            ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.oq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.y5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new v60(this, 3));
            j0Var.addView(this.F, w7.y5.e(-1, -2, 87));
            g0();
        }
        s0();
        ai.n4 n4Var = new ai.n4(this, context);
        this.d = n4Var;
        j0Var.addView(n4Var, w7.y5.e(-1, 0, 48));
        j0Var.addView(this.actionBar);
        j0Var.addView(this.f33253f, w7.y5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        j0Var.addView(this.h);
        org.telegram.ui.Components.vl0 vl0Var6 = this.f33261n;
        Objects.requireNonNull(vl0Var6);
        this.f33267r0 = new ah.o(vl0Var6, j0Var, new xs(vl0Var6, 0));
        this.f33261n.D0(new u60(this, 3));
        ci.s6 s6Var = new ci.s6(context, this.parentLayout);
        this.e = s6Var;
        s6Var.b(false, false);
        j0Var.addView(this.e, w7.y5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31111g1.d.add(this);
        }
        View view2 = this.fragmentView;
        t60 t60Var = new t60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f42142a;
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
            if (this.f33261n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f33261n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f33261n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
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
        ah.i iVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f33264p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f33250c0;
            RectF rectF = this.f33270t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f33271u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f33249c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            iVar.g(i10, this.f33269s0);
            iVar.e(this.f33267r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
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
        float f7 = this.f33249c.e;
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
        int i10 = org.telegram.ui.ActionBar.j6.f19094d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f19372s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19241l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19260m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19280n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33268s, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19077c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33268s, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19166h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 16, new Class[]{org.telegram.ui.Cells.g4.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i12 = org.telegram.ui.ActionBar.j6.f19049ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19185i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19203j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19223k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 262148, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19279n6));
        int i13 = org.telegram.ui.ActionBar.j6.f19477y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 262148, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33261n, 0, new Class[]{org.telegram.ui.Cells.h4.class}, null, org.telegram.ui.ActionBar.j6.f19345r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        int i14 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19087ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19068bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19106di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33268s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33268s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.ie0 ie0Var = this.f33251d0;
        if (ie0Var != null) {
            arrayList.addAll(ie0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.y10 y10Var = this.f33274y;
        if (y10Var != null) {
            y10Var.setTranslationY(-Math.max(this.m0, this.f33262n0));
        }
    }

    public final void i0() {
        if (this.f33261n.a1()) {
            this.f33261n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f33245a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f33247b.e);
        int measuredWidth = this.f33261n.getMeasuredWidth();
        int B = org.telegram.messenger.l0.B(i11, this.f33261n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f33249c.e));
        Rect rect = this.f33263o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f33261n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f33262n0 = l1Var.f42154a.f(8).d;
        h0();
    }

    public final void j0() {
        int i10;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.vl0 vl0Var = this.f33261n;
        int i11 = this.f33245a;
        vl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f33247b.e), 0, AndroidUtilities.dp(i11) + this.m0 + i10);
        this.f33268s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        String string;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f33261n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f33261n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18475id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18328id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h4Var.c(z11, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h4Var.c(z10, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.i iVar = this.J;
                    if (iVar != null && iVar.h(j3) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j3) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h4Var.c(z12, true);
                        h4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                this.f33261n.getClass();
                if (RecyclerView.S(childAt) == this.v.v) {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    w3Var.b(string, new v60(this, 4));
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
        z60 z60Var = this.f33273x;
        if (z60Var != null) {
            z60Var.i(i10, arrayList);
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
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
                        a2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
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
                        linearLayout.addView(a2VarArr[0], w7.y5.n(-1, -2));
                        a2VarArr[0].setOnClickListener(new w20(a2VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new z10(4, this, a2VarArr));
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
                    presentFragment(new l70(bundle2));
                    return true;
                }
                a70 a70Var = this.f33272w;
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
        if (m30Var.f26319y) {
            this.f33248b0 = null;
            this.h.c(m30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.m30 m30Var2 = this.f33248b0;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.f33248b0 = m30Var;
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
        HashSet hashSet = this.f33254f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f33255g0 = z10;
        this.f33256h0 = z11;
        w60 w60Var = this.h;
        if (w60Var == null) {
            this.f33257i0 = arrayList;
            this.f33258j0 = z10;
            this.f33259k0 = z11;
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
        AnimatorSet animatorSet = e20Var.f23713a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.f23713a.setupEndValues();
            e20Var.f23713a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f33261n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f33261n, new org.telegram.ui.Components.kd(this, i10, 16));
    }

    public final void r0() {
        c70 c70Var;
        ci.h2 h2Var = this.f33253f.f22856r;
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
            if (this.E && this.f33246a0.isEmpty()) {
                this.f33274y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f33246a0.isEmpty()) {
                this.f33274y.e(true, true);
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
