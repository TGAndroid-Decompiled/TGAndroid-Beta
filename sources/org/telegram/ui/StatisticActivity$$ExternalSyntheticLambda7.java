package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Stories.StoriesController;

public final class StatisticActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final StatisticActivity f$0;
    public final ArrayList f$1;

    public StatisticActivity$$ExternalSyntheticLambda7(StatisticActivity statisticActivity, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = statisticActivity;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                StatisticActivity statisticActivity = this.f$0;
                StoriesController.StoriesList storiesList = statisticActivity.storiesList;
                storiesList.getClass();
                ArrayList arrayList = this.f$1;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!storiesList.messageObjectsMap.containsKey((Integer) obj)) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!storiesList.load(0, arrayList, z)) {
                    ArrayList arrayList2 = statisticActivity.recentStoriesLoaded;
                    arrayList2.clear();
                    ArrayList arrayList3 = statisticActivity.recentStoriesAll;
                    int size2 = arrayList3.size();
                    while (i < size2) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        StatisticActivity.RecentPostInfo recentPostInfo = (StatisticActivity.RecentPostInfo) obj2;
                        MessageObject messageObjectFindMessageObject = statisticActivity.storiesList.findMessageObject(recentPostInfo.getId());
                        if (messageObjectFindMessageObject != null) {
                            recentPostInfo.message = messageObjectFindMessageObject;
                            arrayList2.add(recentPostInfo);
                        }
                    }
                    statisticActivity.recentStoriesIdtoIndexMap.clear();
                    arrayList3.clear();
                    statisticActivity.sortAllLoadedData();
                }
                break;
            default:
                StatisticActivity statisticActivity2 = this.f$0;
                statisticActivity2.messagesIsLoading = false;
                ArrayList arrayList4 = this.f$1;
                if (!arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList5 = statisticActivity2.recentPostsAll;
                        if (i3 >= size3) {
                            ArrayList arrayList6 = statisticActivity2.recentPostsLoaded;
                            arrayList6.clear();
                            int size4 = arrayList5.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                StatisticActivity.RecentPostInfo recentPostInfo2 = (StatisticActivity.RecentPostInfo) arrayList5.get(i4);
                                if (recentPostInfo2.message == null) {
                                    statisticActivity2.loadFromId = recentPostInfo2.getId();
                                    statisticActivity2.sortAllLoadedData();
                                    statisticActivity2.recyclerListView.setItemAnimator(null);
                                    statisticActivity2.diffUtilsCallback.update();
                                } else {
                                    arrayList6.add(recentPostInfo2);
                                }
                                break;
                            }
                            statisticActivity2.sortAllLoadedData();
                            statisticActivity2.recyclerListView.setItemAnimator(null);
                            statisticActivity2.diffUtilsCallback.update();
                        } else {
                            MessageObject messageObject = (MessageObject) arrayList4.get(i3);
                            int i5 = statisticActivity2.recentPostIdtoIndexMap.get(messageObject.getId(), -1);
                            if (i5 >= 0 && ((StatisticActivity.RecentPostInfo) arrayList5.get(i5)).getId() == messageObject.getId()) {
                                ((StatisticActivity.RecentPostInfo) arrayList5.get(i5)).message = messageObject;
                            }
                            i3++;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
