package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
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
public final class xk implements Utilities.Callback {
    public final int f33120a;
    public final Object f33121b;
    public final Object f33122c;

    public xk(int i10, Object obj, Object obj2) {
        this.f33120a = i10;
        this.f33121b = obj;
        this.f33122c = obj2;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f10;
        int[] iArr;
        int i10;
        TLRPC.Document document;
        f2.m1 K;
        String str;
        int i11 = this.f33120a;
        float f11 = -0.02f;
        float f12 = 0.05f;
        float f13 = -0.04f;
        float f14 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f33122c;
        Object obj3 = this.f33121b;
        switch (i11) {
            case 0:
                cl clVar = ((zk) obj3).f33961b;
                clVar.f25995u0.d(((bl) obj2).f25635c, clVar.f25996v0, true, 0, ((Long) obj).longValue());
                clVar.f26590b.dismiss(true);
                return;
            case 1:
                lv lvVar = (lv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new kv(lvVar, 1));
                    return;
                }
                return;
            case 2:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                eo eoVar = (eo) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                eoVar.run();
                return;
            case 3:
                ky kyVar = (ky) obj3;
                ly lyVar = kyVar.f28513a;
                mz mzVar = lyVar.C;
                MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.Z0);
                String[] strArr = mzVar.T0;
                String str2 = lyVar.v;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a((Object) kyVar, (String) obj2, (Object) ((Runnable) obj), 23);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(mzVar.Z0).isPremium()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, z4, false, true, 25);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ly lyVar2 = ((ky) obj3).f28513a;
                if (ConnectionsManager.getInstance(lyVar2.C.Z0).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ly.E(lyVar2, runnable, arrayList2, false);
                    return;
                }
            case 5:
                fz fzVar = (fz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(fzVar.f27051w.N.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fzVar.f27048n.add(new dy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 6:
                d10 d10Var = (d10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (d10Var.X == null && !(d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    ic M = qc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, d10Var.f26095c0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f27778j = 5000;
                    M.j();
                    return;
                }
                qc a02 = qc.a0(p2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, d10Var.f26095c0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", d10Var.f26097e0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                ic M2 = a02.M(replaceTags, formatPluralString, i13);
                M2.f27778j = 5000;
                M2.j();
                return;
            case 7:
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
                    f14 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f14);
                float f15 = -0.07f;
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f13 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f13);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f15 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f15);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 8:
                MessagesController messagesController = (MessagesController) obj3;
                hr0 hr0Var = (hr0) obj2;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        qc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new jd(2, U)), true)).k(true);
                    }
                    hr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    qc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 9:
                yu0.j((yu0) obj3, (TL_stories.StoryItem) obj2, (oh.m6) obj);
                return;
            case 10:
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l10 = (Long) obj;
                qtVar.getClass();
                Bundle bundle = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle.putLong("user_id", l10.longValue());
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                p2Var2.presentFragment(new ProfileActivity(bundle, null));
                qtVar.p();
                return;
            case 11:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) obj3;
                Boolean bool = (Boolean) obj;
                mtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    mtVar.f39067a.p();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    pyVar.showDialog(new org.telegram.ui.xj0(activity, !ie0.c(), new org.telegram.ui.cw(activity, 0)));
                    return;
                }
                return;
            case 13:
                org.telegram.ui.kp0 kp0Var = (org.telegram.ui.kp0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.b10 b10Var = ((org.telegram.ui.y00) obj3).f43497e;
                if (!b10Var.getUserConfig().isPremium()) {
                    b10Var.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) b10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                b10Var.B = intValue;
                kp0Var.a(intValue, true);
                org.telegram.ui.p00 p00Var = b10Var.F;
                if (p00Var != null) {
                    if (!b10Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = b10Var.B;
                    }
                    p00Var.d(i10, true);
                }
                b10Var.i0(true);
                return;
            case 14:
                org.telegram.ui.n50 n50Var = (org.telegram.ui.n50) obj3;
                fg.h0 h0Var = (fg.h0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (h0Var != null) {
                    n50Var.getClass();
                    h0Var.setVisibility(0);
                }
                n50Var.f39185c = bitmap2;
                Paint paint = new Paint(1);
                n50Var.d = paint;
                Bitmap bitmap3 = n50Var.f39185c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                n50Var.f39186e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f11);
                n50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 15:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                xb0Var.a();
                if (user != null) {
                    long j10 = userArr[0].f20992id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20992id);
                    xb0Var.n(new org.telegram.ui.wb0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ij0 ij0Var = (org.telegram.ui.ij0) obj3;
                String str3 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = ij0Var.f37721c0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20992id)) && ij0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f20992id));
                        }
                    }
                }
                Boolean bool2 = ij0Var.f37732o0;
                if (bool2 != null && bool2.booleanValue()) {
                    xk xkVar = new xk(17, ij0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str3 != null && !str3.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20891q = str3;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new eg.b3(2, messagesController2, xkVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new eh.m(xkVar, 13));
                    }
                    ij0Var.f37728j0 = i12;
                    return;
                }
                ij0Var.U(true, true);
                return;
            case 17:
                org.telegram.ui.ij0 ij0Var2 = (org.telegram.ui.ij0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20992id)) && ij0Var2.R(user3)) {
                            ij0Var2.f37721c0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20992id));
                        }
                    }
                }
                ij0Var2.U(true, true);
                return;
            case 18:
                org.telegram.ui.uj0 uj0Var = (org.telegram.ui.uj0) obj3;
                String str4 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    uj0Var.O.setImageDrawable(null);
                    uj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new org.telegram.ui.ue0(11, uj0Var, str4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = uj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(uj0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21981v6), PorterDuff.Mode.SRC_IN));
                    uj0Var.O.setImageDrawable(mutate);
                    if (user4.contact) {
                        uj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new org.telegram.ui.ue0(12, uj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        uj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                uj0Var.w(false);
                return;
            case 19:
                ArrayList arrayList6 = (ArrayList) obj3;
                p9[] p9VarArr = (p9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str5 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i15).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str5)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).f20851id == longValue) {
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
                            p9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str5), null);
                        }
                    }
                    return;
                }
                return;
            case 20:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.xk0) obj2).run();
                return;
            case 21:
                org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l11 = (Long) obj;
                yv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l11.longValue() >= 0) {
                    bundle3.putLong("user_id", l11.longValue());
                } else {
                    bundle3.putLong("chat_id", -l11.longValue());
                }
                p2Var3.presentFragment(new ProfileActivity(bundle3, null));
                yv0Var.c(false);
                return;
            case 22:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.yr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 23:
                org.telegram.ui.b11 b11Var = (org.telegram.ui.b11) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.w61.k(str6, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder t6 = android.support.v4.media.a.t("couldn't find ", str6, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.e11.f36328s;
                    FileLog.e(t6.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                b11Var.f35317c = imageReceiver;
                b11Var.f35318e.add(imageReceiver);
                int f16 = org.telegram.ui.cz.f();
                b11Var.f35317c.setAutoRepeat(0);
                org.telegram.ui.d11 d11Var = b11Var.f35317c;
                String str7 = f16 + "_" + f16 + "_precache";
                org.telegram.ui.sz0 sz0Var = new org.telegram.ui.sz0(b11Var, 4);
                d11Var.getClass();
                d11Var.setDelegate(new org.telegram.ui.c11(new Runnable[]{sz0Var}));
                d11Var.setImage(ImageLocation.getForDocument(k10), str7, null, null, tL_messages_stickerSet2, 0);
                b11Var.f35317c.onAttachedToWindow();
                b11Var.f35320g[1] = true;
                b11Var.a();
                return;
            case 24:
                Runnable runnable3 = (Runnable) obj;
                ((hg.h) obj3).run((HashSet) obj2);
                return;
            case 25:
                org.telegram.ui.w41 w41Var = (org.telegram.ui.w41) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    w41Var.getClass();
                    view2.setVisibility(0);
                }
                w41Var.f42285f = bitmap4;
                Paint paint2 = new Paint(1);
                w41Var.f42286n = paint2;
                Bitmap bitmap5 = w41Var.f42285f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                w41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, f11);
                w41Var.f42286n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                w41Var.f42287r = new Matrix();
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.K0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    sl0 sl0Var = themeActivity.f34872b;
                    if (sl0Var != null && sl0Var.D && (K = sl0Var.K(themeActivity.J)) != null) {
                        themeActivity.f34870a.v(K, themeActivity.J);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.h21 h21Var = (org.telegram.ui.h21) obj2;
                if (((Boolean) obj).booleanValue()) {
                    h21Var.run();
                    return;
                } else {
                    qc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 28:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj3;
                String str8 = (String) obj2;
                Boolean bool3 = (Boolean) obj;
                a1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool3.booleanValue()) {
                        if (TextUtils.isEmpty(str8)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    a1Var.v("biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) obj3;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                x1Var.getClass();
                ((org.telegram.ui.web.f1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = x1Var.f42733e;
                if (callback != null) {
                    x1Var.finishFragment();
                    callback.run(b1Var);
                    return;
                }
                af.g.s(x1Var.getParentActivity(), b1Var.f42474c);
                return;
        }
    }
}
