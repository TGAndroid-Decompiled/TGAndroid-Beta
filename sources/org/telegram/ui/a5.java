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
public final class a5 implements Utilities.Callback2 {
    public final int f35884a;
    public final Object f35885b;

    public a5(Object obj, int i10) {
        this.f35884a = i10;
        this.f35885b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ma1 ma1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        et etVar;
        float f7;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
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
        switch (this.f35884a) {
            case 0:
                b5 b5Var = (b5) this.f35885b;
                b5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f36273w = false;
                fh.b bVar = b5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, b5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                i9 i9Var = (i9) this.f35885b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var = (org.telegram.ui.Components.e71) obj2;
                boolean isEmpty = i9Var.K.isEmpty();
                ArrayList arrayList2 = i9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.r61 c10 = org.telegram.ui.Components.r61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f30366q = true;
                    arrayList.add(c10);
                    if (!i9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.r61 c11 = org.telegram.ui.Components.r61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f30366q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.r61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = i9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = i9Var.getMessagesController().getChat(l4)) != null) {
                            l8 l8Var = new l8(i9Var, 0);
                            int i22 = g9.f37991a;
                            org.telegram.ui.Components.r61 J = org.telegram.ui.Components.r61.J(g9.class);
                            J.G = chat;
                            J.D = l8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.r61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        e9 e9Var = (e9) obj4;
                        ai.f2 f2Var = new ai.f2(27, i9Var, e9Var);
                        int i23 = c9.f36641a;
                        org.telegram.ui.Components.r61 J2 = org.telegram.ui.Components.r61.J(c9.class);
                        J2.G = e9Var;
                        J2.D = f2Var;
                        J2.K(i9Var.l0(e9Var.f37241c));
                        arrayList.add(J2);
                    }
                    if (!i9Var.J) {
                        arrayList.add(org.telegram.ui.Components.r61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.r61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.r61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                je jeVar = (je) this.f35885b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var2 = (org.telegram.ui.Components.e71) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(jeVar.f39019y0).getChat(Long.valueOf(-jeVar.f39020z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(jeVar.f39019y0).getChatFull(-jeVar.f39020z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (jeVar.f39000f1) {
                    arrayList4.add(org.telegram.ui.Components.r61.g(jeVar.C0));
                    ma1 ma1Var2 = jeVar.f39008o1;
                    if (ma1Var2 != null && !ma1Var2.f39890l) {
                        arrayList4.add(org.telegram.ui.Components.r61.h(5, i10, ma1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.r61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ma1 ma1Var3 = jeVar.f39009p1;
                    if (ma1Var3 != null && !ma1Var3.f39890l) {
                        arrayList4.add(org.telegram.ui.Components.r61.h(2, i10, ma1Var3));
                        arrayList4.add(org.telegram.ui.Components.r61.A(-2, charSequence));
                    }
                }
                if (jeVar.f39001g1 && (ma1Var = jeVar.f39010q1) != null && !ma1Var.f39890l) {
                    arrayList4.add(org.telegram.ui.Components.r61.h(2, i10, ma1Var));
                    arrayList4.add(org.telegram.ui.Components.r61.A(-3, null));
                }
                if (jeVar.f39011r1) {
                    arrayList4.add(org.telegram.ui.Components.r61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.r61.u(jeVar.f39012s1));
                    arrayList4.add(org.telegram.ui.Components.r61.u(jeVar.f39013t1));
                    arrayList4.add(org.telegram.ui.Components.r61.u(jeVar.f39014u1));
                    arrayList4.add(org.telegram.ui.Components.r61.A(-4, jeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (jeVar.f39000f1) {
                        arrayList4.add(org.telegram.ui.Components.r61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.r61.k(jeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.r61.A(-5, jeVar.D0));
                        int i24 = MessagesController.getInstance(jeVar.f39019y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (jeVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(0, new ip0(i11, context, null, false));
                            erVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.r61 i25 = org.telegram.ui.Components.r61.i(1, string);
                        if (jeVar.B0 >= i24 && jeVar.f39006m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.r61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (jeVar.f39001g1) {
                        arrayList4.add(org.telegram.ui.Components.r61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.r61.j(3, jeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.r61.A(-6, jeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(jeVar.f39019y0).getChat(Long.valueOf(-jeVar.f39020z0))) && MessagesController.getInstance(jeVar.f39019y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, jeVar.f39018x0), R.drawable.filled_earn_stars, uo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.r61.A(-7, null));
                }
                if (jeVar.f38999e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.r61.p(jeVar.f38999e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.r61.A(-10, null));
                    return;
                }
            case 3:
                de deVar = (de) this.f35885b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var3 = (org.telegram.ui.Components.e71) obj2;
                fe feVar = deVar.f36997f;
                int i26 = deVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = feVar.f37652n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.i7.f52786a;
                        org.telegram.ui.Components.r61 J3 = org.telegram.ui.Components.r61.J(yh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f30366q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(feVar.f37653r)) {
                        arrayList5.add(org.telegram.ui.Components.r61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.r61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.r61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = feVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.i7.f52786a;
                        org.telegram.ui.Components.r61 J4 = org.telegram.ui.Components.r61.J(yh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f30366q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(feVar.f37651f)) {
                        arrayList5.add(org.telegram.ui.Components.r61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.r61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.r61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                uo uoVar = (uo) this.f35885b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    uoVar.getClass();
                    org.telegram.ui.Components.ad.a0(uoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(uoVar.f42669k0);
                AndroidUtilities.removeFromParent(uoVar.f42666h0);
                AndroidUtilities.removeFromParent(uoVar.f42668j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new oq((sr) this.f35885b, 1), 1000L);
                return;
            case 6:
                ((pf.b) this.f35885b).U(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ps psVar = (ps) this.f35885b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var4 = (org.telegram.ui.Components.e71) obj2;
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.H));
                arrayList8.add(org.telegram.ui.Components.r61.k(psVar.V));
                arrayList8.add(org.telegram.ui.Components.r61.k(psVar.f40944b));
                arrayList8.add(org.telegram.ui.Components.r61.k(psVar.f40945c));
                if (TextUtils.isEmpty(psVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.r61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (psVar.K) {
                    arrayList8.add(org.telegram.ui.Components.r61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.r61.B(null));
                }
                if (psVar.I && psVar.K) {
                    org.telegram.ui.Components.r61 i29 = org.telegram.ui.Components.r61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(psVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.r61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.r61.k(psVar.d));
                hg.c.n(R.string.AddNotesInfo, arrayList8);
                if (!psVar.I) {
                    TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.r61.k(psVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.r61.k(psVar.f40952x));
                    arrayList8.add(org.telegram.ui.Components.r61.k(psVar.f40953y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.r61.k(psVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.r61.B(null));
                    org.telegram.ui.Components.r61 e7 = org.telegram.ui.Components.r61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.f30367r = true;
                    arrayList8.add(e7);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.r61.B(charSequence2));
                if (psVar.Y) {
                    AndroidUtilities.runOnUIThread(new gs(psVar, user, 0));
                    psVar.Y = false;
                    AndroidUtilities.runOnUIThread(new hs(psVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                qt.a((qt) this.f35885b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                mt mtVar = (mt) this.f35885b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                qt qtVar = mtVar.f40073a;
                ot otVar = qtVar.f41244l;
                if (otVar != null) {
                    String join = TextUtils.join("", qtVar.f41247o);
                    if (callback != null) {
                        etVar = new et(1, mtVar, callback);
                    } else {
                        etVar = null;
                    }
                    otVar.f(charSequence3, join, etVar);
                    if (callback == null) {
                        qtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.e71 e71Var5 = (org.telegram.ui.Components.e71) obj2;
                au.S((au) this.f35885b, (ArrayList) obj);
                return;
            case 11:
                sy syVar = (sy) this.f35885b;
                Long l10 = (Long) obj2;
                syVar.P1 = (Long) obj;
                syVar.R4();
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f35885b).run();
                return;
            case 13:
                final kz kzVar = (kz) this.f35885b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var6 = (org.telegram.ui.Components.e71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(2);
                r61Var.f30361l = string2;
                r61Var.f30360k = i30;
                arrayList9.add(r61Var);
                org.telegram.ui.Components.r61 i31 = org.telegram.ui.Components.r61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(kzVar.f39452c);
                arrayList9.add(i31);
                if (kzVar.f39452c) {
                    arrayList9.add(org.telegram.ui.Components.r61.B(null));
                    arrayList9.add(org.telegram.ui.Components.r61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    kz kzVar2 = kzVar;
                                    kzVar2.d = true;
                                    ((jz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = kzVar2.f39454f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(kzVar2.f39452c), Boolean.valueOf(kzVar2.d));
                                    }
                                    kzVar2.U();
                                    return;
                                default:
                                    kz kzVar3 = kzVar;
                                    kzVar3.d = false;
                                    ((jz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = kzVar3.f39454f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(kzVar3.f39452c), Boolean.valueOf(kzVar3.d));
                                    }
                                    kzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    kz kzVar2 = kzVar;
                                    kzVar2.d = true;
                                    ((jz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = kzVar2.f39454f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(kzVar2.f39452c), Boolean.valueOf(kzVar2.d));
                                    }
                                    kzVar2.U();
                                    return;
                                default:
                                    kz kzVar3 = kzVar;
                                    kzVar3.d = false;
                                    ((jz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = kzVar3.f39454f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(kzVar3.f39452c), Boolean.valueOf(kzVar3.d));
                                    }
                                    kzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = iz.f38802a;
                    org.telegram.ui.Components.r61 J5 = org.telegram.ui.Components.r61.J(iz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(kzVar.d);
                    arrayList9.add(J5);
                    hg.c.n(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                dc0 dc0Var = (dc0) this.f35885b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dc0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(dc0Var.f36976b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.q.q(R.string.AIEditorStyleNotFound, dc0.d(), R.raw.error, 36);
                        return;
                    } else {
                        dc0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                lw0 lw0Var = (lw0) this.f35885b;
                fh.b bVar2 = lw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                lw0Var.f39759s = (Bitmap) obj;
                Paint paint = new Paint(1);
                lw0Var.f39760w = paint;
                Bitmap bitmap2 = lw0Var.f39759s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                lw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                lw0Var.f39760w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                lw0Var.f39761x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, lw0Var.f39749c);
                lw0Var.G.d();
                return;
            case 16:
                sw0 sw0Var = (sw0) this.f35885b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var7 = (org.telegram.ui.Components.e71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.r61 r61Var2 = new org.telegram.ui.Components.r61(2);
                r61Var2.f30361l = string3;
                r61Var2.f30360k = i33;
                arrayList10.add(r61Var2);
                org.telegram.ui.Components.r61 i34 = org.telegram.ui.Components.r61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(sw0Var.f41874r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.r61.A(2, null));
                if (sw0Var.f41874r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) sw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    v20 v20Var = new v20(11);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23773c = a2;
                    y7Var.d = 20;
                    y7Var.f23774e = v20Var;
                    sw0Var.f41869b.d((int) Utilities.clamp(sw0Var.f41875s, 10000L, 0L), y7Var, new s3(sw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.r61.j(3, sw0Var.f41869b));
                    if (sw0Var.f41875s > 0) {
                        str = sw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.r61.A(4, str));
                    TLRPC.Chat chat3 = sw0Var.getMessagesController().getChat(Long.valueOf(sw0Var.f41868a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        sw0Var.f41870c.setLink(sw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.r61.j(5, sw0Var.f41870c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35885b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f34231e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f35885b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f34350p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                a41 a41Var = (a41) this.f35885b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var8 = (org.telegram.ui.Components.e71) obj2;
                org.telegram.ui.Components.m71 m71Var = a41Var.f35880f;
                b41 b41Var = a41Var.v;
                ArrayList arrayList12 = b41Var.h;
                s5 s5Var = a41Var.h;
                if (s5Var.getMeasuredHeight() <= 0) {
                    s5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.r61 C = org.telegram.ui.Components.r61.C(s5Var.getMeasuredHeight());
                C.d = -1;
                C.f30368s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((s5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a41Var.f35877b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || a41Var.f35878c != null || a41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || a41Var.f35878c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(a41Var.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 0, 0, false, false, b41.w(b41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = a41Var.f35877b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a41Var.f35878c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(b41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5));
                        org.telegram.ui.Components.r61 k10 = org.telegram.ui.Components.r61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (a41Var.f35877b != null) {
                        for (int i35 = 0; i35 < a41Var.f35877b.options.size(); i35++) {
                            org.telegram.ui.Components.r61 r61Var3 = new org.telegram.ui.Components.r61(30);
                            r61Var3.f30361l = a41Var.f35877b.options.get(i35).text;
                            r61Var3.f30360k = R.drawable.msg_arrowright;
                            r61Var3.d = i35;
                            arrayList11.add(r61Var3);
                            measuredHeight += 50;
                        }
                    } else if (a41Var.f35878c != null) {
                        for (int i36 = 0; i36 < a41Var.f35878c.options.size(); i36++) {
                            org.telegram.ui.Components.r61 r61Var4 = new org.telegram.ui.Components.r61(30);
                            r61Var4.f30361l = a41Var.f35878c.options.get(i36).text;
                            r61Var4.f30360k = R.drawable.msg_arrowright;
                            r61Var4.d = i36;
                            arrayList11.add(r61Var4);
                            measuredHeight += 50;
                        }
                    } else if (a41Var.d != null) {
                        if (a41Var.f35881n == null) {
                            z31 z31Var = new z31(a41Var, a41Var.getContext(), b41.x(b41Var));
                            a41Var.f35881n = z31Var;
                            z31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = a41Var.f35881n.f22289b;
                        if (a41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.r61 k11 = org.telegram.ui.Components.r61.k(a41Var.f35881n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = b41Var.f36263r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(b41.y(b41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        hg.c.n(i13, arrayList11);
                        if (a41Var.f35882r == null) {
                            ci.d dVar = new ci.d(a41Var.getContext(), b41.z(b41Var), true);
                            a41Var.f35883s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(a41Var.getContext());
                            a41Var.f35882r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, b41.B(b41Var)));
                            a41Var.f35882r.addView(a41Var.f35883s, w7.x5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(a41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20787d7, b41.C(b41Var)));
                            a41Var.f35882r.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = a41Var.f35883s;
                        if (!a41Var.d.optional && TextUtils.isEmpty(a41Var.f35881n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        a41Var.f35883s.setOnClickListener(new m60(a41Var, 27));
                        org.telegram.ui.Components.r61 k12 = org.telegram.ui.Components.r61.k(a41Var.f35882r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.r61) hg.c.g(1, arrayList11)).f30359j = true;
                    if (b41Var.d && a41Var.f35876a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(a41Var.getContext());
                        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(b41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7)), org.telegram.ui.ActionBar.h6.V0(a41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20750b7, b41.D(b41Var))), 0, 0);
                        frVar.f26475w = true;
                        frameLayout2.setBackground(frVar);
                        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(a41Var.getContext(), null);
                        fa0Var.setTextSize(1, 14.0f);
                        fa0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), b41.E(b41Var)));
                        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, b41.G(b41Var)));
                        fa0Var.setGravity(17);
                        frameLayout2.addView(fa0Var, w7.x5.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.r61 k13 = org.telegram.ui.Components.r61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (m71Var != null) {
                    if (b41.H(b41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        m71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    m71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.e71 e71Var9 = (org.telegram.ui.Components.e71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.r61.k(((g41) this.f35885b).X));
                return;
            case 21:
                org.telegram.ui.Components.e71 e71Var10 = (org.telegram.ui.Components.e71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.r61.k(((t41) this.f35885b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f35885b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.e71 e71Var11 = (org.telegram.ui.Components.e71) obj2;
                t71.R((t71) this.f35885b, (ArrayList) obj);
                return;
            case 24:
                s71 s71Var = (s71) this.f35885b;
                ArrayList arrayList13 = s71Var.f41628e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = s71Var.f41625a;
                ArrayList arrayList14 = s71Var.d;
                if (tL_error5 != null) {
                    if (s71Var.f41631r) {
                        arrayList14.clear();
                        s71Var.f41631r = false;
                    }
                    s71Var.h = true;
                    s71Var.f41629f = false;
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
                if (s71Var.f41631r) {
                    arrayList14.clear();
                    s71Var.f41631r = false;
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
                s71Var.f41629f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                w71 w71Var = (w71) this.f35885b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var12 = (org.telegram.ui.Components.e71) obj2;
                int i39 = w71Var.f43232b0;
                ai.e9 e9Var2 = w71Var.Z;
                if (e9Var2 != null) {
                    arrayList16.add(org.telegram.ui.Components.r61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = e9Var2.f899i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = hb1.f38373b;
                        org.telegram.ui.Components.r61 J6 = org.telegram.ui.Components.r61.J(hb1.class);
                        J6.f30370u = 1;
                        J6.f30374z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f20269id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f30356f = true;
                        J6.v = i39;
                        J6.K(w71Var.f43231a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f30370u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (e9Var2.k() || !e9Var2.f908r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.r61 o9 = org.telegram.ui.Components.r61.o(i16, 34);
                                o9.f30370u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.r61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.e71 e71Var13 = (org.telegram.ui.Components.e71) obj2;
                h91.b0((h91) this.f35885b, (ArrayList) obj);
                return;
            case 27:
                s91 s91Var = (s91) this.f35885b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var14 = (org.telegram.ui.Components.e71) obj2;
                LinearLayout linearLayout = s91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.r61.k(linearLayout));
                }
                LinearLayout linearLayout2 = s91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.r61.k(linearLayout2));
                    return;
                }
                return;
            default:
                le1 le1Var = (le1) this.f35885b;
                fh.b bVar4 = le1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                le1Var.f39643r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                le1Var.v = paint2;
                Bitmap bitmap5 = le1Var.f39643r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                le1Var.f39644s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                le1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                le1Var.f39645w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, le1Var.f39634b);
                le1Var.F.d();
                return;
        }
    }
}
