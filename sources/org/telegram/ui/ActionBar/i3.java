package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewPropertyAnimator;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.yo;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.Components.zf;
import org.telegram.ui.Components.zg;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cb;
import org.telegram.ui.gg;
import org.telegram.ui.gy;
import org.telegram.ui.ht0;
import org.telegram.ui.mb;
import org.telegram.ui.qb;
import org.telegram.ui.rn;

public final class i3 implements Runnable {

    public final int f23504a;

    public final Object f23505b;

    public final Object f23506c;
    public final Object d;

    public i3(KeyEvent.Callback callback, Object obj, n2 n2Var, int i10) {
        this.f23504a = i10;
        this.f23505b = callback;
        this.d = obj;
        this.f23506c = n2Var;
    }

    @Override
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String strStringValue;
        ArrayList<Long> arrayList;
        TLRPC.User user;
        int i10;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        int i11 = this.f23504a;
        int i12 = 3;
        int i13 = 8;
        Bitmap bitmapCreateBitmap = null;
        Object obj = this.f23506c;
        Object obj2 = this.d;
        Object obj3 = this.f23505b;
        switch (i11) {
            case 0:
                ((n2) obj).presentFragment((rn) obj2);
                ((m3) obj3).f23659c = false;
                return;
            case 1:
                m3 m3Var = (m3) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                l3 l3Var = (l3) obj2;
                m3Var.getClass();
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    if (((j3) arrayList2.get(i14)).f23528a == l3Var) {
                        arrayList2.remove(i14);
                        i14--;
                    }
                    i14++;
                }
                m3Var.invalidate();
                return;
            case 2:
                f6 f6Var = (f6) obj3;
                TLObject tLObject = (TLObject) obj;
                f6 f6Var2 = (f6) obj2;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    f6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                f6Var.f22946c0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(f6Var2.A).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 3:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj3;
                v0Var.T0.A1(v0Var, (TLRPC.TL_premiumGiftOption) obj, (String) obj2);
                return;
            case 4:
                f6 f6Var3 = (f6) obj;
                f6Var3.f22950f = !f6Var3.d((File) obj2, f6Var3.f22945c);
                AndroidUtilities.runOnUIThread(new ga(i13, (ia) obj3, f6Var3));
                return;
            case 5:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj3;
                org.telegram.ui.Components.y4.M((Context) obj, e0Var.f27885h0, new m5.o(e0Var, i13), (c6) obj2);
                return;
            case 6:
                b8.p((b8) obj3, (b2) obj, (TLObject) obj2);
                return;
            case 7:
                se seVar = (se) obj3;
                seVar.getClass();
                ((pu0) obj).getViewTreeObserver().removeOnDrawListener(seVar);
                ((eo0) obj2).f28107a.setHideAvatar(true);
                return;
            case 8:
                zf zfVar = (zf) obj3;
                File file = (File) obj2;
                try {
                    InputStream inputStreamOpenInputStream = zfVar.getContext().getContentResolver().openInputStream((Uri) obj);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i15 = inputStreamOpenInputStream.read(bArr);
                        if (i15 <= 0) {
                            inputStreamOpenInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new i3(zfVar, arrayList3, file, 9));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i15);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
                break;
            case 9:
                ((zf) obj3).n((File) obj2, (ArrayList) obj);
                return;
            case 10:
                gi.n((gi) obj3, (AnimationNotificationsLocker) obj, (y2) obj2);
                return;
            case 11:
                final gi giVar = (gi) obj3;
                final sg sgVar = (sg) obj2;
                final boolean z10 = giVar.f28699v0.getCurrentItemTop() <= ((yh) obj).getButtonsHideOffset();
                float alpha = giVar.T0.getAlpha();
                float f10 = z10 ? 1.0f : 0.0f;
                o1.j jVar = new o1.j(new hb.a(0.0f));
                jVar.b(new zg(giVar, alpha, f10, z10));
                jVar.a(new o1.f() {
                    @Override
                    public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                        gi.u(giVar, z10, sgVar);
                    }
                });
                o1.k kVar = new o1.k(500.0f);
                jVar.f19147u = kVar;
                kVar.a(1.0f);
                jVar.f19147u.b(1000.0f);
                jVar.f();
                giVar.f28680p1 = jVar;
                return;
            case 12:
                TLObject tLObject2 = (TLObject) obj;
                f6 f6Var4 = (f6) obj2;
                HashMap map = ((yo) obj3).f34936s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    f6Var4.f22950f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (map.containsKey(attachFileName)) {
                    return;
                }
                map.put(attachFileName, f6Var4);
                FileLoader.getInstance(f6Var4.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 13:
                es esVar = (es) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                ds dsVar = (ds) obj2;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<Long> arrayList5 = new ArrayList<>();
                long jMax = 0;
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    strStringValue = null;
                    while (sQLiteCursorQueryFinalized.next()) {
                        try {
                            arrayList5.add(Long.valueOf(sQLiteCursorQueryFinalized.longValue(0)));
                            jMax = Math.max(jMax, sQLiteCursorQueryFinalized.longValue(1));
                            strStringValue = sQLiteCursorQueryFinalized.stringValue(2);
                        } catch (Exception e9) {
                            e = e9;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList5);
                    if (users != null) {
                        int size = arrayList5.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Long l10 = arrayList5.get(i16);
                            i16++;
                            long jLongValue = l10.longValue();
                            int size2 = users.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size2) {
                                    TLRPC.User user2 = users.get(i17);
                                    i17++;
                                    user = user2;
                                    if (user != null) {
                                        arrayList = arrayList5;
                                        if (user.f22527id == jLongValue) {
                                        }
                                    } else {
                                        arrayList = arrayList5;
                                    }
                                    arrayList5 = arrayList;
                                } else {
                                    arrayList = arrayList5;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList4.add(user);
                            }
                            arrayList5 = arrayList;
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                } catch (Exception e10) {
                    e = e10;
                    strStringValue = null;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new gh.k1(esVar, arrayList4, jMax, strStringValue, dsVar, 12));
                return;
            case 14:
                jz jzVar = (jz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                nz nzVar = jzVar.F;
                int[] iArr = nzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!nzVar.f31082g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, nzVar.g(!jzVar.P ? 1 : 0), 0);
                GLES20.glClear(0);
                int i18 = jzVar.Q;
                if (i18 != 0 && (i10 = jzVar.R) != 0) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i18 * i10 * 4);
                    GLES20.glReadPixels(0, 0, jzVar.Q, jzVar.R, 6408, 5121, byteBufferAllocateDirect);
                    bitmapCreateBitmap = Bitmap.createBitmap(jzVar.Q, jzVar.R, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                }
                bitmapArr[0] = bitmapCreateBitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 15:
                q00 q00Var = (q00) obj3;
                q00Var.f31742v0 = -1;
                ec ecVarM = mc.a0((n2) obj).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, q00Var.Y), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj2).size(), new Object[0]), R.raw.ic_delete);
                ecVarM.f28020j = 5000;
                ecVarM.j();
                q00Var.f31743w0 = true;
                q00Var.dismiss();
                q00Var.f31855n.getMessagesController().invalidateChatlistFolderUpdate(q00Var.U);
                return;
            case 16:
                q00 q00Var2 = (q00) obj3;
                q00Var2.f31742v0 = q00Var2.f31855n.getConnectionsManager().sendRequest((TLObject) obj, new gg(12, q00Var2, (Pair) obj2));
                return;
            case 17:
                f60 f60Var = (f60) obj3;
                f60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).f22527id);
                ((n2) obj).presentFragment(new ProfileActivity(bundle, null));
                f60Var.f28281h0 = true;
                return;
            case 18:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject3 = (TLObject) obj2;
                f60 f60Var2 = ((z50) obj3).f35155a.f26642c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = f60Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (f60Var2.f28279f0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = f60Var2.d;
                    if (chatFull2 != null) {
                        int i19 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i19;
                        if (i19 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        MessagesStorage.getInstance(f60Var2.currentAccount).saveChatLinksCount(f60Var2.f28274c0, chatFull2.invitesCount);
                    }
                    cb cbVar = f60Var2.f28279f0;
                    if (cbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = f60Var2.f28271b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        qb qbVar = cbVar.f37041a;
                        ArrayList arrayList6 = qbVar.f41609o0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = qbVar.getAccountInstance().getUserConfig().clientUserId;
                        if (new MessageObject(qbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) qbVar.f41608n0, (HashMap<String, ArrayList<MessageObject>>) qbVar.m0, qbVar.f41614s, qbVar.T, true).contentType < 0) {
                            return;
                        }
                        qbVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            qbVar.C0.N = true;
                            mb mbVar = qbVar.E;
                            mbVar.s(mbVar.h, size4);
                            qb.K0(qbVar);
                        }
                        qbVar.f41624y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                p60.O((p60) obj3, (TLRPC.TL_error) obj, (TLObject) obj2);
                return;
            case 20:
                l60 l60Var = (l60) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                l60Var.h = null;
                l60Var.f30302c = arrayList7;
                l60Var.d = (ArrayList) obj2;
                pf.j1 j1Var = l60Var.f30303e;
                j1Var.f(arrayList7, null);
                p60 p60Var = l60Var.f30305n;
                p60Var.J(l60Var.f30304f - 1);
                l60Var.l();
                if (j1Var.e() || l60Var.h() > 2) {
                    return;
                }
                p60Var.f32983s.e(false, true);
                return;
            case 21:
                p80 p80Var = (p80) obj3;
                q80 q80Var = (q80) obj;
                ClickableSpan clickableSpan = (ClickableSpan) obj2;
                o80 o80Var = p80Var.h;
                if (o80Var == null || p80Var.f31556e != q80Var) {
                    return;
                }
                o80Var.a(clickableSpan);
                p80Var.f31556e = null;
                p80Var.f31554b.d(true);
                return;
            case 22:
                kb0 kb0Var = (kb0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLObject tLObject4 = (TLObject) obj2;
                c6 c6Var = kb0Var.f30054c;
                TextView textView = kb0Var.f30056f;
                TextView textView2 = kb0Var.f30055e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        kb0Var.A = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new mc(ab.a(kb0Var.getContext()), c6Var).d0(tL_error2, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject4).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha = kb0Var.d.animate().alpha(1.0f);
                er erVar = er.h;
                rl.o(viewPropertyAnimatorAlpha, erVar, 320L);
                kb0Var.h.animate().alpha(0.0f).setInterpolator(erVar).setDuration(320L).start();
                if (kb0Var.A) {
                    kb0Var.setBackground(g6.Y(g6.v0(g6.f23144i6, c6Var), 6, 0));
                    kb0Var.setOnClickListener(new l70(kb0Var, i12));
                    return;
                } else {
                    kb0Var.setBackground(null);
                    kb0Var.setOnClickListener(null);
                    return;
                }
            case 23:
                md0.p((md0) obj3, (TLRPC.TL_error) obj, (TLObject) obj2);
                return;
            case 24:
                String str = (String) obj;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj2;
                ht0 ht0Var = (ht0) ((ze0) obj3).f35231b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + ht0Var.f27745w).put("platform", "DESKTOP"))).put("videoId", ht0Var.f27745w).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr2 = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i20 = inputStream.read(bArr2);
                        if (i20 == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject jSONObjectOptJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (strOptString = jSONObjectOptJSONObject.optString("spec")) == null) {
                                return;
                            }
                            if (ht0Var.D == 0) {
                                ht0Var.f27744s = strOptString;
                                return;
                            } else {
                                df0.a(ht0Var, strOptString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, i20);
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            case 25:
                cg0.n((cg0) obj3, (bg0) obj, (TLObject) obj2);
                return;
            case 26:
                jm0 jm0Var = (jm0) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList<MessageObject> arrayList9 = (ArrayList) obj2;
                int i21 = jm0Var.d;
                for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                    DownloadController.getInstance(i21).onDownloadComplete((MessageObject) arrayList8.get(i22));
                }
                if (!arrayList9.isEmpty()) {
                    DownloadController.getInstance(i21).deleteRecentFiles(arrayList9);
                }
                jm0Var.K = false;
                jm0Var.d(true);
                return;
            case 27:
                cn0 cn0Var = (cn0) obj3;
                gy gyVar = (gy) obj;
                b70 b70Var = (b70) obj2;
                if (UserConfig.getInstance(cn0Var.G0.D0).isPremium()) {
                    gyVar.getMessagesController().disableAds(true);
                    cn0Var.T();
                    mc.a0(gyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new ag.g2((n2) gyVar, 3, true).show();
                }
                b70Var.u();
                return;
            case 28:
                hu0 hu0Var = (hu0) obj3;
                org.telegram.ui.Components.y4.S(hu0Var.getContext(), null, hu0Var.B1, new kq0(hu0Var, (TL_stories.StoryItem) obj));
                ((b70) obj2).u();
                return;
            default:
                hu0 hu0Var2 = (hu0) obj3;
                String str2 = (String) obj2;
                n2 n2Var = (n2) obj;
                js0 js0Var = new js0(hu0Var2.getContext(), str2, str2, hu0Var2.B1, n2Var);
                if (n2Var != null) {
                    n2Var.showDialog(js0Var);
                    return;
                } else {
                    js0Var.show();
                    return;
                }
        }
    }

    public i3(Object obj, Object obj2, Object obj3, int i10) {
        this.f23504a = i10;
        this.f23505b = obj;
        this.f23506c = obj2;
        this.d = obj3;
    }

    public i3(md0 md0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f23504a = 23;
        this.f23505b = md0Var;
        this.f23506c = tL_error;
        this.d = tLObject;
    }
}
