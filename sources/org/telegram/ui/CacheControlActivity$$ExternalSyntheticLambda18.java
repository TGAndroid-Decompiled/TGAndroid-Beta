package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Storage.CacheModel;

public final class CacheControlActivity$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final CacheControlActivity f$0;
    public final ArrayList f$1;
    public final ArrayList f$2;
    public final ArrayList f$3;
    public final CacheModel f$4;

    public CacheControlActivity$$ExternalSyntheticLambda18(CacheControlActivity cacheControlActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CacheModel cacheModel, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheControlActivity;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = arrayList3;
        this.f$4 = cacheModel;
    }

    @Override
    public final void run() {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                CacheControlActivity cacheControlActivity = this.f$0;
                cacheControlActivity.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
                ArrayList<Long> arrayList3 = this.f$1;
                if (!arrayList3.isEmpty()) {
                    try {
                        cacheControlActivity.getMessagesStorage().getUsersInternal(arrayList3, arrayList);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                ArrayList arrayList4 = this.f$2;
                if (!arrayList4.isEmpty()) {
                    try {
                        cacheControlActivity.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList4), arrayList2);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                int i = 0;
                while (true) {
                    ArrayList arrayList5 = this.f$3;
                    if (i >= arrayList5.size()) {
                        Collections.sort(arrayList5, new ChatActivity$$ExternalSyntheticLambda18(2));
                        AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda18(cacheControlActivity, arrayList, arrayList2, arrayList5, this.f$4, 1));
                    } else {
                        if (((CacheControlActivity.DialogFileEntities) arrayList5.get(i)).totalSize <= 0) {
                            arrayList5.remove(i);
                            i--;
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                CacheControlActivity cacheControlActivity2 = this.f$0;
                ArrayList<TLRPC.User> arrayList6 = this.f$1;
                ArrayList<TLRPC.Chat> arrayList7 = this.f$2;
                ArrayList arrayList8 = this.f$3;
                CacheModel cacheModel = this.f$4;
                cacheControlActivity2.getMessagesController().putUsers(arrayList6, true);
                cacheControlActivity2.getMessagesController().putChats(arrayList7, true);
                boolean z2 = false;
                CacheControlActivity.DialogFileEntities dialogFileEntities = null;
                int i2 = 0;
                while (i2 < arrayList8.size()) {
                    CacheControlActivity.DialogFileEntities dialogFileEntities2 = (CacheControlActivity.DialogFileEntities) arrayList8.get(i2);
                    if (cacheControlActivity2.getMessagesController().getUserOrChat(dialogFileEntities2.dialogId) == null) {
                        dialogFileEntities2.dialogId = Long.MAX_VALUE;
                        if (dialogFileEntities != null) {
                            int i3 = 0;
                            while (i3 < dialogFileEntities2.entitiesByType.size()) {
                                int iKeyAt = dialogFileEntities2.entitiesByType.keyAt(i3);
                                CacheControlActivity.FileEntities fileEntities = (CacheControlActivity.FileEntities) dialogFileEntities2.entitiesByType.valueAt(i3);
                                CacheControlActivity.FileEntities fileEntities2 = (CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.get(iKeyAt, z2);
                                if (fileEntities2 == null) {
                                    fileEntities2 = new CacheControlActivity.FileEntities();
                                    dialogFileEntities.entitiesByType.put(iKeyAt, fileEntities2);
                                }
                                fileEntities.getClass();
                                fileEntities2.totalSize += fileEntities.totalSize;
                                dialogFileEntities.totalSize += fileEntities.totalSize;
                                fileEntities2.files.addAll(fileEntities.files);
                                i3++;
                                z2 = false;
                            }
                            dialogFileEntities.filesCount += dialogFileEntities2.filesCount;
                            arrayList8.remove(i2);
                            i2--;
                            z = true;
                        } else {
                            dialogFileEntities = dialogFileEntities2;
                            z = false;
                        }
                        if (z) {
                            Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(2));
                        }
                    }
                    i2++;
                    z2 = false;
                }
                cacheModel.entities = arrayList8;
                LongSparseArray longSparseArray = cacheModel.entitiesByDialogId;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList8.get(i4);
                    i4++;
                    CacheControlActivity.DialogFileEntities dialogFileEntities3 = (CacheControlActivity.DialogFileEntities) obj;
                    longSparseArray.put(dialogFileEntities3.dialogId, dialogFileEntities3);
                }
                if (!CacheControlActivity.canceled) {
                    cacheControlActivity2.cacheModel = cacheModel;
                    DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = cacheControlActivity2.cachedMediaLayout;
                    if (anonymousClass3 != null) {
                        anonymousClass3.setCacheModel(cacheModel);
                    }
                    cacheControlActivity2.updateRows$1(true);
                    cacheControlActivity2.updateChart();
                    if (cacheControlActivity2.cacheChartHeader != null && !cacheControlActivity2.calculating && System.currentTimeMillis() - cacheControlActivity2.fragmentCreateTime > 120) {
                        CacheControlActivity.CacheChartHeader cacheChartHeader = cacheControlActivity2.cacheChartHeader;
                        long j = cacheControlActivity2.totalSize;
                        boolean z3 = j > 0;
                        long j2 = cacheControlActivity2.totalDeviceSize;
                        float f = 0.0f;
                        float f2 = j2 <= 0 ? 0.0f : j / j2;
                        long j3 = cacheControlActivity2.totalDeviceFreeSize;
                        if (j3 > 0 && j2 > 0) {
                            f = (j2 - j3) / j2;
                        }
                        cacheChartHeader.setData(f2, f, z3);
                        break;
                    }
                }
                break;
        }
    }
}
