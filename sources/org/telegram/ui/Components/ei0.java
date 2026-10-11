package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class ei0 implements Runnable {
    public final int f26100a;
    public final Object f26101b;
    public final Object f26102c;

    public ei0(int i10, Object obj, Object obj2) {
        this.f26100a = i10;
        this.f26101b = obj;
        this.f26102c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int indexOf;
        int L;
        int i10;
        long j3;
        int i11;
        boolean z14 = false;
        float f10 = 1.0f;
        int i12 = 2;
        ArrayList arrayList = null;
        boolean z15 = false;
        boolean z16 = true;
        switch (this.f26100a) {
            case 0:
                ji0 ji0Var = (ji0) this.f26101b;
                ArrayList arrayList2 = (ArrayList) this.f26102c;
                ArrayList arrayList3 = ji0Var.f27749a;
                int i13 = ji0Var.f27762x;
                int size = arrayList2.size();
                ji0Var.f27762x = size;
                if (i13 != size && ji0Var.S != null) {
                    ji0Var.g();
                }
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    gi0 gi0Var = (gi0) arrayList3.get(i14);
                    if (gi0Var.f26762o && !gi0Var.f26763p) {
                        arrayList2.add(gi0Var);
                    } else if (ji0.j(gi0Var.f26750a, arrayList2) == null) {
                        ji0 ji0Var2 = gi0Var.f26771y;
                        float f11 = ji0Var2.N;
                        RectF rectF = gi0Var.f26752c;
                        f7 = f10;
                        RectF rectF2 = gi0Var.f26754f;
                        ia0 ia0Var = gi0Var.f26765r;
                        if (ia0Var != null) {
                            ia0Var.a();
                            gi0Var.f26767t = z15;
                            gi0Var.f26766s = z15;
                        }
                        gi0Var.f26762o = z16;
                        if (rectF.left - f7 <= f11) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + f7 >= ji0Var2.getMeasuredWidth() - f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        gi0Var.f26755g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = gi0Var.f26750a;
                            if (i15 != 3 && i15 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (ji0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    gi0Var.f26753e.d(0.0f, z12);
                                    arrayList2.add(gi0Var);
                                    i14++;
                                    z14 = z13;
                                    z16 = z12;
                                    f10 = f7;
                                    z15 = false;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z13 = false;
                            gi0Var.f26753e.d(0.0f, z12);
                            arrayList2.add(gi0Var);
                            i14++;
                            z14 = z13;
                            z16 = z12;
                            f10 = f7;
                            z15 = false;
                        }
                        z12 = true;
                        z13 = false;
                        gi0Var.f26753e.d(0.0f, z12);
                        arrayList2.add(gi0Var);
                        i14++;
                        z14 = z13;
                        z16 = z12;
                        f10 = f7;
                        z15 = false;
                    }
                    f7 = f10;
                    z12 = z16;
                    z13 = z14;
                    i14++;
                    z14 = z13;
                    z16 = z12;
                    f10 = f7;
                    z15 = false;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                ji0Var.invalidate();
                return;
            case 1:
                gi0 gi0Var2 = (gi0) this.f26102c;
                ii0 ii0Var = ((ji0) this.f26101b).F;
                int i16 = gi0Var2.f26750a;
                RectF rectF3 = gi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.iy0) ii0Var).f38835b, i16, rectF3.left, rectF3.top);
                return;
            case 2:
                ViewParent viewParent = (ViewParent) this.f26102c;
                ((org.telegram.ui.Cells.u1) this.f26101b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 3:
                RLottieNative rLottieNative = (RLottieNative) this.f26101b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f26102c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 4:
                lk0 lk0Var = (lk0) this.f26101b;
                ArrayList arrayList4 = (ArrayList) this.f26102c;
                ArrayList arrayList5 = lk0Var.f28450r;
                lk0Var.f28449n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj = arrayList4.get(i17);
                    i17++;
                    kk0 kk0Var = (kk0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList5.size()) {
                            if (MessageObject.getObjectPeerId(((kk0) arrayList5.get(i18)).f28100a) == MessageObject.getObjectPeerId(kk0Var.f28100a)) {
                                if (kk0Var.f28102c > 0) {
                                    ((kk0) arrayList5.get(i18)).f28102c = kk0Var.f28102c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList5.add(kk0Var);
                        }
                    }
                }
                q0.a aVar = lk0Var.f28452w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                lk0Var.a();
                return;
            case 5:
                xo0 xo0Var = (xo0) this.f26101b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26102c;
                ArrayList arrayList6 = xo0Var.K;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = xo0Var.L()) < xo0Var.h()) {
                    arrayList6.remove(indexOf);
                    xo0Var.u(L + 1 + indexOf);
                    int size4 = xo0Var.f10626j0.f10534e.size();
                    int size5 = arrayList6.size();
                    if (xo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        xo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((xo0) this.f26101b).T();
                ad.a0((org.telegram.ui.sy) this.f26102c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 7:
                ((ip0) this.f26101b).sendAccessibilityEvent((View) this.f26102c, 4);
                return;
            case 8:
                hf hfVar = (hf) this.f26101b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f26102c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    hfVar.dismiss();
                    return;
                }
                return;
            case 9:
                ((WindowManager) this.f26102c).removeView(((hf) this.f26101b).B);
                return;
            case 10:
                nr0 nr0Var = (nr0) this.f26101b;
                TLObject tLObject = (TLObject) this.f26102c;
                if (tLObject != null) {
                    nr0Var.f29246k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    nr0Var.a1();
                    if (nr0Var.m0) {
                        nr0Var.N0();
                    }
                }
                nr0Var.f29247l0 = false;
                return;
            case 11:
                vu0 vu0Var = (vu0) this.f26101b;
                ur0 ur0Var = (ur0) this.f26102c;
                vu0Var.G = null;
                vu0Var.H = null;
                ur0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new vd0(ur0Var, 14)).start();
                return;
            case 12:
                ai.f9 f9Var = (ai.f9) this.f26102c;
                xs0 xs0Var = ((cw0) this.f26101b).W;
                if (xs0Var != null) {
                    int i19 = f9Var.f1033a;
                    xs0Var.f44590n.d(i19, xs0Var.f44592s.i(i19));
                    return;
                }
                return;
            case 13:
                ad.a0(((lu0) this.f26101b).f28622f.f25536v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f26102c).title)).k(true);
                return;
            case 14:
                yu0 yu0Var = (yu0) this.f26101b;
                String str = (String) this.f26102c;
                if (!yu0Var.v.f25532t1[yu0Var.f33466r].f30637a.isEmpty() && ((i10 = yu0Var.f33466r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, yu0Var.v.f25532t1[i10].f30637a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    cw0 cw0Var = yu0Var.v;
                    if (cw0Var.f25511j1 == cw0Var.f25536v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    yu0Var.F(id2, str, dialogId, j3);
                } else if (yu0Var.f33466r == 3) {
                    cw0 cw0Var2 = yu0Var.v;
                    yu0Var.F(0, str, cw0Var2.f25511j1, cw0Var2.F);
                }
                int i20 = yu0Var.f33466r;
                if (i20 == 1 || i20 == 4) {
                    ArrayList arrayList7 = new ArrayList(yu0Var.v.f25532t1[yu0Var.f33466r].f30637a);
                    yu0Var.f33467s++;
                    Utilities.searchQueue.postRunnable(new bf0(yu0Var, str, arrayList7, 11));
                    return;
                }
                return;
            case 15:
                yu0 yu0Var2 = (yu0) this.f26101b;
                ArrayList arrayList8 = (ArrayList) this.f26102c;
                cw0 cw0Var3 = yu0Var2.v;
                boolean z17 = cw0Var3.V0;
                vu0[] vu0VarArr = cw0Var3.f25512k0;
                if (z17) {
                    yu0Var2.f33467s--;
                    int h = yu0Var2.h();
                    yu0Var2.d = arrayList8;
                    int h10 = yu0Var2.h();
                    if (yu0Var2.f33467s == 0 || h10 != 0) {
                        cw0Var3.m1(false);
                    }
                    for (int i21 = 0; i21 < vu0VarArr.length; i21++) {
                        vu0 vu0Var2 = vu0VarArr[i21];
                        if (vu0Var2.F == yu0Var2.f33466r) {
                            if (yu0Var2.f33467s == 0 && h10 == 0) {
                                vu0Var2.f32558w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                vu0VarArr[i21].f32558w.f25124f.setVisibility(8);
                                vu0VarArr[i21].f32558w.e(false, true);
                            } else if (h == 0) {
                                cw0Var3.z(vu0Var2.h, 0, null);
                            }
                        }
                    }
                    yu0Var2.l();
                    return;
                }
                return;
            case 16:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i22 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i22, bool, (TLObject) this.f26101b, (TLRPC.Document) this.f26102c, null, bool);
                return;
            case 17:
                MessagesController.getInstance(((kz0) this.f26101b).f28163a.f29991a).updateEmojiStatus((TLRPC.EmojiStatus) this.f26102c);
                return;
            case 18:
                d41 d41Var = (d41) this.f26101b;
                MessagesController.getInstance(d41Var.f25610b).getTopicsController().deleteTopics(-d41Var.f25612c, (ArrayList) this.f26102c);
                int i23 = d41.f25607f0;
                return;
            case 19:
                d41 d41Var2 = (d41) this.f26101b;
                d41Var2.getClass();
                MessagesController.getInstance(d41Var2.f25610b).loadFullChat(((TLRPC.Updates) this.f26102c).chats.get(0).f20068id, 0, true);
                return;
            case 20:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26101b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26102c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.g0(i12);
                    return;
                }
                return;
            case 21:
                c51.q((c51) this.f26101b, (TLObject) this.f26102c);
                return;
            case 22:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.f26101b;
                ((org.telegram.ui.ActionBar.m1) this.f26102c).d(true);
                t51.a(alVar.getContext(), alVar.d);
                return;
            case 23:
                ((TranslateController) this.f26102c).setHideTranslateDialog(((org.telegram.ui.al) this.f26101b).f31074b, false);
                return;
            case 24:
                UndoView undoView = (UndoView) this.f26101b;
                TLObject tLObject2 = (TLObject) this.f26102c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24410s.presentFragment(new org.telegram.ui.uo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i24 = UndoView.f24398e0;
                undoView.getClass();
                return;
            case 25:
                ((q61) this.f26101b).D.onClick((org.telegram.ui.Cells.v8) this.f26102c);
                return;
            case 26:
                l81 l81Var = (l81) this.f26101b;
                b2.u0 u0Var = (b2.u0) this.f26102c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.o) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = l81.f28267l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList9 = l81Var.N;
                    if (arrayList9 != null) {
                        int i25 = 0;
                        while (i25 < arrayList9.size()) {
                            h81 h81Var = (h81) arrayList9.get(i25);
                            int i26 = 0;
                            while (true) {
                                ArrayList arrayList10 = h81Var.d;
                                if (i26 < arrayList10.size()) {
                                    j81 j81Var = (j81) arrayList10.get(i26);
                                    if (!TextUtils.isEmpty(j81Var.f27652m) && !l81.Y(j81Var.f27652m)) {
                                        arrayList10.remove(i26);
                                        i26--;
                                    }
                                    i26++;
                                } else {
                                    if (arrayList10.isEmpty()) {
                                        arrayList9.remove(i25);
                                        i25--;
                                    }
                                    i25++;
                                }
                            }
                        }
                        arrayList = arrayList9;
                    }
                    l81Var.N = arrayList;
                    if (arrayList != null) {
                        l81Var.F(arrayList, l81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = l81Var.f28282n;
                if (textureView != null && ((!l81Var.E && (cause instanceof r2.q)) || (cause instanceof a3.x))) {
                    l81Var.E = true;
                    if (l81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(l81Var.f28282n);
                            viewGroup.removeView(l81Var.f28282n);
                            viewGroup.addView(l81Var.f28282n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = l81Var.f28270b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new z71(l81Var, 1));
                            return;
                        }
                        i2.f0 f0Var = l81Var.d;
                        TextureView textureView2 = l81Var.f28282n;
                        f0Var.D1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.D1();
                            f0Var.q1();
                            f0Var.v1(null);
                            f0Var.o1(0, 0);
                        }
                        l81Var.d.x1(l81Var.f28282n);
                        ArrayList arrayList11 = l81Var.N;
                        if (arrayList11 != null) {
                            l81Var.F(arrayList11, l81Var.O);
                        } else if (l81Var.U) {
                            l81Var.G(l81Var.Q, l81Var.S, l81Var.R, l81Var.T);
                        } else {
                            l81Var.D(l81Var.Q, l81Var.S);
                        }
                        l81Var.C();
                        return;
                    }
                    return;
                }
                l81Var.J.onError(l81Var, u0Var);
                return;
            case 27:
                ((k81) this.f26101b).f27988f.K.onVisualizerUpdate(true, true, (float[]) this.f26102c);
                return;
            case 28:
                t81 t81Var = (t81) this.f26101b;
                Bitmap bitmap = (Bitmap) this.f26102c;
                if (bitmap != null) {
                    if (t81Var.f31174w != null) {
                        Bitmap bitmap2 = t81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        t81Var.v = t81Var.f31174w;
                    }
                    t81Var.f31174w = bitmap;
                    Bitmap bitmap3 = t81Var.f31174w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    t81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(t81Var.L);
                    t81Var.J.setShader(t81Var.G);
                    t81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = t81Var.getLayoutParams();
                    if (t81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        t81Var.setVisibility(0);
                        t81Var.requestLayout();
                    }
                }
                t81Var.f31168f = null;
                return;
            default:
                final ga1 ga1Var = (ga1) this.f26101b;
                ga1Var.f26712e.f27040b.evaluateJavascript((String) this.f26102c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str2 = (String) obj2;
                        ga1 ga1Var2 = ga1.this;
                        String[] strArr = ga1Var2.f26711c;
                        String str3 = strArr[0];
                        String str4 = ga1Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        ga1Var2.f26710b.countDown();
                    }
                });
                return;
        }
    }

    public ei0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26100a = i10;
        this.f26101b = obj;
        this.f26102c = obj2;
    }
}
