package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.messenger.FileLog;
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
public final class k61 extends org.telegram.ui.Components.za {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final org.telegram.ui.Components.c2 Z;
    public TLObject f38800a0;
    public final FrameLayout f38801b0;
    public final c61 f38802c0;
    public final e61 f38803d0;
    public final j61 f38804e0;
    public final j61 f38805f0;
    public final j61 f38806g0;
    public final ei.d f38807h0;
    public org.telegram.ui.Components.a71 f38808i0;
    public Context f38809j0;

    public k61(Context context, TLRPC.Chat chat, TLRPC.User user, org.telegram.ui.Components.c2 c2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(2, context, g6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.f38800a0 = user;
        this.Z = c2Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38801b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.O5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        frameLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, c02, O, null, g6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i11 = org.telegram.ui.ActionBar.k6.P5;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, w7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38802c0 = editTextBoldCursor;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, org.telegram.ui.ActionBar.k6.R5, g6Var);
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, i11, g6Var);
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
        editTextBoldCursor.setOnEditorActionListener(new ka(this, 11));
        editTextBoldCursor.addTextChangedListener(new d61(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, w7.z5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.z5.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.f38803d0 = frameLayout3;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        u9Var.setImageDrawable(new org.telegram.ui.Components.xj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(u9Var, w7.z5.e(130, 130, 17));
        j61 j61Var = new j61(this.currentAccount, chat.f20344id, new TLRPC.TL_channelParticipantsAdmins());
        j61Var.e.add(new ly0(this, 17));
        this.f38804e0 = j61Var;
        j61 j61Var2 = new j61(this.currentAccount, chat.f20344id, new TLRPC.TL_channelParticipantsRecent());
        j61Var2.e.add(new ly0(this, 17));
        this.f38805f0 = j61Var2;
        j61 j61Var3 = new j61(this.currentAccount, chat.f20344id, new TLRPC.TL_channelParticipantsSearch());
        j61Var3.e.add(new ly0(this, 17));
        this.f38806g0 = j61Var3;
        org.telegram.ui.Components.lm0 lm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new i11(this, 4));
        f61 f61Var = new f61(this);
        f61Var.f46376m = false;
        f61Var.C = false;
        f61Var.o(org.telegram.ui.Components.zr.h);
        f61Var.n(350L);
        this.d.setItemAnimator(f61Var);
        this.d.addOnLayoutChangeListener(new g61(this));
        this.d.j(new h61(this));
        this.containerView.addView(new i61(this, getContext()), w7.z5.e(-1, 68, 87));
        ei.d dVar = new ei.d(getContext(), g6Var, true);
        dVar.setRoundRadius(24);
        this.f38807h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21442r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.z5.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new f31(this, 3));
        org.telegram.ui.Components.a71 a71Var = this.f38808i0;
        if (a71Var != null) {
            a71Var.N(false);
        }
        j61Var.b();
        j61Var2.b();
    }

    public static void P(k61 k61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            k61Var.X = MessagesController.getInstance(k61Var.currentAccount).getChat(Long.valueOf(j10));
            k61Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(k61 k61Var, ArrayList arrayList) {
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
        j61 j61Var = k61Var.f38806g0;
        j61 j61Var2 = k61Var.f38805f0;
        TLRPC.User user = k61Var.Y;
        j61 j61Var3 = k61Var.f38804e0;
        if (j61Var3 != null) {
            ArrayList arrayList2 = j61Var3.d;
            if (j61Var2 != null) {
                ArrayList arrayList3 = j61Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(k61Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.l61.D(3, AndroidUtilities.dp(64.0f)));
                if (j61Var != null && !TextUtils.isEmpty(j61Var.f38477c.f20343q)) {
                    ArrayList arrayList4 = j61Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.l61 v = org.telegram.ui.Components.l61.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(k61Var.f38800a0)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            v.K(z16);
                            arrayList.add(v);
                        }
                    }
                    if (j61Var.f38478f) {
                        arrayList.add(org.telegram.ui.Components.l61.n(29));
                        arrayList.add(org.telegram.ui.Components.l61.n(29));
                        arrayList.add(org.telegram.ui.Components.l61.n(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.l61.k(k61Var.f38803d0));
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
                                if (ChatObject.isChannelAndNotMegaGroup(k61Var.X)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.l61 v10 = org.telegram.ui.Components.l61.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(k61Var.f38800a0)) {
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
                            if (ChatObject.isChannelAndNotMegaGroup(k61Var.X)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(i12)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.l61 v11 = org.telegram.ui.Components.l61.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(k61Var.f38800a0)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v11.K(z14);
                        arrayList.add(v11);
                    }
                }
                if (j61Var3.f38478f) {
                    arrayList.add(org.telegram.ui.Components.l61.n(29));
                    arrayList.add(org.telegram.ui.Components.l61.n(29));
                    arrayList.add(org.telegram.ui.Components.l61.n(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(k61Var.X)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.l61 v12 = org.telegram.ui.Components.l61.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(k61Var.f38800a0)) {
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
                            if (ChatObject.isChannelAndNotMegaGroup(k61Var.X)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(i10)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.l61 v13 = org.telegram.ui.Components.l61.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(k61Var.f38800a0)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v13.K(z12);
                        arrayList.add(v13);
                    }
                }
                if (!arrayList3.isEmpty() && j61Var2.f38478f) {
                    arrayList.add(org.telegram.ui.Components.l61.n(29));
                    arrayList.add(org.telegram.ui.Components.l61.n(29));
                    arrayList.add(org.telegram.ui.Components.l61.n(29));
                }
            }
        }
    }

    public static void R(final k61 k61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        int i17;
        if (tL_error != null) {
            if (k61Var.f38809j0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k61Var.f38809j0);
                        if (ChatObject.isChannelAndNotMegaGroup(k61Var.X)) {
                            i17 = R.string.EditAdminChannelTransfer;
                        } else {
                            i17 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i17);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = string;
                        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, k61Var.X.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new pl0(16, k61Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1(k61Var) {
                            public final k61 f35934b;

                            {
                                this.f35934b = k61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i18) {
                                switch (r2) {
                                    case 0:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    case 1:
                                        k61 k61Var2 = this.f35934b;
                                        k61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                        if (U != null) {
                                            k61Var2.dismiss();
                                            U.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.p();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(k61Var.currentAccount).sendRequest(new TL_account.getPassword(), new vr0(k61Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (k61Var.f38809j0 != null && !AccountInstance.getInstance(k61Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                k61Var.showDialog(new sg.j0(5, k61Var.currentAccount, k61Var.f38809j0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            k61Var.dismiss();
                            U2.presentFragment(new ld1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.d5.g0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(k61Var.X), ChatObject.isCommunity(k61Var.X), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k61Var.f38809j0);
                    alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(k61Var.f38809j0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(k61Var.f38809j0);
                    int i18 = org.telegram.ui.ActionBar.k6.f21290j5;
                    org.telegram.ui.ActionBar.r6.W(textView, i18, null);
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(k61Var.X)) {
                        org.telegram.messenger.tl.r(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        org.telegram.messenger.tl.r(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, w7.z5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(k61Var.f38809j0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(k61Var.f38809j0);
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
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.t(imageView, i18, null, mode);
                    TextView textView2 = new TextView(k61Var.f38809j0);
                    org.telegram.ui.ActionBar.r6.W(textView2, i18, null);
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(k61Var.f38809j0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(k61Var.f38809j0);
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
                    org.telegram.ui.ActionBar.r6.t(imageView2, i18, null, mode);
                    TextView textView3 = new TextView(k61Var.f38809j0);
                    org.telegram.ui.ActionBar.r6.W(textView3, i18, null);
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
                        linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.z1(k61Var) {
                            public final k61 f35934b;

                            {
                                this.f35934b = k61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    case 1:
                                        k61 k61Var2 = this.f35934b;
                                        k61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            k61Var2.dismiss();
                                            U4.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1(k61Var) {
                            public final k61 f35934b;

                            {
                                this.f35934b = k61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    case 1:
                                        k61 k61Var2 = this.f35934b;
                                        k61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            k61Var2.dismiss();
                                            U4.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(k61Var.f38809j0);
                        org.telegram.ui.ActionBar.r6.W(textView4, i18, null);
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1(k61Var) {
                            public final k61 f35934b;

                            {
                                this.f35934b = k61Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    case 1:
                                        k61 k61Var2 = this.f35934b;
                                        k61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            k61Var2.dismiss();
                                            U4.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35934b.f38807h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.p();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            org.telegram.ui.Components.c2 c2Var2 = k61Var.Z;
            if (c2Var2 != null) {
                c2Var2.run();
            }
            k61Var.dismiss();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void S(k61 k61Var) {
        org.telegram.ui.Components.lm0 lm0Var = k61Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= lm0Var.getChildCount()) {
                break;
            }
            View childAt = lm0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        k61Var.f38801b0.setTranslationY(f7);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f38809j0 = getContext();
        }
        if (this.f38809j0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f38809j0, this.X.f20344id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.X)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.X;
                tL_inputChannel.channel_id = chat.f20344id;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ai.s9(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void U(boolean z10) {
        int i10;
        int dp;
        if (ChatObject.isChannelAndNotMegaGroup(this.X)) {
            i10 = R.string.LeaveChannelAndAppoint;
        } else {
            i10 = R.string.LeaveGroupAndAppoint;
        }
        float dp2 = AndroidUtilities.dp(32.0f);
        ei.d dVar = this.f38807h0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.i(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.f38800a0), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38804e0.a();
        this.f38805f0.a();
        this.f38806g0.a();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ei.d dVar = this.f38807h0;
            if (dVar != null) {
                dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21442r7));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.Components.km0 w(org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(lm0Var, getContext(), this.currentAccount, 0, false, new f5(this, 23), this.resourcesProvider);
        this.f38808i0 = a71Var;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
