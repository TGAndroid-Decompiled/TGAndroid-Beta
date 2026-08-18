package org.telegram.ui.Stories.recorder;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

public abstract class StoryPrivacySelector extends View {
    private static StoryPrivacyBottomSheet.StoryPrivacy read(AbstractSerializedData abstractSerializedData) {
        int int32 = abstractSerializedData.readInt32(true);
        if (abstractSerializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
        }
        int int33 = abstractSerializedData.readInt32(true);
        ArrayList arrayList = new ArrayList(int33);
        for (int i = 0; i < int33; i++) {
            arrayList.add(TLRPC.InputUser.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(true), true));
        }
        if (abstractSerializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        int int34 = abstractSerializedData.readInt32(true);
        ArrayList arrayList2 = new ArrayList(int34);
        for (int i2 = 0; i2 < int34; i2++) {
            arrayList2.add(Long.valueOf(abstractSerializedData.readInt64(true)));
        }
        if (abstractSerializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
        }
        int int35 = abstractSerializedData.readInt32(true);
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < int35; i3++) {
            long int64 = abstractSerializedData.readInt64(true);
            if (abstractSerializedData.readInt32(true) != 481674261) {
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
            }
            int int36 = abstractSerializedData.readInt32(true);
            ArrayList arrayList3 = new ArrayList(int36);
            for (int i4 = 0; i4 < int36; i4++) {
                arrayList3.add(Long.valueOf(abstractSerializedData.readInt64(true)));
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
        storyPrivacy.selectedUserIds.clear();
        storyPrivacy.selectedUserIds.addAll(arrayList2);
        storyPrivacy.selectedUserIdsByGroup.clear();
        storyPrivacy.selectedUserIdsByGroup.putAll(map);
        return storyPrivacy;
    }

    private static void write(AbstractSerializedData abstractSerializedData, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        abstractSerializedData.writeInt32(storyPrivacy.type);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(storyPrivacy.selectedInputUsers.size());
        Iterator it = storyPrivacy.selectedInputUsers.iterator();
        while (it.hasNext()) {
            ((TLRPC.InputUser) it.next()).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(storyPrivacy.selectedUserIds.size());
        Iterator it2 = storyPrivacy.selectedUserIds.iterator();
        while (it2.hasNext()) {
            abstractSerializedData.writeInt64(((Long) it2.next()).longValue());
        }
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(storyPrivacy.selectedUserIdsByGroup.size());
        for (Map.Entry entry : storyPrivacy.selectedUserIdsByGroup.entrySet()) {
            abstractSerializedData.writeInt64(((Long) entry.getKey()).longValue());
            abstractSerializedData.writeInt32(481674261);
            abstractSerializedData.writeInt32(((ArrayList) entry.getValue()).size());
            Iterator it3 = ((ArrayList) entry.getValue()).iterator();
            while (it3.hasNext()) {
                abstractSerializedData.writeInt64(((Long) it3.next()).longValue());
            }
        }
    }

    public static void save(int i, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        if (storyPrivacy == null) {
            MessagesController.getInstance(i).getMainSettings().edit().remove("story_privacy2").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(true);
        write(serializedData, storyPrivacy);
        SerializedData serializedData2 = new SerializedData(serializedData.length());
        serializedData.cleanup();
        write(serializedData2, storyPrivacy);
        MessagesController.getInstance(i).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
        serializedData2.cleanup();
    }

    private static StoryPrivacyBottomSheet.StoryPrivacy getSaved(final int i) {
        try {
            String string = MessagesController.getInstance(i).getMainSettings().getString("story_privacy2", null);
            if (string == null) {
                return new StoryPrivacyBottomSheet.StoryPrivacy();
            }
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = read(serializedData);
            serializedData.cleanup();
            if (storyPrivacy.isNone()) {
                return new StoryPrivacyBottomSheet.StoryPrivacy();
            }
            final HashSet hashSet = new HashSet();
            hashSet.addAll(storyPrivacy.selectedUserIds);
            Iterator it = storyPrivacy.selectedUserIdsByGroup.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
            if (!hashSet.isEmpty()) {
                final MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        StoryPrivacySelector.lambda$getSaved$5(messagesStorage, hashSet, i);
                    }
                });
            }
            return storyPrivacy;
        } catch (Exception e) {
            FileLog.e(e);
            return new StoryPrivacyBottomSheet.StoryPrivacy();
        }
    }

    public static void lambda$getSaved$5(MessagesStorage messagesStorage, HashSet hashSet, final int i) {
        final ArrayList<TLRPC.User> users = messagesStorage.getUsers(new ArrayList<>(hashSet));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryPrivacySelector.lambda$getSaved$4(i, users);
            }
        });
    }

    public static void lambda$getSaved$4(int i, ArrayList arrayList) {
        MessagesController.getInstance(i).putUsers(arrayList, true);
    }

    public static void applySaved(int i, StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        storyEntry.privacy = getSaved(i);
        storyEntry.privacyRules.clear();
        storyEntry.privacyRules.addAll(storyEntry.privacy.rules);
        if (UserConfig.getInstance(i).isPremium()) {
            storyEntry.period = MessagesController.getInstance(i).getMainSettings().getInt("story_period", 86400);
        } else {
            storyEntry.period = 86400;
        }
    }
}
