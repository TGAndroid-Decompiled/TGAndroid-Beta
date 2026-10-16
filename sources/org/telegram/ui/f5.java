package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f5 implements Utilities.Callback2 {
    public final int f35461a;
    public final Object f35462b;

    public f5(Object obj, int i10) {
        this.f35461a = i10;
        this.f35462b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ta1 ta1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        mt mtVar;
        float f7;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r11 = false;
        boolean z11 = false;
        switch (this.f35461a) {
            case 0:
                g5 g5Var = (g5) this.f35462b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.f36068w = false;
                gh.b bVar = g5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, g5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                n9 n9Var = (n9) this.f35462b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var = (org.telegram.ui.Components.a71) obj2;
                boolean isEmpty = n9Var.K.isEmpty();
                ArrayList arrayList2 = n9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.m61 c10 = org.telegram.ui.Components.m61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f26951q = true;
                    arrayList.add(c10);
                    if (!n9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.m61 c11 = org.telegram.ui.Components.m61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f26951q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.m61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = n9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = n9Var.getMessagesController().getChat(l4)) != null) {
                            q8 q8Var = new q8(n9Var, 0);
                            int i22 = l9.f37660a;
                            org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(l9.class);
                            J.G = chat;
                            J.D = q8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.m61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        j9 j9Var = (j9) obj4;
                        bi.u1 u1Var = new bi.u1(27, n9Var, j9Var);
                        int i23 = h9.f36449a;
                        org.telegram.ui.Components.m61 J2 = org.telegram.ui.Components.m61.J(h9.class);
                        J2.G = j9Var;
                        J2.D = u1Var;
                        J2.K(n9Var.l0(j9Var.f36990c));
                        arrayList.add(J2);
                    }
                    if (!n9Var.J) {
                        arrayList.add(org.telegram.ui.Components.m61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.m61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.m61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                qe qeVar = (qe) this.f35462b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var2 = (org.telegram.ui.Components.a71) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(qeVar.f39141y0).getChat(Long.valueOf(-qeVar.f39142z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(qeVar.f39141y0).getChatFull(-qeVar.f39142z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (qeVar.f39122f1) {
                    arrayList4.add(org.telegram.ui.Components.m61.g(qeVar.C0));
                    ta1 ta1Var2 = qeVar.f39130o1;
                    if (ta1Var2 != null && !ta1Var2.f40057l) {
                        arrayList4.add(org.telegram.ui.Components.m61.h(5, i10, ta1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.m61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ta1 ta1Var3 = qeVar.f39131p1;
                    if (ta1Var3 != null && !ta1Var3.f40057l) {
                        arrayList4.add(org.telegram.ui.Components.m61.h(2, i10, ta1Var3));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-2, charSequence));
                    }
                }
                if (qeVar.f39123g1 && (ta1Var = qeVar.f39132q1) != null && !ta1Var.f40057l) {
                    arrayList4.add(org.telegram.ui.Components.m61.h(2, i10, ta1Var));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-3, null));
                }
                if (qeVar.f39133r1) {
                    arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.m61.u(qeVar.f39134s1));
                    arrayList4.add(org.telegram.ui.Components.m61.u(qeVar.f39135t1));
                    arrayList4.add(org.telegram.ui.Components.m61.u(qeVar.f39136u1));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-4, qeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (qeVar.f39122f1) {
                        arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.m61.k(qeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-5, qeVar.D0));
                        int i24 = MessagesController.getInstance(qeVar.f39141y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (qeVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(0, new np0(i11, context, null, false));
                            brVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.m61 i25 = org.telegram.ui.Components.m61.i(1, string);
                        if (qeVar.B0 >= i24 && qeVar.f39128m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.m61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (qeVar.f39123g1) {
                        arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.m61.j(3, qeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-6, qeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(qeVar.f39141y0).getChat(Long.valueOf(-qeVar.f39142z0))) && MessagesController.getInstance(qeVar.f39141y0).starrefConnectAllowed) {
                    arrayList4.add(fi.h.a(4, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, qeVar.f39140x0), R.drawable.filled_earn_stars, zo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-7, null));
                }
                if (qeVar.f39121e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.m61.p(qeVar.f39121e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.m61.A(-10, null));
                    return;
                }
            case 3:
                ke keVar = (ke) this.f35462b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var3 = (org.telegram.ui.Components.a71) obj2;
                me meVar = keVar.f37358f;
                int i26 = keVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = meVar.f37976n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = zh.i7.f50679a;
                        org.telegram.ui.Components.m61 J3 = org.telegram.ui.Components.m61.J(zh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f26951q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(meVar.f37977r)) {
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = meVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = zh.i7.f50679a;
                        org.telegram.ui.Components.m61 J4 = org.telegram.ui.Components.m61.J(zh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f26951q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(meVar.f37975f)) {
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                zo zoVar = (zo) this.f35462b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    zoVar.getClass();
                    org.telegram.ui.Components.zc.a0(zoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(zoVar.f42377k0);
                AndroidUtilities.removeFromParent(zoVar.f42374h0);
                AndroidUtilities.removeFromParent(zoVar.f42376j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new uq((yr) this.f35462b, 1), 1000L);
                return;
            case 6:
                ((qf.b) this.f35462b).b0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ws wsVar = (ws) this.f35462b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var4 = (org.telegram.ui.Components.a71) obj2;
                TLRPC.User user = wsVar.getMessagesController().getUser(Long.valueOf(wsVar.H));
                arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.V));
                arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.f41347b));
                arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.f41348c));
                if (TextUtils.isEmpty(wsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (wsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.m61.B(null));
                }
                if (wsVar.I && wsVar.K) {
                    org.telegram.ui.Components.m61 i29 = org.telegram.ui.Components.m61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(wsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.m61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.d));
                i2.d.B(R.string.AddNotesInfo, arrayList8);
                if (!wsVar.I) {
                    TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.f41354x));
                    arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.f41355y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.m61.k(wsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.m61.B(null));
                    org.telegram.ui.Components.m61 e = org.telegram.ui.Components.m61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f26952r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.m61.B(charSequence2));
                if (wsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ns(wsVar, user, 0));
                    wsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new os(wsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                xt.a((xt) this.f35462b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                tt ttVar = (tt) this.f35462b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                xt xtVar = ttVar.f40207a;
                vt vtVar = xtVar.f41647l;
                if (vtVar != null) {
                    String join = TextUtils.join("", xtVar.f41650o);
                    if (callback != null) {
                        mtVar = new mt(1, ttVar, callback);
                    } else {
                        mtVar = null;
                    }
                    vtVar.f(charSequence3, join, mtVar);
                    if (callback == null) {
                        xtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.a71 a71Var5 = (org.telegram.ui.Components.a71) obj2;
                hu.S((hu) this.f35462b, (ArrayList) obj);
                return;
            case 11:
                yy yyVar = (yy) this.f35462b;
                Long l10 = (Long) obj2;
                yyVar.P1 = (Long) obj;
                yyVar.S4();
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f35462b).run();
                return;
            case 13:
                final qz qzVar = (qz) this.f35462b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var6 = (org.telegram.ui.Components.a71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(2);
                m61Var.f26946l = string2;
                m61Var.f26945k = i30;
                arrayList9.add(m61Var);
                org.telegram.ui.Components.m61 i31 = org.telegram.ui.Components.m61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(qzVar.f39243c);
                arrayList9.add(i31);
                if (qzVar.f39243c) {
                    arrayList9.add(org.telegram.ui.Components.m61.B(null));
                    arrayList9.add(org.telegram.ui.Components.m61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    qz qzVar2 = qzVar;
                                    qzVar2.d = true;
                                    ((pz) view.getParent()).a(true, true);
                                    bi.f0 f0Var = qzVar2.f39244f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(qzVar2.f39243c), Boolean.valueOf(qzVar2.d));
                                    }
                                    qzVar2.U();
                                    return;
                                default:
                                    qz qzVar3 = qzVar;
                                    qzVar3.d = false;
                                    ((pz) view.getParent()).a(false, true);
                                    bi.f0 f0Var2 = qzVar3.f39244f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(qzVar3.f39243c), Boolean.valueOf(qzVar3.d));
                                    }
                                    qzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    qz qzVar2 = qzVar;
                                    qzVar2.d = true;
                                    ((pz) view.getParent()).a(true, true);
                                    bi.f0 f0Var = qzVar2.f39244f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(qzVar2.f39243c), Boolean.valueOf(qzVar2.d));
                                    }
                                    qzVar2.U();
                                    return;
                                default:
                                    qz qzVar3 = qzVar;
                                    qzVar3.d = false;
                                    ((pz) view.getParent()).a(false, true);
                                    bi.f0 f0Var2 = qzVar3.f39244f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(qzVar3.f39243c), Boolean.valueOf(qzVar3.d));
                                    }
                                    qzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = oz.f38769a;
                    org.telegram.ui.Components.m61 J5 = org.telegram.ui.Components.m61.J(oz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(qzVar.d);
                    arrayList9.add(J5);
                    i2.d.B(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                ic0 ic0Var = (ic0) this.f35462b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ic0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ic0Var.f36776b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.g0.q(R.string.AIEditorStyleNotFound, ic0.d(), R.raw.error, 36);
                        return;
                    } else {
                        ic0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                rw0 rw0Var = (rw0) this.f35462b;
                gh.b bVar2 = rw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                rw0Var.f39611s = (Bitmap) obj;
                Paint paint = new Paint(1);
                rw0Var.f39612w = paint;
                Bitmap bitmap2 = rw0Var.f39611s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                rw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                rw0Var.f39612w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                rw0Var.f39613x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, rw0Var.f39602c);
                rw0Var.G.d();
                return;
            case 16:
                zw0 zw0Var = (zw0) this.f35462b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var7 = (org.telegram.ui.Components.a71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.m61 m61Var2 = new org.telegram.ui.Components.m61(2);
                m61Var2.f26946l = string3;
                m61Var2.f26945k = i33;
                arrayList10.add(m61Var2);
                org.telegram.ui.Components.m61 i34 = org.telegram.ui.Components.m61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(zw0Var.f42432r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.m61.A(2, null));
                if (zw0Var.f42432r) {
                    i2.d.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) zw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    ps0 ps0Var = new ps0(2);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f22485c = a2;
                    y7Var.d = 20;
                    y7Var.e = ps0Var;
                    zw0Var.f42428b.d((int) Utilities.clamp(zw0Var.f42433s, 10000L, 0L), y7Var, new v3(zw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.m61.j(3, zw0Var.f42428b));
                    if (zw0Var.f42433s > 0) {
                        str = zw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.m61.A(4, str));
                    TLRPC.Chat chat3 = zw0Var.getMessagesController().getChat(Long.valueOf(zw0Var.f42427a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        zw0Var.f42429c.setLink(zw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.d.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.m61.j(5, zw0Var.f42429c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35462b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f35462b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f32341p6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                h41 h41Var = (h41) this.f35462b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var8 = (org.telegram.ui.Components.a71) obj2;
                org.telegram.ui.Components.i71 i71Var = h41Var.f36392f;
                i41 i41Var = h41Var.v;
                ArrayList arrayList12 = i41Var.h;
                x5 x5Var = h41Var.h;
                if (x5Var.getMeasuredHeight() <= 0) {
                    x5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.m61 C = org.telegram.ui.Components.m61.C(x5Var.getMeasuredHeight());
                C.d = -1;
                C.f26953s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((x5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = h41Var.f36390b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || h41Var.f36391c != null || h41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || h41Var.f36391c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(h41Var.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 0, 0, false, false, i41.w(i41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = h41Var.f36390b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = h41Var.f36391c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
                        org.telegram.ui.Components.m61 k10 = org.telegram.ui.Components.m61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (h41Var.f36390b != null) {
                        for (int i35 = 0; i35 < h41Var.f36390b.options.size(); i35++) {
                            org.telegram.ui.Components.m61 m61Var3 = new org.telegram.ui.Components.m61(30);
                            m61Var3.f26946l = h41Var.f36390b.options.get(i35).text;
                            m61Var3.f26945k = R.drawable.msg_arrowright;
                            m61Var3.d = i35;
                            arrayList11.add(m61Var3);
                            measuredHeight += 50;
                        }
                    } else if (h41Var.f36391c != null) {
                        for (int i36 = 0; i36 < h41Var.f36391c.options.size(); i36++) {
                            org.telegram.ui.Components.m61 m61Var4 = new org.telegram.ui.Components.m61(30);
                            m61Var4.f26946l = h41Var.f36391c.options.get(i36).text;
                            m61Var4.f26945k = R.drawable.msg_arrowright;
                            m61Var4.d = i36;
                            arrayList11.add(m61Var4);
                            measuredHeight += 50;
                        }
                    } else if (h41Var.d != null) {
                        if (h41Var.f36393n == null) {
                            g41 g41Var = new g41(h41Var, h41Var.getContext(), i41.x(i41Var));
                            h41Var.f36393n = g41Var;
                            g41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = h41Var.f36393n.f21083b;
                        if (h41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.m61 k11 = org.telegram.ui.Components.m61.k(h41Var.f36393n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = i41Var.f36722r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i41.y(i41Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        i2.d.B(i13, arrayList11);
                        if (h41Var.f36394r == null) {
                            di.d dVar = new di.d(h41Var.getContext(), i41.z(i41Var), true);
                            h41Var.f36395s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(h41Var.getContext());
                            h41Var.f36394r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, i41.B(i41Var)));
                            h41Var.f36394r.addView(h41Var.f36395s, w7.z5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(h41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, i41.C(i41Var)));
                            h41Var.f36394r.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        di.d dVar2 = h41Var.f36395s;
                        if (!h41Var.d.optional && TextUtils.isEmpty(h41Var.f36393n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        h41Var.f36395s.setOnClickListener(new t60(h41Var, 27));
                        org.telegram.ui.Components.m61 k12 = org.telegram.ui.Components.m61.k(h41Var.f36394r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.m61) i2.d.h(1, arrayList11)).f26944j = true;
                    if (i41Var.d && h41Var.f36389a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(h41Var.getContext());
                        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7)), org.telegram.ui.ActionBar.g6.V0(h41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19563b7, i41.D(i41Var))), 0, 0);
                        crVar.f23883w = true;
                        frameLayout2.setBackground(crVar);
                        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(h41Var.getContext(), null);
                        da0Var.setTextSize(1, 14.0f);
                        da0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), i41.E(i41Var)));
                        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, i41.G(i41Var)));
                        da0Var.setGravity(17);
                        frameLayout2.addView(da0Var, w7.z5.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.m61 k13 = org.telegram.ui.Components.m61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (i71Var != null) {
                    if (i41.H(i41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        i71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    i71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.a71 a71Var9 = (org.telegram.ui.Components.a71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.m61.k(((n41) this.f35462b).X));
                return;
            case 21:
                org.telegram.ui.Components.a71 a71Var10 = (org.telegram.ui.Components.a71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.m61.k(((b51) this.f35462b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f35462b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.a71 a71Var11 = (org.telegram.ui.Components.a71) obj2;
                b81.R((b81) this.f35462b, (ArrayList) obj);
                return;
            case 24:
                a81 a81Var = (a81) this.f35462b;
                ArrayList arrayList13 = a81Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = a81Var.f33783a;
                ArrayList arrayList14 = a81Var.d;
                if (tL_error5 != null) {
                    if (a81Var.f33788r) {
                        arrayList14.clear();
                        a81Var.f33788r = false;
                    }
                    a81Var.h = true;
                    a81Var.f33786f = false;
                    int size5 = arrayList13.size();
                    while (i17 < size5) {
                        Object obj7 = arrayList13.get(i17);
                        i17++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i37).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i37).putChats(channels_channelparticipants.chats, false);
                if (a81Var.f33788r) {
                    arrayList14.clear();
                    a81Var.f33788r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i38 = 0;
                while (i38 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i38);
                    i38++;
                    TLObject userOrChat = MessagesController.getInstance(i37).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    a81Var.h = true;
                }
                a81Var.f33786f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                e81 e81Var = (e81) this.f35462b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var12 = (org.telegram.ui.Components.a71) obj2;
                int i39 = e81Var.f35220b0;
                bi.o8 o8Var = e81Var.Z;
                if (o8Var != null) {
                    arrayList16.add(org.telegram.ui.Components.m61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = o8Var.f3433i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ob1.f38600b;
                        org.telegram.ui.Components.m61 J6 = org.telegram.ui.Components.m61.J(ob1.class);
                        J6.f26955u = 1;
                        J6.f26959z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f19151id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f26941f = true;
                        J6.v = i39;
                        J6.K(e81Var.f35219a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f26955u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (o8Var.k() || !o8Var.f3442r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.m61 o10 = org.telegram.ui.Components.m61.o(i16, 34);
                                o10.f26955u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.m61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.a71 a71Var13 = (org.telegram.ui.Components.a71) obj2;
                o91.b0((o91) this.f35462b, (ArrayList) obj);
                return;
            case 27:
                z91 z91Var = (z91) this.f35462b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var14 = (org.telegram.ui.Components.a71) obj2;
                LinearLayout linearLayout = z91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.m61.k(linearLayout));
                }
                LinearLayout linearLayout2 = z91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.m61.k(linearLayout2));
                    return;
                }
                return;
            default:
                re1 re1Var = (re1) this.f35462b;
                gh.b bVar4 = re1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                re1Var.f39497r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                re1Var.v = paint2;
                Bitmap bitmap5 = re1Var.f39497r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                re1Var.f39498s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                re1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                re1Var.f39499w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, re1Var.f39489b);
                re1Var.F.d();
                return;
        }
    }
}
