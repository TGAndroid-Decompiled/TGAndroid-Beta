package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.webrtc.EglRenderer;

public final class op0 implements Runnable {

    public final int f41150a;

    public final boolean f41151b;

    public final Object f41152c;
    public final Object d;

    public op0(Object obj, Object obj2, boolean z10, int i10) {
        this.f41150a = i10;
        this.f41152c = obj;
        this.d = obj2;
        this.f41151b = z10;
    }

    @Override
    public final void run() throws Throwable {
        ?? r10;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        BufferedInputStream bufferedInputStream2;
        int i10;
        int i11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursorQueryFinalized;
        int i12 = this.f41150a;
        int i13 = 1;
        boolean z11 = this.f41151b;
        Object obj = this.d;
        Object obj2 = this.f41152c;
        switch (i12) {
            case 0:
                aq0.U((aq0) obj2, (TLObject) obj, z11);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                View view = (View) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!z11) {
                    photoViewer.getClass();
                    view.setVisibility(8);
                }
                photoViewer.s3();
                return;
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) obj2;
                String str = (String) obj;
                if (str.equals(photoViewer2.f35805y4.getImageKey())) {
                    photoViewer2.f35750s4 = z11 ? 1 : 0;
                    photoViewer2.f35759t4 = str;
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!z11 || profileActivity.H4 != -1) {
                    profileActivity.j5();
                    vz0 vz0Var = profileActivity.d;
                    if (vz0Var != null) {
                        vz0Var.l();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.rg0 rg0Var = profileActivity.W;
                if (rg0Var != null) {
                    org.telegram.ui.Components.og0 og0VarJ = org.telegram.ui.Components.rg0.j(7, rg0Var.f32157a);
                    if (og0VarJ == null || !og0VarJ.f31296s) {
                        r10 = 0;
                    } else {
                        r10 = 0;
                        og0VarJ.f31296s = false;
                        rg0Var.invalidate();
                    }
                    if (zArr[r10]) {
                        org.telegram.ui.Components.rg0 rg0Var2 = profileActivity.W;
                        rg0Var2.E = true;
                        rg0Var2.o(7, r10);
                        profileActivity.W.o(9, true);
                        org.telegram.ui.Components.rg0 rg0Var3 = profileActivity.W;
                        if (rg0Var3.E) {
                            rg0Var3.E = r10;
                            rg0Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                Activity activity = (Activity) obj;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q1(b2Var, 0));
                        return;
                    }
                    File file = new File(logsDir, "logs.zip");
                    if (file.exists()) {
                        file.delete();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : logsDir.listFiles()) {
                        arrayList.add(file2);
                    }
                    File file3 = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                    if (file3.exists() && file3.isDirectory()) {
                        for (File file4 : file3.listFiles()) {
                            arrayList.add(file4);
                        }
                    }
                    boolean[] zArr2 = new boolean[1];
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        int i14 = 65536;
                        try {
                            byte[] bArr = new byte[65536];
                            int i15 = 0;
                            while (i15 < arrayList.size()) {
                                File file5 = (File) arrayList.get(i15);
                                if (file5.getName().contains("cache4") || !(z11 || file5.getName().contains("_mtproto"))) {
                                    if (file5.exists() && !file5.isDirectory()) {
                                        bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i14);
                                        try {
                                            zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                            while (true) {
                                                i10 = bufferedInputStream2.read(bArr, 0, i14);
                                                if (i10 != -1) {
                                                    zipOutputStream.write(bArr, 0, i10);
                                                    i14 = 65536;
                                                } else {
                                                    bufferedInputStream2.close();
                                                }
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            bufferedInputStream = bufferedInputStream2;
                                            try {
                                                e.printStackTrace();
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                if (zipOutputStream != null) {
                                                    zipOutputStream.close();
                                                }
                                                AndroidUtilities.runOnUIThread(new ex0(b2Var, zArr2, activity, file, 0));
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                if (zipOutputStream != null) {
                                                    zipOutputStream.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedInputStream = bufferedInputStream2;
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else if (jCurrentTimeMillis - file5.lastModified() <= 86400000) {
                                    if (file5.exists()) {
                                        bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), i14);
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            i10 = bufferedInputStream2.read(bArr, 0, i14);
                                            if (i10 != -1) {
                                                zipOutputStream.write(bArr, 0, i10);
                                                i14 = 65536;
                                            } else {
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i15++;
                                i14 = 65536;
                            }
                            zArr2[0] = true;
                        } catch (Exception e10) {
                            e = e10;
                            bufferedInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream = null;
                        }
                        break;
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    zipOutputStream.close();
                    AndroidUtilities.runOnUIThread(new ex0(b2Var, zArr2, activity, file, 0));
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            case 5:
                m31.P((m31) obj2, z11, (org.telegram.ui.Components.lg0) obj);
                return;
            case 6:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, z11, (byte[]) obj);
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = wallpapersListActivity.X;
                HashMap map = wallpapersListActivity.Y;
                int i16 = wallpapersListActivity.v;
                HashMap map2 = wallpapersListActivity.f36310d0;
                ArrayList arrayList3 = wallpapersListActivity.f36305a0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.f36309c0.clear();
                    map2.clear();
                    if (i16 != 1 && i16 != 2) {
                        arrayList3.clear();
                        map.clear();
                        arrayList2.clear();
                        arrayList2.addAll(tL_wallPapers.wallpapers);
                        arrayList3.addAll(wallpapersListActivity.f36307b0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i17);
                        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            map = map;
                        } else {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                map.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !map2.containsKey(Long.valueOf(document.f22386id))) {
                                    wallpapersListActivity.f36309c0.add(wallPaper);
                                    map2.put(Long.valueOf(wallPaper.document.f22386id), wallPaper);
                                }
                                if (i16 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i16 != 2 || z10) && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList3.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i18 = wallPaperSettings4.second_background_color;
                                wh1 wh1Var = (i18 == 0 || (i11 = wallPaperSettings4.third_background_color) == 0) ? new wh1(wallPaperSettings4.background_color, i18, null, wallPaperSettings4.rotation) : new wh1(null, wallPaperSettings4.background_color, i18, i11, wallPaperSettings4.fourth_background_color);
                                wh1Var.f44120a = wallPaper.slug;
                                wh1Var.h = wallPaperSettings4.intensity / 100.0f;
                                wh1Var.f44124f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                wh1Var.f44129l = wallPaper;
                                arrayList3.add(wh1Var);
                            }
                            map = map;
                        }
                        i17++;
                        map = map;
                        i13 = 1;
                    }
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                }
                org.telegram.ui.ActionBar.b2 b2Var2 = wallpapersListActivity.L;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    if (z11) {
                        return;
                    }
                    wallpapersListActivity.D.x0(0);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj2;
                String str2 = (String) obj;
                org.telegram.ui.web.d dVar = lVar.f43900w;
                ArrayList arrayList4 = lVar.f43901x;
                arrayList4.clear();
                org.telegram.ui.web.k1.a().getClass();
                ArrayList arrayList5 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                    for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                        arrayList5.add(jSONArray.getString(i19));
                    }
                } catch (Exception e13) {
                    FileLog.e((Throwable) e13, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("gossip").getJSONArray("results");
                        for (int i20 = 0; i20 < jSONArray2.length(); i20++) {
                            arrayList5.add(jSONArray2.getJSONObject(i20).getString("key"));
                        }
                    } catch (Exception e14) {
                        FileLog.e((Throwable) e14, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str2);
                            for (int i21 = 0; i21 < jSONArray3.length(); i21++) {
                                String string = jSONArray3.getJSONObject(i21).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList5.add(string);
                                }
                            }
                        } catch (Exception e15) {
                            FileLog.e((Throwable) e15, false);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
                dVar.U2.N(true);
                if (z11 != (!arrayList4.isEmpty())) {
                    dVar.T2.h1(0, 0);
                    return;
                }
                return;
            case 9:
                ((EglRenderer) obj2).lambda$releaseEglSurface$5(z11, (Runnable) obj);
                return;
            case 10:
                qf.v vVar = (qf.v) obj2;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            try {
                                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                                arrayList6.add(TL_account.TL_businessChatLink.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                            } catch (Exception e16) {
                                e = e16;
                                FileLog.e(e);
                                if (sQLiteCursorQueryFinalized != null) {
                                }
                                AndroidUtilities.runOnUIThread(new cg.j(vVar, arrayList6, arrayList7, arrayList8, this.f41151b, 22));
                                return;
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        ArrayList<Long> arrayList9 = new ArrayList<>();
                        ArrayList arrayList10 = new ArrayList();
                        for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList6.get(i22);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i23 = 0; i23 < tL_businessChatLink.entities.size(); i23++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i23);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList9.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList9.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList9, arrayList7);
                        }
                        if (!arrayList10.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList10), arrayList8);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (0 != 0) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursorQueryFinalized = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                    if (0 != 0) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new cg.j(vVar, arrayList6, arrayList7, arrayList8, this.f41151b, 22));
                return;
            case 11:
                ((qh.a) obj2).P((Utilities.Callback) obj, z11, false);
                return;
            case 12:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z11));
                return;
            case 13:
                rh.p3 p3Var = (rh.p3) obj2;
                rh.g5 g5Var = (rh.g5) obj;
                boolean z12 = !z11;
                rh.i5 i5Var = g5Var.v;
                for (TL_iv.pageTableCell pagetablecell : g5Var.D) {
                    rh.j5 j5VarM = i5Var.m(pagetablecell);
                    if (j5VarM == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rh.x5.h(pagetablecell));
                        boolean z13 = spannableStringBuilder.length() > 0 && (rh.v5.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        rh.x5.l(pagetablecell, z12);
                        if (!z11 && spannableStringBuilder.length() > 0) {
                            rh.v5.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z11 && z13) {
                            rh.v5.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        rh.x5.d(pagetablecell, spannableStringBuilder);
                    } else if (j5VarM.f47227b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(j5VarM.f47226a.getText());
                        boolean z14 = spannableStringBuilder2.length() > 0 && (rh.v5.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        rh.x5.l(j5VarM.f47227b, z12);
                        if (z11) {
                            if (z14) {
                                rh.v5.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            rh.v5.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        rh.x5.d(j5VarM.f47227b, spannableStringBuilder2);
                        j5VarM.b(j5VarM.f47227b);
                    }
                }
                i5Var.invalidate();
                rh.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.f47594a != null) {
                    w2Var.a();
                }
                p3Var.M2();
                return;
            default:
                rh.o3 o3Var = (rh.o3) obj;
                o3Var.f47315f.o3(true);
                rh.b4.k((org.telegram.ui.ActionBar.n2) obj2, z11, new rh.y3(o3Var, 2));
                return;
        }
    }

    public op0(Object obj, boolean z10, Object obj2, int i10) {
        this.f41150a = i10;
        this.f41152c = obj;
        this.f41151b = z10;
        this.d = obj2;
    }
}
