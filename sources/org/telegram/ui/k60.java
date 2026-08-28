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
public class k60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, td.b, View.OnClickListener, xg.d {
    public boolean A;
    public gh.h1 B;
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
    public org.telegram.ui.Components.w20 T;
    public org.telegram.ui.Components.w20 U;
    public a0.h V;
    public ArrayList W;
    public org.telegram.ui.Components.w20 X;
    public int Y;
    public org.telegram.ui.Components.hd0 Z;
    public final int f39725a;
    public boolean f39726a0;
    public final td.c f39727b;
    public final HashSet f39728b0;
    public final td.a f39729c;
    public boolean f39730c0;
    public ih.b3 d;
    public boolean f39731d0;
    public kh.h6 f39732e;
    public ArrayList f39733e0;
    public org.telegram.ui.Components.m10 f39734f;
    public boolean f39735f0;
    public boolean f39736g0;
    public c60 h;
    public int f39737h0;
    public int f39738i0;
    public int f39739j0;
    public final Rect f39740k0;
    public final ig.e f39741l0;
    public final ng.d m0;
    public org.telegram.ui.Components.wk0 f39742n;
    public ig.k f39743n0;
    public final ArrayList f39744o0;
    public final RectF f39745p0;
    public final RectF f39746q0;
    public f2.m0 f39747r;
    public org.telegram.ui.Components.gw0 f39748s;
    public i60 v;
    public g60 f39749w;
    public f60 f39750x;
    public org.telegram.ui.Components.j10 f39751y;

    public k60(Bundle bundle) {
        super(bundle);
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i9 = 48;
        } else {
            i9 = 0;
        }
        this.f39725a = i9;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f39727b = new td.c(3, this, grVar, 350L);
        this.f39729c = new td.a(4, this, grVar, 350L, false);
        this.V = new a0.h();
        this.W = new ArrayList();
        this.f39728b0 = new HashSet();
        this.f39737h0 = -4;
        this.f39740k0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f39744o0 = arrayList;
        RectF rectF = new RectF();
        this.f39745p0 = rectF;
        RectF rectF2 = new RectF();
        this.f39746q0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i12 = bundle.getInt("chatType", 0);
        this.I = i12;
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
                if (i12 == 0) {
                    i10 = messagesController.maxMegagroupCount;
                } else {
                    i10 = messagesController.maxBroadcastCount;
                }
                this.G = i10;
            }
        } else {
            this.G = 0;
        }
        if (i11 >= 31) {
            this.f39741l0 = new ig.e(false);
            this.m0 = new ng.d(null);
            return;
        }
        this.f39741l0 = null;
        this.m0 = null;
    }

    public static void T(k60 k60Var, Context context, View view, int i9) {
        long j10;
        String str;
        org.telegram.ui.Components.gc J;
        boolean z10;
        int i10 = k60Var.G;
        long j11 = k60Var.D;
        i60 i60Var = k60Var.v;
        if (i9 == i60Var.f39038w) {
            int i11 = k60Var.currentAccount;
            org.telegram.ui.ActionBar.b6 b6Var = k60Var.resourceProvider;
            a60 a60Var = new a60(k60Var, 0);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            c2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ff.j0(i11, c2Var, context, b6Var, a60Var, 6));
        } else if (i9 == 0 && i60Var.B != 0 && !i60Var.f39035n) {
            TLRPC.ChatFull chatFull = k60Var.E;
            long j12 = k60Var.C;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, k60Var, chatFull, j12, z10);
            k60Var.Z = hd0Var;
            k60Var.showDialog(hd0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f24387r) {
                org.telegram.ui.Components.w20 w20Var = k60Var.T;
                if (w20Var == null) {
                    org.telegram.ui.Components.w20 w20Var2 = new org.telegram.ui.Components.w20(k60Var.f39734f.f30664r.getContext(), "premium");
                    k60Var.T = w20Var2;
                    k60Var.h.a(w20Var2);
                    k60Var.T.setOnClickListener(k60Var);
                } else {
                    k60Var.h.c(w20Var);
                    k60Var.T = null;
                }
                k60Var.j0();
            } else if (g4Var.f24388s) {
                org.telegram.ui.Components.w20 w20Var3 = k60Var.U;
                if (w20Var3 == null) {
                    org.telegram.ui.Components.w20 w20Var4 = new org.telegram.ui.Components.w20(k60Var.f39734f.f30664r.getContext(), "miniapps");
                    k60Var.U = w20Var4;
                    k60Var.h.a(w20Var4);
                    k60Var.U.setOnClickListener(k60Var);
                } else {
                    k60Var.h.c(w20Var3);
                    k60Var.U = null;
                }
                k60Var.j0();
            } else {
                Object object = g4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f22527id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22380id;
                } else {
                    return;
                }
                a0.h hVar = k60Var.F;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (g4Var.K) {
                        int i12 = -k60Var.f39737h0;
                        k60Var.f39737h0 = i12;
                        AndroidUtilities.shakeViewSpring(g4Var, i12);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(k60Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(k60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.oc.a0(k60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.oc.a0(k60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new a60(k60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.w20 w20Var5 = (org.telegram.ui.Components.w20) k60Var.V.f(j10);
                    if (w20Var5 != null) {
                        k60Var.h.c(w20Var5);
                    } else if (i10 == 0 || k60Var.V.m() != i10) {
                        if (k60Var.I == 0 && k60Var.V.m() == k60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
                            c2Var2.N = string;
                            c2Var2.P = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            k60Var.showDialog(c2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (k60Var.N && user.bot) {
                                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.oc.a0(k60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat chat = k60Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.f22702a;
                                    if (canAddAdmins) {
                                        c2Var3.N = LocaleController.getString(R.string.AddBotAdminAlert);
                                        c2Var3.P = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new yr(12, k60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        c2Var3.P = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    k60Var.showDialog(c2Var3);
                                    return;
                                }
                            }
                            k60Var.getMessagesController().putUser(user, !k60Var.P);
                        } else if (object instanceof TLRPC.Chat) {
                            k60Var.getMessagesController().putChat((TLRPC.Chat) object, !k60Var.P);
                        }
                        org.telegram.ui.Components.w20 w20Var6 = new org.telegram.ui.Components.w20(k60Var.f39734f.f30664r.getContext(), object);
                        k60Var.h.a(w20Var6);
                        w20Var6.setOnClickListener(k60Var);
                    } else {
                        return;
                    }
                    k60Var.r0();
                    if (!k60Var.P && !k60Var.O) {
                        k60Var.j0();
                    } else {
                        AndroidUtilities.showKeyboard(k60Var.f39734f.f30664r);
                    }
                    if (k60Var.f39734f.f30664r.length() > 0) {
                        k60Var.f39734f.f30664r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Y(k60 k60Var) {
        if (k60Var.B == null) {
            return;
        }
        k60Var.f39729c.a(!k60Var.V.i(), true);
    }

    public static void Z(k60 k60Var, Canvas canvas, RectF rectF, Paint paint) {
        ng.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = k60Var.m0) != null) {
            dVar.T0(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 3) {
            int paddingTop = this.f39742n.getPaddingTop();
            i0();
            org.telegram.ui.Components.m10 m10Var = this.f39734f;
            td.c cVar2 = this.f39727b;
            m10Var.setTranslationY(cVar2.f47780e);
            h0();
            this.f39732e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar2.f47780e);
            this.d.invalidate();
            int paddingTop2 = this.f39742n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((td.a) this.f39732e.f15398c).f47776f) {
                this.f39742n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i9 == 4) {
            f0();
            h0();
        }
    }

    @Override
    public final View M() {
        return this.fragmentView;
    }

    @Override
    public final boolean canBeginSlide() {
        return e0(true);
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        this.P = false;
        this.O = false;
        this.W.clear();
        this.V.b();
        this.X = null;
        boolean z10 = this.N;
        int i11 = this.I;
        if (i11 == 2) {
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
        } else if (i11 == 2) {
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
            int i12 = this.Q;
            if (z12) {
                if (i12 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i12 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (z11) {
                if (i12 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
                } else if (i12 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i11 == 0) {
                    i9 = R.string.NewGroup;
                } else {
                    i9 = R.string.NewBroadcastList;
                }
                kVar.setTitle(LocaleController.getString(i9));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 21));
        this.f39734f = new org.telegram.ui.Components.m10(context, this.resourceProvider);
        m0 m0Var = new m0(this, context, 7);
        this.fragmentView = m0Var;
        m0Var.setFocusableInTouchMode(true);
        m0Var.setDescendantFocusability(131072);
        c60 c60Var = new c60(this, context, this.currentAccount);
        this.h = c60Var;
        c60Var.setDelegate(new z50(this, 0));
        this.h.getSpansContainer().setOnClickListener(new b60(this, 0));
        c60 c60Var2 = this.h;
        this.V = c60Var2.f31805b;
        this.W = c60Var2.f31806c;
        q0();
        this.f39734f.f30664r.setOnEditorActionListener(new ea(this, 4));
        this.f39734f.f30664r.setOnKeyListener(new d60(0, this));
        this.f39734f.f30664r.addTextChangedListener(new o0(this, 6));
        ArrayList arrayList = this.f39733e0;
        if (arrayList != null) {
            o0(arrayList, this.f39735f0, this.f39736g0);
        }
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(6);
        e00Var.f27885w = false;
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 1, null);
        this.f39748s = gw0Var;
        gw0Var.addView(e00Var);
        this.f39748s.e(true, false);
        this.f39748s.d.setText(LocaleController.getString(R.string.NoResult));
        m0Var.addView(this.f39748s);
        this.f39747r = new f2.m0(1, false);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f39742n = wk0Var;
        wk0Var.setFastScrollEnabled(0);
        this.f39742n.setEmptyView(this.f39748s);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f39742n;
        i60 i60Var = new i60(this, context);
        this.v = i60Var;
        wk0Var2.setAdapter(i60Var);
        this.f39742n.setLayoutManager(this.f39747r);
        this.f39742n.setVerticalScrollBarEnabled(false);
        this.f39742n.setClipToPadding(false);
        org.telegram.ui.Components.wk0 wk0Var3 = this.f39742n;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        wk0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.wk0 wk0Var4 = this.f39742n;
        float f10 = -this.f39725a;
        m0Var.addView(wk0Var4, g7.e6.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        this.f39742n.setOnItemClickListener(new bg.b1(19, this, context));
        this.f39742n.setOnScrollListener(new l3(this, 13));
        org.telegram.ui.Components.wk0 wk0Var5 = this.f39742n;
        wk0Var5.U1 = true;
        wk0Var5.V1 = 0;
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.f39751y = j10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.f23456l = 180;
            h2Var.invalidateSelf();
            this.f39751y.f29579c.setImageDrawable(h2Var);
        } else {
            j10Var.f29579c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            m0Var.addView(this.f39751y, org.telegram.ui.Components.j10.b());
        }
        this.f39751y.setOnClickListener(new b60(this, 1));
        this.f39751y.e(this.A, false);
        this.f39751y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.B = new gh.h1(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.resourceProvider));
            this.B.addView(view, g7.e6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.B.addView(linearLayout, g7.e6.e(-1, -2, 87));
            kh.d dVar = new kh.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, g7.e6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new b60(this, 2));
            kh.d dVar2 = new kh.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, g7.e6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new b60(this, 3));
            m0Var.addView(this.B, g7.e6.e(-1, -2, 87));
            f0();
        }
        r0();
        ih.b3 b3Var = new ih.b3(this, context);
        this.d = b3Var;
        m0Var.addView(b3Var, g7.e6.e(-1, 0, 48));
        m0Var.addView(this.actionBar);
        m0Var.addView(this.f39734f, g7.e6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        m0Var.addView(this.h);
        org.telegram.ui.Components.wk0 wk0Var6 = this.f39742n;
        Objects.requireNonNull(wk0Var6);
        this.f39743n0 = new ig.k(wk0Var6, m0Var, new ns(wk0Var6, 0));
        this.f39742n.C0(new a60(this, 3));
        kh.h6 h6Var = new kh.h6(context, this.parentLayout);
        this.f39732e = h6Var;
        h6Var.b(false, false);
        m0Var.addView(this.f39732e, g7.e6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35501c1.d.add(this);
        }
        View view2 = this.fragmentView;
        z50 z50Var = new z50(this, 3);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(view2, z50Var);
        return this.fragmentView;
    }

    public final void d0() {
        ig.e eVar;
        int i9;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f39741l0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.Y;
            RectF rectF = this.f39745p0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -dp;
            rectF.inset(0.0f, f10);
            if (this.B != null) {
                RectF rectF2 = this.f39746q0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.B.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.B != null && this.f39729c.f47775e > 0.0f) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            eVar.g(i9, this.f39744o0);
            eVar.e(this.f39743n0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.contactsDidLoad) {
            i60 i60Var = this.v;
            if (i60Var != null) {
                i60Var.l();
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            if (this.f39742n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f39742n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.f39742n.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.e0(boolean):boolean");
    }

    public final void f0() {
        int i9;
        gh.h1 h1Var = this.B;
        if (h1Var == null) {
            return;
        }
        float f10 = this.f39729c.f47775e;
        h1Var.setTranslationY((1.0f - f10) * AndroidUtilities.dp(12.0f));
        this.B.setAlpha(f10);
        gh.h1 h1Var2 = this.B;
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        h1Var2.setVisibility(i9);
    }

    public final void g0() {
        org.telegram.ui.Components.j10 j10Var = this.f39751y;
        if (j10Var != null) {
            j10Var.setTranslationY(-Math.max(this.f39738i0, this.f39739j0));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23145l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23163m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23180n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39748s, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39748s, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Zh));
        int i11 = org.telegram.ui.ActionBar.f6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23093i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23110j7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23179n6));
        int i12 = org.telegram.ui.ActionBar.f6.f23369y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39742n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        int i13 = org.telegram.ui.ActionBar.f6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39748s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39748s.f28885e, 4, null, null, null, null, i12));
        org.telegram.ui.Components.hd0 hd0Var = this.Z;
        if (hd0Var != null) {
            arrayList.addAll(hd0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        if (this.f39742n.Z0()) {
            this.f39742n.setClipBounds(null);
            return;
        }
        int i9 = this.f39738i0;
        int i10 = this.f39725a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.f39727b.f47780e);
        int measuredWidth = this.f39742n.getMeasuredWidth();
        int B = org.telegram.messenger.l0.B(i10, this.f39742n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i9) * this.f39729c.f47775e));
        Rect rect = this.f39740k0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f39742n.setClipBounds(rect);
    }

    public final void i0() {
        int i9;
        if (this.M) {
            i9 = AndroidUtilities.dp(76.0f);
        } else {
            i9 = 0;
        }
        org.telegram.ui.Components.wk0 wk0Var = this.f39742n;
        int i10 = this.f39725a;
        wk0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.f39727b.f47780e), 0, AndroidUtilities.dp(i10) + this.f39738i0 + i9);
        this.f39748s.setPadding(0, 0, 0, this.f39738i0);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f39742n.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.f39742n.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22527id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22380id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.T != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g4Var.c(z11, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.U != null) {
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
                    a0.h hVar = this.F;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.V.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g4Var.c(z12, true);
                        g4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                this.f39742n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.T == null && this.V.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new b60(this, 4));
                }
            }
        }
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f39739j0 = m1Var.f46929a.f(8).d;
        g0();
    }

    public final HashSet k0() {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < this.V.m(); i9++) {
            hashSet.add(Long.valueOf(this.V.j(i9)));
        }
        return hashSet;
    }

    public final void l0(int i9) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.V.m(); i10++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.V.j(i10))));
        }
        f60 f60Var = this.f39750x;
        if (f60Var != null) {
            f60Var.j(i9, arrayList);
        }
        finishFragment();
    }

    public final boolean n0() {
        boolean z10;
        int dp;
        int dp2;
        boolean i9 = this.V.i();
        boolean z11 = this.N;
        int i10 = this.I;
        boolean z12 = false;
        if (!i9 || i10 == 2 || !z11) {
            long j10 = this.C;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.V.m(), new Object[0]);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = formatPluralString;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < this.V.m(); i11++) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.V.j(i11)));
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        c2Var.P = spannableStringBuilder;
                    } else {
                        int i12 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i12, sb2, str));
                    }
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                        z1VarArr[0] = z1Var;
                        z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        z1VarArr[0].setMultiline(true);
                        if (this.V.m() == 1) {
                            z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.V.j(0)))))), "", true, false, false);
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
                        linearLayout.addView(z1VarArr[0], g7.e6.n(-1, -2));
                        z1VarArr[0].setOnClickListener(new c20(z1VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new yr(13, this, z1VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(c2Var);
                    return true;
                }
            } else if (i10 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < this.V.m(); i13++) {
                    TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.V.j(i13))));
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
            } else if (this.A) {
                if (z11) {
                    l0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i14 = 0; i14 < this.V.m(); i14++) {
                    arrayList2.add(Long.valueOf(this.V.j(i14)));
                }
                if (!this.K && !this.L) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i10);
                    bundle2.putBoolean("forImport", this.J);
                    presentFragment(new r60(bundle2));
                    return true;
                }
                g60 g60Var = this.f39749w;
                if (g60Var != null) {
                    if (this.T != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.U != null) {
                        z12 = true;
                    }
                    g60Var.b(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void o0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.w20 w20Var;
        org.telegram.ui.Components.w20 w20Var2;
        Object user;
        HashSet hashSet = this.f39728b0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f39730c0 = z10;
        this.f39731d0 = z11;
        c60 c60Var = this.h;
        if (c60Var == null) {
            this.f39733e0 = arrayList;
            this.f39735f0 = z10;
            this.f39736g0 = z11;
            return;
        }
        if (z10 && this.T == null) {
            org.telegram.ui.Components.w20 w20Var3 = new org.telegram.ui.Components.w20(getParentActivity(), "premium");
            this.T = w20Var3;
            this.h.a(w20Var3);
            this.T.setOnClickListener(this);
        } else if (!z10 && (w20Var = this.T) != null) {
            c60Var.c(w20Var);
            this.T = null;
        }
        if (z11 && this.U == null) {
            org.telegram.ui.Components.w20 w20Var4 = new org.telegram.ui.Components.w20(getParentActivity(), "miniApps");
            this.U = w20Var4;
            this.h.a(w20Var4);
            this.U.setOnClickListener(this);
        } else if (!z11 && (w20Var2 = this.U) != null) {
            this.h.c(w20Var2);
            this.U = null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            if (longValue < 0) {
                user = getMessagesController().getChat(Long.valueOf(-longValue));
            } else {
                user = getMessagesController().getUser(l10);
            }
            if (user != null) {
                org.telegram.ui.Components.w20 w20Var5 = new org.telegram.ui.Components.w20(getParentActivity(), user);
                this.h.a(w20Var5);
                w20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.p10 p10Var = this.h.d;
        AnimatorSet animatorSet = p10Var.f31502a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p10Var.f31502a.setupEndValues();
            p10Var.f31502a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f39742n);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!e0(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) view;
        if (w20Var.f34088y) {
            this.X = null;
            this.h.c(w20Var);
            r0();
            j0();
            return;
        }
        org.telegram.ui.Components.w20 w20Var2 = this.X;
        if (w20Var2 != null) {
            w20Var2.a();
        }
        this.X = w20Var;
        w20Var.b();
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

    public final void p0(int i9) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f39742n, new org.telegram.ui.Components.qd(this, i9, 15));
    }

    public final void q0() {
        i60 i60Var;
        fg.g gVar = this.f39734f.f30664r;
        if (gVar == null) {
            return;
        }
        if (this.I == 2) {
            gVar.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.N && ((i60Var = this.v) == null || i60Var.C != 0)) {
            if (!this.K && !this.L) {
                if (this.M) {
                    gVar.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    gVar.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            gVar.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            gVar.setHint(LocaleController.getString(R.string.SearchForPeople));
        }
    }

    public final void r0() {
        boolean z10 = this.K;
        int i9 = this.I;
        boolean z11 = this.N;
        if (!z10 && !this.L && !z11) {
            if (i9 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.V.m(), new Object[0]));
            } else {
                boolean i10 = this.V.i();
                int i11 = this.G;
                if (i10) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i11 + (this.M ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.V.m()), Integer.valueOf(this.V.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i9 != 2 && z11) {
            if (this.A && this.W.isEmpty()) {
                this.f39751y.e(false, true);
                this.A = false;
            } else if (!this.A && !this.W.isEmpty()) {
                this.f39751y.e(true, true);
                this.A = true;
            }
        }
    }

    @Override
    public final void K() {
    }

    public void m0(HashSet hashSet) {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
