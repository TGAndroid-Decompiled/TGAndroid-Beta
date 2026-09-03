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
    public final int f35979a;
    public final Object f35980b;

    public d5(Object obj, int i10) {
        this.f35979a = i10;
        this.f35980b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        z91 z91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.Components.xk xkVar;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z4;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12 = 0.25f;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r8 = false;
        boolean z10 = false;
        switch (this.f35979a) {
            case 0:
                e5 e5Var = (e5) this.f35980b;
                e5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                e5Var.f36368w = false;
                tg.b bVar = e5Var.h;
                bVar.a((Bitmap) obj2);
                ug.c.c(bVar, e5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                l9 l9Var = (l9) this.f35980b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                boolean isEmpty = l9Var.H.isEmpty();
                ArrayList arrayList2 = l9Var.D;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.h51 c3 = org.telegram.ui.Components.h51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.f27380q = true;
                    arrayList.add(c3);
                    if (!l9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.h51 c10 = org.telegram.ui.Components.h51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.f27380q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.h51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = l9Var.H;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = l9Var.getMessagesController().getChat(l10)) != null) {
                            p8 p8Var = new p8(l9Var, 0);
                            int i22 = j9.f37882a;
                            org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(j9.class);
                            J.G = chat;
                            J.D = p8Var;
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
                        h9 h9Var = (h9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, l9Var, h9Var);
                        int i23 = f9.f36710a;
                        org.telegram.ui.Components.h51 J2 = org.telegram.ui.Components.h51.J(f9.class);
                        J2.G = h9Var;
                        J2.D = gVar;
                        J2.K(l9Var.l0(h9Var.f37269c));
                        arrayList.add(J2);
                    }
                    if (!l9Var.G) {
                        arrayList.add(org.telegram.ui.Components.h51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.h51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.h51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f35980b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var2 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f38282v0).getChat(Long.valueOf(-keVar.f38283w0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f38282v0).getChatFull(-keVar.f38283w0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f38263c1) {
                    arrayList4.add(org.telegram.ui.Components.h51.g(keVar.f38286z0));
                    z91 z91Var2 = keVar.l1;
                    if (z91Var2 != null && !z91Var2.f43868l) {
                        arrayList4.add(org.telegram.ui.Components.h51.h(5, i10, z91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.h51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    z91 z91Var3 = keVar.f38272m1;
                    if (z91Var3 != null && !z91Var3.f43868l) {
                        arrayList4.add(org.telegram.ui.Components.h51.h(2, i10, z91Var3));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-2, charSequence));
                    }
                }
                if (keVar.f38264d1 && (z91Var = keVar.f38273n1) != null && !z91Var.f43868l) {
                    arrayList4.add(org.telegram.ui.Components.h51.h(2, i10, z91Var));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-3, null));
                }
                if (keVar.f38274o1) {
                    arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.h51.u(keVar.f38275p1));
                    arrayList4.add(org.telegram.ui.Components.h51.u(keVar.f38276q1));
                    arrayList4.add(org.telegram.ui.Components.h51.u(keVar.f38277r1));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-4, keVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f38263c1) {
                        arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.h51.k(keVar.D0));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-5, keVar.A0));
                        int i24 = MessagesController.getInstance(keVar.f38282v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.f38285y0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new wo0(i11, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.h51 i25 = org.telegram.ui.Components.h51.i(1, string);
                        if (keVar.f38285y0 >= i24 && keVar.f38270j1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.h51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f38264d1) {
                        arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.h51.j(3, keVar.J0));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-6, keVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f38282v0).getChat(Long.valueOf(-keVar.f38283w0))) && MessagesController.getInstance(keVar.f38282v0).starrefConnectAllowed) {
                    arrayList4.add(sh.f.a(4, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.uj, keVar.f38281u0), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-7, null));
                }
                if (keVar.f38262b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.h51.p(keVar.f38262b1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.h51.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f35980b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var3 = (org.telegram.ui.Components.w51) obj2;
                ge geVar = eeVar.f36454f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.f37079n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = mh.da.f13919a;
                        org.telegram.ui.Components.h51 J3 = org.telegram.ui.Components.h51.J(mh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f27380q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f37080r)) {
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
                        int i28 = mh.da.f13919a;
                        org.telegram.ui.Components.h51 J4 = org.telegram.ui.Components.h51.J(mh.da.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f27380q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f37078f)) {
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
                po poVar = (po) this.f35980b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    poVar.getClass();
                    org.telegram.ui.Components.qc.a0(poVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(poVar.f40068h0);
                AndroidUtilities.removeFromParent(poVar.f40064e0);
                AndroidUtilities.removeFromParent(poVar.f40067g0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new lq((qr) this.f35980b, 1), 1000L);
                return;
            case 6:
                ((n7.qa) this.f35980b).X0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                os osVar = (os) this.f35980b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var4 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
                arrayList8.add(org.telegram.ui.Components.h51.k(osVar.S));
                arrayList8.add(org.telegram.ui.Components.h51.k(osVar.f39791b));
                arrayList8.add(org.telegram.ui.Components.h51.k(osVar.f39792c));
                if (TextUtils.isEmpty(osVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (osVar.H) {
                    arrayList8.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.h51.B(null));
                }
                if (osVar.F && osVar.H) {
                    org.telegram.ui.Components.h51 i29 = org.telegram.ui.Components.h51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(osVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.h51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.h51.k(osVar.d));
                yh.A(R.string.AddNotesInfo, arrayList8);
                if (!osVar.F) {
                    TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.h51.k(osVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.h51.k(osVar.f39799x));
                    arrayList8.add(org.telegram.ui.Components.h51.k(osVar.f39800y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.h51.k(osVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.h51.B(null));
                    org.telegram.ui.Components.h51 e6 = org.telegram.ui.Components.h51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e6.f27381r = true;
                    arrayList8.add(e6);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.h51.B(charSequence2));
                if (osVar.V) {
                    AndroidUtilities.runOnUIThread(new fs(osVar, user, 0));
                    osVar.V = false;
                    AndroidUtilities.runOnUIThread(new gs(osVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                qt.a((qt) this.f35980b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                mt mtVar = (mt) this.f35980b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                qt qtVar = mtVar.f39067a;
                ot otVar = qtVar.f40657l;
                if (otVar != null) {
                    String join = TextUtils.join("", qtVar.f40660o);
                    if (callback != null) {
                        xkVar = new org.telegram.ui.Components.xk(11, mtVar, callback);
                    } else {
                        xkVar = null;
                    }
                    otVar.z(charSequence3, join, xkVar);
                    if (callback == null) {
                        qtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.w51 w51Var5 = (org.telegram.ui.Components.w51) obj2;
                bu.R((bu) this.f35980b, (ArrayList) obj);
                return;
            case 11:
                py pyVar = (py) this.f35980b;
                Long l11 = (Long) obj2;
                pyVar.M1 = (Long) obj;
                pyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f35980b).run();
                return;
            case 13:
                final iz izVar = (iz) this.f35980b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var6 = (org.telegram.ui.Components.w51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(2);
                h51Var.f27375l = string2;
                h51Var.f27374k = i30;
                arrayList9.add(h51Var);
                org.telegram.ui.Components.h51 i31 = org.telegram.ui.Components.h51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(izVar.f37806c);
                arrayList9.add(i31);
                if (izVar.f37806c) {
                    arrayList9.add(org.telegram.ui.Components.h51.B(null));
                    arrayList9.add(org.telegram.ui.Components.h51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    iz izVar2 = izVar;
                                    izVar2.d = true;
                                    ((hz) view.getParent()).a(true, true);
                                    eh.w wVar = izVar2.f37808f;
                                    if (wVar != null) {
                                        wVar.run(Boolean.valueOf(izVar2.f37806c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    return;
                                default:
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    ((hz) view.getParent()).a(false, true);
                                    eh.w wVar2 = izVar3.f37808f;
                                    if (wVar2 != null) {
                                        wVar2.run(Boolean.valueOf(izVar3.f37806c), Boolean.valueOf(izVar3.d));
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
                                    eh.w wVar = izVar2.f37808f;
                                    if (wVar != null) {
                                        wVar.run(Boolean.valueOf(izVar2.f37806c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    return;
                                default:
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    ((hz) view.getParent()).a(false, true);
                                    eh.w wVar2 = izVar3.f37808f;
                                    if (wVar2 != null) {
                                        wVar2.run(Boolean.valueOf(izVar3.f37806c), Boolean.valueOf(izVar3.d));
                                    }
                                    izVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = gz.f37185a;
                    org.telegram.ui.Components.h51 J5 = org.telegram.ui.Components.h51.J(gz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(izVar.d);
                    arrayList9.add(J5);
                    yh.A(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                xb0 xb0Var = (xb0) this.f35980b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                xb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(xb0Var.f43001b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        l.d.v(R.string.AIEditorStyleNotFound, xb0.b(), R.raw.error, 36);
                        return;
                    } else {
                        xb0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                yv0 yv0Var = (yv0) this.f35980b;
                tg.b bVar2 = yv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                yv0Var.f43717s = (Bitmap) obj;
                Paint paint = new Paint(1);
                yv0Var.f43718w = paint;
                Bitmap bitmap2 = yv0Var.f43717s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                yv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                yv0Var.f43718w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                yv0Var.f43719x = new Matrix();
                bVar2.a(bitmap);
                ug.c.c(bVar2, yv0Var.f43710c);
                yv0Var.D.d();
                return;
            case 16:
                fw0 fw0Var = (fw0) this.f35980b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var7 = (org.telegram.ui.Components.w51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.h51 h51Var2 = new org.telegram.ui.Components.h51(2);
                h51Var2.f27375l = string3;
                h51Var2.f27374k = i33;
                arrayList10.add(h51Var2);
                org.telegram.ui.Components.h51 i34 = org.telegram.ui.Components.h51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(fw0Var.f36929r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.h51.A(2, null));
                if (fw0Var.f36929r) {
                    yh.r(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) fw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    cl0 cl0Var = new cl0(4);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f24369c = a2;
                    w7Var.d = 20;
                    w7Var.f24370e = cl0Var;
                    fw0Var.f36924b.d((int) Utilities.clamp(fw0Var.f36930s, 10000L, 0L), w7Var, new w3(fw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.h51.j(3, fw0Var.f36924b));
                    if (fw0Var.f36930s > 0) {
                        str = fw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.h51.A(4, str));
                    TLRPC.Chat chat3 = fw0Var.getMessagesController().getChat(Long.valueOf(fw0Var.f36923a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        fw0Var.f36925c.setLink(fw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        yh.r(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.h51.j(5, fw0Var.f36925c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35980b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f34552e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f35980b;
                Bitmap bitmap3 = (Bitmap) obj;
                tg.b bVar3 = profileActivity.f34650m6;
                bVar3.a((Bitmap) obj2);
                ug.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.f34658n6.d();
                return;
            case 19:
                p31 p31Var = (p31) this.f35980b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var8 = (org.telegram.ui.Components.w51) obj2;
                org.telegram.ui.Components.h61 h61Var = p31Var.f39876f;
                q31 q31Var = p31Var.v;
                ArrayList arrayList12 = q31Var.h;
                eg.q1 q1Var = p31Var.h;
                if (q1Var.getMeasuredHeight() <= 0) {
                    q1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.h51 C = org.telegram.ui.Components.h51.C(q1Var.getMeasuredHeight());
                C.d = -1;
                C.f27382s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((q1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p31Var.f39873b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || p31Var.f39874c != null || p31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || p31Var.f39874c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(p31Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 0, 0, false, false, q31.u(q31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = p31Var.f39873b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p31Var.f39874c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(q31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
                        org.telegram.ui.Components.h51 k10 = org.telegram.ui.Components.h51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (p31Var.f39873b != null) {
                        for (int i35 = 0; i35 < p31Var.f39873b.options.size(); i35++) {
                            org.telegram.ui.Components.h51 h51Var3 = new org.telegram.ui.Components.h51(30);
                            h51Var3.f27375l = p31Var.f39873b.options.get(i35).text;
                            h51Var3.f27374k = R.drawable.msg_arrowright;
                            h51Var3.d = i35;
                            arrayList11.add(h51Var3);
                            measuredHeight += 50;
                        }
                    } else if (p31Var.f39874c != null) {
                        for (int i36 = 0; i36 < p31Var.f39874c.options.size(); i36++) {
                            org.telegram.ui.Components.h51 h51Var4 = new org.telegram.ui.Components.h51(30);
                            h51Var4.f27375l = p31Var.f39874c.options.get(i36).text;
                            h51Var4.f27374k = R.drawable.msg_arrowright;
                            h51Var4.d = i36;
                            arrayList11.add(h51Var4);
                            measuredHeight += 50;
                        }
                    } else if (p31Var.d != null) {
                        if (p31Var.f39877n == null) {
                            o31 o31Var = new o31(p31Var, p31Var.getContext(), q31.v(q31Var));
                            p31Var.f39877n = o31Var;
                            o31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = p31Var.f39877n.f22957b;
                        if (p31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.h51 k11 = org.telegram.ui.Components.h51.k(p31Var.f39877n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = q31Var.f40315r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(q31.w(q31Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        yh.A(i13, arrayList11);
                        if (p31Var.f39878r == null) {
                            qh.d dVar = new qh.d(p31Var.getContext(), q31.x(q31Var), true);
                            p31Var.f39879s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(p31Var.getContext());
                            p31Var.f39878r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, q31.y(q31Var)));
                            p31Var.f39878r.addView(p31Var.f39879s, k7.c6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(p31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, q31.A(q31Var)));
                            p31Var.f39878r.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        qh.d dVar2 = p31Var.f39879s;
                        if (!p31Var.d.optional && TextUtils.isEmpty(p31Var.f39877n.getText())) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        dVar2.setEnabled(z4);
                        p31Var.f39879s.setOnClickListener(new f60(p31Var, 28));
                        org.telegram.ui.Components.h51 k12 = org.telegram.ui.Components.h51.k(p31Var.f39878r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.h51) l.d.i(1, arrayList11)).f27373j = true;
                    if (q31Var.d && p31Var.f39872a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(p31Var.getContext());
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(q31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7)), org.telegram.ui.ActionBar.k6.U0(p31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21626b7, q31.B(q31Var))), 0, 0);
                        pqVar.f30166w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(p31Var.getContext(), null);
                        g90Var.setTextSize(1, 14.0f);
                        g90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), q31.C(q31Var)));
                        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, q31.E(q31Var)));
                        g90Var.setGravity(17);
                        frameLayout2.addView(g90Var, k7.c6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.h51 k13 = org.telegram.ui.Components.h51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (h61Var != null) {
                    if (q31.F(q31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        h61Var.U2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    h61Var.U2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.w51 w51Var9 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h51.k(((w31) this.f35980b).U));
                return;
            case 21:
                org.telegram.ui.Components.w51 w51Var10 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h51.k(((g41) this.f35980b).U));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f35980b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.w51 w51Var11 = (org.telegram.ui.Components.w51) obj2;
                h71.Q((h71) this.f35980b, (ArrayList) obj);
                return;
            case 24:
                g71 g71Var = (g71) this.f35980b;
                ArrayList arrayList13 = g71Var.f37007e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = g71Var.f37004a;
                ArrayList arrayList14 = g71Var.d;
                if (tL_error5 != null) {
                    if (g71Var.f37010r) {
                        arrayList14.clear();
                        g71Var.f37010r = false;
                    }
                    g71Var.h = true;
                    g71Var.f37008f = false;
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
                if (g71Var.f37010r) {
                    arrayList14.clear();
                    g71Var.f37010r = false;
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
                    g71Var.h = true;
                }
                g71Var.f37008f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                k71 k71Var = (k71) this.f35980b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var12 = (org.telegram.ui.Components.w51) obj2;
                int i39 = k71Var.Y;
                oh.l6 l6Var = k71Var.W;
                if (l6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.h51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l6Var.f17404i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ua1.f41787b;
                        org.telegram.ui.Components.h51 J6 = org.telegram.ui.Components.h51.J(ua1.class);
                        J6.f27384u = 1;
                        J6.f27388z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f21082id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f27370f = true;
                        J6.v = i39;
                        J6.K(k71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f27384u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (l6Var.k() || !l6Var.f17413r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.h51 o10 = org.telegram.ui.Components.h51.o(i16, 34);
                                o10.f27384u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.h51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.w51 w51Var13 = (org.telegram.ui.Components.w51) obj2;
                v81.a0((v81) this.f35980b, (ArrayList) obj);
                return;
            case 27:
                f91 f91Var = (f91) this.f35980b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var14 = (org.telegram.ui.Components.w51) obj2;
                LinearLayout linearLayout = f91Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.h51.k(linearLayout));
                }
                LinearLayout linearLayout2 = f91Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.h51.k(linearLayout2));
                    return;
                }
                return;
            default:
                zd1 zd1Var = (zd1) this.f35980b;
                tg.b bVar4 = zd1Var.B;
                Bitmap bitmap4 = (Bitmap) obj2;
                zd1Var.f43931r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                zd1Var.v = paint2;
                Bitmap bitmap5 = zd1Var.f43931r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                zd1Var.f43932s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f11);
                zd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                zd1Var.f43933w = new Matrix();
                bVar4.a(bitmap4);
                ug.c.c(bVar4, zd1Var.f43925b);
                zd1Var.C.d();
                return;
        }
    }
}
