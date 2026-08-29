package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n61 extends org.telegram.ui.Components.xa {
    public TLRPC.Chat T;
    public final TLRPC.User U;
    public final bg.f V;
    public TLObject W;
    public final FrameLayout X;
    public final f61 Y;
    public final h61 Z;
    public final m61 f40726a0;
    public final m61 f40727b0;
    public final m61 f40728c0;
    public final nh.d f40729d0;
    public org.telegram.ui.Components.k51 f40730e0;
    public Context f40731f0;

    public n61(Context context, TLRPC.Chat chat, TLRPC.User user, bg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, 2, c6Var);
        this.G = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.T = chat;
        this.U = user;
        this.W = user;
        this.V = fVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.g6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.g6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, i7.f6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.Y = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.R5));
        editTextBoldCursor.setHintTextColor(getThemedColor(i10));
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        editTextBoldCursor.setTranslationY(-AndroidUtilities.dp(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new da(this, 11));
        editTextBoldCursor.addTextChangedListener(new g61(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, i7.f6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.f34660e));
        float f9 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, i7.f6.d(-1, 64.0f, 55, f9, 0.0f, f9, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        t9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(t9Var, i7.f6.e(130, 130, 17));
        m61 m61Var = new m61(this.currentAccount, chat.f22392id, new TLRPC.TL_channelParticipantsAdmins());
        m61Var.f40471e.add(new ky0(this, 17));
        this.f40726a0 = m61Var;
        m61 m61Var2 = new m61(this.currentAccount, chat.f22392id, new TLRPC.TL_channelParticipantsRecent());
        m61Var2.f40471e.add(new ky0(this, 17));
        this.f40727b0 = m61Var2;
        m61 m61Var3 = new m61(this.currentAccount, chat.f22392id, new TLRPC.TL_channelParticipantsSearch());
        m61Var3.f40471e.add(new ky0(this, 17));
        this.f40728c0 = m61Var3;
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new d21(this, 2));
        i61 i61Var = new i61(this);
        i61Var.f6463m = false;
        i61Var.C = false;
        i61Var.o(org.telegram.ui.Components.jr.h);
        i61Var.n(350L);
        this.d.setItemAnimator(i61Var);
        this.d.addOnLayoutChangeListener(new j61(this));
        this.d.j(new k61(this));
        this.containerView.addView(new l61(this, getContext()), i7.f6.e(-1, 68, 87));
        nh.d dVar = new nh.d(getContext(), c6Var, true);
        dVar.setRoundRadius(24);
        this.f40729d0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23311r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, i7.f6.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new w21(this, 5));
        org.telegram.ui.Components.k51 k51Var = this.f40730e0;
        if (k51Var != null) {
            k51Var.N(false);
        }
        m61Var.b();
        m61Var2.b();
    }

    public static void P(n61 n61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            n61Var.T = MessagesController.getInstance(n61Var.currentAccount).getChat(Long.valueOf(j10));
            n61Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(n61 n61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        boolean z16;
        m61 m61Var = n61Var.f40728c0;
        m61 m61Var2 = n61Var.f40727b0;
        TLRPC.User user = n61Var.U;
        m61 m61Var3 = n61Var.f40726a0;
        if (m61Var3 != null) {
            ArrayList arrayList2 = m61Var3.d;
            if (m61Var2 != null) {
                ArrayList arrayList3 = m61Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(n61Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.w41.D(3, AndroidUtilities.dp(64.0f)));
                if (m61Var != null && !TextUtils.isEmpty(m61Var.f40470c.f22391q)) {
                    ArrayList arrayList4 = m61Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.w41 v = org.telegram.ui.Components.w41.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(n61Var.W)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            v.K(z16);
                            arrayList.add(v);
                        }
                    }
                    if (m61Var.f40472f) {
                        arrayList.add(org.telegram.ui.Components.w41.n(29));
                        arrayList.add(org.telegram.ui.Components.w41.n(29));
                        arrayList.add(org.telegram.ui.Components.w41.n(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.w41.k(n61Var.Z));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i15);
                        i15++;
                        if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                                if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.w41 v10 = org.telegram.ui.Components.w41.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(n61Var.W)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                v10.K(z15);
                                arrayList.add(v10);
                                z10 = false;
                            }
                        }
                    }
                }
                z10 = true;
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList2.get(i16);
                    i16++;
                    TLObject tLObject2 = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                        if (z10) {
                            if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(i12)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.w41 v11 = org.telegram.ui.Components.w41.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(n61Var.W)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v11.K(z14);
                        arrayList.add(v11);
                    }
                }
                if (m61Var3.f40472f) {
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.w41 v12 = org.telegram.ui.Components.w41.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(n61Var.W)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    v12.K(z13);
                    arrayList.add(v12);
                    z11 = false;
                } else {
                    z11 = true;
                }
                int size4 = arrayList3.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    TLObject tLObject3 = (TLObject) obj4;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                        if (z11) {
                            if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(i10)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.w41 v13 = org.telegram.ui.Components.w41.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(n61Var.W)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v13.K(z12);
                        arrayList.add(v13);
                    }
                }
                if (!arrayList3.isEmpty() && m61Var2.f40472f) {
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                }
            }
        }
    }

    public static void R(n61 n61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        if (tL_error != null) {
            if (n61Var.f40731f0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n61Var.f40731f0);
                        if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
                            i16 = R.string.EditAdminChannelTransfer;
                        } else {
                            i16 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i16);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, n61Var.T.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new kl0(18, n61Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(n61Var) {
                            public final n61 f37707b;

                            {
                                this.f37707b = n61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                                switch (r2) {
                                    case 0:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    case 1:
                                        n61 n61Var2 = this.f37707b;
                                        n61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                        if (U != null) {
                                            n61Var2.dismiss();
                                            U.presentFragment(new cg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(n61Var.currentAccount).sendRequest(new TL_account.getPassword(), new jr0(n61Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (n61Var.f40731f0 != null && !AccountInstance.getInstance(n61Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                n61Var.showDialog(new cg.v0(5, n61Var.currentAccount, n61Var.f40731f0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            n61Var.dismiss();
                            U2.presentFragment(new md1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.c5.h0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(n61Var.T), ChatObject.isCommunity(n61Var.T), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n61Var.f40731f0);
                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(n61Var.f40731f0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(n61Var.f40731f0);
                    int i17 = org.telegram.ui.ActionBar.g6.f23169j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
                        b.p(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        b.p(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, i7.f6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(n61Var.f40731f0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(n61Var.f40731f0);
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i11, dp3, dp, 0);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(n61Var.f40731f0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, i7.f6.n(-1, -2));
                        linearLayout2.addView(imageView, i7.f6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, i7.f6.n(-2, -2));
                        linearLayout2.addView(textView2, i7.f6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(n61Var.f40731f0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(n61Var.f40731f0);
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i13 = AndroidUtilities.dp(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i13, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i17, false), mode));
                    TextView textView3 = new TextView(n61Var.f40731f0);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, i7.f6.n(-1, -2));
                        linearLayout3.addView(imageView2, i7.f6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, i7.f6.n(-2, -2));
                        linearLayout3.addView(textView3, i7.f6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(n61Var) {
                            public final n61 f37707b;

                            {
                                this.f37707b = n61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    case 1:
                                        n61 n61Var2 = this.f37707b;
                                        n61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            n61Var2.dismiss();
                                            U4.presentFragment(new cg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(n61Var) {
                            public final n61 f37707b;

                            {
                                this.f37707b = n61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    case 1:
                                        n61 n61Var2 = this.f37707b;
                                        n61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            n61Var2.dismiss();
                                            U4.presentFragment(new cg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(n61Var.f40731f0);
                        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(n61Var) {
                            public final n61 f37707b;

                            {
                                this.f37707b = n61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    case 1:
                                        n61 n61Var2 = this.f37707b;
                                        n61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            n61Var2.dismiss();
                                            U4.presentFragment(new cg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37707b.f40729d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            bg.f fVar = n61Var.V;
            if (fVar != null) {
                fVar.run();
            }
            n61Var.dismiss();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void S(n61 n61Var) {
        org.telegram.ui.Components.jl0 jl0Var = n61Var.d;
        float f9 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f9 = childAt.getY();
                break;
            }
            i10++;
        }
        n61Var.X.setTranslationY(f9);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f40731f0 = getContext();
        }
        if (this.f40731f0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.T)) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f40731f0, this.T.f22392id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 18));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.T)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.T;
                tL_inputChannel.channel_id = chat.f22392id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            if (inputCheckPasswordSRP != null) {
                tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
            } else {
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
            tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new eg.f0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 14));
        }
    }

    public final void U(boolean z10) {
        int i10;
        int dp;
        if (ChatObject.isChannelAndNotMegaGroup(this.T)) {
            i10 = R.string.LeaveChannelAndAppoint;
        } else {
            i10 = R.string.LeaveGroupAndAppoint;
        }
        float dp2 = AndroidUtilities.dp(32.0f);
        nh.d dVar = this.f40729d0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.W), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f40726a0.a();
        this.f40727b0.a();
        this.f40728c0.a();
    }

    @Override
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 23), this.resourcesProvider);
        this.f40730e0 = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
