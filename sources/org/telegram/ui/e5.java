package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
public final class e5 implements Utilities.Callback2 {
    public final int f38990a;
    public final Object f38991b;

    public e5(Object obj, int i10) {
        this.f38990a = i10;
        this.f38991b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        i91 i91Var;
        CharSequence charSequence;
        ArrayList arrayList;
        String str;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.Components.oy oyVar;
        float f7;
        float f10;
        String str2;
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
        r10 = false;
        boolean z11 = false;
        switch (this.f38990a) {
            case 0:
                f5 f5Var = (f5) this.f38991b;
                f5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                f5Var.f39260w = false;
                hh.b bVar = f5Var.h;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, f5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                o9 o9Var = (o9) this.f38991b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) obj2;
                boolean isEmpty = o9Var.F.isEmpty();
                ArrayList arrayList3 = o9Var.f42132w;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.t61 c10 = org.telegram.ui.Components.t61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f32880q = true;
                    arrayList2.add(c10);
                    arrayList2.add(org.telegram.ui.Components.t61.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = o9Var.F;
                    int size = arrayList4.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj3 = arrayList4.get(i20);
                        i20++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = o9Var.getMessagesController().getChat(l4)) != null) {
                            q8 q8Var = new q8(o9Var, 0);
                            int i21 = m9.f41499a;
                            org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(m9.class);
                            K.G = chat;
                            K.D = q8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.t61.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList3.get(i15);
                        i15++;
                        k9 k9Var = (k9) obj4;
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(7, o9Var, k9Var);
                        int i22 = i9.f40176a;
                        org.telegram.ui.Components.t61 K2 = org.telegram.ui.Components.t61.K(i9.class);
                        K2.G = k9Var;
                        K2.D = u1Var;
                        K2.L(o9Var.g0(k9Var.f40836c));
                        arrayList2.add(K2);
                    }
                    if (!o9Var.E) {
                        arrayList2.add(org.telegram.ui.Components.t61.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.t61.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.t61.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f38991b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var2 = (org.telegram.ui.Components.j71) obj2;
                keVar.R0 = -1;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f40907o0).getChat(Long.valueOf(-keVar.f40909p0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f40907o0).getChatFull(-keVar.f40909p0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f40894b1) {
                    arrayList5.add(org.telegram.ui.Components.t61.g(keVar.f40915s0));
                    i91 i91Var2 = keVar.l1;
                    if (i91Var2 != null && !i91Var2.f40194l) {
                        arrayList5.add(org.telegram.ui.Components.t61.h(5, i10, i91Var2));
                        charSequence = null;
                        arrayList5.add(org.telegram.ui.Components.t61.B(-1, null));
                    } else {
                        charSequence = null;
                    }
                    i91 i91Var3 = keVar.f40904m1;
                    if (i91Var3 != null && !i91Var3.f40194l) {
                        arrayList5.add(org.telegram.ui.Components.t61.h(2, i10, i91Var3));
                        arrayList5.add(org.telegram.ui.Components.t61.B(-2, charSequence));
                    }
                }
                if (keVar.f40895c1 && (i91Var = keVar.f40906n1) != null && !i91Var.f40194l) {
                    arrayList5.add(org.telegram.ui.Components.t61.h(2, i10, i91Var));
                    arrayList5.add(org.telegram.ui.Components.t61.B(-3, null));
                }
                if (keVar.f40908o1) {
                    arrayList5.add(org.telegram.ui.Components.t61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList5.add(org.telegram.ui.Components.t61.v(keVar.f40910p1));
                    arrayList5.add(org.telegram.ui.Components.t61.v(keVar.f40912q1));
                    arrayList5.add(org.telegram.ui.Components.t61.v(keVar.f40914r1));
                    arrayList5.add(org.telegram.ui.Components.t61.B(-4, keVar.f40918u0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f40894b1) {
                        arrayList5.add(org.telegram.ui.Components.t61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList5.add(org.telegram.ui.Components.t61.k(keVar.f40920w0));
                        arrayList5.add(org.telegram.ui.Components.t61.B(-5, keVar.f40917t0));
                        int i23 = MessagesController.getInstance(keVar.f40907o0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.f40913r0 < i23) {
                            i11 = i23;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(0, new ap0(i11, context, null, false));
                            zqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.t61 i24 = org.telegram.ui.Components.t61.i(1, string);
                        if (keVar.f40913r0 >= i23 && keVar.f40902j1) {
                            z11 = true;
                        }
                        i24.L(z11);
                        arrayList5.add(i24);
                        arrayList5.add(org.telegram.ui.Components.t61.B(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f40895c1) {
                        arrayList5.add(org.telegram.ui.Components.t61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList5.add(org.telegram.ui.Components.t61.j(3, keVar.C0));
                        arrayList5.add(org.telegram.ui.Components.t61.B(-6, keVar.f40919v0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f40907o0).getChat(Long.valueOf(-keVar.f40909p0))) && MessagesController.getInstance(keVar.f40907o0).starrefConnectAllowed) {
                    arrayList5.add(hi.g.a(4, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, keVar.f40905n0), R.drawable.filled_earn_stars, mo.e0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList5.add(org.telegram.ui.Components.t61.B(-7, null));
                }
                if (keVar.f40893a1.a()) {
                    keVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.t61.n(keVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.t61.B(-10, null));
                return;
            case 3:
                ee eeVar = (ee) this.f38991b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var3 = (org.telegram.ui.Components.j71) obj2;
                ge geVar = eeVar.f39094f;
                int i25 = eeVar.d;
                int i26 = ge.f39618x;
                if (i25 == 0) {
                    arrayList = geVar.f39624r;
                } else {
                    arrayList = geVar.f39623n;
                }
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj5 = arrayList.get(i19);
                    i19++;
                    int i27 = bi.xc.f5710a;
                    org.telegram.ui.Components.t61 K3 = org.telegram.ui.Components.t61.K(bi.xc.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f32880q = true;
                    arrayList6.add(K3);
                }
                if (i25 == 0) {
                    str = geVar.f39625s;
                } else {
                    str = geVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.t61.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.t61.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.t61.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                mo moVar = (mo) this.f38991b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    moVar.getClass();
                    org.telegram.ui.Components.wc.b0(moVar).g0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(moVar.f41610j0);
                AndroidUtilities.removeFromParent(moVar.f41607g0);
                AndroidUtilities.removeFromParent(moVar.f41609i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new hq((kr) this.f38991b, 1), 1000L);
                return;
            case 6:
                ((rf.b) this.f38991b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                js jsVar = (js) this.f38991b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var4 = (org.telegram.ui.Components.j71) obj2;
                TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H));
                arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.V));
                arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.f40733b));
                arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.f40734c));
                if (TextUtils.isEmpty(jsVar.c0())) {
                    arrayList7.add(org.telegram.ui.Components.t61.C(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (jsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.t61.C(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.t61.C(null));
                }
                if (jsVar.I && jsVar.K) {
                    org.telegram.ui.Components.t61 i28 = org.telegram.ui.Components.t61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i28.L(jsVar.X);
                    arrayList7.add(i28);
                    arrayList7.add(org.telegram.ui.Components.t61.C(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.d));
                ic.a.z(R.string.AddNotesInfo, arrayList7);
                if (!jsVar.I) {
                    TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.f40740x));
                    arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.f40741y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.t61.k(jsVar.E));
                    }
                    charSequence2 = null;
                    arrayList7.add(org.telegram.ui.Components.t61.C(null));
                    org.telegram.ui.Components.t61 e = org.telegram.ui.Components.t61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f32881r = true;
                    arrayList7.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList7.add(org.telegram.ui.Components.t61.C(charSequence2));
                if (jsVar.Y) {
                    AndroidUtilities.runOnUIThread(new bs(jsVar, user, 0));
                    jsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new zr(jsVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ft.a((ft) this.f38991b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                bt btVar = (bt) this.f38991b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ft ftVar = btVar.f38158a;
                dt dtVar = ftVar.f39459l;
                if (dtVar != null) {
                    String join = TextUtils.join("", ftVar.f39462o);
                    if (callback != null) {
                        oyVar = new org.telegram.ui.Components.oy(9, btVar, callback);
                    } else {
                        oyVar = null;
                    }
                    dtVar.O(charSequence3, join, oyVar);
                    if (callback == null) {
                        ftVar.n();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.j71 j71Var5 = (org.telegram.ui.Components.j71) obj2;
                rt.R((rt) this.f38991b, (ArrayList) obj);
                return;
            case 11:
                cy cyVar = (cy) this.f38991b;
                Long l10 = (Long) obj2;
                cyVar.P1 = (Long) obj;
                cyVar.c5();
                return;
            case 12:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f38991b).run();
                return;
            case 13:
                final uy uyVar = (uy) this.f38991b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var6 = (org.telegram.ui.Components.j71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i29 = R.raw.topics_top;
                org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(2);
                t61Var.f32875l = string2;
                t61Var.f32874k = i29;
                arrayList8.add(t61Var);
                org.telegram.ui.Components.t61 i30 = org.telegram.ui.Components.t61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i30.L(uyVar.f44550c);
                arrayList8.add(i30);
                if (uyVar.f44550c) {
                    arrayList8.add(org.telegram.ui.Components.t61.C(null));
                    arrayList8.add(org.telegram.ui.Components.t61.u(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    uy uyVar2 = uyVar;
                                    uyVar2.d = true;
                                    ((ty) view.getParent()).a(true, true);
                                    bi.m5 m5Var = uyVar2.f44551f;
                                    if (m5Var != null) {
                                        m5Var.run(Boolean.valueOf(uyVar2.f44550c), Boolean.valueOf(uyVar2.d));
                                    }
                                    uyVar2.V();
                                    return;
                                default:
                                    uy uyVar3 = uyVar;
                                    uyVar3.d = false;
                                    ((ty) view.getParent()).a(false, true);
                                    bi.m5 m5Var2 = uyVar3.f44551f;
                                    if (m5Var2 != null) {
                                        m5Var2.run(Boolean.valueOf(uyVar3.f44550c), Boolean.valueOf(uyVar3.d));
                                    }
                                    uyVar3.V();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    uy uyVar2 = uyVar;
                                    uyVar2.d = true;
                                    ((ty) view.getParent()).a(true, true);
                                    bi.m5 m5Var = uyVar2.f44551f;
                                    if (m5Var != null) {
                                        m5Var.run(Boolean.valueOf(uyVar2.f44550c), Boolean.valueOf(uyVar2.d));
                                    }
                                    uyVar2.V();
                                    return;
                                default:
                                    uy uyVar3 = uyVar;
                                    uyVar3.d = false;
                                    ((ty) view.getParent()).a(false, true);
                                    bi.m5 m5Var2 = uyVar3.f44551f;
                                    if (m5Var2 != null) {
                                        m5Var2.run(Boolean.valueOf(uyVar3.f44550c), Boolean.valueOf(uyVar3.d));
                                    }
                                    uyVar3.V();
                                    return;
                            }
                        }
                    };
                    int i31 = sy.f43626a;
                    org.telegram.ui.Components.t61 K4 = org.telegram.ui.Components.t61.K(sy.class);
                    K4.d = 2;
                    K4.G = onClickListener;
                    K4.H = onClickListener2;
                    K4.L(uyVar.d);
                    arrayList8.add(K4);
                    ic.a.z(R.string.TopicsLayoutInfo, arrayList8);
                    return;
                }
                return;
            case 14:
                lb0 lb0Var = (lb0) this.f38991b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                lb0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(lb0Var.f41239b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.t.q(R.string.AIEditorStyleNotFound, lb0.d(), R.raw.error, 36);
                        return;
                    } else {
                        lb0.d().g0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                xv0 xv0Var = (xv0) this.f38991b;
                hh.b bVar2 = xv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                xv0Var.f45884s = (Bitmap) obj;
                Paint paint = new Paint(1);
                xv0Var.f45885w = paint;
                Bitmap bitmap2 = xv0Var.f45884s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                xv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                xv0Var.f45885w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                xv0Var.f45886x = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, xv0Var.f45875c);
                xv0Var.G.d();
                return;
            case 16:
                fw0 fw0Var = (fw0) this.f38991b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var7 = (org.telegram.ui.Components.j71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i32 = R.raw.bubble;
                org.telegram.ui.Components.t61 t61Var2 = new org.telegram.ui.Components.t61(2);
                t61Var2.f32875l = string3;
                t61Var2.f32874k = i32;
                arrayList9.add(t61Var2);
                org.telegram.ui.Components.t61 i33 = org.telegram.ui.Components.t61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i33.L(fw0Var.f39488n);
                arrayList9.add(i33);
                arrayList9.add(org.telegram.ui.Components.t61.B(2, null));
                if (fw0Var.f39488n) {
                    ic.a.p(R.string.PriceForEachSuggestion, arrayList9);
                    int[] a2 = org.telegram.ui.Cells.c8.a((int) fw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(18);
                    org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8();
                    b8Var.f23908c = a2;
                    b8Var.d = 20;
                    b8Var.e = c1Var;
                    fw0Var.f39485b.d((int) Utilities.clamp(fw0Var.f39489r, 10000L, 0L), b8Var, new t3(fw0Var, 19));
                    arrayList9.add(org.telegram.ui.Components.t61.j(3, fw0Var.f39485b));
                    if (fw0Var.f39489r > 0) {
                        str2 = fw0Var.X();
                    } else {
                        str2 = null;
                    }
                    arrayList9.add(org.telegram.ui.Components.t61.B(4, str2));
                    TLRPC.Chat chat3 = fw0Var.getMessagesController().getChat(Long.valueOf(fw0Var.f39484a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        fw0Var.f39486c.setLink(fw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        ic.a.p(R.string.ChannelLinkDirectMessages, arrayList9);
                        arrayList9.add(org.telegram.ui.Components.t61.j(5, fw0Var.f39486c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f38991b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.B0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f38991b;
                Bitmap bitmap3 = (Bitmap) obj;
                hh.b bVar3 = profileActivity.E6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.F6.d();
                return;
            case 19:
                u21 u21Var = (u21) this.f38991b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var8 = (org.telegram.ui.Components.j71) obj2;
                org.telegram.ui.Components.r71 r71Var = u21Var.f43987f;
                v21 v21Var = u21Var.v;
                ArrayList arrayList11 = v21Var.f44581n;
                bi.j5 j5Var = u21Var.h;
                if (j5Var.getMeasuredHeight() <= 0) {
                    j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.t61 D = org.telegram.ui.Components.t61.D(j5Var.getMeasuredHeight());
                D.d = -1;
                D.f32882s = true;
                arrayList10.add(D);
                int measuredHeight = (int) ((j5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u21Var.f43985b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || u21Var.f43986c != null || u21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || u21Var.f43986c != null) {
                        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(u21Var.getContext(), org.telegram.ui.ActionBar.y6.L6, 21, 0, 0, false, false, v21.u(v21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = u21Var.f43985b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            q4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u21Var.f43986c;
                            if (tL_reportResultChooseOption != null) {
                                q4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23427h5, q4Var, v21.v(v21Var));
                        org.telegram.ui.Components.t61 k10 = org.telegram.ui.Components.t61.k(q4Var);
                        k10.d = -2;
                        arrayList10.add(k10);
                        measuredHeight += 40;
                    }
                    if (u21Var.f43985b != null) {
                        for (int i34 = 0; i34 < u21Var.f43985b.options.size(); i34++) {
                            org.telegram.ui.Components.t61 t61Var3 = new org.telegram.ui.Components.t61(30);
                            t61Var3.f32875l = u21Var.f43985b.options.get(i34).text;
                            t61Var3.f32874k = R.drawable.msg_arrowright;
                            t61Var3.d = i34;
                            arrayList10.add(t61Var3);
                            measuredHeight += 50;
                        }
                    } else if (u21Var.f43986c != null) {
                        for (int i35 = 0; i35 < u21Var.f43986c.options.size(); i35++) {
                            org.telegram.ui.Components.t61 t61Var4 = new org.telegram.ui.Components.t61(30);
                            t61Var4.f32875l = u21Var.f43986c.options.get(i35).text;
                            t61Var4.f32874k = R.drawable.msg_arrowright;
                            t61Var4.d = i35;
                            arrayList10.add(t61Var4);
                            measuredHeight += 50;
                        }
                    } else if (u21Var.d != null) {
                        if (u21Var.f43988n == null) {
                            s21 s21Var = new s21(u21Var, u21Var.getContext(), v21.w(v21Var));
                            u21Var.f43988n = s21Var;
                            s21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.e3 e3Var = u21Var.f43988n.d;
                        if (u21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        e3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.t61 k11 = org.telegram.ui.Components.t61.k(u21Var.f43988n);
                        k11.d = -3;
                        arrayList10.add(k11);
                        long j11 = v21Var.f44583s;
                        if (arrayList11 != null && !arrayList11.isEmpty()) {
                            if (arrayList11.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(v21.x(v21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        ic.a.z(i13, arrayList10);
                        if (u21Var.f43989r == null) {
                            fi.d dVar = new fi.d(u21Var.getContext(), v21.y(v21Var), true);
                            u21Var.f43990s = dVar;
                            dVar.i(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(u21Var.getContext());
                            u21Var.f43989r = frameLayout;
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23427h5, frameLayout, v21.A(v21Var));
                            u21Var.f43989r.addView(u21Var.f43990s, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(u21Var.getContext());
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d7, view, v21.B(v21Var));
                            u21Var.f43989r.addView(view, org.telegram.ui.Components.gb1.e(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        fi.d dVar2 = u21Var.f43990s;
                        if (!u21Var.d.optional && TextUtils.isEmpty(u21Var.f43988n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        u21Var.f43990s.setOnClickListener(new x50(u21Var, 29));
                        org.telegram.ui.Components.t61 k12 = org.telegram.ui.Components.t61.k(u21Var.f43989r);
                        k12.d = -4;
                        arrayList10.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.t61) ic.a.g(1, arrayList10)).f32873j = true;
                    if (v21Var.e && u21Var.f43984a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(u21Var.getContext());
                        Drawable mutate = u21Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.f7.y(frameLayout2, mutate, org.telegram.ui.ActionBar.y6.f23318b7, v21.C(v21Var), PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.f7.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.y6.f23299a7, v21.D(v21Var), PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, mutate, 0, 0);
                        arVar.f26599w = true;
                        frameLayout2.setBackground(arVar);
                        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(u21Var.getContext(), null);
                        z90Var.setTextSize(1, 14.0f);
                        z90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), v21.G(v21Var)));
                        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.A6, v21.H(v21Var));
                        z90Var.setGravity(17);
                        frameLayout2.addView(z90Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.t61 k13 = org.telegram.ui.Components.t61.k(frameLayout2);
                        k13.d = -3;
                        arrayList10.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (r71Var != null) {
                    if (v21.I(v21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        r71Var.f32151f3.l1(false);
                        return;
                    }
                    Collections.reverse(arrayList10);
                    r71Var.f32151f3.l1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.j71 j71Var9 = (org.telegram.ui.Components.j71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.t61.k(((a31) this.f38991b).X));
                return;
            case 21:
                org.telegram.ui.Components.j71 j71Var10 = (org.telegram.ui.Components.j71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.t61.k(((m31) this.f38991b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f38991b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.j71 j71Var11 = (org.telegram.ui.Components.j71) obj2;
                m61.Q((m61) this.f38991b, (ArrayList) obj);
                return;
            case 24:
                l61 l61Var = (l61) this.f38991b;
                ArrayList arrayList12 = l61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i36 = l61Var.f41151a;
                ArrayList arrayList13 = l61Var.d;
                if (tL_error5 != null) {
                    if (l61Var.f41156r) {
                        arrayList13.clear();
                        l61Var.f41156r = false;
                    }
                    l61Var.h = true;
                    l61Var.f41154f = false;
                    int size4 = arrayList12.size();
                    while (i17 < size4) {
                        Object obj6 = arrayList12.get(i17);
                        i17++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                MessagesController.getInstance(i36).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i36).putChats(channels_channelparticipants.chats, false);
                if (l61Var.f41156r) {
                    arrayList13.clear();
                    l61Var.f41156r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList14 = channels_channelparticipants.participants;
                int size5 = arrayList14.size();
                int i37 = 0;
                while (i37 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList14.get(i37);
                    i37++;
                    TLObject userOrChat = MessagesController.getInstance(i36).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList13.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    l61Var.h = true;
                }
                l61Var.f41154f = false;
                int size6 = arrayList12.size();
                while (i18 < size6) {
                    Object obj7 = arrayList12.get(i18);
                    i18++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                p61 p61Var = (p61) this.f38991b;
                ArrayList arrayList15 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var12 = (org.telegram.ui.Components.j71) obj2;
                int i38 = p61Var.f42377b0;
                di.z6 z6Var = p61Var.Z;
                if (z6Var != null) {
                    arrayList15.add(org.telegram.ui.Components.t61.D(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList16 = z6Var.f9493i;
                    int size7 = arrayList16.size();
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < size7) {
                        Object obj8 = arrayList16.get(i40);
                        i40++;
                        MessageObject messageObject = (MessageObject) obj8;
                        int i41 = da1.f38811b;
                        org.telegram.ui.Components.t61 K5 = org.telegram.ui.Components.t61.K(da1.class);
                        K5.f32884u = 1;
                        K5.f32888z = 0;
                        K5.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f22266id;
                        } else {
                            j10 = -1;
                        }
                        K5.B = j10;
                        K5.f32870f = true;
                        K5.v = i38;
                        K5.L(p61Var.f42376a0.containsKey(Integer.valueOf(messageObject.getId())));
                        K5.f32884u = 1;
                        arrayList15.add(K5);
                        i39--;
                        if (i39 == 0) {
                            i39 = i38;
                        }
                    }
                    if (z6Var.k() || !z6Var.f9502r) {
                        while (true) {
                            if (i39 <= 0) {
                                i14 = i38;
                            } else {
                                i14 = i39;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.t61 q5 = org.telegram.ui.Components.t61.q(i16, 34);
                                q5.f32884u = 1;
                                arrayList15.add(q5);
                            }
                        }
                    }
                    arrayList15.add(org.telegram.ui.Components.t61.D(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.j71 j71Var13 = (org.telegram.ui.Components.j71) obj2;
                d81.a0((d81) this.f38991b, (ArrayList) obj);
                return;
            case 27:
                n81 n81Var = (n81) this.f38991b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var14 = (org.telegram.ui.Components.j71) obj2;
                LinearLayout linearLayout = n81Var.Y;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.t61.k(linearLayout));
                }
                LinearLayout linearLayout2 = n81Var.Z;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.t61.k(linearLayout2));
                    return;
                }
                return;
            default:
                id1 id1Var = (id1) this.f38991b;
                hh.b bVar4 = id1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                id1Var.f40225r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                id1Var.v = paint2;
                Bitmap bitmap5 = id1Var.f40225r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                id1Var.f40226s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                id1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                id1Var.f40227w = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, id1Var.f40217b);
                id1Var.F.d();
                return;
        }
    }
}
