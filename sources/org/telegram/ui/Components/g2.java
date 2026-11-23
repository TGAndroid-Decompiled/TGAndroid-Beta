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
public final class g2 implements org.telegram.ui.ActionBar.q1, z4, org.telegram.messenger.za, org.telegram.ui.Cells.q5, org.telegram.messenger.jc, aj, org.telegram.ui.ActionBar.f1, sj0, org.telegram.messenger.lr, rj0, tj0 {
    public final int f35280a;
    public final Object f35281b;
    public final Object f35282c;

    public g2(int i7, Object obj, Object obj2) {
        this.f35280a = i7;
        this.f35281b = obj;
        this.f35282c = obj2;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.bw bwVar;
        switch (this.f35280a) {
            case 7:
                String str = (String) this.f35282c;
                ChatActivityEnterView chatActivityEnterView = ((gf) this.f35281b).f35409a;
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
                chatActivityEnterView.f32738n0.c();
                se seVar = chatActivityEnterView.K0;
                chatActivityEnterView.P6 = 0L;
                seVar.setEffect(0L);
                return;
            case 8:
                ((lg) this.f35281b).L((org.telegram.ui.Cells.aa) this.f35282c, z10, i7, i10);
                return;
            default:
                qn qnVar = (qn) this.f35281b;
                View view = (View) this.f35282c;
                if (z10) {
                    qnVar.W = i7;
                    qnVar.V = 0;
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        qnVar.Z((org.telegram.ui.Cells.m8) view, true);
                        return;
                    } else {
                        qnVar.f38941r.g(qnVar.J0);
                        return;
                    }
                }
                qnVar.getClass();
                return;
        }
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a() {
        ro roVar = (ro) this.f35281b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35282c;
        if (roVar.f39366c != null) {
            roVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            roVar.a();
        }
    }

    @Override
    public boolean b(int i7, View view) {
        x5 x5Var;
        z11 z11Var;
        int i10 = this.f35280a;
        Object obj = this.f35282c;
        Object obj2 = this.f35281b;
        switch (i10) {
            case 17:
                bv bvVar = (bv) obj2;
                Context context = (Context) obj;
                if (!(view instanceof uu) || (x5Var = ((uu) view).f40471c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(bvVar.getContext(), true, true);
                y0Var.setItemHeight(48);
                y0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                y0Var.setText(org.telegram.messenger.gd.N0(2131751755, null));
                y0Var.getTextView().setTextSize(1, 14.4f);
                y0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                y0Var.setOnClickListener(new l8(11, bvVar, x5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = bvVar.getContext().getDrawable(2131232569).mutate();
                org.telegram.ui.ActionBar.u6.x(linearLayout, mutate, org.telegram.ui.ActionBar.n6.G8, bvVar.J0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(y0Var);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                bvVar.B1 = g1Var;
                g1Var.setClippingEnabled(true);
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
                TLRPC.TL_forumTopic tL_forumTopic = ((b11) ((f11) obj2).f34969s.f33317c.get(i7)).f33601a;
                if (tL_forumTopic == null || (z11Var = ekVar.f47566a.f46202g2) == null || !z11Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        Location location;
        kl klVar = (kl) this.f35281b;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f35282c;
        ImageView imageView = klVar.f36784n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = klVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = klVar.f36773b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            klVar.f36773b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            klVar.f36773b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, klVar.f36782k0 - org.telegram.messenger.g0.L(10.0f)));
            klVar.f36773b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = klVar.f36773b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            klVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            klVar.f36773b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            klVar.f36773b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, klVar.f36782k0));
            klVar.f36773b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!klVar.m0) {
                int i7 = org.telegram.ui.ActionBar.n6.lj;
                org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                klVar.m0 = true;
            }
            org.telegram.messenger.da daVar = klVar.E;
            if (daVar != null && (location = klVar.f36781j0) != null) {
                location.setLatitude(((org.telegram.messenger.ab) daVar.d().f14540b).f22962a);
                klVar.f36781j0.setLongitude(((org.telegram.messenger.ab) klVar.E.d().f14540b).f22963b);
            }
            klVar.L.L(klVar.f36781j0);
        }
        return gaVar.a(motionEvent).booleanValue();
    }

    @Override
    public void d(org.telegram.ui.Cells.r5 r5Var) {
        int i7;
        boolean z10;
        TLRPC.Chat chat;
        hm hmVar = (hm) this.f35281b;
        org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) this.f35282c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f35771w;
        boolean z11 = chatAttachAlertPhotoLayout.f32907w0;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (z11) {
            int i10 = tiVar.O2;
            org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
            if (i10 == 0 && !tiVar.C1) {
                int intValue = ((Integer) r5Var.getTag()).intValue();
                org.telegram.messenger.ef photoEntry = r5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                        new kc(tiVar.f40002p3, chatAttachAlertPhotoLayout.f37134a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(((org.telegram.messenger.j0) g2Var.getMessagesController().A7.f26243j0.f15482b).f24899c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z12 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && tiVar.Q3 >= 0 && hashMap.size() >= tiVar.Q3) {
                        if (tiVar.R3 && (g2Var instanceof org.telegram.ui.bn) && (chat = ((org.telegram.ui.bn) g2Var).f46173e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            b5.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745107, null), null, null, chatAttachAlertPhotoLayout.f37134a).p();
                            if (chatAttachAlertPhotoLayout.M == 1) {
                                chatAttachAlertPhotoLayout.M = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f32865u1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((g2Var instanceof org.telegram.ui.bn) && tiVar.R3) {
                        r5Var.b(i7, z12, true);
                    } else {
                        r5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.T(photoEntry, intValue);
                    hm hmVar2 = chatAttachAlertPhotoLayout.f32906w;
                    if (hmVar == hmVar2) {
                        hm hmVar3 = chatAttachAlertPhotoLayout.H;
                        if (hmVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (hmVar3.f35767f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        hmVar3.g(intValue);
                    } else {
                        hmVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    tiVar.L1(i11);
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
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f35281b;
        fi.n2 n2Var = (fi.n2) this.f35282c;
        if (!arrayList.isEmpty()) {
            w10Var.a(new th.g((org.telegram.messenger.fj) arrayList.get(0)));
        }
        n2Var.a(true);
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f35282c;
        n41 G = ((g51) this.f35281b).f35323g3.G(i7);
        if (G == null) {
            return;
        }
        u10Var.k(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean matches;
        switch (this.f35280a) {
            case 0:
                ((AtomicBoolean) this.f35281b).set(true);
                ((q0.a) this.f35282c).accept(Boolean.FALSE);
                return;
            case 1:
                String str = (String) this.f35281b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f35282c;
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
                h4 h4Var = (h4) this.f35281b;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f35282c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = b5.f33627a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.D3(h4Var);
                    return;
                }
                w10Var.a(trim);
                t1Var.dismiss();
                return;
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f35281b;
                int i10 = encryptedChat.ttl;
                int value = ((qb0) this.f35282c).getValue();
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
                    org.telegram.messenger.xv.i(org.telegram.messenger.i10.f24637t0).z(encryptedChat, null);
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(org.telegram.messenger.i10.f24637t0);
                    a02.f27149a.c(new org.telegram.messenger.zp(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 4:
                Runnable runnable = (Runnable) this.f35282c;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7.edit();
                edit.remove("color_" + ((String) this.f35281b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((org.telegram.messenger.lr) this.f35281b).q(((boolean[]) this.f35282c)[0]);
                return;
            case 16:
                ((lt) this.f35281b).a(((di.q) this.f35282c).getText().toString().trim());
                return;
            case 18:
                e30 e30Var = (e30) this.f35281b;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(e30Var.f34557a);
                ArrayList arrayList = a10.f25647f;
                int indexOf = arrayList.indexOf((String) this.f35282c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                e30Var.f34561f.O(true);
                return;
            case 19:
                tm0 tm0Var = (tm0) this.f35281b;
                tm0Var.getClass();
                t1Var.dismiss();
                tm0Var.M0.getDownloadController().j((ArrayList) this.f35282c);
                tm0Var.P(false);
                return;
            case 21:
                ((Runnable) this.f35281b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ri.b0((TLRPC.StickerSet) this.f35282c);
                ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).sendRequest(tL_stickers_deleteStickerSet, new fi.l5(21));
                return;
            case 26:
                Context context = (Context) this.f35281b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f35282c));
                context.startActivity(intent2);
                return;
            case 27:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.f35281b;
                TLRPC.User user = (TLRPC.User) this.f35282c;
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f35281b;
                TLRPC.User user2 = (TLRPC.User) this.f35282c;
                org.telegram.ui.yr yrVar = contactsActivity.V;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.V = null;
                    return;
                }
                return;
            default:
                ContactsActivity.Z((ContactsActivity) this.f35281b, (String) this.f35282c);
                return;
        }
    }

    @Override
    public void q(boolean z10) {
        it0 it0Var = (it0) this.f35281b;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        g2Var.finishFragment();
        int i7 = org.telegram.messenger.ks.f25289t;
        g2Var.getNotificationCenter().n((org.telegram.messenger.fs) g2Var, i7);
        g2Var.getNotificationCenter().k(i7, new Object[0]);
        g2Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(it0Var.f36130m1), (TLRPC.User) this.f35282c, null, Boolean.valueOf(z10));
        g2Var.getMessagesController().Z4(false);
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mm mmVar = (mm) this.f35281b;
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f35282c;
        if (z10 && !z11 && efVar.M && mmVar.d.n() == null) {
            if (mmVar.d.n() != null && !mmVar.d.n().isRecycled()) {
                mmVar.d.n().recycle();
                mmVar.d.x0(null);
            }
            mmVar.d.w0(Utilities.D(imageReceiver.n(), false));
        }
    }

    public g2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f35280a = 28;
        this.f35281b = contactsActivity;
        this.f35282c = user;
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        org.telegram.messenger.v10 v10Var = (org.telegram.messenger.v10) this.f35282c;
        n41 G = ((g51) this.f35281b).f35323g3.G(i7);
        if (G == null) {
            return false;
        }
        return v10Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override
    public void l(float f10) {
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void h() {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
