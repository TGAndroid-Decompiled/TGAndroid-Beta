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
    public final int f32316a;
    public final Object f32317b;

    public b5(Object obj, int i10) {
        this.f32316a = i10;
        this.f32317b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ea1 ea1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        bt btVar;
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
        switch (this.f32316a) {
            case 0:
                c5 c5Var = (c5) this.f32317b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f32567w = false;
                fh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                k9 k9Var = (k9) this.f32317b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) obj2;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.v51 c10 = org.telegram.ui.Components.v51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f29053q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.v51 c11 = org.telegram.ui.Components.v51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f29053q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.v51.B(null));
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
                            int i22 = i9.f34437a;
                            org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.v51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        g9 g9Var = (g9) obj4;
                        ai.f2 f2Var = new ai.f2(27, k9Var, g9Var);
                        int i23 = e9.f33302a;
                        org.telegram.ui.Components.v51 J2 = org.telegram.ui.Components.v51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = f2Var;
                        J2.K(k9Var.l0(g9Var.f33862c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.v51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.v51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.v51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                je jeVar = (je) this.f32317b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var2 = (org.telegram.ui.Components.j61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(jeVar.f34776y0).getChat(Long.valueOf(-jeVar.f34777z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(jeVar.f34776y0).getChatFull(-jeVar.f34777z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (jeVar.f34757f1) {
                    arrayList4.add(org.telegram.ui.Components.v51.g(jeVar.C0));
                    ea1 ea1Var2 = jeVar.f34765o1;
                    if (ea1Var2 != null && !ea1Var2.f33352l) {
                        arrayList4.add(org.telegram.ui.Components.v51.h(5, i10, ea1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.v51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ea1 ea1Var3 = jeVar.f34766p1;
                    if (ea1Var3 != null && !ea1Var3.f33352l) {
                        arrayList4.add(org.telegram.ui.Components.v51.h(2, i10, ea1Var3));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-2, charSequence));
                    }
                }
                if (jeVar.f34758g1 && (ea1Var = jeVar.f34767q1) != null && !ea1Var.f33352l) {
                    arrayList4.add(org.telegram.ui.Components.v51.h(2, i10, ea1Var));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-3, null));
                }
                if (jeVar.f34768r1) {
                    arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.v51.u(jeVar.f34769s1));
                    arrayList4.add(org.telegram.ui.Components.v51.u(jeVar.f34770t1));
                    arrayList4.add(org.telegram.ui.Components.v51.u(jeVar.f34771u1));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-4, jeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (jeVar.f34757f1) {
                        arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.v51.k(jeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-5, jeVar.D0));
                        int i24 = MessagesController.getInstance(jeVar.f34776y0).channelRestrictSponsoredLevelMin;
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
                            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(0, new cp0(i11, context, null, false));
                            pqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(pqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.v51 i25 = org.telegram.ui.Components.v51.i(1, string);
                        if (jeVar.B0 >= i24 && jeVar.f34763m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.v51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (jeVar.f34758g1) {
                        arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.v51.j(3, jeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-6, jeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(jeVar.f34776y0).getChat(Long.valueOf(-jeVar.f34777z0))) && MessagesController.getInstance(jeVar.f34776y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.uj, jeVar.f34775x0), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-7, null));
                }
                if (jeVar.f34756e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.v51.p(jeVar.f34756e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.v51.A(-10, null));
                    return;
                }
            case 3:
                de deVar = (de) this.f32317b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var3 = (org.telegram.ui.Components.j61) obj2;
                fe feVar = deVar.f33086f;
                int i26 = deVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = feVar.f33647n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.p7.f47885a;
                        org.telegram.ui.Components.v51 J3 = org.telegram.ui.Components.v51.J(yh.p7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f29053q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(feVar.f33648r)) {
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = feVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.p7.f47885a;
                        org.telegram.ui.Components.v51 J4 = org.telegram.ui.Components.v51.J(yh.p7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f29053q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(feVar.f33646f)) {
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ro roVar = (ro) this.f32317b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    roVar.getClass();
                    org.telegram.ui.Components.xc.a0(roVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(roVar.f37403k0);
                AndroidUtilities.removeFromParent(roVar.f37400h0);
                AndroidUtilities.removeFromParent(roVar.f37402j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new lq((pr) this.f32317b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32317b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ms msVar = (ms) this.f32317b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var4 = (org.telegram.ui.Components.j61) obj2;
                TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
                arrayList8.add(org.telegram.ui.Components.v51.k(msVar.V));
                arrayList8.add(org.telegram.ui.Components.v51.k(msVar.f35653b));
                arrayList8.add(org.telegram.ui.Components.v51.k(msVar.f35654c));
                if (TextUtils.isEmpty(msVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (msVar.K) {
                    arrayList8.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.v51.B(null));
                }
                if (msVar.I && msVar.K) {
                    org.telegram.ui.Components.v51 i29 = org.telegram.ui.Components.v51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(msVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.v51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.v51.k(msVar.d));
                hg.c.n(R.string.AddNotesInfo, arrayList8);
                if (!msVar.I) {
                    TLRPC.UserFull userFull = msVar.getMessagesController().getUserFull(msVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.v51.k(msVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.v51.k(msVar.f35660x));
                    arrayList8.add(org.telegram.ui.Components.v51.k(msVar.f35661y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.v51.k(msVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.v51.B(null));
                    org.telegram.ui.Components.v51 e = org.telegram.ui.Components.v51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f29054r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.v51.B(charSequence2));
                if (msVar.Y) {
                    AndroidUtilities.runOnUIThread(new ds(msVar, user, 0));
                    msVar.Y = false;
                    AndroidUtilities.runOnUIThread(new es(msVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                nt.a((nt) this.f32317b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                jt jtVar = (jt) this.f32317b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                nt ntVar = jtVar.f34867a;
                lt ltVar = ntVar.f35985l;
                if (ltVar != null) {
                    String join = TextUtils.join("", ntVar.f35988o);
                    if (callback != null) {
                        btVar = new bt(1, jtVar, callback);
                    } else {
                        btVar = null;
                    }
                    ltVar.f(charSequence3, join, btVar);
                    if (callback == null) {
                        ntVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.j61 j61Var5 = (org.telegram.ui.Components.j61) obj2;
                yt.R((yt) this.f32317b, (ArrayList) obj);
                return;
            case 11:
                qy qyVar = (qy) this.f32317b;
                Long l10 = (Long) obj2;
                qyVar.P1 = (Long) obj;
                qyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32317b).run();
                return;
            case 13:
                final iz izVar = (iz) this.f32317b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var6 = (org.telegram.ui.Components.j61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(2);
                v51Var.f29048l = string2;
                v51Var.f29047k = i30;
                arrayList9.add(v51Var);
                org.telegram.ui.Components.v51 i31 = org.telegram.ui.Components.v51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(izVar.f34604c);
                arrayList9.add(i31);
                if (izVar.f34604c) {
                    arrayList9.add(org.telegram.ui.Components.v51.B(null));
                    arrayList9.add(org.telegram.ui.Components.v51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    iz izVar2 = izVar;
                                    izVar2.d = true;
                                    ((hz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = izVar2.f34605f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(izVar2.f34604c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    return;
                                default:
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    ((hz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = izVar3.f34605f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(izVar3.f34604c), Boolean.valueOf(izVar3.d));
                                    }
                                    izVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    iz izVar2 = izVar;
                                    izVar2.d = true;
                                    ((hz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = izVar2.f34605f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(izVar2.f34604c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    return;
                                default:
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    ((hz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = izVar3.f34605f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(izVar3.f34604c), Boolean.valueOf(izVar3.d));
                                    }
                                    izVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = gz.f34081a;
                    org.telegram.ui.Components.v51 J5 = org.telegram.ui.Components.v51.J(gz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(izVar.d);
                    arrayList9.add(J5);
                    hg.c.n(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                zb0 zb0Var = (zb0) this.f32317b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                zb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(zb0Var.f40435b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.f0.p(R.string.AIEditorStyleNotFound, zb0.b(), R.raw.error, 36);
                        return;
                    } else {
                        zb0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                dw0 dw0Var = (dw0) this.f32317b;
                fh.b bVar2 = dw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                dw0Var.f33215s = (Bitmap) obj;
                Paint paint = new Paint(1);
                dw0Var.f33216w = paint;
                Bitmap bitmap2 = dw0Var.f33215s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                dw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                dw0Var.f33216w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                dw0Var.f33217x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, dw0Var.f33206c);
                dw0Var.G.d();
                return;
            case 16:
                kw0 kw0Var = (kw0) this.f32317b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var7 = (org.telegram.ui.Components.j61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.v51 v51Var2 = new org.telegram.ui.Components.v51(2);
                v51Var2.f29048l = string3;
                v51Var2.f29047k = i33;
                arrayList10.add(v51Var2);
                org.telegram.ui.Components.v51 i34 = org.telegram.ui.Components.v51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(kw0Var.f35188r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.v51.A(2, null));
                if (kw0Var.f35188r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) kw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.e1 e1Var = new org.telegram.ui.Components.voip.e1(18);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21886c = a2;
                    y7Var.d = 20;
                    y7Var.e = e1Var;
                    kw0Var.f35184b.d((int) Utilities.clamp(kw0Var.f35189s, 10000L, 0L), y7Var, new t3(kw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.v51.j(3, kw0Var.f35184b));
                    if (kw0Var.f35189s > 0) {
                        str = kw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.v51.A(4, str));
                    TLRPC.Chat chat3 = kw0Var.getMessagesController().getChat(Long.valueOf(kw0Var.f35183a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        kw0Var.f35185c.setLink(kw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.v51.j(5, kw0Var.f35185c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32317b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32317b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31634p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                s31 s31Var = (s31) this.f32317b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var8 = (org.telegram.ui.Components.j61) obj2;
                org.telegram.ui.Components.r61 r61Var = s31Var.f37584f;
                t31 t31Var = s31Var.v;
                ArrayList arrayList12 = t31Var.h;
                t5 t5Var = s31Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.v51 C = org.telegram.ui.Components.v51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f29055s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = s31Var.f37582b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || s31Var.f37583c != null || s31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || s31Var.f37583c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(s31Var.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 0, 0, false, false, t31.u(t31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = s31Var.f37582b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = s31Var.f37583c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(t31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5));
                        org.telegram.ui.Components.v51 k10 = org.telegram.ui.Components.v51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (s31Var.f37582b != null) {
                        for (int i35 = 0; i35 < s31Var.f37582b.options.size(); i35++) {
                            org.telegram.ui.Components.v51 v51Var3 = new org.telegram.ui.Components.v51(30);
                            v51Var3.f29048l = s31Var.f37582b.options.get(i35).text;
                            v51Var3.f29047k = R.drawable.msg_arrowright;
                            v51Var3.d = i35;
                            arrayList11.add(v51Var3);
                            measuredHeight += 50;
                        }
                    } else if (s31Var.f37583c != null) {
                        for (int i36 = 0; i36 < s31Var.f37583c.options.size(); i36++) {
                            org.telegram.ui.Components.v51 v51Var4 = new org.telegram.ui.Components.v51(30);
                            v51Var4.f29048l = s31Var.f37583c.options.get(i36).text;
                            v51Var4.f29047k = R.drawable.msg_arrowright;
                            v51Var4.d = i36;
                            arrayList11.add(v51Var4);
                            measuredHeight += 50;
                        }
                    } else if (s31Var.d != null) {
                        if (s31Var.f37585n == null) {
                            r31 r31Var = new r31(s31Var, s31Var.getContext(), t31.v(t31Var));
                            s31Var.f37585n = r31Var;
                            r31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = s31Var.f37585n.f20491b;
                        if (s31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.v51 k11 = org.telegram.ui.Components.v51.k(s31Var.f37585n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = t31Var.f37960r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(t31.w(t31Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        hg.c.n(i13, arrayList11);
                        if (s31Var.f37586r == null) {
                            ci.d dVar = new ci.d(s31Var.getContext(), t31.x(t31Var), true);
                            s31Var.f37587s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(s31Var.getContext());
                            s31Var.f37586r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, t31.y(t31Var)));
                            s31Var.f37586r.addView(s31Var.f37587s, w7.y5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(s31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d7, t31.z(t31Var)));
                            s31Var.f37586r.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = s31Var.f37587s;
                        if (!s31Var.d.optional && TextUtils.isEmpty(s31Var.f37585n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        s31Var.f37587s.setOnClickListener(new f60(s31Var, 28));
                        org.telegram.ui.Components.v51 k12 = org.telegram.ui.Components.v51.k(s31Var.f37586r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.v51) hg.c.g(1, arrayList11)).f29046j = true;
                    if (t31Var.d && s31Var.f37581a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(s31Var.getContext());
                        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(t31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7)), org.telegram.ui.ActionBar.h6.U0(s31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19023b7, t31.A(t31Var))), 0, 0);
                        qqVar.f27739w = true;
                        frameLayout2.setBackground(qqVar);
                        org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(s31Var.getContext(), null);
                        n90Var.setTextSize(1, 14.0f);
                        n90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), t31.B(t31Var)));
                        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, t31.F(t31Var)));
                        n90Var.setGravity(17);
                        frameLayout2.addView(n90Var, w7.y5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.v51 k13 = org.telegram.ui.Components.v51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (r61Var != null) {
                    if (t31.G(t31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        r61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    r61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.j61 j61Var9 = (org.telegram.ui.Components.j61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.v51.k(((z31) this.f32317b).X));
                return;
            case 21:
                org.telegram.ui.Components.j61 j61Var10 = (org.telegram.ui.Components.j61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.v51.k(((l41) this.f32317b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32317b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.j61 j61Var11 = (org.telegram.ui.Components.j61) obj2;
                k71.Q((k71) this.f32317b, (ArrayList) obj);
                return;
            case 24:
                j71 j71Var = (j71) this.f32317b;
                ArrayList arrayList13 = j71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = j71Var.f34676a;
                ArrayList arrayList14 = j71Var.d;
                if (tL_error5 != null) {
                    if (j71Var.f34681r) {
                        arrayList14.clear();
                        j71Var.f34681r = false;
                    }
                    j71Var.h = true;
                    j71Var.f34679f = false;
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
                if (j71Var.f34681r) {
                    arrayList14.clear();
                    j71Var.f34681r = false;
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
                    j71Var.h = true;
                }
                j71Var.f34679f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                n71 n71Var = (n71) this.f32317b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var12 = (org.telegram.ui.Components.j61) obj2;
                int i39 = n71Var.f35761b0;
                ai.d9 d9Var = n71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.v51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f725i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = za1.f40431b;
                        org.telegram.ui.Components.v51 J6 = org.telegram.ui.Components.v51.J(za1.class);
                        J6.f29057u = 1;
                        J6.f29061z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18570id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f29043f = true;
                        J6.v = i39;
                        J6.K(n71Var.f35760a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f29057u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (d9Var.k() || !d9Var.f734r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.v51 o9 = org.telegram.ui.Components.v51.o(i16, 34);
                                o9.f29057u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.v51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.j61 j61Var13 = (org.telegram.ui.Components.j61) obj2;
                z81.b0((z81) this.f32317b, (ArrayList) obj);
                return;
            case 27:
                k91 k91Var = (k91) this.f32317b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var14 = (org.telegram.ui.Components.j61) obj2;
                LinearLayout linearLayout = k91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.v51.k(linearLayout));
                }
                LinearLayout linearLayout2 = k91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.v51.k(linearLayout2));
                    return;
                }
                return;
            default:
                de1 de1Var = (de1) this.f32317b;
                fh.b bVar4 = de1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                de1Var.f33099r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                de1Var.v = paint2;
                Bitmap bitmap5 = de1Var.f33099r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                de1Var.f33100s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                de1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                de1Var.f33101w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, de1Var.f33091b);
                de1Var.F.d();
                return;
        }
    }
}
