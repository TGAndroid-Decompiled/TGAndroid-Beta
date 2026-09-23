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
public class b70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, le.e, View.OnClickListener, ph.d {
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
    public org.telegram.ui.Components.n30 X;
    public org.telegram.ui.Components.n30 Y;
    public a0.i Z;
    public final int f31983a;
    public ArrayList f31984a0;
    public final le.f f31985b;
    public org.telegram.ui.Components.n30 f31986b0;
    public final le.c f31987c;
    public int f31988c0;
    public ai.n4 d;
    public org.telegram.ui.Components.ae0 f31989d0;
    public ci.r6 e;
    public boolean f31990e0;
    public org.telegram.ui.Components.c20 f31991f;
    public final HashSet f31992f0;
    public boolean f31993g0;
    public t60 h;
    public boolean f31994h0;
    public ArrayList f31995i0;
    public boolean f31996j0;
    public boolean f31997k0;
    public int f31998l0;
    public int m0;
    public org.telegram.ui.Components.ml0 f31999n;
    public int f32000n0;
    public final Rect f32001o0;
    public final ah.h f32002p0;
    public final fh.d f32003q0;
    public s4.c0 f32004r;
    public ah.n f32005r0;
    public org.telegram.ui.Components.xw0 f32006s;
    public final ArrayList f32007s0;
    public final RectF f32008t0;
    public final RectF f32009u0;
    public z60 v;
    public x60 f32010w;
    public w60 f32011x;
    public org.telegram.ui.Components.z10 f32012y;

    public b70(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f31983a = i10;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        this.f31985b = new le.f(3, this, rrVar, 350L);
        this.f31987c = new le.c(4, this, rrVar, 350L, false);
        this.Z = new a0.i();
        this.f31984a0 = new ArrayList();
        this.f31992f0 = new HashSet();
        this.f31998l0 = -4;
        this.f32001o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f32007s0 = arrayList;
        RectF rectF = new RectF();
        this.f32008t0 = rectF;
        RectF rectF2 = new RectF();
        this.f32009u0 = rectF2;
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
            this.f32002p0 = new ah.h(false);
            this.f32003q0 = new fh.d(null);
            return;
        }
        this.f32002p0 = null;
        this.f32003q0 = null;
    }

    public static void U(b70 b70Var, Context context, View view, int i10) {
        long j3;
        String str;
        org.telegram.ui.Components.qc J;
        boolean z10;
        int i11 = b70Var.K;
        long j10 = b70Var.H;
        z60 z60Var = b70Var.v;
        if (i10 == z60Var.f39998w) {
            int i12 = b70Var.currentAccount;
            org.telegram.ui.ActionBar.d6 d6Var = b70Var.resourceProvider;
            r60 r60Var = new r60(b70Var, 0);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.ya(i12, b2Var, context, d6Var, r60Var, 3));
        } else if (i10 == 0 && z60Var.F != 0 && !z60Var.f39995n) {
            TLRPC.ChatFull chatFull = b70Var.I;
            long j11 = b70Var.G;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.ae0 ae0Var = new org.telegram.ui.Components.ae0(context, b70Var, chatFull, j11, z10);
            b70Var.f31989d0 = ae0Var;
            b70Var.showDialog(ae0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f20091r) {
                org.telegram.ui.Components.n30 n30Var = b70Var.X;
                if (n30Var == null) {
                    org.telegram.ui.Components.n30 n30Var2 = new org.telegram.ui.Components.n30(b70Var.f31991f.f22890r.getContext(), "premium");
                    b70Var.X = n30Var2;
                    b70Var.h.a(n30Var2);
                    b70Var.X.setOnClickListener(b70Var);
                } else {
                    b70Var.h.c(n30Var);
                    b70Var.X = null;
                }
                b70Var.k0();
            } else if (g4Var.f20092s) {
                org.telegram.ui.Components.n30 n30Var3 = b70Var.Y;
                if (n30Var3 == null) {
                    org.telegram.ui.Components.n30 n30Var4 = new org.telegram.ui.Components.n30(b70Var.f31991f.f22890r.getContext(), "miniapps");
                    b70Var.Y = n30Var4;
                    b70Var.h.a(n30Var4);
                    b70Var.Y.setOnClickListener(b70Var);
                } else {
                    b70Var.h.c(n30Var3);
                    b70Var.Y = null;
                }
                b70Var.k0();
            } else {
                Object object = g4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f18230id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18083id;
                } else {
                    return;
                }
                a0.i iVar = b70Var.J;
                if (iVar == null || iVar.h(j3) < 0) {
                    if (g4Var.O) {
                        int i13 = -b70Var.f31998l0;
                        b70Var.f31998l0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(b70Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(b70Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.xc.a0(b70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.xc.a0(b70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new r60(b70Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.n30 n30Var5 = (org.telegram.ui.Components.n30) b70Var.Z.f(j3);
                    if (n30Var5 != null) {
                        b70Var.h.c(n30Var5);
                    } else if (i11 == 0 || b70Var.Z.m() != i11) {
                        if (b70Var.M == 0 && b70Var.Z.m() == b70Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b70Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18409a;
                            b2Var2.R = string;
                            b2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            b70Var.showDialog(b2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (b70Var.R && user.bot) {
                                int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.xc.a0(b70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = b70Var.getMessagesController().getChat(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b70Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f18409a;
                                    if (canAddAdmins) {
                                        b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new w10(3, b70Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        b2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    b70Var.showDialog(b2Var3);
                                    return;
                                }
                            }
                            b70Var.getMessagesController().putUser(user, !b70Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            b70Var.getMessagesController().putChat((TLRPC.Chat) object, !b70Var.T);
                        }
                        org.telegram.ui.Components.n30 n30Var6 = new org.telegram.ui.Components.n30(b70Var.f31991f.f22890r.getContext(), object);
                        b70Var.h.a(n30Var6);
                        n30Var6.setOnClickListener(b70Var);
                    } else {
                        return;
                    }
                    b70Var.s0();
                    if (!b70Var.T && !b70Var.S) {
                        b70Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(b70Var.f31991f.f22890r);
                    }
                    if (b70Var.f31991f.f22890r.length() > 0) {
                        b70Var.f31991f.f22890r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(b70 b70Var) {
        if (b70Var.F == null) {
            return;
        }
        b70Var.f31987c.a(!b70Var.Z.i(), true);
    }

    public static void a0(b70 b70Var, Canvas canvas, RectF rectF, Paint paint) {
        fh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = b70Var.f32003q0) != null) {
            dVar.y(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.f31999n.getPaddingTop();
            j0();
            org.telegram.ui.Components.c20 c20Var = this.f31991f;
            le.f fVar2 = this.f31985b;
            c20Var.setTranslationY(fVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + fVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f31999n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((le.c) this.e.f5458c).f13963f) {
                this.f31999n.scrollBy(0, paddingTop - paddingTop2);
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
        this.f31984a0.clear();
        this.Z.b();
        this.f31986b0 = null;
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
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 26));
        this.f31991f = new org.telegram.ui.Components.c20(context, this.resourceProvider);
        k0 k0Var = new k0(this, context, 7);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        t60 t60Var = new t60(this, context, this.currentAccount);
        this.h = t60Var;
        t60Var.setDelegate(new q60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new s60(this, 0));
        t60 t60Var2 = this.h;
        this.Z = t60Var2.f24135b;
        this.f31984a0 = t60Var2.f24136c;
        r0();
        this.f31991f.f22890r.setOnEditorActionListener(new ia(this, 4));
        this.f31991f.f22890r.setOnKeyListener(new u60(0, this));
        this.f31991f.f22890r.addTextChangedListener(new m0(this, 6));
        ArrayList arrayList = this.f31995i0;
        if (arrayList != null) {
            p0(arrayList, this.f31996j0, this.f31997k0);
        }
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.f28353w = false;
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, u00Var, 1, null);
        this.f32006s = xw0Var;
        xw0Var.addView(u00Var);
        this.f32006s.e(true, false);
        this.f32006s.d.setText(LocaleController.getString(R.string.NoResult));
        k0Var.addView(this.f32006s);
        this.f32004r = new s4.c0(1, false);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f31999n = ml0Var;
        ml0Var.setFastScrollEnabled(0);
        this.f31999n.setEmptyView(this.f32006s);
        org.telegram.ui.Components.ml0 ml0Var2 = this.f31999n;
        z60 z60Var = new z60(this, context);
        this.v = z60Var;
        ml0Var2.setAdapter(z60Var);
        this.f31999n.setLayoutManager(this.f32004r);
        this.f31999n.setVerticalScrollBarEnabled(false);
        this.f31999n.setClipToPadding(false);
        org.telegram.ui.Components.ml0 ml0Var3 = this.f31999n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        ml0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.ml0 ml0Var4 = this.f31999n;
        float f7 = -this.f31983a;
        k0Var.addView(ml0Var4, w7.x5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f31999n.setOnItemClickListener(new ai.n6(17, this, context));
        this.f31999n.setOnScrollListener(new i3(this, 13));
        org.telegram.ui.Components.ml0 ml0Var5 = this.f31999n;
        ml0Var5.Y1 = true;
        ml0Var5.Z1 = 0;
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f32012y = z10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.f18673l = 180;
            g2Var.invalidateSelf();
            this.f32012y.f30506c.setImageDrawable(g2Var);
        } else {
            z10Var.f30506c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            k0Var.addView(this.f32012y, org.telegram.ui.Components.z10.b());
        }
        this.f32012y.setOnClickListener(new s60(this, 1));
        this.f32012y.e(this.E, false);
        this.f32012y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.w7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18790d7, this.resourceProvider));
            this.F.addView(view, w7.x5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.x5.e(-1, -2, 87));
            ci.d dVar = new ci.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new s60(this, 2));
            ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.pq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new s60(this, 3));
            k0Var.addView(this.F, w7.x5.e(-1, -2, 87));
            g0();
        }
        s0();
        ai.n4 n4Var = new ai.n4(this, context);
        this.d = n4Var;
        k0Var.addView(n4Var, w7.x5.e(-1, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f31991f, w7.x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.ml0 ml0Var6 = this.f31999n;
        Objects.requireNonNull(ml0Var6);
        this.f32005r0 = new ah.n(ml0Var6, k0Var, new ts(ml0Var6, 0));
        this.f31999n.C0(new r60(this, 3));
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.e = r6Var;
        r6Var.b(false, false);
        k0Var.addView(this.e, w7.x5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f30798g1.d.add(this);
        }
        View view2 = this.fragmentView;
        q60 q60Var = new q60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(view2, q60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            z60 z60Var = this.v;
            if (z60Var != null) {
                z60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f31999n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f31999n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f31999n.getChildAt(i12);
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
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f32002p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f31988c0;
            RectF rectF = this.f32008t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f32009u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f31987c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f32007s0);
            hVar.e(this.f32005r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b70.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.w7 w7Var = this.F;
        if (w7Var == null) {
            return;
        }
        float f7 = this.f31987c.e;
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
        int i10 = org.telegram.ui.ActionBar.h6.f18789d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18935l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18954m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18974n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32006s, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f18772c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32006s, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f18860h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i12 = org.telegram.ui.ActionBar.h6.f18744ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18879i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18897j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18917k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18973n6));
        int i13 = org.telegram.ui.ActionBar.h6.f19170y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31999n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i14 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18782ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18763bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18801di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32006s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32006s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.ae0 ae0Var = this.f31989d0;
        if (ae0Var != null) {
            arrayList.addAll(ae0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.z10 z10Var = this.f32012y;
        if (z10Var != null) {
            z10Var.setTranslationY(-Math.max(this.m0, this.f32000n0));
        }
    }

    public final void i0() {
        if (this.f31999n.Z0()) {
            this.f31999n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f31983a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f31985b.e);
        int measuredWidth = this.f31999n.getMeasuredWidth();
        int B = org.telegram.messenger.z0.B(i11, this.f31999n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f31987c.e));
        Rect rect = this.f32001o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f31999n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f32000n0 = l1Var.f41807a.f(8).d;
        h0();
    }

    public final void j0() {
        int i10;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.ml0 ml0Var = this.f31999n;
        int i11 = this.f31983a;
        ml0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f31985b.e), 0, AndroidUtilities.dp(i11) + this.m0 + i10);
        this.f32006s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        String string;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f31999n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f31999n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18230id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18083id;
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
                this.f31999n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new s60(this, 4));
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
        w60 w60Var = this.f32011x;
        if (w60Var != null) {
            w60Var.j(i10, arrayList);
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
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
                        z1Var.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
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
                        z1VarArr[0].setOnClickListener(new t20(z1VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new w10(4, this, z1VarArr));
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
                presentFragment(new xn(bundle), true);
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
                    presentFragment(new i70(bundle2));
                    return true;
                }
                x60 x60Var = this.f32010w;
                if (x60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    x60Var.b(arrayList2, z10, z12);
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
        org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) view;
        if (n30Var.f26339y) {
            this.f31986b0 = null;
            this.h.c(n30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.n30 n30Var2 = this.f31986b0;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.f31986b0 = n30Var;
        n30Var.b();
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
        org.telegram.ui.Components.n30 n30Var;
        org.telegram.ui.Components.n30 n30Var2;
        Object user;
        HashSet hashSet = this.f31992f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f31993g0 = z10;
        this.f31994h0 = z11;
        t60 t60Var = this.h;
        if (t60Var == null) {
            this.f31995i0 = arrayList;
            this.f31996j0 = z10;
            this.f31997k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.n30 n30Var3 = new org.telegram.ui.Components.n30(getParentActivity(), "premium");
            this.X = n30Var3;
            this.h.a(n30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (n30Var = this.X) != null) {
            t60Var.c(n30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.n30 n30Var4 = new org.telegram.ui.Components.n30(getParentActivity(), "miniApps");
            this.Y = n30Var4;
            this.h.a(n30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (n30Var2 = this.Y) != null) {
            this.h.c(n30Var2);
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
                org.telegram.ui.Components.n30 n30Var5 = new org.telegram.ui.Components.n30(getParentActivity(), user);
                this.h.a(n30Var5);
                n30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.f20 f20Var = this.h.d;
        AnimatorSet animatorSet = f20Var.f23812a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f20Var.f23812a.setupEndValues();
            f20Var.f23812a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f31999n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f31999n, new org.telegram.ui.Components.kd(this, i10, 16));
    }

    public final void r0() {
        z60 z60Var;
        ci.h2 h2Var = this.f31991f.f22890r;
        if (h2Var == null) {
            return;
        }
        if (this.M == 2) {
            h2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((z60Var = this.v) == null || z60Var.G != 0)) {
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
            if (this.E && this.f31984a0.isEmpty()) {
                this.f32012y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f31984a0.isEmpty()) {
                this.f32012y.e(true, true);
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
