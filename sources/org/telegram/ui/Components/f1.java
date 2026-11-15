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
import android.widget.EditText;
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
public final class f1 implements org.telegram.ui.ActionBar.q1, r4, org.telegram.messenger.ab, org.telegram.ui.Cells.p5, org.telegram.messenger.kc, si, org.telegram.ui.ActionBar.f1, ij0, org.telegram.messenger.nr, hj0, jj0 {
    public final int f34470a;
    public final Object f34471b;
    public final Object f34472c;

    public f1(int i7, Object obj, Object obj2) {
        this.f34470a = i7;
        this.f34471b = obj;
        this.f34472c = obj2;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fm fmVar = (fm) this.f34471b;
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.f34472c;
        if (z10 && !z11 && ffVar.M && fmVar.d.n() == null) {
            if (fmVar.d.n() != null && !fmVar.d.n().isRecycled()) {
                fmVar.d.n().recycle();
                fmVar.d.w0(null);
            }
            fmVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.fw fwVar;
        switch (this.f34470a) {
            case 8:
                String str = (String) this.f34472c;
                ChatActivityEnterView chatActivityEnterView = ((we) this.f34471b).f41333a;
                long j3 = chatActivityEnterView.f32327y3;
                org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(str, j3, gjVar, threadMessage, null, false, null, null, null, z10, i7, i10, null, false);
                org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
                if (anVar != null) {
                    fwVar = anVar.Y8();
                } else {
                    fwVar = null;
                }
                b10.K = fwVar;
                b10.O = chatActivityEnterView.f32251n6;
                org.telegram.messenger.ez.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f32246n0.c();
                he heVar = chatActivityEnterView.K0;
                chatActivityEnterView.f32251n6 = 0L;
                heVar.setEffect(0L);
                return;
            case 9:
                ((bg) this.f34471b).L((ff) this.f34472c, z10, i7, i10);
                return;
            default:
                jn jnVar = (jn) this.f34471b;
                View view = (View) this.f34472c;
                if (z10) {
                    jnVar.W = i7;
                    jnVar.V = 0;
                    if (view instanceof org.telegram.ui.Cells.l8) {
                        jnVar.Z((org.telegram.ui.Cells.l8) view, true);
                        return;
                    } else {
                        jnVar.f36094r.g(jnVar.J0);
                        return;
                    }
                }
                jnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        lo loVar = (lo) this.f34471b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f34472c;
        if (loVar.f36862c != null) {
            loVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            loVar.a();
        }
    }

    @Override
    public boolean b(int i7, View view) {
        p5 p5Var;
        p11 p11Var;
        int i10 = this.f34470a;
        Object obj = this.f34472c;
        Object obj2 = this.f34471b;
        switch (i10) {
            case 18:
                wu wuVar = (wu) obj2;
                Context context = (Context) obj;
                if (!(view instanceof pu) || (p5Var = ((pu) view).f38411c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(wuVar.getContext(), true, true);
                z0Var.setItemHeight(48);
                z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                z0Var.setText(org.telegram.messenger.hd.M0(2131751767, null));
                z0Var.getTextView().setTextSize(1, 14.4f);
                z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                z0Var.setOnClickListener(new n2(16, wuVar, p5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = wuVar.getContext().getDrawable(2131232565).mutate();
                org.telegram.ui.ActionBar.q6.x(linearLayout, mutate, org.telegram.ui.ActionBar.j6.G8, wuVar.J0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(z0Var);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                wuVar.B1 = g1Var;
                g1Var.setClippingEnabled(true);
                wuVar.B1.g();
                wuVar.B1.setInputMethodMode(2);
                wuVar.B1.setSoftInputMode(0);
                wuVar.B1.setOutsideTouchable(true);
                wuVar.B1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                wuVar.B1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((s01) ((v01) obj2).f40227s.f38458c.get(i7)).f39131a;
                if (tL_forumTopic == null || (p11Var = dkVar.f46387a.f45201g2) == null || !p11Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        Location location;
        dl dlVar = (dl) this.f34471b;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f34472c;
        ImageView imageView = dlVar.f33973n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = dlVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = dlVar.f33962b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            dlVar.f33962b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            dlVar.f33962b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, dlVar.f33971k0 - org.telegram.messenger.g0.L(10.0f)));
            dlVar.f33962b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = dlVar.f33962b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            dlVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            dlVar.f33962b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            dlVar.f33962b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, dlVar.f33971k0));
            dlVar.f33962b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!dlVar.m0) {
                int i7 = org.telegram.ui.ActionBar.j6.lj;
                org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                dlVar.m0 = true;
            }
            org.telegram.messenger.ea eaVar = dlVar.E;
            if (eaVar != null && (location = dlVar.f33970j0) != null) {
                location.setLatitude(((org.telegram.messenger.bb) eaVar.d().f15288b).f22677a);
                dlVar.f33970j0.setLongitude(((org.telegram.messenger.bb) dlVar.E.d().f15288b).f22678b);
            }
            dlVar.L.L(dlVar.f33970j0);
        }
        return haVar.a(motionEvent).booleanValue();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(org.telegram.ui.Cells.q5 q5Var) {
        int i7;
        boolean z10;
        TLRPC.Chat chat;
        am amVar = (am) this.f34471b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.f34472c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.f33023w;
        boolean z11 = chatAttachAlertPhotoLayout.f32410w0;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        if (z11) {
            int i10 = kiVar.O2;
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
            if (i10 == 0 && !kiVar.C1) {
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.ff photoEntry = q5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                        new cc(kiVar.f36470p3, chatAttachAlertPhotoLayout.f33608a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(((org.telegram.messenger.j0) e2Var.getMessagesController().f25451y7.f25843d0.f15881b).f24498c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z12 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && kiVar.Q3 >= 0 && hashMap.size() >= kiVar.Q3) {
                        if (kiVar.R3 && (e2Var instanceof org.telegram.ui.an) && (chat = ((org.telegram.ui.an) e2Var).f45172e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            t4.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745303, null), null, null, chatAttachAlertPhotoLayout.f33608a).p();
                            if (chatAttachAlertPhotoLayout.M == 1) {
                                chatAttachAlertPhotoLayout.M = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f32368u1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((e2Var instanceof org.telegram.ui.an) && kiVar.R3) {
                        q5Var.b(i7, z12, true);
                    } else {
                        q5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.T(photoEntry, intValue);
                    am amVar2 = chatAttachAlertPhotoLayout.f32409w;
                    if (amVar == amVar2) {
                        am amVar3 = chatAttachAlertPhotoLayout.H;
                        if (amVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (amVar3.f33019f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        amVar3.g(intValue);
                    } else {
                        amVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    kiVar.K1(i11);
                    q5Var2.setHasSpoiler(photoEntry.M);
                    q5Var2.setHighQuality(photoEntry.c());
                    long j3 = photoEntry.N;
                    if (hashMap.size() > 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5Var2.f(j3, z10);
                }
            }
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f34472c;
        b41 G = ((u41) this.f34471b).f39892g3.G(i7);
        if (G == null) {
            return;
        }
        x10Var.m(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        boolean matches;
        switch (this.f34470a) {
            case 0:
                t1Var.dismiss();
                ((li.v) this.f34471b).a(((EditText) this.f34472c).getText().toString());
                return;
            case 1:
                org.telegram.messenger.pr prVar = (org.telegram.messenger.pr) this.f34472c;
                int i11 = ((int[]) this.f34471b)[0];
                if (i11 == 0) {
                    i10 = 900;
                } else if (i11 == 1) {
                    i10 = 3600;
                } else if (i11 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                prVar.a(i10);
                return;
            case 2:
                ((AtomicBoolean) this.f34471b).set(true);
                ((q0.a) this.f34472c).accept(Boolean.FALSE);
                return;
            case 3:
                String str = (String) this.f34471b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f34472c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", org.telegram.messenger.g5.r(e2Var.getCurrentAccount()).s(1));
                    e2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                z3 z3Var = (z3) this.f34471b;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f34472c;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = t4.f39505a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.E3(z3Var);
                    return;
                }
                z10Var.a(trim);
                t1Var.dismiss();
                return;
            case 5:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f34471b;
                int i12 = encryptedChat.ttl;
                int value = ((ib0) this.f34472c).getValue();
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
                if (i12 != encryptedChat.ttl) {
                    org.telegram.messenger.bw.i(org.telegram.messenger.m10.f24940t0).z(encryptedChat, null);
                    org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(org.telegram.messenger.m10.f24940t0);
                    a02.f27219a.c(new org.telegram.messenger.aq(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 6:
                Runnable runnable = (Runnable) this.f34472c;
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7.edit();
                edit.remove("color_" + ((String) this.f34471b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((org.telegram.messenger.nr) this.f34471b).j(((boolean[]) this.f34472c)[0]);
                return;
            case 17:
                ((et) this.f34471b).a(((di.q) this.f34472c).getText().toString().trim());
                return;
            case 19:
                w20 w20Var = (w20) this.f34471b;
                org.telegram.messenger.na a10 = org.telegram.messenger.na.a(w20Var.f41234a);
                ArrayList arrayList = a10.f25183f;
                int indexOf = arrayList.indexOf((String) this.f34472c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                w20Var.f41238f.O(true);
                return;
            case 20:
                jm0 jm0Var = (jm0) this.f34471b;
                jm0Var.getClass();
                t1Var.dismiss();
                jm0Var.M0.getDownloadController().j((ArrayList) this.f34472c);
                jm0Var.Q(false);
                return;
            case 22:
                ((Runnable) this.f34471b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.si.Z((TLRPC.StickerSet) this.f34472c);
                ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).sendRequest(tL_stickers_deleteStickerSet, new fi.m5(21));
                return;
            case 27:
                Context context = (Context) this.f34471b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f34472c));
                context.startActivity(intent2);
                return;
            case 28:
                org.telegram.ui.pr prVar2 = (org.telegram.ui.pr) this.f34471b;
                TLRPC.User user = (TLRPC.User) this.f34472c;
                prVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                prVar2.getContactsController().i(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                prVar2.finishFragment();
                return;
            default:
                ContactsActivity contactsActivity = (ContactsActivity) this.f34471b;
                TLRPC.User user2 = (TLRPC.User) this.f34472c;
                org.telegram.ui.yr yrVar = contactsActivity.V;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.V = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void j(boolean z10) {
        ys0 ys0Var = (ys0) this.f34471b;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
        e2Var.finishFragment();
        int i7 = org.telegram.messenger.ns.f25573t;
        e2Var.getNotificationCenter().n((org.telegram.messenger.is) e2Var, i7);
        e2Var.getNotificationCenter().k(i7, new Object[0]);
        e2Var.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(ys0Var.f42116m1), (TLRPC.User) this.f34472c, null, Boolean.valueOf(z10));
        e2Var.getMessagesController().O4(false);
    }

    @Override
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f34471b;
        fi.p2 p2Var = (fi.p2) this.f34472c;
        if (!arrayList.isEmpty()) {
            z10Var.a(new th.g((org.telegram.messenger.gj) arrayList.get(0)));
        }
        p2Var.a(true);
    }

    public f1(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f34470a = 29;
        this.f34471b = contactsActivity;
        this.f34472c = user;
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) this.f34472c;
        b41 G = ((u41) this.f34471b).f39892g3.G(i7);
        if (G == null) {
            return false;
        }
        return y10Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
