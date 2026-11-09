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
public final class f2 implements org.telegram.ui.ActionBar.r1, t4, org.telegram.messenger.bb, org.telegram.ui.Cells.p5, org.telegram.messenger.lc, ki, org.telegram.ui.ActionBar.f1, ej0, org.telegram.messenger.qr, dj0, fj0 {
    public final int f33560a;
    public final Object f33561b;
    public final Object f33562c;

    public f2(int i7, Object obj, Object obj2) {
        this.f33560a = i7;
        this.f33561b = obj;
        this.f33562c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.hw hwVar;
        switch (this.f33560a) {
            case 4:
                String str = (String) this.f33562c;
                ChatActivityEnterView chatActivityEnterView = ((we) this.f33561b).f40038a;
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
                ge geVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                geVar.setEffect(0L);
                return;
            case 5:
                ((vf) this.f33561b).K((rt) this.f33562c, z9, i7, i10);
                return;
            default:
                bn bnVar = (bn) this.f33561b;
                View view = (View) this.f33562c;
                if (z9) {
                    bnVar.V = i7;
                    bnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        bnVar.Z((org.telegram.ui.Cells.m8) view, true);
                        return;
                    } else {
                        bnVar.f32317r.g(bnVar.I0);
                        return;
                    }
                }
                bnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        bo boVar = (bo) this.f33561b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33562c;
        if (boVar.f32336c != null) {
            boVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            boVar.a();
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        Location location;
        wk wkVar = (wk) this.f33561b;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f33562c;
        ImageView imageView = wkVar.f40077n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = wkVar.O;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = wkVar.f40065a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            wkVar.f40065a0 = animatorSet2;
            animatorSet2.setDuration(200L);
            wkVar.f40065a0.playTogether(ObjectAnimator.ofFloat(imageView2, property, wkVar.f40074j0 - org.telegram.messenger.g0.L(10.0f)));
            wkVar.f40065a0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = wkVar.f40065a0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            wkVar.G = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            wkVar.f40065a0 = animatorSet4;
            animatorSet4.setDuration(200L);
            wkVar.f40065a0.playTogether(ObjectAnimator.ofFloat(imageView2, property, wkVar.f40074j0));
            wkVar.f40065a0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!wkVar.f40076l0) {
                int i7 = org.telegram.ui.ActionBar.l6.ij;
                org.telegram.ui.ActionBar.s6.s(imageView, i7, g6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                wkVar.f40076l0 = true;
            }
            org.telegram.messenger.fa faVar = wkVar.D;
            if (faVar != null && (location = wkVar.f40073i0) != null) {
                location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13160b).f21833a);
                wkVar.f40073i0.setLongitude(((org.telegram.messenger.cb) wkVar.D.d().f13160b).f21834b);
            }
            wkVar.K.L(wkVar.f40073i0);
        }
        return iaVar.a(motionEvent).booleanValue();
    }

    @Override
    public boolean c(int i7, View view) {
        r5 r5Var;
        n11 n11Var;
        int i10 = this.f33560a;
        Object obj = this.f33562c;
        Object obj2 = this.f33561b;
        switch (i10) {
            case 14:
                ru ruVar = (ru) obj2;
                Context context = (Context) obj;
                if (!(view instanceof ku) || (r5Var = ((ku) view).f35486c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(ruVar.getContext(), true, true);
                z0Var.setItemHeight(48);
                z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                z0Var.setText(org.telegram.messenger.id.M0(2131751767, null));
                z0Var.getTextView().setTextSize(1, 14.4f);
                z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                z0Var.setOnClickListener(new lk(9, ruVar, r5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = ruVar.getContext().getDrawable(2131232564).mutate();
                org.telegram.ui.ActionBar.s6.x(linearLayout, mutate, org.telegram.ui.ActionBar.l6.G8, ruVar.I0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(z0Var);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                ruVar.f37819x1 = g1Var;
                g1Var.setClippingEnabled(true);
                ruVar.f37819x1.g();
                ruVar.f37819x1.setInputMethodMode(2);
                ruVar.f37819x1.setSoftInputMode(0);
                ruVar.f37819x1.setOutsideTouchable(true);
                ruVar.f37819x1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                ruVar.f37819x1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.fk fkVar = (org.telegram.ui.fk) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((q01) ((t01) obj2).f38226s.f36593c.get(i7)).f37148a;
                if (tL_forumTopic == null || (n11Var = fkVar.f45734a.f44449f2) == null || !n11Var.o(tL_forumTopic, view, true)) {
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
        tl tlVar = (tl) this.f33561b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.f33562c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tlVar.f38450w;
        boolean z10 = chatAttachAlertPhotoLayout.f31235v0;
        di diVar = chatAttachAlertPhotoLayout.f39071b;
        if (z10) {
            int i10 = diVar.K2;
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (i10 == 0 && !diVar.f33070y1) {
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.gf photoEntry = q5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.a0(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f31195s1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                        new hc(diVar.f33022l3, chatAttachAlertPhotoLayout.f39070a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(((org.telegram.messenger.j0) f2Var.getMessagesController().f24942x7.f24435d0.f13555b).f23460c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z11 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && diVar.M3 >= 0 && hashMap.size() >= diVar.M3) {
                        if (diVar.N3 && (f2Var instanceof org.telegram.ui.cn) && (chat = ((org.telegram.ui.cn) f2Var).f44432e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            v4.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745303, null), null, null, chatAttachAlertPhotoLayout.f39070a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i7 = ChatAttachAlertPhotoLayout.f31196t1.size();
                    } else {
                        i7 = -1;
                    }
                    if ((f2Var instanceof org.telegram.ui.cn) && diVar.N3) {
                        q5Var.b(i7, z11, true);
                    } else {
                        q5Var.b(-1, z11, true);
                    }
                    chatAttachAlertPhotoLayout.S(photoEntry, intValue);
                    tl tlVar2 = chatAttachAlertPhotoLayout.f31236w;
                    if (tlVar == tlVar2) {
                        tl tlVar3 = chatAttachAlertPhotoLayout.G;
                        if (tlVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (tlVar3.f38446f && intValue >= chatAttachAlertPhotoLayout.M0) {
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
        org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f33562c;
        di.u2 u2Var = (di.u2) this.f33561b;
        if (!arrayList.isEmpty()) {
            c20Var.a(new th.g((org.telegram.messenger.ij) arrayList.get(0)));
        }
        u2Var.a(true);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        switch (this.f33560a) {
            case 20:
                org.telegram.messenger.a20 a20Var = (org.telegram.messenger.a20) this.f33562c;
                y31 G = ((r41) this.f33561b).f37556f3.G(i7);
                if (G == null) {
                    return;
                }
                a20Var.i(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
                return;
            default:
                DataSettingsActivity.Z((DataSettingsActivity) this.f33561b, (Context) this.f33562c, view, i7, f10);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        yl ylVar = (yl) this.f33561b;
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f33562c;
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
        switch (this.f33560a) {
            case 20:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean matches;
        switch (this.f33560a) {
            case 0:
                b4 b4Var = (b4) this.f33561b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f33562c;
                String trim = b4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = v4.f38913a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.F3(b4Var);
                    return;
                }
                c20Var.a(trim);
                u1Var.dismiss();
                return;
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f33561b;
                int i10 = encryptedChat.ttl;
                int value = ((ib0) this.f33562c).getValue();
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
                    org.telegram.messenger.dw.i(org.telegram.messenger.p10.f24470s0).z(encryptedChat, null);
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(org.telegram.messenger.p10.f24470s0);
                    a02.f26719a.c(new org.telegram.messenger.eq(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) this.f33562c;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24764d7.edit();
                edit.remove("color_" + ((String) this.f33561b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((org.telegram.messenger.qr) this.f33561b).k(((boolean[]) this.f33562c)[0]);
                return;
            case 13:
                ((ys) this.f33561b).a(((bi.v) this.f33562c).getText().toString().trim());
                return;
            case 15:
                u20 u20Var = (u20) this.f33561b;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(u20Var.f38571a);
                ArrayList arrayList = a10.f24316f;
                int indexOf = arrayList.indexOf((String) this.f33562c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                u20Var.f38575f.O(true);
                return;
            case 16:
                gm0 gm0Var = (gm0) this.f33561b;
                gm0Var.getClass();
                u1Var.dismiss();
                gm0Var.L0.getDownloadController().j((ArrayList) this.f33562c);
                gm0Var.R(false);
                return;
            case 18:
                ((Runnable) this.f33561b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ui.Z((TLRPC.StickerSet) this.f33562c);
                ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_stickers_deleteStickerSet, new di.v5(21));
                return;
            case 23:
                Context context = (Context) this.f33561b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f33562c));
                context.startActivity(intent);
                return;
            case 24:
                org.telegram.ui.pr prVar = (org.telegram.ui.pr) this.f33561b;
                TLRPC.User user = (TLRPC.User) this.f33562c;
                prVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                prVar.getContactsController().i(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                prVar.finishFragment();
                return;
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33561b;
                TLRPC.User user2 = (TLRPC.User) this.f33562c;
                org.telegram.ui.xr xrVar = contactsActivity.U;
                if (xrVar != null) {
                    xrVar.b(user2);
                    contactsActivity.U = null;
                    return;
                }
                return;
            case 26:
                ContactsActivity.Z((ContactsActivity) this.f33561b, (String) this.f33562c);
                return;
            default:
                org.telegram.ui.cu.Z((org.telegram.ui.cu) this.f33561b, (TLRPC.User) this.f33562c);
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        zs0 zs0Var = (zs0) this.f33561b;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        f2Var.finishFragment();
        int i7 = org.telegram.messenger.qs.f25076t;
        f2Var.getNotificationCenter().n((org.telegram.messenger.ls) f2Var, i7);
        f2Var.getNotificationCenter().k(i7, new Object[0]);
        f2Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(zs0Var.l1), (TLRPC.User) this.f33562c, null, Boolean.valueOf(z9));
        f2Var.getMessagesController().N4(false);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f33560a;
    }

    public f2(org.telegram.messenger.c20 c20Var, di.u2 u2Var) {
        this.f33560a = 11;
        this.f33562c = c20Var;
        this.f33561b = u2Var;
    }

    public f2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f33560a = 25;
        this.f33561b = contactsActivity;
        this.f33562c = user;
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.f33562c;
        y31 G = ((r41) this.f33561b).f37556f3.G(i7);
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
