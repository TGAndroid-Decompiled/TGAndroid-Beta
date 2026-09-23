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
public final class j71 extends org.telegram.ui.Components.bb {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final ai.o8 Z;
    public TLObject f34347a0;
    public final FrameLayout f34348b0;
    public final b71 f34349c0;
    public final d71 f34350d0;
    public final i71 f34351e0;
    public final i71 f34352f0;
    public final i71 f34353g0;
    public final ci.d f34354h0;
    public org.telegram.ui.Components.v51 f34355i0;
    public Context f34356j0;

    public j71(Context context, TLRPC.Chat chat, TLRPC.User user, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(2, context, d6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.f34347a0 = user;
        this.Z = o8Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34348b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.h6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.h6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w7.x5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34349c0 = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.R5));
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
        editTextBoldCursor.setOnEditorActionListener(new ia(this, 11));
        editTextBoldCursor.addTextChangedListener(new c71(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, w7.x5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.x5.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.f34350d0 = frameLayout3;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setImageDrawable(new org.telegram.ui.Components.yi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(w9Var, w7.x5.e(130, 130, 17));
        i71 i71Var = new i71(this.currentAccount, chat.f18083id, new TLRPC.TL_channelParticipantsAdmins());
        i71Var.e.add(new xz0(this, 15));
        this.f34351e0 = i71Var;
        i71 i71Var2 = new i71(this.currentAccount, chat.f18083id, new TLRPC.TL_channelParticipantsRecent());
        i71Var2.e.add(new xz0(this, 15));
        this.f34352f0 = i71Var2;
        i71 i71Var3 = new i71(this.currentAccount, chat.f18083id, new TLRPC.TL_channelParticipantsSearch());
        i71Var3.e.add(new xz0(this, 15));
        this.f34353g0 = i71Var3;
        org.telegram.ui.Components.ml0 ml0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new s21(this, 3));
        e71 e71Var = new e71(this);
        e71Var.f42662m = false;
        e71Var.C = false;
        e71Var.o(org.telegram.ui.Components.rr.h);
        e71Var.n(350L);
        this.d.setItemAnimator(e71Var);
        this.d.addOnLayoutChangeListener(new f71(this));
        this.d.j(new g71(this));
        this.containerView.addView(new h71(this, getContext()), w7.x5.e(-1, 68, 87));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        dVar.setRoundRadius(24);
        this.f34354h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19045r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.x5.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new z31(this, 4));
        org.telegram.ui.Components.v51 v51Var = this.f34355i0;
        if (v51Var != null) {
            v51Var.N(false);
        }
        i71Var.b();
        i71Var2.b();
    }

    public static void P(j71 j71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            j71Var.X = MessagesController.getInstance(j71Var.currentAccount).getChat(Long.valueOf(j3));
            j71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(j71 j71Var, ArrayList arrayList) {
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
        i71 i71Var = j71Var.f34353g0;
        i71 i71Var2 = j71Var.f34352f0;
        TLRPC.User user = j71Var.Y;
        i71 i71Var3 = j71Var.f34351e0;
        if (i71Var3 != null) {
            ArrayList arrayList2 = i71Var3.d;
            if (i71Var2 != null) {
                ArrayList arrayList3 = i71Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(j71Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.h51.D(3, AndroidUtilities.dp(64.0f)));
                if (i71Var != null && !TextUtils.isEmpty(i71Var.f34055c.f18082q)) {
                    ArrayList arrayList4 = i71Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.h51 v = org.telegram.ui.Components.h51.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(j71Var.f34347a0)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            v.K(z16);
                            arrayList.add(v);
                        }
                    }
                    if (i71Var.f34056f) {
                        arrayList.add(org.telegram.ui.Components.h51.n(29));
                        arrayList.add(org.telegram.ui.Components.h51.n(29));
                        arrayList.add(org.telegram.ui.Components.h51.n(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.h51.k(j71Var.f34350d0));
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
                                if (ChatObject.isChannelAndNotMegaGroup(j71Var.X)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.h51 v9 = org.telegram.ui.Components.h51.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(j71Var.f34347a0)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                v9.K(z15);
                                arrayList.add(v9);
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
                            if (ChatObject.isChannelAndNotMegaGroup(j71Var.X)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i12)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.h51 v10 = org.telegram.ui.Components.h51.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(j71Var.f34347a0)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v10.K(z14);
                        arrayList.add(v10);
                    }
                }
                if (i71Var3.f34056f) {
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(j71Var.X)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.h51 v11 = org.telegram.ui.Components.h51.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(j71Var.f34347a0)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    v11.K(z13);
                    arrayList.add(v11);
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
                            if (ChatObject.isChannelAndNotMegaGroup(j71Var.X)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i10)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.h51 v12 = org.telegram.ui.Components.h51.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(j71Var.f34347a0)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v12.K(z12);
                        arrayList.add(v12);
                    }
                }
                if (!arrayList3.isEmpty() && i71Var2.f34056f) {
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                }
            }
        }
    }

    public static void R(j71 j71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
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
            if (j71Var.f34356j0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j71Var.f34356j0);
                        if (ChatObject.isChannelAndNotMegaGroup(j71Var.X)) {
                            i16 = R.string.EditAdminChannelTransfer;
                        } else {
                            i16 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i16);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string;
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, j71Var.X.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new kv0(9, j71Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(j71Var) {
                            public final j71 f31691b;

                            {
                                this.f31691b = j71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                                switch (r2) {
                                    case 0:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    case 1:
                                        j71 j71Var2 = this.f31691b;
                                        j71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                        if (U != null) {
                                            j71Var2.dismiss();
                                            U.presentFragment(new zg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    default:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(j71Var.currentAccount).sendRequest(new TL_account.getPassword(), new gs0(j71Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (j71Var.f34356j0 != null && !AccountInstance.getInstance(j71Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                            if (U != null) {
                                j71Var.showDialog(new rg.j0(5, j71Var.currentAccount, j71Var.f34356j0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            j71Var.dismiss();
                            U2.presentFragment(new le1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.e5.h0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(j71Var.X), ChatObject.isCommunity(j71Var.X), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j71Var.f34356j0);
                    alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(j71Var.f34356j0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(j71Var.f34356j0);
                    int i17 = org.telegram.ui.ActionBar.h6.f18895j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(j71Var.X)) {
                        org.telegram.messenger.ul.q(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        org.telegram.messenger.ul.q(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, w7.x5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(j71Var.f34356j0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(j71Var.f34356j0);
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
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(j71Var.f34356j0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.z0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.x5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(j71Var.f34356j0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(j71Var.f34356j0);
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i17, false), mode));
                    TextView textView3 = new TextView(j71Var.f34356j0);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.z0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, w7.x5.n(-1, -2));
                        linearLayout3.addView(imageView2, w7.x5.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, w7.x5.n(-2, -2));
                        linearLayout3.addView(textView3, w7.x5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.a2(j71Var) {
                            public final j71 f31691b;

                            {
                                this.f31691b = j71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    case 1:
                                        j71 j71Var2 = this.f31691b;
                                        j71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            j71Var2.dismiss();
                                            U4.presentFragment(new zg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    default:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(j71Var) {
                            public final j71 f31691b;

                            {
                                this.f31691b = j71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    case 1:
                                        j71 j71Var2 = this.f31691b;
                                        j71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            j71Var2.dismiss();
                                            U4.presentFragment(new zg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    default:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(j71Var.f34356j0);
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2(j71Var) {
                            public final j71 f31691b;

                            {
                                this.f31691b = j71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    case 1:
                                        j71 j71Var2 = this.f31691b;
                                        j71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            j71Var2.dismiss();
                                            U4.presentFragment(new zg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                    default:
                                        this.f31691b.f34354h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            ai.o8 o8Var = j71Var.Z;
            if (o8Var != null) {
                o8Var.run();
            }
            j71Var.dismiss();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void S(j71 j71Var) {
        org.telegram.ui.Components.ml0 ml0Var = j71Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        j71Var.f34348b0.setTranslationY(f7);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f34356j0 = getContext();
        }
        if (this.f34356j0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f34356j0, this.X.f18083id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 17));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.X)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.X;
                tL_inputChannel.channel_id = chat.f18083id;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ci.hd(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 11));
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
        ci.d dVar = this.f34354h0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.f34347a0), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34351e0.a();
        this.f34352f0.a();
        this.f34353g0.a();
    }

    @Override
    public final org.telegram.ui.Components.ll0 v(org.telegram.ui.Components.ml0 ml0Var) {
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(ml0Var, getContext(), this.currentAccount, 0, false, new c5(this, 23), this.resourcesProvider);
        this.f34355i0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
