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
public final class d5 implements Utilities.Callback2 {
    public final int f32864a;
    public final Object f32865b;

    public d5(Object obj, int i10) {
        this.f32864a = i10;
        this.f32865b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        da1 da1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        et etVar;
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
        switch (this.f32864a) {
            case 0:
                e5 e5Var = (e5) this.f32865b;
                e5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                e5Var.f33130w = false;
                fh.b bVar = e5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, e5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                n9 n9Var = (n9) this.f32865b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) obj2;
                boolean isEmpty = n9Var.J.isEmpty();
                ArrayList arrayList2 = n9Var.F;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.x51 c10 = org.telegram.ui.Components.x51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f30307q = true;
                    arrayList.add(c10);
                    if (!n9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.x51 c11 = org.telegram.ui.Components.x51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f30307q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.x51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = n9Var.J;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = n9Var.getMessagesController().getChat(l4)) != null) {
                            q8 q8Var = new q8(n9Var, 0);
                            int i22 = l9.f35286a;
                            org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(l9.class);
                            J.G = chat;
                            J.D = q8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.x51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        j9 j9Var = (j9) obj4;
                        ai.f2 f2Var = new ai.f2(27, n9Var, j9Var);
                        int i23 = h9.f34166a;
                        org.telegram.ui.Components.x51 J2 = org.telegram.ui.Components.x51.J(h9.class);
                        J2.G = j9Var;
                        J2.D = f2Var;
                        J2.K(n9Var.m0(j9Var.f34671c));
                        arrayList.add(J2);
                    }
                    if (!n9Var.I) {
                        arrayList.add(org.telegram.ui.Components.x51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.x51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.x51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                me meVar = (me) this.f32865b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var2 = (org.telegram.ui.Components.l61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(meVar.f35665y0).getChat(Long.valueOf(-meVar.f35666z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(meVar.f35665y0).getChatFull(-meVar.f35666z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (meVar.f35645e1) {
                    arrayList4.add(org.telegram.ui.Components.x51.g(meVar.C0));
                    da1 da1Var2 = meVar.f35654o1;
                    if (da1Var2 != null && !da1Var2.f32914l) {
                        arrayList4.add(org.telegram.ui.Components.x51.h(5, i10, da1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.x51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    da1 da1Var3 = meVar.f35655p1;
                    if (da1Var3 != null && !da1Var3.f32914l) {
                        arrayList4.add(org.telegram.ui.Components.x51.h(2, i10, da1Var3));
                        arrayList4.add(org.telegram.ui.Components.x51.A(-2, charSequence));
                    }
                }
                if (meVar.f35646f1 && (da1Var = meVar.f35656q1) != null && !da1Var.f32914l) {
                    arrayList4.add(org.telegram.ui.Components.x51.h(2, i10, da1Var));
                    arrayList4.add(org.telegram.ui.Components.x51.A(-3, null));
                }
                if (meVar.f35657r1) {
                    arrayList4.add(org.telegram.ui.Components.x51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.x51.u(meVar.f35658s1));
                    arrayList4.add(org.telegram.ui.Components.x51.u(meVar.f35659t1));
                    arrayList4.add(org.telegram.ui.Components.x51.u(meVar.f35660u1));
                    arrayList4.add(org.telegram.ui.Components.x51.A(-4, meVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (meVar.f35645e1) {
                        arrayList4.add(org.telegram.ui.Components.x51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.x51.k(meVar.G0));
                        arrayList4.add(org.telegram.ui.Components.x51.A(-5, meVar.D0));
                        int i24 = MessagesController.getInstance(meVar.f35665y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (meVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(0, new fp0(i11, context, null, false));
                            qqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(qqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.x51 i25 = org.telegram.ui.Components.x51.i(1, string);
                        if (meVar.B0 >= i24 && meVar.f35652m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.x51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (meVar.f35646f1) {
                        arrayList4.add(org.telegram.ui.Components.x51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.x51.j(3, meVar.M0));
                        arrayList4.add(org.telegram.ui.Components.x51.A(-6, meVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(meVar.f35665y0).getChat(Long.valueOf(-meVar.f35666z0))) && MessagesController.getInstance(meVar.f35665y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, meVar.f35664x0), R.drawable.filled_earn_stars, so.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.x51.A(-7, null));
                }
                if (meVar.f35644d1.a()) {
                    arrayList4.add(org.telegram.ui.Components.x51.p(meVar.f35644d1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.x51.A(-10, null));
                    return;
                }
            case 3:
                ge geVar = (ge) this.f32865b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var3 = (org.telegram.ui.Components.l61) obj2;
                ie ieVar = geVar.f33911f;
                int i26 = geVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = ieVar.f34452n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.o7.f47899a;
                        org.telegram.ui.Components.x51 J3 = org.telegram.ui.Components.x51.J(yh.o7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f30307q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(ieVar.f34453r)) {
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = ieVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.o7.f47899a;
                        org.telegram.ui.Components.x51 J4 = org.telegram.ui.Components.x51.J(yh.o7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f30307q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(ieVar.f34451f)) {
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                so soVar = (so) this.f32865b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    soVar.getClass();
                    org.telegram.ui.Components.xc.a0(soVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(soVar.f37517k0);
                AndroidUtilities.removeFromParent(soVar.f37514h0);
                AndroidUtilities.removeFromParent(soVar.f37516j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new mq((qr) this.f32865b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32865b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ps psVar = (ps) this.f32865b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var4 = (org.telegram.ui.Components.l61) obj2;
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.H));
                arrayList8.add(org.telegram.ui.Components.x51.k(psVar.V));
                arrayList8.add(org.telegram.ui.Components.x51.k(psVar.f36531b));
                arrayList8.add(org.telegram.ui.Components.x51.k(psVar.f36532c));
                if (TextUtils.isEmpty(psVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.x51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (psVar.K) {
                    arrayList8.add(org.telegram.ui.Components.x51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.x51.B(null));
                }
                if (psVar.I && psVar.K) {
                    org.telegram.ui.Components.x51 i29 = org.telegram.ui.Components.x51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(psVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.x51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.x51.k(psVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (!psVar.I) {
                    TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.x51.k(psVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.x51.k(psVar.f36538x));
                    arrayList8.add(org.telegram.ui.Components.x51.k(psVar.f36539y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.x51.k(psVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.x51.B(null));
                    org.telegram.ui.Components.x51 e = org.telegram.ui.Components.x51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f30308r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.x51.B(charSequence2));
                if (psVar.Y) {
                    AndroidUtilities.runOnUIThread(new gs(psVar, user, 0));
                    psVar.Y = false;
                    AndroidUtilities.runOnUIThread(new hs(psVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                qt.a((qt) this.f32865b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                mt mtVar = (mt) this.f32865b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                qt qtVar = mtVar.f35750a;
                ot otVar = qtVar.f36896l;
                if (otVar != null) {
                    String join = TextUtils.join("", qtVar.f36899o);
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
                org.telegram.ui.Components.l61 l61Var5 = (org.telegram.ui.Components.l61) obj2;
                bu.R((bu) this.f32865b, (ArrayList) obj);
                return;
            case 11:
                ty tyVar = (ty) this.f32865b;
                Long l10 = (Long) obj2;
                tyVar.P1 = (Long) obj;
                tyVar.d5();
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32865b).run();
                return;
            case 13:
                final lz lzVar = (lz) this.f32865b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var6 = (org.telegram.ui.Components.l61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(2);
                x51Var.f30302l = string2;
                x51Var.f30301k = i30;
                arrayList9.add(x51Var);
                org.telegram.ui.Components.x51 i31 = org.telegram.ui.Components.x51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(lzVar.f35480c);
                arrayList9.add(i31);
                if (lzVar.f35480c) {
                    arrayList9.add(org.telegram.ui.Components.x51.B(null));
                    arrayList9.add(org.telegram.ui.Components.x51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    lz lzVar2 = lzVar;
                                    lzVar2.d = true;
                                    ((kz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = lzVar2.f35481f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(lzVar2.f35480c), Boolean.valueOf(lzVar2.d));
                                    }
                                    lzVar2.U();
                                    return;
                                default:
                                    lz lzVar3 = lzVar;
                                    lzVar3.d = false;
                                    ((kz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = lzVar3.f35481f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(lzVar3.f35480c), Boolean.valueOf(lzVar3.d));
                                    }
                                    lzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    lz lzVar2 = lzVar;
                                    lzVar2.d = true;
                                    ((kz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = lzVar2.f35481f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(lzVar2.f35480c), Boolean.valueOf(lzVar2.d));
                                    }
                                    lzVar2.U();
                                    return;
                                default:
                                    lz lzVar3 = lzVar;
                                    lzVar3.d = false;
                                    ((kz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = lzVar3.f35481f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(lzVar3.f35480c), Boolean.valueOf(lzVar3.d));
                                    }
                                    lzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = jz.f34882a;
                    org.telegram.ui.Components.x51 J5 = org.telegram.ui.Components.x51.J(jz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(lzVar.d);
                    arrayList9.add(J5);
                    com.google.android.gms.internal.vision.e2.w(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                cc0 cc0Var = (cc0) this.f32865b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                cc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(cc0Var.f32655b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.l0.o(R.string.AIEditorStyleNotFound, cc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        cc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                gw0 gw0Var = (gw0) this.f32865b;
                fh.b bVar2 = gw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                gw0Var.f34060s = (Bitmap) obj;
                Paint paint = new Paint(1);
                gw0Var.f34061w = paint;
                Bitmap bitmap2 = gw0Var.f34060s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                gw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                gw0Var.f34061w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                gw0Var.f34062x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, gw0Var.f34051c);
                gw0Var.G.d();
                return;
            case 16:
                nw0 nw0Var = (nw0) this.f32865b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var7 = (org.telegram.ui.Components.l61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.x51 x51Var2 = new org.telegram.ui.Components.x51(2);
                x51Var2.f30302l = string3;
                x51Var2.f30301k = i33;
                arrayList10.add(x51Var2);
                org.telegram.ui.Components.x51 i34 = org.telegram.ui.Components.x51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(nw0Var.f36101r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.x51.A(2, null));
                if (nw0Var.f36101r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) nw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.e1 e1Var = new org.telegram.ui.Components.voip.e1(19);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21889c = a2;
                    y7Var.d = 20;
                    y7Var.e = e1Var;
                    nw0Var.f36097b.d((int) Utilities.clamp(nw0Var.f36102s, 10000L, 0L), y7Var, new u3(nw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.x51.j(3, nw0Var.f36097b));
                    if (nw0Var.f36102s > 0) {
                        str = nw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.x51.A(4, str));
                    TLRPC.Chat chat3 = nw0Var.getMessagesController().getChat(Long.valueOf(nw0Var.f36096a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        nw0Var.f36098c.setLink(nw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.x51.j(5, nw0Var.f36098c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32865b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32865b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31636p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                u31 u31Var = (u31) this.f32865b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var8 = (org.telegram.ui.Components.l61) obj2;
                org.telegram.ui.Components.t61 t61Var = u31Var.f38115f;
                v31 v31Var = u31Var.v;
                ArrayList arrayList12 = v31Var.h;
                v5 v5Var = u31Var.h;
                if (v5Var.getMeasuredHeight() <= 0) {
                    v5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.x51 C = org.telegram.ui.Components.x51.C(v5Var.getMeasuredHeight());
                C.d = -1;
                C.f30309s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((v5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u31Var.f38113b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || u31Var.f38114c != null || u31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || u31Var.f38114c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(u31Var.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 0, 0, false, false, v31.u(v31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = u31Var.f38113b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u31Var.f38114c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
                        org.telegram.ui.Components.x51 k10 = org.telegram.ui.Components.x51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (u31Var.f38113b != null) {
                        for (int i35 = 0; i35 < u31Var.f38113b.options.size(); i35++) {
                            org.telegram.ui.Components.x51 x51Var3 = new org.telegram.ui.Components.x51(30);
                            x51Var3.f30302l = u31Var.f38113b.options.get(i35).text;
                            x51Var3.f30301k = R.drawable.msg_arrowright;
                            x51Var3.d = i35;
                            arrayList11.add(x51Var3);
                            measuredHeight += 50;
                        }
                    } else if (u31Var.f38114c != null) {
                        for (int i36 = 0; i36 < u31Var.f38114c.options.size(); i36++) {
                            org.telegram.ui.Components.x51 x51Var4 = new org.telegram.ui.Components.x51(30);
                            x51Var4.f30302l = u31Var.f38114c.options.get(i36).text;
                            x51Var4.f30301k = R.drawable.msg_arrowright;
                            x51Var4.d = i36;
                            arrayList11.add(x51Var4);
                            measuredHeight += 50;
                        }
                    } else if (u31Var.d != null) {
                        if (u31Var.f38116n == null) {
                            t31 t31Var = new t31(u31Var, u31Var.getContext(), v31.v(v31Var));
                            u31Var.f38116n = t31Var;
                            t31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = u31Var.f38116n.f20493b;
                        if (u31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.x51 k11 = org.telegram.ui.Components.x51.k(u31Var.f38116n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = v31Var.f38440r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(v31.w(v31Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i13, arrayList11);
                        if (u31Var.f38117r == null) {
                            ci.d dVar = new ci.d(u31Var.getContext(), v31.x(v31Var), true);
                            u31Var.f38118s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(u31Var.getContext());
                            u31Var.f38117r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, v31.y(v31Var)));
                            u31Var.f38117r.addView(u31Var.f38118s, w7.y5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(u31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, v31.z(v31Var)));
                            u31Var.f38117r.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = u31Var.f38118s;
                        if (!u31Var.d.optional && TextUtils.isEmpty(u31Var.f38116n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        u31Var.f38118s.setOnClickListener(new i60(u31Var, 28));
                        org.telegram.ui.Components.x51 k12 = org.telegram.ui.Components.x51.k(u31Var.f38117r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.x51) hg.k0.g(1, arrayList11)).f30300j = true;
                    if (v31Var.d && u31Var.f38112a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(u31Var.getContext());
                        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7)), org.telegram.ui.ActionBar.i6.U0(u31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19021b7, v31.A(v31Var))), 0, 0);
                        rqVar.f28069w = true;
                        frameLayout2.setBackground(rqVar);
                        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(u31Var.getContext(), null);
                        p90Var.setTextSize(1, 14.0f);
                        p90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), v31.B(v31Var)));
                        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, v31.F(v31Var)));
                        p90Var.setGravity(17);
                        frameLayout2.addView(p90Var, w7.y5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.x51 k13 = org.telegram.ui.Components.x51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (t61Var != null) {
                    if (v31.G(v31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        t61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    t61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.l61 l61Var9 = (org.telegram.ui.Components.l61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.x51.k(((b41) this.f32865b).X));
                return;
            case 21:
                org.telegram.ui.Components.l61 l61Var10 = (org.telegram.ui.Components.l61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.x51.k(((o41) this.f32865b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32865b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.l61 l61Var11 = (org.telegram.ui.Components.l61) obj2;
                m71.Q((m71) this.f32865b, (ArrayList) obj);
                return;
            case 24:
                l71 l71Var = (l71) this.f32865b;
                ArrayList arrayList13 = l71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = l71Var.f35273a;
                ArrayList arrayList14 = l71Var.d;
                if (tL_error5 != null) {
                    if (l71Var.f35278r) {
                        arrayList14.clear();
                        l71Var.f35278r = false;
                    }
                    l71Var.h = true;
                    l71Var.f35276f = false;
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
                if (l71Var.f35278r) {
                    arrayList14.clear();
                    l71Var.f35278r = false;
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
                    l71Var.h = true;
                }
                l71Var.f35276f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                p71 p71Var = (p71) this.f32865b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var12 = (org.telegram.ui.Components.l61) obj2;
                int i39 = p71Var.f36343b0;
                ai.d9 d9Var = p71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.x51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f728i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ya1.f40177b;
                        org.telegram.ui.Components.x51 J6 = org.telegram.ui.Components.x51.J(ya1.class);
                        J6.f30311u = 1;
                        J6.f30315z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18564id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f30297f = true;
                        J6.v = i39;
                        J6.K(p71Var.f36342a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f30311u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (d9Var.k() || !d9Var.f737r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.x51 o9 = org.telegram.ui.Components.x51.o(i16, 34);
                                o9.f30311u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.x51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.l61 l61Var13 = (org.telegram.ui.Components.l61) obj2;
                a91.f0((a91) this.f32865b, (ArrayList) obj);
                return;
            case 27:
                l91 l91Var = (l91) this.f32865b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var14 = (org.telegram.ui.Components.l61) obj2;
                LinearLayout linearLayout = l91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.x51.k(linearLayout));
                }
                LinearLayout linearLayout2 = l91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.x51.k(linearLayout2));
                    return;
                }
                return;
            default:
                ee1 ee1Var = (ee1) this.f32865b;
                fh.b bVar4 = ee1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ee1Var.f33241r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ee1Var.v = paint2;
                Bitmap bitmap5 = ee1Var.f33241r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ee1Var.f33242s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                ee1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ee1Var.f33243w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, ee1Var.f33233b);
                ee1Var.F.d();
                return;
        }
    }
}
