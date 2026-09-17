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
public final class ny implements Runnable {
    public final int f26556a;
    public final Object f26557b;
    public final Object f26558c;

    public ny(int i10, Object obj, Object obj2) {
        this.f26556a = i10;
        this.f26557b = obj;
        this.f26558c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        long j3;
        r60 r60Var;
        org.telegram.ui.jb jbVar;
        ci.y0 y0Var;
        boolean z11;
        boolean z12;
        int indexOf;
        int L;
        switch (this.f26556a) {
            case 0:
                ((py) this.f26557b).F((String) this.f26558c, "", true, false, false);
                return;
            case 1:
                py pyVar = (py) this.f26557b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f26558c);
                kz kzVar = pyVar.L;
                MessagesController.getInstance(kzVar.f25713c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i11 = kzVar.f25713c1;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str = pyVar.f27156w;
                pyVar.f27156w = null;
                pyVar.F(str, "", false, false, false);
                return;
            case 2:
                vz vzVar = (vz) this.f26557b;
                ci.n8 n8Var = (ci.n8) this.f26558c;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.f30710h1 = n8Var;
                zzVar.j();
                return;
            case 3:
                ((vz) this.f26557b).J.f30705f1 = (yz) this.f26558c;
                return;
            case 4:
                ((c10) this.f26557b).f22893z0 = -1;
                ((Runnable) ((Pair) this.f26558c).first).run();
                return;
            case 5:
                ((org.telegram.ui.pf) this.f26557b).run((org.telegram.ui.ActionBar.o2) this.f26558c);
                return;
            case 6:
                u40 u40Var = (u40) this.f26557b;
                Uri uri = (Uri) this.f26558c;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.f28272a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(bundle);
                        o2Var.e = false;
                        o2Var.f36402f = false;
                        o2Var.f36401c = u40Var;
                        launchActivity.p0(o2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 7:
                v50 v50Var = (v50) this.f26557b;
                q50 q50Var = (q50) this.f26558c;
                w50 w50Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                w50Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, w50Var.L);
                VideoEditedInfo videoEditedInfo2 = w50Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = w50Var.H;
                videoEditedInfo2.encryptedFile = w50Var.I;
                videoEditedInfo2.key = w50Var.J;
                videoEditedInfo2.iv = w50Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = v50Var.f28598a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w50Var.Z0;
                videoEditedInfo3.estimatedDuration = w50Var.f29540f0;
                w50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f28598a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.f27219c;
                    photoEntry.effectId = q50Var.d;
                }
                o50 o50Var = w50Var.f29535c;
                VideoEditedInfo videoEditedInfo4 = w50Var.N;
                if (q50Var != null && !q50Var.f27217a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (q50Var != null) {
                    i10 = q50Var.f27218b;
                } else {
                    i10 = 0;
                }
                if (q50Var != null) {
                    j3 = q50Var.e;
                } else {
                    j3 = 0;
                }
                o50Var.q(photoEntry, videoEditedInfo4, z10, i10, 0, false, j3);
                return;
            case 8:
                Bitmap bitmap = (Bitmap) this.f26558c;
                v50 v50Var2 = (v50) ((org.telegram.ui.Cells.l7) this.f26557b).f20408b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && v50Var2.A0.size() > 1) {
                    ArrayList arrayList = v50Var2.A0;
                    arrayList.add((Bitmap) hg.k0.h(1, arrayList));
                    return;
                }
                v50Var2.A0.add(bitmap);
                return;
            case 9:
                r60 r60Var2 = (r60) this.f26557b;
                TLObject tLObject = (TLObject) this.f26558c;
                r60Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        r60Var2.f27543c.put(Long.valueOf(r60Var2.f27541b.admin_id), (TLRPC.User) vector.objects.get(0));
                        r60Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                l60 l60Var = (l60) this.f26557b;
                if (((TLRPC.TL_error) this.f26558c) == null && (jbVar = (r60Var = l60Var.f25831a.f26088c).f27552j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.f27541b;
                    org.telegram.ui.wb wbVar = jbVar.f34832a;
                    ArrayList arrayList2 = wbVar.f38662o0;
                    int size = arrayList2.size();
                    int i12 = wbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.wb.L0(wbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f38661n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f38652f, wbVar.T, true).contentType >= 0) {
                        wbVar.R0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.f38677y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f26558c;
                ((b70) this.f26557b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 12:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) this.f26557b).guard_bot_id);
                ((org.telegram.ui.kp) this.f26558c).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 13:
                x80 x80Var = (x80) this.f26557b;
                if (x80Var.O0 == ((d90) this.f26558c)) {
                    x80Var.performLongClick();
                    x80Var.O0 = null;
                    x80Var.M0.d(true);
                    return;
                }
                return;
            case 14:
                ((z80) this.f26557b).l((g90) this.f26558c, false);
                return;
            case 15:
                ba0 ba0Var = (ba0) this.f26557b;
                if (!((boolean[]) this.f26558c)[0] && (y0Var = ba0Var.U) != null) {
                    y0Var.run();
                }
                ba0Var.U = null;
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f26558c;
                ((da0) this.f26557b).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 17:
                pb.c cVar = (pb.c) this.f26557b;
                Runnable runnable = (Runnable) this.f26558c;
                cVar.getClass();
                runnable.run();
                cVar.f40772a.remove(runnable);
                return;
            case 18:
                zg0 zg0Var = (zg0) this.f26557b;
                TLObject tLObject2 = (TLObject) this.f26558c;
                zg0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    zg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        zg0Var.a(false);
                        return;
                    }
                    zg0Var.d();
                    zg0Var.f30517c.Y2.N(true);
                    return;
                }
                return;
            case 19:
                eh0 eh0Var = (eh0) this.f26557b;
                ArrayList arrayList3 = (ArrayList) this.f26558c;
                ArrayList arrayList4 = eh0Var.f23555a;
                int i13 = eh0Var.f23567x;
                int size3 = arrayList3.size();
                eh0Var.f23567x = size3;
                if (i13 != size3 && eh0Var.S != null) {
                    eh0Var.g();
                }
                int size4 = arrayList4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    bh0 bh0Var = (bh0) arrayList4.get(i14);
                    if (bh0Var.f22739o && !bh0Var.f22740p) {
                        arrayList3.add(bh0Var);
                    } else if (eh0.j(bh0Var.f22728a, arrayList3) == null) {
                        eh0 eh0Var2 = bh0Var.f22748y;
                        float f7 = eh0Var2.N;
                        RectF rectF = bh0Var.f22730c;
                        RectF rectF2 = bh0Var.f22731f;
                        g90 g90Var = bh0Var.f22742r;
                        if (g90Var != null) {
                            g90Var.a();
                            bh0Var.f22744t = false;
                            bh0Var.f22743s = false;
                        }
                        bh0Var.f22739o = true;
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
                        bh0Var.f22732g.set(rectF);
                        rectF2.set(rectF);
                        if (z11) {
                            rectF2.right = rectF2.left;
                        } else if (z12) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = bh0Var.f22728a;
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
                bh0 bh0Var2 = (bh0) this.f26558c;
                dh0 dh0Var = ((eh0) this.f26557b).F;
                int i16 = bh0Var2.f22728a;
                RectF rectF3 = bh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.my0) dh0Var).f35907b, i16, rectF3.left, rectF3.top);
                return;
            case 21:
                ViewParent viewParent = (ViewParent) this.f26558c;
                ((org.telegram.ui.Cells.t1) this.f26557b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 22:
                RLottieNative rLottieNative = (RLottieNative) this.f26557b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f26558c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 23:
                gj0 gj0Var = (gj0) this.f26557b;
                ArrayList arrayList5 = (ArrayList) this.f26558c;
                ArrayList arrayList6 = gj0Var.f24259r;
                gj0Var.f24258n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    fj0 fj0Var = (fj0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList6.size()) {
                            if (MessageObject.getObjectPeerId(((fj0) arrayList6.get(i18)).f23952a) == MessageObject.getObjectPeerId(fj0Var.f23952a)) {
                                if (fj0Var.f23954c > 0) {
                                    ((fj0) arrayList6.get(i18)).f23954c = fj0Var.f23954c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList6.add(fj0Var);
                        }
                    }
                }
                q0.a aVar = gj0Var.f24261w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                gj0Var.a();
                return;
            case 24:
                sn0 sn0Var = (sn0) this.f26557b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26558c;
                ArrayList arrayList7 = sn0Var.K;
                if (!arrayList7.isEmpty() && (indexOf = arrayList7.indexOf(tL_sponsoredPeer)) >= 0 && (L = sn0Var.L()) < sn0Var.h()) {
                    arrayList7.remove(indexOf);
                    sn0Var.u(L + 1 + indexOf);
                    int size6 = sn0Var.f9773j0.e.size();
                    int size7 = arrayList7.size();
                    if (sn0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        sn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((sn0) this.f26557b).T();
                vc.a0((org.telegram.ui.wy) this.f26558c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 26:
                ((do0) this.f26557b).sendAccessibilityEvent((View) this.f26558c, 4);
                return;
            case 27:
                cf cfVar = (cf) this.f26557b;
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.f26558c;
                if (boVar != null) {
                    boVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    cfVar.dismiss();
                    return;
                }
                return;
            case 28:
                ((WindowManager) this.f26558c).removeView(((cf) this.f26557b).B);
                return;
            default:
                iq0 iq0Var = (iq0) this.f26557b;
                TLObject tLObject3 = (TLObject) this.f26558c;
                if (tLObject3 != null) {
                    iq0Var.f24997k0 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    iq0Var.Z0();
                    if (iq0Var.m0) {
                        iq0Var.M0();
                    }
                }
                iq0Var.f24998l0 = false;
                return;
        }
    }

    public ny(iq0 iq0Var, TLObject tLObject, Context context) {
        this.f26556a = 29;
        this.f26557b = iq0Var;
        this.f26558c = tLObject;
    }
}
