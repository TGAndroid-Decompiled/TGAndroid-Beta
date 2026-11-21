package org.telegram.ui.Components;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
public final class h2 implements org.telegram.ui.ActionBar.q1, a5, org.telegram.messenger.za, org.telegram.ui.Cells.r5, org.telegram.messenger.jc, bj, org.telegram.ui.ActionBar.f1, sj0, org.telegram.messenger.lr, rj0, tj0 {
    public final int f35753a;
    public final Object f35754b;
    public final Object f35755c;

    public h2(int i7, Object obj, Object obj2) {
        this.f35753a = i7;
        this.f35754b = obj;
        this.f35755c = obj2;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.bw bwVar;
        switch (this.f35753a) {
            case 7:
                String str = (String) this.f35755c;
                ChatActivityEnterView chatActivityEnterView = ((ff) this.f35754b).f35215a;
                long j3 = chatActivityEnterView.G3;
                org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(str, j3, fjVar, threadMessage, null, false, null, null, null, z10, i7, i10, null, false);
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                } else {
                    bwVar = null;
                }
                b10.K = bwVar;
                b10.O = chatActivityEnterView.P6;
                org.telegram.messenger.zy.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f32671n0.c();
                re reVar = chatActivityEnterView.K0;
                chatActivityEnterView.P6 = 0L;
                reVar.setEffect(0L);
                return;
            case 8:
                ((mg) this.f35754b).L((qf) this.f35755c, z10, i7, i10);
                return;
            default:
                tn tnVar = (tn) this.f35754b;
                View view = (View) this.f35755c;
                if (z10) {
                    tnVar.W = i7;
                    tnVar.V = 0;
                    if (view instanceof org.telegram.ui.Cells.n8) {
                        tnVar.Z((org.telegram.ui.Cells.n8) view, true);
                        return;
                    } else {
                        tnVar.f39988r.g(tnVar.J0);
                        return;
                    }
                }
                tnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        uo uoVar = (uo) this.f35754b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35755c;
        if (uoVar.f40541c != null) {
            uoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            uoVar.a();
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        Location location;
        ml mlVar = (ml) this.f35754b;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f35755c;
        ImageView imageView = mlVar.f37560n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = mlVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = mlVar.f37549b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            mlVar.f37549b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            mlVar.f37549b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, mlVar.f37558k0 - org.telegram.messenger.g0.L(10.0f)));
            mlVar.f37549b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = mlVar.f37549b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            mlVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            mlVar.f37549b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            mlVar.f37549b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, mlVar.f37558k0));
            mlVar.f37549b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!mlVar.m0) {
                int i7 = org.telegram.ui.ActionBar.m6.lj;
                org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                mlVar.m0 = true;
            }
            org.telegram.messenger.da daVar = mlVar.E;
            if (daVar != null && (location = mlVar.f37557j0) != null) {
                location.setLatitude(((org.telegram.messenger.ab) daVar.d().f15536b).f22879a);
                mlVar.f37557j0.setLongitude(((org.telegram.messenger.ab) mlVar.E.d().f15536b).f22880b);
            }
            mlVar.L.L(mlVar.f37557j0);
        }
        return gaVar.a(motionEvent).booleanValue();
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        y5 y5Var;
        b21 b21Var;
        int i10 = this.f35753a;
        Object obj = this.f35755c;
        Object obj2 = this.f35754b;
        switch (i10) {
            case 17:
                ev evVar = (ev) obj2;
                Context context = (Context) obj;
                if (!(view instanceof xu) || (y5Var = ((xu) view).f42228c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(evVar.getContext(), true, true);
                y0Var.setItemHeight(48);
                y0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                y0Var.setText(org.telegram.messenger.gd.N0(2131751755, null));
                y0Var.getTextView().setTextSize(1, 14.4f);
                y0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                y0Var.setOnClickListener(new m8(11, evVar, y5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = evVar.getContext().getDrawable(2131232566).mutate();
                org.telegram.ui.ActionBar.t6.x(linearLayout, mutate, org.telegram.ui.ActionBar.m6.G8, evVar.J0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(y0Var);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                evVar.B1 = g1Var;
                g1Var.setClippingEnabled(true);
                evVar.B1.g();
                evVar.B1.setInputMethodMode(2);
                evVar.B1.setSoftInputMode(0);
                evVar.B1.setOutsideTouchable(true);
                evVar.B1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                evVar.B1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.ek ekVar = (org.telegram.ui.ek) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((d11) ((h11) obj2).f35749s.f33982c.get(i7)).f34350a;
                if (tL_forumTopic == null || (b21Var = ekVar.f47316a.f46030g2) == null || !b21Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void d(boolean z10) {
        jt0 jt0Var = (jt0) this.f35754b;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
        g2Var.finishFragment();
        int i7 = org.telegram.messenger.ks.f25218t;
        g2Var.getNotificationCenter().n((org.telegram.messenger.fs) g2Var, i7);
        g2Var.getNotificationCenter().k(i7, new Object[0]);
        g2Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(jt0Var.f36653m1), (TLRPC.User) this.f35755c, null, Boolean.valueOf(z10));
        g2Var.getMessagesController().Z4(false);
    }

    @Override
    public void e(org.telegram.ui.Cells.s5 s5Var) {
        int i7;
        boolean z10;
        TLRPC.Chat chat;
        jm jmVar = (jm) this.f35754b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f35755c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.f36566w;
        boolean z11 = chatAttachAlertPhotoLayout.f32840w0;
        ui uiVar = chatAttachAlertPhotoLayout.f37521b;
        if (z11) {
            int i10 = uiVar.O2;
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
            if (i10 == 0 && !uiVar.C1) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                org.telegram.messenger.ef photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f32797t1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                        new lc(uiVar.f40421p3, chatAttachAlertPhotoLayout.f37520a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(((org.telegram.messenger.j0) g2Var.getMessagesController().A7.f26176j0.f15505b).f24792c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z12 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && uiVar.Q3 >= 0 && hashMap.size() >= uiVar.Q3) {
                        if (uiVar.R3 && (g2Var instanceof org.telegram.ui.bn) && (chat = ((org.telegram.ui.bn) g2Var).f46001e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            c5.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745107, null), null, null, chatAttachAlertPhotoLayout.f37520a).p();
                            if (chatAttachAlertPhotoLayout.M == 1) {
                                chatAttachAlertPhotoLayout.M = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f32798u1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((g2Var instanceof org.telegram.ui.bn) && uiVar.R3) {
                        s5Var.b(i7, z12, true);
                    } else {
                        s5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.T(photoEntry, intValue);
                    jm jmVar2 = chatAttachAlertPhotoLayout.f32839w;
                    if (jmVar == jmVar2) {
                        jm jmVar3 = chatAttachAlertPhotoLayout.H;
                        if (jmVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (jmVar3.f36562f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        jmVar3.g(intValue);
                    } else {
                        jmVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    uiVar.L1(i11);
                    s5Var2.setHasSpoiler(photoEntry.M);
                    s5Var2.setHighQuality(photoEntry.c());
                    long j3 = photoEntry.N;
                    if (hashMap.size() > 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s5Var2.f(j3, z10);
                }
            }
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.v10 v10Var = (org.telegram.messenger.v10) this.f35755c;
        o41 G = ((h51) this.f35754b).f35796g3.G(i7);
        if (G == null) {
            return;
        }
        v10Var.l(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean matches;
        switch (this.f35753a) {
            case 0:
                ((AtomicBoolean) this.f35754b).set(true);
                ((q0.a) this.f35755c).accept(Boolean.FALSE);
                return;
            case 1:
                String str = (String) this.f35754b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f35755c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", org.telegram.messenger.i5.r(g2Var.getCurrentAccount()).s(1));
                    g2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                i4 i4Var = (i4) this.f35754b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f35755c;
                String trim = i4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = c5.f34019a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.D3(i4Var);
                    return;
                }
                x10Var.a(trim);
                t1Var.dismiss();
                return;
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f35754b;
                int i10 = encryptedChat.ttl;
                int value = ((tb0) this.f35755c).getValue();
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
                if (i10 != encryptedChat.ttl) {
                    org.telegram.messenger.xv.i(org.telegram.messenger.j10.f24798t0).z(encryptedChat, null);
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(org.telegram.messenger.j10.f24798t0);
                    a02.f27080a.c(new org.telegram.messenger.zp(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 4:
                Runnable runnable = (Runnable) this.f35755c;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).f25686g7.edit();
                edit.remove("color_" + ((String) this.f35754b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((org.telegram.messenger.lr) this.f35754b).d(((boolean[]) this.f35755c)[0]);
                return;
            case 16:
                ((nt) this.f35754b).a(((di.q) this.f35755c).getText().toString().trim());
                return;
            case 18:
                h30 h30Var = (h30) this.f35754b;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(h30Var.f35773a);
                ArrayList arrayList = a10.f25580f;
                int indexOf = arrayList.indexOf((String) this.f35755c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                h30Var.f35777f.O(true);
                return;
            case 19:
                um0 um0Var = (um0) this.f35754b;
                um0Var.getClass();
                t1Var.dismiss();
                um0Var.M0.getDownloadController().j((ArrayList) this.f35755c);
                um0Var.N(false);
                return;
            case 21:
                ((Runnable) this.f35754b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ri.b0((TLRPC.StickerSet) this.f35755c);
                ConnectionsManager.getInstance(org.telegram.messenger.j10.f24798t0).sendRequest(tL_stickers_deleteStickerSet, new fi.l5(21));
                return;
            case 26:
                Context context = (Context) this.f35754b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f35755c));
                context.startActivity(intent2);
                return;
            case 27:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.f35754b;
                TLRPC.User user = (TLRPC.User) this.f35755c;
                qrVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                qrVar.getContactsController().i(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                qrVar.finishFragment();
                return;
            case 28:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35754b;
                TLRPC.User user2 = (TLRPC.User) this.f35755c;
                org.telegram.ui.yr yrVar = contactsActivity.V;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.V = null;
                    return;
                }
                return;
            default:
                ContactsActivity.Z((ContactsActivity) this.f35754b, (String) this.f35755c);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f35754b;
        fi.n2 n2Var = (fi.n2) this.f35755c;
        if (!arrayList.isEmpty()) {
            x10Var.a(new th.g((org.telegram.messenger.fj) arrayList.get(0)));
        }
        n2Var.a(true);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        om omVar = (om) this.f35754b;
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f35755c;
        if (z10 && !z11 && efVar.M && omVar.d.n() == null) {
            if (omVar.d.n() != null && !omVar.d.n().isRecycled()) {
                omVar.d.n().recycle();
                omVar.d.w0(null);
            }
            omVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    public h2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f35753a = 28;
        this.f35754b = contactsActivity;
        this.f35755c = user;
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f35755c;
        o41 G = ((h51) this.f35754b).f35796g3.G(i7);
        if (G == null) {
            return false;
        }
        return w10Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void j() {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
