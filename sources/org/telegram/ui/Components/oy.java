package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class oy implements Utilities.Callback {
    public final int f31388a;
    public final Object f31389b;
    public final Object f31390c;

    public oy(int i10, Object obj, Object obj2) {
        this.f31388a = i10;
        this.f31389b = obj;
        this.f31390c = obj2;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f7;
        int[] iArr;
        int i10;
        TLRPC.Document document;
        s4.e1 K;
        int i11 = this.f31388a;
        float f10 = -0.02f;
        float f11 = 0.05f;
        float f12 = -0.04f;
        float f13 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f31390c;
        Object obj3 = this.f31389b;
        switch (i11) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                so soVar = (so) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                soVar.run();
                return;
            case 1:
                ry ryVar = (ry) obj3;
                sy syVar = ryVar.f32344a;
                sz szVar = syVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(szVar.f32716c1);
                String[] strArr = szVar.W0;
                String str = syVar.v;
                qy qyVar = new qy(ryVar, (String) obj2, (Runnable) obj, 0);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(szVar.f32716c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str, false, qyVar, null, z10, false, true, 25);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                sy syVar2 = ((ry) obj3).f32344a;
                if (ConnectionsManager.getInstance(syVar2.F.f32716c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    sy.E(syVar2, runnable, arrayList2, false);
                    return;
                }
            case 3:
                lz lzVar = (lz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(lzVar.f30333w.Q.f32716c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        lzVar.f30330n.add(new jy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 4:
                n10 n10Var = (n10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (n10Var.f30798a0 == null && !(n10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    qc M = wc.b0(r2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, n10Var.f30803f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f31887j = 5000;
                    M.j();
                    return;
                }
                wc b02 = wc.b0(r2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, n10Var.f30803f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", n10Var.f30805h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                qc M2 = b02.M(replaceTags, formatPluralString, i13);
                M2.f31887j = 5000;
                M2.j();
                return;
            case 5:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f13 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f13);
                float f14 = -0.07f;
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    f12 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f12);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f7 = 2.0f;
                } else {
                    f7 = 3.0f;
                }
                colorMatrix2.setSaturation(f7);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f14 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 6:
                aw0.g((aw0) obj3, (TL_stories.StoryItem) obj2, (di.a7) obj);
                return;
            case 7:
                MessagesController messagesController = (MessagesController) obj3;
                ps0 ps0Var = (ps0) obj2;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        wc.b0(U).Q(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new td(2, U)), true)).k(true);
                    }
                    ps0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    wc.b0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 8:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) obj3;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                Long l4 = (Long) obj;
                ftVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                r2Var2.presentFragment(new ProfileActivity(bundle, null));
                ftVar.n();
                return;
            case 9:
                org.telegram.ui.bt btVar = (org.telegram.ui.bt) obj3;
                Boolean bool = (Boolean) obj;
                btVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    btVar.f38155a.n();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    cyVar.showDialog(new org.telegram.ui.ak0(activity, !xe0.a(), new org.telegram.ui.qv(activity, 0)));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.op0 op0Var = (org.telegram.ui.op0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.o00 o00Var = ((org.telegram.ui.l00) obj3).e;
                if (!o00Var.getUserConfig().isPremium()) {
                    o00Var.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) o00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                o00Var.E = intValue;
                op0Var.a(intValue, true);
                org.telegram.ui.c00 c00Var = o00Var.I;
                if (c00Var != null) {
                    if (!o00Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = o00Var.E;
                    }
                    c00Var.d(i10, true);
                }
                o00Var.k0(true);
                return;
            case 12:
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) obj3;
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (z10Var != null) {
                    e50Var.getClass();
                    z10Var.setVisibility(0);
                }
                e50Var.f38991c = bitmap2;
                Paint paint = new Paint(1);
                e50Var.d = paint;
                Bitmap bitmap3 = e50Var.f38991c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                e50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f11);
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f10);
                e50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 13:
                org.telegram.ui.lb0 lb0Var = (org.telegram.ui.lb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                lb0Var.c();
                if (user != null) {
                    long j10 = userArr[0].f22174id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f22174id);
                    lb0Var.u(new org.telegram.ui.kb0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.cj0 cj0Var = (org.telegram.ui.cj0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = cj0Var.f38477f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f22174id)) && cj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f22174id));
                        }
                    }
                }
                Boolean bool2 = cj0Var.f38488r0;
                if (bool2 != null && bool2.booleanValue()) {
                    oy oyVar = new oy(15, cj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f22073q = str2;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.l71(12, messagesController2, oyVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new ti.g(oyVar, 8));
                    }
                    cj0Var.m0 = i12;
                    return;
                }
                cj0Var.U(true, true);
                return;
            case 15:
                org.telegram.ui.cj0 cj0Var2 = (org.telegram.ui.cj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f22174id)) && cj0Var2.R(user3)) {
                            cj0Var2.f38477f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f22174id));
                        }
                    }
                }
                cj0Var2.U(true, true);
                return;
            case 16:
                org.telegram.ui.oj0.o((org.telegram.ui.oj0) obj3, (String) obj2, (TLRPC.User) obj);
                return;
            case 17:
                ArrayList arrayList6 = (ArrayList) obj3;
                y9[] y9VarArr = (y9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str3 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i15).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str3)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).f22033id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i16);
                                        }
                                    }
                                } else {
                                    i15++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            y9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 18:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.al0) obj2).run();
                return;
            case 19:
                org.telegram.ui.xv0 xv0Var = (org.telegram.ui.xv0) obj3;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj2;
                Long l10 = (Long) obj;
                xv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                r2Var3.presentFragment(new ProfileActivity(bundle3, null));
                xv0Var.c(false);
                return;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                int i17 = ProfileActivity.R6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.as0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                int i18 = ProfileActivity.R6;
                ((org.telegram.ui.ActionBar.e2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.sb D = fi.sb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    fi.ib ibVar = D.f11614c1;
                    if (ibVar != null) {
                        ibVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.y01 y01Var = (org.telegram.ui.y01) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.c61.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.b11.f37941s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                y01Var.f45918c = imageReceiver;
                y01Var.e.add(imageReceiver);
                int f15 = org.telegram.ui.oy.f();
                y01Var.f45918c.setAutoRepeat(0);
                org.telegram.ui.a11 a11Var = y01Var.f45918c;
                String str5 = f15 + "_" + f15 + "_precache";
                org.telegram.ui.my0 my0Var = new org.telegram.ui.my0(y01Var, 7);
                a11Var.getClass();
                a11Var.setDelegate(new org.telegram.ui.z01(new Runnable[]{my0Var}));
                a11Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                y01Var.f45918c.onAttachedToWindow();
                y01Var.f45920g[1] = true;
                y01Var.a();
                return;
            case 23:
                Runnable runnable3 = (Runnable) obj;
                ((di.e) obj3).run((HashSet) obj2);
                return;
            case 24:
                org.telegram.ui.c41 c41Var = (org.telegram.ui.c41) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    c41Var.getClass();
                    view2.setVisibility(0);
                }
                c41Var.f38254f = bitmap4;
                Paint paint2 = new Paint(1);
                c41Var.f38255n = paint2;
                Bitmap bitmap5 = c41Var.f38254f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                c41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, f11);
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, f10);
                c41Var.f38255n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                c41Var.f38256r = new Matrix();
                return;
            case 25:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.d81.Y((org.telegram.ui.d81) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    mm0 mm0Var = themeActivity.f36262b;
                    if (mm0Var != null && mm0Var.G && (K = mm0Var.K(themeActivity.M)) != null) {
                        themeActivity.f36260a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.fy0 fy0Var = (org.telegram.ui.fy0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    fy0Var.run();
                    return;
                } else {
                    wc.b0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.l0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    d8Var.run(str6);
                    return;
                }
                org.telegram.ui.Wallet.l0.F("sending disableBackup to server");
                org.telegram.ui.Wallet.r2.a(l0Var.f36804a, new ai.d0(11), null, null, null, new di.c0(3, l0Var, d8Var), true, true, new ag.b1((Object) null, 2));
                return;
            default:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj3;
                try {
                    ((Utilities.Callback) obj2).run((String) obj);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
        }
    }
}
