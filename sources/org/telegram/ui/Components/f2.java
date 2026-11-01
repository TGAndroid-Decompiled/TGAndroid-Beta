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
public final class f2 implements org.telegram.ui.ActionBar.u1, q4, org.telegram.messenger.cb, org.telegram.ui.Cells.u5, org.telegram.messenger.nc, ji, org.telegram.ui.ActionBar.j1, jk0, org.telegram.messenger.as, ik0, kk0 {
    public final int f26040a;
    public final Object f26041b;
    public final Object f26042c;

    public f2(int i10, Object obj, Object obj2) {
        this.f26040a = i10;
        this.f26041b = obj;
        this.f26042c = obj2;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        org.telegram.messenger.kj threadMessage;
        org.telegram.messenger.tw twVar;
        switch (this.f26040a) {
            case 4:
                String str = (String) this.f26042c;
                ChatActivityEnterView chatActivityEnterView = ((re) this.f26041b).f29979a;
                long j10 = chatActivityEnterView.Q2;
                org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.pz b10 = org.telegram.messenger.pz.b(str, j10, kjVar, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null) {
                    twVar = unVar.T8();
                } else {
                    twVar = null;
                }
                b10.K = twVar;
                b10.O = chatActivityEnterView.S4;
                org.telegram.messenger.rz.C(chatActivityEnterView.Q).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                be beVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                beVar.setEffect(0L);
                return;
            case 5:
                ((rf) this.f26041b).K((m2.t) this.f26042c, z10, i10, i11);
                return;
            case 6:
            default:
                jn jnVar = (jn) this.f26041b;
                View view = (View) this.f26042c;
                if (z10) {
                    jnVar.V = i10;
                    jnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.p8) {
                        jnVar.X((org.telegram.ui.Cells.p8) view, true);
                        return;
                    } else {
                        jnVar.f27509r.g(jnVar.I0);
                        return;
                    }
                }
                jnVar.getClass();
                return;
            case 7:
                bl blVar = ((yk) this.f26041b).f32863b;
                blVar.f24872u0.d(((al) this.f26042c).f24438c, blVar.f24873v0, z10, i10, 0L);
                blVar.f30964b.a(true);
                return;
        }
    }

    @Override
    public void a() {
        ko koVar = (ko) this.f26041b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f26042c;
        if (koVar.f27909c != null) {
            koVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            koVar.a();
        }
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        switch (this.f26040a) {
            case 21:
                org.telegram.messenger.p20 p20Var = (org.telegram.messenger.p20) this.f26042c;
                b51 G = ((v51) this.f26041b).f31183f3.G(i10);
                if (G == null) {
                    return;
                }
                p20Var.k(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            default:
                DataSettingsActivity.Z((DataSettingsActivity) this.f26041b, (Context) this.f26042c, view, i10, f7);
                return;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ka kaVar) {
        Location location;
        bl blVar = (bl) this.f26041b;
        org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f26042c;
        ImageView imageView = blVar.f24862n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = blVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = blVar.f24853d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            blVar.f24853d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            blVar.f24853d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, blVar.f24865p0 - org.telegram.messenger.i0.L(10.0f)));
            blVar.f24853d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = blVar.f24853d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            blVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            blVar.f24853d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            blVar.f24853d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, blVar.f24865p0));
            blVar.f24853d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!blVar.f24868r0) {
                int i10 = org.telegram.ui.ActionBar.t6.ij;
                org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                blVar.f24868r0 = true;
            }
            org.telegram.messenger.ha haVar = blVar.F;
            if (haVar != null && (location = blVar.f24864o0) != null) {
                location.setLatitude(((org.telegram.messenger.db) haVar.d().f9903b).f15333a);
                blVar.f24864o0.setLongitude(((org.telegram.messenger.db) blVar.F.d().f9903b).f15334b);
            }
            blVar.M.M(blVar.f24864o0);
        }
        return kaVar.a(motionEvent).booleanValue();
    }

    @Override
    public void d(org.telegram.ui.Cells.v5 v5Var) {
        int i10;
        boolean z10;
        TLRPC.Chat chat;
        bm bmVar = (bm) this.f26041b;
        org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) this.f26042c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.f24892w;
        boolean z11 = chatAttachAlertPhotoLayout.f23889v0;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        if (z11) {
            int i11 = biVar.K2;
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (i11 == 0 && !biVar.f24835y1) {
                int intValue = ((Integer) v5Var.getTag()).intValue();
                org.telegram.messenger.ff photoEntry = v5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.Y(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f23848s1;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new cc(biVar.f24786l3, chatAttachAlertPhotoLayout.f30963a).t(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(((org.telegram.messenger.l0) k2Var.getMessagesController().f19300y7.f18023d0.f10701a).f16855c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && biVar.M3 >= 0 && hashMap.size() >= biVar.M3) {
                        if (biVar.N3 && (k2Var instanceof org.telegram.ui.un) && (chat = ((org.telegram.ui.un) k2Var).e) != null && !org.telegram.messenger.w3.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            s4.N(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.dd.L0(2131745328, null), org.telegram.messenger.dd.L0(2131745321, null), null, null, chatAttachAlertPhotoLayout.f30963a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f23849t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((k2Var instanceof org.telegram.ui.un) && biVar.N3) {
                        v5Var.b(i10, z12, true);
                    } else {
                        v5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.R(photoEntry, intValue);
                    bm bmVar2 = chatAttachAlertPhotoLayout.f23890w;
                    if (bmVar == bmVar2) {
                        bm bmVar3 = chatAttachAlertPhotoLayout.G;
                        if (bmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (bmVar3.f24888f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        bmVar3.g(intValue);
                    } else {
                        bmVar2.g(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    biVar.J1(i12);
                    v5Var2.setHasSpoiler(photoEntry.M);
                    v5Var2.setHighQuality(photoEntry.c());
                    long j10 = photoEntry.N;
                    if (hashMap.size() > 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v5Var2.f(j10, z10);
                }
            }
        }
    }

    @Override
    public boolean f(int i10, View view) {
        o5 o5Var;
        p21 p21Var;
        int i11 = this.f26040a;
        Object obj = this.f26042c;
        Object obj2 = this.f26041b;
        switch (i11) {
            case 15:
                cv cvVar = (cv) obj2;
                Context context = (Context) obj;
                if (!(view instanceof vu) || (o5Var = ((vu) view).f31907c) == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(cvVar.getContext(), true, true);
                b1Var.setItemHeight(48);
                b1Var.setPadding(org.telegram.messenger.i0.L(26.0f), 0, org.telegram.messenger.i0.L(26.0f), 0);
                b1Var.setText(org.telegram.messenger.dd.L0(2131751767, null));
                b1Var.getTextView().setTextSize(1, 14.4f);
                b1Var.getTextView().setTypeface(org.telegram.messenger.i0.o());
                b1Var.setOnClickListener(new sr(2, cvVar, o5Var));
                LinearLayout linearLayout = new LinearLayout(context);
                Drawable mutate = cvVar.getContext().getDrawable(2131232561).mutate();
                org.telegram.ui.ActionBar.a7.y(linearLayout, mutate, org.telegram.ui.ActionBar.t6.G8, cvVar.I0, PorterDuff.Mode.MULTIPLY);
                linearLayout.setBackground(mutate);
                linearLayout.addView(b1Var);
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(linearLayout, -2, -2);
                cvVar.f25256x1 = k1Var;
                k1Var.setClippingEnabled(true);
                cvVar.f25256x1.g();
                cvVar.f25256x1.setInputMethodMode(2);
                cvVar.f25256x1.setSoftInputMode(0);
                cvVar.f25256x1.setOutsideTouchable(true);
                cvVar.f25256x1.setAnimationStyle(2131755191);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                cvVar.f25256x1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.i0.L(49.0f)), iArr[1] - org.telegram.messenger.i0.L(52.0f));
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                org.telegram.ui.al alVar = (org.telegram.ui.al) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((s11) ((u11) obj2).f30827s.f29856c.get(i10)).f30153a;
                if (tL_forumTopic == null || (p21Var = alVar.f35802a.f42057f2) == null || !p21Var.o(tL_forumTopic, view, true)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        boolean matches;
        switch (this.f26040a) {
            case 0:
                y3 y3Var = (y3) this.f26041b;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.f26042c;
                String trim = y3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = s4.f30174a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.i0.E3(y3Var);
                    return;
                }
                r20Var.a(trim);
                x1Var.dismiss();
                return;
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f26041b;
                int i11 = encryptedChat.ttl;
                int value = ((ac0) this.f26042c).getValue();
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
                if (i11 != encryptedChat.ttl) {
                    org.telegram.messenger.pw.i(org.telegram.messenger.e20.f15506s0).z(encryptedChat, null);
                    org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(org.telegram.messenger.e20.f15506s0);
                    a02.f16331a.c(new org.telegram.messenger.lq(a02, encryptedChat, 0));
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) this.f26042c;
                SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).e7.edit();
                edit.remove("color_" + ((String) this.f26041b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((org.telegram.messenger.as) this.f26041b).i(((boolean[]) this.f26042c)[0]);
                return;
            case 14:
                ((lt) this.f26041b).a(((org.telegram.ui.zd) this.f26042c).getText().toString().trim());
                return;
            case 16:
                l30 l30Var = (l30) this.f26041b;
                org.telegram.messenger.pa a2 = org.telegram.messenger.pa.a(l30Var.f28038a);
                ArrayList arrayList = a2.f17580f;
                int indexOf = arrayList.indexOf((String) this.f26042c);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a2.d();
                }
                l30Var.f28041f.O(true);
                return;
            case 17:
                hn0 hn0Var = (hn0) this.f26041b;
                hn0Var.getClass();
                x1Var.dismiss();
                hn0Var.L0.getDownloadController().j((ArrayList) this.f26042c);
                hn0Var.R(false);
                return;
            case 19:
                ((Runnable) this.f26041b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.vi.Z((TLRPC.StickerSet) this.f26042c);
                ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).sendRequest(tL_stickers_deleteStickerSet, new ag.c3(16));
                return;
            case 24:
                Context context = (Context) this.f26041b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f26042c));
                context.startActivity(intent);
                return;
            case 25:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f26041b;
                TLRPC.User user = (TLRPC.User) this.f26042c;
                nsVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                nsVar.getContactsController().i(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                nsVar.finishFragment();
                return;
            case 26:
                ContactsActivity contactsActivity = (ContactsActivity) this.f26041b;
                TLRPC.User user2 = (TLRPC.User) this.f26042c;
                org.telegram.ui.vs vsVar = contactsActivity.U;
                if (vsVar != null) {
                    vsVar.c(user2);
                    contactsActivity.U = null;
                    return;
                }
                return;
            case 27:
                ContactsActivity.Z((ContactsActivity) this.f26041b, (String) this.f26042c);
                return;
            default:
                org.telegram.ui.cv.Z((org.telegram.ui.cv) this.f26041b, (TLRPC.User) this.f26042c);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f26040a) {
            case 21:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(boolean z10) {
        au0 au0Var = (au0) this.f26041b;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        k2Var.finishFragment();
        int i10 = org.telegram.messenger.at.f14786t;
        k2Var.getNotificationCenter().n((org.telegram.messenger.vs) k2Var, i10);
        k2Var.getNotificationCenter().k(i10, new Object[0]);
        k2Var.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(au0Var.l1), (TLRPC.User) this.f26042c, null, Boolean.valueOf(z10));
        k2Var.getMessagesController().K4(false);
    }

    @Override
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.f26042c;
        ag.v vVar = (ag.v) this.f26041b;
        if (!arrayList.isEmpty()) {
            r20Var.a(new jh.i((org.telegram.messenger.kj) arrayList.get(0)));
        }
        vVar.a(true);
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        gm gmVar = (gm) this.f26041b;
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.f26042c;
        if (z10 && !z11 && ffVar.M && gmVar.d.n() == null) {
            if (gmVar.d.n() != null && !gmVar.d.n().isRecycled()) {
                gmVar.d.n().recycle();
                gmVar.d.w0(null);
            }
            gmVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f26040a;
    }

    public f2(org.telegram.messenger.r20 r20Var, ag.v vVar) {
        this.f26040a = 12;
        this.f26042c = r20Var;
        this.f26041b = vVar;
    }

    public f2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f26040a = 26;
        this.f26041b = contactsActivity;
        this.f26042c = user;
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f26042c;
        b51 G = ((v51) this.f26041b).f31183f3.G(i10);
        if (G == null) {
            return false;
        }
        return q20Var.a(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10)).booleanValue();
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void g() {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void k(View view, float f7, float f10) {
    }
}
