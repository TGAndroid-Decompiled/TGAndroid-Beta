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
    public final int f38755a;
    public final Object f38756b;

    public e5(Object obj, int i10) {
        this.f38755a = i10;
        this.f38756b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        k91 k91Var;
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
        switch (this.f38755a) {
            case 0:
                f5 f5Var = (f5) this.f38756b;
                f5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                f5Var.f39173w = false;
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
                o9 o9Var = (o9) this.f38756b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) obj2;
                boolean isEmpty = o9Var.F.isEmpty();
                ArrayList arrayList3 = o9Var.f42026w;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.u61 c10 = org.telegram.ui.Components.u61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f33254q = true;
                    arrayList2.add(c10);
                    arrayList2.add(org.telegram.ui.Components.u61.C(null));
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
                            int i21 = m9.f41368a;
                            org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(m9.class);
                            K.G = chat;
                            K.D = q8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.u61.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList3.get(i15);
                        i15++;
                        k9 k9Var = (k9) obj4;
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(7, o9Var, k9Var);
                        int i22 = i9.f40068a;
                        org.telegram.ui.Components.u61 K2 = org.telegram.ui.Components.u61.K(i9.class);
                        K2.G = k9Var;
                        K2.D = u1Var;
                        K2.L(o9Var.g0(k9Var.f40694c));
                        arrayList2.add(K2);
                    }
                    if (!o9Var.E) {
                        arrayList2.add(org.telegram.ui.Components.u61.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.u61.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.u61.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f38756b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var2 = (org.telegram.ui.Components.k71) obj2;
                keVar.R0 = -1;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f40769o0).getChat(Long.valueOf(-keVar.f40771p0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f40769o0).getChatFull(-keVar.f40771p0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f40756b1) {
                    arrayList5.add(org.telegram.ui.Components.u61.g(keVar.f40777s0));
                    k91 k91Var2 = keVar.l1;
                    if (k91Var2 != null && !k91Var2.f40712l) {
                        arrayList5.add(org.telegram.ui.Components.u61.h(5, i10, k91Var2));
                        charSequence = null;
                        arrayList5.add(org.telegram.ui.Components.u61.B(-1, null));
                    } else {
                        charSequence = null;
                    }
                    k91 k91Var3 = keVar.f40766m1;
                    if (k91Var3 != null && !k91Var3.f40712l) {
                        arrayList5.add(org.telegram.ui.Components.u61.h(2, i10, k91Var3));
                        arrayList5.add(org.telegram.ui.Components.u61.B(-2, charSequence));
                    }
                }
                if (keVar.f40757c1 && (k91Var = keVar.f40768n1) != null && !k91Var.f40712l) {
                    arrayList5.add(org.telegram.ui.Components.u61.h(2, i10, k91Var));
                    arrayList5.add(org.telegram.ui.Components.u61.B(-3, null));
                }
                if (keVar.f40770o1) {
                    arrayList5.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList5.add(org.telegram.ui.Components.u61.v(keVar.f40772p1));
                    arrayList5.add(org.telegram.ui.Components.u61.v(keVar.f40774q1));
                    arrayList5.add(org.telegram.ui.Components.u61.v(keVar.f40776r1));
                    arrayList5.add(org.telegram.ui.Components.u61.B(-4, keVar.f40780u0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f40756b1) {
                        arrayList5.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList5.add(org.telegram.ui.Components.u61.k(keVar.f40782w0));
                        arrayList5.add(org.telegram.ui.Components.u61.B(-5, keVar.f40779t0));
                        int i23 = MessagesController.getInstance(keVar.f40769o0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.f40775r0 < i23) {
                            i11 = i23;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(0, new cp0(i11, context, null, false));
                            zqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.u61 i24 = org.telegram.ui.Components.u61.i(1, string);
                        if (keVar.f40775r0 >= i23 && keVar.f40764j1) {
                            z11 = true;
                        }
                        i24.L(z11);
                        arrayList5.add(i24);
                        arrayList5.add(org.telegram.ui.Components.u61.B(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f40757c1) {
                        arrayList5.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList5.add(org.telegram.ui.Components.u61.j(3, keVar.C0));
                        arrayList5.add(org.telegram.ui.Components.u61.B(-6, keVar.f40781v0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f40769o0).getChat(Long.valueOf(-keVar.f40771p0))) && MessagesController.getInstance(keVar.f40769o0).starrefConnectAllowed) {
                    arrayList5.add(hi.g.a(4, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, keVar.f40767n0), R.drawable.filled_earn_stars, oo.e0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList5.add(org.telegram.ui.Components.u61.B(-7, null));
                }
                if (keVar.f40755a1.a()) {
                    keVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.u61.n(keVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.u61.B(-10, null));
                return;
            case 3:
                ee eeVar = (ee) this.f38756b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var3 = (org.telegram.ui.Components.k71) obj2;
                ge geVar = eeVar.f38849f;
                int i25 = eeVar.d;
                int i26 = ge.f39595x;
                if (i25 == 0) {
                    arrayList = geVar.f39601r;
                } else {
                    arrayList = geVar.f39600n;
                }
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj5 = arrayList.get(i19);
                    i19++;
                    int i27 = bi.xc.f5710a;
                    org.telegram.ui.Components.u61 K3 = org.telegram.ui.Components.u61.K(bi.xc.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f33254q = true;
                    arrayList6.add(K3);
                }
                if (i25 == 0) {
                    str = geVar.f39602s;
                } else {
                    str = geVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.u61.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.u61.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.u61.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                oo ooVar = (oo) this.f38756b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ooVar.getClass();
                    org.telegram.ui.Components.wc.b0(ooVar).g0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(ooVar.f42142j0);
                AndroidUtilities.removeFromParent(ooVar.f42139g0);
                AndroidUtilities.removeFromParent(ooVar.f42141i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new jq((mr) this.f38756b, 1), 1000L);
                return;
            case 6:
                ((rf.b) this.f38756b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ls lsVar = (ls) this.f38756b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var4 = (org.telegram.ui.Components.k71) obj2;
                TLRPC.User user = lsVar.getMessagesController().getUser(Long.valueOf(lsVar.H));
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.V));
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.f41248b));
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.f41249c));
                if (TextUtils.isEmpty(lsVar.c0())) {
                    arrayList7.add(org.telegram.ui.Components.u61.C(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (lsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.u61.C(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.u61.C(null));
                }
                if (lsVar.I && lsVar.K) {
                    org.telegram.ui.Components.u61 i28 = org.telegram.ui.Components.u61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i28.L(lsVar.X);
                    arrayList7.add(i28);
                    arrayList7.add(org.telegram.ui.Components.u61.C(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.d));
                ic.a.z(R.string.AddNotesInfo, arrayList7);
                if (!lsVar.I) {
                    TLRPC.UserFull userFull = lsVar.getMessagesController().getUserFull(lsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.f41255x));
                    arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.f41256y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.E));
                    }
                    charSequence2 = null;
                    arrayList7.add(org.telegram.ui.Components.u61.C(null));
                    org.telegram.ui.Components.u61 e = org.telegram.ui.Components.u61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f33255r = true;
                    arrayList7.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList7.add(org.telegram.ui.Components.u61.C(charSequence2));
                if (lsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ds(lsVar, user, 0));
                    lsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new bs(lsVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ht.a((ht) this.f38756b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                dt dtVar = (dt) this.f38756b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.f38675a;
                ft ftVar = htVar.f39974l;
                if (ftVar != null) {
                    String join = TextUtils.join("", htVar.f39977o);
                    if (callback != null) {
                        oyVar = new org.telegram.ui.Components.oy(9, dtVar, callback);
                    } else {
                        oyVar = null;
                    }
                    ftVar.O(charSequence3, join, oyVar);
                    if (callback == null) {
                        htVar.n();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.k71 k71Var5 = (org.telegram.ui.Components.k71) obj2;
                tt.R((tt) this.f38756b, (ArrayList) obj);
                return;
            case 11:
                ey eyVar = (ey) this.f38756b;
                Long l10 = (Long) obj2;
                eyVar.P1 = (Long) obj;
                eyVar.c5();
                return;
            case 12:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f38756b).run();
                return;
            case 13:
                final wy wyVar = (wy) this.f38756b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var6 = (org.telegram.ui.Components.k71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i29 = R.raw.topics_top;
                org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(2);
                u61Var.f33249l = string2;
                u61Var.f33248k = i29;
                arrayList8.add(u61Var);
                org.telegram.ui.Components.u61 i30 = org.telegram.ui.Components.u61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i30.L(wyVar.f45426c);
                arrayList8.add(i30);
                if (wyVar.f45426c) {
                    arrayList8.add(org.telegram.ui.Components.u61.C(null));
                    arrayList8.add(org.telegram.ui.Components.u61.u(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    ((vy) view.getParent()).a(true, true);
                                    bi.m5 m5Var = wyVar2.f45427f;
                                    if (m5Var != null) {
                                        m5Var.run(Boolean.valueOf(wyVar2.f45426c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.V();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    bi.m5 m5Var2 = wyVar3.f45427f;
                                    if (m5Var2 != null) {
                                        m5Var2.run(Boolean.valueOf(wyVar3.f45426c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.V();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    ((vy) view.getParent()).a(true, true);
                                    bi.m5 m5Var = wyVar2.f45427f;
                                    if (m5Var != null) {
                                        m5Var.run(Boolean.valueOf(wyVar2.f45426c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.V();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    bi.m5 m5Var2 = wyVar3.f45427f;
                                    if (m5Var2 != null) {
                                        m5Var2.run(Boolean.valueOf(wyVar3.f45426c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.V();
                                    return;
                            }
                        }
                    };
                    int i31 = uy.f44140a;
                    org.telegram.ui.Components.u61 K4 = org.telegram.ui.Components.u61.K(uy.class);
                    K4.d = 2;
                    K4.G = onClickListener;
                    K4.H = onClickListener2;
                    K4.L(wyVar.d);
                    arrayList8.add(K4);
                    ic.a.z(R.string.TopicsLayoutInfo, arrayList8);
                    return;
                }
                return;
            case 14:
                ob0 ob0Var = (ob0) this.f38756b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ob0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ob0Var.f42051b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.t.q(R.string.AIEditorStyleNotFound, ob0.d(), R.raw.error, 36);
                        return;
                    } else {
                        ob0.d().g0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                zv0 zv0Var = (zv0) this.f38756b;
                hh.b bVar2 = zv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                zv0Var.f46388s = (Bitmap) obj;
                Paint paint = new Paint(1);
                zv0Var.f46389w = paint;
                Bitmap bitmap2 = zv0Var.f46388s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                zv0Var.v = bitmapShader;
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
                zv0Var.f46389w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                zv0Var.f46390x = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, zv0Var.f46379c);
                zv0Var.G.d();
                return;
            case 16:
                hw0 hw0Var = (hw0) this.f38756b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var7 = (org.telegram.ui.Components.k71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i32 = R.raw.bubble;
                org.telegram.ui.Components.u61 u61Var2 = new org.telegram.ui.Components.u61(2);
                u61Var2.f33249l = string3;
                u61Var2.f33248k = i32;
                arrayList9.add(u61Var2);
                org.telegram.ui.Components.u61 i33 = org.telegram.ui.Components.u61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i33.L(hw0Var.f40003n);
                arrayList9.add(i33);
                arrayList9.add(org.telegram.ui.Components.u61.B(2, null));
                if (hw0Var.f40003n) {
                    ic.a.p(R.string.PriceForEachSuggestion, arrayList9);
                    int[] a2 = org.telegram.ui.Cells.c8.a((int) hw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(18);
                    org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8();
                    b8Var.f23909c = a2;
                    b8Var.d = 20;
                    b8Var.e = c1Var;
                    hw0Var.f40000b.d((int) Utilities.clamp(hw0Var.f40004r, 10000L, 0L), b8Var, new t3(hw0Var, 19));
                    arrayList9.add(org.telegram.ui.Components.u61.j(3, hw0Var.f40000b));
                    if (hw0Var.f40004r > 0) {
                        str2 = hw0Var.X();
                    } else {
                        str2 = null;
                    }
                    arrayList9.add(org.telegram.ui.Components.u61.B(4, str2));
                    TLRPC.Chat chat3 = hw0Var.getMessagesController().getChat(Long.valueOf(hw0Var.f39999a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        hw0Var.f40001c.setLink(hw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        ic.a.p(R.string.ChannelLinkDirectMessages, arrayList9);
                        arrayList9.add(org.telegram.ui.Components.u61.j(5, hw0Var.f40001c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f38756b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f38756b;
                Bitmap bitmap3 = (Bitmap) obj;
                hh.b bVar3 = profileActivity.E6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.F6.d();
                return;
            case 19:
                w21 w21Var = (w21) this.f38756b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var8 = (org.telegram.ui.Components.k71) obj2;
                org.telegram.ui.Components.s71 s71Var = w21Var.f44502f;
                x21 x21Var = w21Var.v;
                ArrayList arrayList11 = x21Var.f45465n;
                bi.j5 j5Var = w21Var.h;
                if (j5Var.getMeasuredHeight() <= 0) {
                    j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.u61 D = org.telegram.ui.Components.u61.D(j5Var.getMeasuredHeight());
                D.d = -1;
                D.f33256s = true;
                arrayList10.add(D);
                int measuredHeight = (int) ((j5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.f44500b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.f44501c != null || w21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.f44501c != null) {
                        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(w21Var.getContext(), org.telegram.ui.ActionBar.y6.L6, 21, 0, 0, false, false, x21.u(x21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = w21Var.f44500b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            q4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.f44501c;
                            if (tL_reportResultChooseOption != null) {
                                q4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, q4Var, x21.v(x21Var));
                        org.telegram.ui.Components.u61 k10 = org.telegram.ui.Components.u61.k(q4Var);
                        k10.d = -2;
                        arrayList10.add(k10);
                        measuredHeight += 40;
                    }
                    if (w21Var.f44500b != null) {
                        for (int i34 = 0; i34 < w21Var.f44500b.options.size(); i34++) {
                            org.telegram.ui.Components.u61 u61Var3 = new org.telegram.ui.Components.u61(30);
                            u61Var3.f33249l = w21Var.f44500b.options.get(i34).text;
                            u61Var3.f33248k = R.drawable.msg_arrowright;
                            u61Var3.d = i34;
                            arrayList10.add(u61Var3);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.f44501c != null) {
                        for (int i35 = 0; i35 < w21Var.f44501c.options.size(); i35++) {
                            org.telegram.ui.Components.u61 u61Var4 = new org.telegram.ui.Components.u61(30);
                            u61Var4.f33249l = w21Var.f44501c.options.get(i35).text;
                            u61Var4.f33248k = R.drawable.msg_arrowright;
                            u61Var4.d = i35;
                            arrayList10.add(u61Var4);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.d != null) {
                        if (w21Var.f44503n == null) {
                            u21 u21Var = new u21(w21Var, w21Var.getContext(), x21.w(x21Var));
                            w21Var.f44503n = u21Var;
                            u21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.e3 e3Var = w21Var.f44503n.d;
                        if (w21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        e3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.u61 k11 = org.telegram.ui.Components.u61.k(w21Var.f44503n);
                        k11.d = -3;
                        arrayList10.add(k11);
                        long j11 = x21Var.f45467s;
                        if (arrayList11 != null && !arrayList11.isEmpty()) {
                            if (arrayList11.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(x21.x(x21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        ic.a.z(i13, arrayList10);
                        if (w21Var.f44504r == null) {
                            fi.d dVar = new fi.d(w21Var.getContext(), x21.y(x21Var), true);
                            w21Var.f44505s = dVar;
                            dVar.i(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(w21Var.getContext());
                            w21Var.f44504r = frameLayout;
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, frameLayout, x21.A(x21Var));
                            w21Var.f44504r.addView(w21Var.f44505s, org.telegram.ui.Components.kb1.h(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(w21Var.getContext());
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, view, x21.B(x21Var));
                            w21Var.f44504r.addView(view, org.telegram.ui.Components.kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        fi.d dVar2 = w21Var.f44505s;
                        if (!w21Var.d.optional && TextUtils.isEmpty(w21Var.f44503n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        w21Var.f44505s.setOnClickListener(new z50(w21Var, 29));
                        org.telegram.ui.Components.u61 k12 = org.telegram.ui.Components.u61.k(w21Var.f44504r);
                        k12.d = -4;
                        arrayList10.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.u61) ic.a.g(1, arrayList10)).f33247j = true;
                    if (x21Var.e && w21Var.f44499a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(w21Var.getContext());
                        Drawable mutate = w21Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.f7.y(frameLayout2, mutate, org.telegram.ui.ActionBar.y6.f23319b7, x21.C(x21Var), PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.f7.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.y6.f23300a7, x21.D(x21Var), PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, mutate, 0, 0);
                        arVar.f26646w = true;
                        frameLayout2.setBackground(arVar);
                        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(w21Var.getContext(), null);
                        aa0Var.setTextSize(1, 14.0f);
                        aa0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), x21.G(x21Var)));
                        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.A6, x21.H(x21Var));
                        aa0Var.setGravity(17);
                        frameLayout2.addView(aa0Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.u61 k13 = org.telegram.ui.Components.u61.k(frameLayout2);
                        k13.d = -3;
                        arrayList10.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (s71Var != null) {
                    if (x21.I(x21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        s71Var.f32503f3.l1(false);
                        return;
                    }
                    Collections.reverse(arrayList10);
                    s71Var.f32503f3.l1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.k71 k71Var9 = (org.telegram.ui.Components.k71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.u61.k(((c31) this.f38756b).X));
                return;
            case 21:
                org.telegram.ui.Components.k71 k71Var10 = (org.telegram.ui.Components.k71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.u61.k(((o31) this.f38756b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f38756b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.k71 k71Var11 = (org.telegram.ui.Components.k71) obj2;
                p61.Q((p61) this.f38756b, (ArrayList) obj);
                return;
            case 24:
                o61 o61Var = (o61) this.f38756b;
                ArrayList arrayList12 = o61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i36 = o61Var.f41994a;
                ArrayList arrayList13 = o61Var.d;
                if (tL_error5 != null) {
                    if (o61Var.f41999r) {
                        arrayList13.clear();
                        o61Var.f41999r = false;
                    }
                    o61Var.h = true;
                    o61Var.f41997f = false;
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
                if (o61Var.f41999r) {
                    arrayList13.clear();
                    o61Var.f41999r = false;
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
                    o61Var.h = true;
                }
                o61Var.f41997f = false;
                int size6 = arrayList12.size();
                while (i18 < size6) {
                    Object obj7 = arrayList12.get(i18);
                    i18++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                s61 s61Var = (s61) this.f38756b;
                ArrayList arrayList15 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var12 = (org.telegram.ui.Components.k71) obj2;
                int i38 = s61Var.f43246b0;
                di.z6 z6Var = s61Var.Z;
                if (z6Var != null) {
                    arrayList15.add(org.telegram.ui.Components.u61.D(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList16 = z6Var.f9492i;
                    int size7 = arrayList16.size();
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < size7) {
                        Object obj8 = arrayList16.get(i40);
                        i40++;
                        MessageObject messageObject = (MessageObject) obj8;
                        int i41 = fa1.f39310b;
                        org.telegram.ui.Components.u61 K5 = org.telegram.ui.Components.u61.K(fa1.class);
                        K5.f33258u = 1;
                        K5.f33262z = 0;
                        K5.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f22267id;
                        } else {
                            j10 = -1;
                        }
                        K5.B = j10;
                        K5.f33244f = true;
                        K5.v = i38;
                        K5.L(s61Var.f43245a0.containsKey(Integer.valueOf(messageObject.getId())));
                        K5.f33258u = 1;
                        arrayList15.add(K5);
                        i39--;
                        if (i39 == 0) {
                            i39 = i38;
                        }
                    }
                    if (z6Var.k() || !z6Var.f9501r) {
                        while (true) {
                            if (i39 <= 0) {
                                i14 = i38;
                            } else {
                                i14 = i39;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.u61 q5 = org.telegram.ui.Components.u61.q(i16, 34);
                                q5.f33258u = 1;
                                arrayList15.add(q5);
                            }
                        }
                    }
                    arrayList15.add(org.telegram.ui.Components.u61.D(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.k71 k71Var13 = (org.telegram.ui.Components.k71) obj2;
                f81.a0((f81) this.f38756b, (ArrayList) obj);
                return;
            case 27:
                p81 p81Var = (p81) this.f38756b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var14 = (org.telegram.ui.Components.k71) obj2;
                LinearLayout linearLayout = p81Var.Y;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.u61.k(linearLayout));
                }
                LinearLayout linearLayout2 = p81Var.Z;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.u61.k(linearLayout2));
                    return;
                }
                return;
            default:
                kd1 kd1Var = (kd1) this.f38756b;
                hh.b bVar4 = kd1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                kd1Var.f40748r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                kd1Var.v = paint2;
                Bitmap bitmap5 = kd1Var.f40748r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                kd1Var.f40749s = bitmapShader2;
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
                kd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                kd1Var.f40750w = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, kd1Var.f40740b);
                kd1Var.F.d();
                return;
        }
    }
}
