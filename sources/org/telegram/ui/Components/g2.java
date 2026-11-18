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
public final class g2 implements org.telegram.ui.ActionBar.r1, z4, org.telegram.messenger.za, org.telegram.ui.Cells.q5, org.telegram.messenger.jc, zi, org.telegram.ui.ActionBar.g1, qj0, org.telegram.messenger.lr, pj0, rj0 {
    public final int f35294a;
    public final Object f35295b;
    public final Object f35296c;

    public g2(int i7, Object obj, Object obj2) {
        this.f35294a = i7;
        this.f35295b = obj;
        this.f35296c = obj2;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.bw bwVar;
        switch (this.f35294a) {
            case 7:
                String str = (String) this.f35296c;
                ChatActivityEnterView chatActivityEnterView = ((ff) this.f35295b).f35074a;
                long j3 = chatActivityEnterView.E3;
                org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(str, j3, fjVar, threadMessage, null, false, null, null, null, z10, i7, i10, null, false);
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                } else {
                    bwVar = null;
                }
                b10.K = bwVar;
                b10.O = chatActivityEnterView.N6;
                org.telegram.messenger.zy.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f32643n0.c();
                re reVar = chatActivityEnterView.K0;
                chatActivityEnterView.N6 = 0L;
                reVar.setEffect(0L);
                return;
            case 8:
                ((jg) this.f35295b).L((of) this.f35296c, z10, i7, i10);
                return;
            default:
                rn rnVar = (rn) this.f35295b;
                View view = (View) this.f35296c;
                if (z10) {
                    rnVar.W = i7;
                    rnVar.V = 0;
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        rnVar.Z((org.telegram.ui.Cells.m8) view, true);
                        return;
                    } else {
                        rnVar.f39239r.g(rnVar.J0);
                        return;
                    }
                }
                rnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        so soVar = (so) this.f35295b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35296c;
        if (soVar.f39798c != null) {
            soVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            soVar.a();
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        Location location;
        kl klVar = (kl) this.f35295b;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f35296c;
        ImageView imageView = klVar.f36805n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = klVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = klVar.f36794b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            klVar.f36794b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            klVar.f36794b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, klVar.f36803k0 - org.telegram.messenger.g0.L(10.0f)));
            klVar.f36794b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = klVar.f36794b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            klVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            klVar.f36794b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            klVar.f36794b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, klVar.f36803k0));
            klVar.f36794b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!klVar.m0) {
                int i7 = org.telegram.ui.ActionBar.n6.lj;
                org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                klVar.m0 = true;
            }
            org.telegram.messenger.da daVar = klVar.E;
            if (daVar != null && (location = klVar.f36802j0) != null) {
                location.setLatitude(((org.telegram.messenger.ab) daVar.d().f15536b).f22854a);
                klVar.f36802j0.setLongitude(((org.telegram.messenger.ab) klVar.E.d().f15536b).f22855b);
            }
            klVar.L.L(klVar.f36802j0);
        }
        return gaVar.a(motionEvent).booleanValue();
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        x5 x5Var;
        z11 z11Var;
        int i10 = this.f35294a;
        Object obj = this.f35296c;
        Object obj2 = this.f35295b;
        switch (i10) {
            case 17:
                bv bvVar = (bv) obj2;
                Context context = (Context) obj;
                if (!(view instanceof uu) || (x5Var = ((uu) view).f40419c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(bvVar.getContext(), true, true);
                z0Var.setItemHeight(48);
                z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                z0Var.setText(org.telegram.messenger.gd.M0(2131751756, null));
                z0Var.getTextView().setTextSize(1, 14.4f);
                z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                z0Var.setOnClickListener(new y7(12, bvVar, x5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = bvVar.getContext().getDrawable(2131232566).mutate();
                org.telegram.ui.ActionBar.u6.x(linearLayout, mutate, org.telegram.ui.ActionBar.n6.G8, bvVar.J0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(z0Var);
                org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(linearLayout, -2, -2);
                bvVar.B1 = h1Var;
                h1Var.setClippingEnabled(true);
                bvVar.B1.g();
                bvVar.B1.setInputMethodMode(2);
                bvVar.B1.setSoftInputMode(0);
                bvVar.B1.setOutsideTouchable(true);
                bvVar.B1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                bvVar.B1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.ek ekVar = (org.telegram.ui.ek) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((b11) ((f11) obj2).f34896s.f33221c.get(i7)).f33505a;
                if (tL_forumTopic == null || (z11Var = ekVar.f47291a.f46016g2) == null || !z11Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void d(boolean z10) {
        gt0 gt0Var = (gt0) this.f35295b;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        h2Var.finishFragment();
        int i7 = org.telegram.messenger.ks.f25192t;
        h2Var.getNotificationCenter().n((org.telegram.messenger.fs) h2Var, i7);
        h2Var.getNotificationCenter().k(i7, new Object[0]);
        h2Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(gt0Var.f35606m1), (TLRPC.User) this.f35296c, null, Boolean.valueOf(z10));
        h2Var.getMessagesController().Z4(false);
    }

    @Override
    public void e(org.telegram.ui.Cells.r5 r5Var) {
        int i7;
        boolean z10;
        TLRPC.Chat chat;
        hm hmVar = (hm) this.f35295b;
        org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) this.f35296c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f35930w;
        boolean z11 = chatAttachAlertPhotoLayout.f32807w0;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        if (z11) {
            int i10 = siVar.O2;
            org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
            if (i10 == 0 && !siVar.C1) {
                int intValue = ((Integer) r5Var.getTag()).intValue();
                org.telegram.messenger.ef photoEntry = r5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                        new lc(siVar.f39705p3, chatAttachAlertPhotoLayout.f36765a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(((org.telegram.messenger.j0) h2Var.getMessagesController().A7.f26150j0.f15539b).f24767c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z12 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && siVar.Q3 >= 0 && hashMap.size() >= siVar.Q3) {
                        if (siVar.R3 && (h2Var instanceof org.telegram.ui.bn) && (chat = ((org.telegram.ui.bn) h2Var).f45987e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            b5.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.gd.M0(2131745115, null), org.telegram.messenger.gd.M0(2131745108, null), null, null, chatAttachAlertPhotoLayout.f36765a).p();
                            if (chatAttachAlertPhotoLayout.M == 1) {
                                chatAttachAlertPhotoLayout.M = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f32765u1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((h2Var instanceof org.telegram.ui.bn) && siVar.R3) {
                        r5Var.b(i7, z12, true);
                    } else {
                        r5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.T(photoEntry, intValue);
                    hm hmVar2 = chatAttachAlertPhotoLayout.f32806w;
                    if (hmVar == hmVar2) {
                        hm hmVar3 = chatAttachAlertPhotoLayout.H;
                        if (hmVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (hmVar3.f35926f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        hmVar3.g(intValue);
                    } else {
                        hmVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    siVar.L1(i11);
                    r5Var2.setHasSpoiler(photoEntry.M);
                    r5Var2.setHighQuality(photoEntry.c());
                    long j3 = photoEntry.N;
                    if (hashMap.size() > 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r5Var2.f(j3, z10);
                }
            }
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.v10 v10Var = (org.telegram.messenger.v10) this.f35296c;
        l41 G = ((e51) this.f35295b).f34607g3.G(i7);
        if (G == null) {
            return;
        }
        v10Var.l(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean matches;
        switch (this.f35294a) {
            case 0:
                ((AtomicBoolean) this.f35295b).set(true);
                ((q0.a) this.f35296c).accept(Boolean.FALSE);
                return;
            case 1:
                String str = (String) this.f35295b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f35296c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", org.telegram.messenger.i5.r(h2Var.getCurrentAccount()).s(1));
                    h2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                h4 h4Var = (h4) this.f35295b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f35296c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = b5.f33529a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.D3(h4Var);
                    return;
                }
                x10Var.a(trim);
                u1Var.dismiss();
                return;
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f35295b;
                int i10 = encryptedChat.ttl;
                int value = ((sb0) this.f35296c).getValue();
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
                    org.telegram.messenger.xv.i(org.telegram.messenger.j10.f24773t0).z(encryptedChat, null);
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(org.telegram.messenger.j10.f24773t0);
                    a02.f27054a.c(new org.telegram.messenger.zp(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 4:
                Runnable runnable = (Runnable) this.f35296c;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).f25660g7.edit();
                edit.remove("color_" + ((String) this.f35295b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((org.telegram.messenger.lr) this.f35295b).d(((boolean[]) this.f35296c)[0]);
                return;
            case 16:
                ((lt) this.f35295b).a(((di.q) this.f35296c).getText().toString().trim());
                return;
            case 18:
                e30 e30Var = (e30) this.f35295b;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(e30Var.f34590a);
                ArrayList arrayList = a10.f25554f;
                int indexOf = arrayList.indexOf((String) this.f35296c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                e30Var.f34594f.O(true);
                return;
            case 19:
                rm0 rm0Var = (rm0) this.f35295b;
                rm0Var.getClass();
                u1Var.dismiss();
                rm0Var.M0.getDownloadController().j((ArrayList) this.f35296c);
                rm0Var.N(false);
                return;
            case 21:
                ((Runnable) this.f35295b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ri.b0((TLRPC.StickerSet) this.f35296c);
                ConnectionsManager.getInstance(org.telegram.messenger.j10.f24773t0).sendRequest(tL_stickers_deleteStickerSet, new fi.k5(21));
                return;
            case 26:
                Context context = (Context) this.f35295b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f35296c));
                context.startActivity(intent2);
                return;
            case 27:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.f35295b;
                TLRPC.User user = (TLRPC.User) this.f35296c;
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f35295b;
                TLRPC.User user2 = (TLRPC.User) this.f35296c;
                org.telegram.ui.yr yrVar = contactsActivity.V;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.V = null;
                    return;
                }
                return;
            default:
                ContactsActivity.Z((ContactsActivity) this.f35295b, (String) this.f35296c);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f35295b;
        fi.n2 n2Var = (fi.n2) this.f35296c;
        if (!arrayList.isEmpty()) {
            x10Var.a(new th.g((org.telegram.messenger.fj) arrayList.get(0)));
        }
        n2Var.a(true);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mm mmVar = (mm) this.f35295b;
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f35296c;
        if (z10 && !z11 && efVar.M && mmVar.d.n() == null) {
            if (mmVar.d.n() != null && !mmVar.d.n().isRecycled()) {
                mmVar.d.n().recycle();
                mmVar.d.w0(null);
            }
            mmVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    public g2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f35294a = 28;
        this.f35295b = contactsActivity;
        this.f35296c = user;
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f35296c;
        l41 G = ((e51) this.f35295b).f34607g3.G(i7);
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
