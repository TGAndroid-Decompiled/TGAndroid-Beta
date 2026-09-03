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
public final class h71 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat U;
    public final TLRPC.User V;
    public final af.b W;
    public TLObject X;
    public final FrameLayout Y;
    public final z61 Z;
    public final b71 f37242a0;
    public final g71 f37243b0;
    public final g71 f37244c0;
    public final g71 f37245d0;
    public final qh.d f37246e0;
    public org.telegram.ui.Components.w51 f37247f0;
    public Context f37248g0;

    public h71(Context context, TLRPC.Chat chat, TLRPC.User user, af.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, false, 2, g6Var);
        this.H = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.U = chat;
        this.V = user;
        this.X = user;
        this.W = bVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.k6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, k7.c6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.Z = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.R5));
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
        editTextBoldCursor.setOnEditorActionListener(new ha(this, 11));
        editTextBoldCursor.addTextChangedListener(new a71(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, k7.c6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.f31015e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, k7.c6.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.f37242a0 = frameLayout3;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setImageDrawable(new org.telegram.ui.Components.hj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(p9Var, k7.c6.e(130, 130, 17));
        g71 g71Var = new g71(this.currentAccount, chat.f20845id, new TLRPC.TL_channelParticipantsAdmins());
        g71Var.f37007e.add(new sz0(this, 15));
        this.f37243b0 = g71Var;
        g71 g71Var2 = new g71(this.currentAccount, chat.f20845id, new TLRPC.TL_channelParticipantsRecent());
        g71Var2.f37007e.add(new sz0(this, 15));
        this.f37244c0 = g71Var2;
        g71 g71Var3 = new g71(this.currentAccount, chat.f20845id, new TLRPC.TL_channelParticipantsSearch());
        g71Var3.f37007e.add(new sz0(this, 15));
        this.f37245d0 = g71Var3;
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new p21(this, 3));
        c71 c71Var = new c71(this);
        c71Var.f5910m = false;
        c71Var.C = false;
        c71Var.o(org.telegram.ui.Components.pr.h);
        c71Var.n(350L);
        this.d.setItemAnimator(c71Var);
        this.d.addOnLayoutChangeListener(new d71(this));
        this.d.j(new e71(this));
        this.containerView.addView(new f71(this, getContext()), k7.c6.e(-1, 68, 87));
        qh.d dVar = new qh.d(getContext(), g6Var, true);
        dVar.setRoundRadius(24);
        this.f37246e0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21915r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, k7.c6.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new v31(this, 4));
        org.telegram.ui.Components.w51 w51Var = this.f37247f0;
        if (w51Var != null) {
            w51Var.N(false);
        }
        g71Var.b();
        g71Var2.b();
    }

    public static void P(h71 h71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            h71Var.U = MessagesController.getInstance(h71Var.currentAccount).getChat(Long.valueOf(j10));
            h71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(h71 h71Var, ArrayList arrayList) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        g71 g71Var = h71Var.f37245d0;
        g71 g71Var2 = h71Var.f37244c0;
        TLRPC.User user = h71Var.V;
        g71 g71Var3 = h71Var.f37243b0;
        if (g71Var3 != null) {
            ArrayList arrayList2 = g71Var3.d;
            if (g71Var2 != null) {
                ArrayList arrayList3 = g71Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(h71Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.h51.D(3, AndroidUtilities.dp(64.0f)));
                if (g71Var != null && !TextUtils.isEmpty(g71Var.f37006c.f20844q)) {
                    ArrayList arrayList4 = g71Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.h51 v = org.telegram.ui.Components.h51.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(h71Var.X)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            v.K(z15);
                            arrayList.add(v);
                        }
                    }
                    if (g71Var.f37008f) {
                        arrayList.add(org.telegram.ui.Components.h51.n(29));
                        arrayList.add(org.telegram.ui.Components.h51.n(29));
                        arrayList.add(org.telegram.ui.Components.h51.n(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.h51.k(h71Var.f37242a0));
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
                                if (ChatObject.isChannelAndNotMegaGroup(h71Var.U)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.h51 v10 = org.telegram.ui.Components.h51.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(h71Var.X)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                v10.K(z14);
                                arrayList.add(v10);
                                z4 = false;
                            }
                        }
                    }
                }
                z4 = true;
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList2.get(i16);
                    i16++;
                    TLObject tLObject2 = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                        if (z4) {
                            if (ChatObject.isChannelAndNotMegaGroup(h71Var.U)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i12)));
                            z4 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.h51 v11 = org.telegram.ui.Components.h51.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(h71Var.X)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        v11.K(z13);
                        arrayList.add(v11);
                    }
                }
                if (g71Var3.f37008f) {
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(h71Var.U)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.h51 v12 = org.telegram.ui.Components.h51.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(h71Var.X)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    v12.K(z12);
                    arrayList.add(v12);
                    z10 = false;
                } else {
                    z10 = true;
                }
                int size4 = arrayList3.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    TLObject tLObject3 = (TLObject) obj4;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                        if (z10) {
                            if (ChatObject.isChannelAndNotMegaGroup(h71Var.U)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(i10)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.h51 v13 = org.telegram.ui.Components.h51.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(h71Var.X)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        v13.K(z11);
                        arrayList.add(v13);
                    }
                }
                if (!arrayList3.isEmpty() && g71Var2.f37008f) {
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                }
            }
        }
    }

    public static void R(h71 h71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
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
            if (h71Var.f37248g0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h71Var.f37248g0);
                        if (ChatObject.isChannelAndNotMegaGroup(h71Var.U)) {
                            i16 = R.string.EditAdminChannelTransfer;
                        } else {
                            i16 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i16);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        d2Var.O = string;
                        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, h71Var.U.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new vl0(17, h71Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(h71Var) {
                            public final h71 f42947b;

                            {
                                this.f42947b = h71Var;
                            }

                            @Override
                            public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                                switch (r2) {
                                    case 0:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    case 1:
                                        h71 h71Var2 = this.f42947b;
                                        h71Var2.getClass();
                                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                        if (U != null) {
                                            h71Var2.dismiss();
                                            U.presentFragment(new vg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    default:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(h71Var.currentAccount).sendRequest(new TL_account.getPassword(), new yr0(h71Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (h71Var.f37248g0 != null && !AccountInstance.getInstance(h71Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                            if (U != null) {
                                h71Var.showDialog(new fg.v0(5, h71Var.currentAccount, h71Var.f37248g0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            h71Var.dismiss();
                            U2.presentFragment(new he1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.z4.h0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(h71Var.U), ChatObject.isCommunity(h71Var.U), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h71Var.f37248g0);
                    alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(h71Var.f37248g0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(h71Var.f37248g0);
                    int i17 = org.telegram.ui.ActionBar.k6.f21768j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(h71Var.U)) {
                        b.o(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        b.o(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, k7.c6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(h71Var.f37248g0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(h71Var.f37248g0);
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
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(h71Var.f37248g0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                        linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, k7.c6.n(-2, -2));
                        linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(h71Var.f37248g0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(h71Var.f37248g0);
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i17, false), mode));
                    TextView textView3 = new TextView(h71Var.f37248g0);
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, k7.c6.n(-1, -2));
                        linearLayout3.addView(imageView2, k7.c6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, k7.c6.n(-2, -2));
                        linearLayout3.addView(textView3, k7.c6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.c2(h71Var) {
                            public final h71 f42947b;

                            {
                                this.f42947b = h71Var;
                            }

                            @Override
                            public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    case 1:
                                        h71 h71Var2 = this.f42947b;
                                        h71Var2.getClass();
                                        org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            h71Var2.dismiss();
                                            U4.presentFragment(new vg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    default:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(h71Var) {
                            public final h71 f42947b;

                            {
                                this.f42947b = h71Var;
                            }

                            @Override
                            public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    case 1:
                                        h71 h71Var2 = this.f42947b;
                                        h71Var2.getClass();
                                        org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            h71Var2.dismiss();
                                            U4.presentFragment(new vg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    default:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(h71Var.f37248g0);
                        textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2(h71Var) {
                            public final h71 f42947b;

                            {
                                this.f42947b = h71Var;
                            }

                            @Override
                            public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    case 1:
                                        h71 h71Var2 = this.f42947b;
                                        h71Var2.getClass();
                                        org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            h71Var2.dismiss();
                                            U4.presentFragment(new vg1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                    default:
                                        this.f42947b.f37246e0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            af.b bVar = h71Var.W;
            if (bVar != null) {
                bVar.run();
            }
            h71Var.dismiss();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void S(h71 h71Var) {
        org.telegram.ui.Components.sl0 sl0Var = h71Var.d;
        float f10 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i10++;
        }
        h71Var.Y.setTranslationY(f10);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f37248g0 = getContext();
        }
        if (this.f37248g0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.U)) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f37248g0, this.U.f20845id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 18));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.U)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.U;
                tL_inputChannel.channel_id = chat.f20845id;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new hg.e0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 13));
        }
    }

    public final void U(boolean z4) {
        int i10;
        int dp;
        if (ChatObject.isChannelAndNotMegaGroup(this.U)) {
            i10 = R.string.LeaveChannelAndAppoint;
        } else {
            i10 = R.string.LeaveGroupAndAppoint;
        }
        float dp2 = AndroidUtilities.dp(32.0f);
        qh.d dVar = this.f37246e0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.X), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z4, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f37243b0.a();
        this.f37244c0.a();
        this.f37245d0.a();
    }

    @Override
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, false, new d5(this, 23), this.resourcesProvider);
        this.f37247f0 = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
