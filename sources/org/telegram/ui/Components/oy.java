package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class oy implements Runnable {
    public final int f26879a;
    public final Object f26880b;
    public final Object f26881c;

    public oy(int i10, Object obj, Object obj2) {
        this.f26879a = i10;
        this.f26880b = obj;
        this.f26881c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        long j3;
        s60 s60Var;
        org.telegram.ui.hb hbVar;
        ci.y0 y0Var;
        boolean z11;
        boolean z12;
        int indexOf;
        int L;
        switch (this.f26879a) {
            case 0:
                ((qy) this.f26880b).F((String) this.f26881c, "", true, false, false);
                return;
            case 1:
                qy qyVar = (qy) this.f26880b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f26881c);
                lz lzVar = qyVar.L;
                MessagesController.getInstance(lzVar.f25968c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i11 = lzVar.f25968c1;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str = qyVar.f27485w;
                qyVar.f27485w = null;
                qyVar.F(str, "", false, false, false);
                return;
            case 2:
                wz wzVar = (wz) this.f26880b;
                ci.k8 k8Var = (ci.k8) this.f26881c;
                wzVar.c();
                wzVar.h(k8Var);
                a00 a00Var = wzVar.J;
                a00Var.f22240h1 = k8Var;
                a00Var.j();
                return;
            case 3:
                ((wz) this.f26880b).J.f22235f1 = (zz) this.f26881c;
                return;
            case 4:
                ((d10) this.f26880b).f23203z0 = -1;
                ((Runnable) ((Pair) this.f26881c).first).run();
                return;
            case 5:
                ((org.telegram.ui.oc) this.f26880b).run((org.telegram.ui.ActionBar.n2) this.f26881c);
                return;
            case 6:
                v40 v40Var = (v40) this.f26880b;
                Uri uri = (Uri) this.f26881c;
                v40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) v40Var.f28645a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f33639f = false;
                        n2Var.f33638c = v40Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    v40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 7:
                w50 w50Var = (w50) this.f26880b;
                r50 r50Var = (r50) this.f26881c;
                x50 x50Var = w50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                x50Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, x50Var.L);
                VideoEditedInfo videoEditedInfo2 = x50Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = x50Var.H;
                videoEditedInfo2.encryptedFile = x50Var.I;
                videoEditedInfo2.key = x50Var.J;
                videoEditedInfo2.iv = x50Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = w50Var.f29516a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = x50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = x50Var.Z0;
                videoEditedInfo3.estimatedDuration = x50Var.f29899f0;
                x50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.f29516a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (r50Var != null) {
                    photoEntry.ttl = r50Var.f27558c;
                    photoEntry.effectId = r50Var.d;
                }
                p50 p50Var = x50Var.f29894c;
                VideoEditedInfo videoEditedInfo4 = x50Var.N;
                if (r50Var != null && !r50Var.f27556a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (r50Var != null) {
                    i10 = r50Var.f27557b;
                } else {
                    i10 = 0;
                }
                if (r50Var != null) {
                    j3 = r50Var.e;
                } else {
                    j3 = 0;
                }
                p50Var.q(photoEntry, videoEditedInfo4, z10, i10, 0, false, j3);
                return;
            case 8:
                Bitmap bitmap = (Bitmap) this.f26881c;
                w50 w50Var2 = (w50) ((org.telegram.ui.Cells.l7) this.f26880b).f20379b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && w50Var2.A0.size() > 1) {
                    ArrayList arrayList = w50Var2.A0;
                    arrayList.add((Bitmap) hg.c.h(1, arrayList));
                    return;
                }
                w50Var2.A0.add(bitmap);
                return;
            case 9:
                s60 s60Var2 = (s60) this.f26880b;
                TLObject tLObject = (TLObject) this.f26881c;
                s60Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        s60Var2.f27842c.put(Long.valueOf(s60Var2.f27840b.admin_id), (TLRPC.User) vector.objects.get(0));
                        s60Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                m60 m60Var = (m60) this.f26880b;
                if (((TLRPC.TL_error) this.f26881c) == null && (hbVar = (s60Var = m60Var.f26100a.f26353c).f27851j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.f27840b;
                    org.telegram.ui.ub ubVar = hbVar.f33800a;
                    ArrayList arrayList2 = ubVar.f38027o0;
                    int size = arrayList2.size();
                    int i12 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38026n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38017f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f38042y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f26881c;
                ((c70) this.f26880b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 12:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) this.f26880b).guard_bot_id);
                ((org.telegram.ui.gp) this.f26881c).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 13:
                y80 y80Var = (y80) this.f26880b;
                if (y80Var.O0 == ((e90) this.f26881c)) {
                    y80Var.performLongClick();
                    y80Var.O0 = null;
                    y80Var.M0.d(true);
                    return;
                }
                return;
            case 14:
                ((a90) this.f26880b).l((h90) this.f26881c, false);
                return;
            case 15:
                ca0 ca0Var = (ca0) this.f26880b;
                if (!((boolean[]) this.f26881c)[0] && (y0Var = ca0Var.U) != null) {
                    y0Var.run();
                }
                ca0Var.U = null;
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f26881c;
                ((ea0) this.f26880b).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 17:
                pb.c cVar = (pb.c) this.f26880b;
                Runnable runnable = (Runnable) this.f26881c;
                cVar.getClass();
                runnable.run();
                cVar.f40701a.remove(runnable);
                return;
            case 18:
                zg0 zg0Var = (zg0) this.f26880b;
                TLObject tLObject2 = (TLObject) this.f26881c;
                zg0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    zg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        zg0Var.a(false);
                        return;
                    }
                    zg0Var.d();
                    zg0Var.f30587c.Y2.N(true);
                    return;
                }
                return;
            case 19:
                eh0 eh0Var = (eh0) this.f26880b;
                ArrayList arrayList3 = (ArrayList) this.f26881c;
                ArrayList arrayList4 = eh0Var.f23686a;
                int i13 = eh0Var.f23698x;
                int size3 = arrayList3.size();
                eh0Var.f23698x = size3;
                if (i13 != size3 && eh0Var.S != null) {
                    eh0Var.g();
                }
                int size4 = arrayList4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    bh0 bh0Var = (bh0) arrayList4.get(i14);
                    if (bh0Var.f22751o && !bh0Var.f22752p) {
                        arrayList3.add(bh0Var);
                    } else if (eh0.j(bh0Var.f22740a, arrayList3) == null) {
                        eh0 eh0Var2 = bh0Var.f22760y;
                        float f7 = eh0Var2.N;
                        RectF rectF = bh0Var.f22742c;
                        RectF rectF2 = bh0Var.f22743f;
                        h90 h90Var = bh0Var.f22754r;
                        if (h90Var != null) {
                            h90Var.a();
                            bh0Var.f22756t = false;
                            bh0Var.f22755s = false;
                        }
                        bh0Var.f22751o = true;
                        if (rectF.left - 1.0f <= f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (rectF.right + 1.0f >= eh0Var2.getMeasuredWidth() - f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 && z12) {
                            z12 = false;
                            z11 = false;
                        }
                        bh0Var.f22744g.set(rectF);
                        rectF2.set(rectF);
                        if (z11) {
                            rectF2.right = rectF2.left;
                        } else if (z12) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = bh0Var.f22740a;
                            if ((i15 == 3 || i15 == 2) && eh0Var2.H == 1) {
                                rectF2.left = rectF2.right;
                            } else {
                                float centerX = rectF2.centerX();
                                rectF2.right = centerX;
                                rectF2.left = centerX;
                            }
                        }
                        bh0Var.e.d(0.0f, true);
                        arrayList3.add(bh0Var);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                eh0Var.invalidate();
                return;
            case 20:
                bh0 bh0Var2 = (bh0) this.f26881c;
                dh0 dh0Var = ((eh0) this.f26880b).F;
                int i16 = bh0Var2.f22740a;
                RectF rectF3 = bh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.dy0) dh0Var).f32741b, i16, rectF3.left, rectF3.top);
                return;
            case 21:
                ViewParent viewParent = (ViewParent) this.f26881c;
                ((org.telegram.ui.Cells.t1) this.f26880b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 22:
                RLottieNative rLottieNative = (RLottieNative) this.f26880b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f26881c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 23:
                gj0 gj0Var = (gj0) this.f26880b;
                ArrayList arrayList5 = (ArrayList) this.f26881c;
                ArrayList arrayList6 = gj0Var.f24314r;
                gj0Var.f24313n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    fj0 fj0Var = (fj0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList6.size()) {
                            if (MessageObject.getObjectPeerId(((fj0) arrayList6.get(i18)).f23995a) == MessageObject.getObjectPeerId(fj0Var.f23995a)) {
                                if (fj0Var.f23997c > 0) {
                                    ((fj0) arrayList6.get(i18)).f23997c = fj0Var.f23997c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList6.add(fj0Var);
                        }
                    }
                }
                q0.a aVar = gj0Var.f24316w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                gj0Var.a();
                return;
            case 24:
                rn0 rn0Var = (rn0) this.f26880b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26881c;
                ArrayList arrayList7 = rn0Var.K;
                if (!arrayList7.isEmpty() && (indexOf = arrayList7.indexOf(tL_sponsoredPeer)) >= 0 && (L = rn0Var.L()) < rn0Var.h()) {
                    arrayList7.remove(indexOf);
                    rn0Var.u(L + 1 + indexOf);
                    int size6 = rn0Var.f9755j0.e.size();
                    int size7 = arrayList7.size();
                    if (rn0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        rn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((rn0) this.f26880b).T();
                xc.a0((org.telegram.ui.ry) this.f26881c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 26:
                ((co0) this.f26880b).sendAccessibilityEvent((View) this.f26881c, 4);
                return;
            case 27:
                ef efVar = (ef) this.f26880b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f26881c;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 28:
                ((WindowManager) this.f26881c).removeView(((ef) this.f26880b).B);
                return;
            default:
                hq0 hq0Var = (hq0) this.f26880b;
                TLObject tLObject3 = (TLObject) this.f26881c;
                if (tLObject3 != null) {
                    hq0Var.f24786k0 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    hq0Var.Z0();
                    if (hq0Var.m0) {
                        hq0Var.M0();
                    }
                }
                hq0Var.f24787l0 = false;
                return;
        }
    }

    public oy(hq0 hq0Var, TLObject tLObject, Context context) {
        this.f26879a = 29;
        this.f26880b = hq0Var;
        this.f26881c = tLObject;
    }
}
