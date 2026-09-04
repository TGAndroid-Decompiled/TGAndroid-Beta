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
public final class b5 implements Utilities.Callback2 {
    public final int f34632a;
    public final Object f34633b;

    public b5(Object obj, int i10) {
        this.f34632a = i10;
        this.f34633b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        na1 na1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        nf nfVar;
        float f7;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r9 = false;
        boolean z11 = false;
        switch (this.f34632a) {
            case 0:
                c5 c5Var = (c5) this.f34633b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f35002w = false;
                gh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                k9 k9Var = (k9) this.f34633b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj2;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.h51 c10 = org.telegram.ui.Components.h51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f26599q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.h51 c11 = org.telegram.ui.Components.h51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f26599q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.h51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = k9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = k9Var.getMessagesController().getChat(l4)) != null) {
                            n8 n8Var = new n8(k9Var, 0);
                            int i22 = i9.f37261a;
                            org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.h51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        g9 g9Var = (g9) obj4;
                        bi.u1 u1Var = new bi.u1(27, k9Var, g9Var);
                        int i23 = e9.f35977a;
                        org.telegram.ui.Components.h51 J2 = org.telegram.ui.Components.h51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = u1Var;
                        J2.K(k9Var.l0(g9Var.f36602c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.h51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.h51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.h51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f34633b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var2 = (org.telegram.ui.Components.v51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f38037y0).getChat(Long.valueOf(-keVar.f38038z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f38037y0).getChatFull(-keVar.f38038z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f38018f1) {
                    arrayList4.add(org.telegram.ui.Components.h51.g(keVar.C0));
                    na1 na1Var2 = keVar.f38026o1;
                    if (na1Var2 != null && !na1Var2.f38903l) {
                        arrayList4.add(org.telegram.ui.Components.h51.h(5, i10, na1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.h51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    na1 na1Var3 = keVar.f38027p1;
                    if (na1Var3 != null && !na1Var3.f38903l) {
                        arrayList4.add(org.telegram.ui.Components.h51.h(2, i10, na1Var3));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-2, charSequence));
                    }
                }
                if (keVar.f38019g1 && (na1Var = keVar.f38028q1) != null && !na1Var.f38903l) {
                    arrayList4.add(org.telegram.ui.Components.h51.h(2, i10, na1Var));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-3, null));
                }
                if (keVar.f38029r1) {
                    arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.h51.u(keVar.f38030s1));
                    arrayList4.add(org.telegram.ui.Components.h51.u(keVar.f38031t1));
                    arrayList4.add(org.telegram.ui.Components.h51.u(keVar.f38032u1));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-4, keVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f38018f1) {
                        arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.h51.k(keVar.G0));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-5, keVar.D0));
                        int i24 = MessagesController.getInstance(keVar.f38037y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(0, new kp0(i11, context, null, false));
                            nqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.h51 i25 = org.telegram.ui.Components.h51.i(1, string);
                        if (keVar.B0 >= i24 && keVar.f38024m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.h51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f38019g1) {
                        arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.h51.j(3, keVar.M0));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-6, keVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f38037y0).getChat(Long.valueOf(-keVar.f38038z0))) && MessagesController.getInstance(keVar.f38037y0).starrefConnectAllowed) {
                    arrayList4.add(fi.i.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, keVar.f38036x0), R.drawable.filled_earn_stars, xo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-7, null));
                }
                if (keVar.f38017e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.h51.p(keVar.f38017e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.h51.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f34633b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var3 = (org.telegram.ui.Components.v51) obj2;
                ge geVar = eeVar.f36009f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.f36639n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = zh.o7.f52395a;
                        org.telegram.ui.Components.h51 J3 = org.telegram.ui.Components.h51.J(zh.o7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f26599q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f36640r)) {
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = zh.o7.f52395a;
                        org.telegram.ui.Components.h51 J4 = org.telegram.ui.Components.h51.J(zh.o7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f26599q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f36638f)) {
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                xo xoVar = (xo) this.f34633b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    xoVar.getClass();
                    org.telegram.ui.Components.yc.a0(xoVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(xoVar.f42782k0);
                AndroidUtilities.removeFromParent(xoVar.f42779h0);
                AndroidUtilities.removeFromParent(xoVar.f42781j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new rq((vr) this.f34633b, 1), 1000L);
                return;
            case 6:
                ((pf.b) this.f34633b).c0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ss ssVar = (ss) this.f34633b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var4 = (org.telegram.ui.Components.v51) obj2;
                TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.V));
                arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.f40511b));
                arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.f40512c));
                if (TextUtils.isEmpty(ssVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (ssVar.K) {
                    arrayList8.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.h51.B(null));
                }
                if (ssVar.I && ssVar.K) {
                    org.telegram.ui.Components.h51 i29 = org.telegram.ui.Components.h51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(ssVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.h51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.d));
                i2.g.A(R.string.AddNotesInfo, arrayList8);
                if (!ssVar.I) {
                    TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.f40519x));
                    arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.f40520y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.h51.k(ssVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.h51.B(null));
                    org.telegram.ui.Components.h51 e7 = org.telegram.ui.Components.h51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.f26600r = true;
                    arrayList8.add(e7);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.h51.B(charSequence2));
                if (ssVar.Y) {
                    AndroidUtilities.runOnUIThread(new js(ssVar, user, 0));
                    ssVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ks(ssVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                st.a((st) this.f34633b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                ot otVar = (ot) this.f34633b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                st stVar = otVar.f39309a;
                qt qtVar = stVar.f40538l;
                if (qtVar != null) {
                    String join = TextUtils.join("", stVar.f40541o);
                    if (callback != null) {
                        nfVar = new nf(24, otVar, callback);
                    } else {
                        nfVar = null;
                    }
                    qtVar.G(charSequence3, join, nfVar);
                    if (callback == null) {
                        stVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.v51 v51Var5 = (org.telegram.ui.Components.v51) obj2;
                du.R((du) this.f34633b, (ArrayList) obj);
                return;
            case 11:
                uy uyVar = (uy) this.f34633b;
                Long l10 = (Long) obj2;
                uyVar.P1 = (Long) obj;
                uyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f34633b).run();
                return;
            case 13:
                final mz mzVar = (mz) this.f34633b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var6 = (org.telegram.ui.Components.v51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(2);
                h51Var.f26594l = string2;
                h51Var.f26593k = i30;
                arrayList9.add(h51Var);
                org.telegram.ui.Components.h51 i31 = org.telegram.ui.Components.h51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(mzVar.f38788c);
                arrayList9.add(i31);
                if (mzVar.f38788c) {
                    arrayList9.add(org.telegram.ui.Components.h51.B(null));
                    arrayList9.add(org.telegram.ui.Components.h51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    bi.f0 f0Var = mzVar2.f38790f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(mzVar2.f38788c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    bi.f0 f0Var2 = mzVar3.f38790f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(mzVar3.f38788c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    bi.f0 f0Var = mzVar2.f38790f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(mzVar2.f38788c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    bi.f0 f0Var2 = mzVar3.f38790f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(mzVar3.f38788c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = kz.f38153a;
                    org.telegram.ui.Components.h51 J5 = org.telegram.ui.Components.h51.J(kz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(mzVar.d);
                    arrayList9.add(J5);
                    i2.g.A(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                fc0 fc0Var = (fc0) this.f34633b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                fc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(fc0Var.f36368b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.w1.o(R.string.AIEditorStyleNotFound, fc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        fc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                lw0 lw0Var = (lw0) this.f34633b;
                gh.b bVar2 = lw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                lw0Var.f38504s = (Bitmap) obj;
                Paint paint = new Paint(1);
                lw0Var.f38505w = paint;
                Bitmap bitmap2 = lw0Var.f38504s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                lw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                lw0Var.f38505w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                lw0Var.f38506x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, lw0Var.f38494c);
                lw0Var.G.d();
                return;
            case 16:
                tw0 tw0Var = (tw0) this.f34633b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var7 = (org.telegram.ui.Components.v51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.h51 h51Var2 = new org.telegram.ui.Components.h51(2);
                h51Var2.f26594l = string3;
                h51Var2.f26593k = i33;
                arrayList10.add(h51Var2);
                org.telegram.ui.Components.h51 i34 = org.telegram.ui.Components.h51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(tw0Var.f40848r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.h51.A(2, null));
                if (tw0Var.f40848r) {
                    i2.g.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    sw0 sw0Var = new sw0(0);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23572c = a2;
                    y7Var.d = 20;
                    y7Var.f23573e = sw0Var;
                    tw0Var.f40843b.d((int) Utilities.clamp(tw0Var.f40849s, 10000L, 0L), y7Var, new t3(tw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.h51.j(3, tw0Var.f40843b));
                    if (tw0Var.f40849s > 0) {
                        str = tw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.h51.A(4, str));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.f40842a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.f40844c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.g.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.h51.j(5, tw0Var.f40844c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f34633b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f33848e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f34633b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f33967p6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                d41 d41Var = (d41) this.f34633b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var8 = (org.telegram.ui.Components.v51) obj2;
                org.telegram.ui.Components.d61 d61Var = d41Var.f35649f;
                e41 e41Var = d41Var.v;
                ArrayList arrayList12 = e41Var.h;
                t5 t5Var = d41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.h51 C = org.telegram.ui.Components.h51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f26601s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = d41Var.f35646b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || d41Var.f35647c != null || d41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || d41Var.f35647c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(d41Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 0, 0, false, false, e41.u(e41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = d41Var.f35646b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = d41Var.f35647c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(e41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5));
                        org.telegram.ui.Components.h51 k10 = org.telegram.ui.Components.h51.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (d41Var.f35646b != null) {
                        for (int i35 = 0; i35 < d41Var.f35646b.options.size(); i35++) {
                            org.telegram.ui.Components.h51 h51Var3 = new org.telegram.ui.Components.h51(30);
                            h51Var3.f26594l = d41Var.f35646b.options.get(i35).text;
                            h51Var3.f26593k = R.drawable.msg_arrowright;
                            h51Var3.d = i35;
                            arrayList11.add(h51Var3);
                            measuredHeight += 50;
                        }
                    } else if (d41Var.f35647c != null) {
                        for (int i36 = 0; i36 < d41Var.f35647c.options.size(); i36++) {
                            org.telegram.ui.Components.h51 h51Var4 = new org.telegram.ui.Components.h51(30);
                            h51Var4.f26594l = d41Var.f35647c.options.get(i36).text;
                            h51Var4.f26593k = R.drawable.msg_arrowright;
                            h51Var4.d = i36;
                            arrayList11.add(h51Var4);
                            measuredHeight += 50;
                        }
                    } else if (d41Var.d != null) {
                        if (d41Var.f35650n == null) {
                            c41 c41Var = new c41(d41Var, d41Var.getContext(), e41.v(e41Var));
                            d41Var.f35650n = c41Var;
                            c41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = d41Var.f35650n.f22074b;
                        if (d41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.h51 k11 = org.telegram.ui.Components.h51.k(d41Var.f35650n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = e41Var.f35929r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(e41.w(e41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        i2.g.A(i13, arrayList11);
                        if (d41Var.f35651r == null) {
                            di.d dVar = new di.d(d41Var.getContext(), e41.x(e41Var), true);
                            d41Var.f35652s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(d41Var.getContext());
                            d41Var.f35651r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, e41.y(e41Var)));
                            d41Var.f35651r.addView(d41Var.f35652s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(d41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, e41.A(e41Var)));
                            d41Var.f35651r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        di.d dVar2 = d41Var.f35652s;
                        if (!d41Var.d.optional && TextUtils.isEmpty(d41Var.f35650n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        d41Var.f35652s.setOnClickListener(new l60(d41Var, 28));
                        org.telegram.ui.Components.h51 k12 = org.telegram.ui.Components.h51.k(d41Var.f35651r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.h51) i2.g.h(1, arrayList11)).f26592j = true;
                    if (e41Var.d && d41Var.f35645a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(d41Var.getContext());
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(e41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7)), org.telegram.ui.ActionBar.j6.U0(d41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20627b7, e41.B(e41Var))), 0, 0);
                        oqVar.f29167w = true;
                        frameLayout2.setBackground(oqVar);
                        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(d41Var.getContext(), null);
                        d90Var.setTextSize(1, 14.0f);
                        d90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), e41.C(e41Var)));
                        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, e41.F(e41Var)));
                        d90Var.setGravity(17);
                        frameLayout2.addView(d90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.h51 k13 = org.telegram.ui.Components.h51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (d61Var != null) {
                    if (e41.G(e41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        d61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    d61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.v51 v51Var9 = (org.telegram.ui.Components.v51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h51.k(((k41) this.f34633b).X));
                return;
            case 21:
                org.telegram.ui.Components.v51 v51Var10 = (org.telegram.ui.Components.v51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h51.k(((u41) this.f34633b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f34633b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.v51 v51Var11 = (org.telegram.ui.Components.v51) obj2;
                t71.Q((t71) this.f34633b, (ArrayList) obj);
                return;
            case 24:
                s71 s71Var = (s71) this.f34633b;
                ArrayList arrayList13 = s71Var.f40338e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = s71Var.f40335a;
                ArrayList arrayList14 = s71Var.d;
                if (tL_error5 != null) {
                    if (s71Var.f40341r) {
                        arrayList14.clear();
                        s71Var.f40341r = false;
                    }
                    s71Var.h = true;
                    s71Var.f40339f = false;
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
                if (s71Var.f40341r) {
                    arrayList14.clear();
                    s71Var.f40341r = false;
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
                    s71Var.h = true;
                }
                s71Var.f40339f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                w71 w71Var = (w71) this.f34633b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var12 = (org.telegram.ui.Components.v51) obj2;
                int i39 = w71Var.f41790b0;
                bi.l8 l8Var = w71Var.Z;
                if (l8Var != null) {
                    arrayList16.add(org.telegram.ui.Components.h51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l8Var.f3275i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ib1.f37291b;
                        org.telegram.ui.Components.h51 J6 = org.telegram.ui.Components.h51.J(ib1.class);
                        J6.f26603u = 1;
                        J6.f26607z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f20107id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f26589f = true;
                        J6.v = i39;
                        J6.K(w71Var.f41789a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f26603u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (l8Var.k() || !l8Var.f3284r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.h51 o9 = org.telegram.ui.Components.h51.o(i16, 34);
                                o9.f26603u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.h51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.v51 v51Var13 = (org.telegram.ui.Components.v51) obj2;
                i91.b0((i91) this.f34633b, (ArrayList) obj);
                return;
            case 27:
                t91 t91Var = (t91) this.f34633b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var14 = (org.telegram.ui.Components.v51) obj2;
                LinearLayout linearLayout = t91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.h51.k(linearLayout));
                }
                LinearLayout linearLayout2 = t91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.h51.k(linearLayout2));
                    return;
                }
                return;
            default:
                le1 le1Var = (le1) this.f34633b;
                gh.b bVar4 = le1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                le1Var.f38326r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                le1Var.v = paint2;
                Bitmap bitmap5 = le1Var.f38326r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                le1Var.f38327s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                le1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                le1Var.f38328w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, le1Var.f38317b);
                le1Var.F.d();
                return;
        }
    }
}
