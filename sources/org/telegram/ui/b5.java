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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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

    public final int f36697a;

    public final Object f36698b;

    public b5(Object obj, int i10) {
        this.f36697a = i10;
        this.f36698b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        c91 c91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i10;
        TL_stories.StoryItem storyItem;
        int i11 = 15;
        final int i12 = 1;
        final int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        z = false;
        boolean z10 = false;
        switch (this.f36697a) {
            case 0:
                c5 c5Var = (c5) this.f36698b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f36956w = false;
                og.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                pg.c.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                }
                break;
            case 1:
                j9 j9Var = (j9) this.f36698b;
                ArrayList arrayList = (ArrayList) obj;
                boolean zIsEmpty = j9Var.G.isEmpty();
                ArrayList arrayList2 = j9Var.C;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                if (!zIsEmpty || !zIsEmpty2) {
                    org.telegram.ui.Components.n41 n41VarC = org.telegram.ui.Components.n41.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    n41VarC.f30849q = true;
                    arrayList.add(n41VarC);
                    if (!j9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.n41 n41VarC2 = org.telegram.ui.Components.n41.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        n41VarC2.f30849q = true;
                        arrayList.add(n41VarC2);
                    }
                    arrayList.add(org.telegram.ui.Components.n41.B(null));
                }
                if (!zIsEmpty) {
                    ArrayList arrayList3 = j9Var.G;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = j9Var.getMessagesController().getChat(l10)) != null) {
                            n8 n8Var = new n8(j9Var, i13);
                            int i20 = h9.f38730a;
                            org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(h9.class);
                            n41VarJ.G = chat;
                            n41VarJ.D = n8Var;
                            arrayList.add(n41VarJ);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.n41.B(null));
                }
                if (!zIsEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        f9 f9Var = (f9) obj4;
                        nh.x1 x1Var = new nh.x1(i11, j9Var, f9Var);
                        int i21 = d9.f37305a;
                        org.telegram.ui.Components.n41 n41VarJ2 = org.telegram.ui.Components.n41.J(d9.class);
                        n41VarJ2.G = f9Var;
                        n41VarJ2.D = x1Var;
                        n41VarJ2.K(j9Var.l0(f9Var.f38009c));
                        arrayList.add(n41VarJ2);
                    }
                    if (!j9Var.F) {
                        arrayList.add(org.telegram.ui.Components.n41.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.n41.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.n41.o(-3, 8));
                    }
                }
                break;
            case 2:
                fe feVar = (fe) this.f36698b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(feVar.f38100u0).getChat(Long.valueOf(-feVar.f38101v0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(feVar.f38100u0).getChatFull(-feVar.f38101v0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (feVar.f38081b1) {
                    arrayList4.add(org.telegram.ui.Components.n41.g(feVar.f38104y0));
                    c91 c91Var2 = feVar.f38090k1;
                    if (c91Var2 == null || c91Var2.f37030l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.n41.h(5, i22, c91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.n41.A(-1, null));
                    }
                    c91 c91Var3 = feVar.l1;
                    if (c91Var3 != null && !c91Var3.f37030l) {
                        arrayList4.add(org.telegram.ui.Components.n41.h(2, i22, c91Var3));
                        arrayList4.add(org.telegram.ui.Components.n41.A(-2, charSequence));
                    }
                }
                if (feVar.f38082c1 && (c91Var = feVar.f38091m1) != null && !c91Var.f37030l) {
                    arrayList4.add(org.telegram.ui.Components.n41.h(2, i22, c91Var));
                    arrayList4.add(org.telegram.ui.Components.n41.A(-3, null));
                }
                if (feVar.f38092n1) {
                    arrayList4.add(org.telegram.ui.Components.n41.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.n41.u(feVar.f38093o1));
                    arrayList4.add(org.telegram.ui.Components.n41.u(feVar.f38094p1));
                    arrayList4.add(org.telegram.ui.Components.n41.u(feVar.f38095q1));
                    arrayList4.add(org.telegram.ui.Components.n41.A(-4, feVar.A0));
                }
                if (chat2 != null && chat2.creator) {
                    if (feVar.f38081b1) {
                        arrayList4.add(org.telegram.ui.Components.n41.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.n41.k(feVar.C0));
                        arrayList4.add(org.telegram.ui.Components.n41.A(-5, feVar.f38105z0));
                        int i23 = MessagesController.getInstance(feVar.f38100u0).channelRestrictSponsoredLevelMin;
                        CharSequence string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = feVar.f38103x0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append("  L");
                            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(0, new mo0(i24, context, null, false));
                            cqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.n41 n41VarI = org.telegram.ui.Components.n41.i(1, string);
                        if (feVar.f38103x0 >= i23 && feVar.f38088i1) {
                            z10 = true;
                        }
                        n41VarI.K(z10);
                        arrayList4.add(n41VarI);
                        arrayList4.add(org.telegram.ui.Components.n41.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (feVar.f38082c1) {
                        arrayList4.add(org.telegram.ui.Components.n41.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.n41.j(3, feVar.I0));
                        arrayList4.add(org.telegram.ui.Components.n41.A(-6, feVar.B0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(feVar.f38100u0).getChat(Long.valueOf(-feVar.f38101v0))) && MessagesController.getInstance(feVar.f38100u0).starrefConnectAllowed) {
                    arrayList4.add(nh.g.a(4, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, feVar.f38099t0), R.drawable.filled_earn_stars, jo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.n41.A(-7, null));
                }
                if (feVar.f38080a1.a()) {
                    arrayList4.add(org.telegram.ui.Components.n41.p(feVar.f38080a1, AndroidUtilities.dp(24.0f), true));
                } else {
                    arrayList4.add(org.telegram.ui.Components.n41.A(-10, null));
                }
                break;
            case 3:
                zd zdVar = (zd) this.f36698b;
                ArrayList arrayList5 = (ArrayList) obj;
                be beVar = zdVar.f45144f;
                int i25 = zdVar.d;
                if (i25 == 0) {
                    ArrayList arrayList6 = beVar.f36790n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i26 = hh.ia.f9496a;
                        org.telegram.ui.Components.n41 n41VarJ3 = org.telegram.ui.Components.n41.J(hh.ia.class);
                        n41VarJ3.G = (TL_stars.StarsTransaction) obj5;
                        n41VarJ3.f30849q = true;
                        arrayList5.add(n41VarJ3);
                    }
                    if (!TextUtils.isEmpty(beVar.f36791r)) {
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                    }
                } else if (i25 == 1) {
                    ArrayList arrayList7 = beVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i27 = hh.ia.f9496a;
                        org.telegram.ui.Components.n41 n41VarJ4 = org.telegram.ui.Components.n41.J(hh.ia.class);
                        n41VarJ4.G = (TL_stars.StarsTransaction) obj6;
                        n41VarJ4.f30849q = true;
                        arrayList5.add(n41VarJ4);
                    }
                    if (!TextUtils.isEmpty(beVar.f36789f)) {
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                    }
                }
                break;
            case 4:
                jo joVar = (jo) this.f36698b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    joVar.getClass();
                    org.telegram.ui.Components.mc.a0(joVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(joVar.f39414g0);
                AndroidUtilities.removeFromParent(joVar.f39409d0);
                AndroidUtilities.removeFromParent(joVar.f39413f0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new eq((lr) this.f36698b, i12), 1000L);
                break;
            case 6:
                ((g5.b) this.f36698b).r(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                js jsVar = (js) this.f36698b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.R));
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.f39484b));
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.f39485c));
                if (TextUtils.isEmpty(jsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.n41.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (jsVar.G) {
                    arrayList8.add(org.telegram.ui.Components.n41.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.n41.B(null));
                }
                if (jsVar.E && jsVar.G) {
                    org.telegram.ui.Components.n41 n41VarI2 = org.telegram.ui.Components.n41.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    n41VarI2.K(jsVar.T);
                    arrayList8.add(n41VarI2);
                    arrayList8.add(org.telegram.ui.Components.n41.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.d));
                org.telegram.ui.Cells.pa.A(R.string.AddNotesInfo, arrayList8);
                if (jsVar.E) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.D);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.B));
                    }
                    arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.f39492x));
                    arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.f39493y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.A));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.n41.B(null));
                    org.telegram.ui.Components.n41 n41VarE = org.telegram.ui.Components.n41.e(1, LocaleController.getString(R.string.DeleteContact));
                    n41VarE.f30850r = true;
                    arrayList8.add(n41VarE);
                }
                arrayList8.add(org.telegram.ui.Components.n41.B(charSequence2));
                if (jsVar.U) {
                    AndroidUtilities.runOnUIThread(new as(jsVar, user, i13));
                    jsVar.U = false;
                    AndroidUtilities.runOnUIThread(new bs(jsVar, i13), 200L);
                }
                break;
            case 8:
                kt.a((kt) this.f36698b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                ft ftVar = (ft) this.f36698b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                kt ktVar = ftVar.f38203a;
                ht htVar = ktVar.f39868l;
                if (htVar != null) {
                    htVar.E(charSequence3, TextUtils.join("", ktVar.f39871o), callback != null ? new df(26, ftVar, callback) : null);
                    if (callback == null) {
                        ktVar.p();
                    }
                }
                break;
            case 10:
                vt.R((vt) this.f36698b, (ArrayList) obj);
                break;
            case 11:
                gy gyVar = (gy) this.f36698b;
                gyVar.L1 = (Long) obj;
                gyVar.U4();
                break;
            case 12:
                ((Runnable) this.f36698b).run();
                break;
            case 13:
                final yy yyVar = (yy) this.f36698b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i28 = R.raw.topics_top;
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(2);
                n41Var.f30844l = string2;
                n41Var.f30843k = i28;
                arrayList9.add(n41Var);
                org.telegram.ui.Components.n41 n41VarI3 = org.telegram.ui.Components.n41.i(1, LocaleController.getString(R.string.TopicsEnable));
                n41VarI3.K(yyVar.f44966c);
                arrayList9.add(n41VarI3);
                if (yyVar.f44966c) {
                    arrayList9.add(org.telegram.ui.Components.n41.B(null));
                    arrayList9.add(org.telegram.ui.Components.n41.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    xy xyVar = (xy) view.getParent();
                                    yy yyVar2 = yyVar;
                                    yyVar2.d = true;
                                    xyVar.a(true, true);
                                    cg.u0 u0Var = yyVar2.f44968f;
                                    if (u0Var != null) {
                                        u0Var.run(Boolean.valueOf(yyVar2.f44966c), Boolean.valueOf(yyVar2.d));
                                    }
                                    yyVar2.U();
                                    break;
                                default:
                                    xy xyVar2 = (xy) view.getParent();
                                    yy yyVar3 = yyVar;
                                    yyVar3.d = false;
                                    xyVar2.a(false, true);
                                    cg.u0 u0Var2 = yyVar3.f44968f;
                                    if (u0Var2 != null) {
                                        u0Var2.run(Boolean.valueOf(yyVar3.f44966c), Boolean.valueOf(yyVar3.d));
                                    }
                                    yyVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    xy xyVar = (xy) view.getParent();
                                    yy yyVar2 = yyVar;
                                    yyVar2.d = true;
                                    xyVar.a(true, true);
                                    cg.u0 u0Var = yyVar2.f44968f;
                                    if (u0Var != null) {
                                        u0Var.run(Boolean.valueOf(yyVar2.f44966c), Boolean.valueOf(yyVar2.d));
                                    }
                                    yyVar2.U();
                                    break;
                                default:
                                    xy xyVar2 = (xy) view.getParent();
                                    yy yyVar3 = yyVar;
                                    yyVar3.d = false;
                                    xyVar2.a(false, true);
                                    cg.u0 u0Var2 = yyVar3.f44968f;
                                    if (u0Var2 != null) {
                                        u0Var2.run(Boolean.valueOf(yyVar3.f44966c), Boolean.valueOf(yyVar3.d));
                                    }
                                    yyVar3.U();
                                    break;
                            }
                        }
                    };
                    int i29 = wy.f44210a;
                    org.telegram.ui.Components.n41 n41VarJ5 = org.telegram.ui.Components.n41.J(wy.class);
                    n41VarJ5.d = 2;
                    n41VarJ5.G = onClickListener;
                    n41VarJ5.H = onClickListener2;
                    n41VarJ5.K(yyVar.d);
                    arrayList9.add(n41VarJ5);
                    org.telegram.ui.Cells.pa.A(R.string.TopicsLayoutInfo, arrayList9);
                }
                break;
            case 14:
                ob0 ob0Var = (ob0) this.f36698b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ob0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ob0Var.f41051b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(n2VarU.getContext(), tL_tones.tones.get(0), n2VarU.getResourceProvider()).show();
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.y1.q(R.string.AIEditorStyleNotFound, ob0.b(), R.raw.error, 36);
                    } else {
                        ob0.b().d0(tL_error2, false);
                    }
                }
                break;
            case 15:
                jv0 jv0Var = (jv0) this.f36698b;
                og.b bVar2 = jv0Var.B;
                Bitmap bitmap = (Bitmap) obj2;
                jv0Var.f39523s = (Bitmap) obj;
                Paint paint = new Paint(1);
                jv0Var.f39524w = paint;
                Bitmap bitmap2 = jv0Var.f39523s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                jv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                jv0Var.f39524w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                jv0Var.f39525x = new Matrix();
                bVar2.a(bitmap);
                pg.c.c(bVar2, jv0Var.f39517c);
                jv0Var.C.d();
                break;
            case 16:
                qv0 qv0Var = (qv0) this.f36698b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i30 = R.raw.bubble;
                org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(2);
                n41Var2.f30844l = string3;
                n41Var2.f30843k = i30;
                arrayList10.add(n41Var2);
                org.telegram.ui.Components.n41 n41VarI4 = org.telegram.ui.Components.n41.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                n41VarI4.K(qv0Var.f41756r);
                arrayList10.add(n41VarI4);
                arrayList10.add(org.telegram.ui.Components.n41.A(2, null));
                if (qv0Var.f41756r) {
                    org.telegram.ui.Cells.pa.o(R.string.PriceForEachSuggestion, arrayList10);
                    int[] iArrA = org.telegram.ui.Cells.u7.a((int) qv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    j70 j70Var = new j70(10);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.f25681c = iArrA;
                    t7Var.d = 20;
                    t7Var.f25682e = j70Var;
                    qv0Var.f41751b.d((int) Utilities.clamp(qv0Var.f41757s, 10000L, 0L), t7Var, new x3(qv0Var, i11));
                    arrayList10.add(org.telegram.ui.Components.n41.j(3, qv0Var.f41751b));
                    arrayList10.add(org.telegram.ui.Components.n41.A(4, qv0Var.f41757s > 0 ? qv0Var.W() : null));
                    TLRPC.Chat chat3 = qv0Var.getMessagesController().getChat(Long.valueOf(qv0Var.f41750a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        qv0Var.f41752c.setLink(qv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        org.telegram.ui.Cells.pa.o(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.n41.j(5, qv0Var.f41752c));
                        break;
                    }
                }
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36698b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f35913e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f36698b;
                og.b bVar3 = profileActivity.f36006l6;
                bVar3.a((Bitmap) obj2);
                pg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.f36012m6.d();
                break;
            case 19:
                w21 w21Var = (w21) this.f36698b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var = w21Var.f43585f;
                x21 x21Var = w21Var.v;
                ArrayList arrayList12 = x21Var.h;
                ag.w wVar = w21Var.h;
                if (wVar.getMeasuredHeight() <= 0) {
                    wVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.n41 n41VarC3 = org.telegram.ui.Components.n41.C(wVar.getMeasuredHeight());
                n41VarC3.d = -1;
                n41VarC3.f30851s = true;
                arrayList11.add(n41VarC3);
                int measuredHeight = (int) ((wVar.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.f43582b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.f43583c != null || w21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.f43583c != null) {
                        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(w21Var.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 0, 0, false, false, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = w21Var.f43582b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            j4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.f43583c;
                            if (tL_reportResultChooseOption != null) {
                                j4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        j4Var.setBackgroundColor(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                        org.telegram.ui.Components.n41 n41VarK = org.telegram.ui.Components.n41.k(j4Var);
                        n41VarK.d = -2;
                        arrayList11.add(n41VarK);
                        measuredHeight += 40;
                    }
                    if (w21Var.f43582b != null) {
                        for (int i31 = 0; i31 < w21Var.f43582b.options.size(); i31++) {
                            org.telegram.ui.Components.n41 n41Var3 = new org.telegram.ui.Components.n41(30);
                            n41Var3.f30844l = w21Var.f43582b.options.get(i31).text;
                            n41Var3.f30843k = R.drawable.msg_arrowright;
                            n41Var3.d = i31;
                            arrayList11.add(n41Var3);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.f43583c != null) {
                        for (int i32 = 0; i32 < w21Var.f43583c.options.size(); i32++) {
                            org.telegram.ui.Components.n41 n41Var4 = new org.telegram.ui.Components.n41(30);
                            n41Var4.f30844l = w21Var.f43583c.options.get(i32).text;
                            n41Var4.f30843k = R.drawable.msg_arrowright;
                            n41Var4.d = i32;
                            arrayList11.add(n41Var4);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.d != null) {
                        if (w21Var.f43586n == null) {
                            u21 u21Var = new u21(w21Var, w21Var.getContext(), ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider);
                            w21Var.f43586n = u21Var;
                            u21Var.setShowLimitWhenNear(100);
                        }
                        w21Var.f43586n.f24370b.setHint(LocaleController.getString(w21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.n41 n41VarK2 = org.telegram.ui.Components.n41.k(w21Var.f43586n);
                        n41VarK2.d = -3;
                        arrayList11.add(n41VarK2);
                        long j10 = x21Var.f44267r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i10 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i10 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) x21Var).currentAccount).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        org.telegram.ui.Cells.pa.A(i10, arrayList11);
                        if (w21Var.f43587r == null) {
                            lh.d dVar = new lh.d(w21Var.getContext(), ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider, true);
                            w21Var.f43588s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(w21Var.getContext());
                            w21Var.f43587r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider));
                            w21Var.f43587r.addView(w21Var.f43588s, h7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(w21Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider));
                            w21Var.f43587r.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        w21Var.f43588s.setEnabled(w21Var.d.optional || !TextUtils.isEmpty(w21Var.f43586n.getText()));
                        w21Var.f43588s.setOnClickListener(new u50(w21Var, 29));
                        org.telegram.ui.Components.n41 n41VarK3 = org.telegram.ui.Components.n41.k(w21Var.f43587r);
                        n41VarK3.d = -4;
                        arrayList11.add(n41VarK3);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.n41) i0.a.i(1, arrayList11)).f30842j = true;
                    if (x21Var.d && w21Var.f43581a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(w21Var.getContext());
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7)), org.telegram.ui.ActionBar.g6.U0(w21Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23018b7, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider)), 0, 0);
                        dqVar.f27828w = true;
                        frameLayout2.setBackground(dqVar);
                        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(w21Var.getContext(), null);
                        p80Var.setTextSize(1, 14.0f);
                        p80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider));
                        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider));
                        p80Var.setGravity(17);
                        frameLayout2.addView(p80Var, h7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.n41 n41VarK4 = org.telegram.ui.Components.n41.k(frameLayout2);
                        n41VarK4.d = -3;
                        arrayList11.add(n41VarK4);
                        measuredHeight += 46;
                    }
                }
                if (k51Var != null) {
                    if (((org.telegram.ui.ActionBar.e3) x21Var).containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        k51Var.T2.k1(false);
                    } else {
                        Collections.reverse(arrayList11);
                        k51Var.T2.k1(true);
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((c31) this.f36698b).T));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((m31) this.f36698b).T));
                break;
            case 22:
                ((SecretMediaViewer) this.f36698b).getClass();
                break;
            case 23:
                k61.Q((k61) this.f36698b, (ArrayList) obj);
                break;
            case 24:
                j61 j61Var = (j61) this.f36698b;
                ArrayList arrayList13 = j61Var.f39272e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i33 = j61Var.f39269a;
                ArrayList arrayList14 = j61Var.d;
                if (tL_error3 != null) {
                    if (j61Var.f39275r) {
                        arrayList14.clear();
                        j61Var.f39275r = false;
                    }
                    j61Var.h = true;
                    j61Var.f39273f = false;
                    int size5 = arrayList13.size();
                    while (i15 < size5) {
                        Object obj7 = arrayList13.get(i15);
                        i15++;
                        ((Runnable) obj7).run();
                    }
                } else {
                    MessagesController.getInstance(i33).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i33).putChats(channels_channelparticipants.chats, false);
                    if (j61Var.f39275r) {
                        arrayList14.clear();
                        j61Var.f39275r = false;
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
                        j61Var.h = true;
                    }
                    j61Var.f39273f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                }
                break;
            case 25:
                n61 n61Var = (n61) this.f36698b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i35 = n61Var.X;
                jh.j6 j6Var = n61Var.V;
                if (j6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.n41.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = j6Var.f13540i;
                    int size8 = arrayList17.size();
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < size8) {
                        Object obj9 = arrayList17.get(i37);
                        i37++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i38 = x91.f44359b;
                        org.telegram.ui.Components.n41 n41VarJ6 = org.telegram.ui.Components.n41.J(x91.class);
                        n41VarJ6.f30853u = 1;
                        n41VarJ6.f30857z = 0;
                        n41VarJ6.G = messageObject;
                        n41VarJ6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.f22617id;
                        n41VarJ6.f30839f = true;
                        n41VarJ6.v = i35;
                        n41VarJ6.K(n61Var.W.containsKey(Integer.valueOf(messageObject.getId())));
                        n41VarJ6.f30853u = 1;
                        arrayList16.add(n41VarJ6);
                        i36--;
                        if (i36 == 0) {
                            i36 = i35;
                        }
                    }
                    if (j6Var.k() || !j6Var.f13549r) {
                        while (true) {
                            if (i14 < (i36 <= 0 ? i35 : i36)) {
                                i14++;
                                org.telegram.ui.Components.n41 n41VarO = org.telegram.ui.Components.n41.o(i14, 34);
                                n41VarO.f30853u = 1;
                                arrayList16.add(n41VarO);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.n41.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                x71.a0((x71) this.f36698b, (ArrayList) obj);
                break;
            case 27:
                i81 i81Var = (i81) this.f36698b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = i81Var.U;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.n41.k(linearLayout));
                }
                LinearLayout linearLayout2 = i81Var.V;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.n41.k(linearLayout2));
                }
                break;
            default:
                dd1 dd1Var = (dd1) this.f36698b;
                og.b bVar4 = dd1Var.A;
                Bitmap bitmap3 = (Bitmap) obj2;
                dd1Var.f37370r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                dd1Var.v = paint2;
                Bitmap bitmap4 = dd1Var.f37370r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                dd1Var.f37371s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                dd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                dd1Var.f37372w = new Matrix();
                bVar4.a(bitmap3);
                pg.c.c(bVar4, dd1Var.f37365b);
                dd1Var.B.d();
                break;
        }
    }
}
