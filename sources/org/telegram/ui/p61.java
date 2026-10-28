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
public final class p61 extends org.telegram.ui.Components.bb {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final org.telegram.ui.Components.h2 Z;
    public TLObject f42316a0;
    public final FrameLayout f42317b0;
    public final h61 f42318c0;
    public final j61 f42319d0;
    public final o61 f42320e0;
    public final o61 f42321f0;
    public final o61 f42322g0;
    public final fi.d f42323h0;
    public org.telegram.ui.Components.k71 f42324i0;
    public Context f42325j0;

    public p61(Context context, TLRPC.Chat chat, TLRPC.User user, org.telegram.ui.Components.h2 h2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(2, context, u6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.f42316a0 = user;
        this.Z = h2Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42317b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(20.0f);
        int i10 = org.telegram.ui.ActionBar.y6.O5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, getThemedColor(i10));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        frameLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, c02, N, null, u6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i11 = org.telegram.ui.ActionBar.y6.P5;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, org.telegram.ui.Components.kb1.h(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42318c0 = editTextBoldCursor;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, org.telegram.ui.ActionBar.y6.R5, u6Var);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, i11, u6Var);
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
        editTextBoldCursor.setOnEditorActionListener(new la(this, 11));
        editTextBoldCursor.addTextChangedListener(new i61(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        frameLayout.addView(frameLayout2, org.telegram.ui.Components.kb1.h(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, org.telegram.ui.Components.kb1.h(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.f42319d0 = frameLayout3;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(y9Var, org.telegram.ui.Components.kb1.i(130, 130, 17));
        o61 o61Var = new o61(this.currentAccount, chat.f22028id, new TLRPC.TL_channelParticipantsAdmins());
        o61Var.e.add(new oy0(this, 18));
        this.f42320e0 = o61Var;
        o61 o61Var2 = new o61(this.currentAccount, chat.f22028id, new TLRPC.TL_channelParticipantsRecent());
        o61Var2.e.add(new oy0(this, 18));
        this.f42321f0 = o61Var2;
        o61 o61Var3 = new o61(this.currentAccount, chat.f22028id, new TLRPC.TL_channelParticipantsSearch());
        o61Var3.e.add(new oy0(this, 18));
        this.f42322g0 = o61Var3;
        org.telegram.ui.Components.nm0 nm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new o11(this, 4));
        k61 k61Var = new k61(this);
        k61Var.f47798m = false;
        k61Var.C = false;
        k61Var.o(org.telegram.ui.Components.ds.h);
        k61Var.n(350L);
        this.d.setItemAnimator(k61Var);
        this.d.addOnLayoutChangeListener(new l61(this));
        this.d.j(new m61(this));
        this.containerView.addView(new n61(this, getContext()), org.telegram.ui.Components.kb1.i(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), u6Var, true);
        dVar.setRoundRadius(24);
        this.f42323h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23616r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, org.telegram.ui.Components.kb1.h(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new v21(this, 5));
        org.telegram.ui.Components.k71 k71Var = this.f42324i0;
        if (k71Var != null) {
            k71Var.O(false);
        }
        o61Var.b();
        o61Var2.b();
    }

    public static void P(p61 p61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            p61Var.X = MessagesController.getInstance(p61Var.currentAccount).getChat(Long.valueOf(j10));
            p61Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(p61 p61Var, ArrayList arrayList) {
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
        o61 o61Var = p61Var.f42322g0;
        o61 o61Var2 = p61Var.f42321f0;
        TLRPC.User user = p61Var.Y;
        o61 o61Var3 = p61Var.f42320e0;
        if (o61Var3 != null) {
            ArrayList arrayList2 = o61Var3.d;
            if (o61Var2 != null) {
                ArrayList arrayList3 = o61Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(p61Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.u61.E(3, AndroidUtilities.dp(64.0f)));
                if (o61Var != null && !TextUtils.isEmpty(o61Var.f41996c.f22027q)) {
                    ArrayList arrayList4 = o61Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.u61 w10 = org.telegram.ui.Components.u61.w(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(p61Var.f42316a0)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w10.L(z16);
                            arrayList.add(w10);
                        }
                    }
                    if (o61Var.f41997f) {
                        arrayList.add(org.telegram.ui.Components.u61.p(29));
                        arrayList.add(org.telegram.ui.Components.u61.p(29));
                        arrayList.add(org.telegram.ui.Components.u61.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.u61.k(p61Var.f42319d0));
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
                                if (ChatObject.isChannelAndNotMegaGroup(p61Var.X)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.u61 w11 = org.telegram.ui.Components.u61.w(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(p61Var.f42316a0)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                w11.L(z15);
                                arrayList.add(w11);
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
                            if (ChatObject.isChannelAndNotMegaGroup(p61Var.X)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(i12)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.u61 w12 = org.telegram.ui.Components.u61.w(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(p61Var.f42316a0)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w12.L(z14);
                        arrayList.add(w12);
                    }
                }
                if (o61Var3.f41997f) {
                    arrayList.add(org.telegram.ui.Components.u61.p(29));
                    arrayList.add(org.telegram.ui.Components.u61.p(29));
                    arrayList.add(org.telegram.ui.Components.u61.p(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(p61Var.X)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.u61 w13 = org.telegram.ui.Components.u61.w(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(p61Var.f42316a0)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    w13.L(z13);
                    arrayList.add(w13);
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
                            if (ChatObject.isChannelAndNotMegaGroup(p61Var.X)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(i10)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.u61 w14 = org.telegram.ui.Components.u61.w(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(p61Var.f42316a0)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w14.L(z12);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && o61Var2.f41997f) {
                    arrayList.add(org.telegram.ui.Components.u61.p(29));
                    arrayList.add(org.telegram.ui.Components.u61.p(29));
                    arrayList.add(org.telegram.ui.Components.u61.p(29));
                }
            }
        }
    }

    public static void R(final p61 p61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
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
            if (p61Var.f42325j0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p61Var.f42325j0);
                        if (ChatObject.isChannelAndNotMegaGroup(p61Var.X)) {
                            i17 = R.string.EditAdminChannelTransfer;
                        } else {
                            i17 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i17);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, p61Var.X.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new cf0(20, p61Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(p61Var) {
                            public final p61 f39517b;

                            {
                                this.f39517b = p61Var;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i18) {
                                switch (r2) {
                                    case 0:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    case 1:
                                        p61 p61Var2 = this.f39517b;
                                        p61Var2.getClass();
                                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                        if (U != null) {
                                            p61Var2.dismiss();
                                            U.presentFragment(new fg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    default:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.p();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(p61Var.currentAccount).sendRequest(new TL_account.getPassword(), new cs0(p61Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (p61Var.f42325j0 != null && !AccountInstance.getInstance(p61Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                            if (U != null) {
                                p61Var.showDialog(new tg.j0(5, p61Var.currentAccount, p61Var.f42325j0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            p61Var.dismiss();
                            U2.presentFragment(new rd1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.p0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.g5.g0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(p61Var.X), ChatObject.isCommunity(p61Var.X), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.p0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p61Var.f42325j0);
                    alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(p61Var.f42325j0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(p61Var.f42325j0);
                    int i18 = org.telegram.ui.ActionBar.y6.f23465j5;
                    org.telegram.ui.ActionBar.f7.V(textView, i18, null);
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(p61Var.X)) {
                        org.telegram.messenger.wh.o(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        org.telegram.messenger.wh.o(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, org.telegram.ui.Components.kb1.r(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(p61Var.f42325j0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, org.telegram.ui.Components.kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(p61Var.f42325j0);
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
                    org.telegram.ui.ActionBar.f7.t(imageView, i18, null, mode);
                    TextView textView2 = new TextView(p61Var.f42325j0);
                    org.telegram.ui.ActionBar.f7.V(textView2, i18, null);
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, org.telegram.ui.Components.kb1.r(-1, -2));
                        linearLayout2.addView(imageView, org.telegram.ui.Components.kb1.u(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, org.telegram.ui.Components.kb1.r(-2, -2));
                        linearLayout2.addView(textView2, org.telegram.ui.Components.kb1.r(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(p61Var.f42325j0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, org.telegram.ui.Components.kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(p61Var.f42325j0);
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
                    org.telegram.ui.ActionBar.f7.t(imageView2, i18, null, mode);
                    TextView textView3 = new TextView(p61Var.f42325j0);
                    org.telegram.ui.ActionBar.f7.V(textView3, i18, null);
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, org.telegram.ui.Components.kb1.r(-1, -2));
                        i15 = 5;
                        linearLayout3.addView(imageView2, org.telegram.ui.Components.kb1.u(-2, -2, 5));
                    } else {
                        i15 = 5;
                        linearLayout3.addView(imageView2, org.telegram.ui.Components.kb1.r(-2, -2));
                        linearLayout3.addView(textView3, org.telegram.ui.Components.kb1.r(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(p61Var) {
                            public final p61 f39517b;

                            {
                                this.f39517b = p61Var;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    case 1:
                                        p61 p61Var2 = this.f39517b;
                                        p61Var2.getClass();
                                        org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            p61Var2.dismiss();
                                            U4.presentFragment(new fg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    default:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(p61Var) {
                            public final p61 f39517b;

                            {
                                this.f39517b = p61Var;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    case 1:
                                        p61 p61Var2 = this.f39517b;
                                        p61Var2.getClass();
                                        org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            p61Var2.dismiss();
                                            U4.presentFragment(new fg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    default:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(p61Var.f42325j0);
                        org.telegram.ui.ActionBar.f7.V(textView4, i18, null);
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, org.telegram.ui.Components.kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(p61Var) {
                            public final p61 f39517b;

                            {
                                this.f39517b = p61Var;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    case 1:
                                        p61 p61Var2 = this.f39517b;
                                        p61Var2.getClass();
                                        org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            p61Var2.dismiss();
                                            U4.presentFragment(new fg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                    default:
                                        this.f39517b.f42323h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.p();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            org.telegram.ui.Components.h2 h2Var = p61Var.Z;
            if (h2Var != null) {
                h2Var.run();
            }
            p61Var.dismiss();
            twoStepVerificationActivity.p0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void S(p61 p61Var) {
        org.telegram.ui.Components.nm0 nm0Var = p61Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= nm0Var.getChildCount()) {
                break;
            }
            View childAt = nm0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        p61Var.f42317b0.setTranslationY(f7);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f42325j0 = getContext();
        }
        if (this.f42325j0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f42325j0, this.X.f22028id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.X)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.X;
                tL_inputChannel.channel_id = chat.f22028id;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new bi.n9(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
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
        fi.d dVar = this.f42323h0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.i(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.f42316a0), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f42320e0.a();
        this.f42321f0.a();
        this.f42322g0.a();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fi.d dVar = this.f42323h0;
            if (dVar != null) {
                dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23616r7));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(nm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 23), this.resourcesProvider);
        this.f42324i0 = k71Var;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
