package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class jo implements org.telegram.messenger.lr, ca1, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.r4, org.telegram.messenger.ua, org.telegram.ui.Cells.p5, org.telegram.messenger.ec, org.telegram.ui.Components.ki, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.hj0, org.telegram.messenger.ir {
    public final int f46659a;
    public final Object f46660b;
    public final Object f46661c;

    public jo(int i3, Object obj, Object obj2) {
        this.f46659a = i3;
        this.f46660b = obj;
        this.f46661c = obj2;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        org.telegram.messenger.zi threadMessage;
        org.telegram.messenger.zv zvVar;
        switch (this.f46659a) {
            case 14:
                String str = (String) this.f46661c;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.ue) this.f46660b).f38730a;
                long j10 = chatActivityEnterView.R2;
                org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(str, j10, ziVar, threadMessage, null, false, null, null, null, z10, i3, i10, null, false);
                wm wmVar = chatActivityEnterView.Q2;
                if (wmVar != null) {
                    zvVar = wmVar.W8();
                } else {
                    zvVar = null;
                }
                b10.K = zvVar;
                b10.O = chatActivityEnterView.T4;
                org.telegram.messenger.yy.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f31162n0.c();
                org.telegram.ui.Components.ee eeVar = chatActivityEnterView.K0;
                chatActivityEnterView.T4 = 0L;
                eeVar.setEffect(0L);
                return;
            case 15:
                ((org.telegram.ui.Components.tf) this.f46660b).K((org.telegram.ui.Components.y00) this.f46661c, z10, i3, i10);
                return;
            default:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f46660b;
                View view = (View) this.f46661c;
                if (z10) {
                    anVar.W = i3;
                    anVar.V = 0;
                    if (view instanceof org.telegram.ui.Cells.l8) {
                        anVar.Z((org.telegram.ui.Cells.l8) view, true);
                        return;
                    } else {
                        anVar.f31936r.g(anVar.J0);
                        return;
                    }
                }
                anVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        org.telegram.ui.Components.ao aoVar = (org.telegram.ui.Components.ao) this.f46660b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f46661c;
        if (aoVar.f31954c != null) {
            aoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            aoVar.a();
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ca caVar) {
        Location location;
        org.telegram.ui.Components.uk ukVar = (org.telegram.ui.Components.uk) this.f46660b;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f46661c;
        ImageView imageView = ukVar.f38792n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = ukVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = ukVar.f38781b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ukVar.f38781b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            ukVar.f38781b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, ukVar.f38790k0 - org.telegram.messenger.g0.L(10.0f)));
            ukVar.f38781b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = ukVar.f38781b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            ukVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            ukVar.f38781b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            ukVar.f38781b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, ukVar.f38790k0));
            ukVar.f38781b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!ukVar.m0) {
                int i3 = org.telegram.ui.ActionBar.k6.ij;
                org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i3));
                ukVar.m0 = true;
            }
            org.telegram.messenger.z9 z9Var = ukVar.E;
            if (z9Var != null && (location = ukVar.f38789j0) != null) {
                location.setLatitude(((org.telegram.messenger.va) z9Var.d().f13795b).f25843a);
                ukVar.f38789j0.setLongitude(((org.telegram.messenger.va) ukVar.E.d().f13795b).f25844b);
            }
            ukVar.L.L(ukVar.f38789j0);
        }
        return caVar.a(motionEvent).booleanValue();
    }

    @Override
    public void c(org.telegram.ui.Cells.q5 q5Var) {
        int i3;
        boolean z10;
        TLRPC.Chat chat;
        org.telegram.ui.Components.sl slVar = (org.telegram.ui.Components.sl) this.f46660b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.f46661c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.f38055w;
        boolean z11 = chatAttachAlertPhotoLayout.f31303w0;
        org.telegram.ui.Components.bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (z11) {
            int i10 = biVar.L2;
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (i10 == 0 && !biVar.f32298z1) {
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.ye photoEntry = q5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                        new org.telegram.ui.Components.fc(biVar.f32249m3, chatAttachAlertPhotoLayout.f38415a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(((org.telegram.messenger.j0) d2Var.getMessagesController().f23167x7.f24651d0.f13798b).f23620c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z12 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && biVar.N3 >= 0 && hashMap.size() >= biVar.N3) {
                        if (biVar.O3 && (d2Var instanceof wm) && (chat = ((wm) d2Var).f51292e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            org.telegram.ui.Components.t4.N(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745313, null), null, null, chatAttachAlertPhotoLayout.f38415a).p();
                            if (chatAttachAlertPhotoLayout.M == 1) {
                                chatAttachAlertPhotoLayout.M = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i3 = ChatAttachAlertPhotoLayout.f31261u1.size();
                    } else {
                        i3 = -1;
                    }
                    if ((d2Var instanceof wm) && biVar.O3) {
                        q5Var.b(i3, z12, true);
                    } else {
                        q5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.S(photoEntry, intValue);
                    org.telegram.ui.Components.sl slVar2 = chatAttachAlertPhotoLayout.f31302w;
                    if (slVar == slVar2) {
                        org.telegram.ui.Components.sl slVar3 = chatAttachAlertPhotoLayout.H;
                        if (slVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (slVar3.f38051f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        slVar3.g(intValue);
                    } else {
                        slVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    biVar.K1(i11);
                    q5Var2.setHasSpoiler(photoEntry.M);
                    q5Var2.setHighQuality(photoEntry.c());
                    long j10 = photoEntry.N;
                    if (hashMap.size() > 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5Var2.f(j10, z10);
                }
            }
        }
    }

    @Override
    public boolean f(int i3, View view) {
        org.telegram.ui.Components.p5 p5Var;
        org.telegram.ui.Components.g11 g11Var;
        int i10 = this.f46659a;
        Object obj = this.f46661c;
        Object obj2 = this.f46660b;
        switch (i10) {
            case 24:
                org.telegram.ui.Components.pu puVar = (org.telegram.ui.Components.pu) obj2;
                Context context = (Context) obj;
                if (!(view instanceof org.telegram.ui.Components.iu) || (p5Var = ((org.telegram.ui.Components.iu) view).f34827c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(puVar.getContext(), true, true);
                y0Var.setItemHeight(48);
                y0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                y0Var.setText(org.telegram.messenger.bd.M0(2131751767, null));
                y0Var.getTextView().setTextSize(1, 14.4f);
                y0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                y0Var.setOnClickListener(new org.telegram.ui.Components.q2(15, puVar, p5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = puVar.getContext().getDrawable(2131232562).mutate();
                org.telegram.ui.ActionBar.r6.y(linearLayout, mutate, org.telegram.ui.ActionBar.k6.G8, puVar.J0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(y0Var);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(linearLayout, -2, -2);
                puVar.f37253y1 = f1Var;
                f1Var.setClippingEnabled(true);
                puVar.f37253y1.g();
                puVar.f37253y1.setInputMethodMode(2);
                puVar.f37253y1.setSoftInputMode(0);
                puVar.f37253y1.setOutsideTouchable(true);
                puVar.f37253y1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                puVar.f37253y1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                zj zjVar = (zj) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((org.telegram.ui.Components.l01) ((org.telegram.ui.Components.n01) obj2).f36320s.f35234c.get(i3)).f35539a;
                if (tL_forumTopic == null || (g11Var = zjVar.f52687a.f51323g2) == null || !g11Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String str;
        int i10;
        boolean matches;
        switch (this.f46659a) {
            case 2:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f46660b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f46661c;
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(e0Var.f28583a).sendRequestTyped(deletetone, new c3.b(1), new ai.n0(e0Var, h, tL_aiComposeTone, 5));
                return;
            case 3:
                ((cg.e0) this.f46660b).o(((boolean[]) this.f46661c)[0]);
                return;
            case 4:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f46660b;
                LaunchActivity launchActivity = (LaunchActivity) this.f46661c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                org.telegram.messenger.yc G0 = org.telegram.messenger.bd.E0().G0(str);
                org.telegram.messenger.yc ycVar = G0;
                if (G0 == null) {
                    ?? obj = new Object();
                    obj.f26561a = tL_langPackLanguage.native_name;
                    obj.f26562b = tL_langPackLanguage.name;
                    obj.f26563c = tL_langPackLanguage.lang_code;
                    obj.f26564e = tL_langPackLanguage.base_lang_code;
                    obj.f26565f = tL_langPackLanguage.plural_code;
                    obj.f26566g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        ycVar = obj;
                    } else {
                        obj.d = "unofficial";
                        ycVar = obj;
                    }
                }
                org.telegram.messenger.bd.E0().c(ycVar, true, false, false, true, org.telegram.messenger.h10.f22829t0, null);
                launchActivity.y0(true);
                return;
            case 5:
                org.telegram.ui.Components.i41 i41Var = (org.telegram.ui.Components.i41) this.f46660b;
                boolean[] zArr = (boolean[]) this.f46661c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                uw uwVar = (uw) i41Var.f34591b;
                ArrayList arrayList = (ArrayList) i41Var.f34592c;
                uwVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z10) {
                        uwVar.getMessagesController().o4(longValue, uwVar.getMessagesController().a2(l10), null, null, false);
                    }
                    if (z11) {
                        uwVar.getMessagesController().X(0, longValue, true);
                    }
                    uwVar.getMessagesController().w(longValue);
                }
                uwVar.n4(false);
                return;
            case 6:
                s1Var.dismiss();
                ((mi.f) this.f46660b).a(((EditText) this.f46661c).getText().toString());
                return;
            case 7:
                org.telegram.messenger.kr krVar = (org.telegram.messenger.kr) this.f46661c;
                int i12 = ((int[]) this.f46660b)[0];
                if (i12 == 0) {
                    i10 = 900;
                } else if (i12 == 1) {
                    i10 = 3600;
                } else if (i12 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                krVar.a(i10);
                return;
            case 8:
                ((AtomicBoolean) this.f46660b).set(true);
                ((q0.a) this.f46661c).accept(Boolean.FALSE);
                return;
            case 9:
                String str2 = (String) this.f46660b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f46661c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", org.telegram.messenger.g5.r(d2Var.getCurrentAccount()).s(1));
                    d2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.f46660b;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f46661c;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.t4.f38241a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.F3(z3Var);
                    return;
                }
                u10Var.a(trim);
                s1Var.dismiss();
                return;
            case 11:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f46660b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.cb0) this.f46661c).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i13 != encryptedChat.ttl) {
                    org.telegram.messenger.vv.i(org.telegram.messenger.h10.f22829t0).z(encryptedChat, null);
                    org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(org.telegram.messenger.h10.f22829t0);
                    a02.f24934a.c(new org.telegram.messenger.vp(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 12:
                Runnable runnable = (Runnable) this.f46661c;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7.edit();
                edit.remove("color_" + ((String) this.f46660b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.messenger.ir) this.f46660b).o(((boolean[]) this.f46661c)[0]);
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            default:
                ((Runnable) this.f46661c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.li.Z((TLRPC.StickerSet) this.f46660b);
                ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).sendRequest(tL_stickers_deleteStickerSet, new ei.u5(21));
                return;
            case 23:
                ((org.telegram.ui.Components.ws) this.f46660b).a(((ci.s) this.f46661c).getText().toString().trim());
                return;
            case 25:
                org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) this.f46660b;
                org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(p20Var.f37034a);
                ArrayList arrayList2 = a10.f22910f;
                int indexOf = arrayList2.indexOf((String) this.f46661c);
                if (indexOf != -1) {
                    arrayList2.remove(indexOf);
                    a10.d();
                }
                p20Var.f37038f.O(true);
                return;
            case 26:
                org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) this.f46660b;
                im0Var.getClass();
                s1Var.dismiss();
                im0Var.M0.getDownloadController().j((ArrayList) this.f46661c);
                im0Var.R(false);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f46660b;
        ei.x2 x2Var = (ei.x2) this.f46661c;
        if (!arrayList.isEmpty()) {
            u10Var.a(new uh.g((org.telegram.messenger.zi) arrayList.get(0)));
        }
        x2Var.a(true);
    }

    @Override
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ip) this.f46660b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46661c);
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.Components.xl xlVar = (org.telegram.ui.Components.xl) this.f46660b;
        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) this.f46661c;
        if (z10 && !z11 && yeVar.M && xlVar.d.n() == null) {
            if (xlVar.d.n() != null && !xlVar.d.n().isRecycled()) {
                xlVar.d.n().recycle();
                xlVar.d.w0(null);
            }
            xlVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public void o(boolean z10) {
        org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this.f46660b;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        d2Var.finishFragment();
        int i3 = org.telegram.messenger.hs.f23305t;
        d2Var.getNotificationCenter().n((org.telegram.messenger.cs) d2Var, i3);
        d2Var.getNotificationCenter().k(i3, new Object[0]);
        d2Var.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(ws0Var.m1), (TLRPC.User) this.f46661c, null, Boolean.valueOf(z10));
        d2Var.getMessagesController().N4(false);
    }

    @Override
    public void run(long j10) {
        mo moVar = (mo) this.f46660b;
        Runnable runnable = (Runnable) this.f46661c;
        if (j10 != 0) {
            qo qoVar = moVar.f47718y.d;
            if (qoVar.f48927s) {
                qoVar.f48928w.set(0, qoVar.getMessagesController().M0(Long.valueOf(j10)));
            } else {
                qoVar.F = j10;
                qoVar.f48924f = qoVar.getMessagesController().M0(Long.valueOf(j10));
            }
            runnable.run();
            return;
        }
        moVar.getClass();
    }

    public jo(Runnable runnable, TLRPC.StickerSet stickerSet) {
        this.f46659a = 28;
        this.f46661c = runnable;
        this.f46660b = stickerSet;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
