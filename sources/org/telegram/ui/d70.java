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
public class d70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, le.d, View.OnClickListener, ph.d {
    public boolean E;
    public ai.w7 F;
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
    public org.telegram.ui.Components.q30 X;
    public org.telegram.ui.Components.q30 Y;
    public a0.i Z;
    public final int f35665a;
    public ArrayList f35666a0;
    public final le.e f35667b;
    public org.telegram.ui.Components.q30 f35668b0;
    public final le.b f35669c;
    public int f35670c0;
    public ai.n4 d;
    public org.telegram.ui.Components.me0 f35671d0;
    public ci.r6 f35672e;
    public boolean f35673e0;
    public org.telegram.ui.Components.f20 f35674f;
    public final HashSet f35675f0;
    public boolean f35676g0;
    public v60 h;
    public boolean f35677h0;
    public ArrayList f35678i0;
    public boolean f35679j0;
    public boolean f35680k0;
    public int f35681l0;
    public int m0;
    public org.telegram.ui.Components.zl0 f35682n;
    public int f35683n0;
    public final Rect f35684o0;
    public final ah.i f35685p0;
    public final fh.d f35686q0;
    public s4.c0 f35687r;
    public ah.n f35688r0;
    public org.telegram.ui.Components.tx0 f35689s;
    public final ArrayList f35690s0;
    public final RectF f35691t0;
    public final RectF f35692u0;
    public b70 v;
    public z60 f35693w;
    public y60 f35694x;
    public org.telegram.ui.Components.c20 f35695y;

    public d70(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f35665a = i10;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.f35667b = new le.e(3, this, trVar, 350L);
        this.f35669c = new le.b(4, this, trVar, 350L, false);
        this.Z = new a0.i();
        this.f35666a0 = new ArrayList();
        this.f35675f0 = new HashSet();
        this.f35681l0 = -4;
        this.f35684o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f35690s0 = arrayList;
        RectF rectF = new RectF();
        this.f35691t0 = rectF;
        RectF rectF2 = new RectF();
        this.f35692u0 = rectF2;
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
            this.f35685p0 = new ah.i();
            this.f35686q0 = new fh.d(null);
            return;
        }
        this.f35685p0 = null;
        this.f35686q0 = null;
    }

    public static void S(d70 d70Var, Context context, View view, int i10) {
        long j3;
        String str;
        org.telegram.ui.Components.rc J;
        boolean z10;
        int i11 = d70Var.K;
        long j10 = d70Var.H;
        b70 b70Var = d70Var.v;
        if (i10 == b70Var.f35024w) {
            int i12 = d70Var.currentAccount;
            org.telegram.ui.ActionBar.d6 d6Var = d70Var.resourceProvider;
            t60 t60Var = new t60(d70Var, 0);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.ya(i12, b2Var, context, d6Var, t60Var, 3));
        } else if (i10 == 0 && b70Var.F != 0 && !b70Var.f35021n) {
            TLRPC.ChatFull chatFull = d70Var.I;
            long j11 = d70Var.G;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.me0 me0Var = new org.telegram.ui.Components.me0(context, d70Var, chatFull, j11, z10);
            d70Var.f35671d0 = me0Var;
            d70Var.showDialog(me0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f22146r) {
                org.telegram.ui.Components.q30 q30Var = d70Var.X;
                if (q30Var == null) {
                    org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(d70Var.f35674f.f26252r.getContext(), "premium");
                    d70Var.X = q30Var2;
                    d70Var.h.a(q30Var2);
                    d70Var.X.setOnClickListener(d70Var);
                } else {
                    d70Var.h.c(q30Var);
                    d70Var.X = null;
                }
                d70Var.k0();
            } else if (g4Var.f22147s) {
                org.telegram.ui.Components.q30 q30Var3 = d70Var.Y;
                if (q30Var3 == null) {
                    org.telegram.ui.Components.q30 q30Var4 = new org.telegram.ui.Components.q30(d70Var.f35674f.f26252r.getContext(), "miniapps");
                    d70Var.Y = q30Var4;
                    d70Var.h.a(q30Var4);
                    d70Var.Y.setOnClickListener(d70Var);
                } else {
                    d70Var.h.c(q30Var3);
                    d70Var.Y = null;
                }
                d70Var.k0();
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
                a0.i iVar = d70Var.J;
                if (iVar == null || iVar.h(j3) < 0) {
                    if (g4Var.O) {
                        int i13 = -d70Var.f35681l0;
                        d70Var.f35681l0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(d70Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(d70Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.yc.a0(d70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.yc.a0(d70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new t60(d70Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.q30 q30Var5 = (org.telegram.ui.Components.q30) d70Var.Z.f(j3);
                    if (q30Var5 != null) {
                        d70Var.h.c(q30Var5);
                    } else if (i11 == 0 || d70Var.Z.m() != i11) {
                        if (d70Var.M == 0 && d70Var.Z.m() == d70Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d70Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20372a;
                            b2Var2.R = string;
                            b2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            d70Var.showDialog(b2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (d70Var.R && user.bot) {
                                int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.yc.a0(d70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = d70Var.getMessagesController().getChat(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d70Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20372a;
                                    if (canAddAdmins) {
                                        b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new pw(5, d70Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        b2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    d70Var.showDialog(b2Var3);
                                    return;
                                }
                            }
                            d70Var.getMessagesController().putUser(user, !d70Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            d70Var.getMessagesController().putChat((TLRPC.Chat) object, !d70Var.T);
                        }
                        org.telegram.ui.Components.q30 q30Var6 = new org.telegram.ui.Components.q30(d70Var.f35674f.f26252r.getContext(), object);
                        d70Var.h.a(q30Var6);
                        q30Var6.setOnClickListener(d70Var);
                    } else {
                        return;
                    }
                    d70Var.s0();
                    if (!d70Var.T && !d70Var.S) {
                        d70Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(d70Var.f35674f.f26252r);
                    }
                    if (d70Var.f35674f.f26252r.length() > 0) {
                        d70Var.f35674f.f26252r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Y(d70 d70Var) {
        if (d70Var.F == null) {
            return;
        }
        d70Var.f35669c.a(!d70Var.Z.i(), true);
    }

    public static void Z(d70 d70Var, Canvas canvas, RectF rectF, Paint paint) {
        fh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = d70Var.f35686q0) != null) {
            dVar.v(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final View L() {
        return this.fragmentView;
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f35682n.getPaddingTop();
            j0();
            org.telegram.ui.Components.f20 f20Var = this.f35674f;
            le.e eVar2 = this.f35667b;
            f20Var.setTranslationY(eVar2.f15444e);
            i0();
            this.f35672e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.f15444e);
            this.d.invalidate();
            int paddingTop2 = this.f35682n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((le.b) this.f35672e.f5869c).f15437f) {
                this.f35682n.scrollBy(0, paddingTop - paddingTop2);
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
        this.f35666a0.clear();
        this.Z.b();
        this.f35668b0 = null;
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
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 26));
        this.f35674f = new org.telegram.ui.Components.f20(context, this.resourceProvider);
        k0 k0Var = new k0(this, context, 7);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        v60 v60Var = new v60(this, context, this.currentAccount);
        this.h = v60Var;
        v60Var.setDelegate(new s60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new u60(this, 0));
        v60 v60Var2 = this.h;
        this.Z = v60Var2.f27563b;
        this.f35666a0 = v60Var2.f27564c;
        r0();
        this.f35674f.f26252r.setOnEditorActionListener(new ka(this, 4));
        this.f35674f.f26252r.setOnKeyListener(new w60(0, this));
        this.f35674f.f26252r.addTextChangedListener(new m0(this, 6));
        ArrayList arrayList = this.f35678i0;
        if (arrayList != null) {
            p0(arrayList, this.f35679j0, this.f35680k0);
        }
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(6);
        w00Var.f32423w = false;
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, w00Var, 1, null);
        this.f35689s = tx0Var;
        tx0Var.addView(w00Var);
        this.f35689s.e(true, false);
        this.f35689s.d.setText(LocaleController.getString(R.string.NoResult));
        k0Var.addView(this.f35689s);
        this.f35687r = new s4.c0(1, false);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f35682n = zl0Var;
        zl0Var.setFastScrollEnabled(0);
        this.f35682n.setEmptyView(this.f35689s);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f35682n;
        b70 b70Var = new b70(this, context);
        this.v = b70Var;
        zl0Var2.setAdapter(b70Var);
        this.f35682n.setLayoutManager(this.f35687r);
        this.f35682n.setVerticalScrollBarEnabled(false);
        this.f35682n.setClipToPadding(false);
        org.telegram.ui.Components.zl0 zl0Var3 = this.f35682n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        zl0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.zl0 zl0Var4 = this.f35682n;
        float f7 = -this.f35665a;
        k0Var.addView(zl0Var4, w7.z5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f35682n.setOnItemClickListener(new ai.n6(17, this, context));
        this.f35682n.setOnScrollListener(new i3(this, 14));
        org.telegram.ui.Components.zl0 zl0Var5 = this.f35682n;
        zl0Var5.Y1 = true;
        zl0Var5.Z1 = 0;
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
        this.f35695y = c20Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f20654l = 180;
            g2Var.invalidateSelf();
            this.f35695y.f25170c.setImageDrawable(g2Var);
        } else {
            c20Var.f25170c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            k0Var.addView(this.f35695y, org.telegram.ui.Components.c20.b());
        }
        this.f35695y.setOnClickListener(new u60(this, 1));
        this.f35695y.e(this.E, false);
        this.f35695y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.w7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20823d7, this.resourceProvider));
            this.F.addView(view, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.z5.e(-1, -2, 87));
            ci.d dVar = new ci.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.rq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new u60(this, 2));
            ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.rq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new u60(this, 3));
            k0Var.addView(this.F, w7.z5.e(-1, -2, 87));
            g0();
        }
        s0();
        ai.n4 n4Var = new ai.n4(this, context);
        this.d = n4Var;
        k0Var.addView(n4Var, w7.z5.e(-1, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f35674f, w7.z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.zl0 zl0Var6 = this.f35682n;
        Objects.requireNonNull(zl0Var6);
        this.f35688r0 = new ah.n(zl0Var6, k0Var, new vs(zl0Var6, 0));
        this.f35682n.D0(new t60(this, 3));
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.f35672e = r6Var;
        ((le.b) r6Var.f5869c).a(false, false);
        k0Var.addView(this.f35672e, w7.z5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33787g1.d.add(this);
        }
        View view2 = this.fragmentView;
        s60 s60Var = new s60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f45603a;
        r0.a0.j(view2, s60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            b70 b70Var = this.v;
            if (b70Var != null) {
                b70Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f35682n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f35682n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f35682n.getChildAt(i12);
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
        ah.i iVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f35685p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f35670c0;
            RectF rectF = this.f35691t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f35692u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f35669c.f15436e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            iVar.g(i10, this.f35690s0);
            iVar.e(this.f35688r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d70.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.w7 w7Var = this.F;
        if (w7Var == null) {
            return;
        }
        float f7 = this.f35669c.f15436e;
        w7Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        ai.w7 w7Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w7Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.f21104s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20970l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20989m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f21009n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35689s, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20805c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35689s, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20895h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i12 = org.telegram.ui.ActionBar.i6.f20777ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20914i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20932j7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20952k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21008n6));
        int i13 = org.telegram.ui.ActionBar.i6.f21209y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35682n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.i6.f21076r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i14 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20815ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20796bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20834di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35689s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35689s.f31201e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.me0 me0Var = this.f35671d0;
        if (me0Var != null) {
            arrayList.addAll(me0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.c20 c20Var = this.f35695y;
        if (c20Var != null) {
            c20Var.setTranslationY(-Math.max(this.m0, this.f35683n0));
        }
    }

    public final void i0() {
        if (this.f35682n.a1()) {
            this.f35682n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f35665a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f35667b.f15444e);
        int measuredWidth = this.f35682n.getMeasuredWidth();
        int B = org.telegram.messenger.q.B(i11, this.f35682n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f35669c.f15436e));
        Rect rect = this.f35684o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f35682n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f35683n0 = l1Var.f45617a.f(8).d;
        h0();
    }

    public final void j0() {
        int i10;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.zl0 zl0Var = this.f35682n;
        int i11 = this.f35665a;
        zl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f35667b.f15444e), 0, AndroidUtilities.dp(i11) + this.m0 + i10);
        this.f35689s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        String string;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f35682n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f35682n.getChildAt(i10);
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
                this.f35682n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new u60(this, 4));
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
        y60 y60Var = this.f35694x;
        if (y60Var != null) {
            y60Var.i(i10, arrayList);
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.d61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
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
                        a2Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
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
                        a2VarArr[0].setOnClickListener(new w20(a2VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new pw(6, this, a2VarArr));
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
                presentFragment(new yn(bundle), true);
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
                    presentFragment(new k70(bundle2));
                    return true;
                }
                z60 z60Var = this.f35693w;
                if (z60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    z60Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) view;
        if (q30Var.f29885y) {
            this.f35668b0 = null;
            this.h.c(q30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.q30 q30Var2 = this.f35668b0;
        if (q30Var2 != null) {
            q30Var2.a();
        }
        this.f35668b0 = q30Var;
        q30Var.b();
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
        org.telegram.ui.Components.q30 q30Var;
        org.telegram.ui.Components.q30 q30Var2;
        Object user;
        HashSet hashSet = this.f35675f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f35676g0 = z10;
        this.f35677h0 = z11;
        v60 v60Var = this.h;
        if (v60Var == null) {
            this.f35678i0 = arrayList;
            this.f35679j0 = z10;
            this.f35680k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.q30 q30Var3 = new org.telegram.ui.Components.q30(getParentActivity(), "premium");
            this.X = q30Var3;
            this.h.a(q30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (q30Var = this.X) != null) {
            v60Var.c(q30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.q30 q30Var4 = new org.telegram.ui.Components.q30(getParentActivity(), "miniApps");
            this.Y = q30Var4;
            this.h.a(q30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (q30Var2 = this.Y) != null) {
            this.h.c(q30Var2);
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
                org.telegram.ui.Components.q30 q30Var5 = new org.telegram.ui.Components.q30(getParentActivity(), user);
                this.h.a(q30Var5);
                q30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.i20 i20Var = this.h.d;
        AnimatorSet animatorSet = i20Var.f27289a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i20Var.f27289a.setupEndValues();
            i20Var.f27289a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f35682n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f35682n, new org.telegram.ui.Components.ld(this, i10, 15));
    }

    public final void r0() {
        b70 b70Var;
        ci.h2 h2Var = this.f35674f.f26252r;
        if (h2Var == null) {
            return;
        }
        if (this.M == 2) {
            h2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((b70Var = this.v) == null || b70Var.G != 0)) {
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
            if (this.E && this.f35666a0.isEmpty()) {
                this.f35695y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f35666a0.isEmpty()) {
                this.f35695y.e(true, true);
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
    public final void V(float f7, int i10) {
    }
}
