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
public final class fi0 implements Runnable {
    public final int f26358a;
    public final Object f26359b;
    public final Object f26360c;

    public fi0(int i10, Object obj, Object obj2) {
        this.f26358a = i10;
        this.f26359b = obj;
        this.f26360c = obj2;
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
        switch (this.f26358a) {
            case 0:
                ki0 ki0Var = (ki0) this.f26359b;
                ArrayList arrayList2 = (ArrayList) this.f26360c;
                ArrayList arrayList3 = ki0Var.f27985a;
                int i13 = ki0Var.f27998x;
                int size = arrayList2.size();
                ki0Var.f27998x = size;
                if (i13 != size && ki0Var.S != null) {
                    ki0Var.g();
                }
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    hi0 hi0Var = (hi0) arrayList3.get(i14);
                    if (hi0Var.f27009o && !hi0Var.f27010p) {
                        arrayList2.add(hi0Var);
                    } else if (ki0.j(hi0Var.f26997a, arrayList2) == null) {
                        ki0 ki0Var2 = hi0Var.f27018y;
                        float f11 = ki0Var2.N;
                        RectF rectF = hi0Var.f26999c;
                        f7 = f10;
                        RectF rectF2 = hi0Var.f27001f;
                        ja0 ja0Var = hi0Var.f27012r;
                        if (ja0Var != null) {
                            ja0Var.a();
                            hi0Var.f27014t = z15;
                            hi0Var.f27013s = z15;
                        }
                        hi0Var.f27009o = z16;
                        if (rectF.left - f7 <= f11) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + f7 >= ki0Var2.getMeasuredWidth() - f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        hi0Var.f27002g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = hi0Var.f26997a;
                            if (i15 != 3 && i15 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (ki0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    hi0Var.f27000e.d(0.0f, z12);
                                    arrayList2.add(hi0Var);
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
                            hi0Var.f27000e.d(0.0f, z12);
                            arrayList2.add(hi0Var);
                            i14++;
                            z14 = z13;
                            z16 = z12;
                            f10 = f7;
                            z15 = false;
                        }
                        z12 = true;
                        z13 = false;
                        hi0Var.f27000e.d(0.0f, z12);
                        arrayList2.add(hi0Var);
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
                ki0Var.invalidate();
                return;
            case 1:
                hi0 hi0Var2 = (hi0) this.f26360c;
                ji0 ji0Var = ((ki0) this.f26359b).F;
                int i16 = hi0Var2.f26997a;
                RectF rectF3 = hi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.iy0) ji0Var).f38801b, i16, rectF3.left, rectF3.top);
                return;
            case 2:
                ViewParent viewParent = (ViewParent) this.f26360c;
                ((org.telegram.ui.Cells.u1) this.f26359b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 3:
                RLottieNative rLottieNative = (RLottieNative) this.f26359b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f26360c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 4:
                mk0 mk0Var = (mk0) this.f26359b;
                ArrayList arrayList4 = (ArrayList) this.f26360c;
                ArrayList arrayList5 = mk0Var.f28743r;
                mk0Var.f28742n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj = arrayList4.get(i17);
                    i17++;
                    lk0 lk0Var = (lk0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList5.size()) {
                            if (MessageObject.getObjectPeerId(((lk0) arrayList5.get(i18)).f28358a) == MessageObject.getObjectPeerId(lk0Var.f28358a)) {
                                if (lk0Var.f28360c > 0) {
                                    ((lk0) arrayList5.get(i18)).f28360c = lk0Var.f28360c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList5.add(lk0Var);
                        }
                    }
                }
                q0.a aVar = mk0Var.f28745w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                mk0Var.a();
                return;
            case 5:
                yo0 yo0Var = (yo0) this.f26359b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26360c;
                ArrayList arrayList6 = yo0Var.K;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = yo0Var.L()) < yo0Var.h()) {
                    arrayList6.remove(indexOf);
                    yo0Var.u(L + 1 + indexOf);
                    int size4 = yo0Var.f10626j0.f10534e.size();
                    int size5 = arrayList6.size();
                    if (yo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        yo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((yo0) this.f26359b).T();
                ad.a0((org.telegram.ui.sy) this.f26360c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 7:
                ((jp0) this.f26359b).sendAccessibilityEvent((View) this.f26360c, 4);
                return;
            case 8:
                hf hfVar = (hf) this.f26359b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f26360c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    hfVar.dismiss();
                    return;
                }
                return;
            case 9:
                ((WindowManager) this.f26360c).removeView(((hf) this.f26359b).B);
                return;
            case 10:
                or0 or0Var = (or0) this.f26359b;
                TLObject tLObject = (TLObject) this.f26360c;
                if (tLObject != null) {
                    or0Var.f29489k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    or0Var.a1();
                    if (or0Var.m0) {
                        or0Var.N0();
                    }
                }
                or0Var.f29490l0 = false;
                return;
            case 11:
                wu0 wu0Var = (wu0) this.f26359b;
                vr0 vr0Var = (vr0) this.f26360c;
                wu0Var.G = null;
                wu0Var.H = null;
                vr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new wd0(vr0Var, 14)).start();
                return;
            case 12:
                ai.f9 f9Var = (ai.f9) this.f26360c;
                ys0 ys0Var = ((dw0) this.f26359b).W;
                if (ys0Var != null) {
                    int i19 = f9Var.f1033a;
                    ys0Var.f44556n.d(i19, ys0Var.f44558s.i(i19));
                    return;
                }
                return;
            case 13:
                ad.a0(((mu0) this.f26359b).f28863f.f25735v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f26360c).title)).k(true);
                return;
            case 14:
                zu0 zu0Var = (zu0) this.f26359b;
                String str = (String) this.f26360c;
                if (!zu0Var.v.f25731t1[zu0Var.f33667r].f30867a.isEmpty() && ((i10 = zu0Var.f33667r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, zu0Var.v.f25731t1[i10].f30867a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    dw0 dw0Var = zu0Var.v;
                    if (dw0Var.f25710j1 == dw0Var.f25735v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    zu0Var.F(id2, str, dialogId, j3);
                } else if (zu0Var.f33667r == 3) {
                    dw0 dw0Var2 = zu0Var.v;
                    zu0Var.F(0, str, dw0Var2.f25710j1, dw0Var2.F);
                }
                int i20 = zu0Var.f33667r;
                if (i20 == 1 || i20 == 4) {
                    ArrayList arrayList7 = new ArrayList(zu0Var.v.f25731t1[zu0Var.f33667r].f30867a);
                    zu0Var.f33668s++;
                    Utilities.searchQueue.postRunnable(new cf0(zu0Var, str, arrayList7, 11));
                    return;
                }
                return;
            case 15:
                zu0 zu0Var2 = (zu0) this.f26359b;
                ArrayList arrayList8 = (ArrayList) this.f26360c;
                dw0 dw0Var3 = zu0Var2.v;
                boolean z17 = dw0Var3.V0;
                wu0[] wu0VarArr = dw0Var3.f25711k0;
                if (z17) {
                    zu0Var2.f33668s--;
                    int h = zu0Var2.h();
                    zu0Var2.d = arrayList8;
                    int h10 = zu0Var2.h();
                    if (zu0Var2.f33668s == 0 || h10 != 0) {
                        dw0Var3.m1(false);
                    }
                    for (int i21 = 0; i21 < wu0VarArr.length; i21++) {
                        wu0 wu0Var2 = wu0VarArr[i21];
                        if (wu0Var2.F == zu0Var2.f33667r) {
                            if (zu0Var2.f33668s == 0 && h10 == 0) {
                                wu0Var2.f32746w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                wu0VarArr[i21].f32746w.f25352f.setVisibility(8);
                                wu0VarArr[i21].f32746w.e(false, true);
                            } else if (h == 0) {
                                dw0Var3.z(wu0Var2.h, 0, null);
                            }
                        }
                    }
                    zu0Var2.l();
                    return;
                }
                return;
            case 16:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i22 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i22, bool, (TLObject) this.f26359b, (TLRPC.Document) this.f26360c, null, bool);
                return;
            case 17:
                MessagesController.getInstance(((lz0) this.f26359b).f28479a.f30268a).updateEmojiStatus((TLRPC.EmojiStatus) this.f26360c);
                return;
            case 18:
                e41 e41Var = (e41) this.f26359b;
                MessagesController.getInstance(e41Var.f25842b).getTopicsController().deleteTopics(-e41Var.f25844c, (ArrayList) this.f26360c);
                int i23 = e41.f25839f0;
                return;
            case 19:
                e41 e41Var2 = (e41) this.f26359b;
                e41Var2.getClass();
                MessagesController.getInstance(e41Var2.f25842b).loadFullChat(((TLRPC.Updates) this.f26360c).chats.get(0).f20032id, 0, true);
                return;
            case 20:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26359b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26360c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.g0(i12);
                    return;
                }
                return;
            case 21:
                d51.q((d51) this.f26359b, (TLObject) this.f26360c);
                return;
            case 22:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.f26359b;
                ((org.telegram.ui.ActionBar.m1) this.f26360c).d(true);
                u51.a(alVar.getContext(), alVar.d);
                return;
            case 23:
                ((TranslateController) this.f26360c).setHideTranslateDialog(((org.telegram.ui.al) this.f26359b).f31245b, false);
                return;
            case 24:
                UndoView undoView = (UndoView) this.f26359b;
                TLObject tLObject2 = (TLObject) this.f26360c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24374s.presentFragment(new org.telegram.ui.uo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i24 = UndoView.f24362e0;
                undoView.getClass();
                return;
            case 25:
                ((r61) this.f26359b).D.onClick((org.telegram.ui.Cells.v8) this.f26360c);
                return;
            case 26:
                m81 m81Var = (m81) this.f26359b;
                b2.u0 u0Var = (b2.u0) this.f26360c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.o) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = m81.f28606l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList9 = m81Var.N;
                    if (arrayList9 != null) {
                        int i25 = 0;
                        while (i25 < arrayList9.size()) {
                            i81 i81Var = (i81) arrayList9.get(i25);
                            int i26 = 0;
                            while (true) {
                                ArrayList arrayList10 = i81Var.d;
                                if (i26 < arrayList10.size()) {
                                    k81 k81Var = (k81) arrayList10.get(i26);
                                    if (!TextUtils.isEmpty(k81Var.f27878m) && !m81.Y(k81Var.f27878m)) {
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
                    m81Var.N = arrayList;
                    if (arrayList != null) {
                        m81Var.F(arrayList, m81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = m81Var.f28621n;
                if (textureView != null && ((!m81Var.E && (cause instanceof r2.q)) || (cause instanceof a3.x))) {
                    m81Var.E = true;
                    if (m81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(m81Var.f28621n);
                            viewGroup.removeView(m81Var.f28621n);
                            viewGroup.addView(m81Var.f28621n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = m81Var.f28609b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new e81(m81Var, 0));
                            return;
                        }
                        i2.f0 f0Var = m81Var.d;
                        TextureView textureView2 = m81Var.f28621n;
                        f0Var.D1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.D1();
                            f0Var.q1();
                            f0Var.v1(null);
                            f0Var.o1(0, 0);
                        }
                        m81Var.d.x1(m81Var.f28621n);
                        ArrayList arrayList11 = m81Var.N;
                        if (arrayList11 != null) {
                            m81Var.F(arrayList11, m81Var.O);
                        } else if (m81Var.U) {
                            m81Var.G(m81Var.Q, m81Var.S, m81Var.R, m81Var.T);
                        } else {
                            m81Var.D(m81Var.Q, m81Var.S);
                        }
                        m81Var.C();
                        return;
                    }
                    return;
                }
                m81Var.J.onError(m81Var, u0Var);
                return;
            case 27:
                ((l81) this.f26359b).f28237f.K.onVisualizerUpdate(true, true, (float[]) this.f26360c);
                return;
            case 28:
                u81 u81Var = (u81) this.f26359b;
                Bitmap bitmap = (Bitmap) this.f26360c;
                if (bitmap != null) {
                    if (u81Var.f31349w != null) {
                        Bitmap bitmap2 = u81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        u81Var.v = u81Var.f31349w;
                    }
                    u81Var.f31349w = bitmap;
                    Bitmap bitmap3 = u81Var.f31349w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    u81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(u81Var.L);
                    u81Var.J.setShader(u81Var.G);
                    u81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = u81Var.getLayoutParams();
                    if (u81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        u81Var.setVisibility(0);
                        u81Var.requestLayout();
                    }
                }
                u81Var.f31343f = null;
                return;
            default:
                final ha1 ha1Var = (ha1) this.f26359b;
                ha1Var.f26963e.f27248b.evaluateJavascript((String) this.f26360c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str2 = (String) obj2;
                        ha1 ha1Var2 = ha1.this;
                        String[] strArr = ha1Var2.f26962c;
                        String str3 = strArr[0];
                        String str4 = ha1Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        ha1Var2.f26961b.countDown();
                    }
                });
                return;
        }
    }

    public fi0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26358a = i10;
        this.f26359b = obj;
        this.f26360c = obj2;
    }
}
