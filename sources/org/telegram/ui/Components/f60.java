package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class f60 implements Runnable {
    public final int f24941a;
    public final Object f24942b;
    public final Object f24943c;

    public f60(int i10, Object obj, Object obj2) {
        this.f24941a = i10;
        this.f24942b = obj;
        this.f24943c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        p70 p70Var;
        org.telegram.ui.mb mbVar;
        di.x0 x0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11;
        boolean z15 = false;
        long j10 = 0;
        boolean z16 = false;
        boolean z17 = true;
        switch (this.f24941a) {
            case 0:
                i60 i60Var = (i60) this.f24942b;
                d60 d60Var = (d60) this.f24943c;
                p60 p60Var = i60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                p60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, p60Var.Q);
                VideoEditedInfo videoEditedInfo2 = p60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = p60Var.M;
                videoEditedInfo2.encryptedFile = p60Var.N;
                videoEditedInfo2.key = p60Var.O;
                videoEditedInfo2.iv = p60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = i60Var.f25857a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = p60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = p60Var.f28178j1;
                videoEditedInfo3.estimatedDuration = p60Var.f28179k0;
                p60Var.f28178j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.f25857a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (d60Var != null) {
                    photoEntry.ttl = d60Var.f24306c;
                    photoEntry.effectId = d60Var.d;
                }
                b60 b60Var = p60Var.f28182n;
                VideoEditedInfo videoEditedInfo4 = p60Var.S;
                if (d60Var != null && !d60Var.f24304a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (d60Var != null) {
                    i10 = d60Var.f24305b;
                } else {
                    i10 = 0;
                }
                if (d60Var != null) {
                    j10 = d60Var.e;
                }
                b60Var.s(photoEntry, videoEditedInfo4, z10, i10, 0, false, j10);
                return;
            case 1:
                Bitmap bitmap = (Bitmap) this.f24943c;
                i60 i60Var2 = (i60) ((org.telegram.ui.Cells.t6) this.f24942b).f22096b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && i60Var2.A0.size() > 1) {
                    ArrayList arrayList = i60Var2.A0;
                    arrayList.add((Bitmap) i2.d.g(1, arrayList));
                    return;
                }
                i60Var2.A0.add(bitmap);
                return;
            case 2:
                p70 p70Var2 = (p70) this.f24942b;
                TLObject tLObject = (TLObject) this.f24943c;
                p70Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        p70Var2.f28208c.put(Long.valueOf(p70Var2.f28206b.admin_id), (TLRPC.User) vector.objects.get(0));
                        p70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                j70 j70Var = (j70) this.f24942b;
                if (((TLRPC.TL_error) this.f24943c) == null && (mbVar = (p70Var = j70Var.f26212a.f26598c).f28217j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.f28206b;
                    org.telegram.ui.ac acVar = mbVar.f38212a;
                    ArrayList arrayList2 = acVar.f34148o0;
                    int size = arrayList2.size();
                    int i12 = acVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = acVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ac.L0(acVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) acVar.f34147n0, (HashMap<String, ArrayList<MessageObject>>) acVar.m0, acVar.f34138f, acVar.T, true).contentType >= 0) {
                        acVar.R0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            acVar.C0.N = true;
                            org.telegram.ui.wb wbVar = acVar.E;
                            wbVar.s(wbVar.h, size2);
                            org.telegram.ui.ac.K0(acVar);
                        }
                        acVar.f34163y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f24943c;
                ((a80) this.f24942b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 5:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.ChatFull) this.f24942b).guard_bot_id);
                ((org.telegram.ui.np) this.f24943c).presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                y90 y90Var = (y90) this.f24942b;
                if (y90Var.O0 == ((ea0) this.f24943c)) {
                    y90Var.performLongClick();
                    y90Var.O0 = null;
                    y90Var.M0.d(true);
                    return;
                }
                return;
            case 7:
                ((aa0) this.f24942b).l((ha0) this.f24943c, false);
                return;
            case 8:
                cb0 cb0Var = (cb0) this.f24942b;
                if (!((boolean[]) this.f24943c)[0] && (x0Var = cb0Var.U) != null) {
                    x0Var.run();
                }
                cb0Var.U = null;
                return;
            case 9:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f24943c;
                ((eb0) this.f24942b).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            case 10:
                ji.w4 w4Var = (ji.w4) this.f24942b;
                Runnable runnable = (Runnable) this.f24943c;
                w4Var.getClass();
                runnable.run();
                ((HashMap) w4Var.f13592b).remove(runnable);
                return;
            case 11:
                zh0 zh0Var = (zh0) this.f24942b;
                TLObject tLObject2 = (TLObject) this.f24943c;
                zh0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    zh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        zh0Var.a(false);
                        return;
                    }
                    zh0Var.d();
                    zh0Var.f31870c.W2.N(true);
                    return;
                }
                return;
            case 12:
                ei0 ei0Var = (ei0) this.f24942b;
                ArrayList arrayList3 = (ArrayList) this.f24943c;
                ArrayList arrayList4 = ei0Var.f24708a;
                int i13 = ei0Var.f24720x;
                int size3 = arrayList3.size();
                ei0Var.f24720x = size3;
                if (i13 != size3 && ei0Var.S != null) {
                    ei0Var.g();
                }
                int size4 = arrayList4.size();
                int i14 = 0;
                while (i14 < size4) {
                    bi0 bi0Var = (bi0) arrayList4.get(i14);
                    if (bi0Var.f23778o && !bi0Var.f23779p) {
                        arrayList3.add(bi0Var);
                    } else if (ei0.j(bi0Var.f23767a, arrayList3) == null) {
                        ei0 ei0Var2 = bi0Var.f23787y;
                        float f7 = ei0Var2.N;
                        RectF rectF = bi0Var.f23769c;
                        RectF rectF2 = bi0Var.f23770f;
                        ha0 ha0Var = bi0Var.f23781r;
                        if (ha0Var != null) {
                            ha0Var.a();
                            bi0Var.f23783t = z16;
                            bi0Var.f23782s = z16;
                        }
                        bi0Var.f23778o = z17;
                        if (rectF.left - 1.0f <= f7) {
                            z11 = z17;
                        } else {
                            z11 = z16;
                        }
                        if (rectF.right + 1.0f >= ei0Var2.getMeasuredWidth() - f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 && z12) {
                            z11 = false;
                            z12 = false;
                        }
                        bi0Var.f23771g.set(rectF);
                        rectF2.set(rectF);
                        if (z11) {
                            rectF2.right = rectF2.left;
                        } else if (z12) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = bi0Var.f23767a;
                            if (i15 != 3 && i15 != 2) {
                                z13 = true;
                            } else {
                                z13 = true;
                                if (ei0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z14 = false;
                                    bi0Var.e.d(0.0f, z13);
                                    arrayList3.add(bi0Var);
                                    i14++;
                                    z15 = z14;
                                    z16 = false;
                                    z17 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z14 = false;
                            bi0Var.e.d(0.0f, z13);
                            arrayList3.add(bi0Var);
                            i14++;
                            z15 = z14;
                            z16 = false;
                            z17 = true;
                        }
                        z13 = true;
                        z14 = false;
                        bi0Var.e.d(0.0f, z13);
                        arrayList3.add(bi0Var);
                        i14++;
                        z15 = z14;
                        z16 = false;
                        z17 = true;
                    }
                    z14 = z15;
                    i14++;
                    z15 = z14;
                    z16 = false;
                    z17 = true;
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                ei0Var.invalidate();
                return;
            case 13:
                bi0 bi0Var2 = (bi0) this.f24943c;
                di0 di0Var = ((ei0) this.f24942b).F;
                int i16 = bi0Var2.f23767a;
                RectF rectF3 = bi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.py0) di0Var).f39307b, i16, rectF3.left, rectF3.top);
                return;
            case 14:
                ViewParent viewParent = (ViewParent) this.f24943c;
                ((org.telegram.ui.Cells.u1) this.f24942b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 15:
                RLottieNative rLottieNative = (RLottieNative) this.f24942b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f24943c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 16:
                gk0 gk0Var = (gk0) this.f24942b;
                ArrayList arrayList5 = (ArrayList) this.f24943c;
                ArrayList arrayList6 = gk0Var.f25311r;
                gk0Var.f25310n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    fk0 fk0Var = (fk0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList6.size()) {
                            if (MessageObject.getObjectPeerId(((fk0) arrayList6.get(i18)).f25073a) == MessageObject.getObjectPeerId(fk0Var.f25073a)) {
                                if (fk0Var.f25075c > 0) {
                                    ((fk0) arrayList6.get(i18)).f25075c = fk0Var.f25075c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList6.add(fk0Var);
                        }
                    }
                }
                q0.a aVar = gk0Var.f25313w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                gk0Var.a();
                return;
            case 17:
                so0 so0Var = (so0) this.f24942b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f24943c;
                ArrayList arrayList7 = so0Var.K;
                if (!arrayList7.isEmpty() && (indexOf = arrayList7.indexOf(tL_sponsoredPeer)) >= 0 && (L = so0Var.L()) < so0Var.h()) {
                    arrayList7.remove(indexOf);
                    so0Var.u(L + 1 + indexOf);
                    int size6 = so0Var.f10575j0.e.size();
                    int size7 = arrayList7.size();
                    if (so0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        so0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ((so0) this.f24942b).T();
                zc.a0((org.telegram.ui.yy) this.f24943c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 19:
                ((dp0) this.f24942b).sendAccessibilityEvent((View) this.f24943c, 4);
                return;
            case 20:
                gf gfVar = (gf) this.f24942b;
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.f24943c;
                if (foVar != null) {
                    foVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    return;
                }
                return;
            case 21:
                ((WindowManager) this.f24943c).removeView(((gf) this.f24942b).B);
                return;
            case 22:
                jr0 jr0Var = (jr0) this.f24942b;
                TLObject tLObject3 = (TLObject) this.f24943c;
                if (tLObject3 != null) {
                    jr0Var.f26470k0 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    jr0Var.a1();
                    if (jr0Var.m0) {
                        jr0Var.N0();
                    }
                }
                jr0Var.f26471l0 = false;
                return;
            case 23:
                qu0 qu0Var = (qu0) this.f24942b;
                qr0 qr0Var = (qr0) this.f24943c;
                qu0Var.G = null;
                qu0Var.H = null;
                qr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new k90(qr0Var, 17)).start();
                return;
            case 24:
                bi.p8 p8Var = (bi.p8) this.f24943c;
                ss0 ss0Var = ((xv0) this.f24942b).W;
                if (ss0Var != null) {
                    int i19 = p8Var.f3473a;
                    ss0Var.f36585n.d(i19, ss0Var.f36587s.i(i19));
                    return;
                }
                return;
            case 25:
                zc.a0(((gu0) this.f24942b).f25424f.f31388v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f24943c).title)).k(true);
                return;
            case 26:
                tu0 tu0Var = (tu0) this.f24942b;
                String str = (String) this.f24943c;
                if (!tu0Var.v.f31384t1[tu0Var.f29493r].f27508a.isEmpty() && ((i11 = tu0Var.f29493r) == 1 || i11 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.d.g(1, tu0Var.v.f31384t1[i11].f27508a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xv0 xv0Var = tu0Var.v;
                    if (xv0Var.f31363j1 == xv0Var.f31388v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    }
                    tu0Var.F(id2, str, dialogId, j10);
                } else if (tu0Var.f29493r == 3) {
                    xv0 xv0Var2 = tu0Var.v;
                    tu0Var.F(0, str, xv0Var2.f31363j1, xv0Var2.F);
                }
                int i20 = tu0Var.f29493r;
                if (i20 == 1 || i20 == 4) {
                    ArrayList arrayList8 = new ArrayList(tu0Var.v.f31384t1[tu0Var.f29493r].f27508a);
                    tu0Var.f29494s++;
                    Utilities.searchQueue.postRunnable(new v70((lm0) tu0Var, str, arrayList8, 14));
                    return;
                }
                return;
            case 27:
                tu0 tu0Var2 = (tu0) this.f24942b;
                ArrayList arrayList9 = (ArrayList) this.f24943c;
                xv0 xv0Var3 = tu0Var2.v;
                boolean z18 = xv0Var3.V0;
                qu0[] qu0VarArr = xv0Var3.f31364k0;
                if (z18) {
                    tu0Var2.f29494s--;
                    int h = tu0Var2.h();
                    tu0Var2.d = arrayList9;
                    int h10 = tu0Var2.h();
                    if (tu0Var2.f29494s == 0 || h10 != 0) {
                        xv0Var3.m1(false);
                    }
                    for (int i21 = 0; i21 < qu0VarArr.length; i21++) {
                        qu0 qu0Var2 = qu0VarArr[i21];
                        if (qu0Var2.F == tu0Var2.f29493r) {
                            if (tu0Var2.f29494s == 0 && h10 == 0) {
                                qu0Var2.f28682w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qu0VarArr[i21].f28682w.f30998f.setVisibility(8);
                                qu0VarArr[i21].f28682w.e(false, true);
                            } else if (h == 0) {
                                xv0Var3.z(qu0Var2.h, 0, null);
                            }
                        }
                    }
                    tu0Var2.l();
                    return;
                }
                return;
            case 28:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i22 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i22, bool, (TLObject) this.f24942b, (TLRPC.Document) this.f24943c, null, bool);
                return;
            default:
                MessagesController.getInstance(((fz0) this.f24942b).f25147a.f26827a).updateEmojiStatus((TLRPC.EmojiStatus) this.f24943c);
                return;
        }
    }

    public f60(jr0 jr0Var, TLObject tLObject, Context context) {
        this.f24941a = 22;
        this.f24942b = jr0Var;
        this.f24943c = tLObject;
    }
}
