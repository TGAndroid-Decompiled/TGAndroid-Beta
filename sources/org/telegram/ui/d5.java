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
    public final int f36004a;
    public final Object f36005b;

    public d5(Object obj, int i10) {
        this.f36004a = i10;
        this.f36005b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        t91 t91Var;
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
        switch (this.f36004a) {
            case 0:
                e5 e5Var = (e5) this.f36005b;
                e5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                e5Var.f36404w = false;
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
                l9 l9Var = (l9) this.f36005b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj2;
                boolean isEmpty = l9Var.H.isEmpty();
                ArrayList arrayList2 = l9Var.D;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.j51 c3 = org.telegram.ui.Components.j51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.f28019q = true;
                    arrayList.add(c3);
                    if (!l9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.j51 c10 = org.telegram.ui.Components.j51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.f28019q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
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
                            int i22 = j9.f38057a;
                            org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(j9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        h9 h9Var = (h9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, l9Var, h9Var);
                        int i23 = f9.f36790a;
                        org.telegram.ui.Components.j51 J2 = org.telegram.ui.Components.j51.J(f9.class);
                        J2.G = h9Var;
                        J2.D = gVar;
                        J2.K(l9Var.l0(h9Var.f37370c));
                        arrayList.add(J2);
                    }
                    if (!l9Var.G) {
                        arrayList.add(org.telegram.ui.Components.j51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f36005b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var2 = (org.telegram.ui.Components.x51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f38379v0).getChat(Long.valueOf(-keVar.f38380w0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f38379v0).getChatFull(-keVar.f38380w0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f38360c1) {
                    arrayList4.add(org.telegram.ui.Components.j51.g(keVar.f38383z0));
                    t91 t91Var2 = keVar.l1;
                    if (t91Var2 != null && !t91Var2.f41551l) {
                        arrayList4.add(org.telegram.ui.Components.j51.h(5, i10, t91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.j51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    t91 t91Var3 = keVar.f38369m1;
                    if (t91Var3 != null && !t91Var3.f41551l) {
                        arrayList4.add(org.telegram.ui.Components.j51.h(2, i10, t91Var3));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-2, charSequence));
                    }
                }
                if (keVar.f38361d1 && (t91Var = keVar.f38370n1) != null && !t91Var.f41551l) {
                    arrayList4.add(org.telegram.ui.Components.j51.h(2, i10, t91Var));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-3, null));
                }
                if (keVar.f38371o1) {
                    arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.j51.u(keVar.f38372p1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(keVar.f38373q1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(keVar.f38374r1));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-4, keVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f38360c1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.k(keVar.D0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-5, keVar.A0));
                        int i24 = MessagesController.getInstance(keVar.f38379v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.f38382y0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new uo0(i11, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.j51 i25 = org.telegram.ui.Components.j51.i(1, string);
                        if (keVar.f38382y0 >= i24 && keVar.f38367j1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.j51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f38361d1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.j(3, keVar.J0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-6, keVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f38379v0).getChat(Long.valueOf(-keVar.f38380w0))) && MessagesController.getInstance(keVar.f38379v0).starrefConnectAllowed) {
                    arrayList4.add(sh.f.a(4, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.uj, keVar.f38378u0), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-7, null));
                }
                if (keVar.f38359b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.j51.p(keVar.f38359b1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.j51.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f36005b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var3 = (org.telegram.ui.Components.x51) obj2;
                ge geVar = eeVar.f36557f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.f37172n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = mh.da.f13917a;
                        org.telegram.ui.Components.j51 J3 = org.telegram.ui.Components.j51.J(mh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f28019q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f37173r)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = mh.da.f13917a;
                        org.telegram.ui.Components.j51 J4 = org.telegram.ui.Components.j51.J(mh.da.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f28019q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f37171f)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                po poVar = (po) this.f36005b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    poVar.getClass();
                    org.telegram.ui.Components.qc.a0(poVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(poVar.f40106h0);
                AndroidUtilities.removeFromParent(poVar.f40102e0);
                AndroidUtilities.removeFromParent(poVar.f40105g0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new lq((qr) this.f36005b, 1), 1000L);
                return;
            case 6:
                ((n7.qa) this.f36005b).X0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                os osVar = (os) this.f36005b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var4 = (org.telegram.ui.Components.x51) obj2;
                TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.S));
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.f39826b));
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.f39827c));
                if (TextUtils.isEmpty(osVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (osVar.H) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                }
                if (osVar.F && osVar.H) {
                    org.telegram.ui.Components.j51 i29 = org.telegram.ui.Components.j51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(osVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.j51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.d));
                yh.A(R.string.AddNotesInfo, arrayList8);
                if (!osVar.F) {
                    TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(osVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.j51.k(osVar.f39834x));
                    arrayList8.add(org.telegram.ui.Components.j51.k(osVar.f39835y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(osVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                    org.telegram.ui.Components.j51 e6 = org.telegram.ui.Components.j51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e6.f28020r = true;
                    arrayList8.add(e6);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.j51.B(charSequence2));
                if (osVar.V) {
                    AndroidUtilities.runOnUIThread(new fs(osVar, user, 0));
                    osVar.V = false;
                    AndroidUtilities.runOnUIThread(new gs(osVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                qt.a((qt) this.f36005b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                mt mtVar = (mt) this.f36005b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                qt qtVar = mtVar.f39219a;
                ot otVar = qtVar.f40683l;
                if (otVar != null) {
                    String join = TextUtils.join("", qtVar.f40686o);
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
                org.telegram.ui.Components.x51 x51Var5 = (org.telegram.ui.Components.x51) obj2;
                bu.R((bu) this.f36005b, (ArrayList) obj);
                return;
            case 11:
                py pyVar = (py) this.f36005b;
                Long l11 = (Long) obj2;
                pyVar.M1 = (Long) obj;
                pyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f36005b).run();
                return;
            case 13:
                final iz izVar = (iz) this.f36005b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var6 = (org.telegram.ui.Components.x51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(2);
                j51Var.f28014l = string2;
                j51Var.f28013k = i30;
                arrayList9.add(j51Var);
                org.telegram.ui.Components.j51 i31 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(izVar.f37960c);
                arrayList9.add(i31);
                if (izVar.f37960c) {
                    arrayList9.add(org.telegram.ui.Components.j51.B(null));
                    arrayList9.add(org.telegram.ui.Components.j51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    iz izVar2 = izVar;
                                    izVar2.d = true;
                                    ((hz) view.getParent()).a(true, true);
                                    eh.w wVar = izVar2.f37962f;
                                    if (wVar != null) {
                                        wVar.run(Boolean.valueOf(izVar2.f37960c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    return;
                                default:
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    ((hz) view.getParent()).a(false, true);
                                    eh.w wVar2 = izVar3.f37962f;
                                    if (wVar2 != null) {
                                        wVar2.run(Boolean.valueOf(izVar3.f37960c), Boolean.valueOf(izVar3.d));
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
                                    eh.w wVar = izVar2.f37962f;
                                    if (wVar != null) {
                                        wVar.run(Boolean.valueOf(izVar2.f37960c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    return;
                                default:
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    ((hz) view.getParent()).a(false, true);
                                    eh.w wVar2 = izVar3.f37962f;
                                    if (wVar2 != null) {
                                        wVar2.run(Boolean.valueOf(izVar3.f37960c), Boolean.valueOf(izVar3.d));
                                    }
                                    izVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = gz.f37290a;
                    org.telegram.ui.Components.j51 J5 = org.telegram.ui.Components.j51.J(gz.class);
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
                xb0 xb0Var = (xb0) this.f36005b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                xb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(xb0Var.f43022b).putUsers(tL_tones.users, false);
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
                tv0 tv0Var = (tv0) this.f36005b;
                tg.b bVar2 = tv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                tv0Var.f41724s = (Bitmap) obj;
                Paint paint = new Paint(1);
                tv0Var.f41725w = paint;
                Bitmap bitmap2 = tv0Var.f41724s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                tv0Var.v = bitmapShader;
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
                tv0Var.f41725w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                tv0Var.f41726x = new Matrix();
                bVar2.a(bitmap);
                ug.c.c(bVar2, tv0Var.f41717c);
                tv0Var.D.d();
                return;
            case 16:
                aw0 aw0Var = (aw0) this.f36005b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var7 = (org.telegram.ui.Components.x51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.j51 j51Var2 = new org.telegram.ui.Components.j51(2);
                j51Var2.f28014l = string3;
                j51Var2.f28013k = i33;
                arrayList10.add(j51Var2);
                org.telegram.ui.Components.j51 i34 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(aw0Var.f35255r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.j51.A(2, null));
                if (aw0Var.f35255r) {
                    yh.r(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) aw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    cl0 cl0Var = new cl0(4);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f24367c = a2;
                    w7Var.d = 20;
                    w7Var.f24368e = cl0Var;
                    aw0Var.f35250b.d((int) Utilities.clamp(aw0Var.f35256s, 10000L, 0L), w7Var, new w3(aw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.j51.j(3, aw0Var.f35250b));
                    if (aw0Var.f35256s > 0) {
                        str = aw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.j51.A(4, str));
                    TLRPC.Chat chat3 = aw0Var.getMessagesController().getChat(Long.valueOf(aw0Var.f35249a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        aw0Var.f35251c.setLink(aw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        yh.r(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.j51.j(5, aw0Var.f35251c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36005b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f36005b;
                Bitmap bitmap3 = (Bitmap) obj;
                tg.b bVar3 = profileActivity.f34650m6;
                bVar3.a((Bitmap) obj2);
                ug.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.f34658n6.d();
                return;
            case 19:
                l31 l31Var = (l31) this.f36005b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var8 = (org.telegram.ui.Components.x51) obj2;
                org.telegram.ui.Components.i61 i61Var = l31Var.f38575f;
                m31 m31Var = l31Var.v;
                ArrayList arrayList12 = m31Var.h;
                eg.q1 q1Var = l31Var.h;
                if (q1Var.getMeasuredHeight() <= 0) {
                    q1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.j51 C = org.telegram.ui.Components.j51.C(q1Var.getMeasuredHeight());
                C.d = -1;
                C.f28021s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((q1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = l31Var.f38572b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || l31Var.f38573c != null || l31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || l31Var.f38573c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(l31Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 0, 0, false, false, m31.u(m31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = l31Var.f38572b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = l31Var.f38573c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
                        org.telegram.ui.Components.j51 k10 = org.telegram.ui.Components.j51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (l31Var.f38572b != null) {
                        for (int i35 = 0; i35 < l31Var.f38572b.options.size(); i35++) {
                            org.telegram.ui.Components.j51 j51Var3 = new org.telegram.ui.Components.j51(30);
                            j51Var3.f28014l = l31Var.f38572b.options.get(i35).text;
                            j51Var3.f28013k = R.drawable.msg_arrowright;
                            j51Var3.d = i35;
                            arrayList11.add(j51Var3);
                            measuredHeight += 50;
                        }
                    } else if (l31Var.f38573c != null) {
                        for (int i36 = 0; i36 < l31Var.f38573c.options.size(); i36++) {
                            org.telegram.ui.Components.j51 j51Var4 = new org.telegram.ui.Components.j51(30);
                            j51Var4.f28014l = l31Var.f38573c.options.get(i36).text;
                            j51Var4.f28013k = R.drawable.msg_arrowright;
                            j51Var4.d = i36;
                            arrayList11.add(j51Var4);
                            measuredHeight += 50;
                        }
                    } else if (l31Var.d != null) {
                        if (l31Var.f38576n == null) {
                            j31 j31Var = new j31(l31Var, l31Var.getContext(), m31.v(m31Var));
                            l31Var.f38576n = j31Var;
                            j31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = l31Var.f38576n.f22955b;
                        if (l31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.j51 k11 = org.telegram.ui.Components.j51.k(l31Var.f38576n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = m31Var.f38960r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(m31.w(m31Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        yh.A(i13, arrayList11);
                        if (l31Var.f38577r == null) {
                            qh.d dVar = new qh.d(l31Var.getContext(), m31.x(m31Var), true);
                            l31Var.f38578s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(l31Var.getContext());
                            l31Var.f38577r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, m31.y(m31Var)));
                            l31Var.f38577r.addView(l31Var.f38578s, k7.c6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(l31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, m31.A(m31Var)));
                            l31Var.f38577r.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        qh.d dVar2 = l31Var.f38578s;
                        if (!l31Var.d.optional && TextUtils.isEmpty(l31Var.f38576n.getText())) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        dVar2.setEnabled(z4);
                        l31Var.f38578s.setOnClickListener(new f60(l31Var, 29));
                        org.telegram.ui.Components.j51 k12 = org.telegram.ui.Components.j51.k(l31Var.f38577r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.j51) l.d.i(1, arrayList11)).f28012j = true;
                    if (m31Var.d && l31Var.f38571a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(l31Var.getContext());
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7)), org.telegram.ui.ActionBar.k6.U0(l31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21624b7, m31.B(m31Var))), 0, 0);
                        pqVar.f30173w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(l31Var.getContext(), null);
                        g90Var.setTextSize(1, 14.0f);
                        g90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), m31.C(m31Var)));
                        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, m31.E(m31Var)));
                        g90Var.setGravity(17);
                        frameLayout2.addView(g90Var, k7.c6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.j51 k13 = org.telegram.ui.Components.j51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (i61Var != null) {
                    if (m31.F(m31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        i61Var.U2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    i61Var.U2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.x51 x51Var9 = (org.telegram.ui.Components.x51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((r31) this.f36005b).U));
                return;
            case 21:
                org.telegram.ui.Components.x51 x51Var10 = (org.telegram.ui.Components.x51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((b41) this.f36005b).U));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f36005b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.x51 x51Var11 = (org.telegram.ui.Components.x51) obj2;
                c71.Q((c71) this.f36005b, (ArrayList) obj);
                return;
            case 24:
                b71 b71Var = (b71) this.f36005b;
                ArrayList arrayList13 = b71Var.f35374e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = b71Var.f35371a;
                ArrayList arrayList14 = b71Var.d;
                if (tL_error5 != null) {
                    if (b71Var.f35377r) {
                        arrayList14.clear();
                        b71Var.f35377r = false;
                    }
                    b71Var.h = true;
                    b71Var.f35375f = false;
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
                if (b71Var.f35377r) {
                    arrayList14.clear();
                    b71Var.f35377r = false;
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
                    b71Var.h = true;
                }
                b71Var.f35375f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                f71 f71Var = (f71) this.f36005b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var12 = (org.telegram.ui.Components.x51) obj2;
                int i39 = f71Var.Y;
                oh.l6 l6Var = f71Var.W;
                if (l6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l6Var.f17402i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = oa1.f39697b;
                        org.telegram.ui.Components.j51 J6 = org.telegram.ui.Components.j51.J(oa1.class);
                        J6.f28023u = 1;
                        J6.f28027z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f21080id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f28009f = true;
                        J6.v = i39;
                        J6.K(f71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f28023u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (l6Var.k() || !l6Var.f17411r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.j51 o10 = org.telegram.ui.Components.j51.o(i16, 34);
                                o10.f28023u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.x51 x51Var13 = (org.telegram.ui.Components.x51) obj2;
                p81.a0((p81) this.f36005b, (ArrayList) obj);
                return;
            case 27:
                z81 z81Var = (z81) this.f36005b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var14 = (org.telegram.ui.Components.x51) obj2;
                LinearLayout linearLayout = z81Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout));
                }
                LinearLayout linearLayout2 = z81Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout2));
                    return;
                }
                return;
            default:
                ud1 ud1Var = (ud1) this.f36005b;
                tg.b bVar4 = ud1Var.B;
                Bitmap bitmap4 = (Bitmap) obj2;
                ud1Var.f41906r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ud1Var.v = paint2;
                Bitmap bitmap5 = ud1Var.f41906r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ud1Var.f41907s = bitmapShader2;
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
                ud1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ud1Var.f41908w = new Matrix();
                bVar4.a(bitmap4);
                ug.c.c(bVar4, ud1Var.f41900b);
                ud1Var.C.d();
                return;
        }
    }
}
