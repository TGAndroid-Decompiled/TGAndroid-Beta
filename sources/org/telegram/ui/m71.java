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
public final class m71 extends org.telegram.ui.Components.cb {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final ai.o8 Z;
    public TLObject f38453a0;
    public final FrameLayout f38454b0;
    public final e71 f38455c0;
    public final g71 f38456d0;
    public final l71 f38457e0;
    public final l71 f38458f0;
    public final l71 f38459g0;
    public final ci.d f38460h0;
    public org.telegram.ui.Components.u61 f38461i0;
    public Context f38462j0;

    public m71(Context context, TLRPC.Chat chat, TLRPC.User user, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(2, context, d6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.f38453a0 = user;
        this.Z = o8Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38454b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.i6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.i6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38455c0 = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.R5));
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
        editTextBoldCursor.setOnEditorActionListener(new ka(this, 11));
        editTextBoldCursor.addTextChangedListener(new f71(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, w7.z5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.f25301e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.z5.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.f38456d0 = frameLayout3;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setImageDrawable(new org.telegram.ui.Components.kj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(w9Var, w7.z5.e(130, 130, 17));
        l71 l71Var = new l71(this.currentAccount, chat.f20037id, new TLRPC.TL_channelParticipantsAdmins());
        l71Var.f38186e.add(new hz0(this, 16));
        this.f38457e0 = l71Var;
        l71 l71Var2 = new l71(this.currentAccount, chat.f20037id, new TLRPC.TL_channelParticipantsRecent());
        l71Var2.f38186e.add(new hz0(this, 16));
        this.f38458f0 = l71Var2;
        l71 l71Var3 = new l71(this.currentAccount, chat.f20037id, new TLRPC.TL_channelParticipantsSearch());
        l71Var3.f38186e.add(new hz0(this, 16));
        this.f38459g0 = l71Var3;
        org.telegram.ui.Components.zl0 zl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new t21(this, 4));
        h71 h71Var = new h71(this);
        h71Var.f46562m = false;
        h71Var.C = false;
        h71Var.o(org.telegram.ui.Components.tr.h);
        h71Var.n(350L);
        this.d.setItemAnimator(h71Var);
        this.d.addOnLayoutChangeListener(new i71(this));
        this.d.j(new j71(this));
        this.containerView.addView(new k71(this, getContext()), w7.z5.e(-1, 68, 87));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        dVar.setRoundRadius(24);
        this.f38460h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21078r7));
        S(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.z5.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new a41(this, 4));
        org.telegram.ui.Components.u61 u61Var = this.f38461i0;
        if (u61Var != null) {
            u61Var.N(false);
        }
        l71Var.b();
        l71Var2.b();
    }

    public static void N(m71 m71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            m71Var.X = MessagesController.getInstance(m71Var.currentAccount).getChat(Long.valueOf(j3));
            m71Var.R(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void O(m71 m71Var, ArrayList arrayList) {
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
        l71 l71Var = m71Var.f38459g0;
        l71 l71Var2 = m71Var.f38458f0;
        TLRPC.User user = m71Var.Y;
        l71 l71Var3 = m71Var.f38457e0;
        if (l71Var3 != null) {
            ArrayList arrayList2 = l71Var3.d;
            if (l71Var2 != null) {
                ArrayList arrayList3 = l71Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(m71Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.g61.D(3, AndroidUtilities.dp(64.0f)));
                if (l71Var != null && !TextUtils.isEmpty(l71Var.f38185c.f20036q)) {
                    ArrayList arrayList4 = l71Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.g61 v = org.telegram.ui.Components.g61.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(m71Var.f38453a0)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            v.K(z16);
                            arrayList.add(v);
                        }
                    }
                    if (l71Var.f38187f) {
                        arrayList.add(org.telegram.ui.Components.g61.o(29));
                        arrayList.add(org.telegram.ui.Components.g61.o(29));
                        arrayList.add(org.telegram.ui.Components.g61.o(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.g61.k(m71Var.f38456d0));
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
                                if (ChatObject.isChannelAndNotMegaGroup(m71Var.X)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.g61 v9 = org.telegram.ui.Components.g61.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(m71Var.f38453a0)) {
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
                            if (ChatObject.isChannelAndNotMegaGroup(m71Var.X)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(i12)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.g61 v10 = org.telegram.ui.Components.g61.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(m71Var.f38453a0)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v10.K(z14);
                        arrayList.add(v10);
                    }
                }
                if (l71Var3.f38187f) {
                    arrayList.add(org.telegram.ui.Components.g61.o(29));
                    arrayList.add(org.telegram.ui.Components.g61.o(29));
                    arrayList.add(org.telegram.ui.Components.g61.o(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(m71Var.X)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.g61 v11 = org.telegram.ui.Components.g61.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(m71Var.f38453a0)) {
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
                            if (ChatObject.isChannelAndNotMegaGroup(m71Var.X)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(i10)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.g61 v12 = org.telegram.ui.Components.g61.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(m71Var.f38453a0)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v12.K(z12);
                        arrayList.add(v12);
                    }
                }
                if (!arrayList3.isEmpty() && l71Var2.f38187f) {
                    arrayList.add(org.telegram.ui.Components.g61.o(29));
                    arrayList.add(org.telegram.ui.Components.g61.o(29));
                    arrayList.add(org.telegram.ui.Components.g61.o(29));
                }
            }
        }
    }

    public static void P(m71 m71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
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
            if (m71Var.f38462j0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m71Var.f38462j0);
                        if (ChatObject.isChannelAndNotMegaGroup(m71Var.X)) {
                            i16 = R.string.EditAdminChannelTransfer;
                        } else {
                            i16 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i16);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                        b2Var.R = string;
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, m71Var.X.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new fs0(11, m71Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(m71Var) {
                            public final m71 f35691b;

                            {
                                this.f35691b = m71Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                                switch (r2) {
                                    case 0:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    case 1:
                                        m71 m71Var2 = this.f35691b;
                                        m71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                        if (U != null) {
                                            m71Var2.dismiss();
                                            U.presentFragment(new bh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(m71Var.currentAccount).sendRequest(new TL_account.getPassword(), new is0(m71Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (m71Var.f38462j0 != null && !AccountInstance.getInstance(m71Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                            if (U != null) {
                                m71Var.showDialog(new rg.k0(5, m71Var.currentAccount, m71Var.f38462j0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            m71Var.dismiss();
                            U2.presentFragment(new ne1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.e5.h0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(m71Var.X), ChatObject.isCommunity(m71Var.X), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m71Var.f38462j0);
                    alertDialog$Builder2.f20367a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(m71Var.f38462j0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(m71Var.f38462j0);
                    int i17 = org.telegram.ui.ActionBar.i6.f20925j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(m71Var.X)) {
                        org.telegram.messenger.ok.q(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        org.telegram.messenger.ok.q(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, w7.z5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(m71Var.f38462j0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(m71Var.f38462j0);
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
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(m71Var.f38462j0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.f0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(m71Var.f38462j0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(m71Var.f38462j0);
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i17, false), mode));
                    TextView textView3 = new TextView(m71Var.f38462j0);
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.f0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                        linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
                        linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.a2(m71Var) {
                            public final m71 f35691b;

                            {
                                this.f35691b = m71Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    case 1:
                                        m71 m71Var2 = this.f35691b;
                                        m71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            m71Var2.dismiss();
                                            U4.presentFragment(new bh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(m71Var) {
                            public final m71 f35691b;

                            {
                                this.f35691b = m71Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    case 1:
                                        m71 m71Var2 = this.f35691b;
                                        m71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            m71Var2.dismiss();
                                            U4.presentFragment(new bh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(m71Var.f38462j0);
                        textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2(m71Var) {
                            public final m71 f35691b;

                            {
                                this.f35691b = m71Var;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i172) {
                                switch (r2) {
                                    case 0:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    case 1:
                                        m71 m71Var2 = this.f35691b;
                                        m71Var2.getClass();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            m71Var2.dismiss();
                                            U4.presentFragment(new bh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                    default:
                                        this.f35691b.f38460h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            ai.o8 o8Var = m71Var.Z;
            if (o8Var != null) {
                o8Var.run();
            }
            m71Var.dismiss();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Q(m71 m71Var) {
        org.telegram.ui.Components.zl0 zl0Var = m71Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        m71Var.f38454b0.setTranslationY(f7);
    }

    public final void R(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f38462j0 = getContext();
        }
        if (this.f38462j0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f38462j0, this.X.f20037id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 17));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.X)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.X;
                tL_inputChannel.channel_id = chat.f20037id;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ci.gd(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 11));
        }
    }

    public final void S(boolean z10) {
        int i10;
        int dp;
        if (ChatObject.isChannelAndNotMegaGroup(this.X)) {
            i10 = R.string.LeaveChannelAndAppoint;
        } else {
            i10 = R.string.LeaveGroupAndAppoint;
        }
        float dp2 = AndroidUtilities.dp(32.0f);
        ci.d dVar = this.f38460h0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.f38453a0), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38457e0.a();
        this.f38458f0.a();
        this.f38459g0.a();
    }

    @Override
    public final org.telegram.ui.Components.yl0 v(org.telegram.ui.Components.zl0 zl0Var) {
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(zl0Var, getContext(), this.currentAccount, 0, false, new c5(this, 23), this.resourcesProvider);
        this.f38461i0 = u61Var;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
