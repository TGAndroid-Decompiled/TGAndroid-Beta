package org.telegram.ui.Stories.recorder;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;

public abstract class StoryPrivacySelector extends View {
    public static final int $r8$clinit = 0;

    public static void applySaved(int i, StoryEntry storyEntry) {
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        if (storyEntry == null) {
            return;
        }
        try {
            String string = MessagesController.getInstance(i).getMainSettings().getString("story_privacy2", null);
            if (string == null) {
                storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy();
            } else {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                storyPrivacy = read(serializedData);
                serializedData.cleanup();
                if (storyPrivacy.sendToUsers.isEmpty() && storyPrivacy.rules.isEmpty()) {
                    storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy();
                } else {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(storyPrivacy.selectedUserIds);
                    Iterator it = storyPrivacy.selectedUserIdsByGroup.values().iterator();
                    while (it.hasNext()) {
                        hashSet.addAll((ArrayList) it.next());
                    }
                    if (!hashSet.isEmpty()) {
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                        messagesStorage.getStorageQueue().postRunnable(new TodoItemMenu$$ExternalSyntheticLambda2(messagesStorage, hashSet, i, 13));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy();
        }
        storyEntry.privacy = storyPrivacy;
        ArrayList arrayList = storyEntry.privacyRules;
        arrayList.clear();
        arrayList.addAll(storyEntry.privacy.rules);
        if (UserConfig.getInstance(i).isPremium()) {
            storyEntry.period = MessagesController.getInstance(i).getMainSettings().getInt("story_period", 86400);
        } else {
            storyEntry.period = 86400;
        }
    }

    public static StoryPrivacyBottomSheet.StoryPrivacy read(SerializedData serializedData) {
        int int32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
        }
        int int33 = serializedData.readInt32(true);
        ArrayList arrayList = new ArrayList(int33);
        for (int i = 0; i < int33; i++) {
            arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        int int34 = serializedData.readInt32(true);
        ArrayList arrayList2 = new ArrayList(int34);
        for (int i2 = 0; i2 < int34; i2++) {
            arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
        }
        int int35 = serializedData.readInt32(true);
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < int35; i3++) {
            long int64 = serializedData.readInt64(true);
            if (serializedData.readInt32(true) != 481674261) {
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
            }
            int int36 = serializedData.readInt32(true);
            ArrayList arrayList3 = new ArrayList(int36);
            for (int i4 = 0; i4 < int36; i4++) {
                arrayList3.add(Long.valueOf(serializedData.readInt64(true)));
            }
            map.put(Long.valueOf(int64), arrayList3);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList2);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll((ArrayList) it.next());
        }
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(int32, arrayList, 0);
        ArrayList arrayList4 = storyPrivacy.selectedUserIds;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        HashMap map2 = storyPrivacy.selectedUserIdsByGroup;
        map2.clear();
        map2.putAll(map);
        return storyPrivacy;
    }

    public static void write(SerializedData serializedData, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        serializedData.writeInt32(storyPrivacy.type);
        serializedData.writeInt32(481674261);
        ArrayList arrayList = storyPrivacy.selectedInputUsers;
        serializedData.writeInt32(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = storyPrivacy.selectedUserIds;
        serializedData.writeInt32(arrayList2.size());
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            serializedData.writeInt64(((Long) obj2).longValue());
        }
        serializedData.writeInt32(481674261);
        HashMap map = storyPrivacy.selectedUserIdsByGroup;
        serializedData.writeInt32(map.size());
        for (Map.Entry entry : map.entrySet()) {
            serializedData.writeInt64(((Long) entry.getKey()).longValue());
            serializedData.writeInt32(481674261);
            serializedData.writeInt32(((ArrayList) entry.getValue()).size());
            ArrayList arrayList3 = (ArrayList) entry.getValue();
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
