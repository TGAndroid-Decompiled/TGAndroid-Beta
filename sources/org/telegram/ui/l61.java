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
public final class l61 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat T;
    public final TLRPC.User U;
    public final bg.c2 V;
    public TLObject W;
    public final FrameLayout X;
    public final d61 Y;
    public final f61 Z;
    public final k61 f40064a0;
    public final k61 f40065b0;
    public final k61 f40066c0;
    public final kh.d f40067d0;
    public org.telegram.ui.Components.z41 f40068e0;
    public Context f40069f0;

    public l61(Context context, TLRPC.Chat chat, TLRPC.User user, bg.c2 c2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, 2, b6Var);
        this.G = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.T = chat;
        this.U = user;
        this.W = user;
        this.V = c2Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.f6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i9 = org.telegram.ui.ActionBar.f6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, g7.e6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.Y = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.R5));
        editTextBoldCursor.setHintTextColor(getThemedColor(i9));
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
        editTextBoldCursor.setOnEditorActionListener(new ea(this, 11));
        editTextBoldCursor.addTextChangedListener(new e61(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, g7.e6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.f32408e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, g7.e6.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        o9Var.setImageDrawable(new org.telegram.ui.Components.mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(o9Var, g7.e6.e(130, 130, 17));
        k61 k61Var = new k61(this.currentAccount, chat.f22380id, new TLRPC.TL_channelParticipantsAdmins());
        k61Var.f39755e.add(new ky0(this, 17));
        this.f40064a0 = k61Var;
        k61 k61Var2 = new k61(this.currentAccount, chat.f22380id, new TLRPC.TL_channelParticipantsRecent());
        k61Var2.f39755e.add(new ky0(this, 17));
        this.f40065b0 = k61Var2;
        k61 k61Var3 = new k61(this.currentAccount, chat.f22380id, new TLRPC.TL_channelParticipantsSearch());
        k61Var3.f39755e.add(new ky0(this, 17));
        this.f40066c0 = k61Var3;
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new c21(this, 2));
        g61 g61Var = new g61(this);
        g61Var.f5532m = false;
        g61Var.C = false;
        g61Var.o(org.telegram.ui.Components.gr.h);
        g61Var.n(350L);
        this.d.setItemAnimator(g61Var);
        this.d.addOnLayoutChangeListener(new h61(this));
        this.d.j(new i61(this));
        this.containerView.addView(new j61(this, getContext()), g7.e6.e(-1, 68, 87));
        kh.d dVar = new kh.d(getContext(), b6Var, true);
        dVar.setRoundRadius(24);
        this.f40067d0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23249r7));
        T(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, g7.e6.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new w21(this, 5));
        org.telegram.ui.Components.z41 z41Var = this.f40068e0;
        if (z41Var != null) {
            z41Var.N(false);
        }
        k61Var.b();
        k61Var2.b();
    }

    public static void O(l61 l61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            l61Var.T = MessagesController.getInstance(l61Var.currentAccount).getChat(Long.valueOf(j10));
            l61Var.S(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void P(l61 l61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        int i10;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        boolean z16;
        k61 k61Var = l61Var.f40066c0;
        k61 k61Var2 = l61Var.f40065b0;
        TLRPC.User user = l61Var.U;
        k61 k61Var3 = l61Var.f40064a0;
        if (k61Var3 != null) {
            ArrayList arrayList2 = k61Var3.d;
            if (k61Var2 != null) {
                ArrayList arrayList3 = k61Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(l61Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.l41.D(3, AndroidUtilities.dp(64.0f)));
                if (k61Var != null && !TextUtils.isEmpty(k61Var.f39754c.f22379q)) {
                    ArrayList arrayList4 = k61Var.d;
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.l41 v = org.telegram.ui.Components.l41.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(l61Var.W)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            v.K(z16);
                            arrayList.add(v);
                        }
                    }
                    if (k61Var.f39756f) {
                        arrayList.add(org.telegram.ui.Components.l41.n(29));
                        arrayList.add(org.telegram.ui.Components.l41.n(29));
                        arrayList.add(org.telegram.ui.Components.l41.n(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.l41.k(l61Var.Z));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                                if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
                                    i12 = R.string.ChannelAdmins;
                                } else {
                                    i12 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(i12)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.l41 v4 = org.telegram.ui.Components.l41.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(l61Var.W)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                v4.K(z15);
                                arrayList.add(v4);
                                z10 = false;
                            }
                        }
                    }
                }
                z10 = true;
                int size3 = arrayList2.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList2.get(i15);
                    i15++;
                    TLObject tLObject2 = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                        if (z10) {
                            if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
                                i11 = R.string.ChannelAdmins;
                            } else {
                                i11 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(i11)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.l41 v10 = org.telegram.ui.Components.l41.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(l61Var.W)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v10.K(z14);
                        arrayList.add(v10);
                    }
                }
                if (k61Var3.f39756f) {
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
                        i10 = R.string.ChannelSubscribers2;
                    } else {
                        i10 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(i10)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.l41 v11 = org.telegram.ui.Components.l41.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(l61Var.W)) {
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
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = arrayList3.get(i16);
                    i16++;
                    TLObject tLObject3 = (TLObject) obj4;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                        if (z11) {
                            if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
                                i9 = R.string.ChannelSubscribers2;
                            } else {
                                i9 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(i9)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.l41 v12 = org.telegram.ui.Components.l41.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(l61Var.W)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v12.K(z12);
                        arrayList.add(v12);
                    }
                }
                if (!arrayList3.isEmpty() && k61Var2.f39756f) {
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                }
            }
        }
    }

    public static void Q(l61 l61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i9;
        int i10;
        int dp;
        int i11;
        int i12;
        int dp2;
        int i13;
        int i14;
        int i15;
        if (tL_error != null) {
            if (l61Var.f40069f0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l61Var.f40069f0);
                        if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
                            i15 = R.string.EditAdminChannelTransfer;
                        } else {
                            i15 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i15);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, l61Var.T.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new nl0(18, l61Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(l61Var) {
                            public final l61 f37077b;

                            {
                                this.f37077b = l61Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i16) {
                                switch (r2) {
                                    case 0:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    case 1:
                                        l61 l61Var2 = this.f37077b;
                                        l61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                        if (U != null) {
                                            l61Var2.dismiss();
                                            U.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(l61Var.currentAccount).sendRequest(new TL_account.getPassword(), new kr0(l61Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (l61Var.f40069f0 != null && !AccountInstance.getInstance(l61Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                l61Var.showDialog(new zf.j0(5, l61Var.currentAccount, l61Var.f40069f0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            l61Var.dismiss();
                            U2.presentFragment(new kd1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.n0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.y4.h0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(l61Var.T), ChatObject.isCommunity(l61Var.T), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.n0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l61Var.f40069f0);
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(l61Var.f40069f0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(l61Var.f40069f0);
                    int i16 = org.telegram.ui.ActionBar.f6.f23108j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i9 = 5;
                    } else {
                        i9 = 3;
                    }
                    textView.setGravity(i9 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
                        org.telegram.messenger.ll.q(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        org.telegram.messenger.ll.q(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, g7.e6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(l61Var.f40069f0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(l61Var.f40069f0);
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i10 = AndroidUtilities.dp(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i10, dp3, dp, 0);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(l61Var.f40069f0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                        linearLayout2.addView(imageView, g7.e6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, g7.e6.n(-2, -2));
                        linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(l61Var.f40069f0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(l61Var.f40069f0);
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i12 = AndroidUtilities.dp(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i12, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(l61Var.f40069f0);
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, g7.e6.n(-1, -2));
                        linearLayout3.addView(imageView2, g7.e6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, g7.e6.n(-2, -2));
                        linearLayout3.addView(textView3, g7.e6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(l61Var) {
                            public final l61 f37077b;

                            {
                                this.f37077b = l61Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i162) {
                                switch (r2) {
                                    case 0:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    case 1:
                                        l61 l61Var2 = this.f37077b;
                                        l61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            l61Var2.dismiss();
                                            U4.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(l61Var) {
                            public final l61 f37077b;

                            {
                                this.f37077b = l61Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i162) {
                                switch (r2) {
                                    case 0:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    case 1:
                                        l61 l61Var2 = this.f37077b;
                                        l61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            l61Var2.dismiss();
                                            U4.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(l61Var.f40069f0);
                        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        textView4.setGravity(i14 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(l61Var) {
                            public final l61 f37077b;

                            {
                                this.f37077b = l61Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i162) {
                                switch (r2) {
                                    case 0:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    case 1:
                                        l61 l61Var2 = this.f37077b;
                                        l61Var2.getClass();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            l61Var2.dismiss();
                                            U4.presentFragment(new ag1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                    default:
                                        this.f37077b.f40067d0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            bg.c2 c2Var2 = l61Var.V;
            if (c2Var2 != null) {
                c2Var2.run();
            }
            l61Var.dismiss();
            twoStepVerificationActivity.n0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void R(l61 l61Var) {
        org.telegram.ui.Components.wk0 wk0Var = l61Var.d;
        float f10 = -AndroidUtilities.dp(64.0f);
        int i9 = 0;
        while (true) {
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i9++;
        }
        l61Var.X.setTranslationY(f10);
    }

    public final void S(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f40069f0 = getContext();
        }
        if (this.f40069f0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.T)) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f40069f0, this.T.f22380id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.T)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.T;
                tL_inputChannel.channel_id = chat.f22380id;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new bg.h0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 14));
        }
    }

    public final void T(boolean z10) {
        int i9;
        int dp;
        if (ChatObject.isChannelAndNotMegaGroup(this.T)) {
            i9 = R.string.LeaveChannelAndAppoint;
        } else {
            i9 = R.string.LeaveGroupAndAppoint;
        }
        float dp2 = AndroidUtilities.dp(32.0f);
        kh.d dVar = this.f40067d0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.g(LocaleController.formatString(i9, TextUtils.ellipsize(DialogObject.getShortTitle(this.W), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i9))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f40064a0.a();
        this.f40065b0.a();
        this.f40066c0.a();
    }

    @Override
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(wk0Var, getContext(), this.currentAccount, 0, false, new a5(this, 23), this.resourcesProvider);
        this.f40068e0 = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
