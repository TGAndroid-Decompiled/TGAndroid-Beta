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
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class oy implements Utilities.Callback {
    public final int f29427a;
    public final Object f29428b;
    public final Object f29429c;

    public oy(int i10, Object obj, Object obj2) {
        this.f29427a = i10;
        this.f29428b = obj;
        this.f29429c = obj2;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f7;
        int[] iArr;
        int i10;
        TLRPC.Document document;
        s4.b1 K;
        int i11 = this.f29427a;
        float f10 = -0.02f;
        float f11 = 0.05f;
        float f12 = -0.04f;
        float f13 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f29429c;
        Object obj3 = this.f29428b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ry ryVar = ((qy) obj3).f30009a;
                if (ConnectionsManager.getInstance(ryVar.F.f30310c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ry.E(ryVar, runnable, arrayList2, false);
                    return;
                }
            case 1:
                kz kzVar = (kz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(kzVar.f28104w.Q.f30310c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        kzVar.f28101n.add(new iy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 2:
                i10 i10Var = (i10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (i10Var.f27222a0 == null && !(i10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    oc M = vc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, i10Var.f27227f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f29203j = 5000;
                    M.j();
                    return;
                }
                vc a02 = vc.a0(o2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, i10Var.f27227f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", i10Var.f27229h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                oc M2 = a02.M(replaceTags, formatPluralString, i13);
                M2.f29203j = 5000;
                M2.j();
                return;
            case 3:
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
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f13 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f13);
                float f14 = -0.07f;
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f12);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f7 = 2.0f;
                } else {
                    f7 = 3.0f;
                }
                colorMatrix2.setSaturation(f7);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f14 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 4:
                MessagesController messagesController = (MessagesController) obj3;
                fs0 fs0Var = (fs0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        vc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new qd(2, U)), true)).k(true);
                    }
                    fs0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    vc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 5:
                wv0.j((wv0) obj3, (TL_stories.StoryItem) obj2, (ci.a7) obj);
                return;
            case 6:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l4 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.n();
                return;
            case 7:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) obj3;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    dtVar.f36721a.n();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    eyVar.showDialog(new org.telegram.ui.tj0(activity, !ze0.a(), new org.telegram.ui.sv(activity, 0)));
                    return;
                }
                return;
            case 9:
                org.telegram.ui.hp0 hp0Var = (org.telegram.ui.hp0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.q00 q00Var = ((org.telegram.ui.n00) obj3).e;
                if (!q00Var.getUserConfig().isPremium()) {
                    q00Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) q00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                q00Var.E = intValue;
                hp0Var.a(intValue, true);
                org.telegram.ui.e00 e00Var = q00Var.I;
                if (e00Var != null) {
                    if (!q00Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = q00Var.E;
                    }
                    e00Var.d(i10, true);
                }
                q00Var.i0(true);
                return;
            case 10:
                org.telegram.ui.d50 d50Var = (org.telegram.ui.d50) obj3;
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (e50Var != null) {
                    d50Var.getClass();
                    e50Var.setVisibility(0);
                }
                d50Var.f36474c = bitmap2;
                Paint paint = new Paint(1);
                d50Var.d = paint;
                Bitmap bitmap3 = d50Var.f36474c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                d50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f11);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f10);
                d50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 11:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ob0Var.c();
                if (user != null) {
                    long j10 = userArr[0].f20491id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20491id);
                    ob0Var.u(new org.telegram.ui.nb0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ej0 ej0Var = (org.telegram.ui.ej0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = ej0Var.f36927f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20491id)) && ej0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f20491id));
                        }
                    }
                }
                Boolean bool2 = ej0Var.f36938r0;
                if (bool2 != null && bool2.booleanValue()) {
                    oy oyVar = new oy(13, ej0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20390q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.p71(10, messagesController2, oyVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new tg.p(oyVar, 5));
                    }
                    ej0Var.m0 = i12;
                    return;
                }
                ej0Var.U(true, true);
                return;
            case 13:
                org.telegram.ui.ej0 ej0Var2 = (org.telegram.ui.ej0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20491id)) && ej0Var2.R(user3)) {
                            ej0Var2.f36927f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20491id));
                        }
                    }
                }
                ej0Var2.U(true, true);
                return;
            case 14:
                org.telegram.ui.qj0.p((org.telegram.ui.qj0) obj3, (String) obj2, (TLRPC.User) obj);
                return;
            case 15:
                ArrayList arrayList6 = (ArrayList) obj2;
                u9[] u9VarArr = (u9[]) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str2 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i15).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str2)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).f20350id == longValue) {
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
                            u9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                        }
                    }
                    return;
                }
                return;
            case 16:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.tk0) obj2).run();
                return;
            case 17:
                org.telegram.ui.tv0 tv0Var = (org.telegram.ui.tv0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                tv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                o2Var3.presentFragment(new ProfileActivity(bundle3, null));
                tv0Var.c(false);
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.vr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 19:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.c2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ei.vb D = ei.vb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ei.lb lbVar = D.f9973c1;
                    if (lbVar != null) {
                        lbVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.t01 t01Var = (org.telegram.ui.t01) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.a61.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.w01.f42863s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                t01Var.f41849c = imageReceiver;
                t01Var.e.add(imageReceiver);
                int f15 = org.telegram.ui.qy.f();
                t01Var.f41849c.setAutoRepeat(0);
                org.telegram.ui.v01 v01Var = t01Var.f41849c;
                String str4 = f15 + "_" + f15 + "_precache";
                org.telegram.ui.ly0 ly0Var = new org.telegram.ui.ly0(t01Var, 6);
                v01Var.getClass();
                v01Var.setDelegate(new org.telegram.ui.u01(new Runnable[]{ly0Var}));
                v01Var.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                t01Var.f41849c.onAttachedToWindow();
                t01Var.f41851g[1] = true;
                t01Var.a();
                return;
            case 21:
                Runnable runnable3 = (Runnable) obj;
                ((ci.e) obj3).run((HashSet) obj2);
                return;
            case 22:
                org.telegram.ui.a41 a41Var = (org.telegram.ui.a41) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    a41Var.getClass();
                    view2.setVisibility(0);
                }
                a41Var.f35584f = bitmap4;
                Paint paint2 = new Paint(1);
                a41Var.f35585n = paint2;
                Bitmap bitmap5 = a41Var.f35584f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                a41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, f11);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, f10);
                a41Var.f35585n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                a41Var.f35586r = new Matrix();
                return;
            case 23:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.b81.X((org.telegram.ui.b81) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 24:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    lm0 lm0Var = themeActivity.f34202b;
                    if (lm0Var != null && lm0Var.G && (K = lm0Var.K(themeActivity.M)) != null) {
                        themeActivity.f34200a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.n71 n71Var = (org.telegram.ui.n71) obj2;
                if (((Boolean) obj).booleanValue()) {
                    n71Var.run();
                    return;
                } else {
                    vc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 26:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Wallet.l0.i("disableBackupWithoutUpdatingPhrase: ".concat(str5));
                    d8Var.run(str5);
                    return;
                }
                org.telegram.ui.Wallet.l0.F("sending disableBackup to server");
                org.telegram.ui.Wallet.r2.a(l0Var.f34743a, new gi.c(7), null, null, null, new ci.c0(3, l0Var, d8Var), true, true, new org.telegram.ui.ta0((Object) null, 1));
                return;
            case 27:
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
            case 28:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.x7) obj2).run((String) obj);
                return;
            default:
                ((org.telegram.ui.Wallet.l0) obj3).f34756q.put((TL_wallet.walletTransaction) obj, (ai.k4) obj2);
                return;
        }
    }

    public oy(ArrayList arrayList, u9[] u9VarArr) {
        this.f29427a = 15;
        this.f29429c = arrayList;
        this.f29428b = u9VarArr;
    }
}
