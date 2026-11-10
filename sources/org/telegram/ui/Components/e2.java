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
public final class e2 implements org.telegram.ui.ActionBar.r1, s4, org.telegram.messenger.bb, org.telegram.ui.Cells.p5, org.telegram.messenger.lc, ji, org.telegram.ui.ActionBar.f1, dj0, org.telegram.messenger.qr, cj0, ej0 {
    public final int f33140a;
    public final Object f33141b;
    public final Object f33142c;

    public e2(int i7, Object obj, Object obj2) {
        this.f33140a = i7;
        this.f33141b = obj;
        this.f33142c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.hw hwVar;
        switch (this.f33140a) {
            case 4:
                String str = (String) this.f33142c;
                ChatActivityEnterView chatActivityEnterView = ((ve) this.f33141b).f38989a;
                long j3 = chatActivityEnterView.Q2;
                org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, j3, ijVar, threadMessage, null, false, null, null, null, z9, i7, i10, null, false);
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                if (cnVar != null) {
                    hwVar = cnVar.X8();
                } else {
                    hwVar = null;
                }
                b10.K = hwVar;
                b10.O = chatActivityEnterView.S4;
                org.telegram.messenger.gz.C(chatActivityEnterView.Q).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                fe feVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                feVar.setEffect(0L);
                return;
            case 5:
                ((uf) this.f33141b).K((qt) this.f33142c, z9, i7, i10);
                return;
            default:
                an anVar = (an) this.f33141b;
                View view = (View) this.f33142c;
                if (z9) {
                    anVar.V = i7;
                    anVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        anVar.Z((org.telegram.ui.Cells.m8) view, true);
                        return;
                    } else {
                        anVar.f31920r.g(anVar.I0);
                        return;
                    }
                }
                anVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        ao aoVar = (ao) this.f33141b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33142c;
        if (aoVar.f31939c != null) {
            aoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            aoVar.a();
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        Location location;
        vk vkVar = (vk) this.f33141b;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f33142c;
        ImageView imageView = vkVar.f39028n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = vkVar.O;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = vkVar.f39016a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            vkVar.f39016a0 = animatorSet2;
            animatorSet2.setDuration(200L);
            vkVar.f39016a0.playTogether(ObjectAnimator.ofFloat(imageView2, property, vkVar.f39025j0 - org.telegram.messenger.g0.L(10.0f)));
            vkVar.f39016a0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = vkVar.f39016a0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            vkVar.G = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            vkVar.f39016a0 = animatorSet4;
            animatorSet4.setDuration(200L);
            vkVar.f39016a0.playTogether(ObjectAnimator.ofFloat(imageView2, property, vkVar.f39025j0));
            vkVar.f39016a0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!vkVar.f39027l0) {
                int i7 = org.telegram.ui.ActionBar.m6.ij;
                org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                vkVar.f39027l0 = true;
            }
            org.telegram.messenger.fa faVar = vkVar.D;
            if (faVar != null && (location = vkVar.f39024i0) != null) {
                location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13162b).f21837a);
                vkVar.f39024i0.setLongitude(((org.telegram.messenger.cb) vkVar.D.d().f13162b).f21838b);
            }
            vkVar.K.L(vkVar.f39024i0);
        }
        return iaVar.a(motionEvent).booleanValue();
    }

    @Override
    public boolean c(int i7, View view) {
        q5 q5Var;
        m11 m11Var;
        int i10 = this.f33140a;
        Object obj = this.f33142c;
        Object obj2 = this.f33141b;
        switch (i10) {
            case 14:
                qu quVar = (qu) obj2;
                Context context = (Context) obj;
                if (!(view instanceof ju) || (q5Var = ((ju) view).f35077c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(quVar.getContext(), true, true);
                z0Var.setItemHeight(48);
                z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                z0Var.setText(org.telegram.messenger.id.M0(2131751767, null));
                z0Var.getTextView().setTextSize(1, 14.4f);
                z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                z0Var.setOnClickListener(new kk(9, quVar, q5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = quVar.getContext().getDrawable(2131232564).mutate();
                org.telegram.ui.ActionBar.t6.x(linearLayout, mutate, org.telegram.ui.ActionBar.m6.G8, quVar.I0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(z0Var);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                quVar.A1 = g1Var;
                g1Var.setClippingEnabled(true);
                quVar.A1.g();
                quVar.A1.setInputMethodMode(2);
                quVar.A1.setSoftInputMode(0);
                quVar.A1.setOutsideTouchable(true);
                quVar.A1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                quVar.A1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.fk fkVar = (org.telegram.ui.fk) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((p01) ((s01) obj2).f37810s.f36185c.get(i7)).f36747a;
                if (tL_forumTopic == null || (m11Var = fkVar.f45787a.f44490f2) == null || !m11Var.o(tL_forumTopic, view, true)) {
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
        sl slVar = (sl) this.f33141b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.f33142c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.f38024w;
        boolean z10 = chatAttachAlertPhotoLayout.f31246v0;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (z10) {
            int i10 = ciVar.N2;
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            if (i10 == 0 && !ciVar.B1) {
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.gf photoEntry = q5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                        new gc(ciVar.f32634o3, chatAttachAlertPhotoLayout.f38655a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(((org.telegram.messenger.j0) f2Var.getMessagesController().f24946x7.f24439d0.f13557b).f23464c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z11 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && ciVar.P3 >= 0 && hashMap.size() >= ciVar.P3) {
                        if (ciVar.Q3 && (f2Var instanceof org.telegram.ui.cn) && (chat = ((org.telegram.ui.cn) f2Var).f44473e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            u4.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745303, null), null, null, chatAttachAlertPhotoLayout.f38655a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f31207t1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((f2Var instanceof org.telegram.ui.cn) && ciVar.Q3) {
                        q5Var.b(i7, z11, true);
                    } else {
                        q5Var.b(-1, z11, true);
                    }
                    chatAttachAlertPhotoLayout.S(photoEntry, intValue);
                    sl slVar2 = chatAttachAlertPhotoLayout.f31247w;
                    if (slVar == slVar2) {
                        sl slVar3 = chatAttachAlertPhotoLayout.G;
                        if (slVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (slVar3.f38020f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        slVar3.g(intValue);
                    } else {
                        slVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    ciVar.K1(i11);
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
        org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f33142c;
        di.u2 u2Var = (di.u2) this.f33141b;
        if (!arrayList.isEmpty()) {
            c20Var.a(new th.g((org.telegram.messenger.ij) arrayList.get(0)));
        }
        u2Var.a(true);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        switch (this.f33140a) {
            case 20:
                org.telegram.messenger.a20 a20Var = (org.telegram.messenger.a20) this.f33142c;
                x31 G = ((r41) this.f33141b).f37496f3.G(i7);
                if (G == null) {
                    return;
                }
                a20Var.i(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
                return;
            default:
                DataSettingsActivity.Z((DataSettingsActivity) this.f33141b, (Context) this.f33142c, view, i7, f10);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        xl xlVar = (xl) this.f33141b;
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f33142c;
        if (z9 && !z10 && gfVar.M && xlVar.d.n() == null) {
            if (xlVar.d.n() != null && !xlVar.d.n().isRecycled()) {
                xlVar.d.n().recycle();
                xlVar.d.w0(null);
            }
            xlVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f33140a) {
            case 20:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean matches;
        switch (this.f33140a) {
            case 0:
                a4 a4Var = (a4) this.f33141b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f33142c;
                String trim = a4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = u4.f38507a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.F3(a4Var);
                    return;
                }
                c20Var.a(trim);
                u1Var.dismiss();
                return;
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f33141b;
                int i10 = encryptedChat.ttl;
                int value = ((hb0) this.f33142c).getValue();
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
                    org.telegram.messenger.dw.i(org.telegram.messenger.p10.f24474s0).z(encryptedChat, null);
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(org.telegram.messenger.p10.f24474s0);
                    a02.f26723a.c(new org.telegram.messenger.eq(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) this.f33142c;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24768d7.edit();
                edit.remove("color_" + ((String) this.f33141b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((org.telegram.messenger.qr) this.f33141b).k(((boolean[]) this.f33142c)[0]);
                return;
            case 13:
                ((xs) this.f33141b).a(((bi.v) this.f33142c).getText().toString().trim());
                return;
            case 15:
                t20 t20Var = (t20) this.f33141b;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(t20Var.f38143a);
                ArrayList arrayList = a10.f24320f;
                int indexOf = arrayList.indexOf((String) this.f33142c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                t20Var.f38147f.O(true);
                return;
            case 16:
                fm0 fm0Var = (fm0) this.f33141b;
                fm0Var.getClass();
                u1Var.dismiss();
                fm0Var.L0.getDownloadController().j((ArrayList) this.f33142c);
                fm0Var.R(false);
                return;
            case 18:
                ((Runnable) this.f33141b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ui.Z((TLRPC.StickerSet) this.f33142c);
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24474s0).sendRequest(tL_stickers_deleteStickerSet, new di.v5(21));
                return;
            case 23:
                Context context = (Context) this.f33141b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f33142c));
                context.startActivity(intent);
                return;
            case 24:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.f33141b;
                TLRPC.User user = (TLRPC.User) this.f33142c;
                qrVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                qrVar.getContactsController().i(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                qrVar.finishFragment();
                return;
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33141b;
                TLRPC.User user2 = (TLRPC.User) this.f33142c;
                org.telegram.ui.yr yrVar = contactsActivity.U;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.U = null;
                    return;
                }
                return;
            case 26:
                ContactsActivity.Z((ContactsActivity) this.f33141b, (String) this.f33142c);
                return;
            default:
                org.telegram.ui.du.Z((org.telegram.ui.du) this.f33141b, (TLRPC.User) this.f33142c);
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        ys0 ys0Var = (ys0) this.f33141b;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        f2Var.finishFragment();
        int i7 = org.telegram.messenger.qs.f25080t;
        f2Var.getNotificationCenter().n((org.telegram.messenger.ls) f2Var, i7);
        f2Var.getNotificationCenter().k(i7, new Object[0]);
        f2Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(ys0Var.l1), (TLRPC.User) this.f33142c, null, Boolean.valueOf(z9));
        f2Var.getMessagesController().N4(false);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f33140a;
    }

    public e2(org.telegram.messenger.c20 c20Var, di.u2 u2Var) {
        this.f33140a = 11;
        this.f33142c = c20Var;
        this.f33141b = u2Var;
    }

    public e2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f33140a = 25;
        this.f33141b = contactsActivity;
        this.f33142c = user;
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.f33142c;
        x31 G = ((r41) this.f33141b).f37496f3.G(i7);
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
