package org.telegram.ui;

import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.BrowserHistory;

public final class VoIPFragment$$ExternalSyntheticLambda31 implements Runnable {
    public final int $r8$classId;

    public VoIPFragment$$ExternalSyntheticLambda31(int i) {
        this.$r8$classId = i;
    }

    private final void run$org$telegram$ui$Stories$DialogStoriesCell$$ExternalSyntheticLambda2() {
    }

    private final void run$org$telegram$ui$web$WebActionBar$$ExternalSyntheticLambda11() {
    }

    @Override
    public final void run() throws Throwable {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                }
                break;
            case 2:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 3:
                LiveStoryPipOverlay.instance.dismissInternal$1(true);
                break;
            case 4:
                int i2 = StealthModeAlert.$r8$clinit;
                break;
            case 5:
                Comparator comparator = StoriesController.storiesComparator;
                break;
            case 6:
                int i3 = CollageLayoutView2.$r8$clinit;
                break;
            case 7:
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
            case 8:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 9:
                Theme.changingWallpaper = false;
                Theme.checkAutoNightThemeConditions(false);
                break;
            case 10:
                PhotoViewer.getInstance().closePhoto(false, false);
                break;
            case 11:
                HashSet hashSet = BotWebViewSheet.activeSheets;
                break;
            case 12:
                int i4 = CommunityPendingRequestCell.$r8$clinit;
                break;
            case 13:
                Utilities.globalQueue.postRunnable(new VoIPFragment$$ExternalSyntheticLambda31(15));
                break;
            case 14:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long int64 = serializedData.readInt64(true);
                        for (long j = 0; j < int64; j++) {
                            BrowserHistory.Entry entry = new BrowserHistory.Entry();
                            entry.readParams(serializedData, true);
                            arrayList.add(entry);
                            longSparseArray.put(entry.id, entry);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(19, arrayList, longSparseArray));
                break;
            case 15:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = BrowserHistory.history.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = BrowserHistory.history;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        ((BrowserHistory.Entry) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = BrowserHistory.history;
                    int size3 = arrayList3.size();
                    while (i < size3) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        ((BrowserHistory.Entry) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
        }
    }
}
