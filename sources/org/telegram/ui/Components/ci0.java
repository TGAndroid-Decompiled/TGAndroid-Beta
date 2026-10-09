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
public final class ci0 implements Runnable {
    public final int f25379a;
    public final Object f25380b;
    public final Object f25381c;

    public ci0(int i10, Object obj, Object obj2) {
        this.f25379a = i10;
        this.f25380b = obj;
        this.f25381c = obj2;
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
        switch (this.f25379a) {
            case 0:
                di0 di0Var = (di0) this.f25380b;
                TLObject tLObject = (TLObject) this.f25381c;
                di0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    di0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        di0Var.a(false);
                        return;
                    }
                    di0Var.d();
                    di0Var.f25714c.W2.N(true);
                    return;
                }
                return;
            case 1:
                ii0 ii0Var = (ii0) this.f25380b;
                ArrayList arrayList2 = (ArrayList) this.f25381c;
                ArrayList arrayList3 = ii0Var.f27394a;
                int i13 = ii0Var.f27407x;
                int size = arrayList2.size();
                ii0Var.f27407x = size;
                if (i13 != size && ii0Var.S != null) {
                    ii0Var.g();
                }
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    fi0 fi0Var = (fi0) arrayList3.get(i14);
                    if (fi0Var.f26385o && !fi0Var.f26386p) {
                        arrayList2.add(fi0Var);
                    } else if (ii0.j(fi0Var.f26373a, arrayList2) == null) {
                        ii0 ii0Var2 = fi0Var.f26394y;
                        float f11 = ii0Var2.N;
                        RectF rectF = fi0Var.f26375c;
                        f7 = f10;
                        RectF rectF2 = fi0Var.f26377f;
                        ia0 ia0Var = fi0Var.f26388r;
                        if (ia0Var != null) {
                            ia0Var.a();
                            fi0Var.f26390t = z15;
                            fi0Var.f26389s = z15;
                        }
                        fi0Var.f26385o = z16;
                        if (rectF.left - f7 <= f11) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + f7 >= ii0Var2.getMeasuredWidth() - f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        fi0Var.f26378g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = fi0Var.f26373a;
                            if (i15 != 3 && i15 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (ii0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    fi0Var.f26376e.d(0.0f, z12);
                                    arrayList2.add(fi0Var);
                                    i14++;
                                    z14 = z13;
                                    f10 = f7;
                                    z15 = false;
                                    z16 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z13 = false;
                            fi0Var.f26376e.d(0.0f, z12);
                            arrayList2.add(fi0Var);
                            i14++;
                            z14 = z13;
                            f10 = f7;
                            z15 = false;
                            z16 = true;
                        }
                        z12 = true;
                        z13 = false;
                        fi0Var.f26376e.d(0.0f, z12);
                        arrayList2.add(fi0Var);
                        i14++;
                        z14 = z13;
                        f10 = f7;
                        z15 = false;
                        z16 = true;
                    }
                    f7 = f10;
                    z13 = z14;
                    i14++;
                    z14 = z13;
                    f10 = f7;
                    z15 = false;
                    z16 = true;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                ii0Var.invalidate();
                return;
            case 2:
                fi0 fi0Var2 = (fi0) this.f25381c;
                hi0 hi0Var = ((ii0) this.f25380b).F;
                int i16 = fi0Var2.f26373a;
                RectF rectF3 = fi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.jy0) hi0Var).f39044b, i16, rectF3.left, rectF3.top);
                return;
            case 3:
                ViewParent viewParent = (ViewParent) this.f25381c;
                ((org.telegram.ui.Cells.u1) this.f25380b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 4:
                RLottieNative rLottieNative = (RLottieNative) this.f25380b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f25381c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 5:
                kk0 kk0Var = (kk0) this.f25380b;
                ArrayList arrayList4 = (ArrayList) this.f25381c;
                ArrayList arrayList5 = kk0Var.f28057r;
                kk0Var.f28056n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj = arrayList4.get(i17);
                    i17++;
                    jk0 jk0Var = (jk0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList5.size()) {
                            if (MessageObject.getObjectPeerId(((jk0) arrayList5.get(i18)).f27734a) == MessageObject.getObjectPeerId(jk0Var.f27734a)) {
                                if (jk0Var.f27736c > 0) {
                                    ((jk0) arrayList5.get(i18)).f27736c = jk0Var.f27736c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList5.add(jk0Var);
                        }
                    }
                }
                q0.a aVar = kk0Var.f28059w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                kk0Var.a();
                return;
            case 6:
                wo0 wo0Var = (wo0) this.f25380b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f25381c;
                ArrayList arrayList6 = wo0Var.K;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = wo0Var.L()) < wo0Var.h()) {
                    arrayList6.remove(indexOf);
                    wo0Var.u(L + 1 + indexOf);
                    int size4 = wo0Var.f10627j0.f10535e.size();
                    int size5 = arrayList6.size();
                    if (wo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        wo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((wo0) this.f25380b).T();
                ad.a0((org.telegram.ui.ty) this.f25381c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 8:
                ((hp0) this.f25380b).sendAccessibilityEvent((View) this.f25381c, 4);
                return;
            case 9:
                hf hfVar = (hf) this.f25380b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f25381c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    hfVar.dismiss();
                    return;
                }
                return;
            case 10:
                ((WindowManager) this.f25381c).removeView(((hf) this.f25380b).B);
                return;
            case 11:
                mr0 mr0Var = (mr0) this.f25380b;
                TLObject tLObject2 = (TLObject) this.f25381c;
                if (tLObject2 != null) {
                    mr0Var.f28907k0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    mr0Var.a1();
                    if (mr0Var.m0) {
                        mr0Var.N0();
                    }
                }
                mr0Var.f28908l0 = false;
                return;
            case 12:
                uu0 uu0Var = (uu0) this.f25380b;
                tr0 tr0Var = (tr0) this.f25381c;
                uu0Var.G = null;
                uu0Var.H = null;
                tr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new vd0(tr0Var, 14)).start();
                return;
            case 13:
                ai.f9 f9Var = (ai.f9) this.f25381c;
                ws0 ws0Var = ((bw0) this.f25380b).W;
                if (ws0Var != null) {
                    int i19 = f9Var.f1033a;
                    ws0Var.f35811n.d(i19, ws0Var.f35813s.i(i19));
                    return;
                }
                return;
            case 14:
                ad.a0(((ku0) this.f25380b).f28170f.f25166v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f25381c).title)).k(true);
                return;
            case 15:
                xu0 xu0Var = (xu0) this.f25380b;
                String str = (String) this.f25381c;
                if (!xu0Var.v.f25162t1[xu0Var.f33014r].f30274a.isEmpty() && ((i10 = xu0Var.f33014r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, xu0Var.v.f25162t1[i10].f30274a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    bw0 bw0Var = xu0Var.v;
                    if (bw0Var.f25141j1 == bw0Var.f25166v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    xu0Var.F(id2, str, dialogId, j3);
                } else if (xu0Var.f33014r == 3) {
                    bw0 bw0Var2 = xu0Var.v;
                    xu0Var.F(0, str, bw0Var2.f25141j1, bw0Var2.F);
                }
                int i20 = xu0Var.f33014r;
                if (i20 == 1 || i20 == 4) {
                    ArrayList arrayList7 = new ArrayList(xu0Var.v.f25162t1[xu0Var.f33014r].f30274a);
                    xu0Var.f33015s++;
                    Utilities.searchQueue.postRunnable(new og0(xu0Var, str, arrayList7, 10));
                    return;
                }
                return;
            case 16:
                xu0 xu0Var2 = (xu0) this.f25380b;
                ArrayList arrayList8 = (ArrayList) this.f25381c;
                bw0 bw0Var3 = xu0Var2.v;
                boolean z17 = bw0Var3.V0;
                uu0[] uu0VarArr = bw0Var3.f25142k0;
                if (z17) {
                    xu0Var2.f33015s--;
                    int h = xu0Var2.h();
                    xu0Var2.d = arrayList8;
                    int h10 = xu0Var2.h();
                    if (xu0Var2.f33015s == 0 || h10 != 0) {
                        bw0Var3.m1(false);
                    }
                    for (int i21 = 0; i21 < uu0VarArr.length; i21++) {
                        uu0 uu0Var2 = uu0VarArr[i21];
                        if (uu0Var2.F == xu0Var2.f33014r) {
                            if (xu0Var2.f33015s == 0 && h10 == 0) {
                                uu0Var2.f31627w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                uu0VarArr[i21].f31627w.f24803f.setVisibility(8);
                                uu0VarArr[i21].f31627w.e(false, true);
                            } else if (h == 0) {
                                bw0Var3.z(uu0Var2.h, 0, null);
                            }
                        }
                    }
                    xu0Var2.l();
                    return;
                }
                return;
            case 17:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i22 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i22, bool, (TLObject) this.f25381c, (TLRPC.Document) this.f25380b, null, bool);
                return;
            case 18:
                MessagesController.getInstance(((jz0) this.f25380b).f27807a.f29601a).updateEmojiStatus((TLRPC.EmojiStatus) this.f25381c);
                return;
            case 19:
                c41 c41Var = (c41) this.f25380b;
                MessagesController.getInstance(c41Var.f25237b).getTopicsController().deleteTopics(-c41Var.f25239c, (ArrayList) this.f25381c);
                int i23 = c41.f25234f0;
                return;
            case 20:
                c41 c41Var2 = (c41) this.f25380b;
                c41Var2.getClass();
                MessagesController.getInstance(c41Var2.f25237b).loadFullChat(((TLRPC.Updates) this.f25381c).chats.get(0).f20038id, 0, true);
                return;
            case 21:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f25380b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f25381c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.g0(i12);
                    return;
                }
                return;
            case 22:
                b51.q((b51) this.f25380b, (TLObject) this.f25381c);
                return;
            case 23:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.f25380b;
                ((org.telegram.ui.ActionBar.n1) this.f25381c).d(true);
                s51.a(alVar.getContext(), alVar.d);
                return;
            case 24:
                ((TranslateController) this.f25381c).setHideTranslateDialog(((org.telegram.ui.al) this.f25380b).f30666b, false);
                return;
            case 25:
                UndoView undoView = (UndoView) this.f25380b;
                TLObject tLObject3 = (TLObject) this.f25381c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24382s.presentFragment(new org.telegram.ui.vo0((TLRPC.PaymentReceipt) tLObject3));
                    return;
                }
                int i24 = UndoView.f24370e0;
                undoView.getClass();
                return;
            case 26:
                ((p61) this.f25380b).D.onClick((org.telegram.ui.Cells.v8) this.f25381c);
                return;
            case 27:
                k81 k81Var = (k81) this.f25380b;
                b2.u0 u0Var = (b2.u0) this.f25381c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.o) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = k81.f27877l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList9 = k81Var.N;
                    if (arrayList9 != null) {
                        int i25 = 0;
                        while (i25 < arrayList9.size()) {
                            g81 g81Var = (g81) arrayList9.get(i25);
                            int i26 = 0;
                            while (true) {
                                ArrayList arrayList10 = g81Var.d;
                                if (i26 < arrayList10.size()) {
                                    i81 i81Var = (i81) arrayList10.get(i26);
                                    if (!TextUtils.isEmpty(i81Var.f27278m) && !k81.Y(i81Var.f27278m)) {
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
                    k81Var.N = arrayList;
                    if (arrayList != null) {
                        k81Var.F(arrayList, k81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = k81Var.f27892n;
                if (textureView != null && ((!k81Var.E && (cause instanceof r2.q)) || (cause instanceof a3.x))) {
                    k81Var.E = true;
                    if (k81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(k81Var.f27892n);
                            viewGroup.removeView(k81Var.f27892n);
                            viewGroup.addView(k81Var.f27892n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = k81Var.f27880b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new c81(k81Var, 0));
                            return;
                        }
                        i2.f0 f0Var = k81Var.d;
                        TextureView textureView2 = k81Var.f27892n;
                        f0Var.D1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.D1();
                            f0Var.q1();
                            f0Var.v1(null);
                            f0Var.o1(0, 0);
                        }
                        k81Var.d.x1(k81Var.f27892n);
                        ArrayList arrayList11 = k81Var.N;
                        if (arrayList11 != null) {
                            k81Var.F(arrayList11, k81Var.O);
                        } else if (k81Var.U) {
                            k81Var.G(k81Var.Q, k81Var.S, k81Var.R, k81Var.T);
                        } else {
                            k81Var.D(k81Var.Q, k81Var.S);
                        }
                        k81Var.C();
                        return;
                    }
                    return;
                }
                k81Var.J.onError(k81Var, u0Var);
                return;
            case 28:
                ((j81) this.f25380b).f27638f.K.onVisualizerUpdate(true, true, (float[]) this.f25381c);
                return;
            default:
                s81 s81Var = (s81) this.f25380b;
                Bitmap bitmap = (Bitmap) this.f25381c;
                if (bitmap != null) {
                    if (s81Var.f30732w != null) {
                        Bitmap bitmap2 = s81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        s81Var.v = s81Var.f30732w;
                    }
                    s81Var.f30732w = bitmap;
                    Bitmap bitmap3 = s81Var.f30732w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    s81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(s81Var.L);
                    s81Var.J.setShader(s81Var.G);
                    s81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = s81Var.getLayoutParams();
                    if (s81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        s81Var.setVisibility(0);
                        s81Var.requestLayout();
                    }
                }
                s81Var.f30726f = null;
                return;
        }
    }

    public ci0(Object obj, Object obj2, Object obj3, int i10) {
        this.f25379a = i10;
        this.f25380b = obj;
        this.f25381c = obj2;
    }

    public ci0(TLObject tLObject, TLRPC.Document document) {
        this.f25379a = 17;
        this.f25381c = tLObject;
        this.f25380b = document;
    }
}
