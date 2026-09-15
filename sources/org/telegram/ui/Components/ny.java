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
    public final int f26611a;
    public final Object f26612b;
    public final Object f26613c;

    public ny(int i10, Object obj, Object obj2) {
        this.f26611a = i10;
        this.f26612b = obj;
        this.f26613c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        long j3;
        r60 r60Var;
        org.telegram.ui.hb hbVar;
        ci.y0 y0Var;
        boolean z11;
        boolean z12;
        int indexOf;
        int L;
        switch (this.f26611a) {
            case 0:
                ((py) this.f26612b).F((String) this.f26613c, "", true, false, false);
                return;
            case 1:
                py pyVar = (py) this.f26612b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f26613c);
                kz kzVar = pyVar.L;
                MessagesController.getInstance(kzVar.f25703c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i11 = kzVar.f25703c1;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str = pyVar.f27194w;
                pyVar.f27194w = null;
                pyVar.F(str, "", false, false, false);
                return;
            case 2:
                vz vzVar = (vz) this.f26612b;
                ci.n8 n8Var = (ci.n8) this.f26613c;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.f30695h1 = n8Var;
                zzVar.j();
                return;
            case 3:
                ((vz) this.f26612b).J.f30690f1 = (yz) this.f26613c;
                return;
            case 4:
                ((c10) this.f26612b).f22931z0 = -1;
                ((Runnable) ((Pair) this.f26613c).first).run();
                return;
            case 5:
                ((org.telegram.ui.nf) this.f26612b).run((org.telegram.ui.ActionBar.n2) this.f26613c);
                return;
            case 6:
                u40 u40Var = (u40) this.f26612b;
                Uri uri = (Uri) this.f26613c;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.f28283a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f35793f = false;
                        n2Var.f35792c = u40Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 7:
                v50 v50Var = (v50) this.f26612b;
                q50 q50Var = (q50) this.f26613c;
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
                videoEditedInfo2.originalPath = v50Var.f28603a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w50Var.Z0;
                videoEditedInfo3.estimatedDuration = w50Var.f29585f0;
                w50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f28603a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.f27256c;
                    photoEntry.effectId = q50Var.d;
                }
                o50 o50Var = w50Var.f29580c;
                VideoEditedInfo videoEditedInfo4 = w50Var.N;
                if (q50Var != null && !q50Var.f27254a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (q50Var != null) {
                    i10 = q50Var.f27255b;
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
                Bitmap bitmap = (Bitmap) this.f26613c;
                v50 v50Var2 = (v50) ((org.telegram.ui.Cells.l7) this.f26612b).f20398b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && v50Var2.A0.size() > 1) {
                    ArrayList arrayList = v50Var2.A0;
                    arrayList.add((Bitmap) hg.k0.h(1, arrayList));
                    return;
                }
                v50Var2.A0.add(bitmap);
                return;
            case 9:
                r60 r60Var2 = (r60) this.f26612b;
                TLObject tLObject = (TLObject) this.f26613c;
                r60Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        r60Var2.f27562c.put(Long.valueOf(r60Var2.f27560b.admin_id), (TLRPC.User) vector.objects.get(0));
                        r60Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                l60 l60Var = (l60) this.f26612b;
                if (((TLRPC.TL_error) this.f26613c) == null && (hbVar = (r60Var = l60Var.f25840a.f26107c).f27571j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.f27560b;
                    org.telegram.ui.ub ubVar = hbVar.f34228a;
                    ArrayList arrayList2 = ubVar.f37955o0;
                    int size = arrayList2.size();
                    int i12 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f37954n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f37945f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f37970y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f26613c;
                ((b70) this.f26612b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 12:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) this.f26612b).guard_bot_id);
                ((org.telegram.ui.kp) this.f26613c).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 13:
                x80 x80Var = (x80) this.f26612b;
                if (x80Var.O0 == ((d90) this.f26613c)) {
                    x80Var.performLongClick();
                    x80Var.O0 = null;
                    x80Var.M0.d(true);
                    return;
                }
                return;
            case 14:
                ((z80) this.f26612b).l((g90) this.f26613c, false);
                return;
            case 15:
                ba0 ba0Var = (ba0) this.f26612b;
                if (!((boolean[]) this.f26613c)[0] && (y0Var = ba0Var.U) != null) {
                    y0Var.run();
                }
                ba0Var.U = null;
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f26613c;
                ((da0) this.f26612b).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 17:
                pb.c cVar = (pb.c) this.f26612b;
                Runnable runnable = (Runnable) this.f26613c;
                cVar.getClass();
                runnable.run();
                cVar.f40750a.remove(runnable);
                return;
            case 18:
                yg0 yg0Var = (yg0) this.f26612b;
                TLObject tLObject2 = (TLObject) this.f26613c;
                yg0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    yg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        yg0Var.a(false);
                        return;
                    }
                    yg0Var.d();
                    yg0Var.f30247c.Y2.N(true);
                    return;
                }
                return;
            case 19:
                dh0 dh0Var = (dh0) this.f26612b;
                ArrayList arrayList3 = (ArrayList) this.f26613c;
                ArrayList arrayList4 = dh0Var.f23325a;
                int i13 = dh0Var.f23337x;
                int size3 = arrayList3.size();
                dh0Var.f23337x = size3;
                if (i13 != size3 && dh0Var.S != null) {
                    dh0Var.g();
                }
                int size4 = arrayList4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ah0 ah0Var = (ah0) arrayList4.get(i14);
                    if (ah0Var.f22407o && !ah0Var.f22408p) {
                        arrayList3.add(ah0Var);
                    } else if (dh0.j(ah0Var.f22396a, arrayList3) == null) {
                        dh0 dh0Var2 = ah0Var.f22416y;
                        float f7 = dh0Var2.N;
                        RectF rectF = ah0Var.f22398c;
                        RectF rectF2 = ah0Var.f22399f;
                        g90 g90Var = ah0Var.f22410r;
                        if (g90Var != null) {
                            g90Var.a();
                            ah0Var.f22412t = false;
                            ah0Var.f22411s = false;
                        }
                        ah0Var.f22407o = true;
                        if (rectF.left - 1.0f <= f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (rectF.right + 1.0f >= dh0Var2.getMeasuredWidth() - f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 && z12) {
                            z12 = false;
                            z11 = false;
                        }
                        ah0Var.f22400g.set(rectF);
                        rectF2.set(rectF);
                        if (z11) {
                            rectF2.right = rectF2.left;
                        } else if (z12) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i15 = ah0Var.f22396a;
                            if ((i15 == 3 || i15 == 2) && dh0Var2.H == 1) {
                                rectF2.left = rectF2.right;
                            } else {
                                float centerX = rectF2.centerX();
                                rectF2.right = centerX;
                                rectF2.left = centerX;
                            }
                        }
                        ah0Var.e.d(0.0f, true);
                        arrayList3.add(ah0Var);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                dh0Var.invalidate();
                return;
            case 20:
                ah0 ah0Var2 = (ah0) this.f26613c;
                ch0 ch0Var = ((dh0) this.f26612b).F;
                int i16 = ah0Var2.f22396a;
                RectF rectF3 = ah0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).f35288b, i16, rectF3.left, rectF3.top);
                return;
            case 21:
                ViewParent viewParent = (ViewParent) this.f26613c;
                ((org.telegram.ui.Cells.t1) this.f26612b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 22:
                RLottieNative rLottieNative = (RLottieNative) this.f26612b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f26613c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 23:
                fj0 fj0Var = (fj0) this.f26612b;
                ArrayList arrayList5 = (ArrayList) this.f26613c;
                ArrayList arrayList6 = fj0Var.f23962r;
                fj0Var.f23961n.addAll(arrayList5);
                int size5 = arrayList5.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    ej0 ej0Var = (ej0) obj;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList6.size()) {
                            if (MessageObject.getObjectPeerId(((ej0) arrayList6.get(i18)).f23680a) == MessageObject.getObjectPeerId(ej0Var.f23680a)) {
                                if (ej0Var.f23682c > 0) {
                                    ((ej0) arrayList6.get(i18)).f23682c = ej0Var.f23682c;
                                }
                            } else {
                                i18++;
                            }
                        } else {
                            arrayList6.add(ej0Var);
                        }
                    }
                }
                q0.a aVar = fj0Var.f23964w;
                if (aVar != null) {
                    aVar.accept(arrayList5);
                }
                fj0Var.a();
                return;
            case 24:
                rn0 rn0Var = (rn0) this.f26612b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26613c;
                ArrayList arrayList7 = rn0Var.K;
                if (!arrayList7.isEmpty() && (indexOf = arrayList7.indexOf(tL_sponsoredPeer)) >= 0 && (L = rn0Var.L()) < rn0Var.h()) {
                    arrayList7.remove(indexOf);
                    rn0Var.u(L + 1 + indexOf);
                    int size6 = rn0Var.f9768j0.e.size();
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
                ((rn0) this.f26612b).T();
                vc.a0((org.telegram.ui.uy) this.f26613c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 26:
                ((co0) this.f26612b).sendAccessibilityEvent((View) this.f26613c, 4);
                return;
            case 27:
                cf cfVar = (cf) this.f26612b;
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.f26613c;
                if (boVar != null) {
                    boVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    cfVar.dismiss();
                    return;
                }
                return;
            case 28:
                ((WindowManager) this.f26613c).removeView(((cf) this.f26612b).B);
                return;
            default:
                hq0 hq0Var = (hq0) this.f26612b;
                TLObject tLObject3 = (TLObject) this.f26613c;
                if (tLObject3 != null) {
                    hq0Var.f24761k0 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    hq0Var.Z0();
                    if (hq0Var.m0) {
                        hq0Var.M0();
                    }
                }
                hq0Var.f24762l0 = false;
                return;
        }
    }

    public ny(hq0 hq0Var, TLObject tLObject, Context context) {
        this.f26611a = 29;
        this.f26612b = hq0Var;
        this.f26613c = tLObject;
    }
}
