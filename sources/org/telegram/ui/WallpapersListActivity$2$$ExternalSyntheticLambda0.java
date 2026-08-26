package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class WallpapersListActivity$2$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, DialogsActivity.DialogsActivityDelegate {
    public final WallpapersListActivity.AnonymousClass2 f$0;

    public WallpapersListActivity$2$$ExternalSyntheticLambda0(WallpapersListActivity.AnonymousClass2 anonymousClass2) {
        this.f$0 = anonymousClass2;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        WallpapersListActivity wallpapersListActivity;
        LongSparseArray longSparseArray;
        String url;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            wallpapersListActivity = WallpapersListActivity.this;
            longSparseArray = wallpapersListActivity.selectedWallPapers;
            if (i3 >= longSparseArray.size()) {
                break;
            }
            Object objValueAt = longSparseArray.valueAt(i3);
            if (objValueAt instanceof TLRPC.TL_wallPaper) {
                url = AndroidUtilities.getWallPaperUrl(objValueAt);
            } else {
                if (objValueAt instanceof WallpapersListActivity.ColorWallpaper) {
                    url = ((WallpapersListActivity.ColorWallpaper) objValueAt).getUrl();
                }
                i3++;
            }
            if (!TextUtils.isEmpty(url)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(url);
            }
            i3++;
        }
        longSparseArray.clear();
        ((BaseFragment) wallpapersListActivity).actionBar.hideActionMode$1();
        ((BaseFragment) wallpapersListActivity).actionBar.closeSearchField(true);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).getClientUserId() || charSequence != null) {
            wallpapersListActivity.updateRowsSelection();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                long j = ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId;
                if (charSequence != null) {
                    SendMessagesHelper.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                if (!TextUtils.isEmpty(sb)) {
                    SendMessagesHelper.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
            }
            dialogsActivity.finishFragment();
            return true;
        }
        long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j2)) {
            bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
        } else {
            if (DialogObject.isUserDialog(j2)) {
                bundleM.putLong("user_id", j2);
            } else if (DialogObject.isChatDialog(j2)) {
                bundleM.putLong("chat_id", -j2);
            }
            if (!MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).checkCanOpenChat(bundleM, dialogsActivity)) {
                return true;
            }
        }
        NotificationCenter.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        wallpapersListActivity.presentFragment(new ChatActivity(bundleM), true);
        SendMessagesHelper.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        LongSparseArray longSparseArray;
        WallpapersListActivity.AnonymousClass2 anonymousClass2 = this.f$0;
        WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
        AlertDialog alertDialog2 = new AlertDialog(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.progressDialog = alertDialog2;
        alertDialog2.canCacnel = false;
        alertDialog2.show();
        new ArrayList();
        int[] iArr = {0};
        int i2 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.selectedWallPapers;
            if (i2 >= longSparseArray.size()) {
                break;
            }
            Object objValueAt = longSparseArray.valueAt(i2);
            if (objValueAt instanceof WallpapersListActivity.ColorWallpaper) {
                WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) objValueAt;
                TLRPC.WallPaper wallPaper = colorWallpaper.parentWallpaper;
                if (wallPaper == null || wallPaper.id >= 0) {
                    objValueAt = wallPaper;
                } else {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(colorWallpaper.parentWallpaper.id);
                    wallpapersListActivity.localWallPapers.remove(colorWallpaper);
                    HashMap map = wallpapersListActivity.localDict;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(colorWallpaper.color));
                    sb.append(colorWallpaper.gradientColor1);
                    sb.append(colorWallpaper.gradientColor2);
                    sb.append(colorWallpaper.gradientColor3);
                    sb.append(colorWallpaper.gradientRotation);
                    sb.append(colorWallpaper.intensity);
                    String str = colorWallpaper.slug;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    map.remove(Utilities.MD5(sb.toString()));
                }
            }
            if (objValueAt instanceof TLRPC.WallPaper) {
                iArr[0] = iArr[0] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) objValueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (objValueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.id = wallPaper2.id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.id = wallPaper2.id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.selectedBackgroundSlug)) {
                    wallpapersListActivity.selectedBackgroundSlug = Theme.hasWallpaperFromTheme() ? "t" : "d";
                    Theme.currentTheme.setOverrideWallpaper(null);
                    Theme.reloadWallpaper(true);
                }
                ConnectionsManager.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).sendRequest(savewallpaper, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(9, anonymousClass2, iArr));
            }
            i2++;
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.loadWallpapers(true);
        }
        longSparseArray.clear();
        ((BaseFragment) wallpapersListActivity).actionBar.hideActionMode$1();
        ((BaseFragment) wallpapersListActivity).actionBar.closeSearchField(true);
    }
}
