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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
public final class f2 implements org.telegram.ui.ActionBar.r1, t4, org.telegram.messenger.bb, org.telegram.ui.Cells.p5, org.telegram.messenger.lc, ki, org.telegram.ui.ActionBar.f1, dj0, org.telegram.messenger.qr, cj0, ej0 {
    public final int f33442a;
    public final Object f33443b;
    public final Object f33444c;

    public f2(int i7, Object obj, Object obj2) {
        this.f33442a = i7;
        this.f33443b = obj;
        this.f33444c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.hw hwVar;
        switch (this.f33442a) {
            case 4:
                String str = (String) this.f33444c;
                ChatActivityEnterView chatActivityEnterView = ((we) this.f33443b).f39955a;
                long j3 = chatActivityEnterView.Q2;
                org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, j3, ijVar, threadMessage, null, false, null, null, null, z9, i7, i10, null, false);
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                if (anVar != null) {
                    hwVar = anVar.W8();
                } else {
                    hwVar = null;
                }
                b10.K = hwVar;
                b10.O = chatActivityEnterView.S4;
                org.telegram.messenger.gz.C(chatActivityEnterView.Q).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ge geVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                geVar.setEffect(0L);
                return;
            case 5:
                ((vf) this.f33443b).K((qt) this.f33444c, z9, i7, i10);
                return;
            default:
                bn bnVar = (bn) this.f33443b;
                View view = (View) this.f33444c;
                if (z9) {
                    bnVar.V = i7;
                    bnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        bnVar.Z((org.telegram.ui.Cells.m8) view, true);
                        return;
                    } else {
                        bnVar.f32203r.g(bnVar.I0);
                        return;
                    }
                }
                bnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        bo boVar = (bo) this.f33443b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33444c;
        if (boVar.f32230c != null) {
            boVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            boVar.a();
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        Location location;
        wk wkVar = (wk) this.f33443b;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f33444c;
        ImageView imageView = wkVar.f39999n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = wkVar.O;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = wkVar.f39987a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            wkVar.f39987a0 = animatorSet2;
            animatorSet2.setDuration(200L);
            wkVar.f39987a0.playTogether(ObjectAnimator.ofFloat(imageView2, property, wkVar.f39996j0 - org.telegram.messenger.g0.L(10.0f)));
            wkVar.f39987a0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = wkVar.f39987a0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            wkVar.G = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            wkVar.f39987a0 = animatorSet4;
            animatorSet4.setDuration(200L);
            wkVar.f39987a0.playTogether(ObjectAnimator.ofFloat(imageView2, property, wkVar.f39996j0));
            wkVar.f39987a0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!wkVar.f39998l0) {
                int i7 = org.telegram.ui.ActionBar.k6.ij;
                org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                wkVar.f39998l0 = true;
            }
            org.telegram.messenger.fa faVar = wkVar.D;
            if (faVar != null && (location = wkVar.f39995i0) != null) {
                location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13160b).f21791a);
                wkVar.f39995i0.setLongitude(((org.telegram.messenger.cb) wkVar.D.d().f13160b).f21792b);
            }
            wkVar.K.L(wkVar.f39995i0);
        }
        return iaVar.a(motionEvent).booleanValue();
    }

    @Override
    public boolean c(int i7, View view) {
        r5 r5Var;
        l11 l11Var;
        int i10 = this.f33442a;
        Object obj = this.f33444c;
        Object obj2 = this.f33443b;
        switch (i10) {
            case 14:
                qu quVar = (qu) obj2;
                Context context = (Context) obj;
                if (!(view instanceof ju) || (r5Var = ((ju) view).f35046c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(quVar.getContext(), true, true);
                z0Var.setItemHeight(48);
                z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                z0Var.setText(org.telegram.messenger.hd.M0(2131751767, null));
                z0Var.getTextView().setTextSize(1, 14.4f);
                z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                z0Var.setOnClickListener(new lk(9, quVar, r5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = quVar.getContext().getDrawable(2131232564).mutate();
                org.telegram.ui.ActionBar.r6.y(linearLayout, mutate, org.telegram.ui.ActionBar.k6.G8, quVar.I0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(z0Var);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                quVar.f37408x1 = g1Var;
                g1Var.setClippingEnabled(true);
                quVar.f37408x1.g();
                quVar.f37408x1.setInputMethodMode(2);
                quVar.f37408x1.setSoftInputMode(0);
                quVar.f37408x1.setOutsideTouchable(true);
                quVar.f37408x1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                quVar.f37408x1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((o01) ((r01) obj2).f37472s.f35812c.get(i7)).f36451a;
                if (tL_forumTopic == null || (l11Var = dkVar.f45086a.f43789f2) == null || !l11Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void d(org.telegram.ui.Cells.q5 q5Var) {
        int i7;
        boolean z9;
        TLRPC.Chat chat;
        tl tlVar = (tl) this.f33443b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.f33444c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tlVar.f38369w;
        boolean z10 = chatAttachAlertPhotoLayout.f31225v0;
        di diVar = chatAttachAlertPhotoLayout.f38948b;
        if (z10) {
            int i10 = diVar.K2;
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (i10 == 0 && !diVar.f32978y1) {
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.gf photoEntry = q5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                        new hc(diVar.f32930l3, chatAttachAlertPhotoLayout.f38947a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(((org.telegram.messenger.j0) f2Var.getMessagesController().f24927x7.f24424d0.f13555b).f23432c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z11 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && diVar.M3 >= 0 && hashMap.size() >= diVar.M3) {
                        if (diVar.N3 && (f2Var instanceof org.telegram.ui.an) && (chat = ((org.telegram.ui.an) f2Var).f43772e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            v4.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.hd.M0(2131745311, null), org.telegram.messenger.hd.M0(2131745304, null), null, null, chatAttachAlertPhotoLayout.f38947a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f31186t1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((f2Var instanceof org.telegram.ui.an) && diVar.N3) {
                        q5Var.b(i7, z11, true);
                    } else {
                        q5Var.b(-1, z11, true);
                    }
                    chatAttachAlertPhotoLayout.S(photoEntry, intValue);
                    tl tlVar2 = chatAttachAlertPhotoLayout.f31226w;
                    if (tlVar == tlVar2) {
                        tl tlVar3 = chatAttachAlertPhotoLayout.G;
                        if (tlVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (tlVar3.f38365f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        tlVar3.g(intValue);
                    } else {
                        tlVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    diVar.K1(i11);
                    q5Var2.setHasSpoiler(photoEntry.M);
                    q5Var2.setHighQuality(photoEntry.c());
                    long j3 = photoEntry.N;
                    if (hashMap.size() > 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    q5Var2.f(j3, z9);
                }
            }
        }
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f33444c;
        di.u2 u2Var = (di.u2) this.f33443b;
        if (!arrayList.isEmpty()) {
            c20Var.a(new th.g((org.telegram.messenger.ij) arrayList.get(0)));
        }
        u2Var.a(true);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        switch (this.f33442a) {
            case 20:
                org.telegram.messenger.a20 a20Var = (org.telegram.messenger.a20) this.f33444c;
                w31 G = ((p41) this.f33443b).f36781f3.G(i7);
                if (G == null) {
                    return;
                }
                a20Var.i(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
                return;
            default:
                DataSettingsActivity.Z((DataSettingsActivity) this.f33443b, (Context) this.f33444c, view, i7, f10);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        yl ylVar = (yl) this.f33443b;
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f33444c;
        if (z9 && !z10 && gfVar.M && ylVar.d.n() == null) {
            if (ylVar.d.n() != null && !ylVar.d.n().isRecycled()) {
                ylVar.d.n().recycle();
                ylVar.d.w0(null);
            }
            ylVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f33442a) {
            case 20:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean matches;
        switch (this.f33442a) {
            case 0:
                b4 b4Var = (b4) this.f33443b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f33444c;
                String trim = b4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = v4.f38814a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.F3(b4Var);
                    return;
                }
                c20Var.a(trim);
                u1Var.dismiss();
                return;
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f33443b;
                int i10 = encryptedChat.ttl;
                int value = ((hb0) this.f33444c).getValue();
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
                    org.telegram.messenger.dw.i(org.telegram.messenger.p10.f24459s0).z(encryptedChat, null);
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(org.telegram.messenger.p10.f24459s0);
                    a02.f26688a.c(new org.telegram.messenger.eq(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) this.f33444c;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7.edit();
                edit.remove("color_" + ((String) this.f33443b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((org.telegram.messenger.qr) this.f33443b).k(((boolean[]) this.f33444c)[0]);
                return;
            case 13:
                ((xs) this.f33443b).a(((bi.v) this.f33444c).getText().toString().trim());
                return;
            case 15:
                t20 t20Var = (t20) this.f33443b;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(t20Var.f38195a);
                ArrayList arrayList = a10.f24305f;
                int indexOf = arrayList.indexOf((String) this.f33444c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                t20Var.f38199f.O(true);
                return;
            case 16:
                fm0 fm0Var = (fm0) this.f33443b;
                fm0Var.getClass();
                u1Var.dismiss();
                fm0Var.L0.getDownloadController().j((ArrayList) this.f33444c);
                fm0Var.R(false);
                return;
            case 18:
                ((Runnable) this.f33443b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ui.Z((TLRPC.StickerSet) this.f33444c);
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).sendRequest(tL_stickers_deleteStickerSet, new di.u5(21));
                return;
            case 23:
                Context context = (Context) this.f33443b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f33444c));
                context.startActivity(intent);
                return;
            case 24:
                org.telegram.ui.nr nrVar = (org.telegram.ui.nr) this.f33443b;
                TLRPC.User user = (TLRPC.User) this.f33444c;
                nrVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                nrVar.getContactsController().i(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                nrVar.finishFragment();
                return;
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33443b;
                TLRPC.User user2 = (TLRPC.User) this.f33444c;
                org.telegram.ui.vr vrVar = contactsActivity.U;
                if (vrVar != null) {
                    vrVar.b(user2);
                    contactsActivity.U = null;
                    return;
                }
                return;
            case 26:
                ContactsActivity.Z((ContactsActivity) this.f33443b, (String) this.f33444c);
                return;
            default:
                org.telegram.ui.au.Z((org.telegram.ui.au) this.f33443b, (TLRPC.User) this.f33444c);
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        xs0 xs0Var = (xs0) this.f33443b;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
        f2Var.finishFragment();
        int i7 = org.telegram.messenger.qs.f25059t;
        f2Var.getNotificationCenter().n((org.telegram.messenger.ls) f2Var, i7);
        f2Var.getNotificationCenter().k(i7, new Object[0]);
        f2Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(xs0Var.l1), (TLRPC.User) this.f33444c, null, Boolean.valueOf(z9));
        f2Var.getMessagesController().N4(false);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f33442a;
    }

    public f2(org.telegram.messenger.c20 c20Var, di.u2 u2Var) {
        this.f33442a = 11;
        this.f33444c = c20Var;
        this.f33443b = u2Var;
    }

    public f2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f33442a = 25;
        this.f33443b = contactsActivity;
        this.f33444c = user;
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.f33444c;
        w31 G = ((p41) this.f33443b).f36781f3.G(i7);
        if (G == null) {
            return false;
        }
        return b20Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    private final void h(View view, float f10, float f11) {
    }

    private final void j(View view, float f10, float f11) {
    }
}
