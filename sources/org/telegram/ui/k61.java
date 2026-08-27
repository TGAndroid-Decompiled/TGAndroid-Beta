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

public final class k61 extends org.telegram.ui.Components.qa {
    public TLRPC.Chat T;
    public final TLRPC.User U;
    public final cg.w1 V;
    public TLObject W;
    public final FrameLayout X;
    public final c61 Y;
    public final e61 Z;

    public final j61 f39622a0;

    public final j61 f39623b0;

    public final j61 f39624c0;

    public final lh.d f39625d0;

    public org.telegram.ui.Components.b51 f39626e0;

    public Context f39627f0;

    public k61(Context context, TLRPC.Chat chat, TLRPC.User user, cg.w1 w1Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, 2, c6Var);
        this.G = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.T = chat;
        this.U = user;
        this.W = user;
        this.V = w1Var;
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
        frameLayout2.addView(imageView, h7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        c61 c61Var = new c61(context);
        this.Y = c61Var;
        c61Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.R5));
        c61Var.setHintTextColor(getThemedColor(i10));
        c61Var.setTextSize(1, 15.0f);
        c61Var.setSingleLine(true);
        c61Var.setBackground(null);
        c61Var.setCursorWidth(1.5f);
        c61Var.setGravity(112);
        c61Var.setClipToPadding(true);
        c61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        c61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        c61Var.setInputType(c61Var.getInputType() | 524288);
        c61Var.setImeOptions(33554435);
        c61Var.setTextIsSelectable(false);
        c61Var.setOnEditorActionListener(new fa(this, 11));
        c61Var.addTextChangedListener(new d61(this));
        c61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(c61Var, h7.z5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, h7.z5.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int iMax = Math.max(0, viewGroup.indexOfChild(this.f31853e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, iMax, h7.z5.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        e61 e61Var = new e61(context);
        this.Z = e61Var;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        n9Var.setImageDrawable(new org.telegram.ui.Components.oi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        e61Var.addView(n9Var, h7.z5.e(130, 130, 17));
        j61 j61Var = new j61(this.currentAccount, chat.f22380id, new TLRPC.TL_channelParticipantsAdmins());
        j61Var.f39272e.add(new ky0(this, 17));
        this.f39622a0 = j61Var;
        j61 j61Var2 = new j61(this.currentAccount, chat.f22380id, new TLRPC.TL_channelParticipantsRecent());
        j61Var2.f39272e.add(new ky0(this, 17));
        this.f39623b0 = j61Var2;
        j61 j61Var3 = new j61(this.currentAccount, chat.f22380id, new TLRPC.TL_channelParticipantsSearch());
        j61Var3.f39272e.add(new ky0(this, 17));
        this.f39624c0 = j61Var3;
        org.telegram.ui.Components.zk0 zk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new b21(this, 2));
        f61 f61Var = new f61(this);
        f61Var.f5819m = false;
        f61Var.C = false;
        f61Var.o(org.telegram.ui.Components.er.h);
        f61Var.n(350L);
        this.d.setItemAnimator(f61Var);
        this.d.addOnLayoutChangeListener(new g61(this));
        this.d.j(new h61(this));
        this.containerView.addView(new i61(this, getContext()), h7.z5.e(-1, 68, 87));
        lh.d dVar = new lh.d(getContext(), c6Var, true);
        dVar.setRoundRadius(24);
        this.f39625d0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23302r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, h7.z5.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new v21(this, 5));
        org.telegram.ui.Components.b51 b51Var = this.f39626e0;
        if (b51Var != null) {
            b51Var.N(false);
        }
        j61Var.b();
        j61Var2.b();
    }

    public static void P(k61 k61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            k61Var.T = MessagesController.getInstance(k61Var.currentAccount).getChat(Long.valueOf(j10));
            k61Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(k61 k61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        j61 j61Var = k61Var.f39624c0;
        j61 j61Var2 = k61Var.f39623b0;
        TLRPC.User user = k61Var.U;
        j61 j61Var3 = k61Var.f39622a0;
        if (j61Var3 != null) {
            ArrayList arrayList2 = j61Var3.d;
            if (j61Var2 == null) {
                return;
            }
            ArrayList arrayList3 = j61Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(k61Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.n41.D(3, AndroidUtilities.dp(64.0f)));
            if (j61Var != null && !TextUtils.isEmpty(j61Var.f39271c.f22379q)) {
                ArrayList arrayList4 = j61Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.n41 n41VarV = org.telegram.ui.Components.n41.v(tLObject);
                        n41VarV.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(k61Var.W));
                        arrayList.add(n41VarV);
                    }
                }
                if (j61Var.f39273f) {
                    arrayList.add(org.telegram.ui.Components.n41.n(29));
                    arrayList.add(org.telegram.ui.Components.n41.n(29));
                    arrayList.add(org.telegram.ui.Components.n41.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.n41.k(k61Var.Z));
                    return;
                }
                return;
            }
            if (user == null) {
                z10 = true;
                break;
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                            arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(k61Var.T) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.n41 n41VarV2 = org.telegram.ui.Components.n41.v(user);
                            n41VarV2.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(k61Var.W));
                            arrayList.add(n41VarV2);
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                break;
            }
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(k61Var.T) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.n41 n41VarV3 = org.telegram.ui.Components.n41.v(tLObject2);
                    n41VarV3.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(k61Var.W));
                    arrayList.add(n41VarV3);
                }
            }
            if (j61Var3.f39273f) {
                arrayList.add(org.telegram.ui.Components.n41.n(29));
                arrayList.add(org.telegram.ui.Components.n41.n(29));
                arrayList.add(org.telegram.ui.Components.n41.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(k61Var.T) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.n41 n41VarV4 = org.telegram.ui.Components.n41.v(user);
                n41VarV4.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(k61Var.W));
                arrayList.add(n41VarV4);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(k61Var.T) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.n41 n41VarV5 = org.telegram.ui.Components.n41.v(tLObject3);
                    n41VarV5.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(k61Var.W));
                    arrayList.add(n41VarV5);
                }
            }
            if (arrayList3.isEmpty() || !j61Var2.f39273f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.n41.n(29));
            arrayList.add(org.telegram.ui.Components.n41.n(29));
            arrayList.add(org.telegram.ui.Components.n41.n(29));
        }
    }

    public static void R(final k61 k61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                cg.w1 w1Var = k61Var.V;
                if (w1Var != null) {
                    w1Var.run();
                }
                k61Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (k61Var.f39627f0 == null) {
            return;
        }
        final int i10 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k61Var.f39627f0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(k61Var.T) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, k61Var.T.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new nl0(18, k61Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(k61Var) {

                    public final k61 f36708b;

                    {
                        this.f36708b = k61Var;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                        switch (i10) {
                            case 0:
                                this.f36708b.f39625d0.setLoading(false);
                                break;
                            case 1:
                                k61 k61Var2 = this.f36708b;
                                k61Var2.getClass();
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null) {
                                    k61Var2.dismiss();
                                    n2VarU.presentFragment(new zf1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.f36708b.f39625d0.setLoading(false);
                                break;
                            default:
                                this.f36708b.f39625d0.setLoading(false);
                                break;
                        }
                    }
                });
                alertDialog$Builder.o();
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(k61Var.currentAccount).sendRequest(new TL_account.getPassword(), new lr0(k61Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU == null) {
                    return;
                }
                org.telegram.ui.Components.y4.h0(tL_error, n2VarU, ChatObject.isChannelAndNotMegaGroup(k61Var.T), ChatObject.isCommunity(k61Var.T), tL_channels_editCreator);
                return;
            }
            if (k61Var.f39627f0 != null && !AccountInstance.getInstance(k61Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 == null) {
                    return;
                }
                k61Var.showDialog(new ag.i1(5, k61Var.currentAccount, k61Var.f39627f0, n2VarU2, null));
                return;
            }
            org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
            if (n2VarU3 == null) {
                return;
            }
            k61Var.dismiss();
            n2VarU3.presentFragment(new ld1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k61Var.f39627f0);
        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(k61Var.f39627f0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(k61Var.f39627f0);
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(k61Var.T)) {
            org.telegram.messenger.rl.n(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.rl.n(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(k61Var.f39627f0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(k61Var.f39627f0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        TextView textView2 = new TextView(k61Var.f39627f0);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
            linearLayout2.addView(imageView, h7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, h7.z5.n(-2, -2));
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(k61Var.f39627f0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(k61Var.f39627f0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(k61Var.f39627f0);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, h7.z5.n(-1, -2));
            linearLayout3.addView(imageView2, h7.z5.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, h7.z5.n(-2, -2));
            linearLayout3.addView(textView3, h7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i12 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.a2(k61Var) {

                public final k61 f36708b;

                {
                    this.f36708b = k61Var;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    switch (i12) {
                        case 0:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                        case 1:
                            k61 k61Var2 = this.f36708b;
                            k61Var2.getClass();
                            org.telegram.ui.ActionBar.n2 n2VarU4 = LaunchActivity.U();
                            if (n2VarU4 != null) {
                                k61Var2.dismiss();
                                n2VarU4.presentFragment(new zf1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                        default:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                    }
                }
            });
            final int i13 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(k61Var) {

                public final k61 f36708b;

                {
                    this.f36708b = k61Var;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                    switch (i13) {
                        case 0:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                        case 1:
                            k61 k61Var2 = this.f36708b;
                            k61Var2.getClass();
                            org.telegram.ui.ActionBar.n2 n2VarU4 = LaunchActivity.U();
                            if (n2VarU4 != null) {
                                k61Var2.dismiss();
                                n2VarU4.presentFragment(new zf1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                        default:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(k61Var.f39627f0);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i14 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2(k61Var) {

                public final k61 f36708b;

                {
                    this.f36708b = k61Var;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                    switch (i14) {
                        case 0:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                        case 1:
                            k61 k61Var2 = this.f36708b;
                            k61Var2.getClass();
                            org.telegram.ui.ActionBar.n2 n2VarU4 = LaunchActivity.U();
                            if (n2VarU4 != null) {
                                k61Var2.dismiss();
                                n2VarU4.presentFragment(new zf1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                        default:
                            this.f36708b.f39625d0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void S(k61 k61Var) {
        org.telegram.ui.Components.zk0 zk0Var = k61Var.d;
        float y10 = -AndroidUtilities.dp(64.0f);
        for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
            View childAt = zk0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                y10 = childAt.getY();
                break;
            }
        }
        k61Var.X.setTranslationY(y10);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.f39627f0 = getContext();
        }
        if (this.f39627f0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.T)) {
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f39627f0, this.T.f22380id, n2VarU, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
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
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new cg.e0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 14));
    }

    public final void U(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.T) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float fDp = AndroidUtilities.dp(32.0f);
        lh.d dVar = this.f39625d0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.W), dVar.getTextPaint(), Math.max(fDp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39622a0.a();
        this.f39623b0.a();
        this.f39624c0.a();
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(zk0Var, getContext(), this.currentAccount, 0, false, new b5(this, 23), this.resourcesProvider);
        this.f39626e0 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
