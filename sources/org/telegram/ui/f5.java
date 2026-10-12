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
    public final int f35739a;
    public final Object f35740b;

    public f5(Object obj, int i10) {
        this.f35739a = i10;
        this.f35740b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        boolean z10;
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
        boolean z11;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        switch (this.f35739a) {
            case 0:
                g5 g5Var = (g5) this.f35740b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.f36311w = false;
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
                n9 n9Var = (n9) this.f35740b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var = (org.telegram.ui.Components.z61) obj2;
                boolean isEmpty = n9Var.K.isEmpty();
                ArrayList arrayList2 = n9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l61 c10 = org.telegram.ui.Components.l61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f26959q = true;
                    arrayList.add(c10);
                    if (!n9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.l61 c11 = org.telegram.ui.Components.l61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f26959q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.l61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = n9Var.K;
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList3.get(i16);
                        i16++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = n9Var.getMessagesController().getChat(l4)) != null) {
                            q8 q8Var = new q8(n9Var, 0);
                            int i17 = l9.f37894a;
                            org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(l9.class);
                            J.G = chat;
                            J.D = q8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.l61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList2.get(i18);
                        i18++;
                        j9 j9Var = (j9) obj4;
                        bi.u1 u1Var = new bi.u1(27, n9Var, j9Var);
                        int i19 = h9.f36659a;
                        org.telegram.ui.Components.l61 J2 = org.telegram.ui.Components.l61.J(h9.class);
                        J2.G = j9Var;
                        J2.D = u1Var;
                        J2.K(n9Var.l0(j9Var.f37320c));
                        arrayList.add(J2);
                    }
                    if (!n9Var.J) {
                        arrayList.add(org.telegram.ui.Components.l61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.l61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.l61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                qe qeVar = (qe) this.f35740b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var2 = (org.telegram.ui.Components.z61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(qeVar.f39419y0).getChat(Long.valueOf(-qeVar.f39420z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(qeVar.f39419y0).getChatFull(-qeVar.f39420z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (qeVar.f39400f1) {
                    arrayList4.add(org.telegram.ui.Components.l61.g(qeVar.C0));
                    ta1 ta1Var2 = qeVar.f39408o1;
                    if (ta1Var2 != null && !ta1Var2.f40342l) {
                        arrayList4.add(org.telegram.ui.Components.l61.h(5, i10, ta1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.l61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ta1 ta1Var3 = qeVar.f39409p1;
                    if (ta1Var3 != null && !ta1Var3.f40342l) {
                        arrayList4.add(org.telegram.ui.Components.l61.h(2, i10, ta1Var3));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-2, charSequence));
                    }
                }
                if (qeVar.f39401g1 && (ta1Var = qeVar.f39410q1) != null && !ta1Var.f40342l) {
                    arrayList4.add(org.telegram.ui.Components.l61.h(2, i10, ta1Var));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-3, null));
                }
                if (qeVar.f39411r1) {
                    arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.l61.u(qeVar.f39412s1));
                    arrayList4.add(org.telegram.ui.Components.l61.u(qeVar.f39413t1));
                    arrayList4.add(org.telegram.ui.Components.l61.u(qeVar.f39414u1));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-4, qeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (qeVar.f39400f1) {
                        arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.l61.k(qeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-5, qeVar.D0));
                        int i20 = MessagesController.getInstance(qeVar.f39419y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (qeVar.B0 < i20) {
                            i11 = i20;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(0, new pp0(i11, context, null, false));
                            brVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l61 i21 = org.telegram.ui.Components.l61.i(1, string);
                        if (qeVar.B0 >= i20 && qeVar.f39406m1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i21.K(z10);
                        arrayList4.add(i21);
                        arrayList4.add(org.telegram.ui.Components.l61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (qeVar.f39401g1) {
                        arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.l61.j(3, qeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-6, qeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(qeVar.f39419y0).getChat(Long.valueOf(-qeVar.f39420z0))) && MessagesController.getInstance(qeVar.f39419y0).starrefConnectAllowed) {
                    arrayList4.add(fi.h.a(4, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, qeVar.f39418x0), R.drawable.filled_earn_stars, zo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-7, null));
                }
                if (qeVar.f39399e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.l61.p(qeVar.f39399e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.l61.A(-10, null));
                    return;
                }
            case 3:
                ke keVar = (ke) this.f35740b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var3 = (org.telegram.ui.Components.z61) obj2;
                me meVar = keVar.f37632f;
                int i22 = keVar.d;
                if (i22 == 0) {
                    ArrayList arrayList6 = meVar.f38231n;
                    int size3 = arrayList6.size();
                    while (i15 < size3) {
                        Object obj5 = arrayList6.get(i15);
                        i15++;
                        int i23 = zh.i7.f50678a;
                        org.telegram.ui.Components.l61 J3 = org.telegram.ui.Components.l61.J(zh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f26959q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(meVar.f38232r)) {
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i22 == 1) {
                    ArrayList arrayList7 = meVar.h;
                    int size4 = arrayList7.size();
                    while (i15 < size4) {
                        Object obj6 = arrayList7.get(i15);
                        i15++;
                        int i24 = zh.i7.f50678a;
                        org.telegram.ui.Components.l61 J4 = org.telegram.ui.Components.l61.J(zh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f26959q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(meVar.f38230f)) {
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                zo zoVar = (zo) this.f35740b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    zoVar.getClass();
                    org.telegram.ui.Components.zc.a0(zoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(zoVar.f42668k0);
                AndroidUtilities.removeFromParent(zoVar.f42665h0);
                AndroidUtilities.removeFromParent(zoVar.f42667j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new uq((yr) this.f35740b, 1), 1000L);
                return;
            case 6:
                ((qf.b) this.f35740b).Z(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ws wsVar = (ws) this.f35740b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var4 = (org.telegram.ui.Components.z61) obj2;
                TLRPC.User user = wsVar.getMessagesController().getUser(Long.valueOf(wsVar.H));
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.V));
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.f41641b));
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.f41642c));
                if (TextUtils.isEmpty(wsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (wsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.l61.B(null));
                }
                if (wsVar.I && wsVar.K) {
                    org.telegram.ui.Components.l61 i25 = org.telegram.ui.Components.l61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i25.K(wsVar.X);
                    arrayList8.add(i25);
                    arrayList8.add(org.telegram.ui.Components.l61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.d));
                i2.d.y(R.string.AddNotesInfo, arrayList8);
                if (!wsVar.I) {
                    TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.f41648x));
                    arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.f41649y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.l61.B(null));
                    org.telegram.ui.Components.l61 e = org.telegram.ui.Components.l61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f26960r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.l61.B(charSequence2));
                if (wsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ns(wsVar, user, 0));
                    wsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new os(wsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                xt.a((xt) this.f35740b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                tt ttVar = (tt) this.f35740b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                xt xtVar = ttVar.f40483a;
                vt vtVar = xtVar.f41943l;
                if (vtVar != null) {
                    String join = TextUtils.join("", xtVar.f41946o);
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
                org.telegram.ui.Components.z61 z61Var5 = (org.telegram.ui.Components.z61) obj2;
                hu.S((hu) this.f35740b, (ArrayList) obj);
                return;
            case 11:
                yy yyVar = (yy) this.f35740b;
                Long l10 = (Long) obj2;
                yyVar.P1 = (Long) obj;
                yyVar.R4();
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f35740b).run();
                return;
            case 13:
                final qz qzVar = (qz) this.f35740b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var6 = (org.telegram.ui.Components.z61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i26 = R.raw.topics_top;
                org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(2);
                l61Var.f26954l = string2;
                l61Var.f26953k = i26;
                arrayList9.add(l61Var);
                org.telegram.ui.Components.l61 i27 = org.telegram.ui.Components.l61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i27.K(qzVar.f39560c);
                arrayList9.add(i27);
                if (qzVar.f39560c) {
                    arrayList9.add(org.telegram.ui.Components.l61.B(null));
                    arrayList9.add(org.telegram.ui.Components.l61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    qz qzVar2 = qzVar;
                                    qzVar2.d = true;
                                    ((pz) view.getParent()).a(true, true);
                                    bi.f0 f0Var = qzVar2.f39561f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(qzVar2.f39560c), Boolean.valueOf(qzVar2.d));
                                    }
                                    qzVar2.U();
                                    return;
                                default:
                                    qz qzVar3 = qzVar;
                                    qzVar3.d = false;
                                    ((pz) view.getParent()).a(false, true);
                                    bi.f0 f0Var2 = qzVar3.f39561f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(qzVar3.f39560c), Boolean.valueOf(qzVar3.d));
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
                                    bi.f0 f0Var = qzVar2.f39561f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(qzVar2.f39560c), Boolean.valueOf(qzVar2.d));
                                    }
                                    qzVar2.U();
                                    return;
                                default:
                                    qz qzVar3 = qzVar;
                                    qzVar3.d = false;
                                    ((pz) view.getParent()).a(false, true);
                                    bi.f0 f0Var2 = qzVar3.f39561f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(qzVar3.f39560c), Boolean.valueOf(qzVar3.d));
                                    }
                                    qzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i28 = oz.f39064a;
                    org.telegram.ui.Components.l61 J5 = org.telegram.ui.Components.l61.J(oz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(qzVar.d);
                    arrayList9.add(J5);
                    i2.d.y(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                jc0 jc0Var = (jc0) this.f35740b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                jc0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(jc0Var.f37344b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.q.r(R.string.AIEditorStyleNotFound, jc0.d(), R.raw.error, 36);
                        return;
                    } else {
                        jc0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                sw0 sw0Var = (sw0) this.f35740b;
                gh.b bVar2 = sw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                sw0Var.f40241s = (Bitmap) obj;
                Paint paint = new Paint(1);
                sw0Var.f40242w = paint;
                Bitmap bitmap2 = sw0Var.f40241s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                sw0Var.v = bitmapShader;
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
                sw0Var.f40242w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                sw0Var.f40243x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, sw0Var.f40232c);
                sw0Var.G.d();
                return;
            case 16:
                zw0 zw0Var = (zw0) this.f35740b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var7 = (org.telegram.ui.Components.z61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i29 = R.raw.bubble;
                org.telegram.ui.Components.l61 l61Var2 = new org.telegram.ui.Components.l61(2);
                l61Var2.f26954l = string3;
                l61Var2.f26953k = i29;
                arrayList10.add(l61Var2);
                org.telegram.ui.Components.l61 i30 = org.telegram.ui.Components.l61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i30.K(zw0Var.f42728r);
                arrayList10.add(i30);
                arrayList10.add(org.telegram.ui.Components.l61.A(2, null));
                if (zw0Var.f42728r) {
                    i2.d.o(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) zw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    ul0 ul0Var = new ul0(4);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f22787c = a2;
                    y7Var.d = 20;
                    y7Var.e = ul0Var;
                    zw0Var.f42724b.d((int) Utilities.clamp(zw0Var.f42729s, 10000L, 0L), y7Var, new v3(zw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.l61.j(3, zw0Var.f42724b));
                    if (zw0Var.f42729s > 0) {
                        str = zw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.l61.A(4, str));
                    TLRPC.Chat chat3 = zw0Var.getMessagesController().getChat(Long.valueOf(zw0Var.f42723a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        zw0Var.f42725c.setLink(zw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.d.o(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.l61.j(5, zw0Var.f42725c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35740b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f35740b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f32639p6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                h41 h41Var = (h41) this.f35740b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var8 = (org.telegram.ui.Components.z61) obj2;
                org.telegram.ui.Components.h71 h71Var = h41Var.f36602f;
                i41 i41Var = h41Var.v;
                ArrayList arrayList12 = i41Var.h;
                x5 x5Var = h41Var.h;
                if (x5Var.getMeasuredHeight() <= 0) {
                    x5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.l61 C = org.telegram.ui.Components.l61.C(x5Var.getMeasuredHeight());
                C.d = -1;
                C.f26961s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((x5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = h41Var.f36600b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || h41Var.f36601c != null || h41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || h41Var.f36601c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(h41Var.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 0, 0, false, false, i41.w(i41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = h41Var.f36600b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = h41Var.f36601c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5));
                        org.telegram.ui.Components.l61 k10 = org.telegram.ui.Components.l61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (h41Var.f36600b != null) {
                        for (int i31 = 0; i31 < h41Var.f36600b.options.size(); i31++) {
                            org.telegram.ui.Components.l61 l61Var3 = new org.telegram.ui.Components.l61(30);
                            l61Var3.f26954l = h41Var.f36600b.options.get(i31).text;
                            l61Var3.f26953k = R.drawable.msg_arrowright;
                            l61Var3.d = i31;
                            arrayList11.add(l61Var3);
                            measuredHeight += 50;
                        }
                    } else if (h41Var.f36601c != null) {
                        for (int i32 = 0; i32 < h41Var.f36601c.options.size(); i32++) {
                            org.telegram.ui.Components.l61 l61Var4 = new org.telegram.ui.Components.l61(30);
                            l61Var4.f26954l = h41Var.f36601c.options.get(i32).text;
                            l61Var4.f26953k = R.drawable.msg_arrowright;
                            l61Var4.d = i32;
                            arrayList11.add(l61Var4);
                            measuredHeight += 50;
                        }
                    } else if (h41Var.d != null) {
                        if (h41Var.f36603n == null) {
                            g41 g41Var = new g41(h41Var, h41Var.getContext(), i41.x(i41Var));
                            h41Var.f36603n = g41Var;
                            g41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = h41Var.f36603n.f21368b;
                        if (h41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.l61 k11 = org.telegram.ui.Components.l61.k(h41Var.f36603n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = i41Var.f37034r;
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
                        i2.d.y(i13, arrayList11);
                        if (h41Var.f36604r == null) {
                            di.d dVar = new di.d(h41Var.getContext(), i41.z(i41Var), true);
                            h41Var.f36605s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(h41Var.getContext());
                            h41Var.f36604r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, i41.A(i41Var)));
                            h41Var.f36604r.addView(h41Var.f36605s, w7.a6.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(h41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, i41.B(i41Var)));
                            h41Var.f36604r.addView(view, w7.a6.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        di.d dVar2 = h41Var.f36605s;
                        if (!h41Var.d.optional && TextUtils.isEmpty(h41Var.f36603n.getText())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                        h41Var.f36605s.setOnClickListener(new t60(h41Var, 27));
                        org.telegram.ui.Components.l61 k12 = org.telegram.ui.Components.l61.k(h41Var.f36604r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.l61) i2.d.g(1, arrayList11)).f26952j = true;
                    if (i41Var.d && h41Var.f36599a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(h41Var.getContext());
                        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7)), org.telegram.ui.ActionBar.g6.V0(h41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19863b7, i41.D(i41Var))), 0, 0);
                        crVar.f24198w = true;
                        frameLayout2.setBackground(crVar);
                        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(h41Var.getContext(), null);
                        da0Var.setTextSize(1, 14.0f);
                        da0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), i41.E(i41Var)));
                        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, i41.G(i41Var)));
                        da0Var.setGravity(17);
                        frameLayout2.addView(da0Var, w7.a6.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.l61 k13 = org.telegram.ui.Components.l61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (h71Var != null) {
                    if (i41.H(i41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        h71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    h71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.z61 z61Var9 = (org.telegram.ui.Components.z61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l61.k(((n41) this.f35740b).X));
                return;
            case 21:
                org.telegram.ui.Components.z61 z61Var10 = (org.telegram.ui.Components.z61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l61.k(((b51) this.f35740b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f35740b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.z61 z61Var11 = (org.telegram.ui.Components.z61) obj2;
                b81.R((b81) this.f35740b, (ArrayList) obj);
                return;
            case 24:
                a81 a81Var = (a81) this.f35740b;
                ArrayList arrayList13 = a81Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i33 = a81Var.f34080a;
                ArrayList arrayList14 = a81Var.d;
                if (tL_error5 != null) {
                    if (a81Var.f34085r) {
                        arrayList14.clear();
                        a81Var.f34085r = false;
                    }
                    a81Var.h = true;
                    a81Var.f34083f = false;
                    int size5 = arrayList13.size();
                    while (i15 < size5) {
                        Object obj7 = arrayList13.get(i15);
                        i15++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i33).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i33).putChats(channels_channelparticipants.chats, false);
                if (a81Var.f34085r) {
                    arrayList14.clear();
                    a81Var.f34085r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i34 = 0;
                while (i34 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i34);
                    i34++;
                    TLObject userOrChat = MessagesController.getInstance(i33).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    a81Var.h = true;
                }
                a81Var.f34083f = false;
                int size7 = arrayList13.size();
                while (i15 < size7) {
                    Object obj8 = arrayList13.get(i15);
                    i15++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                e81 e81Var = (e81) this.f35740b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var12 = (org.telegram.ui.Components.z61) obj2;
                int i35 = e81Var.f35482b0;
                bi.o8 o8Var = e81Var.Z;
                if (o8Var != null) {
                    arrayList16.add(org.telegram.ui.Components.l61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = o8Var.f3429i;
                    int size8 = arrayList17.size();
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < size8) {
                        Object obj9 = arrayList17.get(i37);
                        i37++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i38 = ob1.f38920b;
                        org.telegram.ui.Components.l61 J6 = org.telegram.ui.Components.l61.J(ob1.class);
                        J6.f26963u = 1;
                        J6.f26967z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f19451id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f26949f = true;
                        J6.v = i35;
                        J6.K(e81Var.f35481a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f26963u = 1;
                        arrayList16.add(J6);
                        i36--;
                        if (i36 == 0) {
                            i36 = i35;
                        }
                    }
                    if (o8Var.k() || !o8Var.f3438r) {
                        while (true) {
                            if (i36 <= 0) {
                                i14 = i35;
                            } else {
                                i14 = i36;
                            }
                            if (i15 < i14) {
                                i15++;
                                org.telegram.ui.Components.l61 o10 = org.telegram.ui.Components.l61.o(i15, 34);
                                o10.f26963u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.l61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.z61 z61Var13 = (org.telegram.ui.Components.z61) obj2;
                o91.b0((o91) this.f35740b, (ArrayList) obj);
                return;
            case 27:
                z91 z91Var = (z91) this.f35740b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var14 = (org.telegram.ui.Components.z61) obj2;
                LinearLayout linearLayout = z91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.l61.k(linearLayout));
                }
                LinearLayout linearLayout2 = z91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.l61.k(linearLayout2));
                    return;
                }
                return;
            default:
                se1 se1Var = (se1) this.f35740b;
                gh.b bVar4 = se1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                se1Var.f40118r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                se1Var.v = paint2;
                Bitmap bitmap5 = se1Var.f40118r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                se1Var.f40119s = bitmapShader2;
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
                se1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                se1Var.f40120w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, se1Var.f40110b);
                se1Var.F.d();
                return;
        }
    }
}
